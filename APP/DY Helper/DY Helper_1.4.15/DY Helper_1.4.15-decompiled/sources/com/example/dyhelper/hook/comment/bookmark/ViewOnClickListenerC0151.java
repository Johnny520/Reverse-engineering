package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: renamed from: com.example.dyhelper.hook.comment.bookmark.ι */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0151 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2383;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord f2384;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter f2385;

    public /* synthetic */ ViewOnClickListenerC0151(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r1, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r2, int r3) {
            r0 = this;
            r0.f2383 = r3
            r0.f2385 = r1
            r0.f2384 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ ViewOnClickListenerC0151(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r2, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r3) {
            r1 = this;
            r0 = 1
            r1.f2383 = r0
            r1.<init>()
            r1.f2384 = r2
            r1.f2385 = r3
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            int r0 = r1.f2383
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$CommentBookmarkAdapter r0 = r1.f2385
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1 = r1.f2384
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter.m1386(r0, r1, r2)
            return
        Ld:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0 = r1.f2384
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$CommentBookmarkAdapter r1 = r1.f2385
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter.m1384(r1, r0, r2)
            return
        L15:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$CommentBookmarkAdapter r0 = r1.f2385
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1 = r1.f2384
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter.m1385(r0, r1, r2)
            return
    }
}
