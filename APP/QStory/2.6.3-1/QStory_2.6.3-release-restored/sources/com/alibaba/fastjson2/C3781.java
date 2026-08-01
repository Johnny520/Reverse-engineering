package com.alibaba.fastjson2;

import androidx.collection.C1123;
import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3687;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3781 extends AbstractC3785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f9681;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3781 f9680 = new C3781(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3781 f9679 = new C3781(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3781 f9678 = new C3781(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3781 f9677 = new C3781(-1);

    public C3781(int i) {
        this.f9681 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C3781 m6974(int i) {
        return i == 0 ? f9680 : i == 1 ? f9679 : i == 2 ? f9678 : i == -1 ? f9677 : new C3781(i);
    }

    public final String toString() {
        int i = this.f9681;
        int iM6316 = i < 0 ? AbstractC3682.m6316(-i) + 1 : AbstractC3682.m6316(i);
        byte[] bArr = new byte[iM6316 + 2];
        bArr[0] = 91;
        int i2 = iM6316 + 1;
        AbstractC3682.m6296(i, bArr, i2);
        bArr[i2] = 93;
        BiFunction biFunction = AbstractC3687.f9267;
        return biFunction != null ? (String) biFunction.apply(bArr, (byte) 0) : new String(bArr, StandardCharsets.ISO_8859_1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m6975(Map map) {
        int i = this.f9681;
        Object obj = map.get(Integer.valueOf(i));
        if (obj == null) {
            obj = map.get(Integer.toString(i));
        }
        if (obj == null) {
            int size = map.size();
            Iterator it = map.entrySet().iterator();
            int i2 = 0;
            if (size == 1 || (map instanceof LinkedHashMap) || (map instanceof SortedMap)) {
                while (i2 <= i && i2 < size && it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (key instanceof Long) {
                        if (key.equals(Long.valueOf(i))) {
                            return value;
                        }
                    } else if (i2 == i) {
                        obj = value;
                    }
                    i2++;
                }
            } else {
                while (i2 <= i && i2 < map.size() && it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    Object key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if ((key2 instanceof Long) && key2.equals(Long.valueOf(i))) {
                        return value2;
                    }
                    i2++;
                }
            }
        }
        return obj;
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6513(C3759 c3759) {
        AbstractC3785 abstractC3785 = c3759.f9616;
        AbstractC3755 abstractC3755 = c3759.f9619;
        C3759 c37592 = c3759.f9618;
        Object obj = c37592 == null ? c3759.f9615 : c37592.f9614;
        if (obj == null) {
            c3759.f9620 = true;
            return;
        }
        boolean z = obj instanceof List;
        int i = this.f9681;
        if (z) {
            List list = (List) obj;
            if (i < 0) {
                int size = list.size() + i;
                if (size >= 0 && size < list.size()) {
                    c3759.f9614 = list.get(size);
                }
            } else if (i < list.size()) {
                c3759.f9614 = list.get(i);
            }
            c3759.f9620 = true;
            return;
        }
        if ((obj instanceof SortedSet) || (obj instanceof LinkedHashSet) || (obj instanceof Queue) || (i == 0 && (obj instanceof Collection) && ((Collection) obj).size() == 1)) {
            Iterator it = ((Collection) obj).iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (i2 == i) {
                    c3759.f9614 = next;
                    break;
                }
                i2++;
            }
            c3759.f9620 = true;
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (i < 0) {
                int length = objArr.length + i;
                if (length >= 0 && length < objArr.length) {
                    c3759.f9614 = objArr[length];
                }
            } else if (i < objArr.length) {
                c3759.f9614 = objArr[i];
            }
            c3759.f9620 = true;
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            int length2 = Array.getLength(obj);
            if (i < 0) {
                int i3 = i + length2;
                if (i3 >= 0 && i3 < length2) {
                    c3759.f9614 = Array.get(obj, i3);
                }
            } else if (i < length2) {
                c3759.f9614 = Array.get(obj, i);
            }
            c3759.f9620 = true;
            return;
        }
        if (obj instanceof C3754) {
            List list2 = ((C3754) obj).f9605;
            JSONArray jSONArray = new JSONArray(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                c3759.f9614 = it2.next();
                C3759 c37593 = new C3759(abstractC3755, c3759, c3759.f9617, abstractC3785);
                mo6513(c37593);
                jSONArray.add(c37593.f9614);
            }
            if (abstractC3785 != null) {
                c3759.f9614 = new C3754(jSONArray);
            } else {
                c3759.f9614 = jSONArray;
            }
            c3759.f9620 = true;
            return;
        }
        if (Map.class.isAssignableFrom(cls)) {
            c3759.f9614 = m6975((Map) obj);
            c3759.f9620 = true;
        } else {
            if (i == 0) {
                c3759.f9614 = obj;
                c3759.f9620 = true;
                return;
            }
            StringBuilder sb = new StringBuilder("jsonpath not support operate : ");
            sb.append(abstractC3755);
            String name = cls.getName();
            sb.append(", objectClass");
            sb.append(name);
            throw new JSONException(sb.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6514(AbstractC3732 abstractC3732, C3759 c3759) {
        Object objMo6744;
        C3759 c37592 = c3759.f9618;
        AbstractC3785 abstractC3785 = c3759.f9616;
        if (c37592 != null && (c37592.f9620 || ((c37592.f9617 instanceof C3788) && abstractC3785 == null))) {
            mo6513(c3759);
            return;
        }
        boolean z = abstractC3732.f9544;
        int i = 0;
        int i2 = this.f9681;
        if (z) {
            int iMo6792 = abstractC3732.mo6792();
            while (i < iMo6792) {
                if (i2 == i) {
                    if ((abstractC3732.mo6729() || abstractC3732.mo6737()) && abstractC3785 != null) {
                        return;
                    }
                    c3759.f9614 = abstractC3732.mo6684();
                    c3759.f9620 = true;
                    return;
                }
                abstractC3732.mo6793();
                i++;
            }
            return;
        }
        if (abstractC3732.f9538 == '{') {
            c3759.f9614 = m6975(abstractC3732.mo6754());
            c3759.f9620 = true;
            return;
        }
        abstractC3732.mo6733();
        while (true) {
            char c = abstractC3732.f9538;
            if (c == 26) {
                return;
            }
            if (c == ']') {
                abstractC3732.mo6733();
                c3759.f9620 = true;
                return;
            }
            if (i2 == -1 || i2 == i) {
                if (c == '\"' || c == '\'') {
                    objMo6744 = abstractC3732.mo6744();
                } else if (c == '+') {
                    abstractC3732.mo6755();
                    objMo6744 = abstractC3732.m6663();
                } else if (c != '[') {
                    if (c == 'f') {
                        objMo6744 = Boolean.valueOf(abstractC3732.mo6668());
                    } else if (c == 'n') {
                        abstractC3732.mo6762();
                        objMo6744 = null;
                    } else if (c != 't') {
                        if (c != '{') {
                            if (c != '-' && c != '.') {
                                switch (c) {
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                        break;
                                    default:
                                        C1123.m1410(abstractC3732.mo6730("not support : " + abstractC3732.f9538));
                                        return;
                                }
                            }
                            abstractC3732.mo6755();
                            objMo6744 = abstractC3732.m6663();
                        } else if (abstractC3785 != null && !(abstractC3785 instanceof InterfaceC3773)) {
                            return;
                        } else {
                            objMo6744 = abstractC3732.mo6754();
                        }
                    }
                } else if (abstractC3785 != null && !(abstractC3785 instanceof InterfaceC3773)) {
                    return;
                } else {
                    objMo6744 = abstractC3732.mo6685();
                }
                if (i2 != -1) {
                    c3759.f9614 = objMo6744;
                } else if (abstractC3732.f9538 == ']') {
                    c3759.f9614 = objMo6744;
                }
            } else {
                abstractC3732.mo6793();
                if (abstractC3732.f9538 == ',') {
                    abstractC3732.mo6733();
                }
            }
            i++;
        }
    }
}
