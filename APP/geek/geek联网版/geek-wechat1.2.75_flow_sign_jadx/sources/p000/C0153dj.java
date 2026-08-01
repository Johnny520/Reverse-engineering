package p000;

import android.text.Editable;

/* JADX INFO: renamed from: dj */
/* JADX INFO: loaded from: classes.dex */
public final class C0153dj extends w60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0263gj f1395a;

    public C0153dj(C0263gj c0263gj) {
        this.f1395a = c0263gj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f1395a.m1284b().mo598a();
    }

    @Override // p000.w60, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f1395a.m1284b().mo1396b();
    }
}
