package p190k3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p056K2.AbstractC0885k;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p084Q2.AbstractC1178c;
import p084Q2.InterfaceC1179d;
import p160f3.AbstractC2099B;
import p160f3.AbstractC2109L;
import p160f3.AbstractC2144k0;
import p160f3.AbstractC2153p;
import p160f3.AbstractC2162v;
import p160f3.C2149n;

/* JADX INFO: renamed from: k3.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2458f extends AbstractC2099B implements InterfaceC1179d, InterfaceC1046d {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7929k = AtomicReferenceFieldUpdater.newUpdater(C2458f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: g */
    public final AbstractC2153p f7930g;

    /* JADX INFO: renamed from: h */
    public final AbstractC1178c f7931h;

    /* JADX INFO: renamed from: i */
    public Object f7932i;

    /* JADX INFO: renamed from: j */
    public final Object f7933j;

    public C2458f(AbstractC2153p abstractC2153p, AbstractC1178c abstractC1178c) {
        super(-1);
        this.f7930g = abstractC2153p;
        this.f7931h = abstractC1178c;
        this.f7932i = AbstractC2453a.f7918b;
        this.f7933j = AbstractC2453a.m4383k(abstractC1178c.mo275e());
    }

    @Override // p084Q2.InterfaceC1179d
    /* JADX INFO: renamed from: d */
    public final InterfaceC1179d mo2123d() {
        return this.f7931h;
    }

    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: e */
    public final InterfaceC1051i mo275e() {
        return this.f7931h.mo275e();
    }

    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: i */
    public final void mo278i(Object obj) {
        Throwable thM1902a = AbstractC0885k.m1902a(obj);
        Object c2149n = thM1902a == null ? obj : new C2149n(thM1902a, false);
        AbstractC1178c abstractC1178c = this.f7931h;
        InterfaceC1051i interfaceC1051iMo275e = abstractC1178c.mo275e();
        AbstractC2153p abstractC2153p = this.f7930g;
        if (abstractC2153p.mo3975E(interfaceC1051iMo275e)) {
            this.f7932i = c2149n;
            this.f7028f = 0;
            abstractC2153p.mo1207D(abstractC1178c.mo275e(), this);
            return;
        }
        AbstractC2109L abstractC2109LM3973a = AbstractC2144k0.m3973a();
        if (abstractC2109LM3973a.f7043f >= 4294967296L) {
            this.f7932i = c2149n;
            this.f7028f = 0;
            abstractC2109LM3973a.m3899H(this);
            return;
        }
        abstractC2109LM3973a.m3901J(true);
        try {
            InterfaceC1051i interfaceC1051iMo275e2 = abstractC1178c.mo275e();
            Object objM4384l = AbstractC2453a.m4384l(interfaceC1051iMo275e2, this.f7933j);
            try {
                abstractC1178c.mo278i(obj);
                while (abstractC2109LM3973a.m3902L()) {
                }
            } finally {
                AbstractC2453a.m4379g(interfaceC1051iMo275e2, objM4384l);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // p160f3.AbstractC2099B
    /* JADX INFO: renamed from: j */
    public final Object mo3882j() {
        Object obj = this.f7932i;
        this.f7932i = AbstractC2453a.f7918b;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f7930g + ", " + AbstractC2162v.m3998t(this.f7931h) + ']';
    }

    @Override // p160f3.AbstractC2099B
    /* JADX INFO: renamed from: c */
    public final InterfaceC1046d mo3878c() {
        return this;
    }
}
