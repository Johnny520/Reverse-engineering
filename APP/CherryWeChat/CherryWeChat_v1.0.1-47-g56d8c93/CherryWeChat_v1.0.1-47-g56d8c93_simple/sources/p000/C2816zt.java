package p000;

/* JADX INFO: renamed from: zt */
/* JADX INFO: loaded from: classes.dex */
public final class C2816zt implements InterfaceC2747y9 {

    /* JADX INFO: renamed from: a */
    public final Class f9537a;

    public C2816zt(Class r1) {
        this.f9537a = r1;
    }

    @Override // p000.InterfaceC2747y9
    /* JADX INFO: renamed from: a */
    public final Class mo444a() {
        return this.f9537a;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C2816zt) == false) goto L8;
        Class r22 = ((C2816zt) r2).f9537a;
        if (AbstractC0585Nj.m1134a(this.f9537a, r22) == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public final int hashCode() {
        return this.f9537a.hashCode();
    }

    public final String toString() {
        return this.f9537a + " (Kotlin reflection is not available)";
    }
}
