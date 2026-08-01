package p000;

/* JADX INFO: renamed from: qj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0726qj implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9018;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.Spinner f9019;

    public /* synthetic */ RunnableC0726qj(android.widget.Spinner r1, int r2) {
            r0 = this;
            r0.f9018 = r2
            r0.f9019 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.f9018
            android.widget.Spinner r1 = r1.f9019
            switch(r0) {
                case 0: goto Lb;
                default: goto L7;
            }
        L7:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog.m1447(r1)
            return
        Lb:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog.m1408(r1)
            return
    }
}
