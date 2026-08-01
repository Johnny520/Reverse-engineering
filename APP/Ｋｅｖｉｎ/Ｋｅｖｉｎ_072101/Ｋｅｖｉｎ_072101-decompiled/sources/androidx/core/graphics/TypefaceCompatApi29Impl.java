package androidx.core.graphics;

/* JADX INFO: loaded from: classes2.dex */
public class TypefaceCompatApi29Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    public TypefaceCompatApi29Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    private android.graphics.fonts.Font findBaseFont(android.graphics.fonts.FontFamily r7, int r8) {
            r6 = this;
            android.graphics.fonts.FontStyle r0 = new android.graphics.fonts.FontStyle
            r1 = r8 & 1
            if (r1 == 0) goto L9
            r1 = 700(0x2bc, float:9.81E-43)
            goto Lb
        L9:
            r1 = 400(0x190, float:5.6E-43)
        Lb:
            r2 = r8 & 2
            r3 = 0
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = r3
        L13:
            r0.<init>(r1, r2)
            android.graphics.fonts.Font r1 = r7.getFont(r3)
            android.graphics.fonts.FontStyle r2 = r1.getStyle()
            int r2 = getMatchScore(r0, r2)
            r3 = 1
        L23:
            int r4 = r7.getSize()
            if (r3 >= r4) goto L3c
            android.graphics.fonts.Font r4 = r7.getFont(r3)
            android.graphics.fonts.FontStyle r5 = r4.getStyle()
            int r5 = getMatchScore(r0, r5)
            if (r5 >= r2) goto L39
            r1 = r4
            r2 = r5
        L39:
            int r3 = r3 + 1
            goto L23
        L3c:
            return r1
    }

    private static int getMatchScore(android.graphics.fonts.FontStyle r3, android.graphics.fonts.FontStyle r4) {
            int r0 = r3.getWeight()
            int r1 = r4.getWeight()
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 / 100
            int r1 = r3.getSlant()
            int r2 = r4.getSlant()
            if (r1 != r2) goto L1b
            r1 = 0
            goto L1c
        L1b:
            r1 = 2
        L1c:
            int r0 = r0 + r1
            return r0
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r10, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r11, android.content.res.Resources r12, int r13) {
            r9 = this;
            r0 = 0
            r1 = 0
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r2 = r11.getEntries()     // Catch: java.lang.Exception -> L6d
            int r3 = r2.length     // Catch: java.lang.Exception -> L6d
            r4 = 0
            r5 = r4
        L9:
            if (r5 >= r3) goto L50
            r6 = r2[r5]     // Catch: java.lang.Exception -> L6d
            android.graphics.fonts.Font$Builder r7 = new android.graphics.fonts.Font$Builder     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            int r8 = r6.getResourceId()     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            r7.<init>(r12, r8)     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            int r8 = r6.getWeight()     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            android.graphics.fonts.Font$Builder r7 = r7.setWeight(r8)     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            boolean r8 = r6.isItalic()     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            if (r8 == 0) goto L26
            r8 = 1
            goto L27
        L26:
            r8 = r4
        L27:
            android.graphics.fonts.Font$Builder r7 = r7.setSlant(r8)     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            int r8 = r6.getTtcIndex()     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            android.graphics.fonts.Font$Builder r7 = r7.setTtcIndex(r8)     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            java.lang.String r8 = r6.getVariationSettings()     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            android.graphics.fonts.Font$Builder r7 = r7.setFontVariationSettings(r8)     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            android.graphics.fonts.Font r7 = r7.build()     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            if (r0 != 0) goto L48
            android.graphics.fonts.FontFamily$Builder r8 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            r8.<init>(r7)     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            r0 = r8
            goto L4b
        L48:
            r0.addFont(r7)     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
        L4b:
            goto L4d
        L4c:
            r7 = move-exception
        L4d:
            int r5 = r5 + 1
            goto L9
        L50:
            if (r0 != 0) goto L53
            return r1
        L53:
            android.graphics.fonts.FontFamily r2 = r0.build()     // Catch: java.lang.Exception -> L6d
            android.graphics.Typeface$CustomFallbackBuilder r3 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L6d
            r3.<init>(r2)     // Catch: java.lang.Exception -> L6d
            android.graphics.fonts.Font r4 = r9.findBaseFont(r2, r13)     // Catch: java.lang.Exception -> L6d
            android.graphics.fonts.FontStyle r4 = r4.getStyle()     // Catch: java.lang.Exception -> L6d
            android.graphics.Typeface$CustomFallbackBuilder r3 = r3.setStyle(r4)     // Catch: java.lang.Exception -> L6d
            android.graphics.Typeface r1 = r3.build()     // Catch: java.lang.Exception -> L6d
            return r1
        L6d:
            r0 = move-exception
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context r11, android.os.CancellationSignal r12, androidx.core.provider.FontsContractCompat.FontInfo[] r13, int r14) {
            r10 = this;
            r0 = 0
            android.content.ContentResolver r1 = r11.getContentResolver()
            r2 = 0
            int r3 = r13.length     // Catch: java.lang.Exception -> L84
            r4 = 0
            r5 = r4
        L9:
            if (r5 >= r3) goto L67
            r6 = r13[r5]     // Catch: java.lang.Exception -> L84
            android.net.Uri r7 = r6.getUri()     // Catch: java.io.IOException -> L63 java.lang.Exception -> L84
            java.lang.String r8 = "r"
            android.os.ParcelFileDescriptor r7 = r1.openFileDescriptor(r7, r8, r12)     // Catch: java.io.IOException -> L63 java.lang.Exception -> L84
            if (r7 != 0) goto L1f
            if (r7 == 0) goto L1e
            r7.close()     // Catch: java.io.IOException -> L63 java.lang.Exception -> L84
        L1e:
            goto L64
        L1f:
            android.graphics.fonts.Font$Builder r8 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L57
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L57
            int r9 = r6.getWeight()     // Catch: java.lang.Throwable -> L57
            android.graphics.fonts.Font$Builder r8 = r8.setWeight(r9)     // Catch: java.lang.Throwable -> L57
            boolean r9 = r6.isItalic()     // Catch: java.lang.Throwable -> L57
            if (r9 == 0) goto L34
            r9 = 1
            goto L35
        L34:
            r9 = r4
        L35:
            android.graphics.fonts.Font$Builder r8 = r8.setSlant(r9)     // Catch: java.lang.Throwable -> L57
            int r9 = r6.getTtcIndex()     // Catch: java.lang.Throwable -> L57
            android.graphics.fonts.Font$Builder r8 = r8.setTtcIndex(r9)     // Catch: java.lang.Throwable -> L57
            android.graphics.fonts.Font r8 = r8.build()     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L4e
            android.graphics.fonts.FontFamily$Builder r9 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Throwable -> L57
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L57
            r0 = r9
            goto L51
        L4e:
            r0.addFont(r8)     // Catch: java.lang.Throwable -> L57
        L51:
            if (r7 == 0) goto L56
            r7.close()     // Catch: java.io.IOException -> L63 java.lang.Exception -> L84
        L56:
            goto L64
        L57:
            r8 = move-exception
            if (r7 == 0) goto L62
            r7.close()     // Catch: java.lang.Throwable -> L5e
            goto L62
        L5e:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.io.IOException -> L63 java.lang.Exception -> L84
        L62:
            throw r8     // Catch: java.io.IOException -> L63 java.lang.Exception -> L84
        L63:
            r7 = move-exception
        L64:
            int r5 = r5 + 1
            goto L9
        L67:
            if (r0 != 0) goto L6a
            return r2
        L6a:
            android.graphics.fonts.FontFamily r3 = r0.build()     // Catch: java.lang.Exception -> L84
            android.graphics.Typeface$CustomFallbackBuilder r4 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L84
            r4.<init>(r3)     // Catch: java.lang.Exception -> L84
            android.graphics.fonts.Font r5 = r10.findBaseFont(r3, r14)     // Catch: java.lang.Exception -> L84
            android.graphics.fonts.FontStyle r5 = r5.getStyle()     // Catch: java.lang.Exception -> L84
            android.graphics.Typeface$CustomFallbackBuilder r4 = r4.setStyle(r5)     // Catch: java.lang.Exception -> L84
            android.graphics.Typeface r2 = r4.build()     // Catch: java.lang.Exception -> L84
            return r2
        L84:
            r3 = move-exception
            return r2
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected android.graphics.Typeface createFromInputStream(android.content.Context r3, java.io.InputStream r4) {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Do not use this function in API 29 or later."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context r5, android.content.res.Resources r6, int r7, java.lang.String r8, int r9) {
            r4 = this;
            r0 = 0
            r1 = 0
            android.graphics.fonts.Font$Builder r2 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Exception -> L28
            r2.<init>(r6, r7)     // Catch: java.lang.Exception -> L28
            android.graphics.fonts.Font r2 = r2.build()     // Catch: java.lang.Exception -> L28
            r1 = r2
            android.graphics.fonts.FontFamily$Builder r2 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Exception -> L28
            r2.<init>(r1)     // Catch: java.lang.Exception -> L28
            android.graphics.fonts.FontFamily r2 = r2.build()     // Catch: java.lang.Exception -> L28
            r0 = r2
            android.graphics.Typeface$CustomFallbackBuilder r2 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L28
            r2.<init>(r0)     // Catch: java.lang.Exception -> L28
            android.graphics.fonts.FontStyle r3 = r1.getStyle()     // Catch: java.lang.Exception -> L28
            android.graphics.Typeface$CustomFallbackBuilder r2 = r2.setStyle(r3)     // Catch: java.lang.Exception -> L28
            android.graphics.Typeface r2 = r2.build()     // Catch: java.lang.Exception -> L28
            return r2
        L28:
            r2 = move-exception
            r3 = 0
            return r3
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    android.graphics.Typeface createWeightStyle(android.content.Context r2, android.graphics.Typeface r3, int r4, boolean r5) {
            r1 = this;
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r3, r4, r5)
            return r0
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected androidx.core.provider.FontsContractCompat.FontInfo findBestInfo(androidx.core.provider.FontsContractCompat.FontInfo[] r3, int r4) {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Do not use this function in API 29 or later."
            r0.<init>(r1)
            throw r0
    }
}
