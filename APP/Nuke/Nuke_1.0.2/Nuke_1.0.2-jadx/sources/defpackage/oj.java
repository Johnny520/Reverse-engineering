package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oj extends th1 implements j61, mc0, on2, r12, wh1, ox1, a61, dq0, pk0, fl0, il0, aw1, rn {
    public sh1 v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.aw1
    public final boolean B() {
        return this.u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int D(kd1 kd1Var, if1 if1Var, int i) {
        sh1 sh1Var = this.v;
        sh1Var.getClass();
        return ((h61) sh1Var).e(new z11(kd1Var, kd1Var.getLayoutDirection()), new s50(if1Var, rf1.h, sf1.i, 1), gz.b(0, i, 0, 0, 13)).c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        M0(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        if (!this.u) {
            kz0.b("unInitializeModifier called on unattached node");
        }
        if ((this.j & 8) != 0) {
            ((b7) sp0.f0(this)).C();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final void J(h12 h12Var, i12 i12Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        sh1 sh1Var = this.v;
        sh1Var.getClass();
        kj1 kj1Var = ((u12) sh1Var).d;
        u12 u12Var = (u12) kj1Var.l;
        List list = h12Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            o12 o12Var = (o12) list.get(i);
            if (tp0.o(o12Var) || tp0.q(o12Var)) {
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
            if (((o12) list.get(i2)).b()) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        if (u12Var.c) {
            z3 = true;
        } else {
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                if (i3 < size3) {
                    o12 o12Var2 = (o12) list.get(i3);
                    if (tp0.o(o12Var2) || tp0.q(o12Var2)) {
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
        t12 t12Var = (t12) kj1Var.j;
        t12 t12Var2 = t12.j;
        i12 i12Var2 = i12.j;
        if (t12Var != t12Var2) {
            if (i12Var == i12.h && z3) {
                kj1Var.k = h12Var;
                kj1Var.o(h12Var, !z || u12Var.c);
            }
            if (i12Var == i12.i && z && h12Var == ((h12) kj1Var.k) && u12Var.c) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((o12) list.get(i4)).a();
                }
            }
            if (i12Var == i12Var2 && !z3 && h12Var != ((h12) kj1Var.k)) {
                kj1Var.o(h12Var, true);
            }
        }
        if (i12Var == i12Var2) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    kj1Var.j = t12.h;
                    ((u12) kj1Var.l).c = false;
                    kj1Var.k = null;
                    break;
                } else if (!tp0.q((o12) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (h12Var == ((h12) kj1Var.k) && z) {
                int size6 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        break;
                    }
                    if (!((o12) list.get(i6)).b()) {
                        i6++;
                    } else if (!u12Var.c) {
                        kj1Var.K(h12Var);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((o12) list.get(i7)).a();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M0(boolean z) {
        if (!this.u) {
            kz0.b("initializeModifier called on unattached node");
        }
        sh1 sh1Var = this.v;
        if ((this.j & 4) != 0 && !z) {
            sp0.Z(this, 2).Z0();
        }
        if ((this.j & 2) != 0) {
            qx2 qx2Var = (qx2) sp0.c0(this).M.f;
            qx2Var.getClass();
            if (qx2Var.v) {
                zn1 zn1Var = this.o;
                zn1Var.getClass();
                ((l61) zn1Var).u1(this);
                yv1 yv1Var = zn1Var.S;
                if (yv1Var != null) {
                    ((sq0) yv1Var).c();
                }
            }
            if (!z) {
                sp0.Z(this, 2).Z0();
                sp0.c0(this).E();
            }
        }
        if (sh1Var instanceof b91) {
            ((b91) sh1Var).a.k = sp0.c0(this);
        }
        int i = this.j;
        if ((i & 16) != 0 && (sh1Var instanceof u12)) {
            ((u12) sh1Var).d.i = this.o;
        }
        if ((i & 8) != 0) {
            ((b7) sp0.f0(this)).C();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mc0
    public final void P(t61 t61Var) {
        sh1 sh1Var = this.v;
        sh1Var.getClass();
        t61Var.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int U(kd1 kd1Var, if1 if1Var, int i) {
        sh1 sh1Var = this.v;
        sh1Var.getClass();
        return ((h61) sh1Var).e(new z11(kd1Var, kd1Var.getLayoutDirection()), new s50(if1Var, rf1.h, sf1.h, 1), gz.b(0, 0, 0, i, 7)).e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fl0
    public final void W(dl0 dl0Var) {
        sh1 sh1Var = this.v;
        kz0.b("applyFocusProperties called on wrong node");
        sh1Var.getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pk0
    public final void Z(kl0 kl0Var) {
        sh1 sh1Var = this.v;
        kz0.b("onFocusEvent called on wrong node");
        sh1Var.getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t60, defpackage.r12
    public final void a() {
        if (this.v instanceof u12) {
            m0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rn
    public final e70 b() {
        return sp0.c0(this).F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final boolean b0() {
        sh1 sh1Var = this.v;
        sh1Var.getClass();
        ((u12) sh1Var).d.getClass();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rn
    public final long d() {
        return s11.q0(sp0.Z(this, 128).j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final of1 e(pf1 pf1Var, if1 if1Var, long j) {
        sh1 sh1Var = this.v;
        sh1Var.getClass();
        return ((h61) sh1Var).e(pf1Var, if1Var, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int g(kd1 kd1Var, if1 if1Var, int i) {
        sh1 sh1Var = this.v;
        sh1Var.getClass();
        return ((h61) sh1Var).e(new z11(kd1Var, kd1Var.getLayoutDirection()), new s50(if1Var, rf1.i, sf1.h, 1), gz.b(0, 0, 0, i, 7)).e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rn
    public final d61 getLayoutDirection() {
        return sp0.c0(this).G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wh1
    public final sn j() {
        return sn.G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final void l0(zn2 zn2Var) {
        sh1 sh1Var = this.v;
        sh1Var.getClass();
        ln2 ln2VarD = ((mn2) sh1Var).d();
        zn2Var.getClass();
        ln2 ln2Var = (ln2) zn2Var;
        rk1 rk1Var = ln2Var.h;
        if (ln2VarD.j) {
            ln2Var.j = true;
        }
        if (ln2VarD.k) {
            ln2Var.k = true;
        }
        rk1 rk1Var2 = ln2VarD.h;
        Object[] objArr = rk1Var2.b;
        Object[] objArr2 = rk1Var2.c;
        long[] jArr = rk1Var2.a;
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
                        if (!rk1Var.b(yn2Var)) {
                            rk1Var.m(yn2Var, obj2);
                        } else if (obj2 instanceof q3) {
                            Object objG = rk1Var.g(yn2Var);
                            objG.getClass();
                            q3 q3Var = (q3) objG;
                            String str = q3Var.a;
                            if (str == null) {
                                str = ((q3) obj2).a;
                            }
                            un0 un0Var = q3Var.b;
                            if (un0Var == null) {
                                un0Var = ((q3) obj2).b;
                            }
                            rk1Var.m(yn2Var, new q3(str, un0Var));
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final void m0() {
        sh1 sh1Var = this.v;
        sh1Var.getClass();
        kj1 kj1Var = ((u12) sh1Var).d;
        t12 t12Var = (t12) kj1Var.j;
        u12 u12Var = (u12) kj1Var.l;
        if (t12Var == t12.i) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            ((cc) u12Var.f()).j(motionEventObtain);
            motionEventObtain.recycle();
            kj1Var.j = t12.h;
            u12Var.c = false;
            kj1Var.k = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j61
    public final int p(kd1 kd1Var, if1 if1Var, int i) {
        sh1 sh1Var = this.v;
        sh1Var.getClass();
        return ((h61) sh1Var).e(new z11(kd1Var, kd1Var.getLayoutDirection()), new s50(if1Var, rf1.i, sf1.i, 1), gz.b(0, i, 0, 0, 13)).c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ox1
    public final Object q0(Object obj) {
        this.v.getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mc0
    public final void r0() {
        ci0.M(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final void t0() {
        sh1 sh1Var = this.v;
        sh1Var.getClass();
        ((u12) sh1Var).d.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.v.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dq0
    public final void w(zn1 zn1Var) {
        this.v.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.a61, defpackage.qf1
    public final void c(long j) {
    }

    @Override // defpackage.a61
    public final void q(c61 c61Var) {
    }
}
