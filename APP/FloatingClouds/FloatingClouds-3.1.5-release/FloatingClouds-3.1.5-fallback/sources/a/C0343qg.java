package a;

/* JADX INFO: renamed from: a.qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0343qg extends a.C0414ug.b<java.lang.Boolean> {
    @Override // a.C0414ug.b
    public final java.lang.Boolean a(android.view.View r1) {
            r0 = this;
            boolean r1 = a.C0414ug.g.d(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    @Override // a.C0414ug.b
    public final void b(android.view.View r1, java.lang.Boolean r2) {
            r0 = this;
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            a.C0414ug.g.j(r1, r2)
            return
    }

    @Override // a.C0414ug.b
    public final boolean d(java.lang.Boolean r3, java.lang.Boolean r4) {
            r2 = this;
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L10
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L10
            r3 = r0
            goto L11
        L10:
            r3 = r1
        L11:
            if (r4 == 0) goto L1b
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L1b
            r4 = r0
            goto L1c
        L1b:
            r4 = r1
        L1c:
            if (r3 != r4) goto L1f
            r1 = r0
        L1f:
            r3 = r1 ^ 1
            return r3
    }
}
