package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ny0 {

    /* JADX INFO: renamed from: a */
    public final int f7366a;

    public final boolean equals(Object obj) {
        if (obj instanceof ny0) {
            return this.f7366a == ((ny0) obj).f7366a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7366a);
    }

    public final String toString() {
        return "IndirectPointerEventPrimaryDirectionalMotionAxis(value=" + this.f7366a + ')';
    }
}
