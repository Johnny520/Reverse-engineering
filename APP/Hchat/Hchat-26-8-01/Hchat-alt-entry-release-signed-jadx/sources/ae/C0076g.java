package ae;

import be.AbstractC0269a;
import be.C0271b;
import be.C0275d;
import be.C0284h0;
import bsh.GeneratedClass;
import bsh.This;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import md.C2825b;
import md.EnumC2824a;
import na.C2917e;
import ne.C2995a;
import p074f5.C1071g;
import p082fd.C1211h;
import p083fe.C1214a;
import p109hb.C1695r;
import p199nd.C2960a;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;
import p215od.C3128a;
import p215od.C3131d;
import p227p4.C3315t;
import p233pd.AbstractC3391b;
import p233pd.C3399j;
import p233pd.C3403n;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3507k;
import p246qd.C3510n;
import p246qd.C3514r;
import p246qd.C3515s;
import p247qe.C3523f;
import p247qe.C3524g;
import p247qe.C3525h;
import p247qe.C3526i;
import p247qe.C3527j;
import p247qe.C3531n;
import p247qe.InterfaceC3521d;
import p289te.C4148b;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4317m;
import p351xe.C5787h;
import p351xe.C5791l;
import p369yd.C6028b;
import p384ze.C6141c;
import td.C4145a;
import td.C4146b;

