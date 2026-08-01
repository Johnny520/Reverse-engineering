package androidx.recyclerview.widget;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3358 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f7953;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7956;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f7958;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f7959;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public long f7960;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f7961;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f7962;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f7963;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f7964;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f7965;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f7966;

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=");
        sb.append(this.f7958);
        sb.append(", mData=null, mItemCount=");
        sb.append(this.f7954);
        sb.append(", mIsMeasuring=");
        sb.append(this.f7965);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.f7957);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.f7956);
        sb.append(", mStructureChanged=");
        sb.append(this.f7953);
        sb.append(", mInPreLayout=");
        sb.append(this.f7962);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.f7966);
        sb.append(", mRunPredictiveAnimations=");
        return AbstractC0900.m712(sb, this.f7963, '}');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m5585() {
        return this.f7962 ? this.f7957 - this.f7956 : this.f7954;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5586(int i) {
        if ((this.f7955 & i) != 0) {
            return;
        }
        C1123.m1407("Layout state should be one of ", Integer.toBinaryString(i), " but it is ", Integer.toBinaryString(this.f7955));
    }
}
