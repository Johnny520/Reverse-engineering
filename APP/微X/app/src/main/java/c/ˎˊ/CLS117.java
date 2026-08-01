// Decompiled by JEB v5.42.0.202606242140

package c.ˎˊ;

import java.util.Arrays;

public final class CLS117 implements Cloneable {
    public final int FLD564;
    public final int FLD565;
    public final int FLD566;
    public final int[] FLD567;

    public CLS117(int v) {
        this(v, v);
    }

    public CLS117(int v, int v1) {
        if(v <= 0 || v1 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.FLD565 = v;
        this.FLD564 = v1;
        int v2 = (v + 0x1F) / 0x20;
        this.FLD566 = v2;
        this.FLD567 = new int[v2 * v1];
    }

    public CLS117(int v, int v1, int v2, int[] arr_v) {
        this.FLD565 = v;
        this.FLD564 = v1;
        this.FLD566 = v2;
        this.FLD567 = arr_v;
    }

    @Override
    public Object clone() {
        return this.MTH2317();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof CLS117 ? this.FLD565 == ((CLS117)object0).FLD565 && this.FLD564 == ((CLS117)object0).FLD564 && this.FLD566 == ((CLS117)object0).FLD566 && Arrays.equals(this.FLD567, ((CLS117)object0).FLD567) : false;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.FLD567);
        return (((this.FLD565 * 0x1F + this.FLD565) * 0x1F + this.FLD564) * 0x1F + this.FLD566) * 0x1F + v;
    }

    @Override
    public String toString() {
        return this.MTH2320("X ", "  ");
    }

    public CLS117 MTH2317() {
        int[] arr_v = (int[])this.FLD567.clone();
        return new CLS117(this.FLD565, this.FLD564, this.FLD566, arr_v);
    }

    public void MTH2318(int v, int v1) {
        int v2 = v1 * this.FLD566 + v / 0x20;
        this.FLD567[v2] |= 1 << (v & 0x1F);
    }

    public int[] MTH2319() {
        int v;
        for(v = this.FLD567.length - 1; v >= 0 && this.FLD567[v] == 0; --v) {
        }
        if(v < 0) {
            return null;
        }
        int v1 = v / this.FLD566;
        int v2 = v % this.FLD566 << 5;
        int v3 = this.FLD567[v];
        int v4;
        for(v4 = 0x1F; v3 >>> v4 == 0; --v4) {
        }
        return new int[]{v2 + v4, v1};
    }

    public String MTH2320(String s, String s1) {
        return this.MTH2321(s, s1, "\n");
    }

    public final String MTH2321(String s, String s1, String s2) {
        StringBuilder stringBuilder0 = new StringBuilder(this.FLD564 * (this.FLD565 + 1));
        for(int v = 0; v < this.FLD564; ++v) {
            for(int v1 = 0; v1 < this.FLD565; ++v1) {
                stringBuilder0.append((this.MTH2331(v1, v) ? s : s1));
            }
            stringBuilder0.append(s2);
        }
        return stringBuilder0.toString();
    }

    public void MTH2322() {
        int v = this.MTH2325();
        int v1 = this.MTH2328();
        CLS118 ˆٴ0 = new CLS118(v);
        CLS118 ˆٴ1 = new CLS118(v);
        for(int v2 = 0; v2 < (v1 + 1) / 2; ++v2) {
            ˆٴ0 = this.MTH2329(v2, ˆٴ0);
            int v3 = v1 - 1 - v2;
            ˆٴ1 = this.MTH2329(v3, ˆٴ1);
            ˆٴ0.MTH2345();
            ˆٴ1.MTH2345();
            this.MTH2323(v2, ˆٴ1);
            this.MTH2323(v3, ˆٴ0);
        }
    }

    public void MTH2323(int v, CLS118 ˆٴ0) {
        System.arraycopy(ˆٴ0.MTH2358(), 0, this.FLD567, v * this.FLD566, this.FLD566);
    }

    public int[] MTH2324() {
        int[] arr_v;
        int v;
        for(v = 0; true; ++v) {
            arr_v = this.FLD567;
            if(v >= arr_v.length || arr_v[v] != 0) {
                break;
            }
        }
        if(v == arr_v.length) {
            return null;
        }
        int v1 = v / this.FLD566;
        int v2 = v % this.FLD566 << 5;
        int v3 = arr_v[v];
        int v4;
        for(v4 = 0; v3 << 0x1F - v4 == 0; ++v4) {
        }
        return new int[]{v2 + v4, v1};
    }

    public int MTH2325() {
        return this.FLD565;
    }

    public void MTH2326(int v, int v1, int v2, int v3) {
        if(v1 < 0 || v < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if(v3 <= 0 || v2 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int v4 = v2 + v;
        int v5 = v3 + v1;
        if(v5 > this.FLD564 || v4 > this.FLD565) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while(v1 < v5) {
            int v6 = this.FLD566 * v1;
            for(int v7 = v; v7 < v4; ++v7) {
                int v8 = v7 / 0x20 + v6;
                this.FLD567[v8] |= 1 << (v7 & 0x1F);
            }
            ++v1;
        }
    }

    public void MTH2327(int v, int v1) {
        int v2 = v1 * this.FLD566 + v / 0x20;
        this.FLD567[v2] ^= 1 << (v & 0x1F);
    }

    public int MTH2328() {
        return this.FLD564;
    }

    public CLS118 MTH2329(int v, CLS118 ˆٴ0) {
        if(ˆٴ0 == null || ˆٴ0.MTH2347() < this.FLD565) {
            ˆٴ0 = new CLS118(this.FLD565);
        }
        else {
            ˆٴ0.MTH2360();
        }
        int v1 = v * this.FLD566;
        for(int v2 = 0; v2 < this.FLD566; ++v2) {
            ˆٴ0.MTH2351(v2 << 5, this.FLD567[v1 + v2]);
        }
        return ˆٴ0;
    }

    public int[] MTH2330() {
        int v = this.FLD565;
        int v1 = this.FLD564;
        int v2 = -1;
        int v3 = -1;
        for(int v4 = 0; v4 < this.FLD564; ++v4) {
            for(int v5 = 0; true; ++v5) {
                int v6 = this.FLD566;
                if(v5 >= v6) {
                    break;
                }
                int v7 = this.FLD567[v6 * v4 + v5];
                if(v7 != 0) {
                    if(v4 < v1) {
                        v1 = v4;
                    }
                    if(v4 > v3) {
                        v3 = v4;
                    }
                    if(v5 << 5 < v) {
                        int v8;
                        for(v8 = 0; v7 << 0x1F - v8 == 0; ++v8) {
                        }
                        int v9 = v8 + (v5 << 5);
                        if(v9 < v) {
                            v = v9;
                        }
                    }
                    if((v5 << 5) + 0x1F > v2) {
                        int v10;
                        for(v10 = 0x1F; v7 >>> v10 == 0; --v10) {
                        }
                        int v11 = (v5 << 5) + v10;
                        if(v11 > v2) {
                            v2 = v11;
                        }
                    }
                }
            }
        }
        return v2 < v || v3 < v1 ? null : new int[]{v, v1, v2 - v + 1, v3 - v1 + 1};
    }

    public boolean MTH2331(int v, int v1) {
        return (this.FLD567[v1 * this.FLD566 + v / 0x20] >>> (v & 0x1F) & 1) != 0;
    }
}

