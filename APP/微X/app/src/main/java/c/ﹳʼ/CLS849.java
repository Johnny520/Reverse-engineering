// Decompiled by JEB v5.42.0.202606242140

package c.ﹳʼ;

import c.ʻᵔ.CLS21;
import c.ʻᵔ.CLS22;
import c.ʻᵔ.CLS23;
import c.ʻᵔ.CLS826;
import c.ʽˉ.CLS41;
import c.ˎʼ.CLS114;
import c.ˎˊ.CLS118;
import c.ᐧـ.CLS807;
import c.ﾞﹶ.CLS379;
import c.ﾞﹶ.CLS380;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class CLS849 extends CLS826 {
    public static final int[] FLD1587;
    public static final int[][] FLD1588;
    public static final int[] FLD1589;
    public static final int[][] FLD1590;
    public final int[] FLD1591;
    public static final int[][] FLD1592;
    public boolean FLD1593;
    public static final int[] FLD1594;
    public final List FLD1595;
    public final List FLD1596;

    static {
        CLS849.FLD1589 = new int[]{7, 5, 4, 3, 1};
        CLS849.FLD1587 = new int[]{4, 20, 52, 104, 204};
        CLS849.FLD1594 = new int[]{0, 348, 0x56C, 0xB84, 0xF94};
        CLS849.FLD1590 = new int[][]{new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
        CLS849.FLD1588 = new int[][]{new int[]{1, 3, 9, 27, 81, 0x20, 0x60, 77}, new int[]{20, 60, 180, 0x76, 0x8F, 7, 21, 0x3F}, new int[]{0xBD, 0x91, 13, 39, 0x75, 140, 209, 205}, new int[]{0xC1, 0x9D, 49, 0x93, 19, 57, 0xAB, 91}, new int[]{62, 0xBA, 0x88, 0xC5, 0xA9, 85, 44, 0x84}, new int[]{0xB9, 0x85, 0xBC, 0x8E, 4, 12, 36, 108}, new int[]{0x71, 0x80, 0xAD, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 0x7B, 0x9E, 52, 0x9C}, new int[]{46, 0x8A, 203, 0xBB, 0x8B, 206, 0xC4, 0xA6}, new int[]{76, 17, 51, 0x99, 37, 0x6F, 0x7A, 0x9B}, new int[]{43, 0x81, 0xB0, 106, 107, 110, 0x77, 0x92}, new int[]{16, 0x30, 0x90, 10, 30, 90, 59, 0xB1}, new int[]{109, 0x74, 0x89, 200, 0xB2, 0x70, 0x7D, 0xA4}, new int[]{70, 210, 0xD0, 202, 0xB8, 130, 0xB3, 0x73}, new int[]{0x86, 0xBF, 0x97, 0x1F, 93, 68, 204, 190}, new int[]{0x94, 22, 66, 0xC6, 0xAC, 94, 71, 2}, new int[]{6, 18, 54, 0xA2, 0x40, 0xC0, 0x9A, 40}, new int[]{120, 0x95, 25, 75, 14, 42, 0x7E, 0xA7}, new int[]{0x4F, 26, 78, 23, 69, 0xCF, 0xC7, 0xAF}, new int[]{103, 98, 83, 38, 0x72, 0x83, 0xB6, 0x7C}, new int[]{0xA1, 61, 0xB7, 0x7F, 170, 88, 53, 0x9F}, new int[]{55, 0xA5, 73, 8, 24, 72, 5, 15}, new int[]{45, 0x87, 0xC2, 0xA0, 58, 0xAE, 100, 89}};
        CLS849.FLD1592 = new int[][]{new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    }

    public CLS849() {
        this.FLD1595 = new ArrayList(11);
        this.FLD1596 = new ArrayList();
        this.FLD1591 = new int[2];
    }

    public CLS359 MTH4941(CLS118 ˆٴ0, List list0, int v) {
        CLS21 ʻᵢ1;
        CLS22 ـᵎ0;
        int v1 = list0.size() % 2 == 0 ? 1 : 0;
        if(this.FLD1593) {
            v1 ^= 1;
        }
        int v2 = -1;
        boolean z = true;
        do {
            this.MTH4955(ˆٴ0, list0, v2);
            ـᵎ0 = this.MTH4956(ˆٴ0, v, ((boolean)v1));
            if(ـᵎ0 == null) {
                v2 = CLS849.MTH4946(ˆٴ0, this.FLD1591[0]);
            }
            else {
                z = false;
            }
        }
        while(z);
        CLS21 ʻᵢ0 = this.MTH4958(ˆٴ0, ـᵎ0, ((boolean)v1), true);
        if(!list0.isEmpty() && ((CLS359)list0.get(list0.size() - 1)).MTH4929()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            ʻᵢ1 = null;
            ʻᵢ1 = this.MTH4958(ˆٴ0, ـᵎ0, ((boolean)v1), false);
        }
        catch(NotFoundException unused_ex) {
        }
        return new CLS359(ʻᵢ0, ʻᵢ1, ـᵎ0, true);
    }

    @Override  // c.ᐧـ.CLS807
    public CLS379 MTH4611(int v, CLS118 ˆٴ0, Map map0) {
        this.FLD1595.clear();
        this.FLD1593 = false;
        try {
            return CLS849.MTH4947(this.MTH4953(v, ˆٴ0));
        }
        catch(NotFoundException unused_ex) {
            this.FLD1595.clear();
            this.FLD1593 = true;
            return CLS849.MTH4947(this.MTH4953(v, ˆٴ0));
        }
    }

    public static boolean MTH4943(List list0) {
        int[][] arr2_v = CLS849.FLD1592;
        int v = 0;
        while(v < arr2_v.length) {
            int[] arr_v = arr2_v[v];
            if(list0.size() <= arr_v.length) {
                int v1 = 0;
                while(true) {
                    boolean z = true;
                    if(v1 < list0.size()) {
                        if(((CLS359)list0.get(v1)).MTH4925().MTH789() == arr_v[v1]) {
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

    public static void MTH4944(List list0, List list1) {
        Iterator iterator0 = list1.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            CLS361 ـᵎ0 = (CLS361)object0;
            if(ـᵎ0.MTH4937().size() != list0.size()) {
                Iterator iterator1 = ـᵎ0.MTH4937().iterator();
                while(true) {
                    boolean z = true;
                    if(!iterator1.hasNext()) {
                        break;
                    }
                    Object object1 = iterator1.next();
                    CLS359 ʻᵢ0 = (CLS359)object1;
                    for(Object object2: list0) {
                        if(!ʻᵢ0.equals(((CLS359)object2))) {
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

    public static void MTH4945(int[] arr_v) {
        for(int v = 0; v < arr_v.length / 2; ++v) {
            int v1 = arr_v[v];
            int v2 = arr_v.length - v - 1;
            arr_v[v] = arr_v[v2];
            arr_v[v2] = v1;
        }
    }

    // 去混淆评级： 低(20)
    public static int MTH4946(CLS118 ˆٴ0, int v) {
        return ˆٴ0.MTH2357(v) ? ˆٴ0.MTH2349(ˆٴ0.MTH2352(v)) : ˆٴ0.MTH2352(ˆٴ0.MTH2349(v));
    }

    public static CLS379 MTH4947(List list0) {
        String s = CLS41.MTH942(CLS360.MTH4931(list0)).MTH944();
        CLS380[] arr_ٴⁱ = ((CLS359)list0.get(0)).MTH4925().MTH788();
        CLS380[] arr_ٴⁱ1 = ((CLS359)list0.get(list0.size() - 1)).MTH4925().MTH788();
        return new CLS379(s, null, new CLS380[]{arr_ٴⁱ[0], arr_ٴⁱ[1], arr_ٴⁱ1[0], arr_ٴⁱ1[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    public static boolean MTH4948(Iterable iterable0, Iterable iterable1) {
        Iterator iterator0 = iterable1.iterator();
        while(true) {
            boolean z = false;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            CLS361 ـᵎ0 = (CLS361)object0;
            Iterator iterator1 = iterable0.iterator();
            while(iterator1.hasNext()) {
                boolean z1 = false;
                Object object1 = iterator1.next();
                CLS359 ʻᵢ0 = (CLS359)object1;
                for(Object object2: ـᵎ0.MTH4937()) {
                    if(ʻᵢ0.equals(((CLS359)object2))) {
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

    // 去混淆评级： 低(20)
    public static boolean MTH4949(CLS22 ـᵎ0, boolean z, boolean z1) {
        return ـᵎ0.MTH789() != 0 || !z || !z1;
    }

    public final void MTH4950(int v) {
        boolean z3;
        boolean z2;
        boolean z1;
        int v4;
        int v1 = CLS114.MTH2298(((CLS826)this).MTH774());
        int v2 = CLS114.MTH2298(((CLS826)this).MTH780());
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
            CLS826.MTH777(((CLS826)this).MTH774(), ((CLS826)this).MTH781());
        }
        if(z1) {
            CLS826.MTH782(((CLS826)this).MTH774(), ((CLS826)this).MTH781());
        }
        if(z2) {
            if(z3) {
                throw NotFoundException.getNotFoundInstance();
            }
            CLS826.MTH777(((CLS826)this).MTH780(), ((CLS826)this).MTH781());
        }
        if(z3) {
            CLS826.MTH782(((CLS826)this).MTH780(), ((CLS826)this).MTH776());
        }
    }

    public final List MTH4951(List list0, int v) {
        while(v < this.FLD1596.size()) {
            CLS361 ـᵎ0 = (CLS361)this.FLD1596.get(v);
            this.FLD1595.clear();
            for(Object object0: list0) {
                this.FLD1595.addAll(((CLS361)object0).MTH4937());
            }
            this.FLD1595.addAll(ـᵎ0.MTH4937());
            if(CLS849.MTH4943(this.FLD1595)) {
                if(!this.MTH4954()) {
                    ArrayList arrayList0 = new ArrayList();
                    arrayList0.addAll(list0);
                    arrayList0.add(ـᵎ0);
                    try {
                        return this.MTH4951(arrayList0, v + 1);
                    }
                    catch(NotFoundException unused_ex) {
                        goto label_16;
                    }
                }
                return this.FLD1595;
            }
        label_16:
            ++v;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public final List MTH4952(boolean z) {
        List list0 = null;
        if(this.FLD1596.size() > 25) {
            this.FLD1596.clear();
            return null;
        }
        this.FLD1595.clear();
        if(z) {
            Collections.reverse(this.FLD1596);
        }
        try {
            list0 = this.MTH4951(new ArrayList(), 0);
        }
        catch(NotFoundException unused_ex) {
        }
        if(z) {
            Collections.reverse(this.FLD1596);
        }
        return list0;
    }

    public List MTH4953(int v, CLS118 ˆٴ0) {
        try {
            while(true) {
                CLS359 ʻᵢ0 = this.MTH4941(ˆٴ0, this.FLD1595, v);
                this.FLD1595.add(ʻᵢ0);
            }
        }
        catch(NotFoundException notFoundException0) {
            if(this.FLD1595.isEmpty()) {
                throw notFoundException0;
            }
            if(this.MTH4954()) {
                return this.FLD1595;
            }
            this.MTH4957(v, false);
            if(!this.FLD1596.isEmpty() != 0) {
                List list0 = this.MTH4952(false);
                if(list0 != null) {
                    return list0;
                }
                List list1 = this.MTH4952(true);
                if(list1 != null) {
                    return list1;
                }
            }
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public final boolean MTH4954() {
        CLS359 ʻᵢ0 = (CLS359)this.FLD1595.get(0);
        CLS21 ʻᵢ1 = ʻᵢ0.MTH4928();
        CLS21 ʻᵢ2 = ʻᵢ0.MTH4930();
        if(ʻᵢ2 == null) {
            return false;
        }
        int v = ʻᵢ2.MTH761();
        int v1 = 2;
        for(int v2 = 1; v2 < this.FLD1595.size(); ++v2) {
            CLS359 ʻᵢ3 = (CLS359)this.FLD1595.get(v2);
            v += ʻᵢ3.MTH4928().MTH761();
            ++v1;
            CLS21 ʻᵢ4 = ʻᵢ3.MTH4930();
            if(ʻᵢ4 != null) {
                v += ʻᵢ4.MTH761();
                ++v1;
            }
        }
        return (v1 - 4) * 0xD3 + v % 0xD3 == ʻᵢ1.MTH760();
    }

    public final void MTH4955(CLS118 ˆٴ0, List list0, int v) {
        int[] arr_v = ((CLS826)this).MTH778();
        arr_v[0] = 0;
        arr_v[1] = 0;
        arr_v[2] = 0;
        arr_v[3] = 0;
        int v1 = ˆٴ0.MTH2347();
        if(v < 0) {
            v = list0.isEmpty() ? 0 : ((CLS359)list0.get(list0.size() - 1)).MTH4925().MTH787()[1];
        }
        int v2 = list0.size() % 2 == 0 ? 0 : 1;
        if(this.FLD1593) {
            v2 ^= 1;
        }
        int v3 = 0;
        while(v < v1) {
            v3 = !ˆٴ0.MTH2357(v);
            if(v3 == 0) {
                break;
            }
            ++v;
        }
        int v4 = v3;
        int v5 = 0;
        int v6 = v;
        while(v < v1) {
            if((ˆٴ0.MTH2357(v) ^ v4) == 0) {
                if(v5 == 3) {
                    if(v2 != 0) {
                        CLS849.MTH4945(arr_v);
                    }
                    if(CLS826.MTH775(arr_v)) {
                        this.FLD1591[0] = v6;
                        this.FLD1591[1] = v;
                        return;
                    }
                    if(v2 != 0) {
                        CLS849.MTH4945(arr_v);
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

    public final CLS22 MTH4956(CLS118 ˆٴ0, int v, boolean z) {
        int v4;
        int v3;
        int v2;
        if(z) {
            int v1;
            for(v1 = this.FLD1591[0] - 1; v1 >= 0 && !ˆٴ0.MTH2357(v1); --v1) {
            }
            v2 = this.FLD1591[0] - (v1 + 1);
            v3 = this.FLD1591[1];
            v4 = v1 + 1;
        }
        else {
            int v5 = this.FLD1591[0];
            int v6 = ˆٴ0.MTH2352(this.FLD1591[1] + 1);
            v3 = v6;
            v4 = v5;
            v2 = v6 - this.FLD1591[1];
        }
        int[] arr_v = ((CLS826)this).MTH778();
        System.arraycopy(arr_v, 0, arr_v, 1, arr_v.length - 1);
        arr_v[0] = v2;
        try {
            return new CLS22(CLS826.MTH779(arr_v, CLS849.FLD1590), new int[]{v4, v3}, v4, v3, v);
        }
        catch(NotFoundException unused_ex) {
            return null;
        }
    }

    public final void MTH4957(int v, boolean z) {
        boolean z1 = false;
        int v1 = 0;
        boolean z2 = false;
        while(v1 < this.FLD1596.size()) {
            CLS361 ـᵎ0 = (CLS361)this.FLD1596.get(v1);
            if(ـᵎ0.MTH4936() > v) {
                z1 = ـᵎ0.MTH4938(this.FLD1595);
                break;
            }
            z2 = ـᵎ0.MTH4938(this.FLD1595);
            ++v1;
        }
        if(z1 || z2 || CLS849.MTH4948(this.FLD1595, this.FLD1596)) {
            return;
        }
        CLS361 ـᵎ1 = new CLS361(this.FLD1595, v, z);
        this.FLD1596.add(v1, ـᵎ1);
        CLS849.MTH4944(this.FLD1595, this.FLD1596);
    }

    public CLS21 MTH4958(CLS118 ˆٴ0, CLS22 ـᵎ0, boolean z, boolean z1) {
        int[] arr_v = ((CLS826)this).MTH783();
        arr_v[0] = 0;
        arr_v[1] = 0;
        arr_v[2] = 0;
        arr_v[3] = 0;
        arr_v[4] = 0;
        arr_v[5] = 0;
        arr_v[6] = 0;
        arr_v[7] = 0;
        int[] arr_v1 = ـᵎ0.MTH787();
        if(z1) {
            CLS807.MTH4615(ˆٴ0, arr_v1[0], arr_v);
        }
        else {
            CLS807.MTH4612(ˆٴ0, arr_v1[1], arr_v);
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
        float f = ((float)CLS114.MTH2298(arr_v)) / 17.0f;
        float f1 = ((float)(ـᵎ0.MTH787()[1] - ـᵎ0.MTH787()[0])) / 15.0f;
        if(Math.abs(f - f1) / f1 > 0.3f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] arr_v2 = ((CLS826)this).MTH774();
        int[] arr_v3 = ((CLS826)this).MTH780();
        float[] arr_f = ((CLS826)this).MTH781();
        float[] arr_f1 = ((CLS826)this).MTH776();
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
        this.MTH4950(17);
        int v5 = ـᵎ0.MTH789() * 4 + (z ? 0 : 2) + !z1 - 1;
        int v6 = arr_v2.length - 1;
        int v7 = 0;
        int v8 = 0;
        while(v6 >= 0) {
            if(CLS849.MTH4949(ـᵎ0, z, z1)) {
                v7 += arr_v2[v6] * CLS849.FLD1588[v5][v6 * 2];
            }
            v8 += arr_v2[v6];
            --v6;
        }
        int v9 = arr_v3.length - 1;
        int v10 = 0;
        while(v9 >= 0) {
            if(CLS849.MTH4949(ـᵎ0, z, z1)) {
                v10 += arr_v3[v9] * CLS849.FLD1588[v5][v9 * 2 + 1];
            }
            --v9;
        }
        if((v8 & 1) != 0 || v8 > 13 || v8 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int v11 = (13 - v8) / 2;
        int v12 = 9 - CLS849.FLD1589[v11];
        int v13 = CLS23.MTH790(arr_v2, CLS849.FLD1589[v11], true);
        int v14 = CLS23.MTH790(arr_v3, v12, false);
        return new CLS21(v13 * CLS849.FLD1587[v11] + v14 + CLS849.FLD1594[v11], v7 + v10);
    }
}

