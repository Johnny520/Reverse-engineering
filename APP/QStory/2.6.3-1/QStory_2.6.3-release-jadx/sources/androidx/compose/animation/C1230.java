package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC1157;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1230 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1157 f1640;

    public C1230(InterfaceC1157 interfaceC1157) {
        this.f1640 = interfaceC1157;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1230) {
            return Float.compare(0.0f, 0.0f) == 0 && AbstractC5227.m9466(this.f1640, ((C1230) obj).f1640);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1640.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f1640 + ')';
    }
}
