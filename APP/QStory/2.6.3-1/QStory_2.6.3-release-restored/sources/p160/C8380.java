package p160;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f20784;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f20785;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f20786;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f20787;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f20788;

    public C8380(int i, float f, float f2, float f3, long j) {
        this.f20788 = i;
        this.f20787 = f;
        this.f20786 = f2;
        this.f20785 = f3;
        this.f20784 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8380.class == obj.getClass()) {
            C8380 c8380 = (C8380) obj;
            return this.f20786 == c8380.f20786 && this.f20785 == c8380.f20785 && this.f20787 == c8380.f20787 && this.f20788 == c8380.f20788 && this.f20784 == c8380.f20784;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20784) + AbstractC0900.m704(this.f20788, AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(this.f20786) * 31, this.f20785, 31), this.f20787, 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.f20786 + ", touchY=" + this.f20785 + ", progress=" + this.f20787 + ", swipeEdge=" + this.f20788 + ", frameTimeMillis=" + this.f20784 + ')';
    }
}
