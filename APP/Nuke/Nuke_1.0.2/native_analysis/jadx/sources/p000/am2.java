package p000;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class am2 extends u60 implements g51, on2, r12, wy0, InterfaceC0257gy, uo0 {

    /* JADX INFO: renamed from: A */
    public bk1 f256A;

    /* JADX INFO: renamed from: B */
    public vo0 f257B;

    /* JADX INFO: renamed from: C */
    public C0356jn f258C;

    /* JADX INFO: renamed from: D */
    public fc0 f259D;

    /* JADX INFO: renamed from: E */
    public boolean f260E;

    /* JADX INFO: renamed from: F */
    public boolean f261F;

    /* JADX INFO: renamed from: G */
    public ib0 f262G;

    /* JADX INFO: renamed from: H */
    public lb0 f263H;

    /* JADX INFO: renamed from: I */
    public kb0 f264I;

    /* JADX INFO: renamed from: J */
    public jb0 f265J;

    /* JADX INFO: renamed from: K */
    public AbstractC0738tl f266K;

    /* JADX INFO: renamed from: L */
    public hh1 f267L;

    /* JADX INFO: renamed from: M */
    public long f268M;

    /* JADX INFO: renamed from: N */
    public ms0 f269N;

    /* JADX INFO: renamed from: O */
    public vy0 f270O;

    /* JADX INFO: renamed from: P */
    public long f271P;

    /* JADX INFO: renamed from: Q */
    public C0685s8 f272Q;

    /* JADX INFO: renamed from: R */
    public n50 f273R;

    /* JADX INFO: renamed from: S */
    public final tm1 f274S;

    /* JADX INFO: renamed from: T */
    public final n50 f275T;

    /* JADX INFO: renamed from: U */
    public final im2 f276U;

    /* JADX INFO: renamed from: V */
    public final C0559ox f277V;

    /* JADX INFO: renamed from: W */
    public final pl0 f278W;

    /* JADX INFO: renamed from: X */
    public final g00 f279X;

    /* JADX INFO: renamed from: Y */
    public C0686s9 f280Y;

    /* JADX INFO: renamed from: Z */
    public yl2 f281Z;

    /* JADX INFO: renamed from: a0 */
    public si1 f282a0;

    /* JADX INFO: renamed from: b0 */
    public d33 f283b0;

    /* JADX INFO: renamed from: x */
    public qv1 f284x;

    /* JADX INFO: renamed from: y */
    public ml2 f285y;

    /* JADX INFO: renamed from: z */
    public boolean f286z;

    public am2(C0685s8 c0685s8, n50 n50Var, bk1 bk1Var, qv1 qv1Var, bm2 bm2Var, boolean z, boolean z2) {
        ml2 ml2Var = ul2.f11354a;
        this.f284x = qv1Var;
        this.f285y = ml2Var;
        this.f286z = z;
        this.f256A = bk1Var;
        this.f268M = 9205357640488583168L;
        this.f271P = 0L;
        this.f272Q = c0685s8;
        this.f273R = n50Var;
        tm1 tm1Var = new tm1();
        this.f274S = tm1Var;
        n50 n50Var2 = new n50(new r40(new hh1(ul2.f11357d)));
        this.f275T = n50Var2;
        C0685s8 c0685s82 = this.f272Q;
        n50 n50Var3 = this.f273R;
        im2 im2Var = new im2(bm2Var, c0685s82, n50Var3 == null ? n50Var2 : n50Var3, qv1Var, z2, tm1Var, this, new wl2(this, 0));
        this.f276U = im2Var;
        C0559ox c0559ox = new C0559ox(im2Var, z);
        this.f277V = c0559ox;
        pl0 pl0Var = new pl0(2, null, 10);
        m5468M0(pl0Var);
        this.f278W = pl0Var;
        g00 g00Var = new g00(qv1Var, im2Var, z2, new wl2(this, 1));
        m5468M0(g00Var);
        this.f279X = g00Var;
        m5468M0(new xm1(c0559ox, tm1Var));
        C0699sm c0699sm = new C0699sm();
        c0699sm.f10188v = g00Var;
        m5468M0(c0699sm);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m206P0(am2 am2Var, u00 u00Var) throws Throwable {
        ac0 ac0Var;
        if (u00Var instanceof ac0) {
            ac0Var = (ac0) u00Var;
            int i = ac0Var.f144m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ac0Var.f144m = i - Integer.MIN_VALUE;
            } else {
                ac0Var = new ac0(am2Var, u00Var);
            }
        }
        Object obj = ac0Var.f142k;
        int i2 = ac0Var.f144m;
        t00 t00Var = null;
        if (i2 == 0) {
            fg1.m1627T(obj);
            fc0 fc0Var = am2Var.f259D;
            if (fc0Var != null) {
                bk1 bk1Var = am2Var.f256A;
                if (bk1Var != null) {
                    ec0 ec0Var = new ec0(fc0Var);
                    ac0Var.f144m = 1;
                    Object objM554a = bk1Var.m554a(ec0Var, ac0Var);
                    k20 k20Var = k20.f5323h;
                    if (objM554a == k20Var) {
                        return k20Var;
                    }
                }
            }
            AbstractC0570p7.m3745A(am2Var.f274S.m5331c(), null, new C0003a2(new pb0(0L, false), am2Var, t00Var, 24), 3);
            return a83.f116a;
        }
        if (i2 != 1) {
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fg1.m1627T(obj);
        am2Var.f259D = null;
        AbstractC0570p7.m3745A(am2Var.f274S.m5331c(), null, new C0003a2(new pb0(0L, false), am2Var, t00Var, 24), 3);
        return a83.f116a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m207Q0(am2 am2Var, ob0 ob0Var, u00 u00Var) {
        bc0 bc0Var;
        bk1 bk1Var;
        fc0 fc0Var;
        ob0 ob0Var2;
        fc0 fc0Var2;
        if (u00Var instanceof bc0) {
            bc0Var = (bc0) u00Var;
            int i = bc0Var.f776o;
            if ((i & Integer.MIN_VALUE) != 0) {
                bc0Var.f776o = i - Integer.MIN_VALUE;
            } else {
                bc0Var = new bc0(am2Var, u00Var);
            }
        }
        Object obj = bc0Var.f774m;
        int i2 = bc0Var.f776o;
        k20 k20Var = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(obj);
            fc0 fc0Var3 = am2Var.f259D;
            if (fc0Var3 != null && (bk1Var = am2Var.f256A) != null) {
                ec0 ec0Var = new ec0(fc0Var3);
                bc0Var.f772k = ob0Var;
                bc0Var.f776o = 1;
                if (bk1Var.m554a(ec0Var, bc0Var) != k20Var) {
                }
                return k20Var;
            }
            am2Var.f259D = fc0Var;
            long j = ob0Var.f7608a;
            return a83.f116a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fc0Var2 = bc0Var.f773l;
            ob0Var2 = bc0Var.f772k;
            fg1.m1627T(obj);
            fc0Var = fc0Var2;
            ob0Var = ob0Var2;
            am2Var.f259D = fc0Var;
            long j2 = ob0Var.f7608a;
            return a83.f116a;
        }
        ob0Var = bc0Var.f772k;
        fg1.m1627T(obj);
        fc0Var = new fc0();
        bk1 bk1Var2 = am2Var.f256A;
        if (bk1Var2 != null) {
            bc0Var.f772k = ob0Var;
            bc0Var.f773l = fc0Var;
            bc0Var.f776o = 2;
            if (bk1Var2.m554a(fc0Var, bc0Var) != k20Var) {
                ob0Var2 = ob0Var;
                fc0Var2 = fc0Var;
                fc0Var = fc0Var2;
                ob0Var = ob0Var2;
            }
            return k20Var;
        }
        am2Var.f259D = fc0Var;
        long j22 = ob0Var.f7608a;
        return a83.f116a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m208R0(am2 am2Var, pb0 pb0Var, u00 u00Var) throws Throwable {
        cc0 cc0Var;
        if (u00Var instanceof cc0) {
            cc0Var = (cc0) u00Var;
            int i = cc0Var.f1477n;
            if ((i & Integer.MIN_VALUE) != 0) {
                cc0Var.f1477n = i - Integer.MIN_VALUE;
            } else {
                cc0Var = new cc0(am2Var, u00Var);
            }
        }
        Object obj = cc0Var.f1475l;
        int i2 = cc0Var.f1477n;
        t00 t00Var = null;
        if (i2 == 0) {
            fg1.m1627T(obj);
            fc0 fc0Var = am2Var.f259D;
            if (fc0Var != null) {
                bk1 bk1Var = am2Var.f256A;
                if (bk1Var != null) {
                    gc0 gc0Var = new gc0(fc0Var);
                    cc0Var.f1474k = pb0Var;
                    cc0Var.f1477n = 1;
                    Object objM554a = bk1Var.m554a(gc0Var, cc0Var);
                    k20 k20Var = k20.f5323h;
                    if (objM554a == k20Var) {
                        return k20Var;
                    }
                }
            }
            AbstractC0570p7.m3745A(am2Var.f274S.m5331c(), null, new C0003a2(pb0Var, am2Var, t00Var, 24), 3);
            return a83.f116a;
        }
        if (i2 != 1) {
            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pb0Var = cc0Var.f1474k;
        fg1.m1627T(obj);
        am2Var.f259D = null;
        AbstractC0570p7.m3745A(am2Var.f274S.m5331c(), null, new C0003a2(pb0Var, am2Var, t00Var, 24), 3);
        return a83.f116a;
    }

    /* JADX INFO: renamed from: V0 */
    public static void m209V0(am2 am2Var, o12 o12Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        kb0 kb0Var = am2Var.f264I;
        if (kb0Var == null) {
            kb0Var = new kb0();
            kb0Var.f5434i = null;
            kb0Var.f5435j = Long.MAX_VALUE;
            kb0Var.f5436k = false;
            am2Var.f264I = kb0Var;
        }
        kb0Var.f5434i = o12Var;
        kb0Var.f5435j = j;
        ms0 ms0Var = am2Var.f269N;
        qv1 qv1Var = am2Var.f284x;
        if (ms0Var == null) {
            am2Var.f269N = new ms0(qv1Var);
        } else {
            ms0Var.f6809b = qv1Var;
            ms0Var.f6808a = j2;
        }
        kb0Var.f5436k = false;
        am2Var.f266K = kb0Var;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    @Override // p000.wy0
    /* JADX INFO: renamed from: C */
    public final void mo211C() {
        vy0 vy0Var = this.f270O;
        if (vy0Var != null) {
            vy0Var.m5806a();
            am2 am2Var = vy0Var.f12212a;
            if (am2Var.f260E) {
                am2Var.m220W0(mb0.f6541a);
            }
            vy0Var.f12218g = null;
            C0133dk c0133dk = vy0Var.f12222k;
            c0133dk.f2081i = 0;
            ((ck1) c0133dk.f2082j).f1599b = 0;
        }
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        if (this.f10770u) {
            e70 e70Var = sp0.m4933c0(this).f9365F;
            n50 n50Var = this.f275T;
            n50Var.getClass();
            n50Var.f7007a = new r40(new hh1(e70Var));
        }
        si1 si1Var = this.f282a0;
        if (si1Var != null) {
            si1Var.f4713c = sp0.m4933c0(this).f9365F;
        }
        d33 d33Var = this.f283b0;
        if (d33Var != null) {
            d33Var.f4713c = sp0.m4933c0(this).f9365F;
        }
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        this.f260E = false;
        m217S0();
        this.f271P = 0L;
        vo0 vo0Var = this.f257B;
        if (vo0Var != null) {
            m5469N0(vo0Var);
        }
        this.f257B = null;
    }

    @Override // p000.wy0
    /* JADX INFO: renamed from: H */
    public final void mo214H(C0158e9 c0158e9, i12 i12Var) {
        Object obj;
        boolean z;
        i12 i12Var2;
        Object obj2;
        i12 i12Var3;
        Object obj3;
        int i = c0158e9.f2352i;
        ArrayList arrayList = (ArrayList) c0158e9.f2353j;
        if (this.f257B == null) {
            vo0 vo0Var = new vo0(this);
            m5468M0(vo0Var);
            this.f257B = vo0Var;
        }
        if (this.f286z) {
            if (this.f270O == null) {
                this.f270O = new vy0(this);
            }
            vy0 vy0Var = this.f270O;
            if (vy0Var != null) {
                am2 am2Var = vy0Var.f12212a;
                if (vy0Var.f12217f == null) {
                    qy0 qy0Var = vy0Var.f12213b;
                    if (qy0Var == null) {
                        qy0Var = new qy0();
                        qy0Var.f9285n = py0.f8645j;
                        qy0Var.f9286o = false;
                        vy0Var.f12213b = qy0Var;
                    }
                    vy0Var.f12217f = qy0Var;
                }
                p40 p40Var = vy0Var.f12217f;
                if (p40Var == null) {
                    C0676s.m4651j("currentDragState should not be null");
                    return;
                }
                boolean z2 = p40Var instanceof qy0;
                i12 i12Var4 = i12.f4216h;
                i12 i12Var5 = i12.f4217i;
                if (z2) {
                    qy0 qy0Var2 = (qy0) p40Var;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (!ci0.m824y((oy0) arrayList.get(i2))) {
                            return;
                        }
                    }
                    oy0 oy0Var = (oy0) AbstractC0142du.m1159o0(arrayList);
                    int i3 = uy0.f11554a[qy0Var2.f9285n.ordinal()];
                    py0 py0Var = py0.f8644i;
                    py0 py0Var2 = py0.f8643h;
                    py0 py0Var3 = i3 == 1 ? !am2Var.m227b1() ? py0Var2 : py0Var : qy0Var2.f9285n;
                    qy0Var2.f9285n = py0Var3;
                    if (i12Var == i12Var4 && py0Var3 == py0Var) {
                        oy0Var.f7883i = true;
                        qy0Var2.f9286o = true;
                    }
                    if (i12Var == i12Var5) {
                        if (py0Var3 == py0Var2) {
                            vy0.m5805c(vy0Var, oy0Var, oy0Var.f7875a, 0L, 12);
                            return;
                        }
                        if (qy0Var2.f9286o) {
                            vy0Var.m5810f(oy0Var, oy0Var, new ny0(i), 0L);
                            vy0Var.m5809e(oy0Var, new ny0(i), 0L);
                            long j = oy0Var.f7875a;
                            ty0 ty0Var = vy0Var.f12214c;
                            if (ty0Var == null) {
                                ty0Var = new ty0();
                                ty0Var.f11000n = Long.MAX_VALUE;
                                vy0Var.f12214c = ty0Var;
                            }
                            ty0Var.f11000n = j;
                            vy0Var.f12217f = ty0Var;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = p40Var instanceof sy0;
                i12 i12Var6 = i12.f4218j;
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
                                if (((oy0) arrayList.get(i4)).f7883i) {
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
                            if (!((oy0) arrayList.get(i5)).f7878d) {
                                i5++;
                            } else if (!arrayList.isEmpty()) {
                                if (z) {
                                    long jM795T = ci0.m795T((oy0) AbstractC0142du.m1159o0(arrayList), am2Var.f284x, new ny0(i));
                                    oy0 oy0Var2 = ry0Var.f9820n;
                                    oy0Var2.getClass();
                                    long jM4611d = rs1.m4611d(jM795T, ci0.m795T(oy0Var2, am2Var.f284x, new ny0(i)));
                                    oy0 oy0Var3 = ry0Var.f9820n;
                                    if (oy0Var3 != null) {
                                        vy0.m5805c(vy0Var, oy0Var3, ry0Var.f9821o, jM4611d, 8);
                                        return;
                                    } else {
                                        C0676s.m4651j("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        vy0Var.m5806a();
                        return;
                    }
                    if (!(p40Var instanceof ty0)) {
                        c80.m675s();
                        return;
                    }
                    ty0 ty0Var2 = (ty0) p40Var;
                    if (i12Var != i12Var5) {
                        return;
                    }
                    long j2 = ty0Var2.f11000n;
                    int size4 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i6);
                        if (up0.m5553s(((oy0) obj).f7875a, j2)) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    oy0 oy0Var4 = (oy0) obj;
                    if (oy0Var4 == null) {
                        return;
                    }
                    boolean zM819t = ci0.m819t(oy0Var4);
                    mb0 mb0Var = mb0.f6541a;
                    if (!zM819t) {
                        if (oy0Var4.f7883i) {
                            am2Var.m220W0(mb0Var);
                            return;
                        } else {
                            if (rs1.m4610c(ci0.m794S(oy0Var4, am2Var.f284x, new ny0(i), true)) == 0.0f) {
                                return;
                            }
                            vy0Var.m5809e(oy0Var4, new ny0(i), ci0.m794S(oy0Var4, am2Var.f284x, new ny0(i), false));
                            oy0Var4.f7883i = true;
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
                        if (((oy0) obj5).f7878d) {
                            obj4 = obj5;
                            break;
                        }
                        i7++;
                    }
                    oy0 oy0Var5 = (oy0) obj4;
                    if (oy0Var5 != null) {
                        ty0Var2.f11000n = oy0Var5.f7875a;
                        return;
                    }
                    if (oy0Var4.f7883i || !ci0.m819t(oy0Var4)) {
                        am2Var.m220W0(mb0Var);
                    } else {
                        ci0.m818s(vy0Var.m5808d(), oy0Var4, am2Var.f284x, new ny0(i), vy0Var.f12221j, vy0Var.f12223l);
                        float fMo6406a = ((za3) p40.m3733p(am2Var, AbstractC0441ly.f6394t)).mo6406a();
                        long jM2190y = vy0Var.m5808d().m2190y(ea3.m1314a(fMo6406a, fMo6406a));
                        m60 m60Var = (m60) vy0Var.m5808d().f4019i;
                        bb2 bb2Var = m60Var.f6485a;
                        i40[] i40VarArr = (i40[]) bb2Var.f764e;
                        AbstractC0460mg.m3094i0(i40VarArr, 0, i40VarArr.length);
                        bb2Var.f762c = 0;
                        bb2 bb2Var2 = m60Var.f6486b;
                        i40[] i40VarArr2 = (i40[]) bb2Var2.f764e;
                        AbstractC0460mg.m3094i0(i40VarArr2, 0, i40VarArr2.length);
                        bb2Var2.f762c = 0;
                        m60Var.f6487c = 0L;
                        am2Var.m220W0(new pb0(p40.m3714Y(jM2190y), true));
                    }
                    vy0Var.m5806a();
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
                    if (up0.m5553s(((oy0) obj2).f7875a, sy0Var.f10419o)) {
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
                        if (((oy0) obj3).f7878d) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    oy0Var6 = (oy0) obj3;
                    if (oy0Var6 == null) {
                        vy0Var.m5806a();
                        return;
                    }
                    sy0Var.f10419o = oy0Var6.f7875a;
                }
                oy0 oy0Var7 = oy0Var6;
                if (i12Var != i12Var2) {
                    i12Var3 = i12Var6;
                } else if (oy0Var7.f7883i) {
                    i12Var3 = i12Var6;
                    oy0 oy0Var8 = sy0Var.f10418n;
                    if (oy0Var8 == null) {
                        C0676s.m4651j("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j3 = sy0Var.f10419o;
                    ms0 ms0Var = vy0Var.f12220i;
                    if (ms0Var == null) {
                        C0676s.m4651j("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    vy0Var.m5807b(oy0Var8, j3, ms0Var);
                } else if (ci0.m819t(oy0Var7)) {
                    int size8 = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size8) {
                            break;
                        }
                        Object obj6 = arrayList.get(i10);
                        if (((oy0) obj6).f7878d) {
                            obj4 = obj6;
                            break;
                        }
                        i10++;
                    }
                    oy0 oy0Var9 = (oy0) obj4;
                    if (oy0Var9 == null) {
                        vy0Var.m5806a();
                    } else {
                        sy0Var.f10419o = oy0Var9.f7875a;
                    }
                    i12Var3 = i12Var6;
                } else {
                    za3 za3Var = (za3) p40.m3733p(am2Var, AbstractC0441ly.f6394t);
                    float f = yb0.f13389a;
                    float fMo3035d = za3Var.mo3035d();
                    ms0 ms0Var2 = vy0Var.f12220i;
                    if (ms0Var2 == null) {
                        C0676s.m4651j("Touch slop detector not initialized.");
                        return;
                    }
                    long jM3188a = ms0Var2.m3188a(ci0.m794S(oy0Var7, am2Var.f284x, new ny0(i), true), fMo3035d, true);
                    if ((9223372034707292159L & jM3188a) != 9205357640488583168L) {
                        oy0Var7.f7883i = true;
                        oy0 oy0Var10 = sy0Var.f10418n;
                        oy0Var10.getClass();
                        i12Var3 = i12Var6;
                        vy0Var.m5810f(oy0Var10, oy0Var7, new ny0(i), jM3188a);
                        vy0Var.m5809e(oy0Var7, new ny0(i), jM3188a);
                        long j4 = oy0Var7.f7875a;
                        ty0 ty0Var3 = vy0Var.f12214c;
                        if (ty0Var3 == null) {
                            ty0Var3 = new ty0();
                            ty0Var3.f11000n = Long.MAX_VALUE;
                            vy0Var.f12214c = ty0Var3;
                        }
                        ty0Var3.f11000n = j4;
                        vy0Var.f12217f = ty0Var3;
                    } else {
                        i12Var3 = i12Var6;
                        sy0Var.f10420p = true;
                    }
                }
                if (i12Var == i12Var3 && sy0Var.f10420p) {
                    if (!oy0Var7.f7883i) {
                        sy0Var.f10420p = false;
                        return;
                    }
                    oy0 oy0Var11 = sy0Var.f10418n;
                    if (oy0Var11 == null) {
                        C0676s.m4651j("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j5 = sy0Var.f10419o;
                    ms0 ms0Var3 = vy0Var.f12220i;
                    if (ms0Var3 != null) {
                        vy0Var.m5807b(oy0Var11, j5, ms0Var3);
                    } else {
                        C0676s.m4651j("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0132  */
    @Override // p000.r12
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo215J(h12 h12Var, i12 i12Var, long j) {
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
        List list = h12Var.f3776a;
        int size = list.size();
        int i4 = 0;
        while (true) {
            i12Var2 = i12.f4217i;
            i12Var3 = i12.f4216h;
            if (i4 >= size) {
                break;
            }
            o12 o12Var = (o12) list.get(i4);
            ml2 ml2Var = am2Var.f285y;
            int i5 = o12Var.f7428i;
            ml2Var.getClass();
            if (i5 == 2) {
                i4++;
            } else {
                am2Var.f261F = true;
                if (am2Var.f257B == null) {
                    vo0 vo0Var = new vo0(am2Var);
                    am2Var.m5468M0(vo0Var);
                    am2Var.f257B = vo0Var;
                }
                if (!am2Var.f286z) {
                    break;
                }
                if (am2Var.f266K == null) {
                    ib0 ib0Var = am2Var.f262G;
                    if (ib0Var == null) {
                        ib0Var = new ib0();
                        ib0Var.f4517i = hb0.f3941j;
                        ib0Var.f4518j = false;
                        am2Var.f262G = ib0Var;
                    }
                    am2Var.f266K = ib0Var;
                }
                AbstractC0738tl abstractC0738tl = am2Var.f266K;
                if (abstractC0738tl == null) {
                    C0676s.m4651j("currentDragState should not be null");
                    return;
                }
                if (abstractC0738tl instanceof ib0) {
                    ib0 ib0Var2 = (ib0) abstractC0738tl;
                    if (!list.isEmpty() && ay2.m307d(h12Var, false)) {
                        o12 o12Var2 = (o12) AbstractC0142du.m1159o0(list);
                        int i6 = zb0.f13819a[ib0Var2.f4517i.ordinal()];
                        hb0 hb0Var = hb0.f3940i;
                        hb0 hb0Var2 = hb0.f3939h;
                        hb0 hb0Var3 = i6 == 1 ? !am2Var.m227b1() ? hb0Var2 : hb0Var : ib0Var2.f4517i;
                        ib0Var2.f4517i = hb0Var3;
                        if (i12Var == i12Var3 && hb0Var3 == hb0Var) {
                            o12Var2.m3463a();
                            ib0Var2.f4518j = true;
                        }
                        if (i12Var == i12Var2) {
                            if (hb0Var3 == hb0Var2) {
                                m209V0(am2Var, o12Var2, o12Var2.f7420a, 0L, 12);
                            } else if (ib0Var2.f4518j) {
                                am2Var.m226a1(o12Var2, o12Var2, 0L);
                                am2Var.m224Z0(o12Var2, 0L);
                                long j2 = o12Var2.f7420a;
                                lb0 lb0Var2 = am2Var.f263H;
                                if (lb0Var2 == null) {
                                    lb0Var2 = new lb0();
                                    lb0Var2.f6020i = Long.MAX_VALUE;
                                    am2Var.f263H = lb0Var2;
                                }
                                lb0Var2.f6020i = j2;
                                am2Var.f266K = lb0Var2;
                            }
                        }
                    }
                } else {
                    boolean z3 = abstractC0738tl instanceof kb0;
                    i12 i12Var6 = i12.f4218j;
                    if (z3) {
                        kb0 kb0Var = (kb0) abstractC0738tl;
                        if (i12Var != i12Var3) {
                            int size2 = list.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size2) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = list.get(i7);
                                if (up0.m5553s(((o12) obj3).f7420a, kb0Var.f5435j)) {
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
                                    if (((o12) obj5).f7423d) {
                                        break;
                                    } else {
                                        i8++;
                                    }
                                }
                                o12Var3 = (o12) obj5;
                                if (o12Var3 == null) {
                                    am2Var.m218T0();
                                } else {
                                    kb0Var.f5435j = o12Var3.f7420a;
                                    if (i12Var == i12Var2) {
                                        if (o12Var3.m3464b()) {
                                            o12 o12Var4 = kb0Var.f5434i;
                                            if (o12Var4 == null) {
                                                C0676s.m4651j("AwaitTouchSlop.initialDown was not initialized");
                                                return;
                                            }
                                            long j3 = kb0Var.f5435j;
                                            ms0 ms0Var = am2Var.f269N;
                                            if (ms0Var == null) {
                                                C0676s.m4651j("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                return;
                                            }
                                            am2Var.m219U0(o12Var4, j3, ms0Var);
                                        } else if (tp0.m5369q(o12Var3)) {
                                            int size4 = list.size();
                                            int i9 = 0;
                                            while (true) {
                                                if (i9 >= size4) {
                                                    obj4 = null;
                                                    break;
                                                }
                                                obj4 = list.get(i9);
                                                if (((o12) obj4).f7423d) {
                                                    break;
                                                } else {
                                                    i9++;
                                                }
                                            }
                                            o12 o12Var5 = (o12) obj4;
                                            if (o12Var5 == null) {
                                                am2Var.m218T0();
                                            } else {
                                                kb0Var.f5435j = o12Var5.f7420a;
                                            }
                                        } else {
                                            float fM6246f = yb0.m6246f((za3) p40.m3733p(am2Var, AbstractC0441ly.f6394t), o12Var3.f7428i);
                                            ms0 ms0Var2 = am2Var.f269N;
                                            if (ms0Var2 == null) {
                                                C0676s.m4651j("Touch slop detector not initialized.");
                                                return;
                                            }
                                            long jM3188a = ms0Var2.m3188a(tp0.m5343E(o12Var3, true), fM6246f, true);
                                            if ((9223372034707292159L & jM3188a) != 9205357640488583168L) {
                                                boolean zMo230f = am2Var.mo230f(o12Var3);
                                                d43 d43VarM5155a = tb3.m5155a(am2Var, vo0.f12086w);
                                                vo0 vo0Var2 = d43VarM5155a instanceof vo0 ? (vo0) d43VarM5155a : null;
                                                uo0 uo0Var = vo0Var2 != null ? vo0Var2.f12087v : null;
                                                if (uo0Var != null) {
                                                    z2 = true;
                                                    boolean z4 = uo0Var.mo230f(o12Var3);
                                                    if (zMo230f && z4) {
                                                        kb0Var.f5436k = z2;
                                                    } else {
                                                        o12Var3.m3463a();
                                                        o12 o12Var6 = kb0Var.f5434i;
                                                        o12Var6.getClass();
                                                        am2Var.m226a1(o12Var6, o12Var3, jM3188a);
                                                        am2Var.m224Z0(o12Var3, jM3188a);
                                                        long j4 = o12Var3.f7420a;
                                                        lb0Var = am2Var.f263H;
                                                        if (lb0Var == null) {
                                                            lb0Var = new lb0();
                                                            lb0Var.f6020i = Long.MAX_VALUE;
                                                            am2Var.f263H = lb0Var;
                                                        }
                                                        lb0Var.f6020i = j4;
                                                        am2Var.f266K = lb0Var;
                                                    }
                                                } else {
                                                    z2 = true;
                                                }
                                                if (zMo230f) {
                                                    o12Var3.m3463a();
                                                    o12 o12Var62 = kb0Var.f5434i;
                                                    o12Var62.getClass();
                                                    am2Var.m226a1(o12Var62, o12Var3, jM3188a);
                                                    am2Var.m224Z0(o12Var3, jM3188a);
                                                    long j42 = o12Var3.f7420a;
                                                    lb0Var = am2Var.f263H;
                                                    if (lb0Var == null) {
                                                    }
                                                    lb0Var.f6020i = j42;
                                                    am2Var.f266K = lb0Var;
                                                }
                                            } else {
                                                kb0Var.f5436k = true;
                                            }
                                        }
                                    }
                                    if (i12Var != i12Var6 && kb0Var.f5436k) {
                                        if (o12Var3.m3464b()) {
                                            o12 o12Var7 = kb0Var.f5434i;
                                            if (o12Var7 == null) {
                                                C0676s.m4651j("AwaitTouchSlop.initialDown was not initialized");
                                                return;
                                            }
                                            long j5 = kb0Var.f5435j;
                                            ms0 ms0Var3 = am2Var.f269N;
                                            if (ms0Var3 == null) {
                                                C0676s.m4651j("AwaitTouchSlop.touchSlopDetector was not initialized");
                                                return;
                                            }
                                            am2Var.m219U0(o12Var7, j5, ms0Var3);
                                        } else {
                                            kb0Var.f5436k = false;
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
                    } else if (abstractC0738tl instanceof jb0) {
                        jb0 jb0Var = (jb0) abstractC0738tl;
                        if (i12Var == i12Var6) {
                            int size5 = list.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size5) {
                                    z = true;
                                    break;
                                } else {
                                    if (((o12) list.get(i10)).m3464b()) {
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
                                if (!((o12) list.get(i11)).f7423d) {
                                    i11++;
                                } else {
                                    if (list.isEmpty()) {
                                        break;
                                    }
                                    if (z) {
                                        long j6 = ((o12) AbstractC0142du.m1159o0(list)).f7422c;
                                        o12 o12Var8 = jb0Var.f4949i;
                                        o12Var8.getClass();
                                        long jM4611d = rs1.m4611d(j6, o12Var8.f7422c);
                                        o12 o12Var9 = jb0Var.f4949i;
                                        if (o12Var9 == null) {
                                            C0676s.m4651j("AwaitGesturePickup.initialDown was not initialized.");
                                            return;
                                        }
                                        m209V0(am2Var, o12Var9, jb0Var.f4950j, jM4611d, 8);
                                    }
                                }
                            }
                            am2Var.m218T0();
                        }
                    } else {
                        if (!(abstractC0738tl instanceof lb0)) {
                            c80.m675s();
                            return;
                        }
                        lb0 lb0Var3 = (lb0) abstractC0738tl;
                        if (i12Var == i12Var2) {
                            long j7 = lb0Var3.f6020i;
                            int size7 = list.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size7) {
                                    obj = null;
                                    break;
                                }
                                obj = list.get(i12);
                                if (up0.m5553s(((o12) obj).f7420a, j7)) {
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                            o12 o12Var10 = (o12) obj;
                            if (o12Var10 != null) {
                                boolean zM5369q = tp0.m5369q(o12Var10);
                                mb0 mb0Var = mb0.f6541a;
                                if (zM5369q) {
                                    int size8 = list.size();
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= size8) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = list.get(i13);
                                        if (((o12) obj2).f7423d) {
                                            break;
                                        } else {
                                            i13++;
                                        }
                                    }
                                    o12 o12Var11 = (o12) obj2;
                                    if (o12Var11 == null) {
                                        if (o12Var10.m3464b() || !tp0.m5369q(o12Var10)) {
                                            am2Var.m222X0().mo2225s(mb0Var);
                                        } else {
                                            ga3.m1816a(am2Var.m223Y0(), o12Var10, 0L);
                                            float fMo6406a = ((za3) p40.m3733p(am2Var, AbstractC0441ly.f6394t)).mo6406a();
                                            long jM2190y = am2Var.m223Y0().m2190y(ea3.m1314a(fMo6406a, fMo6406a));
                                            m60 m60Var = (m60) am2Var.m223Y0().f4019i;
                                            bb2 bb2Var = m60Var.f6485a;
                                            i40[] i40VarArr = (i40[]) bb2Var.f764e;
                                            AbstractC0460mg.m3094i0(i40VarArr, 0, i40VarArr.length);
                                            bb2Var.f762c = 0;
                                            bb2 bb2Var2 = m60Var.f6486b;
                                            i40[] i40VarArr2 = (i40[]) bb2Var2.f764e;
                                            AbstractC0460mg.m3094i0(i40VarArr2, 0, i40VarArr2.length);
                                            bb2Var2.f762c = 0;
                                            m60Var.f6487c = 0L;
                                            am2Var.m222X0().mo2225s(new pb0(p40.m3714Y(jM2190y), false));
                                            am2Var.f261F = false;
                                        }
                                        am2Var.m218T0();
                                    } else {
                                        lb0Var3.f6020i = o12Var11.f7420a;
                                    }
                                } else if (o12Var10.m3464b()) {
                                    am2Var.m222X0().mo2225s(mb0Var);
                                } else if (rs1.m4610c(tp0.m5343E(o12Var10, true)) != 0.0f) {
                                    am2Var.m224Z0(o12Var10, tp0.m5343E(o12Var10, false));
                                    o12Var10.m3463a();
                                }
                            }
                        }
                    }
                }
            }
        }
        if (am2Var.f257B == null) {
            vo0 vo0Var3 = new vo0(am2Var);
            am2Var.m5468M0(vo0Var3);
            am2Var.f257B = vo0Var3;
        }
        if (am2Var.f286z) {
            im2 im2Var = am2Var.f276U;
            if (i12Var == i12Var3 && h12Var.f3781f == 6) {
                if (am2Var.f282a0 == null) {
                    i12Var4 = i12Var2;
                    i = 6;
                    am2Var = this;
                    am2Var.f282a0 = new si1(im2Var, new C0485n4(1, ViewConfiguration.get(tp0.m5344H(am2Var).getContext())), new C0365jw(2, this, am2.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), sp0.m4933c0(am2Var).f9365F);
                } else {
                    i12Var4 = i12Var2;
                    i = 6;
                }
                si1 si1Var = am2Var.f282a0;
                if (si1Var != null) {
                    j20 j20VarM5255A0 = am2Var.m5255A0();
                    if (si1Var.f10151h == null) {
                        si1Var.f10151h = AbstractC0570p7.m3745A(j20VarM5255A0, null, new C0003a2(si1Var, null, 16), 3);
                    }
                }
            } else {
                i12Var4 = i12Var2;
                i = 6;
            }
            si1 si1Var2 = am2Var.f282a0;
            if (si1Var2 == null || h12Var.f3781f != i) {
                i12Var5 = i12Var4;
                break;
            }
            int size9 = list.size();
            for (int i14 = 0; i14 < size9; i14++) {
                if (((o12) list.get(i14)).m3464b()) {
                    i12Var5 = i12Var4;
                    break;
                }
            }
            if (i12Var == i12Var3 && si1Var2.f4714d) {
                si1Var2.m4871f(h12Var);
                io1.m2381a(h12Var);
            }
            i12Var5 = i12Var4;
            if (i12Var == i12Var5 && !si1Var2.f4714d && si1Var2.m4871f(h12Var)) {
                io1.m2381a(h12Var);
            }
            if (i12Var == i12Var3 && ((i3 = h12Var.f3781f) == 10 || i3 == 11 || i3 == 12)) {
                if (am2Var.f283b0 == null) {
                    i2 = 10;
                    am2Var = this;
                    am2Var.f283b0 = new d33(im2Var, new C0365jw(2, this, am2.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 2), sp0.m4933c0(am2Var).f9365F);
                } else {
                    i2 = 10;
                }
                d33 d33Var = am2Var.f283b0;
                if (d33Var != null) {
                    j20 j20VarM5255A02 = am2Var.m5255A0();
                    if (d33Var.f1858g == null) {
                        d33Var.f1858g = AbstractC0570p7.m3745A(j20VarM5255A02, null, new C0379k9(d33Var, null), 3);
                    }
                }
            } else {
                i2 = 10;
            }
            d33 d33Var2 = am2Var.f283b0;
            if (d33Var2 != null) {
                int i15 = h12Var.f3781f;
                if (i15 == i2 || i15 == 11 || i15 == 12) {
                    int size10 = list.size();
                    for (int i16 = 0; i16 < size10; i16++) {
                        if (((o12) list.get(i16)).m3464b()) {
                            return;
                        }
                    }
                    if (i12Var == i12Var3 && d33Var2.f4714d) {
                        d33Var2.m938d(h12Var);
                        io1.m2381a(h12Var);
                    }
                    if (i12Var == i12Var5 && !d33Var2.f4714d && d33Var2.m938d(h12Var)) {
                        io1.m2381a(h12Var);
                    }
                }
            }
        }
    }

    @Override // p000.uo0
    /* JADX INFO: renamed from: M */
    public final boolean mo216M(oy0 oy0Var) {
        return ci0.m824y(oy0Var) && this.f286z;
    }

    /* JADX INFO: renamed from: S0 */
    public final void m217S0() {
        fc0 fc0Var = this.f259D;
        if (fc0Var != null) {
            bk1 bk1Var = this.f256A;
            if (bk1Var != null) {
                bk1Var.m555b(new ec0(fc0Var));
            }
            this.f259D = null;
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m218T0() {
        ib0 ib0Var = this.f262G;
        hb0 hb0Var = hb0.f3941j;
        if (ib0Var == null) {
            ib0Var = new ib0();
            ib0Var.f4517i = hb0Var;
            ib0Var.f4518j = false;
            this.f262G = ib0Var;
        }
        ib0Var.f4517i = hb0Var;
        ib0Var.f4518j = false;
        this.f266K = ib0Var;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m219U0(o12 o12Var, long j, ms0 ms0Var) {
        jb0 jb0Var = this.f265J;
        if (jb0Var == null) {
            jb0Var = new jb0();
            jb0Var.f4949i = null;
            jb0Var.f4950j = Long.MAX_VALUE;
            this.f265J = jb0Var;
        }
        jb0Var.f4949i = o12Var;
        jb0Var.f4950j = j;
        ms0Var.f6808a = 0L;
        this.f266K = jb0Var;
    }

    /* JADX INFO: renamed from: W0 */
    public final void m220W0(qb0 qb0Var) {
        if ((qb0Var instanceof ob0) && !this.f260E) {
            this.f260E = true;
            m228c1();
        }
        m222X0().mo2225s(qb0Var);
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: X */
    public final boolean mo221X(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.f286z || ((!b51.m440a(qp0.m4271z(keyEvent), b51.f569D) && !b51.m440a(sp0.m4938f(keyEvent.getKeyCode()), b51.f568C)) || qp0.m4222C(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.f276U.f4690d == qv1.f9205h;
        g00 g00Var = this.f279X;
        if (z) {
            int iM1772N0 = (int) (g00Var.m1772N0() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(b51.m440a(sp0.m4938f(keyEvent.getKeyCode()), b51.f568C) ? iM1772N0 : -iM1772N0)));
        } else {
            int iM1772N02 = (int) (g00Var.m1772N0() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(b51.m440a(sp0.m4938f(keyEvent.getKeyCode()), b51.f568C) ? iM1772N02 : -iM1772N02)) << 32);
        }
        AbstractC0570p7.m3745A(m5255A0(), null, new yl2(this, jFloatToRawIntBits, null, 0), 3);
        return true;
    }

    /* JADX INFO: renamed from: X0 */
    public final InterfaceC0212fq m222X0() {
        C0356jn c0356jn = this.f258C;
        if (c0356jn != null) {
            return c0356jn;
        }
        C0676s.m4651j("Events channel not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: Y0 */
    public final hh1 m223Y0() {
        hh1 hh1Var = this.f267L;
        if (hh1Var != null) {
            return hh1Var;
        }
        C0676s.m4651j("Velocity Tracker not initialized.");
        return null;
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m224Z0(o12 o12Var, long j) {
        long jMo647c = sp0.m4931b0(this.f10757h).mo647c(0L);
        if (!rs1.m4609b(this.f268M, 9205357640488583168L) && !rs1.m4609b(jMo647c, this.f268M)) {
            this.f271P = rs1.m4612e(this.f271P, rs1.m4611d(jMo647c, this.f268M));
        }
        this.f268M = jMo647c;
        ga3.m1816a(m223Y0(), o12Var, this.f271P);
        m222X0().mo2225s(new nb0(j, false));
    }

    @Override // p000.t60, p000.r12
    /* JADX INFO: renamed from: a */
    public final void mo225a() {
        mo233m0();
        if (this.f10770u) {
            e70 e70Var = sp0.m4933c0(this).f9365F;
            n50 n50Var = this.f275T;
            n50Var.getClass();
            n50Var.f7007a = new r40(new hh1(e70Var));
        }
        si1 si1Var = this.f282a0;
        if (si1Var != null) {
            si1Var.f4713c = sp0.m4933c0(this).f9365F;
        }
        d33 d33Var = this.f283b0;
        if (d33Var != null) {
            d33Var.f4713c = sp0.m4933c0(this).f9365F;
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m226a1(o12 o12Var, o12 o12Var2, long j) {
        if (this.f267L == null) {
            this.f267L = new hh1(28);
        }
        ga3.m1816a(m223Y0(), o12Var, 0L);
        long jM4611d = rs1.m4611d(o12Var2.f7422c, j);
        this.f271P = 0L;
        ml2 ml2Var = this.f285y;
        int i = o12Var.f7428i;
        ml2Var.getClass();
        if (i == 2) {
            return;
        }
        if (!this.f260E) {
            if (this.f258C == null) {
                this.f258C = fg1.m1630a(Integer.MAX_VALUE, 6, null);
            }
            m228c1();
        }
        this.f268M = sp0.m4931b0(this).mo647c(0L);
        m222X0().mo2225s(new ob0(jM4611d));
    }

    /* JADX INFO: renamed from: b1 */
    public final boolean m227b1() {
        im2 im2Var = this.f276U;
        if (im2Var.f4687a.mo568b()) {
            return true;
        }
        C0685s8 c0685s8 = im2Var.f4688b;
        if (c0685s8 == null) {
            return false;
        }
        jd0 jd0Var = c0685s8.f9964c;
        EdgeEffect edgeEffect = jd0Var.f4972d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC0495ne.m3288c(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = jd0Var.f4973e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC0495ne.m3288c(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = jd0Var.f4974f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC0495ne.m3288c(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = jd0Var.f4975g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? AbstractC0495ne.m3288c(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m228c1() {
        this.f260E = true;
        if (this.f258C == null) {
            this.f258C = fg1.m1630a(Integer.MAX_VALUE, 6, null);
        }
        AbstractC0570p7.m3745A(m5255A0(), null, new dc0(this, null), 3);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m229d1(C0685s8 c0685s8, n50 n50Var, bk1 bk1Var, qv1 qv1Var, bm2 bm2Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (this.f286z != z) {
            this.f277V.f7865h = z;
            z3 = true;
        } else {
            z3 = false;
        }
        n50 n50Var2 = n50Var == null ? this.f275T : n50Var;
        im2 im2Var = this.f276U;
        if (t11.m5086l(im2Var.f4687a, bm2Var)) {
            z4 = false;
        } else {
            im2Var.f4687a = bm2Var;
            z4 = true;
        }
        im2Var.f4688b = c0685s8;
        if (im2Var.f4690d != qv1Var) {
            im2Var.f4690d = qv1Var;
            z4 = true;
        }
        if (im2Var.f4691e != z2) {
            im2Var.f4691e = z2;
            z4 = true;
        }
        im2Var.f4689c = n50Var2;
        im2Var.f4692f = this.f274S;
        g00 g00Var = this.f279X;
        g00Var.f3213v = qv1Var;
        g00Var.f3215x = z2;
        this.f272Q = c0685s8;
        this.f273R = n50Var;
        ml2 ml2Var = ul2.f11354a;
        qv1 qv1Var2 = im2Var.f4690d;
        qv1 qv1Var3 = qv1.f9205h;
        if (qv1Var2 != qv1Var3) {
            qv1Var3 = qv1.f9206i;
        }
        this.f285y = ml2Var;
        if (this.f286z != z) {
            this.f286z = z;
            if (!z) {
                m217S0();
                this.f270O = null;
            }
            z4 = true;
        }
        if (!t11.m5086l(this.f256A, bk1Var)) {
            m217S0();
            this.f256A = bk1Var;
        }
        if (this.f284x != qv1Var3) {
            this.f284x = qv1Var3;
        } else {
            z5 = z4;
        }
        if (z5) {
            boolean z6 = this.f261F;
            mb0 mb0Var = mb0.f6541a;
            if (z6) {
                m218T0();
                if (this.f260E) {
                    m222X0().mo2225s(mb0Var);
                }
                this.f267L = null;
            }
            vy0 vy0Var = this.f270O;
            if (vy0Var != null) {
                vy0Var.m5806a();
                am2 am2Var = vy0Var.f12212a;
                if (am2Var.f260E) {
                    am2Var.m220W0(mb0Var);
                }
                vy0Var.f12218g = null;
                C0133dk c0133dk = vy0Var.f12222k;
                c0133dk.f2081i = 0;
                ((ck1) c0133dk.f2082j).f1599b = 0;
            }
        }
        if (z3) {
            this.f280Y = null;
            this.f281Z = null;
            qp0.m4223E(this);
        }
    }

    @Override // p000.uo0
    /* JADX INFO: renamed from: f */
    public final boolean mo230f(o12 o12Var) {
        if (tp0.m5367o(o12Var)) {
            return this.f286z;
        }
        if (!tp0.m5369q(o12Var)) {
            if (this.f269N == null) {
                this.f269N = new ms0(this.f284x);
            }
            float fMo3035d = ((za3) p40.m3733p(this, AbstractC0441ly.f6394t)).mo3035d();
            long jM5343E = tp0.m5343E(o12Var, false);
            ms0 ms0Var = this.f269N;
            if (ms0Var == null) {
                C0676s.m4651j("Touch slop detector not initialized.");
                return false;
            }
            if (!rs1.m4609b(ms0Var.m3188a(jM5343E, fMo3035d, false), 9205357640488583168L)) {
                long jM4612e = rs1.m4612e(ms0Var.f6808a, jM5343E);
                double dAtan2 = ((double) (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jM4612e & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jM4612e >> 32))))) * 180.0f)) / 3.141592653589793d;
                qv1 qv1Var = (qv1) ms0Var.f6809b;
                int i = qv1Var == null ? -1 : y23.f13285a[qv1Var.ordinal()];
                if (i == 1 ? dAtan2 < 30.0d : !(i != 2 || dAtan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.g51
    /* JADX INFO: renamed from: k */
    public final boolean mo231k(KeyEvent keyEvent) {
        return false;
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: l0 */
    public final void mo232l0(zn2 zn2Var) {
        if (this.f286z && (this.f280Y == null || this.f281Z == null)) {
            this.f280Y = new C0686s9(17, this);
            this.f281Z = new yl2(this, null);
        }
        C0686s9 c0686s9 = this.f280Y;
        if (c0686s9 != null) {
            v41[] v41VarArr = xn2.f13086a;
            zn2Var.mo1533a(kn2.f5662d, new C0603q3(null, c0686s9));
        }
        yl2 yl2Var = this.f281Z;
        if (yl2Var != null) {
            v41[] v41VarArr2 = xn2.f13086a;
            zn2Var.mo1533a(kn2.f5663e, yl2Var);
        }
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: m0 */
    public final void mo233m0() {
        if (this.f261F) {
            m218T0();
            if (this.f260E) {
                m222X0().mo2225s(mb0.f6541a);
            }
            this.f267L = null;
        }
        this.f261F = false;
    }
}
