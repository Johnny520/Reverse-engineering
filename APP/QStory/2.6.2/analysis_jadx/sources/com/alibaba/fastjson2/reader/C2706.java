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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2706 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2706 f8229 = new C2706(Long[].class);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f8228 = AbstractC2859.m5729("[Long");

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (!abstractC2898.mo6073()) {
            if (abstractC2898.mo6095()) {
                Long[] lArr = new Long[16];
                int i = 0;
                while (!abstractC2898.mo6096()) {
                    if (abstractC2898.mo6119()) {
                        C0276.m849(abstractC2898.mo6124("input end"));
                        return null;
                    }
                    int i2 = i + 1;
                    if (i2 - lArr.length > 0) {
                        int length = lArr.length;
                        int i3 = length + (length >> 1);
                        if (i3 - i2 < 0) {
                            i3 = i2;
                        }
                        lArr = (Long[]) Arrays.copyOf(lArr, i3);
                    }
                    lArr[i] = abstractC2898.mo6165();
                    i = i2;
                }
                abstractC2898.mo6099();
                return Arrays.copyOf(lArr, i);
            }
            if (!abstractC2898.mo6133()) {
                if (abstractC2898.mo6132()) {
                    return new Long[]{abstractC2898.mo6165()};
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
        Long[] lArr = new Long[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            Long lValueOf = null;
            if (obj != null) {
                if (obj instanceof Number) {
                    lValueOf = Long.valueOf(((Number) obj).longValue());
                } else {
                    Function functionM5586 = AbstractC2932.m6329().m5586(obj.getClass(), Long.class);
                    if (functionM5586 == null) {
                        C0276.m849(AbstractC2442.m4571(obj, new StringBuilder("can not cast to Integer ")));
                        return null;
                    }
                    lValueOf = (Long) functionM5586.apply(obj);
                }
            }
            lArr[i] = lValueOf;
            i++;
        }
        return lArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.mo6097((byte) -110)) {
            long jMo6194 = abstractC2898.mo6194();
            if (jMo6194 != f8228 && jMo6194 != C2710.f8238 && jMo6194 != C2728.f8301 && jMo6194 != C2707.f8230) {
                C0276.m849(abstractC2898.mo6124("not support type " + abstractC2898.mo6055()));
                return null;
            }
        }
        int iMo6187 = abstractC2898.mo6187();
        if (iMo6187 == -1) {
            return null;
        }
        Long[] lArr = new Long[iMo6187];
        for (int i = 0; i < iMo6187; i++) {
            lArr[i] = abstractC2898.mo6165();
        }
        return lArr;
    }
}
