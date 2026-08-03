package p247qe;

import ae.C0074e;
import ae.C0076g;
import af.C0083f;
import be.AbstractC0269a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import md.C2829f;
import md.EnumC2824a;
import me.C2833a;
import mh.AbstractC2846d;
import p007a7.C0019b;
import p227p4.C3315t;
import p246qd.AbstractC3506j;
import p246qd.C3514r;
import p246qd.C3515s;
import p302ud.C4322r;
import p302ud.C4325u;
import p351xe.C5787h;

/* JADX INFO: renamed from: qe.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3531n extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public C4325u f11493g;

    /* JADX INFO: renamed from: h */
    public C3541x f11494h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C3531n.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m7437i(C3315t c3315t, InterfaceC3521d interfaceC3521d) {
        if (interfaceC3521d == null) {
            return;
        }
        if ((interfaceC3521d instanceof InterfaceC3522e) || interfaceC3521d.getType() != AbstractC3506j.f11404u) {
            ((LinkedHashSet) c3315t.f10678i).add(interfaceC3521d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m7438j(C4322r c4322r) {
        AbstractC3506j abstractC3506j;
        for (C3515s c3515s : c4322r.f14404D) {
            C2829f c2829f = c3515s.f11444i.f9217g;
            EnumC2824a enumC2824a = EnumC2824a.f9128N;
            if (!c2829f.mo6235a(enumC2824a)) {
                Iterator it = c3515s.f11445j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        abstractC3506j = null;
                        break;
                    }
                    C3514r c3514r = (C3514r) it.next();
                    if (c3514r.f9217g.mo6235a(enumC2824a)) {
                        abstractC3506j = c3514r.f11419i;
                        break;
                    }
                }
            } else {
                abstractC3506j = c3515s.f11444i.f11419i;
            }
            if (abstractC3506j != null) {
                c3515s.f11444i.m6231w(enumC2824a);
                if (!c3515s.f11444i.f11419i.equals(abstractC3506j)) {
                    c3515s.f11444i.f11419i = abstractC3506j;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: e */
    public final String mo1051e() {
        return "TypeInferenceVisitor";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public final void mo1052f(C4325u c4325u) {
        this.f11493g = c4325u;
        this.f11494h = c4325u.f14441g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public final void mo1053g(C4322r c4322r) {
        if (c4322r.f14415p) {
            return;
        }
        try {
            m7438j(c4322r);
            m7440l(c4322r);
            m7441m(c4322r);
        } catch (BootstrapMethodError e6) {
            e = e6;
            C5787h.m10468a(c4322r, "Type inference failed with stack overflow", new C0083f(e.getMessage()));
        } catch (Exception e7) {
            C5787h.m10468a(c4322r, "Type inference failed", e7);
        } catch (StackOverflowError e10) {
            e = e10;
            C5787h.m10468a(c4322r, "Type inference failed with stack overflow", new C0083f(e.getMessage()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m7439k(C4322r c4322r, C3515s c3515s) {
        Optional optionalMax = ((LinkedHashSet) c3515s.f11447l.f10678i).stream().map(new C2833a(9)).filter(new C0019b(11)).max(this.f11494h.f11519c.f11479b);
        if (optionalMax.isPresent()) {
            AbstractC3506j abstractC3506j = (AbstractC3506j) optionalMax.get();
            C3541x c3541x = this.f11494h;
            c3541x.getClass();
            c3541x.m7453c(c4322r, c3515s, abstractC3506j, C3517a0.f11451b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m7440l(C4322r c4322r) {
        List list = c4322r.f14404D;
        list.forEach(new C0076g(this, 16));
        list.forEach(new C0074e(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m7441m(final C4322r c4322r) {
        List list = c4322r.f14404D;
        final int i9 = 0;
        list.forEach(new Consumer(this) { // from class: qe.m

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3531n f11491b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f11491b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        C3531n c3531n = this.f11491b;
                        C4322r c4322r2 = c4322r;
                        C3515s c3515s = (C3515s) obj;
                        try {
                            AbstractC3506j abstractC3506jM7400d = c3515s.m7400d();
                            if (abstractC3506jM7400d != null) {
                                C3541x c3541x = c3531n.f11494h;
                                c3541x.getClass();
                                c3541x.m7453c(c4322r2, c3515s, abstractC3506jM7400d, C3517a0.f11453d);
                                return;
                            }
                            return;
                        } catch (C0083f e6) {
                            throw e6;
                        } catch (Exception e7) {
                            c4322r2.m6384M("Failed to set immutable type for var: ".concat(String.valueOf(c3515s)), e7);
                            return;
                        }
                    default:
                        C3531n c3531n2 = this.f11491b;
                        C4322r c4322r3 = c4322r;
                        C3515s c3515s2 = (C3515s) obj;
                        try {
                            c3531n2.m7439k(c4322r3, c3515s2);
                            return;
                        } catch (C0083f e10) {
                            throw e10;
                        } catch (Exception e11) {
                            c4322r3.m6384M("Failed to calculate best type for var: ".concat(String.valueOf(c3515s2)), e11);
                            return;
                        }
                }
            }
        });
        final int i10 = 1;
        list.forEach(new Consumer(this) { // from class: qe.m

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3531n f11491b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f11491b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        C3531n c3531n = this.f11491b;
                        C4322r c4322r2 = c4322r;
                        C3515s c3515s = (C3515s) obj;
                        try {
                            AbstractC3506j abstractC3506jM7400d = c3515s.m7400d();
                            if (abstractC3506jM7400d != null) {
                                C3541x c3541x = c3531n.f11494h;
                                c3541x.getClass();
                                c3541x.m7453c(c4322r2, c3515s, abstractC3506jM7400d, C3517a0.f11453d);
                                return;
                            }
                            return;
                        } catch (C0083f e6) {
                            throw e6;
                        } catch (Exception e7) {
                            c4322r2.m6384M("Failed to set immutable type for var: ".concat(String.valueOf(c3515s)), e7);
                            return;
                        }
                    default:
                        C3531n c3531n2 = this.f11491b;
                        C4322r c4322r3 = c4322r;
                        C3515s c3515s2 = (C3515s) obj;
                        try {
                            c3531n2.m7439k(c4322r3, c3515s2);
                            return;
                        } catch (C0083f e10) {
                            throw e10;
                        } catch (Exception e11) {
                            c4322r3.m6384M("Failed to calculate best type for var: ".concat(String.valueOf(c3515s2)), e11);
                            return;
                        }
                }
            }
        });
    }
}
