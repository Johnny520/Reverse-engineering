package kotlin.reflect.jvm.internal.impl.protobuf;

import com.android.p002dx.p005io.Opcodes;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5559 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f14150;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f14151;

    public C5559(Object obj, int i) {
        this.f14151 = obj;
        this.f14150 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5559)) {
            return false;
        }
        C5559 c5559 = (C5559) obj;
        return this.f14151 == c5559.f14151 && this.f14150 == c5559.f14150;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f14151) * Opcodes.MAX_VALUE) + this.f14150;
    }
}
