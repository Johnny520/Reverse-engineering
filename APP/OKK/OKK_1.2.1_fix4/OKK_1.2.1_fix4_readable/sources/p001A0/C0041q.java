package p001A0;

import android.text.Editable;
import p081s0.AbstractC1076j;

/* JADX INFO: renamed from: A0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0041q extends AbstractC1076j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0045u f108a;

    public C0041q(C0045u c0045u) {
        this.f108a = c0045u;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f108a.m141b().mo57a();
    }

    @Override // p081s0.AbstractC1076j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.f108a.m141b().mo154b();
    }
}
