package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class oc0 extends nc0 {
    public ep m;

    public oc0(wc0 r1, WindowInsets r2) {
        super(r1, r2);
        this.m = null;
    }

    @Override // defpackage.tc0
    public wc0 b() {
        return wc0.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.tc0
    public wc0 c() {
        return wc0.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.tc0
    public final ep h() {
        if (this.m != null) goto L6;
        WindowInsets r0 = this.c;
        this.m = ep.b(r0.getStableInsetLeft(), r0.getStableInsetTop(), r0.getStableInsetRight(), r0.getStableInsetBottom());
    L6:
        return this.m;
    }

    @Override // defpackage.tc0
    public boolean m() {
        return this.c.isConsumed();
    }

    @Override // defpackage.tc0
    public void q(ep r1) {
        this.m = r1;
    }
}
