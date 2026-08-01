package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public enum DateUtils$DateTimeFormatPattern {
    DATE_FORMAT_10_DASH("yyyy-MM-dd", 10),
    DATE_FORMAT_10_SLASH("yyyy/MM/dd", 10),
    DATE_FORMAT_10_DOT("dd.MM.yyyy", 10),
    DATE_TIME_FORMAT_19_DASH("yyyy-MM-dd HH:mm:ss", 19),
    DATE_TIME_FORMAT_19_DASH_T("yyyy-MM-dd'T'HH:mm:ss", 19),
    DATE_TIME_FORMAT_19_SLASH("yyyy/MM/dd HH:mm:ss", 19),
    DATE_TIME_FORMAT_19_DOT("dd.MM.yyyy HH:mm:ss", 19);

    public final int length;
    public final String pattern;

    DateUtils$DateTimeFormatPattern(String str, int i) {
        this.pattern = str;
        this.length = i;
    }
}