/* JADX INFO: renamed from: ae.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0076g implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f242b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0076g(Object obj, int i9) {
        this.f241a = i9;
        this.f242b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        AbstractC3506j abstractC3506jMo2220e;
        InterfaceC3521d c3524g;
        AbstractC3506j abstractC3506j;
        C4309e c4309eM8715f;
        InterfaceC3521d c3524g2;
        InterfaceC4317m interfaceC4317mM3342g;
        switch (this.f241a) {
            case 0:
                ((C0075f) obj).f238g = (C0077h) this.f242b;
                break;
            case 1:
                ((C0275d) this.f242b).mo1054h((C4309e) obj);
                break;
            case 2:
                C3507k c3507k = (C3507k) this.f242b;
                C3515s c3515s = (C3515s) obj;
                if (c3515s.f11448m != null) {
                    C3507k c3507kM7398b = c3515s.m7398b();
                    if (c3507kM7398b.f11416f) {
                        c3507k.f11416f = true;
                    }
                    if (c3507kM7398b.f11415e) {
                        c3507k.f11415e = true;
                    }
                    if (c3507kM7398b.f11414d) {
                        c3507k.f11414d = true;
                    }
                }
                c3515s.m7408m(c3507k);
                break;
            case 3:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f242b;
                C3515s c3515s2 = ((C3514r) ((AbstractC3508l) obj)).f11440m;
                if (linkedHashSet.add(c3515s2)) {
                    C0271b.m1104v(c3515s2.m7403g(), linkedHashSet);
                }
                break;
            case 4:
                C0284h0 c0284h0 = (C0284h0) this.f242b;
                C4309e c4309e = (C4309e) obj;
                try {
                    C0284h0.m1191k(c4309e);
                } catch (Exception | StackOverflowError e6) {
                    c4309e.getClass();
                    C5787h.m10468a(c4309e, "Anonymous visitor error", e6);
                }
                c4309e.f14382v.forEach(new C0076g(c0284h0, 4));
                break;
            case 5:
                This.initClassInstanceThis((GeneratedClass) this.f242b, (String) obj);
                break;
            case 6:
                ((C6141c) this.f242b).m10907a((C4305a) obj);
                break;
            case 7:
                ((C0075f) this.f242b).f235d.add((C4305a) obj);
                break;
            case 8:
                ((C1211h) this.f242b).f4071g = ((Boolean) obj).booleanValue();
                break;
            case 9:
                ((ArrayList) ((C1695r) this.f242b).f5639d).add((InterfaceC4312h) obj);
                break;
            case 10:
                ((Set) this.f242b).add((C4305a) obj);
                break;
            case 11:
                ((Map) obj).remove((InterfaceC3124a) this.f242b);
                break;
            case 12:
                InterfaceC3125b interfaceC3125b = (InterfaceC3125b) this.f242b;
                ((Map) obj).put(interfaceC3125b.mo441a(), interfaceC3125b);
                break;
            case 13:
                InterfaceC3125b interfaceC3125b2 = (InterfaceC3125b) obj;
                ((Map) this.f242b).put(interfaceC3125b2.mo441a(), interfaceC3125b2);
                break;
            case 14:
                ((C2917e) this.f242b).m6327d((String) obj);
                break;
            case 15:
                ((C2995a) this.f242b).mo1054h((C4309e) obj);
                break;
            case 16:
                C3531n c3531n = (C3531n) this.f242b;
                C3515s c3515s3 = (C3515s) obj;
                C3315t c3315t = c3515s3.f11447l;
                ((LinkedHashSet) c3315t.f10678i).clear();
                C3514r c3514r = c3515s3.f11444i;
                C3515s c3515s4 = c3514r.f11440m;
                AbstractC3506j abstractC3506jM7400d = c3515s4 != null ? c3515s4.m7400d() : c3514r.f9217g.mo6235a(EnumC2824a.f9128N) ? c3514r.f11419i : null;
                EnumC2824a enumC2824a = EnumC2824a.f9139Y;
                if (abstractC3506jM7400d != null) {
                    C3531n.m7437i(c3315t, new C3524g(1, 0, abstractC3506jM7400d));
                } else {
                    C4320p c4320p = c3514r.f11420j;
                    if (c4320p == null || c4320p.f14397l == null) {
                        C3531n.m7437i(c3315t, new C3524g(1, 0, c3514r.f11419i));
                    } else {
                        int iOrdinal = c4320p.f14396k.ordinal();
                        if (iOrdinal == 0) {
                            C3531n.m7437i(c3315t, new C3524g(1, 0, ((C3510n) c4320p.mo7179S(0)).f11419i));
                        } else if (iOrdinal == 12) {
                            C0072c c0072c = (C0072c) c4320p.f9217g.mo6237c(C2825b.f9178E);
                            if (c0072c != null) {
                                Iterator it = c0072c.f229g.f232a.iterator();
                                while (it.hasNext()) {
                                    C3531n.m7437i(c3315t, new C3524g(1, 0, ((C3128a) it.next()).f10138g));
                                }
                            } else {
                                C3531n.m7437i(c3315t, new C3524g(1, 0, c4320p.f14397l.f11419i));
                            }
                        } else if (iOrdinal != 20) {
                            if (iOrdinal == 34) {
                                C3403n c3403n = (C3403n) c4320p;
                                AbstractC3506j abstractC3506j2 = c3403n.f11005p.f10151h;
                                InterfaceC4317m interfaceC4317mM3342g2 = c3531n.f11493g.f14442h.m3342g(c3403n);
                                if (interfaceC4317mM3342g2 == null || (abstractC3506jMo2220e = interfaceC4317mM3342g2.mo2220e()) == null || !abstractC3506jMo2220e.m7364b()) {
                                    abstractC3506jMo2220e = null;
                                }
                                if (abstractC3506jMo2220e == null) {
                                    c3524g = new C3524g(1, 0, abstractC3506j2);
                                    C3531n.m7437i(c3315t, c3524g);
                                } else {
                                    if (abstractC3506jMo2220e.m7365c()) {
                                        int i9 = c3403n.f11004o;
                                        if (c3403n.f14398m.size() != 0 && i9 != 1 && i9 != 5) {
                                            c3524g = new C3526i(c3531n.f11493g, c3403n, abstractC3506jMo2220e);
                                        }
                                        C3531n.m7437i(c3315t, c3524g);
                                    } else {
                                        abstractC3506j2 = abstractC3506jMo2220e;
                                    }
                                    c3524g = new C3524g(1, 0, abstractC3506j2);
                                    C3531n.m7437i(c3315t, c3524g);
                                }
                            } else if (iOrdinal == 38) {
                                C4145a c4145a = (C4145a) c4320p;
                                boolean z9 = c4145a.f13663p == 1;
                                C3131d c3131d = c4145a.f13662o;
                                if (!z9 || (c4309eM8715f = c3531n.f11493g.m8715f(c3131d.f10153j)) == null) {
                                    abstractC3506j = c3131d.f10153j.f10138g;
                                    C3531n.m7437i(c3315t, new C3524g(1, 0, abstractC3506j));
                                } else if (c4309eM8715f.f9217g.mo6235a(EnumC2824a.f9166s)) {
                                    C2960a c2960a = (C2960a) c4309eM8715f.f9217g.mo6237c(C2825b.f9193h);
                                    if (c2960a != null && c2960a.f9711i == 1) {
                                        abstractC3506j = c2960a.f9710h;
                                    }
                                    C3531n.m7437i(c3315t, new C3524g(1, 0, abstractC3506j));
                                }
                            } else if (iOrdinal == 29) {
                                C3531n.m7437i(c3315t, new C3524g(1, 0, (AbstractC3506j) ((C3399j) c4320p).f10948o));
                            } else if (iOrdinal != 30) {
                                C3531n.m7437i(c3315t, new C3524g(1, 0, c4320p.f14397l.f11419i));
                            } else {
                                C3399j c3399j = (C3399j) c4320p;
                                AbstractC3506j abstractC3506j3 = c3399j.f14397l.f11419i;
                                C3531n.m7437i(c3315t, abstractC3506j3.m7365c() ? new C3525h(c3531n.f11493g, c3399j, abstractC3506j3) : new C3524g(1, 0, abstractC3506j3));
                            }
                        } else if (!c4320p.f9217g.mo6235a(enumC2824a)) {
                            C3531n.m7437i(c3315t, new C3523f(c3531n.f11493g, (C3399j) c4320p));
                        }
                    }
                }
                for (C3514r c3514r2 : c3515s3.f11445j) {
                    C4320p c4320p2 = c3514r2.f11420j;
                    if (c4320p2 != null) {
                        if (c4320p2 instanceof AbstractC3391b) {
                            AbstractC3391b abstractC3391b = (AbstractC3391b) c4320p2;
                            AbstractC3508l abstractC3508lMo7171k0 = abstractC3391b.mo7171k0();
                            if (abstractC3508lMo7171k0 != null && (interfaceC4317mM3342g = c3531n.f11493g.f14442h.m3342g(abstractC3391b)) != null) {
                                if (abstractC3508lMo7171k0 != c3514r2) {
                                    AbstractC3506j abstractC3506j4 = (AbstractC3506j) interfaceC4317mM3342g.mo2218c().get(abstractC3391b.m8684T(c3514r2) - abstractC3391b.mo7170j0());
                                    c3524g2 = !abstractC3506j4.m7365c() ? null : new C3527j(c3531n.f11493g, abstractC3391b, c3514r2, abstractC3506j4);
                                    if (c3524g2 == null) {
                                    }
                                } else {
                                    if (interfaceC4317mM3342g instanceof C4322r) {
                                        c3524g2 = new C3524g(2, 0, C1214a.m3337h((C4322r) interfaceC4317mM3342g).f10138g);
                                    }
                                    if (c3524g2 == null) {
                                    }
                                }
                            }
                        } else {
                            c3524g2 = (c4320p2.f14396k == EnumC3400k.f10949A && c4320p2.f9217g.mo6235a(enumC2824a)) ? null : new C3524g(2, 0, c3514r2.f11419i);
                        }
                    }
                    C3531n.m7437i(c3315t, c3524g2);
                }
                break;
            case 17:
                ((C1071g) this.f242b).m2700c((C3514r) obj);
                break;
            case 18:
                ((C3403n) this.f242b).mo7178I((AbstractC3508l) obj);
                break;
            case 19:
                ((C4146b) this.f242b).m8685V((C4320p) obj);
                break;
            case 20:
                ((Consumer) obj).accept((C4148b) this.f242b);
                break;
            case 21:
                AbstractC0269a abstractC0269a = (AbstractC0269a) obj;
                ((IdentityHashMap) ((C5791l) this.f242b).f23538c).put(abstractC0269a, abstractC0269a.mo1051e());
                break;
            case 22:
                ((StringBuilder) this.f242b).append((String) obj);
                break;
            default:
                ((C6028b) obj).m10798P((Consumer) this.f242b);
                break;
        }
    }
}
