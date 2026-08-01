package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c20 implements android.widget.TextView.OnEditorActionListener {
    public final /* synthetic */ androidx.appcompat.widget.SearchView a;

    public c20(androidx.appcompat.widget.SearchView r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            androidx.appcompat.widget.SearchView r1 = r0.a
            r1.q()
            r1 = 1
            return r1
    }
}
