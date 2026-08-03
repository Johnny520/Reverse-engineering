package p1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10084i;

    public b(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13) {
            r0 = this;
            r0.<init>()
            r0.f10076a = r1
            r0.f10077b = r3
            r0.f10078c = r5
            r0.f10079d = r7
            r0.f10080e = r8
            r0.f10081f = r9
            r0.f10082g = r11
            r0.f10083h = r13
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IndirectPointerInputChange(id="
            r0.<init>(r1)
            long r1 = r3.f10076a
            java.lang.String r1 = s1.s.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", uptimeMillis="
            r0.append(r1)
            long r1 = r3.f10077b
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.f10078c
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = ", pressed="
            r0.append(r1)
            boolean r1 = r3.f10079d
            r0.append(r1)
            java.lang.String r1 = ", pressure="
            r0.append(r1)
            float r1 = r3.f10080e
            r0.append(r1)
            java.lang.String r1 = ", previousUptimeMillis="
            r0.append(r1)
            long r1 = r3.f10081f
            r0.append(r1)
            java.lang.String r1 = ", previousPosition="
            r0.append(r1)
            long r1 = r3.f10082g
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = ", previousPressed="
            r0.append(r1)
            boolean r1 = r3.f10083h
            r0.append(r1)
            java.lang.String r1 = ", isConsumed="
            r0.append(r1)
            boolean r1 = r3.f10084i
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
