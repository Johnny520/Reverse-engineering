// Decompiled by JEB v5.42.0.202606242140

package c.ٴᵔ;

import c.ˆᵢ.CLS80;
import c.ˆᵢ.CLS81;
import c.ˎˊ.CLS117;
import c.ˎˊ.CLS123;
import c.ˎˊ.CLS124;
import c.ٴʻ.CLS788;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Arrays;

public final class CLS304 {
    public static enum CLS302 {
        FLD1360,
        FLD1358,
        FLD1361,
        FLD1364,
        FLD1359,
        FLD1363;

    }

    public static class CLS303 {
        public static final int[] FLD1365;

        static {
            int[] arr_v = new int[CLS302.values().length];
            CLS303.FLD1365 = arr_v;
            try {
                arr_v[CLS302.FLD1360.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS303.FLD1365[CLS302.FLD1358.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS303.FLD1365[CLS302.FLD1361.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS303.FLD1365[CLS302.FLD1359.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                CLS303.FLD1365[CLS302.FLD1364.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final String[] FLD1366;
    public static final String[] FLD1367;
    public CLS788 FLD1368;
    public static final String[] FLD1369;
    public static final String[] FLD1370;
    public static final String[] FLD1371;

    static {
        CLS304.FLD1366 = new String[]{"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
        CLS304.FLD1369 = new String[]{"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
        CLS304.FLD1371 = new String[]{"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000B", "\f", "\r", "\u001B", "\u001C", "\u001D", "\u001E", "\u001F", "@", "\\", "^", "_", "`", "|", "~", "\u007F", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
        CLS304.FLD1367 = new String[]{"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "\'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
        CLS304.FLD1370 = new String[]{"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};
    }

    public final boolean[] MTH4433(boolean[] arr_z) {
        int v7;
        int v6;
        CLS80 ˆٴ0;
        int v = 8;
        if(this.FLD1368.MTH4193() <= 2) {
            ˆٴ0 = CLS80.FLD430;
            v = 6;
        }
        else if(this.FLD1368.MTH4193() <= 8) {
            ˆٴ0 = CLS80.FLD428;
        }
        else if(this.FLD1368.MTH4193() <= 22) {
            ˆٴ0 = CLS80.FLD429;
            v = 10;
        }
        else {
            ˆٴ0 = CLS80.FLD434;
            v = 12;
        }
        int v1 = this.FLD1368.MTH4192();
        int v2 = arr_z.length / v;
        if(v2 < v1) {
            throw FormatException.getFormatInstance();
        }
        int v3 = arr_z.length % v;
        int[] arr_v = new int[v2];
        int v4 = 0;
        while(v4 < v2) {
            arr_v[v4] = CLS304.MTH4436(arr_z, v3, v);
            ++v4;
            v3 += v;
        }
        try {
            new CLS81(ˆٴ0).MTH1902(arr_v, v2 - v1);
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

    public static String MTH4434(CLS302 ˆٴ$ʻᵢ0, int v) {
        switch(ˆٴ$ʻᵢ0) {
            case 1: {
                return CLS304.FLD1366[v];
            }
            case 2: {
                return CLS304.FLD1369[v];
            }
            case 3: {
                return CLS304.FLD1371[v];
            }
            case 4: {
                return CLS304.FLD1367[v];
            }
            case 5: {
                return CLS304.FLD1370[v];
            }
            default: {
                throw new IllegalStateException("Bad table");
            }
        }
    }

    public static byte[] MTH4435(boolean[] arr_z) {
        int v = (arr_z.length + 7) / 8;
        byte[] arr_b = new byte[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_b[v1] = CLS304.MTH4440(arr_z, v1 << 3);
        }
        return arr_b;
    }

    public static int MTH4436(boolean[] arr_z, int v, int v1) {
        int v2 = 0;
        for(int v3 = v; v3 < v + v1; ++v3) {
            v2 <<= 1;
            v2 = arr_z[v3] ? v2 | 1 : v2 << 1;
        }
        return v2;
    }

    // 去混淆评级： 低(20)
    public static int MTH4437(int v, boolean z) {
        return z ? (88 + (v << 4)) * v : (0x70 + (v << 4)) * v;
    }

    public CLS124 MTH4438(CLS788 ˆٴ0) {
        this.FLD1368 = ˆٴ0;
        boolean[] arr_z = this.MTH4433(this.MTH4442(((CLS123)ˆٴ0).MTH2396()));
        CLS124 ᵔﹶ0 = new CLS124(CLS304.MTH4435(arr_z), CLS304.MTH4441(arr_z), null, null);
        ᵔﹶ0.MTH2400(arr_z.length);
        return ᵔﹶ0;
    }

    public static CLS302 MTH4439(char c) {
        switch(c) {
            case 66: {
                return CLS302.FLD1363;
            }
            case 68: {
                return CLS302.FLD1364;
            }
            case 76: {
                return CLS302.FLD1358;
            }
            case 77: {
                return CLS302.FLD1361;
            }
            case 80: {
                return CLS302.FLD1359;
            }
            default: {
                return CLS302.FLD1360;
            }
        }
    }

    public static byte MTH4440(boolean[] arr_z, int v) {
        int v1 = arr_z.length - v;
        return v1 < 8 ? ((byte)(CLS304.MTH4436(arr_z, v, v1) << 8 - v1)) : ((byte)CLS304.MTH4436(arr_z, v, 8));
    }

    public static String MTH4441(boolean[] arr_z) {
        CLS302 ˆٴ$ʻᵢ0 = CLS302.FLD1360;
        StringBuilder stringBuilder0 = new StringBuilder(20);
        CLS302 ˆٴ$ʻᵢ1 = ˆٴ$ʻᵢ0;
        int v = 0;
        while(v < arr_z.length) {
            if(ˆٴ$ʻᵢ0 == CLS302.FLD1363) {
                if(arr_z.length - v < 5) {
                    break;
                }
                int v1 = CLS304.MTH4436(arr_z, v, 5);
                v += 5;
                if(v1 == 0) {
                    if(arr_z.length - v < 11) {
                        break;
                    }
                    v1 = CLS304.MTH4436(arr_z, v, 11) + 0x1F;
                    v += 11;
                }
                for(int v2 = 0; v2 < v1; ++v2) {
                    if(arr_z.length - v < 8) {
                        v = arr_z.length;
                        break;
                    }
                    stringBuilder0.append(((char)CLS304.MTH4436(arr_z, v, 8)));
                    v += 8;
                }
            }
            else {
                int v3 = ˆٴ$ʻᵢ0 == CLS302.FLD1364 ? 4 : 5;
                if(arr_z.length - v < v3) {
                    break;
                }
                int v4 = CLS304.MTH4436(arr_z, v, v3);
                v += v3;
                String s = CLS304.MTH4434(ˆٴ$ʻᵢ0, v4);
                if(s.startsWith("CTRL_")) {
                    ˆٴ$ʻᵢ1 = CLS304.MTH4439(s.charAt(5));
                    if(s.charAt(6) != 76) {
                        CLS302 ˆٴ$ʻᵢ2 = ˆٴ$ʻᵢ1;
                        ˆٴ$ʻᵢ1 = ˆٴ$ʻᵢ0;
                        ˆٴ$ʻᵢ0 = ˆٴ$ʻᵢ2;
                        continue;
                    }
                }
                else {
                    stringBuilder0.append(s);
                }
            }
            ˆٴ$ʻᵢ0 = ˆٴ$ʻᵢ1;
        }
        return stringBuilder0.toString();
    }

    public final boolean[] MTH4442(CLS117 ʻᵢ0) {
        boolean z = this.FLD1368.MTH4191();
        int v = this.FLD1368.MTH4193();
        int v1 = (z ? 11 : 14) + (v << 2);
        int[] arr_v = new int[v1];
        boolean[] arr_z = new boolean[CLS304.MTH4437(v, z)];
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
                    arr_z[v7 + v12 + v13] = ʻᵢ0.MTH2331(arr_v[v14], arr_v[v15]);
                    int v16 = v10 - v13;
                    arr_z[v8 * 2 + v7 + v12 + v13] = ʻᵢ0.MTH2331(arr_v[v15], arr_v[v16]);
                    int v17 = v10 - v11;
                    arr_z[v8 * 4 + v7 + v12 + v13] = ʻᵢ0.MTH2331(arr_v[v16], arr_v[v17]);
                    arr_z[v8 * 6 + v7 + v12 + v13] = ʻᵢ0.MTH2331(arr_v[v17], arr_v[v14]);
                }
            }
            v7 += v8 << 3;
        }
        return arr_z;
    }
}

