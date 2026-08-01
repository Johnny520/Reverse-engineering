package io.ktor.network.tls;

import androidx.activity.AbstractC0053;
import io.ktor.network.tls.extensions.HashAlgorithm;
import io.ktor.network.tls.extensions.SignatureAlgorithm;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;

/* JADX INFO: renamed from: io.ktor.network.tls.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4036 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f12300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f12301;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final SecretExchangeType f12302;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f12303;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12304;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final short f12305;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final CipherType f12306;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final SignatureAlgorithm f12307;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f12308;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f12309;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f12310;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final HashAlgorithm f12311;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f12312;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String f12313;

    public C4036(short s, String str, String str2, SecretExchangeType secretExchangeType, String str3, int i, int i2, int i3, int i4, String str4, int i5, HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm, CipherType cipherType) {
        secretExchangeType.getClass();
        hashAlgorithm.getClass();
        signatureAlgorithm.getClass();
        cipherType.getClass();
        this.f12305 = s;
        this.f12304 = str;
        this.f12303 = str2;
        this.f12302 = secretExchangeType;
        this.f12301 = str3;
        this.f12300 = i;
        this.f12309 = i2;
        this.f12308 = i3;
        this.f12312 = i4;
        this.f12313 = str4;
        this.f12310 = i5;
        this.f12311 = hashAlgorithm;
        this.f12307 = signatureAlgorithm;
        this.f12306 = cipherType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4036)) {
            return false;
        }
        C4036 c4036 = (C4036) obj;
        return this.f12305 == c4036.f12305 && AbstractC4395.m8907(this.f12304, c4036.f12304) && AbstractC4395.m8907(this.f12303, c4036.f12303) && this.f12302 == c4036.f12302 && AbstractC4395.m8907(this.f12301, c4036.f12301) && this.f12300 == c4036.f12300 && this.f12309 == c4036.f12309 && this.f12308 == c4036.f12308 && this.f12312 == c4036.f12312 && AbstractC4395.m8907(this.f12313, c4036.f12313) && this.f12310 == c4036.f12310 && this.f12311 == c4036.f12311 && this.f12307 == c4036.f12307 && this.f12306 == c4036.f12306;
    }

    public final int hashCode() {
        return this.f12306.hashCode() + ((this.f12307.hashCode() + ((this.f12311.hashCode() + AbstractC0053.m144(this.f12310, AbstractC6183.m11572(AbstractC0053.m144(this.f12312, AbstractC0053.m144(this.f12308, AbstractC0053.m144(this.f12309, AbstractC0053.m144(this.f12300, AbstractC6183.m11572((this.f12302.hashCode() + AbstractC6183.m11572(AbstractC6183.m11572(Short.hashCode(this.f12305) * 31, 31, this.f12304), 31, this.f12303)) * 31, 31, this.f12301), 31), 31), 31), 31), 31, this.f12313), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CipherSuite(code=" + ((int) this.f12305) + ", name=" + this.f12304 + ", openSSLName=" + this.f12303 + ", exchangeType=" + this.f12302 + ", jdkCipherName=" + this.f12301 + ", keyStrength=" + this.f12300 + ", fixedIvLength=" + this.f12309 + ", ivLength=" + this.f12308 + ", cipherTagSizeInBytes=" + this.f12312 + ", macName=" + this.f12313 + ", macStrength=" + this.f12310 + ", hash=" + this.f12311 + ", signatureAlgorithm=" + this.f12307 + ", cipherType=" + this.f12306 + ')';
    }

    public /* synthetic */ C4036(short s, String str, String str2, SecretExchangeType secretExchangeType, int i, HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm) {
        this(s, str, str2, secretExchangeType, "AES/GCM/NoPadding", i, 4, 12, 16, "AEAD", 0, hashAlgorithm, signatureAlgorithm, CipherType.GCM);
    }
}
