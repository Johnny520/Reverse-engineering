package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oh2 {

    /* JADX INFO: renamed from: a */
    public final sz0 f7685a;

    public oh2(sz0 sz0Var) {
        this.f7685a = sz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oh2) && this.f7685a == ((oh2) obj).f7685a;
    }

    public final int hashCode() {
        return this.f7685a.hashCode();
    }

    public final String toString() {
        return "ScriptLoadRequest(source=" + this.f7685a + ")";
    }
}
