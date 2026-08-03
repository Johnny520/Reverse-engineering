package p000a;

/* JADX INFO: renamed from: a.kc */
/* JADX INFO: loaded from: classes.dex */
public final class C0672kc implements InterfaceC0473a3 {

    /* JADX INFO: renamed from: a */
    public final Class<?> f2511a;

    public C0672kc(Class cls) {
        C0631i9.m1482e(cls, "jClass");
        this.f2511a = cls;
    }

    @Override // p000a.InterfaceC0473a3
    /* JADX INFO: renamed from: a */
    public final Class<?> mo1151a() {
        return this.f2511a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0672kc) {
            return C0631i9.m1478a(this.f2511a, ((C0672kc) obj).f2511a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2511a.hashCode();
    }

    public final String toString() {
        return this.f2511a + " (Kotlin reflection is not available)";
    }
}
