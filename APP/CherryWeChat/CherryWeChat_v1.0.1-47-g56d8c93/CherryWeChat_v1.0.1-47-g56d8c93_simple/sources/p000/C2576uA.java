package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: uA */
/* JADX INFO: loaded from: classes.dex */
public final class C2576uA implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public int f8926a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f8927b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextInputLayout f8928c;

    public C2576uA(TextInputLayout r1, EditText r2) {
        this.f8928c = r1;
        this.f8927b = r2;
        this.f8926a = r2.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r4) {
        TextInputLayout r0 = this.f8928c;
        r0.m2495w(!r0.f4594B0, false);
        if (r0.f4639l == false) goto L6;
        r0.m2488p(r4);
    L6:
        if (r0.f4655t == false) goto L8;
        r0.m2496x(r4);
    L8:
        EditText r42 = this.f8927b;
        int r1 = r42.getLineCount();
        int r2 = this.f8926a;
        if (r1 == r2) goto L16;
        if (r1 >= r2) goto L14;
        int r22 = r42.getMinimumHeight();
        int r02 = r0.f4658u0;
        if (r22 == r02) goto L14;
        r42.setMinimumHeight(r02);
    L14:
        this.f8926a = r1;
        return;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
    }
}
