// Decompiled by JEB v5.42.0.202606242140

package c.ᐧˎ;

import c.ˏـ.CLS439;
import c.ٴʽ.CLS258;
import c.ᐧᵎ.CLS268;
import c.ᐧᵎ.CLS271;
import c.ᴵʻ.CLS279;
import c.ⁱי.CLS338;
import c.ⁱי.CLS339;
import c.ⁱי.CLS340;
import c.ⁱי.CLS840;
import c.ﾞʾ.CLS365;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class CLS847 extends CLS840 {
    public final int[] FLD1037;
    public static final int[] FLD1038;
    public static final int[] FLD1039;
    public static final int[] FLD1040;
    public static final int[][] FLD1041;
    public static final int[][] FLD1042;
    public final List FLD1043;
    public boolean FLD1044;
    public static final int[][] FLD1045;
    public final List FLD1046;

    static {
        CLS847.FLD1040 = new int[]{7, 5, 4, 3, 1};
        CLS847.FLD1038 = new int[]{4, 20, 52, 104, 204};
        CLS847.FLD1039 = new int[]{0, 348, 0x56C, 0xB84, 0xF94};
        CLS847.FLD1041 = new int[][]{new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
        CLS847.FLD1042 = new int[][]{new int[]{1, 3, 9, 27, 81, 0x20, 0x60, 77}, new int[]{20, 60, 180, 0x76, 0x8F, 7, 21, 0x3F}, new int[]{0xBD, 0x91, 13, 39, 0x75, 140, 209, 205}, new int[]{0xC1, 0x9D, 49, 0x93, 19, 57, 0xAB, 91}, new int[]{62, 0xBA, 0x88, 0xC5, 0xA9, 85, 44, 0x84}, new int[]{0xB9, 0x85, 0xBC, 0x8E, 4, 12, 36, 108}, new int[]{0x71, 0x80, 0xAD, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 0x7B, 0x9E, 52, 0x9C}, new int[]{46, 0x8A, 203, 0xBB, 0x8B, 206, 0xC4, 0xA6}, new int[]{76, 17, 51, 0x99, 37, 0x6F, 0x7A, 0x9B}, new int[]{43, 0x81, 0xB0, 106, 107, 110, 0x77, 0x92}, new int[]{16, 0x30, 0x90, 10, 30, 90, 59, 0xB1}, new int[]{109, 0x74, 0x89, 200, 0xB2, 0x70, 0x7D, 0xA4}, new int[]{70, 210, 0xD0, 202, 0xB8, 130, 0xB3, 0x73}, new int[]{0x86, 0xBF, 0x97, 0x1F, 93, 68, 204, 190}, new int[]{0x94, 22, 66, 0xC6, 0xAC, 94, 71, 2}, new int[]{6, 18, 54, 0xA2, 0x40, 0xC0, 0x9A, 40}, new int[]{120, 0x95, 25, 75, 14, 42, 0x7E, 0xA7}, new int[]{0x4F, 26, 78, 23, 69, 0xCF, 0xC7, 0xAF}, new int[]{103, 98, 83, 38, 0x72, 0x83, 0xB6, 0x7C}, new int[]{0xA1, 61, 0xB7, 0x7F, 170, 88, 53, 0x9F}, new int[]{55, 0xA5, 73, 8, 24, 72, 5, 15}, new int[]{45, 0x87, 0xC2, 0xA0, 58, 0xAE, 100, 89}};
        CLS847.FLD1045 = new int[][]{new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    }

    public CLS847() {
        this.FLD1046 = new ArrayList(11);
        this.FLD1043 = new ArrayList();
        this.FLD1037 = new int[2];
    }

    public final void MTH3417(CLS365 ⁱˋ0, List list0, int v) {
        int[] arr_v = ((CLS840)this).MTH4806();
        arr_v[0] = 0;
        arr_v[1] = 0;
        arr_v[2] = 0;
        arr_v[3] = 0;
        int v1 = ⁱˋ0.MTH5007();
        if(v < 0) {
            v = list0.isEmpty() ? 0 : ((CLS264)list0.get(list0.size() - 1)).MTH3445().MTH4787()[1];
        }
        int v2 = list0.size() % 2 == 0 ? 0 : 1;
        if(this.FLD1044) {
            v2 ^= 1;
        }
        int v3 = 0;
        while(v < v1) {
            v3 = !ⁱˋ0.MTH5018(v);
            if(v3 == 0) {
                break;
            }
            ++v;
        }
        int v4 = v3;
        int v5 = 0;
        int v6 = v;
        while(v < v1) {
            if((ⁱˋ0.MTH5018(v) ^ v4) == 0) {
                if(v5 == 3) {
                    if(v2 != 0) {
                        CLS847.MTH3429(arr_v);
                    }
                    if(CLS840.MTH4811(arr_v)) {
                        this.FLD1037[0] = v6;
                        this.FLD1037[1] = v;
                        return;
                    }
                    if(v2 != 0) {
                        CLS847.MTH3429(arr_v);
                    }
                    v6 += arr_v[0] + arr_v[1];
                    arr_v[0] = arr_v[2];
                    arr_v[1] = arr_v[3];
                    arr_v[2] = 0;
                    arr_v[3] = 0;
                    v5 = 2;
                }
                else {
                    ++v5;
                }
                arr_v[v5] = 1;
                v4 ^= 1;
            }
            else {
                ++arr_v[v5];
            }
            ++v;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final void MTH3418(int v, boolean z) {
        boolean z1 = false;
        int v1 = 0;
        boolean z2 = false;
        while(v1 < this.FLD1043.size()) {
            CLS262 ʾʻ0 = (CLS262)this.FLD1043.get(v1);
            if(ʾʻ0.MTH3414() > v) {
                z1 = ʾʻ0.MTH3412(this.FLD1046);
                break;
            }
            z2 = ʾʻ0.MTH3412(this.FLD1046);
            ++v1;
        }
        if(z1 || z2 || CLS847.MTH3428(this.FLD1046, this.FLD1043)) {
            return;
        }
        CLS262 ʾʻ1 = new CLS262(this.FLD1046, v, z);
        this.FLD1043.add(v1, ʾʻ1);
        CLS847.MTH3426(this.FLD1046, this.FLD1043);
    }

    public List MTH3419(int v, CLS365 ⁱˋ0) {
        try {
            while(true) {
                CLS264 ﾞⁱ0 = this.MTH3432(ⁱˋ0, this.FLD1046, v);
                this.FLD1046.add(ﾞⁱ0);
            }
        }
        catch(NotFoundException notFoundException0) {
            if(this.FLD1046.isEmpty()) {
                throw notFoundException0;
            }
            if(this.MTH3431()) {
                return this.FLD1046;
            }
            this.MTH3418(v, false);
            if(!this.FLD1043.isEmpty() != 0) {
                List list0 = this.MTH3425(false);
                if(list0 != null) {
                    return list0;
                }
                List list1 = this.MTH3425(true);
                if(list1 != null) {
                    return list1;
                }
            }
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public final CLS338 MTH3420(CLS365 ⁱˋ0, int v, boolean z) {
        int v4;
        int v3;
        int v2;
        if(z) {
            int v1;
            for(v1 = this.FLD1037[0] - 1; v1 >= 0 && !ⁱˋ0.MTH5018(v1); --v1) {
            }
            v2 = this.FLD1037[0] - (v1 + 1);
            v3 = this.FLD1037[1];
            v4 = v1 + 1;
        }
        else {
            int v5 = this.FLD1037[0];
            int v6 = ⁱˋ0.MTH5015(this.FLD1037[1] + 1);
            v3 = v6;
            v4 = v5;
            v2 = v6 - this.FLD1037[1];
        }
        int[] arr_v = ((CLS840)this).MTH4806();
        System.arraycopy(arr_v, 0, arr_v, 1, arr_v.length - 1);
        arr_v[0] = v2;
        try {
            return new CLS338(CLS840.MTH4814(arr_v, CLS847.FLD1041), new int[]{v4, v3}, v4, v3, v);
        }
        catch(NotFoundException unused_ex) {
            return null;
        }
    }

    // 去混淆评级： 低(20)
    public static int MTH3421(CLS365 ⁱˋ0, int v) {
        return ⁱˋ0.MTH5018(v) ? ⁱˋ0.MTH5002(ⁱˋ0.MTH5015(v)) : ⁱˋ0.MTH5015(ⁱˋ0.MTH5002(v));
    }

    public static boolean MTH3422(List list0) {
        int[][] arr2_v = CLS847.FLD1045;
        int v = 0;
        while(v < arr2_v.length) {
            int[] arr_v = arr2_v[v];
            if(list0.size() <= arr_v.length) {
                int v1 = 0;
                while(true) {
                    boolean z = true;
                    if(v1 < list0.size()) {
                        if(((CLS264)list0.get(v1)).MTH3445().MTH4785() == arr_v[v1]) {
                            ++v1;
                            continue;
                        }
                        else {
                            z = false;
                        }
                    }
                    break;
                }
                if(z) {
                    return true;
                }
            }
            ++v;
        }
        return false;
    }

    public static CLS271 MTH3423(List list0) {
        String s = CLS279.MTH3574(CLS263.MTH3435(list0)).MTH3573();
        CLS268[] arr_ᵔʼ = ((CLS264)list0.get(0)).MTH3445().MTH4786();
        CLS268[] arr_ᵔʼ1 = ((CLS264)list0.get(list0.size() - 1)).MTH3445().MTH4786();
        return new CLS271(s, null, new CLS268[]{arr_ᵔʼ[0], arr_ᵔʼ[1], arr_ᵔʼ1[0], arr_ᵔʼ1[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    public final List MTH3424(List list0, int v) {
        while(v < this.FLD1043.size()) {
            CLS262 ʾʻ0 = (CLS262)this.FLD1043.get(v);
            this.FLD1046.clear();
            for(Object object0: list0) {
                this.FLD1046.addAll(((CLS262)object0).MTH3413());
            }
            this.FLD1046.addAll(ʾʻ0.MTH3413());
            if(CLS847.MTH3422(this.FLD1046)) {
                if(!this.MTH3431()) {
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.addAll(list0);
                    arrayList0.add(ʾʻ0);
                    try {
                        return this.MTH3424(arrayList0, v + 1);
                    }
                    catch(NotFoundException unused_ex) {
                        goto label_16;
                    }
                }
                return this.FLD1046;
            }
        label_16:
            ++v;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final List MTH3425(boolean z) {
        List list0 = null;
        if(this.FLD1043.size() > 25) {
            this.FLD1043.clear();
            return null;
        }
        this.FLD1046.clear();
        if(z) {
            Collections.reverse(this.FLD1043);
        }
        try {
            list0 = this.MTH3424(new ArrayList(), 0);
        }
        catch(NotFoundException unused_ex) {
        }
        if(z) {
            Collections.reverse(this.FLD1043);
        }
        return list0;
    }

    public static void MTH3426(List list0, List list1) {
        Iterator iterator0 = list1.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            CLS262 ʾʻ0 = (CLS262)object0;
            if(ʾʻ0.MTH3413().size() != list0.size()) {
                Iterator iterator1 = ʾʻ0.MTH3413().iterator();
                while(true) {
                    boolean z = true;
                    if(!iterator1.hasNext()) {
                        break;
                    }
                    Object object1 = iterator1.next();
                    CLS264 ﾞⁱ0 = (CLS264)object1;
                    for(Object object2: list0) {
                        if(!ﾞⁱ0.equals(((CLS264)object2))) {
                            continue;
                        }
                        goto label_16;
                    }
                    z = false;
                label_16:
                    if(z) {
                        continue;
                    }
                    else {
                        z = false;
                        break;
                    }
                    goto label_21;
                }
                if(z) {
                label_21:
                    iterator0.remove();
                }
            }
        }
    }

    public final void MTH3427(int v) {
        boolean z3;
        boolean z2;
        boolean z1;
        int v4;
        int v1 = CLS258.MTH3384(((CLS840)this).MTH4807());
        int v2 = CLS258.MTH3384(((CLS840)this).MTH4813());
        int v3 = 1;
        boolean z = false;
        if(v1 > 13) {
            v4 = 0;
            z1 = true;
        }
        else {
            v4 = v1 >= 4 ? 0 : 1;
            z1 = false;
        }
        if(v2 > 13) {
            z2 = false;
            z3 = true;
        }
        else {
            z2 = v2 < 4;
            z3 = false;
        }
        int v5 = v1 + v2 - v;
        boolean z4 = (v1 & 1) == 1;
        if((v2 & 1) == 0) {
            z = true;
        }
        if(v5 == 1) {
            if(z4) {
                if(z) {
                    throw NotFoundException.getNotFoundInstance();
                }
                v3 = v4;
                z1 = true;
                goto label_52;
            }
            if(!z) {
                throw NotFoundException.getNotFoundInstance();
            }
            v3 = v4;
            z3 = true;
        }
        else {
            switch(v5) {
                case -1: {
                    goto label_32;
                }
                case 0: {
                    goto label_40;
                }
            }
            throw NotFoundException.getNotFoundInstance();
        label_32:
            if(!z4) {
                if(!z) {
                    throw NotFoundException.getNotFoundInstance();
                }
                v3 = v4;
                z2 = true;
                goto label_52;
            label_40:
                if(z4) {
                    if(!z) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if(v1 >= v2) {
                        v3 = v4;
                        z2 = true;
                        z1 = true;
                        goto label_52;
                    }
                    z3 = true;
                    goto label_52;
                }
                if(z) {
                    throw NotFoundException.getNotFoundInstance();
                }
                v3 = v4;
            }
            else if(z) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    label_52:
        if(v3 != 0) {
            if(z1) {
                throw NotFoundException.getNotFoundInstance();
            }
            CLS840.MTH4810(((CLS840)this).MTH4807(), ((CLS840)this).MTH4808());
        }
        if(z1) {
            CLS840.MTH4815(((CLS840)this).MTH4807(), ((CLS840)this).MTH4808());
        }
        if(z2) {
            if(z3) {
                throw NotFoundException.getNotFoundInstance();
            }
            CLS840.MTH4810(((CLS840)this).MTH4813(), ((CLS840)this).MTH4808());
        }
        if(z3) {
            CLS840.MTH4815(((CLS840)this).MTH4813(), ((CLS840)this).MTH4809());
        }
    }

    public static boolean MTH3428(Iterable iterable0, Iterable iterable1) {
        Iterator iterator0 = iterable1.iterator();
        while(true) {
            boolean z = false;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            CLS262 ʾʻ0 = (CLS262)object0;
            Iterator iterator1 = iterable0.iterator();
            while(iterator1.hasNext()) {
                boolean z1 = false;
                Object object1 = iterator1.next();
                CLS264 ﾞⁱ0 = (CLS264)object1;
                for(Object object2: ʾʻ0.MTH3413()) {
                    if(ﾞⁱ0.equals(((CLS264)object2))) {
                        z1 = true;
                        break;
                    }
                }
                if(z1) {
                    continue;
                }
                goto label_18;
            }
            z = true;
        label_18:
            if(z) {
                return true;
            }
        }
        return false;
    }

    public static void MTH3429(int[] arr_v) {
        for(int v = 0; v < arr_v.length / 2; ++v) {
            int v1 = arr_v[v];
            int v2 = arr_v.length - v - 1;
            arr_v[v] = arr_v[v2];
            arr_v[v2] = v1;
        }
    }

    public CLS340 MTH3430(CLS365 ⁱˋ0, CLS338 ʾʻ0, boolean z, boolean z1) {
        int[] arr_v = ((CLS840)this).MTH4812();
        arr_v[0] = 0;
        arr_v[1] = 0;
        arr_v[2] = 0;
        arr_v[3] = 0;
        arr_v[4] = 0;
        arr_v[5] = 0;
        arr_v[6] = 0;
        arr_v[7] = 0;
        int[] arr_v1 = ʾʻ0.MTH4787();
        if(z1) {
            CLS439.MTH1680(ⁱˋ0, arr_v1[0], arr_v);
        }
        else {
            CLS439.MTH1678(ⁱˋ0, arr_v1[1], arr_v);
            int v = arr_v.length - 1;
            int v1 = 0;
            while(v1 < v) {
                int v2 = arr_v[v1];
                arr_v[v1] = arr_v[v];
                arr_v[v] = v2;
                ++v1;
                --v;
            }
        }
        float f = ((float)CLS258.MTH3384(arr_v)) / 17.0f;
        float f1 = ((float)(ʾʻ0.MTH4787()[1] - ʾʻ0.MTH4787()[0])) / 15.0f;
        if(Math.abs(f - f1) / f1 > 0.3f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] arr_v2 = ((CLS840)this).MTH4807();
        int[] arr_v3 = ((CLS840)this).MTH4813();
        float[] arr_f = ((CLS840)this).MTH4808();
        float[] arr_f1 = ((CLS840)this).MTH4809();
        for(int v3 = 0; v3 < arr_v.length; ++v3) {
            float f2 = ((float)arr_v[v3]) * 1.0f / f;
            int v4 = (int)(f2 + 0.5f);
            if(v4 <= 0) {
                if(f2 < 0.3f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                v4 = 1;
            }
            else if(v4 > 8) {
                if(f2 > 8.7f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                v4 = 8;
            }
            if((v3 & 1) == 0) {
                arr_v2[v3 / 2] = v4;
                arr_f[v3 / 2] = f2 - ((float)v4);
            }
            else {
                arr_v3[v3 / 2] = v4;
                arr_f1[v3 / 2] = f2 - ((float)v4);
            }
        }
        this.MTH3427(17);
        int v5 = ʾʻ0.MTH4785() * 4 + (z ? 0 : 2) + !z1 - 1;
        int v6 = arr_v2.length - 1;
        int v7 = 0;
        int v8 = 0;
        while(v6 >= 0) {
            if(CLS847.MTH3433(ʾʻ0, z, z1)) {
                v7 += arr_v2[v6] * CLS847.FLD1042[v5][v6 * 2];
            }
            v8 += arr_v2[v6];
            --v6;
        }
        int v9 = arr_v3.length - 1;
        int v10 = 0;
        while(v9 >= 0) {
            if(CLS847.MTH3433(ʾʻ0, z, z1)) {
                v10 += arr_v3[v9] * CLS847.FLD1042[v5][v9 * 2 + 1];
            }
            --v9;
        }
        if((v8 & 1) != 0 || v8 > 13 || v8 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v11 = (13 - v8) / 2;
        int v12 = 9 - CLS847.FLD1040[v11];
        int v13 = CLS339.MTH4804(arr_v2, CLS847.FLD1040[v11], true);
        int v14 = CLS339.MTH4804(arr_v3, v12, false);
        return new CLS340(v13 * CLS847.FLD1038[v11] + v14 + CLS847.FLD1039[v11], v7 + v10);
    }

    public final boolean MTH3431() {
        CLS264 ﾞⁱ0 = (CLS264)this.FLD1046.get(0);
        CLS340 ﾞⁱ1 = ﾞⁱ0.MTH3440();
        CLS340 ﾞⁱ2 = ﾞⁱ0.MTH3442();
        if(ﾞⁱ2 == null) {
            return false;
        }
        int v = ﾞⁱ2.MTH4820();
        int v1 = 2;
        for(int v2 = 1; v2 < this.FLD1046.size(); ++v2) {
            CLS264 ﾞⁱ3 = (CLS264)this.FLD1046.get(v2);
            v += ﾞⁱ3.MTH3440().MTH4820();
            ++v1;
            CLS340 ﾞⁱ4 = ﾞⁱ3.MTH3442();
            if(ﾞⁱ4 != null) {
                v += ﾞⁱ4.MTH4820();
                ++v1;
            }
        }
        return (v1 - 4) * 0xD3 + v % 0xD3 == ﾞⁱ1.MTH4821();
    }

    public CLS264 MTH3432(CLS365 ⁱˋ0, List list0, int v) {
        CLS340 ﾞⁱ1;
        CLS338 ʾʻ0;
        int v1 = list0.size() % 2 == 0 ? 1 : 0;
        if(this.FLD1044) {
            v1 ^= 1;
        }
        int v2 = -1;
        boolean z = true;
        do {
            this.MTH3417(ⁱˋ0, list0, v2);
            ʾʻ0 = this.MTH3420(ⁱˋ0, v, ((boolean)v1));
            if(ʾʻ0 == null) {
                v2 = CLS847.MTH3421(ⁱˋ0, this.FLD1037[0]);
            }
            else {
                z = false;
            }
        }
        while(z);
        CLS340 ﾞⁱ0 = this.MTH3430(ⁱˋ0, ʾʻ0, ((boolean)v1), true);
        if(!list0.isEmpty() && ((CLS264)list0.get(list0.size() - 1)).MTH3443()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            ﾞⁱ1 = null;
            ﾞⁱ1 = this.MTH3430(ⁱˋ0, ʾʻ0, ((boolean)v1), false);
        }
        catch(NotFoundException unused_ex) {
        }
        return new CLS264(ﾞⁱ0, ﾞⁱ1, ʾʻ0, true);
    }

    // 去混淆评级： 低(20)
    public static boolean MTH3433(CLS338 ʾʻ0, boolean z, boolean z1) {
        return ʾʻ0.MTH4785() != 0 || !z || !z1;
    }

    @Override  // c.ˏـ.CLS439
    public CLS271 MTH1682(int v, CLS365 ⁱˋ0, Map map0) {
        this.FLD1046.clear();
        this.FLD1044 = false;
        try {
            return CLS847.MTH3423(this.MTH3419(v, ⁱˋ0));
        }
        catch(NotFoundException unused_ex) {
            this.FLD1046.clear();
            this.FLD1044 = true;
            return CLS847.MTH3423(this.MTH3419(v, ⁱˋ0));
        }
    }
}

