package androidx.recyclerview.widget;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2525 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f7607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f7608;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f7609;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7610;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f7611;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f7612;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f7613;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public long f7614;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f7615;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f7616;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f7617;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f7618;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f7619;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f7620;

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=");
        sb.append(this.f7612);
        sb.append(", mData=null, mItemCount=");
        sb.append(this.f7608);
        sb.append(", mIsMeasuring=");
        sb.append(this.f7619);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.f7611);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.f7610);
        sb.append(", mStructureChanged=");
        sb.append(this.f7607);
        sb.append(", mInPreLayout=");
        sb.append(this.f7616);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.f7620);
        sb.append(", mRunPredictiveAnimations=");
        return AbstractC0053.m150(sb, this.f7617, '}');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m5015() {
        return this.f7616 ? this.f7611 - this.f7610 : this.f7608;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5016(int i) {
        if ((this.f7609 & i) != 0) {
            return;
        }
        C0276.m846("Layout state should be one of ", Integer.toBinaryString(i), " but it is ", Integer.toBinaryString(this.f7609));
    }
}
