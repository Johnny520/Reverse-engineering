package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class ClassDefsSection extends com.android.dx.dex.file.UniformItemSection {
    private final java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.ClassDefItem> classDefs;
    private java.util.ArrayList<com.android.dx.dex.file.ClassDefItem> orderedDefs;

    public ClassDefsSection(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            java.lang.String r0 = "class_defs"
            r1 = 4
            r2.<init>(r0, r3, r1)
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            r2.classDefs = r3
            r3 = 0
            r2.orderedDefs = r3
            return
    }

    private int orderItems0(com.android.dx.rop.type.Type r5, int r6, int r7) {
            r4 = this;
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.ClassDefItem> r0 = r4.classDefs
            java.lang.Object r0 = r0.get(r5)
            com.android.dx.dex.file.ClassDefItem r0 = (com.android.dx.dex.file.ClassDefItem) r0
            if (r0 == 0) goto L5b
            boolean r1 = r0.hasIndex()
            if (r1 == 0) goto L11
            goto L5b
        L11:
            if (r7 < 0) goto L44
            int r7 = r7 + (-1)
            com.android.dx.rop.cst.CstType r5 = r0.getSuperclass()
            if (r5 == 0) goto L23
            com.android.dx.rop.type.Type r5 = r5.getClassType()
            int r6 = r4.orderItems0(r5, r6, r7)
        L23:
            com.android.dx.rop.type.TypeList r5 = r0.getInterfaces()
            int r1 = r5.size()
            r2 = 0
        L2c:
            if (r2 >= r1) goto L39
            com.android.dx.rop.type.Type r3 = r5.getType(r2)
            int r6 = r4.orderItems0(r3, r6, r7)
            int r2 = r2 + 1
            goto L2c
        L39:
            r0.setIndex(r6)
            java.util.ArrayList<com.android.dx.dex.file.ClassDefItem> r5 = r4.orderedDefs
            r5.add(r0)
            int r6 = r6 + 1
            return r6
        L44:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "class circularity with "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L5b:
            return r6
    }

    public void add(com.android.dx.dex.file.ClassDefItem r4) {
            r3 = this;
            com.android.dx.rop.cst.CstType r0 = r4.getThisClass()     // Catch: java.lang.NullPointerException -> L30
            com.android.dx.rop.type.Type r0 = r0.getClassType()     // Catch: java.lang.NullPointerException -> L30
            r3.throwIfPrepared()
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.ClassDefItem> r1 = r3.classDefs
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L19
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.ClassDefItem> r1 = r3.classDefs
            r1.put(r0, r4)
            return
        L19:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "already added: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L30:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "clazz == null"
            r4.<init>(r0)
            throw r4
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public com.android.dx.dex.file.IndexedItem get(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            if (r2 == 0) goto L1e
            r1.throwIfNotPrepared()
            com.android.dx.rop.cst.CstType r2 = (com.android.dx.rop.cst.CstType) r2
            com.android.dx.rop.type.Type r2 = r2.getClassType()
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.ClassDefItem> r0 = r1.classDefs
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.dex.file.IndexedItem r2 = (com.android.dx.dex.file.IndexedItem) r2
            if (r2 == 0) goto L16
            return r2
        L16:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "not found"
            r2.<init>(r0)
            throw r2
        L1e:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "cst == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.dex.file.Section
    public java.util.Collection<? extends com.android.dx.dex.file.Item> items() {
            r1 = this;
            java.util.ArrayList<com.android.dx.dex.file.ClassDefItem> r0 = r1.orderedDefs
            if (r0 == 0) goto L5
            return r0
        L5:
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.ClassDefItem> r0 = r1.classDefs
            java.util.Collection r0 = r0.values()
            return r0
    }

    @Override // com.android.dx.dex.file.UniformItemSection
    public void orderItems() {
            r5 = this;
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.ClassDefItem> r0 = r5.classDefs
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r5.orderedDefs = r1
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.ClassDefItem> r1 = r5.classDefs
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L18:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r1.next()
            com.android.dx.rop.type.Type r3 = (com.android.dx.rop.type.Type) r3
            int r4 = r0 - r2
            int r2 = r5.orderItems0(r3, r2, r4)
            goto L18
        L2b:
            return
    }

    public void writeHeaderPart(com.android.dx.util.AnnotatedOutput r6) {
            r5 = this;
            r5.throwIfNotPrepared()
            java.util.TreeMap<com.android.dx.rop.type.Type, com.android.dx.dex.file.ClassDefItem> r0 = r5.classDefs
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
            java.lang.String r3 = "class_defs_size: "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 4
            r6.annotate(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "class_defs_off:  "
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
