package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 extends r4.u0 {
    @Override // r4.u0
    public final void k() {
            r9 = this;
            java.util.Collection r0 = r9.c()
            int r0 = r0.size()
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto Lca
            e4.b r0 = new e4.b
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            java.util.Collection r3 = r9.c()
            java.util.Iterator r3 = r3.iterator()
        L1b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L61
            java.lang.Object r4 = r3.next()
            r4.d0 r4 = (r4.d0) r4
            v4.d0 r4 = r4.f11515h
            v4.c0 r4 = r4.k()
            java.lang.String r4 = r4.f14067g
            r5 = 47
            int r6 = r4.lastIndexOf(r5)
            r7 = 91
            int r7 = r4.lastIndexOf(r7)
            r8 = -1
            if (r6 != r8) goto L41
            java.lang.String r4 = "default"
            goto L4d
        L41:
            int r7 = r7 + 2
            java.lang.String r4 = r4.substring(r7, r6)
            r6 = 46
            java.lang.String r4 = r4.replace(r5, r6)
        L4d:
            java.lang.Object r5 = r2.get(r4)
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            if (r5 != 0) goto L5d
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r5.<init>()
            r2.put(r4, r5)
        L5d:
            r5.incrementAndGet()
            goto L1b
        L61:
            java.util.Formatter r3 = new java.util.Formatter
            r3.<init>()
            boolean r4 = r9 instanceof r4.j0     // Catch: java.lang.Throwable -> L6d
            if (r4 == 0) goto L6f
            java.lang.String r4 = "method"
            goto L71
        L6d:
            r0 = move-exception
            goto Lc6
        L6f:
            java.lang.String r4 = "field"
        L71:
            java.lang.String r5 = "Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:"
            java.util.Collection r6 = r9.c()     // Catch: java.lang.Throwable -> L6d
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L6d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L6d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r6, r1}     // Catch: java.lang.Throwable -> L6d
            r3.format(r5, r1)     // Catch: java.lang.Throwable -> L6d
            java.util.Set r1 = r2.entrySet()     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6d
        L92:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto Lba
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L6d
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = "%n%6d %s"
            java.lang.Object r5 = r2.getValue()     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5     // Catch: java.lang.Throwable -> L6d
            int r5 = r5.get()     // Catch: java.lang.Throwable -> L6d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L6d
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r2}     // Catch: java.lang.Throwable -> L6d
            r3.format(r4, r2)     // Catch: java.lang.Throwable -> L6d
            goto L92
        Lba:
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L6d
            r3.close()
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        Lc6:
            r3.close()
            throw r0
        Lca:
            java.util.Collection r0 = r9.c()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Ld3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Le5
            java.lang.Object r2 = r0.next()
            r4.d0 r2 = (r4.d0) r2
            r2.g(r1)
            int r1 = r1 + 1
            goto Ld3
        Le5:
            return
    }
}
