package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.JSONReader$Feature;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3586 extends C3523 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final /* synthetic */ int f8746;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3586(String str, Type type, Class cls, String str2, int i, long j, String str3, Locale locale, Object obj, int i2) {
        super(str, type, cls, str2, i, j, str3, locale, obj);
        this.f8746 = i2;
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final Object mo6033(AbstractC3732 abstractC3732) {
        int i = this.f8746;
        long j = this.f8767;
        Class cls = this.f8774;
        switch (i) {
            case 0:
                Integer numMo6773 = abstractC3732.mo6773();
                if (numMo6773 == null && cls == Byte.TYPE && (abstractC3732.m6717(j) & JSONReader$Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    C1123.m1410(abstractC3732.mo6730("short value not support input null"));
                    return null;
                }
                if (numMo6773 == null) {
                    return null;
                }
                return Short.valueOf(numMo6773.shortValue());
            case 1:
                Integer numMo67732 = abstractC3732.mo6773();
                if (numMo67732 != null || cls != Integer.TYPE || (abstractC3732.m6717(j) & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                    return numMo67732;
                }
                C1123.m1410(abstractC3732.mo6730("int value not support input null"));
                return null;
            case 2:
                Long lMo6770 = abstractC3732.mo6770();
                if (lMo6770 != null || cls != Long.TYPE || (abstractC3732.m6717(j) & JSONReader$Feature.ErrorOnNullForPrimitives.mask) == 0) {
                    return lMo6770;
                }
                C1123.m1410(abstractC3732.mo6730("long value not support input null"));
                return null;
            default:
                Integer numMo67733 = abstractC3732.mo6773();
                if (numMo67733 == null) {
                    return null;
                }
                return Byte.valueOf(numMo67733.byteValue());
        }
    }
}
