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

    public C0124r0(Window r1, C0095d r2) {
        this.f310a = r1;
        this.f311b = r2;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: Y */
    public final void mo129Y() {
        int r1 = 1;
    L4:
        if (r1 > 256) goto L17;
        if ((8 & r1) == 0) goto L16;
        if (r1 != 1) goto L10;
        m432g0(4);
        this.f310a.clearFlags(1024);
        goto L16
    L10:
        if (r1 == 2) goto L14;
        if (r1 != 8) goto L16;
        ((C0095d) this.f311b.f251b).mo338A();
        goto L16
    L14:
        m432g0(2);
    L16:
        r1 = r1 << 1;
        goto L4
    }

    /* JADX INFO: renamed from: g0 */
    public final void m432g0(int r3) {
        View r02 = this.f310a.getDecorView();
        int r1 = r02.getSystemUiVisibility();
        r02.setSystemUiVisibility((~r3) & r1);
    }
}
