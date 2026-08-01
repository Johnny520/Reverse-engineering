package p000;

/* JADX INFO: renamed from: fx */
/* JADX INFO: loaded from: classes.dex */
public final class C0240fx implements InterfaceC0441la {

    /* JADX INFO: renamed from: a */
    public final Class f1996a;

    public C0240fx(Class cls) {
        this.f1996a = cls;
    }

    @Override // p000.InterfaceC0441la
    /* JADX INFO: renamed from: a */
    public final Class mo1238a() {
        return this.f1996a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0240fx) {
            return AbstractC0346ip.m1497i(this.f1996a, ((C0240fx) obj).f1996a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1996a.hashCode();
    }

    public final String toString() {
        return this.f1996a + " (Kotlin reflection is not available)";
    }
}
