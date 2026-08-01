package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnKeyListener {
    public final /* synthetic */ SearchView a;

    public b(SearchView r1) {
        this.a = r1;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View r8, int r9, KeyEvent r10) {
        SearchView r0 = this.a;
        SearchView.SearchAutoComplete r1 = r0.p;
        if (r0.b0 != null) goto L6;
    L51:
        return false;
    L6:
        if (r1.isPopupShowing() == false) goto L42;
        if (r1.getListSelection() == (-1)) goto L42;
        if (r0.b0 == null) goto L51;
        if (r0.O == null) goto L51;
        if (r10.getAction() != 0) goto L51;
        if (r10.hasNoModifiers() == false) goto L51;
        if (r9 != 66) goto L21;
    L39:
        r0.n(r1.getListSelection());
        return true;
    L21:
        if (r9 == 84) goto L39;
        if (r9 == 61) goto L39;
        if (r9 != 21) goto L28;
    L34:
        if (r9 != 21) goto L36;
        int r82 = 0;
    L37:
        r1.setSelection(r82);
        r1.setListSelection(0);
        r1.clearListSelection();
        r1.a();
        return true;
    L36:
        r82 = r1.length();
        goto L37
    L28:
        if (r9 == 22) goto L34;
        if (r9 != 19) goto L51;
        r1.getListSelection();
        return false;
    L42:
        if (TextUtils.getTrimmedLength(r1.getText()) == 0) goto L51;
        if (r10.hasNoModifiers() == false) goto L51;
        if (r10.getAction() != 1) goto L51;
        if (r9 != 66) goto L51;
        r8.cancelLongPress();
        r0.getContext().startActivity(r0.j("android.intent.action.SEARCH", null, null, r1.getText().toString()));
        return true;
    }
}
