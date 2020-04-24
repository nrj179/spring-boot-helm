//package com.nb.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//@Controller
//@RequestMapping("/piday")
//public class PidayController {
//
//    @GetMapping(value = "/cass", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> tstCass() {
//        System.out.println("in tstcass");
//        return new ResponseEntity<>("Success Cass 2.0", HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/cass/nodes/health", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<String> tstCass2() {
//
//        System.out.println("in tstcass2");
//        ProcessBuilder processBuilder = new ProcessBuilder();
//
//        String c = "ls /home/neeraj";
//        processBuilder.command("/bin/bash", "/home/neeraj/Downloads/piday.sh");
//        StringBuilder output = new StringBuilder();
//        try {
//
//            Process process = processBuilder.start();
//
//
//            BufferedReader reader = new BufferedReader(
//                    new InputStreamReader(process.getInputStream()));
//
//            String line;
//            while ((line = reader.readLine()) != null) {
//                /*if (line.contains("UN")) {
//                    output.append(line + "\n");
//                    break;
//                }*/
//                output.append(line + "\n");
//            }
//
//            int exitVal = process.waitFor();
//            if (exitVal == 0) {
//                System.out.println("Success!");
//                System.out.println(output);
////                System.exit(0);
//            } else {
//                //abnormal...
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        return new ResponseEntity<>(output.toString(), HttpStatus.OK);
//    }
//}
