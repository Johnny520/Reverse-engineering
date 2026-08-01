package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.Era;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplJapaneseDate extends ObjectReaderPrimitive<JapaneseDate> {
    static final ObjectReaderImplJapaneseDate INSTANCE = new ObjectReaderImplJapaneseDate();

    public ObjectReaderImplJapaneseDate() {
        super(JapaneseDate.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Era findEra(Chronology chronology, String str) {
        for (Era era : chronology.eras()) {
            if (str.equals(era.toString()) || ((era instanceof Enum) && str.equals(((Enum) era).name()))) {
                return era;
            }
        }
        return null;
    }

    private static int[] parseChronoDatePart(String str) {
        int i10;
        int i11;
        int iIndexOf = str.indexOf(45);
        int iIndexOf2 = iIndexOf < 0 ? -1 : str.indexOf(45, iIndexOf + 1);
        if (iIndexOf <= 0 || iIndexOf2 <= (i10 = iIndexOf + 1) || (i11 = iIndexOf2 + 1) >= str.length()) {
            throw new DateTimeException("Invalid date: ".concat(str));
        }
        return new int[]{parseChronoInt(str, 0, iIndexOf), parseChronoInt(str, i10, iIndexOf2), parseChronoInt(str, i11, str.length())};
    }

    private static int parseChronoInt(String str, int i10, int i11) {
        try {
            return Integer.parseInt(str.substring(i10, i11));
        } catch (NumberFormatException e10) {
            throw new DateTimeException("Invalid number: ".concat(str.substring(i10, i11)), e10);
        }
    }

    private static ChronoLocalDate parseChronoLocalDate(String str, Chronology chronology) {
        int i10;
        int iIndexOf = str.indexOf(32);
        int iIndexOf2 = iIndexOf < 0 ? -1 : str.indexOf(32, iIndexOf + 1);
        if (iIndexOf <= 0 || iIndexOf2 <= (i10 = iIndexOf + 1)) {
            return chronology.date(LocalDate.parse(str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        if (!chronology.getId().equals(strSubstring)) {
            throw new DateTimeException("Invalid chronology: ".concat(strSubstring));
        }
        String strSubstring2 = str.substring(i10, iIndexOf2);
        Era eraFindEra = findEra(chronology, strSubstring2);
        if (eraFindEra == null) {
            throw new DateTimeException("Invalid era: ".concat(strSubstring2));
        }
        int[] chronoDatePart = parseChronoDatePart(str.substring(iIndexOf2 + 1));
        return chronology.date(eraFindEra, chronoDatePart[0], chronoDatePart[1], chronoDatePart[2]);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public JapaneseDate readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        String string = jSONReader.readString();
        if (string == null || string.isEmpty()) {
            return null;
        }
        return (JapaneseDate) parseChronoLocalDate(string, JapaneseChronology.INSTANCE);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public JapaneseDate readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        String string = jSONReader.readString();
        if (string == null) {
            return null;
        }
        return (JapaneseDate) parseChronoLocalDate(string, JapaneseChronology.INSTANCE);
    }
}
