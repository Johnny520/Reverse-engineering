package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.JSONReader$Feature;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2753 extends C2690 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final /* synthetic */ int f8401;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2753(String str, Type type, Class cls, String str2, int i, long j, String str3, Locale locale, Object obj, int i2) {
        super(str, type, cls, str2, i, j, str3, locale, obj);
        this.f8401 = i2;
    }

    @Override // com.alibaba.fastjson2.reader.C2692, com.alibaba.fastjson2.reader.AbstractC2762
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo5473(AbstractC2899 abstractC2899) {
        int i = this.f8401;
        long j = this.f8422;
        Class cls = this.f8429;
        switch (i) {
            case 0:
                Integer numMo6213 = abstractC2899.mo6213();
                if (numMo6213 == null && cls == Byte.TYPE && (abstractC2899.m6157(j) & JSONReader$Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    C0276.m850(abstractC2899.mo6170("short value not support input null"));
                    return null;
                }
                if (numMo6213 == null) {
                    return null;
                }
                return Short.valueOf(numMo6213.shortValue());
            case 1:
                Integer numMo62132 = abstractC2899.mo6213();
                if (numMo62132 != null || cls != Integer.TYPE || (abstractC2899.m6157(j) & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                    return numMo62132;
                }
                C0276.m850(abstractC2899.mo6170("int value not support input null"));
                return null;
            case 2:
                Long lMo6210 = abstractC2899.mo6210();
                if (lMo6210 != null || cls != Long.TYPE || (abstractC2899.m6157(j) & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                    return lMo6210;
                }
                C0276.m850(abstractC2899.mo6170("long value not support input null"));
                return null;
            default:
                Integer numMo62133 = abstractC2899.mo6213();
                if (numMo62133 == null) {
                    return null;
                }
                return Byte.valueOf(numMo62133.byteValue());
        }
    }
}
