package com.google.android.material.datepicker;

import androidx.recyclerview.widget.C3358;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.C3937;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3978 extends LinearLayoutManager {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10725;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final /* synthetic */ int f10726;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3978(MaterialCalendar materialCalendar, int i, int i2) {
        super(i);
        this.f10725 = materialCalendar;
        this.f10726 = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public final void mo5216(C3358 c3358, int[] iArr) {
        MaterialCalendar materialCalendar = this.f10725;
        RecyclerView recyclerView = materialCalendar.f10602;
        if (this.f10726 == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = materialCalendar.f10602.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = materialCalendar.f10602.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC3352
    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪 */
    public final void mo5227(RecyclerView recyclerView, int i) {
        C3937 c3937 = new C3937(recyclerView.getContext());
        c3937.f7662 = i;
        m5565(c3937);
    }
}
