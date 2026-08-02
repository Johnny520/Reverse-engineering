package defpackage;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import android.view.textclassifier.TextClassifier;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k9 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public int m;
    public Object n;
    public Object o;
    public Object p;
    public final /* synthetic */ Object q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9(Object obj, Object obj2, Object obj3, Object obj4, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
        this.q = obj4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) throws Throwable {
        int i = this.l;
        k20 k20Var = k20.h;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                ((k9) p((t00) obj2, (ga) obj)).r(a83Var);
                return k20Var;
            case 1:
                return ((k9) p((t00) obj2, (j20) obj)).r(a83Var);
            case 2:
                return ((k9) p((t00) obj2, (j20) obj)).r(a83Var);
            case 3:
                return ((k9) p((t00) obj2, (j20) obj)).r(a83Var);
            case 4:
                return ((k9) p((t00) obj2, (nq2) obj)).r(a83Var);
            case 5:
                return ((k9) p((t00) obj2, (j20) obj)).r(a83Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((k9) p((t00) obj2, (j20) obj)).r(a83Var);
                return k20Var;
            case 7:
                return ((k9) p((t00) obj2, (j20) obj)).r(a83Var);
            case 8:
                return ((k9) p((t00) obj2, (j20) obj)).r(a83Var);
            case 9:
                return ((k9) p((t00) obj2, (j20) obj)).r(a83Var);
            case 10:
                return ((k9) p((t00) obj2, (j20) obj)).r(a83Var);
            default:
                return ((k9) p((t00) obj2, (j20) obj)).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                k9 k9Var = new k9((in0) this.o, (l9) this.p, (m91) obj2, t00Var, 0);
                k9Var.n = obj;
                return k9Var;
            case 1:
                return new k9(this.n, (sc) this.o, (xk1) this.p, (xk1) obj2, t00Var, 1);
            case 2:
                k9 k9Var2 = new k9((xk1) obj2, (in0) this.o, t00Var);
                k9Var2.n = obj;
                return k9Var2;
            case 3:
                return new k9((cx) this.n, (ScrollCaptureSession) this.o, (Rect) this.p, (Consumer) obj2, t00Var, 3);
            case 4:
                k9 k9Var3 = new k9((zj0) this.o, (ju2) this.p, (Float) obj2, t00Var, 4);
                k9Var3.n = obj;
                return k9Var3;
            case 5:
                return new k9((fu2) this.n, (zj0) this.o, (ju2) this.p, (Float) obj2, t00Var, 5);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                k9 k9Var4 = new k9((xk1) this.p, (cz0) obj2, t00Var, 6);
                k9Var4.n = obj;
                return k9Var4;
            case 7:
                return new k9((p02) this.p, (mn0) obj2, t00Var, 7);
            case 8:
                k9 k9Var5 = new k9((in0) this.o, (AtomicReference) this.p, (mn0) obj2, t00Var, 8);
                k9Var5.n = obj;
                return k9Var5;
            case 9:
                k9 k9Var6 = new k9((s12) this.o, (nn0) this.p, (j10) obj2, t00Var, 9);
                k9Var6.n = obj;
                return k9Var6;
            case 10:
                k9 k9Var7 = new k9((d33) obj2, t00Var);
                k9Var7.n = obj;
                return k9Var7;
            default:
                return new k9((o72) this.n, (i62) this.o, (ia1) this.p, (uf3) obj2, t00Var, 11);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:114:0x01d7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:299:? */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:321:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0195  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x02b7 -> B:148:0x0283). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x02d9 -> B:148:0x0283). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e5 -> B:42:0x00b2). Please report as a decompilation issue!!! */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) throws Throwable {
        Object x92Var;
        Object objJ;
        Object objA;
        j20 j20Var;
        z62 z62Var;
        p02 p02Var;
        il1 il1Var;
        il1 il1Var2;
        TextClassifier textClassifier;
        Object objF;
        il1 il1Var3;
        Object objF2;
        ip2 ip2Var;
        ip2 ip2Var2;
        ip2 ip2Var3;
        Object objG;
        j20 j20Var2;
        d33 d33Var;
        Object objW;
        j20 j20Var3;
        im2 im2Var;
        int i = this.l;
        int i2 = 2;
        Object obj2 = a83.a;
        k20 k20Var = k20.h;
        Object obj3 = this.q;
        int i3 = 1;
        zt2 zt2Var = null;
        switch (i) {
            case 0:
                int i4 = this.m;
                if (i4 == 0) {
                    fg1.T(obj);
                    v0 v0Var = new v0((ga) this.n, (in0) this.o, (l9) this.p, (m91) obj3, (t00) null, 1);
                    this.m = 1;
                    if (te.u(v0Var, this) == k20Var) {
                        return k20Var;
                    }
                } else {
                    if (i4 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                s.b();
                return null;
            case 1:
                sc scVar = (sc) this.o;
                int i5 = this.m;
                if (i5 == 0) {
                    fg1.T(obj);
                    if (t11.l(this.n, scVar.e.getValue())) {
                        return obj2;
                    }
                    sc scVar2 = (sc) this.o;
                    Object obj4 = this.n;
                    xk1 xk1Var = (xk1) this.p;
                    qt2 qt2Var = uc.a;
                    hd hdVar = (hd) xk1Var.getValue();
                    this.m = 1;
                    if (sc.c(scVar2, obj4, hdVar, null, this, 12) == k20Var) {
                        return k20Var;
                    }
                } else {
                    if (i5 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                qt2 qt2Var2 = uc.a;
                in0 in0Var = (in0) ((xk1) obj3).getValue();
                if (in0Var == null) {
                    return obj2;
                }
                in0Var.j(scVar.d());
                return obj2;
            case 2:
                xk1 xk1Var2 = (xk1) obj3;
                int i6 = this.m;
                try {
                    if (i6 == 0) {
                        fg1.T(obj);
                        xk1Var2.setValue(cf.a);
                        in0 in0Var2 = (in0) this.o;
                        this.n = null;
                        this.p = xk1Var2;
                        this.m = 1;
                        objJ = in0Var2.j(this);
                        if (objJ == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i6 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xk1Var2 = (xk1) this.p;
                        fg1.T(obj);
                        objJ = obj;
                    }
                    x92Var = (mt) objJ;
                    break;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                xk1Var2.setValue(y92.a(x92Var) == null ? new df((mt) x92Var) : ef.a);
                return obj2;
            case 3:
                int i7 = this.m;
                if (i7 == 0) {
                    fg1.T(obj);
                    cx cxVar = (cx) this.n;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.o;
                    Rect rect = (Rect) this.p;
                    d11 d11Var = new d11(rect.left, rect.top, rect.right, rect.bottom);
                    this.m = 1;
                    objA = cx.a(cxVar, scrollCaptureSession, d11Var, this);
                    if (objA == k20Var) {
                        return k20Var;
                    }
                } else {
                    if (i7 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                    objA = obj;
                }
                ((Consumer) obj3).accept(rp0.n0((d11) objA));
                return obj2;
            case 4:
                ju2 ju2Var = (ju2) this.p;
                nq2 nq2Var = (nq2) this.n;
                int i8 = this.m;
                if (i8 == 0) {
                    fg1.T(obj);
                    int iOrdinal = nq2Var.ordinal();
                    if (iOrdinal == 0) {
                        zj0 zj0Var = (zj0) this.o;
                        this.n = null;
                        this.m = 1;
                        return zj0Var.a(ju2Var, this) == k20Var ? k20Var : obj2;
                    }
                    if (iOrdinal == 1) {
                        return obj2;
                    }
                    if (iOrdinal == 2) {
                        Float f = (Float) obj3;
                        if (f == p7.f) {
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        ju2Var.h(null, f);
                        return obj2;
                    }
                    c80.s();
                } else {
                    if (i8 == 1) {
                        fg1.T(obj);
                        return obj2;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 5:
                zj0 zj0Var2 = (zj0) this.o;
                ju2 ju2Var2 = (ju2) this.p;
                int i9 = this.m;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            fg1.T(obj);
                        } else if (i9 != 3 && i9 != 4) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    fg1.T(obj);
                    return obj2;
                }
                fg1.T(obj);
                fu2 fu2Var = (fu2) this.n;
                if (fu2Var == oq2.a) {
                    this.m = 1;
                    if (zj0Var2.a(ju2Var2, this) != k20Var) {
                        return obj2;
                    }
                } else {
                    int i10 = 0;
                    t00 t00Var = null;
                    if (fu2Var == oq2.b) {
                        kw2 kw2VarF = ju2Var2.f();
                        lk0 lk0Var = new lk0(i2, t00Var, i10);
                        this.m = 2;
                        if (p40.s(kw2VarF, lk0Var, this) != k20Var) {
                        }
                    } else {
                        kw2 kw2VarF2 = ju2Var2.f();
                        eu2 eu2Var = new eu2(fu2Var, null);
                        int i11 = ik0.a;
                        zd0 zd0Var = zd0.h;
                        hn hnVar = hn.h;
                        zj0 zj0VarR = p40.r(p40.r(new fk0(new mq(eu2Var, kw2VarF2, zd0Var, -2, hnVar), new g62(i2, t00Var, i3), 1)));
                        k9 k9Var = new k9(zj0Var2, ju2Var2, (Float) obj3, t00Var, 4);
                        this.m = 4;
                        hq mqVar = new mq(new hk0(k9Var, null), zj0VarR, zd0Var, -2, hnVar);
                        hn hnVar2 = hnVar;
                        a20 a20Var = mqVar.h;
                        zd0Var.k(a20Var);
                        hn hnVar3 = hn.h;
                        hn hnVar4 = mqVar.j;
                        int i12 = mqVar.i;
                        if (hnVar2 == hnVar3) {
                            if (i12 != -3 && i12 != -2 && (i10 = i12 + 0) < 0) {
                                i10 = Integer.MAX_VALUE;
                            }
                            hnVar2 = hnVar4;
                        }
                        if (!t11.l(a20Var, a20Var) || i10 != i12 || hnVar2 != hnVar4) {
                            mqVar = mqVar.d(a20Var, i10, hnVar2);
                        }
                        Object objA2 = mqVar.a(jo1.h, this);
                        if (objA2 != k20Var) {
                            objA2 = obj2;
                        }
                        if (objA2 != k20Var) {
                            objA2 = obj2;
                        }
                        if (objA2 != k20Var) {
                            return obj2;
                        }
                    }
                }
                return k20Var;
                this.m = 3;
                if (zj0Var2.a(ju2Var2, this) != k20Var) {
                    return obj2;
                }
                return k20Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                int i13 = this.m;
                if (i13 == 0) {
                    fg1.T(obj);
                    j20 j20Var4 = (j20) this.n;
                    z62 z62Var2 = new z62();
                    z62Var2.h = 1.0f;
                    j20Var = j20Var4;
                    z62Var = z62Var2;
                } else if (i13 == 1) {
                    z62 z62Var3 = (z62) this.o;
                    j20 j20Var5 = (j20) this.n;
                    fg1.T(obj);
                    z62Var = z62Var3;
                    j20Var = j20Var5;
                    if (z62Var.h == 0.0f) {
                        yb2 yb2Var = new yb2(new v0(new ta(11, j20Var), null));
                        bz0 bz0Var = new bz0(2, null);
                        this.n = j20Var;
                        this.o = z62Var;
                        this.m = 2;
                        if (p40.s(yb2Var, bz0Var, this) == k20Var) {
                            return k20Var;
                        }
                    }
                } else {
                    if (i13 != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z62 z62Var4 = (z62) this.o;
                    j20 j20Var6 = (j20) this.n;
                    fg1.T(obj);
                    z62Var = z62Var4;
                    j20Var = j20Var6;
                }
                pc pcVar = new pc((xk1) this.p, (cz0) obj3, z62Var, j20Var, 4);
                this.n = j20Var;
                this.o = z62Var;
                this.m = 1;
                if (f().o(gd3.y) != null) {
                    c80.g();
                    return null;
                }
                if (qp0.A(f()).a(pcVar, this) == k20Var) {
                    return k20Var;
                }
                if (z62Var.h == 0.0f) {
                }
                pc pcVar2 = new pc((xk1) this.p, (cz0) obj3, z62Var, j20Var, 4);
                this.n = j20Var;
                this.o = z62Var;
                this.m = 1;
                if (f().o(gd3.y) != null) {
                }
                break;
            case 7:
                int i14 = this.m;
                try {
                    if (i14 == 0) {
                        fg1.T(obj);
                        p02Var = (p02) this.p;
                        kl1 kl1Var = p02Var.e;
                        this.n = kl1Var;
                        this.o = p02Var;
                        this.m = 1;
                        Object objD = kl1Var.d(this);
                        il1Var = kl1Var;
                        if (objD != k20Var) {
                        }
                        return k20Var;
                    }
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                fg1.T(obj);
                                return obj;
                            }
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        il1Var2 = (il1) this.n;
                        try {
                            fg1.T(obj);
                            objF = obj;
                            il1Var2 = il1Var2;
                            textClassifier = (TextClassifier) objF;
                            il1Var3 = il1Var2;
                            ((kl1) il1Var3).f(null);
                            a2 a2Var = new a2(textClassifier, (mn0) obj3, zt2Var, 20);
                            this.n = null;
                            this.o = null;
                            this.m = 3;
                            objF2 = ga3.f(200L, a2Var, this);
                            if (objF2 != k20Var) {
                                return objF2;
                            }
                            return k20Var;
                        } catch (Throwable th2) {
                            th = th2;
                            ((kl1) il1Var2).f(null);
                            throw th;
                        }
                    }
                    p02Var = (p02) this.o;
                    il1 il1Var4 = (il1) this.n;
                    fg1.T(obj);
                    il1Var = il1Var4;
                    textClassifier = p02Var.f;
                    if (textClassifier != null) {
                        il1Var3 = il1Var;
                        if (textClassifier.isDestroyed()) {
                        }
                        ((kl1) il1Var3).f(null);
                        a2 a2Var2 = new a2(textClassifier, (mn0) obj3, zt2Var, 20);
                        this.n = null;
                        this.o = null;
                        this.m = 3;
                        objF2 = ga3.f(200L, a2Var2, this);
                        if (objF2 != k20Var) {
                        }
                        return k20Var;
                    }
                    u80 u80Var = new u80(p02Var, zt2Var, i3);
                    this.n = il1Var;
                    this.o = null;
                    this.m = 2;
                    objF = ga3.f(300L, u80Var, this);
                    if (objF != k20Var) {
                        il1Var2 = il1Var;
                        textClassifier = (TextClassifier) objF;
                        il1Var3 = il1Var2;
                        ((kl1) il1Var3).f(null);
                        a2 a2Var22 = new a2(textClassifier, (mn0) obj3, zt2Var, 20);
                        this.n = null;
                        this.o = null;
                        this.m = 3;
                        objF2 = ga3.f(200L, a2Var22, this);
                        if (objF2 != k20Var) {
                        }
                    }
                    return k20Var;
                } catch (Throwable th3) {
                    th = th3;
                    il1Var2 = il1Var;
                    ((kl1) il1Var2).f(null);
                    throw th;
                }
            case 8:
                AtomicReference atomicReference = (AtomicReference) this.p;
                int i15 = this.m;
                try {
                    if (i15 == 0) {
                        fg1.T(obj);
                        j20 j20Var7 = (j20) this.n;
                        ip2Var = new ip2(xe1.B(j20Var7.g()), ((in0) this.o).j(j20Var7));
                        ip2 ip2Var4 = (ip2) atomicReference.getAndSet(ip2Var);
                        if (ip2Var4 != null) {
                            k21 k21Var = ip2Var4.a;
                            this.n = ip2Var;
                            this.m = 1;
                            k21Var.c(null);
                            Object objA3 = k21Var.A(this);
                            if (objA3 == k20Var) {
                                obj2 = objA3;
                            }
                            if (obj2 == k20Var) {
                                return k20Var;
                            }
                            ip2Var2 = ip2Var;
                        }
                        Object obj5 = ip2Var.b;
                        this.n = ip2Var;
                        this.m = 2;
                        objG = ((mn0) obj3).g(obj5, this);
                        if (objG != k20Var) {
                            return k20Var;
                        }
                        ip2Var3 = ip2Var;
                        while (!atomicReference.compareAndSet(ip2Var3, null)) {
                        }
                        return objG;
                    }
                    if (i15 != 1) {
                        if (i15 != 2) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ip2Var3 = (ip2) this.n;
                        try {
                            fg1.T(obj);
                            objG = obj;
                            while (!atomicReference.compareAndSet(ip2Var3, null) && atomicReference.get() == ip2Var3) {
                            }
                            return objG;
                        } catch (Throwable th4) {
                            th = th4;
                            while (!atomicReference.compareAndSet(ip2Var3, null)) {
                            }
                            throw th;
                        }
                    }
                    ip2Var2 = (ip2) this.n;
                    fg1.T(obj);
                    Object obj52 = ip2Var.b;
                    this.n = ip2Var;
                    this.m = 2;
                    objG = ((mn0) obj3).g(obj52, this);
                    if (objG != k20Var) {
                    }
                } catch (Throwable th5) {
                    th = th5;
                    ip2Var3 = ip2Var;
                    while (!atomicReference.compareAndSet(ip2Var3, null) && atomicReference.get() == ip2Var3) {
                    }
                    throw th;
                }
                ip2Var = ip2Var2;
                break;
            case 9:
                s12 s12Var = (s12) this.o;
                int i16 = this.m;
                if (i16 == 0) {
                    fg1.T(obj);
                    v13 v13Var = new v13((j20) this.n, new x22(s12Var), (nn0) this.p, (j10) obj3, (t00) null);
                    this.m = 1;
                    return sp0.p(s12Var, v13Var, this) == k20Var ? k20Var : obj2;
                }
                if (i16 == 1) {
                    fg1.T(obj);
                    return obj2;
                }
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                d33 d33Var2 = (d33) obj3;
                int i17 = this.m;
                try {
                    if (i17 == 0) {
                        fg1.T(obj);
                        j20Var2 = (j20) this.n;
                    } else {
                        if (i17 == 1) {
                            im2Var = (im2) this.p;
                            d33 d33Var3 = (d33) this.o;
                            j20 j20Var8 = (j20) this.n;
                            fg1.T(obj);
                            d33Var = d33Var3;
                            j20Var3 = j20Var8;
                            objW = obj;
                            this.n = j20Var3;
                            this.o = null;
                            this.p = null;
                            this.m = 2;
                            if (d33.c(d33Var, im2Var, (b33) objW, this) != k20Var) {
                                j20Var2 = j20Var3;
                            }
                            return k20Var;
                        }
                        if (i17 != 2) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j20Var2 = (j20) this.n;
                        fg1.T(obj);
                    }
                    if (!xe1.I(j20Var2.g())) {
                        return obj2;
                    }
                    im2 im2Var2 = d33Var2.a;
                    jn jnVar = d33Var2.f;
                    this.n = j20Var2;
                    this.o = d33Var2;
                    this.p = im2Var2;
                    this.m = 1;
                    objW = jnVar.w(this);
                    if (objW == k20Var) {
                        return k20Var;
                    }
                    j20Var3 = j20Var2;
                    im2Var = im2Var2;
                    d33Var = d33Var2;
                    this.n = j20Var3;
                    this.o = null;
                    this.p = null;
                    this.m = 2;
                    if (d33.c(d33Var, im2Var, (b33) objW, this) != k20Var) {
                    }
                    return k20Var;
                } finally {
                    d33Var2.g = null;
                }
            default:
                uf3 uf3Var = (uf3) obj3;
                ia1 ia1Var = (ia1) this.p;
                i62 i62Var = (i62) this.o;
                int i18 = this.m;
                try {
                    if (i18 == 0) {
                        fg1.T(obj);
                        gi1 gi1Var = (gi1) ((o72) this.n).i;
                        if (gi1Var != null) {
                            gi1Var.i = te.e(i62Var.x);
                        }
                        this.m = 1;
                        h62 h62Var = new h62(i62Var, null);
                        a20 a20Var2 = this.i;
                        a20Var2.getClass();
                        Object objR = p7.R(i62Var.a, new v0(i62Var, h62Var, qp0.A(a20Var2), null, 5), this);
                        if (objR != k20Var) {
                            objR = obj2;
                        }
                        if (objR != k20Var) {
                            objR = obj2;
                        }
                        if (objR == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i18 != 1) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.T(obj);
                    }
                    return obj2;
                } finally {
                    ia1Var.getLifecycle().b(uf3Var);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(d33 d33Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 10;
        this.q = d33Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9(Object obj, Object obj2, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.p = obj;
        this.q = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9(Object obj, Object obj2, Object obj3, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(xk1 xk1Var, in0 in0Var, t00 t00Var) {
        super(2, t00Var);
        this.l = 2;
        this.q = xk1Var;
        this.o = in0Var;
    }
}
