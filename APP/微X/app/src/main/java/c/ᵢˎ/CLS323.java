// Decompiled by JEB v5.42.0.202606242140

package c.ᵢˎ;

import c.ﾞʾ.CLS359;
import c.ﾞʾ.CLS360;
import c.ﾞʾ.CLS361;
import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class CLS323 {
    public static final char[] FLD1530;

    static {
        CLS323.FLD1530 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
    }

    public static void MTH4712(CLS359 ʾʻ0, StringBuilder stringBuilder0, int v, CharacterSetECI characterSetECI0, Collection collection0, Map map0) {
        if(v << 3 > ʾʻ0.MTH4949()) {
            throw FormatException.getFormatInstance();
        }
        byte[] arr_b = new byte[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b[v1] = (byte)ʾʻ0.MTH4948(8);
        }
        String s = characterSetECI0 == null ? CLS361.MTH4977(arr_b, map0) : characterSetECI0.name();
        try {
            stringBuilder0.append(new String(arr_b, s));
        }
        catch(UnsupportedEncodingException unused_ex) {
            throw FormatException.getFormatInstance();
        }
        collection0.add(arr_b);
    }

    public static void MTH4713(CLS359 ʾʻ0, StringBuilder stringBuilder0, int v) {
        if(v * 13 <= ʾʻ0.MTH4949()) {
            byte[] arr_b = new byte[v * 2];
            int v1 = 0;
            while(v > 0) {
                int v2 = ʾʻ0.MTH4948(13);
                int v3 = v2 % 0xC0 | v2 / 0xC0 << 8;
                int v4 = v3 + (v3 >= 0x1F00 ? 0xC140 : 0x8140);
                arr_b[v1] = (byte)(v4 >> 8);
                arr_b[v1 + 1] = (byte)v4;
                v1 += 2;
                --v;
            }
            try {
                stringBuilder0.append(new String(arr_b, "SJIS"));
                return;
            }
            catch(UnsupportedEncodingException unused_ex) {
                throw FormatException.getFormatInstance();
            }
        }
        throw FormatException.getFormatInstance();
    }

    public static void MTH4714(CLS359 ʾʻ0, StringBuilder stringBuilder0, int v) {
        if(v * 13 <= ʾʻ0.MTH4949()) {
            byte[] arr_b = new byte[v * 2];
            int v1 = 0;
            while(v > 0) {
                int v2 = ʾʻ0.MTH4948(13);
                int v3 = v2 % 0x60 | v2 / 0x60 << 8;
                int v4 = v3 + (v3 >= 0x3BF ? 0xA6A1 : 0xA1A1);
                arr_b[v1] = (byte)(v4 >> 8);
                arr_b[v1 + 1] = (byte)v4;
                v1 += 2;
                --v;
            }
            try {
                stringBuilder0.append(new String(arr_b, "GB2312"));
                return;
            }
            catch(UnsupportedEncodingException unused_ex) {
                throw FormatException.getFormatInstance();
            }
        }
        throw FormatException.getFormatInstance();
    }

    public static void MTH4715(CLS359 ʾʻ0, StringBuilder stringBuilder0, int v) {
        while(v >= 3) {
            if(ʾʻ0.MTH4949() < 10) {
                throw FormatException.getFormatInstance();
            }
            int v1 = ʾʻ0.MTH4948(10);
            if(v1 >= 1000) {
                throw FormatException.getFormatInstance();
            }
            stringBuilder0.append(CLS323.MTH4716(v1 / 100));
            stringBuilder0.append(CLS323.MTH4716(v1 / 10 % 10));
            stringBuilder0.append(CLS323.MTH4716(v1 % 10));
            v -= 3;
        }
        switch(v) {
            case 1: {
                if(ʾʻ0.MTH4949() < 4) {
                    throw FormatException.getFormatInstance();
                }
                int v2 = ʾʻ0.MTH4948(4);
                if(v2 >= 10) {
                    throw FormatException.getFormatInstance();
                }
                stringBuilder0.append(CLS323.MTH4716(v2));
                return;
            }
            case 2: {
                if(ʾʻ0.MTH4949() < 7) {
                    throw FormatException.getFormatInstance();
                }
                int v3 = ʾʻ0.MTH4948(7);
                if(v3 >= 100) {
                    throw FormatException.getFormatInstance();
                }
                stringBuilder0.append(CLS323.MTH4716(v3 / 10));
                stringBuilder0.append(CLS323.MTH4716(v3 % 10));
            }
        }
    }

    public static char MTH4716(int v) {
        char[] arr_c = CLS323.FLD1530;
        if(v >= arr_c.length) {
            throw FormatException.getFormatInstance();
        }
        return arr_c[v];
    }

    public static CLS360 MTH4717(byte[] arr_b, CLS327 ᵔʼ0, ErrorCorrectionLevel errorCorrectionLevel0, Map map0) {
        Mode mode3;
        Mode mode2;
        CLS359 ʾʻ0 = new CLS359(arr_b);
        StringBuilder stringBuilder0 = new StringBuilder(50);
        ArrayList arrayList0 = new ArrayList(1);
        int v = -1;
        int v1 = -1;
        boolean z = false;
        CharacterSetECI characterSetECI0 = null;
        do {
            try {
                Mode mode0 = ʾʻ0.MTH4949() >= 4 ? Mode.forBits(ʾʻ0.MTH4948(4)) : Mode.TERMINATOR;
                Mode mode1 = Mode.TERMINATOR;
                if(mode0 != mode1) {
                    if(mode0 == Mode.FNC1_FIRST_POSITION || mode0 == Mode.FNC1_SECOND_POSITION) {
                        mode2 = mode1;
                        mode3 = mode0;
                        z = true;
                        continue;
                    }
                    else if(mode0 == Mode.STRUCTURED_APPEND) {
                        if(ʾʻ0.MTH4949() < 16) {
                            throw FormatException.getFormatInstance();
                        }
                        int v2 = ʾʻ0.MTH4948(8);
                        v1 = ʾʻ0.MTH4948(8);
                        v = v2;
                    }
                    else if(mode0 == Mode.ECI) {
                        characterSetECI0 = CharacterSetECI.getCharacterSetECIByValue(CLS323.MTH4718(ʾʻ0));
                        if(characterSetECI0 == null) {
                            throw FormatException.getFormatInstance();
                        }
                    }
                    else if(mode0 != Mode.HANZI) {
                        int v3 = ʾʻ0.MTH4948(mode0.getCharacterCountBits(ᵔʼ0));
                        if(mode0 == Mode.NUMERIC) {
                        }
                        else if(mode0 == Mode.ALPHANUMERIC) {
                            CLS323.MTH4719(ʾʻ0, stringBuilder0, v3, z);
                            goto label_50;
                        }
                        else {
                            if(mode0 == Mode.BYTE) {
                                mode2 = mode1;
                                mode3 = mode0;
                                CLS323.MTH4712(ʾʻ0, stringBuilder0, v3, characterSetECI0, arrayList0, map0);
                            }
                            else {
                                mode2 = mode1;
                                mode3 = mode0;
                                if(mode3 != Mode.KANJI) {
                                    throw FormatException.getFormatInstance();
                                }
                                CLS323.MTH4713(ʾʻ0, stringBuilder0, v3);
                            }
                            continue;
                        }
                        CLS323.MTH4715(ʾʻ0, stringBuilder0, v3);
                    }
                    else {
                        int v4 = ʾʻ0.MTH4948(4);
                        int v5 = ʾʻ0.MTH4948(mode0.getCharacterCountBits(ᵔʼ0));
                        if(v4 == 1) {
                            CLS323.MTH4714(ʾʻ0, stringBuilder0, v5);
                        }
                    }
                }
            label_50:
                mode2 = mode1;
                mode3 = mode0;
            }
            catch(IllegalArgumentException unused_ex) {
                throw FormatException.getFormatInstance();
            }
        }
        while(mode3 != mode2);
        String s = stringBuilder0.toString();
        ArrayList arrayList1 = arrayList0.isEmpty() ? null : arrayList0;
        return errorCorrectionLevel0 == null ? new CLS360(arr_b, s, arrayList1, null, v, v1) : new CLS360(arr_b, s, arrayList1, errorCorrectionLevel0.toString(), v, v1);
    }

    public static int MTH4718(CLS359 ʾʻ0) {
        int v = ʾʻ0.MTH4948(8);
        if((v & 0x80) == 0) {
            return v & 0x7F;
        }
        if((v & 0xC0) == 0x80) {
            return ʾʻ0.MTH4948(8) | (v & 0x3F) << 8;
        }
        if((v & 0xE0) != 0xC0) {
            throw FormatException.getFormatInstance();
        }
        return ʾʻ0.MTH4948(16) | (v & 0x1F) << 16;
    }

    public static void MTH4719(CLS359 ʾʻ0, StringBuilder stringBuilder0, int v, boolean z) {
        int v1 = stringBuilder0.length();
        while(v > 1) {
            if(ʾʻ0.MTH4949() < 11) {
                throw FormatException.getFormatInstance();
            }
            int v2 = ʾʻ0.MTH4948(11);
            stringBuilder0.append(CLS323.MTH4716(v2 / 45));
            stringBuilder0.append(CLS323.MTH4716(v2 % 45));
            v -= 2;
        }
        if(v == 1) {
            if(ʾʻ0.MTH4949() < 6) {
                throw FormatException.getFormatInstance();
            }
            stringBuilder0.append(CLS323.MTH4716(ʾʻ0.MTH4948(6)));
        }
        if(z) {
            while(v1 < stringBuilder0.length()) {
                if(stringBuilder0.charAt(v1) == 37) {
                    if(v1 >= stringBuilder0.length() - 1 || stringBuilder0.charAt(v1 + 1) != 37) {
                        stringBuilder0.setCharAt(v1, '\u001D');
                    }
                    else {
                        stringBuilder0.deleteCharAt(v1 + 1);
                    }
                }
                ++v1;
            }
        }
    }
}

