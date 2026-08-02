package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yl0 implements xl0 {
    public final gd3 a;
    public final y8 b;
    public final dq1 c;
    public final cm0 d;
    public final hh1 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yl0(gd3 gd3Var, y8 y8Var) {
        dq1 dq1Var = zl0.a;
        cm0 cm0Var = new cm0();
        bm0 bm0Var = cm0.a;
        vr0 vr0Var = n90.a;
        bm0Var.getClass();
        te.e(xe1.f0(bm0Var, vr0Var).k(zd0.h).k(new mw2(null)));
        hh1 hh1Var = new hh1(4);
        this.a = gd3Var;
        this.b = y8Var;
        this.c = dq1Var;
        this.d = cm0Var;
        this.e = hh1Var;
        new v(10, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091 A[Catch: Exception -> 0x0099, TRY_ENTER, TryCatch #1 {Exception -> 0x0099, blocks: (B:25:0x003f, B:27:0x0052, B:30:0x0057, B:32:0x005b, B:35:0x0068, B:52:0x0091, B:53:0x0098, B:34:0x0064), top: B:61:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m63 a(l63 l63Var) {
        Typeface typefaceC;
        m63 m63Var;
        Object objRemove;
        dq1 dq1Var = this.c;
        synchronized (((ix2) dq1Var.i)) {
            try {
                m63 m63Var2 = (m63) ((xd1) dq1Var.j).a(l63Var);
                if (m63Var2 != null) {
                    if (m63Var2.i) {
                        return m63Var2;
                    }
                    xd1 xd1Var = (xd1) dq1Var.j;
                    synchronized (xd1Var.c) {
                        vb1 vb1Var = xd1Var.b;
                        vb1Var.getClass();
                        objRemove = vb1Var.a.remove(l63Var);
                        if (objRemove != null) {
                            xd1Var.d--;
                        }
                    }
                }
                try {
                    this.d.getClass();
                    mx2 mx2Var = l63Var.a;
                    y02 y02Var = (y02) this.e.i;
                    int i = l63Var.c;
                    im0 im0Var = l63Var.b;
                    if (mx2Var == null || (mx2Var instanceof o50)) {
                        typefaceC = y02Var.c(im0Var, i);
                    } else {
                        if (!(mx2Var instanceof so0)) {
                            m63Var = null;
                            if (m63Var != null) {
                                throw new IllegalStateException("Could not load font");
                            }
                            synchronized (((ix2) dq1Var.i)) {
                                if (((xd1) dq1Var.j).a(l63Var) == null && m63Var.i) {
                                    ((xd1) dq1Var.j).b(l63Var, m63Var);
                                }
                            }
                            return m63Var;
                        }
                        typefaceC = y02Var.h((so0) mx2Var, im0Var, i);
                    }
                    m63Var = new m63(typefaceC);
                    if (m63Var != null) {
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final m63 b(mx2 mx2Var, im0 im0Var, int i, int i2) {
        y8 y8Var = this.b;
        y8Var.getClass();
        int i3 = y8Var.h;
        im0 im0Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? im0Var : new im0(ci0.D(im0Var.h + i3, 1, 1000));
        this.a.getClass();
        return a(new l63(mx2Var, im0Var2, i, i2, null));
    }
}
