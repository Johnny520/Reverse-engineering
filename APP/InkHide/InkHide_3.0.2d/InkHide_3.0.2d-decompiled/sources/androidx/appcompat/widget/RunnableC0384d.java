package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: androidx.appcompat.widget.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0384d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchView.SearchAutoComplete f1115a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0384d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f1115a = searchAutoComplete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f1115a;
        if (searchAutoComplete.f1067h) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f1067h = false;
        }
    }
}
