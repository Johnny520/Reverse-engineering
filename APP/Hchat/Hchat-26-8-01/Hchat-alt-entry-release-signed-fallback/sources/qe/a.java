package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.p f10932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f10933b;

    public a(ud.p r4, qd.l r5) {
            r3 = this;
            r3.<init>()
            r3.f10932a = r4
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r4.f13715m
            int r2 = r1.size()
            r0.<init>(r2)
            qd.r r4 = r4.f13714l
            if (r4 != r5) goto L33
            java.util.Iterator r4 = r1.iterator()
        L18:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            qd.l r5 = (qd.l) r5
            r5.getClass()
            boolean r1 = r5 instanceof qd.r
            if (r1 == 0) goto L18
            qd.r r5 = (qd.r) r5
            qd.s r5 = r5.f10923m
            r0.add(r5)
            goto L18
        L33:
            qd.s r4 = r4.f10923m
            r0.add(r4)
            java.util.Iterator r4 = r1.iterator()
        L3c:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r4.next()
            qd.l r1 = (qd.l) r1
            if (r1 == r5) goto L3c
            r1.getClass()
            boolean r2 = r1 instanceof qd.r
            if (r2 == 0) goto L3c
            qd.r r1 = (qd.r) r1
            qd.s r1 = r1.f10923m
            r0.add(r1)
            goto L3c
        L59:
            r3.f10933b = r0
            return
    }

    public abstract boolean a(androidx.lifecycle.e0 r1);

    public final java.lang.String toString() {
            r5 = this;
            ud.p r0 = r5.f10932a
            pd.k r0 = r0.f13713k
            java.lang.String r0 = java.lang.String.valueOf(r0)
            me.a r1 = new me.a
            r2 = 8
            r1.<init>(r2)
            java.lang.String r2 = ", "
            java.util.ArrayList r3 = r5.f10933b
            java.lang.String r1 = xe.s.k(r3, r2, r1)
            java.lang.String r2 = ":"
            java.lang.String r3 = ")"
            java.lang.String r4 = "("
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
    }
}
