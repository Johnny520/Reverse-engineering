// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

import java.util.Arrays;

public final class CLS366 implements Cloneable {
    public final int FLD1654;
    public final int[] FLD1655;
    public final int FLD1656;
    public final int FLD1657;

    public CLS366(int v) {
        this(v, v);
    }

    public CLS366(int v, int v1) {
        if(v <= 0 || v1 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.FLD1656 = v;
        this.FLD1657 = v1;
        int v2 = (v + 0x1F) / 0x20;
        this.FLD1654 = v2;
        this.FLD1655 = new int[v2 * v1];
    }

    public CLS366(int v, int v1, int v2, int[] arr_v) {
        this.FLD1656 = v;
        this.FLD1657 = v1;
        this.FLD1654 = v2;
        this.FLD1655 = arr_v;
    }

    @Override
    public Object clone() {
        return this.MTH5047();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof CLS366 ? this.FLD1656 == ((CLS366)object0).FLD1656 && this.FLD1657 == ((CLS366)object0).FLD1657 && this.FLD1654 == ((CLS366)object0).FLD1654 && Arrays.equals(this.FLD1655, ((CLS366)object0).FLD1655) : false;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.FLD1655);
        return (((this.FLD1656 * 0x1F + this.FLD1656) * 0x1F + this.FLD1657) * 0x1F + this.FLD1654) * 0x1F + v;
    }

    @Override
    public String toString() {
        return this.MTH5042("X ", "  ");
    }

    public void MTH5033(int v, int v1) {
        int v2 = v1 * this.FLD1654 + v / 0x20;
        this.FLD1655[v2] ^= 1 << (v & 0x1F);
    }

    public int[] MTH5034() {
        int[] arr_v;
        int v;
        for(v = 0; true; ++v) {
            arr_v = this.FLD1655;
            if(v >= arr_v.length || arr_v[v] != 0) {
                break;
            }
        }
        if(v == arr_v.length) {
            return null;
        }
        int v1 = v / this.FLD1654;
        int v2 = v % this.FLD1654 << 5;
        int v3 = arr_v[v];
        int v4;
        for(v4 = 0; v3 << 0x1F - v4 == 0; ++v4) {
        }
        return new int[]{v2 + v4, v1};
    }

    public void MTH5035(int v, int v1) {
        int v2 = v1 * this.FLD1654 + v / 0x20;
        this.FLD1655[v2] |= 1 << (v & 0x1F);
    }

    public int[] MTH5036() {
        int v;
        for(v = this.FLD1655.length - 1; v >= 0 && this.FLD1655[v] == 0; --v) {
        }
        if(v < 0) {
            return null;
        }
        int v1 = v / this.FLD1654;
        int v2 = v % this.FLD1654 << 5;
        int v3 = this.FLD1655[v];
        int v4;
        for(v4 = 0x1F; v3 >>> v4 == 0; --v4) {
        }
        return new int[]{v2 + v4, v1};
    }

    public void MTH5037(int v, int v1, int v2, int v3) {
        if(v1 < 0 || v < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if(v3 <= 0 || v2 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int v4 = v2 + v;
        int v5 = v3 + v1;
        if(v5 > this.FLD1657 || v4 > this.FLD1656) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while(v1 < v5) {
            int v6 = this.FLD1654 * v1;
            for(int v7 = v; v7 < v4; ++v7) {
                int v8 = v7 / 0x20 + v6;
                this.FLD1655[v8] |= 1 << (v7 & 0x1F);
            }
            ++v1;
        }
    }

    public boolean MTH5038(int v, int v1) {
        return (this.FLD1655[v1 * this.FLD1654 + v / 0x20] >>> (v & 0x1F) & 1) != 0;
    }

    public void MTH5039() {
        int v = this.MTH5044();
        int v1 = this.MTH5046();
        CLS365 ⁱˋ0 = new CLS365(v);
        CLS365 ⁱˋ1 = new CLS365(v);
        for(int v2 = 0; v2 < (v1 + 1) / 2; ++v2) {
            ⁱˋ0 = this.MTH5043(v2, ⁱˋ0);
            int v3 = v1 - 1 - v2;
            ⁱˋ1 = this.MTH5043(v3, ⁱˋ1);
            ⁱˋ0.MTH5013();
            ⁱˋ1.MTH5013();
            this.MTH5041(v2, ⁱˋ1);
            this.MTH5041(v3, ⁱˋ0);
        }
    }

    public int[] MTH5040() {
        int v = this.FLD1656;
        int v1 = this.FLD1657;
        int v2 = -1;
        int v3 = -1;
        for(int v4 = 0; v4 < this.FLD1657; ++v4) {
            for(int v5 = 0; true; ++v5) {
                int v6 = this.FLD1654;
                if(v5 >= v6) {
                    break;
                }
                int v7 = this.FLD1655[v6 * v4 + v5];
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

    public void MTH5041(int v, CLS365 ⁱˋ0) {
        System.arraycopy(ⁱˋ0.MTH5014(), 0, this.FLD1655, v * this.FLD1654, this.FLD1654);
    }

    public String MTH5042(String s, String s1) {
        return this.MTH5045(s, s1, "\n");
    }

    public CLS365 MTH5043(int v, CLS365 ⁱˋ0) {
        if(ⁱˋ0 == null || ⁱˋ0.MTH5007() < this.FLD1656) {
            ⁱˋ0 = new CLS365(this.FLD1656);
        }
        else {
            ⁱˋ0.MTH5006();
        }
        int v1 = v * this.FLD1654;
        for(int v2 = 0; v2 < this.FLD1654; ++v2) {
            ⁱˋ0.MTH5011(v2 << 5, this.FLD1655[v1 + v2]);
        }
        return ⁱˋ0;
    }

    public int MTH5044() {
        return this.FLD1656;
    }

    public final String MTH5045(String s, String s1, String s2) {
        StringBuilder stringBuilder0 = new StringBuilder(this.FLD1657 * (this.FLD1656 + 1));
        for(int v = 0; v < this.FLD1657; ++v) {
            for(int v1 = 0; v1 < this.FLD1656; ++v1) {
                stringBuilder0.append((this.MTH5038(v1, v) ? s : s1));
            }
            stringBuilder0.append(s2);
        }
        return stringBuilder0.toString();
    }

    public int MTH5046() {
        return this.FLD1657;
    }

    public CLS366 MTH5047() {
        int[] arr_v = (int[])this.FLD1655.clone();
        return new CLS366(this.FLD1656, this.FLD1657, this.FLD1654, arr_v);
    }
}

