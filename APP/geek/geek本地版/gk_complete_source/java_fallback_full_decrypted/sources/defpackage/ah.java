package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ah implements defpackage.ow, defpackage.sm {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public /* synthetic */ ah(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    public final void a(java.lang.Throwable r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.b
            sm r0 = (defpackage.sm) r0
            r0.f(r2)
            return
        Ld:
            java.lang.Object r2 = r1.b
            gj r2 = (defpackage.gj) r2
            r2.b()
            return
    }

    @Override // defpackage.sm
    public final /* bridge */ /* synthetic */ java.lang.Object f(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.a(r2)
            vh r2 = defpackage.vh.n
            return r2
        Ld:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.a(r2)
            vh r2 = defpackage.vh.n
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L31;
                default: goto L5;
            }
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InvokeOnCancel["
            r0.<init>(r1)
            java.lang.Object r1 = r2.b
            sm r1 = (defpackage.sm) r1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = defpackage.ff.s(r2)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisposeOnCancel["
            r0.<init>(r1)
            java.lang.Object r1 = r2.b
            gj r1 = (defpackage.gj) r1
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
