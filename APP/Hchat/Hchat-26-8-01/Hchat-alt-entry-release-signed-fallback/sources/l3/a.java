package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f7782a;

    public /* synthetic */ a(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f7782a = r1
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            java.lang.String r1 = r2.f7782a
            r0.<init>(r3, r1)
            r3 = 10
            r0.setPriority(r3)
            return r0
    }
}
