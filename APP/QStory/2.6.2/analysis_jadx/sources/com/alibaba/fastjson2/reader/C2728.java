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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2728 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2728 f8302 = new C2728(Integer[].class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8301 = AbstractC2859.m5729("[Integer");

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (!abstractC2898.mo6073()) {
            if (abstractC2898.mo6095()) {
                Integer[] numArr = new Integer[16];
                int i = 0;
                while (!abstractC2898.mo6096()) {
                    if (abstractC2898.mo6119()) {
                        C0276.m849(abstractC2898.mo6124("input end"));
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
                    numArr[i] = abstractC2898.mo6168();
                    i = i2;
                }
                abstractC2898.mo6099();
                return Arrays.copyOf(numArr, i);
            }
            if (!abstractC2898.mo6133()) {
                if (abstractC2898.mo6132()) {
                    return new Integer[]{abstractC2898.mo6168()};
                }
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
        Integer[] numArr = new Integer[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            Integer numValueOf = null;
            if (obj != null) {
                if (obj instanceof Number) {
                    numValueOf = Integer.valueOf(((Number) obj).intValue());
                } else {
                    Function functionM5586 = AbstractC2932.m6329().m5586(obj.getClass(), Integer.class);
                    if (functionM5586 == null) {
                        C0276.m849(AbstractC2442.m4571(obj, new StringBuilder("can not cast to Integer ")));
                        return null;
                    }
                    numValueOf = (Integer) functionM5586.apply(obj);
                }
            }
            numArr[i] = numValueOf;
            i++;
        }
        return numArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.mo6097((byte) -110)) {
            long jMo6194 = abstractC2898.mo6194();
            if (jMo6194 != f8301 && jMo6194 != C2707.f8230) {
                C0276.m849(abstractC2898.mo6124("not support type " + abstractC2898.mo6055()));
                return null;
            }
        }
        int iMo6187 = abstractC2898.mo6187();
        if (iMo6187 == -1) {
            return null;
        }
        Integer[] numArr = new Integer[iMo6187];
        for (int i = 0; i < iMo6187; i++) {
            numArr[i] = abstractC2898.mo6168();
        }
        return numArr;
    }
}
