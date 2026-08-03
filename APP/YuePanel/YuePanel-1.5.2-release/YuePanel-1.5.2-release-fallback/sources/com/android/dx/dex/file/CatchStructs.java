package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class CatchStructs {
    private static final int TRY_ITEM_WRITE_SIZE = 8;
    private final com.android.dx.dex.code.DalvCode code;
    private int encodedHandlerHeaderSize;
    private byte[] encodedHandlers;
    private java.util.TreeMap<com.android.dx.dex.code.CatchHandlerList, java.lang.Integer> handlerOffsets;
    private com.android.dx.dex.code.CatchTable table;

    public CatchStructs(com.android.dx.dex.code.DalvCode r2) {
            r1 = this;
            r1.<init>()
            r1.code = r2
            r2 = 0
            r1.table = r2
            r1.encodedHandlers = r2
            r0 = 0
            r1.encodedHandlerHeaderSize = r0
            r1.handlerOffsets = r2
            return
    }

    private static void annotateAndConsumeHandlers(com.android.dx.dex.code.CatchHandlerList r1, int r2, int r3, java.lang.String r4, java.io.PrintWriter r5, com.android.dx.util.AnnotatedOutput r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = com.android.dx.util.Hex.u2(r2)
            r0.append(r2)
            java.lang.String r2 = ": "
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r1 = r1.toHuman(r4, r2)
            if (r5 == 0) goto L1e
            r5.println(r1)
        L1e:
            r6.annotate(r3, r1)
            return
    }

    private void annotateEntries(java.lang.String r16, java.io.PrintWriter r17, com.android.dx.util.AnnotatedOutput r18) {
            r15 = this;
            r0 = r15
            r1 = r16
            r7 = r17
            r8 = r18
            r15.finishProcessingIfNecessary()
            r2 = 0
            if (r8 == 0) goto Lf
            r3 = 1
            goto L10
        Lf:
            r3 = r2
        L10:
            if (r3 == 0) goto L14
            r4 = 6
            goto L15
        L14:
            r4 = r2
        L15:
            if (r3 == 0) goto L19
            r5 = 2
            goto L1a
        L19:
            r5 = r2
        L1a:
            com.android.dx.dex.code.CatchTable r6 = r0.table
            int r6 = r6.size()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            java.lang.String r10 = "  "
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "tries:"
            if (r3 == 0) goto L48
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r8.annotate(r2, r10)
            goto L5a
        L48:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r7.println(r10)
        L5a:
            r10 = r2
        L5b:
            if (r10 >= r6) goto Lab
            com.android.dx.dex.code.CatchTable r11 = r0.table
            com.android.dx.dex.code.CatchTable$Entry r11 = r11.get(r10)
            com.android.dx.dex.code.CatchHandlerList r12 = r11.getHandlers()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r9)
            java.lang.String r14 = "try "
            r13.append(r14)
            int r14 = r11.getStart()
            java.lang.String r14 = com.android.dx.util.Hex.u2or4(r14)
            r13.append(r14)
            java.lang.String r14 = ".."
            r13.append(r14)
            int r11 = r11.getEnd()
            java.lang.String r11 = com.android.dx.util.Hex.u2or4(r11)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            java.lang.String r13 = ""
            java.lang.String r12 = r12.toHuman(r9, r13)
            if (r3 == 0) goto La2
            r8.annotate(r4, r11)
            r8.annotate(r5, r12)
            goto La8
        La2:
            r7.println(r11)
            r7.println(r12)
        La8:
            int r10 = r10 + 1
            goto L5b
        Lab:
            if (r3 != 0) goto Lae
            return
        Lae:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "handlers:"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r8.annotate(r2, r1)
            int r1 = r0.encodedHandlerHeaderSize
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r4 = "size: "
            r3.append(r4)
            java.util.TreeMap<com.android.dx.dex.code.CatchHandlerList, java.lang.Integer> r4 = r0.handlerOffsets
            int r4 = r4.size()
            java.lang.String r4 = com.android.dx.util.Hex.u2(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r8.annotate(r1, r3)
            java.util.TreeMap<com.android.dx.dex.code.CatchHandlerList, java.lang.Integer> r1 = r0.handlerOffsets
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r10 = r1.iterator()
            r1 = 0
        Lf0:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L11c
            java.lang.Object r3 = r10.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            r11 = r4
            com.android.dx.dex.code.CatchHandlerList r11 = (com.android.dx.dex.code.CatchHandlerList) r11
            java.lang.Object r3 = r3.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r12 = r3.intValue()
            if (r1 == 0) goto L119
            int r3 = r12 - r2
            r4 = r9
            r5 = r17
            r6 = r18
            annotateAndConsumeHandlers(r1, r2, r3, r4, r5, r6)
        L119:
            r1 = r11
            r2 = r12
            goto Lf0
        L11c:
            byte[] r3 = r0.encodedHandlers
            int r3 = r3.length
            int r3 = r3 - r2
            r4 = r9
            r5 = r17
            r6 = r18
            annotateAndConsumeHandlers(r1, r2, r3, r4, r5, r6)
            return
    }

    private void finishProcessingIfNecessary() {
            r1 = this;
            com.android.dx.dex.code.CatchTable r0 = r1.table
            if (r0 != 0) goto Lc
            com.android.dx.dex.code.DalvCode r0 = r1.code
            com.android.dx.dex.code.CatchTable r0 = r0.getCatches()
            r1.table = r0
        Lc:
            return
    }

    public void debugPrint(java.io.PrintWriter r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.annotateEntries(r3, r2, r0)
            return
    }

    public void encode(com.android.dx.dex.file.DexFile r10) {
            r9 = this;
            r9.finishProcessingIfNecessary()
            com.android.dx.dex.file.TypeIdsSection r10 = r10.getTypeIds()
            com.android.dx.dex.code.CatchTable r0 = r9.table
            int r0 = r0.size()
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r9.handlerOffsets = r1
            r1 = 0
            r2 = r1
        L16:
            if (r2 >= r0) goto L2b
            java.util.TreeMap<com.android.dx.dex.code.CatchHandlerList, java.lang.Integer> r3 = r9.handlerOffsets
            com.android.dx.dex.code.CatchTable r4 = r9.table
            com.android.dx.dex.code.CatchTable$Entry r4 = r4.get(r2)
            com.android.dx.dex.code.CatchHandlerList r4 = r4.getHandlers()
            r5 = 0
            r3.put(r4, r5)
            int r2 = r2 + 1
            goto L16
        L2b:
            java.util.TreeMap<com.android.dx.dex.code.CatchHandlerList, java.lang.Integer> r0 = r9.handlerOffsets
            int r0 = r0.size()
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r0 > r2) goto Lb5
            com.android.dx.util.ByteArrayAnnotatedOutput r0 = new com.android.dx.util.ByteArrayAnnotatedOutput
            r0.<init>()
            java.util.TreeMap<com.android.dx.dex.code.CatchHandlerList, java.lang.Integer> r2 = r9.handlerOffsets
            int r2 = r2.size()
            int r2 = r0.writeUleb128(r2)
            r9.encodedHandlerHeaderSize = r2
            java.util.TreeMap<com.android.dx.dex.code.CatchHandlerList, java.lang.Integer> r2 = r9.handlerOffsets
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L51:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            com.android.dx.dex.code.CatchHandlerList r4 = (com.android.dx.dex.code.CatchHandlerList) r4
            int r5 = r4.size()
            boolean r6 = r4.catchesAll()
            int r7 = r0.getCursor()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.setValue(r7)
            if (r6 == 0) goto L81
            int r3 = r5 + (-1)
            int r3 = -r3
            r0.writeSleb128(r3)
            int r5 = r5 + (-1)
            goto L84
        L81:
            r0.writeSleb128(r5)
        L84:
            r3 = r1
        L85:
            if (r3 >= r5) goto La0
            com.android.dx.dex.code.CatchHandlerList$Entry r7 = r4.get(r3)
            com.android.dx.rop.cst.CstType r8 = r7.getExceptionType()
            int r8 = r10.indexOf(r8)
            r0.writeUleb128(r8)
            int r7 = r7.getHandler()
            r0.writeUleb128(r7)
            int r3 = r3 + 1
            goto L85
        La0:
            if (r6 == 0) goto L51
            com.android.dx.dex.code.CatchHandlerList$Entry r3 = r4.get(r5)
            int r3 = r3.getHandler()
            r0.writeUleb128(r3)
            goto L51
        Lae:
            byte[] r10 = r0.toByteArray()
            r9.encodedHandlers = r10
            return
        Lb5:
            java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "too many catch handlers"
            r10.<init>(r0)
            throw r10
    }

    public int triesSize() {
            r1 = this;
            r1.finishProcessingIfNecessary()
            com.android.dx.dex.code.CatchTable r0 = r1.table
            int r0 = r0.size()
            return r0
    }

    public int writeSize() {
            r2 = this;
            int r0 = r2.triesSize()
            int r0 = r0 * 8
            byte[] r1 = r2.encodedHandlers
            int r1 = r1.length
            int r0 = r0 + r1
            return r0
    }

    public void writeTo(com.android.dx.dex.file.DexFile r7, com.android.dx.util.AnnotatedOutput r8) {
            r6 = this;
            r6.finishProcessingIfNecessary()
            boolean r7 = r8.annotates()
            if (r7 == 0) goto Lf
            java.lang.String r7 = "  "
            r0 = 0
            r6.annotateEntries(r7, r0, r8)
        Lf:
            com.android.dx.dex.code.CatchTable r7 = r6.table
            int r7 = r7.size()
            r0 = 0
        L16:
            if (r0 >= r7) goto L6f
            com.android.dx.dex.code.CatchTable r1 = r6.table
            com.android.dx.dex.code.CatchTable$Entry r1 = r1.get(r0)
            int r2 = r1.getStart()
            int r3 = r1.getEnd()
            int r4 = r3 - r2
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r4 >= r5) goto L48
            r8.writeInt(r2)
            r8.writeShort(r4)
            java.util.TreeMap<com.android.dx.dex.code.CatchHandlerList, java.lang.Integer> r2 = r6.handlerOffsets
            com.android.dx.dex.code.CatchHandlerList r1 = r1.getHandlers()
            java.lang.Object r1 = r2.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r8.writeShort(r1)
            int r0 = r0 + 1
            goto L16
        L48:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "bogus exception range: "
            r8.append(r0)
            java.lang.String r0 = com.android.dx.util.Hex.u4(r2)
            r8.append(r0)
            java.lang.String r0 = ".."
            r8.append(r0)
            java.lang.String r0 = com.android.dx.util.Hex.u4(r3)
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L6f:
            byte[] r7 = r6.encodedHandlers
            r8.write(r7)
            return
    }
}
