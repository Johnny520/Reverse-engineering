package p091g2;

/* JADX INFO: renamed from: g2.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2504a {

    /* JADX INFO: renamed from: a */
    public long f6759a;

    /* JADX INFO: renamed from: b */
    public float f6760b;

    public C2504a(long j10, float f10) {
        this.f6759a = j10;
        this.f6760b = f10;
    }

    /* JADX INFO: renamed from: a */
    public final float m8980a() {
        return this.f6760b;
    }

    /* JADX INFO: renamed from: b */
    public final long m8981b() {
        return this.f6759a;
    }

    /* JADX INFO: renamed from: c */
    public final void m8982c(float f10) {
        this.f6760b = f10;
    }

    /* JADX INFO: renamed from: d */
    public final void m8983d(long j10) {
        this.f6759a = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2504a)) {
            return false;
        }
        C2504a c2504a = (C2504a) obj;
        return this.f6759a == c2504a.f6759a && Float.compare(this.f6760b, c2504a.f6760b) == 0;
    }

    public int hashCode() {
        return (Long.hashCode(this.f6759a) * 31) + Float.hashCode(this.f6760b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.f6759a + ", dataPoint=" + this.f6760b + ')';
    }
}
