package p000;

/* JADX INFO: renamed from: sj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC0800sj implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9930;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.EditText f9931;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f9932;

    public /* synthetic */ ViewOnTouchListenerC0800sj(java.lang.Object r1, android.widget.EditText r2, int r3) {
            r0 = this;
            r0.f9930 = r3
            r0.f9932 = r1
            r0.f9931 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r2, android.view.MotionEvent r3) {
            r1 = this;
            int r0 = r1.f9930
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f9932
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog r0 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog) r0
            android.widget.EditText r1 = r1.f9931
            boolean r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog.m1441(r0, r1, r2, r3)
            return r1
        L10:
            java.lang.Object r0 = r1.f9932
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog) r0
            android.widget.EditText r1 = r1.f9931
            boolean r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog.m1403(r0, r1, r2, r3)
            return r1
    }
}
