package p000;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* JADX INFO: renamed from: Pk */
/* JADX INFO: loaded from: classes.dex */
public final class C0672Pk implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextView f2144a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextView f2145b;

    public C0672Pk(TextView textView, TextView textView2) {
        this.f2144a = textView;
        this.f2145b = textView2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (editable != null) {
            int length = editable.length();
            TextView textView = this.f2144a;
            if (length == 0) {
                Handler handler = AbstractC1208bA.f4138a;
                AbstractC1208bA.m2329b(new RunnableC2260n3(9, this.f2145b, textView), 200L);
            } else {
                textView.setVisibility(0);
                textView.setText(editable);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
