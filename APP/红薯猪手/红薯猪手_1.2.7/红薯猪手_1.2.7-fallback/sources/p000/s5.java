package p000;

/* JADX INFO: loaded from: classes.dex */
public final class s5 extends p000.r0 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String[] f973 = null;

    static {
            java.lang.String r0 = "orientation"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            p000.s5.f973 = r0
            return
    }

    public s5(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p000.r0, p000.y8
    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean mo94(p000.w8 r3) {
            r2 = this;
            android.net.Uri r3 = r3.f1130
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1c
            java.lang.String r3 = r3.getAuthority()
            java.lang.String r0 = "media"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            return r3
    }

    @Override // p000.r0, p000.y8
    /* JADX INFO: renamed from: ۥ۟ۡ */
    public final ۟.y8.a mo95(p000.w8 r20) {
            r19 = this;
            r0 = r20
            ۟.z7$e r7 = ۟.z7.e.f1271
            r8 = r19
            android.content.Context r1 = r8.f926
            android.content.ContentResolver r15 = r1.getContentResolver()
            android.net.Uri r10 = r0.f1130
            r6 = 0
            r1 = 0
            java.lang.String[] r11 = p000.s5.f973     // Catch: java.lang.Throwable -> L32 java.lang.RuntimeException -> L39
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r15
            android.database.Cursor r2 = r9.query(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L32 java.lang.RuntimeException -> L39
            if (r2 == 0) goto L2f
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L2c java.lang.RuntimeException -> L3a
            if (r3 != 0) goto L23
            goto L2f
        L23:
            int r3 = r2.getInt(r1)     // Catch: java.lang.Throwable -> L2c java.lang.RuntimeException -> L3a
            r2.close()
            r9 = r3
            goto L40
        L2c:
            r0 = move-exception
            r6 = r2
            goto L33
        L2f:
            if (r2 == 0) goto L3f
            goto L3c
        L32:
            r0 = move-exception
        L33:
            if (r6 == 0) goto L38
            r6.close()
        L38:
            throw r0
        L39:
            r2 = r6
        L3a:
            if (r2 == 0) goto L3f
        L3c:
            r2.close()
        L3f:
            r9 = r1
        L40:
            android.net.Uri r2 = r0.f1130
            java.lang.String r2 = r15.getType(r2)
            r10 = 1
            if (r2 == 0) goto L53
            java.lang.String r3 = "video/"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L53
            r11 = r10
            goto L54
        L53:
            r11 = r1
        L54:
            boolean r1 = r20.m453()
            if (r1 == 0) goto Lc9
            int r1 = r0.f1133
            int r2 = r0.f1134
            r3 = 96
            r12 = 3
            if (r1 > r3) goto L67
            if (r2 > r3) goto L67
            r3 = r10
            goto L70
        L67:
            r3 = 2
            r4 = 512(0x200, float:7.17E-43)
            if (r1 > r4) goto L72
            r1 = 384(0x180, float:5.38E-43)
            if (r2 > r1) goto L72
        L70:
            r13 = r3
            goto L73
        L72:
            r13 = r12
        L73:
            if (r11 != 0) goto L81
            if (r13 != r12) goto L81
            ۟.y8$a r1 = new ۟.y8$a
            java.io.InputStream r0 = r19.m349(r20)
            r1.<init>(r6, r0, r7, r9)
            return r1
        L81:
            android.net.Uri r1 = r0.f1130
            long r4 = android.content.ContentUris.parseId(r1)
            android.graphics.BitmapFactory$Options r14 = p000.y8.m478(r20)
            r14.inJustDecodeBounds = r10
            int r1 = r0.f1133
            int r2 = r0.f1134
            int r3 = p000.c4.m106(r13)
            int r16 = p000.c4.m105(r13)
            r17 = r4
            r4 = r16
            r5 = r14
            r10 = r6
            r6 = r20
            p000.y8.m477(r1, r2, r3, r4, r5, r6)
            if (r11 == 0) goto Lb7
            if (r13 != r12) goto Lac
            r2 = r17
            r1 = 1
            goto Lb2
        Lac:
            int r1 = p000.c4.m104(r13)
            r2 = r17
        Lb2:
            android.graphics.Bitmap r1 = android.provider.MediaStore.Video.Thumbnails.getThumbnail(r15, r2, r1, r14)
            goto Lc1
        Lb7:
            r2 = r17
            int r1 = p000.c4.m104(r13)
            android.graphics.Bitmap r1 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r15, r2, r1, r14)
        Lc1:
            if (r1 == 0) goto Lca
            ۟.y8$a r0 = new ۟.y8$a
            r0.<init>(r1, r10, r7, r9)
            return r0
        Lc9:
            r10 = r6
        Lca:
            ۟.y8$a r1 = new ۟.y8$a
            java.io.InputStream r0 = r19.m349(r20)
            r1.<init>(r10, r0, r7, r9)
            return r1
    }
}
