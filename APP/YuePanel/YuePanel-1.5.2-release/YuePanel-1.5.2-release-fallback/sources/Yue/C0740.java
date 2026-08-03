package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0740 extends Yue.AbstractC0958 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0740.C0741 f2069 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f2070 = 9;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC6455 f2071;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۦ۠$ۥ, reason: contains not printable characters */
    public static final class C0741 {
        public C0741() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0741(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥ۟ۢۦ۠$ۥ r0 = new Yue.ۥ۟ۢۦ۠$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C0740.f2069 = r0
            return
    }

    public C0740(@Yue.InterfaceC4418 Yue.InterfaceC6455 r2) {
            r1 = this;
            java.lang.String r0 = "trustRootIndex"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f2071 = r2
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r3 != r2) goto L4
            goto L16
        L4:
            boolean r1 = r3 instanceof Yue.C0740
            if (r1 == 0) goto L15
            Yue.ۥ۟ۢۦ۠ r3 = (Yue.C0740) r3
            Yue.ۥۢۢۢ۠ r3 = r3.f2071
            Yue.ۥۢۢۢ۠ r1 = r2.f2071
            boolean r3 = Yue.C3329.m13897(r3, r1)
            if (r3 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    public int hashCode() {
            r1 = this;
            Yue.ۥۢۢۢ۠ r0 = r1.f2071
            int r0 = r0.hashCode()
            return r0
    }

    @Override // Yue.AbstractC0958
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public java.util.List<java.security.cert.Certificate> mo1407(@Yue.InterfaceC4418 java.util.List<? extends java.security.cert.Certificate> r8, @Yue.InterfaceC4418 java.lang.String r9) throws javax.net.ssl.SSLPeerUnverifiedException {
            r7 = this;
            java.lang.String r0 = "chain"
            Yue.C3329.m13906(r8, r0)
            java.lang.String r0 = "hostname"
            Yue.C3329.m13906(r9, r0)
            java.util.ArrayDeque r9 = new java.util.ArrayDeque
            r9.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r0 = r9.removeFirst()
            java.lang.String r1 = "queue.removeFirst()"
            Yue.C3329.m13905(r0, r1)
            r8.add(r0)
            r0 = 0
            r1 = r0
        L22:
            r2 = 9
            if (r0 >= r2) goto L98
            int r2 = r8.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r8.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            Yue.C3329.m13904(r2, r4)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            Yue.ۥۢۢۢ۠ r5 = r7.f2071
            java.security.cert.X509Certificate r5 = r5.mo1428(r2)
            if (r5 == 0) goto L57
            int r1 = r8.size()
            if (r1 > r3) goto L4b
            boolean r1 = Yue.C3329.m13897(r2, r5)
            if (r1 != 0) goto L4e
        L4b:
            r8.add(r5)
        L4e:
            boolean r1 = r7.m4583(r5, r5)
            if (r1 == 0) goto L55
            return r8
        L55:
            r1 = r3
            goto L7b
        L57:
            java.util.Iterator r3 = r9.iterator()
            java.lang.String r5 = "queue.iterator()"
            Yue.C3329.m13905(r3, r5)
        L60:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L7e
            java.lang.Object r5 = r3.next()
            Yue.C3329.m13904(r5, r4)
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
            boolean r6 = r7.m4583(r2, r5)
            if (r6 == 0) goto L60
            r3.remove()
            r8.add(r5)
        L7b:
            int r0 = r0 + 1
            goto L22
        L7e:
            if (r1 == 0) goto L81
            return r8
        L81:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L98:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Certificate chain too long: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m4583(java.security.cert.X509Certificate r3, java.security.cert.X509Certificate r4) {
            r2 = this;
            java.security.Principal r0 = r3.getIssuerDN()
            java.security.Principal r1 = r4.getSubjectDN()
            boolean r0 = Yue.C3329.m13897(r0, r1)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            java.security.PublicKey r4 = r4.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L18
            r3.verify(r4)     // Catch: java.security.GeneralSecurityException -> L18
            r1 = 1
        L18:
            return r1
    }
}
