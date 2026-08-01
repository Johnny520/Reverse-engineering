// Decompiled by JEB v5.42.0.202606242140

package c.ﾞʾ;

import java.util.Arrays;

public final class CLS365 implements Cloneable {
    public int[] FLD1649;
    public int FLD1650;

    public CLS365() {
        this.FLD1650 = 0;
        this.FLD1649 = new int[1];
    }

    public CLS365(int v) {
        this.FLD1650 = v;
        this.FLD1649 = CLS365.MTH5009(v);
    }

    public CLS365(int[] arr_v, int v) {
        this.FLD1649 = arr_v;
        this.FLD1650 = v;
    }

    @Override
    public Object clone() {
        return this.MTH5004();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof CLS365 ? this.FLD1650 == ((CLS365)object0).FLD1650 && Arrays.equals(this.FLD1649, ((CLS365)object0).FLD1649) : false;
    }

    @Override
    public int hashCode() {
        return this.FLD1650 * 0x1F + Arrays.hashCode(this.FLD1649);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.FLD1650);
        for(int v = 0; v < this.FLD1650; ++v) {
            if((v & 7) == 0) {
                stringBuilder0.append(' ');
            }
            stringBuilder0.append(((char)(this.MTH5018(v) ? 88 : 46)));
        }
        return stringBuilder0.toString();
    }

    public void MTH5001(int v, int v1) {
        if(v1 < 0 || v1 > 0x20) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        this.MTH5008(this.FLD1650 + v1);
        while(true) {
            boolean z = true;
            if(v1 <= 0) {
                break;
            }
            if((v >> v1 - 1 & 1) != 1) {
                z = false;
            }
            this.MTH5016(z);
            --v1;
        }
    }

    public int MTH5002(int v) {
        int v1 = this.FLD1650;
        if(v >= v1) {
            return v1;
        }
        int v2 = v / 0x20;
        int v3;
        for(v3 = ~((1 << (v & 0x1F)) - 1) & this.FLD1649[v2]; v3 == 0; v3 = arr_v[v2]) {
            ++v2;
            int[] arr_v = this.FLD1649;
            if(v2 == arr_v.length) {
                return this.FLD1650;
            }
        }
        int v4 = (v2 << 5) + Integer.numberOfTrailingZeros(v3);
        return v4 <= this.FLD1650 ? v4 : this.FLD1650;
    }

    public int MTH5003() {
        return (this.FLD1650 + 7) / 8;
    }

    public CLS365 MTH5004() {
        return new CLS365(((int[])this.FLD1649.clone()), this.FLD1650);
    }

    public boolean MTH5005(int v, int v1, boolean z) {
        if(v1 < v || v < 0 || v1 > this.FLD1650) {
            throw new IllegalArgumentException();
        }
        if(v1 == v) {
            return true;
        }
        int v2 = (v1 - 1) / 0x20;
        for(int v3 = v / 0x20; true; ++v3) {
            int v4 = 0x1F;
            if(v3 > v2) {
                break;
            }
            if(v3 >= v2) {
                v4 = 0x1F & v1 - 1;
            }
            int v5 = (2 << v4) - (1 << (v3 <= v / 0x20 ? v & 0x1F : 0));
            int v6 = this.FLD1649[v3] & v5;
            if(!z) {
                v5 = 0;
            }
            if(v6 != v5) {
                return false;
            }
        }
        return true;
    }

    public void MTH5006() {
        for(int v = 0; v < this.FLD1649.length; ++v) {
            this.FLD1649[v] = 0;
        }
    }

    public int MTH5007() {
        return this.FLD1650;
    }

    public final void MTH5008(int v) {
        if(v > this.FLD1649.length << 5) {
            int[] arr_v = CLS365.MTH5009(v);
            System.arraycopy(this.FLD1649, 0, arr_v, 0, this.FLD1649.length);
            this.FLD1649 = arr_v;
        }
    }

    public static int[] MTH5009(int v) {
        return new int[(v + 0x1F) / 0x20];
    }

    public void MTH5010(CLS365 ⁱˋ0) {
        if(this.FLD1650 != ⁱˋ0.FLD1650) {
            throw new IllegalArgumentException("Sizes don\'t match");
        }
        for(int v = 0; true; ++v) {
            int[] arr_v = this.FLD1649;
            if(v >= arr_v.length) {
                break;
            }
            arr_v[v] ^= ⁱˋ0.FLD1649[v];
        }
    }

    public void MTH5011(int v, int v1) {
        this.FLD1649[v / 0x20] = v1;
    }

    public void MTH5012(int v, byte[] arr_b, int v1, int v2) {
        for(int v3 = 0; v3 < v2; ++v3) {
            int v4 = 0;
            for(int v5 = 0; v5 < 8; ++v5) {
                if(this.MTH5018(v)) {
                    v4 |= 1 << 7 - v5;
                }
                ++v;
            }
            arr_b[v1 + v3] = (byte)v4;
        }
    }

    public void MTH5013() {
        int[] arr_v = new int[this.FLD1649.length];
        int v = (this.FLD1650 - 1) / 0x20;
        for(int v1 = 0; v1 < v + 1; ++v1) {
            long v2 = (long)this.FLD1649[v1];
            long v3 = (v2 & 0x55555555L) << 1 | v2 >> 1 & 0x55555555L;
            long v4 = (v3 & 0x33333333L) << 2 | v3 >> 2 & 0x33333333L;
            long v5 = (v4 & 0xF0F0F0FL) << 4 | v4 >> 4 & 0xF0F0F0FL;
            long v6 = (v5 & 0xFF00FFL) << 8 | v5 >> 8 & 0xFF00FFL;
            arr_v[v - v1] = (int)((v6 & 0xFFFFL) << 16 | v6 >> 16 & 0xFFFFL);
        }
        int v7 = this.FLD1650;
        int v8 = v + 1 << 5;
        if(v7 != v8) {
            int v9 = v8 - v7;
            int v10 = arr_v[0] >>> v9;
            for(int v11 = 1; v11 < v + 1; ++v11) {
                int v12 = arr_v[v11];
                arr_v[v11 - 1] = v10 | v12 << 0x20 - v9;
                v10 = v12 >>> v9;
            }
            arr_v[v] = v10;
        }
        this.FLD1649 = arr_v;
    }

    public int[] MTH5014() {
        return this.FLD1649;
    }

    public int MTH5015(int v) {
        int v1 = this.FLD1650;
        if(v >= v1) {
            return v1;
        }
        int v2 = v / 0x20;
        int v3;
        for(v3 = ~((1 << (v & 0x1F)) - 1 | this.FLD1649[v2]); v3 == 0; v3 = ~arr_v[v2]) {
            ++v2;
            int[] arr_v = this.FLD1649;
            if(v2 == arr_v.length) {
                return this.FLD1650;
            }
        }
        int v4 = (v2 << 5) + Integer.numberOfTrailingZeros(v3);
        return v4 <= this.FLD1650 ? v4 : this.FLD1650;
    }

    public void MTH5016(boolean z) {
        this.MTH5008(this.FLD1650 + 1);
        if(z) {
            this.FLD1649[this.FLD1650 / 0x20] |= 1 << (this.FLD1650 & 0x1F);
        }
        ++this.FLD1650;
    }

    public void MTH5017(int v) {
        this.FLD1649[v / 0x20] |= 1 << (v & 0x1F);
    }

    public boolean MTH5018(int v) {
        return (1 << (v & 0x1F) & this.FLD1649[v / 0x20]) != 0;
    }

    public void MTH5019(CLS365 ⁱˋ0) {
        int v = ⁱˋ0.FLD1650;
        this.MTH5008(this.FLD1650 + v);
        for(int v1 = 0; v1 < v; ++v1) {
            this.MTH5016(ⁱˋ0.MTH5018(v1));
        }
    }
}

