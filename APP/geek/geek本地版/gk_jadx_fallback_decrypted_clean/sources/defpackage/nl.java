package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nl extends defpackage.ip implements defpackage.sa0, defpackage.oq, defpackage.bm {
    public final androidx.fragment.app.FragmentActivity C;
    public final androidx.fragment.app.FragmentActivity D;
    public final android.os.Handler E;
    public final defpackage.yl F;
    public final /* synthetic */ androidx.fragment.app.FragmentActivity G;

    public nl(androidx.fragment.app.FragmentActivity r3) {
            r2 = this;
            r2.<init>()
            r2.G = r3
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            yl r1 = new yl
            r1.<init>()
            r2.F = r1
            r2.C = r3
            r2.D = r3
            r2.E = r0
            return
    }

    @Override // defpackage.ip
    public final android.view.View G(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.G
            android.view.View r2 = r0.findViewById(r2)
            return r2
    }

    @Override // defpackage.ip
    public final boolean H() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.G
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L10
            android.view.View r0 = r0.peekDecorView()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // defpackage.bm
    public final void a() {
            r0 = this;
            return
    }

    @Override // defpackage.sa0
    public final defpackage.ra0 d() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.G
            ra0 r0 = r0.d()
            return r0
    }

    @Override // defpackage.oq
    public final androidx.lifecycle.a e() {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.G
            androidx.lifecycle.a r0 = r0.t
            return r0
    }
}
