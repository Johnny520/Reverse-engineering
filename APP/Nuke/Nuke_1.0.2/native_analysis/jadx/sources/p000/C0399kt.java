package p000;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: kt */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0399kt extends u60 implements r12, g51, on2, d43, InterfaceC0257gy, os1, wy0, uo0 {

    /* JADX INFO: renamed from: R */
    public static final C0700sn f5743R = new C0700sn(29);

    /* JADX INFO: renamed from: A */
    public boolean f5744A;

    /* JADX INFO: renamed from: B */
    public xm0 f5745B;

    /* JADX INFO: renamed from: C */
    public final ul0 f5746C;

    /* JADX INFO: renamed from: D */
    public my0 f5747D;

    /* JADX INFO: renamed from: E */
    public vo0 f5748E;

    /* JADX INFO: renamed from: F */
    public t60 f5749F;

    /* JADX INFO: renamed from: G */
    public z22 f5750G;

    /* JADX INFO: renamed from: H */
    public xu0 f5751H;

    /* JADX INFO: renamed from: I */
    public final dk1 f5752I;

    /* JADX INFO: renamed from: J */
    public long f5753J;

    /* JADX INFO: renamed from: K */
    public z22 f5754K;

    /* JADX INFO: renamed from: L */
    public bk1 f5755L;

    /* JADX INFO: renamed from: M */
    public boolean f5756M;

    /* JADX INFO: renamed from: N */
    public zt2 f5757N;

    /* JADX INFO: renamed from: O */
    public final C0700sn f5758O;

    /* JADX INFO: renamed from: P */
    public o12 f5759P;

    /* JADX INFO: renamed from: Q */
    public oy0 f5760Q;

    /* JADX INFO: renamed from: x */
    public bk1 f5761x;

    /* JADX INFO: renamed from: y */
    public boolean f5762y;

    /* JADX INFO: renamed from: z */
    public String f5763z;

    public C0399kt(bk1 bk1Var, boolean z, boolean z2, String str, xm0 xm0Var) {
        this.f5761x = bk1Var;
        this.f5762y = z;
        this.f5763z = str;
        this.f5744A = z2;
        this.f5745B = xm0Var;
        this.f5746C = new ul0(bk1Var, 0, new C0151e2(1, this, C0399kt.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 0));
        int i = wc1.f12459a;
        this.f5752I = new dk1(6);
        this.f5753J = 0L;
        bk1 bk1Var2 = this.f5761x;
        this.f5755L = bk1Var2;
        this.f5756M = bk1Var2 == null;
        this.f5758O = f5743R;
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: B0 */
    public final boolean mo210B0() {
        return false;
    }

    @Override // p000.wy0
    /* JADX INFO: renamed from: C */
    public final void mo211C() {
        m2734P0(true);
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: E0 */
    public final void mo212E0() {
        mo1847L();
        if (!this.f5756M) {
            m2737S0();
        }
        if (this.f5744A) {
            m5468M0(this.f5746C);
        }
    }

    @Override // p000.th1
    /* JADX INFO: renamed from: F0 */
    public final void mo213F0() {
        m2735Q0();
        if (this.f5755L == null) {
            this.f5761x = null;
        }
        t60 t60Var = this.f5749F;
        if (t60Var != null) {
            m5469N0(t60Var);
        }
        this.f5749F = null;
        vo0 vo0Var = this.f5748E;
        if (vo0Var != null) {
            m5469N0(vo0Var);
        }
        this.f5748E = null;
    }

    @Override // p000.wy0
    /* JADX INFO: renamed from: H */
    public final void mo214H(C0158e9 c0158e9, i12 i12Var) {
        bk1 bk1Var;
        ArrayList arrayList = (ArrayList) c0158e9.f2353j;
        m2737S0();
        if (this.f5744A && this.f5748E == null) {
            vo0 vo0Var = new vo0(this);
            m5468M0(vo0Var);
            this.f5748E = vo0Var;
        }
        if (i12Var != i12.f4217i) {
            if (i12Var != i12.f4218j || this.f5760Q == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                oy0 oy0Var = (oy0) arrayList.get(i);
                if (oy0Var.f7883i && oy0Var != this.f5760Q) {
                    m2734P0(true);
                    return;
                }
            }
            return;
        }
        if (this.f5760Q == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (ci0.m824y((oy0) arrayList.get(i2))) {
                    oy0 oy0Var2 = (oy0) arrayList.get(0);
                    oy0Var2.f7883i = true;
                    this.f5760Q = oy0Var2;
                    if (!this.f5744A || (bk1Var = this.f5761x) == null) {
                        return;
                    }
                    z22 z22Var = new z22(oy0Var2.f7877c);
                    y62 y62Var = new y62();
                    tb3.m5157c(this, vo0.f12086w, new wo0(new C0115d2(10, oy0Var2, y62Var), 0));
                    if (!y62Var.f13324h) {
                        int i3 = AbstractC0436lt.f6296b;
                        ViewParent parent = tp0.m5344H(this).getParent();
                        while (parent != null && (parent instanceof ViewGroup)) {
                            ViewGroup viewGroup = (ViewGroup) parent;
                            if (!viewGroup.shouldDelayChildPressedState()) {
                                parent = viewGroup.getParent();
                            }
                        }
                        this.f5754K = z22Var;
                        AbstractC0570p7.m3745A(m5255A0(), null, new C0225g2(bk1Var, z22Var, null, 1), 3);
                        return;
                    }
                    this.f5757N = AbstractC0570p7.m3745A(m5255A0(), null, new C0262h2(bk1Var, z22Var, this, null, 0), 3);
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            oy0 oy0Var3 = (oy0) arrayList.get(i4);
            if (oy0Var3.f7883i || !oy0Var3.f7882h || oy0Var3.f7878d) {
                float fMo3035d = ((za3) p40.m3733p(this, AbstractC0441ly.f6394t)).mo3035d();
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    oy0 oy0Var4 = (oy0) arrayList.get(i5);
                    long j = oy0Var4.f7877c;
                    oy0 oy0Var5 = this.f5760Q;
                    oy0Var5.getClass();
                    boolean z = Math.abs(rs1.m4610c(rs1.m4611d(j, oy0Var5.f7877c))) > fMo3035d;
                    if (oy0Var4.f7883i || z) {
                        m2734P0(true);
                        return;
                    }
                }
                return;
            }
        }
        ((oy0) arrayList.get(0)).f7883i = true;
        if (this.f5744A) {
            oy0 oy0Var6 = this.f5760Q;
            oy0Var6.getClass();
            m2736R0(oy0Var6.f7877c, true);
            this.f5745B.mo6a();
        }
        this.f5760Q = null;
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: J */
    public final void mo215J(h12 h12Var, i12 i12Var, long j) {
        bk1 bk1Var;
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.f5753J = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32);
        m2737S0();
        boolean z = this.f5744A;
        i12 i12Var2 = i12.f4217i;
        if (z) {
            if (this.f5748E == null) {
                vo0 vo0Var = new vo0(this);
                m5468M0(vo0Var);
                this.f5748E = vo0Var;
            }
            if (i12Var == i12Var2) {
                int i = h12Var.f3781f;
                if (i == 4) {
                    AbstractC0570p7.m3745A(m5255A0(), null, new C0334j2(this, null, 0), 3);
                } else if (i == 5) {
                    AbstractC0570p7.m3745A(m5255A0(), null, new C0334j2(this, null, 1), 3);
                }
            }
        }
        if (i12Var != i12Var2) {
            if (i12Var != i12.f4218j || this.f5759P == null) {
                return;
            }
            List list = h12Var.f3776a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                o12 o12Var = (o12) list.get(i2);
                if (o12Var.m3464b() && o12Var != this.f5759P) {
                    m2734P0(false);
                    return;
                }
            }
            return;
        }
        if (this.f5759P == null) {
            if (ay2.m307d(h12Var, true)) {
                o12 o12Var2 = (o12) h12Var.f3776a.get(0);
                o12Var2.m3463a();
                this.f5759P = o12Var2;
                if (!this.f5744A || (bk1Var = this.f5761x) == null) {
                    return;
                }
                z22 z22Var = new z22(o12Var2.f7422c);
                y62 y62Var = new y62();
                tb3.m5157c(this, vo0.f12086w, new wo0(new C0115d2(11, o12Var2, y62Var), 0));
                if (!y62Var.f13324h) {
                    int i3 = AbstractC0436lt.f6296b;
                    ViewParent parent = tp0.m5344H(this).getParent();
                    while (parent != null && (parent instanceof ViewGroup)) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        if (!viewGroup.shouldDelayChildPressedState()) {
                            parent = viewGroup.getParent();
                        }
                    }
                    this.f5750G = z22Var;
                    AbstractC0570p7.m3745A(m5255A0(), null, new C0225g2(bk1Var, z22Var, null, 2), 3);
                    return;
                }
                this.f5757N = AbstractC0570p7.m3745A(m5255A0(), null, new C0262h2(bk1Var, z22Var, this, null, 1), 3);
                return;
            }
            return;
        }
        List list2 = h12Var.f3776a;
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (!tp0.m5368p((o12) list2.get(i4))) {
                long jMo694d0 = sp0.m4933c0(this).f9365F.mo694d0(((za3) p40.m3733p(this, AbstractC0441ly.f6394t)).mo3036g());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo694d0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo694d0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32);
                int size3 = list2.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    o12 o12Var3 = (o12) list2.get(i5);
                    if (o12Var3.m3464b() || tp0.m5375z(o12Var3, j, jFloatToRawIntBits)) {
                        m2734P0(false);
                        return;
                    }
                }
                return;
            }
        }
        ((o12) list2.get(0)).m3463a();
        if (this.f5744A) {
            o12 o12Var4 = this.f5759P;
            o12Var4.getClass();
            m2736R0(o12Var4.f7422c, false);
            this.f5745B.mo6a();
        }
        this.f5759P = null;
    }

    @Override // p000.os1
    /* JADX INFO: renamed from: L */
    public final void mo1847L() {
        if (this.f5762y) {
            s11.m4674S(this, new C0076c2(this, 0));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m2734P0(boolean z) {
        if (z) {
            this.f5760Q = null;
        } else {
            this.f5759P = null;
        }
        bk1 bk1Var = this.f5761x;
        if (bk1Var != null) {
            zt2 zt2Var = this.f5757N;
            if (zt2Var == null || !zt2Var.mo1703b()) {
                z22 z22Var = z ? this.f5754K : this.f5750G;
                if (z22Var != null) {
                    y22 y22Var = new y22(z22Var);
                    k21 k21Var = (k21) ((s00) m5255A0()).f9850h.mo15o(C0700sn.f10207K);
                    AbstractC0570p7.m3745A(m5255A0(), null, new C0040b2(bk1Var, y22Var, k21Var != null ? k21Var.mo1707t(new C0115d2(0, bk1Var, y22Var)) : null, null, 1), 3);
                }
            } else {
                zt2 zt2Var2 = this.f5757N;
                if (zt2Var2 != null) {
                    zt2Var2.mo1704c(null);
                }
            }
            if (z) {
                this.f5754K = null;
            } else {
                this.f5750G = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX INFO: renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2735Q0() {
        bk1 bk1Var = this.f5761x;
        dk1 dk1Var = this.f5752I;
        if (bk1Var != null) {
            z22 z22Var = this.f5750G;
            if (z22Var != null) {
                bk1Var.m555b(new y22(z22Var));
            }
            z22 z22Var2 = this.f5754K;
            if (z22Var2 != null) {
                bk1Var.m555b(new y22(z22Var2));
            }
            xu0 xu0Var = this.f5751H;
            if (xu0Var != null) {
                bk1Var.m555b(new yu0(xu0Var));
            }
            Object[] objArr = dk1Var.f2088c;
            long[] jArr = dk1Var.f2086a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                bk1Var.m555b(new y22((z22) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.f5750G = null;
        this.f5754K = null;
        this.f5751H = null;
        dk1Var.m1046a();
    }

    /* JADX INFO: renamed from: R0 */
    public final void m2736R0(long j, boolean z) {
        bk1 bk1Var = this.f5761x;
        if (bk1Var != null) {
            zt2 zt2Var = this.f5757N;
            if (zt2Var == null || !zt2Var.mo1703b()) {
                z22 z22Var = z ? this.f5754K : this.f5750G;
                if (z22Var != null) {
                    AbstractC0570p7.m3745A(m5255A0(), null, new C0225g2(z22Var, bk1Var, null), 3);
                }
            } else {
                zt2Var.mo1704c(null);
                AbstractC0570p7.m3745A(m5255A0(), null, new C0188f2(zt2Var, j, bk1Var, (t00) null, 0), 3);
            }
            if (z) {
                this.f5754K = null;
            } else {
                this.f5750G = null;
            }
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m2737S0() {
        if (this.f5749F != null) {
            return;
        }
        my0 my0Var = this.f5762y ? this.f5747D : null;
        if (my0Var != null) {
            if (this.f5761x == null) {
                this.f5761x = new bk1();
            }
            this.f5746C.m5510Q0(this.f5761x);
            bk1 bk1Var = this.f5761x;
            bk1Var.getClass();
            t60 t60VarMo2436a = my0Var.mo2436a(bk1Var);
            m5468M0(t60VarMo2436a);
            this.f5749F = t60VarMo2436a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
    
        if (((r7 & ((~r7) << 6)) & r14) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.g51
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo221X(KeyEvent keyEvent) {
        boolean z;
        int iNumberOfTrailingZeros;
        Object obj;
        m2737S0();
        long jM4271z = qp0.m4271z(keyEvent);
        boolean z2 = this.f5744A;
        dk1 dk1Var = this.f5752I;
        int i = 1;
        if (z2 && qp0.m4222C(keyEvent) == 2 && AbstractC0731te.m5191T(keyEvent)) {
            if (!dk1Var.m1047b(jM4271z)) {
                z22 z22Var = new z22(this.f5753J);
                dk1Var.m1051f(jM4271z, z22Var);
                if (this.f5761x == null) {
                    return true;
                }
                AbstractC0570p7.m3745A(m5255A0(), null, new C0299i2(this, z22Var, null, 2), 3);
                return true;
            }
        } else if (this.f5744A && qp0.m4222C(keyEvent) == 1 && AbstractC0731te.m5191T(keyEvent)) {
            dk1Var.getClass();
            int iHashCode = Long.hashCode(jM4271z) * (-862048943);
            int i2 = iHashCode ^ (iHashCode << 16);
            int i3 = i2 & 127;
            int i4 = dk1Var.f2089d;
            int i5 = (i2 >>> 7) & i4;
            int i6 = 0;
            loop0: while (true) {
                long[] jArr = dk1Var.f2086a;
                int i7 = i5 >> 3;
                int i8 = (i5 & 7) << 3;
                z = i;
                long j = (((-i8) >> 63) & (jArr[i7 + i] << (64 - i8))) | (jArr[i7] >>> i8);
                long j2 = (((long) i3) * 72340172838076673L) ^ j;
                long j3 = -9187201950435737472L;
                long j4 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j4 == 0) {
                        break;
                    }
                    iNumberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                    long j5 = j3;
                    if (dk1Var.f2087b[iNumberOfTrailingZeros] == jM4271z) {
                        break loop0;
                    }
                    j4 &= j4 - 1;
                    j3 = j5;
                }
                i6 += 8;
                i5 = (i5 + i6) & i4;
                i = z ? 1 : 0;
            }
            if (iNumberOfTrailingZeros >= 0) {
                dk1Var.f2090e--;
                long[] jArr2 = dk1Var.f2086a;
                int i9 = dk1Var.f2089d;
                int i10 = iNumberOfTrailingZeros >> 3;
                int i11 = (iNumberOfTrailingZeros & 7) << 3;
                long j6 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
                jArr2[i10] = j6;
                jArr2[(((iNumberOfTrailingZeros - 7) & i9) + (i9 & 7)) >> 3] = j6;
                Object[] objArr = dk1Var.f2088c;
                obj = objArr[iNumberOfTrailingZeros];
                objArr[iNumberOfTrailingZeros] = null;
            } else {
                obj = null;
            }
            z22 z22Var2 = (z22) obj;
            if (z22Var2 != null) {
                if (this.f5761x != null) {
                    AbstractC0570p7.m3745A(m5255A0(), null, new C0299i2(this, z22Var2, null, 3), 3);
                }
                this.f5745B.mo6a();
            }
            if (z22Var2 != null) {
                return z;
            }
            return false;
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
        String str = this.f5763z;
        C0076c2 c0076c2 = new C0076c2(this, 1);
        v41[] v41VarArr = xn2.f13086a;
        zn2Var.mo1533a(kn2.f5660b, new C0603q3(str, c0076c2));
        if (this.f5744A) {
            this.f5746C.mo232l0(zn2Var);
        } else {
            zn2Var.mo1533a(vn2.f12067j, a83.f116a);
        }
    }

    @Override // p000.r12
    /* JADX INFO: renamed from: m0 */
    public final void mo233m0() {
        xu0 xu0Var;
        bk1 bk1Var = this.f5761x;
        if (bk1Var != null && (xu0Var = this.f5751H) != null) {
            bk1Var.m555b(new yu0(xu0Var));
        }
        this.f5751H = null;
        m2734P0(false);
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: o0 */
    public final boolean mo358o0() {
        return true;
    }

    @Override // p000.d43
    /* JADX INFO: renamed from: r */
    public final Object mo962r() {
        return this.f5758O;
    }
}
