package com.alibaba.fastjson2;

import bsh.classpath.C3437;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3717 extends AbstractC3785 implements InterfaceC3773 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f9463;

    public C3717(ArrayList arrayList) {
        this.f9463 = arrayList;
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6513(C3759 c3759) {
        C3759 c37592 = c3759.f9618;
        Object obj = c37592 == null ? c3759.f9615 : c37592.f9614;
        new ArrayList();
        List list = (List) this.f9463.stream().sorted(Comparator.comparing(new C3437(2))).collect(Collectors.toList());
        boolean z = false;
        if (!(obj instanceof List)) {
            Iterator it = list.iterator();
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                AbstractC3711 abstractC3711 = (AbstractC3711) it.next();
                boolean z3 = abstractC3711.f9446;
                boolean zMo6515 = abstractC3711.mo6515(c3759, obj);
                if (!z3) {
                    if (zMo6515) {
                        z = true;
                        break;
                    }
                    z2 = z3;
                } else if (!zMo6515) {
                    break;
                } else {
                    z2 = z3;
                }
            }
            if (z) {
                c3759.f9614 = obj;
            }
            c3759.f9620 = true;
            return;
        }
        List list2 = (List) obj;
        JSONArray jSONArray = new JSONArray(list2.size());
        for (int i = 0; i < list2.size(); i++) {
            Object obj2 = list2.get(i);
            Iterator it2 = list.iterator();
            boolean z4 = false;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC3711 abstractC37112 = (AbstractC3711) it2.next();
                boolean z5 = abstractC37112.f9446;
                boolean zMo65152 = abstractC37112.mo6515(c3759, obj2);
                if (z5) {
                    if (!zMo65152) {
                        z4 = false;
                        break;
                    }
                    z4 = z5;
                } else {
                    if (zMo65152) {
                        z4 = true;
                        break;
                    }
                    z4 = z5;
                }
            }
            if (z4) {
                jSONArray.add(obj2);
            }
        }
        c3759.f9614 = jSONArray;
        c3759.f9620 = true;
    }

    @Override // com.alibaba.fastjson2.AbstractC3785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6514(AbstractC3732 abstractC3732, C3759 c3759) {
        if (c3759.f9618 == null) {
            c3759.f9615 = abstractC3732.mo6684();
        }
        mo6513(c3759);
    }
}
