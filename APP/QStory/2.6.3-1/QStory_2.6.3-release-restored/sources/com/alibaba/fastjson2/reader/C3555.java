package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3555 extends AbstractC3630 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3555 f8633 = new C3555(boolean[].class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8632 = AbstractC3693.m6334("[Z");

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (!abstractC3732.mo6679()) {
            if (abstractC3732.mo6701()) {
                boolean[] zArrCopyOf = new boolean[16];
                int i = 0;
                while (!abstractC3732.mo6702()) {
                    int i2 = i + 1;
                    if (i2 - zArrCopyOf.length > 0) {
                        int length = zArrCopyOf.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        zArrCopyOf = Arrays.copyOf(zArrCopyOf, i3);
                    }
                    zArrCopyOf[i] = abstractC3732.mo6668();
                    i = i2;
                }
                abstractC3732.mo6705();
                return Arrays.copyOf(zArrCopyOf, i);
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
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6703((byte) -110) && abstractC3732.mo6799() != f8632) {
            C1123.m1401(abstractC3732.mo6660(), "not support autoType : ");
            return null;
        }
        int iMo6792 = abstractC3732.mo6792();
        if (iMo6792 == -1) {
            return null;
        }
        boolean[] zArr = new boolean[iMo6792];
        for (int i = 0; i < iMo6792; i++) {
            zArr[i] = abstractC3732.mo6668();
        }
        return zArr;
    }
}
