package defpackage;

import com.dokar.quickjs.binding.JsObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public int m;
    public Object n;
    public Object o;
    public Object p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(dq1 dq1Var, String str, ci2 ci2Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 12;
        this.n = dq1Var;
        this.p = str;
        this.o = ci2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 1:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 2:
                return ((b2) p((t00) obj2, (n32) obj)).r(a83Var);
            case 3:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 4:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 5:
                return ((b2) p((t00) obj2, (kl2) obj)).r(a83Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 7:
                return ((b2) p((t00) obj2, (Object[]) obj)).r(a83Var);
            case 8:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 9:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 10:
                return ((b2) p((t00) obj2, (zj0) obj)).r(a83Var);
            case 11:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 12:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 13:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 14:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 15:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 16:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 17:
                return ((b2) p((t00) obj2, (gm2) obj)).r(a83Var);
            case 18:
                return ((b2) p((t00) obj2, (kl2) obj)).r(a83Var);
            case 19:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case AIChatConfig.MaxContextRounds /* 20 */:
                return ((b2) p((t00) obj2, (n32) obj)).r(a83Var);
            case 21:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            case 22:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
            default:
                return ((b2) p((t00) obj2, (j20) obj)).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        switch (this.l) {
            case 0:
                return new b2((String) this.p, (xk1) this.o, t00Var);
            case 1:
                return new b2((bk1) this.n, (y22) this.o, (ca0) this.p, t00Var, 1);
            case 2:
                b2 b2Var = new b2((y33) this.p, (xk1) this.n, t00Var);
                b2Var.o = obj;
                return b2Var;
            case 3:
                return new b2((sm) this.n, (zn1) this.o, (t6) this.p, t00Var, 3);
            case 4:
                b2 b2Var2 = new b2((ak0) this.o, (hq) this.p, t00Var, 4);
                b2Var2.n = obj;
                return b2Var2;
            case 5:
                b2 b2Var3 = new b2((e60) this.o, (mn0) this.p, t00Var, 5);
                b2Var3.n = obj;
                return b2Var3;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new b2((e60) this.n, (bl1) this.o, (mn0) this.p, t00Var, 6);
            case 7:
                b2 b2Var4 = new b2((sk) this.o, (zc0) this.p, t00Var, 7);
                b2Var4.n = obj;
                return b2Var4;
            case 8:
                return new b2((bk1) this.n, (j11) this.o, (ca0) this.p, t00Var, 8);
            case 9:
                return new b2((jn) this.p, t00Var, 9);
            case 10:
                b2 b2Var5 = new b2((ep1) this.o, (xm0) this.p, t00Var, 10);
                b2Var5.n = obj;
                return b2Var5;
            case 11:
                b2 b2Var6 = new b2((ep1) this.p, t00Var, 11);
                b2Var6.o = obj;
                return b2Var6;
            case 12:
                return new b2((dq1) this.n, (String) this.p, (ci2) this.o, t00Var);
            case 13:
                b2 b2Var7 = new b2((dq1) this.o, (ci2) this.p, t00Var, 13);
                b2Var7.n = obj;
                return b2Var7;
            case 14:
                b2 b2Var8 = new b2((h62) this.o, (xb) this.p, t00Var, 14);
                b2Var8.n = obj;
                return b2Var8;
            case 15:
                return new b2((String) this.n, (wj2) this.o, t00Var);
            case 16:
                b2 b2Var9 = new b2((List) this.o, (wj2) this.p, t00Var, 16);
                b2Var9.n = obj;
                return b2Var9;
            case 17:
                b2 b2Var10 = new b2((dc0) this.o, (im2) this.p, t00Var, 17);
                b2Var10.n = obj;
                return b2Var10;
            case 18:
                b2 b2Var11 = new b2((im2) this.o, (mn0) this.p, t00Var, 18);
                b2Var11.n = obj;
                return b2Var11;
            case 19:
                b2 b2Var12 = new b2((gu2) this.o, (sc) this.p, t00Var, 19);
                b2Var12.n = obj;
                return b2Var12;
            case AIChatConfig.MaxContextRounds /* 20 */:
                b2 b2Var13 = new b2((a20) this.o, (zj0) this.p, t00Var, 20);
                b2Var13.n = obj;
                return b2Var13;
            case 21:
                return new b2((qz2) this.n, (x22) this.o, (o12) this.p, t00Var, 21);
            case 22:
                b2 b2Var14 = new b2((k21) this.o, (mn0) this.p, t00Var, 22);
                b2Var14.n = obj;
                return b2Var14;
            default:
                return new b2((fz2) this.o, (zy2) this.p, t00Var, 23);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:267:0x051a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:429:0x04be */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:441:0x0360 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0425, code lost:
    
        if (r1 == r5) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r2 == r9) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
    
        if (r3.g(r2, r1) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0135, code lost:
    
        if (r0.a(r2, r1) == r3) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0145, code lost:
    
        if (defpackage.p7.R(r2, r5, r1) == r3) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04fc A[Catch: all -> 0x04d0, TryCatch #1 {all -> 0x04d0, blocks: (B:246:0x04ca, B:256:0x04f4, B:258:0x04fc, B:259:0x0509, B:266:0x0519, B:253:0x04e6, B:268:0x051c, B:270:0x0521, B:271:0x0522, B:252:0x04e1, B:260:0x050a, B:262:0x0510), top: B:429:0x04be, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x075c  */
    /* JADX WARN: Type inference failed for: r0v100, types: [vz2] */
    /* JADX WARN: Type inference failed for: r0v103, types: [zy2] */
    /* JADX WARN: Type inference failed for: r0v105, types: [wz2] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, zj0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [b2, java.lang.Object, t00, tw2, u00] */
    /* JADX WARN: Type inference failed for: r1v30, types: [b2] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r2v25, types: [bk1] */
    /* JADX WARN: Type inference failed for: r2v31, types: [in] */
    /* JADX WARN: Type inference failed for: r2v32, types: [in, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [in] */
    /* JADX WARN: Type inference failed for: r2v5, types: [bk1] */
    /* JADX WARN: Type inference failed for: r2v59, types: [mn0] */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v22, types: [ug] */
    /* JADX WARN: Type inference failed for: r3v27, types: [fq] */
    /* JADX WARN: Type inference failed for: r3v29, types: [jn] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31, types: [fq] */
    /* JADX WARN: Type inference failed for: r3v35, types: [zj0] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object, k21] */
    /* JADX WARN: Type inference failed for: r3v47, types: [h62] */
    /* JADX WARN: Type inference failed for: r3v50, types: [wj2] */
    /* JADX WARN: Type inference failed for: r3v54, types: [dc0] */
    /* JADX WARN: Type inference failed for: r3v68, types: [k21] */
    /* JADX WARN: Type inference failed for: r3v71, types: [mn0] */
    /* JADX WARN: Type inference failed for: r3v72, types: [wz2] */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r4v14, types: [mn0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [yb2] */
    /* JADX WARN: Type inference failed for: r4v40, types: [wj2] */
    /* JADX WARN: Type inference failed for: r5v22, types: [wj2] */
    /* JADX WARN: Type inference failed for: r5v35, types: [yb2] */
    /* JADX WARN: Type inference failed for: r9v11, types: [xb] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:254:0x04f0 -> B:256:0x04f4). Please report as a decompilation issue!!! */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) throws Throwable {
        Object objR;
        Object objT;
        Object objA;
        ?? inVar;
        Object objB;
        boolean z;
        ?? A;
        Object obj2;
        Object objK;
        Object objN;
        String str;
        j20 j20Var;
        ?? r0;
        ?? r1 = this;
        ?? r3 = 3;
        int i = 4;
        int i2 = 0;
        int i3 = 2;
        int i4 = 1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        switch (r1.l) {
            case 0:
                a83 a83Var = a83.a;
                String str2 = (String) r1.p;
                xk1 xk1Var = (xk1) r1.o;
                k20 k20Var = k20.h;
                int i5 = r1.m;
                if (i5 == 0) {
                    fg1.T(obj);
                    xk1Var.setValue(null);
                    if (!pv2.s0(str2)) {
                        c60 c60Var = o90.a;
                        t50 t50Var = t50.j;
                        a2 a2Var = new a2(str2, z2 ? 1 : 0, i2);
                        r1.n = xk1Var;
                        r1.m = 1;
                        objR = p7.R(t50Var, a2Var, r1);
                        if (objR == k20Var) {
                            return k20Var;
                        }
                    }
                    return a83Var;
                }
                if (i5 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xk1Var = (xk1) r1.n;
                fg1.T(obj);
                objR = obj;
                xk1Var.setValue((String) objR);
                return a83Var;
            case 1:
                k20 k20Var2 = k20.h;
                int i6 = r1.m;
                if (i6 == 0) {
                    fg1.T(obj);
                    ?? r2 = (bk1) r1.n;
                    y22 y22Var = (y22) r1.o;
                    r1.m = 1;
                    if (r2.a(y22Var, r1) == k20Var2) {
                        return k20Var2;
                    }
                } else {
                    if (i6 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                ca0 ca0Var = (ca0) r1.p;
                if (ca0Var != null) {
                    ca0Var.a();
                }
                return a83.a;
            case 2:
                y33 y33Var = (y33) r1.p;
                k20 k20Var3 = k20.h;
                int i7 = r1.m;
                if (i7 == 0) {
                    fg1.T(obj);
                    n32 n32Var = (n32) r1.o;
                    ?? yb2Var = new yb2(new v0(new ea(i3, y33Var), null));
                    zc zcVar = new zc(n32Var, y33Var, (xk1) r1.n, i2);
                    r1.m = 1;
                    if (yb2Var.a(zcVar, r1) == k20Var3) {
                        return k20Var3;
                    }
                } else {
                    if (i7 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                return a83.a;
            case 3:
                a83 a83Var2 = a83.a;
                sm smVar = (sm) r1.n;
                k20 k20Var4 = k20.h;
                int i8 = r1.m;
                if (i8 == 0) {
                    fg1.T(obj);
                    g00 g00Var = smVar.v;
                    qm qmVar = new qm(smVar, (zn1) r1.o, (t6) r1.p);
                    r1.m = 1;
                    g00Var.getClass();
                    o62 o62Var = (o62) qmVar.a();
                    if (o62Var == null || g00.O0(g00Var, o62Var, 0L, 0L, 3)) {
                        objT = a83Var2;
                        if (objT == k20Var4) {
                            return k20Var4;
                        }
                    } else {
                        mp mpVar = new mp(1, gf1.z(r1));
                        mpVar.u();
                        d00 d00Var = new d00(qmVar, mpVar);
                        lm lmVar = g00Var.z;
                        zk1 zk1Var = lmVar.a;
                        o62 o62Var2 = (o62) qmVar.a();
                        if (o62Var2 == null) {
                            mpVar.h(a83Var2);
                        } else {
                            mpVar.w(new d2(8, lmVar, d00Var));
                            c11 c11VarX = ci0.X(0, zk1Var.j);
                            int i9 = c11VarX.h;
                            int i10 = c11VarX.i;
                            if (i9 <= i10) {
                                while (true) {
                                    o62 o62Var3 = (o62) ((d00) zk1Var.h[i10]).a.a();
                                    if (o62Var3 != null) {
                                        o62 o62VarE = o62Var2.e(o62Var3);
                                        if (o62VarE.equals(o62Var2)) {
                                            zk1Var.a(i10 + 1, d00Var);
                                        } else if (!o62VarE.equals(o62Var3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i11 = zk1Var.j - 1;
                                            if (i11 <= i10) {
                                                while (true) {
                                                    ((d00) zk1Var.h[i10]).b.n(cancellationException);
                                                    if (i11 != i10) {
                                                        i11++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i10 != i9) {
                                        i10--;
                                    }
                                }
                                zk1Var.a(0, d00Var);
                                if (!g00Var.C) {
                                    g00Var.P0(0L);
                                }
                            } else {
                                zk1Var.a(0, d00Var);
                                if (!g00Var.C) {
                                }
                            }
                        }
                        objT = mpVar.t();
                        if (objT != k20Var4) {
                        }
                        if (objT == k20Var4) {
                        }
                    }
                } else {
                    if (i8 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                return a83Var2;
            case 4:
                a83 a83Var3 = a83.a;
                j20 j20Var2 = (j20) r1.n;
                k20 k20Var5 = k20.h;
                int i12 = r1.m;
                if (i12 == 0) {
                    fg1.T(obj);
                    ak0 ak0Var = (ak0) r1.o;
                    fq fqVarF = ((hq) r1.p).f(j20Var2);
                    r1.n = null;
                    r1.m = 1;
                    Object objH = ci0.H(ak0Var, fqVarF, true, r1);
                    if (objH != k20Var5) {
                        objH = a83Var3;
                    }
                    if (objH == k20Var5) {
                        return k20Var5;
                    }
                } else {
                    if (i12 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                return a83Var3;
            case 5:
                nx1 nx1Var = ((e60) r1.o).d;
                k20 k20Var6 = k20.h;
                int i13 = r1.m;
                try {
                    if (i13 == 0) {
                        fg1.T(obj);
                        kl2 kl2Var = (kl2) r1.n;
                        nx1Var.setValue(Boolean.TRUE);
                        ?? r4 = (mn0) r1.p;
                        r1.m = 1;
                        if (r4.g(kl2Var, r1) == k20Var6) {
                            return k20Var6;
                        }
                    } else {
                        if (i13 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(obj);
                    }
                    nx1Var.setValue(Boolean.FALSE);
                    return a83.a;
                } catch (Throwable th) {
                    nx1Var.setValue(Boolean.FALSE);
                    throw th;
                }
            case AIChatConfig.DefaultContextRounds /* 6 */:
                k20 k20Var7 = k20.h;
                int i14 = r1.m;
                if (i14 == 0) {
                    fg1.T(obj);
                    e60 e60Var = (e60) r1.n;
                    gl1 gl1Var = e60Var.c;
                    d60 d60Var = e60Var.b;
                    bl1 bl1Var = (bl1) r1.o;
                    b2 b2Var = new b2((Object) e60Var, r1.p, (t00) (z3 ? 1 : 0), 5);
                    r1.m = 1;
                    gl1Var.getClass();
                    if (te.u(new fl1(bl1Var, gl1Var, b2Var, d60Var, null), r1) == k20Var7) {
                        return k20Var7;
                    }
                } else {
                    if (i14 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                return a83.a;
            case 7:
                Object[] objArr = (Object[]) r1.n;
                k20 k20Var8 = k20.h;
                int i15 = r1.m;
                if (i15 == 0) {
                    fg1.T(obj);
                    ?? r32 = (ug) ((sk) r1.o);
                    r1.n = null;
                    r1.m = 1;
                    objA = r32.a(objArr, r1);
                    if (objA == k20Var8) {
                        return k20Var8;
                    }
                } else {
                    if (i15 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                    objA = obj;
                }
                if (objA != null && te.o0(objA) == null) {
                    z53 typeConverters = ((zc0) r1.p).b.getTypeConverters();
                    typeConverters.a(objA, te.n0(typeConverters, objA), d72.c(JsObject.class));
                }
                return objA;
            case 8:
                k20 k20Var9 = k20.h;
                int i16 = r1.m;
                if (i16 == 0) {
                    fg1.T(obj);
                    ?? r22 = (bk1) r1.n;
                    j11 j11Var = (j11) r1.o;
                    r1.m = 1;
                    if (r22.a(j11Var, r1) == k20Var9) {
                        return k20Var9;
                    }
                } else {
                    if (i16 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                ca0 ca0Var2 = (ca0) r1.p;
                if (ca0Var2 != null) {
                    ca0Var2.a();
                }
                return a83.a;
            case 9:
                k20 k20Var10 = k20.h;
                int i17 = r1.m;
                try {
                    if (i17 == 0) {
                        fg1.T(obj);
                        r3 = (jn) r1.p;
                        inVar = new in(r3);
                        r1.n = r3;
                        r1.o = inVar;
                        r1.m = 1;
                        objB = inVar.b(r1);
                        inVar = inVar;
                        r3 = r3;
                        if (objB == k20Var10) {
                        }
                        if (((Boolean) objB).booleanValue()) {
                        }
                    } else {
                        if (i17 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        in inVar2 = (in) r1.o;
                        fq fqVar = (fq) r1.n;
                        fg1.T(obj);
                        objB = obj;
                        inVar = inVar2;
                        r3 = fqVar;
                        if (((Boolean) objB).booleanValue()) {
                            iq0.b.set(false);
                            synchronized (ds2.c) {
                                sk1 sk1Var = ds2.j.h;
                                z = sk1Var != null && sk1Var.h();
                            }
                            if (z) {
                                ds2.a();
                            }
                            r1.n = r3;
                            r1.o = inVar;
                            r1.m = 1;
                            objB = inVar.b(r1);
                            inVar = inVar;
                            r3 = r3;
                            if (objB == k20Var10) {
                                return k20Var10;
                            }
                            if (((Boolean) objB).booleanValue()) {
                                r3.c(null);
                                return a83.a;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CancellationException cancellationException2 = th2 instanceof CancellationException ? th2 : null;
                        if (cancellationException2 == null) {
                            cancellationException2 = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException2.initCause(th2);
                        }
                        r3.c(cancellationException2);
                        throw th3;
                    }
                }
                break;
            case 10:
                fp1 fp1Var = fp1.j;
                ep1 ep1Var = (ep1) r1.o;
                ?? r33 = (zj0) r1.n;
                k20 k20Var11 = k20.h;
                int i18 = r1.m;
                try {
                    if (i18 == 0) {
                        fg1.T(obj);
                        if (ep1Var.c() && ep1Var.f != fp1Var) {
                            ep1Var.e++;
                            zt2 zt2Var = ep1Var.d;
                            if (zt2Var != null) {
                                zt2Var.c(null);
                            }
                            ep1Var.d = null;
                            ep1Var.f = fp1Var;
                            ep1Var.g(true);
                            ep1Var.f(true);
                            ep1Var.h.setValue(new rs1(ep1Var.c));
                            ep1Var.g = ci0.C(((Number) ep1Var.b.d()).floatValue(), 0.0f, 1.0f);
                        }
                        i9 i9Var = new i9(i4, ep1Var);
                        r1.n = null;
                        r1.m = 1;
                        if (r33.a(i9Var, r1) == k20Var11) {
                            return k20Var11;
                        }
                    } else {
                        if (i18 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(obj);
                    }
                    ep1Var.b(null, (xm0) r1.p);
                    break;
                } catch (CancellationException unused) {
                    if (ep1Var.f == fp1Var) {
                        ep1Var.d(fp1.h, new gc(ep1Var, null));
                    }
                }
                return a83.a;
            case 11:
                a83 a83Var4 = a83.a;
                ep1 ep1Var2 = (ep1) r1.p;
                j20 j20Var3 = (j20) r1.o;
                k20 k20Var12 = k20.h;
                int i19 = r1.m;
                if (i19 == 0) {
                    fg1.T(obj);
                    A = p7.A(j20Var3, null, new h50((Object) ep1Var2, (t00) (z4 ? 1 : 0), 7), 3);
                } else {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            fg1.T(obj);
                            return a83Var4;
                        }
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k21 k21Var = (k21) r1.n;
                    fg1.T(obj);
                    A = k21Var;
                }
                while (A.b() && ((Number) ep1Var2.b.d()).floatValue() > 0.005f) {
                    nx0 nx0Var = new nx0(24);
                    r1.o = null;
                    r1.n = A;
                    r1.m = 1;
                    a20 a20Var = r1.i;
                    a20Var.getClass();
                    if (qp0.A(a20Var).a(nx0Var, r1) == k20Var12) {
                        return k20Var12;
                    }
                }
                r1.o = null;
                r1.n = null;
                r1.m = 2;
                A.c(null);
                Object objA2 = A.A(r1);
                if (objA2 != k20Var12) {
                    objA2 = a83Var4;
                }
                break;
            case 12:
                ci2 ci2Var = (ci2) r1.o;
                dq1 dq1Var = (dq1) r1.n;
                k20 k20Var13 = k20.h;
                int i20 = r1.m;
                try {
                    if (i20 == 0) {
                        fg1.T(obj);
                        ?? r42 = (wj2) dq1Var.i;
                        String str3 = (String) r1.p;
                        r1.m = 1;
                        Object objB2 = r42.b(str3, ci2Var, r1);
                        obj2 = k20Var13;
                        r1 = objB2;
                        if (objB2 != k20Var13) {
                            obj2 = objB2;
                            r1 = objB2;
                        }
                    } else {
                        if (i20 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(obj);
                        obj2 = obj;
                        r1 = r1;
                    }
                    return obj2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    b5.x((b5) dq1Var.j, ph2.k, vi0.j("Message dispatch failed for event ", ci2Var.a, "."), (String) r1.p, e2, 16);
                    return a83.a;
                }
            case 13:
                dq1 dq1Var2 = (dq1) r1.o;
                j20 j20Var4 = (j20) r1.n;
                k20 k20Var14 = k20.h;
                int i21 = r1.m;
                if (i21 == 0) {
                    fg1.T(obj);
                    ?? r5 = (wj2) dq1Var2.i;
                    r1.n = j20Var4;
                    r1.m = 1;
                    objK = r5.k(r1);
                    if (objK != k20Var14) {
                    }
                    return k20Var14;
                }
                if (i21 != 1) {
                    if (i21 == 2) {
                        fg1.T(obj);
                        return obj;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
                objK = obj;
                List list = ((yj2) objK).a;
                ArrayList arrayList = new ArrayList(eu.B(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((me1) it.next()).a);
                }
                ci2 ci2Var2 = (ci2) r1.p;
                ArrayList arrayList2 = new ArrayList(eu.B(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(p7.k(j20Var4, new b2(dq1Var2, (String) it2.next(), ci2Var2, (t00) null)));
                }
                r1.n = null;
                r1.m = 2;
                Object objK2 = op0.k(arrayList2, r1);
                if (objK2 != k20Var14) {
                    return objK2;
                }
                return k20Var14;
            case 14:
                k20 k20Var15 = k20.h;
                int i22 = r1.m;
                if (i22 != 0) {
                    if (i22 == 1) {
                        fg1.T(obj);
                        return a83.a;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
                j20 j20Var5 = (j20) r1.n;
                ?? r34 = (h62) r1.o;
                xb xbVar = (xb) r1.p;
                r1.m = 1;
                r34.e(j20Var5, xbVar, r1);
                return k20Var15;
            case 15:
                String str4 = (String) r1.n;
                k20 k20Var16 = k20.h;
                int i23 = r1.m;
                try {
                    if (i23 == 0) {
                        fg1.T(obj);
                        ?? r35 = (wj2) r1.o;
                        xj2 xj2Var = xj2.k;
                        r1.p = str4;
                        r1.m = 1;
                        Set set = wj2.h;
                        objN = r35.n(str4, xj2Var, r1);
                        if (objN == k20Var16) {
                            return k20Var16;
                        }
                        str = str4;
                    } else {
                        if (i23 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) r1.p;
                        fg1.T(obj);
                        objN = obj;
                    }
                    return new tk2(str, ((Boolean) objN).booleanValue(), null);
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th4) {
                    return new tk2(str4, false, th4);
                }
            case 16:
                j20 j20Var6 = (j20) r1.n;
                k20 k20Var17 = k20.h;
                int i24 = r1.m;
                if (i24 != 0) {
                    if (i24 == 1) {
                        fg1.T(obj);
                        return obj;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.T(obj);
                List list2 = (List) r1.o;
                wj2 wj2Var = (wj2) r1.p;
                ArrayList arrayList3 = new ArrayList(eu.B(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(p7.k(j20Var6, new b2((String) it3.next(), wj2Var, (t00) null)));
                }
                r1.n = null;
                r1.m = 1;
                Object objK3 = op0.k(arrayList3, r1);
                return objK3 == k20Var17 ? k20Var17 : objK3;
            case 17:
                k20 k20Var18 = k20.h;
                int i25 = r1.m;
                if (i25 == 0) {
                    fg1.T(obj);
                    gm2 gm2Var = (gm2) r1.n;
                    ?? r36 = (dc0) r1.o;
                    d62 d62Var = new d62(i3, gm2Var, (im2) r1.p);
                    r1.m = 1;
                    if (r36.g(d62Var, r1) == k20Var18) {
                        return k20Var18;
                    }
                } else {
                    if (i25 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                return a83.a;
            case 18:
                k20 k20Var19 = k20.h;
                int i26 = r1.m;
                if (i26 == 0) {
                    fg1.T(obj);
                    kl2 kl2Var2 = (kl2) r1.n;
                    im2 im2Var = (im2) r1.o;
                    im2Var.k = kl2Var2;
                    ?? r23 = (mn0) r1.p;
                    gm2 gm2Var2 = im2Var.l;
                    r1.m = 1;
                    if (r23.g(gm2Var2, r1) == k20Var19) {
                        return k20Var19;
                    }
                } else {
                    if (i26 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                return a83.a;
            case 19:
                k20 k20Var20 = k20.h;
                int i27 = r1.m;
                if (i27 == 0) {
                    fg1.T(obj);
                    j20 j20Var7 = (j20) r1.n;
                    ?? yb2Var2 = new yb2(new v0(new hn2((gu2) r1.o, 1), null));
                    ha0 ha0Var = new ha0(i, (sc) r1.p, j20Var7);
                    r1.m = 1;
                    if (yb2Var2.a(ha0Var, r1) == k20Var20) {
                        return k20Var20;
                    }
                } else {
                    if (i27 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                return a83.a;
            case AIChatConfig.MaxContextRounds /* 20 */:
                ?? r02 = (zj0) r1.p;
                a20 a20Var2 = (a20) r1.o;
                k20 k20Var21 = k20.h;
                int i28 = r1.m;
                if (i28 == 0) {
                    fg1.T(obj);
                    n32 n32Var2 = (n32) r1.n;
                    if (!t11.l(a20Var2, zd0.h)) {
                        a2 a2Var2 = new a2(r02, n32Var2, z5 ? 1 : 0, 25);
                        r1.m = 2;
                    } else {
                        ns2 ns2Var = new ns2(n32Var2, 0);
                        r1.m = 1;
                    }
                    break;
                } else {
                    if (i28 != 1 && i28 != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                return a83.a;
            case 21:
                a83 a83Var5 = a83.a;
                k20 k20Var22 = k20.h;
                int i29 = r1.m;
                if (i29 == 0) {
                    fg1.T(obj);
                    qz2 qz2Var = (qz2) r1.n;
                    x22 x22Var = (x22) r1.o;
                    long j = ((o12) r1.p).c;
                    r1.m = 1;
                    qz2 qz2Var2 = new qz2(qz2Var.o, qz2Var.p, r1);
                    qz2Var2.m = x22Var;
                    qz2Var2.n = j;
                    if (qz2Var2.r(a83Var5) == k20Var22) {
                        return k20Var22;
                    }
                } else {
                    if (i29 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                return a83Var5;
            case 22:
                k20 k20Var23 = k20.h;
                int i30 = r1.m;
                if (i30 == 0) {
                    fg1.T(obj);
                    j20Var = (j20) r1.n;
                    ?? r37 = (k21) r1.o;
                    r1.n = j20Var;
                    r1.m = 1;
                    if (r37.A(r1) != k20Var23) {
                    }
                    return k20Var23;
                }
                if (i30 != 1) {
                    if (i30 == 2) {
                        fg1.T(obj);
                        return a83.a;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j20Var = (j20) r1.n;
                fg1.T(obj);
                ?? r38 = (mn0) r1.p;
                r1.n = null;
                r1.m = 2;
                break;
            default:
                a83 a83Var6 = a83.a;
                fz2 fz2Var = (fz2) r1.o;
                k20 k20Var24 = k20.h;
                int i31 = r1.m;
                try {
                } catch (Throwable th5) {
                    ?? r39 = fz2Var.z;
                    if (r39 == 0) {
                        throw th5;
                    }
                    r1.n = th5;
                    r1.m = 4;
                    r39.j(r1);
                    if (a83Var6 != k20Var24) {
                        throw th5;
                    }
                }
                if (i31 == 0) {
                    fg1.T(obj);
                    ?? r03 = fz2Var.y;
                    if (r03 != 0) {
                        r1.m = 1;
                        if (r03.j(r1) == k20Var24) {
                        }
                        return k20Var24;
                    }
                } else {
                    if (i31 != 1) {
                        if (i31 == 2) {
                            fg1.T(obj);
                            r0 = fz2Var.z;
                            if (r0 != 0) {
                                r1.m = 3;
                                r0.j(r1);
                                break;
                            }
                            return a83Var6;
                        }
                        if (i31 == 3) {
                            fg1.T(obj);
                            return a83Var6;
                        }
                        if (i31 != 4) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th6 = (Throwable) r1.n;
                        fg1.T(obj);
                        throw th6;
                    }
                    fg1.T(obj);
                }
                ?? r04 = (zy2) r1.p;
                r1.m = 2;
                if (r04.a(fz2Var, r1) != k20Var24) {
                    r0 = fz2Var.z;
                    if (r0 != 0) {
                    }
                    return a83Var6;
                }
                return k20Var24;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(y33 y33Var, xk1 xk1Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 2;
        this.p = y33Var;
        this.n = xk1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(Object obj, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.p = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(Object obj, Object obj2, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.o = obj;
        this.p = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(Object obj, Object obj2, Object obj3, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(String str, xk1 xk1Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 0;
        this.p = str;
        this.o = xk1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(String str, wj2 wj2Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 15;
        this.n = str;
        this.o = wj2Var;
    }
}
