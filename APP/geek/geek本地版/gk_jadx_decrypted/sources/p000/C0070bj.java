package p000;

import android.text.Editable;

/* JADX INFO: renamed from: bj */
/* JADX INFO: loaded from: classes.dex */
public final class C0070bj extends q60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0189ej f812a;

    public C0070bj(C0189ej c0189ej) {
        this.f812a = c0189ej;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f812a.m1036b().mo1213a();
    }

    @Override // p000.q60, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f812a.m1036b().mo1214b();
    }
}
