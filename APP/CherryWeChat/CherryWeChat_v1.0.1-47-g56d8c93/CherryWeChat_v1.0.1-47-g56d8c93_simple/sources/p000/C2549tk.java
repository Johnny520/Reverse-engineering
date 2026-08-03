package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: tk */
/* JADX INFO: loaded from: classes.dex */
public final class C2549tk extends AbstractC1449gF {
    @Override // p000.InterfaceC2542td
    /* JADX INFO: renamed from: a */
    public final void mo1546a(InterfaceC2542td r8) {
        C2399q5 r82 = (C2399q5) this.f5058b;
        int r0 = r82.f8407s0;
        C2628vd r1 = this.f5064h;
        Iterator r2 = r1.f9121l.iterator();
        int r4 = 0;
        int r5 = -1;
    L4:
        if (r2.hasNext() == false) goto L11;
        int r6 = ((C2628vd) r2.next()).f9116g;
        if (r5 == (-1)) goto L8;
        if (r6 < r5) goto L8;
    L9:
        if (r4 >= r6) goto L4;
        r4 = r6;
    L8:
        r5 = r6;
        goto L9
    L11:
        if (r0 != 0) goto L13;
    L17:
        r1.mo1539d(r5 + r82.f8409u0);
        return;
    L13:
        if (r0 == 2) goto L17;
        r1.mo1539d(r4 + r82.f8409u0);
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: d */
    public final void mo1547d() {
        C2454rb r0 = this.f5058b;
        if ((r0 instanceof C2399q5) == false) goto L72;
        C2628vd r1 = this.f5064h;
        r1.f9111b = true;
        ArrayList r3 = r1.f9121l;
        C2399q5 r02 = (C2399q5) r0;
        int r4 = r02.f8407s0;
        boolean r5 = r02.f8408t0;
        int r7 = 0;
        if (r4 == 0) goto L48;
        if (r4 != 1) goto L8;
        r1.f9114e = 5;
    L38:
        if (r7 >= r02.f8966r0) goto L46;
        C2454rb r2 = r02.f8965q0[r7];
        if (r5 == false) goto L42;
    L44:
        C2628vd r22 = r2.f8612d.f5065i;
        r22.f9120k.add(r1);
        r3.add(r22);
    L45:
        r7 = r7 + 1;
        goto L38
    L42:
        if (r2.f8619g0 != 8) goto L44;
    L46:
        m5039m(this.f5058b.f8612d.f5064h);
        m5039m(this.f5058b.f8612d.f5065i);
        return;
    L8:
        if (r4 != 2) goto L10;
        r1.f9114e = 6;
    L26:
        if (r7 >= r02.f8966r0) goto L34;
        C2454rb r23 = r02.f8965q0[r7];
        if (r5 == false) goto L30;
    L32:
        C2628vd r24 = r23.f8614e.f5064h;
        r24.f9120k.add(r1);
        r3.add(r24);
    L33:
        r7 = r7 + 1;
        goto L26
    L30:
        if (r23.f8619g0 != 8) goto L32;
    L34:
        m5039m(this.f5058b.f8614e.f5064h);
        m5039m(this.f5058b.f8614e.f5065i);
        return;
    L10:
        if (r4 != 3) goto L73;
        r1.f9114e = 7;
    L14:
        if (r7 >= r02.f8966r0) goto L22;
        C2454rb r25 = r02.f8965q0[r7];
        if (r5 == false) goto L18;
    L20:
        C2628vd r26 = r25.f8614e.f5065i;
        r26.f9120k.add(r1);
        r3.add(r26);
    L21:
        r7 = r7 + 1;
        goto L14
    L18:
        if (r25.f8619g0 != 8) goto L20;
    L22:
        m5039m(this.f5058b.f8614e.f5064h);
        m5039m(this.f5058b.f8614e.f5065i);
        return;
    L73:
        return;
    L48:
        r1.f9114e = 4;
    L50:
        if (r7 >= r02.f8966r0) goto L58;
        C2454rb r27 = r02.f8965q0[r7];
        if (r5 == false) goto L54;
    L56:
        C2628vd r28 = r27.f8612d.f5064h;
        r28.f9120k.add(r1);
        r3.add(r28);
    L57:
        r7 = r7 + 1;
        goto L50
    L54:
        if (r27.f8619g0 != 8) goto L56;
    L58:
        m5039m(this.f5058b.f8612d.f5064h);
        m5039m(this.f5058b.f8612d.f5065i);
        return;
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: e */
    public final void mo1548e() {
        C2454rb r0 = this.f5058b;
        if ((r0 instanceof C2399q5) == false) goto L13;
        int r1 = ((C2399q5) r0).f8407s0;
        C2628vd r2 = this.f5064h;
        if (r1 != 0) goto L7;
    L11:
        r0.f8604Y = r2.f9116g;
        return;
    L7:
        if (r1 == 1) goto L11;
        r0.f8605Z = r2.f9116g;
        return;
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: f */
    public final void mo1549f() {
        this.f5059c = null;
        this.f5064h.m5144c();
    }

    @Override // p000.AbstractC1449gF
    /* JADX INFO: renamed from: k */
    public final boolean mo1550k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m5039m(C2628vd r3) {
        C2628vd r0 = this.f5064h;
        r0.f9120k.add(r3);
        r3.f9121l.add(r0);
    }
}
