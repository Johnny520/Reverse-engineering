package p001A0;

import android.text.Editable;
import p081s0.AbstractC1076j;

/* JADX INFO: renamed from: A0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0041q extends AbstractC1076j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0045u f108a;

    public C0041q(C0045u r1) {
        this.f108a = r1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r1) {
        this.f108a.m141b().mo57a();
    }

    @Override // p081s0.AbstractC1076j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        this.f108a.m141b().mo154b();
    }
}
