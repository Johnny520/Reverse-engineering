package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: renamed from: com.example.dyhelper.hook.comment.bookmark.κ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0152 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2386;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.BaseAdapter f2387;

    public /* synthetic */ C0152(android.widget.BaseAdapter r1, int r2) {
            r0 = this;
            r0.f2386 = r2
            r0.f2387 = r1
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r1 = this;
            int r0 = r1.f2386
            android.widget.BaseAdapter r1 = r1.f2387
            switch(r0) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$ProfileBookmarkAdapter r1 = (com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter) r1
            s62 r1 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter.m1388(r1)
            return r1
        Le:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$CommentBookmarkAdapter r1 = (com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter) r1
            s62 r1 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter.m1383(r1)
            return r1
    }
}
