package p000;

/* JADX INFO: renamed from: an */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0024an implements InterfaceC0968ym {

    /* JADX INFO: renamed from: d */
    public final float f195d;

    /* JADX INFO: renamed from: e */
    public final float f196e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0817uv f197f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0024an(float f, float f2, InterfaceC0817uv interfaceC0817uv) {
        this.f195d = f;
        this.f196e = f2;
        this.f197f = interfaceC0817uv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return this.f195d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0024an)) {
            return false;
        }
        C0024an c0024an = (C0024an) obj;
        return Float.compare(this.f195d, c0024an.f195d) == 0 && Float.compare(this.f196e, c0024an.f196e) == 0 && this.f197f.equals(c0024an.f197f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return this.f196e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f197f.hashCode() + AbstractC0748t1.m4143a(this.f196e, Float.hashCode(this.f195d) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: o */
    public final long mo187o(float f) {
        return j50.m1670t(this.f197f.mo2685a(f), 4294967296L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DensityWithConverter(density=" + this.f195d + ", fontScale=" + this.f196e + ", converter=" + this.f197f + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: y */
    public final float mo188y(long j) {
        if (v71.m4419a(u71.m4287b(j), 4294967296L)) {
            return this.f197f.mo2686b(u71.m4288c(j));
        }
        C0921xc.m5134o("Only Sp can convert to Px");
        return 0.0f;
    }
}
