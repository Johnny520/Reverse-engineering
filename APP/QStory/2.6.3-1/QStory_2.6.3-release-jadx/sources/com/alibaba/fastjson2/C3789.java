package com.alibaba.fastjson2;

import androidx.collection.C1123;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Map;
import lin.xposed.hook.javaplugin.C6385;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3789 extends AbstractC3785 implements InterfaceC3773 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9711;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3789 f9708 = new C3789(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3789 f9707 = new C3789(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3789 f9706 = new C3789(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3789 f9705 = new C3789(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3789 f9704 = new C3789(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3789 f9710 = new C3789(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C3789 f9709 = new C3789(6);

    public /* synthetic */ C3789(int i) {
        this.f9711 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Number m6983(Number number, Number number2) {
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
            return AbstractC3700.m6474(number).add(AbstractC3700.m6474(number2));
        }
        if ((number instanceof BigInteger) || (number2 instanceof BigInteger)) {
            return AbstractC3700.m6472(number).add(AbstractC3700.m6472(number2));
        }
        C1123.m1410("not support operation");
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6513(C3759 c3759) {
        int i = 0;
        Object obj = null;
        int size = 1;
        switch (this.f9711) {
            case 0:
                C3759 c37592 = c3759.f9618;
                Object obj2 = c37592 == null ? c3759.f9615 : c37592.f9614;
                if (obj2 instanceof Map) {
                    Map map = (Map) obj2;
                    JSONArray jSONArray = new JSONArray(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        jSONArray.add(JSONObject.m10of("key", entry.getKey(), "value", entry.getValue()));
                    }
                    c3759.f9614 = jSONArray;
                    c3759.f9620 = true;
                } else {
                    C1123.m1410("TODO");
                }
                break;
            case 1:
                C3759 c37593 = c3759.f9618;
                Object obj3 = c37593 == null ? c3759.f9615 : c37593.f9614;
                if (obj3 instanceof Map) {
                    c3759.f9614 = new JSONArray(((Map) obj3).keySet());
                    c3759.f9620 = true;
                } else {
                    C1123.m1410("TODO");
                }
                break;
            case 2:
                C3759 c37594 = c3759.f9618;
                Object obj4 = c37594 == null ? c3759.f9615 : c37594.f9614;
                if (obj4 != null) {
                    if (obj4 instanceof Collection) {
                        size = ((Collection) obj4).size();
                    } else if (obj4.getClass().isArray()) {
                        size = Array.getLength(obj4);
                    } else if (obj4 instanceof Map) {
                        size = ((Map) obj4).size();
                    } else if (obj4 instanceof String) {
                        size = ((String) obj4).length();
                    } else if (obj4 instanceof C3754) {
                        size = ((C3754) obj4).f9605.size();
                    }
                    c3759.f9614 = Integer.valueOf(size);
                    break;
                }
                break;
            case 3:
                C3759 c37595 = c3759.f9618;
                Object obj5 = c37595 == null ? c3759.f9615 : c37595.f9614;
                if (obj5 != null) {
                    if (obj5 instanceof Collection) {
                        for (Object obj6 : (Collection) obj5) {
                            if (obj6 != null && (obj == null || AbstractC3700.m6483(obj, obj6) < 0)) {
                                obj = obj6;
                            }
                        }
                    } else if (obj5 instanceof Object[]) {
                        Object[] objArr = (Object[]) obj5;
                        int length = objArr.length;
                        while (i < length) {
                            Object obj7 = objArr[i];
                            if (obj7 != null && (obj == null || AbstractC3700.m6483(obj, obj7) < 0)) {
                                obj = obj7;
                            }
                            i++;
                        }
                    } else if (!(obj5 instanceof C3754)) {
                        C6385.m11441();
                        break;
                    } else {
                        for (Object obj8 : ((C3754) obj5).f9605) {
                            if (obj8 != null && (obj == null || AbstractC3700.m6483(obj, obj8) < 0)) {
                                obj = obj8;
                            }
                        }
                    }
                    c3759.f9614 = obj;
                    c3759.f9620 = true;
                    break;
                }
                break;
            case 4:
                C3759 c37596 = c3759.f9618;
                Object obj9 = c37596 == null ? c3759.f9615 : c37596.f9614;
                if (obj9 != null) {
                    if (obj9 instanceof Collection) {
                        for (Object obj10 : (Collection) obj9) {
                            if (obj10 != null && (obj == null || AbstractC3700.m6483(obj, obj10) > 0)) {
                                obj = obj10;
                            }
                        }
                    } else if (obj9 instanceof Object[]) {
                        Object[] objArr2 = (Object[]) obj9;
                        int length2 = objArr2.length;
                        while (i < length2) {
                            Object obj11 = objArr2[i];
                            if (obj11 != null && (obj == null || AbstractC3700.m6483(obj, obj11) > 0)) {
                                obj = obj11;
                            }
                            i++;
                        }
                    } else if (!(obj9 instanceof C3754)) {
                        C6385.m11441();
                        break;
                    } else {
                        for (Object obj12 : ((C3754) obj9).f9605) {
                            if (obj12 != null && (obj == null || AbstractC3700.m6483(obj, obj12) > 0)) {
                                obj = obj12;
                            }
                        }
                    }
                    c3759.f9614 = obj;
                    c3759.f9620 = true;
                    break;
                }
                break;
            case 5:
                C3759 c37597 = c3759.f9618;
                Object obj13 = c37597 == null ? c3759.f9615 : c37597.f9614;
                if (obj13 != null) {
                    Number numberM6983 = 0;
                    if (obj13 instanceof Collection) {
                        for (Object obj14 : (Collection) obj13) {
                            if (obj14 != null) {
                                numberM6983 = m6983(numberM6983, (Number) obj14);
                            }
                        }
                    } else if (obj13 instanceof Object[]) {
                        Object[] objArr3 = (Object[]) obj13;
                        int length3 = objArr3.length;
                        while (i < length3) {
                            Object obj15 = objArr3[i];
                            if (obj15 != null) {
                                numberM6983 = m6983(numberM6983, (Number) obj15);
                            }
                            i++;
                        }
                    } else if (!(obj13 instanceof C3754)) {
                        C6385.m11441();
                        break;
                    } else {
                        for (Object obj16 : ((C3754) obj13).f9605) {
                            if (obj16 != null) {
                                numberM6983 = m6983(numberM6983, (Number) obj16);
                            }
                        }
                    }
                    c3759.f9614 = numberM6983;
                    c3759.f9620 = true;
                    break;
                }
                break;
            default:
                C3759 c37598 = c3759.f9618;
                Object obj17 = c37598 == null ? c3759.f9615 : c37598.f9614;
                if (obj17 == null) {
                    c3759.f9614 = null;
                    c3759.f9620 = true;
                } else if (obj17 instanceof Map) {
                    c3759.f9614 = new JSONArray((Collection<?>) ((Map) obj17).values());
                    c3759.f9620 = true;
                } else {
                    C1123.m1410("TODO");
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6514(AbstractC3732 abstractC3732, C3759 c3759) {
        switch (this.f9711) {
            case 0:
                if (!abstractC3732.mo6737()) {
                    C1123.m1410("TODO");
                } else {
                    abstractC3732.mo6733();
                    JSONArray jSONArray = new JSONArray();
                    while (!abstractC3732.mo6712()) {
                        jSONArray.add(JSONObject.m10of("key", (Object) abstractC3732.mo6686(), "value", abstractC3732.mo6684()));
                    }
                    c3759.f9614 = jSONArray;
                }
                break;
            case 1:
                if (!abstractC3732.mo6737()) {
                    C1123.m1410("TODO");
                } else {
                    abstractC3732.mo6733();
                    JSONArray jSONArray2 = new JSONArray();
                    while (!abstractC3732.mo6712()) {
                        jSONArray2.add(abstractC3732.mo6686());
                        abstractC3732.mo6793();
                    }
                    c3759.f9614 = jSONArray2;
                }
                break;
            case 2:
                if (c3759.f9618 == null) {
                    c3759.f9615 = abstractC3732.mo6684();
                    c3759.f9620 = true;
                }
                mo6513(c3759);
                break;
            case 3:
                mo6513(c3759);
                break;
            case 4:
                mo6513(c3759);
                break;
            case 5:
                mo6513(c3759);
                break;
            default:
                mo6513(c3759);
                break;
        }
    }
}
