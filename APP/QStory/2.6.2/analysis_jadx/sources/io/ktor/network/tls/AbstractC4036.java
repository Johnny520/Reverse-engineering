package io.ktor.network.tls;

import io.ktor.network.tls.extensions.HashAlgorithm;
import io.ktor.network.tls.extensions.SignatureAlgorithm;
import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC5183;
import p253.AbstractC8189;
import p256.AbstractC8195;
import p256.C8196;

/* JADX INFO: renamed from: io.ktor.network.tls.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4036 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f12310 = 0;

    static {
        SecretExchangeType secretExchangeType = SecretExchangeType.RSA;
        HashAlgorithm hashAlgorithm = HashAlgorithm.SHA256;
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.RSA;
        C4035 c4035 = new C4035((short) 156, "TLS_RSA_WITH_AES_128_GCM_SHA256", "AES128-GCM-SHA256", secretExchangeType, 128, hashAlgorithm, signatureAlgorithm);
        SecretExchangeType secretExchangeType2 = SecretExchangeType.ECDHE;
        HashAlgorithm hashAlgorithm2 = HashAlgorithm.SHA384;
        SignatureAlgorithm signatureAlgorithm2 = SignatureAlgorithm.ECDSA;
        C4035 c40352 = new C4035((short) -16340, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "ECDHE-ECDSA-AES256-GCM-SHA384", secretExchangeType2, 256, hashAlgorithm2, signatureAlgorithm2);
        int i = 128;
        C4035 c40353 = new C4035((short) -16341, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "ECDHE-ECDSA-AES128-GCM-SHA256", secretExchangeType2, i, hashAlgorithm, signatureAlgorithm2);
        C4035 c40354 = new C4035((short) -16336, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "ECDHE-RSA-AES256-GCM-SHA384", secretExchangeType2, 256, hashAlgorithm2, signatureAlgorithm);
        C4035 c40355 = new C4035((short) -16337, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "ECDHE-RSA-AES128-GCM-SHA256", secretExchangeType2, i, hashAlgorithm, signatureAlgorithm);
        CipherType cipherType = CipherType.CBC;
        List listM13659 = AbstractC8189.m13659(c40352, c40354, c40353, c40355, c4035, new C4035((short) 53, "TLS_RSA_WITH_AES_256_CBC_SHA", "AES-256-CBC-SHA", secretExchangeType, "AES/CBC/NoPadding", 256, 16, 48, 20, "HmacSHA1", 160, hashAlgorithm, signatureAlgorithm, cipherType), new C4035((short) 47, "TLS_RSA_WITH_AES_128_CBC_SHA", "AES-128-CBC-SHA", secretExchangeType, "AES/CBC/NoPadding", 128, 16, 48, 20, "HmacSHA1", 160, hashAlgorithm, signatureAlgorithm, cipherType));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM13659) {
            C4035 c40356 = (C4035) obj;
            c40356.getClass();
            int i2 = c40356.f12296;
            InterfaceC5183 interfaceC5183 = AbstractC8195.f22567;
            String str = ((C8196) interfaceC5183.getValue()).f22570;
            int iHashCode = str.hashCode();
            if (iHashCode != 46676283) {
                if (iHashCode != 46677244) {
                    if (iHashCode != 46678205 || !str.equals("1.8.0") || ((C8196) interfaceC5183.getValue()).f22569 >= 161 || i2 <= 128) {
                        arrayList.add(obj);
                    }
                } else if (!str.equals("1.7.0") || ((C8196) interfaceC5183.getValue()).f22569 >= 171 || i2 <= 128) {
                    arrayList.add(obj);
                }
            } else if (!str.equals("1.6.0") || ((C8196) interfaceC5183.getValue()).f22569 >= 181 || i2 <= 128) {
                arrayList.add(obj);
            }
        }
    }
}
