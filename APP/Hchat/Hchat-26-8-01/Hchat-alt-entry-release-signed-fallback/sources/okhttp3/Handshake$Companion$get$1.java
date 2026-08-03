package okhttp3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Handshake$Companion$get$1 extends gg.m implements fg.a {
    final /* synthetic */ java.util.List<java.security.cert.Certificate> $peerCertificatesCopy;

    public Handshake$Companion$get$1(java.util.List<? extends java.security.cert.Certificate> r1) {
            r0 = this;
            r0.$peerCertificatesCopy = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
            r1 = this;
            java.util.List r0 = r1.invoke()
            return r0
    }

    @Override // fg.a
    public final java.util.List<java.security.cert.Certificate> invoke() {
            r1 = this;
            java.util.List<java.security.cert.Certificate> r0 = r1.$peerCertificatesCopy
            return r0
    }
}
