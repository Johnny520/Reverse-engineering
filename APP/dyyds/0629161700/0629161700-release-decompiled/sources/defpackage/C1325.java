package defpackage;

/* JADX INFO: renamed from: ᛷᛸᛱᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1325 extends defpackage.AbstractC1552 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final byte[] f5851 = null;

    static {
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.CenterCrop"
            java.nio.charset.Charset r1 = defpackage.InterfaceC1711.f7614
            byte[] r0 = r0.getBytes(r1)
            defpackage.C1325.f5851 = r0
            return
    }

    @Override // defpackage.InterfaceC1711
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.C1325
            return r0
    }

    @Override // defpackage.InterfaceC1711
    public final int hashCode() {
            r0 = this;
            r0 = -599754482(0xffffffffdc40790e, float:-2.1670519E17)
            return r0
    }

    @Override // defpackage.AbstractC1552
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final android.graphics.Bitmap mo1821(defpackage.InterfaceC1612 r7, android.graphics.Bitmap r8, int r9, int r10) {
            r6 = this;
            android.graphics.Paint r6 = defpackage.AbstractC1538.f6794
            int r6 = r8.getWidth()
            if (r6 != r9) goto Lf
            int r6 = r8.getHeight()
            if (r6 != r10) goto Lf
            return r8
        Lf:
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r0 = r8.getWidth()
            int r0 = r0 * r10
            int r1 = r8.getHeight()
            int r1 = r1 * r9
            r2 = 0
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r0 <= r1) goto L37
            float r0 = (float) r10
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            float r1 = (float) r9
            int r4 = r8.getWidth()
            float r4 = (float) r4
            float r4 = r4 * r0
            float r1 = r1 - r4
            float r1 = r1 * r3
            r5 = r2
            r2 = r1
            r1 = r5
            goto L47
        L37:
            float r0 = (float) r9
            int r1 = r8.getWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            float r1 = (float) r10
            int r4 = r8.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r0
            float r1 = r1 - r4
            float r1 = r1 * r3
        L47:
            r6.setScale(r0, r0)
            float r2 = r2 + r3
            int r0 = (int) r2
            float r0 = (float) r0
            float r1 = r1 + r3
            int r1 = (int) r1
            float r1 = (float) r1
            r6.postTranslate(r0, r1)
            android.graphics.Bitmap$Config r0 = r8.getConfig()
            if (r0 == 0) goto L5e
            android.graphics.Bitmap$Config r0 = r8.getConfig()
            goto L60
        L5e:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
        L60:
            android.graphics.Bitmap r7 = r7.mo1254(r9, r10, r0)
            boolean r9 = r8.hasAlpha()
            r7.setHasAlpha(r9)
            defpackage.AbstractC1538.m2796(r8, r7, r6)
            return r7
    }

    @Override // defpackage.InterfaceC1711
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1225(java.security.MessageDigest r1) {
            r0 = this;
            byte[] r0 = defpackage.C1325.f5851
            r1.update(r0)
            return
    }
}
