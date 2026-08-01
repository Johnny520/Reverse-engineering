package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements android.view.View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ x0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            int r4 = r3.a
            switch(r4) {
                case 0: goto L3c;
                case 1: goto L2b;
                case 2: goto L17;
                default: goto L5;
            }
        L5:
            java.lang.Object r4 = r3.b
            androidx.appcompat.widget.Toolbar r4 = (androidx.appcompat.widget.Toolbar) r4
            f70 r4 = r4.L
            if (r4 != 0) goto Lf
            r4 = 0
            goto L11
        Lf:
            ou r4 = r4.b
        L11:
            if (r4 == 0) goto L16
            r4.collapseActionView()
        L16:
            return
        L17:
            java.lang.Object r4 = r3.b
            ut r4 = (defpackage.ut) r4
            int r0 = r4.V
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L25
            r4.E(r1)
            goto L2a
        L25:
            if (r0 != r1) goto L2a
            r4.E(r2)
        L2a:
            return
        L2b:
            java.lang.Object r4 = r3.b
            e2 r4 = (defpackage.e2) r4
            c2 r0 = r4.v
            r1 = 1
            g2 r4 = r4.b
            android.os.Message r4 = r0.obtainMessage(r1, r4)
            r4.sendToTarget()
            return
        L3c:
            java.lang.Object r4 = r3.b
            n1 r4 = (defpackage.n1) r4
            r4.a()
            return
    }
}
