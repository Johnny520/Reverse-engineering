package p000;

/* JADX INFO: renamed from: hj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0279hj extends t11 {

    /* JADX INFO: renamed from: k */
    public final Object f4033k;

    /* JADX INFO: renamed from: l */
    public final long f4034l;

    public C0279hj(long j, Object obj) {
        this.f4033k = obj;
        this.f4034l = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0279hj)) {
            return false;
        }
        C0279hj c0279hj = (C0279hj) obj;
        return this.f4033k.equals(c0279hj.f4033k) && this.f4034l == c0279hj.f4034l;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4034l) + (this.f4033k.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f4033k + ", compositeKey=" + this.f4034l + ')';
    }
}
