package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: renamed from: com.example.dyhelper.hook.comment.bookmark.λ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0153 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2388;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord f2389;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter f2390;

    public /* synthetic */ ViewOnClickListenerC0153(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r1, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2, int r3) {
            r0 = this;
            r0.f2388 = r3
            r0.f2390 = r1
            r0.f2389 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ ViewOnClickListenerC0153(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r3) {
            r1 = this;
            r0 = 1
            r1.f2388 = r0
            r1.<init>()
            r1.f2389 = r2
            r1.f2390 = r3
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            int r0 = r1.f2388
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$ProfileBookmarkAdapter r0 = r1.f2390
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = r1.f2389
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter.m1387(r0, r1, r2)
            return
        Ld:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = r1.f2389
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$ProfileBookmarkAdapter r1 = r1.f2390
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter.m1390(r1, r0, r2)
            return
        L15:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$ProfileBookmarkAdapter r0 = r1.f2390
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = r1.f2389
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter.m1389(r0, r1, r2)
            return
    }
}
