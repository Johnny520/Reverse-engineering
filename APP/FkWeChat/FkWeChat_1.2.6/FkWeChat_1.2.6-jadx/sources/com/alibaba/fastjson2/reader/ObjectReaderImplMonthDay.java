package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.time.DateTimeException;
import java.time.MonthDay;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplMonthDay extends ObjectReaderPrimitive<MonthDay> {
    static final ObjectReaderImplMonthDay INSTANCE = new ObjectReaderImplMonthDay();

    public ObjectReaderImplMonthDay() {
        super(MonthDay.class);
    }

    private static int parse2(String str, int i10) {
        int iCharAt = str.charAt(i10) - '0';
        int iCharAt2 = str.charAt(i10 + 1) - '0';
        if ((iCharAt | iCharAt2) < 0 || iCharAt > 9 || iCharAt2 > 9) {
            return -1;
        }
        return (iCharAt * 10) + iCharAt2;
    }

    private static MonthDay parseMonthDayString(JSONReader jSONReader, String str) {
        int i10;
        int i11;
        int length = str.length();
        if (length == 0) {
            C1569c.m6258a(jSONReader.info("read MonthDay error"));
            return null;
        }
        if (length == 7 && str.charAt(0) == '-' && str.charAt(1) == '-' && str.charAt(4) == '-') {
            i10 = parse2(str, 2);
            i11 = parse2(str, 5);
        } else {
            if (length != 5 || str.charAt(2) != '-') {
                C1569c.m6258a(jSONReader.info("read MonthDay error"));
                return null;
            }
            i10 = parse2(str, 0);
            i11 = parse2(str, 3);
        }
        if (i10 < 0 || i11 < 0) {
            C1569c.m6258a(jSONReader.info("read MonthDay error"));
            return null;
        }
        try {
            return MonthDay.of(i10, i11);
        } catch (DateTimeException e10) {
            C1565a.m6255a(jSONReader.info("read MonthDay error"), e10);
            return null;
        }
    }

    private static MonthDay readMonthDayFromNumber(JSONReader jSONReader) {
        long int64Value = jSONReader.readInt64Value();
        if (int64Value <= 0) {
            C1569c.m6258a(jSONReader.info("read MonthDay error"));
            return null;
        }
        int i10 = (int) (int64Value / 100);
        int i11 = (int) (int64Value % 100);
        if (i10 == 0 || i11 == 0) {
            C1569c.m6258a(jSONReader.info("read MonthDay error"));
            return null;
        }
        try {
            return MonthDay.of(i10, i11);
        } catch (DateTimeException e10) {
            C1565a.m6255a(jSONReader.info("read MonthDay error"), e10);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public MonthDay readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.isInt()) {
            return readMonthDayFromNumber(jSONReader);
        }
        String string = jSONReader.readString();
        if (string == null || string.isEmpty()) {
            return null;
        }
        return parseMonthDayString(jSONReader, string);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public MonthDay readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.isInt()) {
            return readMonthDayFromNumber(jSONReader);
        }
        String string = jSONReader.readString();
        if (string == null) {
            return null;
        }
        return parseMonthDayString(jSONReader, string);
    }
}
