package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: vg */
/* JADX INFO: loaded from: classes.dex */
public final class C0817vg extends AbstractC0892xg implements InterfaceC0667re, InterfaceC0814vd {

    /* JADX INFO: renamed from: h */
    public static final AtomicReferenceFieldUpdater f4954h = AtomicReferenceFieldUpdater.newUpdater(C0817vg.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: d */
    public final AbstractC0445le f4955d;

    /* JADX INFO: renamed from: e */
    public final t50 f4956e;

    /* JADX INFO: renamed from: f */
    public Object f4957f;

    /* JADX INFO: renamed from: g */
    public final Object f4958g;

    public C0817vg(AbstractC0445le abstractC0445le, t50 t50Var) {
        super(-1);
        this.f4955d = abstractC0445le;
        this.f4956e = t50Var;
        this.f4957f = g80.f1910d;
        InterfaceC0295he interfaceC0295he = t50Var.f4415b;
        AbstractC0493mp.m1854d(interfaceC0295he);
        Object objMo449h = interfaceC0295he.mo449h(0, C0332ie.f2535e);
        AbstractC0493mp.m1854d(objMo449h);
        this.f4958g = objMo449h;
    }

    @Override // p000.AbstractC0892xg
    /* JADX INFO: renamed from: a */
    public final void mo2313a(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC0887xb) {
            throw null;
        }
    }

    @Override // p000.InterfaceC0667re
    /* JADX INFO: renamed from: c */
    public final InterfaceC0667re mo824c() {
        t50 t50Var = this.f4956e;
        if (t50Var != null) {
            return t50Var;
        }
        return null;
    }

    @Override // p000.InterfaceC0814vd
    /* JADX INFO: renamed from: d */
    public final InterfaceC0295he mo1117d() {
        InterfaceC0295he interfaceC0295he = this.f4956e.f4415b;
        AbstractC0493mp.m1854d(interfaceC0295he);
        return interfaceC0295he;
    }

    @Override // p000.InterfaceC0814vd
    /* JADX INFO: renamed from: f */
    public final void mo1118f(Object obj) {
        t50 t50Var = this.f4956e;
        InterfaceC0295he interfaceC0295he = t50Var.f4415b;
        AbstractC0493mp.m1854d(interfaceC0295he);
        Throwable thM1794a = m10.m1794a(obj);
        Object c0850wb = thM1794a == null ? obj : new C0850wb(thM1794a, false);
        AbstractC0445le abstractC0445le = this.f4955d;
        if (abstractC0445le.mo1760e()) {
            this.f4957f = c0850wb;
            this.f5245c = 0;
            abstractC0445le.mo584d(interfaceC0295he, this);
            return;
        }
        AbstractC0487mj abstractC0487mjM2797a = z60.m2797a();
        if (abstractC0487mjM2797a.f3149c >= 4294967296L) {
            this.f4957f = c0850wb;
            this.f5245c = 0;
            C0400k6 c0400k6 = abstractC0487mjM2797a.f3151e;
            if (c0400k6 == null) {
                c0400k6 = new C0400k6();
                abstractC0487mjM2797a.f3151e = c0400k6;
            }
            c0400k6.addLast(this);
            return;
        }
        abstractC0487mjM2797a.m1825k(true);
        try {
            InterfaceC0295he interfaceC0295he2 = t50Var.f4415b;
            AbstractC0493mp.m1854d(interfaceC0295he2);
            Object objM1242a0 = AbstractC0259gf.m1242a0(interfaceC0295he2, this.f4958g);
            try {
                t50Var.mo1118f(obj);
                while (abstractC0487mjM2797a.m1826l()) {
                }
            } finally {
                AbstractC0259gf.m1234R(interfaceC0295he2, objM1242a0);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // p000.AbstractC0892xg
    /* JADX INFO: renamed from: i */
    public final Object mo2317i() {
        Object obj = this.f4957f;
        this.f4957f = g80.f1910d;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f4955d + ", " + AbstractC0259gf.m1240Y(this.f4956e) + ']';
    }

    @Override // p000.AbstractC0892xg
    /* JADX INFO: renamed from: b */
    public final InterfaceC0814vd mo2314b() {
        return this;
    }
}
