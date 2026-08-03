package p006D;

import android.view.WindowInsetsController;
import p001A0.AbstractC0040p;

/* JADX INFO: renamed from: D.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0126s0 extends AbstractC0040p {

    /* JADX INFO: renamed from: a */
    public final WindowInsetsController f312a;

    /* JADX INFO: renamed from: b */
    public final C0095d f313b;

    public C0126s0(WindowInsetsController windowInsetsController, C0095d c0095d) {
        this.f312a = windowInsetsController;
        this.f313b = c0095d;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: Y */
    public final void mo129Y() {
        ((C0095d) this.f313b.f251b).mo338A();
        this.f312a.show(0);
    }
}
