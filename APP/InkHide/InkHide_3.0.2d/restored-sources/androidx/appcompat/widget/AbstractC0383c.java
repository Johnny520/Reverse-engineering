package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: androidx.appcompat.widget.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0383c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m715a(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.refreshAutoCompleteResults();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m716b(SearchView.SearchAutoComplete searchAutoComplete, int i2) {
        searchAutoComplete.setInputMethodMode(i2);
    }
}
