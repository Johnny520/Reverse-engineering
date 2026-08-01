package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class z10 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ z10(ViewGroup r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r4) {
        switch(this.a) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        TextInputLayout r0 = (TextInputLayout) this.b;
        r0.u(!r0.z0, false);
        if (r0.k == false) goto L8;
        r0.n(r4);
    L8:
        if (r0.s == false) goto L12;
        r0.v(r4);
        return;
    L12:
        return;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        int r12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r2, int r3, int r4, int r5) {
        switch(this.a) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        SearchView r32 = (SearchView) this.b;
        Editable r42 = r32.p.getText();
        r32.V = r42;
        boolean r43 = TextUtils.isEmpty(r42);
        r32.v(!r43);
        int r0 = 8;
        if (r32.U == true) goto L8;
    L11:
        r32.w.setVisibility(r0);
        r32.r();
        r32.u();
        r2.toString();
        return;
    L8:
        if (r32.N == true) goto L11;
        if (r43 == false) goto L11;
        r32.u.setVisibility(8);
        r0 = 0;
        goto L11
    }

    private final void a(Editable r1) {
    }

    private final void b(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void c(int r1, int r2, int r3, CharSequence r4) {
    }

    private final void d(int r1, int r2, int r3, CharSequence r4) {
    }
}
