package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends qd.j {
    public final qd.q[] J;

    public h(qd.q[] r1) {
            r0 = this;
            r0.<init>()
            r0.J = r1
            int r1 = java.util.Arrays.hashCode(r1)
            r0.f10893a = r1
            return
    }

    @Override // qd.j
    public final qd.j A() {
            r2 = this;
            qd.q r0 = qd.q.f10915r
            boolean r0 = r2.a(r0)
            qd.e r1 = qd.j.f10877k
            if (r0 == 0) goto Lb
            return r1
        Lb:
            qd.q r0 = qd.q.f10916s
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L19
            qd.a r0 = new qd.a
            r0.<init>(r1)
            return r0
        L19:
            qd.q[] r0 = r2.J
            r1 = 0
            r0 = r0[r1]
            qd.g r1 = new qd.g
            r1.<init>(r0)
            return r1
    }

    @Override // qd.j
    public final boolean a(qd.q r6) {
            r5 = this;
            qd.q[] r0 = r5.J
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r1) goto L10
            r4 = r0[r3]
            if (r4 != r6) goto Ld
            r6 = 1
            return r6
        Ld:
            int r3 = r3 + 1
            goto L5
        L10:
            return r2
    }

    @Override // qd.j
    public final qd.q[] n() {
            r1 = this;
            qd.q[] r0 = r1.J
            return r0
    }

    @Override // qd.j
    public final boolean s(java.lang.Object r2) {
            r1 = this;
            qd.h r2 = (qd.h) r2
            qd.q[] r2 = r2.J
            qd.q[] r0 = r1.J
            boolean r2 = java.util.Arrays.equals(r0, r2)
            return r2
    }

    @Override // qd.j
    public final java.lang.String toString() {
            r5 = this;
            qd.q[] r0 = r5.J
            int r1 = r0.length
            qd.q[] r2 = qd.q.values()
            int r2 = r2.length
            if (r1 != r2) goto Ld
            java.lang.String r0 = "??"
            return r0
        Ld:
            r1 = 0
            if (r0 != 0) goto L12
            r2 = r1
            goto L13
        L12:
            int r2 = r0.length
        L13:
            if (r2 != 0) goto L18
            java.lang.String r0 = ""
            goto L36
        L18:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r1 = r0[r1]
            r3.append(r1)
            r1 = 1
        L23:
            if (r1 >= r2) goto L32
            java.lang.String r4 = ", "
            r3.append(r4)
            r4 = r0[r1]
            r3.append(r4)
            int r1 = r1 + 1
            goto L23
        L32:
            java.lang.String r0 = r3.toString()
        L36:
            java.lang.String r1 = "??["
            java.lang.String r2 = "]"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
    }

    @Override // qd.j
    public final boolean w() {
            r1 = this;
            r0 = 0
            return r0
    }
}
