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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3563 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8652;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3563 f8651 = new C3563(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8650 = AbstractC3693.m6334("[S");

    public C3563(Function function) {
        super(short[].class);
        this.f8652 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (!abstractC3732.mo6679()) {
            if (abstractC3732.mo6701()) {
                short[] sArrCopyOf = new short[16];
                int i = 0;
                while (!abstractC3732.mo6702()) {
                    if (abstractC3732.mo6725()) {
                        C1123.m1410(abstractC3732.mo6730("input end"));
                        return null;
                    }
                    int i2 = i + 1;
                    if (i2 - sArrCopyOf.length > 0) {
                        int length = sArrCopyOf.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        sArrCopyOf = Arrays.copyOf(sArrCopyOf, i3);
                    }
                    sArrCopyOf[i] = (short) abstractC3732.mo6772();
                    i = i2;
                }
                abstractC3732.mo6705();
                short[] sArrCopyOf2 = Arrays.copyOf(sArrCopyOf, i);
                Function function = this.f8652;
                return function != null ? function.apply(sArrCopyOf2) : sArrCopyOf2;
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
        short sShortValue;
        short[] sArr = new short[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                sShortValue = 0;
            } else if (obj instanceof Number) {
                sShortValue = ((Number) obj).shortValue();
            } else {
                Function functionM6191 = AbstractC3766.m6947().m6191(obj.getClass(), Short.TYPE);
                if (functionM6191 == null) {
                    C1123.m1410(AbstractC3275.m5141(obj, new StringBuilder("can not cast to short ")));
                    return null;
                }
                sShortValue = ((Short) functionM6191.apply(obj)).shortValue();
            }
            sArr[i] = sShortValue;
            i++;
        }
        Function function = this.f8652;
        return function != null ? function.apply(sArr) : sArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6703((byte) -110)) {
            long jMo6799 = abstractC3732.mo6799();
            if (jMo6799 != f8650 && jMo6799 != C3559.f8639) {
                C1123.m1401(abstractC3732.mo6660(), "not support autoType : ");
                return null;
            }
        }
        int iMo6792 = abstractC3732.mo6792();
        if (iMo6792 == -1) {
            return null;
        }
        short[] sArr = new short[iMo6792];
        for (int i = 0; i < iMo6792; i++) {
            sArr[i] = (short) abstractC3732.mo6772();
        }
        Function function = this.f8652;
        return function != null ? function.apply(sArr) : sArr;
    }
}
