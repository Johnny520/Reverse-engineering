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

    public C1064Yq() {
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: n */
    public final void mo900n(Bundle r2) {
        super.mo900n(r2);
        if (r2 != null) goto L5;
        r2 = this.f5315f;
    L5:
        this.f3373U = r2.getInt("THEME_RES_ID_KEY");
        if (r2.getParcelable("DATE_SELECTOR_KEY") != null) goto L10;
        this.f3374V = (C0136D6) r2.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        return;
    L10:
        throw new ClassCastException();
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: o */
    public final View mo1043o(LayoutInflater r3, ViewGroup r4) {
        r3.cloneInContext(new ContextThemeWrapper(m2870d(), this.f3373U));
        throw null;
    }

    @Override // p000.AbstractComponentCallbacksC1503hi
    /* JADX INFO: renamed from: t */
    public final void mo904t(Bundle r3) {
        r3.putInt("THEME_RES_ID_KEY", this.f3373U);
        r3.putParcelable("DATE_SELECTOR_KEY", null);
        r3.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3374V);
    }
}
