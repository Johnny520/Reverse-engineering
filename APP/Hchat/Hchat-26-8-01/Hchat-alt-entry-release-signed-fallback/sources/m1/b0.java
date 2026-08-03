package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8505b;

    public b0(int r4) {
            r3 = this;
            r0 = r4 & 1
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r4 = r4 & 2
            if (r4 == 0) goto Le
            r1 = r2
        Le:
            r3.<init>()
            r3.f8504a = r0
            r3.f8505b = r1
            return
    }
}
