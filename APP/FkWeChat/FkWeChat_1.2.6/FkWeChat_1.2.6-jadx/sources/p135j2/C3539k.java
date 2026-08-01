package p135j2;

/* JADX INFO: renamed from: j2.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3539k implements InterfaceC3527h {

    /* JADX INFO: renamed from: b */
    public final float f9853b;

    public C3539k(float f10) {
        this.f9853b = f10;
    }

    @Override // p135j2.InterfaceC3527h
    /* JADX INFO: renamed from: a */
    public long mo13126a(long j10, long j11) {
        float f10 = this.f9853b;
        return AbstractC3583x1.m13421a((((long) Float.floatToRawIntBits(f10)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f10))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3539k) && Float.compare(this.f9853b, ((C3539k) obj).f9853b) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f9853b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f9853b + ')';
    }
}
