package p007B0;

/* JADX INFO: renamed from: B0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0176I {

    /* JADX INFO: renamed from: a */
    public final int f622a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0176I) {
            return this.f622a == ((C0176I) obj).f622a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f622a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f622a + ')';
    }
}
