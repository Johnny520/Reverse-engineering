package com.alibaba.fastjson2;

import androidx.collection.C0276;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Map;
import lin.xposed.hook.javaplugin.C5553;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2955 extends AbstractC2951 implements InterfaceC2939 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9364;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2955 f9361 = new C2955(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2955 f9360 = new C2955(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2955 f9359 = new C2955(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2955 f9358 = new C2955(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2955 f9357 = new C2955(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2955 f9363 = new C2955(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2955 f9362 = new C2955(6);

    public /* synthetic */ C2955(int i) {
        this.f9364 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Number m6365(Number number, Number number2) {
        boolean z = true;
        boolean z2 = (number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long);
        boolean z3 = (number2 instanceof Byte) || (number2 instanceof Short) || (number2 instanceof Integer) || (number2 instanceof Long);
        if (z2 && z3) {
            return Long.valueOf(number2.longValue() + number.longValue());
        }
        boolean z4 = (number instanceof Float) || (number instanceof Double);
        if (!(number2 instanceof Float) && !(number2 instanceof Double)) {
            z = false;
        }
        if (z4 || z) {
            return Double.valueOf(number2.doubleValue() + number.doubleValue());
        }
        if ((number instanceof BigDecimal) || (number2 instanceof BigDecimal)) {
            return AbstractC2866.m5869(number).add(AbstractC2866.m5869(number2));
        }
        if ((number instanceof BigInteger) || (number2 instanceof BigInteger)) {
            return AbstractC2866.m5867(number).add(AbstractC2866.m5867(number2));
        }
        C0276.m849("not support operation");
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5908(C2925 c2925) {
        int i = 0;
        Object obj = null;
        int size = 1;
        switch (this.f9364) {
            case 0:
                C2925 c29252 = c2925.f9271;
                Object obj2 = c29252 == null ? c2925.f9268 : c29252.f9267;
                if (obj2 instanceof Map) {
                    Map map = (Map) obj2;
                    JSONArray jSONArray = new JSONArray(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        jSONArray.add(JSONObject.of("key", entry.getKey(), "value", entry.getValue()));
                    }
                    c2925.f9267 = jSONArray;
                    c2925.f9273 = true;
                } else {
                    C0276.m849("TODO");
                }
                break;
            case 1:
                C2925 c29253 = c2925.f9271;
                Object obj3 = c29253 == null ? c2925.f9268 : c29253.f9267;
                if (obj3 instanceof Map) {
                    c2925.f9267 = new JSONArray(((Map) obj3).keySet());
                    c2925.f9273 = true;
                } else {
                    C0276.m849("TODO");
                }
                break;
            case 2:
                C2925 c29254 = c2925.f9271;
                Object obj4 = c29254 == null ? c2925.f9268 : c29254.f9267;
                if (obj4 != null) {
                    if (obj4 instanceof Collection) {
                        size = ((Collection) obj4).size();
                    } else if (obj4.getClass().isArray()) {
                        size = Array.getLength(obj4);
                    } else if (obj4 instanceof Map) {
                        size = ((Map) obj4).size();
                    } else if (obj4 instanceof String) {
                        size = ((String) obj4).length();
                    } else if (obj4 instanceof C2920) {
                        size = ((C2920) obj4).f9258.size();
                    }
                    c2925.f9267 = Integer.valueOf(size);
                    break;
                }
                break;
            case 3:
                C2925 c29255 = c2925.f9271;
                Object obj5 = c29255 == null ? c2925.f9268 : c29255.f9267;
                if (obj5 != null) {
                    if (obj5 instanceof Collection) {
                        for (Object obj6 : (Collection) obj5) {
                            if (obj6 != null && (obj == null || AbstractC2866.m5878(obj, obj6) < 0)) {
                                obj = obj6;
                            }
                        }
                    } else if (obj5 instanceof Object[]) {
                        Object[] objArr = (Object[]) obj5;
                        int length = objArr.length;
                        while (i < length) {
                            Object obj7 = objArr[i];
                            if (obj7 != null && (obj == null || AbstractC2866.m5878(obj, obj7) < 0)) {
                                obj = obj7;
                            }
                            i++;
                        }
                    } else if (!(obj5 instanceof C2920)) {
                        C5553.m10825();
                        break;
                    } else {
                        for (Object obj8 : ((C2920) obj5).f9258) {
                            if (obj8 != null && (obj == null || AbstractC2866.m5878(obj, obj8) < 0)) {
                                obj = obj8;
                            }
                        }
                    }
                    c2925.f9267 = obj;
                    c2925.f9273 = true;
                    break;
                }
                break;
            case 4:
                C2925 c29256 = c2925.f9271;
                Object obj9 = c29256 == null ? c2925.f9268 : c29256.f9267;
                if (obj9 != null) {
                    if (obj9 instanceof Collection) {
                        for (Object obj10 : (Collection) obj9) {
                            if (obj10 != null && (obj == null || AbstractC2866.m5878(obj, obj10) > 0)) {
                                obj = obj10;
                            }
                        }
                    } else if (obj9 instanceof Object[]) {
                        Object[] objArr2 = (Object[]) obj9;
                        int length2 = objArr2.length;
                        while (i < length2) {
                            Object obj11 = objArr2[i];
                            if (obj11 != null && (obj == null || AbstractC2866.m5878(obj, obj11) > 0)) {
                                obj = obj11;
                            }
                            i++;
                        }
                    } else if (!(obj9 instanceof C2920)) {
                        C5553.m10825();
                        break;
                    } else {
                        for (Object obj12 : ((C2920) obj9).f9258) {
                            if (obj12 != null && (obj == null || AbstractC2866.m5878(obj, obj12) > 0)) {
                                obj = obj12;
                            }
                        }
                    }
                    c2925.f9267 = obj;
                    c2925.f9273 = true;
                    break;
                }
                break;
            case 5:
                C2925 c29257 = c2925.f9271;
                Object obj13 = c29257 == null ? c2925.f9268 : c29257.f9267;
                if (obj13 != null) {
                    Number numberM6365 = 0;
                    if (obj13 instanceof Collection) {
                        for (Object obj14 : (Collection) obj13) {
                            if (obj14 != null) {
                                numberM6365 = m6365(numberM6365, (Number) obj14);
                            }
                        }
                    } else if (obj13 instanceof Object[]) {
                        Object[] objArr3 = (Object[]) obj13;
                        int length3 = objArr3.length;
                        while (i < length3) {
                            Object obj15 = objArr3[i];
                            if (obj15 != null) {
                                numberM6365 = m6365(numberM6365, (Number) obj15);
                            }
                            i++;
                        }
                    } else if (!(obj13 instanceof C2920)) {
                        C5553.m10825();
                        break;
                    } else {
                        for (Object obj16 : ((C2920) obj13).f9258) {
                            if (obj16 != null) {
                                numberM6365 = m6365(numberM6365, (Number) obj16);
                            }
                        }
                    }
                    c2925.f9267 = numberM6365;
                    c2925.f9273 = true;
                    break;
                }
                break;
            default:
                C2925 c29258 = c2925.f9271;
                Object obj17 = c29258 == null ? c2925.f9268 : c29258.f9267;
                if (obj17 == null) {
                    c2925.f9267 = null;
                    c2925.f9273 = true;
                } else if (obj17 instanceof Map) {
                    c2925.f9267 = new JSONArray((Collection<?>) ((Map) obj17).values());
                    c2925.f9273 = true;
                } else {
                    C0276.m849("TODO");
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5909(AbstractC2898 abstractC2898, C2925 c2925) {
        switch (this.f9364) {
            case 0:
                if (!abstractC2898.mo6131()) {
                    C0276.m849("TODO");
                } else {
                    abstractC2898.mo6127();
                    JSONArray jSONArray = new JSONArray();
                    while (!abstractC2898.mo6106()) {
                        jSONArray.add(JSONObject.of("key", (Object) abstractC2898.mo6080(), "value", abstractC2898.mo6078()));
                    }
                    c2925.f9267 = jSONArray;
                }
                break;
            case 1:
                if (!abstractC2898.mo6131()) {
                    C0276.m849("TODO");
                } else {
                    abstractC2898.mo6127();
                    JSONArray jSONArray2 = new JSONArray();
                    while (!abstractC2898.mo6106()) {
                        jSONArray2.add(abstractC2898.mo6080());
                        abstractC2898.mo6188();
                    }
                    c2925.f9267 = jSONArray2;
                }
                break;
            case 2:
                if (c2925.f9271 == null) {
                    c2925.f9268 = abstractC2898.mo6078();
                    c2925.f9273 = true;
                }
                mo5908(c2925);
                break;
            case 3:
                mo5908(c2925);
                break;
            case 4:
                mo5908(c2925);
                break;
            case 5:
                mo5908(c2925);
                break;
            default:
                mo5908(c2925);
                break;
        }
    }
}
