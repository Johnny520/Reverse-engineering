package a;

/* JADX INFO: loaded from: classes.dex */
public final class Qf extends a.Rf {
    public static android.graphics.fonts.Font e(android.graphics.fonts.FontFamily r5, int r6) {
            android.graphics.fonts.FontStyle r0 = new android.graphics.fonts.FontStyle
            r1 = r6 & 1
            if (r1 == 0) goto L9
            r1 = 700(0x2bc, float:9.81E-43)
            goto Lb
        L9:
            r1 = 400(0x190, float:5.6E-43)
        Lb:
            r6 = r6 & 2
            r2 = 1
            r3 = 0
            if (r6 == 0) goto L13
            r6 = r2
            goto L14
        L13:
            r6 = r3
        L14:
            r0.<init>(r1, r6)
            android.graphics.fonts.Font r6 = r5.getFont(r3)
            android.graphics.fonts.FontStyle r1 = r6.getStyle()
            int r1 = f(r0, r1)
        L23:
            int r3 = r5.getSize()
            if (r2 >= r3) goto L3c
            android.graphics.fonts.Font r3 = r5.getFont(r2)
            android.graphics.fonts.FontStyle r4 = r3.getStyle()
            int r4 = f(r0, r4)
            if (r4 >= r1) goto L39
            r6 = r3
            r1 = r4
        L39:
            int r2 = r2 + 1
            goto L23
        L3c:
            return r6
    }

