package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3562 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3562 f8649 = new C3562(Integer[].class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8648 = AbstractC3693.m6334("[Integer");

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (!abstractC3732.mo6679()) {
            if (abstractC3732.mo6701()) {
                Integer[] numArr = new Integer[16];
                int i = 0;
                while (!abstractC3732.mo6702()) {
                    if (abstractC3732.mo6725()) {
                        C1123.m1410(abstractC3732.mo6730("input end"));
                        return null;
                    }
                    int i2 = i + 1;
                    if (i2 - numArr.length > 0) {
                        int length = numArr.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        numArr = (Integer[]) Arrays.copyOf(numArr, i3);
                    }
                    numArr[i] = abstractC3732.mo6773();
                    i = i2;
                }
                abstractC3732.mo6705();
                return Arrays.copyOf(numArr, i);
            }
            if (!abstractC3732.mo6739()) {
                if (abstractC3732.mo6738()) {
                    return new Integer[]{abstractC3732.mo6773()};
                }
                C1123.m1410(abstractC3732.mo6730("TODO"));
                return null;
            }
            String strMo6744 = abstractC3732.mo6744();
            if (!strMo6744.isEmpty()) {
                C1123.m1410(abstractC3732.mo6730("not support input ".concat(strMo6744)));
                return null;
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo6029(Collection collection, long j) {
        Integer[] numArr = new Integer[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            Integer numValueOf = null;
            if (obj != null) {
                if (obj instanceof Number) {
                    numValueOf = Integer.valueOf(((Number) obj).intValue());
                } else {
                    Function functionM6191 = AbstractC3766.m6947().m6191(obj.getClass(), Integer.class);
                    if (functionM6191 == null) {
                        C1123.m1410(AbstractC3275.m5141(obj, new StringBuilder("can not cast to Integer ")));
                        return null;
                    }
                    numValueOf = (Integer) functionM6191.apply(obj);
                }
            }
            numArr[i] = numValueOf;
            i++;
        }
        return numArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6703((byte) -110)) {
            long jMo6799 = abstractC3732.mo6799();
            if (jMo6799 != f8648 && jMo6799 != C3541.f8577) {
                C1123.m1410(abstractC3732.mo6730("not support type " + abstractC3732.mo6660()));
                return null;
            }
        }
        int iMo6792 = abstractC3732.mo6792();
        if (iMo6792 == -1) {
            return null;
        }
        Integer[] numArr = new Integer[iMo6792];
        for (int i = 0; i < iMo6792; i++) {
            numArr[i] = abstractC3732.mo6773();
        }
        return numArr;
    }
}
