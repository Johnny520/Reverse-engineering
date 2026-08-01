package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3956 extends AbstractC3975 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ RangeDateSelector f10656;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C3967 f10657;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f10658;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f10659;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ int f10660;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3956(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C3967 c3967, int i) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f10660 = i;
        this.f10656 = rangeDateSelector;
        this.f10659 = textInputLayout2;
        this.f10658 = textInputLayout3;
        this.f10657 = c3967;
    }

    @Override // com.google.android.material.datepicker.AbstractC3975
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo7695(Long l) {
        int i = this.f10660;
        C3967 c3967 = this.f10657;
        TextInputLayout textInputLayout = this.f10658;
        TextInputLayout textInputLayout2 = this.f10659;
        RangeDateSelector rangeDateSelector = this.f10656;
        switch (i) {
            case 0:
                rangeDateSelector.f10620 = l;
                RangeDateSelector.m7677(rangeDateSelector, textInputLayout2, textInputLayout, c3967);
                break;
            default:
                rangeDateSelector.f10619 = l;
                RangeDateSelector.m7677(rangeDateSelector, textInputLayout2, textInputLayout, c3967);
                break;
        }
    }

    @Override // com.google.android.material.datepicker.AbstractC3975
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7696() {
        int i = this.f10660;
        C3967 c3967 = this.f10657;
        TextInputLayout textInputLayout = this.f10658;
        TextInputLayout textInputLayout2 = this.f10659;
        RangeDateSelector rangeDateSelector = this.f10656;
        switch (i) {
            case 0:
                rangeDateSelector.f10620 = null;
                RangeDateSelector.m7677(rangeDateSelector, textInputLayout2, textInputLayout, c3967);
                break;
            default:
                rangeDateSelector.f10619 = null;
                RangeDateSelector.m7677(rangeDateSelector, textInputLayout2, textInputLayout, c3967);
                break;
        }
    }
}
