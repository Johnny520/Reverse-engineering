package p000;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: Yq */
/* JADX INFO: loaded from: classes.dex */
public final class C1064Yq<S> extends AbstractC0595Nt {

    /* JADX INFO: renamed from: U */
    public int f3373U;

    /* JADX INFO: renamed from: V */
    public C0136D6 f3374V;

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: n */
    public final void mo900n(Bundle bundle) {
        super.mo900n(bundle);
        if (bundle == null) {
            bundle = this.f5315f;
        }
        this.f3373U = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3374V = (C0136D6) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: o */
    public final View mo1043o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m2870d(), this.f3373U));
        throw null;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: t */
    public final void mo904t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3373U);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3374V);
    }
}
