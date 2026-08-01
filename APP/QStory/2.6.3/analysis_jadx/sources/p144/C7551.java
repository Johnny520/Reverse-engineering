package p144;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7551 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f20439;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f20440;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f20441;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f20442;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f20443;

    public C7551(int i, float f, float f2, float f3, long j) {
        this.f20443 = i;
        this.f20442 = f;
        this.f20441 = f2;
        this.f20440 = f3;
        this.f20439 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7551.class == obj.getClass()) {
            C7551 c7551 = (C7551) obj;
            return this.f20441 == c7551.f20441 && this.f20440 == c7551.f20440 && this.f20442 == c7551.f20442 && this.f20443 == c7551.f20443 && this.f20439 == c7551.f20439;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20439) + AbstractC0053.m144(this.f20443, AbstractC0053.m145(AbstractC0053.m145(Float.hashCode(this.f20441) * 31, this.f20440, 31), this.f20442, 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f20441 + ", touchY=" + this.f20440 + ", progress=" + this.f20442 + ", swipeEdge=" + this.f20443 + ", frameTimeMillis=" + this.f20439 + ')';
    }
}
