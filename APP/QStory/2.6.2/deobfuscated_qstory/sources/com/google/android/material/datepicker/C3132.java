package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3132<S> extends AbstractC3112 {

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public DateSelector f10317;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public int f10318;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public CalendarConstraints f10319;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo4441(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f10318);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f10317);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f10319);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo4444(Bundle bundle) {
        super.mo4444(bundle);
        if (bundle == null) {
            bundle = this.f6904;
        }
        this.f10318 = bundle.getInt("THEME_RES_ID_KEY");
        this.f10317 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f10319 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2338
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final View mo4445(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f10317.mo7107(layoutInflater.cloneInContext(new ContextThemeWrapper(m4431(), this.f10318)), viewGroup, this.f10319, new C3134(1, this));
    }
}
