package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nBasicTrustRootIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTrustRootIndex.kt\nokhttp3/internal/tls/BasicTrustRootIndex\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n372#2,7:57\n288#3,2:64\n*S KotlinDebug\n*F\n+ 1 BasicTrustRootIndex.kt\nokhttp3/internal/tls/BasicTrustRootIndex\n*L\n28#1:57,7\n37#1:64,2\n*E\n"})
public final class C0749 implements Yue.InterfaceC6455 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> f2105;

    public C0749(@Yue.InterfaceC4418 java.security.cert.X509Certificate... r7) {
            r6 = this;
            java.lang.String r0 = "caCerts"
            Yue.C3329.m13906(r7, r0)
            r6.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L32
            r3 = r7[r2]
            javax.security.auth.x500.X500Principal r4 = r3.getSubjectX500Principal()
            java.lang.String r5 = "caCert.subjectX500Principal"
            Yue.C3329.m13905(r4, r5)
            java.lang.Object r5 = r0.get(r4)
            if (r5 != 0) goto L2a
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r0.put(r4, r5)
        L2a:
            java.util.Set r5 = (java.util.Set) r5
            r5.add(r3)
            int r2 = r2 + 1
            goto Lf
        L32:
            r6.f2105 = r0
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L15
            boolean r0 = r2 instanceof Yue.C0749
            if (r0 == 0) goto L13
            Yue.ۥ۟ۢۦۥ r2 = (Yue.C0749) r2
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r2 = r2.f2105
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r0 = r1.f2105
            boolean r2 = Yue.C3329.m13897(r2, r0)
            if (r2 == 0) goto L13
            goto L15
        L13:
            r2 = 0
            goto L16
        L15:
            r2 = 1
        L16:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r0 = r1.f2105
            int r0 = r0.hashCode()
            return r0
    }

    @Override // Yue.InterfaceC6455
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ */
    public java.security.cert.X509Certificate mo1428(@Yue.InterfaceC4418 java.security.cert.X509Certificate r5) {
            r4 = this;
            java.lang.String r0 = "cert"
            Yue.C3329.m13906(r5, r0)
            javax.security.auth.x500.X500Principal r0 = r5.getIssuerX500Principal()
            java.util.Map<javax.security.auth.x500.X500Principal, java.util.Set<java.security.cert.X509Certificate>> r1 = r4.f2105
            java.lang.Object r0 = r1.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            if (r0 != 0) goto L15
            return r1
        L15:
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3
            java.security.PublicKey r3 = r3.getPublicKey()     // Catch: java.lang.Exception -> L19
            r5.verify(r3)     // Catch: java.lang.Exception -> L19
            r1 = r2
        L2e:
            java.security.cert.X509Certificate r1 = (java.security.cert.X509Certificate) r1
            return r1
    }
}
