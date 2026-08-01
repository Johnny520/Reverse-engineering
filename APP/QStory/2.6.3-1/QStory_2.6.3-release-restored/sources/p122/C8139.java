package p122;

import android.view.KeyEvent;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8139 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final KeyEvent f19798;

    public final boolean equals(Object obj) {
        if (obj instanceof C8139) {
            return AbstractC5227.m9466(this.f19798, ((C8139) obj).f19798);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19798.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f19798 + ')';
    }
}
