package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fw1 implements InterfaceC0667rs {

    /* JADX INFO: renamed from: a */
    public final Class f3158a;

    public fw1(Class cls) {
        this.f3158a = cls;
    }

    @Override // p000.InterfaceC0667rs
    /* JADX INFO: renamed from: a */
    public final Class mo589a() {
        return this.f3158a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fw1) {
            return this.f3158a.equals(((fw1) obj).f3158a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3158a.hashCode();
    }

    public final String toString() {
        return this.f3158a.toString() + " (Kotlin reflection is not available)";
    }
}
