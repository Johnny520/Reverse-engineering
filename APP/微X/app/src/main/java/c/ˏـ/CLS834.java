// Decompiled by JEB v5.42.0.202606242140

package c.ˏـ;

import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS271;
import c.ﾞʾ.CLS365;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Map;

public final class CLS834 extends CLS439 {
    public static final int[][] FLD466;

    static {
        CLS834.FLD466 = new int[][]{new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    }

    public static int[] MTH1745(CLS365 ⁱˋ0) {
        int v = ⁱˋ0.MTH5007();
        int v1 = ⁱˋ0.MTH5002(0);
        int[] arr_v = new int[6];
        int v2 = v1;
        boolean z = false;
        int v3 = 0;
        while(v1 < v) {
            if((ⁱˋ0.MTH5018(v1) ^ z) == 0) {
                if(v3 == 5) {
                    int v4 = -1;
                    float f = 0.25f;
                    for(int v5 = 103; v5 <= 105; ++v5) {
                        float f1 = CLS439.MTH1679(arr_v, CLS834.FLD466[v5], 0.7f);
                        if(f1 < f) {
                            v4 = v5;
                            f = f1;
                        }
                    }
                    if(v4 >= 0 && ⁱˋ0.MTH5005(Math.max(0, v2 - (v1 - v2) / 2), v2, false)) {
                        return new int[]{v2, v1, v4};
                    }
                    v2 += arr_v[0] + arr_v[1];
                    System.arraycopy(arr_v, 2, arr_v, 0, 4);
                    arr_v[4] = 0;
                    arr_v[5] = 0;
                    v3 = 4;
                }
                else {
                    ++v3;
                }
                arr_v[v3] = 1;
                z = !z;
            }
            else {
                ++arr_v[v3];
            }
            ++v1;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int MTH1746(CLS365 ⁱˋ0, int[] arr_v, int v) {
        CLS439.MTH1678(ⁱˋ0, v, arr_v);
        float f = 0.25f;
        int v1 = -1;
        for(int v2 = 0; true; ++v2) {
            int[][] arr2_v = CLS834.FLD466;
            if(v2 >= arr2_v.length) {
                break;
            }
            float f1 = CLS439.MTH1679(arr_v, arr2_v[v2], 0.7f);
            if(f1 < f) {
                v1 = v2;
                f = f1;
            }
        }
        if(v1 < 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        return v1;
    }

    @Override  // c.ˏـ.CLS439
    public CLS271 MTH1682(int v, CLS365 ⁱˋ0, Map map0) {
        int v16;
        int v15;
        int v3;
        int v1 = 0;
        boolean z = map0 != null && map0.containsKey(DecodeHintType.ASSUME_GS1);
        int[] arr_v = CLS834.MTH1745(ⁱˋ0);
        int v2 = arr_v[2];
        ArrayList arrayList0 = new ArrayList(20);
        arrayList0.add(((byte)v2));
        switch(v2) {
            case 103: {
                v3 = 101;
                break;
            }
            case 104: {
                v3 = 100;
                break;
            }
            case 105: {
                v3 = 99;
                break;
            }
            default: {
                throw FormatException.getFormatInstance();
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder(20);
        int[] arr_v1 = new int[6];
        int v4 = 0;
        boolean z1 = true;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = arr_v[0];
        int v10 = arr_v[1];
        int v11 = v3;
        boolean z2 = false;
        while(!z2) {
            int v12 = CLS834.MTH1746(ⁱˋ0, arr_v1, v10);
            arrayList0.add(((byte)v12));
            if(v12 != 106) {
                z1 = true;
            }
            if(v12 != 106) {
                ++v7;
                v2 += v7 * v12;
            }
            int v13 = v10;
            for(int v14 = 0; v14 < 6; ++v14) {
                v13 += arr_v1[v14];
            }
            if(v12 == 103 || v12 == 104 || v12 == 105) {
                throw FormatException.getFormatInstance();
            }
        alab1:
            switch(v11) {
                case 99: {
                    if(v12 < 100) {
                        if(v12 < 10) {
                            stringBuilder0.append('0');
                        }
                        stringBuilder0.append(v12);
                        goto label_103;
                    }
                    else {
                        if(v12 != 106) {
                            z1 = false;
                        }
                        if(v12 == 106) {
                            v15 = 0;
                            z2 = true;
                            break;
                        }
                        else {
                            switch(v12) {
                                case 100: {
                                    v15 = 0;
                                    v11 = 100;
                                    break alab1;
                                }
                                case 101: {
                                    v15 = 0;
                                    v11 = 101;
                                    break alab1;
                                }
                                case 102: {
                                    if(z) {
                                        if(stringBuilder0.length() == 0) {
                                            stringBuilder0.append("]C1");
                                        }
                                        else {
                                            stringBuilder0.append('\u001D');
                                        }
                                    }
                                    v15 = 0;
                                    break alab1;
                                }
                                default: {
                                    goto label_103;
                                }
                            }
                        }
                    }
                    goto label_67;
                }
                case 100: {
                label_67:
                    if(v12 < 0x60) {
                        v16 = v12 + 0x20;
                        if(v4 != v1) {
                            v16 += 0x80;
                        }
                        stringBuilder0.append(((char)v16));
                        v15 = 0;
                        v4 = 0;
                        break alab1;
                    }
                    else {
                        if(v12 != 106) {
                            z1 = false;
                        }
                        if(v12 == 106) {
                            z2 = true;
                        }
                        else {
                            switch(v12) {
                                case 98: {
                                    v15 = 1;
                                    v11 = 101;
                                    break alab1;
                                }
                                case 99: {
                                    v15 = 0;
                                    v11 = 99;
                                    break alab1;
                                }
                                case 100: {
                                    if(v1 != 0 || v4 == 0) {
                                        if(v1 == 0 || v4 == 0) {
                                            v15 = 0;
                                            v4 = 1;
                                        }
                                        else {
                                            v1 = 0;
                                            v15 = 0;
                                            v4 = 0;
                                        }
                                        break alab1;
                                    }
                                    v1 = 1;
                                    v15 = 0;
                                    v4 = 0;
                                    break alab1;
                                }
                                case 101: {
                                    v15 = 0;
                                    v11 = 101;
                                    break alab1;
                                }
                                case 102: {
                                    if(z) {
                                        if(stringBuilder0.length() == 0) {
                                            stringBuilder0.append("]C1");
                                        }
                                        else {
                                            stringBuilder0.append('\u001D');
                                        }
                                    }
                                    v15 = 0;
                                    break alab1;
                                }
                            }
                        }
                    }
                label_103:
                    v15 = 0;
                    break;
                }
                case 101: {
                    if(v12 < 0x40) {
                        v16 = v12 + 0x20;
                        if(v4 != v1) {
                            v16 += 0x80;
                        }
                        stringBuilder0.append(((char)v16));
                        v15 = 0;
                        v4 = 0;
                        break alab1;
                    }
                    else if(v12 < 0x60) {
                        v16 = v4 == v1 ? v12 - 0x40 : v12 + 0x40;
                        stringBuilder0.append(((char)v16));
                        v15 = 0;
                        v4 = 0;
                        break alab1;
                    }
                    else {
                        if(v12 != 106) {
                            z1 = false;
                        }
                        if(v12 == 106) {
                            z2 = true;
                        }
                        else {
                            switch(v12) {
                                case 98: {
                                    v15 = 1;
                                    v11 = 100;
                                    break alab1;
                                }
                                case 99: {
                                    v15 = 0;
                                    v11 = 99;
                                    break alab1;
                                }
                                case 100: {
                                    v15 = 0;
                                    v11 = 100;
                                    break alab1;
                                }
                                case 101: {
                                    if(v1 == 0 && v4 != 0) {
                                        v1 = 1;
                                    }
                                    else {
                                        if(v1 == 0 || v4 == 0) {
                                            v15 = 0;
                                            v4 = 1;
                                        }
                                        else {
                                            v1 = 0;
                                            v15 = 0;
                                            v4 = 0;
                                        }
                                        break alab1;
                                    }
                                    v15 = 0;
                                    v4 = 0;
                                    break alab1;
                                }
                                case 102: {
                                    if(z) {
                                        if(stringBuilder0.length() == 0) {
                                            stringBuilder0.append("]C1");
                                        }
                                        else {
                                            stringBuilder0.append('\u001D');
                                        }
                                    }
                                }
                            }
                        }
                        v15 = 0;
                    }
                    break;
                }
                default: {
                    goto label_103;
                }
            }
            if(v5 != 0) {
                v11 = v11 == 101 ? 100 : 101;
            }
            v5 = v15;
            v9 = v10;
            v10 = v13;
            v8 = v6;
            v6 = v12;
        }
        int v17 = ⁱˋ0.MTH5015(v10);
        if(!ⁱˋ0.MTH5005(v17, Math.min(ⁱˋ0.MTH5007(), (v17 - v9) / 2 + v17), false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        if((v2 - v7 * v8) % 103 != v8) {
            throw ChecksumException.getChecksumInstance();
        }
        int v18 = stringBuilder0.length();
        if(v18 == 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        if(v18 > 0 && z1) {
            stringBuilder0.delete((v11 == 99 ? v18 - 2 : v18 - 1), v18);
        }
        float f = ((float)(arr_v[1] + arr_v[0])) / 2.0f;
        int v19 = arrayList0.size();
        byte[] arr_b = new byte[v19];
        for(int v20 = 0; v20 < v19; ++v20) {
            arr_b[v20] = (byte)(((Byte)arrayList0.get(v20)));
        }
        return new CLS271(stringBuilder0.toString(), arr_b, new CLS268[]{new CLS268(f, ((float)v)), new CLS268(((float)v9) + ((float)(v10 - v9)) / 2.0f, ((float)v))}, BarcodeFormat.CODE_128);
    }
}

