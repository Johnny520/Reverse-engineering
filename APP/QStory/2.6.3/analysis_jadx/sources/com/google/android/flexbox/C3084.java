package com.google.android.flexbox;

import androidx.activity.AbstractC0053;
import androidx.recyclerview.widget.AbstractC2457;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3084 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f9922;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f9923;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f9924 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f9925;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f9926;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f9927;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ FlexboxLayoutManager f9928;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f9929;

    public C3084(FlexboxLayoutManager flexboxLayoutManager) {
        this.f9928 = flexboxLayoutManager;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m6986(C3084 c3084) {
        c3084.f9927 = -1;
        c3084.f9926 = -1;
        c3084.f9925 = Integer.MIN_VALUE;
        c3084.f9922 = false;
        c3084.f9929 = false;
        FlexboxLayoutManager flexboxLayoutManager = c3084.f9928;
        boolean zMo6939 = flexboxLayoutManager.mo6939();
        int i = flexboxLayoutManager.f9876;
        if (zMo6939) {
            if (i == 0) {
                c3084.f9923 = flexboxLayoutManager.f9877 == 1;
                return;
            } else {
                c3084.f9923 = i == 2;
                return;
            }
        }
        if (i == 0) {
            c3084.f9923 = flexboxLayoutManager.f9877 == 3;
        } else {
            c3084.f9923 = i == 2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m6987(C3084 c3084) {
        FlexboxLayoutManager flexboxLayoutManager = c3084.f9928;
        if (!flexboxLayoutManager.mo6939() && flexboxLayoutManager.f9873) {
            c3084.f9925 = c3084.f9923 ? flexboxLayoutManager.f9863.mo4844() : flexboxLayoutManager.f7581 - flexboxLayoutManager.f9863.mo4845();
            return;
        }
        boolean z = c3084.f9923;
        AbstractC2457 abstractC2457 = flexboxLayoutManager.f9863;
        c3084.f9925 = z ? abstractC2457.mo4844() : abstractC2457.mo4845();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.f9927);
        sb.append(", mFlexLinePosition=");
        sb.append(this.f9926);
        sb.append(", mCoordinate=");
        sb.append(this.f9925);
        sb.append(", mPerpendicularCoordinate=");
        sb.append(this.f9924);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.f9923);
        sb.append(", mValid=");
        sb.append(this.f9922);
        sb.append(", mAssignedFromSavedState=");
        return AbstractC0053.m152(sb, this.f9929, '}');
    }
}
