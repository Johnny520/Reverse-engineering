package p057g;

import androidx.appcompat.widget.Toolbar;
import p055f.MenuItemC0780k;

/* JADX INFO: renamed from: g.E0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0857E0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3088a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Toolbar f3089b;

    public /* synthetic */ RunnableC0857E0(Toolbar r1, int r2) {
        this.f3088a = r2;
        this.f3089b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f3088a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f3089b.m1147m();
        return;
    L6:
        C0865I0 r02 = this.f3089b.f1221K;
        if (r02 != null) goto L9;
        MenuItemC0780k r03 = null;
    L10:
        if (r03 == null) goto L13;
        r03.collapseActionView();
        return;
    L13:
        return;
    L9:
        r03 = r02.f3108b;
        goto L10
    }
}
