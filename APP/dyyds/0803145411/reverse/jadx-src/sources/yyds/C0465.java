package yyds;

import java.net.InetAddress;

/* JADX INFO: renamed from: yyds.ᛲᲁᛷᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0465 extends AbstractC2720 {
    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        if (c1942.m3744() != 9) {
            return InetAddress.getByName(c1942.m3745());
        }
        c1942.m3767();
        return null;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        c1405.m2852(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
