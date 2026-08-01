package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g8 extends defpackage.gt {
    public final android.graphics.Typeface a;
    public final defpackage.l0 b;
    public boolean c;

    public g8(defpackage.l0 r1, android.graphics.Typeface r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r1
            return
    }

    @Override // defpackage.gt
    public final void p(int r2) {
            r1 = this;
            boolean r2 = r1.c
            if (r2 != 0) goto L16
            l0 r2 = r1.b
            java.lang.Object r2 = r2.b
            za r2 = (defpackage.za) r2
            android.graphics.Typeface r0 = r1.a
            boolean r0 = r2.j(r0)
            if (r0 == 0) goto L16
            r0 = 0
            r2.h(r0)
        L16:
            return
    }

    @Override // defpackage.gt
    public final void q(android.graphics.Typeface r1, boolean r2) {
            r0 = this;
            boolean r2 = r0.c
            if (r2 != 0) goto L14
            l0 r2 = r0.b
            java.lang.Object r2 = r2.b
            za r2 = (defpackage.za) r2
            boolean r1 = r2.j(r1)
            if (r1 == 0) goto L14
            r1 = 0
            r2.h(r1)
        L14:
            return
    }
}
