package k6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class t0 extends h6.n {
    public t0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // h6.n
    public final void b(o6.a r5, java.lang.Object r6) {
            r4 = this;
            java.util.BitSet r6 = (java.util.BitSet) r6
            r5.b()
            int r0 = r6.length()
            r1 = 0
        La:
            if (r1 >= r0) goto L17
            boolean r2 = r6.get(r1)
            long r2 = (long) r2
            r5.u(r2)
            int r1 = r1 + 1
            goto La
        L17:
            r5.g()
            return
    }
}
