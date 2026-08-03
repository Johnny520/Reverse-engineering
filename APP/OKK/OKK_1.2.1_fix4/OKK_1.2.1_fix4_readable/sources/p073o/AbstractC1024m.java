package p073o;

import p069m.AbstractC0988h;
import p071n.C0998c;
import p071n.C0999d;

/* JADX INFO: renamed from: o.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1024m implements InterfaceC1015d {

    /* JADX INFO: renamed from: a */
    public int f3762a;

    /* JADX INFO: renamed from: b */
    public C0999d f3763b;

    /* JADX INFO: renamed from: c */
    public C1022k f3764c;

    /* JADX INFO: renamed from: d */
    public int f3765d;

    /* JADX INFO: renamed from: e */
    public final C1018g f3766e = new C1018g(this);

    /* JADX INFO: renamed from: f */
    public int f3767f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f3768g = false;

    /* JADX INFO: renamed from: h */
    public final C1017f f3769h = new C1017f(this);

    /* JADX INFO: renamed from: i */
    public final C1017f f3770i = new C1017f(this);

    /* JADX INFO: renamed from: j */
    public int f3771j = 1;

    public AbstractC1024m(C0999d c0999d) {
        this.f3763b = c0999d;
    }

    /* JADX INFO: renamed from: b */
    public static void m2470b(C1017f c1017f, C1017f c1017f2, int i2) {
        c1017f.f3755l.add(c1017f2);
        c1017f.f3749f = i2;
        c1017f2.f3754k.add(c1017f);
    }

    /* JADX INFO: renamed from: h */
    public static C1017f m2471h(C0998c c0998c) {
        C0998c c0998c2 = c0998c.f3580d;
        if (c0998c2 == null) {
            return null;
        }
        int iM2372a = AbstractC0988h.m2372a(c0998c2.f3579c);
        C0999d c0999d = c0998c2.f3578b;
        if (iM2372a == 1) {
            return c0999d.f3616d.f3769h;
        }
        if (iM2372a == 2) {
            return c0999d.f3617e.f3769h;
        }
        if (iM2372a == 3) {
            return c0999d.f3616d.f3770i;
        }
        if (iM2372a == 4) {
            return c0999d.f3617e.f3770i;
        }
        if (iM2372a != 5) {
            return null;
        }
        return c0999d.f3617e.f3760k;
    }

    /* JADX INFO: renamed from: i */
    public static C1017f m2472i(C0998c c0998c, int i2) {
        C0998c c0998c2 = c0998c.f3580d;
        if (c0998c2 == null) {
            return null;
        }
        C0999d c0999d = c0998c2.f3578b;
        AbstractC1024m abstractC1024m = i2 == 0 ? c0999d.f3616d : c0999d.f3617e;
        int iM2372a = AbstractC0988h.m2372a(c0998c2.f3579c);
        if (iM2372a == 1 || iM2372a == 2) {
            return abstractC1024m.f3769h;
        }
        if (iM2372a == 3 || iM2372a == 4) {
            return abstractC1024m.f3770i;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2473c(C1017f c1017f, C1017f c1017f2, int i2, C1018g c1018g) {
        c1017f.f3755l.add(c1017f2);
        c1017f.f3755l.add(this.f3766e);
        c1017f.f3751h = i2;
        c1017f.f3752i = c1018g;
        c1017f2.f3754k.add(c1017f);
        c1018g.f3754k.add(c1017f);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2446d();

    /* JADX INFO: renamed from: e */
    public abstract void mo2447e();

    /* JADX INFO: renamed from: f */
    public abstract void mo2448f();

    /* JADX INFO: renamed from: g */
    public final int m2474g(int i2, int i3) {
        int iMax;
        if (i3 == 0) {
            C0999d c0999d = this.f3763b;
            int i4 = c0999d.f3626n;
            iMax = Math.max(c0999d.f3625m, i2);
            if (i4 > 0) {
                iMax = Math.min(i4, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        } else {
            C0999d c0999d2 = this.f3763b;
            int i5 = c0999d2.f3629q;
            iMax = Math.max(c0999d2.f3628p, i2);
            if (i5 > 0) {
                iMax = Math.min(i5, i2);
            }
            if (iMax == i2) {
                return i2;
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: j */
    public long mo2449j() {
        if (this.f3766e.f3753j) {
            return r0.f3750g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo2450k();

    /* JADX INFO: renamed from: l */
    public final void m2475l(C0998c c0998c, C0998c c0998c2, int i2) {
        C1017f c1017fM2471h = m2471h(c0998c);
        C1017f c1017fM2471h2 = m2471h(c0998c2);
        if (c1017fM2471h.f3753j && c1017fM2471h2.f3753j) {
            int iM2390c = c0998c.m2390c() + c1017fM2471h.f3750g;
            int iM2390c2 = c1017fM2471h2.f3750g - c0998c2.m2390c();
            int i3 = iM2390c2 - iM2390c;
            C1018g c1018g = this.f3766e;
            if (!c1018g.f3753j && this.f3765d == 3) {
                int i4 = this.f3762a;
                if (i4 == 0) {
                    c1018g.mo2462d(m2474g(i3, i2));
                } else if (i4 == 1) {
                    c1018g.mo2462d(Math.min(m2474g(c1018g.f3756m, i2), i3));
                } else if (i4 == 2) {
                    C0999d c0999d = this.f3763b;
                    C0999d c0999d2 = c0999d.f3592I;
                    if (c0999d2 != null) {
                        if ((i2 == 0 ? c0999d2.f3616d : c0999d2.f3617e).f3766e.f3753j) {
                            c1018g.mo2462d(m2474g((int) ((r6.f3750g * (i2 == 0 ? c0999d.f3627o : c0999d.f3630r)) + 0.5f), i2));
                        }
                    }
                } else if (i4 == 3) {
                    C0999d c0999d3 = this.f3763b;
                    AbstractC1024m abstractC1024m = c0999d3.f3616d;
                    int i5 = abstractC1024m.f3765d;
                    C1023l c1023l = c0999d3.f3617e;
                    if (i5 != 3 || abstractC1024m.f3762a != 3 || c1023l.f3765d != 3 || c1023l.f3762a != 3) {
                        if (i2 == 0) {
                            abstractC1024m = c1023l;
                        }
                        if (abstractC1024m.f3766e.f3753j) {
                            float f2 = c0999d3.f3595L;
                            c1018g.mo2462d(i2 == 1 ? (int) ((r6.f3750g / f2) + 0.5f) : (int) ((f2 * r6.f3750g) + 0.5f));
                        }
                    }
                }
            }
            if (c1018g.f3753j) {
                int i6 = c1018g.f3750g;
                C1017f c1017f = this.f3770i;
                C1017f c1017f2 = this.f3769h;
                if (i6 == i3) {
                    c1017f2.mo2462d(iM2390c);
                    c1017f.mo2462d(iM2390c2);
                    return;
                }
                C0999d c0999d4 = this.f3763b;
                float f3 = i2 == 0 ? c0999d4.f3602S : c0999d4.f3603T;
                if (c1017fM2471h == c1017fM2471h2) {
                    iM2390c = c1017fM2471h.f3750g;
                    iM2390c2 = c1017fM2471h2.f3750g;
                    f3 = 0.5f;
                }
                c1017f2.mo2462d((int) ((((iM2390c2 - iM2390c) - i6) * f3) + iM2390c + 0.5f));
                c1017f.mo2462d(c1017f2.f3750g + c1018g.f3750g);
            }
        }
    }
}
