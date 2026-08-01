// Decompiled by JEB v5.42.0.202606242140

package c.ʻˆ;

import c.ʼˊ.CLS407;
import c.ˋﾞ.CLS103;
import c.ˋﾞ.CLS105;
import c.ﾞʾ.CLS360;
import c.ﾞʾ.CLS362;
import c.ﾞʾ.CLS366;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Arrays;

public final class CLS19 {
    public static class CLS17 {
        public static final int[] FLD92;

        static {
            int[] arr_v = new int[CLS18.values().length];
            CLS17.FLD92 = arr_v;
            try {
                arr_v[CLS18.FLD97.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS17.FLD92[CLS18.FLD99.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS17.FLD92[CLS18.FLD93.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS17.FLD92[CLS18.FLD94.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS17.FLD92[CLS18.FLD95.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static enum CLS18 {
        FLD97,
        FLD99,
        FLD93,
        FLD95,
        FLD94,
        FLD96;

    }

    public static final String[] FLD100;
    public static final String[] FLD101;
    public static final String[] FLD102;
    public static final String[] FLD103;
    public CLS407 FLD104;
    public static final String[] FLD105;

    static {
        CLS19.FLD105 = new String[]{"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
        CLS19.FLD100 = new String[]{"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
        CLS19.FLD102 = new String[]{"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000B", "\f", "\r", "\u001B", "\u001C", "\u001D", "\u001E", "\u001F", "@", "\\", "^", "_", "`", "|", "~", "\u007F", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
        CLS19.FLD101 = new String[]{"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "\'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
        CLS19.FLD103 = new String[]{"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};
    }

    public CLS360 MTH744(CLS407 ⁱˋ0) {
        this.FLD104 = ⁱˋ0;
        boolean[] arr_z = this.MTH753(this.MTH747(((CLS362)ⁱˋ0).MTH4979()));
        CLS360 ˉˎ0 = new CLS360(CLS19.MTH751(arr_z), CLS19.MTH748(arr_z), null, null);
        ˉˎ0.MTH4965(arr_z.length);
        return ˉˎ0;
    }

    public static int MTH745(boolean[] arr_z, int v, int v1) {
        int v2 = 0;
        for(int v3 = v; v3 < v + v1; ++v3) {
            v2 <<= 1;
            v2 = arr_z[v3] ? v2 | 1 : v2 << 1;
        }
        return v2;
    }

    public static String MTH746(CLS18 ⁱˋ$ﾞⁱ0, int v) {
        switch(ⁱˋ$ﾞⁱ0) {
            case 1: {
                return CLS19.FLD105[v];
            }
            case 2: {
                return CLS19.FLD100[v];
            }
            case 3: {
                return CLS19.FLD102[v];
            }
            case 4: {
                return CLS19.FLD101[v];
            }
            case 5: {
                return CLS19.FLD103[v];
            }
            default: {
                throw new IllegalStateException("Bad table");
            }
        }
    }

    public final boolean[] MTH747(CLS366 ﾞⁱ0) {
        boolean z = this.FLD104.MTH801();
        int v = this.FLD104.MTH802();
        int v1 = (z ? 11 : 14) + (v << 2);
        int[] arr_v = new int[v1];
        boolean[] arr_z = new boolean[CLS19.MTH750(v, z)];
        if(z) {
            for(int v2 = 0; v2 < v1; ++v2) {
                arr_v[v2] = v2;
            }
        }
        else {
            int v3 = (v1 + 1 + (v1 / 2 - 1) / 15 * 2) / 2;
            for(int v4 = 0; v4 < v1 / 2; ++v4) {
                int v5 = v4 / 15 + v4;
                arr_v[v1 / 2 - v4 - 1] = v3 - v5 - 1;
                arr_v[v1 / 2 + v4] = v5 + v3 + 1;
            }
        }
        int v7 = 0;
        for(int v6 = 0; v6 < v; ++v6) {
            int v8 = (v - v6 << 2) + (z ? 9 : 12);
            int v9 = v6 << 1;
            int v10 = v1 - 1 - v9;
            for(int v11 = 0; v11 < v8; ++v11) {
                int v12 = v11 << 1;
                for(int v13 = 0; v13 < 2; ++v13) {
                    int v14 = v9 + v13;
                    int v15 = v9 + v11;
                    arr_z[v7 + v12 + v13] = ﾞⁱ0.MTH5038(arr_v[v14], arr_v[v15]);
                    int v16 = v10 - v13;
                    arr_z[v8 * 2 + v7 + v12 + v13] = ﾞⁱ0.MTH5038(arr_v[v15], arr_v[v16]);
                    int v17 = v10 - v11;
                    arr_z[v8 * 4 + v7 + v12 + v13] = ﾞⁱ0.MTH5038(arr_v[v16], arr_v[v17]);
                    arr_z[v8 * 6 + v7 + v12 + v13] = ﾞⁱ0.MTH5038(arr_v[v17], arr_v[v14]);
                }
            }
            v7 += v8 << 3;
        }
        return arr_z;
    }

    public static String MTH748(boolean[] arr_z) {
        CLS18 ⁱˋ$ﾞⁱ0 = CLS18.FLD97;
        StringBuilder stringBuilder0 = new StringBuilder(20);
        CLS18 ⁱˋ$ﾞⁱ1 = ⁱˋ$ﾞⁱ0;
        int v = 0;
        while(v < arr_z.length) {
            if(ⁱˋ$ﾞⁱ0 == CLS18.FLD96) {
                if(arr_z.length - v < 5) {
                    break;
                }
                int v1 = CLS19.MTH745(arr_z, v, 5);
                v += 5;
                if(v1 == 0) {
                    if(arr_z.length - v < 11) {
                        break;
                    }
                    v1 = CLS19.MTH745(arr_z, v, 11) + 0x1F;
                    v += 11;
                }
                for(int v2 = 0; v2 < v1; ++v2) {
                    if(arr_z.length - v < 8) {
                        v = arr_z.length;
                        break;
                    }
                    stringBuilder0.append(((char)CLS19.MTH745(arr_z, v, 8)));
                    v += 8;
                }
            }
            else {
                int v3 = ⁱˋ$ﾞⁱ0 == CLS18.FLD95 ? 4 : 5;
                if(arr_z.length - v < v3) {
                    break;
                }
                int v4 = CLS19.MTH745(arr_z, v, v3);
                v += v3;
                String s = CLS19.MTH746(ⁱˋ$ﾞⁱ0, v4);
                if(s.startsWith("CTRL_")) {
                    ⁱˋ$ﾞⁱ1 = CLS19.MTH752(s.charAt(5));
                    if(s.charAt(6) != 76) {
                        CLS18 ⁱˋ$ﾞⁱ2 = ⁱˋ$ﾞⁱ1;
                        ⁱˋ$ﾞⁱ1 = ⁱˋ$ﾞⁱ0;
                        ⁱˋ$ﾞⁱ0 = ⁱˋ$ﾞⁱ2;
                        continue;
                    }
                }
                else {
                    stringBuilder0.append(s);
                }
            }
            ⁱˋ$ﾞⁱ0 = ⁱˋ$ﾞⁱ1;
        }
        return stringBuilder0.toString();
    }

    public static byte MTH749(boolean[] arr_z, int v) {
        int v1 = arr_z.length - v;
        return v1 < 8 ? ((byte)(CLS19.MTH745(arr_z, v, v1) << 8 - v1)) : ((byte)CLS19.MTH745(arr_z, v, 8));
    }

    // 去混淆评级： 低(20)
    public static int MTH750(int v, boolean z) {
        return z ? (88 + (v << 4)) * v : (0x70 + (v << 4)) * v;
    }

    public static byte[] MTH751(boolean[] arr_z) {
        int v = (arr_z.length + 7) / 8;
        byte[] arr_b = new byte[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b[v1] = CLS19.MTH749(arr_z, v1 << 3);
        }
        return arr_b;
    }

    public static CLS18 MTH752(char c) {
        switch(c) {
            case 66: {
                return CLS18.FLD96;
            }
            case 68: {
                return CLS18.FLD95;
            }
            case 76: {
                return CLS18.FLD99;
            }
            case 77: {
                return CLS18.FLD93;
            }
            case 80: {
                return CLS18.FLD94;
            }
            default: {
                return CLS18.FLD97;
            }
        }
    }

    public final boolean[] MTH753(boolean[] arr_z) {
        int v7;
        int v6;
        CLS105 ⁱˋ0;
        int v = 8;
        if(this.FLD104.MTH802() <= 2) {
            ⁱˋ0 = CLS105.FLD363;
            v = 6;
        }
        else if(this.FLD104.MTH802() <= 8) {
            ⁱˋ0 = CLS105.FLD360;
        }
        else if(this.FLD104.MTH802() <= 22) {
            ⁱˋ0 = CLS105.FLD353;
            v = 10;
        }
        else {
            ⁱˋ0 = CLS105.FLD362;
            v = 12;
        }
        int v1 = this.FLD104.MTH800();
        int v2 = arr_z.length / v;
        if(v2 < v1) {
            throw FormatException.getFormatInstance();
        }
        int v3 = arr_z.length % v;
        int[] arr_v = new int[v2];
        int v4 = 0;
        while(v4 < v2) {
            arr_v[v4] = CLS19.MTH745(arr_z, v3, v);
            ++v4;
            v3 += v;
        }
        try {
            new CLS103(ⁱˋ0).MTH1406(arr_v, v2 - v1);
            int v5 = (1 << v) - 1;
            v6 = 0;
            v7 = 0;
        }
        catch(ReedSolomonException reedSolomonException0) {
            throw FormatException.getFormatInstance(reedSolomonException0);
        }
        while(v6 < v1) {
            int v8 = arr_v[v6];
            if(v8 == 0 || v8 == v5) {
                throw FormatException.getFormatInstance();
            }
            if(v8 == 1 || v8 == v5 - 1) {
                ++v7;
            }
            ++v6;
        }
        boolean[] arr_z1 = new boolean[v1 * v - v7];
        int v10 = 0;
        for(int v9 = 0; v9 < v1; ++v9) {
            int v11 = arr_v[v9];
            if(v11 == 1 || v11 == v5 - 1) {
                Arrays.fill(arr_z1, v10, v10 + v - 1, v11 > 1);
                v10 += v - 1;
            }
            else {
                int v12 = v - 1;
                while(v12 >= 0) {
                    arr_z1[v10] = (1 << v12 & v11) != 0;
                    --v12;
                    ++v10;
                }
            }
        }
        return arr_z1;
    }
}

