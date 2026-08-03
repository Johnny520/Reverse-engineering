package p073o;

import java.util.Iterator;
import p071n.C0996a;
import p071n.C0999d;

/* JADX INFO: renamed from: o.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1020i extends AbstractC1024m {
    @Override // p073o.InterfaceC1015d
    /* JADX INFO: renamed from: a */
    public final void mo2445a(InterfaceC1015d r8) {
        C0996a r82 = (C0996a) this.f3763b;
        int r02 = r82.f3557f0;
        C1017f r1 = this.f3769h;
        Iterator r2 = r1.f3755l.iterator();
        int r4 = 0;
        int r5 = -1;
    L4:
        if (r2.hasNext() == false) goto L11;
        int r6 = ((C1017f) r2.next()).f3750g;
        if (r5 == (-1)) goto L8;
        if (r6 < r5) goto L8;
    L9:
        if (r4 >= r6) goto L4;
        r4 = r6;
    L8:
        r5 = r6;
        goto L9
    L11:
        if (r02 != 0) goto L13;
    L16:
        r1.mo2462d(r5 + r82.f3559h0);
        return;
    L13:
        if (r02 == 2) goto L16;
        r1.mo2462d(r4 + r82.f3559h0);
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: d */
    public final void mo2446d() {
        C0999d r02 = this.f3763b;
        if ((r02 instanceof C0996a) == false) goto L69;
        C1017f r1 = this.f3769h;
        r1.f3745b = true;
        C0996a r03 = (C0996a) r02;
        int r3 = r03.f3557f0;
        boolean r4 = r03.f3558g0;
        int r6 = 0;
        if (r3 == 0) goto L45;
        if (r3 != 1) goto L8;
        r1.f3748e = 5;
    L36:
        if (r6 >= r03.f3714e0) goto L44;
        C0999d r2 = r03.f3713d0[r6];
        if (r4 == false) goto L40;
    L42:
        C1017f r22 = r2.f3616d.f3770i;
        r22.f3754k.add(r1);
        r1.f3755l.add(r22);
    L43:
        r6 = r6 + 1;
        goto L36
    L40:
        if (r2.f3605V != 8) goto L42;
    L44:
        m2464m(this.f3763b.f3616d.f3769h);
        m2464m(this.f3763b.f3616d.f3770i);
        return;
    L8:
        if (r3 != 2) goto L10;
        r1.f3748e = 6;
    L25:
        if (r6 >= r03.f3714e0) goto L33;
        C0999d r23 = r03.f3713d0[r6];
        if (r4 == false) goto L29;
    L31:
        C1017f r24 = r23.f3617e.f3769h;
        r24.f3754k.add(r1);
        r1.f3755l.add(r24);
    L32:
        r6 = r6 + 1;
        goto L25
    L29:
        if (r23.f3605V != 8) goto L31;
    L33:
        m2464m(this.f3763b.f3617e.f3769h);
        m2464m(this.f3763b.f3617e.f3770i);
        return;
    L10:
        if (r3 != 3) goto L73;
        r1.f3748e = 7;
    L14:
        if (r6 >= r03.f3714e0) goto L22;
        C0999d r25 = r03.f3713d0[r6];
        if (r4 == false) goto L18;
    L20:
        C1017f r26 = r25.f3617e.f3770i;
        r26.f3754k.add(r1);
        r1.f3755l.add(r26);
    L21:
        r6 = r6 + 1;
        goto L14
    L18:
        if (r25.f3605V != 8) goto L20;
    L22:
        m2464m(this.f3763b.f3617e.f3769h);
        m2464m(this.f3763b.f3617e.f3770i);
        return;
    L73:
        return;
    L45:
        r1.f3748e = 4;
    L47:
        if (r6 >= r03.f3714e0) goto L55;
        C0999d r27 = r03.f3713d0[r6];
        if (r4 == false) goto L51;
    L53:
        C1017f r28 = r27.f3616d.f3769h;
        r28.f3754k.add(r1);
        r1.f3755l.add(r28);
    L54:
        r6 = r6 + 1;
        goto L47
    L51:
        if (r27.f3605V != 8) goto L53;
    L55:
        m2464m(this.f3763b.f3616d.f3769h);
        m2464m(this.f3763b.f3616d.f3770i);
        return;
    }

    @Override // p073o.AbstractC1024m
    /* JADX INFO: renamed from: e */
    public final void mo2447e() {
        C0999d r02 = this.f3763b;
        if ((r02 instanceof C0996a) == false) goto L12;
        int r1 = ((C0996a) r02).f3557f0;
        C1017f r2 = this.f3769h;
        if (r1 != 0) goto L7;
    L10:
        r02.f3597N = r2.f3750g;
        return;
    L7:
        if (r1 == 1) goto L10;
        r02.f3598O = r2.f3750g;
        return;
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
    public final void m2464m(C1017f r3) {
        C1017f r02 = this.f3769h;
        r02.f3754k.add(r3);
        r3.f3755l.add(r02);
    }
}
