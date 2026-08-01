package defpackage;

import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class bj extends q60 {
    public final /* synthetic */ ej a;

    public bj(ej r1) {
        this.a = r1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r1) {
        this.a.b().a();
    }

    @Override // defpackage.q60, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        this.a.b().b();
    }
}
