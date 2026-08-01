// Decompiled by JEB v5.42.0.202606242140

package com.google.zxing.common;

import com.google.zxing.FormatException;
import java.util.HashMap;
import java.util.Map;

public enum CharacterSetECI {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, new String[]{"ISO-8859-1"}),
    ISO8859_2(4, new String[]{"ISO-8859-2"}),
    ISO8859_3(5, new String[]{"ISO-8859-3"}),
    ISO8859_4(6, new String[]{"ISO-8859-4"}),
    ISO8859_5(7, new String[]{"ISO-8859-5"}),
    ISO8859_6(8, new String[]{"ISO-8859-6"}),
    ISO8859_7(9, new String[]{"ISO-8859-7"}),
    ISO8859_8(10, new String[]{"ISO-8859-8"}),
    ISO8859_9(11, new String[]{"ISO-8859-9"}),
    ISO8859_10(12, new String[]{"ISO-8859-10"}),
    ISO8859_11(13, new String[]{"ISO-8859-11"}),
    ISO8859_13(15, new String[]{"ISO-8859-13"}),
    ISO8859_14(16, new String[]{"ISO-8859-14"}),
    ISO8859_15(17, new String[]{"ISO-8859-15"}),
    ISO8859_16(18, new String[]{"ISO-8859-16"}),
    SJIS(20, new String[]{"Shift_JIS"}),
    Cp1250(21, new String[]{"windows-1250"}),
    Cp1251(22, new String[]{"windows-1251"}),
    Cp1252(23, new String[]{"windows-1252"}),
    Cp1256(24, new String[]{"windows-1256"}),
    UnicodeBigUnmarked(25, new String[]{"UTF-16BE", "UnicodeBig"}),
    UTF8(26, new String[]{"UTF-8"}),
    ASCII(new int[]{27, 170}, new String[]{"US-ASCII"}),
    Big5(28),
    GB18030(29, new String[]{"GB2312", "EUC_CN", "GBK"}),
    EUC_KR(30, new String[]{"EUC-KR"});

    public static final Map FLD1766;
    public static final Map FLD1768;
    public final int[] FLD1769;
    public final String[] FLD1770;

    static {
        CharacterSetECI.FLD1766 = new HashMap();
        CharacterSetECI.FLD1768 = new HashMap();
        CharacterSetECI[] arr_characterSetECI = (CharacterSetECI[])CharacterSetECI.FLD1767.clone();
        for(int v = 0; v < arr_characterSetECI.length; ++v) {
            CharacterSetECI characterSetECI0 = arr_characterSetECI[v];
            int[] arr_v = characterSetECI0.FLD1769;
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                CharacterSetECI.FLD1766.put(((int)arr_v[v1]), characterSetECI0);
            }
            CharacterSetECI.FLD1768.put(characterSetECI0.name(), characterSetECI0);
            String[] arr_s = characterSetECI0.FLD1770;
            for(int v2 = 0; v2 < arr_s.length; ++v2) {
                CharacterSetECI.FLD1768.put(arr_s[v2], characterSetECI0);
            }
        }
    }

    public CharacterSetECI(int v1) {
        this(new int[]{v1}, new String[0]);
    }

    public CharacterSetECI(int v1, String[] arr_s) {
        this.FLD1769 = new int[]{v1};
        this.FLD1770 = arr_s;
    }

    public CharacterSetECI(int[] arr_v, String[] arr_s) {
        this.FLD1769 = arr_v;
        this.FLD1770 = arr_s;
    }

    public static CharacterSetECI getCharacterSetECIByName(String s) {
        return (CharacterSetECI)CharacterSetECI.FLD1768.get(s);
    }

    public static CharacterSetECI getCharacterSetECIByValue(int v) {
        if(v < 0 || v >= 900) {
            throw FormatException.getFormatInstance();
        }
        return (CharacterSetECI)CharacterSetECI.FLD1766.get(v);
    }

    public int getValue() {
        return this.FLD1769[0];
    }
}

