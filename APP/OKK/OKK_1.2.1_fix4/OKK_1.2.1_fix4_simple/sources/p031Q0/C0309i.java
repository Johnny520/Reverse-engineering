package p031Q0;

/* JADX INFO: renamed from: Q0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0309i implements InterfaceC0302b {

    /* JADX INFO: renamed from: a */
    public final Class f591a;

    public C0309i(Class r2) {
        AbstractC0307g.m703e(r2, "jClass");
        this.f591a = r2;
    }

    @Override // p031Q0.InterfaceC0302b
    /* JADX INFO: renamed from: a */
    public final Class mo696a() {
        return this.f591a;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C0309i) == false) goto L7;
        Class r22 = ((C0309i) r2).f591a;
        if (AbstractC0307g.m699a(this.f591a, r22) == false) goto L7;
        return true;
    L7:
        return false;
    }

    public final int hashCode() {
        return this.f591a.hashCode();
    }

    public final String toString() {
        return this.f591a.toString() + " (Kotlin reflection is not available)";
    }
}
