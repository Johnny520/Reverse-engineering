package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements android.view.Choreographer.FrameCallback {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qg.g f22023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.l f22024h;

    public o0(qg.g r1, i0.d r2, fg.l r3) {
            r0 = this;
            r0.<init>()
            r0.f22023g = r1
            r0.f22024h = r3
            return
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r2) {
            r1 = this;
            fg.l r0 = r1.f22024h
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r0.invoke(r2)     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L12:
            qg.g r3 = r1.f22023g
            r3.resumeWith(r2)
            return
    }
}
