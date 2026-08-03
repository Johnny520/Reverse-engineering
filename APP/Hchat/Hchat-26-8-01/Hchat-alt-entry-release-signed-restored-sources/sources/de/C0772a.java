package de;

import be.AbstractC0269a;
import java.util.ArrayList;
import java.util.Iterator;
import md.C2825b;
import md.EnumC2824a;
import mh.AbstractC2846d;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p038ce.C0551d;
import p157kd.AbstractC2390d;
import p214oc.C3126c;
import p232pc.C3386h;
import p232pc.C3387i;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3507k;
import p246qd.C3514r;
import p246qd.C3515s;
import p247qe.C3517a0;
import p247qe.C3541x;
import p259r9.AbstractC3754e0;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;

/* JADX INFO: renamed from: de.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0772a extends AbstractC0269a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C0772a.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m1992i(C4322r c4322r) {
        c4322r.f14404D.forEach(new C0551d(c4322r, 3));
        if (!c4322r.m8701Z()) {
            ArrayList<C4320p> arrayList = new ArrayList(c4322r.f14403C.f14352m.size());
            Iterator it = c4322r.f14403C.f14352m.iterator();
            C4320p c4320p = null;
            while (it.hasNext()) {
                C4320p c4320pM57c0 = AbstractC0000a.m57c0((C4305a) it.next());
                if (c4320pM57c0 != null) {
                    if (c4320pM57c0.f9217g.mo6235a(EnumC2824a.f9162o)) {
                        c4320p = c4320pM57c0;
                    } else {
                        arrayList.add(c4320pM57c0);
                    }
                }
            }
            if (c4320p != null) {
                for (C4320p c4320p2 : arrayList) {
                    AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(0);
                    AbstractC3508l abstractC3508lMo7179S2 = c4320p2.mo7179S(0);
                    abstractC3508lMo7179S.getClass();
                    if (abstractC3508lMo7179S instanceof C3514r) {
                        abstractC3508lMo7179S2.getClass();
                        if (abstractC3508lMo7179S2 instanceof C3514r) {
                            C3514r c3514r = (C3514r) abstractC3508lMo7179S;
                            m1993j(c4322r, ((C3514r) abstractC3508lMo7179S2).f11440m, c3514r.mo7375I(), c3514r.getName());
                        }
                    }
                    c4320p2.f9752i = c4320p.f9752i;
                }
            }
        }
        c4322r.f14404D.forEach(new C0551d(c4322r, 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m1993j(C4322r c4322r, C3515s c3515s, AbstractC3506j abstractC3506j, String str) {
        C3541x c3541x = c4322r.f14411l.f14371k.f14441g;
        c3541x.getClass();
        if (c3541x.m7453c(c4322r, c3515s, abstractC3506j, C3517a0.f11454e) == 1) {
            return false;
        }
        if (AbstractC2390d.m5714c(str)) {
            if (str != null) {
                C3507k c3507k = c3515s.f11448m;
                if (c3507k == null) {
                    C0086a.m452k("CodeVar not initialized for name set in SSAVar: ".concat(String.valueOf(c3515s)));
                    return false;
                }
                c3507k.f11411a = str;
            } else {
                c3515s.getClass();
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m1994k(C4322r c4322r) {
        C3387i c3387i = (C3387i) c4322r.f9217g.mo6237c(C3126c.f10137j);
        if (c3387i == null) {
            return;
        }
        try {
            ArrayList arrayList = c3387i.f10924g;
            if (arrayList.size() != c4322r.f14410k.f10152i.size()) {
                return;
            }
            int i9 = 0;
            for (C3514r c3514r : c4322r.m8694S()) {
                int i10 = i9 + 1;
                C3386h c3386h = (C3386h) arrayList.get(i9);
                String str = c3386h.f10923b;
                if (AbstractC2390d.m5714c(str)) {
                    C3507k c3507kM7398b = c3514r.f11440m.m7398b();
                    c3507kM7398b.f11411a = str;
                    if (AbstractC3754e0.m7864G(c3386h.f10922a, 16)) {
                        c3507kM7398b.f11414d = true;
                    }
                }
                i9 = i10;
            }
        } catch (Exception e6) {
            c4322r.m6384M("Failed to process method parameters attribute: ".concat(String.valueOf(c3387i.f10924g)), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public final void mo1053g(C4322r c4322r) {
        try {
            C2825b c2825b = C2825b.f9198m;
            if (c4322r.f9217g.mo6236b(c2825b)) {
                m1992i(c4322r);
                c4322r.m6228E(c2825b);
            }
            m1994k(c4322r);
        } catch (Exception e6) {
            c4322r.m6384M("Failed to apply debug info", e6);
        }
    }
}
