package p117X2;

/* JADX INFO: renamed from: X2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1668m implements InterfaceC1659d {

    /* JADX INFO: renamed from: a */
    public final Class f5703a;

    public C1668m(Class cls) {
        this.f5703a = cls;
    }

    @Override // p117X2.InterfaceC1659d
    /* JADX INFO: renamed from: a */
    public final Class mo2977a() {
        return this.f5703a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1668m) {
            return AbstractC1665j.m2981a(this.f5703a, ((C1668m) obj).f5703a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5703a.hashCode();
    }

    public final String toString() {
        return this.f5703a.toString() + " (Kotlin reflection is not available)";
    }
}
