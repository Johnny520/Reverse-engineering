package com.alibaba.fastjson2;

import bsh.classpath.C2604;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2884 extends AbstractC2952 implements InterfaceC2940 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f9118;

    public C2884(ArrayList arrayList) {
        this.f9118 = arrayList;
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5953(C2926 c2926) {
        C2926 c29262 = c2926.f9273;
        Object obj = c29262 == null ? c2926.f9270 : c29262.f9269;
        new ArrayList();
        List list = (List) this.f9118.stream().sorted(Comparator.comparing(new C2604(2))).collect(Collectors.toList());
        boolean z = false;
        if (!(obj instanceof List)) {
            Iterator it = list.iterator();
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                AbstractC2878 abstractC2878 = (AbstractC2878) it.next();
                boolean z3 = abstractC2878.f9101;
                boolean zMo5955 = abstractC2878.mo5955(c2926, obj);
                if (!z3) {
                    if (zMo5955) {
                        z = true;
                        break;
                    }
                    z2 = z3;
                } else if (!zMo5955) {
                    break;
                } else {
                    z2 = z3;
                }
            }
            if (z) {
                c2926.f9269 = obj;
            }
            c2926.f9275 = true;
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
                AbstractC2878 abstractC28782 = (AbstractC2878) it2.next();
                boolean z5 = abstractC28782.f9101;
                boolean zMo59552 = abstractC28782.mo5955(c2926, obj2);
                if (z5) {
                    if (!zMo59552) {
                        z4 = false;
                        break;
                    }
                    z4 = z5;
                } else {
                    if (zMo59552) {
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
        c2926.f9269 = jSONArray;
        c2926.f9275 = true;
    }

    @Override // com.alibaba.fastjson2.AbstractC2952
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5954(AbstractC2899 abstractC2899, C2926 c2926) {
        if (c2926.f9273 == null) {
            c2926.f9270 = abstractC2899.mo6124();
        }
        mo5953(c2926);
    }
}
