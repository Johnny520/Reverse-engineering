package p047I0;

import android.view.View;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import me.dartcv.nuke.BuildConfig;
import p000A.C0024M;
import p000A.C0039U;
import p002A1.InterfaceC0145r;
import p051J.C0810b;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1049g;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p095T.AbstractC1385s;
import p095T.C1398y0;
import p095T.C1400z0;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.C2136g0;
import p160f3.C2155q;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p172h3.C2242b;
import p172h3.C2249i;
import p172h3.InterfaceC2247g;
import p178i3.InterfaceC2316A;
import p184j3.C2392k;
import p203n.C2622E;
import p203n.C2623F;
import p203n.C2647c;
import p203n.EnumC2621D;
import p207n3.C2695c;
import p207n3.InterfaceC2693a;
import p216p.C2826T;
import p216p.C2828V;
import p216p.EnumC2824Q;

/* JADX INFO: renamed from: I0.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0724e1 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2286h = 0;

    /* JADX INFO: renamed from: i */
    public int f2287i;

    /* JADX INFO: renamed from: j */
    public Object f2288j;

    /* JADX INFO: renamed from: k */
    public Object f2289k;

    /* JADX INFO: renamed from: l */
    public Object f2290l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f2291m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f2292n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f2293o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0724e1(C1675t c1675t, C1400z0 c1400z0, InterfaceC0145r interfaceC0145r, C0727f1 c0727f1, View view, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2289k = c1675t;
        this.f2290l = c1400z0;
        this.f2291m = interfaceC0145r;
        this.f2292n = c0727f1;
        this.f2293o = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f2286h) {
        }
        return ((C0724e1) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v1, types: [Q2.i, W2.c] */
    /* JADX WARN: Type inference failed for: r2v3, types: [Q2.i, W2.c] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f2286h) {
            case 0:
                C0724e1 c0724e1 = new C0724e1((C1675t) this.f2289k, (C1400z0) this.f2290l, (InterfaceC0145r) this.f2291m, (C0727f1) this.f2292n, (View) this.f2293o, interfaceC1046d);
                c0724e1.f2288j = obj;
                return c0724e1;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0724e1 c0724e12 = new C0724e1((InterfaceC2247g) this.f2290l, (C2647c) this.f2291m, (InterfaceC1347Y) this.f2292n, (InterfaceC1347Y) this.f2293o, interfaceC1046d);
                c0724e12.f2288j = obj;
                return c0724e12;
            case 2:
                C0724e1 c0724e13 = new C0724e1((C2623F) this.f2292n, (InterfaceC1601c) this.f2293o, interfaceC1046d);
                c0724e13.f2291m = obj;
                return c0724e13;
            default:
                C0724e1 c0724e14 = new C0724e1((C2828V) this.f2292n, (InterfaceC1601c) this.f2293o, interfaceC1046d);
                c0724e14.f2291m = obj;
                return c0724e14;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2 A[Catch: all -> 0x00b2, TryCatch #1 {all -> 0x00b2, blocks: (B:25:0x009c, B:26:0x009e, B:29:0x00a5, B:37:0x00ba, B:38:0x00bc, B:40:0x00c2, B:43:0x00c9), top: B:167:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b9 A[Catch: all -> 0x01a9, TryCatch #5 {all -> 0x01a9, blocks: (B:79:0x0193, B:80:0x0195, B:83:0x019c, B:91:0x01b1, B:92:0x01b3, B:94:0x01b9, B:97:0x01c0), top: B:174:0x00db }] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [W2.c] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27, types: [W2.c] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0206 -> B:113:0x0209). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) throws Throwable {
        Throwable th;
        InterfaceC2115S interfaceC2115S;
        C2136g0 c2136g0M3994p;
        C2242b it;
        InterfaceC2160t interfaceC2160t;
        EnumC1152a enumC1152a;
        C2622E c2622e;
        ?? r12;
        InterfaceC2693a interfaceC2693a;
        C2623F c2623f;
        C2623F c2623f2;
        Throwable th2;
        C2622E c2622e2;
        InterfaceC2693a interfaceC2693a2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        C2826T c2826t;
        ?? r13;
        InterfaceC2693a interfaceC2693a3;
        C2828V c2828v;
        C2828V c2828v2;
        Throwable th3;
        C2826T c2826t2;
        InterfaceC2693a interfaceC2693a4;
        AtomicReference atomicReference3;
        AtomicReference atomicReference4;
        switch (this.f2286h) {
            case 0:
                C0727f1 c0727f1 = (C0727f1) this.f2292n;
                InterfaceC0145r interfaceC0145r = (InterfaceC0145r) this.f2291m;
                int i5 = this.f2287i;
                C0891q c0891q = C0891q.f2780a;
                InterfaceC1046d interfaceC1046d = null;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC2115S = (InterfaceC2115S) this.f2288j;
                    try {
                        AbstractC1784a.m3205S(obj);
                        if (interfaceC2115S != null) {
                            interfaceC2115S.mo3905c(null);
                        }
                        interfaceC0145r.getLifecycle().mo185b(c0727f1);
                        return c0891q;
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        if (interfaceC2115S != null) {
                        }
                        interfaceC0145r.getLifecycle().mo185b(c0727f1);
                        throw th;
                    }
                }
                AbstractC1784a.m3205S(obj);
                InterfaceC2160t interfaceC2160t2 = (InterfaceC2160t) this.f2288j;
                try {
                    C0670F0 c0670f0 = (C0670F0) ((C1675t) this.f2289k).f5710e;
                    if (c0670f0 != null) {
                        InterfaceC2316A interfaceC2316AM1232a = AbstractC0736i1.m1232a(((View) this.f2293o).getContext().getApplicationContext());
                        c0670f0.f2150d.m2508h(((Number) interfaceC2316AM1232a.getValue()).floatValue());
                        c2136g0M3994p = AbstractC2162v.m3994p(interfaceC2160t2, null, new C0039U(interfaceC2316AM1232a, c0670f0, interfaceC1046d, 3), 3);
                    } else {
                        c2136g0M3994p = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    interfaceC2115S = null;
                }
                try {
                    C1400z0 c1400z0 = (C1400z0) this.f2290l;
                    this.f2288j = c2136g0M3994p;
                    this.f2287i = 1;
                    C1398y0 c1398y0 = new C1398y0(c1400z0, null);
                    InterfaceC1051i interfaceC1051i = this.f3866e;
                    AbstractC1665j.m2982b(interfaceC1051i);
                    Object objM4001w = AbstractC2162v.m4001w(c1400z0.f4995a, new C0024M(c1400z0, c1398y0, AbstractC1385s.m2626p(interfaceC1051i), null), this);
                    EnumC1152a enumC1152a2 = EnumC1152a.f3788d;
                    if (objM4001w != enumC1152a2) {
                        objM4001w = c0891q;
                    }
                    if (objM4001w != enumC1152a2) {
                        objM4001w = c0891q;
                    }
                    if (objM4001w == enumC1152a2) {
                        return enumC1152a2;
                    }
                    interfaceC2115S = c2136g0M3994p;
                    if (interfaceC2115S != null) {
                    }
                    interfaceC0145r.getLifecycle().mo185b(c0727f1);
                    return c0891q;
                } catch (Throwable th6) {
                    th = th6;
                    interfaceC2115S = c2136g0M3994p;
                    th = th;
                    if (interfaceC2115S != null) {
                    }
                    interfaceC0145r.getLifecycle().mo185b(c0727f1);
                    throw th;
                }
                if (interfaceC2115S != null) {
                    interfaceC2115S.mo3905c(null);
                }
                interfaceC0145r.getLifecycle().mo185b(c0727f1);
                throw th;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC2247g interfaceC2247g = (InterfaceC2247g) this.f2290l;
                int i6 = this.f2287i;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    InterfaceC2160t interfaceC2160t3 = (InterfaceC2160t) this.f2288j;
                    it = interfaceC2247g.iterator();
                    interfaceC2160t = interfaceC2160t3;
                    this.f2288j = interfaceC2160t;
                    this.f2289k = it;
                    this.f2287i = 1;
                    obj = it.m4068b(this);
                    enumC1152a = EnumC1152a.f3788d;
                    if (obj == enumC1152a) {
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (C2242b) this.f2289k;
                    interfaceC2160t = (InterfaceC2160t) this.f2288j;
                    AbstractC1784a.m3205S(obj);
                    if (((Boolean) obj).booleanValue()) {
                        Object objM4069c = it.m4069c();
                        Object objMo4082g = interfaceC2247g.mo4082g();
                        if (objMo4082g instanceof C2249i) {
                            objMo4082g = null;
                        }
                        AbstractC2162v.m3994p(interfaceC2160t, null, new C0810b(objMo4082g == null ? objM4069c : objMo4082g, (C2647c) this.f2291m, (InterfaceC1347Y) this.f2292n, (InterfaceC1347Y) this.f2293o, null, 6), 3);
                        this.f2288j = interfaceC2160t;
                        this.f2289k = it;
                        this.f2287i = 1;
                        obj = it.m4068b(this);
                        enumC1152a = EnumC1152a.f3788d;
                        if (obj == enumC1152a) {
                            return enumC1152a;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            return C0891q.f2780a;
                        }
                    }
                }
                break;
            case 2:
                C2623F c2623f3 = (C2623F) this.f2292n;
                int i7 = this.f2287i;
                EnumC1152a enumC1152a3 = EnumC1152a.f3788d;
                try {
                    try {
                        if (i7 == 0) {
                            AbstractC1784a.m3205S(obj);
                            InterfaceC1049g interfaceC1049gMo1166C = ((InterfaceC2160t) this.f2291m).mo1202f().mo1166C(C2155q.f7102e);
                            AbstractC1665j.m2982b(interfaceC1049gMo1166C);
                            C2622E c2622e3 = new C2622E((InterfaceC2115S) interfaceC1049gMo1166C);
                            AtomicReference atomicReference5 = c2623f3.f8334a;
                            while (true) {
                                C2622E c2622e4 = (C2622E) atomicReference5.get();
                                if (c2622e4 != null) {
                                    EnumC2621D enumC2621D = EnumC2621D.f8331d;
                                    if (enumC2621D.compareTo(enumC2621D) < 0) {
                                        throw new CancellationException("Current mutation had a higher priority");
                                    }
                                }
                                while (!atomicReference5.compareAndSet(c2622e4, c2622e3)) {
                                    if (atomicReference5.get() != c2622e4) {
                                    }
                                    break;
                                }
                                if (c2622e4 != null) {
                                    c2622e4.f8333a.mo3905c(new C2392k("Mutation interrupted", 1));
                                }
                                C2695c c2695c = c2623f3.f8335b;
                                AbstractC1184i abstractC1184i = (AbstractC1184i) this.f2293o;
                                this.f2291m = c2622e3;
                                this.f2289k = c2695c;
                                this.f2288j = abstractC1184i;
                                this.f2290l = c2623f3;
                                this.f2287i = 1;
                                if (c2695c.m4691d(this) == enumC1152a3) {
                                    return enumC1152a3;
                                }
                                c2622e = c2622e3;
                                r12 = abstractC1184i;
                                interfaceC2693a = c2695c;
                            }
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c2623f2 = (C2623F) this.f2288j;
                                interfaceC2693a2 = (InterfaceC2693a) this.f2289k;
                                c2622e2 = (C2622E) this.f2291m;
                                try {
                                    AbstractC1784a.m3205S(obj);
                                    atomicReference2 = c2623f2.f8334a;
                                    while (!atomicReference2.compareAndSet(c2622e2, null) && atomicReference2.get() == c2622e2) {
                                    }
                                    ((C2695c) interfaceC2693a2).m4693f(null);
                                    return obj;
                                } catch (Throwable th7) {
                                    th2 = th7;
                                    atomicReference = c2623f2.f8334a;
                                    while (!atomicReference.compareAndSet(c2622e2, null)) {
                                        if (atomicReference.get() != c2622e2) {
                                            throw th2;
                                        }
                                    }
                                    throw th2;
                                }
                            }
                            c2623f3 = (C2623F) this.f2290l;
                            InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f2288j;
                            interfaceC2693a = (InterfaceC2693a) this.f2289k;
                            c2622e = (C2622E) this.f2291m;
                            AbstractC1784a.m3205S(obj);
                            r12 = interfaceC1601c;
                        }
                        this.f2291m = c2622e;
                        this.f2289k = interfaceC2693a;
                        this.f2288j = c2623f;
                        this.f2290l = null;
                        this.f2287i = 2;
                        Object objMo1h = r12.mo1h(this);
                        if (objMo1h == enumC1152a3) {
                            return enumC1152a3;
                        }
                        c2623f2 = c2623f;
                        obj = objMo1h;
                        interfaceC2693a2 = interfaceC2693a;
                        c2622e2 = c2622e;
                        atomicReference2 = c2623f2.f8334a;
                        while (!atomicReference2.compareAndSet(c2622e2, null)) {
                        }
                        ((C2695c) interfaceC2693a2).m4693f(null);
                        return obj;
                    } catch (Throwable th8) {
                        c2623f2 = c2623f;
                        th2 = th8;
                        c2622e2 = c2622e;
                        atomicReference = c2623f2.f8334a;
                        while (!atomicReference.compareAndSet(c2622e2, null)) {
                        }
                        throw th2;
                    }
                    c2623f = c2623f3;
                } catch (Throwable th9) {
                    ((C2695c) 2).m4693f(null);
                    throw th9;
                }
                break;
            default:
                C2828V c2828v3 = (C2828V) this.f2292n;
                int i8 = this.f2287i;
                EnumC1152a enumC1152a4 = EnumC1152a.f3788d;
                try {
                    try {
                        if (i8 == 0) {
                            AbstractC1784a.m3205S(obj);
                            InterfaceC1049g interfaceC1049gMo1166C2 = ((InterfaceC2160t) this.f2291m).mo1202f().mo1166C(C2155q.f7102e);
                            AbstractC1665j.m2982b(interfaceC1049gMo1166C2);
                            C2826T c2826t3 = new C2826T(EnumC2824Q.f8890d, (InterfaceC2115S) interfaceC1049gMo1166C2);
                            C2828V.m5025a(c2828v3, c2826t3);
                            C2695c c2695c2 = c2828v3.f8906b;
                            AbstractC1184i abstractC1184i2 = (AbstractC1184i) this.f2293o;
                            this.f2291m = c2826t3;
                            this.f2289k = c2695c2;
                            this.f2288j = abstractC1184i2;
                            this.f2290l = c2828v3;
                            this.f2287i = 1;
                            if (c2695c2.m4691d(this) == enumC1152a4) {
                                return enumC1152a4;
                            }
                            c2826t = c2826t3;
                            r13 = abstractC1184i2;
                            interfaceC2693a3 = c2695c2;
                        } else {
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c2828v2 = (C2828V) this.f2288j;
                                interfaceC2693a4 = (InterfaceC2693a) this.f2289k;
                                c2826t2 = (C2826T) this.f2291m;
                                try {
                                    AbstractC1784a.m3205S(obj);
                                    atomicReference4 = c2828v2.f8905a;
                                    while (!atomicReference4.compareAndSet(c2826t2, null) && atomicReference4.get() == c2826t2) {
                                    }
                                    ((C2695c) interfaceC2693a4).m4693f(null);
                                    return obj;
                                } catch (Throwable th10) {
                                    th3 = th10;
                                    atomicReference3 = c2828v2.f8905a;
                                    while (!atomicReference3.compareAndSet(c2826t2, null)) {
                                    }
                                    throw th3;
                                }
                            }
                            c2828v3 = (C2828V) this.f2290l;
                            InterfaceC1601c interfaceC1601c2 = (InterfaceC1601c) this.f2288j;
                            interfaceC2693a3 = (InterfaceC2693a) this.f2289k;
                            c2826t = (C2826T) this.f2291m;
                            AbstractC1784a.m3205S(obj);
                            r13 = interfaceC1601c2;
                        }
                        this.f2291m = c2826t;
                        this.f2289k = interfaceC2693a3;
                        this.f2288j = c2828v;
                        this.f2290l = null;
                        this.f2287i = 2;
                        Object objMo1h2 = r13.mo1h(this);
                        if (objMo1h2 == enumC1152a4) {
                            return enumC1152a4;
                        }
                        c2828v2 = c2828v;
                        obj = objMo1h2;
                        interfaceC2693a4 = interfaceC2693a3;
                        c2826t2 = c2826t;
                        atomicReference4 = c2828v2.f8905a;
                        while (!atomicReference4.compareAndSet(c2826t2, null)) {
                        }
                        ((C2695c) interfaceC2693a4).m4693f(null);
                        return obj;
                    } catch (Throwable th11) {
                        c2828v2 = c2828v;
                        th3 = th11;
                        c2826t2 = c2826t;
                        atomicReference3 = c2828v2.f8905a;
                        while (!atomicReference3.compareAndSet(c2826t2, null)) {
                            if (atomicReference3.get() != c2826t2) {
                                throw th3;
                            }
                        }
                        throw th3;
                    }
                    c2828v = c2828v3;
                } catch (Throwable th12) {
                    ((C2695c) 2).m4693f(null);
                    throw th12;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0724e1(InterfaceC2247g interfaceC2247g, C2647c c2647c, InterfaceC1347Y interfaceC1347Y, InterfaceC1347Y interfaceC1347Y2, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2290l = interfaceC2247g;
        this.f2291m = c2647c;
        this.f2292n = interfaceC1347Y;
        this.f2293o = interfaceC1347Y2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: W2.c */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0724e1(C2623F c2623f, InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2292n = c2623f;
        this.f2293o = (AbstractC1184i) interfaceC1601c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: W2.c */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0724e1(C2828V c2828v, InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2292n = c2828v;
        this.f2293o = (AbstractC1184i) interfaceC1601c;
    }
}
