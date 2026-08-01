package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class g20 implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1863a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f1864b;

    public /* synthetic */ g20(ViewGroup viewGroup, int i) {
        this.f1863a = i;
        this.f1864b = viewGroup;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f1863a) {
            case Base64.DEFAULT /* 0 */:
                break;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) this.f1864b;
                textInputLayout.m745u(!textInputLayout.f1174z0, false);
                if (textInputLayout.f1143k) {
                    textInputLayout.m738n(editable);
                }
                if (textInputLayout.f1159s) {
                    textInputLayout.m746v(editable);
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f1863a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f1863a) {
            case Base64.DEFAULT /* 0 */:
                SearchView searchView = (SearchView) this.f1864b;
                Editable text = searchView.f297p.getText();
                searchView.f289V = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.m164v(!zIsEmpty);
                int i4 = 8;
                if (searchView.f288U && !searchView.f281N && zIsEmpty) {
                    searchView.f302u.setVisibility(8);
                    i4 = 0;
                }
                searchView.f304w.setVisibility(i4);
                searchView.m160r();
                searchView.m163u();
                charSequence.toString();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m1130a(Editable editable) {
    }

    /* JADX INFO: renamed from: b */
    private final void m1131b(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: c */
    private final void m1132c(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: d */
    private final void m1133d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
