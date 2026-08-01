package p106;

import android.view.KeyEvent;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7309 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final KeyEvent f19458;

    public final boolean equals(Object obj) {
        if (obj instanceof C7309) {
            return AbstractC4394.m8917(this.f19458, ((C7309) obj).f19458);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19458.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f19458 + ')';
    }
}
