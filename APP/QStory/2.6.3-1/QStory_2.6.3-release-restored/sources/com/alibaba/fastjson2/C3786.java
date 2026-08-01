package com.alibaba.fastjson2;

import androidx.collection.C1123;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p307.AbstractC9323;
import p307.C9368;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3786 extends AbstractC3785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f9690;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3786 f9689 = new C3786(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3786 f9688 = new C3786(true);

    public C3786(boolean z) {
        this.f9690 = z;
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6513(C3759 c3759) {
        C3759 c37592 = c3759.f9618;
        AbstractC3785 abstractC3785 = c3759.f9616;
        Object obj = c37592 == null ? c3759.f9615 : c37592.f9614;
        if (obj == null) {
            c3759.f9614 = null;
            c3759.f9620 = true;
            return;
        }
        boolean z = obj instanceof Map;
        boolean z2 = this.f9690;
        if (z) {
            Map map = (Map) obj;
            JSONArray jSONArray = new JSONArray(map.size());
            for (Object obj2 : map.values()) {
                if (z2 && (obj2 instanceof Collection)) {
                    jSONArray.addAll((Collection) obj2);
                } else {
                    jSONArray.add(obj2);
                }
            }
            if (abstractC3785 != null) {
                c3759.f9614 = new C3754(jSONArray);
            } else {
                c3759.f9614 = jSONArray;
            }
            c3759.f9620 = true;
            return;
        }
        int i = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            JSONArray jSONArray2 = new JSONArray(list.size());
            if (abstractC3785 != null || z2) {
                if (abstractC3785 != null) {
                    c3759.f9614 = new C3754(list);
                } else {
                    c3759.f9614 = obj;
                }
                c3759.f9620 = true;
                return;
            }
            while (i < list.size()) {
                Object obj3 = list.get(i);
                if (obj3 instanceof Map) {
                    jSONArray2.addAll(((Map) obj3).values());
                } else {
                    jSONArray2.add(obj3);
                }
                i++;
            }
            c3759.f9614 = jSONArray2;
            c3759.f9620 = true;
            return;
        }
        if (obj instanceof Collection) {
            c3759.f9614 = obj;
            c3759.f9620 = true;
            return;
        }
        if (!(obj instanceof C3754)) {
            C9368 c9368 = c3759.f9619.m6939().f9499;
            Class<?> cls = obj.getClass();
            List listMo14657 = c9368.m14665(cls, cls, false).mo14657();
            int size = listMo14657.size();
            JSONArray jSONArray3 = new JSONArray(size);
            while (i < size) {
                jSONArray3.add(((AbstractC9323) listMo14657.get(i)).mo14554(obj));
                i++;
            }
            c3759.f9614 = jSONArray3;
            c3759.f9620 = true;
            return;
        }
        List list2 = ((C3754) obj).f9605;
        JSONArray jSONArray4 = new JSONArray(list2.size());
        if (abstractC3785 != null) {
            c3759.f9614 = new C3754(list2);
            c3759.f9620 = true;
            return;
        }
        while (i < list2.size()) {
            Object obj4 = list2.get(i);
            if ((obj4 instanceof Map) && !z2) {
                jSONArray4.addAll(((Map) obj4).values());
            } else if (obj4 instanceof Collection) {
                jSONArray4.addAll((Collection) obj4);
            } else {
                jSONArray4.add(obj4);
            }
            i++;
        }
        c3759.f9614 = jSONArray4;
        c3759.f9620 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
    
        r9.f9614 = r0;
        r9.f9620 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6514(AbstractC3732 abstractC3732, C3759 c3759) {
        Object objMo6744;
        C3759 c37592 = c3759.f9618;
        AbstractC3785 abstractC3785 = c3759.f9616;
        if (c37592 != null && c37592.f9620) {
            mo6513(c3759);
            return;
        }
        if (abstractC3732.mo6725()) {
            c3759.f9620 = true;
            return;
        }
        if (abstractC3732.f9544) {
            JSONArray jSONArray = new JSONArray();
            if (!abstractC3732.mo6703((byte) -90)) {
                if (!abstractC3732.mo6729() || abstractC3785 == null) {
                    C1123.m1410("TODO");
                    return;
                }
                return;
            }
            while (!abstractC3732.mo6703((byte) -91)) {
                abstractC3732.mo6794();
                Object objMo6684 = abstractC3732.mo6684();
                if (this.f9690 && (objMo6684 instanceof Collection)) {
                    jSONArray.addAll((Collection) objMo6684);
                } else {
                    jSONArray.add(objMo6684);
                }
            }
            c3759.f9614 = jSONArray;
            return;
        }
        boolean z = abstractC3785 == null && (c3759.f9619.f9607 & JSONPath$Feature.AlwaysReturnList.mask) != 0;
        JSONArray jSONArray2 = new JSONArray();
        if (!abstractC3732.mo6708()) {
            if (abstractC3732.f9538 == '[') {
                abstractC3732.mo6733();
                while (abstractC3732.f9538 != ']') {
                    jSONArray2.add(abstractC3732.mo6684());
                    if (abstractC3732.f9538 == ',') {
                        abstractC3732.mo6733();
                    }
                }
                abstractC3732.mo6733();
                if (abstractC3785 != null) {
                    c3759.f9614 = new C3754(jSONArray2);
                } else {
                    c3759.f9614 = jSONArray2;
                }
                c3759.f9620 = true;
                return;
            }
            return;
        }
        while (true) {
            if (abstractC3732.f9538 == '}') {
                abstractC3732.mo6733();
            } else {
                abstractC3732.mo6794();
                char c = abstractC3732.f9538;
                if (c == '\"' || c == '\'') {
                    objMo6744 = abstractC3732.mo6744();
                } else if (c == '+' || c == '-') {
                    abstractC3732.mo6755();
                    objMo6744 = abstractC3732.m6663();
                } else if (c == '[') {
                    objMo6744 = abstractC3732.mo6685();
                } else if (c == ']') {
                    abstractC3732.mo6733();
                } else if (c == 'f') {
                    objMo6744 = Boolean.valueOf(abstractC3732.mo6668());
                } else if (c == 'n') {
                    abstractC3732.mo6762();
                    objMo6744 = null;
                } else if (c != 't') {
                    if (c != '{') {
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
                                C1123.m1402(abstractC3732.f9538, "TODO : ");
                                return;
                        }
                    } else {
                        objMo6744 = abstractC3732.mo6754();
                    }
                }
                if (!(objMo6744 instanceof Collection) || z) {
                    jSONArray2.add(objMo6744);
                } else {
                    jSONArray2.addAll((Collection) objMo6744);
                }
                if (abstractC3732.f9538 == ',') {
                    abstractC3732.mo6733();
                }
            }
        }
    }
}
