package io.ktor.network.tls;

import androidx.activity.AbstractC0053;
import io.ktor.network.tls.extensions.HashAlgorithm;
import io.ktor.network.tls.extensions.SignatureAlgorithm;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;

/* JADX INFO: renamed from: io.ktor.network.tls.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4035 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f12296;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f12297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final SecretExchangeType f12298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f12299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final short f12301;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final CipherType f12302;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final SignatureAlgorithm f12303;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f12304;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f12305;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f12306;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final HashAlgorithm f12307;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f12308;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String f12309;

    public C4035(short s, String str, String str2, SecretExchangeType secretExchangeType, String str3, int i, int i2, int i3, int i4, String str4, int i5, HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm, CipherType cipherType) {
        secretExchangeType.getClass();
        hashAlgorithm.getClass();
        signatureAlgorithm.getClass();
        cipherType.getClass();
        this.f12301 = s;
        this.f12300 = str;
        this.f12299 = str2;
        this.f12298 = secretExchangeType;
        this.f12297 = str3;
        this.f12296 = i;
        this.f12305 = i2;
        this.f12304 = i3;
        this.f12308 = i4;
        this.f12309 = str4;
        this.f12306 = i5;
        this.f12307 = hashAlgorithm;
        this.f12303 = signatureAlgorithm;
        this.f12302 = cipherType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4035)) {
            return false;
        }
        C4035 c4035 = (C4035) obj;
        return this.f12301 == c4035.f12301 && AbstractC4394.m8917(this.f12300, c4035.f12300) && AbstractC4394.m8917(this.f12299, c4035.f12299) && this.f12298 == c4035.f12298 && AbstractC4394.m8917(this.f12297, c4035.f12297) && this.f12296 == c4035.f12296 && this.f12305 == c4035.f12305 && this.f12304 == c4035.f12304 && this.f12308 == c4035.f12308 && AbstractC4394.m8917(this.f12309, c4035.f12309) && this.f12306 == c4035.f12306 && this.f12307 == c4035.f12307 && this.f12303 == c4035.f12303 && this.f12302 == c4035.f12302;
    }

    public final int hashCode() {
        return this.f12302.hashCode() + ((this.f12303.hashCode() + ((this.f12307.hashCode() + AbstractC0053.m143(this.f12306, AbstractC6136.m11539(AbstractC0053.m143(this.f12308, AbstractC0053.m143(this.f12304, AbstractC0053.m143(this.f12305, AbstractC0053.m143(this.f12296, AbstractC6136.m11539((this.f12298.hashCode() + AbstractC6136.m11539(AbstractC6136.m11539(Short.hashCode(this.f12301) * 31, 31, this.f12300), 31, this.f12299)) * 31, 31, this.f12297), 31), 31), 31), 31), 31, this.f12309), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CipherSuite(code=" + ((int) this.f12301) + ", name=" + this.f12300 + ", openSSLName=" + this.f12299 + ", exchangeType=" + this.f12298 + ", jdkCipherName=" + this.f12297 + ", keyStrength=" + this.f12296 + ", fixedIvLength=" + this.f12305 + ", ivLength=" + this.f12304 + ", cipherTagSizeInBytes=" + this.f12308 + ", macName=" + this.f12309 + ", macStrength=" + this.f12306 + ", hash=" + this.f12307 + ", signatureAlgorithm=" + this.f12303 + ", cipherType=" + this.f12302 + ')';
    }

    public /* synthetic */ C4035(short s, String str, String str2, SecretExchangeType secretExchangeType, int i, HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm) {
        this(s, str, str2, secretExchangeType, "AES/GCM/NoPadding", i, 4, 12, 16, "AEAD", 0, hashAlgorithm, signatureAlgorithm, CipherType.GCM);
    }
}
