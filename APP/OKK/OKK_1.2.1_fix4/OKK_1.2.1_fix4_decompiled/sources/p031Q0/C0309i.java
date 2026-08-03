package p031Q0;

/* JADX INFO: renamed from: Q0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0309i implements InterfaceC0302b {

    /* JADX INFO: renamed from: a */
    public final Class f591a;

    public C0309i(Class cls) {
        AbstractC0307g.m703e(cls, "jClass");
        this.f591a = cls;
    }

    @Override // p031Q0.InterfaceC0302b
    /* JADX INFO: renamed from: a */
    public final Class mo696a() {
        return this.f591a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0309i) {
            if (AbstractC0307g.m699a(this.f591a, ((C0309i) obj).f591a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f591a.hashCode();
    }

    public final String toString() {
        return this.f591a.toString() + " (Kotlin reflection is not available)";
    }
}
