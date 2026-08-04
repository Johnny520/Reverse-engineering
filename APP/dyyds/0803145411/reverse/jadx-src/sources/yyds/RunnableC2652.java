package yyds;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: yyds.ᲈᛵᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2652 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13051;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Toolbar f13052;

    public /* synthetic */ RunnableC2652(Toolbar toolbar, int i) {
        this.f13051 = i;
        this.f13052 = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13051;
        Toolbar toolbar = this.f13052;
        switch (i) {
            case 0:
                C2784 c2784 = toolbar.f221;
                C1148 c1148 = c2784 == null ? null : c2784.f13608;
                if (c1148 != null) {
                    c1148.collapseActionView();
                }
                break;
            default:
                toolbar.m78();
                break;
        }
    }
}
