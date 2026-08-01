package com.google.android.material.datepicker;

import androidx.recyclerview.widget.C2525;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.C3104;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3145 extends LinearLayoutManager {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10375;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final /* synthetic */ int f10376;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3145(MaterialCalendar materialCalendar, int i, int i2) {
        super(i);
        this.f10375 = materialCalendar;
        this.f10376 = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public final void mo4646(C2525 c2525, int[] iArr) {
        MaterialCalendar materialCalendar = this.f10375;
        RecyclerView recyclerView = materialCalendar.f10252;
        if (this.f10376 == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = materialCalendar.f10252.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = materialCalendar.f10252.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪 */
    public final void mo4657(RecyclerView recyclerView, int i) {
        C3104 c3104 = new C3104(recyclerView.getContext());
        c3104.f7316 = i;
        m4995(c3104);
    }
}
