package b3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a.a {
    public static android.graphics.fonts.FontFamily e1(e3.d[] r8, android.content.ContentResolver r9) {
            int r0 = r8.length
            r1 = 0
            r2 = 0
            r3 = r1
        L4:
            if (r2 >= r0) goto L57
            r4 = r8[r2]
            android.net.Uri r5 = r4.f2348a     // Catch: java.io.IOException -> L18
            java.lang.String r6 = "r"
            android.os.ParcelFileDescriptor r5 = r9.openFileDescriptor(r5, r6, r1)     // Catch: java.io.IOException -> L18
            if (r5 != 0) goto L1a
            if (r5 == 0) goto L54
        L14:
            r5.close()     // Catch: java.io.IOException -> L18
            goto L54
        L18:
            r4 = move-exception
            goto L4d
        L1a:
            android.graphics.fonts.Font$Builder r6 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L3e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L3e
            int r7 = r4.f2350c     // Catch: java.lang.Throwable -> L3e
            android.graphics.fonts.Font$Builder r6 = r6.setWeight(r7)     // Catch: java.lang.Throwable -> L3e
            boolean r7 = r4.f2351d     // Catch: java.lang.Throwable -> L3e
            android.graphics.fonts.Font$Builder r6 = r6.setSlant(r7)     // Catch: java.lang.Throwable -> L3e
            int r4 = r4.f2349b     // Catch: java.lang.Throwable -> L3e
            android.graphics.fonts.Font$Builder r4 = r6.setTtcIndex(r4)     // Catch: java.lang.Throwable -> L3e
            android.graphics.fonts.Font r4 = r4.build()     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto L40
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Throwable -> L3e
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L3e
            r3 = r6
            goto L14
        L3e:
            r4 = move-exception
            goto L44
        L40:
            r3.addFont(r4)     // Catch: java.lang.Throwable -> L3e
            goto L14
        L44:
            r5.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L18
        L4c:
            throw r4     // Catch: java.io.IOException -> L18
        L4d:
            java.lang.String r5 = "TypefaceCompatApi29Impl"
            java.lang.String r6 = "Font load failed"
            android.util.Log.w(r5, r6, r4)
        L54:
            int r2 = r2 + 1
            goto L4
        L57:
            if (r3 != 0) goto L5a
            return r1
        L5a:
            android.graphics.fonts.FontFamily r8 = r3.build()
            return r8
    }

    public static int f1(android.graphics.fonts.FontStyle r2, android.graphics.fonts.FontStyle r3) {
            int r0 = r2.getWeight()
            int r1 = r3.getWeight()
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 / 100
            int r2 = r2.getSlant()
            int r3 = r3.getSlant()
            if (r2 != r3) goto L1b
            r2 = 0
            goto L1c
        L1b:
            r2 = 2
        L1c:
            int r0 = r0 + r2
            return r0
    }

    @Override // a.a
    public final android.graphics.Typeface D(android.content.Context r8, e3.d[] r9) {
            r7 = this;
            android.content.ContentResolver r8 = r8.getContentResolver()
            r0 = 0
            android.graphics.fonts.FontFamily r8 = e1(r9, r8)     // Catch: java.lang.Exception -> L4c
            if (r8 != 0) goto Lc
            return r0
        Lc:
            android.graphics.Typeface$CustomFallbackBuilder r9 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L4c
            r9.<init>(r8)     // Catch: java.lang.Exception -> L4c
            android.graphics.fonts.FontStyle r1 = new android.graphics.fonts.FontStyle     // Catch: java.lang.Exception -> L4c
            r2 = 400(0x190, float:5.6E-43)
            r3 = 0
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L4c
            android.graphics.fonts.Font r2 = r8.getFont(r3)     // Catch: java.lang.Exception -> L4c
            android.graphics.fonts.FontStyle r3 = r2.getStyle()     // Catch: java.lang.Exception -> L4c
            int r3 = f1(r1, r3)     // Catch: java.lang.Exception -> L4c
            r4 = 1
        L26:
            int r5 = r8.getSize()     // Catch: java.lang.Exception -> L4c
            if (r4 >= r5) goto L3f
            android.graphics.fonts.Font r5 = r8.getFont(r4)     // Catch: java.lang.Exception -> L4c
            android.graphics.fonts.FontStyle r6 = r5.getStyle()     // Catch: java.lang.Exception -> L4c
            int r6 = f1(r1, r6)     // Catch: java.lang.Exception -> L4c
            if (r6 >= r3) goto L3c
            r2 = r5
            r3 = r6
        L3c:
            int r4 = r4 + 1
            goto L26
        L3f:
            android.graphics.fonts.FontStyle r8 = r2.getStyle()     // Catch: java.lang.Exception -> L4c
            android.graphics.Typeface$CustomFallbackBuilder r8 = r9.setStyle(r8)     // Catch: java.lang.Exception -> L4c
            android.graphics.Typeface r8 = r8.build()     // Catch: java.lang.Exception -> L4c
            return r8
        L4c:
            r8 = move-exception
            java.lang.String r9 = "TypefaceCompatApi29Impl"
            java.lang.String r1 = "Font load failed"
            android.util.Log.w(r9, r1, r8)
            return r0
    }
}
