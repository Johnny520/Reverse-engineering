package p006D;

import android.view.View;
import android.view.Window;
import p001A0.AbstractC0040p;

/* JADX INFO: renamed from: D.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0124r0 extends AbstractC0040p {

    /* JADX INFO: renamed from: a */
    public final Window f310a;

    /* JADX INFO: renamed from: b */
    public final C0095d f311b;

    public C0124r0(Window window, C0095d c0095d) {
        this.f310a = window;
        this.f311b = c0095d;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: Y */
    public final void mo129Y() {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((8 & i2) != 0) {
                if (i2 == 1) {
                    m432g0(4);
                    this.f310a.clearFlags(1024);
                } else if (i2 == 2) {
                    m432g0(2);
                } else if (i2 == 8) {
                    ((C0095d) this.f311b.f251b).mo338A();
                }
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m432g0(int i2) {
        View decorView = this.f310a.getDecorView();
        decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
    }
}
