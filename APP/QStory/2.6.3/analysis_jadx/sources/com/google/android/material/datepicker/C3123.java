package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3123 extends AbstractC3143 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ SingleDateSelector f10308;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f10309;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ C3135 f10310;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3123(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, C3135 c3135, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f10308 = singleDateSelector;
        this.f10310 = c3135;
        this.f10309 = textInputLayout2;
    }

    @Override // com.google.android.material.datepicker.AbstractC3143
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo7136(Long l) {
        SingleDateSelector singleDateSelector = this.f10308;
        if (l == null) {
            singleDateSelector.f10279 = null;
        } else {
            singleDateSelector.f10279 = l;
        }
        this.f10310.m7139(singleDateSelector.f10279);
    }

    @Override // com.google.android.material.datepicker.AbstractC3143
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7137() {
        this.f10309.getError();
        this.f10310.m7140();
    }
}
