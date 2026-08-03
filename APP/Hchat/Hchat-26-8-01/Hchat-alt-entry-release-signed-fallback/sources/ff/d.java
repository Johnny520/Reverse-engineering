package ff;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements lc.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.List f3930g;

    public d(java.util.List r1) {
            r0 = this;
            r0.<init>()
            r0.f3930g = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // lc.a
    public final boolean isEmpty() {
            r1 = this;
            java.util.List r0 = r1.f3930g
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // lc.a
    public final void n(ud.t r7) {
            r6 = this;
            java.util.List r0 = r6.f3930g
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            ff.e r1 = (ff.e) r1
            jf.e r2 = r1.f3934d
            int r3 = r2.f6877a
            if (r3 != 0) goto L19
            goto L6
        L19:
            int r2 = r2.f6878b
            ac.k r4 = new ac.k
            r4.<init>(r1, r2)
            f.r r1 = new f.r
            ac.k r2 = r4.g()
            ac.k r5 = r4.g()
            r1.<init>(r2, r5)
            jf.b r2 = new jf.b
            r2.<init>(r4, r1)
            r1 = 0
        L33:
            if (r1 >= r3) goto L6
            r7.accept(r2)
            int r5 = r4.f177h
            int r5 = r5 + 32
            r4.f177h = r5
            int r1 = r1 + 1
            goto L33
        L41:
            return
    }
}
