package com.start.helloworld.services.Impl;

import com.start.helloworld.services.blueColorPrinter;
import com.start.helloworld.services.colorPrinter;
import com.start.helloworld.services.greenColorPrinter;
import com.start.helloworld.services.redColorPrinter;

public class colorPrinterImpl implements colorPrinter {
    private redColorPrinter redcolorPrinter;
    private blueColorPrinter bluecolorPrinter;
    private greenColorPrinter greencolorPrinter;

    public colorPrinterImpl(redColorPrinter redcolorPrinter , blueColorPrinter blueColorPrinter , greenColorPrinter greenColorPrinter){
        this.redcolorPrinter = redcolorPrinter;
        this.bluecolorPrinter = blueColorPrinter;
        this.greencolorPrinter = greenColorPrinter;
    }

    public String print(){
        return String.join(
                "," ,redcolorPrinter.print() ,
                bluecolorPrinter.print(),
                greencolorPrinter.print()
        );
    }
}
