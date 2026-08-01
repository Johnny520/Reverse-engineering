package p000;

/* JADX INFO: renamed from: nj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0588nj implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f7637;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.ClassLoader f7638;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.util.List f7639;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.app.Activity f7640;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ p000.a80 f7641;

    public /* synthetic */ RunnableC0588nj(java.lang.ClassLoader r1, java.util.List r2, android.app.Activity r3, p000.a80 r4, int r5) {
            r0 = this;
            r0.f7637 = r5
            r0.f7638 = r1
            r0.f7639 = r2
            r0.f7640 = r3
            r0.f7641 = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f7637
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            android.app.Activity r0 = r3.f7640
            a80 r1 = r3.f7641
            java.lang.ClassLoader r2 = r3.f7638
            java.util.List r3 = r3.f7639
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.m1436(r2, r3, r0, r1)
            return
        L11:
            android.app.Activity r0 = r3.f7640
            a80 r1 = r3.f7641
            java.lang.ClassLoader r2 = r3.f7638
            java.util.List r3 = r3.f7639
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.m1395(r2, r3, r0, r1)
            return
    }
}
