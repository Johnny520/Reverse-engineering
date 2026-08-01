package com.google.android.flexbox;

import androidx.activity.AbstractC0053;
import androidx.recyclerview.widget.AbstractC2457;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f9917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f9918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f9919 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f9920;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f9921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f9922;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ FlexboxLayoutManager f9923;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f9924;

    public C3083(FlexboxLayoutManager flexboxLayoutManager) {
        this.f9923 = flexboxLayoutManager;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m6999(C3083 c3083) {
        c3083.f9922 = -1;
        c3083.f9921 = -1;
        c3083.f9920 = Integer.MIN_VALUE;
        c3083.f9917 = false;
        c3083.f9924 = false;
        FlexboxLayoutManager flexboxLayoutManager = c3083.f9923;
        boolean zMo6952 = flexboxLayoutManager.mo6952();
        int i = flexboxLayoutManager.f9871;
        if (zMo6952) {
            if (i == 0) {
                c3083.f9918 = flexboxLayoutManager.f9872 == 1;
                return;
            } else {
                c3083.f9918 = i == 2;
                return;
            }
        }
        if (i == 0) {
            c3083.f9918 = flexboxLayoutManager.f9872 == 3;
        } else {
            c3083.f9918 = i == 2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7000(C3083 c3083) {
        FlexboxLayoutManager flexboxLayoutManager = c3083.f9923;
        if (!flexboxLayoutManager.mo6952() && flexboxLayoutManager.f9868) {
            c3083.f9920 = c3083.f9918 ? flexboxLayoutManager.f9858.mo4834() : flexboxLayoutManager.f7580 - flexboxLayoutManager.f9858.mo4835();
            return;
        }
        boolean z = c3083.f9918;
        AbstractC2457 abstractC2457 = flexboxLayoutManager.f9858;
        c3083.f9920 = z ? abstractC2457.mo4834() : abstractC2457.mo4835();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.f9922);
        sb.append(", mFlexLinePosition=");
        sb.append(this.f9921);
        sb.append(", mCoordinate=");
        sb.append(this.f9920);
        sb.append(", mPerpendicularCoordinate=");
        sb.append(this.f9919);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.f9918);
        sb.append(", mValid=");
        sb.append(this.f9917);
        sb.append(", mAssignedFromSavedState=");
        return AbstractC0053.m150(sb, this.f9924, '}');
    }
}
