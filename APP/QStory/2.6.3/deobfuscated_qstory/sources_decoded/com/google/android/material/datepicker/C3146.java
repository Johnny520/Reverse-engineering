package com.google.android.material.datepicker;

import androidx.recyclerview.widget.C2525;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.C3105;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3146 extends LinearLayoutManager {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10380;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final /* synthetic */ int f10381;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3146(MaterialCalendar materialCalendar, int i, int i2) {
        super(i);
        this.f10380 = materialCalendar;
        this.f10381 = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public final void mo4656(C2525 c2525, int[] iArr) {
        MaterialCalendar materialCalendar = this.f10380;
        RecyclerView recyclerView = materialCalendar.f10257;
        if (this.f10381 == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = materialCalendar.f10257.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = materialCalendar.f10257.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC2519
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪 */
    public final void mo4667(RecyclerView recyclerView, int i) {
        C3105 c3105 = new C3105(recyclerView.getContext());
        c3105.f7317 = i;
        m5005(c3105);
    }
}
