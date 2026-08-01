package io.ktor.network.tls;

import androidx.activity.AbstractC0900;
import io.ktor.network.tls.extensions.HashAlgorithm;
import io.ktor.network.tls.extensions.SignatureAlgorithm;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;

/* JADX INFO: renamed from: io.ktor.network.tls.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4868 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f12645;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f12646;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final SecretExchangeType f12647;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f12648;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f12649;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final short f12650;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final CipherType f12651;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final SignatureAlgorithm f12652;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f12653;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f12654;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f12655;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final HashAlgorithm f12656;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f12657;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String f12658;

    public C4868(short s, String str, String str2, SecretExchangeType secretExchangeType, String str3, int i, int i2, int i3, int i4, String str4, int i5, HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm, CipherType cipherType) {
        secretExchangeType.getClass();
        hashAlgorithm.getClass();
        signatureAlgorithm.getClass();
        cipherType.getClass();
        this.f12650 = s;
        this.f12649 = str;
        this.f12648 = str2;
        this.f12647 = secretExchangeType;
        this.f12646 = str3;
        this.f12645 = i;
        this.f12654 = i2;
        this.f12653 = i3;
        this.f12657 = i4;
        this.f12658 = str4;
        this.f12655 = i5;
        this.f12656 = hashAlgorithm;
        this.f12652 = signatureAlgorithm;
        this.f12651 = cipherType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4868)) {
            return false;
        }
        C4868 c4868 = (C4868) obj;
        return this.f12650 == c4868.f12650 && AbstractC5227.m9466(this.f12649, c4868.f12649) && AbstractC5227.m9466(this.f12648, c4868.f12648) && this.f12647 == c4868.f12647 && AbstractC5227.m9466(this.f12646, c4868.f12646) && this.f12645 == c4868.f12645 && this.f12654 == c4868.f12654 && this.f12653 == c4868.f12653 && this.f12657 == c4868.f12657 && AbstractC5227.m9466(this.f12658, c4868.f12658) && this.f12655 == c4868.f12655 && this.f12656 == c4868.f12656 && this.f12652 == c4868.f12652 && this.f12651 == c4868.f12651;
    }

    public final int hashCode() {
        return this.f12651.hashCode() + ((this.f12652.hashCode() + ((this.f12656.hashCode() + AbstractC0900.m704(this.f12655, AbstractC7012.m12131(AbstractC0900.m704(this.f12657, AbstractC0900.m704(this.f12653, AbstractC0900.m704(this.f12654, AbstractC0900.m704(this.f12645, AbstractC7012.m12131((this.f12647.hashCode() + AbstractC7012.m12131(AbstractC7012.m12131(Short.hashCode(this.f12650) * 31, 31, this.f12649), 31, this.f12648)) * 31, 31, this.f12646), 31), 31), 31), 31), 31, this.f12658), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CipherSuite(code=" + ((int) this.f12650) + ", name=" + this.f12649 + ", openSSLName=" + this.f12648 + ", exchangeType=" + this.f12647 + ", jdkCipherName=" + this.f12646 + ", keyStrength=" + this.f12645 + ", fixedIvLength=" + this.f12654 + ", ivLength=" + this.f12653 + ", cipherTagSizeInBytes=" + this.f12657 + ", macName=" + this.f12658 + ", macStrength=" + this.f12655 + ", hash=" + this.f12656 + ", signatureAlgorithm=" + this.f12652 + ", cipherType=" + this.f12651 + ')';
    }

    public /* synthetic */ C4868(short s, String str, String str2, SecretExchangeType secretExchangeType, int i, HashAlgorithm hashAlgorithm, SignatureAlgorithm signatureAlgorithm) {
        this(s, str, str2, secretExchangeType, "AES/GCM/NoPadding", i, 4, 12, 16, "AEAD", 0, hashAlgorithm, signatureAlgorithm, CipherType.GCM);
    }
}
