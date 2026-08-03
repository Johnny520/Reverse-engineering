package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0763 {
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final android.graphics.Bitmap m4656(@Yue.InterfaceC4418 android.graphics.Bitmap r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.graphics.Canvas, Yue.C6593> r2) {
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            r2.invoke(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean m4657(@Yue.InterfaceC4418 android.graphics.Bitmap r2, @Yue.InterfaceC4418 android.graphics.Point r3) {
            int r0 = r2.getWidth()
            int r1 = r3.x
            if (r1 < 0) goto L16
            if (r1 >= r0) goto L16
            int r3 = r3.y
            if (r3 < 0) goto L16
            int r2 = r2.getHeight()
            if (r3 >= r2) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m4658(@Yue.InterfaceC4418 android.graphics.Bitmap r3, @Yue.InterfaceC4418 android.graphics.PointF r4) {
            float r0 = r4.x
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L21
            int r2 = r3.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L21
            float r4 = r4.y
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L21
            int r3 = r3.getHeight()
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = 0
        L22:
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final android.graphics.Bitmap m4659(int r0, int r1, @Yue.InterfaceC4418 android.graphics.Bitmap.Config r2) {
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final android.graphics.Bitmap m4660(int r0, int r1, @Yue.InterfaceC4418 android.graphics.Bitmap.Config r2, boolean r3, @Yue.InterfaceC4418 android.graphics.ColorSpace r4) {
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ android.graphics.Bitmap m4661(int r0, int r1, android.graphics.Bitmap.Config r2, int r3, java.lang.Object r4) {
            r3 = r3 & 4
            if (r3 == 0) goto L6
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ android.graphics.Bitmap m4662(int r0, int r1, android.graphics.Bitmap.Config r2, boolean r3, android.graphics.ColorSpace r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L6
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            r6 = r5 & 8
            if (r6 == 0) goto Lb
            r3 = 1
        Lb:
            r5 = r5 & 16
            if (r5 == 0) goto L15
            android.graphics.ColorSpace$Named r4 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r4 = android.graphics.ColorSpace.get(r4)
        L15:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m4663(@Yue.InterfaceC4418 android.graphics.Bitmap r0, int r1, int r2) {
            int r0 = r0.getPixel(r1, r2)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final android.graphics.Bitmap m4664(@Yue.InterfaceC4418 android.graphics.Bitmap r0, int r1, int r2, boolean r3) {
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ android.graphics.Bitmap m4665(android.graphics.Bitmap r0, int r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 1
        L5:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final void m4666(@Yue.InterfaceC4418 android.graphics.Bitmap r0, int r1, int r2, @Yue.InterfaceC1230 int r3) {
            r0.setPixel(r1, r2, r3)
            return
    }
}
