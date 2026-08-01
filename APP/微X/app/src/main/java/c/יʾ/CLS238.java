// Decompiled by JEB v5.42.0.202606242140

package c.יʾ;

import c.ﾞʾ.CLS359;
import c.ﾞʾ.CLS360;
import com.google.zxing.FormatException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;

public final class CLS238 {
    public static class CLS236 {
        public static final int[] FLD940;

        static {
            int[] arr_v = new int[CLS237.values().length];
            CLS236.FLD940 = arr_v;
            try {
                arr_v[CLS237.FLD941.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS236.FLD940[CLS237.FLD943.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS236.FLD940[CLS237.FLD942.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS236.FLD940[CLS237.FLD944.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS236.FLD940[CLS237.FLD947.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum CLS237 {
        FLD946,
        FLD948,
        FLD941,
        FLD943,
        FLD942,
        FLD944,
        FLD947;

    }

    public static final char[] FLD949;
    public static final char[] FLD950;
    public static final char[] FLD951;
    public static final char[] FLD952;
    public static final char[] FLD953;

    static {
        CLS238.FLD952 = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] arr_c = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        CLS238.FLD953 = arr_c;
        CLS238.FLD949 = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        CLS238.FLD951 = arr_c;
        CLS238.FLD950 = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', '\u007F'};
    }

    public static CLS237 MTH3205(CLS359 ʾʻ0, StringBuilder stringBuilder0, StringBuilder stringBuilder1) {
        boolean z = false;
        int v;
        while((v = ʾʻ0.MTH4948(8)) != 0) {
            if(v <= 0x80) {
                if(z) {
                    v += 0x80;
                }
                stringBuilder0.append(((char)(v - 1)));
                return CLS237.FLD948;
            }
            if(v == 0x81) {
                return CLS237.FLD946;
            }
            if(v <= 0xE5) {
                if(v - 130 < 10) {
                    stringBuilder0.append('0');
                }
                stringBuilder0.append(v - 130);
            }
            else {
                switch(v) {
                    case 230: {
                        return CLS237.FLD941;
                    }
                    case 0xE7: {
                        return CLS237.FLD947;
                    }
                    case 0xE8: {
                        stringBuilder0.append('\u001D');
                        break;
                    }
                    case 0xEB: {
                        z = true;
                        break;
                    }
                    case 0xEC: {
                        stringBuilder0.append("[)>\u001E05\u001D");
                        stringBuilder1.insert(0, "\u001E\u0004");
                        break;
                    }
                    case 0xED: {
                        stringBuilder0.append("[)>\u001E06\u001D");
                        stringBuilder1.insert(0, "\u001E\u0004");
                        break;
                    }
                    case 0xEE: {
                        return CLS237.FLD942;
                    }
                    case 0xEF: {
                        return CLS237.FLD943;
                    }
                    case 0xF0: {
                        return CLS237.FLD944;
                    label_22:
                        if(v >= 0xF2 && (v != 0xFE || ʾʻ0.MTH4949() != 0)) {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    }
                    case 0xE9: 
                    case 0xEA: 
                    case 0xF1: {
                        break;
                    }
                    default: {
                        goto label_22;
                    }
                }
            }
            if(ʾʻ0.MTH4949() <= 0) {
                return CLS237.FLD948;
            }
        }
        throw FormatException.getFormatInstance();
    }

    public static int MTH3206(int v, int v1) {
        int v2 = v - (v1 * 0x95 % 0xFF + 1);
        return v2 < 0 ? v2 + 0x100 : v2;
    }

    public static void MTH3207(CLS359 ʾʻ0, StringBuilder stringBuilder0) {
        int v5;
        int[] arr_v = new int[3];
        boolean z = false;
        int v = 0;
        do {
            if(ʾʻ0.MTH4949() == 8) {
                return;
            }
            int v1 = ʾʻ0.MTH4948(8);
            if(v1 == 0xFE) {
                return;
            }
            CLS238.MTH3210(v1, ʾʻ0.MTH4948(8), arr_v);
            int v2 = 0;
            while(v2 < 3) {
                int v3 = arr_v[v2];
                switch(v) {
                    case 0: {
                        if(v3 < 3) {
                            v = v3 + 1;
                        }
                        else {
                            char[] arr_c = CLS238.FLD952;
                            if(v3 >= arr_c.length) {
                                throw FormatException.getFormatInstance();
                            }
                            int v4 = arr_c[v3];
                            if(z) {
                                stringBuilder0.append(((char)(v4 + 0x80)));
                                z = false;
                            }
                            else {
                                stringBuilder0.append(((char)v4));
                            }
                        }
                        goto label_53;
                    }
                    case 1: {
                        if(z) {
                            stringBuilder0.append(((char)(v3 + 0x80)));
                            z = false;
                            goto label_52;
                        }
                        else {
                            v5 = (char)v3;
                            break;
                        }
                        goto label_33;
                    }
                    case 2: {
                    label_33:
                        char[] arr_c1 = CLS238.FLD953;
                        if(v3 < arr_c1.length) {
                            v5 = arr_c1[v3];
                            if(z) {
                                stringBuilder0.append(((char)(v5 + 0x80)));
                                z = false;
                                goto label_52;
                            }
                        }
                        else {
                            switch(v3) {
                                case 27: {
                                    v5 = 29;
                                    break;
                                }
                                case 30: {
                                    z = true;
                                    goto label_52;
                                }
                                default: {
                                    throw FormatException.getFormatInstance();
                                }
                            }
                        }
                        break;
                    }
                    case 3: {
                        if(z) {
                            stringBuilder0.append(((char)(v3 + 0xE0)));
                            z = false;
                            goto label_52;
                        }
                        else {
                            v5 = (char)(v3 + 0x60);
                        }
                        break;
                    }
                    default: {
                        throw FormatException.getFormatInstance();
                    }
                }
                stringBuilder0.append(((char)v5));
            label_52:
                v = 0;
            label_53:
                ++v2;
            }
        }
        while(ʾʻ0.MTH4949() > 0);
    }

    public static void MTH3208(CLS359 ʾʻ0, StringBuilder stringBuilder0, Collection collection0) {
        int v = ʾʻ0.MTH4947();
        int v1 = v + 2;
        int v2 = CLS238.MTH3206(ʾʻ0.MTH4948(8), v + 1);
        if(v2 == 0) {
            v2 = ʾʻ0.MTH4949() / 8;
        }
        else if(v2 >= 0xFA) {
            v2 = (v2 - 0xF9) * 0xFA + CLS238.MTH3206(ʾʻ0.MTH4948(8), v1);
            ++v1;
        }
        if(v2 >= 0) {
            byte[] arr_b = new byte[v2];
            int v3 = 0;
            while(v3 < v2) {
                if(ʾʻ0.MTH4949() < 8) {
                    throw FormatException.getFormatInstance();
                }
                arr_b[v3] = (byte)CLS238.MTH3206(ʾʻ0.MTH4948(8), v1);
                ++v3;
                ++v1;
            }
            collection0.add(arr_b);
            try {
                stringBuilder0.append(new String(arr_b, "ISO8859_1"));
                return;
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                throw new IllegalStateException("Platform does not support required encoding: " + unsupportedEncodingException0);
            }
        }
        throw FormatException.getFormatInstance();
    }

    public static void MTH3209(CLS359 ʾʻ0, StringBuilder stringBuilder0) {
        do {
            if(ʾʻ0.MTH4949() <= 16) {
                return;
            }
            for(int v = 0; v < 4; ++v) {
                int v1 = ʾʻ0.MTH4948(6);
                if(v1 == 0x1F) {
                    int v2 = ʾʻ0.MTH4950();
                    if(8 - v2 != 8) {
                        ʾʻ0.MTH4948(8 - v2);
                    }
                    return;
                }
                if((v1 & 0x20) == 0) {
                    v1 |= 0x40;
                }
                stringBuilder0.append(((char)v1));
            }
        }
        while(ʾʻ0.MTH4949() > 0);
    }

    public static void MTH3210(int v, int v1, int[] arr_v) {
        int v2 = (v << 8) + v1 - 1;
        arr_v[0] = v2 / 1600;
        int v3 = v2 - v2 / 1600 * 1600;
        arr_v[1] = v3 / 40;
        arr_v[2] = v3 - v3 / 40 * 40;
    }

    public static CLS360 MTH3211(byte[] arr_b) {
        CLS359 ʾʻ0 = new CLS359(arr_b);
        StringBuilder stringBuilder0 = new StringBuilder(100);
        StringBuilder stringBuilder1 = new StringBuilder(0);
        ArrayList arrayList0 = new ArrayList(1);
        CLS237 ʾʻ$ﾞⁱ0 = CLS237.FLD948;
        do {
            CLS237 ʾʻ$ﾞⁱ1 = CLS237.FLD948;
            if(ʾʻ$ﾞⁱ0 == ʾʻ$ﾞⁱ1) {
                ʾʻ$ﾞⁱ0 = CLS238.MTH3205(ʾʻ0, stringBuilder0, stringBuilder1);
            }
            else {
                switch(ʾʻ$ﾞⁱ0) {
                    case 1: {
                        CLS238.MTH3207(ʾʻ0, stringBuilder0);
                        break;
                    }
                    case 2: {
                        CLS238.MTH3212(ʾʻ0, stringBuilder0);
                        break;
                    }
                    case 3: {
                        CLS238.MTH3213(ʾʻ0, stringBuilder0);
                        break;
                    }
                    case 4: {
                        CLS238.MTH3209(ʾʻ0, stringBuilder0);
                        break;
                    }
                    case 5: {
                        CLS238.MTH3208(ʾʻ0, stringBuilder0, arrayList0);
                        break;
                    }
                    default: {
                        throw FormatException.getFormatInstance();
                    }
                }
                ʾʻ$ﾞⁱ0 = ʾʻ$ﾞⁱ1;
            }
        }
        while(ʾʻ$ﾞⁱ0 != CLS237.FLD946 && ʾʻ0.MTH4949() > 0);
        if(stringBuilder1.length() > 0) {
            stringBuilder0.append(stringBuilder1);
        }
        String s = stringBuilder0.toString();
        if(arrayList0.isEmpty()) {
            arrayList0 = null;
        }
        return new CLS360(arr_b, s, arrayList0, null);
    }

    public static void MTH3212(CLS359 ʾʻ0, StringBuilder stringBuilder0) {
        int v5;
        int[] arr_v = new int[3];
        boolean z = false;
        int v = 0;
        do {
            if(ʾʻ0.MTH4949() == 8) {
                return;
            }
            int v1 = ʾʻ0.MTH4948(8);
            if(v1 == 0xFE) {
                return;
            }
            CLS238.MTH3210(v1, ʾʻ0.MTH4948(8), arr_v);
            int v2 = 0;
            while(v2 < 3) {
                int v3 = arr_v[v2];
                switch(v) {
                    case 0: {
                        if(v3 < 3) {
                            v = v3 + 1;
                        }
                        else {
                            char[] arr_c = CLS238.FLD949;
                            if(v3 >= arr_c.length) {
                                throw FormatException.getFormatInstance();
                            }
                            int v4 = arr_c[v3];
                            if(z) {
                                stringBuilder0.append(((char)(v4 + 0x80)));
                                z = false;
                            }
                            else {
                                stringBuilder0.append(((char)v4));
                            }
                        }
                        goto label_55;
                    }
                    case 1: {
                        if(z) {
                            stringBuilder0.append(((char)(v3 + 0x80)));
                            z = false;
                            goto label_54;
                        }
                        else {
                            v5 = (char)v3;
                            break;
                        }
                        goto label_33;
                    }
                    case 2: {
                    label_33:
                        char[] arr_c1 = CLS238.FLD951;
                        if(v3 < arr_c1.length) {
                            v5 = arr_c1[v3];
                            if(z) {
                                stringBuilder0.append(((char)(v5 + 0x80)));
                                z = false;
                                goto label_54;
                            }
                        }
                        else {
                            switch(v3) {
                                case 27: {
                                    v5 = 29;
                                    break;
                                }
                                case 30: {
                                    z = true;
                                    goto label_54;
                                }
                                default: {
                                    throw FormatException.getFormatInstance();
                                }
                            }
                        }
                        break;
                    }
                    case 3: {
                        char[] arr_c2 = CLS238.FLD950;
                        if(v3 >= arr_c2.length) {
                            throw FormatException.getFormatInstance();
                        }
                        v5 = arr_c2[v3];
                        if(z) {
                            stringBuilder0.append(((char)(v5 + 0x80)));
                            z = false;
                            goto label_54;
                        }
                        break;
                    }
                    default: {
                        throw FormatException.getFormatInstance();
                    }
                }
                stringBuilder0.append(((char)v5));
            label_54:
                v = 0;
            label_55:
                ++v2;
            }
        }
        while(ʾʻ0.MTH4949() > 0);
    }

    public static void MTH3213(CLS359 ʾʻ0, StringBuilder stringBuilder0) {
        int v3;
        int[] arr_v = new int[3];
        do {
            if(ʾʻ0.MTH4949() == 8) {
                return;
            }
            int v = ʾʻ0.MTH4948(8);
            if(v == 0xFE) {
                return;
            }
            CLS238.MTH3210(v, ʾʻ0.MTH4948(8), arr_v);
            for(int v1 = 0; v1 < 3; ++v1) {
                int v2 = arr_v[v1];
                if(v2 == 0) {
                    v3 = 13;
                }
                else {
                    switch(v2) {
                        case 1: {
                            v3 = 42;
                            break;
                        }
                        case 2: {
                            v3 = 62;
                            break;
                        }
                        case 3: {
                            v3 = 0x20;
                            break;
                        }
                        default: {
                            if(v2 < 14) {
                                v3 = (char)(v2 + 44);
                            }
                            else {
                                if(v2 >= 40) {
                                    throw FormatException.getFormatInstance();
                                }
                                v3 = (char)(v2 + 51);
                            }
                            break;
                        }
                    }
                }
                stringBuilder0.append(((char)v3));
            }
        }
        while(ʾʻ0.MTH4949() > 0);
    }
}

