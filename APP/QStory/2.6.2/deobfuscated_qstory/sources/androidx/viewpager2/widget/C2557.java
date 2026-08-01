package androidx.viewpager2.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.C2525;
import androidx.recyclerview.widget.C2531;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p124.C7412;
import p155.C7606;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2557 extends LinearLayoutManager {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final /* synthetic */ C2549 f7698;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2557(C2549 c2549) {
        super(1);
        this.f7698 = c2549;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public final void mo4646(C2525 c2525, int[] iArr) {
        C2549 c2549 = this.f7698;
        int offscreenPageLimit = c2549.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.mo4646(c2525, iArr);
            return;
        }
        int pageSize = c2549.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰 */
    public final boolean mo4992(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final boolean mo4998(C2531 c2531, C2525 c2525, int i, Bundle bundle) {
        this.f7698.f7677.getClass();
        return super.mo4998(c2531, c2525, i, bundle);
    }

    @Override // androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo4615(C2531 c2531, C2525 c2525, View view, C7606 c7606) {
        int iM4973;
        int iM49732;
        C2549 c2549 = (C2549) this.f7698.f7677.f1093;
        if (c2549.getOrientation() == 1) {
            c2549.f7687.getClass();
            iM4973 = AbstractC2519.m4973(view);
        } else {
            iM4973 = 0;
        }
        if (c2549.getOrientation() == 0) {
            c2549.f7687.getClass();
            iM49732 = AbstractC2519.m4973(view);
        } else {
            iM49732 = 0;
        }
        c7606.m12812(C7412.m12615(false, iM4973, 1, iM49732, 1));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo4618(C2531 c2531, C2525 c2525, C7606 c7606) {
        super.mo4618(c2531, c2525, c7606);
        this.f7698.f7677.getClass();
    }
}
