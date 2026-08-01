package defpackage;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class b20 implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView a;

    public b20(SearchView r1) {
        this.a = r1;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View r2, boolean r3) {
        SearchView r22 = this.a;
        View.OnFocusChangeListener r0 = r22.K;
        if (r0 == null) goto L6;
        r0.onFocusChange(r22, r3);
        return;
    }
}
