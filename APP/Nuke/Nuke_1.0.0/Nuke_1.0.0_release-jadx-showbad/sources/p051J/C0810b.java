package p051J;

import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import android.view.textclassifier.TextClassifier;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import me.dartcv.nuke.BuildConfig;
import p000A.C0024M;
import p000A.C0039U;
import p007B0.InterfaceC0169B;
import p027E4.C0330q;
import p047I0.C0696T;
import p056K2.C0891q;
import p058L.C0943o;
import p072O0.ScrollCaptureCallbackC1033d;
import p074O2.C1052j;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p095T.C1394w0;
import p095T.InterfaceC1347Y;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p127Z2.AbstractC1784a;
import p153e1.C2015k;
import p154e2.C2023b;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p169h0.C2209r;
import p172h3.EnumC2241a;
import p178i3.AbstractC2329j;
import p178i3.AbstractC2339t;
import p178i3.C2318C;
import p178i3.C2328i;
import p178i3.C2332m;
import p178i3.C2342w;
import p178i3.C2344y;
import p178i3.C2345z;
import p178i3.EnumC2341v;
import p178i3.InterfaceC2323d;
import p179i4.AbstractC2352g;
import p184j3.C2391j;
import p184j3.C2396o;
import p184j3.C2402u;
import p203n.AbstractC2651e;
import p203n.C2626I;
import p203n.C2647c;
import p203n.InterfaceC2659i;
import p207n3.C2695c;
import p207n3.InterfaceC2693a;
import p211o0.AbstractC2767z;
import p227r.C2954H0;
import p227r.C2989g0;

