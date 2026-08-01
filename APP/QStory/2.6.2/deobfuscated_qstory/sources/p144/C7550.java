package p144;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7550 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f20444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f20445;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f20446;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f20447;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f20448;

    public C7550(int i, float f, float f2, float f3, long j) {
        this.f20448 = i;
        this.f20447 = f;
        this.f20446 = f2;
        this.f20445 = f3;
        this.f20444 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7550.class == obj.getClass()) {
            C7550 c7550 = (C7550) obj;
            return this.f20446 == c7550.f20446 && this.f20445 == c7550.f20445 && this.f20447 == c7550.f20447 && this.f20448 == c7550.f20448 && this.f20444 == c7550.f20444;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20444) + AbstractC0053.m143(this.f20448, AbstractC0053.m144(AbstractC0053.m144(Float.hashCode(this.f20446) * 31, this.f20445, 31), this.f20447, 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f20446 + ", touchY=" + this.f20445 + ", progress=" + this.f20447 + ", swipeEdge=" + this.f20448 + ", frameTimeMillis=" + this.f20444 + ')';
    }
}
