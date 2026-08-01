package defpackage;

/* JADX INFO: renamed from: ᛵᛸᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0941 implements android.widget.TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f4228;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f4229;

    public /* synthetic */ C0941(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f4228 = r1
            r0.f4229 = r2
            r0.<init>()
            return
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView r2, int r3, android.view.KeyEvent r4) {
            r1 = this;
            int r2 = r1.f4228
            r0 = 1
            java.lang.Object r1 = r1.f4229
            switch(r2) {
                case 0: goto Le;
                default: goto L8;
            }
        L8:
            androidx.appcompat.widget.SearchView r1 = (androidx.appcompat.widget.SearchView) r1
            r1.m51()
            return r0
        Le:
            r2 = 3
            if (r3 == r2) goto L24
            if (r4 == 0) goto L22
            int r2 = r4.getAction()
            if (r2 != r0) goto L22
            int r2 = r4.getKeyCode()
            r3 = 66
            if (r2 != r3) goto L22
            goto L24
        L22:
            r0 = 0
            goto L29
        L24:
            ᲀᲀᛲᛴ r1 = (defpackage.C1732) r1
            r1.m3115()
        L29:
            return r0
    }
}
