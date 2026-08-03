package f2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg.p f3253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3254c;

    public /* synthetic */ x(java.lang.String r2) {
            r1 = this;
            f2.k r0 = f2.k.A
            r1.<init>(r2, r0)
            return
    }

    public x(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.f3254c = r1
            return
    }

    public x(java.lang.String r1, fg.p r2) {
            r0 = this;
            r0.<init>()
            r0.f3252a = r1
            r0.f3253b = r2
            return
    }

    public x(java.lang.String r1, boolean r2, fg.p r3) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.f3254c = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AccessibilityKey: "
            r0.<init>(r1)
            java.lang.String r1 = r2.f3252a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
