package p000;

/* JADX INFO: renamed from: nq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0509nq extends C0552oq {

    /* JADX INFO: renamed from: a */
    public final Throwable f7280a;

    public C0509nq(Throwable th) {
        this.f7280a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0509nq) {
            return t11.m5086l(this.f7280a, ((C0509nq) obj).f7280a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f7280a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p000.C0552oq
    public final String toString() {
        return "Closed(" + this.f7280a + ')';
    }
}
