package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f3055a;

    public g(android.graphics.Bitmap r1) {
            r0 = this;
            r0.<init>()
            r0.f3055a = r1
            return
    }

    public final int a() {
            r2 = this;
            android.graphics.Bitmap r0 = r2.f3055a
            android.graphics.Bitmap$Config r0 = r0.getConfig()
            r0.getClass()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8
            if (r0 != r1) goto Lf
            r0 = 1
            return r0
        Lf:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565
            if (r0 != r1) goto L15
            r0 = 2
            return r0
        L15:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444
            if (r0 != r1) goto L1a
            goto L26
        L1a:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16
            if (r0 != r1) goto L20
            r0 = 3
            return r0
        L20:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            if (r0 != r1) goto L26
            r0 = 4
            return r0
        L26:
            r0 = 0
            return r0
    }
}
