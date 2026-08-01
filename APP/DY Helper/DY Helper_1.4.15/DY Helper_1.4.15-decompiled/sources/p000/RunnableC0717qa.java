package p000;

/* JADX INFO: renamed from: qa */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0717qa implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8930;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.widget.ImageView f8931;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f8932;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.app.Activity f8933;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.graphics.Bitmap f8934;

    public /* synthetic */ RunnableC0717qa(android.widget.ImageView r1, java.lang.String r2, android.app.Activity r3, android.graphics.Bitmap r4, int r5) {
            r0 = this;
            r0.f8930 = r5
            r0.f8931 = r1
            r0.f8932 = r2
            r0.f8933 = r3
            r0.f8934 = r4
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f8930
            switch(r0) {
                case 0: goto L2c;
                default: goto L5;
            }
        L5:
            android.widget.ImageView r0 = r3.f8931
            java.lang.Object r1 = r0.getTag()
            java.lang.String r2 = r3.f8932
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L2b
            r1 = 0
            r0.setImageTintList(r1)
            r1 = 0
            r0.setPadding(r1, r1, r1, r1)
            android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable
            android.app.Activity r2 = r3.f8933
            android.content.res.Resources r2 = r2.getResources()
            android.graphics.Bitmap r3 = r3.f8934
            r1.<init>(r2, r3)
            r0.setImageDrawable(r1)
        L2b:
            return
        L2c:
            android.app.Activity r0 = r3.f8933
            android.graphics.Bitmap r1 = r3.f8934
            android.widget.ImageView r2 = r3.f8931
            java.lang.String r3 = r3.f8932
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.m1364(r2, r3, r0, r1)
            return
    }
}
