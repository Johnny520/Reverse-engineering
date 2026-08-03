package p000a;

import androidx.appcompat.view.menu.C1000h;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: a.tf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0846tf implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3324a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Toolbar f3325b;

    public /* synthetic */ RunnableC0846tf(Toolbar toolbar, int i) {
        this.f3324a = i;
        this.f3325b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3324a) {
            case 0:
                Toolbar.C1033f c1033f = this.f3325b.f4037M;
                C1000h c1000h = c1033f == null ? null : c1033f.f4076b;
                if (c1000h != null) {
                    c1000h.collapseActionView();
                }
                break;
            default:
                this.f3325b.m2383n();
                break;
        }
    }
}
