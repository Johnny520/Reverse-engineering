package okhttp3;

import gg.AbstractC1417m;
import java.security.cert.Certificate;
import java.util.List;
import p085fg.InterfaceC1220a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Handshake$Companion$get$1 extends AbstractC1417m implements InterfaceC1220a {
    final /* synthetic */ List<Certificate> $peerCertificatesCopy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends java.security.cert.Certificate> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$Companion$get$1(List<? extends Certificate> list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p085fg.InterfaceC1220a
    public final List<Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
