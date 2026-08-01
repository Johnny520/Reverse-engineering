package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class fu<S> extends px {
    public int S;
    public c8 T;

    public fu() {
    }

    @Override // defpackage.ml
    public final void m(Bundle r2) {
        super.m(r2);
        if (r2 != null) goto L5;
        r2 = this.f;
    L5:
        this.S = r2.getInt("THEME_RES_ID_KEY");
        if (r2.getParcelable("DATE_SELECTOR_KEY") != null) goto L10;
        this.T = (c8) r2.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        return;
    L10:
        throw new ClassCastException();
    }

    @Override // defpackage.ml
    public final View n(LayoutInflater r3, ViewGroup r4) {
        r3.cloneInContext(new ContextThemeWrapper(h(), this.S));
        throw null;
    }

    @Override // defpackage.ml
    public final void r(Bundle r3) {
        r3.putInt("THEME_RES_ID_KEY", this.S);
        r3.putParcelable("DATE_SELECTOR_KEY", null);
        r3.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.T);
    }
}
