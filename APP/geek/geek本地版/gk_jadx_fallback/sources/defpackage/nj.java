package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nj extends defpackage.s70 {
    public final /* synthetic */ int a;
    public java.lang.Object b;

    public /* synthetic */ nj() {
            r1 = this;
            r0 = 2
            r1.a = r0
            r1.<init>()
            return
    }

    public /* synthetic */ nj(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // defpackage.s70, defpackage.q70
    public void b() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r0 = r2.b
            z6 r0 = (defpackage.z6) r0
            boolean r1 = r0.z
            if (r1 != 0) goto L14
            r0.D()
            r1 = 1
            r0.z = r1
        L14:
            return
    }

    @Override // defpackage.q70
    public final void e(defpackage.r70 r4) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L26;
                case 1: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.b
            z6 r0 = (defpackage.z6) r0
            int r1 = r0.y
            int r1 = r1 + (-1)
            r0.y = r1
            if (r1 != 0) goto L17
            r1 = 0
            r0.z = r1
            r0.l()
        L17:
            r4.u(r3)
            return
        L1b:
            java.lang.Object r0 = r3.b
            r70 r0 = (defpackage.r70) r0
            r0.w()
            r4.u(r3)
            return
        L26:
            java.lang.Object r0 = r3.b
            android.view.View r0 = (android.view.View) r0
            db0 r1 = defpackage.bb0.a
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.N(r0, r2)
            r1.getClass()
            r4.u(r3)
            return
    }
}
