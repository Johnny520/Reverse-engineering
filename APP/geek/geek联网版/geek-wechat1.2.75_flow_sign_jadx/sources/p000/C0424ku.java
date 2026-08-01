package p000;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ku */
/* JADX INFO: loaded from: classes.dex */
public final class C0424ku<S> extends AbstractC0909xx {

    /* JADX INFO: renamed from: S */
    public int f2872S;

    /* JADX INFO: renamed from: T */
    public C0476m8 f2873T;

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: m */
    public final void mo1023m(Bundle bundle) {
        super.mo1023m(bundle);
        if (bundle == null) {
            bundle = this.f3491f;
        }
        this.f2872S = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2873T = (C0476m8) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: n */
    public final View mo1024n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m2037h(), this.f2872S));
        throw null;
    }

    @Override // p000.AbstractComponentCallbacksC0563ol
    /* JADX INFO: renamed from: r */
    public final void mo1025r(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2872S);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2873T);
    }
}
