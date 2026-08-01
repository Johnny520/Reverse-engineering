package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3122 extends AbstractC3142 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ SingleDateSelector f10303;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f10304;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ C3134 f10305;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3122(SingleDateSelector singleDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, C3134 c3134, TextInputLayout textInputLayout2) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f10303 = singleDateSelector;
        this.f10305 = c3134;
        this.f10304 = textInputLayout2;
    }

    @Override // com.google.android.material.datepicker.AbstractC3142
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo7149(Long l) {
        SingleDateSelector singleDateSelector = this.f10303;
        if (l == null) {
            singleDateSelector.f10274 = null;
        } else {
            singleDateSelector.f10274 = l;
        }
        this.f10305.m7152(singleDateSelector.f10274);
    }

    @Override // com.google.android.material.datepicker.AbstractC3142
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7150() {
        this.f10304.getError();
        this.f10305.m7153();
    }
}
