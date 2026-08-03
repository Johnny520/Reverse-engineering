package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class MethodHandleItem extends com.android.dx.dex.file.IndexedItem {
    private final int ITEM_SIZE;
    private final com.android.dx.rop.cst.CstMethodHandle methodHandle;

    public MethodHandleItem(com.android.dx.rop.cst.CstMethodHandle r2) {
            r1 = this;
            r1.<init>()
            r0 = 8
            r1.ITEM_SIZE = r0
            r1.methodHandle = r2
            return
    }

    private int getTargetIndex(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            com.android.dx.rop.cst.CstMethodHandle r0 = r2.methodHandle
            com.android.dx.rop.cst.Constant r0 = r0.getRef()
            com.android.dx.rop.cst.CstMethodHandle r1 = r2.methodHandle
            boolean r1 = r1.isAccessor()
            if (r1 == 0) goto L19
            com.android.dx.dex.file.FieldIdsSection r3 = r3.getFieldIds()
            com.android.dx.rop.cst.CstFieldRef r0 = (com.android.dx.rop.cst.CstFieldRef) r0
            int r3 = r3.indexOf(r0)
            return r3
        L19:
            com.android.dx.rop.cst.CstMethodHandle r1 = r2.methodHandle
            boolean r1 = r1.isInvocation()
            if (r1 == 0) goto L36
            boolean r1 = r0 instanceof com.android.dx.rop.cst.CstInterfaceMethodRef
            if (r1 == 0) goto L2b
            com.android.dx.rop.cst.CstInterfaceMethodRef r0 = (com.android.dx.rop.cst.CstInterfaceMethodRef) r0
            com.android.dx.rop.cst.CstMethodRef r0 = r0.toMethodRef()
        L2b:
            com.android.dx.dex.file.MethodIdsSection r3 = r3.getMethodIds()
            com.android.dx.rop.cst.CstBaseMethodRef r0 = (com.android.dx.rop.cst.CstBaseMethodRef) r0
            int r3 = r3.indexOf(r0)
            return r3
        L36:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unhandled invocation type"
            r3.<init>(r0)
            throw r3
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r2) {
            r1 = this;
            com.android.dx.dex.file.MethodHandlesSection r2 = r2.getMethodHandles()
            com.android.dx.rop.cst.CstMethodHandle r0 = r1.methodHandle
            r2.intern(r0)
            return
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_METHOD_HANDLE_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public int writeSize() {
            r1 = this;
            r0 = 8
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public void writeTo(com.android.dx.dex.file.DexFile r9, com.android.dx.util.AnnotatedOutput r10) {
            r8 = this;
            int r0 = r8.getTargetIndex(r9)
            com.android.dx.rop.cst.CstMethodHandle r1 = r8.methodHandle
            int r1 = r1.getMethodHandleType()
            boolean r2 = r10.annotates()
            r3 = 0
            if (r2 == 0) goto Le9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r8.indexString()
            r2.append(r4)
            r4 = 32
            r2.append(r4)
            com.android.dx.rop.cst.CstMethodHandle r4 = r8.methodHandle
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r10.annotate(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = " // "
            r2.append(r4)
            java.lang.String r5 = com.android.dx.rop.cst.CstMethodHandle.getMethodHandleTypeName(r1)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "type:     "
            r5.append(r6)
            java.lang.String r6 = com.android.dx.util.Hex.u2(r1)
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r5 = 2
            r10.annotate(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "reserved: "
            r2.append(r6)
            java.lang.String r7 = com.android.dx.util.Hex.u2(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r10.annotate(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            com.android.dx.rop.cst.CstMethodHandle r4 = r8.methodHandle
            com.android.dx.rop.cst.Constant r4 = r4.getRef()
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.android.dx.rop.cst.CstMethodHandle r4 = r8.methodHandle
            boolean r4 = r4.isAccessor()
            if (r4 == 0) goto Lb8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "fieldId:  "
            r4.append(r7)
            java.lang.String r0 = com.android.dx.util.Hex.u2(r0)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r10.annotate(r5, r0)
            goto Ld3
        Lb8:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "methodId: "
            r4.append(r7)
            java.lang.String r0 = com.android.dx.util.Hex.u2(r0)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r10.annotate(r5, r0)
        Ld3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r2 = com.android.dx.util.Hex.u2(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r10.annotate(r5, r0)
        Le9:
            r10.writeShort(r1)
            r10.writeShort(r3)
            int r9 = r8.getTargetIndex(r9)
            r10.writeShort(r9)
            r10.writeShort(r3)
            return
    }
}
