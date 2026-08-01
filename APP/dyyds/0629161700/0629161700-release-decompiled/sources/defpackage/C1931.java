package defpackage;

/* JADX INFO: renamed from: ᲁᲁᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1931 extends defpackage.AbstractC1552 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final byte[] f8400 = null;

    static {
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1"
            java.nio.charset.Charset r1 = defpackage.InterfaceC1711.f7614
            byte[] r0 = r0.getBytes(r1)
            defpackage.C1931.f8400 = r0
            return
    }

    @Override // defpackage.InterfaceC1711
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.C1931
            return r0
    }

    @Override // defpackage.InterfaceC1711
    public final int hashCode() {
            r0 = this;
            r0 = 1101716364(0x41aadb8c, float:21.3572)
            return r0
    }

    @Override // defpackage.AbstractC1552
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final android.graphics.Bitmap mo1821(defpackage.InterfaceC1612 r7, android.graphics.Bitmap r8, int r9, int r10) {
            r6 = this;
            java.util.concurrent.locks.Lock r6 = defpackage.AbstractC1538.f6792
            int r9 = java.lang.Math.min(r9, r10)
            float r10 = (float) r9
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r10 / r0
            int r2 = r8.getWidth()
            int r3 = r8.getHeight()
            float r2 = (float) r2
            float r4 = r10 / r2
            float r3 = (float) r3
            float r5 = r10 / r3
            float r4 = java.lang.Math.max(r4, r5)
            float r2 = r2 * r4
            float r4 = r4 * r3
            float r3 = r10 - r2
            float r3 = r3 / r0
            float r10 = r10 - r4
            float r10 = r10 / r0
            android.graphics.RectF r0 = new android.graphics.RectF
            float r2 = r2 + r3
            float r4 = r4 + r10
            r0.<init>(r3, r10, r2, r4)
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.RGBA_F16
            android.graphics.Bitmap$Config r2 = r8.getConfig()
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L39
            r2 = r10
            goto L3b
        L39:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L3b:
            android.graphics.Bitmap$Config r3 = r8.getConfig()
            boolean r3 = r2.equals(r3)
            r4 = 0
            if (r3 == 0) goto L48
            r2 = r8
            goto L5d
        L48:
            int r3 = r8.getWidth()
            int r5 = r8.getHeight()
            android.graphics.Bitmap r2 = r7.mo1254(r3, r5, r2)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            r5 = 0
            r3.drawBitmap(r8, r5, r5, r4)
        L5d:
            android.graphics.Bitmap$Config r3 = r8.getConfig()
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L68
            goto L6a
        L68:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
        L6a:
            android.graphics.Bitmap r9 = r7.mo1254(r9, r9, r10)
            r10 = 1
            r9.setHasAlpha(r10)
            r6.lock()
            android.graphics.Canvas r10 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L94
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L94
            android.graphics.Paint r3 = defpackage.AbstractC1538.f6795     // Catch: java.lang.Throwable -> L94
            r10.drawCircle(r1, r1, r1, r3)     // Catch: java.lang.Throwable -> L94
            android.graphics.Paint r1 = defpackage.AbstractC1538.f6793     // Catch: java.lang.Throwable -> L94
            r10.drawBitmap(r2, r4, r0, r1)     // Catch: java.lang.Throwable -> L94
            r10.setBitmap(r4)     // Catch: java.lang.Throwable -> L94
            r6.unlock()
            boolean r6 = r2.equals(r8)
            if (r6 != 0) goto L93
            r7.mo1257(r2)
        L93:
            return r9
        L94:
            r7 = move-exception
            r6.unlock()
            throw r7
    }

    @Override // defpackage.InterfaceC1711
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1225(java.security.MessageDigest r1) {
            r0 = this;
            byte[] r0 = defpackage.C1931.f8400
            r1.update(r0)
            return
    }
}
