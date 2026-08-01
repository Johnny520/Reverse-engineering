package p000;

/* JADX INFO: renamed from: nx */
/* JADX INFO: loaded from: classes.dex */
public final class C0538nx implements InterfaceC0737ta {

    /* JADX INFO: renamed from: a */
    public final Class f3354a;

    public C0538nx(Class cls) {
        this.f3354a = cls;
    }

    @Override // p000.InterfaceC0737ta
    /* JADX INFO: renamed from: a */
    public final Class mo1964a() {
        return this.f3354a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0538nx) {
            return AbstractC0493mp.m1853c(this.f3354a, ((C0538nx) obj).f3354a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3354a.hashCode();
    }

    public final String toString() {
        return this.f3354a + " (Kotlin reflection is not available)";
    }
}
