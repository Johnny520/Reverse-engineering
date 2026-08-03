package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class ProtoIdsSection extends com.android.dx.dex.file.UniformItemSection {
    private final java.util.TreeMap<com.android.dx.rop.type.Prototype, com.android.dx.dex.file.ProtoIdItem> protoIds;

    public ProtoIdsSection(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            java.lang.String r0 = "proto_ids"
            r1 = 4
            r2.<init>(r0, r3, r1)
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            r2.protoIds = r3
            return
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public com.android.dx.dex.file.IndexedItem get(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            if (r2 == 0) goto L2a
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstProtoRef
            if (r0 == 0) goto L22
            r1.throwIfNotPrepared()
            com.android.dx.rop.cst.CstProtoRef r2 = (com.android.dx.rop.cst.CstProtoRef) r2
            java.util.TreeMap<com.android.dx.rop.type.Prototype, com.android.dx.dex.file.ProtoIdItem> r0 = r1.protoIds
            com.android.dx.rop.type.Prototype r2 = r2.getPrototype()
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.dex.file.IndexedItem r2 = (com.android.dx.dex.file.IndexedItem) r2
            if (r2 == 0) goto L1a
            return r2
        L1a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "not found"
            r2.<init>(r0)
            throw r2
        L22:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "cst not instance of CstProtoRef"
            r2.<init>(r0)
            throw r2
        L2a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "cst == null"
            r2.<init>(r0)
            throw r2
    }

    public int indexOf(com.android.dx.rop.type.Prototype r2) {
            r1 = this;
            if (r2 == 0) goto L1c
            r1.throwIfNotPrepared()
            java.util.TreeMap<com.android.dx.rop.type.Prototype, com.android.dx.dex.file.ProtoIdItem> r0 = r1.protoIds
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.dex.file.ProtoIdItem r2 = (com.android.dx.dex.file.ProtoIdItem) r2
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
            java.lang.String r0 = "prototype == null"
            r2.<init>(r0)
            throw r2
    }

    public synchronized com.android.dx.dex.file.ProtoIdItem intern(com.android.dx.rop.type.Prototype r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L1f
            r2.throwIfPrepared()     // Catch: java.lang.Throwable -> L1b
            java.util.TreeMap<com.android.dx.rop.type.Prototype, com.android.dx.dex.file.ProtoIdItem> r0 = r2.protoIds     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L1b
            com.android.dx.dex.file.ProtoIdItem r0 = (com.android.dx.dex.file.ProtoIdItem) r0     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1d
            com.android.dx.dex.file.ProtoIdItem r0 = new com.android.dx.dex.file.ProtoIdItem     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            java.util.TreeMap<com.android.dx.rop.type.Prototype, com.android.dx.dex.file.ProtoIdItem> r1 = r2.protoIds     // Catch: java.lang.Throwable -> L1b
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
            java.lang.String r0 = "prototype == null"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3     // Catch: java.lang.Throwable -> L1b
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    @Override // com.android.dx.dex.file.Section
    public java.util.Collection<? extends com.android.dx.dex.file.Item> items() {
            r1 = this;
            java.util.TreeMap<com.android.dx.rop.type.Prototype, com.android.dx.dex.file.ProtoIdItem> r0 = r1.protoIds
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
            com.android.dx.dex.file.ProtoIdItem r2 = (com.android.dx.dex.file.ProtoIdItem) r2
            r2.setIndex(r1)
            int r1 = r1 + 1
            goto L9
        L1b:
            return
    }

    public void writeHeaderPart(com.android.dx.util.AnnotatedOutput r6) {
            r5 = this;
            r5.throwIfNotPrepared()
            java.util.TreeMap<com.android.dx.rop.type.Prototype, com.android.dx.dex.file.ProtoIdItem> r0 = r5.protoIds
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
            java.lang.String r3 = "proto_ids_size:  "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 4
            r6.annotate(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "proto_ids_off:   "
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
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "too many proto ids"
            r6.<init>(r0)
            throw r6
    }
}
