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
    public final C1018g f3766e;

    /* JADX INFO: renamed from: f */
    public int f3767f;

    /* JADX INFO: renamed from: g */
    public boolean f3768g;

    /* JADX INFO: renamed from: h */
    public final C1017f f3769h;

    /* JADX INFO: renamed from: i */
    public final C1017f f3770i;

    /* JADX INFO: renamed from: j */
    public int f3771j;

    public AbstractC1024m(C0999d r2) {
        this.f3766e = new C1018g(this);
        this.f3767f = 0;
        this.f3768g = false;
        this.f3769h = new C1017f(this);
        this.f3770i = new C1017f(this);
        this.f3771j = 1;
        this.f3763b = r2;
    }

    /* JADX INFO: renamed from: b */
    public static void m2470b(C1017f r1, C1017f r2, int r3) {
        r1.f3755l.add(r2);
        r1.f3749f = r3;
        r2.f3754k.add(r1);
    }

    /* JADX INFO: renamed from: h */
    public static C1017f m2471h(C0998c r3) {
        C0998c r32 = r3.f3580d;
        if (r32 != null) goto L5;
        return null;
    L5:
        int r1 = AbstractC0988h.m2372a(r32.f3579c);
        C0999d r33 = r32.f3578b;
        if (r1 == 1) goto L21;
        if (r1 == 2) goto L25;
        if (r1 == 3) goto L24;
        if (r1 == 4) goto L23;
        if (r1 == 5) goto L22;
        return null;
    L22:
        return r33.f3617e.f3760k;
    L23:
        return r33.f3617e.f3770i;
    L24:
        return r33.f3616d.f3770i;
    L25:
        return r33.f3617e.f3769h;
    L21:
        return r33.f3616d.f3769h;
    }

    /* JADX INFO: renamed from: i */
    public static C1017f m2472i(C0998c r2, int r3) {
        C0998c r22 = r2.f3580d;
        if (r22 != null) goto L5;
        return null;
    L5:
        C0999d r1 = r22.f3578b;
        if (r3 != 0) goto L8;
        AbstractC1024m r32 = r1.f3616d;
    L9:
        int r23 = AbstractC0988h.m2372a(r22.f3579c);
        if (r23 == 1) goto L20;
        if (r23 == 2) goto L20;
        if (r23 == 3) goto L21;
        if (r23 == 4) goto L21;
        return null;
    L21:
        return r32.f3770i;
    L20:
        return r32.f3769h;
    L8:
        r32 = r1.f3617e;
        goto L9
    }

    /* JADX INFO: renamed from: c */
    public final void m2473c(C1017f r3, C1017f r4, int r5, C1018g r6) {
        r3.f3755l.add(r4);
        r3.f3755l.add(this.f3766e);
        r3.f3751h = r5;
        r3.f3752i = r6;
        r4.f3754k.add(r3);
        r6.f3754k.add(r3);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2446d();

    /* JADX INFO: renamed from: e */
    public abstract void mo2447e();

    /* JADX INFO: renamed from: f */
    public abstract void mo2448f();

    /* JADX INFO: renamed from: g */
    public final int m2474g(int r2, int r3) {
        if (r3 != 0) goto L8;
        C0999d r32 = this.f3763b;
        int r02 = r32.f3626n;
        int r33 = Math.max(r32.f3625m, r2);
        if (r02 <= 0) goto L6;
        r33 = Math.min(r02, r2);
    L6:
        if (r33 != r2) goto L13;
        return r2;
    L13:
        return r33;
    L8:
        C0999d r34 = this.f3763b;
        int r03 = r34.f3629q;
        r33 = Math.max(r34.f3628p, r2);
        if (r03 <= 0) goto L11;
        r33 = Math.min(r03, r2);
    L11:
        if (r33 != r2) goto L13;
        return r2;
    }

    /* JADX INFO: renamed from: j */
    public long mo2449j() {
        if (this.f3766e.f3753j == true) goto L5;
        return 0;
    L5:
        return r0.f3750g;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo2450k();

    /* JADX INFO: renamed from: l */
    public final void m2475l(C0998c r12, C0998c r13, int r14) {
        C1017f r02 = m2471h(r12);
        C1017f r1 = m2471h(r13);
        if (r02.f3753j == true) goto L5;
        return;
    L5:
        if (r1.f3753j == false) goto L66;
        int r122 = r12.m2390c() + r02.f3750g;
        int r2 = r1.f3750g - r13.m2390c();
        int r132 = r2 - r122;
        C1018g r3 = this.f3766e;
        if (r3.f3753j == true) goto L51;
        if (this.f3765d != 3) goto L51;
        int r4 = this.f3762a;
        if (r4 != 0) goto L14;
        r3.mo2462d(m2474g(r132, r14));
        goto L51
    L14:
        if (r4 != 1) goto L16;
        r3.mo2462d(Math.min(m2474g(r3.f3756m, r14), r132));
        goto L51
    L16:
        if (r4 == 2) goto L37;
        if (r4 != 3) goto L51;
        C0999d r42 = this.f3763b;
        AbstractC1024m r8 = r42.f3616d;
        int r9 = r8.f3765d;
        C1023l r10 = r42.f3617e;
        if (r9 == 3) goto L22;
    L28:
        if (r14 != 0) goto L31;
        r8 = r10;
    L31:
        if (r8.f3766e.f3753j == false) goto L51;
        float r43 = r42.f3595L;
        if (r14 != 1) goto L35;
        int r44 = (int) ((r6.f3750g / r43) + 0.5f);
    L36:
        r3.mo2462d(r44);
        goto L51
    L35:
        r44 = (int) ((r43 * r6.f3750g) + 0.5f);
        goto L36
    L22:
        if (r8.f3762a != 3) goto L28;
        if (r10.f3765d != 3) goto L28;
        if (r10.f3762a != 3) goto L28;
    L37:
        C0999d r45 = this.f3763b;
        C0999d r6 = r45.f3592I;
        if (r6 == null) goto L51;
        if (r14 != 0) goto L41;
        AbstractC1024m r62 = r6.f3616d;
    L43:
        if (r62.f3766e.f3753j == false) goto L51;
        if (r14 != 0) goto L46;
        float r46 = r45.f3627o;
    L47:
        r3.mo2462d(m2474g((int) ((r6.f3750g * r46) + 0.5f), r14));
        goto L51
    L46:
        r46 = r45.f3630r;
        goto L47
    L41:
        r62 = r6.f3617e;
    L51:
        if (r3.f3753j == true) goto L53;
        return;
    L53:
        int r47 = r3.f3750g;
        C1017f r63 = this.f3770i;
        C1017f r7 = this.f3769h;
        if (r47 != r132) goto L57;
        r7.mo2462d(r122);
        r63.mo2462d(r2);
        return;
    L57:
        C0999d r133 = this.f3763b;
        if (r14 != 0) goto L60;
        float r134 = r133.f3602S;
    L61:
        if (r02 != r1) goto L63;
        r122 = r02.f3750g;
        r2 = r1.f3750g;
        r134 = 0.5f;
    L63:
        r7.mo2462d((int) ((((r2 - r122) - r47) * r134) + (r122 + 0.5f)));
        r63.mo2462d(r7.f3750g + r3.f3750g);
        return;
    L60:
        r134 = r133.f3603T;
        goto L61
    }
}
