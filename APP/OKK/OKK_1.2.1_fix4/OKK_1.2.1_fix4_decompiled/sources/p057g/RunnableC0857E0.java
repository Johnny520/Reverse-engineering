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

    public /* synthetic */ RunnableC0857E0(Toolbar toolbar, int i2) {
        this.f3088a = i2;
        this.f3089b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3088a) {
            case 0:
                C0865I0 c0865i0 = this.f3089b.f1221K;
                MenuItemC0780k menuItemC0780k = c0865i0 == null ? null : c0865i0.f3108b;
                if (menuItemC0780k != null) {
                    menuItemC0780k.collapseActionView();
                }
                break;
            default:
                this.f3089b.m1147m();
                break;
        }
    }
}
