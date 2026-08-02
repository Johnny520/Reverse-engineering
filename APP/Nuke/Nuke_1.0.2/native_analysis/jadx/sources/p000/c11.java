package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c11 extends a11 {

    /* JADX INFO: renamed from: k */
    public static final c11 f1105k = new c11(1, 0, 1);

    @Override // p000.a11
    public final boolean equals(Object obj) {
        if (!(obj instanceof c11)) {
            return false;
        }
        if (isEmpty() && ((c11) obj).isEmpty()) {
            return true;
        }
        c11 c11Var = (c11) obj;
        return this.f25h == c11Var.f25h && this.f26i == c11Var.f26i;
    }

    @Override // p000.a11
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f25h * 31) + this.f26i;
    }

    @Override // p000.a11
    public final boolean isEmpty() {
        return this.f25h > this.f26i;
    }

    @Override // p000.a11
    public final String toString() {
        return this.f25h + ".." + this.f26i;
    }
}
