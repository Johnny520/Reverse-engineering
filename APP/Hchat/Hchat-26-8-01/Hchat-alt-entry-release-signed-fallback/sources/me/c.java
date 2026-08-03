package me;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r9.e0 {
    @Override // r9.e0, ke.e
    public final void d(ud.r r8, ud.h r9) {
            r7 = this;
            java.util.List r9 = r9.g()
            java.util.Iterator r9 = r9.iterator()
        L8:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r9.next()
            ud.p r0 = (ud.p) r0
            qd.r r1 = r0.f13714l
            pd.k r2 = r0.f13713k
            if (r1 != 0) goto L1b
            goto L8
        L1b:
            qd.s r1 = r1.f10923m
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L23
        L21:
            r5 = r4
            goto L3d
        L23:
            java.util.ArrayList r5 = r1.f10928j
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L2c
            goto L21
        L2c:
            boolean r6 = r1.j()
            if (r6 == 0) goto L34
            r5 = r3
            goto L3d
        L34:
            ce.i r6 = new ce.i
            r6.<init>(r7, r8)
            boolean r5 = be.h.g(r5, r6)
        L3d:
            if (r5 == 0) goto L8
            int r5 = r2.ordinal()
            r6 = 34
            if (r5 == r6) goto L4d
            r6 = 38
            if (r5 == r6) goto L4d
            r5 = r3
            goto L4e
        L4d:
            r5 = r4
        L4e:
            if (r5 == 0) goto L52
        L50:
            r3 = r4
            goto L74
        L52:
            boolean r5 = r0.W()
            if (r5 == 0) goto L5a
        L58:
            r2 = r4
            goto L67
        L5a:
            int r2 = r2.ordinal()
            r5 = 8
            if (r2 == r5) goto L58
            r5 = 20
            if (r2 == r5) goto L58
            r2 = r3
        L67:
            if (r2 == 0) goto L74
            md.a r2 = md.a.f8840u
            r0.w(r2)
            md.a r2 = md.a.f8838s
            r0.w(r2)
            goto L50
        L74:
            if (r3 == 0) goto L8
            r2 = 0
            r0.f13714l = r2
            java.util.List r0 = r8.D
            r0.remove(r1)
            java.util.ArrayList r0 = r1.f10928j
            java.util.Iterator r0 = r0.iterator()
        L84:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8
            java.lang.Object r1 = r0.next()
            qd.r r1 = (qd.r) r1
            r1.f10923m = r2
            goto L84
        L93:
            return
    }
}
