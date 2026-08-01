package io.ktor.network.tls;

import io.ktor.network.tls.extensions.HashAlgorithm;
import io.ktor.network.tls.extensions.SignatureAlgorithm;
import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC6016;
import p050.AbstractC7176;
import p272.AbstractC9025;
import p272.C9026;

/* JADX INFO: renamed from: io.ktor.network.tls.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4869 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f12659 = 0;

    static {
        SecretExchangeType secretExchangeType = SecretExchangeType.RSA;
        HashAlgorithm hashAlgorithm = HashAlgorithm.SHA256;
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.RSA;
        C4868 c4868 = new C4868((short) 156, "TLS_RSA_WITH_AES_128_GCM_SHA256", "AES128-GCM-SHA256", secretExchangeType, 128, hashAlgorithm, signatureAlgorithm);
        SecretExchangeType secretExchangeType2 = SecretExchangeType.ECDHE;
        HashAlgorithm hashAlgorithm2 = HashAlgorithm.SHA384;
        SignatureAlgorithm signatureAlgorithm2 = SignatureAlgorithm.ECDSA;
        C4868 c48682 = new C4868((short) -16340, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "ECDHE-ECDSA-AES256-GCM-SHA384", secretExchangeType2, 256, hashAlgorithm2, signatureAlgorithm2);
        int i = 128;
        C4868 c48683 = new C4868((short) -16341, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "ECDHE-ECDSA-AES128-GCM-SHA256", secretExchangeType2, i, hashAlgorithm, signatureAlgorithm2);
        C4868 c48684 = new C4868((short) -16336, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "ECDHE-RSA-AES256-GCM-SHA384", secretExchangeType2, 256, hashAlgorithm2, signatureAlgorithm);
        C4868 c48685 = new C4868((short) -16337, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "ECDHE-RSA-AES128-GCM-SHA256", secretExchangeType2, i, hashAlgorithm, signatureAlgorithm);
        CipherType cipherType = CipherType.CBC;
        List listM12490 = AbstractC7176.m12490(c48682, c48684, c48683, c48685, c4868, new C4868((short) 53, "TLS_RSA_WITH_AES_256_CBC_SHA", "AES-256-CBC-SHA", secretExchangeType, "AES/CBC/NoPadding", 256, 16, 48, 20, "HmacSHA1", 160, hashAlgorithm, signatureAlgorithm, cipherType), new C4868((short) 47, "TLS_RSA_WITH_AES_128_CBC_SHA", "AES-128-CBC-SHA", secretExchangeType, "AES/CBC/NoPadding", 128, 16, 48, 20, "HmacSHA1", 160, hashAlgorithm, signatureAlgorithm, cipherType));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM12490) {
            C4868 c48686 = (C4868) obj;
            c48686.getClass();
            int i2 = c48686.f12645;
            InterfaceC6016 interfaceC6016 = AbstractC9025.f22911;
            String str = ((C9026) interfaceC6016.getValue()).f22914;
            int iHashCode = str.hashCode();
            if (iHashCode != 46676283) {
                if (iHashCode != 46677244) {
                    if (iHashCode != 46678205 || !str.equals("1.8.0") || ((C9026) interfaceC6016.getValue()).f22913 >= 161 || i2 <= 128) {
                        arrayList.add(obj);
                    }
                } else if (!str.equals("1.7.0") || ((C9026) interfaceC6016.getValue()).f22913 >= 171 || i2 <= 128) {
                    arrayList.add(obj);
                }
            } else if (!str.equals("1.6.0") || ((C9026) interfaceC6016.getValue()).f22913 >= 181 || i2 <= 128) {
                arrayList.add(obj);
            }
        }
    }
}
