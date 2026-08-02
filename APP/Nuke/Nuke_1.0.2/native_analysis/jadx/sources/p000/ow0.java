package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ow0 implements pw0 {

    /* JADX INFO: renamed from: a */
    public final hg2 f7861a;

    public ow0(hg2 hg2Var) {
        this.f7861a = hg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ow0) && this.f7861a.equals(((ow0) obj).f7861a);
    }

    public final int hashCode() {
        return this.f7861a.hashCode();
    }

    public final String toString() {
        return "File(ref=" + this.f7861a + ")";
    }
}
