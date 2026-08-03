package p000;

/* JADX INFO: renamed from: Cd */
/* JADX INFO: loaded from: classes.dex */
public final class C0106Cd {

    /* JADX INFO: renamed from: a */
    public final String f249a;

    public C0106Cd(String r1) {
        this.f249a = AbstractC0235Fd.m479b(r1);
    }

    /* JADX INFO: renamed from: a */
    public final Class m158a(ClassLoader r2) {
        C1256cF r0 = AbstractC2808zl.f9522a;
        return AbstractC2808zl.m5432a(this.f249a, r2);
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof C0106Cd) == true) goto L9;
        return false;
    L9:
        String r22 = ((C0106Cd) r2).f249a;
        return AbstractC0585Nj.m1134a(this.f249a, r22);
    }

    public final int hashCode() {
        return this.f249a.hashCode();
    }

    public final String toString() {
        return AbstractC0235Fd.m481d(this.f249a);
    }
}
