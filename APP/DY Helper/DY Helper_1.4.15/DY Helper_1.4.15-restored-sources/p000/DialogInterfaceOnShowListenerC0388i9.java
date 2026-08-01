package p000;

/* JADX INFO: renamed from: i9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnShowListenerC0388i9 implements android.content.DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f4961;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f4962;

    public /* synthetic */ DialogInterfaceOnShowListenerC0388i9(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f4961 = r1
            r0.f4962 = r2
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface r2) {
            r1 = this;
            int r0 = r1.f4961
            java.lang.Object r1 = r1.f4962
            switch(r0) {
                case 0: goto L1a;
                case 1: goto L14;
                case 2: goto Ld;
                default: goto L7;
            }
        L7:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog r1 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog) r1
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog.m1446(r1, r2)
            return
        Ld:
            android.app.Activity r1 = (android.app.Activity) r1
            r2 = 1
            p000.dd1.m1715(r1, r2)
            return
        L14:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r1 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog) r1
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog.m1401(r1, r2)
            return
        L1a:
            η r1 = (p000.C1084) r1
            r1.invoke()     // Catch: java.lang.Throwable -> L22
            s62 r1 = p000.s62.f9751     // Catch: java.lang.Throwable -> L22
            goto L29
        L22:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L29:
            java.lang.Throwable r1 = p000.fo1.m2190(r1)
            if (r1 == 0) goto L36
            java.lang.String r2 = "r24de9f070d18b34b"
            java.lang.String r0 = "公告弹窗展示 回调执行失败"
            p000.C0888ux.m5977(r2, r0, r1)
        L36:
            return
    }
}
