package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rw extends defpackage.cq implements defpackage.sm {
    public final /* synthetic */ int b;
    public final /* synthetic */ androidx.activity.a c;

    public /* synthetic */ rw(androidx.activity.a r1, int r2) {
            r0 = this;
            r0.b = r2
            r0.c = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.sm
    public final java.lang.Object f(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.b
            switch(r0) {
                case 0: goto L30;
                default: goto L5;
            }
        L5:
            a7 r4 = (defpackage.a7) r4
            java.lang.String r0 = "backEvent"
            defpackage.ip.o(r0, r4)
            androidx.activity.a r4 = r3.c
            k6 r4 = r4.b
            int r0 = r4.size()
            java.util.ListIterator r4 = r4.listIterator(r0)
        L18:
            boolean r0 = r4.hasPrevious()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r4.previous()
            r1 = r0
            sl r1 = (defpackage.sl) r1
            boolean r1 = r1.a
            if (r1 == 0) goto L18
            goto L2b
        L2a:
            r0 = 0
        L2b:
            sl r0 = (defpackage.sl) r0
            vh r4 = defpackage.vh.n
            return r4
        L30:
            a7 r4 = (defpackage.a7) r4
            java.lang.String r0 = "backEvent"
            defpackage.ip.o(r0, r4)
            androidx.activity.a r4 = r3.c
            k6 r0 = r4.b
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L43:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L55
            java.lang.Object r1 = r0.previous()
            r2 = r1
            sl r2 = (defpackage.sl) r2
            boolean r2 = r2.a
            if (r2 == 0) goto L43
            goto L56
        L55:
            r1 = 0
        L56:
            sl r1 = (defpackage.sl) r1
            r4.c = r1
            vh r4 = defpackage.vh.n
            return r4
    }
}
