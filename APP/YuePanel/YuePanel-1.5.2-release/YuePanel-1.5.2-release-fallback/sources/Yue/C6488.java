package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
@Yue.InterfaceC5336(29)
public class C6488 extends Yue.C6489 {
    public C6488() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static int m23955(@Yue.InterfaceC4410 android.graphics.fonts.FontStyle r2, @Yue.InterfaceC4410 android.graphics.fonts.FontStyle r3) {
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

    @Override // Yue.C6489
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟ */
    public android.graphics.Typeface mo23932(android.content.Context r7, Yue.C2729.C2733 r8, android.content.res.Resources r9, int r10) {
            r6 = this;
            r7 = 0
            Yue.ۥ۠ۢۦۡ$ۥ۟۟۟۟[] r8 = r8.m11988()     // Catch: java.lang.Exception -> L64
            int r0 = r8.length     // Catch: java.lang.Exception -> L64
            r1 = 0
            r2 = r7
        L8:
            if (r1 >= r0) goto L48
            r3 = r8[r1]     // Catch: java.lang.Exception -> L64
            android.graphics.fonts.Font$Builder r4 = new android.graphics.fonts.Font$Builder     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
            int r5 = r3.m11990()     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
            r4.<init>(r9, r5)     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
            int r5 = r3.m11993()     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
            android.graphics.fonts.Font$Builder r4 = r4.setWeight(r5)     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
            boolean r5 = r3.m11994()     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
            android.graphics.fonts.Font$Builder r4 = r4.setSlant(r5)     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
            int r5 = r3.m11991()     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
            android.graphics.fonts.Font$Builder r4 = r4.setTtcIndex(r5)     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
            java.lang.String r3 = r3.m11992()     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
            android.graphics.fonts.Font$Builder r3 = r4.setFontVariationSettings(r3)     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
            android.graphics.fonts.Font r3 = r3.build()     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
            if (r2 != 0) goto L42
            android.graphics.fonts.FontFamily$Builder r4 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
            r4.<init>(r3)     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
            r2 = r4
            goto L45
        L42:
            r2.addFont(r3)     // Catch: java.io.IOException -> L45 java.lang.Exception -> L64
        L45:
            int r1 = r1 + 1
            goto L8
        L48:
            if (r2 != 0) goto L4b
            return r7
        L4b:
            android.graphics.fonts.FontFamily r8 = r2.build()     // Catch: java.lang.Exception -> L64
            android.graphics.Typeface$CustomFallbackBuilder r9 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L64
            r9.<init>(r8)     // Catch: java.lang.Exception -> L64
            android.graphics.fonts.Font r8 = r6.m23958(r8, r10)     // Catch: java.lang.Exception -> L64
            android.graphics.fonts.FontStyle r8 = r8.getStyle()     // Catch: java.lang.Exception -> L64
            android.graphics.Typeface$CustomFallbackBuilder r8 = r9.setStyle(r8)     // Catch: java.lang.Exception -> L64
            android.graphics.Typeface r7 = r8.build()     // Catch: java.lang.Exception -> L64
        L64:
            return r7
    }

    @Override // Yue.C6489
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public android.graphics.Typeface mo23933(android.content.Context r9, @Yue.InterfaceC4544 android.os.CancellationSignal r10, @Yue.InterfaceC4410 Yue.C2736.C2739[] r11, int r12) {
            r8 = this;
            android.content.ContentResolver r9 = r9.getContentResolver()
            r0 = 0
            int r1 = r11.length     // Catch: java.lang.Exception -> L77
            r2 = 0
            r3 = r0
        L8:
            if (r2 >= r1) goto L5a
            r4 = r11[r2]     // Catch: java.lang.Exception -> L77
            android.net.Uri r5 = r4.m12014()     // Catch: java.io.IOException -> L57 java.lang.Exception -> L77
            java.lang.String r6 = "r"
            android.os.ParcelFileDescriptor r5 = r9.openFileDescriptor(r5, r6, r10)     // Catch: java.io.IOException -> L57 java.lang.Exception -> L77
            if (r5 != 0) goto L1e
            if (r5 == 0) goto L57
        L1a:
            r5.close()     // Catch: java.io.IOException -> L57 java.lang.Exception -> L77
            goto L57
        L1e:
            android.graphics.fonts.Font$Builder r6 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L48
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L48
            int r7 = r4.m12015()     // Catch: java.lang.Throwable -> L48
            android.graphics.fonts.Font$Builder r6 = r6.setWeight(r7)     // Catch: java.lang.Throwable -> L48
            boolean r7 = r4.m12016()     // Catch: java.lang.Throwable -> L48
            android.graphics.fonts.Font$Builder r6 = r6.setSlant(r7)     // Catch: java.lang.Throwable -> L48
            int r4 = r4.m12013()     // Catch: java.lang.Throwable -> L48
            android.graphics.fonts.Font$Builder r4 = r6.setTtcIndex(r4)     // Catch: java.lang.Throwable -> L48
            android.graphics.fonts.Font r4 = r4.build()     // Catch: java.lang.Throwable -> L48
            if (r3 != 0) goto L4a
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Throwable -> L48
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L48
            r3 = r6
            goto L1a
        L48:
            r4 = move-exception
            goto L4e
        L4a:
            r3.addFont(r4)     // Catch: java.lang.Throwable -> L48
            goto L1a
        L4e:
            r5.close()     // Catch: java.lang.Throwable -> L52
            goto L56
        L52:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L57 java.lang.Exception -> L77
        L56:
            throw r4     // Catch: java.io.IOException -> L57 java.lang.Exception -> L77
        L57:
            int r2 = r2 + 1
            goto L8
        L5a:
            if (r3 != 0) goto L5d
            return r0
        L5d:
            android.graphics.fonts.FontFamily r9 = r3.build()     // Catch: java.lang.Exception -> L77
            android.graphics.Typeface$CustomFallbackBuilder r10 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L77
            r10.<init>(r9)     // Catch: java.lang.Exception -> L77
            android.graphics.fonts.Font r9 = r8.m23958(r9, r12)     // Catch: java.lang.Exception -> L77
            android.graphics.fonts.FontStyle r9 = r9.getStyle()     // Catch: java.lang.Exception -> L77
            android.graphics.Typeface$CustomFallbackBuilder r9 = r10.setStyle(r9)     // Catch: java.lang.Exception -> L77
            android.graphics.Typeface r9 = r9.build()     // Catch: java.lang.Exception -> L77
            return r9
        L77:
            return r0
    }

    @Override // Yue.C6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.graphics.Typeface mo23956(android.content.Context r1, java.io.InputStream r2) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Do not use this function in API 29 or later."
            r1.<init>(r2)
            throw r1
    }

