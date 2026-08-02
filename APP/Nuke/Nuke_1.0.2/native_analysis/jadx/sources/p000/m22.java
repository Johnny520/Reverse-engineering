package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m22 extends t11 {

    /* JADX INFO: renamed from: k */
    public final Object f6446k;

    /* JADX INFO: renamed from: l */
    public final long f6447l;

    public m22(long j, Object obj) {
        this.f6446k = obj;
        this.f6447l = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m22)) {
            return false;
        }
        m22 m22Var = (m22) obj;
        return this.f6446k.equals(m22Var.f6446k) && this.f6447l == m22Var.f6447l;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6447l) + (this.f6446k.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.f6446k + ", compositeKey=" + this.f6447l + ')';
    }
}
