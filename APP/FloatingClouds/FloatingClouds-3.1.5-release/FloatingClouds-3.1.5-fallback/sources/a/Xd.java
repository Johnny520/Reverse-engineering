package a;

/* JADX INFO: loaded from: classes.dex */
public final class Xd extends a.Yd.f {
    public final /* synthetic */ java.util.ArrayList c;
    public final /* synthetic */ android.graphics.Matrix d;

    public Xd(java.util.ArrayList r1, android.graphics.Matrix r2) {
            r0 = this;
            r0.c = r1
            r0.d = r2
            r0.<init>()
            return
    }

    @Override // a.Yd.f
    public final void a(android.graphics.Matrix r3, a.Ud r4, int r5, android.graphics.Canvas r6) {
            r2 = this;
            java.util.ArrayList r3 = r2.c
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r3.next()
            a.Yd$f r0 = (a.Yd.f) r0
            android.graphics.Matrix r1 = r2.d
            r0.a(r1, r4, r5, r6)
            goto L6
        L18:
            return
    }
}
