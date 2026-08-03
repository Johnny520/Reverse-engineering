package sg;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p080fb.AbstractC1184v0;
import p136j8.C2104o;
import p162l3.C2463q;
import p249qg.AbstractC3603v;
import p249qg.C3564g;
import p249qg.InterfaceC3590o1;
import p276sf.C3959f;
import p370yf.AbstractC6038c;
import vg.AbstractC4568q;
import vg.AbstractC4569r;

/* JADX INFO: renamed from: sg.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3970b implements InterfaceC3590o1 {

    /* JADX INFO: renamed from: g */
    public Object f12983g = AbstractC3973e.f13012p;

    /* JADX INFO: renamed from: h */
    public C3564g f12984h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3971c f12985i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3970b(C3971c c3971c) {
        this.f12985i = c3971c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3590o1
    /* JADX INFO: renamed from: a */
    public final void mo7505a(AbstractC4568q abstractC4568q, int i9) {
        C3564g c3564g = this.f12984h;
        if (c3564g != null) {
            c3564g.mo7505a(abstractC4568q, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m8185b(AbstractC6038c abstractC6038c) throws Throwable {
        C3979k c3979kM8204l;
        Object obj = this.f12983g;
        boolean z9 = true;
        if (obj == AbstractC3973e.f13012p || obj == AbstractC3973e.f13008l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3971c.f12991m;
            C3971c c3971c = this.f12985i;
            C3979k c3979k = (C3979k) atomicReferenceFieldUpdater.get(c3971c);
            while (true) {
                c3971c.getClass();
                if (c3971c.m8211t(C3971c.f12986h.get(c3971c), true)) {
                    this.f12983g = AbstractC3973e.f13008l;
                    Throwable thM8205m = c3971c.m8205m();
                    if (thM8205m != null) {
                        int i9 = AbstractC4569r.f15054a;
                        throw thM8205m;
                    }
                    z9 = false;
                } else {
                    long andIncrement = C3971c.f12987i.getAndIncrement(c3971c);
                    long j3 = AbstractC3973e.f12998b;
                    long j4 = andIncrement / j3;
                    int i10 = (int) (andIncrement % j3);
                    if (c3979k.f15053c != j4) {
                        c3979kM8204l = c3971c.m8204l(j4, c3979k);
                        if (c3979kM8204l == null) {
                            continue;
                        }
                    } else {
                        c3979kM8204l = c3979k;
                    }
                    Object objM8193C = c3971c.m8193C(c3979kM8204l, i10, andIncrement, null);
                    C2463q c2463q = AbstractC3973e.f13009m;
                    if (objM8193C == c2463q) {
                        C2104o.m5276A("unreachable");
                        return null;
                    }
                    C2463q c2463q2 = AbstractC3973e.f13011o;
                    if (objM8193C == c2463q2) {
                        if (andIncrement < c3971c.m8210r()) {
                            c3979kM8204l.m8994a();
                        }
                        c3979k = c3979kM8204l;
                    } else {
                        if (objM8193C == AbstractC3973e.f13010n) {
                            C3971c c3971c2 = this.f12985i;
                            C3564g c3564gM7558l = AbstractC3603v.m7558l(AbstractC1184v0.m3214x(abstractC6038c));
                            try {
                                this.f12984h = c3564gM7558l;
                                Object objM8193C2 = c3971c2.m8193C(c3979kM8204l, i10, andIncrement, this);
                                if (objM8193C2 == c2463q) {
                                    mo7505a(c3979kM8204l, i10);
                                } else {
                                    if (objM8193C2 == c2463q2) {
                                        if (andIncrement < c3971c2.m8210r()) {
                                            c3979kM8204l.m8994a();
                                        }
                                        C3979k c3979k2 = (C3979k) C3971c.f12991m.get(c3971c2);
                                        while (true) {
                                            if (c3971c2.m8211t(C3971c.f12986h.get(c3971c2), true)) {
                                                C3564g c3564g = this.f12984h;
                                                c3564g.getClass();
                                                this.f12984h = null;
                                                this.f12983g = AbstractC3973e.f13008l;
                                                Throwable thM8205m2 = c3971c.m8205m();
                                                if (thM8205m2 == null) {
                                                    c3564g.resumeWith(Boolean.FALSE);
                                                } else {
                                                    c3564g.resumeWith(new C3959f(thM8205m2));
                                                }
                                            } else {
                                                long andIncrement2 = C3971c.f12987i.getAndIncrement(c3971c2);
                                                long j5 = AbstractC3973e.f12998b;
                                                long j10 = andIncrement2 / j5;
                                                int i11 = (int) (andIncrement2 % j5);
                                                if (c3979k2.f15053c != j10) {
                                                    C3979k c3979kM8204l2 = c3971c2.m8204l(j10, c3979k2);
                                                    if (c3979kM8204l2 != null) {
                                                        c3979k2 = c3979kM8204l2;
                                                    }
                                                }
                                                Object objM8193C3 = c3971c2.m8193C(c3979k2, i11, andIncrement2, this);
                                                if (objM8193C3 == AbstractC3973e.f13009m) {
                                                    mo7505a(c3979k2, i11);
                                                    break;
                                                }
                                                if (objM8193C3 == AbstractC3973e.f13011o) {
                                                    if (andIncrement2 < c3971c2.m8210r()) {
                                                        c3979k2.m8994a();
                                                    }
                                                } else {
                                                    if (objM8193C3 == AbstractC3973e.f13010n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    c3979k2.m8994a();
                                                    this.f12983g = objM8193C3;
                                                    this.f12984h = null;
                                                }
                                            }
                                        }
                                    } else {
                                        c3979kM8204l.m8994a();
                                        this.f12983g = objM8193C2;
                                        this.f12984h = null;
                                    }
                                    c3564gM7558l.m7520y(Boolean.TRUE, null);
                                }
                                return c3564gM7558l.m7512o();
                            } catch (Throwable th2) {
                                c3564gM7558l.m7519x();
                                throw th2;
                            }
                        }
                        c3979kM8204l.m8994a();
                        this.f12983g = objM8193C;
                    }
                }
            }
        }
        return Boolean.valueOf(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m8186c() throws Throwable {
        Object obj = this.f12983g;
        C2463q c2463q = AbstractC3973e.f13012p;
        if (obj == c2463q) {
            C2104o.m5276A("`hasNext()` has not been invoked");
            return null;
        }
        this.f12983g = c2463q;
        if (obj != AbstractC3973e.f13008l) {
            return obj;
        }
        Throwable thM8206n = this.f12985i.m8206n();
        int i9 = AbstractC4569r.f15054a;
        throw thM8206n;
    }
}
