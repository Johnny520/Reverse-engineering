// Decompiled by JEB v5.42.0.202606242140

package c.ʼﾞ;

import c.ˆᵢ.CLS80;
import c.ˆᵢ.CLS82;
import c.ˎˊ.CLS118;
import c.ᐧᵔ.CLS329.CLS327;
import c.ᐧᵔ.CLS329;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

public final class CLS36 {
    public static class CLS35 {
        public static final int[] FLD139;

        static {
            int[] arr_v = new int[Mode.values().length];
            CLS35.FLD139 = arr_v;
            try {
                arr_v[Mode.NUMERIC.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS35.FLD139[Mode.ALPHANUMERIC.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS35.FLD139[Mode.BYTE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS35.FLD139[Mode.KANJI.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final int[] FLD140;

    static {
        CLS36.FLD140 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 0x1F, 0x20, 33, 34, 35, -1, -1, -1, -1, -1};
    }

    public static void MTH865(CharSequence charSequence0, CLS118 ˆٴ0) {
        int v = charSequence0.length();
        int v1 = 0;
        while(v1 < v) {
            int v2 = CLS36.MTH874(charSequence0.charAt(v1));
            if(v2 == -1) {
                throw new WriterException();
            }
            if(v1 + 1 < v) {
                int v3 = CLS36.MTH874(charSequence0.charAt(v1 + 1));
                if(v3 == -1) {
                    throw new WriterException();
                }
                ˆٴ0.MTH2355(v2 * 45 + v3, 11);
                v1 += 2;
            }
            else {
                ˆٴ0.MTH2355(v2, 6);
                ++v1;
            }
        }
    }

    public static Mode MTH866(String s, String s1) {
        if("Shift_JIS".equals(s1) && CLS36.MTH878(s)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z1 = false;
        for(int v = 0; v < s.length(); ++v) {
            int v1 = s.charAt(v);
            if(v1 < 0x30 || v1 > 57) {
                if(CLS36.MTH874(v1) == -1) {
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

    public static void MTH867(String s, CLS118 ˆٴ0) {
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
            ˆٴ0.MTH2355((v2 >> 8) * 0xC0 + (v2 & 0xFF), 13);
            v += 2;
        }
    }

    public static byte[] MTH868(byte[] arr_b, int v) {
        int[] arr_v = new int[arr_b.length + v];
        for(int v2 = 0; v2 < arr_b.length; ++v2) {
            arr_v[v2] = arr_b[v2] & 0xFF;
        }
        new CLS82(CLS80.FLD423).MTH1906(arr_v, v);
        byte[] arr_b1 = new byte[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b1[v1] = (byte)arr_v[arr_b.length + v1];
        }
        return arr_b1;
    }

    public static void MTH869(String s, CLS118 ˆٴ0, String s1) {
        byte[] arr_b;
        try {
            arr_b = s.getBytes(s1);
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new WriterException(unsupportedEncodingException0);
        }
        for(int v = 0; v < arr_b.length; ++v) {
            ˆٴ0.MTH2355(((int)arr_b[v]), 8);
        }
    }

    public static int MTH870(CLS118 ˆٴ0, ErrorCorrectionLevel errorCorrectionLevel0, CLS329 ٴⁱ0, CLS32 ʻᵢ0) {
        int v = 0x7FFFFFFF;
        int v1 = -1;
        for(int v2 = 0; v2 < 8; ++v2) {
            CLS33.MTH845(ˆٴ0, errorCorrectionLevel0, ٴⁱ0, v2, ʻᵢ0);
            int v3 = CLS36.MTH876(ʻᵢ0);
            if(v3 < v) {
                v1 = v2;
                v = v3;
            }
        }
        return v1;
    }

    public static void MTH871(int v, CLS118 ˆٴ0) {
        if(ˆٴ0.MTH2347() > v << 3) {
            throw new WriterException("data bits cannot fit in the QR Code" + ˆٴ0.MTH2347() + " > " + (v << 3));
        }
        for(int v2 = 0; v2 < 4 && ˆٴ0.MTH2347() < v << 3; ++v2) {
            ˆٴ0.MTH2346(false);
        }
        int v3 = ˆٴ0.MTH2347() & 7;
        if(v3 > 0) {
            while(v3 < 8) {
                ˆٴ0.MTH2346(false);
                ++v3;
            }
        }
        int v4 = ˆٴ0.MTH2343();
        for(int v1 = 0; v1 < v - v4; ++v1) {
            ˆٴ0.MTH2355(((v1 & 1) == 0 ? 0xEC : 17), 8);
        }
        if(ˆٴ0.MTH2347() != v << 3) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    public static CLS37 MTH872(String s, ErrorCorrectionLevel errorCorrectionLevel0, Map map0) {
        CLS329 ٴⁱ0;
        String s1;
        if(map0 == null) {
            s1 = "ISO-8859-1";
        }
        else {
            EncodeHintType encodeHintType0 = EncodeHintType.CHARACTER_SET;
            s1 = map0.containsKey(encodeHintType0) ? map0.get(encodeHintType0).toString() : "ISO-8859-1";
        }
        Mode mode0 = CLS36.MTH866(s, s1);
        CLS118 ˆٴ0 = new CLS118();
        Mode mode1 = Mode.BYTE;
        if(mode0 == mode1 && !"ISO-8859-1".equals(s1)) {
            CharacterSetECI characterSetECI0 = CharacterSetECI.getCharacterSetECIByName(s1);
            if(characterSetECI0 != null) {
                CLS36.MTH885(characterSetECI0, ˆٴ0);
            }
        }
        CLS36.MTH882(mode0, ˆٴ0);
        CLS118 ˆٴ1 = new CLS118();
        CLS36.MTH880(s, mode0, ˆٴ1, s1);
        if(map0 == null) {
            ٴⁱ0 = CLS36.MTH879(errorCorrectionLevel0, mode0, ˆٴ0, ˆٴ1);
        }
        else {
            EncodeHintType encodeHintType1 = EncodeHintType.QR_VERSION;
            if(map0.containsKey(encodeHintType1)) {
                ٴⁱ0 = CLS329.MTH4744(Integer.parseInt(map0.get(encodeHintType1).toString()));
                if(!CLS36.MTH886(CLS36.MTH873(mode0, ˆٴ0, ˆٴ1, ٴⁱ0), ٴⁱ0, errorCorrectionLevel0)) {
                    throw new WriterException("Data too big for requested version");
                }
            }
            else {
                ٴⁱ0 = CLS36.MTH879(errorCorrectionLevel0, mode0, ˆٴ0, ˆٴ1);
            }
        }
        CLS118 ˆٴ2 = new CLS118();
        ˆٴ2.MTH2342(ˆٴ0);
        CLS36.MTH884((mode0 == mode1 ? ˆٴ1.MTH2343() : s.length()), ٴⁱ0, mode0, ˆٴ2);
        ˆٴ2.MTH2342(ˆٴ1);
        CLS327 ٴⁱ$ʻᵢ0 = ٴⁱ0.MTH4749(errorCorrectionLevel0);
        int v = ٴⁱ0.MTH4748() - ٴⁱ$ʻᵢ0.MTH4734();
        CLS36.MTH871(v, ˆٴ2);
        CLS118 ˆٴ3 = CLS36.MTH881(ˆٴ2, ٴⁱ0.MTH4748(), v, ٴⁱ$ʻᵢ0.MTH4733());
        CLS37 ᴵⁱ0 = new CLS37();
        ᴵⁱ0.MTH892(errorCorrectionLevel0);
        ᴵⁱ0.MTH894(mode0);
        ᴵⁱ0.MTH893(ٴⁱ0);
        int v1 = ٴⁱ0.MTH4742();
        CLS32 ʻᵢ0 = new CLS32(v1, v1);
        int v2 = CLS36.MTH870(ˆٴ3, errorCorrectionLevel0, ٴⁱ0, ʻᵢ0);
        ᴵⁱ0.MTH895(v2);
        CLS33.MTH845(ˆٴ3, errorCorrectionLevel0, ٴⁱ0, v2, ʻᵢ0);
        ᴵⁱ0.MTH890(ʻᵢ0);
        return ᴵⁱ0;
    }

    public static int MTH873(Mode mode0, CLS118 ˆٴ0, CLS118 ˆٴ1, CLS329 ٴⁱ0) {
        return ˆٴ0.MTH2347() + mode0.getCharacterCountBits(ٴⁱ0) + ˆٴ1.MTH2347();
    }

    public static int MTH874(int v) {
        return v >= CLS36.FLD140.length ? -1 : CLS36.FLD140[v];
    }

    public static void MTH875(int v, int v1, int v2, int v3, int[] arr_v, int[] arr_v1) {
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

    public static int MTH876(CLS32 ʻᵢ0) {
        return CLS38.MTH898(ʻᵢ0) + CLS38.MTH899(ʻᵢ0) + CLS38.MTH903(ʻᵢ0) + CLS38.MTH897(ʻᵢ0);
    }

    public static CLS329 MTH877(int v, ErrorCorrectionLevel errorCorrectionLevel0) {
        for(int v1 = 1; v1 <= 40; ++v1) {
            CLS329 ٴⁱ0 = CLS329.MTH4744(v1);
            if(CLS36.MTH886(v, ٴⁱ0, errorCorrectionLevel0)) {
                return ٴⁱ0;
            }
        }
        throw new WriterException("Data too big");
    }

    public static boolean MTH878(String s) {
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

    public static CLS329 MTH879(ErrorCorrectionLevel errorCorrectionLevel0, Mode mode0, CLS118 ˆٴ0, CLS118 ˆٴ1) {
        return CLS36.MTH877(CLS36.MTH873(mode0, ˆٴ0, ˆٴ1, CLS36.MTH877(CLS36.MTH873(mode0, ˆٴ0, ˆٴ1, CLS329.MTH4744(1)), errorCorrectionLevel0)), errorCorrectionLevel0);
    }

    public static void MTH880(String s, Mode mode0, CLS118 ˆٴ0, String s1) {
        switch(mode0) {
            case 1: {
                CLS36.MTH883(s, ˆٴ0);
                return;
            }
            case 2: {
                CLS36.MTH865(s, ˆٴ0);
                return;
            }
            case 3: {
                CLS36.MTH869(s, ˆٴ0, s1);
                return;
            }
            case 4: {
                CLS36.MTH867(s, ˆٴ0);
                return;
            }
            default: {
                throw new WriterException("Invalid mode: " + mode0);
            }
        }
    }

    public static CLS118 MTH881(CLS118 ˆٴ0, int v, int v1, int v2) {
        if(ˆٴ0.MTH2343() != v1) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList0 = new ArrayList(v2);
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        for(int v4 = 0; v4 < v2; ++v4) {
            int[] arr_v = new int[1];
            int[] arr_v1 = new int[1];
            CLS36.MTH875(v, v1, v2, v4, arr_v, arr_v1);
            int v8 = arr_v[0];
            byte[] arr_b = new byte[v8];
            ˆٴ0.MTH2356(v5 << 3, arr_b, 0, v8);
            byte[] arr_b1 = CLS36.MTH868(arr_b, arr_v1[0]);
            arrayList0.add(new CLS34(arr_b, arr_b1));
            v6 = Math.max(v6, v8);
            v7 = Math.max(v7, arr_b1.length);
            v5 += arr_v[0];
        }
        if(v1 != v5) {
            throw new WriterException("Data bytes does not match offset");
        }
        CLS118 ˆٴ1 = new CLS118();
        for(int v9 = 0; v9 < v6; ++v9) {
            for(Object object0: arrayList0) {
                byte[] arr_b2 = ((CLS34)object0).MTH862();
                if(v9 < arr_b2.length) {
                    ˆٴ1.MTH2355(((int)arr_b2[v9]), 8);
                }
            }
        }
        for(int v3 = 0; v3 < v7; ++v3) {
            for(Object object1: arrayList0) {
                byte[] arr_b3 = ((CLS34)object1).MTH861();
                if(v3 < arr_b3.length) {
                    ˆٴ1.MTH2355(((int)arr_b3[v3]), 8);
                }
            }
        }
        if(v != ˆٴ1.MTH2343()) {
            throw new WriterException("Interleaving error: " + v + " and " + ˆٴ1.MTH2343() + " differ.");
        }
        return ˆٴ1;
    }

    public static void MTH882(Mode mode0, CLS118 ˆٴ0) {
        ˆٴ0.MTH2355(mode0.getBits(), 4);
    }

    public static void MTH883(CharSequence charSequence0, CLS118 ˆٴ0) {
        int v = charSequence0.length();
        int v1 = 0;
        while(v1 < v) {
            int v2 = charSequence0.charAt(v1) - 0x30;
            int v3 = v1 + 2;
            if(v3 < v) {
                ˆٴ0.MTH2355(v2 * 100 + (charSequence0.charAt(v1 + 1) - 0x30) * 10 + (charSequence0.charAt(v3) - 0x30), 10);
                v1 += 3;
            }
            else {
                ++v1;
                if(v1 < v) {
                    ˆٴ0.MTH2355(v2 * 10 + (charSequence0.charAt(v1) - 0x30), 7);
                    v1 = v3;
                }
                else {
                    ˆٴ0.MTH2355(v2, 4);
                }
            }
        }
    }

    public static void MTH884(int v, CLS329 ٴⁱ0, Mode mode0, CLS118 ˆٴ0) {
        int v1 = mode0.getCharacterCountBits(ٴⁱ0);
        if(v >= 1 << v1) {
            throw new WriterException(v + " is bigger than " + ((1 << v1) - 1));
        }
        ˆٴ0.MTH2355(v, v1);
    }

    public static void MTH885(CharacterSetECI characterSetECI0, CLS118 ˆٴ0) {
        ˆٴ0.MTH2355(Mode.ECI.getBits(), 4);
        ˆٴ0.MTH2355(characterSetECI0.getValue(), 8);
    }

    public static boolean MTH886(int v, CLS329 ٴⁱ0, ErrorCorrectionLevel errorCorrectionLevel0) {
        return ٴⁱ0.MTH4748() - ٴⁱ0.MTH4749(errorCorrectionLevel0).MTH4734() >= (v + 7) / 8;
    }
}

