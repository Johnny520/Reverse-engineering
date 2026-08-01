package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3955 extends AbstractC3975 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ SingleDateSelector f10653;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f10654;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ C3967 f10655;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3955(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, C3967 c3967, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f10653 = singleDateSelector;
        this.f10655 = c3967;
        this.f10654 = textInputLayout2;
    }

    @Override // com.google.android.material.datepicker.AbstractC3975
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo7695(Long l) {
        SingleDateSelector singleDateSelector = this.f10653;
        if (l == null) {
            singleDateSelector.f10624 = null;
        } else {
            singleDateSelector.f10624 = l;
        }
        this.f10655.m7698(singleDateSelector.f10624);
    }

    @Override // com.google.android.material.datepicker.AbstractC3975
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7696() {
        this.f10654.getError();
        this.f10655.m7699();
    }
}
