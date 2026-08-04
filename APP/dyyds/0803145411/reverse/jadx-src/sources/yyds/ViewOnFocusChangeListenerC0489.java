package yyds;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: yyds.ᛲᲈᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0489 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ SearchView f2408;

    public ViewOnFocusChangeListenerC0489(SearchView searchView) {
        this.f2408 = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.f2408;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f190;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
