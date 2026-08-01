package p035;

import kotlin.jvm.internal.AbstractC5227;
import okio.ByteString;
import p020.C6943;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7093 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final ByteString f17590;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ByteString f17591;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ByteString f17592;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final ByteString f17593;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final ByteString f17594;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final ByteString f17595;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17596;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteString f17597;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ByteString f17598;

    static {
        ByteString.Companion.getClass();
        f17592 = C6943.m12069(":");
        f17591 = C6943.m12069(":status");
        f17590 = C6943.m12069(":method");
        f17594 = C6943.m12069(":path");
        f17593 = C6943.m12069(":scheme");
        f17595 = C6943.m12069(":authority");
    }

    public C7093(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        this.f17598 = byteString;
        this.f17597 = byteString2;
        this.f17596 = byteString2.size() + byteString.size() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7093)) {
            return false;
        }
        C7093 c7093 = (C7093) obj;
        return AbstractC5227.m9466(this.f17598, c7093.f17598) && AbstractC5227.m9466(this.f17597, c7093.f17597);
    }

    public final int hashCode() {
        return this.f17597.hashCode() + (this.f17598.hashCode() * 31);
    }

    public final String toString() {
        return this.f17598.utf8() + ": " + this.f17597.utf8();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7093(String str, String str2) {
        this(C6943.m12069(str), C6943.m12069(str2));
        ByteString.Companion.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7093(String str, ByteString byteString) {
        this(byteString, C6943.m12069(str));
        byteString.getClass();
        str.getClass();
        ByteString.Companion.getClass();
    }
}
