package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: renamed from: oj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0545oj extends th1 implements j61, mc0, on2, r12, wh1, ox1, a61, dq0, pk0, fl0, il0, aw1, InterfaceC0662rn {

    /* JADX INFO: renamed from: v */
    public sh1 f7691v;

    @Override // p000.aw1
    /* JADX INFO: renamed from: B */
    public final boolean mo298B() {
        return this.f10770u;
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: D */
    public final int mo2360D(kd1 kd1Var, if1 if1Var, int i) {
        sh1 sh1Var = this.f7691v;
        sh1Var.getClass();
        return ((h61) sh1Var).mo2078e(new z11(kd1Var, kd1Var.getLayoutDirection()), new s50(if1Var, rf1.f9541h, sf1.f10103i, 1), AbstractC0258gz.m2028b(0, i, 0, 0, 13)).mo106c();
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        m3565M0(true);
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        if (!this.f10770u) {
            kz0.m2764b("unInitializeModifier called on unattached node");
        }
        if ((this.f10759j & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(this)).m456C();
        }
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: J */
    public final void mo215J(h12 h12Var, i12 i12Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        sh1 sh1Var = this.f7691v;
        sh1Var.getClass();
        kj1 kj1Var = ((u12) sh1Var).f11059d;
        u12 u12Var = (u12) kj1Var.f5597l;
        List list = h12Var.f3776a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o12 o12Var = (o12) list.get(i);
            if (tp0.m5367o(o12Var) || tp0.m5369q(o12Var)) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((o12) list.get(i2)).m3464b()) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        if (u12Var.f11058c) {
            z3 = true;
        } else {
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                if (i3 < size3) {
                    o12 o12Var2 = (o12) list.get(i3);
                    if (tp0.m5367o(o12Var2) || tp0.m5369q(o12Var2)) {
                        break;
                    } else {
                        i3++;
                    }
                } else if (z2) {
                    break;
                } else {
                    z3 = false;
                }
            }
            z3 = true;
        }
        t12 t12Var = (t12) kj1Var.f5595j;
        t12 t12Var2 = t12.f10491j;
        i12 i12Var2 = i12.f4218j;
        if (t12Var != t12Var2) {
            if (i12Var == i12.f4216h && z3) {
                kj1Var.f5596k = h12Var;
                kj1Var.m2710o(h12Var, !z || u12Var.f11058c);
            }
            if (i12Var == i12.f4217i && z && h12Var == ((h12) kj1Var.f5596k) && u12Var.f11058c) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((o12) list.get(i4)).m3463a();
                }
            }
            if (i12Var == i12Var2 && !z3 && h12Var != ((h12) kj1Var.f5596k)) {
                kj1Var.m2710o(h12Var, true);
            }
        }
        if (i12Var == i12Var2) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    kj1Var.f5595j = t12.f10489h;
                    ((u12) kj1Var.f5597l).f11058c = false;
                    kj1Var.f5596k = null;
                    break;
                } else if (!tp0.m5369q((o12) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (h12Var == ((h12) kj1Var.f5596k) && z) {
                int size6 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        break;
                    }
                    if (!((o12) list.get(i6)).m3464b()) {
                        i6++;
                    } else if (!u12Var.f11058c) {
                        kj1Var.m2706K(h12Var);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((o12) list.get(i7)).m3463a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m3565M0(boolean z) {
        if (!this.f10770u) {
            kz0.m2764b("initializeModifier called on unattached node");
        }
        sh1 sh1Var = this.f7691v;
        if ((this.f10759j & 4) != 0 && !z) {
            sp0.m4927Z(this, 2).m6457Z0();
        }
        if ((this.f10759j & 2) != 0) {
            qx2 qx2Var = (qx2) sp0.m4933c0(this).f9372M.f12035f;
            qx2Var.getClass();
            if (qx2Var.f9283v) {
                zn1 zn1Var = this.f10764o;
                zn1Var.getClass();
                ((l61) zn1Var).m2845u1(this);
                yv1 yv1Var = zn1Var.f13984S;
                if (yv1Var != null) {
                    ((sq0) yv1Var).m4969c();
                }
            }
            if (!z) {
                sp0.m4927Z(this, 2).m6457Z0();
                sp0.m4933c0(this).m4347E();
            }
        }
        if (sh1Var instanceof b91) {
            ((b91) sh1Var).f746a.f1926k = sp0.m4933c0(this);
        }
        int i = this.f10759j;
        if ((i & 16) != 0 && (sh1Var instanceof u12)) {
            ((u12) sh1Var).f11059d.f5594i = this.f10764o;
        }
        if ((i & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) sp0.m4939f0(this)).m456C();
        }
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: P */
    public final void mo1851P(t61 t61Var) {
        sh1 sh1Var = this.f7691v;
        sh1Var.getClass();
        t61Var.m5125a();
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: U */
    public final int mo2361U(kd1 kd1Var, if1 if1Var, int i) {
        sh1 sh1Var = this.f7691v;
        sh1Var.getClass();
        return ((h61) sh1Var).mo2078e(new z11(kd1Var, kd1Var.getLayoutDirection()), new s50(if1Var, rf1.f9541h, sf1.f10102h, 1), AbstractC0258gz.m2028b(0, 0, 0, i, 7)).mo108e();
    }

    @Override // p000.fl0
    /* JADX INFO: renamed from: W */
    public final void mo1661W(dl0 dl0Var) {
        sh1 sh1Var = this.f7691v;
        kz0.m2764b("applyFocusProperties called on wrong node");
        sh1Var.getClass();
        throw new ClassCastException();
    }

    @Override // p000.pk0
    /* JADX INFO: renamed from: Z */
    public final void mo299Z(kl0 kl0Var) {
        sh1 sh1Var = this.f7691v;
        kz0.m2764b("onFocusEvent called on wrong node");
        sh1Var.getClass();
        throw new ClassCastException();
    }

    @Override // p000.t60, p000.r12
    /* JADX INFO: renamed from: a */
    public final void mo225a() {
        if (this.f7691v instanceof u12) {
            mo233m0();
        }
    }

    @Override // p000.InterfaceC0662rn
    /* JADX INFO: renamed from: b */
    public final e70 mo1840b() {
        return sp0.m4933c0(this).f9365F;
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: b0 */
    public final boolean mo3566b0() {
        sh1 sh1Var = this.f7691v;
        sh1Var.getClass();
        ((u12) sh1Var).f11059d.getClass();
        return true;
    }

    @Override // p000.InterfaceC0662rn
    /* JADX INFO: renamed from: d */
    public final long mo1842d() {
        return s11.m4715q0(sp0.m4927Z(this, 128).f10440j);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        sh1 sh1Var = this.f7691v;
        sh1Var.getClass();
        return ((h61) sh1Var).mo2078e(pf1Var, if1Var, j);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: g */
    public final int mo2362g(kd1 kd1Var, if1 if1Var, int i) {
        sh1 sh1Var = this.f7691v;
        sh1Var.getClass();
        return ((h61) sh1Var).mo2078e(new z11(kd1Var, kd1Var.getLayoutDirection()), new s50(if1Var, rf1.f9542i, sf1.f10102h, 1), AbstractC0258gz.m2028b(0, 0, 0, i, 7)).mo108e();
    }

    @Override // p000.InterfaceC0662rn
    public final d61 getLayoutDirection() {
        return sp0.m4933c0(this).f9366G;
    }

    @Override // p000.wh1
    /* JADX INFO: renamed from: j */
    public final C0700sn mo3567j() {
        return C0700sn.f10203G;
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: l0 */
    public final void mo232l0(zn2 zn2Var) {
        sh1 sh1Var = this.f7691v;
        sh1Var.getClass();
        ln2 ln2VarMo2229d = ((mn2) sh1Var).mo2229d();
        zn2Var.getClass();
        ln2 ln2Var = (ln2) zn2Var;
        rk1 rk1Var = ln2Var.f6221h;
        if (ln2VarMo2229d.f6223j) {
            ln2Var.f6223j = true;
        }
        if (ln2VarMo2229d.f6224k) {
            ln2Var.f6224k = true;
        }
        rk1 rk1Var2 = ln2VarMo2229d.f6221h;
        Object[] objArr = rk1Var2.f9619b;
        Object[] objArr2 = rk1Var2.f9620c;
        long[] jArr = rk1Var2.f9618a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        yn2 yn2Var = (yn2) obj;
                        if (!rk1Var.m4500b(yn2Var)) {
                            rk1Var.m4511m(yn2Var, obj2);
                        } else if (obj2 instanceof C0603q3) {
                            Object objM4505g = rk1Var.m4505g(yn2Var);
                            objM4505g.getClass();
                            C0603q3 c0603q3 = (C0603q3) objM4505g;
                            String str = c0603q3.f8712a;
                            if (str == null) {
                                str = ((C0603q3) obj2).f8712a;
                            }
                            un0 un0Var = c0603q3.f8713b;
                            if (un0Var == null) {
                                un0Var = ((C0603q3) obj2).f8713b;
                            }
                            rk1Var.m4511m(yn2Var, new C0603q3(str, un0Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: m0 */
    public final void mo233m0() {
        sh1 sh1Var = this.f7691v;
        sh1Var.getClass();
        kj1 kj1Var = ((u12) sh1Var).f11059d;
        t12 t12Var = (t12) kj1Var.f5595j;
        u12 u12Var = (u12) kj1Var.f5597l;
        if (t12Var == t12.f10490i) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            ((C0086cc) u12Var.m5452f()).mo5j(motionEventObtain);
            motionEventObtain.recycle();
            kj1Var.f5595j = t12.f10489h;
            u12Var.f11058c = false;
            kj1Var.f5596k = null;
        }
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: p */
    public final int mo2363p(kd1 kd1Var, if1 if1Var, int i) {
        sh1 sh1Var = this.f7691v;
        sh1Var.getClass();
        return ((h61) sh1Var).mo2078e(new z11(kd1Var, kd1Var.getLayoutDirection()), new s50(if1Var, rf1.f9542i, sf1.f10103i, 1), AbstractC0258gz.m2028b(0, i, 0, 0, 13)).mo106c();
    }

    @Override // p000.ox1
    /* JADX INFO: renamed from: q0 */
    public final Object mo566q0(Object obj) {
        this.f7691v.getClass();
        throw new ClassCastException();
    }

    @Override // p000.mc0
    /* JADX INFO: renamed from: r0 */
    public final void mo3057r0() {
        ci0.m788M(this);
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: t0 */
    public final void mo3568t0() {
        sh1 sh1Var = this.f7691v;
        sh1Var.getClass();
        ((u12) sh1Var).f11059d.getClass();
    }

    public final String toString() {
        return this.f7691v.toString();
    }

    @Override // p000.dq0
    /* JADX INFO: renamed from: w */
    public final void mo1069w(zn1 zn1Var) {
        this.f7691v.getClass();
        throw new ClassCastException();
    }

    @Override // p000.a61, p000.qf1
    /* JADX INFO: renamed from: c */
    public final void mo99c(long j) {
    }

    @Override // p000.a61
    /* JADX INFO: renamed from: q */
    public final void mo100q(c61 c61Var) {
    }
}
