// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS271;
import c.ﾞʾ.CLS365;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;

public final class CLS832 extends CLS439 {
    public int FLD450;
    public static final int[] FLD451;
    public static final char[] FLD452;
    public static final char[] FLD453;
    public final StringBuilder FLD454;
    public int[] FLD455;

    static {
        CLS832.FLD452 = "0123456789-$:/.+ABCD".toCharArray();
        CLS832.FLD451 = new int[]{3, 6, 9, 0x60, 18, 66, 33, 36, 0x30, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
        CLS832.FLD453 = new char[]{'A', 'B', 'C', 'D'};
    }

    public CLS832() {
        this.FLD454 = new StringBuilder(20);
        this.FLD455 = new int[80];
        this.FLD450 = 0;
    }

    public final int MTH1719() {
        for(int v = 1; v < this.FLD450; v += 2) {
            int v1 = this.MTH1721(v);
            if(v1 != -1 && CLS832.MTH1724(CLS832.FLD453, CLS832.FLD452[v1])) {
                int v2 = 0;
                for(int v3 = v; v3 < v + 7; ++v3) {
                    v2 += this.FLD455[v3];
                }
                if(v == 1 || this.FLD455[v - 1] >= v2 / 2) {
                    return v;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final void MTH1720(int v) {
        int[] arr_v = {0, 0, 0, 0};
        int[] arr_v1 = {0, 0, 0, 0};
        int v1 = this.FLD454.length();
        int v3 = v;
        for(int v4 = 0; true; ++v4) {
            int v5 = CLS832.FLD451[this.FLD454.charAt(v4)];
            for(int v6 = 6; v6 >= 0; --v6) {
                int v7 = (v6 & 1) + ((v5 & 1) << 1);
                arr_v[v7] += this.FLD455[v3 + v6];
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
            int v11 = CLS832.FLD451[this.FLD454.charAt(v2)];
            for(int v12 = 6; v12 >= 0; --v12) {
                int v13 = (v12 & 1) + ((v11 & 1) << 1);
                float f2 = (float)this.FLD455[v + v12];
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

    public final int MTH1721(int v) {
        if(v + 7 >= this.FLD450) {
            return -1;
        }
        int[] arr_v = this.FLD455;
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
            int[] arr_v1 = CLS832.FLD451;
            if(v2 >= arr_v1.length) {
                break;
            }
            if(arr_v1[v2] == v11) {
                return v2;
            }
        }
        return -1;
    }

    public final void MTH1722(int v) {
        int[] arr_v = this.FLD455;
        int v1 = this.FLD450;
        arr_v[v1] = v;
        this.FLD450 = v1 + 1;
        if(v1 + 1 >= arr_v.length) {
            int[] arr_v1 = new int[v1 + 1 << 1];
            System.arraycopy(arr_v, 0, arr_v1, 0, v1 + 1);
            this.FLD455 = arr_v1;
        }
    }

    public final void MTH1723(CLS365 ⁱˋ0) {
        int v = 0;
        this.FLD450 = 0;
        int v1 = ⁱˋ0.MTH5015(0);
        int v2 = ⁱˋ0.MTH5007();
        if(v1 >= v2) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z = true;
        while(v1 < v2) {
            if((ⁱˋ0.MTH5018(v1) ^ z) == 0) {
                this.MTH1722(v);
                z = !z;
                v = 1;
            }
            else {
                ++v;
            }
            ++v1;
        }
        this.MTH1722(v);
    }

    public static boolean MTH1724(char[] arr_c, char c) {
        if(arr_c != null) {
            for(int v = 0; v < arr_c.length; ++v) {
                if(arr_c[v] == c) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // c.ˏـ.CLS439
    public CLS271 MTH1682(int v, CLS365 ⁱˋ0, Map map0) {
        Arrays.fill(this.FLD455, 0);
        this.MTH1723(ⁱˋ0);
        int v1 = this.MTH1719();
        this.FLD454.setLength(0);
        int v2 = v1;
        int v3;
        while((v3 = this.MTH1721(v2)) != -1) {
            this.FLD454.append(((char)v3));
            v2 += 8;
            if(this.FLD454.length() > 1 && CLS832.MTH1724(CLS832.FLD453, CLS832.FLD452[v3]) || v2 >= this.FLD450) {
                int v4 = this.FLD455[v2 - 1];
                int v5 = 0;
                for(int v6 = -8; v6 < -1; ++v6) {
                    v5 += this.FLD455[v2 + v6];
                }
                if(v2 < this.FLD450 && v4 < v5 / 2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                this.MTH1720(v1);
                for(int v7 = 0; v7 < this.FLD454.length(); ++v7) {
                    int v8 = this.FLD454.charAt(v7);
                    this.FLD454.setCharAt(v7, CLS832.FLD452[v8]);
                }
                int v9 = this.FLD454.charAt(0);
                if(!CLS832.MTH1724(CLS832.FLD453, ((char)v9)) || !CLS832.MTH1724(CLS832.FLD453, this.FLD454.charAt(this.FLD454.length() - 1)) || this.FLD454.length() <= 3) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if(map0 == null || !map0.containsKey(DecodeHintType.RETURN_CODABAR_START_END)) {
                    this.FLD454.deleteCharAt(this.FLD454.length() - 1);
                    this.FLD454.deleteCharAt(0);
                }
                int v11 = 0;
                for(int v10 = 0; v10 < v1; ++v10) {
                    v11 += this.FLD455[v10];
                }
                float f = (float)v11;
                while(v1 < v2 - 1) {
                    v11 += this.FLD455[v1];
                    ++v1;
                }
                CLS268[] arr_ᵔʼ = {new CLS268(f, ((float)v)), new CLS268(((float)v11), ((float)v))};
                return new CLS271(this.FLD454.toString(), null, arr_ᵔʼ, BarcodeFormat.CODABAR);
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

