package p073o;

import java.util.Iterator;
import p071n.C0996a;
import p071n.C0999d;

/* JADX INFO: renamed from: o.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1020i extends AbstractC1024m {
    @Override // p073o.InterfaceC1015d
    /* JADX INFO: renamed from: a */
    public final void mo2445a(InterfaceC1015d interfaceC1015d) {
        C0996a c0996a = (C0996a) this.f3763b;
        int i2 = c0996a.f3557f0;
        C1017f c1017f = this.f3769h;
        Iterator it = c1017f.f3755l.iterator();
        int i3 = 0;
        int i4 = -1;
        while (it.hasNext()) {
            int i5 = ((C1017f) it.next()).f3750g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 == 0 || i2 == 2) {
            c1017f.mo2462d(i4 + c0996a.f3559h0);
        } else {
            c1017f.mo2462d(i3 + c0996a.f3559h0);
        }
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: d */
    public final void mo2446d() {
        C0999d c0999d = this.f3763b;
        if (c0999d instanceof C0996a) {
            C1017f c1017f = this.f3769h;
            c1017f.f3745b = true;
            C0996a c0996a = (C0996a) c0999d;
            int i2 = c0996a.f3557f0;
            boolean z2 = c0996a.f3558g0;
            int i3 = 0;
            if (i2 == 0) {
                c1017f.f3748e = 4;
                while (i3 < c0996a.f3714e0) {
                    C0999d c0999d2 = c0996a.f3713d0[i3];
                    if (z2 || c0999d2.f3605V != 8) {
                        C1017f c1017f2 = c0999d2.f3616d.f3769h;
                        c1017f2.f3754k.add(c1017f);
                        c1017f.f3755l.add(c1017f2);
                    }
                    i3++;
                }
                m2464m(this.f3763b.f3616d.f3769h);
                m2464m(this.f3763b.f3616d.f3770i);
                return;
            }
            if (i2 == 1) {
                c1017f.f3748e = 5;
                while (i3 < c0996a.f3714e0) {
                    C0999d c0999d3 = c0996a.f3713d0[i3];
                    if (z2 || c0999d3.f3605V != 8) {
                        C1017f c1017f3 = c0999d3.f3616d.f3770i;
                        c1017f3.f3754k.add(c1017f);
                        c1017f.f3755l.add(c1017f3);
                    }
                    i3++;
                }
                m2464m(this.f3763b.f3616d.f3769h);
                m2464m(this.f3763b.f3616d.f3770i);
                return;
            }
            if (i2 == 2) {
                c1017f.f3748e = 6;
                while (i3 < c0996a.f3714e0) {
                    C0999d c0999d4 = c0996a.f3713d0[i3];
                    if (z2 || c0999d4.f3605V != 8) {
                        C1017f c1017f4 = c0999d4.f3617e.f3769h;
                        c1017f4.f3754k.add(c1017f);
                        c1017f.f3755l.add(c1017f4);
                    }
                    i3++;
                }
                m2464m(this.f3763b.f3617e.f3769h);
                m2464m(this.f3763b.f3617e.f3770i);
                return;
            }
            if (i2 != 3) {
                return;
            }
            c1017f.f3748e = 7;
            while (i3 < c0996a.f3714e0) {
                C0999d c0999d5 = c0996a.f3713d0[i3];
                if (z2 || c0999d5.f3605V != 8) {
                    C1017f c1017f5 = c0999d5.f3617e.f3770i;
                    c1017f5.f3754k.add(c1017f);
                    c1017f.f3755l.add(c1017f5);
                }
                i3++;
            }
            m2464m(this.f3763b.f3617e.f3769h);
            m2464m(this.f3763b.f3617e.f3770i);
        }
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: e */
    public final void mo2447e() {
        C0999d c0999d = this.f3763b;
        if (c0999d instanceof C0996a) {
            int i2 = ((C0996a) c0999d).f3557f0;
            C1017f c1017f = this.f3769h;
            if (i2 == 0 || i2 == 1) {
                c0999d.f3597N = c1017f.f3750g;
            } else {
                c0999d.f3598O = c1017f.f3750g;
            }
        }
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: f */
    public final void mo2448f() {
        this.f3764c = null;
        this.f3769h.m2461c();
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: k */
    public final boolean mo2450k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m2464m(C1017f c1017f) {
        C1017f c1017f2 = this.f3769h;
        c1017f2.f3754k.add(c1017f);
        c1017f.f3755l.add(c1017f2);
    }
}
