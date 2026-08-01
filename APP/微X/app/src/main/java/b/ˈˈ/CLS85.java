// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.text.TextUtils;
import b.ˊﾞ.CLS613;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS500;
import java.util.HashMap;

public final class CLS85 {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS83 extends Enum {
        public static final enum CLS83 FLD318;
        public static final enum CLS83 FLD319;
        public static final enum CLS83 FLD320;
        public static final enum CLS83 FLD321;
        public static final enum CLS83 FLD322;
        public static final CLS83[] FLD323;
        public static final enum CLS83 FLD324;

        static {
            String[] arr_s = CLS370.FLD3464;
            long v = CLS613.MTH1969((v1 * 0x62A9D9ED799705F5L ^ v1 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v2 = CLS613.MTH1969(v);
            int v3 = (int)(v1 >>> 0x20 ^ v >>> 0x20 & 0xFFFFL ^ v2 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v4 = CLS613.MTH1969(v2) ^ ((long)arr_s[v3 / 0x1FFF].charAt(v3 % 0x1FFF)) << 0x20;
            int v5 = (int)(v4 >>> 0x20 & 0xFFFFL);
            char[] arr_c = new char[v5];
            for(int v6 = 0; v6 < v5; ++v6) {
                int v7 = v3 + v6 + 1;
                v4 = CLS613.MTH1969(v4) ^ ((long)arr_s[v7 / 0x1FFF].charAt(v7 % 0x1FFF)) << 0x20;
                arr_c[v6] = (char)(((int)(v4 >>> 0x20 & 0xFFFFL)));
            }
            CLS83.FLD318 = new CLS83(0, new String(arr_c));
            String[] arr_s1 = CLS370.FLD3464;
            long v8 = CLS613.MTH1969((v9 * 0x62A9D9ED799705F5L ^ v9 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v10 = CLS613.MTH1969(v8);
            int v11 = (int)(v9 >>> 0x20 ^ v8 >>> 0x20 & 0xFFFFL ^ v10 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v12 = CLS613.MTH1969(v10) ^ ((long)arr_s1[v11 / 0x1FFF].charAt(v11 % 0x1FFF)) << 0x20;
            int v13 = (int)(v12 >>> 0x20 & 0xFFFFL);
            char[] arr_c1 = new char[v13];
            for(int v14 = 0; v14 < v13; ++v14) {
                int v15 = v11 + v14 + 1;
                v12 = CLS613.MTH1969(v12) ^ ((long)arr_s1[v15 / 0x1FFF].charAt(v15 % 0x1FFF)) << 0x20;
                arr_c1[v14] = (char)(((int)(v12 >>> 0x20 & 0xFFFFL)));
            }
            CLS83.FLD321 = new CLS83(1, new String(arr_c1));
            String[] arr_s2 = CLS370.FLD3464;
            long v16 = CLS613.MTH1969((v17 * 0x62A9D9ED799705F5L ^ v17 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v18 = CLS613.MTH1969(v16);
            int v19 = (int)(v17 >>> 0x20 ^ v16 >>> 0x20 & 0xFFFFL ^ v18 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v20 = CLS613.MTH1969(v18) ^ ((long)arr_s2[v19 / 0x1FFF].charAt(v19 % 0x1FFF)) << 0x20;
            int v21 = (int)(v20 >>> 0x20 & 0xFFFFL);
            char[] arr_c2 = new char[v21];
            for(int v22 = 0; v22 < v21; ++v22) {
                int v23 = v19 + v22 + 1;
                v20 = CLS613.MTH1969(v20) ^ ((long)arr_s2[v23 / 0x1FFF].charAt(v23 % 0x1FFF)) << 0x20;
                arr_c2[v22] = (char)(((int)(v20 >>> 0x20 & 0xFFFFL)));
            }
            CLS83.FLD320 = new CLS83(2, new String(arr_c2));
            String[] arr_s3 = CLS370.FLD3464;
            long v24 = CLS613.MTH1969((v25 * 0x62A9D9ED799705F5L ^ v25 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v26 = CLS613.MTH1969(v24);
            int v27 = (int)(v25 >>> 0x20 ^ v24 >>> 0x20 & 0xFFFFL ^ v26 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v28 = CLS613.MTH1969(v26) ^ ((long)arr_s3[v27 / 0x1FFF].charAt(v27 % 0x1FFF)) << 0x20;
            int v29 = (int)(v28 >>> 0x20 & 0xFFFFL);
            char[] arr_c3 = new char[v29];
            for(int v30 = 0; v30 < v29; ++v30) {
                int v31 = v27 + v30 + 1;
                v28 = CLS613.MTH1969(v28) ^ ((long)arr_s3[v31 / 0x1FFF].charAt(v31 % 0x1FFF)) << 0x20;
                arr_c3[v30] = (char)(((int)(v28 >>> 0x20 & 0xFFFFL)));
            }
            CLS83.FLD322 = new CLS83(3, new String(arr_c3));
            String[] arr_s4 = CLS370.FLD3464;
            long v32 = CLS613.MTH1969((v33 * 0x62A9D9ED799705F5L ^ v33 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v34 = CLS613.MTH1969(v32);
            int v35 = (int)(v33 >>> 0x20 ^ v32 >>> 0x20 & 0xFFFFL ^ v34 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v36 = CLS613.MTH1969(v34) ^ ((long)arr_s4[v35 / 0x1FFF].charAt(v35 % 0x1FFF)) << 0x20;
            int v37 = (int)(v36 >>> 0x20 & 0xFFFFL);
            char[] arr_c4 = new char[v37];
            for(int v38 = 0; v38 < v37; ++v38) {
                int v39 = v35 + v38 + 1;
                v36 = CLS613.MTH1969(v36) ^ ((long)arr_s4[v39 / 0x1FFF].charAt(v39 % 0x1FFF)) << 0x20;
                arr_c4[v38] = (char)(((int)(v36 >>> 0x20 & 0xFFFFL)));
            }
            CLS83.FLD319 = new CLS83(4, new String(arr_c4));
            String[] arr_s5 = CLS370.FLD3464;
            long v40 = CLS613.MTH1969((v41 * 0x62A9D9ED799705F5L ^ v41 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v42 = CLS613.MTH1969(v40);
            int v43 = (int)(v41 >>> 0x20 ^ v40 >>> 0x20 & 0xFFFFL ^ v42 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v44 = CLS613.MTH1969(v42) ^ ((long)arr_s5[v43 / 0x1FFF].charAt(v43 % 0x1FFF)) << 0x20;
            int v45 = (int)(v44 >>> 0x20 & 0xFFFFL);
            char[] arr_c5 = new char[v45];
            for(int v46 = 0; v46 < v45; ++v46) {
                int v47 = v43 + v46 + 1;
                v44 = CLS613.MTH1969(v44) ^ ((long)arr_s5[v47 / 0x1FFF].charAt(v47 % 0x1FFF)) << 0x20;
                arr_c5[v46] = (char)(((int)(v44 >>> 0x20 & 0xFFFFL)));
            }
            CLS83.FLD324 = new CLS83(5, new String(arr_c5));
            CLS83.FLD323 = new CLS83[]{CLS83.FLD318, CLS83.FLD321, CLS83.FLD320, CLS83.FLD322, CLS83.FLD319, CLS83.FLD324};
        }

        public CLS83(int v, String s) {
            super(s, v);
        }

        public static CLS83 valueOf(String s) {
            return (CLS83)Enum.valueOf(CLS83.class, s);
        }

        public static CLS83[] values() {
            return (CLS83[])CLS83.FLD323.clone();
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static final class CLS84 extends Enum {
        public static final enum CLS84 FLD325;
        public static final CLS84[] FLD326;
        public static final enum CLS84 FLD327;

        static {
            String[] arr_s = CLS370.FLD3464;
            long v = CLS613.MTH1969((v1 * 0x62A9D9ED799705F5L ^ v1 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v2 = CLS613.MTH1969(v);
            int v3 = (int)(v1 >>> 0x20 ^ v >>> 0x20 & 0xFFFFL ^ v2 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v4 = CLS613.MTH1969(v2) ^ ((long)arr_s[v3 / 0x1FFF].charAt(v3 % 0x1FFF)) << 0x20;
            int v5 = (int)(v4 >>> 0x20 & 0xFFFFL);
            char[] arr_c = new char[v5];
            for(int v6 = 0; v6 < v5; ++v6) {
                int v7 = v3 + v6 + 1;
                v4 = CLS613.MTH1969(v4) ^ ((long)arr_s[v7 / 0x1FFF].charAt(v7 % 0x1FFF)) << 0x20;
                arr_c[v6] = (char)(((int)(v4 >>> 0x20 & 0xFFFFL)));
            }
            CLS84.FLD325 = new CLS84(0, new String(arr_c));
            String[] arr_s1 = CLS370.FLD3464;
            long v8 = CLS613.MTH1969((v9 * 0x62A9D9ED799705F5L ^ v9 * 0x62A9D9ED799705F5L >>> 28) * 0xCB24D0A5C88C35B3L >>> 0x20);
            long v10 = CLS613.MTH1969(v8);
            int v11 = (int)(v9 >>> 0x20 ^ v8 >>> 0x20 & 0xFFFFL ^ v10 >>> 16 & 0xFFFFFFFFFFFF0000L);
            long v12 = CLS613.MTH1969(v10) ^ ((long)arr_s1[v11 / 0x1FFF].charAt(v11 % 0x1FFF)) << 0x20;
            int v13 = (int)(v12 >>> 0x20 & 0xFFFFL);
            char[] arr_c1 = new char[v13];
            for(int v14 = 0; v14 < v13; ++v14) {
                int v15 = v11 + v14 + 1;
                v12 = CLS613.MTH1969(v12) ^ ((long)arr_s1[v15 / 0x1FFF].charAt(v15 % 0x1FFF)) << 0x20;
                arr_c1[v14] = (char)(((int)(v12 >>> 0x20 & 0xFFFFL)));
            }
            CLS84.FLD327 = new CLS84(1, new String(arr_c1));
            CLS84.FLD326 = new CLS84[]{CLS84.FLD325, CLS84.FLD327};
        }

        public CLS84(int v, String s) {
            super(s, v);
        }

        public static CLS84 valueOf(String s) {
            return (CLS84)Enum.valueOf(CLS84.class, s);
        }

        public static CLS84[] values() {
            return (CLS84[])CLS84.FLD326.clone();
        }
    }

    public String FLD328;
    public boolean FLD329;
    public CLS83 FLD330;
    public final HashMap FLD331;
    public boolean FLD332;
    public String FLD333;
    public boolean FLD334;
    public String FLD335;
    public int FLD336;
    public String FLD337;
    public int FLD338;
    public String FLD339;
    public String FLD340;

    public CLS85(String s, String s1, String s2) {
        this.FLD332 = false;
        this.FLD336 = 0;
        this.FLD334 = false;
        this.FLD337 = s;
        this.FLD335 = s1;
        this.FLD331 = new HashMap();
        this.FLD338 = CLS372.MTH5413(s2);
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    public final String MTH1689() {
        if(!TextUtils.isEmpty(this.FLD333) && CLS500.FLD4928.MTH6895("text_rep_nickname")) {
            this.FLD333 = this.FLD333.replaceAll("#N#", this.MTH1691());
        }
        return this.FLD333;
    }

    public final boolean MTH1690() {
        return !TextUtils.isEmpty(this.FLD339);
    }

    public final String MTH1691() {
        return TextUtils.isEmpty(this.FLD335) ? this.FLD337 : this.FLD335;
    }

    public final void MTH1692(CLS84 ـˏ$ᵔʾ0, int v) {
        String s;
        HashMap hashMap0 = this.FLD331;
        if(ـˏ$ᵔʾ0 == CLS84.FLD327) {
            s = this.FLD337;
            v = 8;
        }
        else {
            s = this.FLD337;
        }
        hashMap0.put(s, v);
    }
}

