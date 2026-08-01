package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class he extends defpackage.cq implements defpackage.wm {
    public static final defpackage.he c = null;
    public static final defpackage.he d = null;
    public static final defpackage.he e = null;
    public static final defpackage.he f = null;
    public static final defpackage.he g = null;
    public final /* synthetic */ int b;

    static {
            he r0 = new he
            r1 = 2
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.he.c = r0
            he r0 = new he
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.he.d = r0
            he r0 = new he
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.he.e = r0
            he r0 = new he
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.he.f = r0
            he r0 = new he
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.he.g = r0
            return
    }

    public /* synthetic */ he(int r1, int r2) {
            r0 = this;
            r0.b = r2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.wm
    public final java.lang.Object e(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.b
            switch(r0) {
                case 0: goto L25;
                case 1: goto L1d;
                case 2: goto L1a;
                case 3: goto L13;
                case 4: goto Le;
                default: goto L5;
            }
        L5:
            ge r2 = (defpackage.ge) r2
            ee r3 = (defpackage.ee) r3
            ge r2 = r2.i(r3)
            return r2
        Le:
            v60 r2 = (defpackage.v60) r2
            ee r3 = (defpackage.ee) r3
            return r2
        L13:
            defpackage.z30.m(r2)
            ee r3 = (defpackage.ee) r3
            r2 = 0
            return r2
        L1a:
            ee r3 = (defpackage.ee) r3
            return r2
        L1d:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.getClass()
            ee r3 = (defpackage.ee) r3
            return r2
        L25:
            ge r2 = (defpackage.ge) r2
            ee r3 = (defpackage.ee) r3
            ge r2 = r2.i(r3)
            return r2
    }
}
