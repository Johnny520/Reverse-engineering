package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b01 extends wd3 implements Runnable, gt1, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: j */
    public boolean f470j;

    /* JADX INFO: renamed from: k */
    public int f471k;

    /* JADX INFO: renamed from: l */
    public cf3 f472l;

    /* JADX INFO: renamed from: m */
    public final rk1 f473m;

    /* JADX INFO: renamed from: n */
    public final kx1 f474n;

    /* JADX INFO: renamed from: o */
    public final lk1 f475o;

    /* JADX INFO: renamed from: p */
    public final ps2 f476p;

    public b01() {
        super(1);
        rk1 rk1Var = new rk1(9);
        hf3.f3996a.getClass();
        rk1Var.m4511m(gf3.f3493b, new xf3("caption bar"));
        rk1Var.m4511m(gf3.f3494c, new xf3("display cutout"));
        rk1Var.m4511m(gf3.f3495d, new xf3("ime"));
        rk1Var.m4511m(gf3.f3496e, new xf3("mandatory system gestures"));
        rk1Var.m4511m(gf3.f3497f, new xf3("navigation bars"));
        rk1Var.m4511m(gf3.f3498g, new xf3("status bars"));
        rk1Var.m4511m(gf3.f3499h, new xf3("system gestures"));
        rk1Var.m4511m(gf3.f3500i, new xf3("tappable element"));
        rk1Var.m4511m(gf3.f3501j, new xf3("waterfall"));
        this.f473m = rk1Var;
        this.f474n = new kx1(0);
        this.f475o = new lk1(4);
        this.f476p = new ps2();
    }

    @Override // p000.wd3
    /* JADX INFO: renamed from: a */
    public final void mo332a(ge3 ge3Var) {
        boolean z = false;
        this.f470j = false;
        int iMo1347d = ge3Var.f3471a.mo1347d();
        this.f471k &= ~iMo1347d;
        this.f472l = null;
        hf3 hf3Var = (hf3) jf3.f5018a.m6022b(iMo1347d);
        if (hf3Var != null) {
            Object objM4505g = this.f473m.m4505g(hf3Var);
            objM4505g.getClass();
            xf3 xf3Var = (xf3) objM4505g;
            xf3Var.f13016c.m2592h(0.0f);
            xf3Var.f13018e.m2592h(1.0f);
            xf3Var.f13017d.m2985h(0L);
            xf3Var.f13016c.m2592h(0.0f);
            xf3Var.f13015b.setValue(Boolean.FALSE);
            xf3Var.f13023j = -1L;
            xf3Var.f13024k = -1L;
            kx1 kx1Var = this.f474n;
            kx1Var.m2760h(kx1Var.m2759g() + 1);
            synchronized (ds2.f2181c) {
                sk1 sk1Var = ds2.f2188j.f12560h;
                if (sk1Var != null) {
                    if (sk1Var.m4889h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                ds2.m1117a();
            }
        }
    }

    @Override // p000.gt1
    /* JADX INFO: renamed from: b */
    public final cf3 mo333b(View view, cf3 cf3Var) {
        if (this.f470j) {
            this.f472l = cf3Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return cf3Var;
            }
        } else if (this.f471k == 0) {
            m335f(cf3Var);
        }
        return cf3Var;
    }

    @Override // p000.wd3
    /* JADX INFO: renamed from: c */
    public final void mo334c(ge3 ge3Var) {
        this.f470j = true;
    }

    @Override // p000.wd3
    /* JADX INFO: renamed from: d */
    public final cf3 mo127d(cf3 cf3Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ge3 ge3Var = (ge3) list.get(i);
            hf3 hf3Var = (hf3) jf3.f5018a.m6022b(ge3Var.f3471a.mo1347d());
            if (hf3Var != null) {
                Object objM4505g = this.f473m.m4505g(hf3Var);
                objM4505g.getClass();
                xf3 xf3Var = (xf3) objM4505g;
                if (((Boolean) xf3Var.f13015b.getValue()).booleanValue()) {
                    fe3 fe3Var = ge3Var.f3471a;
                    xf3Var.f13016c.m2592h(fe3Var.mo1346c());
                    xf3Var.f13018e.m2592h(fe3Var.mo1344a());
                    xf3Var.f13017d.m2985h(fe3Var.mo1345b());
                }
            }
        }
        m335f(cf3Var);
        return cf3Var;
    }

    @Override // p000.wd3
    /* JADX INFO: renamed from: e */
    public final dq1 mo128e(ge3 ge3Var, dq1 dq1Var) {
        cf3 cf3Var = this.f472l;
        boolean z = false;
        this.f470j = false;
        this.f472l = null;
        if (ge3Var.f3471a.mo1345b() > 0 && cf3Var != null) {
            int iMo1347d = ge3Var.f3471a.mo1347d();
            this.f471k |= iMo1347d;
            hf3 hf3Var = (hf3) jf3.f5018a.m6022b(iMo1347d);
            if (hf3Var != null) {
                Object objM4505g = this.f473m.m4505g(hf3Var);
                objM4505g.getClass();
                xf3 xf3Var = (xf3) objM4505g;
                zz0 zz0VarMo4165i = cf3Var.f1518a.mo4165i(iMo1347d);
                long j = (((long) zz0VarMo4165i.f14157a) << 48) | (((long) zz0VarMo4165i.f14158b) << 32) | (((long) zz0VarMo4165i.f14159c) << 16) | ((long) zz0VarMo4165i.f14160d);
                long j2 = xf3Var.f13021h;
                if (!n93.m3261b(j, j2)) {
                    xf3Var.f13023j = j2;
                    xf3Var.f13024k = j;
                    xf3Var.f13015b.setValue(Boolean.TRUE);
                    fe3 fe3Var = ge3Var.f3471a;
                    xf3Var.f13016c.m2592h(fe3Var.mo1346c());
                    xf3Var.f13018e.m2592h(fe3Var.mo1344a());
                    xf3Var.f13017d.m2985h(fe3Var.mo1345b());
                    kx1 kx1Var = this.f474n;
                    kx1Var.m2760h(kx1Var.m2759g() + 1);
                    synchronized (ds2.f2181c) {
                        sk1 sk1Var = ds2.f2188j.f12560h;
                        if (sk1Var != null) {
                            if (sk1Var.m4889h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        ds2.m1117a();
                        return dq1Var;
                    }
                }
            }
        }
        return dq1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x025a  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m335f(cf3 cf3Var) {
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
        zj1 zj1Var = jf3.f5018a;
        int[] iArr3 = zj1Var.f12750b;
        Object[] objArr3 = zj1Var.f12751c;
        long[] jArr3 = zj1Var.f12749a;
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
                            zz0 zz0VarMo4165i = cf3Var.f1518a.mo4165i(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (((long) zz0VarMo4165i.f14157a) << 48) | (((long) zz0VarMo4165i.f14158b) << 32) | (((long) zz0VarMo4165i.f14159c) << 16) | ((long) zz0VarMo4165i.f14160d);
                            Object objM4505g = this.f473m.m4505g(hf3Var);
                            objM4505g.getClass();
                            xf3 xf3Var = (xf3) objM4505g;
                            j2 = j3;
                            if (!n93.m3261b(j4, xf3Var.f13021h)) {
                                xf3Var.f13021h = j4;
                                z2 = true;
                                if (!n93.m3261b(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                zz0 zz0VarMo4166j = cf3Var.f1518a.mo4166j(i7);
                                objArr2 = objArr3;
                                long j5 = (((long) zz0VarMo4166j.f14158b) << 32) | (((long) zz0VarMo4166j.f14157a) << 48) | (((long) zz0VarMo4166j.f14159c) << 16) | ((long) zz0VarMo4166j.f14160d);
                                if (!n93.m3261b(xf3Var.f13022i, j5)) {
                                    xf3Var.f13022i = j5;
                                    z2 = true;
                                    if (!n93.m3261b(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            xf3Var.f13014a.setValue(Boolean.valueOf(cf3Var.f1518a.mo4172u(i7)));
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
        t90 t90VarMo4858h = cf3Var.f1518a.mo4858h();
        if (t90VarMo4858h == null) {
            j = 0;
        } else {
            zz0 zz0VarM5142a = t90VarMo4858h.m5142a();
            j = (((long) zz0VarM5142a.f14157a) << c3) | (((long) zz0VarM5142a.f14158b) << c2) | (((long) zz0VarM5142a.f14159c) << c) | ((long) zz0VarM5142a.f14160d);
        }
        rk1 rk1Var = this.f473m;
        hf3.f3996a.getClass();
        Object objM4505g2 = rk1Var.m4505g(gf3.f3501j);
        objM4505g2.getClass();
        xf3 xf3Var2 = (xf3) objM4505g2;
        xf3Var2.f13014a.setValue(Boolean.valueOf(!n93.m3261b(j, 0L)));
        if (!n93.m3261b(xf3Var2.f13021h, j)) {
            xf3Var2.f13021h = j;
            xf3Var2.f13022i = j;
            z2 = z;
            if (!n93.m3261b(j, 0L)) {
                z3 = z2;
            }
        }
        if (t90VarMo4858h == null) {
            lk1 lk1Var = this.f475o;
            if (lk1Var.f6164b > 0) {
                lk1Var.m2928d();
                this.f476p.clear();
                z2 = z;
            }
        } else {
            List listM4772b = Build.VERSION.SDK_INT >= 28 ? s90.m4772b(t90VarMo4858h.f10619a) : Collections.EMPTY_LIST;
            int size = listM4772b.size();
            lk1 lk1Var2 = this.f475o;
            if (size < lk1Var2.f6164b) {
                lk1Var2.m2936l(listM4772b.size(), this.f475o.f6164b);
                this.f476p.m3969d(listM4772b.size(), this.f476p.size());
                z2 = z;
            } else {
                int size2 = listM4772b.size() - this.f475o.f6164b;
                int i8 = 0;
                while (i8 < size2) {
                    lk1 lk1Var3 = this.f475o;
                    lk1Var3.m2925a(op0.m3598u(listM4772b.get(lk1Var3.f6164b)));
                    this.f476p.add(new rz0("display cutout rect " + this.f475o.f6164b));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listM4772b.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listM4772b.get(i9);
                xk1 xk1Var = (xk1) this.f475o.m2930f(i9);
                if (!t11.m5086l(xk1Var.getValue(), rect)) {
                    xk1Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!listM4772b.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.f474n.m2759g() != 0) && z2) {
            kx1 kx1Var = this.f474n;
            kx1Var.m2760h(kx1Var.m2759g() + 1);
            synchronized (ds2.f2181c) {
                sk1 sk1Var = ds2.f2188j.f12560h;
                if (sk1Var != null) {
                    boolean z5 = z;
                    z4 = sk1Var.m4889h() == z5 ? z5 : false;
                }
            }
            if (z4) {
                ds2.m1117a();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = wa3.f12444a;
        ra3.m4425b(view, this);
        wa3.m5863b(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i = wa3.f12444a;
        ra3.m4425b(view, null);
        wa3.m5863b(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f470j) {
            this.f471k = 0;
            this.f470j = false;
            cf3 cf3Var = this.f472l;
            if (cf3Var != null) {
                m335f(cf3Var);
                this.f472l = null;
            }
        }
    }
}
