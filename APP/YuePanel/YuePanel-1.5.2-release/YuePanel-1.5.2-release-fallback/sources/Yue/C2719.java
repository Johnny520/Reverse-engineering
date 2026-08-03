package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2719 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.String f8943;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String f8944;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.lang.String f8945;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.util.List<java.util.List<byte[]>> f8946;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int f8947;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.lang.String f8948;

    public C2719(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4410 java.lang.String r4, @Yue.InterfaceC0577 int r5) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = Yue.C4868.m19181(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.f8943 = r0
            java.lang.Object r0 = Yue.C4868.m19181(r3)
            java.lang.String r0 = (java.lang.String) r0
            r1.f8944 = r0
            java.lang.Object r0 = Yue.C4868.m19181(r4)
            java.lang.String r0 = (java.lang.String) r0
            r1.f8945 = r0
            r0 = 0
            r1.f8946 = r0
            if (r5 == 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            Yue.C4868.m19170(r0)
            r1.f8947 = r5
            java.lang.String r2 = r1.m11960(r2, r3, r4)
            r1.f8948 = r2
            return
    }

    public C2719(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4410 java.lang.String r4, @Yue.InterfaceC4410 java.util.List<java.util.List<byte[]>> r5) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = Yue.C4868.m19181(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.f8943 = r0
            java.lang.Object r0 = Yue.C4868.m19181(r3)
            java.lang.String r0 = (java.lang.String) r0
            r1.f8944 = r0
            java.lang.Object r0 = Yue.C4868.m19181(r4)
            java.lang.String r0 = (java.lang.String) r0
            r1.f8945 = r0
            java.lang.Object r5 = Yue.C4868.m19181(r5)
            java.util.List r5 = (java.util.List) r5
            r1.f8946 = r5
            r5 = 0
            r1.f8947 = r5
            java.lang.String r2 = r1.m11960(r2, r3, r4)
            r1.f8948 = r2
            return
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "FontRequest {mProviderAuthority: "
            r1.append(r2)
            java.lang.String r2 = r6.f8943
            r1.append(r2)
            java.lang.String r2 = ", mProviderPackage: "
            r1.append(r2)
            java.lang.String r2 = r6.f8944
            r1.append(r2)
            java.lang.String r2 = ", mQuery: "
            r1.append(r2)
            java.lang.String r2 = r6.f8945
            r1.append(r2)
            java.lang.String r2 = ", mCertificates:"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 0
            r2 = r1
        L36:
            java.util.List<java.util.List<byte[]>> r3 = r6.f8946
            int r3 = r3.size()
            if (r2 >= r3) goto L74
            java.lang.String r3 = " ["
            r0.append(r3)
            java.util.List<java.util.List<byte[]>> r3 = r6.f8946
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = r1
        L4c:
            int r5 = r3.size()
            if (r4 >= r5) goto L6c
            java.lang.String r5 = " \""
            r0.append(r5)
            java.lang.Object r5 = r3.get(r4)
            byte[] r5 = (byte[]) r5
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)
            r0.append(r5)
            java.lang.String r5 = "\""
            r0.append(r5)
            int r4 = r4 + 1
            goto L4c
        L6c:
            java.lang.String r3 = " ]"
            r0.append(r3)
            int r2 = r2 + 1
            goto L36
        L74:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mCertificatesArray: "
            r1.append(r2)
            int r2 = r6.f8947
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.String m11960(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 java.lang.String r3, @Yue.InterfaceC4410 java.lang.String r4) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "-"
            r0.append(r2)
            r0.append(r3)
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.List<java.util.List<byte[]>> m11961() {
            r1 = this;
            java.util.List<java.util.List<byte[]>> r0 = r1.f8946
            return r0
    }

    @Yue.InterfaceC0577
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m11962() {
            r1 = this;
            int r0 = r1.f8947
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String m11963() {
            r1 = this;
            java.lang.String r0 = r1.f8948
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.String m11964() {
            r1 = this;
            java.lang.String r0 = r1.f8948
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.String m11965() {
            r1 = this;
            java.lang.String r0 = r1.f8943
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.lang.String m11966() {
            r1 = this;
            java.lang.String r0 = r1.f8944
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.lang.String m11967() {
            r1 = this;
            java.lang.String r0 = r1.f8945
            return r0
    }
}
