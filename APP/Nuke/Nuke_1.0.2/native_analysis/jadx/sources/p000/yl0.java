package p000;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yl0 implements xl0 {

    /* JADX INFO: renamed from: a */
    public final gd3 f13505a;

    /* JADX INFO: renamed from: b */
    public final C0914y8 f13506b;

    /* JADX INFO: renamed from: c */
    public final dq1 f13507c;

    /* JADX INFO: renamed from: d */
    public final cm0 f13508d;

    /* JADX INFO: renamed from: e */
    public final hh1 f13509e;

    public yl0(gd3 gd3Var, C0914y8 c0914y8) {
        dq1 dq1Var = zl0.f13942a;
        cm0 cm0Var = new cm0();
        bm0 bm0Var = cm0.f1620a;
        vr0 vr0Var = n90.f7057a;
        bm0Var.getClass();
        AbstractC0731te.m5206e(xe1.m6120f0(bm0Var, vr0Var).mo14k(zd0.f13837h).mo14k(new mw2(null)));
        hh1 hh1Var = new hh1(4);
        this.f13505a = gd3Var;
        this.f13506b = c0914y8;
        this.f13507c = dq1Var;
        this.f13508d = cm0Var;
        this.f13509e = hh1Var;
        new C0792v(10, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091 A[Catch: Exception -> 0x0099, TRY_ENTER, TryCatch #1 {Exception -> 0x0099, blocks: (B:25:0x003f, B:27:0x0052, B:30:0x0057, B:32:0x005b, B:35:0x0068, B:52:0x0091, B:53:0x0098, B:34:0x0064), top: B:61:0x003f }] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m63 m6287a(l63 l63Var) {
        Typeface typefaceMo2276c;
        m63 m63Var;
        Object objRemove;
        dq1 dq1Var = this.f13507c;
        synchronized (((ix2) dq1Var.f2147i)) {
            try {
                m63 m63Var2 = (m63) ((xd1) dq1Var.f2148j).m6081a(l63Var);
                if (m63Var2 != null) {
                    if (m63Var2.f6490i) {
                        return m63Var2;
                    }
                    xd1 xd1Var = (xd1) dq1Var.f2148j;
                    synchronized (xd1Var.f12973c) {
                        vb1 vb1Var = xd1Var.f12972b;
                        vb1Var.getClass();
                        objRemove = vb1Var.f11892a.remove(l63Var);
                        if (objRemove != null) {
                            xd1Var.f12974d--;
                        }
                    }
                }
                try {
                    this.f13508d.getClass();
                    mx2 mx2Var = l63Var.f5961a;
                    y02 y02Var = (y02) this.f13509e.f4019i;
                    int i = l63Var.f5963c;
                    im0 im0Var = l63Var.f5962b;
                    if (mx2Var == null || (mx2Var instanceof o50)) {
                        typefaceMo2276c = y02Var.mo2276c(im0Var, i);
                    } else {
                        if (!(mx2Var instanceof so0)) {
                            m63Var = null;
                            if (m63Var != null) {
                                throw new IllegalStateException("Could not load font");
                            }
                            synchronized (((ix2) dq1Var.f2147i)) {
                                if (((xd1) dq1Var.f2148j).m6081a(l63Var) == null && m63Var.f6490i) {
                                    ((xd1) dq1Var.f2148j).m6082b(l63Var, m63Var);
                                }
                            }
                            return m63Var;
                        }
                        typefaceMo2276c = y02Var.mo2277h((so0) mx2Var, im0Var, i);
                    }
                    m63Var = new m63(typefaceMo2276c);
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

    /* JADX INFO: renamed from: b */
    public final m63 m6288b(mx2 mx2Var, im0 im0Var, int i, int i2) {
        C0914y8 c0914y8 = this.f13506b;
        c0914y8.getClass();
        int i3 = c0914y8.f13341h;
        im0 im0Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? im0Var : new im0(ci0.m779D(im0Var.f4684h + i3, 1, 1000));
        this.f13505a.getClass();
        return m6287a(new l63(mx2Var, im0Var2, i, i2, null));
    }
}
