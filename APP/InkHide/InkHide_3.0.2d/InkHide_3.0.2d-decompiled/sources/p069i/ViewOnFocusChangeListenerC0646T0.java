package p069i;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: i.T0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0646T0 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchView f2204a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnFocusChangeListenerC0646T0(SearchView searchView) {
        this.f2204a = searchView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        SearchView searchView = this.f2204a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f1036L;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z2);
        }
    }
}
