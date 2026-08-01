package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: androidx.appcompat.widget.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0033d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchView.SearchAutoComplete f361a;

    public RunnableC0033d(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f361a = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f361a;
        if (searchAutoComplete.f310g) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f310g = false;
        }
    }
}
