package p047I0;

/* JADX INFO: renamed from: I0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0729g0 {

    /* JADX INFO: renamed from: a */
    public final int f2300a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0729g0) {
            return this.f2300a == ((C0729g0) obj).f2300a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2300a);
    }

    public final String toString() {
        return "AutoClearFocusBehavior(value=" + this.f2300a + ')';
    }
}
