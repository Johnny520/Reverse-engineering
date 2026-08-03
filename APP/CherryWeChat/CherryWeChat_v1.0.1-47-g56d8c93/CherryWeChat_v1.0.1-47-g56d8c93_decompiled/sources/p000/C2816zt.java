package p000;

/* JADX INFO: renamed from: zt */
/* JADX INFO: loaded from: classes.dex */
public final class C2816zt implements InterfaceC2747y9 {

    /* JADX INFO: renamed from: a */
    public final Class f9537a;

    public C2816zt(Class cls) {
        this.f9537a = cls;
    }

    @Override // p000.InterfaceC2747y9
    /* JADX INFO: renamed from: a */
    public final Class mo444a() {
        return this.f9537a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2816zt) {
            return AbstractC0585Nj.m1134a(this.f9537a, ((C2816zt) obj).f9537a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9537a.hashCode();
    }

    public final String toString() {
        return this.f9537a + " (Kotlin reflection is not available)";
    }
}
