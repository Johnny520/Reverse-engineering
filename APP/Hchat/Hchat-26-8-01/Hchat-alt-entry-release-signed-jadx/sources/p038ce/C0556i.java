package p038ce;

import ae.C0077h;
import java.util.List;
import java.util.function.Predicate;
import md.C2825b;
import md.C2829f;
import md.EnumC2824a;
import p233pd.EnumC3400k;
import p246qd.C3514r;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4317m;
import td.C4145a;

/* JADX INFO: renamed from: ce.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0556i implements Predicate {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1740g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4322r f1741h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f1740g) {
            case 0:
                C4305a c4305a = (C4305a) obj;
                if (c4305a.f9217g.mo6235a(EnumC2824a.f9168u)) {
                    if (c4305a.f14352m.isEmpty() && c4305a.f14353n.isEmpty()) {
                        C0077h c0077h = (C0077h) c4305a.f9217g.mo6237c(C2825b.f9177D);
                        if (c0077h != null) {
                            c0077h.f245i.remove(c4305a);
                        }
                    } else {
                        C0559l.f1748g.mo6265s(c4305a, "Block {} not deleted, method: {}", this.f1741h);
                    }
                }
                break;
            default:
                C3514r c3514r = (C3514r) obj;
                C2829f c2829f = c3514r.f9217g;
                EnumC2824a enumC2824a = EnumC2824a.f9168u;
                if (!c2829f.mo6235a(enumC2824a)) {
                    C4320p c4320p = c3514r.f11420j;
                    if (c4320p != null && c4320p.f14396k == EnumC3400k.f10967S) {
                        if (c4320p.f9217g.mo6236b(C2825b.f9182I)) {
                            InterfaceC4317m interfaceC4317mM3342g = this.f1741h.f14411l.f14371k.f14442h.m3342g((C4145a) c4320p);
                            C4322r c4322r = interfaceC4317mM3342g instanceof C4322r ? (C4322r) interfaceC4317mM3342g : null;
                            if (c4322r != null) {
                                if (c4322r.f9217g.mo6236b(C2825b.f9202q)) {
                                    int iM8684T = c4320p.m8684T(c3514r);
                                    List listM8694S = c4322r.m8694S();
                                    if (iM8684T >= 0 && iM8684T < listM8694S.size()) {
                                        C3514r c3514r2 = (C3514r) listM8694S.get(iM8684T);
                                        if (c3514r2.f9217g.mo6235a(enumC2824a) && c3514r.mo7375I().equals(c3514r2.mo7375I())) {
                                            c3514r.m6231w(EnumC2824a.f9166s);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ce.l.o(ud.r):void] */
    public /* synthetic */ C0556i(C4322r c4322r) {
        this.f1741h = c4322r;
    }
}
