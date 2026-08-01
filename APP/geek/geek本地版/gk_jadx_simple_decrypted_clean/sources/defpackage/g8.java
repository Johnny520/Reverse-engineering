package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class g8 extends gt {
    public final Typeface a;
    public final l0 b;
    public boolean c;

    public g8(l0 r1, Typeface r2) {
        this.a = r2;
        this.b = r1;
    }

    @Override // defpackage.gt
    public final void p(int r2) {
        if (this.c == true) goto L8;
        za r22 = (za) this.b.b;
        if (r22.j(this.a) == false) goto L9;
        r22.h(false);
        return;
    L9:
        return;
    }

    @Override // defpackage.gt
    public final void q(Typeface r1, boolean r2) {
        if (this.c == true) goto L8;
        za r22 = (za) this.b.b;
        if (r22.j(r1) == false) goto L9;
        r22.h(false);
        return;
    L9:
        return;
    }
}
