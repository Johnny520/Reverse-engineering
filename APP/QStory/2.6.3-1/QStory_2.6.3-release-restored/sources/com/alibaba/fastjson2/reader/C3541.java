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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3541 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8579;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3541 f8578 = new C3541(int[].class, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8577 = AbstractC3693.m6334("[I");

    public C3541(Class cls, Function function) {
        super(cls);
        this.f8579 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.f9544) {
            return mo6027(abstractC3732, type, obj, j);
        }
        if (!abstractC3732.mo6679()) {
            if (abstractC3732.mo6701()) {
                int[] iArrCopyOf = new int[16];
                int i = 0;
                while (!abstractC3732.mo6702()) {
                    if (abstractC3732.mo6725()) {
                        C1123.m1410(abstractC3732.mo6730("input end"));
                        return null;
                    }
                    int i2 = i + 1;
                    if (i2 - iArrCopyOf.length > 0) {
                        int length = iArrCopyOf.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
                    }
                    iArrCopyOf[i] = abstractC3732.mo6772();
                    i = i2;
                }
                abstractC3732.mo6705();
                int[] iArrCopyOf2 = Arrays.copyOf(iArrCopyOf, i);
                Function function = this.f8579;
                return function != null ? function.apply(iArrCopyOf2) : iArrCopyOf2;
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
        int iIntValue;
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                iIntValue = 0;
            } else if (obj instanceof Number) {
                iIntValue = ((Number) obj).intValue();
            } else {
                Function functionM6191 = AbstractC3766.m6947().m6191(obj.getClass(), Integer.TYPE);
                if (functionM6191 == null) {
                    C1123.m1410(AbstractC3275.m5141(obj, new StringBuilder("can not cast to int ")));
                    return null;
                }
                iIntValue = ((Integer) functionM6191.apply(obj)).intValue();
            }
            iArr[i] = iIntValue;
            i++;
        }
        Function function = this.f8579;
        return function != null ? function.apply(iArr) : iArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6703((byte) -110)) {
            long jMo6799 = abstractC3732.mo6799();
            if (jMo6799 != f8577 && jMo6799 != C3562.f8648) {
                C1123.m1401(abstractC3732.mo6660(), "not support autoType : ");
                return null;
            }
        }
        int iMo6792 = abstractC3732.mo6792();
        if (iMo6792 == -1) {
            return null;
        }
        int[] iArr = new int[iMo6792];
        for (int i = 0; i < iMo6792; i++) {
            iArr[i] = abstractC3732.mo6772();
        }
        Function function = this.f8579;
        return function != null ? function.apply(iArr) : iArr;
    }
}
