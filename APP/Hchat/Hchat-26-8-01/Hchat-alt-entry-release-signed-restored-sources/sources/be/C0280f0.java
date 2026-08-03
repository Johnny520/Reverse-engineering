package be;

import ae.C0074e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import nc.C2958a;
import p025bc.C0259i;
import p083fe.C1214a;
import p136j8.C2095f;
import p215od.C3128a;
import p215od.C3129b;
import p215od.C3130c;
import p246qd.AbstractC3506j;
import p289te.C4147a;
import p289te.C4148b;
import p302ud.C4309e;
import p302ud.C4322r;
import p302ud.C4325u;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: be.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0280f0 implements BiConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f817a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f818b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f819c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0280f0(C0284h0 c0284h0, HashSet hashSet, HashMap map) {
        this.f817a = 1;
        this.f818b = hashSet;
        this.f819c = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f817a) {
            case 0:
                ((C0271b) this.f818b).m1108s((C4322r) this.f819c, (C2958a) obj2);
                break;
            case 1:
                HashSet hashSet = (HashSet) this.f818b;
                HashMap map = (HashMap) this.f819c;
                C4309e c4309e = (C4309e) obj;
                if (((List) obj2).isEmpty()) {
                    hashSet.clear();
                    while (hashSet.add(c4309e)) {
                        C4309e c4309e2 = (C4309e) map.get(c4309e);
                        if (c4309e2 == null) {
                            C4309e c4309eM8656a0 = c4309e.m8656a0();
                            if (hashSet.size() > 2) {
                                List arrayList = c4309eM8656a0.f14366A;
                                if (arrayList.isEmpty()) {
                                    arrayList = new ArrayList(hashSet.size());
                                    c4309eM8656a0.f14366A = arrayList;
                                }
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((C4309e) it.next()).m8656a0());
                                }
                                break;
                            }
                        } else {
                            c4309e = c4309e2;
                        }
                    }
                    c4309e.m6383L("Loop in anonymous inline: " + String.valueOf(c4309e) + ", path: " + String.valueOf(hashSet));
                    hashSet.forEach(new C0074e(7));
                }
                break;
            case 2:
                C4325u c4325u = (C4325u) this.f818b;
                C2095f c2095f = (C2095f) this.f819c;
                String str = (String) obj2;
                int iIndexOf = str.indexOf(47);
                ((C3129b) c2095f.f7001b).m6653a((Integer) obj, c4325u.f14439e.m1199h(new C3130c(C3128a.m6637e(c4325u, AbstractC3506j.m7360x("android.R$".concat(str.substring(0, iIndexOf)))), str.substring(iIndexOf + 1), AbstractC3506j.f11385b)));
                break;
            case 3:
                C4147a c4147a = (C4147a) this.f818b;
                ArrayList arrayList2 = (ArrayList) this.f819c;
                String str2 = (String) obj;
                List list = (List) obj2;
                c4147a.getClass();
                if (list.size() == 1) {
                    arrayList2.add((C4148b) list.get(0));
                } else {
                    String str3 = (String) c4147a.f13670e.get(str2);
                    if (str3 != null) {
                        list.stream().filter(new C0259i(str3, 2)).findFirst().ifPresent(new C0294m0(5, arrayList2));
                    } else {
                        C4148b c4148b = (C4148b) list.get(0);
                        arrayList2.add(c4148b);
                        C4147a.f13665g.mo6261o("Select providing '{}' plugin '{}', candidates: {}", str2, c4148b, list);
                    }
                }
                break;
            default:
                C1214a c1214a = (C1214a) this.f818b;
                HashMap map2 = (HashMap) this.f819c;
                AbstractC3506j abstractC3506j = (AbstractC3506j) obj;
                AbstractC3506j abstractC3506j2 = (AbstractC3506j) obj2;
                List listMo7346j = abstractC3506j2.mo7346j();
                if (!AbstractC5798s.m10514h(listMo7346j)) {
                    int size = listMo7346j.size();
                    List listM3340d = c1214a.m3340d(abstractC3506j2);
                    if (size == listM3340d.size()) {
                        Map map3 = (Map) map2.get(abstractC3506j.mo7350l());
                        HashMap map4 = new HashMap(size);
                        for (int i9 = 0; i9 < size; i9++) {
                            AbstractC3506j abstractC3506j3 = (AbstractC3506j) listMo7346j.get(i9);
                            AbstractC3506j abstractC3506j4 = map3 != null ? (AbstractC3506j) map3.get(abstractC3506j3) : null;
                            AbstractC3506j abstractC3506j5 = (AbstractC3506j) listM3340d.get(i9);
                            if (abstractC3506j4 != null) {
                                abstractC3506j3 = abstractC3506j4;
                            }
                            map4.put(abstractC3506j5, abstractC3506j3);
                        }
                        map2.put(abstractC3506j2.mo7350l(), map4);
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C0280f0(Object obj, int i9, Object obj2) {
        this.f817a = i9;
        this.f818b = obj;
        this.f819c = obj2;
    }
}
