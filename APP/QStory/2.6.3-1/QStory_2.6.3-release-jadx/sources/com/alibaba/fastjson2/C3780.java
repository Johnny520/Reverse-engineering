package com.alibaba.fastjson2;

import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3693;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p307.AbstractC9323;
import p307.C9353;
import p307.InterfaceC9352;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3780 extends AbstractC3785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f9675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f9676;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f9674 = AbstractC3693.m6334("name");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long f9673 = AbstractC3693.m6334("ordinal");

    public C3780(String str, long j) {
        this.f9676 = str;
        this.f9675 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3780.class == obj.getClass()) {
            C3780 c3780 = (C3780) obj;
            if (this.f9675 == c3780.f9675 && Objects.equals(this.f9676, c3780.f9676)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9676, Long.valueOf(this.f9675));
    }

    public final String toString() {
        return this.f9676;
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6513(C3759 c3759) {
        Object obj;
        AbstractC3785 abstractC3785 = c3759.f9616;
        C3759 c37592 = c3759.f9618;
        AbstractC3755 abstractC3755 = c3759.f9619;
        Object obj2 = c37592 == null ? c3759.f9615 : c37592.f9614;
        if (obj2 == null) {
            return;
        }
        boolean z = obj2 instanceof Map;
        Collection jSONArray = null;
        Long lValueOf = null;
        String str = this.f9676;
        if (z) {
            Map map = (Map) obj2;
            Object value = map.get(str);
            if (value == null) {
                boolean zM6248 = AbstractC3682.m6248(str);
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    if ((key instanceof Enum) && ((Enum) key).name().equals(str)) {
                        value = entry.getValue();
                        break;
                    } else if (key instanceof Long) {
                        if (lValueOf == null && zM6248) {
                            lValueOf = Long.valueOf(Long.parseLong(str));
                        }
                        if (key.equals(lValueOf)) {
                            value = entry.getValue();
                            break;
                        }
                    }
                }
            }
            c3759.f9614 = value;
            return;
        }
        if (obj2 instanceof Collection) {
            Collection collection = (Collection) obj2;
            int size = collection.size();
            for (Object obj3 : collection) {
                if ((obj3 instanceof Map) && (obj = ((Map) obj3).get(str)) != null) {
                    if (!(obj instanceof Collection)) {
                        if (jSONArray == null) {
                            jSONArray = new JSONArray(size);
                        }
                        jSONArray.add(obj);
                    } else if (size == 1) {
                        jSONArray = (Collection) obj;
                    } else {
                        if (jSONArray == null) {
                            jSONArray = new JSONArray(size);
                        }
                        jSONArray.addAll((Collection) obj);
                    }
                }
            }
            c3759.f9614 = jSONArray;
            return;
        }
        if (obj2 instanceof C3754) {
            List list = ((C3754) obj2).f9605;
            JSONArray jSONArray2 = new JSONArray(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                c3759.f9614 = it2.next();
                C3759 c37593 = new C3759(abstractC3755, c3759, c3759.f9617, abstractC3785);
                mo6513(c37593);
                Object obj4 = c37593.f9614;
                if (obj4 != null || (abstractC3755.f9607 & JSONPath$Feature.KeepNullValue.mask) != 0) {
                    if (obj4 instanceof Collection) {
                        jSONArray2.addAll((Collection) obj4);
                    } else {
                        jSONArray2.add(obj4);
                    }
                }
            }
            if (abstractC3785 != null) {
                c3759.f9614 = new C3754(jSONArray2);
            } else {
                c3759.f9614 = jSONArray2;
            }
            c3759.f9620 = true;
            return;
        }
        InterfaceC9352 interfaceC9352M6587 = abstractC3755.m6939().m6587(obj2.getClass());
        boolean z2 = interfaceC9352M6587 instanceof C9353;
        long j = this.f9675;
        if (z2) {
            AbstractC9323 abstractC9323Mo14650 = interfaceC9352M6587.mo14650(j);
            if (abstractC9323Mo14650 != null) {
                c3759.f9614 = abstractC9323Mo14650.mo14554(obj2);
                return;
            }
            return;
        }
        if (j == f9674 && (obj2 instanceof Enum)) {
            c3759.f9614 = ((Enum) obj2).name();
            return;
        }
        if (j == f9673 && (obj2 instanceof Enum)) {
            c3759.f9614 = Integer.valueOf(((Enum) obj2).ordinal());
            return;
        }
        if (!(obj2 instanceof String)) {
            if ((obj2 instanceof Number) || (obj2 instanceof Boolean)) {
                c3759.f9614 = null;
                return;
            } else {
                C1123.m1410(AbstractC3275.m5141(obj2, new StringBuilder("not support : ")));
                return;
            }
        }
        String str2 = (String) obj2;
        if (str2.isEmpty() || str2.charAt(0) != '{') {
            c3759.f9614 = null;
            return;
        }
        c3759.f9614 = AbstractC3755.m6938("$." + str).mo6507(AbstractC3732.m6651(str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if ((r5 instanceof com.alibaba.fastjson2.C3772) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0136  */
    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6514(AbstractC3732 abstractC3732, C3759 c3759) {
        Object objMo6744;
        Object objMo67442;
        C3759 c37592 = c3759.f9618;
        AbstractC3785 abstractC3785 = c3759.f9616;
        if (c37592 != null) {
            if (!c37592.f9620) {
                AbstractC3785 abstractC37852 = c37592.f9617;
                if (!(abstractC37852 instanceof AbstractC3711)) {
                }
            }
            mo6513(c3759);
            return;
        }
        boolean z = abstractC3732.f9544;
        long j = this.f9675;
        if (z) {
            if (abstractC3732.mo6708()) {
                while (!abstractC3732.mo6712()) {
                    long jMo6689 = abstractC3732.mo6689();
                    if (jMo6689 != 0) {
                        if (jMo6689 == j) {
                            if ((abstractC3732.mo6729() || abstractC3732.mo6737()) && abstractC3785 != null) {
                                return;
                            }
                            c3759.f9614 = abstractC3732.mo6684();
                            c3759.f9620 = true;
                            return;
                        }
                        abstractC3732.mo6793();
                    }
                }
                return;
            }
            if (!abstractC3732.mo6729() || c37592 == null || !(c37592.f9617 instanceof C3786)) {
                C1123.m1410("TODO");
                return;
            }
            JSONArray jSONArray = new JSONArray();
            int iMo6792 = abstractC3732.mo6792();
            for (int i = 0; i < iMo6792; i++) {
                if (abstractC3732.mo6703((byte) -90)) {
                    while (!abstractC3732.mo6703((byte) -91)) {
                        if (abstractC3732.mo6689() != j) {
                            abstractC3732.mo6793();
                        } else if ((abstractC3732.mo6729() || abstractC3732.mo6737()) && abstractC3785 != null) {
                            break;
                        } else {
                            jSONArray.add(abstractC3732.mo6684());
                        }
                    }
                } else {
                    abstractC3732.mo6793();
                }
            }
            c3759.f9614 = jSONArray;
            c3759.f9620 = true;
            return;
        }
        boolean zMo6708 = abstractC3732.mo6708();
        char c = abstractC3732.f9538;
        char c2 = '\"';
        if (zMo6708) {
            if (c == '}') {
                abstractC3732.mo6733();
                if (abstractC3732.mo6725()) {
                    return;
                } else {
                    abstractC3732.mo6705();
                }
            }
            while (!abstractC3732.mo6712()) {
                if (abstractC3732.mo6689() == j) {
                    char c3 = abstractC3732.f9538;
                    if (c3 == '\"' || c3 == '\'') {
                        objMo67442 = abstractC3732.mo6744();
                    } else if (c3 == '+' || c3 == '-') {
                        abstractC3732.mo6755();
                        objMo67442 = abstractC3732.m6663();
                    } else if (c3 == '[') {
                        if (abstractC3785 != null && !(abstractC3785 instanceof InterfaceC3773) && !(abstractC3785 instanceof C3780) && !(abstractC3785 instanceof C3786)) {
                            return;
                        }
                        objMo67442 = abstractC3732.mo6685();
                        c3759.f9620 = true;
                    } else if (c3 == 'f') {
                        objMo67442 = Boolean.valueOf(abstractC3732.mo6668());
                    } else if (c3 == 'n') {
                        abstractC3732.mo6762();
                        objMo67442 = null;
                    } else if (c3 != 't') {
                        if (c3 != '{') {
                            switch (c3) {
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
                                    C1123.m1402(abstractC3732.f9538, "TODO : ");
                                    return;
                            }
                        } else {
                            if (abstractC3785 != null && !(abstractC3785 instanceof InterfaceC3773) && !(abstractC3785 instanceof C3786)) {
                                return;
                            }
                            objMo67442 = abstractC3732.mo6754();
                            c3759.f9620 = true;
                        }
                    }
                    c3759.f9614 = objMo67442;
                    return;
                }
                abstractC3732.mo6793();
                if (abstractC3732.f9538 == ',') {
                    abstractC3732.mo6733();
                }
            }
            abstractC3732.mo6733();
            return;
        }
        if (c == '[' && c37592 != null && (c37592.f9617 instanceof C3786)) {
            abstractC3732.mo6733();
            JSONArray jSONArray2 = new JSONArray();
            while (true) {
                char c4 = abstractC3732.f9538;
                if (c4 != 26) {
                    if (c4 == ']') {
                        abstractC3732.mo6733();
                    } else {
                        if (c4 == '{') {
                            abstractC3732.mo6733();
                            while (true) {
                                if (abstractC3732.f9538 == '}') {
                                    abstractC3732.mo6733();
                                } else {
                                    if (abstractC3732.mo6689() == j) {
                                        char c5 = abstractC3732.f9538;
                                        if (c5 == c2 || c5 == '\'') {
                                            objMo6744 = abstractC3732.mo6744();
                                        } else {
                                            if (c5 != '+') {
                                                if (c5 != '[') {
                                                    if (c5 == 'f') {
                                                        objMo6744 = Boolean.valueOf(abstractC3732.mo6668());
                                                    } else if (c5 == 'n') {
                                                        abstractC3732.mo6762();
                                                        objMo6744 = null;
                                                    } else if (c5 != 't') {
                                                        if (c5 != '{') {
                                                            if (c5 != '-' && c5 != '.') {
                                                                switch (c5) {
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
                                                                        C1123.m1402(abstractC3732.f9538, "TODO : ");
                                                                        return;
                                                                }
                                                            }
                                                        } else if (abstractC3785 == null) {
                                                            objMo6744 = abstractC3732.mo6754();
                                                        }
                                                    }
                                                } else if (abstractC3785 == null) {
                                                    objMo6744 = abstractC3732.mo6685();
                                                }
                                            }
                                            abstractC3732.mo6755();
                                            objMo6744 = abstractC3732.m6663();
                                        }
                                        jSONArray2.add(objMo6744);
                                    } else {
                                        abstractC3732.mo6793();
                                        if (abstractC3732.f9538 == ',') {
                                            abstractC3732.mo6733();
                                        }
                                    }
                                    c2 = '\"';
                                }
                            }
                        } else {
                            abstractC3732.mo6793();
                        }
                        if (abstractC3732.f9538 == ',') {
                            abstractC3732.mo6733();
                        }
                        c2 = '\"';
                    }
                }
            }
            c3759.f9614 = jSONArray2;
        }
    }
}
