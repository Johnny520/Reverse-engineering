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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3560 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8643;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3560 f8642 = new C3560(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8641 = AbstractC3693.m6334("[F");

    public C3560(Function function) {
        super(float[].class);
        this.f8643 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (!abstractC3732.mo6679()) {
            if (abstractC3732.mo6701()) {
                float[] fArrCopyOf = new float[16];
                int i = 0;
                while (!abstractC3732.mo6702()) {
                    if (abstractC3732.mo6725()) {
                        C1123.m1410(abstractC3732.mo6730("input end"));
                        return null;
                    }
                    int i2 = i + 1;
                    if (i2 - fArrCopyOf.length > 0) {
                        int length = fArrCopyOf.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        fArrCopyOf = Arrays.copyOf(fArrCopyOf, i3);
                    }
                    fArrCopyOf[i] = abstractC3732.mo6674();
                    i = i2;
                }
                abstractC3732.mo6705();
                float[] fArrCopyOf2 = Arrays.copyOf(fArrCopyOf, i);
                Function function = this.f8643;
                return function != null ? function.apply(fArrCopyOf2) : fArrCopyOf2;
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
        float fFloatValue;
        float[] fArr = new float[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                fFloatValue = 0.0f;
            } else if (obj instanceof Number) {
                fFloatValue = ((Number) obj).floatValue();
            } else {
                Function functionM6191 = AbstractC3766.m6947().m6191(obj.getClass(), Float.TYPE);
                if (functionM6191 == null) {
                    C1123.m1410(AbstractC3275.m5141(obj, new StringBuilder("can not cast to float ")));
                    return null;
                }
                fFloatValue = ((Float) functionM6191.apply(obj)).floatValue();
            }
            fArr[i] = fFloatValue;
            i++;
        }
        Function function = this.f8643;
        return function != null ? function.apply(fArr) : fArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6703((byte) -110) && abstractC3732.mo6799() != f8641) {
            C1123.m1401(abstractC3732.mo6660(), "not support autoType : ");
            return null;
        }
        int iMo6792 = abstractC3732.mo6792();
        if (iMo6792 == -1) {
            return null;
        }
        float[] fArr = new float[iMo6792];
        for (int i = 0; i < iMo6792; i++) {
            fArr[i] = abstractC3732.mo6674();
        }
        Function function = this.f8643;
        return function != null ? function.apply(fArr) : fArr;
    }
}
