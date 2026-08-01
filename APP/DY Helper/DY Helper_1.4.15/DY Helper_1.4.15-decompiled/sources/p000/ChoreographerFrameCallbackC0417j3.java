package p000;

/* JADX INFO: renamed from: j3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0417j3 implements android.view.Choreographer.FrameCallback {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ p000.C0015ae f5302;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.a80 f5303;

    public ChoreographerFrameCallbackC0417j3(p000.C0015ae r1, p000.C0455k3 r2, p000.a80 r3) {
            r0 = this;
            r0.<init>()
            r0.f5302 = r1
            r0.f5303 = r3
            return
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r2) {
            r1 = this;
            a80 r0 = r1.f5303
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r2 = r0.invoke(r2)     // Catch: java.lang.Throwable -> Lb
            goto L12
        Lb:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L12:
            ae r1 = r1.f5302
            r1.mo75(r2)
            return
    }
}
