package com.google.android.material.datepicker;

import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3123 extends AbstractC3142 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ RangeDateSelector f10306;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C3134 f10307;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f10308;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ TextInputLayout f10309;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ int f10310;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3123(RangeDateSelector rangeDateSelector, String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C3134 c3134, int i) {
        super(str, simpleDateFormat, textInputLayout, calendarConstraints);
        this.f10310 = i;
        this.f10306 = rangeDateSelector;
        this.f10309 = textInputLayout2;
        this.f10308 = textInputLayout3;
        this.f10307 = c3134;
    }

    @Override // com.google.android.material.datepicker.AbstractC3142
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo7149(Long l) {
        int i = this.f10310;
        C3134 c3134 = this.f10307;
        TextInputLayout textInputLayout = this.f10308;
        TextInputLayout textInputLayout2 = this.f10309;
        RangeDateSelector rangeDateSelector = this.f10306;
        switch (i) {
            case 0:
                rangeDateSelector.f10270 = l;
                RangeDateSelector.m7131(rangeDateSelector, textInputLayout2, textInputLayout, c3134);
                break;
            default:
                rangeDateSelector.f10269 = l;
                RangeDateSelector.m7131(rangeDateSelector, textInputLayout2, textInputLayout, c3134);
                break;
        }
    }

    @Override // com.google.android.material.datepicker.AbstractC3142
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7150() {
        int i = this.f10310;
        C3134 c3134 = this.f10307;
        TextInputLayout textInputLayout = this.f10308;
        TextInputLayout textInputLayout2 = this.f10309;
        RangeDateSelector rangeDateSelector = this.f10306;
        switch (i) {
            case 0:
                rangeDateSelector.f10270 = null;
                RangeDateSelector.m7131(rangeDateSelector, textInputLayout2, textInputLayout, c3134);
                break;
            default:
                rangeDateSelector.f10269 = null;
                RangeDateSelector.m7131(rangeDateSelector, textInputLayout2, textInputLayout, c3134);
                break;
        }
    }
}
