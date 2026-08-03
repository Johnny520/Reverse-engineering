package p006D;

import p034S.AbstractC0324d;
import p085v.C1102c;

/* JADX INFO: renamed from: D.i0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0106i0 {

    /* JADX INFO: renamed from: a */
    public final C0122q0 f281a;

    /* JADX INFO: renamed from: b */
    public C1102c[] f282b;

    public AbstractC0106i0() {
        this(new C0122q0());
    }

    /* JADX INFO: renamed from: a */
    public final void m369a() {
        C1102c[] r02 = this.f282b;
        if (r02 == null) goto L19;
        C1102c r1 = r02[0];
        C1102c r03 = r02[1];
        C0122q0 r3 = this.f281a;
        if (r03 != null) goto L7;
        r03 = r3.f309a.mo381f(2);
    L7:
        if (r1 != null) goto L9;
        r1 = r3.f309a.mo381f(1);
    L9:
        mo364g(C1102c.m2597a(r1, r03));
        C1102c r04 = this.f282b[4];
        if (r04 == null) goto L12;
        mo366f(r04);
    L12:
        C1102c r05 = this.f282b[5];
        if (r05 == null) goto L15;
        mo365d(r05);
    L15:
        C1102c r06 = this.f282b[6];
        if (r06 == null) goto L20;
        mo367h(r06);
        return;
    L20:
        return;
    }

    /* JADX INFO: renamed from: b */
    public abstract C0122q0 mo362b();

    /* JADX INFO: renamed from: c */
    public void mo368c(int r8, C1102c r9) {
        if (this.f282b != null) goto L5;
        this.f282b = new C1102c[9];
    L5:
        int r1 = 1;
    L7:
        if (r1 > 256) goto L40;
        if ((r8 & r1) == 0) goto L39;
        C1102c[] r3 = this.f282b;
        if (r1 == 1) goto L37;
        char r4 = 2;
        if (r1 != 2) goto L16;
        r4 = 1;
    L38:
        r3[r4] = r9;
        goto L39
    L16:
        if (r1 == 4) goto L38;
        r4 = '\b';
        if (r1 != 8) goto L20;
        r4 = 3;
        goto L38
    L20:
        if (r1 != 16) goto L22;
        r4 = 4;
        goto L38
    L22:
        if (r1 != 32) goto L24;
        r4 = 5;
        goto L38
    L24:
        if (r1 != 64) goto L26;
        r4 = 6;
        goto L38
    L26:
        if (r1 == 128) goto L31;
        if (r1 == 256) goto L38;
        throw new IllegalArgumentException(AbstractC0324d.m720c("type needs to be >= FIRST and <= LAST, type=", r1));
    L31:
        r4 = 7;
        goto L38
    L37:
        r4 = 0;
    L39:
        r1 = r1 << 1;
        goto L7
    }

    /* JADX INFO: renamed from: d */
    public void mo365d(C1102c r1) {
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo363e(C1102c r1);

    /* JADX INFO: renamed from: f */
    public void mo366f(C1102c r1) {
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo364g(C1102c r1);

    /* JADX INFO: renamed from: h */
    public void mo367h(C1102c r1) {
    }

    public AbstractC0106i0(C0122q0 r1) {
        this.f281a = r1;
    }
}
