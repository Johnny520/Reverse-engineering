package defpackage;

/* JADX INFO: renamed from: ᛳᲁᲁᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0562 implements defpackage.InterfaceC1091 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.C0980 f2774 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C0980 f2775 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2063 f2776;

    static {
            r0 = 90
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality"
            ᛵᲇᛳᲇ r0 = defpackage.C0980.m1921(r0, r1)
            defpackage.C0562.f2775 = r0
            ᛵᲇᛳᲇ r0 = new ᛵᲇᛳᲇ
            r1 = 0
            ᲈᛴᛵᲈ r2 = defpackage.C0980.f4390
            java.lang.String r3 = "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat"
            r0.<init>(r3, r1, r2)
            defpackage.C0562.f2774 = r0
            return
    }

    public C0562(defpackage.C2063 r1) {
            r0 = this;
            r0.<init>()
            r0.f2776 = r1
            return
    }

    @Override // defpackage.InterfaceC1091
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int mo1358(defpackage.C0533 r1) {
            r0 = this;
            r0 = 2
            return r0
    }

    @Override // defpackage.InterfaceC1393
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final boolean mo1359(java.lang.Object r9, java.io.File r10, defpackage.C0533 r11) {
            r8 = this;
            ᲁᛸᛸ r9 = (defpackage.InterfaceC1901) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            ᛵᲇᛳᲇ r1 = defpackage.C0562.f2774
            java.lang.Object r2 = r11.m1326(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r3 = defpackage.AbstractC1856.f8102
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            ᛵᲇᛳᲇ r5 = defpackage.C0562.f2775
            java.lang.Object r5 = r11.m1326(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            ᲇᛶᛳᛱ r8 = r8.f2776
            if (r8 == 0) goto L4f
            ᲀᛶᲁ r10 = new ᲀᛶᲁ     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            r10.<init>(r7, r8)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4c
            r6 = r10
            goto L50
        L49:
            r8 = move-exception
            r6 = r7
            goto Lb9
        L4c:
            r8 = move-exception
            r6 = r7
            goto L5e
        L4f:
            r6 = r7
        L50:
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r6.close()     // Catch: java.lang.Throwable -> L5b java.io.IOException -> L5d
            r6.close()     // Catch: java.io.IOException -> L59 java.lang.Throwable -> Lbf
        L59:
            r8 = 1
            goto L70
        L5b:
            r8 = move-exception
            goto Lb9
        L5d:
            r8 = move-exception
        L5e:
            r10 = 3
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> L5b
            if (r10 == 0) goto L6a
            java.lang.String r10 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r10, r8)     // Catch: java.lang.Throwable -> L5b
        L6a:
            if (r6 == 0) goto L6f
            r6.close()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> Lbf
        L6f:
            r8 = 0
        L70:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)
            if (r10 == 0) goto Lb8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r5 = "Compressed with type: "
            r10.<init>(r5)
            r10.append(r2)
            java.lang.String r2 = " of size "
            r10.append(r2)
            int r2 = defpackage.AbstractC1754.m3136(r9)
            r10.append(r2)
            java.lang.String r2 = " in "
            r10.append(r2)
            double r2 = defpackage.AbstractC1856.m3272(r3)
            r10.append(r2)
            java.lang.String r2 = ", options format: "
            r10.append(r2)
            java.lang.Object r11 = r11.m1326(r1)
            r10.append(r11)
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)
            boolean r9 = r9.hasAlpha()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            android.util.Log.v(r0, r9)
        Lb8:
            return r8
        Lb9:
            if (r6 == 0) goto Lc1
            r6.close()     // Catch: java.lang.Throwable -> Lbf java.io.IOException -> Lc1
            goto Lc1
        Lbf:
            r8 = move-exception
            throw r8
        Lc1:
            throw r8
    }
}
