package androidx.compose.p001ui.input.pointer;

import androidx.activity.AbstractC0900;
import java.util.ArrayList;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2471 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f5125;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f5126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f5127;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f5128;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f5129;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f5130;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long f5131;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f5132;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f5133;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final float f5134;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final long f5135;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f5136;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long f5137;

    public C2471(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.f5130 = j;
        this.f5129 = j2;
        this.f5128 = j3;
        this.f5127 = j4;
        this.f5126 = z;
        this.f5125 = f;
        this.f5133 = i;
        this.f5132 = z2;
        this.f5136 = arrayList;
        this.f5137 = j5;
        this.f5134 = f2;
        this.f5135 = j6;
        this.f5131 = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2471)) {
            return false;
        }
        C2471 c2471 = (C2471) obj;
        return AbstractC2481.m3586(this.f5130, c2471.f5130) && this.f5129 == c2471.f5129 && C8158.m13087(this.f5128, c2471.f5128) && C8158.m13087(this.f5127, c2471.f5127) && this.f5126 == c2471.f5126 && Float.compare(this.f5125, c2471.f5125) == 0 && this.f5133 == c2471.f5133 && this.f5132 == c2471.f5132 && this.f5136.equals(c2471.f5136) && C8158.m13087(this.f5137, c2471.f5137) && Float.compare(this.f5134, c2471.f5134) == 0 && C8158.m13087(this.f5135, c2471.f5135) && C8158.m13087(this.f5131, c2471.f5131);
    }

    public final int hashCode() {
        return Long.hashCode(this.f5131) + AbstractC0900.m702(AbstractC0900.m705(AbstractC0900.m702((this.f5136.hashCode() + AbstractC0900.m701(AbstractC0900.m704(this.f5133, AbstractC0900.m705(AbstractC0900.m701(AbstractC0900.m702(AbstractC0900.m702(AbstractC0900.m702(Long.hashCode(this.f5130) * 31, 31, this.f5129), 31, this.f5128), 31, this.f5127), 31, this.f5126), this.f5125, 31), 31), 31, this.f5132)) * 31, 31, this.f5137), this.f5134, 31), 31, this.f5135);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) AbstractC2481.m3594(this.f5130)) + ", uptime=" + this.f5129 + ", positionOnScreen=" + ((Object) C8158.m13090(this.f5128)) + ", position=" + ((Object) C8158.m13090(this.f5127)) + ", down=" + this.f5126 + ", pressure=" + this.f5125 + ", type=" + ((Object) AbstractC2473.m3577(this.f5133)) + ", activeHover=" + this.f5132 + ", historical=" + this.f5136 + ", scrollDelta=" + ((Object) C8158.m13090(this.f5137)) + ", scaleGestureFactor=" + this.f5134 + ", panGestureOffset=" + ((Object) C8158.m13090(this.f5135)) + ", originalEventPosition=" + ((Object) C8158.m13090(this.f5131)) + ')';
    }
}
