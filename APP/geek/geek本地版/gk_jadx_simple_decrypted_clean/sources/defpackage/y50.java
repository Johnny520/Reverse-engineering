package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class y50 extends zt {
    public final /* synthetic */ gt e;
    public final /* synthetic */ a60 f;

    public y50(a60 r1, gt r2) {
        this.f = r1;
        this.e = r2;
    }

    @Override // defpackage.zt
    public final void I(int r3) {
        this.f.m = true;
        this.e.p(r3);
    }

    @Override // defpackage.zt
    public final void J(Typeface r3) {
        a60 r0 = this.f;
        r0.n = Typeface.create(r3, r0.c);
        r0.m = true;
        Typeface r32 = r0.n;
        this.e.q(r32, false);
    }
}
