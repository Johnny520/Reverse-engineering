package androidx.viewpager2.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.C2525;
import androidx.recyclerview.widget.C2531;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p124.C7413;
import p155.C7607;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2557 extends LinearLayoutManager {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final /* synthetic */ C2549 f7699;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2557(C2549 c2549) {
        super(1);
        this.f7699 = c2549;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public final void mo4656(C2525 c2525, int[] iArr) {
        C2549 c2549 = this.f7699;
        int offscreenPageLimit = c2549.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.mo4656(c2525, iArr);
            return;
        }
        int pageSize = c2549.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final boolean mo5002(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final boolean mo5008(C2531 c2531, C2525 c2525, int i, Bundle bundle) {
        this.f7699.f7678.getClass();
        return super.mo5008(c2531, c2525, i, bundle);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo4625(C2531 c2531, C2525 c2525, View view, C7607 c7607) {
        int iM4983;
        int iM49832;
        C2549 c2549 = (C2549) this.f7699.f7678.f1093;
        if (c2549.getOrientation() == 1) {
            c2549.f7688.getClass();
            iM4983 = AbstractC2519.m4983(view);
        } else {
            iM4983 = 0;
        }
        if (c2549.getOrientation() == 0) {
            c2549.f7688.getClass();
            iM49832 = AbstractC2519.m4983(view);
        } else {
            iM49832 = 0;
        }
        c7607.m12841(C7413.m12642(false, iM4983, 1, iM49832, 1));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo4628(C2531 c2531, C2525 c2525, C7607 c7607) {
        super.mo4628(c2531, c2525, c7607);
        this.f7699.f7678.getClass();
    }
}
