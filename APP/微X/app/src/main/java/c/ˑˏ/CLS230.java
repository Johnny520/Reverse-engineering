// Decompiled by JEB v5.42.0.202606242140

package c.ˑˏ;

import c.ˋﾞ.CLS104;
import c.ˋﾞ.CLS105;
import c.ᵢˎ.CLS327.CLS326;
import c.ᵢˎ.CLS327;
import c.ﾞʾ.CLS365;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

public final class CLS230 {
    public static class CLS229 {
        public static final int[] FLD924;

        static {
            int[] arr_v = new int[Mode.values().length];
            CLS229.FLD924 = arr_v;
            try {
                arr_v[Mode.NUMERIC.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS229.FLD924[Mode.ALPHANUMERIC.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS229.FLD924[Mode.BYTE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS229.FLD924[Mode.KANJI.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final int[] FLD925;

    static {
        CLS230.FLD925 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 0x1F, 0x20, 33, 34, 35, -1, -1, -1, -1, -1};
    }

    public static void MTH3128(String s, Mode mode0, CLS365 ⁱˋ0, String s1) {
        switch(mode0) {
            case 1: {
                CLS230.MTH3144(s, ⁱˋ0);
                return;
            }
            case 2: {
                CLS230.MTH3149(s, ⁱˋ0);
                return;
            }
            case 3: {
                CLS230.MTH3146(s, ⁱˋ0, s1);
                return;
            }
            case 4: {
                CLS230.MTH3131(s, ⁱˋ0);
                return;
            }
            default: {
                throw new WriterException("Invalid mode: " + mode0);
            }
        }
    }

    public static int MTH3129(Mode mode0, CLS365 ⁱˋ0, CLS365 ⁱˋ1, CLS327 ᵔʼ0) {
        return ⁱˋ0.MTH5007() + mode0.getCharacterCountBits(ᵔʼ0) + ⁱˋ1.MTH5007();
    }

    public static Mode MTH3130(String s, String s1) {
        if("Shift_JIS".equals(s1) && CLS230.MTH3138(s)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z1 = false;
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(v1 < 0x30 || v1 > 57) {
                if(CLS230.MTH3147(v1) == -1) {
                    return Mode.BYTE;
                }
                z = true;
            }
            else {
                z1 = true;
            }
        }
        if(z) {
            return Mode.ALPHANUMERIC;
        }
        return z1 ? Mode.NUMERIC : Mode.BYTE;
    }

    public static void MTH3131(String s, CLS365 ⁱˋ0) {
        int v2;
        int v;
        byte[] arr_b;
        try {
            arr_b = s.getBytes("Shift_JIS");
            v = 0;
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new WriterException(unsupportedEncodingException0);
        }
        while(v < arr_b.length) {
            int v1 = (arr_b[v] & 0xFF) << 8 | arr_b[v + 1] & 0xFF;
            if(v1 >= 0x8140 && v1 <= 0x9FFC) {
                v2 = v1 - 0x8140;
            }
            else if(v1 < 0xE040 || v1 > 0xEBBF) {
                v2 = -1;
            }
            else {
                v2 = v1 - 0xC140;
            }
            if(v2 == -1) {
                throw new WriterException("Invalid byte sequence");
            }
            ⁱˋ0.MTH5001((v2 >> 8) * 0xC0 + (v2 & 0xFF), 13);
            v += 2;
        }
    }

    public static CLS327 MTH3132(int v, ErrorCorrectionLevel errorCorrectionLevel0) {
        for(int v1 = 1; v1 <= 40; ++v1) {
            CLS327 ᵔʼ0 = CLS327.MTH4741(v1);
            if(CLS230.MTH3141(v, ᵔʼ0, errorCorrectionLevel0)) {
                return ᵔʼ0;
            }
        }
        throw new WriterException("Data too big");
    }

    public static void MTH3133(CharacterSetECI characterSetECI0, CLS365 ⁱˋ0) {
        ⁱˋ0.MTH5001(Mode.ECI.getBits(), 4);
        ⁱˋ0.MTH5001(characterSetECI0.getValue(), 8);
    }

    public static int MTH3134(CLS365 ⁱˋ0, ErrorCorrectionLevel errorCorrectionLevel0, CLS327 ᵔʼ0, CLS235 ﾞⁱ0) {
        int v = 0x7FFFFFFF;
        int v1 = -1;
        for(int v2 = 0; v2 < 8; ++v2) {
            CLS231.MTH3166(ⁱˋ0, errorCorrectionLevel0, ᵔʼ0, v2, ﾞⁱ0);
            int v3 = CLS230.MTH3145(ﾞⁱ0);
            if(v3 < v) {
                v1 = v2;
                v = v3;
            }
        }
        return v1;
    }

    public static void MTH3135(int v, CLS327 ᵔʼ0, Mode mode0, CLS365 ⁱˋ0) {
        int v1 = mode0.getCharacterCountBits(ᵔʼ0);
        if(v >= 1 << v1) {
            throw new WriterException(v + " is bigger than " + ((1 << v1) - 1));
        }
        ⁱˋ0.MTH5001(v, v1);
    }

    public static CLS233 MTH3136(String s, ErrorCorrectionLevel errorCorrectionLevel0, Map map0) {
        CLS327 ᵔʼ0;
        String s1;
        if(map0 == null) {
            s1 = "ISO-8859-1";
        }
        else {
            EncodeHintType encodeHintType0 = EncodeHintType.CHARACTER_SET;
            s1 = map0.containsKey(encodeHintType0) ? map0.get(encodeHintType0).toString() : "ISO-8859-1";
        }
        Mode mode0 = CLS230.MTH3130(s, s1);
        CLS365 ⁱˋ0 = new CLS365();
        Mode mode1 = Mode.BYTE;
        if(mode0 == mode1 && !"ISO-8859-1".equals(s1)) {
            CharacterSetECI characterSetECI0 = CharacterSetECI.getCharacterSetECIByName(s1);
            if(characterSetECI0 != null) {
                CLS230.MTH3133(characterSetECI0, ⁱˋ0);
            }
        }
        CLS230.MTH3148(mode0, ⁱˋ0);
        CLS365 ⁱˋ1 = new CLS365();
        CLS230.MTH3128(s, mode0, ⁱˋ1, s1);
        if(map0 == null) {
            ᵔʼ0 = CLS230.MTH3139(errorCorrectionLevel0, mode0, ⁱˋ0, ⁱˋ1);
        }
        else {
            EncodeHintType encodeHintType1 = EncodeHintType.QR_VERSION;
            if(map0.containsKey(encodeHintType1)) {
                ᵔʼ0 = CLS327.MTH4741(Integer.parseInt(map0.get(encodeHintType1).toString()));
                if(!CLS230.MTH3141(CLS230.MTH3129(mode0, ⁱˋ0, ⁱˋ1, ᵔʼ0), ᵔʼ0, errorCorrectionLevel0)) {
                    throw new WriterException("Data too big for requested version");
                }
            }
            else {
                ᵔʼ0 = CLS230.MTH3139(errorCorrectionLevel0, mode0, ⁱˋ0, ⁱˋ1);
            }
        }
        CLS365 ⁱˋ2 = new CLS365();
        ⁱˋ2.MTH5019(ⁱˋ0);
        CLS230.MTH3135((mode0 == mode1 ? ⁱˋ1.MTH5003() : s.length()), ᵔʼ0, mode0, ⁱˋ2);
        ⁱˋ2.MTH5019(ⁱˋ1);
        CLS326 ᵔʼ$ﾞⁱ0 = ᵔʼ0.MTH4744(errorCorrectionLevel0);
        int v = ᵔʼ0.MTH4745() - ᵔʼ$ﾞⁱ0.MTH4734();
        CLS230.MTH3137(v, ⁱˋ2);
        CLS365 ⁱˋ3 = CLS230.MTH3142(ⁱˋ2, ᵔʼ0.MTH4745(), v, ᵔʼ$ﾞⁱ0.MTH4733());
        CLS233 ˋʼ0 = new CLS233();
        ˋʼ0.MTH3180(errorCorrectionLevel0);
        ˋʼ0.MTH3183(mode0);
        ˋʼ0.MTH3185(ᵔʼ0);
        int v1 = ᵔʼ0.MTH4742();
        CLS235 ﾞⁱ0 = new CLS235(v1, v1);
        int v2 = CLS230.MTH3134(ⁱˋ3, errorCorrectionLevel0, ᵔʼ0, ﾞⁱ0);
        ˋʼ0.MTH3182(v2);
        CLS231.MTH3166(ⁱˋ3, errorCorrectionLevel0, ᵔʼ0, v2, ﾞⁱ0);
        ˋʼ0.MTH3181(ﾞⁱ0);
        return ˋʼ0;
    }

    public static void MTH3137(int v, CLS365 ⁱˋ0) {
        if(ⁱˋ0.MTH5007() > v << 3) {
            throw new WriterException("data bits cannot fit in the QR Code" + ⁱˋ0.MTH5007() + " > " + (v << 3));
        }
        for(int v2 = 0; v2 < 4 && ⁱˋ0.MTH5007() < v << 3; ++v2) {
            ⁱˋ0.MTH5016(false);
        }
        int v3 = ⁱˋ0.MTH5007() & 7;
        if(v3 > 0) {
            while(v3 < 8) {
                ⁱˋ0.MTH5016(false);
                ++v3;
            }
        }
        int v4 = ⁱˋ0.MTH5003();
        for(int v1 = 0; v1 < v - v4; ++v1) {
            ⁱˋ0.MTH5001(((v1 & 1) == 0 ? 0xEC : 17), 8);
        }
        if(ⁱˋ0.MTH5007() != v << 3) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    public static boolean MTH3138(String s) {
        byte[] arr_b;
        try {
            arr_b = s.getBytes("Shift_JIS");
        }
        catch(UnsupportedEncodingException unused_ex) {
            return false;
        }
        if(arr_b.length % 2 != 0) {
            return false;
        }
        int v = 0;
        while(v < arr_b.length) {
            int v1 = arr_b[v] & 0xFF;
            if(v1 >= 0x81 && v1 <= 0x9F || v1 >= 0xE0 && v1 <= 0xEB) {
                v += 2;
                continue;
            }
            return false;
        }
        return true;
    }

    public static CLS327 MTH3139(ErrorCorrectionLevel errorCorrectionLevel0, Mode mode0, CLS365 ⁱˋ0, CLS365 ⁱˋ1) {
        return CLS230.MTH3132(CLS230.MTH3129(mode0, ⁱˋ0, ⁱˋ1, CLS230.MTH3132(CLS230.MTH3129(mode0, ⁱˋ0, ⁱˋ1, CLS327.MTH4741(1)), errorCorrectionLevel0)), errorCorrectionLevel0);
    }

    public static void MTH3140(int v, int v1, int v2, int v3, int[] arr_v, int[] arr_v1) {
        if(v3 >= v2) {
            throw new WriterException("Block ID too large");
        }
        int v4 = v % v2;
        int v5 = v2 - v4;
        int v6 = v / v2;
        int v7 = v1 / v2;
        int v8 = v6 - v7;
        int v9 = v6 + 1 - (v7 + 1);
        if(v != (v7 + v8) * v5 + (v7 + 1 + v9) * v4) {
            throw new WriterException("Total bytes mismatch");
        }
        if(v3 < v5) {
            arr_v[0] = v7;
            arr_v1[0] = v8;
            return;
        }
        arr_v[0] = v7 + 1;
        arr_v1[0] = v9;
    }

    public static boolean MTH3141(int v, CLS327 ᵔʼ0, ErrorCorrectionLevel errorCorrectionLevel0) {
        return ᵔʼ0.MTH4745() - ᵔʼ0.MTH4744(errorCorrectionLevel0).MTH4734() >= (v + 7) / 8;
    }

    public static CLS365 MTH3142(CLS365 ⁱˋ0, int v, int v1, int v2) {
        if(ⁱˋ0.MTH5003() != v1) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList0 = new ArrayList(v2);
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        for(int v4 = 0; v4 < v2; ++v4) {
            int[] arr_v = new int[1];
            int[] arr_v1 = new int[1];
            CLS230.MTH3140(v, v1, v2, v4, arr_v, arr_v1);
            int v8 = arr_v[0];
            byte[] arr_b = new byte[v8];
            ⁱˋ0.MTH5012(v5 << 3, arr_b, 0, v8);
            byte[] arr_b1 = CLS230.MTH3143(arr_b, arr_v1[0]);
            arrayList0.add(new CLS234(arr_b, arr_b1));
            v6 = Math.max(v6, v8);
            v7 = Math.max(v7, arr_b1.length);
            v5 += arr_v[0];
        }
        if(v1 != v5) {
            throw new WriterException("Data bytes does not match offset");
        }
        CLS365 ⁱˋ1 = new CLS365();
        for(int v9 = 0; v9 < v6; ++v9) {
            for(Object object0: arrayList0) {
                byte[] arr_b2 = ((CLS234)object0).MTH3188();
                if(v9 < arr_b2.length) {
                    ⁱˋ1.MTH5001(((int)arr_b2[v9]), 8);
                }
            }
        }
        for(int v3 = 0; v3 < v7; ++v3) {
            for(Object object1: arrayList0) {
                byte[] arr_b3 = ((CLS234)object1).MTH3189();
                if(v3 < arr_b3.length) {
                    ⁱˋ1.MTH5001(((int)arr_b3[v3]), 8);
                }
            }
        }
        if(v != ⁱˋ1.MTH5003()) {
            throw new WriterException("Interleaving error: " + v + " and " + ⁱˋ1.MTH5003() + " differ.");
        }
        return ⁱˋ1;
    }

    public static byte[] MTH3143(byte[] arr_b, int v) {
        int[] arr_v = new int[arr_b.length + v];
        for(int v2 = 0; v2 < arr_b.length; ++v2) {
            arr_v[v2] = arr_b[v2] & 0xFF;
        }
        new CLS104(CLS105.FLD354).MTH1410(arr_v, v);
        byte[] arr_b1 = new byte[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b1[v1] = (byte)arr_v[arr_b.length + v1];
        }
        return arr_b1;
    }

    public static void MTH3144(CharSequence charSequence0, CLS365 ⁱˋ0) {
        int v = charSequence0.length();
        int v1 = 0;
        while(v1 < v) {
            int v2 = charSequence0.charAt(v1) - 0x30;
            int v3 = v1 + 2;
            if(v3 < v) {
                ⁱˋ0.MTH5001(v2 * 100 + (charSequence0.charAt(v1 + 1) - 0x30) * 10 + (charSequence0.charAt(v3) - 0x30), 10);
                v1 += 3;
            }
            else {
                ++v1;
                if(v1 < v) {
                    ⁱˋ0.MTH5001(v2 * 10 + (charSequence0.charAt(v1) - 0x30), 7);
                    v1 = v3;
                }
                else {
                    ⁱˋ0.MTH5001(v2, 4);
                }
            }
        }
    }

    public static int MTH3145(CLS235 ﾞⁱ0) {
        return CLS232.MTH3175(ﾞⁱ0) + CLS232.MTH3170(ﾞⁱ0) + CLS232.MTH3172(ﾞⁱ0) + CLS232.MTH3171(ﾞⁱ0);
    }

    public static void MTH3146(String s, CLS365 ⁱˋ0, String s1) {
        byte[] arr_b;
        try {
            arr_b = s.getBytes(s1);
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new WriterException(unsupportedEncodingException0);
        }
        for(int v = 0; v < arr_b.length; ++v) {
            ⁱˋ0.MTH5001(((int)arr_b[v]), 8);
        }
    }

    public static int MTH3147(int v) {
        return v >= CLS230.FLD925.length ? -1 : CLS230.FLD925[v];
    }

    public static void MTH3148(Mode mode0, CLS365 ⁱˋ0) {
        ⁱˋ0.MTH5001(mode0.getBits(), 4);
    }

    public static void MTH3149(CharSequence charSequence0, CLS365 ⁱˋ0) {
        int v = charSequence0.length();
        int v1 = 0;
        while(v1 < v) {
            int v2 = CLS230.MTH3147(charSequence0.charAt(v1));
            if(v2 == -1) {
                throw new WriterException();
            }
            if(v1 + 1 < v) {
                int v3 = CLS230.MTH3147(charSequence0.charAt(v1 + 1));
                if(v3 == -1) {
                    throw new WriterException();
                }
                ⁱˋ0.MTH5001(v2 * 45 + v3, 11);
                v1 += 2;
            }
            else {
                ⁱˋ0.MTH5001(v2, 6);
                ++v1;
            }
        }
    }
}

