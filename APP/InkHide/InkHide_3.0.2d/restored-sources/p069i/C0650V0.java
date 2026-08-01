package p069i;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: i.V0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0650V0 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchView f2215a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0650V0(SearchView searchView) {
        this.f2215a = searchView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        this.f2215a.m687r();
        return true;
    }
}
