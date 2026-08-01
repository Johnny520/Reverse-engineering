// Decompiled by JEB v5.42.0.202606242140

package c.ˈˎ;

import c.ˎˊ.CLS117;
import com.google.zxing.FormatException;

public final class CLS88 {
    public final CLS117 FLD454;
    public final CLS117 FLD455;
    public final CLS87 FLD456;

    public CLS88(CLS117 ʻᵢ0) {
        int v = ʻᵢ0.MTH2328();
        if(v < 8 || v > 0x90 || (v & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        this.FLD456 = CLS88.MTH1939(ʻᵢ0);
        CLS117 ʻᵢ1 = this.MTH1937(ʻᵢ0);
        this.FLD455 = ʻᵢ1;
        this.FLD454 = new CLS117(ʻᵢ1.MTH2325(), ʻᵢ1.MTH2328());
    }

    public CLS87 MTH1935() {
        return this.FLD456;
    }

    public final int MTH1936(int v, int v1) {
        int v2 = this.MTH1942(v - 3, 0, v, v1) << 1;
        if(this.MTH1942(v - 2, 0, v, v1)) {
            v2 |= 1;
        }
        int v3 = this.MTH1942(v - 1, 0, v, v1) ? v2 << 1 | 1 : v2 << 1;
        int v4 = this.MTH1942(0, v1 - 4, v, v1) ? v3 << 1 | 1 : v3 << 1;
        int v5 = this.MTH1942(0, v1 - 3, v, v1) ? v4 << 1 | 1 : v4 << 1;
        int v6 = this.MTH1942(0, v1 - 2, v, v1) ? v5 << 1 | 1 : v5 << 1;
        int v7 = this.MTH1942(0, v1 - 1, v, v1) ? v6 << 1 | 1 : v6 << 1;
        return this.MTH1942(1, v1 - 1, v, v1) ? v7 << 1 | 1 : v7 << 1;
    }

    public final CLS117 MTH1937(CLS117 ʻᵢ0) {
        int v = this.FLD456.MTH1932();
        int v1 = this.FLD456.MTH1926();
        if(ʻᵢ0.MTH2328() != v) {
            throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
        }
        int v2 = this.FLD456.MTH1929();
        int v3 = this.FLD456.MTH1925();
        int v4 = v / v2;
        int v5 = v1 / v3;
        CLS117 ʻᵢ1 = new CLS117(v5 * v3, v4 * v2);
        for(int v6 = 0; v6 < v4; ++v6) {
            int v7 = v6 * v2;
            for(int v8 = 0; v8 < v5; ++v8) {
                int v9 = v8 * v3;
                for(int v10 = 0; v10 < v2; ++v10) {
                    int v11 = (v2 + 2) * v6 + 1 + v10;
                    int v12 = v7 + v10;
                    for(int v13 = 0; v13 < v3; ++v13) {
                        if(ʻᵢ0.MTH2331((v3 + 2) * v8 + 1 + v13, v11)) {
                            ʻᵢ1.MTH2318(v9 + v13, v12);
                        }
                    }
                }
            }
        }
        return ʻᵢ1;
    }

    public final int MTH1938(int v, int v1, int v2, int v3) {
        int v4 = this.MTH1942(v - 2, v1 - 2, v2, v3) << 1;
        if(this.MTH1942(v - 2, v1 - 1, v2, v3)) {
            v4 |= 1;
        }
        int v5 = this.MTH1942(v - 1, v1 - 2, v2, v3) ? v4 << 1 | 1 : v4 << 1;
        int v6 = this.MTH1942(v - 1, v1 - 1, v2, v3) ? v5 << 1 | 1 : v5 << 1;
        int v7 = this.MTH1942(v - 1, v1, v2, v3) ? v6 << 1 | 1 : v6 << 1;
        int v8 = this.MTH1942(v, v1 - 2, v2, v3) ? v7 << 1 | 1 : v7 << 1;
        int v9 = this.MTH1942(v, v1 - 1, v2, v3) ? v8 << 1 | 1 : v8 << 1;
        return this.MTH1942(v, v1, v2, v3) ? v9 << 1 | 1 : v9 << 1;
    }

    public static CLS87 MTH1939(CLS117 ʻᵢ0) {
        return CLS87.MTH1931(ʻᵢ0.MTH2328(), ʻᵢ0.MTH2325());
    }

    public byte[] MTH1940() {
        byte[] arr_b = new byte[this.FLD456.MTH1930()];
        int v = this.FLD455.MTH2328();
        int v1 = this.FLD455.MTH2325();
        int v2 = 0;
        boolean z = false;
        int v3 = 0;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        int v4 = 4;
        do {
            if(v4 == v && v2 == 0 && !z) {
                arr_b[v3] = (byte)this.MTH1944(v, v1);
                v4 -= 2;
                v2 = 2;
                ++v3;
                z = true;
            }
            else if(v4 == v - 2 && v2 == 0 && (v1 & 3) != 0 && !z1) {
                arr_b[v3] = (byte)this.MTH1936(v, v1);
                v4 -= 2;
                v2 = 2;
                ++v3;
                z1 = true;
            }
            else if(v4 == v + 4 && v2 == 2 && (v1 & 7) == 0 && !z2) {
                arr_b[v3] = (byte)this.MTH1943(v, v1);
                v4 -= 2;
                v2 = 4;
                ++v3;
                z2 = true;
            }
            else if(v4 != v - 2 || v2 != 0 || (v1 & 7) != 4 || z3) {
                do {
                    if(v4 < v && v2 >= 0 && !this.FLD454.MTH2331(v2, v4)) {
                        arr_b[v3] = (byte)this.MTH1938(v4, v2, v, v1);
                        ++v3;
                    }
                    v4 -= 2;
                    v2 += 2;
                }
                while(v4 >= 0 && v2 < v1);
                int v5 = v4 + 1;
                int v6 = v2 + 3;
                do {
                    if(v5 >= 0 && v6 < v1 && !this.FLD454.MTH2331(v6, v5)) {
                        arr_b[v3] = (byte)this.MTH1938(v5, v6, v, v1);
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
                arr_b[v3] = (byte)this.MTH1941(v, v1);
                v4 -= 2;
                v2 = 2;
                ++v3;
                z3 = true;
            }
        }
        while(v4 < v || v2 < v1);
        if(v3 != this.FLD456.MTH1930()) {
            throw FormatException.getFormatInstance();
        }
        return arr_b;
    }

    public final int MTH1941(int v, int v1) {
        int v2 = this.MTH1942(v - 3, 0, v, v1) << 1;
        if(this.MTH1942(v - 2, 0, v, v1)) {
            v2 |= 1;
        }
        int v3 = this.MTH1942(v - 1, 0, v, v1) ? v2 << 1 | 1 : v2 << 1;
        int v4 = this.MTH1942(0, v1 - 2, v, v1) ? v3 << 1 | 1 : v3 << 1;
        int v5 = this.MTH1942(0, v1 - 1, v, v1) ? v4 << 1 | 1 : v4 << 1;
        int v6 = this.MTH1942(1, v1 - 1, v, v1) ? v5 << 1 | 1 : v5 << 1;
        int v7 = this.MTH1942(2, v1 - 1, v, v1) ? v6 << 1 | 1 : v6 << 1;
        return this.MTH1942(3, v1 - 1, v, v1) ? v7 << 1 | 1 : v7 << 1;
    }

    public final boolean MTH1942(int v, int v1, int v2, int v3) {
        if(v < 0) {
            v += v2;
            v1 += 4 - (v2 + 4 & 7);
        }
        if(v1 < 0) {
            v1 += v3;
            v += 4 - (v3 + 4 & 7);
        }
        this.FLD454.MTH2318(v1, v);
        return this.FLD455.MTH2331(v1, v);
    }

    public final int MTH1943(int v, int v1) {
        int v2 = this.MTH1942(v - 1, 0, v, v1) << 1;
        if(this.MTH1942(v - 1, v1 - 1, v, v1)) {
            v2 |= 1;
        }
        int v3 = this.MTH1942(0, v1 - 3, v, v1) ? v2 << 1 | 1 : v2 << 1;
        int v4 = this.MTH1942(0, v1 - 2, v, v1) ? v3 << 1 | 1 : v3 << 1;
        int v5 = this.MTH1942(0, v1 - 1, v, v1) ? v4 << 1 | 1 : v4 << 1;
        int v6 = this.MTH1942(1, v1 - 3, v, v1) ? v5 << 1 | 1 : v5 << 1;
        int v7 = this.MTH1942(1, v1 - 2, v, v1) ? v6 << 1 | 1 : v6 << 1;
        return this.MTH1942(1, v1 - 1, v, v1) ? v7 << 1 | 1 : v7 << 1;
    }

    public final int MTH1944(int v, int v1) {
        int v2 = this.MTH1942(v - 1, 0, v, v1) << 1;
        if(this.MTH1942(v - 1, 1, v, v1)) {
            v2 |= 1;
        }
        int v3 = this.MTH1942(v - 1, 2, v, v1) ? v2 << 1 | 1 : v2 << 1;
        int v4 = this.MTH1942(0, v1 - 2, v, v1) ? v3 << 1 | 1 : v3 << 1;
        int v5 = this.MTH1942(0, v1 - 1, v, v1) ? v4 << 1 | 1 : v4 << 1;
        int v6 = this.MTH1942(1, v1 - 1, v, v1) ? v5 << 1 | 1 : v5 << 1;
        int v7 = this.MTH1942(2, v1 - 1, v, v1) ? v6 << 1 | 1 : v6 << 1;
        return this.MTH1942(3, v1 - 1, v, v1) ? v7 << 1 | 1 : v7 << 1;
    }
}

