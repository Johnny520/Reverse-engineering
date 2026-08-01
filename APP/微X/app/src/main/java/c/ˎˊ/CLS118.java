// Decompiled by JEB v5.42.0.202606242140

package c.ˎˊ;

import java.util.Arrays;

public final class CLS118 implements Cloneable {
    public int FLD568;
    public int[] FLD569;

    public CLS118() {
        this.FLD568 = 0;
        this.FLD569 = new int[1];
    }

    public CLS118(int v) {
        this.FLD568 = v;
        this.FLD569 = CLS118.MTH2348(v);
    }

    public CLS118(int[] arr_v, int v) {
        this.FLD569 = arr_v;
        this.FLD568 = v;
    }

    @Override
    public Object clone() {
        return this.MTH2344();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof CLS118 ? this.FLD568 == ((CLS118)object0).FLD568 && Arrays.equals(this.FLD569, ((CLS118)object0).FLD569) : false;
    }

    @Override
    public int hashCode() {
        return this.FLD568 * 0x1F + Arrays.hashCode(this.FLD569);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.FLD568);
        for(int v = 0; v < this.FLD568; ++v) {
            if((v & 7) == 0) {
                stringBuilder0.append(' ');
            }
            stringBuilder0.append(((char)(this.MTH2357(v) ? 88 : 46)));
        }
        return stringBuilder0.toString();
    }

    public void MTH2342(CLS118 ˆٴ0) {
        int v = ˆٴ0.FLD568;
        this.MTH2359(this.FLD568 + v);
        for(int v1 = 0; v1 < v; ++v1) {
            this.MTH2346(ˆٴ0.MTH2357(v1));
        }
    }

    public int MTH2343() {
        return (this.FLD568 + 7) / 8;
    }

    public CLS118 MTH2344() {
        return new CLS118(((int[])this.FLD569.clone()), this.FLD568);
    }

    public void MTH2345() {
        int[] arr_v = new int[this.FLD569.length];
        int v = (this.FLD568 - 1) / 0x20;
        for(int v1 = 0; v1 < v + 1; ++v1) {
            long v2 = (long)this.FLD569[v1];
            long v3 = (v2 & 0x55555555L) << 1 | v2 >> 1 & 0x55555555L;
            long v4 = (v3 & 0x33333333L) << 2 | v3 >> 2 & 0x33333333L;
            long v5 = (v4 & 0xF0F0F0FL) << 4 | v4 >> 4 & 0xF0F0F0FL;
            long v6 = (v5 & 0xFF00FFL) << 8 | v5 >> 8 & 0xFF00FFL;
            arr_v[v - v1] = (int)((v6 & 0xFFFFL) << 16 | v6 >> 16 & 0xFFFFL);
        }
        int v7 = this.FLD568;
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
        this.FLD569 = arr_v;
    }

    public void MTH2346(boolean z) {
        this.MTH2359(this.FLD568 + 1);
        if(z) {
            this.FLD569[this.FLD568 / 0x20] |= 1 << (this.FLD568 & 0x1F);
        }
        ++this.FLD568;
    }

    public int MTH2347() {
        return this.FLD568;
    }

    public static int[] MTH2348(int v) {
        return new int[(v + 0x1F) / 0x20];
    }

    public int MTH2349(int v) {
        int v1 = this.FLD568;
        if(v >= v1) {
            return v1;
        }
        int v2 = v / 0x20;
        int v3;
        for(v3 = ~((1 << (v & 0x1F)) - 1) & this.FLD569[v2]; v3 == 0; v3 = arr_v[v2]) {
            ++v2;
            int[] arr_v = this.FLD569;
            if(v2 == arr_v.length) {
                return this.FLD568;
            }
        }
        int v4 = (v2 << 5) + Integer.numberOfTrailingZeros(v3);
        return v4 <= this.FLD568 ? v4 : this.FLD568;
    }

    public void MTH2350(int v) {
        this.FLD569[v / 0x20] |= 1 << (v & 0x1F);
    }

    public void MTH2351(int v, int v1) {
        this.FLD569[v / 0x20] = v1;
    }

    public int MTH2352(int v) {
        int v1 = this.FLD568;
        if(v >= v1) {
            return v1;
        }
        int v2 = v / 0x20;
        int v3;
        for(v3 = ~((1 << (v & 0x1F)) - 1 | this.FLD569[v2]); v3 == 0; v3 = ~arr_v[v2]) {
            ++v2;
            int[] arr_v = this.FLD569;
            if(v2 == arr_v.length) {
                return this.FLD568;
            }
        }
        int v4 = (v2 << 5) + Integer.numberOfTrailingZeros(v3);
        return v4 <= this.FLD568 ? v4 : this.FLD568;
    }

    public boolean MTH2353(int v, int v1, boolean z) {
        if(v1 < v || v < 0 || v1 > this.FLD568) {
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
            int v6 = this.FLD569[v3] & v5;
            if(!z) {
                v5 = 0;
            }
            if(v6 != v5) {
                return false;
            }
        }
        return true;
    }

    public void MTH2354(CLS118 ˆٴ0) {
        if(this.FLD568 != ˆٴ0.FLD568) {
            throw new IllegalArgumentException("Sizes don\'t match");
        }
        for(int v = 0; true; ++v) {
            int[] arr_v = this.FLD569;
            if(v >= arr_v.length) {
                break;
            }
            arr_v[v] ^= ˆٴ0.FLD569[v];
        }
    }

    public void MTH2355(int v, int v1) {
        if(v1 < 0 || v1 > 0x20) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        this.MTH2359(this.FLD568 + v1);
        while(true) {
            boolean z = true;
            if(v1 <= 0) {
                break;
            }
            if((v >> v1 - 1 & 1) != 1) {
                z = false;
            }
            this.MTH2346(z);
            --v1;
        }
    }

    public void MTH2356(int v, byte[] arr_b, int v1, int v2) {
        for(int v3 = 0; v3 < v2; ++v3) {
            int v4 = 0;
            for(int v5 = 0; v5 < 8; ++v5) {
                if(this.MTH2357(v)) {
                    v4 |= 1 << 7 - v5;
                }
                ++v;
            }
            arr_b[v1 + v3] = (byte)v4;
        }
    }

    public boolean MTH2357(int v) {
        return (1 << (v & 0x1F) & this.FLD569[v / 0x20]) != 0;
    }

    public int[] MTH2358() {
        return this.FLD569;
    }

    public final void MTH2359(int v) {
        if(v > this.FLD569.length << 5) {
            int[] arr_v = CLS118.MTH2348(v);
            System.arraycopy(this.FLD569, 0, arr_v, 0, this.FLD569.length);
            this.FLD569 = arr_v;
        }
    }

    public void MTH2360() {
        for(int v = 0; v < this.FLD569.length; ++v) {
            this.FLD569[v] = 0;
        }
    }
}

