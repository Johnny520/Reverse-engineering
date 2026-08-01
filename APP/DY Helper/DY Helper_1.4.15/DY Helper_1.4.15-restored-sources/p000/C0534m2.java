package p000;

/* JADX INFO: renamed from: m2 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0534m2 {

    /* JADX INFO: renamed from: α */
    public final android.graphics.Bitmap f6906;

    public C0534m2(android.graphics.Bitmap r1) {
            r0 = this;
            r0.<init>()
            r0.f6906 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final int m3712() {
            r1 = this;
            android.graphics.Bitmap r1 = r1.f6906
            android.graphics.Bitmap$Config r1 = r1.getConfig()
            r1.getClass()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            if (r1 != r0) goto Lf
            r1 = 1
            return r1
        Lf:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            if (r1 != r0) goto L15
            r1 = 2
            return r1
        L15:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_4444
            if (r1 != r0) goto L1a
            goto L26
        L1a:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGBA_F16
            if (r1 != r0) goto L20
            r1 = 3
            return r1
        L20:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.HARDWARE
            if (r1 != r0) goto L26
            r1 = 4
            return r1
        L26:
            r1 = 0
            return r1
    }
}
