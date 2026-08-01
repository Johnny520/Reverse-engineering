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

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2729 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Function f8305;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2729 f8304 = new C2729(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8303 = AbstractC2859.m5729("[S");

    public C2729(Function function) {
        super(short[].class);
        this.f8305 = function;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (!abstractC2898.mo6073()) {
            if (abstractC2898.mo6095()) {
                short[] sArrCopyOf = new short[16];
                int i = 0;
                while (!abstractC2898.mo6096()) {
                    if (abstractC2898.mo6119()) {
                        C0276.m849(abstractC2898.mo6124("input end"));
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
                    sArrCopyOf[i] = (short) abstractC2898.mo6167();
                    i = i2;
                }
                abstractC2898.mo6099();
                short[] sArrCopyOf2 = Arrays.copyOf(sArrCopyOf, i);
                Function function = this.f8305;
                return function != null ? function.apply(sArrCopyOf2) : sArrCopyOf2;
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
        short sShortValue;
        short[] sArr = new short[collection.size()];
        int i = 0;
        for (Object obj : collection) {
            if (obj == null) {
                sShortValue = 0;
            } else if (obj instanceof Number) {
                sShortValue = ((Number) obj).shortValue();
            } else {
                Function functionM5586 = AbstractC2932.m6329().m5586(obj.getClass(), Short.TYPE);
                if (functionM5586 == null) {
                    C0276.m849(AbstractC2442.m4571(obj, new StringBuilder("can not cast to short ")));
                    return null;
                }
                sShortValue = ((Short) functionM5586.apply(obj)).shortValue();
            }
            sArr[i] = sShortValue;
            i++;
        }
        Function function = this.f8305;
        return function != null ? function.apply(sArr) : sArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.mo6097((byte) -110)) {
            long jMo6194 = abstractC2898.mo6194();
            if (jMo6194 != f8303 && jMo6194 != C2725.f8292) {
                C0276.m840(abstractC2898.mo6055(), "not support autoType : ");
                return null;
            }
        }
        int iMo6187 = abstractC2898.mo6187();
        if (iMo6187 == -1) {
            return null;
        }
        short[] sArr = new short[iMo6187];
        for (int i = 0; i < iMo6187; i++) {
            sArr[i] = (short) abstractC2898.mo6167();
        }
        Function function = this.f8305;
        return function != null ? function.apply(sArr) : sArr;
    }
}
