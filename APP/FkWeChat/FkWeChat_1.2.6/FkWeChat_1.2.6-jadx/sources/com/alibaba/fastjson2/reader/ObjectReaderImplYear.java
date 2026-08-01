package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.time.DateTimeException;
import java.time.Year;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplYear extends ObjectReaderPrimitive<Year> {
    static final ObjectReaderImplYear INSTANCE = new ObjectReaderImplYear();

    public ObjectReaderImplYear() {
        super(Year.class);
    }

    private static int parse4(String str, int i10) {
        int iCharAt = str.charAt(i10) - '0';
        int iCharAt2 = str.charAt(i10 + 1) - '0';
        int iCharAt3 = str.charAt(i10 + 2) - '0';
        int iCharAt4 = str.charAt(i10 + 3) - '0';
        if ((iCharAt | iCharAt2 | iCharAt3 | iCharAt4) < 0 || iCharAt > 9 || iCharAt2 > 9 || iCharAt3 > 9 || iCharAt4 > 9) {
            return -1;
        }
        return (iCharAt * 1000) + (iCharAt2 * 100) + (iCharAt3 * 10) + iCharAt4;
    }

    private static Year parseYearString(JSONReader jSONReader, String str) {
        int length = str.length();
        if (length == 0) {
            C1569c.m6258a(jSONReader.info("read Year error"));
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        int i11 = 1;
        if (cCharAt == '+' || cCharAt == '-') {
            i11 = cCharAt == '-' ? -1 : 1;
            i10 = 1;
        }
        if (length - i10 != 4) {
            C1569c.m6258a(jSONReader.info("read Year error"));
            return null;
        }
        int i12 = parse4(str, i10);
        if (i12 < 0) {
            C1569c.m6258a(jSONReader.info("read Year error"));
            return null;
        }
        try {
            return Year.of(i12 * i11);
        } catch (DateTimeException e10) {
            C1565a.m6255a(jSONReader.info("read Year error"), e10);
            return null;
        }
    }

    private static Year readYearFromNumber(JSONReader jSONReader) {
        long int64Value = jSONReader.readInt64Value();
        if (int64Value >= -999999999 && int64Value <= 999999999) {
            return Year.of((int) int64Value);
        }
        C1569c.m6258a(jSONReader.info("read Year error"));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Year readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.isInt()) {
            return readYearFromNumber(jSONReader);
        }
        String string = jSONReader.readString();
        if (string == null || string.isEmpty()) {
            return null;
        }
        return parseYearString(jSONReader, string);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Year readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.isInt()) {
            return readYearFromNumber(jSONReader);
        }
        String string = jSONReader.readString();
        if (string == null) {
            return null;
        }
        return parseYearString(jSONReader, string);
    }
}
