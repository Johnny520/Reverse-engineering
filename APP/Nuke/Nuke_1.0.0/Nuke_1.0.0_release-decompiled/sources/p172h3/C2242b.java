package p172h3;

import com.bumptech.glide.AbstractC1923e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p084Q2.AbstractC1178c;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.C2135g;
import p160f3.InterfaceC2158r0;
import p190k3.AbstractC2470r;
import p190k3.AbstractC2471s;

/* JADX INFO: renamed from: h3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2242b implements InterfaceC2158r0 {

    /* JADX INFO: renamed from: d */
    public Object f7355d = AbstractC2245e.f7384p;

    /* JADX INFO: renamed from: e */
    public C2135g f7356e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2243c f7357f;

    public C2242b(C2243c c2243c) {
        this.f7357f = c2243c;
    }

    @Override // p160f3.InterfaceC2158r0
    /* JADX INFO: renamed from: a */
    public final void mo3961a(AbstractC2470r abstractC2470r, int i5) {
        C2135g c2135g = this.f7356e;
        if (c2135g != null) {
            c2135g.mo3961a(abstractC2470r, i5);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m4068b(AbstractC1178c abstractC1178c) throws Throwable {
        C2251k c2251kM4088m;
        Object obj = this.f7355d;
        boolean z5 = true;
        if (obj == AbstractC2245e.f7384p || obj == AbstractC2245e.f7380l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2243c.f7363j;
            C2243c c2243c = this.f7357f;
            C2251k c2251k = (C2251k) atomicReferenceFieldUpdater.get(c2243c);
            while (true) {
                c2243c.getClass();
                if (c2243c.m4095u(C2243c.f7358e.get(c2243c), true)) {
                    this.f7355d = AbstractC2245e.f7380l;
                    Throwable thM4089n = c2243c.m4089n();
                    if (thM4089n != null) {
                        int i5 = AbstractC2471s.f7959a;
                        throw thM4089n;
                    }
                    z5 = false;
                } else {
                    long andIncrement = C2243c.f7359f.getAndIncrement(c2243c);
                    long j5 = AbstractC2245e.f7370b;
                    long j6 = andIncrement / j5;
                    int i6 = (int) (andIncrement % j5);
                    if (c2251k.f7958c != j6) {
                        c2251kM4088m = c2243c.m4088m(j6, c2251k);
                        if (c2251kM4088m == null) {
                            continue;
                        }
                    } else {
                        c2251kM4088m = c2251k;
                    }
                    Object objM4076C = c2243c.m4076C(c2251kM4088m, i6, andIncrement, null);
                    C1753n c1753n = AbstractC2245e.f7381m;
                    if (objM4076C == c1753n) {
                        throw new IllegalStateException("unreachable");
                    }
                    C1753n c1753n2 = AbstractC2245e.f7383o;
                    if (objM4076C == c1753n2) {
                        if (andIncrement < c2243c.m4094s()) {
                            c2251kM4088m.m4385a();
                        }
                        c2251k = c2251kM4088m;
                    } else {
                        if (objM4076C == AbstractC2245e.f7382n) {
                            C2243c c2243c2 = this.f7357f;
                            C2135g c2135gM3989k = AbstractC2162v.m3989k(AbstractC1923e.m3448G(abstractC1178c));
                            try {
                                this.f7356e = c2135gM3989k;
                                Object objM4076C2 = c2243c2.m4076C(c2251kM4088m, i6, andIncrement, this);
                                if (objM4076C2 == c1753n) {
                                    mo3961a(c2251kM4088m, i6);
                                } else {
                                    if (objM4076C2 == c1753n2) {
                                        if (andIncrement < c2243c2.m4094s()) {
                                            c2251kM4088m.m4385a();
                                        }
                                        C2251k c2251k2 = (C2251k) C2243c.f7363j.get(c2243c2);
                                        while (true) {
                                            if (c2243c2.m4095u(C2243c.f7358e.get(c2243c2), true)) {
                                                C2135g c2135g = this.f7356e;
                                                AbstractC1665j.m2982b(c2135g);
                                                this.f7356e = null;
                                                this.f7355d = AbstractC2245e.f7380l;
                                                Throwable thM4089n2 = c2243c.m4089n();
                                                if (thM4089n2 == null) {
                                                    c2135g.mo278i(Boolean.FALSE);
                                                } else {
                                                    c2135g.mo278i(AbstractC1784a.m3229o(thM4089n2));
                                                }
                                            } else {
                                                long andIncrement2 = C2243c.f7359f.getAndIncrement(c2243c2);
                                                long j7 = AbstractC2245e.f7370b;
                                                long j8 = andIncrement2 / j7;
                                                int i7 = (int) (andIncrement2 % j7);
                                                if (c2251k2.f7958c != j8) {
                                                    C2251k c2251kM4088m2 = c2243c2.m4088m(j8, c2251k2);
                                                    if (c2251kM4088m2 != null) {
                                                        c2251k2 = c2251kM4088m2;
                                                    }
                                                }
                                                Object objM4076C3 = c2243c2.m4076C(c2251k2, i7, andIncrement2, this);
                                                if (objM4076C3 == AbstractC2245e.f7381m) {
                                                    mo3961a(c2251k2, i7);
                                                    break;
                                                }
                                                if (objM4076C3 == AbstractC2245e.f7383o) {
                                                    if (andIncrement2 < c2243c2.m4094s()) {
                                                        c2251k2.m4385a();
                                                    }
                                                } else {
                                                    if (objM4076C3 == AbstractC2245e.f7382n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c2251k2.m4385a();
                                                    this.f7355d = objM4076C3;
                                                    this.f7356e = null;
                                                }
                                            }
                                        }
                                    } else {
                                        c2251kM4088m.m4385a();
                                        this.f7355d = objM4076C2;
                                        this.f7356e = null;
                                    }
                                    c2135gM3989k.m3958C(Boolean.TRUE, null);
                                }
                                return c2135gM3989k.m3967r();
                            } catch (Throwable th) {
                                c2135gM3989k.m3957B();
                                throw th;
                            }
                        }
                        c2251kM4088m.m4385a();
                        this.f7355d = objM4076C;
                    }
                }
            }
        }
        return Boolean.valueOf(z5);
    }

    /* JADX INFO: renamed from: c */
    public final Object m4069c() throws Throwable {
        Object obj = this.f7355d;
        C1753n c1753n = AbstractC2245e.f7384p;
        if (obj == c1753n) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f7355d = c1753n;
        if (obj != AbstractC2245e.f7380l) {
            return obj;
        }
        Throwable thM4092q = this.f7357f.m4092q();
        int i5 = AbstractC2471s.f7959a;
        throw thM4092q;
    }
}
