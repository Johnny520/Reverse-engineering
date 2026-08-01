package p019;

import kotlin.jvm.internal.AbstractC4395;
import okio.ByteString;
import p004.C6114;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6264 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final ByteString f17245;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final ByteString f17246;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ByteString f17247;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final ByteString f17248;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final ByteString f17249;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final ByteString f17250;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17251;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ByteString f17252;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ByteString f17253;

    static {
        ByteString.Companion.getClass();
        f17247 = C6114.m11510(":");
        f17246 = C6114.m11510(":status");
        f17245 = C6114.m11510(":method");
        f17249 = C6114.m11510(":path");
        f17248 = C6114.m11510(":scheme");
        f17250 = C6114.m11510(":authority");
    }

    public C6264(ByteString byteString, ByteString byteString2) {
        byteString.getClass();
        byteString2.getClass();
        this.f17253 = byteString;
        this.f17252 = byteString2;
        this.f17251 = byteString2.size() + byteString.size() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6264)) {
            return false;
        }
        C6264 c6264 = (C6264) obj;
        return AbstractC4395.m8907(this.f17253, c6264.f17253) && AbstractC4395.m8907(this.f17252, c6264.f17252);
    }

    public final int hashCode() {
        return this.f17252.hashCode() + (this.f17253.hashCode() * 31);
    }

    public final String toString() {
        return this.f17253.utf8() + ": " + this.f17252.utf8();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6264(String str, String str2) {
        this(C6114.m11510(str), C6114.m11510(str2));
        ByteString.Companion.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6264(String str, ByteString byteString) {
        this(byteString, C6114.m11510(str));
        byteString.getClass();
        str.getClass();
        ByteString.Companion.getClass();
    }
}
