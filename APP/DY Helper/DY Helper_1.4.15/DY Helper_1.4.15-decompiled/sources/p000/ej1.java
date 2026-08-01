package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ej1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3573;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f3574;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f3575;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ int f3576;

    public /* synthetic */ ej1(android.app.Activity r1, java.lang.String r2, int r3, int r4) {
            r0 = this;
            r0.f3573 = r4
            r0.f3574 = r1
            r0.f3575 = r2
            r0.f3576 = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f3573
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = r2.f3575
            int r1 = r2.f3576
            android.app.Activity r2 = r2.f3574
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.m1454(r2, r0, r1)
            return
        Lf:
            java.lang.String r0 = r2.f3575
            int r1 = r2.f3576
            android.app.Activity r2 = r2.f3574
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.m1456(r2, r0, r1)
            return
    }
}
