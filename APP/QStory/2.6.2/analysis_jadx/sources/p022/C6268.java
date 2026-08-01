package p022;

import kotlin.jvm.internal.AbstractC4394;
import okio.ByteString;
import p005.C6123;

/* JADX INFO: renamed from: 飘花落叶言世兰苏楪子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6268 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final ByteString f17263;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ByteString f17264;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ByteString f17265;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final ByteString f17266;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final ByteString f17267;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final ByteString f17268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17269;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteString f17270;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ByteString f17271;

    static {
        ByteString.Companion.getClass();
        f17265 = C6123.m11517(":");
        f17264 = C6123.m11517(":status");
        f17263 = C6123.m11517(":method");
        f17267 = C6123.m11517(":path");
        f17266 = C6123.m11517(":scheme");
        f17268 = C6123.m11517(":authority");
    }

    public C6268(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        this.f17271 = byteString;
        this.f17270 = byteString2;
        this.f17269 = byteString2.size() + byteString.size() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6268)) {
            return false;
        }
        C6268 c6268 = (C6268) obj;
        return AbstractC4394.m8917(this.f17271, c6268.f17271) && AbstractC4394.m8917(this.f17270, c6268.f17270);
    }

    public final int hashCode() {
        return this.f17270.hashCode() + (this.f17271.hashCode() * 31);
    }

    public final String toString() {
        return this.f17271.utf8() + ": " + this.f17270.utf8();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6268(String str, String str2) {
        this(C6123.m11517(str), C6123.m11517(str2));
        ByteString.Companion.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6268(String str, ByteString byteString) {
        this(byteString, C6123.m11517(str));
        byteString.getClass();
        str.getClass();
        ByteString.Companion.getClass();
    }
}
