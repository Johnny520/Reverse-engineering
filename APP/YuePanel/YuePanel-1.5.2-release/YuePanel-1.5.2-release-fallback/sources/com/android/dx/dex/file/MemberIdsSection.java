package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public abstract class MemberIdsSection extends com.android.dx.dex.file.UniformItemSection {
    public MemberIdsSection(java.lang.String r2, com.android.dx.dex.file.DexFile r3) {
            r1 = this;
            r0 = 4
            r1.<init>(r2, r3, r0)
            return
    }

    private java.lang.String getTooManyMembersMessage() {
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.util.Collection r1 = r6.items()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            com.android.dx.dex.file.MemberIdItem r2 = (com.android.dx.dex.file.MemberIdItem) r2
            com.android.dx.rop.cst.CstType r2 = r2.getDefiningClass()
            java.lang.String r2 = r2.getPackageName()
            java.lang.Object r3 = r0.get(r2)
            java.util.concurrent.atomic.AtomicInteger r3 = (java.util.concurrent.atomic.AtomicInteger) r3
            if (r3 != 0) goto L31
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r3.<init>()
            r0.put(r2, r3)
        L31:
            r3.incrementAndGet()
            goto Ld
        L35:
            java.util.Formatter r1 = new java.util.Formatter
            r1.<init>()
            boolean r2 = r6 instanceof com.android.dx.dex.file.MethodIdsSection     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L43
            java.lang.String r2 = "method"
            goto L45
        L41:
            r0 = move-exception
            goto L98
        L43:
            java.lang.String r2 = "field"
        L45:
            java.lang.String r3 = "Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:"
            java.util.Collection r4 = r6.items()     // Catch: java.lang.Throwable -> L41
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L41
            r5 = 65536(0x10000, float:9.1835E-41)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L41
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4, r5}     // Catch: java.lang.Throwable -> L41
            r1.format(r3, r2)     // Catch: java.lang.Throwable -> L41
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L41
        L68:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L90
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L41
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = "%n%6d %s"
            java.lang.Object r4 = r2.getValue()     // Catch: java.lang.Throwable -> L41
            java.util.concurrent.atomic.AtomicInteger r4 = (java.util.concurrent.atomic.AtomicInteger) r4     // Catch: java.lang.Throwable -> L41
            int r4 = r4.get()     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L41
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2}     // Catch: java.lang.Throwable -> L41
            r1.format(r3, r2)     // Catch: java.lang.Throwable -> L41
            goto L68
        L90:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L41
            r1.close()
            return r0
        L98:
            r1.close()
            throw r0
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public void orderItems() {
            r3 = this;
            java.util.Collection r0 = r3.items()
            int r0 = r0.size()
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 > r1) goto L28
            java.util.Collection r0 = r3.items()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()
            com.android.dx.dex.file.MemberIdItem r2 = (com.android.dx.dex.file.MemberIdItem) r2
            r2.setIndex(r1)
            int r1 = r1 + 1
            goto L15
        L27:
            return
        L28:
            com.android.dex.DexIndexOverflowException r0 = new com.android.dex.DexIndexOverflowException
            java.lang.String r1 = r3.getTooManyMembersMessage()
            r0.<init>(r1)
            throw r0
    }
}
