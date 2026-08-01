package p000;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: fu */
/* JADX INFO: loaded from: classes.dex */
public final class C0237fu<S> extends AbstractC0613px {

    /* JADX INFO: renamed from: S */
    public int f1994S;

    /* JADX INFO: renamed from: T */
    public C0095c8 f1995T;

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: m */
    public final void mo574m(Bundle bundle) {
        super.mo574m(bundle);
        if (bundle == null) {
            bundle = this.f3246f;
        }
        this.f1994S = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f1995T = (C0095c8) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: n */
    public final View mo575n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m1835h(), this.f1994S));
        throw null;
    }

    @Override // p000.AbstractComponentCallbacksC0489ml
    /* JADX INFO: renamed from: r */
    public final void mo576r(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f1994S);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1995T);
    }
}
