package p000;

/* JADX INFO: renamed from: Cd */
/* JADX INFO: loaded from: classes.dex */
public final class C0106Cd {

    /* JADX INFO: renamed from: a */
    public final String f249a;

    public C0106Cd(String str) {
        this.f249a = AbstractC0235Fd.m479b(str);
    }

    /* JADX INFO: renamed from: a */
    public final Class m158a(ClassLoader classLoader) {
        C1256cF c1256cF = AbstractC2808zl.f9522a;
        return AbstractC2808zl.m5432a(this.f249a, classLoader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0106Cd)) {
            return false;
        }
        return AbstractC0585Nj.m1134a(this.f249a, ((C0106Cd) obj).f249a);
    }

    public final int hashCode() {
        return this.f249a.hashCode();
    }

    public final String toString() {
        return AbstractC0235Fd.m481d(this.f249a);
    }
}
