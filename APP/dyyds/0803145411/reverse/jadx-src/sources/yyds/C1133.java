package yyds;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.inputmethod.BaseInputConnection;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: yyds.ᛵᛷᛱᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1133 implements TextWatcher {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5205;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f5206;

    public /* synthetic */ C1133(int i, Object obj) {
        this.f5205 = i;
        this.f5206 = obj;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    private final void m2322(Editable editable) {
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    private final void m2323(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    private final void m2324(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    private final void m2325(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f5205) {
            case 0:
                C1022 c1022 = (C1022) this.f5206;
                if (!c1022.f4661) {
                    c1022.m2223();
                    if (editable == null || BaseInputConnection.getComposingSpanStart(editable) == -1 || BaseInputConnection.getComposingSpanEnd(editable) == -1) {
                        c1022.f4667 = editable == null ? "" : editable.toString();
                        c1022.m4();
                        C1372 c1372 = c1022.f21;
                        if (c1372 != null) {
                            c1372.f6404 = c1022.m2213();
                        }
                        C1372 c13722 = c1022.f21;
                        if (c13722 != null) {
                            c13722.notifyDataSetChanged();
                        }
                        C0860 c0860 = c1022.f4655;
                        if (c0860 != null) {
                            c0860.setSelection(0);
                        }
                        c1022.m2221();
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f5205;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f5205) {
            case 0:
                break;
            default:
                SearchView searchView = (SearchView) this.f5206;
                Editable text = searchView.f170.getText();
                searchView.f175 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.m63(!zIsEmpty);
                int i4 = 8;
                if (searchView.f173 && !searchView.f179 && zIsEmpty) {
                    searchView.f172.setVisibility(8);
                    i4 = 0;
                }
                searchView.f194.setVisibility(i4);
                searchView.m72();
                searchView.m71();
                charSequence.toString();
                break;
        }
    }
}
