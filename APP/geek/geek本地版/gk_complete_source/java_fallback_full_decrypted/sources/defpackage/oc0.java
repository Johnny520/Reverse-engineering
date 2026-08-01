package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class oc0 extends defpackage.nc0 {
    public defpackage.ep m;

    public oc0(defpackage.wc0 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.m = r1
            return
    }

    @Override // defpackage.tc0
    public defpackage.wc0 b() {
            r2 = this;
            android.view.WindowInsets r0 = r2.c
            android.view.WindowInsets r0 = r0.consumeStableInsets()
            r1 = 0
            wc0 r0 = defpackage.wc0.g(r1, r0)
            return r0
    }

    @Override // defpackage.tc0
    public defpackage.wc0 c() {
            r2 = this;
            android.view.WindowInsets r0 = r2.c
            android.view.WindowInsets r0 = r0.consumeSystemWindowInsets()
            r1 = 0
            wc0 r0 = defpackage.wc0.g(r1, r0)
            return r0
    }

    @Override // defpackage.tc0
    public final defpackage.ep h() {
            r4 = this;
            ep r0 = r4.m
            if (r0 != 0) goto L1c
            android.view.WindowInsets r0 = r4.c
            int r1 = r0.getStableInsetLeft()
            int r2 = r0.getStableInsetTop()
            int r3 = r0.getStableInsetRight()
            int r0 = r0.getStableInsetBottom()
            ep r0 = defpackage.ep.b(r1, r2, r3, r0)
            r4.m = r0
        L1c:
            ep r0 = r4.m
            return r0
    }

    @Override // defpackage.tc0
    public boolean m() {
            r1 = this;
            android.view.WindowInsets r0 = r1.c
            boolean r0 = r0.isConsumed()
            return r0
    }

    @Override // defpackage.tc0
    public void q(defpackage.ep r1) {
            r0 = this;
            r0.m = r1
            return
    }
}
