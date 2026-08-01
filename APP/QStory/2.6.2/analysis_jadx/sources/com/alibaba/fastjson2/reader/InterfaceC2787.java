package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long f8584 = AbstractC2859.m5729("@type");

    default long getFeatures() {
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    default Object mo5454(long j) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    default Object mo5417(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    default InterfaceC2787 mo5534(C2801 c2801, long j) {
        return c2801.m5585(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    default long mo5535() {
        return f8584;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    default Object mo5424(Collection collection, long j) {
        throw new UnsupportedOperationException(getClass().getName());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    default Class mo5453() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default AbstractC2761 mo5419(long j) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    default String mo5539() {
        return "@type";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    default Object mo5423(AbstractC2898 abstractC2898) {
        return mo5418(abstractC2898, null, null, getFeatures());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    default AbstractC2761 mo5420(long j) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    default Function mo5458() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    default InterfaceC2787 mo5541(C2942 c2942, long j) {
        return ((C2801) c2942.f9316).m5585(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    Object mo5492(AbstractC2898 abstractC2898, Type type, Object obj, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    default Object m5573(Object obj, Map map, long j) {
        for (Map.Entry entry : map.entrySet()) {
            String string = entry.getKey().toString();
            Object value = entry.getValue();
            AbstractC2761 abstractC2761M5575 = m5575(string);
            if (abstractC2761M5575 == null) {
                mo5533(obj, string, entry.getValue(), j);
            } else {
                abstractC2761M5575.mo5437(j, obj, value);
            }
        }
        Function functionMo5458 = mo5458();
        return functionMo5458 != null ? functionMo5458.apply(obj) : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    default Object m5574(Map map, JSONReader$Feature... jSONReader$FeatureArr) {
        long j = 0;
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            j |= jSONReader$Feature.mask;
        }
        return mo5462(map, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    default Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.mo6123() && abstractC2898.m6130()) {
            return mo5417(abstractC2898, type, obj, j);
        }
        abstractC2898.mo6102();
        C2942 c2942 = abstractC2898.f9199;
        long j2 = c2942.f9318 | j;
        int i = 0;
        Object objMo5454 = null;
        while (!abstractC2898.mo6106()) {
            long jMo6083 = abstractC2898.mo6083();
            if (jMo6083 == mo5535() && i == 0) {
                InterfaceC2787 interfaceC2787Mo5541 = mo5541(c2942, abstractC2898.mo6194());
                if (interfaceC2787Mo5541 == null) {
                    String strMo6055 = abstractC2898.mo6055();
                    InterfaceC2787 interfaceC2787M6352 = c2942.m6352(null, strMo6055);
                    if (interfaceC2787M6352 == null) {
                        C0276.m849(abstractC2898.mo6124("No suitable ObjectReader found for " + strMo6055));
                        return null;
                    }
                    interfaceC2787Mo5541 = interfaceC2787M6352;
                }
                if (interfaceC2787Mo5541 != this) {
                    return interfaceC2787Mo5541.mo5422(abstractC2898, type, obj, j);
                }
            } else if (jMo6083 != 0) {
                AbstractC2761 abstractC2761Mo5420 = mo5420(jMo6083);
                if (abstractC2761Mo5420 == null && abstractC2898.m6125(getFeatures() | j2)) {
                    long jMo6060 = abstractC2898.mo6060();
                    if (jMo6060 != jMo6083) {
                        abstractC2761Mo5420 = mo5419(jMo6060);
                    }
                }
                if (abstractC2761Mo5420 == null) {
                    abstractC2898.mo6188();
                } else {
                    if (objMo5454 == null) {
                        objMo5454 = mo5454(j2);
                    }
                    abstractC2761Mo5420.mo5427(abstractC2898, objMo5454);
                }
            }
            i++;
        }
        return objMo5454 != null ? objMo5454 : mo5454(j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    default AbstractC2761 m5575(String str) {
        long jM5729 = AbstractC2859.m5729(str);
        AbstractC2761 abstractC2761Mo5420 = mo5420(jM5729);
        if (abstractC2761Mo5420 == null && (abstractC2761Mo5420 = mo5419(jM5729)) == null) {
            long jM5728 = AbstractC2859.m5728(str);
            if (jM5728 != jM5729) {
                return mo5419(jM5728);
            }
        }
        return abstractC2761Mo5420;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    default Object mo5462(Map map, long j) {
        C2801 c2801M6329 = AbstractC2932.m6329();
        Object obj = map.get(mo5539());
        if (obj instanceof String) {
            String str = (String) obj;
            InterfaceC2787 interfaceC2787Mo5534 = ((JSONReader$Feature.SupportAutoType.mask & j) != 0 || (this instanceof C2799)) ? mo5534(c2801M6329, AbstractC2859.m5729(str)) : null;
            if (interfaceC2787Mo5534 == null) {
                interfaceC2787Mo5534 = c2801M6329.m5584(str, mo5453(), getFeatures() | j);
            }
            if (interfaceC2787Mo5534 != this && interfaceC2787Mo5534 != null) {
                return interfaceC2787Mo5534.mo5462(map, j);
            }
        }
        return m5573(mo5454(0L), map, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    default void mo5533(Object obj, String str, Object obj2, long j) {
    }
}
