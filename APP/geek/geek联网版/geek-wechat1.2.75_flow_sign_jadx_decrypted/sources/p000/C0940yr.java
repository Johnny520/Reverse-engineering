package p000;

/* JADX INFO: renamed from: yr */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0940yr extends AbstractC0513n8 implements InterfaceC0379jm, InterfaceC0077bq {

    /* JADX INFO: renamed from: g */
    public final boolean f5486g;

    public C0940yr(C0977zr c0977zr) {
        super(c0977zr, AbstractC0259gf.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f5486g = false;
    }

    @Override // p000.InterfaceC0379jm
    /* JADX INFO: renamed from: a */
    public final Object mo474a() {
        return this.f3240b.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0077bq m2779d() {
        if (this.f5486g) {
            return this;
        }
        InterfaceC0077bq interfaceC0077bq = this.f3239a;
        if (interfaceC0077bq != null) {
            return interfaceC0077bq;
        }
        q00.f3767a.getClass();
        this.f3239a = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0940yr) {
            C0940yr c0940yr = (C0940yr) obj;
            return m1928c().equals(c0940yr.m1928c()) && this.f3242d.equals(c0940yr.f3242d) && this.f3243e.equals(c0940yr.f3243e) && AbstractC0493mp.m1853c(this.f3240b, c0940yr.f3240b);
        }
        if (obj instanceof C0940yr) {
            return obj.equals(m2779d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f3243e.hashCode() + g40.m1142e(this.f3242d, m1928c().hashCode() * 31, 31);
    }

    public final String toString() {
        InterfaceC0077bq interfaceC0077bqM2779d = m2779d();
        return interfaceC0077bqM2779d != this ? interfaceC0077bqM2779d.toString() : g40.m1149l(new StringBuilder("property "), this.f3242d, " (Kotlin reflection is not available)");
    }
}
