package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2737 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8371;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2737 f8370 = new C2737(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8369 = AbstractC2859.m5729("[D");

    public C2737(Function function) {
        super(double[].class);
        this.f8371 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (!abstractC2898.mo6073()) {
            if (abstractC2898.mo6095()) {
                double[] dArrCopyOf = new double[16];
                int i = 0;
                while (!abstractC2898.mo6096()) {
                    if (abstractC2898.mo6119()) {
                        C0276.m849(abstractC2898.mo6124("input end"));
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
                    dArrCopyOf[i] = abstractC2898.mo6081();
                    i = i2;
                }
                abstractC2898.mo6099();
                double[] dArrCopyOf2 = Arrays.copyOf(dArrCopyOf, i);
                Function function = this.f8371;
                return function != null ? function.apply(dArrCopyOf2) : dArrCopyOf2;
            }
            if (!abstractC2898.mo6133()) {
                C0276.m849(abstractC2898.mo6124("TODO"));
                return null;
            }
            String strMo6139 = abstractC2898.mo6139();
            if (!strMo6139.isEmpty()) {
                C0276.m849(abstractC2898.mo6124("not support input ".concat(strMo6139)));
                return null;
            }
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5424(Collection collection, long j) {
        double dDoubleValue;
        double[] dArr = new double[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                dDoubleValue = 0.0d;
            } else if (obj instanceof Number) {
                dDoubleValue = ((Number) obj).doubleValue();
            } else {
                Function functionM5586 = AbstractC2932.m6329().m5586(obj.getClass(), Double.TYPE);
                if (functionM5586 == null) {
                    C0276.m849(AbstractC2442.m4571(obj, new StringBuilder("can not cast to double ")));
                    return null;
                }
                dDoubleValue = ((Double) functionM5586.apply(obj)).doubleValue();
            }
            dArr[i] = dDoubleValue;
            i++;
        }
        Function function = this.f8371;
        return function != null ? function.apply(dArr) : dArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.mo6097((byte) -110) && abstractC2898.mo6194() != f8369) {
            C0276.m840(abstractC2898.mo6055(), "not support autoType : ");
            return null;
        }
        int iMo6187 = abstractC2898.mo6187();
        if (iMo6187 == -1) {
            return null;
        }
        double[] dArr = new double[iMo6187];
        for (int i = 0; i < iMo6187; i++) {
            dArr[i] = abstractC2898.mo6081();
        }
        Function function = this.f8371;
        return function != null ? function.apply(dArr) : dArr;
    }
}
