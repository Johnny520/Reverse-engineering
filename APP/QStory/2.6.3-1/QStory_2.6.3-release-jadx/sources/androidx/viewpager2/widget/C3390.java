package androidx.viewpager2.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.AbstractC3352;
import androidx.recyclerview.widget.C3358;
import androidx.recyclerview.widget.C3364;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p140.C8242;
import p171.C8436;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3390 extends LinearLayoutManager {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final /* synthetic */ C3382 f8044;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3390(C3382 c3382) {
        super(1);
        this.f8044 = c3382;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public final void mo5216(C3358 c3358, int[] iArr) {
        C3382 c3382 = this.f8044;
        int offscreenPageLimit = c3382.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.mo5216(c3358, iArr);
            return;
        }
        int pageSize = c3382.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final boolean mo5562(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final boolean mo5568(C3364 c3364, C3358 c3358, int i, Bundle bundle) {
        this.f8044.f8023.getClass();
        return super.mo5568(c3364, c3358, i, bundle);
    }

    @Override // androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo5185(C3364 c3364, C3358 c3358, View view, C8436 c8436) {
        int iM5543;
        int iM55432;
        C3382 c3382 = (C3382) this.f8044.f8023.f1438;
        if (c3382.getOrientation() == 1) {
            c3382.f8033.getClass();
            iM5543 = AbstractC3352.m5543(view);
        } else {
            iM5543 = 0;
        }
        if (c3382.getOrientation() == 0) {
            c3382.f8033.getClass();
            iM55432 = AbstractC3352.m5543(view);
        } else {
            iM55432 = 0;
        }
        c8436.m13400(C8242.m13201(false, iM5543, 1, iM55432, 1));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo5188(C3364 c3364, C3358 c3358, C8436 c8436) {
        super.mo5188(c3364, c3358, c8436);
        this.f8044.f8023.getClass();
    }
}
