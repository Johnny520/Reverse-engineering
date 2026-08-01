package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: androidx.appcompat.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0031b implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchView f360a;

    public ViewOnKeyListenerC0031b(SearchView searchView) {
        this.f360a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.f360a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f297p;
        if (searchView.f292b0 != null) {
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.m152j("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.f292b0 != null && searchView.f282O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i == 66 || i == 84 || i == 61) {
                    searchView.m156n(searchAutoComplete.getListSelection());
                    return true;
                }
                if (i == 21 || i == 22) {
                    searchAutoComplete.setSelection(i == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.m166a();
                    return true;
                }
                if (i == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
