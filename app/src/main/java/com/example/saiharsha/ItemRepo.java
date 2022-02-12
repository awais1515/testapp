package com.example.saiharsha;

import java.util.ArrayList;
import java.util.List;

public class ItemRepo {

    public static List<ClassItem> getAllClassItem()
        {

            List<ClassItem> classItems = new ArrayList<>();


            ClassItem classItem1 = new ClassItem("Aqib", 5,ClassItem.TYPE_STEP);
            ClassItem classItem2 = new ClassItem("Saeed", 6,ClassItem.TYPE_EXTENSION);

            classItem1.getFirstName();
            classItem1.getHeight();
            classItem1.getType();

            classItem2.getFirstName();
            classItem2.getHeight();
            classItem2.getType();

            return classItems;
        }

    }
