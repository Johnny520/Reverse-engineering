package p000;

/* JADX INFO: renamed from: ur */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0792ur extends AbstractC0142d8 implements InterfaceC0303hm, InterfaceC0901xp {

    /* JADX INFO: renamed from: g */
    public final boolean f4755g;

    public C0792ur(C0829vr c0829vr) {
        super(c0829vr, AbstractC0222ff.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f4755g = false;
    }

    @Override // p000.InterfaceC0303hm
    /* JADX INFO: renamed from: a */
    public final Object mo10a() {
        return this.f1400b.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0901xp m2468d() {
        if (this.f4755g) {
            return this;
        }
        InterfaceC0901xp interfaceC0901xp = this.f1399a;
        if (interfaceC0901xp != null) {
            return interfaceC0901xp;
        }
        j00.f2515a.getClass();
        this.f1399a = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0792ur) {
            C0792ur c0792ur = (C0792ur) obj;
            return m927c().equals(c0792ur.m927c()) && this.f1402d.equals(c0792ur.f1402d) && this.f1403e.equals(c0792ur.f1403e) && AbstractC0346ip.m1497i(this.f1400b, c0792ur.f1400b);
        }
        if (obj instanceof C0792ur) {
            return obj.equals(m2468d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f1403e.hashCode() + z30.m2760e(this.f1402d, m927c().hashCode() * 31, 31);
    }

    public final String toString() {
        InterfaceC0901xp interfaceC0901xpM2468d = m2468d();
        return interfaceC0901xpM2468d != this ? interfaceC0901xpM2468d.toString() : z30.m2767l(new StringBuilder("property "), this.f1402d, " (Kotlin reflection is not available)");
    }
}
