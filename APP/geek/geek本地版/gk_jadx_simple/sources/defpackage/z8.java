package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class z8 extends s70 {
    public boolean a;
    public final /* synthetic */ ViewGroup b;

    public z8(ViewGroup r1) {
        this.b = r1;
        this.a = false;
    }

    @Override // defpackage.s70, defpackage.q70
    public final void a() {
        zt.Q(this.b, false);
        this.a = true;
    }

    @Override // defpackage.s70, defpackage.q70
    public final void c() {
        zt.Q(this.b, false);
    }

    @Override // defpackage.s70, defpackage.q70
    public final void d() {
        zt.Q(this.b, true);
    }

    @Override // defpackage.q70
    public final void e(r70 r3) {
        if (this.a == true) goto L5;
        zt.Q(this.b, false);
    L5:
        r3.u(this);
    }
}
