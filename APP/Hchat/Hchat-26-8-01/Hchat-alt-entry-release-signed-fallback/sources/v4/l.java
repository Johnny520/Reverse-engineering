package v4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends v4.w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v4.m f14101i;

    @Override // w4.d
    public final w4.c getType() {
            r1 = this;
            v4.d0 r0 = r1.f14125g
            w4.c r0 = r0.f14088g
            return r0
    }

    @Override // v4.a
    public final java.lang.String j() {
            r1 = this;
            java.lang.String r0 = "enum"
            return r0
    }

    public final v4.m k() {
            r3 = this;
            v4.m r0 = r3.f14101i
            if (r0 != 0) goto Lf
            v4.m r0 = new v4.m
            v4.d0 r1 = r3.f14125g
            v4.z r2 = r3.f14126h
            r0.<init>(r1, r2)
            r3.f14101i = r0
        Lf:
            v4.m r0 = r3.f14101i
            return r0
    }
}
