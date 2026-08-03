package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12214e;

    public c(long r1, long r3, float r5, long r6, long r8) {
            r0 = this;
            r0.<init>()
            r0.f12210a = r1
            r0.f12211b = r3
            r0.f12212c = r5
            r0.f12213d = r6
            r0.f12214e = r8
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HistoricalChange(uptimeMillis="
            r0.<init>(r1)
            long r1 = r3.f12210a
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.f12211b
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = ", scaleFactor="
            r0.append(r1)
            float r1 = r3.f12212c
            r0.append(r1)
            java.lang.String r1 = ", panOffset="
            r0.append(r1)
            long r1 = r3.f12213d
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
