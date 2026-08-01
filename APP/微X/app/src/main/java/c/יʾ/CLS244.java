// Decompiled by JEB v5.42.0.202606242140

package c.יʾ;

import c.ﾞʾ.CLS366;
import com.google.zxing.FormatException;

public final class CLS244 {
    public final CLS242 FLD967;
    public final CLS366 FLD968;
    public final CLS366 FLD969;

    public CLS244(CLS366 ﾞⁱ0) {
        int v = ﾞⁱ0.MTH5046();
        if(v < 8 || v > 0x90 || (v & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        this.FLD967 = CLS244.MTH3246(ﾞⁱ0);
        CLS366 ﾞⁱ1 = this.MTH3247(ﾞⁱ0);
        this.FLD968 = ﾞⁱ1;
        this.FLD969 = new CLS366(ﾞⁱ1.MTH5044(), ﾞⁱ1.MTH5046());
    }

    public byte[] MTH3240() {
        byte[] arr_b = new byte[this.FLD967.MTH3234()];
        int v = this.FLD968.MTH5046();
        int v1 = this.FLD968.MTH5044();
        int v2 = 0;
        boolean z = false;
        int v3 = 0;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        int v4 = 4;
        do {
            if(v4 == v && v2 == 0 && !z) {
                arr_b[v3] = (byte)this.MTH3243(v, v1);
                v4 -= 2;
                v2 = 2;
                ++v3;
                z = true;
            }
            else if(v4 == v - 2 && v2 == 0 && (v1 & 3) != 0 && !z1) {
                arr_b[v3] = (byte)this.MTH3242(v, v1);
                v4 -= 2;
                v2 = 2;
                ++v3;
                z1 = true;
            }
            else if(v4 == v + 4 && v2 == 2 && (v1 & 7) == 0 && !z2) {
                arr_b[v3] = (byte)this.MTH3244(v, v1);
                v4 -= 2;
                v2 = 4;
                ++v3;
                z2 = true;
            }
            else if(v4 != v - 2 || v2 != 0 || (v1 & 7) != 4 || z3) {
                do {
                    if(v4 < v && v2 >= 0 && !this.FLD969.MTH5038(v2, v4)) {
                        arr_b[v3] = (byte)this.MTH3241(v4, v2, v, v1);
                        ++v3;
                    }
                    v4 -= 2;
                    v2 += 2;
                }
                while(v4 >= 0 && v2 < v1);
                int v5 = v4 + 1;
                int v6 = v2 + 3;
                do {
                    if(v5 >= 0 && v6 < v1 && !this.FLD969.MTH5038(v6, v5)) {
                        arr_b[v3] = (byte)this.MTH3241(v5, v6, v, v1);
                        ++v3;
                    }
                    v5 += 2;
                    v6 -= 2;
                }
                while(v5 < v && v6 >= 0);
                v4 = v5 + 3;
                v2 = v6 + 1;
            }
            else {
                arr_b[v3] = (byte)this.MTH3248(v, v1);
                v4 -= 2;
                v2 = 2;
                ++v3;
                z3 = true;
            }
        }
        while(v4 < v || v2 < v1);
        if(v3 != this.FLD967.MTH3234()) {
            throw FormatException.getFormatInstance();
        }
        return arr_b;
    }

    public final int MTH3241(int v, int v1, int v2, int v3) {
        int v4 = this.MTH3245(v - 2, v1 - 2, v2, v3) << 1;
        if(this.MTH3245(v - 2, v1 - 1, v2, v3)) {
            v4 |= 1;
        }
        int v5 = this.MTH3245(v - 1, v1 - 2, v2, v3) ? v4 << 1 | 1 : v4 << 1;
        int v6 = this.MTH3245(v - 1, v1 - 1, v2, v3) ? v5 << 1 | 1 : v5 << 1;
        int v7 = this.MTH3245(v - 1, v1, v2, v3) ? v6 << 1 | 1 : v6 << 1;
        int v8 = this.MTH3245(v, v1 - 2, v2, v3) ? v7 << 1 | 1 : v7 << 1;
        int v9 = this.MTH3245(v, v1 - 1, v2, v3) ? v8 << 1 | 1 : v8 << 1;
        return this.MTH3245(v, v1, v2, v3) ? v9 << 1 | 1 : v9 << 1;
    }

    public final int MTH3242(int v, int v1) {
        int v2 = this.MTH3245(v - 3, 0, v, v1) << 1;
        if(this.MTH3245(v - 2, 0, v, v1)) {
            v2 |= 1;
        }
        int v3 = this.MTH3245(v - 1, 0, v, v1) ? v2 << 1 | 1 : v2 << 1;
        int v4 = this.MTH3245(0, v1 - 4, v, v1) ? v3 << 1 | 1 : v3 << 1;
        int v5 = this.MTH3245(0, v1 - 3, v, v1) ? v4 << 1 | 1 : v4 << 1;
        int v6 = this.MTH3245(0, v1 - 2, v, v1) ? v5 << 1 | 1 : v5 << 1;
        int v7 = this.MTH3245(0, v1 - 1, v, v1) ? v6 << 1 | 1 : v6 << 1;
        return this.MTH3245(1, v1 - 1, v, v1) ? v7 << 1 | 1 : v7 << 1;
    }

    public final int MTH3243(int v, int v1) {
        int v2 = this.MTH3245(v - 1, 0, v, v1) << 1;
        if(this.MTH3245(v - 1, 1, v, v1)) {
            v2 |= 1;
        }
        int v3 = this.MTH3245(v - 1, 2, v, v1) ? v2 << 1 | 1 : v2 << 1;
        int v4 = this.MTH3245(0, v1 - 2, v, v1) ? v3 << 1 | 1 : v3 << 1;
        int v5 = this.MTH3245(0, v1 - 1, v, v1) ? v4 << 1 | 1 : v4 << 1;
        int v6 = this.MTH3245(1, v1 - 1, v, v1) ? v5 << 1 | 1 : v5 << 1;
        int v7 = this.MTH3245(2, v1 - 1, v, v1) ? v6 << 1 | 1 : v6 << 1;
        return this.MTH3245(3, v1 - 1, v, v1) ? v7 << 1 | 1 : v7 << 1;
    }

    public final int MTH3244(int v, int v1) {
        int v2 = this.MTH3245(v - 1, 0, v, v1) << 1;
        if(this.MTH3245(v - 1, v1 - 1, v, v1)) {
            v2 |= 1;
        }
        int v3 = this.MTH3245(0, v1 - 3, v, v1) ? v2 << 1 | 1 : v2 << 1;
        int v4 = this.MTH3245(0, v1 - 2, v, v1) ? v3 << 1 | 1 : v3 << 1;
        int v5 = this.MTH3245(0, v1 - 1, v, v1) ? v4 << 1 | 1 : v4 << 1;
        int v6 = this.MTH3245(1, v1 - 3, v, v1) ? v5 << 1 | 1 : v5 << 1;
        int v7 = this.MTH3245(1, v1 - 2, v, v1) ? v6 << 1 | 1 : v6 << 1;
        return this.MTH3245(1, v1 - 1, v, v1) ? v7 << 1 | 1 : v7 << 1;
    }

    public final boolean MTH3245(int v, int v1, int v2, int v3) {
        if(v < 0) {
            v += v2;
            v1 += 4 - (v2 + 4 & 7);
        }
        if(v1 < 0) {
            v1 += v3;
            v += 4 - (v3 + 4 & 7);
        }
        this.FLD969.MTH5035(v1, v);
        return this.FLD968.MTH5038(v1, v);
    }

    public static CLS242 MTH3246(CLS366 ﾞⁱ0) {
        return CLS242.MTH3232(ﾞⁱ0.MTH5046(), ﾞⁱ0.MTH5044());
    }

    public final CLS366 MTH3247(CLS366 ﾞⁱ0) {
        int v = this.FLD967.MTH3231();
        int v1 = this.FLD967.MTH3229();
        if(ﾞⁱ0.MTH5046() != v) {
            throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
        }
        int v2 = this.FLD967.MTH3227();
        int v3 = this.FLD967.MTH3235();
        int v4 = v / v2;
        int v5 = v1 / v3;
        CLS366 ﾞⁱ1 = new CLS366(v5 * v3, v4 * v2);
        for(int v6 = 0; v6 < v4; ++v6) {
            int v7 = v6 * v2;
            for(int v8 = 0; v8 < v5; ++v8) {
                int v9 = v8 * v3;
                for(int v10 = 0; v10 < v2; ++v10) {
                    int v11 = (v2 + 2) * v6 + 1 + v10;
                    int v12 = v7 + v10;
                    for(int v13 = 0; v13 < v3; ++v13) {
                        if(ﾞⁱ0.MTH5038((v3 + 2) * v8 + 1 + v13, v11)) {
                            ﾞⁱ1.MTH5035(v9 + v13, v12);
                        }
                    }
                }
            }
        }
        return ﾞⁱ1;
    }

    public final int MTH3248(int v, int v1) {
        int v2 = this.MTH3245(v - 3, 0, v, v1) << 1;
        if(this.MTH3245(v - 2, 0, v, v1)) {
            v2 |= 1;
        }
        int v3 = this.MTH3245(v - 1, 0, v, v1) ? v2 << 1 | 1 : v2 << 1;
        int v4 = this.MTH3245(0, v1 - 2, v, v1) ? v3 << 1 | 1 : v3 << 1;
        int v5 = this.MTH3245(0, v1 - 1, v, v1) ? v4 << 1 | 1 : v4 << 1;
        int v6 = this.MTH3245(1, v1 - 1, v, v1) ? v5 << 1 | 1 : v5 << 1;
        int v7 = this.MTH3245(2, v1 - 1, v, v1) ? v6 << 1 | 1 : v6 << 1;
        return this.MTH3245(3, v1 - 1, v, v1) ? v7 << 1 | 1 : v7 << 1;
    }

    public CLS242 MTH3249() {
        return this.FLD967;
    }
}

