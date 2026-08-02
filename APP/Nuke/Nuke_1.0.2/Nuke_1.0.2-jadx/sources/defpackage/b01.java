package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b01 extends wd3 implements Runnable, gt1, View.OnAttachStateChangeListener {
    public boolean j;
    public int k;
    public cf3 l;
    public final rk1 m;
    public final kx1 n;
    public final lk1 o;
    public final ps2 p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b01() {
        super(1);
        rk1 rk1Var = new rk1(9);
        hf3.a.getClass();
        rk1Var.m(gf3.b, new xf3("caption bar"));
        rk1Var.m(gf3.c, new xf3("display cutout"));
        rk1Var.m(gf3.d, new xf3("ime"));
        rk1Var.m(gf3.e, new xf3("mandatory system gestures"));
        rk1Var.m(gf3.f, new xf3("navigation bars"));
        rk1Var.m(gf3.g, new xf3("status bars"));
        rk1Var.m(gf3.h, new xf3("system gestures"));
        rk1Var.m(gf3.i, new xf3("tappable element"));
        rk1Var.m(gf3.j, new xf3("waterfall"));
        this.m = rk1Var;
        this.n = new kx1(0);
        this.o = new lk1(4);
        this.p = new ps2();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wd3
    public final void a(ge3 ge3Var) {
        boolean z = false;
        this.j = false;
        int iD = ge3Var.a.d();
        this.k &= ~iD;
        this.l = null;
        hf3 hf3Var = (hf3) jf3.a.b(iD);
        if (hf3Var != null) {
            Object objG = this.m.g(hf3Var);
            objG.getClass();
            xf3 xf3Var = (xf3) objG;
            xf3Var.c.h(0.0f);
            xf3Var.e.h(1.0f);
            xf3Var.d.h(0L);
            xf3Var.c.h(0.0f);
            xf3Var.b.setValue(Boolean.FALSE);
            xf3Var.j = -1L;
            xf3Var.k = -1L;
            kx1 kx1Var = this.n;
            kx1Var.h(kx1Var.g() + 1);
            synchronized (ds2.c) {
                sk1 sk1Var = ds2.j.h;
                if (sk1Var != null) {
                    if (sk1Var.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                ds2.a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gt1
    public final cf3 b(View view, cf3 cf3Var) {
        if (this.j) {
            this.l = cf3Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return cf3Var;
            }
        } else if (this.k == 0) {
            f(cf3Var);
        }
        return cf3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wd3
    public final void c(ge3 ge3Var) {
        this.j = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wd3
    public final cf3 d(cf3 cf3Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ge3 ge3Var = (ge3) list.get(i);
            hf3 hf3Var = (hf3) jf3.a.b(ge3Var.a.d());
            if (hf3Var != null) {
                Object objG = this.m.g(hf3Var);
                objG.getClass();
                xf3 xf3Var = (xf3) objG;
                if (((Boolean) xf3Var.b.getValue()).booleanValue()) {
                    fe3 fe3Var = ge3Var.a;
                    xf3Var.c.h(fe3Var.c());
                    xf3Var.e.h(fe3Var.a());
                    xf3Var.d.h(fe3Var.b());
                }
            }
        }
        f(cf3Var);
        return cf3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wd3
    public final dq1 e(ge3 ge3Var, dq1 dq1Var) {
        cf3 cf3Var = this.l;
        boolean z = false;
        this.j = false;
        this.l = null;
        if (ge3Var.a.b() > 0 && cf3Var != null) {
            int iD = ge3Var.a.d();
            this.k |= iD;
            hf3 hf3Var = (hf3) jf3.a.b(iD);
            if (hf3Var != null) {
                Object objG = this.m.g(hf3Var);
                objG.getClass();
                xf3 xf3Var = (xf3) objG;
                zz0 zz0VarI = cf3Var.a.i(iD);
                long j = (((long) zz0VarI.a) << 48) | (((long) zz0VarI.b) << 32) | (((long) zz0VarI.c) << 16) | ((long) zz0VarI.d);
                long j2 = xf3Var.h;
                if (!n93.b(j, j2)) {
                    xf3Var.j = j2;
                    xf3Var.k = j;
                    xf3Var.b.setValue(Boolean.TRUE);
                    fe3 fe3Var = ge3Var.a;
                    xf3Var.c.h(fe3Var.c());
                    xf3Var.e.h(fe3Var.a());
                    xf3Var.d.h(fe3Var.b());
                    kx1 kx1Var = this.n;
                    kx1Var.h(kx1Var.g() + 1);
                    synchronized (ds2.c) {
                        sk1 sk1Var = ds2.j.h;
                        if (sk1Var != null) {
                            if (sk1Var.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        ds2.a();
                        return dq1Var;
                    }
                }
            }
        }
        return dq1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(cf3 cf3Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        zj1 zj1Var = jf3.a;
        int[] iArr3 = zj1Var.b;
        Object[] objArr3 = zj1Var.c;
        long[] jArr3 = zj1Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            hf3 hf3Var = (hf3) objArr3[i6];
                            zz0 zz0VarI = cf3Var.a.i(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (((long) zz0VarI.a) << 48) | (((long) zz0VarI.b) << 32) | (((long) zz0VarI.c) << 16) | ((long) zz0VarI.d);
                            Object objG = this.m.g(hf3Var);
                            objG.getClass();
                            xf3 xf3Var = (xf3) objG;
                            j2 = j3;
                            if (!n93.b(j4, xf3Var.h)) {
                                xf3Var.h = j4;
                                z2 = true;
                                if (!n93.b(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                zz0 zz0VarJ = cf3Var.a.j(i7);
                                objArr2 = objArr3;
                                long j5 = (((long) zz0VarJ.b) << 32) | (((long) zz0VarJ.a) << 48) | (((long) zz0VarJ.c) << 16) | ((long) zz0VarJ.d);
                                if (!n93.b(xf3Var.i, j5)) {
                                    xf3Var.i = j5;
                                    z2 = true;
                                    if (!n93.b(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            xf3Var.a.setValue(Boolean.valueOf(cf3Var.a.u(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        t90 t90VarH = cf3Var.a.h();
        if (t90VarH == null) {
            j = 0;
        } else {
            zz0 zz0VarA = t90VarH.a();
            j = (((long) zz0VarA.a) << c3) | (((long) zz0VarA.b) << c2) | (((long) zz0VarA.c) << c) | ((long) zz0VarA.d);
        }
        rk1 rk1Var = this.m;
        hf3.a.getClass();
        Object objG2 = rk1Var.g(gf3.j);
        objG2.getClass();
        xf3 xf3Var2 = (xf3) objG2;
        xf3Var2.a.setValue(Boolean.valueOf(!n93.b(j, 0L)));
        if (!n93.b(xf3Var2.h, j)) {
            xf3Var2.h = j;
            xf3Var2.i = j;
            z2 = z;
            if (!n93.b(j, 0L)) {
                z3 = z2;
            }
        }
        if (t90VarH == null) {
            lk1 lk1Var = this.o;
            if (lk1Var.b > 0) {
                lk1Var.d();
                this.p.clear();
                z2 = z;
            }
        } else {
            List listB = Build.VERSION.SDK_INT >= 28 ? s90.b(t90VarH.a) : Collections.EMPTY_LIST;
            int size = listB.size();
            lk1 lk1Var2 = this.o;
            if (size < lk1Var2.b) {
                lk1Var2.l(listB.size(), this.o.b);
                this.p.d(listB.size(), this.p.size());
                z2 = z;
            } else {
                int size2 = listB.size() - this.o.b;
                int i8 = 0;
                while (i8 < size2) {
                    lk1 lk1Var3 = this.o;
                    lk1Var3.a(op0.u(listB.get(lk1Var3.b)));
                    this.p.add(new rz0("display cutout rect " + this.o.b));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listB.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listB.get(i9);
                xk1 xk1Var = (xk1) this.o.f(i9);
                if (!t11.l(xk1Var.getValue(), rect)) {
                    xk1Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!listB.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.n.g() != 0) && z2) {
            kx1 kx1Var = this.n;
            kx1Var.h(kx1Var.g() + 1);
            synchronized (ds2.c) {
                sk1 sk1Var = ds2.j.h;
                if (sk1Var != null) {
                    boolean z5 = z;
                    z4 = sk1Var.h() == z5 ? z5 : false;
                }
            }
            if (z4) {
                ds2.a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = wa3.a;
        ra3.b(view, this);
        wa3.b(view, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = wa3.a;
        ra3.b(view, null);
        wa3.b(view, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.j) {
            this.k = 0;
            this.j = false;
            cf3 cf3Var = this.l;
            if (cf3Var != null) {
                f(cf3Var);
                this.l = null;
            }
        }
    }
}
