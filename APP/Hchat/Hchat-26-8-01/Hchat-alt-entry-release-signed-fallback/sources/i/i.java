package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.l f5686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.h f5687b;

    public i(i.l r1, i.h r2) {
            r0 = this;
            r0.<init>()
            r0.f5686a = r1
            r0.f5687b = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnimationResult(endReason="
            r0.<init>(r1)
            i.h r1 = r2.f5687b
            r0.append(r1)
            java.lang.String r1 = ", endState="
            r0.append(r1)
            i.l r1 = r2.f5686a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
