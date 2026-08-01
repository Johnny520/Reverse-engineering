package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class va2 {

    /* JADX INFO: renamed from: α */
    public final android.app.Activity f11208;

    /* JADX INFO: renamed from: β */
    public final android.view.View f11209;

    /* JADX INFO: renamed from: γ */
    public final android.widget.TextView f11210;

    /* JADX INFO: renamed from: δ */
    public final android.widget.ProgressBar f11211;

    /* JADX INFO: renamed from: ε */
    public final android.os.Handler f11212;

    /* JADX INFO: renamed from: ζ */
    public android.media.MediaPlayer f11213;

    /* JADX INFO: renamed from: η */
    public final p000.RunnableC0196d1 f11214;

    public va2(android.app.Activity r1, android.view.View r2, android.widget.TextView r3, android.widget.ProgressBar r4) {
            r0 = this;
            r0.<init>()
            r0.f11208 = r1
            r0.f11209 = r2
            r0.f11210 = r3
            r0.f11211 = r4
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.f11212 = r1
            d1 r1 = new d1
            r2 = 14
            r1.<init>(r2, r0)
            r0.f11214 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m6142() {
            r2 = this;
            android.os.Handler r0 = r2.f11212
            d1 r1 = r2.f11214
            r0.removeCallbacks(r1)
            android.media.MediaPlayer r0 = r2.f11213     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto Le
            r0.stop()     // Catch: java.lang.Throwable -> Le
        Le:
            android.media.MediaPlayer r0 = r2.f11213     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L15
            r0.release()     // Catch: java.lang.Throwable -> L15
        L15:
            r0 = 0
            r2.f11213 = r0
            android.view.View r0 = r2.f11209
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ProgressBar r2 = r2.f11211
            r0 = 0
            r2.setIndeterminate(r0)
            r2.setProgress(r0)
            return
    }
}
