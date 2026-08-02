package p000;

/* JADX INFO: renamed from: x7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0874x7 {

    /* JADX INFO: renamed from: a */
    public final int f12854a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0874x7) {
            return this.f12854a == ((C0874x7) obj).f12854a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12854a);
    }

    public final String toString() {
        return "AndroidContentDataType(androidAutofillType=" + this.f12854a + ')';
    }
}
