package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.JSONReader$Feature;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2752 extends C2689 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final /* synthetic */ int f8399;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2752(String str, Type type, Class cls, String str2, int i, long j, String str3, Locale locale, Object obj, int i2) {
        super(str, type, cls, str2, i, j, str3, locale, obj);
        this.f8399 = i2;
    }

    @Override // com.alibaba.fastjson2.reader.C2691, com.alibaba.fastjson2.reader.AbstractC2761
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5428(AbstractC2898 abstractC2898) {
        int i = this.f8399;
        long j = this.f8420;
        Class cls = this.f8427;
        switch (i) {
            case 0:
                Integer numMo6168 = abstractC2898.mo6168();
                if (numMo6168 == null && cls == Byte.TYPE && (abstractC2898.m6110(j) & JSONReader$Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    C0276.m849(abstractC2898.mo6124("short value not support input null"));
                    return null;
                }
                if (numMo6168 == null) {
                    return null;
                }
                return Short.valueOf(numMo6168.shortValue());
            case 1:
                Integer numMo61682 = abstractC2898.mo6168();
                if (numMo61682 != null || cls != Integer.TYPE || (abstractC2898.m6110(j) & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                    return numMo61682;
                }
                C0276.m849(abstractC2898.mo6124("int value not support input null"));
                return null;
            case 2:
                Long lMo6165 = abstractC2898.mo6165();
                if (lMo6165 != null || cls != Long.TYPE || (abstractC2898.m6110(j) & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                    return lMo6165;
                }
                C0276.m849(abstractC2898.mo6124("long value not support input null"));
                return null;
            default:
                Integer numMo61683 = abstractC2898.mo6168();
                if (numMo61683 == null) {
                    return null;
                }
                return Byte.valueOf(numMo61683.byteValue());
        }
    }
}
