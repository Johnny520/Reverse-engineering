package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: loaded from: classes.dex */
public final class c20 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchView f883a;

    public c20(SearchView searchView) {
        this.f883a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f883a.m174q();
        return true;
    }
}
