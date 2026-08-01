package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2708 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8234;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2708 f8233 = new C2708(int[].class, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8232 = AbstractC2860.m5774("[I");

    public C2708(Class cls, Function function) {
        super(cls);
        this.f8234 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.f9199) {
            return mo5467(abstractC2899, type, obj, j);
        }
        if (!abstractC2899.mo6119()) {
            if (abstractC2899.mo6141()) {
                int[] iArrCopyOf = new int[16];
                int i = 0;
                while (!abstractC2899.mo6142()) {
                    if (abstractC2899.mo6165()) {
                        C0276.m850(abstractC2899.mo6170("input end"));
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
                    iArrCopyOf[i] = abstractC2899.mo6212();
                    i = i2;
                }
                abstractC2899.mo6145();
                int[] iArrCopyOf2 = Arrays.copyOf(iArrCopyOf, i);
                Function function = this.f8234;
                return function != null ? function.apply(iArrCopyOf2) : iArrCopyOf2;
            }
            if (!abstractC2899.mo6179()) {
                C0276.m850(abstractC2899.mo6170("TODO"));
                return null;
            }
            String strMo6184 = abstractC2899.mo6184();
            if (!strMo6184.isEmpty()) {
                C0276.m850(abstractC2899.mo6170("not support input ".concat(strMo6184)));
                return null;
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5469(Collection collection, long j) {
        int iIntValue;
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                iIntValue = 0;
            } else if (obj instanceof Number) {
                iIntValue = ((Number) obj).intValue();
            } else {
                Function functionM5631 = AbstractC2933.m6387().m5631(obj.getClass(), Integer.TYPE);
                if (functionM5631 == null) {
                    C0276.m850(AbstractC2442.m4581(obj, new StringBuilder("can not cast to int ")));
                    return null;
                }
                iIntValue = ((Integer) functionM5631.apply(obj)).intValue();
            }
            iArr[i] = iIntValue;
            i++;
        }
        Function function = this.f8234;
        return function != null ? function.apply(iArr) : iArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6143((byte) -110)) {
            long jMo6239 = abstractC2899.mo6239();
            if (jMo6239 != f8232 && jMo6239 != C2729.f8303) {
                C0276.m841(abstractC2899.mo6100(), "not support autoType : ");
                return null;
            }
        }
        int iMo6232 = abstractC2899.mo6232();
        if (iMo6232 == -1) {
            return null;
        }
        int[] iArr = new int[iMo6232];
        for (int i = 0; i < iMo6232; i++) {
            iArr[i] = abstractC2899.mo6212();
        }
        Function function = this.f8234;
        return function != null ? function.apply(iArr) : iArr;
    }
}
