package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements i0.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f14465b;

    public /* synthetic */ g1(i0.a1 r1, int r2) {
            r0 = this;
            r0.f14464a = r2
            r0.f14465b = r1
            r0.<init>()
            return
    }

    public g1(i0.a1 r1, i0.a0 r2) {
            r0 = this;
            r2 = 2
            r0.f14464a = r2
            r0.<init>()
            r0.f14465b = r1
            return
    }

    @Override // i0.z
    public final void a() {
            r3 = this;
            int r0 = r3.f14464a
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L20;
                default: goto L5;
            }
        L5:
            i0.a1 r0 = r3.f14465b
            java.lang.Object r1 = r0.getValue()
            android.media.MediaPlayer r1 = (android.media.MediaPlayer) r1
            if (r1 == 0) goto L1b
            boolean r2 = r1.isPlaying()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L18
            r1.stop()     // Catch: java.lang.Throwable -> L18
        L18:
            r1.release()     // Catch: java.lang.Throwable -> L1b
        L1b:
            r1 = 0
            r0.setValue(r1)
            return
        L20:
            i0.a1 r0 = r3.f14465b
            java.lang.Object r0 = r0.getValue()
            android.widget.VideoView r0 = (android.widget.VideoView) r0
            if (r0 == 0) goto L2d
            r0.stopPlayback()
        L2d:
            return
        L2e:
            i0.a1 r0 = r3.f14465b
            java.lang.Object r1 = r0.getValue()
            n.m r1 = (n.m) r1
            if (r1 == 0) goto L3c
            r1 = 0
            r0.setValue(r1)
        L3c:
            return
    }
}
