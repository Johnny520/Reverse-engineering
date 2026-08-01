package p121i3;

/* JADX INFO: renamed from: i3.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3176f implements InterfaceC3175e {

    /* JADX INFO: renamed from: q */
    public final float f8453q;

    /* JADX INFO: renamed from: r */
    public final float f8454r;

    public C3176f(float f10, float f11) {
        this.f8453q = f10;
        this.f8454r = f11;
    }

    @Override // p121i3.InterfaceC3183m
    /* JADX INFO: renamed from: c1 */
    public float mo1231c1() {
        return this.f8454r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3176f)) {
            return false;
        }
        C3176f c3176f = (C3176f) obj;
        return Float.compare(this.f8453q, c3176f.f8453q) == 0 && Float.compare(this.f8454r, c3176f.f8454r) == 0;
    }

    @Override // p121i3.InterfaceC3175e
    public float getDensity() {
        return this.f8453q;
    }

    public int hashCode() {
        return (Float.hashCode(this.f8453q) * 31) + Float.hashCode(this.f8454r);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f8453q + ", fontScale=" + this.f8454r + ')';
    }
}
