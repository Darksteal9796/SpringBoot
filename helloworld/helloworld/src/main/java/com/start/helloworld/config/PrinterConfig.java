package com.start.helloworld.config;

import com.start.helloworld.services.Impl.colorPrinterImpl;
import com.start.helloworld.services.Impl.englishBlueColor;
import com.start.helloworld.services.Impl.englishGreenColor;
import com.start.helloworld.services.Impl.spanishRedColor;
import com.start.helloworld.services.blueColorPrinter;
import com.start.helloworld.services.colorPrinter;
import com.start.helloworld.services.greenColorPrinter;
import com.start.helloworld.services.redColorPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public redColorPrinter redColorPrinter(){
        return new spanishRedColor();
    }
    @Bean
    public blueColorPrinter blueColorPrinter(){
        return new englishBlueColor();
    }
    @Bean
    public greenColorPrinter greenColorPrinter(){
        return new englishGreenColor();
    }
    @Bean
    public colorPrinter colorPrinter(){
        return new colorPrinterImpl(redColorPrinter(), blueColorPrinter(), greenColorPrinter());
    }

}
