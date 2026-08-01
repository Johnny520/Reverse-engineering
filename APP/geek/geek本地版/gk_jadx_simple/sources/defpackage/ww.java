package defpackage;

import androidx.activity.a;

/* JADX INFO: loaded from: classes.dex */
public final class ww implements h8 {
    public final sl a;
    public final /* synthetic */ a b;

    public ww(a r2, sl r3) {
        ip.o("onBackPressedCallback", r3);
        this.b = r2;
        this.a = r3;
    }

    @Override // defpackage.h8
    public final void cancel() {
        a r0 = this.b;
        k6 r1 = r0.b;
        sl r2 = this.a;
        r1.remove(r2);
        if (ip.i(r0.c, r2) == false) goto L5;
        r2.getClass();
        r0.c = null;
    L5:
        r2.b.remove(this);
        xw r02 = r2.c;
        if (r02 == null) goto L8;
        r02.a();
    L8:
        r2.c = null;
    }
}
