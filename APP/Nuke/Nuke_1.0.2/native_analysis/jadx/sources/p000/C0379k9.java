package p000;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import android.view.textclassifier.TextClassifier;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: k9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0379k9 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f5397l;

    /* JADX INFO: renamed from: m */
    public int f5398m;

    /* JADX INFO: renamed from: n */
    public Object f5399n;

    /* JADX INFO: renamed from: o */
    public Object f5400o;

    /* JADX INFO: renamed from: p */
    public Object f5401p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f5402q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0379k9(Object obj, Object obj2, Object obj3, Object obj4, t00 t00Var, int i) {
        super(2, t00Var);
        this.f5397l = i;
        this.f5399n = obj;
        this.f5400o = obj2;
        this.f5401p = obj3;
        this.f5402q = obj4;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) throws Throwable {
        int i = this.f5397l;
        k20 k20Var = k20.f5323h;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                ((C0379k9) mo13p((t00) obj2, (C0233ga) obj)).mo7r(a83Var);
                return k20Var;
            case 1:
                return ((C0379k9) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 2:
                return ((C0379k9) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 3:
                return ((C0379k9) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 4:
                return ((C0379k9) mo13p((t00) obj2, (nq2) obj)).mo7r(a83Var);
            case 5:
                return ((C0379k9) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((C0379k9) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
                return k20Var;
            case 7:
                return ((C0379k9) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 8:
                return ((C0379k9) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 9:
                return ((C0379k9) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 10:
                return ((C0379k9) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            default:
                return ((C0379k9) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f5397l;
        Object obj2 = this.f5402q;
        switch (i) {
            case 0:
                C0379k9 c0379k9 = new C0379k9((in0) this.f5400o, (C0416l9) this.f5401p, (m91) obj2, t00Var, 0);
                c0379k9.f5399n = obj;
                return c0379k9;
            case 1:
                return new C0379k9(this.f5399n, (C0689sc) this.f5400o, (xk1) this.f5401p, (xk1) obj2, t00Var, 1);
            case 2:
                C0379k9 c0379k92 = new C0379k9((xk1) obj2, (in0) this.f5400o, t00Var);
                c0379k92.f5399n = obj;
                return c0379k92;
            case 3:
                return new C0379k9((ScrollCaptureCallbackC0109cx) this.f5399n, (ScrollCaptureSession) this.f5400o, (Rect) this.f5401p, (Consumer) obj2, t00Var, 3);
            case 4:
                C0379k9 c0379k93 = new C0379k9((zj0) this.f5400o, (ju2) this.f5401p, (Float) obj2, t00Var, 4);
                c0379k93.f5399n = obj;
                return c0379k93;
            case 5:
                return new C0379k9((fu2) this.f5399n, (zj0) this.f5400o, (ju2) this.f5401p, (Float) obj2, t00Var, 5);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                C0379k9 c0379k94 = new C0379k9((xk1) this.f5401p, (cz0) obj2, t00Var, 6);
                c0379k94.f5399n = obj;
                return c0379k94;
            case 7:
                return new C0379k9((p02) this.f5401p, (mn0) obj2, t00Var, 7);
            case 8:
                C0379k9 c0379k95 = new C0379k9((in0) this.f5400o, (AtomicReference) this.f5401p, (mn0) obj2, t00Var, 8);
                c0379k95.f5399n = obj;
                return c0379k95;
            case 9:
                C0379k9 c0379k96 = new C0379k9((s12) this.f5400o, (nn0) this.f5401p, (j10) obj2, t00Var, 9);
                c0379k96.f5399n = obj;
                return c0379k96;
            case 10:
                C0379k9 c0379k97 = new C0379k9((d33) obj2, t00Var);
                c0379k97.f5399n = obj;
                return c0379k97;
            default:
                return new C0379k9((o72) this.f5399n, (i62) this.f5400o, (ia1) this.f5401p, (uf3) obj2, t00Var, 11);
        }
    }

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
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) throws Throwable {
        Object x92Var;
        Object objMo5j;
        Object objM911a;
        j20 j20Var;
        z62 z62Var;
        p02 p02Var;
        il1 il1Var;
        il1 il1Var2;
        TextClassifier textClassifier;
        Object objM1821f;
        il1 il1Var3;
        Object objM1821f2;
        ip2 ip2Var;
        ip2 ip2Var2;
        ip2 ip2Var3;
        Object objMo12g;
        j20 j20Var2;
        d33 d33Var;
        Object objMo1714w;
        j20 j20Var3;
        im2 im2Var;
        int i = this.f5397l;
        int i2 = 2;
        Object obj2 = a83.f116a;
        k20 k20Var = k20.f5323h;
        Object obj3 = this.f5402q;
        int i3 = 1;
        zt2 zt2Var = null;
        switch (i) {
            case 0:
                int i4 = this.f5398m;
                if (i4 == 0) {
                    fg1.m1627T(obj);
                    C0793v0 c0793v0 = new C0793v0((C0233ga) this.f5399n, (in0) this.f5400o, (C0416l9) this.f5401p, (m91) obj3, (t00) null, 1);
                    this.f5398m = 1;
                    if (AbstractC0731te.m5238u(c0793v0, this) == k20Var) {
                        return k20Var;
                    }
                } else {
                    if (i4 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                C0676s.m4644b();
                return null;
            case 1:
                C0689sc c0689sc = (C0689sc) this.f5400o;
                int i5 = this.f5398m;
                if (i5 == 0) {
                    fg1.m1627T(obj);
                    if (t11.m5086l(this.f5399n, c0689sc.f10026e.getValue())) {
                        return obj2;
                    }
                    C0689sc c0689sc2 = (C0689sc) this.f5400o;
                    Object obj4 = this.f5399n;
                    xk1 xk1Var = (xk1) this.f5401p;
                    qt2 qt2Var = AbstractC0768uc.f11225a;
                    InterfaceC0273hd interfaceC0273hd = (InterfaceC0273hd) xk1Var.getValue();
                    this.f5398m = 1;
                    if (C0689sc.m4787c(c0689sc2, obj4, interfaceC0273hd, null, this, 12) == k20Var) {
                        return k20Var;
                    }
                } else {
                    if (i5 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                qt2 qt2Var2 = AbstractC0768uc.f11225a;
                in0 in0Var = (in0) ((xk1) obj3).getValue();
                if (in0Var == null) {
                    return obj2;
                }
                in0Var.mo5j(c0689sc.m4788d());
                return obj2;
            case 2:
                xk1 xk1Var2 = (xk1) obj3;
                int i6 = this.f5398m;
                try {
                    if (i6 == 0) {
                        fg1.m1627T(obj);
                        xk1Var2.setValue(C0089cf.f1497a);
                        in0 in0Var2 = (in0) this.f5400o;
                        this.f5399n = null;
                        this.f5401p = xk1Var2;
                        this.f5398m = 1;
                        objMo5j = in0Var2.mo5j(this);
                        if (objMo5j == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i6 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xk1Var2 = (xk1) this.f5401p;
                        fg1.m1627T(obj);
                        objMo5j = obj;
                    }
                    x92Var = (C0473mt) objMo5j;
                    break;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                xk1Var2.setValue(y92.m6237a(x92Var) == null ? new C0128df((C0473mt) x92Var) : C0164ef.f2421a);
                return obj2;
            case 3:
                int i7 = this.f5398m;
                if (i7 == 0) {
                    fg1.m1627T(obj);
                    ScrollCaptureCallbackC0109cx scrollCaptureCallbackC0109cx = (ScrollCaptureCallbackC0109cx) this.f5399n;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.f5400o;
                    Rect rect = (Rect) this.f5401p;
                    d11 d11Var = new d11(rect.left, rect.top, rect.right, rect.bottom);
                    this.f5398m = 1;
                    objM911a = ScrollCaptureCallbackC0109cx.m911a(scrollCaptureCallbackC0109cx, scrollCaptureSession, d11Var, this);
                    if (objM911a == k20Var) {
                        return k20Var;
                    }
                } else {
                    if (i7 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                    objM911a = obj;
                }
                ((Consumer) obj3).accept(rp0.m4553n0((d11) objM911a));
                return obj2;
            case 4:
                ju2 ju2Var = (ju2) this.f5401p;
                nq2 nq2Var = (nq2) this.f5399n;
                int i8 = this.f5398m;
                if (i8 == 0) {
                    fg1.m1627T(obj);
                    int iOrdinal = nq2Var.ordinal();
                    if (iOrdinal == 0) {
                        zj0 zj0Var = (zj0) this.f5400o;
                        this.f5399n = null;
                        this.f5398m = 1;
                        return zj0Var.mo1660a(ju2Var, this) == k20Var ? k20Var : obj2;
                    }
                    if (iOrdinal == 1) {
                        return obj2;
                    }
                    if (iOrdinal == 2) {
                        Float f = (Float) obj3;
                        if (f == AbstractC0570p7.f7997f) {
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        ju2Var.m2576h(null, f);
                        return obj2;
                    }
                    c80.m675s();
                } else {
                    if (i8 == 1) {
                        fg1.m1627T(obj);
                        return obj2;
                    }
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 5:
                zj0 zj0Var2 = (zj0) this.f5400o;
                ju2 ju2Var2 = (ju2) this.f5401p;
                int i9 = this.f5398m;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            fg1.m1627T(obj);
                        } else if (i9 != 3 && i9 != 4) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    fg1.m1627T(obj);
                    return obj2;
                }
                fg1.m1627T(obj);
                fu2 fu2Var = (fu2) this.f5399n;
                if (fu2Var == oq2.f7796a) {
                    this.f5398m = 1;
                    if (zj0Var2.mo1660a(ju2Var2, this) != k20Var) {
                        return obj2;
                    }
                } else {
                    int i10 = 0;
                    t00 t00Var = null;
                    if (fu2Var == oq2.f7797b) {
                        kw2 kw2VarM3231f = ju2Var2.m3231f();
                        lk0 lk0Var = new lk0(i2, t00Var, i10);
                        this.f5398m = 2;
                        if (p40.m3736s(kw2VarM3231f, lk0Var, this) != k20Var) {
                        }
                    } else {
                        kw2 kw2VarM3231f2 = ju2Var2.m3231f();
                        eu2 eu2Var = new eu2(fu2Var, null);
                        int i11 = ik0.f4660a;
                        zd0 zd0Var = zd0.f13837h;
                        EnumC0283hn enumC0283hn = EnumC0283hn.f4084h;
                        zj0 zj0VarM3735r = p40.m3735r(p40.m3735r(new fk0(new C0470mq(eu2Var, kw2VarM3231f2, zd0Var, -2, enumC0283hn), new g62(i2, t00Var, i3), 1)));
                        C0379k9 c0379k9 = new C0379k9(zj0Var2, ju2Var2, (Float) obj3, t00Var, 4);
                        this.f5398m = 4;
                        AbstractC0286hq c0470mq = new C0470mq(new hk0(c0379k9, null), zj0VarM3735r, zd0Var, -2, enumC0283hn);
                        EnumC0283hn enumC0283hn2 = enumC0283hn;
                        a20 a20Var = c0470mq.f4106h;
                        zd0Var.mo14k(a20Var);
                        EnumC0283hn enumC0283hn3 = EnumC0283hn.f4084h;
                        EnumC0283hn enumC0283hn4 = c0470mq.f4108j;
                        int i12 = c0470mq.f4107i;
                        if (enumC0283hn2 == enumC0283hn3) {
                            if (i12 != -3 && i12 != -2 && (i10 = i12 + 0) < 0) {
                                i10 = Integer.MAX_VALUE;
                            }
                            enumC0283hn2 = enumC0283hn4;
                        }
                        if (!t11.m5086l(a20Var, a20Var) || i10 != i12 || enumC0283hn2 != enumC0283hn4) {
                            c0470mq = c0470mq.mo2016d(a20Var, i10, enumC0283hn2);
                        }
                        Object objMo1660a = c0470mq.mo1660a(jo1.f5129h, this);
                        if (objMo1660a != k20Var) {
                            objMo1660a = obj2;
                        }
                        if (objMo1660a != k20Var) {
                            objMo1660a = obj2;
                        }
                        if (objMo1660a != k20Var) {
                            return obj2;
                        }
                    }
                }
                return k20Var;
                this.f5398m = 3;
                if (zj0Var2.mo1660a(ju2Var2, this) != k20Var) {
                    return obj2;
                }
                return k20Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                int i13 = this.f5398m;
                if (i13 == 0) {
                    fg1.m1627T(obj);
                    j20 j20Var4 = (j20) this.f5399n;
                    z62 z62Var2 = new z62();
                    z62Var2.f13745h = 1.0f;
                    j20Var = j20Var4;
                    z62Var = z62Var2;
                } else if (i13 == 1) {
                    z62 z62Var3 = (z62) this.f5400o;
                    j20 j20Var5 = (j20) this.f5399n;
                    fg1.m1627T(obj);
                    z62Var = z62Var3;
                    j20Var = j20Var5;
                    if (z62Var.f13745h == 0.0f) {
                        yb2 yb2Var = new yb2(new C0793v0(new C0727ta(11, j20Var), null));
                        bz0 bz0Var = new bz0(2, null);
                        this.f5399n = j20Var;
                        this.f5400o = z62Var;
                        this.f5398m = 2;
                        if (p40.m3736s(yb2Var, bz0Var, this) == k20Var) {
                            return k20Var;
                        }
                    }
                } else {
                    if (i13 != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z62 z62Var4 = (z62) this.f5400o;
                    j20 j20Var6 = (j20) this.f5399n;
                    fg1.m1627T(obj);
                    z62Var = z62Var4;
                    j20Var = j20Var6;
                }
                C0575pc c0575pc = new C0575pc((xk1) this.f5401p, (cz0) obj3, z62Var, j20Var, 4);
                this.f5399n = j20Var;
                this.f5400o = z62Var;
                this.f5398m = 1;
                if (mo2508f().mo15o(gd3.f3447y) != null) {
                    c80.m664g();
                    return null;
                }
                if (qp0.m4220A(mo2508f()).m6080a(c0575pc, this) == k20Var) {
                    return k20Var;
                }
                if (z62Var.f13745h == 0.0f) {
                }
                C0575pc c0575pc2 = new C0575pc((xk1) this.f5401p, (cz0) obj3, z62Var, j20Var, 4);
                this.f5399n = j20Var;
                this.f5400o = z62Var;
                this.f5398m = 1;
                if (mo2508f().mo15o(gd3.f3447y) != null) {
                }
                break;
            case 7:
                int i14 = this.f5398m;
                try {
                    if (i14 == 0) {
                        fg1.m1627T(obj);
                        p02Var = (p02) this.f5401p;
                        kl1 kl1Var = p02Var.f7911e;
                        this.f5399n = kl1Var;
                        this.f5400o = p02Var;
                        this.f5398m = 1;
                        Object objM2720d = kl1Var.m2720d(this);
                        il1Var = kl1Var;
                        if (objM2720d != k20Var) {
                        }
                        return k20Var;
                    }
                    if (i14 != 1) {
                        if (i14 != 2) {
                            if (i14 == 3) {
                                fg1.m1627T(obj);
                                return obj;
                            }
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        il1Var2 = (il1) this.f5399n;
                        try {
                            fg1.m1627T(obj);
                            objM1821f = obj;
                            il1Var2 = il1Var2;
                            textClassifier = (TextClassifier) objM1821f;
                            il1Var3 = il1Var2;
                            ((kl1) il1Var3).m2722f(null);
                            C0003a2 c0003a2 = new C0003a2(textClassifier, (mn0) obj3, zt2Var, 20);
                            this.f5399n = null;
                            this.f5400o = null;
                            this.f5398m = 3;
                            objM1821f2 = ga3.m1821f(200L, c0003a2, this);
                            if (objM1821f2 != k20Var) {
                                return objM1821f2;
                            }
                            return k20Var;
                        } catch (Throwable th2) {
                            th = th2;
                            ((kl1) il1Var2).m2722f(null);
                            throw th;
                        }
                    }
                    p02Var = (p02) this.f5400o;
                    il1 il1Var4 = (il1) this.f5399n;
                    fg1.m1627T(obj);
                    il1Var = il1Var4;
                    textClassifier = p02Var.f7912f;
                    if (textClassifier != null) {
                        il1Var3 = il1Var;
                        if (textClassifier.isDestroyed()) {
                        }
                        ((kl1) il1Var3).m2722f(null);
                        C0003a2 c0003a22 = new C0003a2(textClassifier, (mn0) obj3, zt2Var, 20);
                        this.f5399n = null;
                        this.f5400o = null;
                        this.f5398m = 3;
                        objM1821f2 = ga3.m1821f(200L, c0003a22, this);
                        if (objM1821f2 != k20Var) {
                        }
                        return k20Var;
                    }
                    u80 u80Var = new u80(p02Var, zt2Var, i3);
                    this.f5399n = il1Var;
                    this.f5400o = null;
                    this.f5398m = 2;
                    objM1821f = ga3.m1821f(300L, u80Var, this);
                    if (objM1821f != k20Var) {
                        il1Var2 = il1Var;
                        textClassifier = (TextClassifier) objM1821f;
                        il1Var3 = il1Var2;
                        ((kl1) il1Var3).m2722f(null);
                        C0003a2 c0003a222 = new C0003a2(textClassifier, (mn0) obj3, zt2Var, 20);
                        this.f5399n = null;
                        this.f5400o = null;
                        this.f5398m = 3;
                        objM1821f2 = ga3.m1821f(200L, c0003a222, this);
                        if (objM1821f2 != k20Var) {
                        }
                    }
                    return k20Var;
                } catch (Throwable th3) {
                    th = th3;
                    il1Var2 = il1Var;
                    ((kl1) il1Var2).m2722f(null);
                    throw th;
                }
            case 8:
                AtomicReference atomicReference = (AtomicReference) this.f5401p;
                int i15 = this.f5398m;
                try {
                    if (i15 == 0) {
                        fg1.m1627T(obj);
                        j20 j20Var7 = (j20) this.f5399n;
                        ip2Var = new ip2(xe1.m6084B(j20Var7.mo705g()), ((in0) this.f5400o).mo5j(j20Var7));
                        ip2 ip2Var4 = (ip2) atomicReference.getAndSet(ip2Var);
                        if (ip2Var4 != null) {
                            k21 k21Var = ip2Var4.f4735a;
                            this.f5399n = ip2Var;
                            this.f5398m = 1;
                            k21Var.mo1704c(null);
                            Object objMo1701A = k21Var.mo1701A(this);
                            if (objMo1701A == k20Var) {
                                obj2 = objMo1701A;
                            }
                            if (obj2 == k20Var) {
                                return k20Var;
                            }
                            ip2Var2 = ip2Var;
                        }
                        Object obj5 = ip2Var.f4736b;
                        this.f5399n = ip2Var;
                        this.f5398m = 2;
                        objMo12g = ((mn0) obj3).mo12g(obj5, this);
                        if (objMo12g != k20Var) {
                            return k20Var;
                        }
                        ip2Var3 = ip2Var;
                        while (!atomicReference.compareAndSet(ip2Var3, null)) {
                        }
                        return objMo12g;
                    }
                    if (i15 != 1) {
                        if (i15 != 2) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ip2Var3 = (ip2) this.f5399n;
                        try {
                            fg1.m1627T(obj);
                            objMo12g = obj;
                            while (!atomicReference.compareAndSet(ip2Var3, null) && atomicReference.get() == ip2Var3) {
                            }
                            return objMo12g;
                        } catch (Throwable th4) {
                            th = th4;
                            while (!atomicReference.compareAndSet(ip2Var3, null)) {
                            }
                            throw th;
                        }
                    }
                    ip2Var2 = (ip2) this.f5399n;
                    fg1.m1627T(obj);
                    Object obj52 = ip2Var.f4736b;
                    this.f5399n = ip2Var;
                    this.f5398m = 2;
                    objMo12g = ((mn0) obj3).mo12g(obj52, this);
                    if (objMo12g != k20Var) {
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
                s12 s12Var = (s12) this.f5400o;
                int i16 = this.f5398m;
                if (i16 == 0) {
                    fg1.m1627T(obj);
                    v13 v13Var = new v13((j20) this.f5399n, new x22(s12Var), (nn0) this.f5401p, (j10) obj3, (t00) null);
                    this.f5398m = 1;
                    return sp0.m4958p(s12Var, v13Var, this) == k20Var ? k20Var : obj2;
                }
                if (i16 == 1) {
                    fg1.m1627T(obj);
                    return obj2;
                }
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 10:
                d33 d33Var2 = (d33) obj3;
                int i17 = this.f5398m;
                try {
                    if (i17 == 0) {
                        fg1.m1627T(obj);
                        j20Var2 = (j20) this.f5399n;
                    } else {
                        if (i17 == 1) {
                            im2Var = (im2) this.f5401p;
                            d33 d33Var3 = (d33) this.f5400o;
                            j20 j20Var8 = (j20) this.f5399n;
                            fg1.m1627T(obj);
                            d33Var = d33Var3;
                            j20Var3 = j20Var8;
                            objMo1714w = obj;
                            this.f5399n = j20Var3;
                            this.f5400o = null;
                            this.f5401p = null;
                            this.f5398m = 2;
                            if (d33.m936c(d33Var, im2Var, (b33) objMo1714w, this) != k20Var) {
                                j20Var2 = j20Var3;
                            }
                            return k20Var;
                        }
                        if (i17 != 2) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j20Var2 = (j20) this.f5399n;
                        fg1.m1627T(obj);
                    }
                    if (!xe1.m6091I(j20Var2.mo705g())) {
                        return obj2;
                    }
                    im2 im2Var2 = d33Var2.f4711a;
                    C0356jn c0356jn = d33Var2.f1857f;
                    this.f5399n = j20Var2;
                    this.f5400o = d33Var2;
                    this.f5401p = im2Var2;
                    this.f5398m = 1;
                    objMo1714w = c0356jn.mo1714w(this);
                    if (objMo1714w == k20Var) {
                        return k20Var;
                    }
                    j20Var3 = j20Var2;
                    im2Var = im2Var2;
                    d33Var = d33Var2;
                    this.f5399n = j20Var3;
                    this.f5400o = null;
                    this.f5401p = null;
                    this.f5398m = 2;
                    if (d33.m936c(d33Var, im2Var, (b33) objMo1714w, this) != k20Var) {
                    }
                    return k20Var;
                } finally {
                    d33Var2.f1858g = null;
                }
            default:
                uf3 uf3Var = (uf3) obj3;
                ia1 ia1Var = (ia1) this.f5401p;
                i62 i62Var = (i62) this.f5400o;
                int i18 = this.f5398m;
                try {
                    if (i18 == 0) {
                        fg1.m1627T(obj);
                        gi1 gi1Var = (gi1) ((o72) this.f5399n).f7574i;
                        if (gi1Var != null) {
                            gi1Var.f3534i = AbstractC0731te.m5206e(i62Var.f4314x);
                        }
                        this.f5398m = 1;
                        h62 h62Var = new h62(i62Var, null);
                        a20 a20Var2 = this.f11029i;
                        a20Var2.getClass();
                        Object objM3762R = AbstractC0570p7.m3762R(i62Var.f4291a, new C0793v0(i62Var, h62Var, qp0.m4220A(a20Var2), null, 5), this);
                        if (objM3762R != k20Var) {
                            objM3762R = obj2;
                        }
                        if (objM3762R != k20Var) {
                            objM3762R = obj2;
                        }
                        if (objM3762R == k20Var) {
                            return k20Var;
                        }
                    } else {
                        if (i18 != 1) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fg1.m1627T(obj);
                    }
                    return obj2;
                } finally {
                    ia1Var.getLifecycle().mo506b(uf3Var);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0379k9(d33 d33Var, t00 t00Var) {
        super(2, t00Var);
        this.f5397l = 10;
        this.f5402q = d33Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0379k9(Object obj, Object obj2, t00 t00Var, int i) {
        super(2, t00Var);
        this.f5397l = i;
        this.f5401p = obj;
        this.f5402q = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0379k9(Object obj, Object obj2, Object obj3, t00 t00Var, int i) {
        super(2, t00Var);
        this.f5397l = i;
        this.f5400o = obj;
        this.f5401p = obj2;
        this.f5402q = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0379k9(xk1 xk1Var, in0 in0Var, t00 t00Var) {
        super(2, t00Var);
        this.f5397l = 2;
        this.f5402q = xk1Var;
        this.f5400o = in0Var;
    }
}
