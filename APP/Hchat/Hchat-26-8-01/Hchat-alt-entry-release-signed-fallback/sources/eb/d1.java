package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements j8.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb.c1 f2535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eb.w0 f2536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eb.w0 f2537c;

    public d1(eb.c1 r1, eb.w0 r2, eb.w0 r3) {
            r0 = this;
            r0.<init>()
            r0.f2535a = r1
            r0.f2536b = r2
            r0.f2537c = r3
            return
    }

    @Override // j8.q
    public final void c(java.lang.String r2) {
            r1 = this;
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L8
            java.lang.String r2 = "Video download failed"
        L8:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r2)
            eb.w0 r2 = r1.f2536b
            r2.invoke(r0)
            return
    }

    @Override // j8.q
    public final void onSuccess(java.io.File r5) {
            r4 = this;
            eb.c1 r0 = r4.f2535a
            long r0 = r0.f2518d
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L22
            long r2 = r5.length()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L22
            r5.delete()
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r0 = "Video download is incomplete"
            r5.<init>(r0)
            eb.w0 r0 = r4.f2536b
            r0.invoke(r5)
            return
        L22:
            eb.w0 r0 = r4.f2537c
            r0.invoke(r5)
            return
    }
}
