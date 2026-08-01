package kotlin.reflect.jvm.internal.impl.protobuf;

import com.android.dx.io.Opcodes;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4727 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f13805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f13806;

    public C4727(Object obj, int i) {
        this.f13806 = obj;
        this.f13805 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4727)) {
            return false;
        }
        C4727 c4727 = (C4727) obj;
        return this.f13806 == c4727.f13806 && this.f13805 == c4727.f13805;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f13806) * Opcodes.MAX_VALUE) + this.f13805;
    }
}
