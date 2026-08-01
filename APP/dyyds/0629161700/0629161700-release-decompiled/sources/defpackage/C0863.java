package defpackage;

/* JADX INFO: renamed from: ᛵᛴᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0863 extends defpackage.AbstractC1552 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final byte[] f3918 = null;

    static {
            java.lang.String r0 = "com.bumptech.glide.load.resource.bitmap.CenterInside"
            java.nio.charset.Charset r1 = defpackage.InterfaceC1711.f7614
            byte[] r0 = r0.getBytes(r1)
            defpackage.C0863.f3918 = r0
            return
    }

    @Override // defpackage.InterfaceC1711
    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r0 = r1 instanceof defpackage.C0863
            return r0
    }

    @Override // defpackage.InterfaceC1711
    public final int hashCode() {
            r0 = this;
            r0 = -670243078(0xffffffffd80ce6fa, float:-6.1969466E14)
            return r0
    }

    @Override // defpackage.AbstractC1552
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.graphics.Bitmap mo1821(defpackage.InterfaceC1612 r3, android.graphics.Bitmap r4, int r5, int r6) {
            r2 = this;
            android.graphics.Paint r2 = defpackage.AbstractC1538.f6794
            int r2 = r4.getWidth()
            r0 = 2
            java.lang.String r1 = "TransformationUtils"
            if (r2 > r5) goto L1d
            int r2 = r4.getHeight()
            if (r2 > r6) goto L1d
            boolean r2 = android.util.Log.isLoggable(r1, r0)
            if (r2 == 0) goto L1c
            java.lang.String r2 = "requested target size larger or equal to input, returning input"
            android.util.Log.v(r1, r2)
        L1c:
            return r4
        L1d:
            boolean r2 = android.util.Log.isLoggable(r1, r0)
            if (r2 == 0) goto L28
            java.lang.String r2 = "requested target size too big for input, fit centering instead"
            android.util.Log.v(r1, r2)
        L28:
            android.graphics.Bitmap r2 = defpackage.AbstractC1538.m2797(r3, r4, r5, r6)
            return r2
    }

    @Override // defpackage.InterfaceC1711
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final void mo1225(java.security.MessageDigest r1) {
            r0 = this;
            byte[] r0 = defpackage.C0863.f3918
            r1.update(r0)
            return
    }
}
