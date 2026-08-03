package p073o;

import p071n.C0999d;
import p071n.C1003h;

/* JADX INFO: renamed from: o.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1019h extends AbstractC1024m {
    @Override // p073o.InterfaceC1015d
    /* JADX INFO: renamed from: a */
    public final void mo2445a(InterfaceC1015d r3) {
        C1017f r32 = this.f3769h;
        if (r32.f3746c == true) goto L6;
        return;
    L6:
        if (r32.f3753j == false) goto L8;
        return;
    L8:
        C1017f r02 = (C1017f) r32.f3755l.get(0);
        r32.mo2462d((int) ((r02.f3750g * ((C1003h) this.f3763b).f3708d0) + 0.5f));
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: d */
    public final void mo2446d() {
        C0999d r02 = this.f3763b;
        C1003h r1 = (C1003h) r02;
        int r2 = r1.f3709e0;
        int r3 = r1.f3710f0;
        int r12 = r1.f3712h0;
        C1017f r4 = this.f3769h;
        if (r12 != 1) goto L10;
        if (r2 == (-1)) goto L6;
        r4.f3755l.add(r02.f3592I.f3616d.f3769h);
        this.f3763b.f3592I.f3616d.f3769h.f3754k.add(r4);
        r4.f3749f = r2;
    L9:
        m2463m(this.f3763b.f3616d.f3769h);
        m2463m(this.f3763b.f3616d.f3770i);
        return;
    L6:
        if (r3 == (-1)) goto L8;
        r4.f3755l.add(r02.f3592I.f3616d.f3770i);
        this.f3763b.f3592I.f3616d.f3770i.f3754k.add(r4);
        r4.f3749f = -r3;
        goto L9
    L8:
        r4.f3745b = true;
        r4.f3755l.add(r02.f3592I.f3616d.f3770i);
        this.f3763b.f3592I.f3616d.f3770i.f3754k.add(r4);
        goto L9
    L10:
        if (r2 == (-1)) goto L12;
        r4.f3755l.add(r02.f3592I.f3617e.f3769h);
        this.f3763b.f3592I.f3617e.f3769h.f3754k.add(r4);
        r4.f3749f = r2;
    L15:
        m2463m(this.f3763b.f3617e.f3769h);
        m2463m(this.f3763b.f3617e.f3770i);
        return;
    L12:
        if (r3 == (-1)) goto L14;
        r4.f3755l.add(r02.f3592I.f3617e.f3770i);
        this.f3763b.f3592I.f3617e.f3770i.f3754k.add(r4);
        r4.f3749f = -r3;
        goto L15
    L14:
        r4.f3745b = true;
        r4.f3755l.add(r02.f3592I.f3617e.f3770i);
        this.f3763b.f3592I.f3617e.f3770i.f3754k.add(r4);
        goto L15
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: e */
    public final void mo2447e() {
        C0999d r02 = this.f3763b;
        int r1 = ((C1003h) r02).f3712h0;
        C1017f r3 = this.f3769h;
        if (r1 != 1) goto L5;
        r02.f3597N = r3.f3750g;
        return;
    L5:
        r02.f3598O = r3.f3750g;
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
    public final void m2463m(C1017f r3) {
        C1017f r02 = this.f3769h;
        r02.f3754k.add(r3);
        r3.f3755l.add(r02);
    }
}
