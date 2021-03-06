package com.example.mrjab.hermes;

import android.provider.BaseColumns;

/**
 * Created by yatharth on 24/02/17.
 */

public class HermesContract {

        // To prevent someone from accidentally instantiating the contract class,
        // make the constructor private.
        private HermesContract() {}

        /* Inner class that defines the table contents */
        public static class FeedEntry implements BaseColumns {
            public static final String TABLE_NAME = "entry";
            public static final String COLUMN_NAME_TITLE = "title";
            public static final String COLUMN_NAME_SUBTITLE = "subtitle";
        }

}
