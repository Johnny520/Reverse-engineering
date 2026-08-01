package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class z10 implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5436a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f5437b;

    public /* synthetic */ z10(ViewGroup viewGroup, int i) {
        this.f5436a = i;
        this.f5437b = viewGroup;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f5436a) {
            case Base64.DEFAULT /* 0 */:
                break;
            default:
                TextInputLayout textInputLayout = (TextInputLayout) this.f5437b;
                textInputLayout.m787u(!textInputLayout.f1249z0, false);
                if (textInputLayout.f1218k) {
                    textInputLayout.m780n(editable);
                }
                if (textInputLayout.f1234s) {
                    textInputLayout.m788v(editable);
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f5436a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f5436a) {
            case Base64.DEFAULT /* 0 */:
                SearchView searchView = (SearchView) this.f5437b;
                Editable text = searchView.f334p.getText();
                searchView.f326V = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.m179v(!zIsEmpty);
                int i4 = 8;
                if (searchView.f325U && !searchView.f318N && zIsEmpty) {
                    searchView.f339u.setVisibility(8);
                    i4 = 0;
                }
                searchView.f341w.setVisibility(i4);
                searchView.m175r();
                searchView.m178u();
                charSequence.toString();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m2748a(Editable editable) {
    }

    /* JADX INFO: renamed from: b */
    private final void m2749b(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: c */
    private final void m2750c(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: d */
    private final void m2751d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
