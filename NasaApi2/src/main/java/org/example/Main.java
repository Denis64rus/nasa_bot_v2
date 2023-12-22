package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws IOException, TelegramApiException {
        new MyTelegramBot( "jaina_nasa_api_bot",
                 "6893878473:AAGluWE1vuKy-A7XzEcZ4OOOMDS7bqostp4");



//        // получаем в консоль содержимое json-файла как ответ на запрос
//        // с запрашиваемой информацией
//        Scanner scanner = new Scanner(response.getEntity().getContent());
//        System.out.println(scanner.nextLine());




//        CloseableHttpResponse image = client.execute(new HttpGet(answer.url));
//
//        // в имени файла будет дата
//        String fileName = "Image" + LocalDate.now() + ".jpg";
//        // сохраняем картинку на ПК
//        String[] answerSplitted = answer.url.split("/");
//        FileOutputStream file = new FileOutputStream(answerSplitted[answerSplitted.length - 1]);
//        image.getEntity().writeTo(file);
    }
}