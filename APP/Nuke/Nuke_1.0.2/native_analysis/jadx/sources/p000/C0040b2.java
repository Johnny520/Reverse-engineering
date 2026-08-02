package p000;

import com.dokar.quickjs.binding.JsObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: b2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0040b2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f528l;

    /* JADX INFO: renamed from: m */
    public int f529m;

    /* JADX INFO: renamed from: n */
    public Object f530n;

    /* JADX INFO: renamed from: o */
    public Object f531o;

    /* JADX INFO: renamed from: p */
    public Object f532p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040b2(dq1 dq1Var, String str, ci2 ci2Var, t00 t00Var) {
        super(2, t00Var);
        this.f528l = 12;
        this.f530n = dq1Var;
        this.f532p = str;
        this.f531o = ci2Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f528l;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 1:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 2:
                return ((C0040b2) mo13p((t00) obj2, (n32) obj)).mo7r(a83Var);
            case 3:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 4:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 5:
                return ((C0040b2) mo13p((t00) obj2, (kl2) obj)).mo7r(a83Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 7:
                return ((C0040b2) mo13p((t00) obj2, (Object[]) obj)).mo7r(a83Var);
            case 8:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 9:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 10:
                return ((C0040b2) mo13p((t00) obj2, (zj0) obj)).mo7r(a83Var);
            case 11:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 12:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 13:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 14:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 15:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 16:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 17:
                return ((C0040b2) mo13p((t00) obj2, (gm2) obj)).mo7r(a83Var);
            case 18:
                return ((C0040b2) mo13p((t00) obj2, (kl2) obj)).mo7r(a83Var);
            case 19:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case AIChatConfig.MaxContextRounds /* 20 */:
                return ((C0040b2) mo13p((t00) obj2, (n32) obj)).mo7r(a83Var);
            case 21:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 22:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            default:
                return ((C0040b2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        switch (this.f528l) {
            case 0:
                return new C0040b2((String) this.f532p, (xk1) this.f531o, t00Var);
            case 1:
                return new C0040b2((bk1) this.f530n, (y22) this.f531o, (ca0) this.f532p, t00Var, 1);
            case 2:
                C0040b2 c0040b2 = new C0040b2((y33) this.f532p, (xk1) this.f530n, t00Var);
                c0040b2.f531o = obj;
                return c0040b2;
            case 3:
                return new C0040b2((C0699sm) this.f530n, (zn1) this.f531o, (C0723t6) this.f532p, t00Var, 3);
            case 4:
                C0040b2 c0040b22 = new C0040b2((ak0) this.f531o, (AbstractC0286hq) this.f532p, t00Var, 4);
                c0040b22.f530n = obj;
                return c0040b22;
            case 5:
                C0040b2 c0040b23 = new C0040b2((e60) this.f531o, (mn0) this.f532p, t00Var, 5);
                c0040b23.f530n = obj;
                return c0040b23;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new C0040b2((e60) this.f530n, (bl1) this.f531o, (mn0) this.f532p, t00Var, 6);
            case 7:
                C0040b2 c0040b24 = new C0040b2((InterfaceC0697sk) this.f531o, (zc0) this.f532p, t00Var, 7);
                c0040b24.f530n = obj;
                return c0040b24;
            case 8:
                return new C0040b2((bk1) this.f530n, (j11) this.f531o, (ca0) this.f532p, t00Var, 8);
            case 9:
                return new C0040b2((C0356jn) this.f532p, t00Var, 9);
            case 10:
                C0040b2 c0040b25 = new C0040b2((ep1) this.f531o, (xm0) this.f532p, t00Var, 10);
                c0040b25.f530n = obj;
                return c0040b25;
            case 11:
                C0040b2 c0040b26 = new C0040b2((ep1) this.f532p, t00Var, 11);
                c0040b26.f531o = obj;
                return c0040b26;
            case 12:
                return new C0040b2((dq1) this.f530n, (String) this.f532p, (ci2) this.f531o, t00Var);
            case 13:
                C0040b2 c0040b27 = new C0040b2((dq1) this.f531o, (ci2) this.f532p, t00Var, 13);
                c0040b27.f530n = obj;
                return c0040b27;
            case 14:
                C0040b2 c0040b28 = new C0040b2((h62) this.f531o, (C0880xb) this.f532p, t00Var, 14);
                c0040b28.f530n = obj;
                return c0040b28;
            case 15:
                return new C0040b2((String) this.f530n, (wj2) this.f531o, t00Var);
            case 16:
                C0040b2 c0040b29 = new C0040b2((List) this.f531o, (wj2) this.f532p, t00Var, 16);
                c0040b29.f530n = obj;
                return c0040b29;
            case 17:
                C0040b2 c0040b210 = new C0040b2((dc0) this.f531o, (im2) this.f532p, t00Var, 17);
                c0040b210.f530n = obj;
                return c0040b210;
            case 18:
                C0040b2 c0040b211 = new C0040b2((im2) this.f531o, (mn0) this.f532p, t00Var, 18);
                c0040b211.f530n = obj;
                return c0040b211;
            case 19:
                C0040b2 c0040b212 = new C0040b2((gu2) this.f531o, (C0689sc) this.f532p, t00Var, 19);
                c0040b212.f530n = obj;
                return c0040b212;
            case AIChatConfig.MaxContextRounds /* 20 */:
                C0040b2 c0040b213 = new C0040b2((a20) this.f531o, (zj0) this.f532p, t00Var, 20);
                c0040b213.f530n = obj;
                return c0040b213;
            case 21:
                return new C0040b2((qz2) this.f530n, (x22) this.f531o, (o12) this.f532p, t00Var, 21);
            case 22:
                C0040b2 c0040b214 = new C0040b2((k21) this.f531o, (mn0) this.f532p, t00Var, 22);
                c0040b214.f530n = obj;
                return c0040b214;
            default:
                return new C0040b2((fz2) this.f531o, (zy2) this.f532p, t00Var, 23);
        }
    }

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
    
        if (r3.mo12g(r2, r1) == r0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0135, code lost:
    
        if (r0.mo1660a(r2, r1) == r3) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0145, code lost:
    
        if (p000.AbstractC0570p7.m3762R(r2, r5, r1) == r3) goto L79;
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
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) throws Throwable {
        Object objM3762R;
        Object objM3150t;
        Object objMo2148a;
        ?? c0319in;
        Object objM2373b;
        boolean z;
        ?? M3745A;
        Object obj2;
        Object objM5933k;
        Object objM5936n;
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
        switch (r1.f528l) {
            case 0:
                a83 a83Var = a83.f116a;
                String str2 = (String) r1.f532p;
                xk1 xk1Var = (xk1) r1.f531o;
                k20 k20Var = k20.f5323h;
                int i5 = r1.f529m;
                if (i5 == 0) {
                    fg1.m1627T(obj);
                    xk1Var.setValue(null);
                    if (!pv2.m4006s0(str2)) {
                        c60 c60Var = o90.f7590a;
                        t50 t50Var = t50.f10560j;
                        C0003a2 c0003a2 = new C0003a2(str2, z2 ? 1 : 0, i2);
                        r1.f530n = xk1Var;
                        r1.f529m = 1;
                        objM3762R = AbstractC0570p7.m3762R(t50Var, c0003a2, r1);
                        if (objM3762R == k20Var) {
                            return k20Var;
                        }
                    }
                    return a83Var;
                }
                if (i5 != 1) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xk1Var = (xk1) r1.f530n;
                fg1.m1627T(obj);
                objM3762R = obj;
                xk1Var.setValue((String) objM3762R);
                return a83Var;
            case 1:
                k20 k20Var2 = k20.f5323h;
                int i6 = r1.f529m;
                if (i6 == 0) {
                    fg1.m1627T(obj);
                    ?? r2 = (bk1) r1.f530n;
                    y22 y22Var = (y22) r1.f531o;
                    r1.f529m = 1;
                    if (r2.m554a(y22Var, r1) == k20Var2) {
                        return k20Var2;
                    }
                } else {
                    if (i6 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                ca0 ca0Var = (ca0) r1.f532p;
                if (ca0Var != null) {
                    ca0Var.mo717a();
                }
                return a83.f116a;
            case 2:
                y33 y33Var = (y33) r1.f532p;
                k20 k20Var3 = k20.f5323h;
                int i7 = r1.f529m;
                if (i7 == 0) {
                    fg1.m1627T(obj);
                    n32 n32Var = (n32) r1.f531o;
                    ?? yb2Var = new yb2(new C0793v0(new C0159ea(i3, y33Var), null));
                    C0957zc c0957zc = new C0957zc(n32Var, y33Var, (xk1) r1.f530n, i2);
                    r1.f529m = 1;
                    if (yb2Var.mo1660a(c0957zc, r1) == k20Var3) {
                        return k20Var3;
                    }
                } else {
                    if (i7 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                return a83.f116a;
            case 3:
                a83 a83Var2 = a83.f116a;
                C0699sm c0699sm = (C0699sm) r1.f530n;
                k20 k20Var4 = k20.f5323h;
                int i8 = r1.f529m;
                if (i8 == 0) {
                    fg1.m1627T(obj);
                    g00 g00Var = c0699sm.f10188v;
                    C0624qm c0624qm = new C0624qm(c0699sm, (zn1) r1.f531o, (C0723t6) r1.f532p);
                    r1.f529m = 1;
                    g00Var.getClass();
                    o62 o62Var = (o62) c0624qm.mo6a();
                    if (o62Var == null || g00.m1771O0(g00Var, o62Var, 0L, 0L, 3)) {
                        objM3150t = a83Var2;
                        if (objM3150t == k20Var4) {
                            return k20Var4;
                        }
                    } else {
                        C0469mp c0469mp = new C0469mp(1, gf1.m1908z(r1));
                        c0469mp.m3151u();
                        d00 d00Var = new d00(c0624qm, c0469mp);
                        C0429lm c0429lm = g00Var.f3217z;
                        zk1 zk1Var = c0429lm.f6190a;
                        o62 o62Var2 = (o62) c0624qm.mo6a();
                        if (o62Var2 == null) {
                            c0469mp.mo2509h(a83Var2);
                        } else {
                            c0469mp.m3153w(new C0115d2(8, c0429lm, d00Var));
                            c11 c11VarM799X = ci0.m799X(0, zk1Var.f13936j);
                            int i9 = c11VarM799X.f25h;
                            int i10 = c11VarM799X.f26i;
                            if (i9 <= i10) {
                                while (true) {
                                    o62 o62Var3 = (o62) ((d00) zk1Var.f13934h[i10]).f1798a.mo6a();
                                    if (o62Var3 != null) {
                                        o62 o62VarM3517e = o62Var2.m3517e(o62Var3);
                                        if (o62VarM3517e.equals(o62Var2)) {
                                            zk1Var.m6422a(i10 + 1, d00Var);
                                        } else if (!o62VarM3517e.equals(o62Var3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i11 = zk1Var.f13936j - 1;
                                            if (i11 <= i10) {
                                                while (true) {
                                                    ((d00) zk1Var.f13934h[i10]).f1799b.mo2512n(cancellationException);
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
                                zk1Var.m6422a(0, d00Var);
                                if (!g00Var.f3212C) {
                                    g00Var.m1773P0(0L);
                                }
                            } else {
                                zk1Var.m6422a(0, d00Var);
                                if (!g00Var.f3212C) {
                                }
                            }
                        }
                        objM3150t = c0469mp.m3150t();
                        if (objM3150t != k20Var4) {
                        }
                        if (objM3150t == k20Var4) {
                        }
                    }
                } else {
                    if (i8 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                return a83Var2;
            case 4:
                a83 a83Var3 = a83.f116a;
                j20 j20Var2 = (j20) r1.f530n;
                k20 k20Var5 = k20.f5323h;
                int i12 = r1.f529m;
                if (i12 == 0) {
                    fg1.m1627T(obj);
                    ak0 ak0Var = (ak0) r1.f531o;
                    InterfaceC0212fq interfaceC0212fqMo2018f = ((AbstractC0286hq) r1.f532p).mo2018f(j20Var2);
                    r1.f530n = null;
                    r1.f529m = 1;
                    Object objM783H = ci0.m783H(ak0Var, interfaceC0212fqMo2018f, true, r1);
                    if (objM783H != k20Var5) {
                        objM783H = a83Var3;
                    }
                    if (objM783H == k20Var5) {
                        return k20Var5;
                    }
                } else {
                    if (i12 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                return a83Var3;
            case 5:
                nx1 nx1Var = ((e60) r1.f531o).f2324d;
                k20 k20Var6 = k20.f5323h;
                int i13 = r1.f529m;
                try {
                    if (i13 == 0) {
                        fg1.m1627T(obj);
                        kl2 kl2Var = (kl2) r1.f530n;
                        nx1Var.setValue(Boolean.TRUE);
                        ?? r4 = (mn0) r1.f532p;
                        r1.f529m = 1;
                        if (r4.mo12g(kl2Var, r1) == k20Var6) {
                            return k20Var6;
                        }
                    } else {
                        if (i13 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj);
                    }
                    nx1Var.setValue(Boolean.FALSE);
                    return a83.f116a;
                } catch (Throwable th) {
                    nx1Var.setValue(Boolean.FALSE);
                    throw th;
                }
            case AIChatConfig.DefaultContextRounds /* 6 */:
                k20 k20Var7 = k20.f5323h;
                int i14 = r1.f529m;
                if (i14 == 0) {
                    fg1.m1627T(obj);
                    e60 e60Var = (e60) r1.f530n;
                    gl1 gl1Var = e60Var.f2323c;
                    d60 d60Var = e60Var.f2322b;
                    bl1 bl1Var = (bl1) r1.f531o;
                    C0040b2 c0040b2 = new C0040b2((Object) e60Var, r1.f532p, (t00) (z3 ? 1 : 0), 5);
                    r1.f529m = 1;
                    gl1Var.getClass();
                    if (AbstractC0731te.m5238u(new fl1(bl1Var, gl1Var, c0040b2, d60Var, null), r1) == k20Var7) {
                        return k20Var7;
                    }
                } else {
                    if (i14 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                return a83.f116a;
            case 7:
                Object[] objArr = (Object[]) r1.f530n;
                k20 k20Var8 = k20.f5323h;
                int i15 = r1.f529m;
                if (i15 == 0) {
                    fg1.m1627T(obj);
                    ?? r32 = (InterfaceC0772ug) ((InterfaceC0697sk) r1.f531o);
                    r1.f530n = null;
                    r1.f529m = 1;
                    objMo2148a = r32.mo2148a(objArr, r1);
                    if (objMo2148a == k20Var8) {
                        return k20Var8;
                    }
                } else {
                    if (i15 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                    objMo2148a = obj;
                }
                if (objMo2148a != null && AbstractC0731te.m5227o0(objMo2148a) == null) {
                    z53 typeConverters = ((zc0) r1.f532p).f13829b.getTypeConverters();
                    typeConverters.m6384a(objMo2148a, AbstractC0731te.m5225n0(typeConverters, objMo2148a), d72.m969c(JsObject.class));
                }
                return objMo2148a;
            case 8:
                k20 k20Var9 = k20.f5323h;
                int i16 = r1.f529m;
                if (i16 == 0) {
                    fg1.m1627T(obj);
                    ?? r22 = (bk1) r1.f530n;
                    j11 j11Var = (j11) r1.f531o;
                    r1.f529m = 1;
                    if (r22.m554a(j11Var, r1) == k20Var9) {
                        return k20Var9;
                    }
                } else {
                    if (i16 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                ca0 ca0Var2 = (ca0) r1.f532p;
                if (ca0Var2 != null) {
                    ca0Var2.mo717a();
                }
                return a83.f116a;
            case 9:
                k20 k20Var10 = k20.f5323h;
                int i17 = r1.f529m;
                try {
                    if (i17 == 0) {
                        fg1.m1627T(obj);
                        r3 = (C0356jn) r1.f532p;
                        c0319in = new C0319in(r3);
                        r1.f530n = r3;
                        r1.f531o = c0319in;
                        r1.f529m = 1;
                        objM2373b = c0319in.m2373b(r1);
                        c0319in = c0319in;
                        r3 = r3;
                        if (objM2373b == k20Var10) {
                        }
                        if (((Boolean) objM2373b).booleanValue()) {
                        }
                    } else {
                        if (i17 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        C0319in c0319in2 = (C0319in) r1.f531o;
                        InterfaceC0212fq interfaceC0212fq = (InterfaceC0212fq) r1.f530n;
                        fg1.m1627T(obj);
                        objM2373b = obj;
                        c0319in = c0319in2;
                        r3 = interfaceC0212fq;
                        if (((Boolean) objM2373b).booleanValue()) {
                            iq0.f4743b.set(false);
                            synchronized (ds2.f2181c) {
                                sk1 sk1Var = ds2.f2188j.f12560h;
                                z = sk1Var != null && sk1Var.m4889h();
                            }
                            if (z) {
                                ds2.m1117a();
                            }
                            r1.f530n = r3;
                            r1.f531o = c0319in;
                            r1.f529m = 1;
                            objM2373b = c0319in.m2373b(r1);
                            c0319in = c0319in;
                            r3 = r3;
                            if (objM2373b == k20Var10) {
                                return k20Var10;
                            }
                            if (((Boolean) objM2373b).booleanValue()) {
                                r3.mo1712c(null);
                                return a83.f116a;
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
                        r3.mo1712c(cancellationException2);
                        throw th3;
                    }
                }
                break;
            case 10:
                fp1 fp1Var = fp1.f3105j;
                ep1 ep1Var = (ep1) r1.f531o;
                ?? r33 = (zj0) r1.f530n;
                k20 k20Var11 = k20.f5323h;
                int i18 = r1.f529m;
                try {
                    if (i18 == 0) {
                        fg1.m1627T(obj);
                        if (ep1Var.m1405c() && ep1Var.f2553f != fp1Var) {
                            ep1Var.f2552e++;
                            zt2 zt2Var = ep1Var.f2551d;
                            if (zt2Var != null) {
                                zt2Var.mo1704c(null);
                            }
                            ep1Var.f2551d = null;
                            ep1Var.f2553f = fp1Var;
                            ep1Var.m1409g(true);
                            ep1Var.m1408f(true);
                            ep1Var.f2555h.setValue(new rs1(ep1Var.f2550c));
                            ep1Var.f2554g = ci0.m778C(((Number) ep1Var.f2549b.m4788d()).floatValue(), 0.0f, 1.0f);
                        }
                        C0306i9 c0306i9 = new C0306i9(i4, ep1Var);
                        r1.f530n = null;
                        r1.f529m = 1;
                        if (r33.mo1660a(c0306i9, r1) == k20Var11) {
                            return k20Var11;
                        }
                    } else {
                        if (i18 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj);
                    }
                    ep1Var.m1404b(null, (xm0) r1.f532p);
                    break;
                } catch (CancellationException unused) {
                    if (ep1Var.f2553f == fp1Var) {
                        ep1Var.m1406d(fp1.f3103h, new C0235gc(ep1Var, null));
                    }
                }
                return a83.f116a;
            case 11:
                a83 a83Var4 = a83.f116a;
                ep1 ep1Var2 = (ep1) r1.f532p;
                j20 j20Var3 = (j20) r1.f531o;
                k20 k20Var12 = k20.f5323h;
                int i19 = r1.f529m;
                if (i19 == 0) {
                    fg1.m1627T(obj);
                    M3745A = AbstractC0570p7.m3745A(j20Var3, null, new h50((Object) ep1Var2, (t00) (z4 ? 1 : 0), 7), 3);
                } else {
                    if (i19 != 1) {
                        if (i19 == 2) {
                            fg1.m1627T(obj);
                            return a83Var4;
                        }
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k21 k21Var = (k21) r1.f530n;
                    fg1.m1627T(obj);
                    M3745A = k21Var;
                }
                while (M3745A.mo1703b() && ((Number) ep1Var2.f2549b.m4788d()).floatValue() > 0.005f) {
                    nx0 nx0Var = new nx0(24);
                    r1.f531o = null;
                    r1.f530n = M3745A;
                    r1.f529m = 1;
                    a20 a20Var = r1.f11029i;
                    a20Var.getClass();
                    if (qp0.m4220A(a20Var).m6080a(nx0Var, r1) == k20Var12) {
                        return k20Var12;
                    }
                }
                r1.f531o = null;
                r1.f530n = null;
                r1.f529m = 2;
                M3745A.mo1704c(null);
                Object objMo1701A = M3745A.mo1701A(r1);
                if (objMo1701A != k20Var12) {
                    objMo1701A = a83Var4;
                }
                break;
            case 12:
                ci2 ci2Var = (ci2) r1.f531o;
                dq1 dq1Var = (dq1) r1.f530n;
                k20 k20Var13 = k20.f5323h;
                int i20 = r1.f529m;
                try {
                    if (i20 == 0) {
                        fg1.m1627T(obj);
                        ?? r42 = (wj2) dq1Var.f2147i;
                        String str3 = (String) r1.f532p;
                        r1.f529m = 1;
                        Object objM5925b = r42.m5925b(str3, ci2Var, r1);
                        obj2 = k20Var13;
                        r1 = objM5925b;
                        if (objM5925b != k20Var13) {
                            obj2 = objM5925b;
                            r1 = objM5925b;
                        }
                    } else {
                        if (i20 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj);
                        obj2 = obj;
                        r1 = r1;
                    }
                    return obj2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    C0043b5.m409x((C0043b5) dq1Var.f2148j, ph2.f8354k, vi0.m5691j("Message dispatch failed for event ", ci2Var.f1572a, "."), (String) r1.f532p, e2, 16);
                    return a83.f116a;
                }
            case 13:
                dq1 dq1Var2 = (dq1) r1.f531o;
                j20 j20Var4 = (j20) r1.f530n;
                k20 k20Var14 = k20.f5323h;
                int i21 = r1.f529m;
                if (i21 == 0) {
                    fg1.m1627T(obj);
                    ?? r5 = (wj2) dq1Var2.f2147i;
                    r1.f530n = j20Var4;
                    r1.f529m = 1;
                    objM5933k = r5.m5933k(r1);
                    if (objM5933k != k20Var14) {
                    }
                    return k20Var14;
                }
                if (i21 != 1) {
                    if (i21 == 2) {
                        fg1.m1627T(obj);
                        return obj;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
                objM5933k = obj;
                List list = ((yj2) objM5933k).f13492a;
                ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((me1) it.next()).f6584a);
                }
                ci2 ci2Var2 = (ci2) r1.f532p;
                ArrayList arrayList2 = new ArrayList(AbstractC0179eu.m1421B(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(AbstractC0570p7.m3775k(j20Var4, new C0040b2(dq1Var2, (String) it2.next(), ci2Var2, (t00) null)));
                }
                r1.f530n = null;
                r1.f529m = 2;
                Object objM3588k = op0.m3588k(arrayList2, r1);
                if (objM3588k != k20Var14) {
                    return objM3588k;
                }
                return k20Var14;
            case 14:
                k20 k20Var15 = k20.f5323h;
                int i22 = r1.f529m;
                if (i22 != 0) {
                    if (i22 == 1) {
                        fg1.m1627T(obj);
                        return a83.f116a;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
                j20 j20Var5 = (j20) r1.f530n;
                ?? r34 = (h62) r1.f531o;
                C0880xb c0880xb = (C0880xb) r1.f532p;
                r1.f529m = 1;
                r34.mo489e(j20Var5, c0880xb, r1);
                return k20Var15;
            case 15:
                String str4 = (String) r1.f530n;
                k20 k20Var16 = k20.f5323h;
                int i23 = r1.f529m;
                try {
                    if (i23 == 0) {
                        fg1.m1627T(obj);
                        ?? r35 = (wj2) r1.f531o;
                        xj2 xj2Var = xj2.f13062k;
                        r1.f532p = str4;
                        r1.f529m = 1;
                        Set set = wj2.f12541h;
                        objM5936n = r35.m5936n(str4, xj2Var, r1);
                        if (objM5936n == k20Var16) {
                            return k20Var16;
                        }
                        str = str4;
                    } else {
                        if (i23 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) r1.f532p;
                        fg1.m1627T(obj);
                        objM5936n = obj;
                    }
                    return new tk2(str, ((Boolean) objM5936n).booleanValue(), null);
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Throwable th4) {
                    return new tk2(str4, false, th4);
                }
            case 16:
                j20 j20Var6 = (j20) r1.f530n;
                k20 k20Var17 = k20.f5323h;
                int i24 = r1.f529m;
                if (i24 != 0) {
                    if (i24 == 1) {
                        fg1.m1627T(obj);
                        return obj;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fg1.m1627T(obj);
                List list2 = (List) r1.f531o;
                wj2 wj2Var = (wj2) r1.f532p;
                ArrayList arrayList3 = new ArrayList(AbstractC0179eu.m1421B(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(AbstractC0570p7.m3775k(j20Var6, new C0040b2((String) it3.next(), wj2Var, (t00) null)));
                }
                r1.f530n = null;
                r1.f529m = 1;
                Object objM3588k2 = op0.m3588k(arrayList3, r1);
                return objM3588k2 == k20Var17 ? k20Var17 : objM3588k2;
            case 17:
                k20 k20Var18 = k20.f5323h;
                int i25 = r1.f529m;
                if (i25 == 0) {
                    fg1.m1627T(obj);
                    gm2 gm2Var = (gm2) r1.f530n;
                    ?? r36 = (dc0) r1.f531o;
                    d62 d62Var = new d62(i3, gm2Var, (im2) r1.f532p);
                    r1.f529m = 1;
                    if (r36.mo12g(d62Var, r1) == k20Var18) {
                        return k20Var18;
                    }
                } else {
                    if (i25 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                return a83.f116a;
            case 18:
                k20 k20Var19 = k20.f5323h;
                int i26 = r1.f529m;
                if (i26 == 0) {
                    fg1.m1627T(obj);
                    kl2 kl2Var2 = (kl2) r1.f530n;
                    im2 im2Var = (im2) r1.f531o;
                    im2Var.f4697k = kl2Var2;
                    ?? r23 = (mn0) r1.f532p;
                    gm2 gm2Var2 = im2Var.f4698l;
                    r1.f529m = 1;
                    if (r23.mo12g(gm2Var2, r1) == k20Var19) {
                        return k20Var19;
                    }
                } else {
                    if (i26 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                return a83.f116a;
            case 19:
                k20 k20Var20 = k20.f5323h;
                int i27 = r1.f529m;
                if (i27 == 0) {
                    fg1.m1627T(obj);
                    j20 j20Var7 = (j20) r1.f530n;
                    ?? yb2Var2 = new yb2(new C0793v0(new hn2((gu2) r1.f531o, 1), null));
                    ha0 ha0Var = new ha0(i, (C0689sc) r1.f532p, j20Var7);
                    r1.f529m = 1;
                    if (yb2Var2.mo1660a(ha0Var, r1) == k20Var20) {
                        return k20Var20;
                    }
                } else {
                    if (i27 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                return a83.f116a;
            case AIChatConfig.MaxContextRounds /* 20 */:
                ?? r02 = (zj0) r1.f532p;
                a20 a20Var2 = (a20) r1.f531o;
                k20 k20Var21 = k20.f5323h;
                int i28 = r1.f529m;
                if (i28 == 0) {
                    fg1.m1627T(obj);
                    n32 n32Var2 = (n32) r1.f530n;
                    if (!t11.m5086l(a20Var2, zd0.f13837h)) {
                        C0003a2 c0003a22 = new C0003a2(r02, n32Var2, z5 ? 1 : 0, 25);
                        r1.f529m = 2;
                    } else {
                        ns2 ns2Var = new ns2(n32Var2, 0);
                        r1.f529m = 1;
                    }
                    break;
                } else {
                    if (i28 != 1 && i28 != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                return a83.f116a;
            case 21:
                a83 a83Var5 = a83.f116a;
                k20 k20Var22 = k20.f5323h;
                int i29 = r1.f529m;
                if (i29 == 0) {
                    fg1.m1627T(obj);
                    qz2 qz2Var = (qz2) r1.f530n;
                    x22 x22Var = (x22) r1.f531o;
                    long j = ((o12) r1.f532p).f7422c;
                    r1.f529m = 1;
                    qz2 qz2Var2 = new qz2(qz2Var.f9299o, qz2Var.f9300p, r1);
                    qz2Var2.f9297m = x22Var;
                    qz2Var2.f9298n = j;
                    if (qz2Var2.mo7r(a83Var5) == k20Var22) {
                        return k20Var22;
                    }
                } else {
                    if (i29 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                return a83Var5;
            case 22:
                k20 k20Var23 = k20.f5323h;
                int i30 = r1.f529m;
                if (i30 == 0) {
                    fg1.m1627T(obj);
                    j20Var = (j20) r1.f530n;
                    ?? r37 = (k21) r1.f531o;
                    r1.f530n = j20Var;
                    r1.f529m = 1;
                    if (r37.mo1701A(r1) != k20Var23) {
                    }
                    return k20Var23;
                }
                if (i30 != 1) {
                    if (i30 == 2) {
                        fg1.m1627T(obj);
                        return a83.f116a;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j20Var = (j20) r1.f530n;
                fg1.m1627T(obj);
                ?? r38 = (mn0) r1.f532p;
                r1.f530n = null;
                r1.f529m = 2;
                break;
            default:
                a83 a83Var6 = a83.f116a;
                fz2 fz2Var = (fz2) r1.f531o;
                k20 k20Var24 = k20.f5323h;
                int i31 = r1.f529m;
                try {
                } catch (Throwable th5) {
                    ?? r39 = fz2Var.f3206z;
                    if (r39 == 0) {
                        throw th5;
                    }
                    r1.f530n = th5;
                    r1.f529m = 4;
                    r39.mo5j(r1);
                    if (a83Var6 != k20Var24) {
                        throw th5;
                    }
                }
                if (i31 == 0) {
                    fg1.m1627T(obj);
                    ?? r03 = fz2Var.f3205y;
                    if (r03 != 0) {
                        r1.f529m = 1;
                        if (r03.mo5j(r1) == k20Var24) {
                        }
                        return k20Var24;
                    }
                } else {
                    if (i31 != 1) {
                        if (i31 == 2) {
                            fg1.m1627T(obj);
                            r0 = fz2Var.f3206z;
                            if (r0 != 0) {
                                r1.f529m = 3;
                                r0.mo5j(r1);
                                break;
                            }
                            return a83Var6;
                        }
                        if (i31 == 3) {
                            fg1.m1627T(obj);
                            return a83Var6;
                        }
                        if (i31 != 4) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th6 = (Throwable) r1.f530n;
                        fg1.m1627T(obj);
                        throw th6;
                    }
                    fg1.m1627T(obj);
                }
                ?? r04 = (zy2) r1.f532p;
                r1.f529m = 2;
                if (r04.mo1928a(fz2Var, r1) != k20Var24) {
                    r0 = fz2Var.f3206z;
                    if (r0 != 0) {
                    }
                    return a83Var6;
                }
                return k20Var24;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040b2(y33 y33Var, xk1 xk1Var, t00 t00Var) {
        super(2, t00Var);
        this.f528l = 2;
        this.f532p = y33Var;
        this.f530n = xk1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0040b2(Object obj, t00 t00Var, int i) {
        super(2, t00Var);
        this.f528l = i;
        this.f532p = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0040b2(Object obj, Object obj2, t00 t00Var, int i) {
        super(2, t00Var);
        this.f528l = i;
        this.f531o = obj;
        this.f532p = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0040b2(Object obj, Object obj2, Object obj3, t00 t00Var, int i) {
        super(2, t00Var);
        this.f528l = i;
        this.f530n = obj;
        this.f531o = obj2;
        this.f532p = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040b2(String str, xk1 xk1Var, t00 t00Var) {
        super(2, t00Var);
        this.f528l = 0;
        this.f532p = str;
        this.f531o = xk1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0040b2(String str, wj2 wj2Var, t00 t00Var) {
        super(2, t00Var);
        this.f528l = 15;
        this.f530n = str;
        this.f531o = wj2Var;
    }
}
