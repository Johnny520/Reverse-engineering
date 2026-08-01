// Decompiled by JEB v5.42.0.202606242140

package c.ᐧـ;

import c.ˎˊ.CLS118;
import c.ﾞﹶ.CLS379;
import c.ﾞﹶ.CLS380;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

public final class CLS834 extends CLS807 {
    public int[] FLD1438;
    public static final int[] FLD1439;
    public final StringBuilder FLD1440;
    public int FLD1441;
    public static final char[] FLD1442;
    public static final char[] FLD1443;

    static {
        CLS834.FLD1443 = "0123456789-$:/.+ABCD".toCharArray();
        CLS834.FLD1439 = new int[]{3, 6, 9, 0x60, 18, 66, 33, 36, 0x30, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
        CLS834.FLD1442 = new char[]{'A', 'B', 'C', 'D'};
    }

    public CLS834() {
        this.FLD1440 = new StringBuilder(20);
        this.FLD1438 = new int[80];
        this.FLD1441 = 0;
    }

    @Override  // c.ᐧـ.CLS807
    public CLS379 MTH4611(int v, CLS118 ˆٴ0, Map map0) {
        Arrays.fill(this.FLD1438, 0);
        this.MTH4607(ˆٴ0);
        int v1 = this.MTH4606();
        this.FLD1440.setLength(0);
        int v2 = v1;
        int v3;
        while((v3 = this.MTH4605(v2)) != -1) {
            this.FLD1440.append(((char)v3));
            v2 += 8;
            if(this.FLD1440.length() > 1 && CLS834.MTH4608(CLS834.FLD1442, CLS834.FLD1443[v3]) || v2 >= this.FLD1441) {
                int v4 = this.FLD1438[v2 - 1];
                int v5 = 0;
                for(int v6 = -8; v6 < -1; ++v6) {
                    v5 += this.FLD1438[v2 + v6];
                }
                if(v2 < this.FLD1441 && v4 < v5 / 2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                this.MTH4604(v1);
                for(int v7 = 0; v7 < this.FLD1440.length(); ++v7) {
                    int v8 = this.FLD1440.charAt(v7);
                    this.FLD1440.setCharAt(v7, CLS834.FLD1443[v8]);
                }
                int v9 = this.FLD1440.charAt(0);
                if(!CLS834.MTH4608(CLS834.FLD1442, ((char)v9)) || !CLS834.MTH4608(CLS834.FLD1442, this.FLD1440.charAt(this.FLD1440.length() - 1)) || this.FLD1440.length() <= 3) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if(map0 == null || !map0.containsKey(DecodeHintType.RETURN_CODABAR_START_END)) {
                    this.FLD1440.deleteCharAt(this.FLD1440.length() - 1);
                    this.FLD1440.deleteCharAt(0);
                }
                int v11 = 0;
                for(int v10 = 0; v10 < v1; ++v10) {
                    v11 += this.FLD1438[v10];
                }
                float f = (float)v11;
                while(v1 < v2 - 1) {
                    v11 += this.FLD1438[v1];
                    ++v1;
                }
                CLS380[] arr_ٴⁱ = {new CLS380(f, ((float)v)), new CLS380(((float)v11), ((float)v))};
                return new CLS379(this.FLD1440.toString(), null, arr_ٴⁱ, BarcodeFormat.CODABAR);
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final void MTH4604(int v) {
        int[] arr_v = {0, 0, 0, 0};
        int[] arr_v1 = {0, 0, 0, 0};
        int v1 = this.FLD1440.length();
        int v3 = v;
        for(int v4 = 0; true; ++v4) {
            int v5 = CLS834.FLD1439[this.FLD1440.charAt(v4)];
            for(int v6 = 6; v6 >= 0; --v6) {
                int v7 = (v6 & 1) + ((v5 & 1) << 1);
                arr_v[v7] += this.FLD1438[v3 + v6];
                ++arr_v1[v7];
                v5 >>= 1;
            }
            if(v4 >= v1 - 1) {
                break;
            }
            v3 += 8;
        }
        float[] arr_f = new float[4];
        float[] arr_f1 = new float[4];
        for(int v8 = 0; v8 < 2; ++v8) {
            arr_f1[v8] = 0.0f;
            float f = ((float)arr_v[v8]) / ((float)arr_v1[v8]);
            int v9 = arr_v[v8 + 2];
            int v10 = arr_v1[v8 + 2];
            float f1 = (f + ((float)v9) / ((float)v10)) / 2.0f;
            arr_f1[v8 + 2] = f1;
            arr_f[v8] = f1;
            arr_f[v8 + 2] = (((float)v9) * 2.0f + 1.5f) / ((float)v10);
        }
        for(int v2 = 0; true; ++v2) {
            int v11 = CLS834.FLD1439[this.FLD1440.charAt(v2)];
            for(int v12 = 6; v12 >= 0; --v12) {
                int v13 = (v12 & 1) + ((v11 & 1) << 1);
                float f2 = (float)this.FLD1438[v + v12];
                if(f2 < arr_f1[v13] || f2 > arr_f[v13]) {
                    throw NotFoundException.getNotFoundInstance();
                }
                v11 >>= 1;
            }
            if(v2 >= v1 - 1) {
                break;
            }
            v += 8;
        }
    }

    public final int MTH4605(int v) {
        if(v + 7 >= this.FLD1441) {
            return -1;
        }
        int[] arr_v = this.FLD1438;
        int v1 = 0x7FFFFFFF;
        int v3 = v;
        int v4 = 0x7FFFFFFF;
        int v5 = 0;
        while(v3 < v + 7) {
            int v6 = arr_v[v3];
            if(v6 < v4) {
                v4 = v6;
            }
            if(v6 > v5) {
                v5 = v6;
            }
            v3 += 2;
        }
        int v7 = v + 1;
        int v8 = 0;
        while(v7 < v + 7) {
            int v9 = arr_v[v7];
            if(v9 < v1) {
                v1 = v9;
            }
            if(v9 > v8) {
                v8 = v9;
            }
            v7 += 2;
        }
        int v10 = 0x80;
        int v11 = 0;
        for(int v12 = 0; v12 < 7; ++v12) {
            v10 >>= 1;
            if(arr_v[v + v12] > ((v12 & 1) == 0 ? (v4 + v5) / 2 : (v1 + v8) / 2)) {
                v11 |= v10;
            }
        }
        for(int v2 = 0; true; ++v2) {
            int[] arr_v1 = CLS834.FLD1439;
            if(v2 >= arr_v1.length) {
                break;
            }
            if(arr_v1[v2] == v11) {
                return v2;
            }
        }
        return -1;
    }

    public final int MTH4606() {
        for(int v = 1; v < this.FLD1441; v += 2) {
            int v1 = this.MTH4605(v);
            if(v1 != -1 && CLS834.MTH4608(CLS834.FLD1442, CLS834.FLD1443[v1])) {
                int v2 = 0;
                for(int v3 = v; v3 < v + 7; ++v3) {
                    v2 += this.FLD1438[v3];
                }
                if(v == 1 || this.FLD1438[v - 1] >= v2 / 2) {
                    return v;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final void MTH4607(CLS118 ˆٴ0) {
        int v = 0;
        this.FLD1441 = 0;
        int v1 = ˆٴ0.MTH2352(0);
        int v2 = ˆٴ0.MTH2347();
        if(v1 >= v2) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z = true;
        while(v1 < v2) {
            if((ˆٴ0.MTH2357(v1) ^ z) == 0) {
                this.MTH4609(v);
                z = !z;
                v = 1;
            }
            else {
                ++v;
            }
            ++v1;
        }
        this.MTH4609(v);
    }

    public static boolean MTH4608(char[] arr_c, char c) {
        if(arr_c != null) {
            for(int v = 0; v < arr_c.length; ++v) {
                if(arr_c[v] == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void MTH4609(int v) {
        int[] arr_v = this.FLD1438;
        int v1 = this.FLD1441;
        arr_v[v1] = v;
        this.FLD1441 = v1 + 1;
        if(v1 + 1 >= arr_v.length) {
            int[] arr_v1 = new int[v1 + 1 << 1];
            System.arraycopy(arr_v, 0, arr_v1, 0, v1 + 1);
            this.FLD1438 = arr_v1;
        }
    }
}

