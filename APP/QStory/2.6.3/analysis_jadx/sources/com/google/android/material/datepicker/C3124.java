package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3124 extends AbstractC3143 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ RangeDateSelector f10311;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C3135 f10312;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f10313;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f10314;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ int f10315;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3124(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C3135 c3135, int i) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f10315 = i;
        this.f10311 = rangeDateSelector;
        this.f10314 = textInputLayout2;
        this.f10313 = textInputLayout3;
        this.f10312 = c3135;
    }

    @Override // com.google.android.material.datepicker.AbstractC3143
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo7136(Long l) {
        int i = this.f10315;
        C3135 c3135 = this.f10312;
        TextInputLayout textInputLayout = this.f10313;
        TextInputLayout textInputLayout2 = this.f10314;
        RangeDateSelector rangeDateSelector = this.f10311;
        switch (i) {
            case 0:
                rangeDateSelector.f10275 = l;
                RangeDateSelector.m7118(rangeDateSelector, textInputLayout2, textInputLayout, c3135);
                break;
            default:
                rangeDateSelector.f10274 = l;
                RangeDateSelector.m7118(rangeDateSelector, textInputLayout2, textInputLayout, c3135);
                break;
        }
    }

    @Override // com.google.android.material.datepicker.AbstractC3143
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7137() {
        int i = this.f10315;
        C3135 c3135 = this.f10312;
        TextInputLayout textInputLayout = this.f10313;
        TextInputLayout textInputLayout2 = this.f10314;
        RangeDateSelector rangeDateSelector = this.f10311;
        switch (i) {
            case 0:
                rangeDateSelector.f10275 = null;
                RangeDateSelector.m7118(rangeDateSelector, textInputLayout2, textInputLayout, c3135);
                break;
            default:
                rangeDateSelector.f10274 = null;
                RangeDateSelector.m7118(rangeDateSelector, textInputLayout2, textInputLayout, c3135);
                break;
        }
    }
}
