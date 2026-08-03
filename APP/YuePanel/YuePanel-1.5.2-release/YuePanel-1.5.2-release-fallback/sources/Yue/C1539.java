package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1539 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f4957 = "TREAT_AS_VIEW_TREE_APPEARING";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f4958 = "TREAT_AS_VIEW_TREE_APPEARED";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object f4959;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.view.View f4960;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۡ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C1540 {
        public C1540() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.os.Bundle m7679(android.view.ViewStructure r0) {
                android.os.Bundle r0 = r0.getExtras()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۡ۠$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C1541 {
        public C1541() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.view.autofill.AutofillId m7680(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, long r2) {
                android.view.autofill.AutofillId r0 = r0.newAutofillId(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.view.ViewStructure m7681(android.view.contentcapture.ContentCaptureSession r0, android.view.View r1) {
                android.view.ViewStructure r0 = r0.newViewStructure(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.view.ViewStructure m7682(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, long r2) {
                android.view.ViewStructure r0 = r0.newVirtualViewStructure(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m7683(android.view.contentcapture.ContentCaptureSession r0, android.view.ViewStructure r1) {
                r0.notifyViewAppeared(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m7684(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, java.lang.CharSequence r2) {
                r0.notifyViewTextChanged(r1, r2)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static void m7685(android.view.contentcapture.ContentCaptureSession r0, android.view.autofill.AutofillId r1, long[] r2) {
                r0.notifyViewsDisappeared(r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۡ۠$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(34)
    public static class C1542 {
        public C1542() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m7686(android.view.contentcapture.ContentCaptureSession r0, java.util.List<android.view.ViewStructure> r1) {
                r0.notifyViewsAppeared(r1)
                return
        }
    }

    @Yue.InterfaceC5336(29)
    public C1539(@Yue.InterfaceC4410 android.view.contentcapture.ContentCaptureSession r1, @Yue.InterfaceC4410 android.view.View r2) {
            r0 = this;
            r0.<init>()
            r0.f4959 = r1
            r0.f4960 = r2
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(29)
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Yue.C1539 m7672(@Yue.InterfaceC4410 android.view.contentcapture.ContentCaptureSession r1, @Yue.InterfaceC4410 android.view.View r2) {
            Yue.ۥ۟ۧۡ۠ r0 = new Yue.ۥ۟ۧۡ۠
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.view.autofill.AutofillId m7673(long r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1e
            java.lang.Object r0 = r2.f4959
            android.view.contentcapture.ContentCaptureSession r0 = Yue.C1538.m7671(r0)
            android.view.View r1 = r2.f4960
            Yue.ۥ۟ۢۤۢ r1 = Yue.C6794.m26124(r1)
            java.util.Objects.requireNonNull(r1)
            android.view.autofill.AutofillId r1 = r1.m4445()
            android.view.autofill.AutofillId r3 = Yue.C1539.C1541.m7680(r0, r1, r3)
            return r3
        L1e:
            r3 = 0
            return r3
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C6912 m7674(@Yue.InterfaceC4410 android.view.autofill.AutofillId r3, long r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L15
            java.lang.Object r0 = r2.f4959
            android.view.contentcapture.ContentCaptureSession r0 = Yue.C1538.m7671(r0)
            android.view.ViewStructure r3 = Yue.C1539.C1541.m7682(r0, r3, r4)
            Yue.ۥۢۤۧ۠ r3 = Yue.C6912.m26769(r3)
            return r3
        L15:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m7675(@Yue.InterfaceC4410 android.view.autofill.AutofillId r3, @Yue.InterfaceC4544 java.lang.CharSequence r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.f4959
            android.view.contentcapture.ContentCaptureSession r0 = Yue.C1538.m7671(r0)
            Yue.C1539.C1541.m7684(r0, r3, r4)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m7676(@Yue.InterfaceC4410 java.util.List<android.view.ViewStructure> r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L10
            java.lang.Object r0 = r4.f4959
            android.view.contentcapture.ContentCaptureSession r0 = Yue.C1538.m7671(r0)
            Yue.C1539.C1542.m7686(r0, r5)
            goto L6a
        L10:
            r1 = 29
            if (r0 < r1) goto L6a
            java.lang.Object r0 = r4.f4959
            android.view.contentcapture.ContentCaptureSession r0 = Yue.C1538.m7671(r0)
            android.view.View r1 = r4.f4960
            android.view.ViewStructure r0 = Yue.C1539.C1541.m7681(r0, r1)
            android.os.Bundle r1 = Yue.C1539.C1540.m7679(r0)
            java.lang.String r2 = "TREAT_AS_VIEW_TREE_APPEARING"
            r3 = 1
            r1.putBoolean(r2, r3)
            java.lang.Object r1 = r4.f4959
            android.view.contentcapture.ContentCaptureSession r1 = Yue.C1538.m7671(r1)
            Yue.C1539.C1541.m7683(r1, r0)
            r0 = 0
        L34:
            int r1 = r5.size()
            if (r0 >= r1) goto L4c
            java.lang.Object r1 = r4.f4959
            android.view.contentcapture.ContentCaptureSession r1 = Yue.C1538.m7671(r1)
            java.lang.Object r2 = r5.get(r0)
            android.view.ViewStructure r2 = (android.view.ViewStructure) r2
            Yue.C1539.C1541.m7683(r1, r2)
            int r0 = r0 + 1
            goto L34
        L4c:
            java.lang.Object r5 = r4.f4959
            android.view.contentcapture.ContentCaptureSession r5 = Yue.C1538.m7671(r5)
            android.view.View r0 = r4.f4960
            android.view.ViewStructure r5 = Yue.C1539.C1541.m7681(r5, r0)
            android.os.Bundle r0 = Yue.C1539.C1540.m7679(r5)
            java.lang.String r1 = "TREAT_AS_VIEW_TREE_APPEARED"
            r0.putBoolean(r1, r3)
            java.lang.Object r0 = r4.f4959
            android.view.contentcapture.ContentCaptureSession r0 = Yue.C1538.m7671(r0)
            Yue.C1539.C1541.m7683(r0, r5)
        L6a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m7677(@Yue.InterfaceC4410 long[] r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L1d
            java.lang.Object r0 = r4.f4959
            android.view.contentcapture.ContentCaptureSession r0 = Yue.C1538.m7671(r0)
            android.view.View r1 = r4.f4960
            Yue.ۥ۟ۢۤۢ r1 = Yue.C6794.m26124(r1)
            java.util.Objects.requireNonNull(r1)
            android.view.autofill.AutofillId r1 = r1.m4445()
            Yue.C1539.C1541.m7685(r0, r1, r5)
            goto L74
        L1d:
            r1 = 29
            if (r0 < r1) goto L74
            java.lang.Object r0 = r4.f4959
            android.view.contentcapture.ContentCaptureSession r0 = Yue.C1538.m7671(r0)
            android.view.View r1 = r4.f4960
            android.view.ViewStructure r0 = Yue.C1539.C1541.m7681(r0, r1)
            android.os.Bundle r1 = Yue.C1539.C1540.m7679(r0)
            java.lang.String r2 = "TREAT_AS_VIEW_TREE_APPEARING"
            r3 = 1
            r1.putBoolean(r2, r3)
            java.lang.Object r1 = r4.f4959
            android.view.contentcapture.ContentCaptureSession r1 = Yue.C1538.m7671(r1)
            Yue.C1539.C1541.m7683(r1, r0)
            java.lang.Object r0 = r4.f4959
            android.view.contentcapture.ContentCaptureSession r0 = Yue.C1538.m7671(r0)
            android.view.View r1 = r4.f4960
            Yue.ۥ۟ۢۤۢ r1 = Yue.C6794.m26124(r1)
            java.util.Objects.requireNonNull(r1)
            android.view.autofill.AutofillId r1 = r1.m4445()
            Yue.C1539.C1541.m7685(r0, r1, r5)
            java.lang.Object r5 = r4.f4959
            android.view.contentcapture.ContentCaptureSession r5 = Yue.C1538.m7671(r5)
            android.view.View r0 = r4.f4960
            android.view.ViewStructure r5 = Yue.C1539.C1541.m7681(r5, r0)
            android.os.Bundle r0 = Yue.C1539.C1540.m7679(r5)
            java.lang.String r1 = "TREAT_AS_VIEW_TREE_APPEARED"
            r0.putBoolean(r1, r3)
            java.lang.Object r0 = r4.f4959
            android.view.contentcapture.ContentCaptureSession r0 = Yue.C1538.m7671(r0)
            Yue.C1539.C1541.m7683(r0, r5)
        L74:
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(29)
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.view.contentcapture.ContentCaptureSession m7678() {
            r1 = this;
            java.lang.Object r0 = r1.f4959
            android.view.contentcapture.ContentCaptureSession r0 = Yue.C1538.m7671(r0)
            return r0
    }
}
