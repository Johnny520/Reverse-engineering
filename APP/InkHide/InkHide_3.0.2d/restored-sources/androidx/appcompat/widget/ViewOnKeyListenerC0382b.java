package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: androidx.appcompat.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0382b implements View.OnKeyListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SearchView f1114b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnKeyListenerC0382b(SearchView searchView) {
        this.f1114b = searchView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        SearchView searchView = this.f1114b;
        if (searchView.f1050c0 != null) {
            SearchView.SearchAutoComplete searchAutoComplete = searchView.f1055q;
            if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i2 == 66) {
                    view.cancelLongPress();
                    searchView.getContext().startActivity(searchView.m680k("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                    return true;
                }
            } else if (searchView.f1050c0 != null && searchView.f1040P != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                if (i2 == 66 || i2 == 84 || i2 == 61) {
                    searchView.m684o(searchAutoComplete.getListSelection());
                    return true;
                }
                if (i2 == 21 || i2 == 22) {
                    searchAutoComplete.setSelection(i2 == 21 ? 0 : searchAutoComplete.length());
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.m694a();
                    return true;
                }
                if (i2 == 19) {
                    searchAutoComplete.getListSelection();
                    return false;
                }
            }
        }
        return false;
    }
}
