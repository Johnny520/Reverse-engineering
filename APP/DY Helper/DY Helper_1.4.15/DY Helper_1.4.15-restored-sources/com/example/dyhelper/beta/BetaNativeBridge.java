package com.example.dyhelper.beta;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class BetaNativeBridge {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f2224 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.Object f2225 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.example.dyhelper.beta.BetaNativeBridge.f2224 = r0
            o7 r0 = new o7
            r1 = 7
            r0.<init>(r1)
            qq0 r1 = p000.qq0.f9079
            oq0 r0 = p000.ln0.m3611(r1, r0)
            com.example.dyhelper.beta.BetaNativeBridge.f2225 = r0
            return
    }

    private static final native boolean nativeAllowChapterSkip();

    private static final native boolean nativeAllowCleanMode();

    private static final native boolean nativeAllowCommentBookmark();

    private static final native boolean nativeAllowConversationDelete();

    private static final native boolean nativeAllowDurationAlert();

    private static final native boolean nativeAllowGroupApply();

    private static final native boolean nativeAllowHiddenContact();

    private static final native boolean nativeAllowLocalFeature();

    private static final native boolean nativeAllowPetElfCamp();

    private static final native boolean nativeAllowPetElfTask();

    private static final native boolean nativeAllowSpark();

    private static final native boolean nativeAllowTabFilter();

    private static final native boolean nativeAllowUiSurface();

    private static final native boolean nativeAllowVoiceReplace();

    private static final native java.lang.String nativeCreateApplyPayload(java.lang.String r0, long r1);

    private static final native byte[] nativeGetApplyKeyMaterial();

    private static final native java.lang.String[] nativeGetBetaListUrls();

    private static final native boolean nativeIsRuntimeTrusted();

    private static final native java.lang.String nativeQueryUiState();

    private static final native java.lang.String nativeRefreshSession(java.lang.String r0, java.lang.String r1);

    private static final native void nativeReset();

    private static final native boolean nativeRestoreSession(java.lang.String r0, java.lang.String r1);

    /* JADX INFO: renamed from: α */
    public static boolean m1282() {
            boolean r0 = m1299()
            if (r0 == 0) goto L27
            boolean r0 = nativeAllowChapterSkip()     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static boolean m1283() {
            boolean r0 = m1299()
            if (r0 == 0) goto L27
            boolean r0 = nativeAllowCleanMode()     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m1284() {
            boolean r0 = m1299()
            if (r0 == 0) goto L27
            boolean r0 = nativeAllowCommentBookmark()     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m1285() {
            boolean r0 = m1299()
            if (r0 == 0) goto L27
            boolean r0 = nativeAllowConversationDelete()     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m1286() {
            boolean r0 = m1299()
            if (r0 == 0) goto L27
            boolean r0 = nativeAllowDurationAlert()     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static boolean m1287() {
            boolean r0 = m1299()
            if (r0 == 0) goto L27
            boolean r0 = nativeAllowGroupApply()     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static boolean m1288() {
            boolean r0 = m1299()
            if (r0 == 0) goto L27
            boolean r0 = nativeAllowHiddenContact()     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static boolean m1289() {
            boolean r0 = m1299()
            if (r0 == 0) goto L27
            boolean r0 = nativeAllowLocalFeature()     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m1290() {
            boolean r0 = m1299()
            if (r0 == 0) goto L27
            boolean r0 = nativeAllowPetElfCamp()     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static boolean m1291() {
            boolean r0 = m1299()
            if (r0 == 0) goto L27
            boolean r0 = nativeAllowPetElfTask()     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public static boolean m1292() {
            boolean r0 = m1299()
            if (r0 == 0) goto L27
            boolean r0 = nativeAllowSpark()     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static boolean m1293() {
            boolean r0 = m1299()
            if (r0 == 0) goto L27
            boolean r0 = nativeAllowTabFilter()     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public static boolean m1294() {
            boolean r0 = m1299()
            if (r0 == 0) goto L27
            boolean r0 = nativeAllowUiSurface()     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public static boolean m1295() {
            boolean r0 = m1299()
            if (r0 == 0) goto L27
            boolean r0 = nativeAllowVoiceReplace()     // Catch: java.lang.Throwable -> Lf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static java.lang.String[] m1296() {
            boolean r0 = m1299()
            r1 = 0
            if (r0 != 0) goto La
            java.lang.String[] r0 = new java.lang.String[r1]
            return r0
        La:
            java.lang.String[] r0 = nativeGetBetaListUrls()     // Catch: java.lang.Throwable -> Lf
            goto L16
        Lf:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L16:
            java.lang.String[] r1 = new java.lang.String[r1]
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1d
            r0 = r1
        L1d:
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    /* JADX INFO: renamed from: π */
    public static java.lang.String m1297(java.lang.String r6, byte[] r7) {
            int r0 = r7.length
            r1 = 48
            if (r0 != r1) goto L51
            r0 = 0
            r2 = 32
            byte[] r3 = p000.AbstractC0312g7.m2241(r7, r0, r2)
            byte[] r7 = p000.AbstractC0312g7.m2241(r7, r2, r1)
            java.lang.String r1 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)     // Catch: java.lang.Throwable -> L47
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L47
            java.lang.String r4 = "AES"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L47
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L47
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L47
            r5 = 1
            r1.init(r5, r2, r4)     // Catch: java.lang.Throwable -> L47
            java.util.Base64$Encoder r2 = java.util.Base64.getUrlEncoder()     // Catch: java.lang.Throwable -> L47
            java.nio.charset.Charset r4 = p000.AbstractC0547mf.f7105     // Catch: java.lang.Throwable -> L47
            byte[] r6 = r6.getBytes(r4)     // Catch: java.lang.Throwable -> L47
            r6.getClass()     // Catch: java.lang.Throwable -> L47
            byte[] r6 = r1.doFinal(r6)     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = r2.encodeToString(r6)     // Catch: java.lang.Throwable -> L47
            r6.getClass()     // Catch: java.lang.Throwable -> L47
            int r1 = r3.length
            java.util.Arrays.fill(r3, r0, r1, r0)
            int r1 = r7.length
            java.util.Arrays.fill(r7, r0, r1, r0)
            return r6
        L47:
            r6 = move-exception
            int r1 = r3.length
            java.util.Arrays.fill(r3, r0, r1, r0)
            int r1 = r7.length
            java.util.Arrays.fill(r7, r0, r1, r0)
            throw r6
        L51:
            java.lang.String r6 = "invalid apply material"
            p000.C1080.m7275(r6)
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: ρ */
    public static p000.C0351h9 m1298(long r8, java.lang.String r10) {
            java.lang.String r0 = "generate failed: "
            java.lang.String r1 = "DYHBETA:"
            java.lang.CharSequence r10 = p000.q02.m4660(r10)
            java.lang.String r10 = r10.toString()
            boolean r2 = p000.q02.m4671(r10)
            java.lang.String r3 = ""
            r4 = 0
            if (r2 != 0) goto Lbd
            java.lang.String r2 = "0"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L1f
            goto Lbd
        L1f:
            boolean r2 = m1299()
            if (r2 != 0) goto L2d
            h9 r8 = new h9
            java.lang.String r9 = "native protection unavailable"
            r8.<init>(r3, r9, r4)
            return r8
        L2d:
            byte[] r2 = nativeGetApplyKeyMaterial()     // Catch: java.lang.Throwable -> L32
            goto L45
        L32:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.String r5 = "apply key material unavailable: "
            java.lang.String r2 = p000.lz1.m3687(r5, r2)
            r5 = 4
            java.lang.String r6 = "r2c07920444d2b8e4"
            r7 = 0
            p000.C0888ux.m5988(r6, r2, r7, r5, r7)
            r2 = r7
        L45:
            if (r2 != 0) goto L4f
            h9 r8 = new h9
            java.lang.String r9 = "key material unavailable"
            r8.<init>(r3, r9, r4)
            return r8
        L4f:
            int r5 = r2.length     // Catch: java.lang.Throwable -> L60
            r6 = 48
            if (r5 == r6) goto L62
            h9 r8 = new h9     // Catch: java.lang.Throwable -> L60
            java.lang.String r9 = "invalid key material"
            r8.<init>(r3, r9, r4)     // Catch: java.lang.Throwable -> L60
            int r9 = r2.length
            java.util.Arrays.fill(r2, r4, r9, r4)
            return r8
        L60:
            r8 = move-exception
            goto L9c
        L62:
            java.lang.String r8 = nativeCreateApplyPayload(r10, r8)     // Catch: java.lang.Throwable -> L60
            boolean r9 = p000.q02.m4671(r8)     // Catch: java.lang.Throwable -> L60
            if (r9 == 0) goto L78
            h9 r8 = new h9     // Catch: java.lang.Throwable -> L60
            java.lang.String r9 = "payload unavailable"
            r8.<init>(r3, r9, r4)     // Catch: java.lang.Throwable -> L60
            int r9 = r2.length
            java.util.Arrays.fill(r2, r4, r9, r4)
            return r8
        L78:
            java.lang.String r8 = m1297(r8, r2)     // Catch: java.lang.Throwable -> L60
            boolean r9 = p000.q02.m4671(r8)     // Catch: java.lang.Throwable -> L60
            if (r9 == 0) goto L8a
            h9 r8 = new h9     // Catch: java.lang.Throwable -> L60
            java.lang.String r9 = "encrypt failed"
            r8.<init>(r3, r9, r4)     // Catch: java.lang.Throwable -> L60
            goto L97
        L8a:
            h9 r9 = new h9     // Catch: java.lang.Throwable -> L60
            java.lang.String r8 = r1.concat(r8)     // Catch: java.lang.Throwable -> L60
            java.lang.String r10 = "apply code generated"
            r1 = 1
            r9.<init>(r8, r10, r1)     // Catch: java.lang.Throwable -> L60
            r8 = r9
        L97:
            int r9 = r2.length
            java.util.Arrays.fill(r2, r4, r9, r4)
            goto Lb6
        L9c:
            h9 r9 = new h9     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r10.<init>(r0)     // Catch: java.lang.Throwable -> Lb7
            r10.append(r8)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r8 = r10.toString()     // Catch: java.lang.Throwable -> Lb7
            r9.<init>(r3, r8, r4)     // Catch: java.lang.Throwable -> Lb7
            int r8 = r2.length
            java.util.Arrays.fill(r2, r4, r8, r4)
            r8 = r9
        Lb6:
            return r8
        Lb7:
            r8 = move-exception
            int r9 = r2.length
            java.util.Arrays.fill(r2, r4, r9, r4)
            throw r8
        Lbd:
            h9 r8 = new h9
            java.lang.String r9 = "UID invalid"
            r8.<init>(r3, r9, r4)
            return r8
    }

    /* JADX INFO: renamed from: σ */
    public static boolean m1299() {
            java.lang.Object r0 = com.example.dyhelper.beta.BetaNativeBridge.f2225
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L10
            goto L30
        L10:
            boolean r0 = nativeIsRuntimeTrusted()     // Catch: java.lang.Throwable -> L15
            return r0
        L15:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r2 = com.example.dyhelper.beta.BetaNativeBridge.f2224
            r3 = 1
            boolean r2 = r2.compareAndSet(r1, r3)
            if (r2 == 0) goto L30
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "native runtime check failed: "
            java.lang.String r0 = p000.lz1.m3687(r2, r0)
            r2 = 4
            java.lang.String r3 = "r2c07920444d2b8e4"
            r4 = 0
            p000.C0888ux.m5988(r3, r0, r4, r2, r4)
        L30:
            return r1
    }

    /* JADX INFO: renamed from: τ */
    public static java.lang.String m1300() {
            boolean r0 = m1299()
            if (r0 == 0) goto Lb
            java.lang.String r0 = nativeQueryUiState()
            return r0
        Lb:
            java.lang.String r0 = "0\nunavailable"
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public static java.lang.String m1301(java.lang.String r1, java.lang.String r2) {
            r1.getClass()
            boolean r0 = m1299()
            if (r0 == 0) goto Le
            java.lang.String r1 = nativeRefreshSession(r1, r2)
            return r1
        Le:
            java.lang.String r1 = "beta native protection unavailable"
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: φ */
    public static void m1302() {
            boolean r0 = m1299()
            if (r0 == 0) goto L9
            nativeReset()
        L9:
            return
    }

    /* JADX INFO: renamed from: χ */
    public static boolean m1303(java.lang.String r1, java.lang.String r2) {
            r2.getClass()
            boolean r0 = m1299()
            if (r0 != 0) goto Lb
            r1 = 0
            return r1
        Lb:
            boolean r1 = nativeRestoreSession(r1, r2)
            return r1
    }
}
