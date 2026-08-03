package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends p000.r0 {
    public u2(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p000.r0, p000.y8
    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean mo94(p000.w8 r2) {
            r1 = this;
            android.net.Uri r2 = r2.f1130
            java.lang.String r2 = r2.getScheme()
            java.lang.String r0 = "file"
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // p000.r0, p000.y8
    /* JADX INFO: renamed from: ۥ۟ۡ */
    public final ۟.y8.a mo95(p000.w8 r6) {
            r5 = this;
            ۟.y8$a r0 = new ۟.y8$a
            java.io.InputStream r1 = r5.m349(r6)
            ۟.z7$e r2 = ۟.z7.e.f1271
            android.net.Uri r6 = r6.f1130
            android.media.ExifInterface r3 = new android.media.ExifInterface
            java.lang.String r6 = r6.getPath()
            r3.<init>(r6)
            java.lang.String r6 = "Orientation"
            r4 = 1
            int r6 = r3.getAttributeInt(r6, r4)
            r3 = 3
            if (r6 == r3) goto L2c
            r3 = 6
            if (r6 == r3) goto L29
            r3 = 8
            if (r6 == r3) goto L26
            r6 = 0
            goto L2e
        L26:
            r6 = 270(0x10e, float:3.78E-43)
            goto L2e
        L29:
            r6 = 90
            goto L2e
        L2c:
            r6 = 180(0xb4, float:2.52E-43)
        L2e:
            r3 = 0
            r0.<init>(r3, r1, r2, r6)
            return r0
    }
}
