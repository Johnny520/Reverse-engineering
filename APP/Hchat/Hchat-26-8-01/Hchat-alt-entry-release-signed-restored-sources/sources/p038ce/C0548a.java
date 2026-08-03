package p038ce;

import ae.C0074e;
import ae.C0075f;
import be.AbstractC0283h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import ke.C2394c;
import ke.C2403l;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p109hb.C1695r;
import p215od.C3128a;
import p233pd.C3398i;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p246qd.C3509m;
import p246qd.C3514r;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p351xe.AbstractC5798s;
import p351xe.C5784e;
import p369yd.C6028b;
import p369yd.C6029c;

/* JADX INFO: renamed from: ce.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0548a implements Predicate {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1726g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1727h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1728i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0548a(C0075f c0075f, C4322r c4322r) {
        this.f1728i = c0075f;
        this.f1727h = c4322r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        C4322r c4322r;
        boolean z9;
        switch (this.f1726g) {
            case 0:
                C0075f c0075f = (C0075f) this.f1728i;
                C4322r c4322r2 = (C4322r) this.f1727h;
                C0075f c0075f2 = (C0075f) obj;
                if (c0075f2 != c0075f) {
                    ArrayList arrayList = c0075f2.f232a;
                    c0075f.getClass();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        c0075f.m442a(c4322r2, (C3128a) it.next());
                    }
                    c0075f2.f240i = true;
                    c0075f2.f235d.forEach(new C0074e(0));
                    break;
                }
                break;
            case 1:
                C4322r c4322r3 = (C4322r) this.f1727h;
                C4305a c4305a = (C4305a) this.f1728i;
                C4305a c4305a2 = (C4305a) obj;
                List list = c4305a2.f14352m;
                if (list.size() > 1 && list.stream().allMatch(new C0561n(2))) {
                    ArrayList<C4305a> arrayList2 = new ArrayList(list);
                    ArrayList<C4305a> arrayListM100y = AbstractC0000a.m100y(c4322r3, c4305a2, false);
                    C4320p c4320p = (C4320p) AbstractC0283h.m1141U(c4305a.f14351l);
                    if (c4320p != null && c4320p.f14396k == EnumC3400k.f10975a0) {
                        AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(0);
                        abstractC3508lMo7179S.getClass();
                        if (abstractC3508lMo7179S instanceof C3514r) {
                            int i9 = ((C3514r) abstractC3508lMo7179S).f11439l;
                            C4320p c4320pM43W = AbstractC0000a.m43W(c4305a2);
                            if (c4320pM43W != null && c4320pM43W.f14396k == EnumC3400k.f10983m && c4320pM43W.f14397l.f11439l == i9) {
                                c4305a2.f14351l.remove(0);
                            }
                        }
                    }
                    arrayList2.forEach(new C0074e(16));
                    C4305a c4305a3 = null;
                    for (C4305a c4305a4 : arrayList2) {
                        if (c4305a3 == null) {
                            c4322r = c4322r3;
                            c4305a3 = c4305a4;
                        } else {
                            C4305a c4305aM26N0 = AbstractC0000a.m26N0(c4305a4.f14353n, c4305a2);
                            C0560m.m1573p(c4305a4, c4305a2);
                            C0560m.m1573p(c4305a4, c4305aM26N0);
                            ArrayList arrayList3 = new ArrayList(arrayListM100y.size());
                            HashMap map = new HashMap();
                            for (C4305a c4305a5 : arrayListM100y) {
                                C4305a c4305aM1576s = C0560m.m1576s(c4322r3, c4305a5.f14350k);
                                C0560m.m1568k(c4305a5, c4305aM1576s);
                                arrayList3.add(c4305aM1576s);
                                map.put(c4305a5, c4305aM1576s);
                            }
                            for (C4305a c4305a6 : arrayListM100y) {
                                C4305a c4305a7 = (C4305a) map.get(c4305a6);
                                if (c4305a7 == null) {
                                    C0086a.m452k("Copy blocks tree failed. Missing block for connection: ".concat(String.valueOf(c4305a6)));
                                } else {
                                    for (C4305a c4305a8 : c4305a6.f14353n) {
                                        C4322r c4322r4 = c4322r3;
                                        C4305a c4305a9 = (C4305a) map.get(c4305a8);
                                        if (c4305a9 == null) {
                                            C0086a.m452k("Copy blocks tree failed. Missing block for connection: ".concat(String.valueOf(c4305a8)));
                                        } else {
                                            C0560m.m1567j(c4305a7, c4305a9);
                                            c4322r3 = c4322r4;
                                        }
                                    }
                                }
                                break;
                            }
                            c4322r = c4322r3;
                            C4305a c4305a10 = (C4305a) arrayList3.get(arrayListM100y.indexOf(c4305a2));
                            C4305a c4305a11 = (C4305a) arrayList3.get(arrayListM100y.indexOf(c4305a));
                            C0560m.m1567j(c4305a4, c4305a10);
                            C0560m.m1567j(c4305a11, c4305aM26N0);
                        }
                        c4322r3 = c4322r;
                    }
                    if (c4305a3 != null) {
                        C4305a c4305aM26N02 = AbstractC0000a.m26N0(c4305a3.f14353n, c4305a2);
                        C0560m.m1573p(c4305a3, c4305aM26N02);
                        C0560m.m1567j(c4305a, c4305aM26N02);
                    }
                    break;
                }
                break;
            default:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1728i;
                C1695r c1695r = (C1695r) this.f1727h;
                ArrayList arrayList4 = (ArrayList) c1695r.f5639d;
                InterfaceC4318n interfaceC4318n = (InterfaceC4318n) obj;
                if (!atomicBoolean.get()) {
                    if (interfaceC4318n instanceof C6029c) {
                        C6029c c6029c = (C6029c) interfaceC4318n;
                        C6028b c6028b = c6029c.f24475k;
                        Objects.requireNonNull(c6028b);
                        if (c6028b.f24477i == 3) {
                            c6028b = (C6028b) c6028b.f24478j.get(0);
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        C5784e c5784e = c6028b.f24479k;
                        C2403l c2403l = null;
                        if (c5784e != null) {
                            C3398i c3398i = (C3398i) c5784e.f23527b;
                            AbstractC3508l abstractC3508lMo7179S2 = c3398i.mo7179S(0);
                            abstractC3508lMo7179S2.getClass();
                            String str = abstractC3508lMo7179S2 instanceof C3509m ? (String) ((IdentityHashMap) c1695r.f5640e).get(((C3509m) abstractC3508lMo7179S2).f11421l) : null;
                            if (str != null) {
                                if (c3398i.f10945p == 2 && c3398i.mo7179S(1).m7381O()) {
                                    z9 = true;
                                }
                                if (c3398i.f10945p == 1 && c3398i.mo7179S(1).m7378L()) {
                                    z9 = true;
                                }
                                arrayList4.add(c3398i);
                                arrayList4.addAll(c6029c.f24476l);
                                c2403l = new C2403l();
                                c2403l.f7874a.add(str);
                                InterfaceC4314j interfaceC4314j = z9 ? c6029c.f24481n : c6029c.f24480m;
                                if (interfaceC4314j == null) {
                                    c2403l.f7876c = (C4305a) AbstractC5798s.m10515i(c6029c.f24476l);
                                } else {
                                    c2403l.f7875b = interfaceC4314j;
                                }
                            }
                        }
                        if (c2403l == null) {
                            atomicBoolean.set(true);
                        } else {
                            ((ArrayList) c1695r.f5641f).add(c2403l);
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    public /* synthetic */ C0548a(C2394c c2394c, AtomicBoolean atomicBoolean, C1695r c1695r) {
        this.f1728i = atomicBoolean;
        this.f1727h = c1695r;
    }

    public /* synthetic */ C0548a(C4322r c4322r, C4305a c4305a) {
        this.f1727h = c4322r;
        this.f1728i = c4305a;
    }
}
