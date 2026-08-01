package androidx.appcompat.widget;

import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static void a(AutoCompleteTextView r0) {
        r0.refreshAutoCompleteResults();
    }

    public static void b(SearchView.SearchAutoComplete r0, int r1) {
        r0.setInputMethodMode(r1);
    }
}