    @Override // Yue.C6489
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public android.graphics.Typeface mo23940(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
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

    @Override // Yue.C6489
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public android.graphics.Typeface mo23934(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.graphics.Typeface r2, int r3, boolean r4) {
            r0 = this;
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r2, r3, r4)
            return r1
    }

    @Override // Yue.C6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Yue.C2736.C2739 mo23957(Yue.C2736.C2739[] r1, int r2) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Do not use this function in API 29 or later."
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final android.graphics.fonts.Font m23958(@Yue.InterfaceC4410 android.graphics.fonts.FontFamily r6, int r7) {
            r5 = this;
            android.graphics.fonts.FontStyle r0 = new android.graphics.fonts.FontStyle
            r1 = r7 & 1
            if (r1 == 0) goto L9
            r1 = 700(0x2bc, float:9.81E-43)
            goto Lb
        L9:
            r1 = 400(0x190, float:5.6E-43)
        Lb:
            r7 = r7 & 2
            r2 = 0
            r3 = 1
            if (r7 == 0) goto L13
            r7 = r3
            goto L14
        L13:
            r7 = r2
        L14:
            r0.<init>(r1, r7)
            android.graphics.fonts.Font r7 = r6.getFont(r2)
            android.graphics.fonts.FontStyle r1 = r7.getStyle()
            int r1 = m23955(r0, r1)
        L23:
            int r2 = r6.getSize()
            if (r3 >= r2) goto L3c
            android.graphics.fonts.Font r2 = r6.getFont(r3)
            android.graphics.fonts.FontStyle r4 = r2.getStyle()
            int r4 = m23955(r0, r4)
            if (r4 >= r1) goto L39
            r7 = r2
            r1 = r4
        L39:
            int r3 = r3 + 1
            goto L23
        L3c:
            return r7
    }
}
