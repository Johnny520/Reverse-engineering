package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class nj extends s70 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ nj() {
        this.a = 2;
    }

    @Override // defpackage.s70, defpackage.q70
    public void b() {
        switch(this.a) {
            case 2: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        z6 r0 = (z6) this.b;
        if (r0.z == true) goto L9;
        r0.D();
        r0.z = true;
        return;
    }

    @Override // defpackage.q70
    public final void e(r70 r4) {
        switch(this.a) {
            case 0: goto L11;
            case 1: goto L9;
            default: goto L4;
        };
    L4:
        z6 r0 = (z6) this.b;
        int r1 = r0.y - 1;
        r0.y = r1;
        if (r1 != 0) goto L7;
        r0.z = false;
        r0.l();
    L7:
        r4.u(this);
        return;
    L9:
        ((r70) this.b).w();
        r4.u(this);
        return;
    L11:
        View r02 = (View) this.b;
        db0 r12 = bb0.a;
        r12.N(r02, 1.0f);
        r12.getClass();
        r4.u(this);
    }

    public /* synthetic */ nj(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }
}
