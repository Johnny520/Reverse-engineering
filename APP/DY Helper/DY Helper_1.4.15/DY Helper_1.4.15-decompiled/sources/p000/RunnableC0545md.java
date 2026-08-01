package p000;

/* JADX INFO: renamed from: md */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0545md implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7074;

    public /* synthetic */ RunnableC0545md() {
            r1 = this;
            r0 = 1
            r1.f7074 = r0
            r1.<init>()
            return
    }

    public RunnableC0545md(p000.y21 r1, int r2) {
            r0 = this;
            r1 = 0
            r0.f7074 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m3804() {
            r0 = this;
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r0 = this;
            int r0 = r0.f7074
            switch(r0) {
                case 0: goto L20;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "EmojiCompat.EmojiCompatInitializer.run"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L1b
            boolean r0 = p000.C0449jy.m3072()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L17
            jy r0 = p000.C0449jy.m3071()     // Catch: java.lang.Throwable -> L1b
            r0.m3074()     // Catch: java.lang.Throwable -> L1b
        L17:
            android.os.Trace.endSection()
            return
        L1b:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L20:
            return
    }
}
