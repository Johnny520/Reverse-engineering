package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class go0 implements px {
    public int A;
    public int B;
    public boolean C;
    public final fo0 D;
    public final ArrayList E;
    public boolean F;
    public pr2 G;
    public qr2 H;
    public tr2 I;
    public boolean J;
    public yy1 K;
    public dq L;
    public final qx M;
    public ao0 N;
    public lj0 O;
    public sq2 P;
    public final cy Q;
    public final a20 R;
    public boolean S;
    public long T;
    public ho0 U;
    public final s73 a;
    public final yx b;
    public final qr2 c;
    public final uk1 d;
    public final dq e;
    public final dq f;
    public final n4 g;
    public final fy h;
    public ko0 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public xj1 p;
    public boolean q;
    public boolean r;
    public zj1 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final i11 n = new i11();
    public final ArrayList s = new ArrayList();
    public final i11 t = new i11();
    public yy1 u = yy1.k;
    public final i11 x = new i11();
    public int z = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public go0(s73 s73Var, yx yxVar, qr2 qr2Var, uk1 uk1Var, dq dqVar, dq dqVar2, n4 n4Var, fy fyVar) {
        this.a = s73Var;
        this.b = yxVar;
        this.c = qr2Var;
        this.d = uk1Var;
        this.e = dqVar;
        this.f = dqVar2;
        this.g = n4Var;
        this.h = fyVar;
        this.C = yxVar.f() || yxVar.d();
        this.D = new fo0(0, this);
        this.E = new ArrayList();
        pr2 pr2VarC = qr2Var.c();
        pr2VarC.c();
        this.G = pr2VarC;
        qr2 qr2Var2 = new qr2();
        if (yxVar.f()) {
            qr2Var2.b();
        }
        if (yxVar.d()) {
            qr2Var2.r = new zj1();
        }
        this.H = qr2Var2;
        tr2 tr2VarD = qr2Var2.d();
        tr2VarD.e(true);
        this.I = tr2VarD;
        this.M = new qx(this, dqVar);
        pr2 pr2VarC2 = this.H.c();
        try {
            ao0 ao0VarA = pr2VarC2.a(0);
            pr2VarC2.c();
            this.N = ao0VarA;
            this.O = new lj0();
            this.Q = new cy(this);
            a20 a20VarJ = yxVar.j();
            a20 a20VarZ = z();
            this.R = a20VarJ.k(a20VarZ == null ? zd0.h : a20VarZ);
        } catch (Throwable th) {
            pr2VarC2.c();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int N(go0 go0Var, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        long[] jArr2;
        int i5;
        int i6;
        pr2 pr2Var;
        pr2 pr2Var2 = go0Var.G;
        int i7 = 0;
        if (pr2Var2.j(i)) {
            int i8 = pr2Var2.i(i);
            Object objP = pr2Var2.p(pr2Var2.b, i);
            if (i8 == 206 && t11.l(objP, tx.e)) {
                Object objH = pr2Var2.h(i, 0);
                lo0 lo0Var = objH instanceof lo0 ? (lo0) objH : null;
                a82 a82Var = lo0Var != null ? lo0Var.a : null;
                do0 do0Var = a82Var instanceof do0 ? (do0) a82Var : null;
                if (do0Var != null) {
                    sk1 sk1Var = do0Var.h.e;
                    Object[] objArr = sk1Var.b;
                    long[] jArr3 = sk1Var.a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j = jArr3[i9];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i10 = 8;
                                int i11 = 8 - ((~(i9 - length)) >>> 31);
                                int i12 = i7;
                                while (i12 < i11) {
                                    if ((255 & j) < 128) {
                                        go0 go0Var2 = (go0) objArr[(i9 << 3) + i12];
                                        qr2 qr2Var = go0Var2.c;
                                        if (qr2Var.i <= 0 || (qr2Var.h[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            i5 = i7;
                                            i6 = i10;
                                        } else {
                                            fy fyVar = go0Var2.h;
                                            synchronized (fyVar.k) {
                                                fyVar.p();
                                                i6 = i10;
                                                rk1 rk1Var = fyVar.u;
                                                fyVar.u = qp0.o();
                                                try {
                                                    fyVar.C.c0(rk1Var);
                                                } finally {
                                                }
                                            }
                                            dq dqVar = new dq();
                                            go0Var2.L = dqVar;
                                            pr2 pr2VarC = go0Var2.c.c();
                                            try {
                                                go0Var2.G = pr2VarC;
                                                qx qxVar = go0Var2.M;
                                                dq dqVar2 = qxVar.b;
                                                try {
                                                    qxVar.b = dqVar;
                                                    go0Var2.M(0);
                                                    qx qxVar2 = go0Var2.M;
                                                    qxVar2.b();
                                                    jArr2 = jArr3;
                                                    try {
                                                        if (qxVar2.c) {
                                                            pr2Var = pr2VarC;
                                                            try {
                                                                qxVar2.b.t.X(bv1.c);
                                                                if (qxVar2.c) {
                                                                    qxVar2.d(false);
                                                                    qxVar2.d(false);
                                                                    qxVar2.b.t.X(lu1.c);
                                                                    i5 = 0;
                                                                    qxVar2.c = false;
                                                                }
                                                                qxVar.b = dqVar2;
                                                                pr2Var.c();
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                qxVar.b = dqVar2;
                                                                throw th;
                                                            }
                                                        } else {
                                                            pr2Var = pr2VarC;
                                                        }
                                                        qxVar.b = dqVar2;
                                                        pr2Var.c();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        pr2Var.c();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    pr2Var = pr2VarC;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                pr2Var = pr2VarC;
                                            }
                                        }
                                        go0Var.b.r(go0Var2.h);
                                    } else {
                                        jArr2 = jArr3;
                                        i5 = i7;
                                        i6 = i10;
                                    }
                                    j >>= i6;
                                    i12++;
                                    i10 = i6;
                                    i7 = i5;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                i4 = i7;
                                if (i11 != i10) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                i4 = i7;
                            }
                            if (i9 == length) {
                                break;
                            }
                            i9++;
                            i7 = i4;
                            jArr3 = jArr;
                        }
                    }
                }
                return pr2Var2.o(i);
            }
            i3 = 1;
            if (!pr2Var2.l(i)) {
                return pr2Var2.o(i);
            }
        } else {
            i3 = 1;
            if (pr2Var2.d(i)) {
                int i13 = pr2Var2.b[(i * 5) + 3] + i;
                int iN = 0;
                for (int i14 = i + 1; i14 < i13; i14 += pr2Var2.b[(i14 * 5) + 3]) {
                    boolean zL = pr2Var2.l(i14);
                    if (zL) {
                        go0Var.M.c();
                        qx qxVar3 = go0Var.M;
                        Object objN = pr2Var2.n(i14);
                        qxVar3.c();
                        qxVar3.h.add(objN);
                    }
                    iN += N(go0Var, i14, zL || z, zL ? 0 : i2 + iN);
                    if (zL) {
                        go0Var.M.c();
                        go0Var.M.a();
                    }
                }
                if (!pr2Var2.l(i)) {
                    return iN;
                }
            } else if (!pr2Var2.l(i)) {
                return pr2Var2.o(i);
            }
        }
        return i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean A() {
        b62 b62VarX;
        return (this.S || this.y || this.w || (b62VarX = x()) == null || (b62VarX.b & 8) != 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(ArrayList arrayList) {
        go0 go0Var = this;
        dq dqVar = go0Var.f;
        qx qxVar = go0Var.M;
        dq dqVar2 = qxVar.b;
        try {
            qxVar.b = dqVar;
            dqVar.t.X(zu1.c);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                ow1 ow1Var = (ow1) arrayList.get(i);
                ui1 ui1Var = (ui1) ow1Var.h;
                ui1Var.getClass();
                ao0 ao0VarE = up0.e(null);
                qr2 qr2VarD = sr2.d(null);
                int iA = qr2VarD.a(ao0VarE);
                e11 e11Var = new e11();
                qxVar.b();
                kv1 kv1Var = qxVar.b.t;
                kv1Var.X(iu1.c);
                rg3.N(kv1Var, 0, e11Var, 1, ao0VarE);
                if (qr2VarD == go0Var.H) {
                    if (!go0Var.I.w) {
                        tx.a("Check failed");
                    }
                    go0Var.v();
                }
                pr2 pr2VarC = qr2VarD.c();
                try {
                    pr2VarC.r(iA);
                    qxVar.f = iA;
                    dq dqVar3 = new dq();
                    go0Var.G(null, null, null, be0.h, new s1(go0Var, dqVar3, pr2VarC, ui1Var));
                    dq dqVar4 = qxVar.b;
                    dqVar4.getClass();
                    if (!dqVar3.t.W()) {
                        kv1 kv1Var2 = dqVar4.t;
                        kv1Var2.X(eu1.c);
                        rg3.N(kv1Var2, 0, dqVar3, 1, e11Var);
                    }
                    pr2VarC.c();
                    qxVar.b.t.X(bv1.c);
                    i++;
                    go0Var = this;
                } catch (Throwable th) {
                    pr2VarC.c();
                    throw th;
                }
            }
            qxVar.b();
            qxVar.b.t.X(mu1.c);
            qxVar.f = 0;
            qxVar.b = dqVar2;
        } catch (Throwable th2) {
            qxVar.b = dqVar2;
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void C(yy1 yy1Var, Object obj) {
        S(126665345, 0, null, null);
        D();
        g0(obj);
        long j = this.T;
        try {
            this.T = 126665345L;
            if (this.S) {
                tr2.z(this.I);
            }
            boolean z = (this.S || t11.l(this.G.f(), yy1Var)) ? false : true;
            if (z) {
                J(yy1Var);
            }
            S(202, 0, tx.c, yy1Var);
            this.K = null;
            boolean z2 = this.w;
            this.w = z;
            rg3.F(this, new kw(-59194059, true, new s9(7, obj)));
            this.w = z2;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object D() {
        boolean z = this.S;
        eb ebVar = nx.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof ba2)) {
                return objM;
            }
        } else if (this.r) {
            tx.a("A call to createNode(), emitNode() or useNode() expected");
            return ebVar;
        }
        return ebVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List E() {
        yx yxVar = this.b;
        xx xxVarH = yxVar.h();
        fy fyVar = xxVarH != null ? (fy) xxVarH : null;
        if (fyVar != null) {
            qr2 qr2Var = fyVar.m;
            pr2 pr2VarC = sr2.d(qr2Var).c();
            try {
                Integer numR = p7.r(pr2VarC, yxVar, 0, pr2VarC.c);
                if (numR != null) {
                    pr2VarC = sr2.d(qr2Var).c();
                    try {
                        ArrayList arrayListP = p7.P(pr2VarC, numR.intValue(), 0);
                        pr2VarC.c();
                        return du.x0(arrayListP, fyVar.C.E());
                    } finally {
                    }
                }
            } finally {
            }
        }
        return be0.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int F(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += this.G.b[(iQ * 5) + 3];
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:20:0x003c, B:22:0x0044, B:24:0x004a, B:25:0x004e, B:26:0x004f, B:28:0x0055, B:21:0x0040), top: B:33:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(fy fyVar, fy fyVar2, Integer num, List list, xm0 xm0Var) {
        Object objA;
        boolean z = this.F;
        int i = this.k;
        try {
            this.F = true;
            this.k = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ow1 ow1Var = (ow1) list.get(i2);
                b62 b62Var = (b62) ow1Var.h;
                Object obj = ow1Var.i;
                if (obj != null) {
                    b0(b62Var, obj);
                } else {
                    b0(b62Var, null);
                }
            }
            if (fyVar == null) {
                objA = xm0Var.a();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (fyVar2 == null || fyVar2 == fyVar || iIntValue < 0) {
                    objA = xm0Var.a();
                } else {
                    fyVar.y = fyVar2;
                    fyVar.z = iIntValue;
                    try {
                        objA = xm0Var.a();
                        fyVar.y = null;
                        fyVar.z = 0;
                    } catch (Throwable th) {
                        fyVar.y = null;
                        fyVar.z = 0;
                        throw th;
                    }
                }
                if (objA == null) {
                }
            }
            this.F = z;
            this.k = i;
            return objA;
        } catch (Throwable th2) {
            this.F = z;
            this.k = i;
            throw th2;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST, IPUT]}, finally: {[CONST] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice insn: 0x023d: IPUT (r1v35 ?? I:yy1), (r40v0 'this' ?? I:go0 A[IMMUTABLE_TYPE, THIS]) (LINE:574) go0.K yy1, expected: 0x030b: INVOKE (r15v1 ?? I:b62), (r1v21 ?? I:boolean) VIRTUAL call: b62.d(boolean):void A[MD:(boolean):void (m)] (LINE:780) */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: boolean */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H() {
        b21 b21Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        boolean z;
        gk1 gk1Var;
        long j2;
        int iQ;
        int i8;
        int iHashCode;
        Object objB;
        sn snVar = sn.T;
        boolean z2 = this.F;
        this.F = true;
        pr2 pr2Var = this.G;
        int i9 = pr2Var.i;
        int i10 = (i9 * 5) + 3;
        int i11 = pr2Var.b[i10] + i9;
        int i12 = this.k;
        long j3 = this.T;
        int i13 = this.l;
        int i14 = this.m;
        int i15 = pr2Var.g;
        ArrayList arrayList = this.s;
        int iQ2 = p7.q(i15, arrayList);
        if (iQ2 < 0) {
            iQ2 = -(iQ2 + 1);
        }
        if (iQ2 < arrayList.size()) {
            b21Var = (b21) arrayList.get(iQ2);
            if (b21Var.b >= i11) {
                b21Var = null;
            }
        }
        int i16 = 1;
        int i17 = i9;
        int i18 = 0;
        while (b21Var != null) {
            b62 b62Var = b21Var.a;
            int i19 = b21Var.b;
            sn snVar2 = snVar;
            int iQ3 = p7.q(i19, arrayList);
            if (iQ3 >= 0) {
            }
            Object obj = b21Var.c;
            if (obj == null) {
                b62Var.getClass();
                i3 = i11;
                i = i10;
                i2 = i12;
            } else {
                int i20 = 8;
                rk1 rk1Var = b62Var.g;
                if (rk1Var == null) {
                    i3 = i11;
                    i = i10;
                    i2 = i12;
                } else {
                    i = i10;
                    if (obj instanceof n70) {
                        n70 n70Var = (n70) obj;
                        ks2 ks2Var = n70Var.j;
                        if (ks2Var == null) {
                            ks2Var = snVar2;
                        }
                        i2 = i12;
                        i6 = !ks2Var.c(n70Var.h().f, rk1Var.g(n70Var)) ? 1 : 0;
                        i3 = i11;
                        i4 = i13;
                        i5 = i14;
                    } else {
                        i2 = i12;
                        if (obj instanceof sk1) {
                            sk1 sk1Var = (sk1) obj;
                            if (sk1Var.h()) {
                                Object[] objArr = sk1Var.b;
                                long[] jArr = sk1Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    i4 = i13;
                                    i5 = i14;
                                    int i21 = 0;
                                    while (true) {
                                        long j4 = jArr[i21];
                                        i3 = i11;
                                        Object[] objArr2 = objArr;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j4 & 255) < 128) {
                                                    i7 = i23;
                                                    Object obj2 = objArr2[(i21 << 3) + i23];
                                                    j = j4;
                                                    if (!(obj2 instanceof n70)) {
                                                        break;
                                                    }
                                                    n70 n70Var2 = (n70) obj2;
                                                    ks2 ks2Var2 = n70Var2.j;
                                                    if (ks2Var2 == null) {
                                                        ks2Var2 = snVar2;
                                                    }
                                                    if (!ks2Var2.c(n70Var2.h().f, rk1Var.g(n70Var2))) {
                                                        break;
                                                    }
                                                } else {
                                                    i7 = i23;
                                                    j = j4;
                                                }
                                                j4 = j >> i20;
                                                i23 = i7 + 1;
                                            }
                                            if (i22 != i20) {
                                                break;
                                            }
                                            if (i21 == length) {
                                                break;
                                            }
                                            i21++;
                                            i11 = i3;
                                            objArr = objArr2;
                                            i20 = 8;
                                        }
                                    }
                                } else {
                                    i3 = i11;
                                    i4 = i13;
                                    i5 = i14;
                                }
                                i6 = 0;
                            }
                        } else {
                            i3 = i11;
                        }
                    }
                    if (i6 == 0) {
                        this.G.r(i19);
                        int i24 = this.G.g;
                        K(i17, i24, i9);
                        int iQ4 = this.G.q(i24);
                        while (iQ4 != i9 && !this.G.l(iQ4)) {
                            iQ4 = this.G.q(iQ4);
                        }
                        int iH0 = this.G.l(iQ4) ? 0 : i2;
                        if (iQ4 != i24) {
                            int iH02 = (h0(iQ4) - this.G.o(i24)) + iH0;
                            while (iH0 < iH02 && iQ4 != i19) {
                                iQ4++;
                                while (iQ4 < i19) {
                                    pr2 pr2Var2 = this.G;
                                    int i25 = pr2Var2.b[(iQ4 * 5) + 3] + iQ4;
                                    if (i19 >= i25) {
                                        iH0 += pr2Var2.l(iQ4) ? i16 : h0(iQ4);
                                        iQ4 = i25;
                                    }
                                }
                                break;
                            }
                        }
                        this.k = iH0;
                        this.m = F(i24);
                        int iQ5 = this.G.q(i24);
                        long jRotateLeft = 0;
                        int i26 = 3;
                        int i27 = 0;
                        while (true) {
                            if (iQ5 < 0) {
                                break;
                            }
                            if (iQ5 == i9) {
                                jRotateLeft ^= Long.rotateLeft(j3, i27);
                                break;
                            }
                            pr2 pr2Var3 = this.G;
                            boolean zK = pr2Var3.k(iQ5);
                            int[] iArr = pr2Var3.b;
                            if (zK) {
                                Object objP = pr2Var3.p(iArr, iQ5);
                                if (objP != null) {
                                    iHashCode = objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode();
                                    i8 = i24;
                                } else {
                                    i8 = i24;
                                    iHashCode = 0;
                                }
                            } else {
                                int i28 = pr2Var3.i(iQ5);
                                i8 = i24;
                                iHashCode = (i28 != 207 || (objB = pr2Var3.b(iArr, iQ5)) == null || objB.equals(nx.a)) ? i28 : objB.hashCode();
                            }
                            if (iHashCode == 126665345) {
                                jRotateLeft ^= Long.rotateLeft(iHashCode, i27);
                                break;
                            }
                            jRotateLeft = (jRotateLeft ^ Long.rotateLeft(iHashCode, i26)) ^ Long.rotateLeft(this.G.k(iQ5) ? 0 : F(iQ5), i27);
                            i26 = (i26 + 6) % 64;
                            i27 = (i27 + 6) % 64;
                            iQ5 = this.G.q(iQ5);
                            i24 = i8;
                        }
                        this.T = jRotateLeft;
                        this.K = null;
                        mn0 mn0Var = b62Var.d;
                        if (mn0Var == null) {
                            s.l("Invalid restart scope");
                            return;
                        }
                        mn0Var.g(this, Integer.valueOf(i16));
                        this.K = null;
                        pr2 pr2Var4 = this.G;
                        int i29 = pr2Var4.b[i] + i9;
                        int i30 = pr2Var4.g;
                        if (((i30 < i9 || i30 > i29) ? 0 : i16) == 0) {
                            tx.a("Index " + i9 + " is not a parent of " + i30);
                        }
                        pr2Var4.i = i9;
                        pr2Var4.h = i29;
                        pr2Var4.l = 0;
                        pr2Var4.m = 0;
                        z = z2;
                        i17 = i8;
                        i18 = i16;
                    } else {
                        ArrayList arrayList2 = this.E;
                        arrayList2.add(b62Var);
                        this.g.m();
                        fy fyVar = b62Var.a;
                        if (fyVar == null || (gk1Var = b62Var.f) == null) {
                            z = z2;
                        } else {
                            b62Var.d(i16);
                            try {
                                Object[] objArr3 = gk1Var.b;
                                int[] iArr2 = gk1Var.c;
                                long[] jArr2 = gk1Var.a;
                                int length2 = jArr2.length - 2;
                                z = z2;
                                if (length2 >= 0) {
                                    int i31 = 0;
                                    while (true) {
                                        long j5 = jArr2[i31];
                                        long[] jArr3 = jArr2;
                                        Object[] objArr4 = objArr3;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i32 = 8 - ((~(i31 - length2)) >>> 31);
                                            int i33 = 0;
                                            while (i33 < i32) {
                                                if ((j5 & 255) < 128) {
                                                    int i34 = (i31 << 3) + i33;
                                                    j2 = j5;
                                                    Object obj3 = objArr4[i34];
                                                    int i35 = iArr2[i34];
                                                    fyVar.y(obj3);
                                                } else {
                                                    j2 = j5;
                                                }
                                                i33++;
                                                j5 = j2 >> 8;
                                            }
                                            if (i32 != 8) {
                                                break;
                                            }
                                        }
                                        if (i31 == length2) {
                                            break;
                                        }
                                        i31++;
                                        objArr3 = objArr4;
                                        jArr2 = jArr3;
                                    }
                                }
                                b62Var.d(false);
                            } catch (Throwable th) {
                                b62Var.d(false);
                                throw th;
                            }
                        }
                        i16 = 1;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    iQ = p7.q(this.G.g, arrayList);
                    if (iQ < 0) {
                        iQ = -(iQ + 1);
                    }
                    if (iQ >= arrayList.size()) {
                        b21 b21Var2 = (b21) arrayList.get(iQ);
                        i11 = i3;
                        b21Var = b21Var2.b < i11 ? b21Var2 : null;
                        z2 = z;
                        snVar = snVar2;
                        i10 = i;
                        i12 = i2;
                        i13 = i4;
                        i14 = i5;
                    } else {
                        i11 = i3;
                    }
                    z2 = z;
                    snVar = snVar2;
                    i10 = i;
                    i12 = i2;
                    i13 = i4;
                    i14 = i5;
                }
            }
            i4 = i13;
            i5 = i14;
            i6 = i16;
            if (i6 == 0) {
            }
            iQ = p7.q(this.G.g, arrayList);
            if (iQ < 0) {
            }
            if (iQ >= arrayList.size()) {
            }
            z2 = z;
            snVar = snVar2;
            i10 = i;
            i12 = i2;
            i13 = i4;
            i14 = i5;
        }
        boolean z3 = z2;
        int i36 = i12;
        int i37 = i13;
        int i38 = i14;
        if (i18 != 0) {
            K(i17, i9, i9);
            this.G.t();
            int iH03 = h0(i9);
            this.k = i36 + iH03;
            this.l = i37 + iH03;
            this.m = i38;
        } else {
            Q();
        }
        this.T = j3;
        this.F = z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I() throws Throwable {
        int i;
        M(this.G.g);
        qx qxVar = this.M;
        qxVar.d(false);
        i11 i11Var = qxVar.d;
        go0 go0Var = qxVar.a;
        pr2 pr2Var = go0Var.G;
        if (pr2Var.c > 0 && i11Var.a(-2) != (i = pr2Var.i)) {
            if (!qxVar.c && qxVar.e) {
                qxVar.d(false);
                qxVar.b.t.X(pu1.c);
                qxVar.c = true;
            }
            if (i > 0) {
                ao0 ao0VarA = pr2Var.a(i);
                i11Var.c(i);
                qxVar.d(false);
                kv1 kv1Var = qxVar.b.t;
                kv1Var.X(ou1.c);
                rg3.M(kv1Var, 0, ao0VarA);
                qxVar.c = true;
            }
        }
        qxVar.b.t.X(xu1.c);
        int i2 = qxVar.f;
        pr2 pr2Var2 = go0Var.G;
        qxVar.f = pr2Var2.b[(pr2Var2.g * 5) + 3] + i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J(yy1 yy1Var) {
        zj1 zj1Var = this.v;
        if (zj1Var == null) {
            zj1Var = new zj1();
            this.v = zj1Var;
        }
        zj1Var.h(this.G.g, yy1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(int i, int i2, int i3) {
        pr2 pr2Var = this.G;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (pr2Var.q(i) == i2) {
                    i3 = i2;
                } else if (pr2Var.q(i2) == i) {
                    i3 = i;
                } else if (pr2Var.q(i) == pr2Var.q(i2)) {
                    i3 = pr2Var.q(i);
                } else {
                    int iQ = i;
                    int i4 = 0;
                    while (iQ > 0 && iQ != i3) {
                        iQ = pr2Var.q(iQ);
                        i4++;
                    }
                    int iQ2 = i2;
                    int i5 = 0;
                    while (iQ2 > 0 && iQ2 != i3) {
                        iQ2 = pr2Var.q(iQ2);
                        i5++;
                    }
                    int i6 = i4 - i5;
                    int iQ3 = i;
                    for (int i7 = 0; i7 < i6; i7++) {
                        iQ3 = pr2Var.q(iQ3);
                    }
                    int i8 = i5 - i4;
                    int iQ4 = i2;
                    for (int i9 = 0; i9 < i8; i9++) {
                        iQ4 = pr2Var.q(iQ4);
                    }
                    i3 = iQ3;
                    for (int iQ5 = iQ4; i3 != iQ5; iQ5 = pr2Var.q(iQ5)) {
                        i3 = pr2Var.q(i3);
                    }
                }
            }
        }
        while (i > 0 && i != i3) {
            if (pr2Var.l(i)) {
                this.M.a();
            }
            i = pr2Var.q(i);
        }
        o(i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object L() {
        boolean z = this.S;
        eb ebVar = nx.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof ba2)) {
                return objM instanceof lo0 ? ((lo0) objM).a : objM;
            }
        } else if (this.r) {
            tx.a("A call to createNode(), emitNode() or useNode() expected");
            return ebVar;
        }
        return ebVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M(int i) throws Throwable {
        boolean zL = this.G.l(i);
        qx qxVar = this.M;
        if (zL) {
            qxVar.c();
            Object objN = this.G.n(i);
            qxVar.c();
            qxVar.h.add(objN);
        }
        N(this, i, zL, 0);
        qxVar.c();
        if (zL) {
            qxVar.a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean O(int i, boolean z) {
        b62 b62VarX;
        if ((i & 1) == 0 && (this.S || this.y)) {
            sq2 sq2Var = this.P;
            if (sq2Var != null && (b62VarX = x()) != null && sq2Var.a()) {
                int i2 = b62VarX.b;
                if ((i2 & AIChatConfig.DefaultMaxTokens) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                b62VarX.b = i3;
                b62VarX.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                kv1 kv1Var = this.M.b.t;
                kv1Var.X(wu1.c);
                rg3.M(kv1Var, 0, b62VarX);
                this.b.q(b62VarX);
                return false;
            }
        } else if (!z && A()) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P() {
        long jRotateLeft;
        if (this.s.isEmpty()) {
            this.l = this.G.s() + this.l;
            return;
        }
        pr2 pr2Var = this.G;
        int iG = pr2Var.g();
        int[] iArr = pr2Var.b;
        int i = pr2Var.g;
        Object objP = i < pr2Var.h ? pr2Var.p(iArr, i) : null;
        Object objF = pr2Var.f();
        int i2 = this.m;
        eb ebVar = nx.a;
        if (objP != null) {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode())), 3);
        } else {
            if (objF != null && iG == 207 && !objF.equals(ebVar)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) objF.hashCode()), 3) ^ ((long) i2);
                V(null, (iArr[(pr2Var.g * 5) + 1] & 1073741824) != 0);
                H();
                pr2Var.e();
                if (objP == null) {
                    if (objP instanceof Enum) {
                        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                        return;
                    } else {
                        this.T = Long.rotateRight(Long.rotateRight(this.T, 3) ^ ((long) objP.hashCode()), 3);
                        return;
                    }
                }
                if (objF == null || iG != 207 || objF.equals(ebVar)) {
                    this.T = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.T ^ ((long) i2), 3), 3);
                    return;
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i2), 3) ^ ((long) objF.hashCode()), 3);
                    return;
                }
            }
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) iG), 3) ^ ((long) i2);
        }
        this.T = jRotateLeft;
        V(null, (iArr[(pr2Var.g * 5) + 1] & 1073741824) != 0);
        H();
        pr2Var.e();
        if (objP == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Q() {
        pr2 pr2Var = this.G;
        int i = pr2Var.i;
        this.l = i >= 0 ? pr2Var.b[(i * 5) + 1] & 67108863 : 0;
        pr2Var.t();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R() {
        if (this.l != 0) {
            tx.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        b62 b62VarX = x();
        if (b62VarX != null) {
            int i = b62VarX.b;
            if ((i & 128) == 0) {
                b62VarX.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            Q();
        } else {
            H();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(int i, int i2, Object obj, Object obj2) {
        long jRotateLeft;
        boolean z;
        ko0 ko0Var;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        Object obj3 = obj;
        if (this.r) {
            tx.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i9 = this.m;
        Object obj4 = nx.a;
        if (obj3 != null) {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode())), 3);
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(obj4)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i9);
                if (obj3 == null) {
                    this.m++;
                }
                boolean z3 = i2 == 0;
                if (!this.S) {
                    this.G.k++;
                    tr2 tr2Var = this.I;
                    int i10 = tr2Var.t;
                    if (z3) {
                        tr2Var.Q(i, obj4, obj4, true);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        tr2Var.Q(i, obj3, obj2, false);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        tr2Var.Q(i, obj3, obj4, false);
                    }
                    ko0 ko0Var2 = this.j;
                    if (ko0Var2 != null) {
                        int i11 = (-2) - i10;
                        e51 e51Var = new e51(i, i11, -1, -1);
                        ko0Var2.e.h(i11, new br0(-1, this.k - ko0Var2.b, 0));
                        ko0Var2.d.add(e51Var);
                    }
                    u(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.y;
                if (this.j == null) {
                    int iG = this.G.g();
                    if (!z4 && iG == i) {
                        pr2 pr2Var = this.G;
                        int i12 = pr2Var.g;
                        if (t11.l(obj3, i12 < pr2Var.h ? pr2Var.p(pr2Var.b, i12) : null)) {
                            V(obj2, z3);
                            z = z4;
                        }
                    }
                    pr2 pr2Var2 = this.G;
                    int[] iArr = pr2Var2.b;
                    ArrayList arrayList = new ArrayList();
                    if (pr2Var2.k <= 0) {
                        int i13 = pr2Var2.g;
                        while (i13 < pr2Var2.h) {
                            int i14 = i13 * 5;
                            int i15 = iArr[i14];
                            Object objP = pr2Var2.p(iArr, i13);
                            int i16 = iArr[i14 + 1];
                            if ((i16 & 1073741824) != 0) {
                                z2 = z4;
                                i8 = 1;
                            } else {
                                z2 = z4;
                                i8 = i16 & 67108863;
                            }
                            arrayList.add(new e51(i15, i13, i8, objP));
                            i13 += iArr[i14 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.j = new ko0(this.k, arrayList);
                } else {
                    z = z4;
                }
                ko0 ko0Var3 = this.j;
                if (ko0Var3 != null) {
                    ArrayList arrayList2 = ko0Var3.d;
                    zj1 zj1Var = ko0Var3.e;
                    int i17 = ko0Var3.b;
                    Object s21Var = obj3 != null ? new s21(Integer.valueOf(i), obj3) : Integer.valueOf(i);
                    rk1 rk1Var = ((rj1) ko0Var3.f.getValue()).a;
                    Object objG = rk1Var.g(s21Var);
                    if (objG == null) {
                        objG = null;
                    } else if (objG instanceof lk1) {
                        lk1 lk1Var = (lk1) objG;
                        Object objK = lk1Var.k(0);
                        if (lk1Var.h()) {
                            rk1Var.k(s21Var);
                        }
                        if (lk1Var.b == 1) {
                            rk1Var.m(s21Var, lk1Var.e());
                        }
                        objG = objK;
                    } else {
                        rk1Var.k(s21Var);
                    }
                    e51 e51Var2 = (e51) objG;
                    if (z || e51Var2 == null) {
                        this.G.k++;
                        this.S = true;
                        this.K = null;
                        if (this.I.w) {
                            tr2 tr2VarD = this.H.d();
                            this.I = tr2VarD;
                            tr2VarD.M();
                            this.J = false;
                            this.K = null;
                        }
                        this.I.d();
                        tr2 tr2Var2 = this.I;
                        int i18 = tr2Var2.t;
                        if (z3) {
                            tr2Var2.Q(i, obj4, obj4, true);
                            i3 = 0;
                        } else if (obj2 != null) {
                            if (obj != null) {
                                obj4 = obj;
                            }
                            i3 = 0;
                            tr2Var2.Q(i, obj4, obj2, false);
                        } else {
                            i3 = 0;
                            tr2Var2.Q(i, obj == null ? obj4 : obj, obj4, false);
                        }
                        this.N = this.I.b(i18);
                        int i19 = (-2) - i18;
                        e51 e51Var3 = new e51(i, i19, -1, -1);
                        zj1Var.h(i19, new br0(-1, this.k - i17, i3));
                        arrayList2.add(e51Var3);
                        ko0Var = new ko0(z3 ? i3 : this.k, new ArrayList());
                    } else {
                        int i20 = e51Var2.c;
                        arrayList2.add(e51Var2);
                        br0 br0Var = (br0) zj1Var.b(i20);
                        this.k = (br0Var != null ? br0Var.b : -1) + i17;
                        br0 br0Var2 = (br0) zj1Var.b(i20);
                        int i21 = br0Var2 != null ? br0Var2.a : -1;
                        int i22 = ko0Var3.c;
                        int i23 = i21 - i22;
                        int i24 = 8;
                        if (i21 > i22) {
                            Object[] objArr3 = zj1Var.c;
                            long[] jArr = zj1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) < 128) {
                                                i7 = i24;
                                                br0 br0Var3 = (br0) objArr3[(i25 << 3) + i27];
                                                i6 = i23;
                                                int i28 = br0Var3.a;
                                                if (i28 == i21) {
                                                    br0Var3.a = i22;
                                                } else if (i22 <= i28 && i28 < i21) {
                                                    br0Var3.a = i28 + 1;
                                                }
                                            } else {
                                                i6 = i23;
                                                i7 = i24;
                                            }
                                            j >>= i7;
                                            i27++;
                                            i23 = i6;
                                            i24 = i7;
                                        }
                                        i4 = i23;
                                        if (i26 != i24) {
                                            break;
                                        }
                                    } else {
                                        i4 = i23;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    i23 = i4;
                                    i24 = 8;
                                }
                            } else {
                                i4 = i23;
                            }
                        } else {
                            i4 = i23;
                            if (i22 > i21) {
                                Object[] objArr4 = zj1Var.c;
                                long[] jArr2 = zj1Var.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j2 = jArr2[i29];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j2 & 255) >= 128) {
                                                    objArr2 = objArr4;
                                                } else {
                                                    br0 br0Var4 = (br0) objArr4[(i29 << 3) + i31];
                                                    int i32 = br0Var4.a;
                                                    if (i32 == i21) {
                                                        br0Var4.a = i22;
                                                        objArr2 = objArr4;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i21 + 1 <= i32 && i32 < i22) {
                                                            br0Var4.a = i32 - 1;
                                                        }
                                                    }
                                                }
                                                j2 >>= 8;
                                                i31++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i30 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        qx qxVar = this.M;
                        int i33 = qxVar.f;
                        go0 go0Var = qxVar.a;
                        qxVar.f = (i20 - go0Var.G.g) + i33;
                        this.G.r(i20);
                        if (i4 > 0) {
                            qxVar.d(false);
                            i11 i11Var = qxVar.d;
                            pr2 pr2Var3 = go0Var.G;
                            if (pr2Var3.c > 0 && i11Var.a(-2) != (i5 = pr2Var3.i)) {
                                if (!qxVar.c && qxVar.e) {
                                    qxVar.d(false);
                                    qxVar.b.t.X(pu1.c);
                                    qxVar.c = true;
                                }
                                if (i5 > 0) {
                                    ao0 ao0VarA = pr2Var3.a(i5);
                                    i11Var.c(i5);
                                    qxVar.d(false);
                                    kv1 kv1Var = qxVar.b.t;
                                    kv1Var.X(ou1.c);
                                    rg3.M(kv1Var, 0, ao0VarA);
                                    qxVar.c = true;
                                }
                            }
                            kv1 kv1Var2 = qxVar.b.t;
                            kv1Var2.X(tu1.c);
                            kv1Var2.o[kv1Var2.p - kv1Var2.m[kv1Var2.n - 1].a] = i4;
                        }
                        V(obj2, z3);
                        ko0Var = null;
                    }
                } else {
                    ko0Var = null;
                }
                u(z3, ko0Var);
                return;
            }
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) i9);
        }
        this.T = jRotateLeft;
        if (obj3 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.S) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void T() {
        S(-127, 0, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void U(int i, yt1 yt1Var) {
        S(i, 0, yt1Var, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V(Object obj, boolean z) {
        if (z) {
            pr2 pr2Var = this.G;
            if (pr2Var.k <= 0) {
                if ((pr2Var.b[(pr2Var.g * 5) + 1] & 1073741824) == 0) {
                    j22.a("Expected a node group");
                }
                pr2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            qx qxVar = this.M;
            qxVar.getClass();
            qxVar.d(false);
            kv1 kv1Var = qxVar.b.t;
            kv1Var.X(ev1.c);
            rg3.M(kv1Var, 0, obj);
        }
        this.G.u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            S(i, 0, null, null);
            return;
        }
        if (this.r) {
            tx.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        pr2 pr2Var = this.G;
        boolean z = this.S;
        eb ebVar = nx.a;
        if (z) {
            pr2Var.k++;
            this.I.Q(i, ebVar, ebVar, false);
            u(false, null);
            return;
        }
        if (pr2Var.g() == i && ((i3 = pr2Var.g) >= pr2Var.h || (pr2Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            pr2Var.u();
            u(false, null);
            return;
        }
        if (pr2Var.k <= 0 && (i2 = pr2Var.g) != pr2Var.h) {
            int i4 = this.k;
            I();
            this.M.e(i4, pr2Var.s());
            p7.i(this.s, i2, pr2Var.g);
        }
        pr2Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            tr2 tr2VarD = this.H.d();
            this.I = tr2VarD;
            tr2VarD.M();
            this.J = false;
            this.K = null;
        }
        tr2 tr2Var = this.I;
        tr2Var.d();
        int i5 = tr2Var.t;
        tr2Var.Q(i, ebVar, ebVar, false);
        this.N = tr2Var.b(i5);
        u(false, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final go0 X(int i) {
        b62 b62Var;
        boolean z;
        W(i);
        boolean z2 = this.S;
        n4 n4Var = this.g;
        ArrayList arrayList = this.E;
        fy fyVar = this.h;
        if (z2) {
            b62 b62Var2 = new b62(fyVar);
            arrayList.add(b62Var2);
            g0(b62Var2);
            b62Var2.e = this.B;
            b62Var2.b &= -17;
            n4Var.m();
            return this;
        }
        int i2 = this.G.i;
        ArrayList arrayList2 = this.s;
        int iQ = p7.q(i2, arrayList2);
        b21 b21Var = iQ >= 0 ? (b21) arrayList2.remove(iQ) : null;
        Object objM = this.G.m();
        if (t11.l(objM, nx.a)) {
            b62Var = new b62(fyVar);
            g0(b62Var);
        } else {
            objM.getClass();
            b62Var = (b62) objM;
        }
        if (b21Var == null) {
            int i3 = b62Var.b;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                b62Var.b = i3 & (-65);
            }
            z = z3;
        }
        int i4 = b62Var.b;
        b62Var.b = z ? i4 | 8 : i4 & (-9);
        arrayList.add(b62Var);
        b62Var.e = this.B;
        b62Var.b &= -17;
        n4Var.m();
        int i5 = b62Var.b;
        if ((i5 & 256) != 0) {
            b62Var.b = (i5 & (-257)) | AIChatConfig.DefaultMaxTokens;
            kv1 kv1Var = this.M.b.t;
            kv1Var.X(cv1.c);
            rg3.M(kv1Var, 0, b62Var);
            if (!this.y) {
                int i6 = b62Var.b;
                if ((i6 & 128) != 0) {
                    this.y = true;
                    this.z = this.G.i;
                    b62Var.b = i6 | 1024;
                }
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Y(Object obj) {
        if (!this.S && this.G.g() == 207 && !t11.l(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        S(207, 0, null, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Z() {
        S(125, 2, null, null);
        this.r = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        lj0 lj0Var = this.O;
        lj0Var.n.U();
        lj0Var.m.U();
        this.T = 0L;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        pr2 pr2Var = this.G;
        if (!pr2Var.f) {
            pr2Var.c();
        }
        if (this.I.w) {
            return;
        }
        v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a0() {
        this.m = 0;
        this.G = this.c.c();
        S(100, 0, null, null);
        yx yxVar = this.b;
        yxVar.t();
        yy1 yy1VarI = yxVar.i();
        this.x.c(this.w ? 1 : 0);
        this.w = f(yy1VarI);
        this.K = null;
        if (!this.q) {
            this.q = yxVar.e();
        }
        if (!this.C) {
            this.C = yxVar.f();
        }
        if (this.C) {
            tu2 tu2Var = ey.a;
            tu2Var.getClass();
            yy1VarI = yy1VarI.d(tu2Var, new uu2(z()));
        }
        this.u = yy1VarI;
        Set set = (Set) op0.w(yy1VarI, k01.a);
        if (set != null) {
            set.add(w());
            yxVar.o(set);
        }
        S(Long.hashCode(yxVar.g()), 0, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(mn0 mn0Var, Object obj) {
        if (this.S) {
            kv1 kv1Var = this.O.m;
            kv1Var.X(fv1.c);
            rg3.M(kv1Var, 0, obj);
            mn0Var.getClass();
            xe1.f(2, mn0Var);
            rg3.M(kv1Var, 1, mn0Var);
            return;
        }
        qx qxVar = this.M;
        qxVar.b();
        kv1 kv1Var2 = qxVar.b.t;
        kv1Var2.X(fv1.c);
        mn0Var.getClass();
        xe1.f(2, mn0Var);
        rg3.N(kv1Var2, 0, obj, 1, mn0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b0(b62 b62Var, Object obj) {
        ao0 ao0Var = b62Var.c;
        if (ao0Var == null) {
            return false;
        }
        int iA = this.G.a.a(up0.e(ao0Var));
        if (!this.F || iA < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iQ = p7.q(iA, arrayList);
        if (iQ < 0) {
            int i = -(iQ + 1);
            if (!(obj instanceof n70)) {
                obj = null;
            }
            arrayList.add(i, new b21(b62Var, iA, obj));
            return true;
        }
        b21 b21Var = (b21) arrayList.get(iQ);
        if (!(obj instanceof n70)) {
            b21Var.c = null;
            return true;
        }
        Object obj2 = b21Var.c;
        if (obj2 == null) {
            b21Var.c = obj;
            return true;
        }
        if (obj2 instanceof sk1) {
            ((sk1) obj2).a(obj);
            return true;
        }
        sk1 sk1Var = fd2.a;
        sk1 sk1Var2 = new sk1(2);
        sk1Var2.k(obj2);
        sk1Var2.k(obj);
        b21Var.c = sk1Var2;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(float f) {
        Object objD = D();
        if ((objD instanceof Float) && f == ((Number) objD).floatValue()) {
            return false;
        }
        g0(Float.valueOf(f));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(rk1 rk1Var) {
        ArrayList arrayList = this.s;
        for (int iL = eu.L(arrayList); -1 < iL; iL--) {
            b21 b21Var = (b21) arrayList.get(iL);
            ao0 ao0Var = b21Var.a.c;
            ao0 ao0VarE = ao0Var != null ? up0.e(ao0Var) : null;
            if (ao0VarE == null || !ao0VarE.a()) {
                arrayList.remove(iL);
            } else {
                int i = b21Var.b;
                int i2 = ao0VarE.a;
                if (i != i2) {
                    b21Var.b = i2;
                }
            }
        }
        Object[] objArr = rk1Var.b;
        Object[] objArr2 = rk1Var.c;
        long[] jArr = rk1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            b62 b62Var = (b62) obj;
                            ao0 ao0Var2 = b62Var.c;
                            if (ao0Var2 != null) {
                                int i7 = up0.e(ao0Var2).a;
                                if (obj2 == gd3.E) {
                                    obj2 = null;
                                }
                                arrayList.add(new b21(b62Var, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        hu.f0(arrayList, p7.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(int i) {
        Object objD = D();
        if ((objD instanceof Integer) && i == ((Number) objD).intValue()) {
            return false;
        }
        g0(Integer.valueOf(i));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d0(int i, int i2) {
        if (h0(i) != i2) {
            if (i < 0) {
                xj1 xj1Var = this.p;
                if (xj1Var == null) {
                    xj1Var = new xj1();
                    this.p = xj1Var;
                }
                xj1Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                int i3 = this.G.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e(long j) {
        Object objD = D();
        if ((objD instanceof Long) && j == ((Number) objD).longValue()) {
            return false;
        }
        g0(Long.valueOf(j));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e0(int i, int i2) {
        int iH0 = h0(i);
        if (iH0 != i2) {
            int i3 = i2 - iH0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iH02 = h0(i) + i3;
                d0(i, iH02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        ko0 ko0Var = (ko0) arrayList.get(i4);
                        if (ko0Var != null && ko0Var.a(i, iH02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                pr2 pr2Var = this.G;
                if (i < 0) {
                    i = pr2Var.i;
                } else if (pr2Var.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f(Object obj) {
        if (t11.l(D(), obj)) {
            return false;
        }
        g0(obj);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f0(Object obj) {
        if (obj instanceof a82) {
            lo0 lo0Var = new lo0((a82) obj, this.m - 1);
            if (this.S) {
                kv1 kv1Var = this.M.b.t;
                kv1Var.X(vu1.c);
                rg3.M(kv1Var, 0, lo0Var);
            }
            this.d.add(obj);
            obj = lo0Var;
        }
        g0(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g(boolean z) {
        Object objD = D();
        if ((objD instanceof Boolean) && z == ((Boolean) objD).booleanValue()) {
            return false;
        }
        g0(Boolean.valueOf(z));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g0(Object obj) {
        if (this.S) {
            tr2 tr2Var = this.I;
            if (tr2Var.n <= 0 || tr2Var.i == tr2Var.k) {
                tr2Var.F(obj);
                return;
            }
            zj1 zj1Var = tr2Var.s;
            if (zj1Var == null) {
                zj1Var = new zj1();
            }
            tr2Var.s = zj1Var;
            int i = tr2Var.v;
            Object objB = zj1Var.b(i);
            if (objB == null) {
                objB = new lk1();
                zj1Var.h(i, objB);
            }
            ((lk1) objB).a(obj);
            return;
        }
        pr2 pr2Var = this.G;
        boolean z = pr2Var.n;
        qx qxVar = this.M;
        if (!z) {
            ao0 ao0VarA = pr2Var.a(pr2Var.i);
            kv1 kv1Var = qxVar.b.t;
            kv1Var.X(du1.c);
            rg3.N(kv1Var, 0, ao0VarA, 1, obj);
            return;
        }
        int iB = (pr2Var.l - sr2.b(pr2Var.b, pr2Var.i)) - 1;
        if (qxVar.a.G.i - qxVar.f >= 0) {
            qxVar.d(true);
            kv1 kv1Var2 = qxVar.b.t;
            kv1Var2.X(qu1.g);
            rg3.M(kv1Var2, 0, obj);
            kv1Var2.o[kv1Var2.p - kv1Var2.m[kv1Var2.n - 1].a] = iB;
            return;
        }
        pr2 pr2Var2 = this.G;
        ao0 ao0VarA2 = pr2Var2.a(pr2Var2.i);
        kv1 kv1Var3 = qxVar.b.t;
        kv1Var3.X(qu1.f);
        rg3.N(kv1Var3, 0, obj, 1, ao0VarA2);
        kv1Var3.o[kv1Var3.p - kv1Var3.m[kv1Var3.n - 1].a] = iB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h(Object obj) {
        if (D() == obj) {
            return false;
        }
        g0(obj);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int h0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        xj1 xj1Var = this.p;
        if (xj1Var != null && xj1Var.c(i) >= 0) {
            int iC = xj1Var.c(i);
            if (iC >= 0) {
                return xj1Var.c[iC];
            }
            um2.i(vi0.g("Cannot find value for key ", i));
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        qx qxVar = this.M;
        qxVar.c = false;
        qxVar.d.b = 0;
        qxVar.f = 0;
        qxVar.e = true;
        qxVar.g = 0;
        qxVar.h.clear();
        qxVar.i = -1;
        qxVar.j = -1;
        qxVar.k = -1;
        qxVar.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i0() {
        if (!this.r) {
            tx.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            tx.a("useNode() called while inserting");
        }
        pr2 pr2Var = this.G;
        Object objN = pr2Var.n(pr2Var.i);
        qx qxVar = this.M;
        qxVar.c();
        qxVar.h.add(objN);
        if (this.y && (objN instanceof uw)) {
            qxVar.b();
            qxVar.b.t.X(hv1.c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object j(e42 e42Var) {
        return op0.w(l(), e42Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(xm0 xm0Var) {
        if (!this.r) {
            tx.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            tx.a("createNode() can only be called when inserting");
        }
        i11 i11Var = this.n;
        int i = i11Var.a[i11Var.b - 1];
        tr2 tr2Var = this.I;
        ao0 ao0VarB = tr2Var.b(tr2Var.v);
        this.l++;
        lj0 lj0Var = this.O;
        kv1 kv1Var = lj0Var.m;
        kv1Var.X(qu1.d);
        rg3.M(kv1Var, 0, xm0Var);
        kv1Var.o[kv1Var.p - kv1Var.m[kv1Var.n - 1].a] = i;
        rg3.M(kv1Var, 1, ao0VarB);
        kv1 kv1Var2 = lj0Var.n;
        kv1Var2.X(qu1.e);
        kv1Var2.o[kv1Var2.p - kv1Var2.m[kv1Var2.n - 1].a] = i;
        rg3.M(kv1Var2, 0, ao0VarB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final yy1 l() {
        yy1 yy1Var;
        yy1 yy1Var2 = this.K;
        if (yy1Var2 != null) {
            return yy1Var2;
        }
        int iQ = this.G.i;
        boolean z = this.S;
        yt1 yt1Var = tx.c;
        if (z && this.J) {
            int iE = this.I.v;
            while (iE > 0) {
                if (this.I.s(iE) == 202 && t11.l(this.I.t(iE), yt1Var)) {
                    Object objQ = this.I.q(iE);
                    objQ.getClass();
                    yy1 yy1Var3 = (yy1) objQ;
                    this.K = yy1Var3;
                    return yy1Var3;
                }
                tr2 tr2Var = this.I;
                iE = tr2Var.E(tr2Var.b, iE);
            }
        }
        if (this.G.c > 0) {
            while (iQ > 0) {
                if (this.G.i(iQ) == 202) {
                    pr2 pr2Var = this.G;
                    if (t11.l(pr2Var.p(pr2Var.b, iQ), yt1Var)) {
                        zj1 zj1Var = this.v;
                        if (zj1Var == null || (yy1Var = (yy1) zj1Var.b(iQ)) == null) {
                            pr2 pr2Var2 = this.G;
                            Object objB = pr2Var2.b(pr2Var2.b, iQ);
                            objB.getClass();
                            yy1Var = (yy1) objB;
                        }
                        this.K = yy1Var;
                        return yy1Var;
                    }
                }
                iQ = this.G.q(iQ);
            }
        }
        yy1 yy1Var4 = this.u;
        this.K = yy1Var4;
        return yy1Var4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ex m() {
        Collection collection;
        if (!this.b.k()) {
            return null;
        }
        pb1 pb1VarE = eu.E();
        tr2 tr2Var = this.I;
        pb1VarE.addAll(p7.l(tr2Var, null, tr2Var.t, null));
        pr2 pr2Var = this.G;
        boolean z = pr2Var.f;
        int[] iArr = pr2Var.b;
        if (z || pr2Var.c == 0) {
            collection = be0.h;
        } else {
            j52 j52Var = new j52(pr2Var);
            int iQ = pr2Var.i;
            Object objValueOf = Integer.valueOf(pr2Var.l - sr2.b(iArr, iQ));
            while (iQ >= 0) {
                j52Var.h(pr2Var.i(iQ), pr2Var.k(iQ) ? pr2Var.p(iArr, iQ) : nx.a, pr2Var.a.f(iQ), objValueOf);
                objValueOf = pr2Var.a(iQ);
                iQ = pr2Var.q(iQ);
            }
            collection = (ArrayList) j52Var.h;
        }
        pb1VarE.addAll(collection);
        pb1VarE.addAll(E());
        return new ex(eu.z(pb1VarE), this.C);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void n(rk1 rk1Var, mn0 mn0Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            tx.a("Reentrant composition is not supported");
        }
        this.g.m();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(ds2.j().g());
            this.v = null;
            c0(rk1Var);
            this.k = 0;
            this.F = true;
            try {
                a0();
                Object objD = D();
                if (objD != mn0Var && mn0Var != null) {
                    g0(mn0Var);
                }
                fo0 fo0Var = this.D;
                zk1 zk1VarL = op0.l();
                try {
                    zk1VarL.b(fo0Var);
                    yt1 yt1Var = tx.a;
                    if (mn0Var != null) {
                        U(200, yt1Var);
                        rg3.F(this, mn0Var);
                        p(false);
                    } else if (!this.w || objD == null || objD.equals(nx.a)) {
                        P();
                    } else {
                        U(200, yt1Var);
                        xe1.f(2, objD);
                        rg3.F(this, (mn0) objD);
                        p(false);
                    }
                    zk1VarL.k(zk1VarL.j - 1);
                    t();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        tx.a("Check failed");
                    }
                    v();
                } catch (Throwable th) {
                    zk1VarL.k(zk1VarL.j - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        o(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            qx qxVar = this.M;
            qxVar.c();
            qxVar.h.add(objN);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r42v0, resolved type: go0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x050c  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(boolean z) {
        long jRotateRight;
        i11 i11Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        i11 i11Var2;
        int i7;
        int i8;
        ArrayList arrayList2;
        sk1 sk1Var;
        int i9;
        int i10;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i11;
        ko0 ko0Var;
        int i12;
        Object[] objArr;
        long[] jArr;
        int i13;
        Object[] objArr2;
        long[] jArr2;
        int i14;
        Object[] objArr3;
        long[] jArr3;
        int i15;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        i11 i11Var3 = this.n;
        int i16 = i11Var3.a[i11Var3.b - 2] - 1;
        boolean z2 = this.S;
        eb ebVar = nx.a;
        if (z2) {
            tr2 tr2Var = this.I;
            int i17 = tr2Var.v;
            int iS = tr2Var.s(i17);
            Object objT = this.I.t(i17);
            Object objQ = this.I.q(i17);
            if (objT != null) {
                jRotateRight2 = Long.rotateRight(this.T, 3) ^ ((long) (objT instanceof Enum ? ((Enum) objT).ordinal() : objT.hashCode()));
            } else if (objQ == null || iS != 207 || objQ.equals(ebVar)) {
                jRotateRight2 = Long.rotateRight(this.T ^ ((long) i16), 3) ^ ((long) iS);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i16), 3) ^ ((long) objQ.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight2, 3);
        } else {
            pr2 pr2Var = this.G;
            int i18 = pr2Var.i;
            int i19 = pr2Var.i(i18);
            pr2 pr2Var2 = this.G;
            Object objP = pr2Var2.p(pr2Var2.b, i18);
            pr2 pr2Var3 = this.G;
            Object objB = pr2Var3.b(pr2Var3.b, i18);
            if (objP != null) {
                jRotateRight = Long.rotateRight(this.T, 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode()));
            } else if (objB == null || i19 != 207 || objB.equals(ebVar)) {
                jRotateRight = Long.rotateRight(this.T ^ ((long) i16), 3) ^ ((long) i19);
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ ((long) i16), 3) ^ ((long) objB.hashCode()), 3);
            }
            this.T = Long.rotateRight(jRotateRight, 3);
        }
        int i20 = this.l;
        ko0 ko0Var2 = this.j;
        ArrayList arrayList5 = this.s;
        qx qxVar = this.M;
        if (ko0Var2 != null) {
            zj1 zj1Var = ko0Var2.e;
            int i21 = ko0Var2.b;
            ArrayList arrayList6 = ko0Var2.a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = ko0Var2.d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i22 = 0; i22 < size; i22++) {
                    hashSet2.add(arrayList7.get(i22));
                }
                i = -1;
                sk1 sk1Var2 = fd2.a;
                sk1 sk1Var3 = new sk1();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (i23 < size3) {
                    e51 e51Var = (e51) arrayList6.get(i23);
                    if (hashSet2.contains(e51Var)) {
                        i11Var2 = i11Var3;
                        i7 = i23;
                        if (!sk1Var3.c(e51Var)) {
                            int i26 = i24;
                            if (i26 < size2) {
                                e51 e51Var2 = (e51) arrayList7.get(i26);
                                if (e51Var2 != e51Var) {
                                    br0 br0Var = (br0) zj1Var.b(e51Var2.c);
                                    int i27 = br0Var != null ? br0Var.b : -1;
                                    sk1Var3.a(e51Var2);
                                    i8 = i26;
                                    i11 = i25;
                                    ko0Var = ko0Var2;
                                    if (i27 != i11) {
                                        br0 br0Var2 = (br0) zj1Var.b(e51Var2.c);
                                        int i28 = br0Var2 != null ? br0Var2.c : e51Var2.d;
                                        sk1Var = sk1Var3;
                                        int i29 = i27 + i21;
                                        i9 = size2;
                                        int i30 = i11 + i21;
                                        if (i28 > 0) {
                                            i10 = i21;
                                            int i31 = qxVar.l;
                                            if (i31 > 0) {
                                                arrayList3 = arrayList6;
                                                if (qxVar.j == i29 - i31 && qxVar.k == i30 - i31) {
                                                    qxVar.l = i31 + i28;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            qxVar.c();
                                            qxVar.j = i29;
                                            qxVar.k = i30;
                                            qxVar.l = i28;
                                        } else {
                                            i10 = i21;
                                            arrayList3 = arrayList6;
                                            qxVar.getClass();
                                        }
                                        if (i27 > i11) {
                                            Object[] objArr5 = zj1Var.c;
                                            long[] jArr5 = zj1Var.a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i32 = 0;
                                                while (true) {
                                                    long j = jArr5[i32];
                                                    int i33 = i28;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i34 = 8 - ((~(i32 - length)) >>> 31);
                                                        int i35 = 0;
                                                        while (i35 < i34) {
                                                            if ((j & 255) < 128) {
                                                                i15 = i35;
                                                                br0 br0Var3 = (br0) objArr5[(i32 << 3) + i35];
                                                                objArr4 = objArr5;
                                                                int i36 = br0Var3.b;
                                                                jArr4 = jArr5;
                                                                if (i27 <= i36 && i36 < i27 + i33) {
                                                                    br0Var3.b = (i36 - i27) + i11;
                                                                } else if (i11 <= i36 && i36 < i27) {
                                                                    br0Var3.b = i36 + i33;
                                                                }
                                                            } else {
                                                                i15 = i35;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i35 = i15 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i34 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i32 == length) {
                                                        break;
                                                    }
                                                    i32++;
                                                    arrayList5 = arrayList2;
                                                    i28 = i33;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i37 = i28;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i11 > i27) {
                                                Object[] objArr6 = zj1Var.c;
                                                long[] jArr6 = zj1Var.a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i38 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i38];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i39 = 8 - ((~(i38 - length2)) >>> 31);
                                                            int i40 = 0;
                                                            while (i40 < i39) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    br0 br0Var4 = (br0) objArr6[(i38 << 3) + i40];
                                                                    jArr2 = jArr6;
                                                                    int i41 = br0Var4.b;
                                                                    i14 = i27;
                                                                    if (i27 <= i41 && i41 < i14 + i37) {
                                                                        br0Var4.b = (i41 - i14) + i11;
                                                                    } else if (i14 + 1 <= i41 && i41 < i11) {
                                                                        br0Var4.b = i41 - i37;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i14 = i27;
                                                                }
                                                                j2 >>= 8;
                                                                i40++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i27 = i14;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i13 = i27;
                                                            if (i39 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i13 = i27;
                                                        }
                                                        if (i38 == length2) {
                                                            break;
                                                        }
                                                        i38++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i27 = i13;
                                                    }
                                                }
                                            }
                                        }
                                        i12 = i7;
                                    } else {
                                        arrayList2 = arrayList5;
                                        sk1Var = sk1Var3;
                                        i9 = size2;
                                        i10 = i21;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i12 = i7;
                                } else {
                                    i8 = i26;
                                    arrayList2 = arrayList5;
                                    sk1Var = sk1Var3;
                                    i9 = size2;
                                    i10 = i21;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i11 = i25;
                                    ko0Var = ko0Var2;
                                    i12 = i7 + 1;
                                }
                                i24 = i8 + 1;
                                br0 br0Var5 = (br0) zj1Var.b(e51Var2.c);
                                int i42 = i11 + (br0Var5 != null ? br0Var5.c : e51Var2.d);
                                i23 = i12;
                                ko0Var2 = ko0Var;
                                sk1Var3 = sk1Var;
                                size2 = i9;
                                i21 = i10;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i25 = i42;
                                i11Var3 = i11Var2;
                            } else {
                                i24 = i26;
                                i11Var3 = i11Var2;
                                i23 = i7;
                            }
                        }
                    } else {
                        i11Var2 = i11Var3;
                        br0 br0Var6 = (br0) zj1Var.b(e51Var.c);
                        int i43 = br0Var6 != null ? br0Var6.b : -1;
                        int i44 = e51Var.c;
                        i7 = i23;
                        qxVar.e(i43 + i21, e51Var.d);
                        ko0Var2.a(i44, 0);
                        qxVar.f = (i44 - qxVar.a.G.g) + qxVar.f;
                        this.G.r(i44);
                        I();
                        this.G.s();
                        p7.i(arrayList5, i44, this.G.b[(i44 * 5) + 3] + i44);
                    }
                    i23 = i7 + 1;
                    i11Var3 = i11Var2;
                }
                i11Var = i11Var3;
                arrayList = arrayList5;
                qxVar.c();
                if (arrayList6.size() > 0) {
                    pr2 pr2Var4 = this.G;
                    qxVar.f = (pr2Var4.h - qxVar.a.G.g) + qxVar.f;
                    pr2Var4.t();
                }
            } else {
                i11Var = i11Var3;
                arrayList = arrayList5;
                i = -1;
            }
        }
        boolean z3 = this.S;
        if (!z3) {
            pr2 pr2Var5 = this.G;
            int i45 = pr2Var5.m - pr2Var5.l;
            if (i45 > 0) {
                if (i45 > 0) {
                    qxVar.d(false);
                    i11 i11Var4 = qxVar.d;
                    pr2 pr2Var6 = qxVar.a.G;
                    if (pr2Var6.c > 0 && i11Var4.a(-2) != (i6 = pr2Var6.i)) {
                        if (!qxVar.c && qxVar.e) {
                            qxVar.d(false);
                            qxVar.b.t.X(pu1.c);
                            qxVar.c = true;
                        }
                        if (i6 > 0) {
                            ao0 ao0VarA = pr2Var6.a(i6);
                            i11Var4.c(i6);
                            qxVar.d(false);
                            kv1 kv1Var = qxVar.b.t;
                            kv1Var.X(ou1.c);
                            rg3.M(kv1Var, 0, ao0VarA);
                            qxVar.c = true;
                        }
                    }
                    kv1 kv1Var2 = qxVar.b.t;
                    kv1Var2.X(dv1.c);
                    kv1Var2.o[kv1Var2.p - kv1Var2.m[kv1Var2.n - 1].a] = i45;
                } else {
                    qxVar.getClass();
                }
            }
        }
        int i46 = this.k;
        while (true) {
            pr2 pr2Var7 = this.G;
            if (pr2Var7.k > 0 || (i5 = pr2Var7.g) == pr2Var7.h) {
                break;
            }
            I();
            qxVar.e(i46, this.G.s());
            p7.i(arrayList, i5, this.G.g);
        }
        if (z3) {
            if (z) {
                lj0 lj0Var = this.O;
                kv1 kv1Var3 = lj0Var.n;
                if (kv1Var3.n == 0) {
                    tx.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                kv1 kv1Var4 = lj0Var.m;
                iv1[] iv1VarArr = kv1Var3.m;
                int i47 = kv1Var3.n - 1;
                kv1Var3.n = i47;
                iv1 iv1Var = iv1VarArr[i47];
                iv1VarArr[i47] = null;
                kv1Var4.X(iv1Var);
                Object[] objArr7 = kv1Var3.q;
                Object[] objArr8 = kv1Var4.q;
                int i48 = kv1Var4.r;
                int i49 = iv1Var.b;
                int i50 = kv1Var3.r;
                int i51 = i50 - i49;
                System.arraycopy(objArr7, i51, objArr8, i48 - i49, i50 - i51);
                Object[] objArr9 = kv1Var3.q;
                int i52 = kv1Var3.r;
                Arrays.fill(objArr9, i52 - i49, i52, (Object) null);
                int[] iArr = kv1Var3.o;
                int[] iArr2 = kv1Var4.o;
                int i53 = kv1Var4.p;
                int i54 = iv1Var.a;
                int i55 = kv1Var3.p;
                mg.a0(iArr, iArr2, i53 - i54, i55 - i54, i55);
                kv1Var3.r -= i49;
                kv1Var3.p -= i54;
                i20 = 1;
            }
            if (this.G.k <= 0) {
                j22.a("Unbalanced begin/end empty");
            }
            r4.k--;
            tr2 tr2Var2 = this.I;
            int i56 = tr2Var2.v;
            tr2Var2.j();
            if (this.G.k <= 0) {
                int i57 = (-2) - i56;
                this.I.k();
                this.I.e(true);
                ao0 ao0Var = this.N;
                boolean zW = this.O.m.W();
                qr2 qr2Var = this.H;
                if (zW) {
                    qxVar.b();
                    qxVar.d(false);
                    i11 i11Var5 = qxVar.d;
                    pr2 pr2Var8 = qxVar.a.G;
                    if (pr2Var8.c <= 0 || i11Var5.a(-2) == (i4 = pr2Var8.i)) {
                        i3 = 1;
                        qxVar.c();
                        kv1 kv1Var5 = qxVar.b.t;
                        kv1Var5.X(ru1.c);
                        rg3.N(kv1Var5, 0, ao0Var, i3, qr2Var);
                        r3 = 0;
                    } else {
                        if (!qxVar.c && qxVar.e) {
                            qxVar.d(false);
                            qxVar.b.t.X(pu1.c);
                            qxVar.c = true;
                        }
                        if (i4 > 0) {
                            ao0 ao0VarA2 = pr2Var8.a(i4);
                            i11Var5.c(i4);
                            qxVar.d(false);
                            kv1 kv1Var6 = qxVar.b.t;
                            kv1Var6.X(ou1.c);
                            rg3.M(kv1Var6, 0, ao0VarA2);
                            i3 = 1;
                            qxVar.c = true;
                        }
                        qxVar.c();
                        kv1 kv1Var52 = qxVar.b.t;
                        kv1Var52.X(ru1.c);
                        rg3.N(kv1Var52, 0, ao0Var, i3, qr2Var);
                        r3 = 0;
                    }
                } else {
                    lj0 lj0Var2 = this.O;
                    qxVar.b();
                    qxVar.d(false);
                    i11 i11Var6 = qxVar.d;
                    pr2 pr2Var9 = qxVar.a.G;
                    if (pr2Var9.c > 0 && i11Var6.a(-2) != (i2 = pr2Var9.i)) {
                        if (!qxVar.c && qxVar.e) {
                            qxVar.d(false);
                            qxVar.b.t.X(pu1.c);
                            qxVar.c = true;
                        }
                        if (i2 > 0) {
                            ao0 ao0VarA3 = pr2Var9.a(i2);
                            i11Var6.c(i2);
                            qxVar.d(false);
                            kv1 kv1Var7 = qxVar.b.t;
                            kv1Var7.X(ou1.c);
                            rg3.M(kv1Var7, 0, ao0VarA3);
                            qxVar.c = true;
                        }
                    }
                    qxVar.c();
                    kv1 kv1Var8 = qxVar.b.t;
                    kv1Var8.X(su1.c);
                    int i58 = kv1Var8.r - kv1Var8.m[kv1Var8.n - 1].b;
                    Object[] objArr10 = kv1Var8.q;
                    objArr10[i58] = ao0Var;
                    objArr10[i58 + 1] = qr2Var;
                    objArr10[i58 + 2] = lj0Var2;
                    this.O = new lj0();
                    r3 = 0;
                }
                this.S = r3;
                if (this.c.i != 0) {
                    d0(i57, r3);
                    e0(i57, i20);
                }
            }
        } else {
            if (z) {
                qxVar.a();
            }
            int i59 = qxVar.a.G.i;
            i11 i11Var7 = qxVar.d;
            int i60 = i;
            if (i11Var7.a(i60) > i59) {
                tx.a("Missed recording an endGroup");
            }
            if (i11Var7.a(i60) == i59) {
                qxVar.d(false);
                i11Var7.b();
                qxVar.b.t.X(lu1.c);
            }
            int i61 = this.G.i;
            if (i20 != h0(i61)) {
                e0(i61, i20);
            }
            if (z) {
                i20 = 1;
            }
            this.G.e();
            qxVar.c();
        }
        ko0 ko0Var3 = (ko0) this.i.remove(r3.size() - 1);
        if (ko0Var3 != null && !z3) {
            ko0Var3.c++;
        }
        this.j = ko0Var3;
        this.k = i11Var.b() + i20;
        this.m = i11Var.b();
        this.l = i11Var.b() + i20;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q() {
        p(false);
        b62 b62VarX = x();
        if (b62VarX != null) {
            int i = b62VarX.b;
            if ((i & 1) != 0) {
                b62VarX.b = i | 2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[EDGE_INSN: B:61:0x0085->B:29:0x0085 BREAK  A[LOOP:0: B:16:0x003f->B:28:0x0081], EDGE_INSN: B:62:0x0085->B:29:0x0085 BREAK  A[LOOP:0: B:16:0x003f->B:28:0x0081]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b62 r() {
        b62 b62Var;
        ao0 ao0VarA;
        a62 a62Var;
        int i;
        ArrayList arrayList = this.E;
        b62 b62Var2 = !arrayList.isEmpty() ? (b62) arrayList.remove(arrayList.size() - 1) : null;
        int i2 = 0;
        if (b62Var2 != null) {
            b62Var2.b &= -9;
            this.g.m();
            int i3 = this.B;
            gk1 gk1Var = b62Var2.f;
            if (gk1Var == null || (b62Var2.b & 16) != 0) {
                a62Var = null;
                qx qxVar = this.M;
                if (a62Var != null) {
                    kv1 kv1Var = qxVar.b.t;
                    kv1Var.X(ku1.c);
                    rg3.N(kv1Var, 0, a62Var, 1, this.h);
                }
                i = b62Var2.b;
                if ((i & AIChatConfig.DefaultMaxTokens) != 0) {
                    b62Var2.b = i & (-513);
                    kv1 kv1Var2 = qxVar.b.t;
                    kv1Var2.X(nu1.c);
                    rg3.M(kv1Var2, 0, b62Var2);
                    int i4 = b62Var2.b;
                    b62Var2.b = i4 & (-129);
                    if ((i4 & 1024) != 0) {
                        b62Var2.b = i4 & (-1153);
                        if (this.z == this.G.i) {
                            this.y = false;
                            this.z = -1;
                        }
                    }
                }
            } else {
                Object[] objArr = gk1Var.b;
                int[] iArr = gk1Var.c;
                long[] jArr = gk1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    loop0: while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j & 255) < 128) {
                                    int i8 = (i5 << 3) + i7;
                                    Object obj = objArr[i8];
                                    if (iArr[i8] != i3) {
                                        a62Var = new a62(i3, i2, b62Var2, gk1Var);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    a62Var = null;
                    qx qxVar2 = this.M;
                    if (a62Var != null) {
                    }
                    i = b62Var2.b;
                    if ((i & AIChatConfig.DefaultMaxTokens) != 0) {
                    }
                }
            }
        }
        if (b62Var2 != null) {
            int i9 = b62Var2.b;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.q)) {
                if (b62Var2.c == null) {
                    if (this.S) {
                        tr2 tr2Var = this.I;
                        ao0VarA = tr2Var.b(tr2Var.v);
                    } else {
                        pr2 pr2Var = this.G;
                        ao0VarA = pr2Var.a(pr2Var.i);
                    }
                    b62Var2.c = ao0VarA;
                }
                b62Var2.b &= -5;
                b62Var = b62Var2;
            } else {
                b62Var = null;
            }
        }
        p(false);
        return b62Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s() {
        if (this.F || this.z != 0) {
            j22.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t() {
        p(false);
        this.b.c();
        p(false);
        qx qxVar = this.M;
        if (qxVar.c) {
            qxVar.d(false);
            qxVar.d(false);
            qxVar.b.t.X(lu1.c);
            qxVar.c = false;
        }
        qxVar.b();
        if (qxVar.d.b != 0) {
            tx.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            tx.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(boolean z, ko0 ko0Var) {
        this.i.add(this.j);
        this.j = ko0Var;
        int i = this.l;
        i11 i11Var = this.n;
        i11Var.c(i);
        i11Var.c(this.m);
        i11Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v() {
        qr2 qr2Var = new qr2();
        if (this.C) {
            qr2Var.b();
        }
        if (this.b.d()) {
            qr2Var.r = new zj1();
        }
        this.H = qr2Var;
        tr2 tr2VarD = qr2Var.d();
        tr2VarD.e(true);
        this.I = tr2VarD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ay w() {
        ho0 ho0Var = this.U;
        if (ho0Var != null) {
            return ho0Var;
        }
        ho0 ho0Var2 = new ho0(this.h);
        this.U = ho0Var2;
        return ho0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final b62 x() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (b62) arrayList.get(arrayList.size() - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean y() {
        if (!A() || this.w) {
            return true;
        }
        b62 b62VarX = x();
        return (b62VarX == null || (b62VarX.b & 4) == 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final cy z() {
        if (this.b.k()) {
            return this.Q;
        }
        return null;
    }
}
