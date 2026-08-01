package androidx.compose.animation;

import androidx.compose.animation.core.InterfaceC0311;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0384 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0311 f1295;

    public C0384(InterfaceC0311 interfaceC0311) {
        this.f1295 = interfaceC0311;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0384) {
            return Float.compare(0.0f, 0.0f) == 0 && AbstractC4395.m8907(this.f1295, ((C0384) obj).f1295);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1295.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f1295 + ')';
    }
}
