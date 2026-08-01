package p216p;

import java.util.concurrent.atomic.AtomicReference;
import p034G.C0466k;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1049g;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p160f3.C2155q;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;
import p207n3.C2695c;
import p207n3.InterfaceC2693a;
import p227r.C2998l;

/* JADX INFO: renamed from: p.U */
/* JADX INFO: loaded from: classes.dex */
public final class C2827U extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public InterfaceC2693a f8895h;

    /* JADX INFO: renamed from: i */
    public Object f8896i;

    /* JADX INFO: renamed from: j */
    public C2998l f8897j;

    /* JADX INFO: renamed from: k */
    public C2828V f8898k;

    /* JADX INFO: renamed from: l */
    public int f8899l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f8900m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ EnumC2824Q f8901n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C2828V f8902o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0466k f8903p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C2998l f8904q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2827U(EnumC2824Q enumC2824Q, C2828V c2828v, C0466k c0466k, C2998l c2998l, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f8901n = enumC2824Q;
        this.f8902o = c2828v;
        this.f8903p = c0466k;
        this.f8904q = c2998l;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C2827U) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C2827U c2827u = new C2827U(this.f8901n, this.f8902o, this.f8903p, this.f8904q, interfaceC1046d);
        c2827u.f8900m = obj;
        return c2827u;
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        InterfaceC1603e interfaceC1603e;
        C2998l c2998l;
        C2826T c2826t;
        C2828V c2828v;
        InterfaceC2693a interfaceC2693a;
        C2826T c2826t2;
        InterfaceC2693a interfaceC2693a2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        int i5 = this.f8899l;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        try {
            try {
                if (i5 == 0) {
                    AbstractC1784a.m3205S(obj);
                    InterfaceC1049g interfaceC1049gMo1166C = ((InterfaceC2160t) this.f8900m).mo1202f().mo1166C(C2155q.f7102e);
                    AbstractC1665j.m2982b(interfaceC1049gMo1166C);
                    C2826T c2826t3 = new C2826T(this.f8901n, (InterfaceC2115S) interfaceC1049gMo1166C);
                    C2828V c2828v2 = this.f8902o;
                    C2828V.m5025a(c2828v2, c2826t3);
                    C2695c c2695c = c2828v2.f8906b;
                    this.f8900m = c2826t3;
                    this.f8895h = c2695c;
                    interfaceC1603e = this.f8903p;
                    this.f8896i = interfaceC1603e;
                    C2998l c2998l2 = this.f8904q;
                    this.f8897j = c2998l2;
                    this.f8898k = c2828v2;
                    this.f8899l = 1;
                    if (c2695c.m4691d(this) != enumC1152a) {
                        c2998l = c2998l2;
                        c2826t = c2826t3;
                        c2828v = c2828v2;
                        interfaceC2693a = c2695c;
                    }
                    return enumC1152a;
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2828v = (C2828V) this.f8896i;
                    InterfaceC2693a interfaceC2693a3 = this.f8895h;
                    c2826t2 = (C2826T) this.f8900m;
                    try {
                        AbstractC1784a.m3205S(obj);
                        interfaceC2693a2 = interfaceC2693a3;
                        atomicReference2 = c2828v.f8905a;
                        while (!atomicReference2.compareAndSet(c2826t2, null) && atomicReference2.get() == c2826t2) {
                        }
                        ((C2695c) interfaceC2693a2).m4693f(null);
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        atomicReference = c2828v.f8905a;
                        while (!atomicReference.compareAndSet(c2826t2, null)) {
                        }
                        throw th;
                    }
                }
                c2828v = this.f8898k;
                c2998l = this.f8897j;
                InterfaceC1603e interfaceC1603e2 = (InterfaceC1603e) this.f8896i;
                InterfaceC2693a interfaceC2693a4 = this.f8895h;
                c2826t = (C2826T) this.f8900m;
                AbstractC1784a.m3205S(obj);
                interfaceC1603e = interfaceC1603e2;
                interfaceC2693a = interfaceC2693a4;
                this.f8900m = c2826t;
                this.f8895h = interfaceC2693a;
                this.f8896i = c2828v;
                this.f8897j = null;
                this.f8898k = null;
                this.f8899l = 2;
                obj = interfaceC1603e.mo0g(c2998l, this);
                if (obj != enumC1152a) {
                    interfaceC2693a2 = interfaceC2693a;
                    c2826t2 = c2826t;
                    atomicReference2 = c2828v.f8905a;
                    while (!atomicReference2.compareAndSet(c2826t2, null)) {
                    }
                    ((C2695c) interfaceC2693a2).m4693f(null);
                    return obj;
                }
                return enumC1152a;
            } catch (Throwable th2) {
                th = th2;
                c2826t2 = c2826t;
                atomicReference = c2828v.f8905a;
                while (!atomicReference.compareAndSet(c2826t2, null) && atomicReference.get() == c2826t2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            ((C2695c) 2).m4693f(null);
            throw th3;
        }
    }
}
