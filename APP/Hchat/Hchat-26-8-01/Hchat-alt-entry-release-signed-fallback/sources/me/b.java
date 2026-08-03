package me;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f1.n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f8885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.LinkedHashMap f8886i;

    public b() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f8885h = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.f8886i = r0
            return
    }

    @Override // f1.n0
    public final void l(ud.r r3, ud.h r4, ud.n r5) {
            r2 = this;
            me.e r3 = new me.e
            r3.<init>(r5, r4)
            boolean r0 = r5 instanceof zd.c
            if (r0 == 0) goto L1d
            zd.c r5 = (zd.c) r5
            g4.a r5 = r5.f22671r
            boolean r0 = r5 instanceof zd.b
            if (r0 == 0) goto L1d
            zd.b r5 = (zd.b) r5
            ud.p r0 = r5.f22664a
            r2.p(r0, r3)
            ud.p r5 = r5.f22665b
            r2.p(r5, r3)
        L1d:
            java.util.List r5 = r4.g()
            int r5 = r5.size()
            r0 = 0
        L26:
            if (r0 >= r5) goto L38
            java.util.List r1 = r4.g()
            java.lang.Object r1 = r1.get(r0)
            ud.p r1 = (ud.p) r1
            r2.p(r1, r3)
            int r0 = r0 + 1
            goto L26
        L38:
            return
    }

    public final void p(ud.p r6, me.e r7) {
            r5 = this;
            if (r6 != 0) goto L3
            goto L5a
        L3:
            qd.r r0 = r6.f13714l
            java.util.LinkedHashMap r1 = r5.f8886i
            md.a r2 = md.a.f8838s
            if (r0 == 0) goto L26
            md.f r3 = r0.f8877g
            boolean r3 = r3.a(r2)
            if (r3 != 0) goto L26
            qd.s r0 = r0.f10923m
            me.a r3 = new me.a
            r4 = 0
            r3.<init>(r4)
            java.lang.Object r0 = r1.computeIfAbsent(r0, r3)
            me.f r0 = (me.f) r0
            java.util.ArrayList r0 = r0.f8891b
            r0.add(r7)
        L26:
            java.util.ArrayList r0 = r5.f8885h
            r0.clear()
            r6.U(r0)
            java.util.Iterator r6 = r0.iterator()
        L32:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r6.next()
            qd.r r0 = (qd.r) r0
            md.f r3 = r0.f8877g
            boolean r3 = r3.a(r2)
            if (r3 != 0) goto L32
            qd.s r0 = r0.f10923m
            me.a r3 = new me.a
            r4 = 0
            r3.<init>(r4)
            java.lang.Object r0 = r1.computeIfAbsent(r0, r3)
            me.f r0 = (me.f) r0
            java.util.ArrayList r0 = r0.f8892c
            r0.add(r7)
            goto L32
        L5a:
            return
    }
}
