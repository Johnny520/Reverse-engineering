package p000;

/* JADX INFO: renamed from: z5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1046z5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ android.widget.TextView f12976;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.graphics.Typeface f12977;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ int f12978;

    public RunnableC1046z5(android.widget.TextView r1, android.graphics.Typeface r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f12976 = r1
            r0.f12977 = r2
            r0.f12978 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            android.graphics.Typeface r0 = r2.f12977
            int r1 = r2.f12978
            android.widget.TextView r2 = r2.f12976
            r2.setTypeface(r0, r1)
            return
    }
}
