package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class c20 implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView a;

    public c20(SearchView r1) {
        this.a = r1;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView r1, int r2, KeyEvent r3) {
        this.a.q();
        return true;
    }
}
