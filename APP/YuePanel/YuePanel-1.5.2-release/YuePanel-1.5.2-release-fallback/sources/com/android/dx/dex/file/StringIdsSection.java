package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class StringIdsSection extends com.android.dx.dex.file.UniformItemSection {
    private final java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.dex.file.StringIdItem> strings;

    public StringIdsSection(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            java.lang.String r0 = "string_ids"
            r1 = 4
            r2.<init>(r0, r3, r1)
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            r2.strings = r3
            return
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public com.android.dx.dex.file.IndexedItem get(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            if (r2 == 0) goto L1a
            r1.throwIfNotPrepared()
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.dex.file.StringIdItem> r0 = r1.strings
            com.android.dx.rop.cst.CstString r2 = (com.android.dx.rop.cst.CstString) r2
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.dex.file.IndexedItem r2 = (com.android.dx.dex.file.IndexedItem) r2
            if (r2 == 0) goto L12
            return r2
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "not found"
            r2.<init>(r0)
            throw r2
        L1a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "cst == null"
            r2.<init>(r0)
            throw r2
    }

    public int indexOf(com.android.dx.rop.cst.CstString r2) {
            r1 = this;
            if (r2 == 0) goto L1c
            r1.throwIfNotPrepared()
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.dex.file.StringIdItem> r0 = r1.strings
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.dex.file.StringIdItem r2 = (com.android.dx.dex.file.StringIdItem) r2
            if (r2 == 0) goto L14
            int r2 = r2.getIndex()
            return r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "not found"
            r2.<init>(r0)
            throw r2
        L1c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "string == null"
            r2.<init>(r0)
            throw r2
    }

    public synchronized com.android.dx.dex.file.StringIdItem intern(com.android.dx.dex.file.StringIdItem r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L1f
            r2.throwIfPrepared()     // Catch: java.lang.Throwable -> L1d
            com.android.dx.rop.cst.CstString r0 = r3.getValue()     // Catch: java.lang.Throwable -> L1d
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.dex.file.StringIdItem> r1 = r2.strings     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1d
            com.android.dx.dex.file.StringIdItem r1 = (com.android.dx.dex.file.StringIdItem) r1     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L16
            monitor-exit(r2)
            return r1
        L16:
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.dex.file.StringIdItem> r1 = r2.strings     // Catch: java.lang.Throwable -> L1d
            r1.put(r0, r3)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return r3
        L1d:
            r3 = move-exception
            goto L27
        L1f:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = "string == null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public com.android.dx.dex.file.StringIdItem intern(com.android.dx.rop.cst.CstString r2) {
            r1 = this;
            com.android.dx.dex.file.StringIdItem r0 = new com.android.dx.dex.file.StringIdItem
            r0.<init>(r2)
            com.android.dx.dex.file.StringIdItem r2 = r1.intern(r0)
            return r2
    }

    public com.android.dx.dex.file.StringIdItem intern(java.lang.String r3) {
            r2 = this;
            com.android.dx.dex.file.StringIdItem r0 = new com.android.dx.dex.file.StringIdItem
            com.android.dx.rop.cst.CstString r1 = new com.android.dx.rop.cst.CstString
            r1.<init>(r3)
            r0.<init>(r1)
            com.android.dx.dex.file.StringIdItem r3 = r2.intern(r0)
            return r3
    }

    public synchronized void intern(com.android.dx.rop.cst.CstNat r2) {
            r1 = this;
            monitor-enter(r1)
            com.android.dx.rop.cst.CstString r0 = r2.getName()     // Catch: java.lang.Throwable -> L11
            r1.intern(r0)     // Catch: java.lang.Throwable -> L11
            com.android.dx.rop.cst.CstString r2 = r2.getDescriptor()     // Catch: java.lang.Throwable -> L11
            r1.intern(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
    }

    @Override // com.android.dx.dex.file.Section
    public java.util.Collection<? extends com.android.dx.dex.file.Item> items() {
            r1 = this;
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.dex.file.StringIdItem> r0 = r1.strings
            java.util.Collection r0 = r0.values()
            return r0
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public void orderItems() {
            r3 = this;
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.dex.file.StringIdItem> r0 = r3.strings
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r0.next()
            com.android.dx.dex.file.StringIdItem r2 = (com.android.dx.dex.file.StringIdItem) r2
            r2.setIndex(r1)
            int r1 = r1 + 1
            goto Lb
        L1d:
            return
    }

    public void writeHeaderPart(com.android.dx.util.AnnotatedOutput r6) {
            r5 = this;
            r5.throwIfNotPrepared()
            java.util.TreeMap<com.android.dx.rop.cst.CstString, com.android.dx.dex.file.StringIdItem> r0 = r5.strings
            int r0 = r0.size()
            if (r0 != 0) goto Ld
            r1 = 0
            goto L11
        Ld:
            int r1 = r5.getFileOffset()
        L11:
            boolean r2 = r6.annotates()
            if (r2 == 0) goto L48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "string_ids_size: "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 4
            r6.annotate(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "string_ids_off:  "
            r2.append(r4)
            java.lang.String r4 = com.android.dx.util.Hex.u4(r1)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r6.annotate(r3, r2)
        L48:
            r6.writeInt(r0)
            r6.writeInt(r1)
            return
    }
}
