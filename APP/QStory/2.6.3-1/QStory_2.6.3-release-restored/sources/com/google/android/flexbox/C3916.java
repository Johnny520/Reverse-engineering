package com.google.android.flexbox;

import androidx.activity.AbstractC0900;
import androidx.recyclerview.widget.AbstractC3290;

/* JADX INFO: renamed from: com.google.android.flexbox.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3916 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f10267;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f10268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f10269 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f10270;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f10271;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f10272;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ FlexboxLayoutManager f10273;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean f10274;

    public C3916(FlexboxLayoutManager flexboxLayoutManager) {
        this.f10273 = flexboxLayoutManager;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m7545(C3916 c3916) {
        c3916.f10272 = -1;
        c3916.f10271 = -1;
        c3916.f10270 = Integer.MIN_VALUE;
        c3916.f10267 = false;
        c3916.f10274 = false;
        FlexboxLayoutManager flexboxLayoutManager = c3916.f10273;
        boolean zMo7498 = flexboxLayoutManager.mo7498();
        int i = flexboxLayoutManager.f10221;
        if (zMo7498) {
            if (i == 0) {
                c3916.f10268 = flexboxLayoutManager.f10222 == 1;
                return;
            } else {
                c3916.f10268 = i == 2;
                return;
            }
        }
        if (i == 0) {
            c3916.f10268 = flexboxLayoutManager.f10222 == 3;
        } else {
            c3916.f10268 = i == 2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7546(C3916 c3916) {
        FlexboxLayoutManager flexboxLayoutManager = c3916.f10273;
        if (!flexboxLayoutManager.mo7498() && flexboxLayoutManager.f10218) {
            c3916.f10270 = c3916.f10268 ? flexboxLayoutManager.f10208.mo5404() : flexboxLayoutManager.f7926 - flexboxLayoutManager.f10208.mo5405();
            return;
        }
        boolean z = c3916.f10268;
        AbstractC3290 abstractC3290 = flexboxLayoutManager.f10208;
        c3916.f10270 = z ? abstractC3290.mo5404() : abstractC3290.mo5405();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.f10272);
        sb.append(", mFlexLinePosition=");
        sb.append(this.f10271);
        sb.append(", mCoordinate=");
        sb.append(this.f10270);
        sb.append(", mPerpendicularCoordinate=");
        sb.append(this.f10269);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.f10268);
        sb.append(", mValid=");
        sb.append(this.f10267);
        sb.append(", mAssignedFromSavedState=");
        return AbstractC0900.m712(sb, this.f10274, '}');
    }
}
