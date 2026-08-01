package p145jc;

import ec.AbstractC2112b1;
import ec.AbstractC2121d0;
import ec.AbstractC2142i1;
import ec.AbstractC2149k0;
import ec.AbstractC2181s0;
import ec.C2164o;
import ec.C2187t2;
import ec.InterfaceC2156m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p024b9.AbstractC1061t;
import p172l8.C4700i0;
import p193n3.AbstractC5489b;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p257r8.InterfaceC6536e;
import p314vb.C8897d;
import p376zd.C9987e;

/* JADX INFO: renamed from: jc.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3808h extends AbstractC2112b1 implements InterfaceC6536e, InterfaceC5976f {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10980x = AtomicReferenceFieldUpdater.newUpdater(C3808h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: t */
    public final AbstractC2149k0 f10981t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC5976f f10982u;

    /* JADX INFO: renamed from: v */
    public Object f10983v;

    /* JADX INFO: renamed from: w */
    public final Object f10984w;

    public C3808h(AbstractC2149k0 abstractC2149k0, InterfaceC5976f interfaceC5976f) {
        super(-1);
        this.f10981t = abstractC2149k0;
        this.f10982u = interfaceC5976f;
        this.f10983v = AbstractC3810i.f10985a;
        this.f10984w = AbstractC3815k0.m15197e(getContext());
    }

    @Override // p257r8.InterfaceC6536e
    public InterfaceC6536e getCallerFrame() {
        InterfaceC5976f interfaceC5976f = this.f10982u;
        if (interfaceC5976f instanceof InterfaceC6536e) {
            return (InterfaceC6536e) interfaceC5976f;
        }
        return null;
    }

    @Override // p228p8.InterfaceC5976f
    public InterfaceC5980j getContext() {
        return this.f10982u.getContext();
    }

    @Override // ec.AbstractC2112b1
    /* JADX INFO: renamed from: h */
    public Object mo7627h() {
        Object obj = this.f10983v;
        this.f10983v = AbstractC3810i.f10985a;
        return obj;
    }

    /* JADX INFO: renamed from: i */
    public final void m15170i() {
        while (f10980x.get(this) == AbstractC3810i.f10986b) {
        }
    }

    /* JADX INFO: renamed from: j */
    public final C2164o m15171j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10980x;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f10980x.set(this, AbstractC3810i.f10986b);
                return null;
            }
            if (obj instanceof C2164o) {
                if (AbstractC5489b.m22334a(f10980x, this, obj, AbstractC3810i.f10986b)) {
                    return (C2164o) obj;
                }
            } else if (obj != AbstractC3810i.f10986b && !(obj instanceof Throwable)) {
                C8897d.m34134a("Inconsistent state ", obj);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m15172k(InterfaceC5980j interfaceC5980j, Object obj) {
        this.f10983v = obj;
        this.f5914s = 1;
        this.f10981t.mo7820F(interfaceC5980j, this);
    }

    /* JADX INFO: renamed from: m */
    public final C2164o m15173m() {
        Object obj = f10980x.get(this);
        if (obj instanceof C2164o) {
            return (C2164o) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m15174p() {
        return f10980x.get(this) != null;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m15175q(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10980x;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C3801d0 c3801d0 = AbstractC3810i.f10986b;
            if (AbstractC1061t.m3842c(obj, c3801d0)) {
                if (AbstractC5489b.m22334a(f10980x, this, c3801d0, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractC5489b.m22334a(f10980x, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m15176r() {
        m15170i();
        C2164o c2164oM15173m = m15173m();
        if (c2164oM15173m != null) {
            c2164oM15173m.m7871q();
        }
    }

    @Override // p228p8.InterfaceC5976f
    public void resumeWith(Object obj) {
        Object objM7724b = AbstractC2121d0.m7724b(obj);
        if (AbstractC3810i.m15181d(this.f10981t, getContext())) {
            this.f10983v = objM7724b;
            this.f5914s = 0;
            AbstractC3810i.m15180c(this.f10981t, getContext(), this);
            return;
        }
        AbstractC2142i1 abstractC2142i1M7908b = C2187t2.f6012a.m7908b();
        if (abstractC2142i1M7908b.m7779Q0()) {
            this.f10983v = objM7724b;
            this.f5914s = 0;
            abstractC2142i1M7908b.m7776M0(this);
            return;
        }
        abstractC2142i1M7908b.m7778O0(true);
        try {
            InterfaceC5980j context = getContext();
            Object objM15198f = AbstractC3815k0.m15198f(context, this.f10984w);
            try {
                this.f10982u.resumeWith(obj);
                C4700i0 c4700i0 = C4700i0.f13910a;
                while (abstractC2142i1M7908b.m7782T0()) {
                }
            } finally {
                AbstractC3815k0.m15196d(context, objM15198f);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final Throwable m15177s(InterfaceC2156m interfaceC2156m) {
        C3801d0 c3801d0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10980x;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c3801d0 = AbstractC3810i.f10986b;
            if (obj != c3801d0) {
                if (!(obj instanceof Throwable)) {
                    C8897d.m34134a("Inconsistent state ", obj);
                    return null;
                }
                if (AbstractC5489b.m22334a(f10980x, this, obj, null)) {
                    return (Throwable) obj;
                }
                C9987e.m38645a("Failed requirement.");
                return null;
            }
        } while (!AbstractC5489b.m22334a(f10980x, this, c3801d0, interfaceC2156m));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f10981t + ", " + AbstractC2181s0.m7900c(this.f10982u) + ']';
    }

    @Override // ec.AbstractC2112b1
    /* JADX INFO: renamed from: c */
    public InterfaceC5976f mo7623c() {
        return this;
    }
}
