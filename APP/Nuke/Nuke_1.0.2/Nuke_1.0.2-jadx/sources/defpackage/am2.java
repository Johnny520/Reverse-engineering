package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class am2 extends u60 implements g51, on2, r12, wy0, gy, uo0 {
    public bk1 A;
    public vo0 B;
    public jn C;
    public fc0 D;
    public boolean E;
    public boolean F;
    public ib0 G;
    public lb0 H;
    public kb0 I;
    public jb0 J;
    public tl K;
    public hh1 L;
    public long M;
    public ms0 N;
    public vy0 O;
    public long P;
    public s8 Q;
    public n50 R;
    public final tm1 S;
    public final n50 T;
    public final im2 U;
    public final ox V;
    public final pl0 W;
    public final g00 X;
    public s9 Y;
    public yl2 Z;
    public si1 a0;
    public d33 b0;
    public qv1 x;
    public ml2 y;
    public boolean z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public am2(s8 s8Var, n50 n50Var, bk1 bk1Var, qv1 qv1Var, bm2 bm2Var, boolean z, boolean z2) {
        ml2 ml2Var = ul2.a;
        this.x = qv1Var;
        this.y = ml2Var;
        this.z = z;
        this.A = bk1Var;
        this.M = 9205357640488583168L;
        this.P = 0L;
        this.Q = s8Var;
        this.R = n50Var;
        tm1 tm1Var = new tm1();
        this.S = tm1Var;
        n50 n50Var2 = new n50(new r40(new hh1(ul2.d)));
        this.T = n50Var2;
        s8 s8Var2 = this.Q;
        n50 n50Var3 = this.R;
        im2 im2Var = new im2(bm2Var, s8Var2, n50Var3 == null ? n50Var2 : n50Var3, qv1Var, z2, tm1Var, this, new wl2(this, 0));
        this.U = im2Var;
        ox oxVar = new ox(im2Var, z);
        this.V = oxVar;
        pl0 pl0Var = new pl0(2, null, 10);
        M0(pl0Var);
        this.W = pl0Var;
        g00 g00Var = new g00(qv1Var, im2Var, z2, new wl2(this, 1));
        M0(g00Var);
        this.X = g00Var;
        M0(new xm1(oxVar, tm1Var));
        sm smVar = new sm();
        smVar.v = g00Var;
        M0(smVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P0(am2 am2Var, u00 u00Var) throws Throwable {
        ac0 ac0Var;
        if (u00Var instanceof ac0) {
            ac0Var = (ac0) u00Var;
            int i = ac0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ac0Var.m = i - Integer.MIN_VALUE;
            } else {
                ac0Var = new ac0(am2Var, u00Var);
            }
        }
        Object obj = ac0Var.k;
        int i2 = ac0Var.m;
        t00 t00Var = null;
        if (i2 == 0) {
            fg1.T(obj);
            fc0 fc0Var = am2Var.D;
            if (fc0Var != null) {
                bk1 bk1Var = am2Var.A;
                if (bk1Var != null) {
                    ec0 ec0Var = new ec0(fc0Var);
                    ac0Var.m = 1;
                    Object objA = bk1Var.a(ec0Var, ac0Var);
                    k20 k20Var = k20.h;
                    if (objA == k20Var) {
                        return k20Var;
                    }
                }
            }
            p7.A(am2Var.S.c(), null, new a2(new pb0(0L, false), am2Var, t00Var, 24), 3);
            return a83.a;
        }
        if (i2 != 1) {
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fg1.T(obj);
        am2Var.D = null;
        p7.A(am2Var.S.c(), null, new a2(new pb0(0L, false), am2Var, t00Var, 24), 3);
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q0(am2 am2Var, ob0 ob0Var, u00 u00Var) {
        bc0 bc0Var;
        bk1 bk1Var;
        fc0 fc0Var;
        ob0 ob0Var2;
        fc0 fc0Var2;
        if (u00Var instanceof bc0) {
            bc0Var = (bc0) u00Var;
            int i = bc0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                bc0Var.o = i - Integer.MIN_VALUE;
            } else {
                bc0Var = new bc0(am2Var, u00Var);
            }
        }
        Object obj = bc0Var.m;
        int i2 = bc0Var.o;
        k20 k20Var = k20.h;
        if (i2 == 0) {
            fg1.T(obj);
            fc0 fc0Var3 = am2Var.D;
            if (fc0Var3 != null && (bk1Var = am2Var.A) != null) {
                ec0 ec0Var = new ec0(fc0Var3);
                bc0Var.k = ob0Var;
                bc0Var.o = 1;
                if (bk1Var.a(ec0Var, bc0Var) != k20Var) {
                }
                return k20Var;
            }
            am2Var.D = fc0Var;
            long j = ob0Var.a;
            return a83.a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fc0Var2 = bc0Var.l;
            ob0Var2 = bc0Var.k;
            fg1.T(obj);
            fc0Var = fc0Var2;
            ob0Var = ob0Var2;
            am2Var.D = fc0Var;
            long j2 = ob0Var.a;
            return a83.a;
        }
        ob0Var = bc0Var.k;
        fg1.T(obj);
        fc0Var = new fc0();
        bk1 bk1Var2 = am2Var.A;
        if (bk1Var2 != null) {
            bc0Var.k = ob0Var;
            bc0Var.l = fc0Var;
            bc0Var.o = 2;
            if (bk1Var2.a(fc0Var, bc0Var) != k20Var) {
                ob0Var2 = ob0Var;
                fc0Var2 = fc0Var;
                fc0Var = fc0Var2;
                ob0Var = ob0Var2;
            }
            return k20Var;
        }
        am2Var.D = fc0Var;
        long j22 = ob0Var.a;
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R0(am2 am2Var, pb0 pb0Var, u00 u00Var) throws Throwable {
        cc0 cc0Var;
        if (u00Var instanceof cc0) {
            cc0Var = (cc0) u00Var;
            int i = cc0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                cc0Var.n = i - Integer.MIN_VALUE;
            } else {
                cc0Var = new cc0(am2Var, u00Var);
            }
        }
        Object obj = cc0Var.l;
        int i2 = cc0Var.n;
        t00 t00Var = null;
        if (i2 == 0) {
            fg1.T(obj);
            fc0 fc0Var = am2Var.D;
            if (fc0Var != null) {
                bk1 bk1Var = am2Var.A;
                if (bk1Var != null) {
                    gc0 gc0Var = new gc0(fc0Var);
                    cc0Var.k = pb0Var;
                    cc0Var.n = 1;
                    Object objA = bk1Var.a(gc0Var, cc0Var);
                    k20 k20Var = k20.h;
                    if (objA == k20Var) {
                        return k20Var;
                    }
                }
            }
            p7.A(am2Var.S.c(), null, new a2(pb0Var, am2Var, t00Var, 24), 3);
            return a83.a;
        }
        if (i2 != 1) {
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pb0Var = cc0Var.k;
        fg1.T(obj);
        am2Var.D = null;
        p7.A(am2Var.S.c(), null, new a2(pb0Var, am2Var, t00Var, 24), 3);
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void V0(am2 am2Var, o12 o12Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        kb0 kb0Var = am2Var.I;
        if (kb0Var == null) {
            kb0Var = new kb0();
            kb0Var.i = null;
            kb0Var.j = Long.MAX_VALUE;
            kb0Var.k = false;
            am2Var.I = kb0Var;
        }
        kb0Var.i = o12Var;
        kb0Var.j = j;
        ms0 ms0Var = am2Var.N;
        qv1 qv1Var = am2Var.x;
        if (ms0Var == null) {
            am2Var.N = new ms0(qv1Var);
        } else {
            ms0Var.b = qv1Var;
            ms0Var.a = j2;
        }
        kb0Var.k = false;
        am2Var.K = kb0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wy0
    public final void C() {
        vy0 vy0Var = this.O;
        if (vy0Var != null) {
            vy0Var.a();
            am2 am2Var = vy0Var.a;
            if (am2Var.E) {
                am2Var.W0(mb0.a);
            }
            vy0Var.g = null;
            dk dkVar = vy0Var.k;
            dkVar.i = 0;
            ((ck1) dkVar.j).b = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        if (this.u) {
            e70 e70Var = sp0.c0(this).F;
            n50 n50Var = this.T;
            n50Var.getClass();
            n50Var.a = new r40(new hh1(e70Var));
        }
        si1 si1Var = this.a0;
        if (si1Var != null) {
            si1Var.c = sp0.c0(this).F;
        }
        d33 d33Var = this.b0;
        if (d33Var != null) {
            d33Var.c = sp0.c0(this).F;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        this.E = false;
        S0();
        this.P = 0L;
        vo0 vo0Var = this.B;
        if (vo0Var != null) {
            N0(vo0Var);
        }
        this.B = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wy0
    public final void H(e9 e9Var, i12 i12Var) {
        Object obj;
        boolean z;
        i12 i12Var2;
        Object obj2;
        i12 i12Var3;
        Object obj3;
        int i = e9Var.i;
        ArrayList arrayList = (ArrayList) e9Var.j;
        if (this.B == null) {
            vo0 vo0Var = new vo0(this);
            M0(vo0Var);
            this.B = vo0Var;
        }
        if (this.z) {
            if (this.O == null) {
                this.O = new vy0(this);
            }
            vy0 vy0Var = this.O;
            if (vy0Var != null) {
                am2 am2Var = vy0Var.a;
                if (vy0Var.f == null) {
                    qy0 qy0Var = vy0Var.b;
                    if (qy0Var == null) {
                        qy0Var = new qy0();
                        qy0Var.n = py0.j;
                        qy0Var.o = false;
                        vy0Var.b = qy0Var;
                    }
                    vy0Var.f = qy0Var;
                }
                p40 p40Var = vy0Var.f;
                if (p40Var == null) {
                    s.j("currentDragState should not be null");
                    return;
                }
                boolean z2 = p40Var instanceof qy0;
                i12 i12Var4 = i12.h;
                i12 i12Var5 = i12.i;
                if (z2) {
                    qy0 qy0Var2 = (qy0) p40Var;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!ci0.y((oy0) arrayList.get(i2))) {
                            return;
                        }
                    }
                    oy0 oy0Var = (oy0) du.o0(arrayList);
                    int i3 = uy0.a[qy0Var2.n.ordinal()];
                    py0 py0Var = py0.i;
                    py0 py0Var2 = py0.h;
                    py0 py0Var3 = i3 == 1 ? !am2Var.b1() ? py0Var2 : py0Var : qy0Var2.n;
                    qy0Var2.n = py0Var3;
                    if (i12Var == i12Var4 && py0Var3 == py0Var) {
                        oy0Var.i = true;
                        qy0Var2.o = true;
                    }
                    if (i12Var == i12Var5) {
                        if (py0Var3 == py0Var2) {
                            vy0.c(vy0Var, oy0Var, oy0Var.a, 0L, 12);
                            return;
                        }
                        if (qy0Var2.o) {
                            vy0Var.f(oy0Var, oy0Var, new ny0(i), 0L);
                            vy0Var.e(oy0Var, new ny0(i), 0L);
                            long j = oy0Var.a;
                            ty0 ty0Var = vy0Var.c;
                            if (ty0Var == null) {
                                ty0Var = new ty0();
                                ty0Var.n = Long.MAX_VALUE;
                                vy0Var.c = ty0Var;
                            }
                            ty0Var.n = j;
                            vy0Var.f = ty0Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = p40Var instanceof sy0;
                i12 i12Var6 = i12.j;
                Object obj4 = null;
                if (!z3) {
                    if (p40Var instanceof ry0) {
                        ry0 ry0Var = (ry0) p40Var;
                        if (i12Var != i12Var6) {
                            return;
                        }
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                z = true;
                                break;
                            } else {
                                if (((oy0) arrayList.get(i4)).i) {
                                    z = false;
                                    break;
                                }
                                i4++;
                            }
                        }
                        int size3 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size3) {
                                break;
                            }
                            if (!((oy0) arrayList.get(i5)).d) {
                                i5++;
                            } else if (!arrayList.isEmpty()) {
                                if (z) {
                                    long jT = ci0.T((oy0) du.o0(arrayList), am2Var.x, new ny0(i));
                                    oy0 oy0Var2 = ry0Var.n;
                                    oy0Var2.getClass();
                                    long jD = rs1.d(jT, ci0.T(oy0Var2, am2Var.x, new ny0(i)));
                                    oy0 oy0Var3 = ry0Var.n;
                                    if (oy0Var3 != null) {
                                        vy0.c(vy0Var, oy0Var3, ry0Var.o, jD, 8);
                                        return;
                                    } else {
                                        s.j("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        vy0Var.a();
                        return;
                    }
                    if (!(p40Var instanceof ty0)) {
                        c80.s();
                        return;
                    }
                    ty0 ty0Var2 = (ty0) p40Var;
                    if (i12Var != i12Var5) {
                        return;
                    }
                    long j2 = ty0Var2.n;
                    int size4 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i6);
                        if (up0.s(((oy0) obj).a, j2)) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    oy0 oy0Var4 = (oy0) obj;
                    if (oy0Var4 == null) {
                        return;
                    }
                    boolean zT = ci0.t(oy0Var4);
                    mb0 mb0Var = mb0.a;
                    if (!zT) {
                        if (oy0Var4.i) {
                            am2Var.W0(mb0Var);
                            return;
                        } else {
                            if (rs1.c(ci0.S(oy0Var4, am2Var.x, new ny0(i), true)) == 0.0f) {
                                return;
                            }
                            vy0Var.e(oy0Var4, new ny0(i), ci0.S(oy0Var4, am2Var.x, new ny0(i), false));
                            oy0Var4.i = true;
                            return;
                        }
                    }
                    int size5 = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size5) {
                            break;
                        }
                        Object obj5 = arrayList.get(i7);
                        if (((oy0) obj5).d) {
                            obj4 = obj5;
                            break;
                        }
                        i7++;
                    }
                    oy0 oy0Var5 = (oy0) obj4;
                    if (oy0Var5 != null) {
                        ty0Var2.n = oy0Var5.a;
                        return;
                    }
                    if (oy0Var4.i || !ci0.t(oy0Var4)) {
                        am2Var.W0(mb0Var);
                    } else {
                        ci0.s(vy0Var.d(), oy0Var4, am2Var.x, new ny0(i), vy0Var.j, vy0Var.l);
                        float fA = ((za3) p40.p(am2Var, ly.t)).a();
                        long jY = vy0Var.d().y(ea3.a(fA, fA));
                        m60 m60Var = (m60) vy0Var.d().i;
                        bb2 bb2Var = m60Var.a;
                        i40[] i40VarArr = (i40[]) bb2Var.e;
                        mg.i0(i40VarArr, 0, i40VarArr.length);
                        bb2Var.c = 0;
                        bb2 bb2Var2 = m60Var.b;
                        i40[] i40VarArr2 = (i40[]) bb2Var2.e;
                        mg.i0(i40VarArr2, 0, i40VarArr2.length);
                        bb2Var2.c = 0;
                        m60Var.c = 0L;
                        am2Var.W0(new pb0(p40.Y(jY), true));
                    }
                    vy0Var.a();
                    return;
                }
                sy0 sy0Var = (sy0) p40Var;
                if (i12Var == i12Var4) {
                    return;
                }
                int size6 = arrayList.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        i12Var2 = i12Var5;
                        obj2 = null;
                        break;
                    }
                    obj2 = arrayList.get(i8);
                    i12Var2 = i12Var5;
                    if (up0.s(((oy0) obj2).a, sy0Var.o)) {
                        break;
                    }
                    i8++;
                    i12Var5 = i12Var2;
                }
                oy0 oy0Var6 = (oy0) obj2;
                if (oy0Var6 == null) {
                    int size7 = arrayList.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size7) {
                            obj3 = null;
                            break;
                        }
                        obj3 = arrayList.get(i9);
                        if (((oy0) obj3).d) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    oy0Var6 = (oy0) obj3;
                    if (oy0Var6 == null) {
                        vy0Var.a();
                        return;
                    }
                    sy0Var.o = oy0Var6.a;
                }
                oy0 oy0Var7 = oy0Var6;
                if (i12Var != i12Var2) {
                    i12Var3 = i12Var6;
                } else if (oy0Var7.i) {
                    i12Var3 = i12Var6;
                    oy0 oy0Var8 = sy0Var.n;
                    if (oy0Var8 == null) {
                        s.j("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j3 = sy0Var.o;
                    ms0 ms0Var = vy0Var.i;
                    if (ms0Var == null) {
                        s.j("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    vy0Var.b(oy0Var8, j3, ms0Var);
                } else if (ci0.t(oy0Var7)) {
                    int size8 = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size8) {
                            break;
                        }
                        Object obj6 = arrayList.get(i10);
                        if (((oy0) obj6).d) {
                            obj4 = obj6;
                            break;
                        }
                        i10++;
                    }
                    oy0 oy0Var9 = (oy0) obj4;
                    if (oy0Var9 == null) {
                        vy0Var.a();
                    } else {
                        sy0Var.o = oy0Var9.a;
                    }
                    i12Var3 = i12Var6;
                } else {
                    za3 za3Var = (za3) p40.p(am2Var, ly.t);
                    float f = yb0.a;
                    float fD = za3Var.d();
                    ms0 ms0Var2 = vy0Var.i;
                    if (ms0Var2 == null) {
                        s.j("Touch slop detector not initialized.");
                        return;
                    }
                    long jA = ms0Var2.a(ci0.S(oy0Var7, am2Var.x, new ny0(i), true), fD, true);
                    if ((9223372034707292159L & jA) != 9205357640488583168L) {
                        oy0Var7.i = true;
                        oy0 oy0Var10 = sy0Var.n;
                        oy0Var10.getClass();
                        i12Var3 = i12Var6;
                        vy0Var.f(oy0Var10, oy0Var7, new ny0(i), jA);
                        vy0Var.e(oy0Var7, new ny0(i), jA);
                        long j4 = oy0Var7.a;
                        ty0 ty0Var3 = vy0Var.c;
                        if (ty0Var3 == null) {
                            ty0Var3 = new ty0();
                            ty0Var3.n = Long.MAX_VALUE;
                            vy0Var.c = ty0Var3;
                        }
                        ty0Var3.n = j4;
                        vy0Var.f = ty0Var3;
                    } else {
                        i12Var3 = i12Var6;
                        sy0Var.p = true;
                    }
                }
                if (i12Var == i12Var3 && sy0Var.p) {
                    if (!oy0Var7.i) {
                        sy0Var.p = false;
                        return;
                    }
                    oy0 oy0Var11 = sy0Var.n;
                    if (oy0Var11 == null) {
                        s.j("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = sy0Var.o;
                    ms0 ms0Var3 = vy0Var.i;
                    if (ms0Var3 != null) {
                        vy0Var.b(oy0Var11, j5, ms0Var3);
                    } else {
                        s.j("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0132  */
    @Override // defpackage.r12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(h12 h12Var, i12 i12Var, long j) {
        i12 i12Var2;
        i12 i12Var3;
        i12 i12Var4;
        int i;
        i12 i12Var5;
        int i2;
        int i3;
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        boolean z2;
        lb0 lb0Var;
        Object obj4;
        Object obj5;
        am2 am2Var = this;
        List list = h12Var.a;
        int size = list.size();
        int i4 = 0;
        while (true) {
            i12Var2 = i12.i;
            i12Var3 = i12.h;
            if (i4 >= size) {
                break;
            }
            o12 o12Var = (o12) list.get(i4);
            ml2 ml2Var = am2Var.y;
            int i5 = o12Var.i;
            ml2Var.getClass();
            if (i5 == 2) {
                i4++;
            } else {
                am2Var.F = true;
                if (am2Var.B == null) {
                    vo0 vo0Var = new vo0(am2Var);
                    am2Var.M0(vo0Var);
                    am2Var.B = vo0Var;
                }
                if (!am2Var.z) {
                    break;
                }
                if (am2Var.K == null) {
                    ib0 ib0Var = am2Var.G;
                    if (ib0Var == null) {
                        ib0Var = new ib0();
                        ib0Var.i = hb0.j;
                        ib0Var.j = false;
                        am2Var.G = ib0Var;
                    }
                    am2Var.K = ib0Var;
                }
                tl tlVar = am2Var.K;
                if (tlVar == null) {
                    s.j("currentDragState should not be null");
                    return;
                }
                if (tlVar instanceof ib0) {
                    ib0 ib0Var2 = (ib0) tlVar;
                    if (!list.isEmpty() && ay2.d(h12Var, false)) {
                        o12 o12Var2 = (o12) du.o0(list);
                        int i6 = zb0.a[ib0Var2.i.ordinal()];
                        hb0 hb0Var = hb0.i;
                        hb0 hb0Var2 = hb0.h;
                        hb0 hb0Var3 = i6 == 1 ? !am2Var.b1() ? hb0Var2 : hb0Var : ib0Var2.i;
                        ib0Var2.i = hb0Var3;
                        if (i12Var == i12Var3 && hb0Var3 == hb0Var) {
                            o12Var2.a();
                            ib0Var2.j = true;
                        }
                        if (i12Var == i12Var2) {
                            if (hb0Var3 == hb0Var2) {
                                V0(am2Var, o12Var2, o12Var2.a, 0L, 12);
                            } else if (ib0Var2.j) {
                                am2Var.a1(o12Var2, o12Var2, 0L);
                                am2Var.Z0(o12Var2, 0L);
                                long j2 = o12Var2.a;
                                lb0 lb0Var2 = am2Var.H;
                                if (lb0Var2 == null) {
                                    lb0Var2 = new lb0();
                                    lb0Var2.i = Long.MAX_VALUE;
                                    am2Var.H = lb0Var2;
                                }
                                lb0Var2.i = j2;
                                am2Var.K = lb0Var2;
                            }
                        }
                    }
                } else {
                    boolean z3 = tlVar instanceof kb0;
                    i12 i12Var6 = i12.j;
                    if (z3) {
                        kb0 kb0Var = (kb0) tlVar;
                        if (i12Var != i12Var3) {
                            int size2 = list.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size2) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = list.get(i7);
                                if (up0.s(((o12) obj3).a, kb0Var.j)) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            o12 o12Var3 = (o12) obj3;
                            if (o12Var3 == null) {
                                int size3 = list.size();
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= size3) {
                                        obj5 = null;
                                        break;
                                    }
                                    obj5 = list.get(i8);
                                    if (((o12) obj5).d) {
                                        break;
                                    } else {
                                        i8++;
                                    }
                                }
                                o12Var3 = (o12) obj5;
                                if (o12Var3 == null) {
                                    am2Var.T0();
                                } else {
                                    kb0Var.j = o12Var3.a;
                                    if (i12Var == i12Var2) {
                                        if (o12Var3.b()) {
                                            o12 o12Var4 = kb0Var.i;
                                            if (o12Var4 == null) {
                                                s.j("AwaitTouchSlop.initialDown was not initialized");
                                                return;
                                            }
                                            long j3 = kb0Var.j;
                                            ms0 ms0Var = am2Var.N;
                                            if (ms0Var == null) {
                                                s.j("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                return;
                                            }
                                            am2Var.U0(o12Var4, j3, ms0Var);
                                        } else if (tp0.q(o12Var3)) {
                                            int size4 = list.size();
                                            int i9 = 0;
                                            while (true) {
                                                if (i9 >= size4) {
                                                    obj4 = null;
                                                    break;
                                                }
                                                obj4 = list.get(i9);
                                                if (((o12) obj4).d) {
                                                    break;
                                                } else {
                                                    i9++;
                                                }
                                            }
                                            o12 o12Var5 = (o12) obj4;
                                            if (o12Var5 == null) {
                                                am2Var.T0();
                                            } else {
                                                kb0Var.j = o12Var5.a;
                                            }
                                        } else {
                                            float f = yb0.f((za3) p40.p(am2Var, ly.t), o12Var3.i);
                                            ms0 ms0Var2 = am2Var.N;
                                            if (ms0Var2 == null) {
                                                s.j("Touch slop detector not initialized.");
                                                return;
                                            }
                                            long jA = ms0Var2.a(tp0.E(o12Var3, true), f, true);
                                            if ((9223372034707292159L & jA) != 9205357640488583168L) {
                                                boolean zF = am2Var.f(o12Var3);
                                                d43 d43VarA = tb3.a(am2Var, vo0.w);
                                                vo0 vo0Var2 = d43VarA instanceof vo0 ? (vo0) d43VarA : null;
                                                uo0 uo0Var = vo0Var2 != null ? vo0Var2.v : null;
                                                if (uo0Var != null) {
                                                    z2 = true;
                                                    boolean z4 = uo0Var.f(o12Var3);
                                                    if (zF && z4) {
                                                        kb0Var.k = z2;
                                                    } else {
                                                        o12Var3.a();
                                                        o12 o12Var6 = kb0Var.i;
                                                        o12Var6.getClass();
                                                        am2Var.a1(o12Var6, o12Var3, jA);
                                                        am2Var.Z0(o12Var3, jA);
                                                        long j4 = o12Var3.a;
                                                        lb0Var = am2Var.H;
                                                        if (lb0Var == null) {
                                                            lb0Var = new lb0();
                                                            lb0Var.i = Long.MAX_VALUE;
                                                            am2Var.H = lb0Var;
                                                        }
                                                        lb0Var.i = j4;
                                                        am2Var.K = lb0Var;
                                                    }
                                                } else {
                                                    z2 = true;
                                                }
                                                if (zF) {
                                                    o12Var3.a();
                                                    o12 o12Var62 = kb0Var.i;
                                                    o12Var62.getClass();
                                                    am2Var.a1(o12Var62, o12Var3, jA);
                                                    am2Var.Z0(o12Var3, jA);
                                                    long j42 = o12Var3.a;
                                                    lb0Var = am2Var.H;
                                                    if (lb0Var == null) {
                                                    }
                                                    lb0Var.i = j42;
                                                    am2Var.K = lb0Var;
                                                }
                                            } else {
                                                kb0Var.k = true;
                                            }
                                        }
                                    }
                                    if (i12Var != i12Var6 && kb0Var.k) {
                                        if (o12Var3.b()) {
                                            o12 o12Var7 = kb0Var.i;
                                            if (o12Var7 == null) {
                                                s.j("AwaitTouchSlop.initialDown was not initialized");
                                                return;
                                            }
                                            long j5 = kb0Var.j;
                                            ms0 ms0Var3 = am2Var.N;
                                            if (ms0Var3 == null) {
                                                s.j("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                return;
                                            }
                                            am2Var.U0(o12Var7, j5, ms0Var3);
                                        } else {
                                            kb0Var.k = false;
                                        }
                                    }
                                }
                            } else {
                                if (i12Var == i12Var2) {
                                }
                                if (i12Var != i12Var6) {
                                }
                            }
                        }
                    } else if (tlVar instanceof jb0) {
                        jb0 jb0Var = (jb0) tlVar;
                        if (i12Var == i12Var6) {
                            int size5 = list.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size5) {
                                    z = true;
                                    break;
                                } else {
                                    if (((o12) list.get(i10)).b()) {
                                        z = false;
                                        break;
                                    }
                                    i10++;
                                }
                            }
                            int size6 = list.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size6) {
                                    break;
                                }
                                if (!((o12) list.get(i11)).d) {
                                    i11++;
                                } else {
                                    if (list.isEmpty()) {
                                        break;
                                    }
                                    if (z) {
                                        long j6 = ((o12) du.o0(list)).c;
                                        o12 o12Var8 = jb0Var.i;
                                        o12Var8.getClass();
                                        long jD = rs1.d(j6, o12Var8.c);
                                        o12 o12Var9 = jb0Var.i;
                                        if (o12Var9 == null) {
                                            s.j("AwaitGesturePickup.initialDown was not initialized.");
                                            return;
                                        }
                                        V0(am2Var, o12Var9, jb0Var.j, jD, 8);
                                    }
                                }
                            }
                            am2Var.T0();
                        }
                    } else {
                        if (!(tlVar instanceof lb0)) {
                            c80.s();
                            return;
                        }
                        lb0 lb0Var3 = (lb0) tlVar;
                        if (i12Var == i12Var2) {
                            long j7 = lb0Var3.i;
                            int size7 = list.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size7) {
                                    obj = null;
                                    break;
                                }
                                obj = list.get(i12);
                                if (up0.s(((o12) obj).a, j7)) {
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                            o12 o12Var10 = (o12) obj;
                            if (o12Var10 != null) {
                                boolean zQ = tp0.q(o12Var10);
                                mb0 mb0Var = mb0.a;
                                if (zQ) {
                                    int size8 = list.size();
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= size8) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = list.get(i13);
                                        if (((o12) obj2).d) {
                                            break;
                                        } else {
                                            i13++;
                                        }
                                    }
                                    o12 o12Var11 = (o12) obj2;
                                    if (o12Var11 == null) {
                                        if (o12Var10.b() || !tp0.q(o12Var10)) {
                                            am2Var.X0().s(mb0Var);
                                        } else {
                                            ga3.a(am2Var.Y0(), o12Var10, 0L);
                                            float fA = ((za3) p40.p(am2Var, ly.t)).a();
                                            long jY = am2Var.Y0().y(ea3.a(fA, fA));
                                            m60 m60Var = (m60) am2Var.Y0().i;
                                            bb2 bb2Var = m60Var.a;
                                            i40[] i40VarArr = (i40[]) bb2Var.e;
                                            mg.i0(i40VarArr, 0, i40VarArr.length);
                                            bb2Var.c = 0;
                                            bb2 bb2Var2 = m60Var.b;
                                            i40[] i40VarArr2 = (i40[]) bb2Var2.e;
                                            mg.i0(i40VarArr2, 0, i40VarArr2.length);
                                            bb2Var2.c = 0;
                                            m60Var.c = 0L;
                                            am2Var.X0().s(new pb0(p40.Y(jY), false));
                                            am2Var.F = false;
                                        }
                                        am2Var.T0();
                                    } else {
                                        lb0Var3.i = o12Var11.a;
                                    }
                                } else if (o12Var10.b()) {
                                    am2Var.X0().s(mb0Var);
                                } else if (rs1.c(tp0.E(o12Var10, true)) != 0.0f) {
                                    am2Var.Z0(o12Var10, tp0.E(o12Var10, false));
                                    o12Var10.a();
                                }
                            }
                        }
                    }
                }
            }
        }
        if (am2Var.B == null) {
            vo0 vo0Var3 = new vo0(am2Var);
            am2Var.M0(vo0Var3);
            am2Var.B = vo0Var3;
        }
        if (am2Var.z) {
            im2 im2Var = am2Var.U;
            if (i12Var == i12Var3 && h12Var.f == 6) {
                if (am2Var.a0 == null) {
                    i12Var4 = i12Var2;
                    i = 6;
                    am2Var = this;
                    am2Var.a0 = new si1(im2Var, new n4(1, ViewConfiguration.get(tp0.H(am2Var).getContext())), new jw(2, this, am2.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), sp0.c0(am2Var).F);
                } else {
                    i12Var4 = i12Var2;
                    i = 6;
                }
                si1 si1Var = am2Var.a0;
                if (si1Var != null) {
                    j20 j20VarA0 = am2Var.A0();
                    if (si1Var.h == null) {
                        si1Var.h = p7.A(j20VarA0, null, new a2(si1Var, null, 16), 3);
                    }
                }
            } else {
                i12Var4 = i12Var2;
                i = 6;
            }
            si1 si1Var2 = am2Var.a0;
            if (si1Var2 == null || h12Var.f != i) {
                i12Var5 = i12Var4;
                break;
            }
            int size9 = list.size();
            for (int i14 = 0; i14 < size9; i14++) {
                if (((o12) list.get(i14)).b()) {
                    i12Var5 = i12Var4;
                    break;
                }
            }
            if (i12Var == i12Var3 && si1Var2.d) {
                si1Var2.f(h12Var);
                io1.a(h12Var);
            }
            i12Var5 = i12Var4;
            if (i12Var == i12Var5 && !si1Var2.d && si1Var2.f(h12Var)) {
                io1.a(h12Var);
            }
            if (i12Var == i12Var3 && ((i3 = h12Var.f) == 10 || i3 == 11 || i3 == 12)) {
                if (am2Var.b0 == null) {
                    i2 = 10;
                    am2Var = this;
                    am2Var.b0 = new d33(im2Var, new jw(2, this, am2.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 2), sp0.c0(am2Var).F);
                } else {
                    i2 = 10;
                }
                d33 d33Var = am2Var.b0;
                if (d33Var != null) {
                    j20 j20VarA02 = am2Var.A0();
                    if (d33Var.g == null) {
                        d33Var.g = p7.A(j20VarA02, null, new k9(d33Var, null), 3);
                    }
                }
            } else {
                i2 = 10;
            }
            d33 d33Var2 = am2Var.b0;
            if (d33Var2 != null) {
                int i15 = h12Var.f;
                if (i15 == i2 || i15 == 11 || i15 == 12) {
                    int size10 = list.size();
                    for (int i16 = 0; i16 < size10; i16++) {
                        if (((o12) list.get(i16)).b()) {
                            return;
                        }
                    }
                    if (i12Var == i12Var3 && d33Var2.d) {
                        d33Var2.d(h12Var);
                        io1.a(h12Var);
                    }
                    if (i12Var == i12Var5 && !d33Var2.d && d33Var2.d(h12Var)) {
                        io1.a(h12Var);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.uo0
    public final boolean M(oy0 oy0Var) {
        return ci0.y(oy0Var) && this.z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void S0() {
        fc0 fc0Var = this.D;
        if (fc0Var != null) {
            bk1 bk1Var = this.A;
            if (bk1Var != null) {
                bk1Var.b(new ec0(fc0Var));
            }
            this.D = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void T0() {
        ib0 ib0Var = this.G;
        hb0 hb0Var = hb0.j;
        if (ib0Var == null) {
            ib0Var = new ib0();
            ib0Var.i = hb0Var;
            ib0Var.j = false;
            this.G = ib0Var;
        }
        ib0Var.i = hb0Var;
        ib0Var.j = false;
        this.K = ib0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void U0(o12 o12Var, long j, ms0 ms0Var) {
        jb0 jb0Var = this.J;
        if (jb0Var == null) {
            jb0Var = new jb0();
            jb0Var.i = null;
            jb0Var.j = Long.MAX_VALUE;
            this.J = jb0Var;
        }
        jb0Var.i = o12Var;
        jb0Var.j = j;
        ms0Var.a = 0L;
        this.K = jb0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W0(qb0 qb0Var) {
        if ((qb0Var instanceof ob0) && !this.E) {
            this.E = true;
            c1();
        }
        X0().s(qb0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g51
    public final boolean X(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.z || ((!b51.a(qp0.z(keyEvent), b51.D) && !b51.a(sp0.f(keyEvent.getKeyCode()), b51.C)) || qp0.C(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.U.d == qv1.h;
        g00 g00Var = this.X;
        if (z) {
            int iN0 = (int) (g00Var.N0() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(b51.a(sp0.f(keyEvent.getKeyCode()), b51.C) ? iN0 : -iN0)));
        } else {
            int iN02 = (int) (g00Var.N0() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(b51.a(sp0.f(keyEvent.getKeyCode()), b51.C) ? iN02 : -iN02)) << 32);
        }
        p7.A(A0(), null, new yl2(this, jFloatToRawIntBits, null, 0), 3);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final fq X0() {
        jn jnVar = this.C;
        if (jnVar != null) {
            return jnVar;
        }
        s.j("Events channel not initialized.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final hh1 Y0() {
        hh1 hh1Var = this.L;
        if (hh1Var != null) {
            return hh1Var;
        }
        s.j("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Z0(o12 o12Var, long j) {
        long jC = sp0.b0(this.h).c(0L);
        if (!rs1.b(this.M, 9205357640488583168L) && !rs1.b(jC, this.M)) {
            this.P = rs1.e(this.P, rs1.d(jC, this.M));
        }
        this.M = jC;
        ga3.a(Y0(), o12Var, this.P);
        X0().s(new nb0(j, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t60, defpackage.r12
    public final void a() {
        m0();
        if (this.u) {
            e70 e70Var = sp0.c0(this).F;
            n50 n50Var = this.T;
            n50Var.getClass();
            n50Var.a = new r40(new hh1(e70Var));
        }
        si1 si1Var = this.a0;
        if (si1Var != null) {
            si1Var.c = sp0.c0(this).F;
        }
        d33 d33Var = this.b0;
        if (d33Var != null) {
            d33Var.c = sp0.c0(this).F;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a1(o12 o12Var, o12 o12Var2, long j) {
        if (this.L == null) {
            this.L = new hh1(28);
        }
        ga3.a(Y0(), o12Var, 0L);
        long jD = rs1.d(o12Var2.c, j);
        this.P = 0L;
        ml2 ml2Var = this.y;
        int i = o12Var.i;
        ml2Var.getClass();
        if (i == 2) {
            return;
        }
        if (!this.E) {
            if (this.C == null) {
                this.C = fg1.a(Integer.MAX_VALUE, 6, null);
            }
            c1();
        }
        this.M = sp0.b0(this).c(0L);
        X0().s(new ob0(jD));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b1() {
        im2 im2Var = this.U;
        if (im2Var.a.b()) {
            return true;
        }
        s8 s8Var = im2Var.b;
        if (s8Var == null) {
            return false;
        }
        jd0 jd0Var = s8Var.c;
        EdgeEffect edgeEffect = jd0Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? ne.c(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = jd0Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? ne.c(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = jd0Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? ne.c(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = jd0Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? ne.c(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c1() {
        this.E = true;
        if (this.C == null) {
            this.C = fg1.a(Integer.MAX_VALUE, 6, null);
        }
        p7.A(A0(), null, new dc0(this, null), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d1(s8 s8Var, n50 n50Var, bk1 bk1Var, qv1 qv1Var, bm2 bm2Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (this.z != z) {
            this.V.h = z;
            z3 = true;
        } else {
            z3 = false;
        }
        n50 n50Var2 = n50Var == null ? this.T : n50Var;
        im2 im2Var = this.U;
        if (t11.l(im2Var.a, bm2Var)) {
            z4 = false;
        } else {
            im2Var.a = bm2Var;
            z4 = true;
        }
        im2Var.b = s8Var;
        if (im2Var.d != qv1Var) {
            im2Var.d = qv1Var;
            z4 = true;
        }
        if (im2Var.e != z2) {
            im2Var.e = z2;
            z4 = true;
        }
        im2Var.c = n50Var2;
        im2Var.f = this.S;
        g00 g00Var = this.X;
        g00Var.v = qv1Var;
        g00Var.x = z2;
        this.Q = s8Var;
        this.R = n50Var;
        ml2 ml2Var = ul2.a;
        qv1 qv1Var2 = im2Var.d;
        qv1 qv1Var3 = qv1.h;
        if (qv1Var2 != qv1Var3) {
            qv1Var3 = qv1.i;
        }
        this.y = ml2Var;
        if (this.z != z) {
            this.z = z;
            if (!z) {
                S0();
                this.O = null;
            }
            z4 = true;
        }
        if (!t11.l(this.A, bk1Var)) {
            S0();
            this.A = bk1Var;
        }
        if (this.x != qv1Var3) {
            this.x = qv1Var3;
        } else {
            z5 = z4;
        }
        if (z5) {
            boolean z6 = this.F;
            mb0 mb0Var = mb0.a;
            if (z6) {
                T0();
                if (this.E) {
                    X0().s(mb0Var);
                }
                this.L = null;
            }
            vy0 vy0Var = this.O;
            if (vy0Var != null) {
                vy0Var.a();
                am2 am2Var = vy0Var.a;
                if (am2Var.E) {
                    am2Var.W0(mb0Var);
                }
                vy0Var.g = null;
                dk dkVar = vy0Var.k;
                dkVar.i = 0;
                ((ck1) dkVar.j).b = 0;
            }
        }
        if (z3) {
            this.Y = null;
            this.Z = null;
            qp0.E(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.uo0
    public final boolean f(o12 o12Var) {
        if (tp0.o(o12Var)) {
            return this.z;
        }
        if (!tp0.q(o12Var)) {
            if (this.N == null) {
                this.N = new ms0(this.x);
            }
            float fD = ((za3) p40.p(this, ly.t)).d();
            long jE = tp0.E(o12Var, false);
            ms0 ms0Var = this.N;
            if (ms0Var == null) {
                s.j("Touch slop detector not initialized.");
                return false;
            }
            if (!rs1.b(ms0Var.a(jE, fD, false), 9205357640488583168L)) {
                long jE2 = rs1.e(ms0Var.a, jE);
                double dAtan2 = ((double) (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jE2 & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jE2 >> 32))))) * 180.0f)) / 3.141592653589793d;
                qv1 qv1Var = (qv1) ms0Var.b;
                int i = qv1Var == null ? -1 : y23.a[qv1Var.ordinal()];
                if (i == 1 ? dAtan2 < 30.0d : !(i != 2 || dAtan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g51
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final void l0(zn2 zn2Var) {
        if (this.z && (this.Y == null || this.Z == null)) {
            this.Y = new s9(17, this);
            this.Z = new yl2(this, null);
        }
        s9 s9Var = this.Y;
        if (s9Var != null) {
            v41[] v41VarArr = xn2.a;
            zn2Var.a(kn2.d, new q3(null, s9Var));
        }
        yl2 yl2Var = this.Z;
        if (yl2Var != null) {
            v41[] v41VarArr2 = xn2.a;
            zn2Var.a(kn2.e, yl2Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final void m0() {
        if (this.F) {
            T0();
            if (this.E) {
                X0().s(mb0.a);
            }
            this.L = null;
        }
        this.F = false;
    }
}
