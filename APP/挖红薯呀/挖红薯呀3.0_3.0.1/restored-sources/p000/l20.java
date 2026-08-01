package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class l20 extends gd1 implements Runnable, rk0, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: e */
    public boolean f3322e;

    /* JADX INFO: renamed from: f */
    public int f3323f;

    /* JADX INFO: renamed from: g */
    public be1 f3324g;

    /* JADX INFO: renamed from: h */
    public final jh0 f3325h;

    /* JADX INFO: renamed from: i */
    public final dp0 f3326i;

    /* JADX INFO: renamed from: j */
    public final dh0 f3327j;

    /* JADX INFO: renamed from: k */
    public final c31 f3328k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l20() {
        super(1);
        jh0 jh0Var = new jh0(9);
        fe1.f1701a.getClass();
        jh0Var.m1707m(ee1.f1427b, new pe1("caption bar"));
        jh0Var.m1707m(ee1.f1428c, new pe1("display cutout"));
        jh0Var.m1707m(ee1.f1429d, new pe1("ime"));
        jh0Var.m1707m(ee1.f1430e, new pe1("mandatory system gestures"));
        jh0Var.m1707m(ee1.f1431f, new pe1("navigation bars"));
        jh0Var.m1707m(ee1.f1432g, new pe1("status bars"));
        jh0Var.m1707m(ee1.f1433h, new pe1("system gestures"));
        jh0Var.m1707m(ee1.f1434i, new pe1("tappable element"));
        jh0Var.m1707m(ee1.f1435j, new pe1("waterfall"));
        this.f3325h = jh0Var;
        this.f3326i = new dp0(0);
        this.f3327j = new dh0(4);
        this.f3328k = new c31();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.rk0
    /* JADX INFO: renamed from: a */
    public final be1 mo1964a(View view, be1 be1Var) {
        if (this.f3322e) {
            this.f3324g = be1Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return be1Var;
            }
        } else if (this.f3323f == 0) {
            m1965f(be1Var);
        }
        return be1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.gd1
    /* JADX INFO: renamed from: b */
    public final void mo1237b(id1 id1Var) {
        boolean z = false;
        this.f3322e = false;
        int typeMask = ((WindowInsetsAnimation) id1Var.f2526a.f5106d).getTypeMask();
        this.f3323f &= ~typeMask;
        this.f3324g = null;
        fe1 fe1Var = (fe1) he1.f2223a.m4248b(typeMask);
        if (fe1Var != null) {
            Object objM1701g = this.f3325h.m1701g(fe1Var);
            objM1701g.getClass();
            pe1 pe1Var = (pe1) objM1701g;
            pe1Var.f4820c.m597h(0.0f);
            pe1Var.f4822e.m597h(1.0f);
            pe1Var.f4821d.m952h(0L);
            pe1Var.f4820c.m597h(0.0f);
            pe1Var.f4819b.setValue(Boolean.FALSE);
            pe1Var.f4827j = -1L;
            pe1Var.f4828k = -1L;
            dp0 dp0Var = this.f3326i;
            dp0Var.m721h(dp0Var.m720g() + 1);
            synchronized (t21.f5893c) {
                kh0 kh0Var = t21.f5900j.f4268h;
                if (kh0Var != null) {
                    if (kh0Var.m1897h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                t21.m4163a();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.gd1
    /* JADX INFO: renamed from: c */
    public final void mo1238c(id1 id1Var) {
        this.f3322e = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.gd1
    /* JADX INFO: renamed from: d */
    public final be1 mo1239d(be1 be1Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            id1 id1Var = (id1) list.get(i);
            fe1 fe1Var = (fe1) he1.f2223a.m4248b(((WindowInsetsAnimation) id1Var.f2526a.f5106d).getTypeMask());
            if (fe1Var != null) {
                Object objM1701g = this.f3325h.m1701g(fe1Var);
                objM1701g.getClass();
                pe1 pe1Var = (pe1) objM1701g;
                if (((Boolean) pe1Var.f4819b.getValue()).booleanValue()) {
                    qb1 qb1Var = id1Var.f2526a;
                    WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) qb1Var.f5106d;
                    WindowInsetsAnimation windowInsetsAnimation2 = (WindowInsetsAnimation) qb1Var.f5106d;
                    pe1Var.f4820c.m597h(windowInsetsAnimation.getInterpolatedFraction());
                    pe1Var.f4822e.m597h(windowInsetsAnimation2.getAlpha());
                    pe1Var.f4821d.m952h(windowInsetsAnimation2.getDurationMillis());
                }
            }
        }
        m1965f(be1Var);
        return be1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.gd1
    /* JADX INFO: renamed from: e */
    public final C0111d mo1240e(id1 id1Var, C0111d c0111d) {
        be1 be1Var = this.f3324g;
        boolean z = false;
        this.f3322e = false;
        this.f3324g = null;
        if (((WindowInsetsAnimation) id1Var.f2526a.f5106d).getDurationMillis() > 0 && be1Var != null) {
            int typeMask = ((WindowInsetsAnimation) id1Var.f2526a.f5106d).getTypeMask();
            this.f3323f |= typeMask;
            fe1 fe1Var = (fe1) he1.f2223a.m4248b(typeMask);
            if (fe1Var != null) {
                Object objM1701g = this.f3325h.m1701g(fe1Var);
                objM1701g.getClass();
                pe1 pe1Var = (pe1) objM1701g;
                i20 i20VarMo3221h = be1Var.f503a.mo3221h(typeMask);
                long j = (((long) i20VarMo3221h.f2404a) << 48) | (((long) i20VarMo3221h.f2405b) << 32) | (((long) i20VarMo3221h.f2406c) << 16) | ((long) i20VarMo3221h.f2407d);
                long j2 = pe1Var.f4825h;
                if (!u50.m4268i(j, j2)) {
                    pe1Var.f4827j = j2;
                    pe1Var.f4828k = j;
                    pe1Var.f4819b.setValue(Boolean.TRUE);
                    qb1 qb1Var = id1Var.f2526a;
                    pe1Var.f4820c.m597h(((WindowInsetsAnimation) qb1Var.f5106d).getInterpolatedFraction());
                    pe1Var.f4822e.m597h(((WindowInsetsAnimation) qb1Var.f5106d).getAlpha());
                    pe1Var.f4821d.m952h(((WindowInsetsAnimation) qb1Var.f5106d).getDurationMillis());
                    dp0 dp0Var = this.f3326i;
                    dp0Var.m721h(dp0Var.m720g() + 1);
                    synchronized (t21.f5893c) {
                        kh0 kh0Var = t21.f5900j.f4268h;
                        if (kh0Var != null) {
                            if (kh0Var.m1897h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        t21.m4163a();
                        return c0111d;
                    }
                }
            }
        }
        return c0111d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0257  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1965f(be1 be1Var) {
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
        ug0 ug0Var = he1.f2223a;
        int[] iArr3 = ug0Var.f6112b;
        Object[] objArr3 = ug0Var.f6113c;
        long[] jArr3 = ug0Var.f6111a;
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
                            fe1 fe1Var = (fe1) objArr3[i6];
                            i20 i20VarMo3221h = be1Var.f503a.mo3221h(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (((long) i20VarMo3221h.f2404a) << 48) | (((long) i20VarMo3221h.f2405b) << 32) | (((long) i20VarMo3221h.f2406c) << 16) | ((long) i20VarMo3221h.f2407d);
                            Object objM1701g = this.f3325h.m1701g(fe1Var);
                            objM1701g.getClass();
                            pe1 pe1Var = (pe1) objM1701g;
                            j2 = j3;
                            if (!u50.m4268i(j4, pe1Var.f4825h)) {
                                pe1Var.f4825h = j4;
                                z2 = true;
                                if (!u50.m4268i(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                i20 i20VarMo3222i = be1Var.f503a.mo3222i(i7);
                                objArr2 = objArr3;
                                long j5 = (((long) i20VarMo3222i.f2405b) << 32) | (((long) i20VarMo3222i.f2404a) << 48) | (((long) i20VarMo3222i.f2406c) << 16) | ((long) i20VarMo3222i.f2407d);
                                if (!u50.m4268i(pe1Var.f4826i, j5)) {
                                    pe1Var.f4826i = j5;
                                    z2 = true;
                                    if (!u50.m4268i(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            pe1Var.f4818a.setValue(Boolean.valueOf(be1Var.f503a.mo4317q(i7)));
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
        C0362jo c0362joMo4064g = be1Var.f503a.mo4064g();
        if (c0362joMo4064g == null) {
            j = 0;
        } else {
            i20 i20VarM1513b = i20.m1513b(c0362joMo4064g.f2918a.getWaterfallInsets());
            j = (((long) i20VarM1513b.f2404a) << c3) | (((long) i20VarM1513b.f2405b) << c2) | (((long) i20VarM1513b.f2406c) << c) | ((long) i20VarM1513b.f2407d);
        }
        jh0 jh0Var = this.f3325h;
        fe1.f1701a.getClass();
        Object objM1701g2 = jh0Var.m1701g(ee1.f1435j);
        objM1701g2.getClass();
        pe1 pe1Var2 = (pe1) objM1701g2;
        pe1Var2.f4818a.setValue(Boolean.valueOf(!u50.m4268i(j, 0L)));
        if (!u50.m4268i(pe1Var2.f4825h, j)) {
            pe1Var2.f4825h = j;
            pe1Var2.f4826i = j;
            z2 = z;
            if (!u50.m4268i(j, 0L)) {
                z3 = z2;
            }
        }
        if (c0362joMo4064g == null) {
            dh0 dh0Var = this.f3327j;
            if (dh0Var.f1109b > 0) {
                dh0Var.m700d();
                this.f3328k.clear();
                z2 = z;
            }
        } else {
            List<Rect> boundingRects = c0362joMo4064g.f2918a.getBoundingRects();
            int size = boundingRects.size();
            dh0 dh0Var2 = this.f3327j;
            if (size < dh0Var2.f1109b) {
                dh0Var2.m708l(boundingRects.size(), this.f3327j.f1109b);
                this.f3328k.m442d(boundingRects.size(), this.f3328k.size());
                z2 = z;
            } else {
                int size2 = boundingRects.size() - this.f3327j.f1109b;
                int i8 = 0;
                while (i8 < size2) {
                    dh0 dh0Var3 = this.f3327j;
                    dh0Var3.m697a(r60.m3419u(boundingRects.get(dh0Var3.f1109b)));
                    this.f3328k.add(new d20("display cutout rect " + this.f3327j.f1109b));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = boundingRects.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = boundingRects.get(i9);
                oh0 oh0Var = (oh0) this.f3327j.m702f(i9);
                if (!p30.m3002l(oh0Var.getValue(), rect)) {
                    oh0Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!boundingRects.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.f3326i.m720g() != 0) && z2) {
            dp0 dp0Var = this.f3326i;
            dp0Var.m721h(dp0Var.m720g() + 1);
            synchronized (t21.f5893c) {
                kh0 kh0Var = t21.f5900j.f4268h;
                if (kh0Var != null) {
                    boolean z5 = z;
                    z4 = kh0Var.m1897h() == z5 ? z5 : false;
                }
            }
            if (z4) {
                t21.m4163a();
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
        int i = kc1.f3078a;
        gc1.m1236a(view, this);
        kc1.m1788a(view, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = kc1.f3078a;
        gc1.m1236a(view, null);
        view.setWindowInsetsAnimationCallback(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3322e) {
            this.f3323f = 0;
            this.f3322e = false;
            be1 be1Var = this.f3324g;
            if (be1Var != null) {
                m1965f(be1Var);
                this.f3324g = null;
            }
        }
    }
}
