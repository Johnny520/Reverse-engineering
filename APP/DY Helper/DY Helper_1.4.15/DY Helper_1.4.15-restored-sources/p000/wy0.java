package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wy0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11895;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.dz0 f11896;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.widget.ImageView f11897;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.String f11898;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ android.widget.ProgressBar f11899;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ boolean f11900;

    /* JADX INFO: renamed from: λ */
    public final /* synthetic */ p000.az0 f11901;

    /* JADX INFO: renamed from: μ */
    public final /* synthetic */ java.lang.Object f11902;

    public /* synthetic */ wy0(p000.dz0 r2, android.widget.ImageView r3, java.lang.String r4, android.widget.ProgressBar r5, android.graphics.Bitmap r6, boolean r7, p000.az0 r8) {
            r1 = this;
            r0 = 1
            r1.f11895 = r0
            r1.<init>()
            r1.f11896 = r2
            r1.f11897 = r3
            r1.f11898 = r4
            r1.f11899 = r5
            r1.f11902 = r6
            r1.f11900 = r7
            r1.f11901 = r8
            return
    }

    public /* synthetic */ wy0(p000.dz0 r2, java.lang.String r3, boolean r4, java.lang.String r5, android.widget.ImageView r6, android.widget.ProgressBar r7, p000.az0 r8) {
            r1 = this;
            r0 = 0
            r1.f11895 = r0
            r1.<init>()
            r1.f11896 = r2
            r1.f11898 = r3
            r1.f11900 = r4
            r1.f11902 = r5
            r1.f11897 = r6
            r1.f11899 = r7
            r1.f11901 = r8
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r14 = this;
            int r0 = r14.f11895
            switch(r0) {
                case 0: goto L45;
                default: goto L5;
            }
        L5:
            dz0 r0 = r14.f11896
            android.widget.ImageView r1 = r14.f11897
            java.lang.String r2 = r14.f11898
            android.widget.ProgressBar r3 = r14.f11899
            java.lang.Object r4 = r14.f11902
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            boolean r5 = r14.f11900
            az0 r14 = r14.f11901
            android.app.Activity r6 = r0.f3340
            boolean r7 = r6.isFinishing()
            if (r7 != 0) goto L44
            boolean r6 = r6.isDestroyed()
            if (r6 != 0) goto L44
            java.lang.Object r6 = r1.getTag()
            boolean r2 = p000.ln0.m3626(r6, r2)
            if (r2 != 0) goto L2e
            goto L44
        L2e:
            if (r3 == 0) goto L35
            r2 = 8
            r3.setVisibility(r2)
        L35:
            if (r4 == 0) goto L41
            boolean r2 = r4.isRecycled()
            if (r2 != 0) goto L41
            r0.m1827(r1, r4, r5)
            goto L44
        L41:
            r0.m1829(r1, r14, r5)
        L44:
            return
        L45:
            dz0 r7 = r14.f11896
            java.lang.String r0 = r14.f11898
            boolean r12 = r14.f11900
            java.lang.Object r1 = r14.f11902
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            android.widget.ImageView r8 = r14.f11897
            android.widget.ProgressBar r10 = r14.f11899
            az0 r13 = r14.f11901
            t41 r14 = p000.C0963wx.f11880     // Catch: java.lang.Throwable -> L7e
            java.lang.String r14 = "User-Agent"
            java.lang.String r1 = "Mozilla/5.0 (Linux; Android 13) AppleWebKit/537.36 Chrome/120 Mobile Safari/537.36"
            l91 r2 = new l91     // Catch: java.lang.Throwable -> L7e
            r2.<init>(r14, r1)     // Catch: java.lang.Throwable -> L7e
            java.util.Map r14 = p000.ex0.m1971(r2)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "image/avif,image/webp,image/apng,image/*,*/*;q=0.8"
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            byte[] r14 = p000.C0963wx.m6406(r0, r14, r1, r2)     // Catch: java.lang.Throwable -> L7e
            r0 = 220(0xdc, float:3.08E-43)
            r1 = 960(0x3c0, float:1.345E-42)
            if (r12 == 0) goto L75
            r2 = r1
            goto L76
        L75:
            r2 = r0
        L76:
            if (r12 == 0) goto L79
            r0 = r1
        L79:
            android.graphics.Bitmap r14 = p000.dz0.m1819(r14, r2, r0)     // Catch: java.lang.Throwable -> L7e
            goto L86
        L7e:
            r0 = move-exception
            r14 = r0
            eo1 r0 = new eo1
            r0.<init>(r14)
            r14 = r0
        L86:
            boolean r0 = r14 instanceof p000.eo1
            if (r0 == 0) goto L8b
            r14 = 0
        L8b:
            r11 = r14
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            if (r11 == 0) goto La1
            boolean r14 = r11.isRecycled()
            if (r14 != 0) goto La1
            nq r14 = p000.dz0.f3339
            monitor-enter(r14)
            r14.put(r9, r11)     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r14)
            goto La1
        L9e:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        La1:
            android.app.Activity r14 = r7.f3340
            wy0 r6 = new wy0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r14.runOnUiThread(r6)
            return
    }
}
