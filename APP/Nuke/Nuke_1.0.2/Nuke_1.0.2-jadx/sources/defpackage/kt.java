package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kt extends u60 implements r12, g51, on2, d43, gy, os1, wy0, uo0 {
    public static final sn R = new sn(29);
    public boolean A;
    public xm0 B;
    public final ul0 C;
    public my0 D;
    public vo0 E;
    public t60 F;
    public z22 G;
    public xu0 H;
    public final dk1 I;
    public long J;
    public z22 K;
    public bk1 L;
    public boolean M;
    public zt2 N;
    public final sn O;
    public o12 P;
    public oy0 Q;
    public bk1 x;
    public boolean y;
    public String z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kt(bk1 bk1Var, boolean z, boolean z2, String str, xm0 xm0Var) {
        this.x = bk1Var;
        this.y = z;
        this.z = str;
        this.A = z2;
        this.B = xm0Var;
        this.C = new ul0(bk1Var, 0, new e2(1, this, kt.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 0));
        int i = wc1.a;
        this.I = new dk1(6);
        this.J = 0L;
        bk1 bk1Var2 = this.x;
        this.L = bk1Var2;
        this.M = bk1Var2 == null;
        this.O = R;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final boolean B0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wy0
    public final void C() {
        P0(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void E0() {
        L();
        if (!this.M) {
            S0();
        }
        if (this.A) {
            M0(this.C);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.th1
    public final void F0() {
        Q0();
        if (this.L == null) {
            this.x = null;
        }
        t60 t60Var = this.F;
        if (t60Var != null) {
            N0(t60Var);
        }
        this.F = null;
        vo0 vo0Var = this.E;
        if (vo0Var != null) {
            N0(vo0Var);
        }
        this.E = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wy0
    public final void H(e9 e9Var, i12 i12Var) {
        bk1 bk1Var;
        ArrayList arrayList = (ArrayList) e9Var.j;
        S0();
        if (this.A && this.E == null) {
            vo0 vo0Var = new vo0(this);
            M0(vo0Var);
            this.E = vo0Var;
        }
        if (i12Var != i12.i) {
            if (i12Var != i12.j || this.Q == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                oy0 oy0Var = (oy0) arrayList.get(i);
                if (oy0Var.i && oy0Var != this.Q) {
                    P0(true);
                    return;
                }
            }
            return;
        }
        if (this.Q == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (ci0.y((oy0) arrayList.get(i2))) {
                    oy0 oy0Var2 = (oy0) arrayList.get(0);
                    oy0Var2.i = true;
                    this.Q = oy0Var2;
                    if (!this.A || (bk1Var = this.x) == null) {
                        return;
                    }
                    z22 z22Var = new z22(oy0Var2.c);
                    y62 y62Var = new y62();
                    tb3.c(this, vo0.w, new wo0(new d2(10, oy0Var2, y62Var), 0));
                    if (!y62Var.h) {
                        int i3 = lt.b;
                        ViewParent parent = tp0.H(this).getParent();
                        while (parent != null && (parent instanceof ViewGroup)) {
                            ViewGroup viewGroup = (ViewGroup) parent;
                            if (!viewGroup.shouldDelayChildPressedState()) {
                                parent = viewGroup.getParent();
                            }
                        }
                        this.K = z22Var;
                        p7.A(A0(), null, new g2(bk1Var, z22Var, null, 1), 3);
                        return;
                    }
                    this.N = p7.A(A0(), null, new h2(bk1Var, z22Var, this, null, 0), 3);
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            oy0 oy0Var3 = (oy0) arrayList.get(i4);
            if (oy0Var3.i || !oy0Var3.h || oy0Var3.d) {
                float fD = ((za3) p40.p(this, ly.t)).d();
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    oy0 oy0Var4 = (oy0) arrayList.get(i5);
                    long j = oy0Var4.c;
                    oy0 oy0Var5 = this.Q;
                    oy0Var5.getClass();
                    boolean z = Math.abs(rs1.c(rs1.d(j, oy0Var5.c))) > fD;
                    if (oy0Var4.i || z) {
                        P0(true);
                        return;
                    }
                }
                return;
            }
        }
        ((oy0) arrayList.get(0)).i = true;
        if (this.A) {
            oy0 oy0Var6 = this.Q;
            oy0Var6.getClass();
            R0(oy0Var6.c, true);
            this.B.a();
        }
        this.Q = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final void J(h12 h12Var, i12 i12Var, long j) {
        bk1 bk1Var;
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.J = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32);
        S0();
        boolean z = this.A;
        i12 i12Var2 = i12.i;
        if (z) {
            if (this.E == null) {
                vo0 vo0Var = new vo0(this);
                M0(vo0Var);
                this.E = vo0Var;
            }
            if (i12Var == i12Var2) {
                int i = h12Var.f;
                if (i == 4) {
                    p7.A(A0(), null, new j2(this, null, 0), 3);
                } else if (i == 5) {
                    p7.A(A0(), null, new j2(this, null, 1), 3);
                }
            }
        }
        if (i12Var != i12Var2) {
            if (i12Var != i12.j || this.P == null) {
                return;
            }
            List list = h12Var.a;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                o12 o12Var = (o12) list.get(i2);
                if (o12Var.b() && o12Var != this.P) {
                    P0(false);
                    return;
                }
            }
            return;
        }
        if (this.P == null) {
            if (ay2.d(h12Var, true)) {
                o12 o12Var2 = (o12) h12Var.a.get(0);
                o12Var2.a();
                this.P = o12Var2;
                if (!this.A || (bk1Var = this.x) == null) {
                    return;
                }
                z22 z22Var = new z22(o12Var2.c);
                y62 y62Var = new y62();
                tb3.c(this, vo0.w, new wo0(new d2(11, o12Var2, y62Var), 0));
                if (!y62Var.h) {
                    int i3 = lt.b;
                    ViewParent parent = tp0.H(this).getParent();
                    while (parent != null && (parent instanceof ViewGroup)) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        if (!viewGroup.shouldDelayChildPressedState()) {
                            parent = viewGroup.getParent();
                        }
                    }
                    this.G = z22Var;
                    p7.A(A0(), null, new g2(bk1Var, z22Var, null, 2), 3);
                    return;
                }
                this.N = p7.A(A0(), null, new h2(bk1Var, z22Var, this, null, 1), 3);
                return;
            }
            return;
        }
        List list2 = h12Var.a;
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (!tp0.p((o12) list2.get(i4))) {
                long jD0 = sp0.c0(this).F.d0(((za3) p40.p(this, ly.t)).g());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jD0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jD0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32);
                int size3 = list2.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    o12 o12Var3 = (o12) list2.get(i5);
                    if (o12Var3.b() || tp0.z(o12Var3, j, jFloatToRawIntBits)) {
                        P0(false);
                        return;
                    }
                }
                return;
            }
        }
        ((o12) list2.get(0)).a();
        if (this.A) {
            o12 o12Var4 = this.P;
            o12Var4.getClass();
            R0(o12Var4.c, false);
            this.B.a();
        }
        this.P = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.os1
    public final void L() {
        if (this.y) {
            s11.S(this, new c2(this, 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void P0(boolean z) {
        if (z) {
            this.Q = null;
        } else {
            this.P = null;
        }
        bk1 bk1Var = this.x;
        if (bk1Var != null) {
            zt2 zt2Var = this.N;
            if (zt2Var == null || !zt2Var.b()) {
                z22 z22Var = z ? this.K : this.G;
                if (z22Var != null) {
                    y22 y22Var = new y22(z22Var);
                    k21 k21Var = (k21) ((s00) A0()).h.o(sn.K);
                    p7.A(A0(), null, new b2(bk1Var, y22Var, k21Var != null ? k21Var.t(new d2(0, bk1Var, y22Var)) : null, null, 1), 3);
                }
            } else {
                zt2 zt2Var2 = this.N;
                if (zt2Var2 != null) {
                    zt2Var2.c(null);
                }
            }
            if (z) {
                this.K = null;
            } else {
                this.G = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0() {
        bk1 bk1Var = this.x;
        dk1 dk1Var = this.I;
        if (bk1Var != null) {
            z22 z22Var = this.G;
            if (z22Var != null) {
                bk1Var.b(new y22(z22Var));
            }
            z22 z22Var2 = this.K;
            if (z22Var2 != null) {
                bk1Var.b(new y22(z22Var2));
            }
            xu0 xu0Var = this.H;
            if (xu0Var != null) {
                bk1Var.b(new yu0(xu0Var));
            }
            Object[] objArr = dk1Var.c;
            long[] jArr = dk1Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                bk1Var.b(new y22((z22) objArr[(i << 3) + i3]));
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
        this.G = null;
        this.K = null;
        this.H = null;
        dk1Var.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R0(long j, boolean z) {
        bk1 bk1Var = this.x;
        if (bk1Var != null) {
            zt2 zt2Var = this.N;
            if (zt2Var == null || !zt2Var.b()) {
                z22 z22Var = z ? this.K : this.G;
                if (z22Var != null) {
                    p7.A(A0(), null, new g2(z22Var, bk1Var, null), 3);
                }
            } else {
                zt2Var.c(null);
                p7.A(A0(), null, new f2(zt2Var, j, bk1Var, (t00) null, 0), 3);
            }
            if (z) {
                this.K = null;
            } else {
                this.G = null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void S0() {
        if (this.F != null) {
            return;
        }
        my0 my0Var = this.y ? this.D : null;
        if (my0Var != null) {
            if (this.x == null) {
                this.x = new bk1();
            }
            this.C.Q0(this.x);
            bk1 bk1Var = this.x;
            bk1Var.getClass();
            t60 t60VarA = my0Var.a(bk1Var);
            M0(t60VarA);
            this.F = t60VarA;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v1, resolved type: boolean */
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
    @Override // defpackage.g51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(KeyEvent keyEvent) {
        boolean z;
        int iNumberOfTrailingZeros;
        Object obj;
        S0();
        long jZ = qp0.z(keyEvent);
        boolean z2 = this.A;
        dk1 dk1Var = this.I;
        int i = 1;
        if (z2 && qp0.C(keyEvent) == 2 && te.T(keyEvent)) {
            if (!dk1Var.b(jZ)) {
                z22 z22Var = new z22(this.J);
                dk1Var.f(jZ, z22Var);
                if (this.x == null) {
                    return true;
                }
                p7.A(A0(), null, new i2(this, z22Var, null, 2), 3);
                return true;
            }
        } else if (this.A && qp0.C(keyEvent) == 1 && te.T(keyEvent)) {
            dk1Var.getClass();
            int iHashCode = Long.hashCode(jZ) * (-862048943);
            int i2 = iHashCode ^ (iHashCode << 16);
            int i3 = i2 & 127;
            int i4 = dk1Var.d;
            int i5 = (i2 >>> 7) & i4;
            int i6 = 0;
            loop0: while (true) {
                long[] jArr = dk1Var.a;
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
                    if (dk1Var.b[iNumberOfTrailingZeros] == jZ) {
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
                dk1Var.e--;
                long[] jArr2 = dk1Var.a;
                int i9 = dk1Var.d;
                int i10 = iNumberOfTrailingZeros >> 3;
                int i11 = (iNumberOfTrailingZeros & 7) << 3;
                long j6 = (jArr2[i10] & (~(255 << i11))) | (254 << i11);
                jArr2[i10] = j6;
                jArr2[(((iNumberOfTrailingZeros - 7) & i9) + (i9 & 7)) >> 3] = j6;
                Object[] objArr = dk1Var.c;
                obj = objArr[iNumberOfTrailingZeros];
                objArr[iNumberOfTrailingZeros] = null;
            } else {
                obj = null;
            }
            z22 z22Var2 = (z22) obj;
            if (z22Var2 != null) {
                if (this.x != null) {
                    p7.A(A0(), null, new i2(this, z22Var2, null, 3), 3);
                }
                this.B.a();
            }
            if (z22Var2 != null) {
                return z;
            }
            return false;
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
        String str = this.z;
        c2 c2Var = new c2(this, 1);
        v41[] v41VarArr = xn2.a;
        zn2Var.a(kn2.b, new q3(str, c2Var));
        if (this.A) {
            this.C.l0(zn2Var);
        } else {
            zn2Var.a(vn2.j, a83.a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.r12
    public final void m0() {
        xu0 xu0Var;
        bk1 bk1Var = this.x;
        if (bk1Var != null && (xu0Var = this.H) != null) {
            bk1Var.b(new yu0(xu0Var));
        }
        this.H = null;
        P0(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.on2
    public final boolean o0() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d43
    public final Object r() {
        return this.O;
    }
}
