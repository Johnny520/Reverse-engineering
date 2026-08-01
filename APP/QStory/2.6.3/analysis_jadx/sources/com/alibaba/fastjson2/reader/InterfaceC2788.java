package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long f8586 = AbstractC2860.m5774("@type");

    default long getFeatures() {
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    default Object mo5499(long j) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    default Object mo5462(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    default InterfaceC2788 mo5579(C2802 c2802, long j) {
        return c2802.m5630(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    default long mo5580() {
        return f8586;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    default Object mo5469(Collection collection, long j) {
        throw new UnsupportedOperationException(getClass().getName());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    default Class mo5498() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default AbstractC2762 mo5464(long j) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    default String mo5584() {
        return "@type";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    default Object mo5468(AbstractC2899 abstractC2899) {
        return mo5463(abstractC2899, null, null, getFeatures());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    default AbstractC2762 mo5465(long j) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    default Function mo5503() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    default InterfaceC2788 mo5586(C2943 c2943, long j) {
        return ((C2802) c2943.f9318).m5630(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    Object mo5537(AbstractC2899 abstractC2899, Type type, Object obj, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    default Object m5618(Object obj, Map map, long j) {
        for (Map.Entry entry : map.entrySet()) {
            String string = entry.getKey().toString();
            Object value = entry.getValue();
            AbstractC2762 abstractC2762M5620 = m5620(string);
            if (abstractC2762M5620 == null) {
                mo5578(obj, string, entry.getValue(), j);
            } else {
                abstractC2762M5620.mo5482(j, obj, value);
            }
        }
        Function functionMo5503 = mo5503();
        return functionMo5503 != null ? functionMo5503.apply(obj) : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    default Object m5619(Map map, JSONReader$Feature... jSONReader$FeatureArr) {
        long j = 0;
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            j |= jSONReader$Feature.mask;
        }
        return mo5507(map, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    default Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.mo6169() && abstractC2899.m6176()) {
            return mo5462(abstractC2899, type, obj, j);
        }
        abstractC2899.mo6148();
        C2943 c2943 = abstractC2899.f9201;
        long j2 = c2943.f9320 | j;
        int i = 0;
        Object objMo5499 = null;
        while (!abstractC2899.mo6152()) {
            long jMo6129 = abstractC2899.mo6129();
            if (jMo6129 == mo5580() && i == 0) {
                InterfaceC2788 interfaceC2788Mo5586 = mo5586(c2943, abstractC2899.mo6239());
                if (interfaceC2788Mo5586 == null) {
                    String strMo6100 = abstractC2899.mo6100();
                    InterfaceC2788 interfaceC2788M6410 = c2943.m6410(null, strMo6100);
                    if (interfaceC2788M6410 == null) {
                        C0276.m850(abstractC2899.mo6170("No suitable ObjectReader found for " + strMo6100));
                        return null;
                    }
                    interfaceC2788Mo5586 = interfaceC2788M6410;
                }
                if (interfaceC2788Mo5586 != this) {
                    return interfaceC2788Mo5586.mo5467(abstractC2899, type, obj, j);
                }
            } else if (jMo6129 != 0) {
                AbstractC2762 abstractC2762Mo5465 = mo5465(jMo6129);
                if (abstractC2762Mo5465 == null && abstractC2899.m6171(getFeatures() | j2)) {
                    long jMo6106 = abstractC2899.mo6106();
                    if (jMo6106 != jMo6129) {
                        abstractC2762Mo5465 = mo5464(jMo6106);
                    }
                }
                if (abstractC2762Mo5465 == null) {
                    abstractC2899.mo6233();
                } else {
                    if (objMo5499 == null) {
                        objMo5499 = mo5499(j2);
                    }
                    abstractC2762Mo5465.mo5472(abstractC2899, objMo5499);
                }
            }
            i++;
        }
        return objMo5499 != null ? objMo5499 : mo5499(j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    default AbstractC2762 m5620(String str) {
        long jM5774 = AbstractC2860.m5774(str);
        AbstractC2762 abstractC2762Mo5465 = mo5465(jM5774);
        if (abstractC2762Mo5465 == null && (abstractC2762Mo5465 = mo5464(jM5774)) == null) {
            long jM5773 = AbstractC2860.m5773(str);
            if (jM5773 != jM5774) {
                return mo5464(jM5773);
            }
        }
        return abstractC2762Mo5465;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    default Object mo5507(Map map, long j) {
        C2802 c2802M6387 = AbstractC2933.m6387();
        Object obj = map.get(mo5584());
        if (obj instanceof String) {
            String str = (String) obj;
            InterfaceC2788 interfaceC2788Mo5579 = ((JSONReader$Feature.SupportAutoType.mask & j) != 0 || (this instanceof C2800)) ? mo5579(c2802M6387, AbstractC2860.m5774(str)) : null;
            if (interfaceC2788Mo5579 == null) {
                interfaceC2788Mo5579 = c2802M6387.m5629(str, mo5498(), getFeatures() | j);
            }
            if (interfaceC2788Mo5579 != this && interfaceC2788Mo5579 != null) {
                return interfaceC2788Mo5579.mo5507(map, j);
            }
        }
        return m5618(mo5499(0L), map, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    default void mo5578(Object obj, String str, Object obj2, long j) {
    }
}
