package p001A0;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Field;
import p006D.AbstractC0080Q;

/* JADX INFO: renamed from: A0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0018D implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public int f53a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f54b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextInputLayout f55c;

    public C0018D(TextInputLayout r1, EditText r2) {
        this.f55c = r1;
        this.f54b = r2;
        this.f53a = r2.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r4) {
        TextInputLayout r02 = this.f55c;
        r02.m1907u(!r02.f2439A0, false);
        if (r02.f2483k == false) goto L6;
        r02.m1900n(r4);
    L6:
        if (r02.f2499s == false) goto L8;
        r02.m1908v(r4);
    L8:
        EditText r42 = this.f54b;
        int r1 = r42.getLineCount();
        int r2 = this.f53a;
        if (r1 == r2) goto L16;
        if (r1 >= r2) goto L14;
        Field r22 = AbstractC0080Q.f219a;
        int r23 = r42.getMinimumHeight();
        int r03 = r02.f2502t0;
        if (r23 == r03) goto L14;
        r42.setMinimumHeight(r03);
    L14:
        this.f53a = r1;
        return;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
    }
}
