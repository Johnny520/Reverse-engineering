package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class pp extends defpackage.wp {
    public final boolean c;

    public pp() {
            r6 = this;
            r0 = 1
            r6.<init>(r0)
            r1 = 0
            r6.A(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.wp.b
            java.lang.Object r3 = r2.get(r6)
            da r3 = (defpackage.da) r3
            boolean r4 = r3 instanceof defpackage.ea
            if (r4 == 0) goto L17
            ea r3 = (defpackage.ea) r3
            goto L18
        L17:
            r3 = r1
        L18:
            r4 = 0
            if (r3 == 0) goto L3b
            wp r3 = r3.k()
        L1f:
            boolean r5 = r3.u()
            if (r5 == 0) goto L26
            goto L3c
        L26:
            java.lang.Object r3 = r2.get(r3)
            da r3 = (defpackage.da) r3
            boolean r5 = r3 instanceof defpackage.ea
            if (r5 == 0) goto L33
            ea r3 = (defpackage.ea) r3
            goto L34
        L33:
            r3 = r1
        L34:
            if (r3 == 0) goto L3b
            wp r3 = r3.k()
            goto L1f
        L3b:
            r0 = r4
        L3c:
            r6.c = r0
            return
    }

    @Override // defpackage.wp
    public final boolean u() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    @Override // defpackage.wp
    public final boolean v() {
            r1 = this;
            r0 = 1
            return r0
    }
}