/* JADX INFO: renamed from: J.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0810b extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2600h;

    /* JADX INFO: renamed from: i */
    public int f2601i;

    /* JADX INFO: renamed from: j */
    public Object f2602j;

    /* JADX INFO: renamed from: k */
    public Object f2603k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2604l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f2605m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0810b(InterfaceC0169B interfaceC0169B, InterfaceC1604f interfaceC1604f, InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2600h = 7;
        this.f2604l = interfaceC0169B;
        this.f2605m = interfaceC1604f;
        this.f2603k = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) throws Throwable {
        switch (this.f2600h) {
            case 0:
                ((C0810b) mo7n((InterfaceC1046d) obj2, (C0696T) obj)).mo8p(C0891q.f2780a);
                return EnumC1152a.f3788d;
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C0810b) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 2:
                return ((C0810b) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 3:
                return ((C0810b) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 4:
                return ((C0810b) mo7n((InterfaceC1046d) obj2, (EnumC2341v) obj)).mo8p(C0891q.f2780a);
            case 5:
                return ((C0810b) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            case 6:
                return ((C0810b) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C0810b) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [Q2.i, W2.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [W2.c, X2.k] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f2600h) {
            case 0:
                C0810b c0810b = new C0810b((InterfaceC1601c) this.f2603k, (C0811c) this.f2604l, (C0824p) this.f2605m, interfaceC1046d, 0);
                c0810b.f2602j = obj;
                return c0810b;
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C0810b((C0943o) this.f2604l, (AbstractC1184i) this.f2605m, interfaceC1046d);
            case 2:
                return new C0810b((ScrollCaptureCallbackC1033d) this.f2602j, (ScrollCaptureSession) this.f2603k, (Rect) this.f2604l, (Consumer) this.f2605m, interfaceC1046d, 2);
            case 3:
                C0810b c0810b2 = new C0810b((InterfaceC1601c) this.f2603k, (AtomicReference) this.f2604l, (InterfaceC1603e) this.f2605m, interfaceC1046d);
                c0810b2.f2602j = obj;
                return c0810b2;
            case 4:
                C0810b c0810b3 = new C0810b((InterfaceC2323d) this.f2603k, (C2318C) this.f2604l, (Float) this.f2605m, interfaceC1046d, 4);
                c0810b3.f2602j = obj;
                return c0810b3;
            case 5:
                return new C0810b((C2345z) this.f2602j, (InterfaceC2323d) this.f2603k, (C2318C) this.f2604l, (Float) this.f2605m, interfaceC1046d, 5);
            case 6:
                return new C0810b(this.f2602j, (C2647c) this.f2603k, (InterfaceC1347Y) this.f2604l, (InterfaceC1347Y) this.f2605m, interfaceC1046d, 6);
            default:
                C0810b c0810b4 = new C0810b((InterfaceC0169B) this.f2604l, (InterfaceC1604f) this.f2605m, (InterfaceC1601c) this.f2603k, interfaceC1046d);
                c0810b4.f2602j = obj;
                return c0810b4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:143:0x02a2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:182:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:183:0x01b7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3, types: [W2.c, X2.k] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Q2.i, W2.e] */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) throws Throwable {
        C0943o c0943o;
        InterfaceC2693a interfaceC2693a;
        InterfaceC2693a interfaceC2693a2;
        TextClassifier textClassifier;
        Object objM4002x;
        InterfaceC2693a interfaceC2693a3;
        Object objM4002x2;
        Object objM2110a;
        C2209r c2209r;
        C2209r c2209r2;
        Object objMo0g;
        ?? r32;
        int i5 = this.f2600h;
        ?? r22 = 3;
        char c5 = 3;
        int i6 = 2;
        Object obj2 = C0891q.f2780a;
        Object obj3 = this.f2605m;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        Object obj4 = this.f2604l;
        int i7 = 1;
        switch (i5) {
            case 0:
                int i8 = this.f2601i;
                if (i8 == 0) {
                    AbstractC1784a.m3205S(obj);
                    C0024M c0024m = new C0024M((C0696T) this.f2602j, (InterfaceC1601c) this.f2603k, (C0811c) obj4, (C0824p) obj3, (InterfaceC1046d) null);
                    this.f2601i = 1;
                    if (AbstractC2162v.m3982d(c0024m, this) == enumC1152a) {
                        return enumC1152a;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                throw new C0330q();
            case BuildConfig.VERSION_CODE /* 1 */:
                int i9 = this.f2601i;
                try {
                    if (i9 == 0) {
                        AbstractC1784a.m3205S(obj);
                        c0943o = (C0943o) obj4;
                        C2695c c2695c = c0943o.f2968e;
                        this.f2602j = c2695c;
                        this.f2603k = c0943o;
                        this.f2601i = 1;
                        Object objM4691d = c2695c.m4691d(this);
                        interfaceC2693a = c2695c;
                        if (objM4691d != enumC1152a) {
                        }
                        return enumC1152a;
                    }
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1784a.m3205S(obj);
                            return obj;
                        }
                        interfaceC2693a2 = (InterfaceC2693a) this.f2602j;
                        try {
                            AbstractC1784a.m3205S(obj);
                            objM4002x = obj;
                            interfaceC2693a2 = interfaceC2693a2;
                            textClassifier = (TextClassifier) objM4002x;
                            interfaceC2693a3 = interfaceC2693a2;
                            ((C2695c) interfaceC2693a3).m4693f(null);
                            C0039U c0039u = new C0039U(textClassifier, (InterfaceC1603e) obj3, (InterfaceC1046d) null);
                            this.f2602j = null;
                            this.f2603k = null;
                            this.f2601i = 3;
                            objM4002x2 = AbstractC2162v.m4002x(200L, c0039u, this);
                            if (objM4002x2 != enumC1152a) {
                                return objM4002x2;
                            }
                            return enumC1152a;
                        } catch (Throwable th) {
                            th = th;
                            ((C2695c) interfaceC2693a2).m4693f(null);
                            throw th;
                        }
                    }
                    c0943o = (C0943o) this.f2603k;
                    InterfaceC2693a interfaceC2693a4 = (InterfaceC2693a) this.f2602j;
                    AbstractC1784a.m3205S(obj);
                    interfaceC2693a = interfaceC2693a4;
                    textClassifier = c0943o.f2969f;
                    if (textClassifier != null) {
                        interfaceC2693a3 = interfaceC2693a;
                        if (textClassifier.isDestroyed()) {
                        }
                        ((C2695c) interfaceC2693a3).m4693f(null);
                        C0039U c0039u2 = new C0039U(textClassifier, (InterfaceC1603e) obj3, (InterfaceC1046d) null);
                        this.f2602j = null;
                        this.f2603k = null;
                        this.f2601i = 3;
                        objM4002x2 = AbstractC2162v.m4002x(200L, c0039u2, this);
                        if (objM4002x2 != enumC1152a) {
                        }
                        return enumC1152a;
                    }
                    C1394w0 c1394w0 = new C1394w0(c0943o, null);
                    this.f2602j = interfaceC2693a;
                    this.f2603k = null;
                    this.f2601i = 2;
                    objM4002x = AbstractC2162v.m4002x(300L, c1394w0, this);
                    if (objM4002x != enumC1152a) {
                        interfaceC2693a2 = interfaceC2693a;
                        textClassifier = (TextClassifier) objM4002x;
                        interfaceC2693a3 = interfaceC2693a2;
                        ((C2695c) interfaceC2693a3).m4693f(null);
                        C0039U c0039u22 = new C0039U(textClassifier, (InterfaceC1603e) obj3, (InterfaceC1046d) null);
                        this.f2602j = null;
                        this.f2603k = null;
                        this.f2601i = 3;
                        objM4002x2 = AbstractC2162v.m4002x(200L, c0039u22, this);
                        if (objM4002x2 != enumC1152a) {
                        }
                    }
                    return enumC1152a;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC2693a2 = interfaceC2693a;
                    ((C2695c) interfaceC2693a2).m4693f(null);
                    throw th;
                }
            case 2:
                int i10 = this.f2601i;
                if (i10 == 0) {
                    AbstractC1784a.m3205S(obj);
                    ScrollCaptureCallbackC1033d scrollCaptureCallbackC1033d = (ScrollCaptureCallbackC1033d) this.f2602j;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.f2603k;
                    Rect rect = (Rect) obj4;
                    C2015k c2015k = new C2015k(rect.left, rect.top, rect.right, rect.bottom);
                    this.f2601i = 1;
                    objM2110a = ScrollCaptureCallbackC1033d.m2110a(scrollCaptureCallbackC1033d, scrollCaptureSession, c2015k, this);
                    if (objM2110a == enumC1152a) {
                        return enumC1152a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    objM2110a = obj;
                }
                ((Consumer) obj3).accept(AbstractC2767z.m4949t((C2015k) objM2110a));
                return obj2;
            case 3:
                AtomicReference atomicReference = (AtomicReference) obj4;
                int i11 = this.f2601i;
                try {
                    if (i11 == 0) {
                        AbstractC1784a.m3205S(obj);
                        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) this.f2602j;
                        C2209r c2209r3 = new C2209r(AbstractC2162v.m3988j(interfaceC2160t.mo1202f()), ((AbstractC1666k) this.f2603k).mo1h(interfaceC2160t));
                        C2209r c2209r4 = (C2209r) atomicReference.getAndSet(c2209r3);
                        c2209r2 = c2209r3;
                        if (c2209r4 != null) {
                            InterfaceC2115S interfaceC2115S = c2209r4.f7200a;
                            this.f2602j = c2209r3;
                            this.f2601i = 1;
                            interfaceC2115S.mo3905c(null);
                            Object objMo3908t = interfaceC2115S.mo3908t(this);
                            if (objMo3908t == enumC1152a) {
                                obj2 = objMo3908t;
                            }
                            if (obj2 == enumC1152a) {
                                return enumC1152a;
                            }
                            c2209r = c2209r3;
                        }
                        Object obj5 = c2209r2.f7201b;
                        this.f2602j = c2209r2;
                        this.f2601i = 2;
                        objMo0g = ((InterfaceC1603e) obj3).mo0g(obj5, this);
                        r22 = c2209r2;
                        if (objMo0g == enumC1152a) {
                            return enumC1152a;
                        }
                        r32 = r22;
                        while (!atomicReference.compareAndSet(r32, null)) {
                        }
                        return objMo0g;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C2209r c2209r5 = (C2209r) this.f2602j;
                        AbstractC1784a.m3205S(obj);
                        objMo0g = obj;
                        r22 = c2209r5;
                        r32 = r22;
                        while (!atomicReference.compareAndSet(r32, null) && atomicReference.get() == r32) {
                        }
                        return objMo0g;
                    }
                    C2209r c2209r6 = (C2209r) this.f2602j;
                    AbstractC1784a.m3205S(obj);
                    c2209r = c2209r6;
                    c2209r2 = c2209r;
                    Object obj52 = c2209r2.f7201b;
                    this.f2602j = c2209r2;
                    this.f2601i = 2;
                    objMo0g = ((InterfaceC1603e) obj3).mo0g(obj52, this);
                    r22 = c2209r2;
                    if (objMo0g == enumC1152a) {
                    }
                    r32 = r22;
                    while (!atomicReference.compareAndSet(r32, null)) {
                    }
                    return objMo0g;
                } catch (Throwable th3) {
                    while (!atomicReference.compareAndSet(r22, null) && atomicReference.get() == r22) {
                    }
                    throw th3;
                }
            case 4:
                C2318C c2318c = (C2318C) obj4;
                int i12 = this.f2601i;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    return obj2;
                }
                AbstractC1784a.m3205S(obj);
                int iOrdinal = ((EnumC2341v) this.f2602j).ordinal();
                if (iOrdinal == 0) {
                    InterfaceC2323d interfaceC2323d = (InterfaceC2323d) this.f2603k;
                    this.f2601i = 1;
                    return interfaceC2323d.mo3119i(c2318c, this) == enumC1152a ? enumC1152a : obj2;
                }
                if (iOrdinal == 1) {
                    return obj2;
                }
                if (iOrdinal != 2) {
                    throw new C0330q();
                }
                Float f2 = (Float) obj3;
                if (f2 != AbstractC2339t.f7625a) {
                    c2318c.m4147g(null, f2);
                    return obj2;
                }
                c2318c.getClass();
                throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
            case 5:
                InterfaceC2323d interfaceC2323d2 = (InterfaceC2323d) this.f2603k;
                C2318C c2318c2 = (C2318C) obj4;
                int i13 = this.f2601i;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            AbstractC1784a.m3205S(obj);
                        } else if (i13 != 3 && i13 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    AbstractC1784a.m3205S(obj);
                    return obj2;
                }
                AbstractC1784a.m3205S(obj);
                C2345z c2345z = (C2345z) this.f2602j;
                if (c2345z == C2342w.f7634a) {
                    this.f2601i = 1;
                    if (interfaceC2323d2.mo3119i(c2318c2, this) != enumC1152a) {
                        return obj2;
                    }
                } else {
                    InterfaceC1046d interfaceC1046d = null;
                    if (c2345z == C2342w.f7635b) {
                        C2402u c2402uM4235f = c2318c2.m4235f();
                        C2332m c2332m = new C2332m(2, null);
                        this.f2601i = 2;
                        if (AbstractC2339t.m4170f(c2402uM4235f, c2332m, this) != enumC1152a) {
                        }
                    } else {
                        C2402u c2402uM4235f2 = c2318c2.m4235f();
                        C2344y c2344y = new C2344y(c2345z, null);
                        int i14 = AbstractC2329j.f7593a;
                        C1052j c1052j = C1052j.f3286d;
                        EnumC2241a enumC2241a = EnumC2241a.f7351d;
                        InterfaceC2323d interfaceC2323dM4168d = AbstractC2339t.m4168d(AbstractC2339t.m4168d(new C2023b(c5, new C2391j(c2344y, c2402uM4235f2, c1052j, -2, enumC2241a), new C1394w0(i6, interfaceC1046d, i7))));
                        C0810b c0810b = new C0810b(interfaceC2323d2, c2318c2, (Float) obj3, interfaceC1046d, 4);
                        this.f2601i = 4;
                        Object objMo3119i = new C2391j(new C2328i(c0810b, null), interfaceC2323dM4168d, c1052j, -2, enumC2241a).mo4148n(c1052j, 0, enumC2241a).mo3119i(C2396o.f7754d, this);
                        if (objMo3119i != enumC1152a) {
                            objMo3119i = obj2;
                        }
                        if (objMo3119i != enumC1152a) {
                            objMo3119i = obj2;
                        }
                        if (objMo3119i != enumC1152a) {
                            return obj2;
                        }
                    }
                }
                return enumC1152a;
                this.f2601i = 3;
                if (interfaceC2323d2.mo3119i(c2318c2, this) != enumC1152a) {
                    return obj2;
                }
                return enumC1152a;
            case 6:
                C2647c c2647c = (C2647c) this.f2603k;
                int i15 = this.f2601i;
                if (i15 == 0) {
                    AbstractC1784a.m3205S(obj);
                    if (AbstractC1665j.m2981a(this.f2602j, c2647c.f8430e.getValue())) {
                        return obj2;
                    }
                    C2647c c2647c2 = (C2647c) this.f2603k;
                    Object obj6 = this.f2602j;
                    C2626I c2626i = AbstractC2651e.f8458a;
                    InterfaceC2659i interfaceC2659i = (InterfaceC2659i) ((InterfaceC1347Y) obj4).getValue();
                    this.f2601i = 1;
                    if (C2647c.m4604c(c2647c2, obj6, interfaceC2659i, null, this, 12) == enumC1152a) {
                        return enumC1152a;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                C2626I c2626i2 = AbstractC2651e.f8458a;
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) ((InterfaceC1347Y) obj3).getValue();
                if (interfaceC1601c == null) {
                    return obj2;
                }
                interfaceC1601c.mo1h(c2647c.m4605d());
                return obj2;
            default:
                InterfaceC0169B interfaceC0169B = (InterfaceC0169B) obj4;
                int i16 = this.f2601i;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    return obj2;
                }
                AbstractC1784a.m3205S(obj);
                C2954H0 c2954h0 = new C2954H0((InterfaceC2160t) this.f2602j, (InterfaceC1604f) obj3, (InterfaceC1601c) this.f2603k, new C2989g0(interfaceC0169B), null);
                this.f2601i = 1;
                return AbstractC2352g.m4197j(interfaceC0169B, c2954h0, this) == enumC1152a ? enumC1152a : obj2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: W2.e */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0810b(C0943o c0943o, InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2600h = 1;
        this.f2604l = c0943o;
        this.f2605m = (AbstractC1184i) interfaceC1603e;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: W2.c */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0810b(InterfaceC1601c interfaceC1601c, AtomicReference atomicReference, InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2600h = 3;
        this.f2603k = (AbstractC1666k) interfaceC1601c;
        this.f2604l = atomicReference;
        this.f2605m = interfaceC1603e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0810b(Object obj, Object obj2, Object obj3, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f2600h = i5;
        this.f2603k = obj;
        this.f2604l = obj2;
        this.f2605m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0810b(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f2600h = i5;
        this.f2602j = obj;
        this.f2603k = obj2;
        this.f2604l = obj3;
        this.f2605m = obj4;
    }
}
