package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sl0 {

    /* JADX INFO: renamed from: α */
    public final long f9946;

    /* JADX INFO: renamed from: β */
    public final long f9947;

    /* JADX INFO: renamed from: γ */
    public final long f9948;

    /* JADX INFO: renamed from: δ */
    public final boolean f9949;

    /* JADX INFO: renamed from: ε */
    public final float f9950;

    /* JADX INFO: renamed from: ζ */
    public final long f9951;

    /* JADX INFO: renamed from: η */
    public final long f9952;

    /* JADX INFO: renamed from: θ */
    public final boolean f9953;

    public sl0(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13) {
            r0 = this;
            r0.<init>()
            r0.f9946 = r1
            r0.f9947 = r3
            r0.f9948 = r5
            r0.f9949 = r7
            r0.f9950 = r8
            r0.f9951 = r9
            r0.f9952 = r11
            r0.f9953 = r13
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IndirectPointerInputChange(id="
            r0.<init>(r1)
            long r1 = r3.f9946
            java.lang.String r1 = p000.u81.m5818(r1)
            r0.append(r1)
            java.lang.String r1 = ", uptimeMillis="
            r0.append(r1)
            long r1 = r3.f9947
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.f9948
            java.lang.String r1 = p000.o41.m4206(r1)
            r0.append(r1)
            java.lang.String r1 = ", pressed="
            r0.append(r1)
            boolean r1 = r3.f9949
            r0.append(r1)
            java.lang.String r1 = ", pressure="
            r0.append(r1)
            float r1 = r3.f9950
            r0.append(r1)
            java.lang.String r1 = ", previousUptimeMillis="
            r0.append(r1)
            long r1 = r3.f9951
            r0.append(r1)
            java.lang.String r1 = ", previousPosition="
            r0.append(r1)
            long r1 = r3.f9952
            java.lang.String r1 = p000.o41.m4206(r1)
            r0.append(r1)
            java.lang.String r1 = ", previousPressed="
            r0.append(r1)
            boolean r3 = r3.f9953
            java.lang.String r1 = ", isConsumed=false)"
            java.lang.String r3 = p000.lz1.m3693(r0, r3, r1)
            return r3
    }
}
