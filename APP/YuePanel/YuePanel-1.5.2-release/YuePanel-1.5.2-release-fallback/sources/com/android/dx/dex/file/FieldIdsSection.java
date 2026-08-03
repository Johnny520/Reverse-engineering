package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class FieldIdsSection extends com.android.dx.dex.file.MemberIdsSection {
    private final java.util.TreeMap<com.android.dx.rop.cst.CstFieldRef, com.android.dx.dex.file.FieldIdItem> fieldIds;

    public FieldIdsSection(com.android.dx.dex.file.DexFile r2) {
            r1 = this;
            java.lang.String r0 = "field_ids"
            r1.<init>(r0, r2)
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r1.fieldIds = r2
            return
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public com.android.dx.dex.file.IndexedItem get(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            if (r2 == 0) goto L1a
            r1.throwIfNotPrepared()
            java.util.TreeMap<com.android.dx.rop.cst.CstFieldRef, com.android.dx.dex.file.FieldIdItem> r0 = r1.fieldIds
            com.android.dx.rop.cst.CstFieldRef r2 = (com.android.dx.rop.cst.CstFieldRef) r2
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

    public int indexOf(com.android.dx.rop.cst.CstFieldRef r2) {
            r1 = this;
            if (r2 == 0) goto L1c
            r1.throwIfNotPrepared()
            java.util.TreeMap<com.android.dx.rop.cst.CstFieldRef, com.android.dx.dex.file.FieldIdItem> r0 = r1.fieldIds
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.dex.file.FieldIdItem r2 = (com.android.dx.dex.file.FieldIdItem) r2
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
            java.lang.String r0 = "ref == null"
            r2.<init>(r0)
            throw r2
    }

    public synchronized com.android.dx.dex.file.FieldIdItem intern(com.android.dx.rop.cst.CstFieldRef r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L1f
            r2.throwIfPrepared()     // Catch: java.lang.Throwable -> L1b
            java.util.TreeMap<com.android.dx.rop.cst.CstFieldRef, com.android.dx.dex.file.FieldIdItem> r0 = r2.fieldIds     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L1b
            com.android.dx.dex.file.FieldIdItem r0 = (com.android.dx.dex.file.FieldIdItem) r0     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1d
            com.android.dx.dex.file.FieldIdItem r0 = new com.android.dx.dex.file.FieldIdItem     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            java.util.TreeMap<com.android.dx.rop.cst.CstFieldRef, com.android.dx.dex.file.FieldIdItem> r1 = r2.fieldIds     // Catch: java.lang.Throwable -> L1b
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L27
        L1d:
            monitor-exit(r2)
            return r0
        L1f:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "field == null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3     // Catch: java.lang.Throwable -> L1b
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    @Override // com.android.dx.dex.file.Section
    public java.util.Collection<? extends com.android.dx.dex.file.Item> items() {
            r1 = this;
            java.util.TreeMap<com.android.dx.rop.cst.CstFieldRef, com.android.dx.dex.file.FieldIdItem> r0 = r1.fieldIds
            java.util.Collection r0 = r0.values()
            return r0
    }

    public void writeHeaderPart(com.android.dx.util.AnnotatedOutput r6) {
            r5 = this;
            r5.throwIfNotPrepared()
            java.util.TreeMap<com.android.dx.rop.cst.CstFieldRef, com.android.dx.dex.file.FieldIdItem> r0 = r5.fieldIds
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
            java.lang.String r3 = "field_ids_size:  "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 4
            r6.annotate(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "field_ids_off:   "
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
