package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: renamed from: com.example.dyhelper.hook.comment.bookmark.μ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0154 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2391;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord f2392;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter f2393;

    public /* synthetic */ ViewOnClickListenerC0154(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r2, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r3) {
            r1 = this;
            r0 = 0
            r1.f2391 = r0
            r1.<init>()
            r1.f2393 = r2
            r1.f2392 = r3
            return
    }

    public /* synthetic */ ViewOnClickListenerC0154(com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r2, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r3) {
            r1 = this;
            r0 = 1
            r1.f2391 = r0
            r1.<init>()
            r1.f2392 = r2
            r1.f2393 = r3
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            int r0 = r1.f2391
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r0 = r1.f2392
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$VideoBookmarkAdapter r1 = r1.f2393
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter.m1391(r1, r0, r2)
            return
        Ld:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$VideoBookmarkAdapter r0 = r1.f2393
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r1 = r1.f2392
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter.m1392(r0, r1, r2)
            return
    }
}
