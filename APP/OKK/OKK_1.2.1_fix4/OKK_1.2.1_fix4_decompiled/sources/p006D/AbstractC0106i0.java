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
        C1102c[] c1102cArr = this.f282b;
        if (c1102cArr != null) {
            C1102c c1102cMo381f = c1102cArr[0];
            C1102c c1102cMo381f2 = c1102cArr[1];
            C0122q0 c0122q0 = this.f281a;
            if (c1102cMo381f2 == null) {
                c1102cMo381f2 = c0122q0.f309a.mo381f(2);
            }
            if (c1102cMo381f == null) {
                c1102cMo381f = c0122q0.f309a.mo381f(1);
            }
            mo364g(C1102c.m2597a(c1102cMo381f, c1102cMo381f2));
            C1102c c1102c = this.f282b[4];
            if (c1102c != null) {
                mo366f(c1102c);
            }
            C1102c c1102c2 = this.f282b[5];
            if (c1102c2 != null) {
                mo365d(c1102c2);
            }
            C1102c c1102c3 = this.f282b[6];
            if (c1102c3 != null) {
                mo367h(c1102c3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract C0122q0 mo362b();

    /* JADX INFO: renamed from: c */
    public void mo368c(int i2, C1102c c1102c) {
        char c;
        if (this.f282b == null) {
            this.f282b = new C1102c[9];
        }
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                C1102c[] c1102cArr = this.f282b;
                if (i3 != 1) {
                    c = 2;
                    if (i3 == 2) {
                        c = 1;
                    } else if (i3 != 4) {
                        c = '\b';
                        if (i3 == 8) {
                            c = 3;
                        } else if (i3 == 16) {
                            c = 4;
                        } else if (i3 == 32) {
                            c = 5;
                        } else if (i3 == 64) {
                            c = 6;
                        } else if (i3 == 128) {
                            c = 7;
                        } else if (i3 != 256) {
                            throw new IllegalArgumentException(AbstractC0324d.m720c("type needs to be >= FIRST and <= LAST, type=", i3));
                        }
                    }
                } else {
                    c = 0;
                }
                c1102cArr[c] = c1102c;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo365d(C1102c c1102c) {
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo363e(C1102c c1102c);

    /* JADX INFO: renamed from: f */
    public void mo366f(C1102c c1102c) {
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo364g(C1102c c1102c);

    /* JADX INFO: renamed from: h */
    public void mo367h(C1102c c1102c) {
    }

    public AbstractC0106i0(C0122q0 c0122q0) {
        this.f281a = c0122q0;
    }
}
