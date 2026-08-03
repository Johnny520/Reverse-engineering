package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends qe.a {
    @Override // qe.a
    public final boolean a(androidx.lifecycle.e0 r4) {
            r3 = this;
            ud.p r0 = r3.f10932a
            qd.r r1 = r0.f13714l
            qd.j r1 = r4.b(r1)
            java.util.List r0 = r0.f13715m
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r0.next()
            qd.l r2 = (qd.l) r2
            qd.j r2 = r4.b(r2)
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Le
            r4 = 0
            return r4
        L26:
            r4 = 1
            return r4
    }
}
