package io.ktor.network.tls;

import io.ktor.network.tls.extensions.HashAlgorithm;
import io.ktor.network.tls.extensions.SignatureAlgorithm;
import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC5184;
import p034.AbstractC6347;
import p256.AbstractC8196;
import p256.C8197;

/* JADX INFO: renamed from: io.ktor.network.tls.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4037 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f12314 = 0;

    static {
        SecretExchangeType secretExchangeType = SecretExchangeType.RSA;
        HashAlgorithm hashAlgorithm = HashAlgorithm.SHA256;
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.RSA;
        C4036 c4036 = new C4036((short) 156, "TLS_RSA_WITH_AES_128_GCM_SHA256", "AES128-GCM-SHA256", secretExchangeType, 128, hashAlgorithm, signatureAlgorithm);
        SecretExchangeType secretExchangeType2 = SecretExchangeType.ECDHE;
        HashAlgorithm hashAlgorithm2 = HashAlgorithm.SHA384;
        SignatureAlgorithm signatureAlgorithm2 = SignatureAlgorithm.ECDSA;
        C4036 c40362 = new C4036((short) -16340, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "ECDHE-ECDSA-AES256-GCM-SHA384", secretExchangeType2, 256, hashAlgorithm2, signatureAlgorithm2);
        int i = 128;
        C4036 c40363 = new C4036((short) -16341, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "ECDHE-ECDSA-AES128-GCM-SHA256", secretExchangeType2, i, hashAlgorithm, signatureAlgorithm2);
        C4036 c40364 = new C4036((short) -16336, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "ECDHE-RSA-AES256-GCM-SHA384", secretExchangeType2, 256, hashAlgorithm2, signatureAlgorithm);
        C4036 c40365 = new C4036((short) -16337, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "ECDHE-RSA-AES128-GCM-SHA256", secretExchangeType2, i, hashAlgorithm, signatureAlgorithm);
        CipherType cipherType = CipherType.CBC;
        List listM11931 = AbstractC6347.m11931(c40362, c40364, c40363, c40365, c4036, new C4036((short) 53, "TLS_RSA_WITH_AES_256_CBC_SHA", "AES-256-CBC-SHA", secretExchangeType, "AES/CBC/NoPadding", 256, 16, 48, 20, "HmacSHA1", 160, hashAlgorithm, signatureAlgorithm, cipherType), new C4036((short) 47, "TLS_RSA_WITH_AES_128_CBC_SHA", "AES-128-CBC-SHA", secretExchangeType, "AES/CBC/NoPadding", 128, 16, 48, 20, "HmacSHA1", 160, hashAlgorithm, signatureAlgorithm, cipherType));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM11931) {
            C4036 c40366 = (C4036) obj;
            c40366.getClass();
            int i2 = c40366.f12300;
            InterfaceC5184 interfaceC5184 = AbstractC8196.f22566;
            String str = ((C8197) interfaceC5184.getValue()).f22569;
            int iHashCode = str.hashCode();
            if (iHashCode != 46676283) {
                if (iHashCode != 46677244) {
                    if (iHashCode != 46678205 || !str.equals("1.8.0") || ((C8197) interfaceC5184.getValue()).f22568 >= 161 || i2 <= 128) {
                        arrayList.add(obj);
                    }
                } else if (!str.equals("1.7.0") || ((C8197) interfaceC5184.getValue()).f22568 >= 171 || i2 <= 128) {
                    arrayList.add(obj);
                }
            } else if (!str.equals("1.6.0") || ((C8197) interfaceC5184.getValue()).f22568 >= 181 || i2 <= 128) {
                arrayList.add(obj);
            }
        }
    }
}
