package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends qd.l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ud.p f10904l;

    public m(ud.p r2) {
            r1 = this;
            r1.<init>()
            qd.r r0 = r2.f13714l
            if (r0 == 0) goto Lc
            qd.j r0 = r0.I()
            goto Le
        Lc:
            qd.h r0 = qd.j.f10887u
        Le:
            r1.f10902i = r0
            r1.f10904l = r2
            return
    }

    @Override // qd.l
    public final qd.l H() {
            r2 = this;
            qd.m r0 = new qd.m
            ud.p r1 = r2.f10904l
            ud.p r1 = r1.O()
            r0.<init>(r1)
            qd.j r1 = r2.f10902i
            r0.f10902i = r1
            r0.B(r2)
            ud.p r1 = r2.f10903j
            r0.V(r1)
            return r0
    }

    @Override // qd.l
    public final void V(ud.p r2) {
            r1 = this;
            ud.p r0 = r1.f10904l
            if (r2 == r0) goto L7
            r1.f10903j = r2
            return
        L7:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "Can't wrap instruction info itself: "
            java.lang.String r2 = r0.concat(r2)
            ah.a.k(r2)
            return
    }

    @Override // qd.l
    public final java.lang.String X() {
            r5 = this;
            ud.p r0 = r5.f10904l
            pd.k r1 = r0.f13713k
            pd.k r2 = pd.k.f10499h
            if (r1 != r2) goto L15
            pd.d r0 = (pd.d) r0
            java.lang.String r0 = r0.f10477o
            java.lang.String r1 = "(\""
            java.lang.String r2 = "\")"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
        L15:
            qd.j r1 = r5.f10902i
            java.lang.String r1 = java.lang.String.valueOf(r1)
            pd.k r0 = r0.f13713k
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = ":"
            java.lang.String r3 = ")"
            java.lang.String r4 = "(wrap:"
            java.lang.String r0 = bc.e.k(r4, r1, r2, r0, r3)
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof qd.m
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qd.m r8 = (qd.m) r8
            ud.p r8 = r8.f10904l
            ud.p r1 = r7.f10904l
            boolean r3 = r1.Y(r8)
            if (r3 != 0) goto L17
            return r2
        L17:
            java.util.List r3 = r1.f13715m
            int r3 = r3.size()
            r4 = r2
        L1e:
            if (r4 >= r3) goto L32
            qd.l r5 = r1.S(r4)
            qd.l r6 = r8.S(r4)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L2f
            return r2
        L2f:
            int r4 = r4 + 1
            goto L1e
        L32:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            ud.p r0 = r1.f10904l
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            ud.p r0 = r5.f10904l
            pd.k r1 = r0.f13713k
            pd.k r2 = pd.k.f10499h
            if (r1 != r2) goto L15
            pd.d r0 = (pd.d) r0
            java.lang.String r0 = r0.f10477o
            java.lang.String r1 = "(\""
            java.lang.String r2 = "\")"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
        L15:
            qd.j r1 = r5.f10902i
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = ":"
            java.lang.String r3 = ")"
            java.lang.String r4 = "(wrap:"
            java.lang.String r0 = bc.e.k(r4, r1, r2, r0, r3)
            return r0
    }
}
