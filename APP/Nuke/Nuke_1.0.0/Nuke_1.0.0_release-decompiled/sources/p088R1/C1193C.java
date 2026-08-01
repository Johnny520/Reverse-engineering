package p088R1;

import p000A.C0072l0;
import p002A1.C0115D;
import p200m2.AbstractC2602c;
import p200m2.C2603d;
import p200m2.InterfaceC2601b;

/* JADX INFO: renamed from: R1.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1193C implements InterfaceC1194D, InterfaceC2601b {

    /* JADX INFO: renamed from: h */
    public static final C0072l0 f3913h = AbstractC2602c.m4547a(20, new C0115D(21));

    /* JADX INFO: renamed from: d */
    public final C2603d f3914d = new C2603d();

    /* JADX INFO: renamed from: e */
    public InterfaceC1194D f3915e;

    /* JADX INFO: renamed from: f */
    public boolean f3916f;

    /* JADX INFO: renamed from: g */
    public boolean f3917g;

    /* JADX INFO: renamed from: a */
    public final synchronized void m2252a() {
        this.f3914d.m4548a();
        if (!this.f3916f) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f3916f = false;
        if (this.f3917g) {
            mo2256e();
        }
    }

    @Override // p200m2.InterfaceC2601b
    /* JADX INFO: renamed from: b */
    public final C2603d mo2253b() {
        return this.f3914d;
    }

    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: c */
    public final int mo2254c() {
        return this.f3915e.mo2254c();
    }

    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: d */
    public final Class mo2255d() {
        return this.f3915e.mo2255d();
    }

    @Override // p088R1.InterfaceC1194D
    /* JADX INFO: renamed from: e */
    public final synchronized void mo2256e() {
        this.f3914d.m4548a();
        this.f3917g = true;
        if (!this.f3916f) {
            this.f3915e.mo2256e();
            this.f3915e = null;
            f3913h.mo97a(this);
        }
    }

    @Override // p088R1.InterfaceC1194D
    public final Object get() {
        return this.f3915e.get();
    }
}
