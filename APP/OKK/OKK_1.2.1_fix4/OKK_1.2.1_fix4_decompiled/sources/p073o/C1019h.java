package p073o;

import p071n.C0999d;
import p071n.C1003h;

/* JADX INFO: renamed from: o.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1019h extends AbstractC1024m {
    @Override // p073o.InterfaceC1015d
    /* JADX INFO: renamed from: a */
    public final void mo2445a(InterfaceC1015d interfaceC1015d) {
        C1017f c1017f = this.f3769h;
        if (c1017f.f3746c && !c1017f.f3753j) {
            c1017f.mo2462d((int) ((((C1017f) c1017f.f3755l.get(0)).f3750g * ((C1003h) this.f3763b).f3708d0) + 0.5f));
        }
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: d */
    public final void mo2446d() {
        C0999d c0999d = this.f3763b;
        C1003h c1003h = (C1003h) c0999d;
        int i2 = c1003h.f3709e0;
        int i3 = c1003h.f3710f0;
        int i4 = c1003h.f3712h0;
        C1017f c1017f = this.f3769h;
        if (i4 == 1) {
            if (i2 != -1) {
                c1017f.f3755l.add(c0999d.f3592I.f3616d.f3769h);
                this.f3763b.f3592I.f3616d.f3769h.f3754k.add(c1017f);
                c1017f.f3749f = i2;
            } else if (i3 != -1) {
                c1017f.f3755l.add(c0999d.f3592I.f3616d.f3770i);
                this.f3763b.f3592I.f3616d.f3770i.f3754k.add(c1017f);
                c1017f.f3749f = -i3;
            } else {
                c1017f.f3745b = true;
                c1017f.f3755l.add(c0999d.f3592I.f3616d.f3770i);
                this.f3763b.f3592I.f3616d.f3770i.f3754k.add(c1017f);
            }
            m2463m(this.f3763b.f3616d.f3769h);
            m2463m(this.f3763b.f3616d.f3770i);
            return;
        }
        if (i2 != -1) {
            c1017f.f3755l.add(c0999d.f3592I.f3617e.f3769h);
            this.f3763b.f3592I.f3617e.f3769h.f3754k.add(c1017f);
            c1017f.f3749f = i2;
        } else if (i3 != -1) {
            c1017f.f3755l.add(c0999d.f3592I.f3617e.f3770i);
            this.f3763b.f3592I.f3617e.f3770i.f3754k.add(c1017f);
            c1017f.f3749f = -i3;
        } else {
            c1017f.f3745b = true;
            c1017f.f3755l.add(c0999d.f3592I.f3617e.f3770i);
            this.f3763b.f3592I.f3617e.f3770i.f3754k.add(c1017f);
        }
        m2463m(this.f3763b.f3617e.f3769h);
        m2463m(this.f3763b.f3617e.f3770i);
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: e */
    public final void mo2447e() {
        C0999d c0999d = this.f3763b;
        int i2 = ((C1003h) c0999d).f3712h0;
        C1017f c1017f = this.f3769h;
        if (i2 == 1) {
            c0999d.f3597N = c1017f.f3750g;
        } else {
            c0999d.f3598O = c1017f.f3750g;
        }
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: f */
    public final void mo2448f() {
        this.f3769h.m2461c();
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: k */
    public final boolean mo2450k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m2463m(C1017f c1017f) {
        C1017f c1017f2 = this.f3769h;
        c1017f2.f3754k.add(c1017f);
        c1017f.f3755l.add(c1017f2);
    }
}
