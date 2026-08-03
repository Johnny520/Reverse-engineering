package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class TypeIdsSection extends com.android.dx.dex.file.UniformItemSection {
    private final java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.TypeIdItem> typeIds;

    public TypeIdsSection(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            java.lang.String r0 = "type_ids"
            r1 = 4
            r2.<init>(r0, r3, r1)
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            r2.typeIds = r3
            return
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public com.android.dx.dex.file.IndexedItem get(com.android.dx.rop.cst.Constant r4) {
            r3 = this;
            if (r4 == 0) goto L2e
            r3.throwIfNotPrepared()
            r0 = r4
            com.android.dx.rop.cst.CstType r0 = (com.android.dx.rop.cst.CstType) r0
            com.android.dx.rop.type.Type r0 = r0.getClassType()
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.TypeIdItem> r1 = r3.typeIds
            java.lang.Object r0 = r1.get(r0)
            com.android.dx.dex.file.IndexedItem r0 = (com.android.dx.dex.file.IndexedItem) r0
            if (r0 == 0) goto L17
            return r0
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not found: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2e:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "cst == null"
            r4.<init>(r0)
            throw r4
    }

    public int indexOf(com.android.dx.rop.cst.CstType r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            com.android.dx.rop.type.Type r2 = r2.getClassType()
            int r2 = r1.indexOf(r2)
            return r2
        Lb:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "type == null"
            r2.<init>(r0)
            throw r2
    }

    public int indexOf(com.android.dx.rop.type.Type r4) {
            r3 = this;
            if (r4 == 0) goto L2b
            r3.throwIfNotPrepared()
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.TypeIdItem> r0 = r3.typeIds
            java.lang.Object r0 = r0.get(r4)
            com.android.dx.dex.file.TypeIdItem r0 = (com.android.dx.dex.file.TypeIdItem) r0
            if (r0 == 0) goto L14
            int r4 = r0.getIndex()
            return r4
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not found: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2b:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "type == null"
            r4.<init>(r0)
            throw r4
    }

    public synchronized com.android.dx.dex.file.TypeIdItem intern(com.android.dx.rop.cst.CstType r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L23
            r2.throwIfPrepared()     // Catch: java.lang.Throwable -> L1f
            com.android.dx.rop.type.Type r0 = r3.getClassType()     // Catch: java.lang.Throwable -> L1f
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.TypeIdItem> r1 = r2.typeIds     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
            com.android.dx.dex.file.TypeIdItem r1 = (com.android.dx.dex.file.TypeIdItem) r1     // Catch: java.lang.Throwable -> L1f
            if (r1 != 0) goto L21
            com.android.dx.dex.file.TypeIdItem r1 = new com.android.dx.dex.file.TypeIdItem     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1f
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.TypeIdItem> r3 = r2.typeIds     // Catch: java.lang.Throwable -> L1f
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r3 = move-exception
            goto L2b
        L21:
            monitor-exit(r2)
            return r1
        L23:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "type == null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1f
            throw r3     // Catch: java.lang.Throwable -> L1f
        L2b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            throw r3
    }

    public synchronized com.android.dx.dex.file.TypeIdItem intern(com.android.dx.rop.type.Type r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L24
            r2.throwIfPrepared()     // Catch: java.lang.Throwable -> L20
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.TypeIdItem> r0 = r2.typeIds     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L20
            com.android.dx.dex.file.TypeIdItem r0 = (com.android.dx.dex.file.TypeIdItem) r0     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L22
            com.android.dx.dex.file.TypeIdItem r0 = new com.android.dx.dex.file.TypeIdItem     // Catch: java.lang.Throwable -> L20
            com.android.dx.rop.cst.CstType r1 = new com.android.dx.rop.cst.CstType     // Catch: java.lang.Throwable -> L20
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L20
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.TypeIdItem> r1 = r2.typeIds     // Catch: java.lang.Throwable -> L20
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r3 = move-exception
            goto L2c
        L22:
            monitor-exit(r2)
            return r0
        L24:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = "type == null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L20
            throw r3     // Catch: java.lang.Throwable -> L20
        L2c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    @Override // com.android.dx.dex.file.Section
    public java.util.Collection<? extends com.android.dx.dex.file.Item> items() {
            r1 = this;
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.TypeIdItem> r0 = r1.typeIds
            java.util.Collection r0 = r0.values()
            return r0
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public void orderItems() {
            r3 = this;
            java.util.Collection r0 = r3.items()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r0.next()
            com.android.dx.dex.file.TypeIdItem r2 = (com.android.dx.dex.file.TypeIdItem) r2
            r2.setIndex(r1)
            int r1 = r1 + 1
            goto L9
        L1b:
            return
    }

    public void writeHeaderPart(com.android.dx.util.AnnotatedOutput r6) {
            r5 = this;
            r5.throwIfNotPrepared()
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.TypeIdItem> r0 = r5.typeIds
            int r0 = r0.size()
            if (r0 != 0) goto Ld
            r1 = 0
            goto L11
        Ld:
            int r1 = r5.getFileOffset()
        L11:
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r0 > r2) goto L53
            boolean r2 = r6.annotates()
            if (r2 == 0) goto L4c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "type_ids_size:   "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 4
            r6.annotate(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "type_ids_off:    "
            r2.append(r4)
            java.lang.String r4 = com.android.dx.util.Hex.u4(r1)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r6.annotate(r3, r2)
        L4c:
            r6.writeInt(r0)
            r6.writeInt(r1)
            return
        L53:
            com.android.dex.DexIndexOverflowException r6 = new com.android.dex.DexIndexOverflowException
            java.util.Collection r0 = r5.items()
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r6.<init>(r0)
            throw r6
    }
}
