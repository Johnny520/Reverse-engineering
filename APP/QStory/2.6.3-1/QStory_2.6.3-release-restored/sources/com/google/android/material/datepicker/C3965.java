package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3965<S> extends AbstractC3945 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public DateSelector f10667;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public int f10668;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public CalendarConstraints f10669;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo5011(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f10668);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f10667);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10669);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo5014(Bundle bundle) {
        super.mo5014(bundle);
        if (bundle == null) {
            bundle = this.f7250;
        }
        this.f10668 = bundle.getInt("THEME_RES_ID_KEY");
        this.f10667 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f10669 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC3171
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo5015(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f10667.mo7653(layoutInflater.cloneInContext(new ContextThemeWrapper(m5001(), this.f10668)), viewGroup, this.f10669, new C3967(1, this));
    }
}
