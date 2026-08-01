package p106;

import android.view.KeyEvent;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7310 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final KeyEvent f19453;

    public final boolean equals(Object obj) {
        if (obj instanceof C7310) {
            return AbstractC4395.m8907(this.f19453, ((C7310) obj).f19453);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19453.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f19453 + ')';
    }
}
