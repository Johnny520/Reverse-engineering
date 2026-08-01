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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3571 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8718;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3571 f8717 = new C3571(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8716 = AbstractC3693.m6334("[D");

    public C3571(Function function) {
        super(double[].class);
        this.f8718 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (!abstractC3732.mo6679()) {
            if (abstractC3732.mo6701()) {
                double[] dArrCopyOf = new double[16];
                int i = 0;
                while (!abstractC3732.mo6702()) {
                    if (abstractC3732.mo6725()) {
                        C1123.m1410(abstractC3732.mo6730("input end"));
                        return null;
                    }
                    int i2 = i + 1;
                    if (i2 - dArrCopyOf.length > 0) {
                        int length = dArrCopyOf.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        dArrCopyOf = Arrays.copyOf(dArrCopyOf, i3);
                    }
                    dArrCopyOf[i] = abstractC3732.mo6687();
                    i = i2;
                }
                abstractC3732.mo6705();
                double[] dArrCopyOf2 = Arrays.copyOf(dArrCopyOf, i);
                Function function = this.f8718;
                return function != null ? function.apply(dArrCopyOf2) : dArrCopyOf2;
            }
            if (!abstractC3732.mo6739()) {
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
        double dDoubleValue;
        double[] dArr = new double[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                dDoubleValue = 0.0d;
            } else if (obj instanceof Number) {
                dDoubleValue = ((Number) obj).doubleValue();
            } else {
                Function functionM6191 = AbstractC3766.m6947().m6191(obj.getClass(), Double.TYPE);
                if (functionM6191 == null) {
                    C1123.m1410(AbstractC3275.m5141(obj, new StringBuilder("can not cast to double ")));
                    return null;
                }
                dDoubleValue = ((Double) functionM6191.apply(obj)).doubleValue();
            }
            dArr[i] = dDoubleValue;
            i++;
        }
        Function function = this.f8718;
        return function != null ? function.apply(dArr) : dArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6703((byte) -110) && abstractC3732.mo6799() != f8716) {
            C1123.m1401(abstractC3732.mo6660(), "not support autoType : ");
            return null;
        }
        int iMo6792 = abstractC3732.mo6792();
        if (iMo6792 == -1) {
            return null;
        }
        double[] dArr = new double[iMo6792];
        for (int i = 0; i < iMo6792; i++) {
            dArr[i] = abstractC3732.mo6687();
        }
        Function function = this.f8718;
        return function != null ? function.apply(dArr) : dArr;
    }
}
