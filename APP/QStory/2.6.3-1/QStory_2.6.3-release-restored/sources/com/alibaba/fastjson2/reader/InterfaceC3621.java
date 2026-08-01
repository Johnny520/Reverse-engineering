package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long f8931 = AbstractC3693.m6334("@type");

    default long getFeatures() {
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    default Object mo6059(long j) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    default Object mo6022(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    default InterfaceC3621 mo6139(C3635 c3635, long j) {
        return c3635.m6190(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    default long mo6140() {
        return f8931;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    default Object mo6029(Collection collection, long j) {
        throw new UnsupportedOperationException(getClass().getName());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    default Class mo6058() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default AbstractC3595 mo6024(long j) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    default String mo6144() {
        return "@type";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    default Object mo6028(AbstractC3732 abstractC3732) {
        return mo6023(abstractC3732, null, null, getFeatures());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    default AbstractC3595 mo6025(long j) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    default Function mo6063() {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    default InterfaceC3621 mo6146(C3776 c3776, long j) {
        return ((C3635) c3776.f9663).m6190(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    Object mo6097(AbstractC3732 abstractC3732, Type type, Object obj, long j);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    default Object m6178(Object obj, Map map, long j) {
        for (Map.Entry entry : map.entrySet()) {
            String string = entry.getKey().toString();
            Object value = entry.getValue();
            AbstractC3595 abstractC3595M6180 = m6180(string);
            if (abstractC3595M6180 == null) {
                mo6138(obj, string, entry.getValue(), j);
            } else {
                abstractC3595M6180.mo6042(j, obj, value);
            }
        }
        Function functionMo6063 = mo6063();
        return functionMo6063 != null ? functionMo6063.apply(obj) : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    default Object m6179(Map map, JSONReader$Feature... jSONReader$FeatureArr) {
        long j = 0;
        for (JSONReader$Feature jSONReader$Feature : jSONReader$FeatureArr) {
            j |= jSONReader$Feature.mask;
        }
        return mo6067(map, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    default Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (abstractC3732.mo6729() && abstractC3732.m6736()) {
            return mo6022(abstractC3732, type, obj, j);
        }
        abstractC3732.mo6708();
        C3776 c3776 = abstractC3732.f9546;
        long j2 = c3776.f9665 | j;
        int i = 0;
        Object objMo6059 = null;
        while (!abstractC3732.mo6712()) {
            long jMo6689 = abstractC3732.mo6689();
            if (jMo6689 == mo6140() && i == 0) {
                InterfaceC3621 interfaceC3621Mo6146 = mo6146(c3776, abstractC3732.mo6799());
                if (interfaceC3621Mo6146 == null) {
                    String strMo6660 = abstractC3732.mo6660();
                    InterfaceC3621 interfaceC3621M6970 = c3776.m6970(null, strMo6660);
                    if (interfaceC3621M6970 == null) {
                        C1123.m1410(abstractC3732.mo6730("No suitable ObjectReader found for " + strMo6660));
                        return null;
                    }
                    interfaceC3621Mo6146 = interfaceC3621M6970;
                }
                if (interfaceC3621Mo6146 != this) {
                    return interfaceC3621Mo6146.mo6027(abstractC3732, type, obj, j);
                }
            } else if (jMo6689 != 0) {
                AbstractC3595 abstractC3595Mo6025 = mo6025(jMo6689);
                if (abstractC3595Mo6025 == null && abstractC3732.m6731(getFeatures() | j2)) {
                    long jMo6666 = abstractC3732.mo6666();
                    if (jMo6666 != jMo6689) {
                        abstractC3595Mo6025 = mo6024(jMo6666);
                    }
                }
                if (abstractC3595Mo6025 == null) {
                    abstractC3732.mo6793();
                } else {
                    if (objMo6059 == null) {
                        objMo6059 = mo6059(j2);
                    }
                    abstractC3595Mo6025.mo6032(abstractC3732, objMo6059);
                }
            }
            i++;
        }
        return objMo6059 != null ? objMo6059 : mo6059(j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    default AbstractC3595 m6180(String str) {
        long jM6334 = AbstractC3693.m6334(str);
        AbstractC3595 abstractC3595Mo6025 = mo6025(jM6334);
        if (abstractC3595Mo6025 == null && (abstractC3595Mo6025 = mo6024(jM6334)) == null) {
            long jM6333 = AbstractC3693.m6333(str);
            if (jM6333 != jM6334) {
                return mo6024(jM6333);
            }
        }
        return abstractC3595Mo6025;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    default Object mo6067(Map map, long j) {
        C3635 c3635M6947 = AbstractC3766.m6947();
        Object obj = map.get(mo6144());
        if (obj instanceof String) {
            String str = (String) obj;
            InterfaceC3621 interfaceC3621Mo6139 = ((JSONReader$Feature.SupportAutoType.mask & j) != 0 || (this instanceof C3633)) ? mo6139(c3635M6947, AbstractC3693.m6334(str)) : null;
            if (interfaceC3621Mo6139 == null) {
                interfaceC3621Mo6139 = c3635M6947.m6189(str, mo6058(), getFeatures() | j);
            }
            if (interfaceC3621Mo6139 != this && interfaceC3621Mo6139 != null) {
                return interfaceC3621Mo6139.mo6067(map, j);
            }
        }
        return m6178(mo6059(0L), map, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    default void mo6138(Object obj, String str, Object obj2, long j) {
    }
}
