package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class zz1 implements p000.p52, p000.p92 {

    /* JADX INFO: renamed from: ζ */
    public static p000.zz1 f13384;

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13385;

    public zz1(int r1) {
            r0 = this;
            r0.f13385 = r1
            switch(r1) {
                case 10: goto Le;
                default: goto L5;
            }
        L5:
            r0.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            return
        Le:
            r0.<init>()
            fw1 r0 = new fw1
            r1 = 0
            r0.<init>(r1)
            zv0 r0 = new zv0
            r1 = 0
            r0.<init>(r1)
            return
    }

    public /* synthetic */ zz1(int r1, boolean r2) {
            r0 = this;
            r0.f13385 = r1
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: δ */
    public static final int m7257(int r1, long r2) {
            int r0 = p000.n52.f7398
            int r1 = r1 * 15
            long r1 = r2 >> r1
            int r1 = (int) r1
            r1 = r1 & 32767(0x7fff, float:4.5916E-41)
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static android.graphics.fonts.Font m7258(android.graphics.fonts.FontFamily r5, int r6) {
            android.graphics.fonts.FontStyle r0 = new android.graphics.fonts.FontStyle
            r1 = r6 & 1
            if (r1 == 0) goto L9
            r1 = 700(0x2bc, float:9.81E-43)
            goto Lb
        L9:
            r1 = 400(0x190, float:5.6E-43)
        Lb:
            r6 = r6 & 2
            r2 = 0
            r3 = 1
            if (r6 == 0) goto L13
            r6 = r3
            goto L14
        L13:
            r6 = r2
        L14:
            r0.<init>(r1, r6)
            android.graphics.fonts.Font r6 = r5.getFont(r2)
            android.graphics.fonts.FontStyle r1 = r6.getStyle()
            int r1 = m7260(r0, r1)
        L23:
            int r2 = r5.getSize()
            if (r3 >= r2) goto L3c
            android.graphics.fonts.Font r2 = r5.getFont(r3)
            android.graphics.fonts.FontStyle r4 = r2.getStyle()
            int r4 = m7260(r0, r4)
            if (r4 >= r1) goto L39
            r6 = r2
            r1 = r4
        L39:
            int r3 = r3 + 1
            goto L23
        L3c:
            return r6
    }

    /* JADX INFO: renamed from: η */
    public static p000.q42 m7259(java.lang.String r2) {
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = 79201641(0x4b88569, float:4.338071E-36)
            if (r0 == r1) goto L41
            r1 = 79923350(0x4c38896, float:4.5969714E-36)
            if (r0 == r1) goto L36
            switch(r0) {
                case -503070503: goto L2b;
                case -503070502: goto L20;
                case -503070501: goto L15;
                default: goto L14;
            }
        L14:
            goto L4c
        L15:
            java.lang.String r0 = "TLSv1.3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4c
            q42 r2 = p000.q42.f8861
            return r2
        L20:
            java.lang.String r0 = "TLSv1.2"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4c
            q42 r2 = p000.q42.f8862
            return r2
        L2b:
            java.lang.String r0 = "TLSv1.1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4c
            q42 r2 = p000.q42.f8863
            return r2
        L36:
            java.lang.String r0 = "TLSv1"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4c
            q42 r2 = p000.q42.f8864
            return r2
        L41:
            java.lang.String r0 = "SSLv3"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4c
            q42 r2 = p000.q42.f8865
            return r2
        L4c:
            java.lang.String r0 = "Unexpected TLS version: "
            java.lang.String r2 = r0.concat(r2)
            p000.C1080.m7275(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: κ */
    public static int m7260(android.graphics.fonts.FontStyle r2, android.graphics.fonts.FontStyle r3) {
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

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f13385
            switch(r0) {
                case 0: goto Ld;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.String r1 = "ReusedSlotId"
            return r1
        Ld:
            java.lang.String r1 = "SharingStarted.Lazily"
            return r1
    }

    @Override // p000.p92
    /* JADX INFO: renamed from: α */
    public p000.m92 mo1670(java.lang.Class r1) {
            r0 = this;
            m92 r0 = p000.jx0.m3051(r1)
            return r0
    }

    @Override // p000.p92
    /* JADX INFO: renamed from: β */
    public p000.m92 mo4439(java.lang.Class r1, p000.k11 r2) {
            r0 = this;
            m92 r0 = r0.mo1670(r1)
            return r0
    }

    @Override // p000.p92
    /* JADX INFO: renamed from: γ */
    public p000.m92 mo1613(p000.C0945wf r1, p000.k11 r2) {
            r0 = this;
            java.lang.Class r1 = p000.ln0.m3604(r1)
            m92 r0 = r0.mo4439(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public android.graphics.Typeface m7261(android.content.Context r6, java.util.List r7, int r8) {
            r5 = this;
            android.content.ContentResolver r6 = r6.getContentResolver()
            r0 = 0
            r1 = 0
            java.lang.Object r0 = r7.get(r0)     // Catch: java.lang.Exception -> L2f
            f60[] r0 = (p000.f60[]) r0     // Catch: java.lang.Exception -> L2f
            android.graphics.fonts.FontFamily r0 = r5.m7262(r0, r6)     // Catch: java.lang.Exception -> L2f
            if (r0 != 0) goto L13
            return r1
        L13:
            android.graphics.Typeface$CustomFallbackBuilder r2 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L2f
            r2.<init>(r0)     // Catch: java.lang.Exception -> L2f
            r3 = 1
        L19:
            int r4 = r7.size()     // Catch: java.lang.Exception -> L2f
            if (r3 >= r4) goto L34
            java.lang.Object r4 = r7.get(r3)     // Catch: java.lang.Exception -> L2f
            f60[] r4 = (p000.f60[]) r4     // Catch: java.lang.Exception -> L2f
            android.graphics.fonts.FontFamily r4 = r5.m7262(r4, r6)     // Catch: java.lang.Exception -> L2f
            if (r4 == 0) goto L31
            r2.addCustomFallback(r4)     // Catch: java.lang.Exception -> L2f
            goto L31
        L2f:
            r5 = move-exception
            goto L45
        L31:
            int r3 = r3 + 1
            goto L19
        L34:
            android.graphics.fonts.Font r5 = m7258(r0, r8)     // Catch: java.lang.Exception -> L2f
            android.graphics.fonts.FontStyle r5 = r5.getStyle()     // Catch: java.lang.Exception -> L2f
            android.graphics.Typeface$CustomFallbackBuilder r5 = r2.setStyle(r5)     // Catch: java.lang.Exception -> L2f
            android.graphics.Typeface r5 = r5.build()     // Catch: java.lang.Exception -> L2f
            return r5
        L45:
            java.lang.String r6 = "TypefaceCompatApi29Impl"
            java.lang.String r7 = "Font load failed"
            android.util.Log.w(r6, r7, r5)
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public android.graphics.fonts.FontFamily m7262(p000.f60[] r10, android.content.ContentResolver r11) {
            r9 = this;
            int r0 = r10.length
            r1 = 0
            r2 = 0
            r3 = r1
        L4:
            if (r2 >= r0) goto L7d
            r4 = r10[r2]
            android.net.Uri r5 = r4.f3758
            java.lang.String r5 = r5.getScheme()
            java.lang.String r6 = "systemfont"
            boolean r5 = java.util.Objects.equals(r5, r6)
            if (r5 == 0) goto L1b
            android.graphics.fonts.Font r4 = r9.mo2875(r4)
            goto L6c
        L1b:
            android.net.Uri r5 = r4.f3758     // Catch: java.io.IOException -> L2e
            java.lang.String r6 = r4.f3762     // Catch: java.io.IOException -> L2e
            java.lang.String r7 = "r"
            android.os.ParcelFileDescriptor r5 = r11.openFileDescriptor(r5, r7, r1)     // Catch: java.io.IOException -> L2e
            if (r5 != 0) goto L30
            if (r5 == 0) goto L2c
            r5.close()     // Catch: java.io.IOException -> L2e
        L2c:
            r4 = r1
            goto L6c
        L2e:
            r4 = move-exception
            goto L64
        L30:
            android.graphics.fonts.Font$Builder r7 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L51
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L51
            int r8 = r4.f3760     // Catch: java.lang.Throwable -> L51
            android.graphics.fonts.Font$Builder r7 = r7.setWeight(r8)     // Catch: java.lang.Throwable -> L51
            boolean r8 = r4.f3761     // Catch: java.lang.Throwable -> L51
            android.graphics.fonts.Font$Builder r7 = r7.setSlant(r8)     // Catch: java.lang.Throwable -> L51
            int r4 = r4.f3759     // Catch: java.lang.Throwable -> L51
            android.graphics.fonts.Font$Builder r4 = r7.setTtcIndex(r4)     // Catch: java.lang.Throwable -> L51
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L51
            if (r7 != 0) goto L53
            r4.setFontVariationSettings(r6)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r4 = move-exception
            goto L5b
        L53:
            android.graphics.fonts.Font r4 = r4.build()     // Catch: java.lang.Throwable -> L51
            r5.close()     // Catch: java.io.IOException -> L2e
            goto L6c
        L5b:
            r5.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L2e
        L63:
            throw r4     // Catch: java.io.IOException -> L2e
        L64:
            java.lang.String r5 = "TypefaceCompatApi29Impl"
            java.lang.String r6 = "Font load failed"
            android.util.Log.w(r5, r6, r4)
            goto L2c
        L6c:
            if (r4 != 0) goto L6f
            goto L7a
        L6f:
            if (r3 != 0) goto L77
            android.graphics.fonts.FontFamily$Builder r3 = new android.graphics.fonts.FontFamily$Builder
            r3.<init>(r4)
            goto L7a
        L77:
            r3.addFont(r4)
        L7a:
            int r2 = r2 + 1
            goto L4
        L7d:
            if (r3 != 0) goto L80
            return r1
        L80:
            android.graphics.fonts.FontFamily r9 = r3.build()
            return r9
    }

    /* JADX INFO: renamed from: ι */
    public android.graphics.fonts.Font mo2875(p000.f60 r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Getting font from Typeface is not supported before API31"
            r0.<init>(r1)
            throw r0
    }
}
