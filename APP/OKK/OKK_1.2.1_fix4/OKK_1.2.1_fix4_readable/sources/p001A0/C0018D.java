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

    public C0018D(TextInputLayout textInputLayout, EditText editText) {
        this.f55c = textInputLayout;
        this.f54b = editText;
        this.f53a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f55c;
        textInputLayout.m1907u(!textInputLayout.f2439A0, false);
        if (textInputLayout.f2483k) {
            textInputLayout.m1900n(editable);
        }
        if (textInputLayout.f2499s) {
            textInputLayout.m1908v(editable);
        }
        EditText editText = this.f54b;
        int lineCount = editText.getLineCount();
        int i2 = this.f53a;
        if (lineCount != i2) {
            if (lineCount < i2) {
                Field field = AbstractC0080Q.f219a;
                int minimumHeight = editText.getMinimumHeight();
                int i3 = textInputLayout.f2502t0;
                if (minimumHeight != i3) {
                    editText.setMinimumHeight(i3);
                }
            }
            this.f53a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
