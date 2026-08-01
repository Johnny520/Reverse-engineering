package p000;

/* JADX INFO: renamed from: ra */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0754ra implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f9310;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.String f9311;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.app.Activity f9312;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.widget.ImageView f9313;

    public /* synthetic */ RunnableC0754ra(java.lang.String r1, android.app.Activity r2, android.widget.ImageView r3, int r4) {
            r0 = this;
            r0.f9310 = r4
            r0.f9311 = r1
            r0.f9312 = r2
            r0.f9313 = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f9310
            switch(r0) {
                case 0: goto L38;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = r7.f9311
            r0 = 30
            r1 = 0
            vx r2 = p000.C0963wx.m6411(r3, r1, r1, r0)     // Catch: java.lang.Throwable -> L19
            java.io.BufferedInputStream r0 = r2.f11459     // Catch: java.lang.Throwable -> L1b
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch: java.lang.Throwable -> L1b
            r2.m6283()     // Catch: java.lang.Throwable -> L19
            r5 = r0
            goto L28
        L19:
            r0 = move-exception
            goto L20
        L1b:
            r0 = move-exception
            r2.m6283()     // Catch: java.lang.Throwable -> L19
            throw r0     // Catch: java.lang.Throwable -> L19
        L20:
            java.lang.String r2 = "DYHelper"
            java.lang.String r4 = "操作菜单缩略图加载失败"
            p000.C0888ux.m5977(r2, r4, r0)
            r5 = r1
        L28:
            if (r5 == 0) goto L37
            qa r1 = new qa
            r6 = 1
            android.widget.ImageView r2 = r7.f9313
            android.app.Activity r4 = r7.f9312
            r1.<init>(r2, r3, r4, r5, r6)
            r4.runOnUiThread(r1)
        L37:
            return
        L38:
            android.app.Activity r0 = r7.f9312
            android.widget.ImageView r1 = r7.f9313
            java.lang.String r7 = r7.f9311
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.m1380(r7, r0, r1)
            return
    }
}
