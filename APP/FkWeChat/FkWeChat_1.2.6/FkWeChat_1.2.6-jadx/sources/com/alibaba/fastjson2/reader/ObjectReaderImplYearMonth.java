package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.time.DateTimeException;
import java.time.YearMonth;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplYearMonth extends ObjectReaderPrimitive<YearMonth> {
    static final ObjectReaderImplYearMonth INSTANCE = new ObjectReaderImplYearMonth();

    public ObjectReaderImplYearMonth() {
        super(YearMonth.class);
    }

    private static int parse2(String str, int i10) {
        int iCharAt = str.charAt(i10) - '0';
        int iCharAt2 = str.charAt(i10 + 1) - '0';
        if ((iCharAt | iCharAt2) < 0 || iCharAt > 9 || iCharAt2 > 9) {
            return -1;
        }
        return (iCharAt * 10) + iCharAt2;
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

    private static YearMonth parseYearMonthString(JSONReader jSONReader, String str) {
        int i10;
        int i11;
        int length = str.length();
        if (length == 0) {
            C1569c.m6258a(jSONReader.info("read YearMonth error"));
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        int i13 = 1;
        if (cCharAt == '+' || cCharAt == '-') {
            i13 = cCharAt == '-' ? -1 : 1;
            i12 = 1;
        }
        int i14 = length - i12;
        if (i14 == 7 && str.charAt(i12 + 4) == '-') {
            i10 = parse4(str, i12);
            i11 = parse2(str, i12 + 5);
        } else {
            if (i14 != 6) {
                C1569c.m6258a(jSONReader.info("read YearMonth error"));
                return null;
            }
            i10 = parse4(str, i12);
            i11 = parse2(str, i12 + 4);
        }
        if (i10 < 0 || i11 < 0) {
            C1569c.m6258a(jSONReader.info("read YearMonth error"));
            return null;
        }
        try {
            return YearMonth.of(i10 * i13, i11);
        } catch (DateTimeException e10) {
            C1565a.m6255a(jSONReader.info("read YearMonth error"), e10);
            return null;
        }
    }

    private static YearMonth readYearMonthFromNumber(JSONReader jSONReader) {
        int i10;
        long int64Value = jSONReader.readInt64Value();
        if (int64Value < 0) {
            int64Value = -int64Value;
            i10 = -1;
        } else {
            i10 = 1;
        }
        if (int64Value < 100000 || int64Value > 999999) {
            C1569c.m6258a(jSONReader.info("read YearMonth error"));
            return null;
        }
        try {
            return YearMonth.of(((int) (int64Value / 100)) * i10, (int) (int64Value % 100));
        } catch (DateTimeException e10) {
            C1565a.m6255a(jSONReader.info("read YearMonth error"), e10);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public YearMonth readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.isInt()) {
            return readYearMonthFromNumber(jSONReader);
        }
        String string = jSONReader.readString();
        if (string == null || string.isEmpty()) {
            return null;
        }
        return parseYearMonthString(jSONReader, string);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public YearMonth readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.isInt()) {
            return readYearMonthFromNumber(jSONReader);
        }
        String string = jSONReader.readString();
        if (string == null) {
            return null;
        }
        return parseYearMonthString(jSONReader, string);
    }
}
