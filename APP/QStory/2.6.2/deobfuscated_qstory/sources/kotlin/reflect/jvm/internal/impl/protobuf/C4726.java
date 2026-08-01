package kotlin.reflect.jvm.internal.impl.protobuf;

import com.android.dx.io.Opcodes;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4726 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f13801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f13802;

    public C4726(Object obj, int i) {
        this.f13802 = obj;
        this.f13801 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4726)) {
            return false;
        }
        C4726 c4726 = (C4726) obj;
        return this.f13802 == c4726.f13802 && this.f13801 == c4726.f13801;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f13802) * Opcodes.MAX_VALUE) + this.f13801;
    }
}
