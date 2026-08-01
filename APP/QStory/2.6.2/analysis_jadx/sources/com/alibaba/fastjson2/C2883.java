package com.alibaba.fastjson2;

import bsh.classpath.C2603;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2883 extends AbstractC2951 implements InterfaceC2939 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f9116;

    public C2883(ArrayList arrayList) {
        this.f9116 = arrayList;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5908(C2925 c2925) {
        C2925 c29252 = c2925.f9271;
        Object obj = c29252 == null ? c2925.f9268 : c29252.f9267;
        new ArrayList();
        List list = (List) this.f9116.stream().sorted(Comparator.comparing(new C2603(2))).collect(Collectors.toList());
        boolean z = false;
        if (!(obj instanceof List)) {
            Iterator it = list.iterator();
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                AbstractC2877 abstractC2877 = (AbstractC2877) it.next();
                boolean z3 = abstractC2877.f9099;
                boolean zMo5910 = abstractC2877.mo5910(c2925, obj);
                if (!z3) {
                    if (zMo5910) {
                        z = true;
                        break;
                    }
                    z2 = z3;
                } else if (!zMo5910) {
                    break;
                } else {
                    z2 = z3;
                }
            }
            if (z) {
                c2925.f9267 = obj;
            }
            c2925.f9273 = true;
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
                AbstractC2877 abstractC28772 = (AbstractC2877) it2.next();
                boolean z5 = abstractC28772.f9099;
                boolean zMo59102 = abstractC28772.mo5910(c2925, obj2);
                if (z5) {
                    if (!zMo59102) {
                        z4 = false;
                        break;
                    }
                    z4 = z5;
                } else {
                    if (zMo59102) {
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
        c2925.f9267 = jSONArray;
        c2925.f9273 = true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2951
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5909(AbstractC2898 abstractC2898, C2925 c2925) {
        if (c2925.f9271 == null) {
            c2925.f9268 = abstractC2898.mo6078();
        }
        mo5908(c2925);
    }
}
