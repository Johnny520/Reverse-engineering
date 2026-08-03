package ze;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements java.lang.Iterable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ud.r f22679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.BitSet f22680h;

    public c(ud.r r2) {
            r1 = this;
            r1.<init>()
            r1.f22679g = r2
            java.util.BitSet r0 = new java.util.BitSet
            java.util.List r2 = r2.f13732z
            int r2 = r2.size()
            r0.<init>(r2)
            r1.f22680h = r0
            return
    }

    public final void a(ud.a r2) {
            r1 = this;
            java.util.BitSet r0 = r1.f22680h
            int r2 = r2.f13672j
            r0.set(r2)
            return
    }

    public final boolean b(ud.a r2) {
            r1 = this;
            java.util.BitSet r0 = r1.f22680h
            int r2 = r2.f13672j
            boolean r2 = r0.get(r2)
            return r2
    }

    public final java.util.List c() {
            r5 = this;
            java.util.BitSet r0 = r5.f22680h
            if (r0 == 0) goto L2f
            xe.g r1 = xe.g.f21560g
            if (r0 != r1) goto L9
            goto L2f
        L9:
            int r1 = r0.cardinality()
            if (r1 != 0) goto L12
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
        L12:
            ud.r r2 = r5.f22679g
            java.util.List r2 = r2.f13732z
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            r1 = 0
        L1c:
            int r1 = r0.nextSetBit(r1)
            if (r1 < 0) goto L2e
            java.lang.Object r4 = r2.get(r1)
            ud.a r4 = (ud.a) r4
            r3.add(r4)
            int r1 = r1 + 1
            goto L1c
        L2e:
            return r3
        L2f:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // java.lang.Iterable
    public final void forEach(java.util.function.Consumer r5) {
            r4 = this;
            java.util.BitSet r0 = r4.f22680h
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L9
            goto L1e
        L9:
            ud.r r1 = r4.f22679g
            java.util.List r1 = r1.f13732z
            r2 = 0
        Le:
            int r2 = r0.nextSetBit(r2)
            if (r2 < 0) goto L1e
            java.lang.Object r3 = r1.get(r2)
            r5.accept(r3)
            int r2 = r2 + 1
            goto Le
        L1e:
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            ze.b r0 = new ze.b
            java.util.BitSet r1 = r4.f22680h
            int r2 = r1.cardinality()
            ud.r r3 = r4.f22679g
            java.util.List r3 = r3.f13732z
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Spliterator spliterator() {
            r4 = this;
            java.util.BitSet r0 = r4.f22680h
            int r1 = r0.cardinality()
            ze.b r2 = new ze.b
            ud.r r3 = r4.f22679g
            java.util.List r3 = r3.f13732z
            r2.<init>(r0, r1, r3)
            long r0 = (long) r1
            r3 = 17
            java.util.Spliterator r0 = java.util.Spliterators.spliterator(r2, r0, r3)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.util.List r0 = r1.c()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
