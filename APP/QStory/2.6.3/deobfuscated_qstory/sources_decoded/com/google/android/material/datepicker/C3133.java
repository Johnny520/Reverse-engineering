package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3133<S> extends AbstractC3113 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public DateSelector f10322;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public int f10323;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public CalendarConstraints f10324;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo4451(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f10323);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f10322);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10324);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo4454(Bundle bundle) {
        super.mo4454(bundle);
        if (bundle == null) {
            bundle = this.f6905;
        }
        this.f10323 = bundle.getInt("THEME_RES_ID_KEY");
        this.f10322 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f10324 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo4455(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f10322.mo7094(layoutInflater.cloneInContext(new ContextThemeWrapper(m4441(), this.f10323)), viewGroup, this.f10324, new C3135(1, this));
    }
}