    public static int f(android.graphics.fonts.FontStyle r2, android.graphics.fonts.FontStyle r3) {
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

    @Override // a.Rf
    public final android.graphics.Typeface a(android.content.Context r7, a.S6.c r8, android.content.res.Resources r9, int r10) {
            r6 = this;
            r7 = 0
            a.S6$d[] r8 = r8.f259a     // Catch: java.lang.Exception -> L58
            int r0 = r8.length     // Catch: java.lang.Exception -> L58
            r1 = 0
            r2 = r7
        L6:
            if (r1 >= r0) goto L3c
            r3 = r8[r1]     // Catch: java.lang.Exception -> L58
            android.graphics.fonts.Font$Builder r4 = new android.graphics.fonts.Font$Builder     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
            int r5 = r3.f     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
            r4.<init>(r9, r5)     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
            int r5 = r3.b     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
            android.graphics.fonts.Font$Builder r4 = r4.setWeight(r5)     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
            boolean r5 = r3.c     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
            android.graphics.fonts.Font$Builder r4 = r4.setSlant(r5)     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
            int r5 = r3.e     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
            android.graphics.fonts.Font$Builder r4 = r4.setTtcIndex(r5)     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
            java.lang.String r3 = r3.d     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
            android.graphics.fonts.Font$Builder r3 = r4.setFontVariationSettings(r3)     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
            android.graphics.fonts.Font r3 = r3.build()     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
            if (r2 != 0) goto L36
            android.graphics.fonts.FontFamily$Builder r4 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
            r4.<init>(r3)     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
            r2 = r4
            goto L39
        L36:
            r2.addFont(r3)     // Catch: java.io.IOException -> L39 java.lang.Exception -> L58
        L39:
            int r1 = r1 + 1
            goto L6
        L3c:
            if (r2 != 0) goto L3f
            goto L58
        L3f:
            android.graphics.fonts.FontFamily r8 = r2.build()     // Catch: java.lang.Exception -> L58
            android.graphics.Typeface$CustomFallbackBuilder r9 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L58
            r9.<init>(r8)     // Catch: java.lang.Exception -> L58
            android.graphics.fonts.Font r8 = e(r8, r10)     // Catch: java.lang.Exception -> L58
            android.graphics.fonts.FontStyle r8 = r8.getStyle()     // Catch: java.lang.Exception -> L58
            android.graphics.Typeface$CustomFallbackBuilder r8 = r9.setStyle(r8)     // Catch: java.lang.Exception -> L58
            android.graphics.Typeface r7 = r8.build()     // Catch: java.lang.Exception -> L58
        L58:
            return r7
    }

    @Override // a.Rf
    public final android.graphics.Typeface b(android.content.Context r9, a.T6[] r10, int r11) {
            r8 = this;
            android.content.ContentResolver r9 = r9.getContentResolver()
            r0 = 0
            int r1 = r10.length     // Catch: java.lang.Exception -> L6f
            r2 = 0
            r3 = r0
        L8:
            if (r2 >= r1) goto L52
            r4 = r10[r2]     // Catch: java.lang.Exception -> L6f
            android.net.Uri r5 = r4.f272a     // Catch: java.io.IOException -> L4f java.lang.Exception -> L6f
            java.lang.String r6 = "r"
            android.os.ParcelFileDescriptor r5 = r9.openFileDescriptor(r5, r6, r0)     // Catch: java.io.IOException -> L4f java.lang.Exception -> L6f
            if (r5 != 0) goto L1c
            if (r5 == 0) goto L4f
        L18:
            r5.close()     // Catch: java.io.IOException -> L4f java.lang.Exception -> L6f
            goto L4f
        L1c:
            android.graphics.fonts.Font$Builder r6 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L40
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L40
            int r7 = r4.c     // Catch: java.lang.Throwable -> L40
            android.graphics.fonts.Font$Builder r6 = r6.setWeight(r7)     // Catch: java.lang.Throwable -> L40
            boolean r7 = r4.d     // Catch: java.lang.Throwable -> L40
            android.graphics.fonts.Font$Builder r6 = r6.setSlant(r7)     // Catch: java.lang.Throwable -> L40
            int r4 = r4.b     // Catch: java.lang.Throwable -> L40
            android.graphics.fonts.Font$Builder r4 = r6.setTtcIndex(r4)     // Catch: java.lang.Throwable -> L40
            android.graphics.fonts.Font r4 = r4.build()     // Catch: java.lang.Throwable -> L40
            if (r3 != 0) goto L42
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Throwable -> L40
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L40
            r3 = r6
            goto L18
        L40:
            r4 = move-exception
            goto L46
        L42:
            r3.addFont(r4)     // Catch: java.lang.Throwable -> L40
            goto L18
        L46:
            r5.close()     // Catch: java.lang.Throwable -> L4a
            goto L4e
        L4a:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L4f java.lang.Exception -> L6f
        L4e:
            throw r4     // Catch: java.io.IOException -> L4f java.lang.Exception -> L6f
        L4f:
            int r2 = r2 + 1
            goto L8
        L52:
            if (r3 != 0) goto L55
            goto L6f
        L55:
            android.graphics.fonts.FontFamily r9 = r3.build()     // Catch: java.lang.Exception -> L6f
            android.graphics.Typeface$CustomFallbackBuilder r10 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L6f
            r10.<init>(r9)     // Catch: java.lang.Exception -> L6f
            android.graphics.fonts.Font r9 = e(r9, r11)     // Catch: java.lang.Exception -> L6f
            android.graphics.fonts.FontStyle r9 = r9.getStyle()     // Catch: java.lang.Exception -> L6f
            android.graphics.Typeface$CustomFallbackBuilder r9 = r10.setStyle(r9)     // Catch: java.lang.Exception -> L6f
            android.graphics.Typeface r9 = r9.build()     // Catch: java.lang.Exception -> L6f
            return r9
        L6f:
            return r0
    }

    @Override // a.Rf
    public final android.graphics.Typeface c(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
            r0 = this;
            android.graphics.fonts.Font$Builder r1 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Exception -> L24
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.Font r1 = r1.build()     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontFamily$Builder r2 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Exception -> L24
            r2.<init>(r1)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontFamily r2 = r2.build()     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface$CustomFallbackBuilder r3 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L24
            r3.<init>(r2)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontStyle r1 = r1.getStyle()     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface$CustomFallbackBuilder r1 = r3.setStyle(r1)     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface r1 = r1.build()     // Catch: java.lang.Exception -> L24
            return r1
        L24:
            r1 = 0
            return r1
    }

    @Override // a.Rf
    public final a.T6 d(int r1, a.T6[] r2) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Do not use this function in API 29 or later."
            r1.<init>(r2)
            throw r1
    }
}
