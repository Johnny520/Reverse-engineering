package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j30 extends k30 {

    /* JADX INFO: renamed from: h */
    public final long f4885h;

    public j30(long j) {
        this.f4885h = j;
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: e */
    public final int mo626e(AbstractC0147dz abstractC0147dz) {
        long j = ((j30) abstractC0147dz).f4885h;
        long j2 = this.f4885h;
        if (j2 < j) {
            return -1;
        }
        return j2 > j ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f4885h == ((j30) obj).f4885h;
    }

    @Override // p000.k30
    /* JADX INFO: renamed from: g */
    public final boolean mo2046g() {
        long j = this.f4885h;
        return ((long) ((int) j)) == j;
    }

    @Override // p000.k30
    /* JADX INFO: renamed from: h */
    public final int mo2047h() {
        return (int) this.f4885h;
    }

    public final int hashCode() {
        long j = this.f4885h;
        return ((int) j) ^ ((int) (j >> 32));
    }

    @Override // p000.k30
    /* JADX INFO: renamed from: i */
    public final long mo2048i() {
        return this.f4885h;
    }
}
