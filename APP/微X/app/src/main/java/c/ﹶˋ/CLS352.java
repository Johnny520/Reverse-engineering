// Decompiled by JEB v5.42.0.202606242140

package c.ﹶˋ;

import c.ᵎי.CLS305;
import c.ﾞʾ.CLS360;
import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class CLS352 {
    public static class CLS350 {
        public static final int[] FLD1590;

        static {
            int[] arr_v = new int[CLS351.values().length];
            CLS350.FLD1590 = arr_v;
            try {
                arr_v[CLS351.FLD1595.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS350.FLD1590[CLS351.FLD1597.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS350.FLD1590[CLS351.FLD1591.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS350.FLD1590[CLS351.FLD1593.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS350.FLD1590[CLS351.FLD1592.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS350.FLD1590[CLS351.FLD1594.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum CLS351 {
        FLD1595,
        FLD1597,
        FLD1591,
        FLD1593,
        FLD1592,
        FLD1594;

    }

    public static final Charset FLD1598;
    public static final BigInteger[] FLD1599;
    public static final char[] FLD1600;
    public static final char[] FLD1601;

    static {
        CLS352.FLD1600 = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}\'".toCharArray();
        CLS352.FLD1601 = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
        CLS352.FLD1598 = Charset.forName("ISO-8859-1");
        BigInteger[] arr_bigInteger = new BigInteger[16];
        CLS352.FLD1599 = arr_bigInteger;
        arr_bigInteger[0] = BigInteger.ONE;
        BigInteger bigInteger0 = BigInteger.valueOf(900L);
        arr_bigInteger[1] = bigInteger0;
        for(int v = 2; true; ++v) {
            BigInteger[] arr_bigInteger1 = CLS352.FLD1599;
            if(v >= arr_bigInteger1.length) {
                break;
            }
            arr_bigInteger1[v] = arr_bigInteger1[v - 1].multiply(bigInteger0);
        }
    }

    public static String MTH4858(int[] arr_v, int v) {
        BigInteger bigInteger0 = BigInteger.ZERO;
        for(int v1 = 0; v1 < v; ++v1) {
            bigInteger0 = bigInteger0.add(CLS352.FLD1599[v - v1 - 1].multiply(BigInteger.valueOf(arr_v[v1])));
        }
        String s = bigInteger0.toString();
        if(s.charAt(0) != 49) {
            throw FormatException.getFormatInstance();
        }
        return s.substring(1);
    }

    public static void MTH4859(int[] arr_v, int[] arr_v1, int v, StringBuilder stringBuilder0) {
        CLS351 ˈᴵ$ﾞⁱ2;
        CLS351 ˈᴵ$ﾞⁱ0 = CLS351.FLD1595;
        CLS351 ˈᴵ$ﾞⁱ1 = ˈᴵ$ﾞⁱ0;
        int v1 = 0;
        while(v1 < v) {
            int v2 = arr_v[v1];
            int v3 = 0x20;
        alab1:
            switch(ˈᴵ$ﾞⁱ0) {
                case 1: {
                    if(v2 < 26) {
                        v3 = (char)(v2 + 65);
                    }
                    else {
                        switch(v2) {
                            case 26: {
                                break;
                            }
                            case 27: {
                                ˈᴵ$ﾞⁱ0 = CLS351.FLD1597;
                                v3 = 0;
                                break;
                            }
                            case 28: {
                                ˈᴵ$ﾞⁱ0 = CLS351.FLD1591;
                                v3 = 0;
                                break;
                            }
                            case 29: {
                                ˈᴵ$ﾞⁱ2 = CLS351.FLD1594;
                                goto label_64;
                            }
                            case 900: {
                                ˈᴵ$ﾞⁱ0 = CLS351.FLD1595;
                                v3 = 0;
                                break;
                            }
                            case 913: {
                                stringBuilder0.append(((char)arr_v1[v1]));
                                v3 = 0;
                                break;
                            }
                            default: {
                                v3 = 0;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    if(v2 < 26) {
                        v3 = (char)(v2 + 97);
                    }
                    else {
                        switch(v2) {
                            case 26: {
                                break;
                            }
                            case 27: {
                                ˈᴵ$ﾞⁱ2 = CLS351.FLD1592;
                                goto label_64;
                            }
                            case 28: {
                                ˈᴵ$ﾞⁱ0 = CLS351.FLD1591;
                                v3 = 0;
                                break;
                            }
                            case 29: {
                                ˈᴵ$ﾞⁱ2 = CLS351.FLD1594;
                                goto label_64;
                            }
                            case 900: {
                                ˈᴵ$ﾞⁱ0 = CLS351.FLD1595;
                                v3 = 0;
                                break;
                            }
                            case 913: {
                                stringBuilder0.append(((char)arr_v1[v1]));
                                v3 = 0;
                                break;
                            }
                            default: {
                                v3 = 0;
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    if(v2 < 25) {
                        v3 = CLS352.FLD1601[v2];
                    }
                    else if(v2 == 25) {
                        ˈᴵ$ﾞⁱ0 = CLS351.FLD1593;
                        v3 = 0;
                    }
                    else {
                        switch(v2) {
                            case 26: {
                                break;
                            }
                            case 27: {
                                ˈᴵ$ﾞⁱ0 = CLS351.FLD1597;
                                v3 = 0;
                                break;
                            }
                            case 29: {
                                ˈᴵ$ﾞⁱ2 = CLS351.FLD1594;
                            label_64:
                                v3 = 0;
                                ˈᴵ$ﾞⁱ1 = ˈᴵ$ﾞⁱ0;
                                ˈᴵ$ﾞⁱ0 = ˈᴵ$ﾞⁱ2;
                                break;
                            }
                            case 28: 
                            case 900: {
                                ˈᴵ$ﾞⁱ0 = CLS351.FLD1595;
                                v3 = 0;
                                break;
                            }
                            case 913: {
                                stringBuilder0.append(((char)arr_v1[v1]));
                                v3 = 0;
                                break;
                            }
                            default: {
                                v3 = 0;
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    if(v2 < 29) {
                        v3 = CLS352.FLD1600[v2];
                        break;
                    }
                    else {
                        switch(v2) {
                            case 29: {
                                ˈᴵ$ﾞⁱ0 = CLS351.FLD1595;
                                goto label_104;
                            }
                            case 900: {
                                ˈᴵ$ﾞⁱ0 = CLS351.FLD1595;
                                goto label_104;
                            }
                            case 913: {
                                stringBuilder0.append(((char)arr_v1[v1]));
                                goto label_104;
                            }
                            default: {
                                goto label_104;
                            }
                        }
                    }
                    goto label_82;
                }
                case 5: {
                label_82:
                    if(v2 < 26) {
                        v3 = (char)(v2 + 65);
                        ˈᴵ$ﾞⁱ0 = ˈᴵ$ﾞⁱ1;
                        break;
                    }
                    else {
                        switch(v2) {
                            case 26: {
                                ˈᴵ$ﾞⁱ0 = ˈᴵ$ﾞⁱ1;
                                break alab1;
                            }
                            case 900: {
                                ˈᴵ$ﾞⁱ0 = CLS351.FLD1595;
                                goto label_104;
                            }
                            default: {
                                ˈᴵ$ﾞⁱ0 = ˈᴵ$ﾞⁱ1;
                                goto label_104;
                            }
                        }
                    }
                    goto label_93;
                }
                case 6: {
                label_93:
                    if(v2 < 29) {
                        v3 = CLS352.FLD1600[v2];
                        ˈᴵ$ﾞⁱ0 = ˈᴵ$ﾞⁱ1;
                        break;
                    }
                    else {
                        switch(v2) {
                            case 29: 
                            case 900: {
                                ˈᴵ$ﾞⁱ0 = CLS351.FLD1595;
                                break;
                            }
                            case 913: {
                                stringBuilder0.append(((char)arr_v1[v1]));
                                ˈᴵ$ﾞⁱ0 = ˈᴵ$ﾞⁱ1;
                                break;
                            }
                            default: {
                                ˈᴵ$ﾞⁱ0 = ˈᴵ$ﾞⁱ1;
                            }
                        }
                    }
                label_104:
                    v3 = 0;
                    break;
                }
                default: {
                    goto label_104;
                }
            }
            if(v3 != 0) {
                stringBuilder0.append(((char)v3));
            }
            ++v1;
        }
    }

    public static int MTH4860(int[] arr_v, int v, CLS305 ʾʻ0) {
        if(v + 2 > arr_v[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] arr_v1 = new int[2];
        int v1 = 0;
        while(v1 < 2) {
            arr_v1[v1] = arr_v[v];
            ++v1;
            ++v;
        }
        ʾʻ0.MTH4518(Integer.parseInt(CLS352.MTH4858(arr_v1, 2)));
        StringBuilder stringBuilder0 = new StringBuilder();
        int v2 = CLS352.MTH4863(arr_v, v, stringBuilder0);
        ʾʻ0.MTH4519(stringBuilder0.toString());
        int v3 = arr_v[v2];
        if(v3 == 923) {
            ++v2;
            int[] arr_v2 = new int[arr_v[0] - v2];
            boolean z = false;
            int v4 = 0;
            while(v2 < arr_v[0] && !z) {
                int v5 = arr_v[v2];
                if(v5 < 900) {
                    arr_v2[v4] = v5;
                    ++v2;
                    ++v4;
                }
                else {
                    if(v5 != 922) {
                        throw FormatException.getFormatInstance();
                    }
                    ʾʻ0.MTH4520(true);
                    v2 += 2;
                    z = true;
                }
            }
            ʾʻ0.MTH4517(Arrays.copyOf(arr_v2, v4));
            return v2;
        }
        if(v3 == 922) {
            ʾʻ0.MTH4520(true);
            return v2 + 1;
        }
        return v2;
    }

    public static int MTH4861(int[] arr_v, int v, StringBuilder stringBuilder0) {
        int[] arr_v1 = new int[15];
        boolean z = false;
        int v1 = 0;
        while(true) {
            int v2 = arr_v[0];
            if(v >= v2 || z) {
                break;
            }
            int v3 = v + 1;
            int v4 = arr_v[v];
            if(v3 == v2) {
                z = true;
            }
            if(v4 < 900) {
                arr_v1[v1] = v4;
                ++v1;
            }
            else {
                switch(v4) {
                    case 900: 
                    case 901: 
                    case 922: 
                    case 923: 
                    case 924: 
                    case 0x3A0: {
                        --v3;
                        z = true;
                    }
                }
            }
            if((v1 % 15 == 0 || v4 == 902 || z) && v1 > 0) {
                stringBuilder0.append(CLS352.MTH4858(arr_v1, v1));
                v1 = 0;
            }
            v = v3;
        }
        return v;
    }

    public static int MTH4862(int v, int[] arr_v, Charset charset0, int v1, StringBuilder stringBuilder0) {
        int v9;
        int v5;
        int v3;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        if(v == 901) {
            int[] arr_v1 = new int[6];
            v3 = v1 + 1;
            int v4 = arr_v[v1];
            boolean z = false;
        alab1:
            while(true) {
                v5 = 0;
                long v6 = 0L;
            label_9:
                int v7 = arr_v[0];
                if(v3 >= v7 || z) {
                    goto label_29;
                }
                arr_v1[v5] = v4;
                v6 = v6 * 900L + ((long)v4);
                v4 = arr_v[v3];
                switch(v4) {
                    case 900: 
                    case 901: 
                    case 902: 
                    case 922: 
                    case 923: 
                    case 924: 
                    case 0x3A0: {
                        ++v5;
                        z = true;
                        goto label_9;
                    }
                    default: {
                        if((v5 + 1) % 5 != 0 || v5 + 1 <= 0) {
                            break alab1;
                        }
                        for(int v8 = 0; v8 < 6; ++v8) {
                            byteArrayOutputStream0.write(((int)(((byte)(((int)(v6 >> (5 - v8) * 8)))))));
                        }
                        ++v3;
                    }
                }
            }
            ++v3;
            ++v5;
            goto label_9;
        label_29:
            if(v3 != v7 || v4 >= 900) {
                v9 = v5;
            }
            else {
                v9 = v5 + 1;
                arr_v1[v5] = v4;
            }
            for(int v2 = 0; v2 < v9; ++v2) {
                byteArrayOutputStream0.write(((int)(((byte)arr_v1[v2]))));
            }
        }
        else if(v == 924) {
            int v10 = v1;
            boolean z1 = false;
            int v11 = 0;
            long v12 = 0L;
            while(v10 < arr_v[0] && !z1) {
                int v13 = arr_v[v10];
                if(v13 < 900) {
                    ++v11;
                    v12 = v12 * 900L + ((long)v13);
                    ++v10;
                }
                else if(v13 == 900 || v13 == 901 || v13 == 902 || v13 == 924 || v13 == 0x3A0 || v13 == 923 || v13 == 922) {
                    z1 = true;
                }
                else {
                    ++v10;
                }
                if(v11 % 5 == 0 && v11 > 0) {
                    for(int v14 = 0; v14 < 6; ++v14) {
                        byteArrayOutputStream0.write(((int)(((byte)(((int)(v12 >> (5 - v14) * 8)))))));
                    }
                    v11 = 0;
                    v12 = 0L;
                }
            }
            v3 = v10;
        }
        else {
            v3 = v1;
        }
        stringBuilder0.append(new String(byteArrayOutputStream0.toByteArray(), charset0));
        return v3;
    }

    public static int MTH4863(int[] arr_v, int v, StringBuilder stringBuilder0) {
        int v1 = arr_v[0];
        int[] arr_v1 = new int[v1 - v << 1];
        int[] arr_v2 = new int[v1 - v << 1];
        boolean z = false;
        int v2 = 0;
        while(v < arr_v[0] && !z) {
            int v3 = v + 1;
            int v4 = arr_v[v];
            if(v4 < 900) {
                arr_v1[v2] = v4 / 30;
                arr_v1[v2 + 1] = v4 % 30;
                v2 += 2;
                goto label_18;
            }
            else {
                switch(v4) {
                    case 900: {
                        arr_v1[v2] = 900;
                        ++v2;
                    label_18:
                        v = v3;
                        break;
                    }
                    case 913: {
                        goto label_24;
                    }
                    case 901: 
                    case 902: 
                    case 0x3A0: {
                        v = v3 - 1;
                        z = true;
                        break;
                    }
                    default: {
                        if(v4 != 922 && v4 != 923 && v4 != 924) {
                            goto label_18;
                        }
                        v = v3 - 1;
                        z = true;
                        break;
                    }
                }
            }
            continue;
        label_24:
            arr_v1[v2] = 913;
            v = v3 + 1;
            arr_v2[v2] = arr_v[v3];
            ++v2;
        }
        CLS352.MTH4859(arr_v1, arr_v2, v2, stringBuilder0);
        return v;
    }

    public static CLS360 MTH4864(int[] arr_v, String s) {
        int v2;
        StringBuilder stringBuilder0 = new StringBuilder(arr_v.length << 1);
        Charset charset0 = CLS352.FLD1598;
        int v = arr_v[1];
        CLS305 ʾʻ0 = new CLS305();
        int v1 = 2;
        while(v1 < arr_v[0]) {
            if(v == 913) {
                v2 = v1 + 1;
                stringBuilder0.append(((char)arr_v[v1]));
            }
            else {
                switch(v) {
                    case 900: {
                        v2 = CLS352.MTH4863(arr_v, v1, stringBuilder0);
                        break;
                    }
                    case 902: {
                        v2 = CLS352.MTH4861(arr_v, v1, stringBuilder0);
                        break;
                    }
                    case 922: 
                    case 923: {
                        throw FormatException.getFormatInstance();
                    }
                    case 901: 
                    case 924: {
                        v2 = CLS352.MTH4862(v, arr_v, charset0, v1, stringBuilder0);
                        break;
                    }
                    case 925: {
                        v2 = v1 + 1;
                        break;
                    }
                    case 926: {
                        v2 = v1 + 2;
                        break;
                    }
                    case 0x39F: {
                        v2 = v1 + 1;
                        charset0 = Charset.forName(CharacterSetECI.getCharacterSetECIByValue(arr_v[v1]).name());
                        break;
                    }
                    case 0x3A0: {
                        v2 = CLS352.MTH4860(arr_v, v1, ʾʻ0);
                        break;
                    }
                    default: {
                        v2 = CLS352.MTH4863(arr_v, v1 - 1, stringBuilder0);
                        break;
                    }
                }
            }
            if(v2 >= arr_v.length) {
                throw FormatException.getFormatInstance();
            }
            v1 = v2 + 1;
            v = arr_v[v2];
        }
        if(stringBuilder0.length() == 0) {
            throw FormatException.getFormatInstance();
        }
        CLS360 ˉˎ0 = new CLS360(null, stringBuilder0.toString(), null, s);
        ˉˎ0.MTH4967(ʾʻ0);
        return ˉˎ0;
    }
}

