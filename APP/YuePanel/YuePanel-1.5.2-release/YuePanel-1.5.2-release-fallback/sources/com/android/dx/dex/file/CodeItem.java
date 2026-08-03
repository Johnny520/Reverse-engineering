package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class CodeItem extends com.android.dx.dex.file.OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int HEADER_SIZE = 16;
    private com.android.dx.dex.file.CatchStructs catches;
    private final com.android.dx.dex.code.DalvCode code;
    private com.android.dx.dex.file.DebugInfoItem debugInfo;
    private final boolean isStatic;
    private final com.android.dx.rop.cst.CstMethodRef ref;
    private final com.android.dx.rop.type.TypeList throwsList;


    public CodeItem(com.android.dx.rop.cst.CstMethodRef r3, com.android.dx.dex.code.DalvCode r4, boolean r5, com.android.dx.rop.type.TypeList r6) {
            r2 = this;
            r0 = 4
            r1 = -1
            r2.<init>(r0, r1)
            if (r3 == 0) goto L29
            if (r4 == 0) goto L21
            if (r6 == 0) goto L19
            r2.ref = r3
            r2.code = r4
            r2.isStatic = r5
            r2.throwsList = r6
            r3 = 0
            r2.catches = r3
            r2.debugInfo = r3
            return
        L19:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "throwsList == null"
            r3.<init>(r4)
            throw r3
        L21:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "code == null"
            r3.<init>(r4)
            throw r3
        L29:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "ref == null"
            r3.<init>(r4)
            throw r3
    }

    private int getInsSize() {
            r2 = this;
            com.android.dx.rop.cst.CstMethodRef r0 = r2.ref
            boolean r1 = r2.isStatic
            int r0 = r0.getParameterWordCount(r1)
            return r0
    }

    private int getOutsSize() {
            r1 = this;
            com.android.dx.dex.code.DalvCode r0 = r1.code
            com.android.dx.dex.code.DalvInsnList r0 = r0.getInsns()
            int r0 = r0.getOutsSize()
            return r0
    }

    private int getRegistersSize() {
            r1 = this;
            com.android.dx.dex.code.DalvCode r0 = r1.code
            com.android.dx.dex.code.DalvInsnList r0 = r0.getInsns()
            int r0 = r0.getRegistersSize()
            return r0
    }

    private void writeCodes(com.android.dx.dex.file.DexFile r2, com.android.dx.util.AnnotatedOutput r3) {
            r1 = this;
            com.android.dx.dex.code.DalvCode r2 = r1.code
            com.android.dx.dex.code.DalvInsnList r2 = r2.getInsns()
            r2.writeTo(r3)     // Catch: java.lang.RuntimeException -> La
            return
        La:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "...while writing instructions for "
            r3.append(r0)
            com.android.dx.rop.cst.CstMethodRef r0 = r1.ref
            java.lang.String r0 = r0.toHuman()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.android.dex.util.ExceptionWithContext r2 = com.android.dex.util.ExceptionWithContext.withContext(r2, r3)
            throw r2
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r7) {
            r6 = this;
            com.android.dx.dex.file.MixedItemSection r0 = r7.getByteData()
            com.android.dx.dex.file.TypeIdsSection r1 = r7.getTypeIds()
            com.android.dx.dex.code.DalvCode r2 = r6.code
            boolean r2 = r2.hasPositions()
            if (r2 != 0) goto L18
            com.android.dx.dex.code.DalvCode r2 = r6.code
            boolean r2 = r2.hasLocals()
            if (r2 == 0) goto L28
        L18:
            com.android.dx.dex.file.DebugInfoItem r2 = new com.android.dx.dex.file.DebugInfoItem
            com.android.dx.dex.code.DalvCode r3 = r6.code
            boolean r4 = r6.isStatic
            com.android.dx.rop.cst.CstMethodRef r5 = r6.ref
            r2.<init>(r3, r4, r5)
            r6.debugInfo = r2
            r0.add(r2)
        L28:
            com.android.dx.dex.code.DalvCode r0 = r6.code
            boolean r0 = r0.hasAnyCatches()
            if (r0 == 0) goto L53
            com.android.dx.dex.code.DalvCode r0 = r6.code
            java.util.HashSet r0 = r0.getCatchTypes()
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r0.next()
            com.android.dx.rop.type.Type r2 = (com.android.dx.rop.type.Type) r2
            r1.intern(r2)
            goto L3a
        L4a:
            com.android.dx.dex.file.CatchStructs r0 = new com.android.dx.dex.file.CatchStructs
            com.android.dx.dex.code.DalvCode r1 = r6.code
            r0.<init>(r1)
            r6.catches = r0
        L53:
            com.android.dx.dex.code.DalvCode r0 = r6.code
            java.util.HashSet r0 = r0.getInsnConstants()
            java.util.Iterator r0 = r0.iterator()
        L5d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            com.android.dx.rop.cst.Constant r1 = (com.android.dx.rop.cst.Constant) r1
            r7.internIfAppropriate(r1)
            goto L5d
        L6d:
            return
    }

    public void debugPrint(java.io.PrintWriter r4, java.lang.String r5, boolean r6) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dx.rop.cst.CstMethodRef r1 = r3.ref
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.println(r0)
            com.android.dx.dex.code.DalvCode r0 = r3.code
            com.android.dx.dex.code.DalvInsnList r0 = r0.getInsns()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "regs: "
            r1.append(r2)
            int r2 = r3.getRegistersSize()
            java.lang.String r2 = com.android.dx.util.Hex.u2(r2)
            r1.append(r2)
            java.lang.String r2 = "; ins: "
            r1.append(r2)
            int r2 = r3.getInsSize()
            java.lang.String r2 = com.android.dx.util.Hex.u2(r2)
            r1.append(r2)
            java.lang.String r2 = "; outs: "
            r1.append(r2)
            int r2 = r3.getOutsSize()
            java.lang.String r2 = com.android.dx.util.Hex.u2(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.println(r1)
            r0.debugPrint(r4, r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r0 = "  "
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.android.dx.dex.file.CatchStructs r0 = r3.catches
            if (r0 == 0) goto L81
            r4.print(r5)
            java.lang.String r0 = "catches"
            r4.println(r0)
            com.android.dx.dex.file.CatchStructs r0 = r3.catches
            r0.debugPrint(r4, r6)
        L81:
            com.android.dx.dex.file.DebugInfoItem r0 = r3.debugInfo
            if (r0 == 0) goto L92
            r4.print(r5)
            java.lang.String r5 = "debug info"
            r4.println(r5)
            com.android.dx.dex.file.DebugInfoItem r5 = r3.debugInfo
            r5.debugPrint(r4, r6)
        L92:
            return
    }

    public com.android.dx.rop.cst.CstMethodRef getRef() {
            r1 = this;
            com.android.dx.rop.cst.CstMethodRef r0 = r1.ref
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_CODE_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void place0(com.android.dx.dex.file.Section r2, int r3) {
            r1 = this;
            com.android.dx.dex.file.DexFile r2 = r2.getFile()
            com.android.dx.dex.code.DalvCode r3 = r1.code
            com.android.dx.dex.file.CodeItem$1 r0 = new com.android.dx.dex.file.CodeItem$1
            r0.<init>(r1, r2)
            r3.assignIndices(r0)
            com.android.dx.dex.file.CatchStructs r3 = r1.catches
            if (r3 == 0) goto L1c
            r3.encode(r2)
            com.android.dx.dex.file.CatchStructs r2 = r1.catches
            int r2 = r2.writeSize()
            goto L1d
        L1c:
            r2 = 0
        L1d:
            com.android.dx.dex.code.DalvCode r3 = r1.code
            com.android.dx.dex.code.DalvInsnList r3 = r3.getInsns()
            int r3 = r3.codeSize()
            r0 = r3 & 1
            if (r0 == 0) goto L2d
            int r3 = r3 + 1
        L2d:
            int r3 = r3 * 2
            int r3 = r3 + 16
            int r3 = r3 + r2
            r1.setWriteSize(r3)
            return
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public java.lang.String toHuman() {
            r1 = this;
            com.android.dx.rop.cst.CstMethodRef r0 = r1.ref
            java.lang.String r0 = r0.toHuman()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CodeItem{"
            r0.append(r1)
            java.lang.String r1 = r2.toHuman()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(com.android.dx.dex.file.DexFile r14, com.android.dx.util.AnnotatedOutput r15) {
            r13 = this;
            boolean r0 = r15.annotates()
            int r1 = r13.getRegistersSize()
            int r2 = r13.getOutsSize()
            int r3 = r13.getInsSize()
            com.android.dx.dex.code.DalvCode r4 = r13.code
            com.android.dx.dex.code.DalvInsnList r4 = r4.getInsns()
            int r4 = r4.codeSize()
            r5 = r4 & 1
            r6 = 0
            if (r5 == 0) goto L21
            r5 = 1
            goto L22
        L21:
            r5 = r6
        L22:
            com.android.dx.dex.file.CatchStructs r7 = r13.catches
            if (r7 != 0) goto L28
            r7 = r6
            goto L2c
        L28:
            int r7 = r7.triesSize()
        L2c:
            com.android.dx.dex.file.DebugInfoItem r8 = r13.debugInfo
            if (r8 != 0) goto L32
            r8 = r6
            goto L36
        L32:
            int r8 = r8.getAbsoluteOffset()
        L36:
            r9 = 2
            if (r0 == 0) goto L10d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r13.offsetString()
            r10.append(r11)
            r11 = 32
            r10.append(r11)
            com.android.dx.rop.cst.CstMethodRef r11 = r13.ref
            java.lang.String r11 = r11.toHuman()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r15.annotate(r6, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "  registers_size: "
            r10.append(r11)
            java.lang.String r11 = com.android.dx.util.Hex.u2(r1)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r15.annotate(r9, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "  ins_size:       "
            r10.append(r11)
            java.lang.String r11 = com.android.dx.util.Hex.u2(r3)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r15.annotate(r9, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "  outs_size:      "
            r10.append(r11)
            java.lang.String r11 = com.android.dx.util.Hex.u2(r2)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r15.annotate(r9, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "  tries_size:     "
            r10.append(r11)
            java.lang.String r11 = com.android.dx.util.Hex.u2(r7)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r15.annotate(r9, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "  debug_off:      "
            r10.append(r11)
            java.lang.String r11 = com.android.dx.util.Hex.u4(r8)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r11 = 4
            r15.annotate(r11, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "  insns_size:     "
            r10.append(r12)
            java.lang.String r12 = com.android.dx.util.Hex.u4(r4)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r15.annotate(r11, r10)
            com.android.dx.rop.type.TypeList r10 = r13.throwsList
            int r10 = r10.size()
            if (r10 == 0) goto L10d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "  throws "
            r10.append(r11)
            com.android.dx.rop.type.TypeList r11 = r13.throwsList
            java.lang.String r11 = com.android.dx.rop.type.StdTypeList.toHuman(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r15.annotate(r6, r10)
        L10d:
            r15.writeShort(r1)
            r15.writeShort(r3)
            r15.writeShort(r2)
            r15.writeShort(r7)
            r15.writeInt(r8)
            r15.writeInt(r4)
            r13.writeCodes(r14, r15)
            com.android.dx.dex.file.CatchStructs r1 = r13.catches
            if (r1 == 0) goto L137
            if (r5 == 0) goto L132
            if (r0 == 0) goto L12f
            java.lang.String r1 = "  padding: 0"
            r15.annotate(r9, r1)
        L12f:
            r15.writeShort(r6)
        L132:
            com.android.dx.dex.file.CatchStructs r1 = r13.catches
            r1.writeTo(r14, r15)
        L137:
            if (r0 == 0) goto L149
            com.android.dx.dex.file.DebugInfoItem r0 = r13.debugInfo
            if (r0 == 0) goto L149
            java.lang.String r0 = "  debug info"
            r15.annotate(r6, r0)
            com.android.dx.dex.file.DebugInfoItem r0 = r13.debugInfo
            java.lang.String r1 = "    "
            r0.annotateTo(r14, r15, r1)
        L149:
            return
    }
}
