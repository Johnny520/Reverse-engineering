package p000;

import android.text.Editable;

/* JADX INFO: renamed from: Xf */
/* JADX INFO: loaded from: classes.dex */
public final class C1010Xf extends AbstractC0011AA {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1141ag f3215a;

    public C1010Xf(C1141ag c1141ag) {
        this.f3215a = c1141ag;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f3215a.m2059b().mo946a();
    }

    @Override // p000.AbstractC0011AA, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f3215a.m2059b().mo992b();
    }
}
