package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public class DebugInfoItem extends com.android.dx.dex.file.OffsettedItem {
    private static final int ALIGNMENT = 1;
    private static final boolean ENABLE_ENCODER_SELF_CHECK = false;
    private final com.android.dx.dex.code.DalvCode code;
    private byte[] encoded;
    private final boolean isStatic;
    private final com.android.dx.rop.cst.CstMethodRef ref;

    public DebugInfoItem(com.android.dx.dex.code.DalvCode r3, boolean r4, com.android.dx.rop.cst.CstMethodRef r5) {
            r2 = this;
            r0 = 1
            r1 = -1
            r2.<init>(r0, r1)
            if (r3 == 0) goto Le
            r2.code = r3
            r2.isStatic = r4
            r2.ref = r5
            return
        Le:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "code == null"
            r3.<init>(r4)
            throw r3
    }

    private byte[] encode(com.android.dx.dex.file.DexFile r1, java.lang.String r2, java.io.PrintWriter r3, com.android.dx.util.AnnotatedOutput r4, boolean r5) {
            r0 = this;
            byte[] r1 = r0.encode0(r1, r2, r3, r4, r5)
            return r1
    }

    private byte[] encode0(com.android.dx.dex.file.DexFile r10, java.lang.String r11, java.io.PrintWriter r12, com.android.dx.util.AnnotatedOutput r13, boolean r14) {
            r9 = this;
            com.android.dx.dex.code.DalvCode r0 = r9.code
            com.android.dx.dex.code.PositionList r2 = r0.getPositions()
            com.android.dx.dex.code.DalvCode r0 = r9.code
            com.android.dx.dex.code.LocalList r3 = r0.getLocals()
            com.android.dx.dex.code.DalvCode r0 = r9.code
            com.android.dx.dex.code.DalvInsnList r0 = r0.getInsns()
            int r5 = r0.codeSize()
            int r6 = r0.getRegistersSize()
            com.android.dx.dex.file.DebugInfoEncoder r0 = new com.android.dx.dex.file.DebugInfoEncoder
            boolean r7 = r9.isStatic
            com.android.dx.rop.cst.CstMethodRef r8 = r9.ref
            r1 = r0
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            if (r12 != 0) goto L2e
            if (r13 != 0) goto L2e
            byte[] r10 = r0.convert()
            goto L32
        L2e:
            byte[] r10 = r0.convertAndAnnotate(r11, r12, r13, r14)
        L32:
            return r10
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r1) {
            r0 = this;
            return
    }

    public void annotateTo(com.android.dx.dex.file.DexFile r7, com.android.dx.util.AnnotatedOutput r8, java.lang.String r9) {
            r6 = this;
            r3 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r9
            r4 = r8
            r0.encode(r1, r2, r3, r4, r5)
            return
    }

    public void debugPrint(java.io.PrintWriter r7, java.lang.String r8) {
            r6 = this;
            r4 = 0
            r5 = 0
            r1 = 0
            r0 = r6
            r2 = r8
            r3 = r7
            r0.encode(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_DEBUG_INFO_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void place0(com.android.dx.dex.file.Section r7, int r8) {
            r6 = this;
            com.android.dx.dex.file.DexFile r1 = r7.getFile()     // Catch: java.lang.RuntimeException -> L14
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            byte[] r7 = r0.encode(r1, r2, r3, r4, r5)     // Catch: java.lang.RuntimeException -> L14
            r6.encoded = r7     // Catch: java.lang.RuntimeException -> L14
            int r7 = r7.length     // Catch: java.lang.RuntimeException -> L14
            r6.setWriteSize(r7)     // Catch: java.lang.RuntimeException -> L14
            return
        L14:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "...while placing debug info for "
            r8.append(r0)
            com.android.dx.rop.cst.CstMethodRef r0 = r6.ref
            java.lang.String r0 = r0.toHuman()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.android.dex.util.ExceptionWithContext r7 = com.android.dex.util.ExceptionWithContext.withContext(r7, r8)
            throw r7
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public java.lang.String toHuman() {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "unsupported"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(com.android.dx.dex.file.DexFile r8, com.android.dx.util.AnnotatedOutput r9) {
            r7 = this;
            boolean r0 = r9.annotates()
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.offsetString()
            r0.append(r1)
            java.lang.String r1 = " debug info"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.annotate(r0)
            r4 = 0
            r6 = 1
            r3 = 0
            r1 = r7
            r2 = r8
            r5 = r9
            r1.encode(r2, r3, r4, r5, r6)
        L27:
            byte[] r8 = r7.encoded
            r9.write(r8)
            return
    }
}
