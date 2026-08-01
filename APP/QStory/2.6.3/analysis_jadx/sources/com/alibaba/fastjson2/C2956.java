package com.alibaba.fastjson2;

import androidx.collection.C0276;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Map;
import lin.xposed.hook.javaplugin.C5554;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2956 extends AbstractC2952 implements InterfaceC2940 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9366;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2956 f9363 = new C2956(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2956 f9362 = new C2956(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2956 f9361 = new C2956(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2956 f9360 = new C2956(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2956 f9359 = new C2956(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2956 f9365 = new C2956(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2956 f9364 = new C2956(6);

    public /* synthetic */ C2956(int i) {
        this.f9366 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Number m6423(Number number, Number number2) {
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
            return AbstractC2867.m5914(number).add(AbstractC2867.m5914(number2));
        }
        if ((number instanceof BigInteger) || (number2 instanceof BigInteger)) {
            return AbstractC2867.m5912(number).add(AbstractC2867.m5912(number2));
        }
        C0276.m850("not support operation");
        return null;
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5953(C2926 c2926) {
        int i = 0;
        Object obj = null;
        int size = 1;
        switch (this.f9366) {
            case 0:
                C2926 c29262 = c2926.f9273;
                Object obj2 = c29262 == null ? c2926.f9270 : c29262.f9269;
                if (obj2 instanceof Map) {
                    Map map = (Map) obj2;
                    JSONArray jSONArray = new JSONArray(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        jSONArray.add(JSONObject.of("key", entry.getKey(), "value", entry.getValue()));
                    }
                    c2926.f9269 = jSONArray;
                    c2926.f9275 = true;
                } else {
                    C0276.m850("TODO");
                }
                break;
            case 1:
                C2926 c29263 = c2926.f9273;
                Object obj3 = c29263 == null ? c2926.f9270 : c29263.f9269;
                if (obj3 instanceof Map) {
                    c2926.f9269 = new JSONArray(((Map) obj3).keySet());
                    c2926.f9275 = true;
                } else {
                    C0276.m850("TODO");
                }
                break;
            case 2:
                C2926 c29264 = c2926.f9273;
                Object obj4 = c29264 == null ? c2926.f9270 : c29264.f9269;
                if (obj4 != null) {
                    if (obj4 instanceof Collection) {
                        size = ((Collection) obj4).size();
                    } else if (obj4.getClass().isArray()) {
                        size = Array.getLength(obj4);
                    } else if (obj4 instanceof Map) {
                        size = ((Map) obj4).size();
                    } else if (obj4 instanceof String) {
                        size = ((String) obj4).length();
                    } else if (obj4 instanceof C2921) {
                        size = ((C2921) obj4).f9260.size();
                    }
                    c2926.f9269 = Integer.valueOf(size);
                    break;
                }
                break;
            case 3:
                C2926 c29265 = c2926.f9273;
                Object obj5 = c29265 == null ? c2926.f9270 : c29265.f9269;
                if (obj5 != null) {
                    if (obj5 instanceof Collection) {
                        for (Object obj6 : (Collection) obj5) {
                            if (obj6 != null && (obj == null || AbstractC2867.m5923(obj, obj6) < 0)) {
                                obj = obj6;
                            }
                        }
                    } else if (obj5 instanceof Object[]) {
                        Object[] objArr = (Object[]) obj5;
                        int length = objArr.length;
                        while (i < length) {
                            Object obj7 = objArr[i];
                            if (obj7 != null && (obj == null || AbstractC2867.m5923(obj, obj7) < 0)) {
                                obj = obj7;
                            }
                            i++;
                        }
                    } else if (!(obj5 instanceof C2921)) {
                        C5554.m10882();
                        break;
                    } else {
                        for (Object obj8 : ((C2921) obj5).f9260) {
                            if (obj8 != null && (obj == null || AbstractC2867.m5923(obj, obj8) < 0)) {
                                obj = obj8;
                            }
                        }
                    }
                    c2926.f9269 = obj;
                    c2926.f9275 = true;
                    break;
                }
                break;
            case 4:
                C2926 c29266 = c2926.f9273;
                Object obj9 = c29266 == null ? c2926.f9270 : c29266.f9269;
                if (obj9 != null) {
                    if (obj9 instanceof Collection) {
                        for (Object obj10 : (Collection) obj9) {
                            if (obj10 != null && (obj == null || AbstractC2867.m5923(obj, obj10) > 0)) {
                                obj = obj10;
                            }
                        }
                    } else if (obj9 instanceof Object[]) {
                        Object[] objArr2 = (Object[]) obj9;
                        int length2 = objArr2.length;
                        while (i < length2) {
                            Object obj11 = objArr2[i];
                            if (obj11 != null && (obj == null || AbstractC2867.m5923(obj, obj11) > 0)) {
                                obj = obj11;
                            }
                            i++;
                        }
                    } else if (!(obj9 instanceof C2921)) {
                        C5554.m10882();
                        break;
                    } else {
                        for (Object obj12 : ((C2921) obj9).f9260) {
                            if (obj12 != null && (obj == null || AbstractC2867.m5923(obj, obj12) > 0)) {
                                obj = obj12;
                            }
                        }
                    }
                    c2926.f9269 = obj;
                    c2926.f9275 = true;
                    break;
                }
                break;
            case 5:
                C2926 c29267 = c2926.f9273;
                Object obj13 = c29267 == null ? c2926.f9270 : c29267.f9269;
                if (obj13 != null) {
                    Number numberM6423 = 0;
                    if (obj13 instanceof Collection) {
                        for (Object obj14 : (Collection) obj13) {
                            if (obj14 != null) {
                                numberM6423 = m6423(numberM6423, (Number) obj14);
                            }
                        }
                    } else if (obj13 instanceof Object[]) {
                        Object[] objArr3 = (Object[]) obj13;
                        int length3 = objArr3.length;
                        while (i < length3) {
                            Object obj15 = objArr3[i];
                            if (obj15 != null) {
                                numberM6423 = m6423(numberM6423, (Number) obj15);
                            }
                            i++;
                        }
                    } else if (!(obj13 instanceof C2921)) {
                        C5554.m10882();
                        break;
                    } else {
                        for (Object obj16 : ((C2921) obj13).f9260) {
                            if (obj16 != null) {
                                numberM6423 = m6423(numberM6423, (Number) obj16);
                            }
                        }
                    }
                    c2926.f9269 = numberM6423;
                    c2926.f9275 = true;
                    break;
                }
                break;
            default:
                C2926 c29268 = c2926.f9273;
                Object obj17 = c29268 == null ? c2926.f9270 : c29268.f9269;
                if (obj17 == null) {
                    c2926.f9269 = null;
                    c2926.f9275 = true;
                } else if (obj17 instanceof Map) {
                    c2926.f9269 = new JSONArray((Collection<?>) ((Map) obj17).values());
                    c2926.f9275 = true;
                } else {
                    C0276.m850("TODO");
                }
                break;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5954(AbstractC2899 abstractC2899, C2926 c2926) {
        switch (this.f9366) {
            case 0:
                if (!abstractC2899.mo6177()) {
                    C0276.m850("TODO");
                } else {
                    abstractC2899.mo6173();
                    JSONArray jSONArray = new JSONArray();
                    while (!abstractC2899.mo6152()) {
                        jSONArray.add(JSONObject.of("key", (Object) abstractC2899.mo6126(), "value", abstractC2899.mo6124()));
                    }
                    c2926.f9269 = jSONArray;
                }
                break;
            case 1:
                if (!abstractC2899.mo6177()) {
                    C0276.m850("TODO");
                } else {
                    abstractC2899.mo6173();
                    JSONArray jSONArray2 = new JSONArray();
                    while (!abstractC2899.mo6152()) {
                        jSONArray2.add(abstractC2899.mo6126());
                        abstractC2899.mo6233();
                    }
                    c2926.f9269 = jSONArray2;
                }
                break;
            case 2:
                if (c2926.f9273 == null) {
                    c2926.f9270 = abstractC2899.mo6124();
                    c2926.f9275 = true;
                }
                mo5953(c2926);
                break;
            case 3:
                mo5953(c2926);
                break;
            case 4:
                mo5953(c2926);
                break;
            case 5:
                mo5953(c2926);
                break;
            default:
                mo5953(c2926);
                break;
        }
    }
}
