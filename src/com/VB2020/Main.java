package com.VB2020;

import com.VB2020.controller.MainController;
import com.VB2020.model.Label;
import com.VB2020.model.Post;
import com.VB2020.model.Writer;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        //Create empty lists (not null)
        Label.labelList = new ArrayList<>();
        Post.postList = new ArrayList<>();
        Writer.writerList = new ArrayList<>();
        //Run main controller
        MainController.startM();
    }
}
