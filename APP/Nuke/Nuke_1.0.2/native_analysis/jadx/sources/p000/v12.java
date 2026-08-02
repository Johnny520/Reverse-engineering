package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v12 {

    /* JADX INFO: renamed from: a */
    public final int f11601a;

    public final boolean equals(Object obj) {
        if (obj instanceof v12) {
            return this.f11601a == ((v12) obj).f11601a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11601a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f11601a + ')';
    }
}
