package p000;

/* JADX INFO: renamed from: tj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0837tj implements android.view.View.OnFocusChangeListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10395;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f10396;

    public /* synthetic */ ViewOnFocusChangeListenerC0837tj(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f10395 = r1
            r0.f10396 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View r2, boolean r3) {
            r1 = this;
            int r0 = r1.f10395
            java.lang.Object r1 = r1.f10396
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L7;
            }
        L7:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog r1 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog) r1
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog.m1442(r1, r2, r3)
            return
        Ld:
            nd0 r1 = (p000.nd0) r1
            if (r3 == 0) goto L14
            r1.m4033()
        L14:
            return
        L15:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r1 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog) r1
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog.m1399(r1, r2, r3)
            return
    }
}
