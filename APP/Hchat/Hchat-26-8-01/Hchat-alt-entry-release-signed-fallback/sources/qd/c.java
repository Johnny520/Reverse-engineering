package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends qd.e {
    public java.util.List L;

    public c(java.lang.String r1, java.util.List r2) {
            r0 = this;
            r0.<init>(r1)
            r0.L = r2
            return
    }

    @Override // qd.j
    public final void B(java.util.List r1) {
            r0 = this;
            r0.L = r1
            return
    }

    @Override // qd.j
    public final java.util.List i() {
            r1 = this;
            java.util.List r0 = r1.L
            return r0
    }

    @Override // qd.e, qd.j
    public final boolean s(java.lang.Object r2) {
            r1 = this;
            boolean r0 = super.s(r2)
            if (r0 == 0) goto L14
            java.util.List r0 = r1.L
            qd.c r2 = (qd.c) r2
            java.util.List r2 = r2.L
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L14
            r2 = 1
            return r2
        L14:
            r2 = 0
            return r2
    }

    @Override // qd.e, qd.j
    public final java.lang.String toString() {
            r3 = this;
            java.util.List r0 = r3.L
            boolean r1 = r0.isEmpty()
            java.lang.String r2 = r3.K
            if (r1 == 0) goto Lb
            return r2
        Lb:
            java.lang.String r1 = " & "
            java.lang.String r0 = xe.s.j(r0, r1)
            java.lang.String r1 = " extends "
            java.lang.String r0 = wb.en.h(r2, r1, r0)
            return r0
    }
}
