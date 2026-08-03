package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class DebugInfoEncoder {
    private static final boolean DEBUG = false;
    private int address;
    private com.android.dx.util.AnnotatedOutput annotateTo;
    private final int codeSize;
    private java.io.PrintWriter debugPrint;
    private final com.android.dx.rop.type.Prototype desc;
    private final com.android.dx.dex.file.DexFile file;
    private final boolean isStatic;
    private final com.android.dx.dex.code.LocalList.Entry[] lastEntryForReg;
    private int line;
    private final com.android.dx.dex.code.LocalList locals;
    private final com.android.dx.util.ByteArrayAnnotatedOutput output;
    private final com.android.dx.dex.code.PositionList positions;
    private java.lang.String prefix;
    private final int regSize;
    private boolean shouldConsume;



    public DebugInfoEncoder(com.android.dx.dex.code.PositionList r2, com.android.dx.dex.code.LocalList r3, com.android.dx.dex.file.DexFile r4, int r5, int r6, boolean r7, com.android.dx.rop.cst.CstMethodRef r8) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.address = r0
            r0 = 1
            r1.line = r0
            r1.positions = r2
            r1.locals = r3
            r1.file = r4
            com.android.dx.rop.type.Prototype r2 = r8.getPrototype()
            r1.desc = r2
            r1.isStatic = r7
            r1.codeSize = r5
            r1.regSize = r6
            com.android.dx.util.ByteArrayAnnotatedOutput r2 = new com.android.dx.util.ByteArrayAnnotatedOutput
            r2.<init>()
            r1.output = r2
            com.android.dx.dex.code.LocalList$Entry[] r2 = new com.android.dx.dex.code.LocalList.Entry[r6]
            r1.lastEntryForReg = r2
            return
    }

    private void annotate(int r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = r2.prefix
            if (r0 == 0) goto L15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.prefix
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L15:
            com.android.dx.util.AnnotatedOutput r0 = r2.annotateTo
            if (r0 == 0) goto L22
            boolean r1 = r2.shouldConsume
            if (r1 == 0) goto L1e
            goto L1f
        L1e:
            r3 = 0
        L1f:
            r0.annotate(r3, r4)
        L22:
            java.io.PrintWriter r3 = r2.debugPrint
            if (r3 == 0) goto L29
            r3.println(r4)
        L29:
            return
    }

    private java.util.ArrayList<com.android.dx.dex.code.PositionList.Entry> buildSortedPositions() {
            r4 = this;
            com.android.dx.dex.code.PositionList r0 = r4.positions
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.size()
        Lb:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
        L10:
            if (r1 >= r0) goto L1e
            com.android.dx.dex.code.PositionList r3 = r4.positions
            com.android.dx.dex.code.PositionList$Entry r3 = r3.get(r1)
            r2.add(r3)
            int r1 = r1 + 1
            goto L10
        L1e:
            com.android.dx.dex.file.DebugInfoEncoder$1 r0 = new com.android.dx.dex.file.DebugInfoEncoder$1
            r0.<init>(r4)
            java.util.Collections.sort(r2, r0)
            return r2
    }

    private static int computeOpcode(int r2, int r3) {
            r0 = -4
            if (r2 < r0) goto Ld
            r1 = 10
            if (r2 > r1) goto Ld
            int r2 = r2 - r0
            int r3 = r3 * 15
            int r2 = r2 + r3
            int r2 = r2 + r1
            return r2
        Ld:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Parameter out of range"
            r2.<init>(r3)
            throw r2
    }

    private byte[] convert0() throws java.io.IOException {
            r10 = this;
            java.util.ArrayList r0 = r10.buildSortedPositions()
            java.util.ArrayList r1 = r10.extractMethodArguments()
            r10.emitHeader(r0, r1)
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r10.output
            r2 = 7
            r1.writeByte(r2)
            com.android.dx.util.AnnotatedOutput r1 = r10.annotateTo
            if (r1 != 0) goto L19
            java.io.PrintWriter r1 = r10.debugPrint
            if (r1 == 0) goto L2d
        L19:
            int r1 = r10.address
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "%04x: prologue end"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r2 = 1
            r10.annotate(r2, r1)
        L2d:
            int r1 = r0.size()
            com.android.dx.dex.code.LocalList r2 = r10.locals
            int r2 = r2.size()
            r3 = 0
            r4 = r3
        L39:
            int r3 = r10.emitLocalsAtAddress(r3)
            int r4 = r10.emitPositionsAtAddress(r4, r0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r3 >= r2) goto L51
            com.android.dx.dex.code.LocalList r6 = r10.locals
            com.android.dx.dex.code.LocalList$Entry r6 = r6.get(r3)
            int r6 = r6.getAddress()
            goto L52
        L51:
            r6 = r5
        L52:
            if (r4 >= r1) goto L5f
            java.lang.Object r7 = r0.get(r4)
            com.android.dx.dex.code.PositionList$Entry r7 = (com.android.dx.dex.code.PositionList.Entry) r7
            int r7 = r7.getAddress()
            goto L60
        L5f:
            r7 = r5
        L60:
            int r8 = java.lang.Math.min(r7, r6)
            if (r8 != r5) goto L67
            goto L6f
        L67:
            int r9 = r10.codeSize
            if (r8 != r9) goto L79
            if (r6 != r5) goto L79
            if (r7 != r5) goto L79
        L6f:
            r10.emitEndSequence()
            com.android.dx.util.ByteArrayAnnotatedOutput r0 = r10.output
            byte[] r0 = r0.toByteArray()
            return r0
        L79:
            if (r8 != r7) goto L88
            int r5 = r4 + 1
            java.lang.Object r4 = r0.get(r4)
            com.android.dx.dex.code.PositionList$Entry r4 = (com.android.dx.dex.code.PositionList.Entry) r4
            r10.emitPosition(r4)
            r4 = r5
            goto L39
        L88:
            int r5 = r10.address
            int r8 = r8 - r5
            r10.emitAdvancePc(r8)
            goto L39
    }

    private void emitAdvanceLine(int r4) throws java.io.IOException {
            r3 = this;
            com.android.dx.util.ByteArrayAnnotatedOutput r0 = r3.output
            int r0 = r0.getCursor()
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r3.output
            r2 = 2
            r1.writeByte(r2)
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r3.output
            r1.writeSleb128(r4)
            int r1 = r3.line
            int r1 = r1 + r4
            r3.line = r1
            com.android.dx.util.AnnotatedOutput r4 = r3.annotateTo
            if (r4 != 0) goto L1e
            java.io.PrintWriter r4 = r3.debugPrint
            if (r4 == 0) goto L38
        L1e:
            com.android.dx.util.ByteArrayAnnotatedOutput r4 = r3.output
            int r4 = r4.getCursor()
            int r4 = r4 - r0
            int r0 = r3.line
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "line = %d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.annotate(r4, r0)
        L38:
            return
    }

    private void emitAdvancePc(int r4) throws java.io.IOException {
            r3 = this;
            com.android.dx.util.ByteArrayAnnotatedOutput r0 = r3.output
            int r0 = r0.getCursor()
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r3.output
            r2 = 1
            r1.writeByte(r2)
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r3.output
            r1.writeUleb128(r4)
            int r1 = r3.address
            int r1 = r1 + r4
            r3.address = r1
            com.android.dx.util.AnnotatedOutput r4 = r3.annotateTo
            if (r4 != 0) goto L1e
            java.io.PrintWriter r4 = r3.debugPrint
            if (r4 == 0) goto L38
        L1e:
            com.android.dx.util.ByteArrayAnnotatedOutput r4 = r3.output
            int r4 = r4.getCursor()
            int r4 = r4 - r0
            int r0 = r3.address
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "%04x: advance pc"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.annotate(r4, r0)
        L38:
            return
    }

    private void emitEndSequence() {
            r2 = this;
            com.android.dx.util.ByteArrayAnnotatedOutput r0 = r2.output
            r1 = 0
            r0.writeByte(r1)
            com.android.dx.util.AnnotatedOutput r0 = r2.annotateTo
            if (r0 != 0) goto Le
            java.io.PrintWriter r0 = r2.debugPrint
            if (r0 == 0) goto L14
        Le:
            r0 = 1
            java.lang.String r1 = "end sequence"
            r2.annotate(r0, r1)
        L14:
            return
    }

    private void emitHeader(java.util.ArrayList<com.android.dx.dex.code.PositionList.Entry> r12, java.util.ArrayList<com.android.dx.dex.code.LocalList.Entry> r13) throws java.io.IOException {
            r11 = this;
            com.android.dx.util.AnnotatedOutput r0 = r11.annotateTo
            r1 = 0
            if (r0 != 0) goto Lc
            java.io.PrintWriter r0 = r11.debugPrint
            if (r0 == 0) goto La
            goto Lc
        La:
            r0 = r1
            goto Ld
        Lc:
            r0 = 1
        Ld:
            com.android.dx.util.ByteArrayAnnotatedOutput r2 = r11.output
            int r2 = r2.getCursor()
            int r3 = r12.size()
            if (r3 <= 0) goto L29
            java.lang.Object r12 = r12.get(r1)
            com.android.dx.dex.code.PositionList$Entry r12 = (com.android.dx.dex.code.PositionList.Entry) r12
            com.android.dx.rop.code.SourcePosition r12 = r12.getPosition()
            int r12 = r12.getLine()
            r11.line = r12
        L29:
            com.android.dx.util.ByteArrayAnnotatedOutput r12 = r11.output
            int r3 = r11.line
            r12.writeUleb128(r3)
            if (r0 == 0) goto L4f
            com.android.dx.util.ByteArrayAnnotatedOutput r12 = r11.output
            int r12 = r12.getCursor()
            int r12 = r12 - r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "line_start: "
            r2.append(r3)
            int r3 = r11.line
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r11.annotate(r12, r2)
        L4f:
            int r12 = r11.getParamBase()
            com.android.dx.rop.type.Prototype r2 = r11.desc
            com.android.dx.rop.type.StdTypeList r2 = r2.getParameterTypes()
            int r3 = r2.size()
            boolean r4 = r11.isStatic
            if (r4 != 0) goto L7d
            java.util.Iterator r4 = r13.iterator()
        L65:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7b
            java.lang.Object r5 = r4.next()
            com.android.dx.dex.code.LocalList$Entry r5 = (com.android.dx.dex.code.LocalList.Entry) r5
            int r6 = r5.getRegister()
            if (r12 != r6) goto L65
            com.android.dx.dex.code.LocalList$Entry[] r4 = r11.lastEntryForReg
            r4[r12] = r5
        L7b:
            int r12 = r12 + 1
        L7d:
            com.android.dx.util.ByteArrayAnnotatedOutput r4 = r11.output
            int r4 = r4.getCursor()
            com.android.dx.util.ByteArrayAnnotatedOutput r5 = r11.output
            r5.writeUleb128(r3)
            if (r0 == 0) goto La2
            com.android.dx.util.ByteArrayAnnotatedOutput r5 = r11.output
            int r5 = r5.getCursor()
            int r5 = r5 - r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r6 = "parameters_size: %04x"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            r11.annotate(r5, r4)
        La2:
            r4 = r1
        La3:
            if (r4 >= r3) goto L129
            com.android.dx.rop.type.Type r5 = r2.get(r4)
            com.android.dx.util.ByteArrayAnnotatedOutput r6 = r11.output
            int r6 = r6.getCursor()
            java.util.Iterator r7 = r13.iterator()
        Lb3:
            boolean r8 = r7.hasNext()
            r9 = 0
            if (r8 == 0) goto Ldc
            java.lang.Object r8 = r7.next()
            com.android.dx.dex.code.LocalList$Entry r8 = (com.android.dx.dex.code.LocalList.Entry) r8
            int r10 = r8.getRegister()
            if (r12 != r10) goto Lb3
            com.android.dx.rop.cst.CstString r7 = r8.getSignature()
            if (r7 == 0) goto Ld0
            r11.emitStringIndex(r9)
            goto Ld7
        Ld0:
            com.android.dx.rop.cst.CstString r7 = r8.getName()
            r11.emitStringIndex(r7)
        Ld7:
            com.android.dx.dex.code.LocalList$Entry[] r7 = r11.lastEntryForReg
            r7[r12] = r8
            goto Ldd
        Ldc:
            r8 = r9
        Ldd:
            if (r8 != 0) goto Le2
            r11.emitStringIndex(r9)
        Le2:
            if (r0 == 0) goto L120
            if (r8 == 0) goto Lf6
            com.android.dx.rop.cst.CstString r7 = r8.getSignature()
            if (r7 == 0) goto Led
            goto Lf6
        Led:
            com.android.dx.rop.cst.CstString r7 = r8.getName()
            java.lang.String r7 = r7.toHuman()
            goto Lf8
        Lf6:
            java.lang.String r7 = "<unnamed>"
        Lf8:
            com.android.dx.util.ByteArrayAnnotatedOutput r8 = r11.output
            int r8 = r8.getCursor()
            int r8 = r8 - r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "parameter "
            r6.append(r9)
            r6.append(r7)
            java.lang.String r7 = " "
            r6.append(r7)
            java.lang.String r7 = "v"
            r6.append(r7)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            r11.annotate(r8, r6)
        L120:
            int r5 = r5.getCategory()
            int r12 = r12 + r5
            int r4 = r4 + 1
            goto La3
        L129:
            com.android.dx.dex.code.LocalList$Entry[] r12 = r11.lastEntryForReg
            int r13 = r12.length
        L12c:
            if (r1 >= r13) goto L13f
            r0 = r12[r1]
            if (r0 != 0) goto L133
            goto L13c
        L133:
            com.android.dx.rop.cst.CstString r2 = r0.getSignature()
            if (r2 == 0) goto L13c
            r11.emitLocalStartExtended(r0)
        L13c:
            int r1 = r1 + 1
            goto L12c
        L13f:
            return
    }

    private void emitLocalEnd(com.android.dx.dex.code.LocalList.Entry r4) throws java.io.IOException {
            r3 = this;
            com.android.dx.util.ByteArrayAnnotatedOutput r0 = r3.output
            int r0 = r0.getCursor()
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r3.output
            r2 = 5
            r1.writeByte(r2)
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r3.output
            int r2 = r4.getRegister()
            r1.writeUleb128(r2)
            com.android.dx.util.AnnotatedOutput r1 = r3.annotateTo
            if (r1 != 0) goto L1d
            java.io.PrintWriter r1 = r3.debugPrint
            if (r1 == 0) goto L3b
        L1d:
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r3.output
            int r1 = r1.getCursor()
            int r1 = r1 - r0
            int r0 = r3.address
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = r3.entryAnnotationString(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
            java.lang.String r0 = "%04x: -local %s"
            java.lang.String r4 = java.lang.String.format(r0, r4)
            r3.annotate(r1, r4)
        L3b:
            return
    }

    private void emitLocalRestart(com.android.dx.dex.code.LocalList.Entry r4) throws java.io.IOException {
            r3 = this;
            com.android.dx.util.ByteArrayAnnotatedOutput r0 = r3.output
            int r0 = r0.getCursor()
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r3.output
            r2 = 6
            r1.writeByte(r2)
            int r1 = r4.getRegister()
            r3.emitUnsignedLeb128(r1)
            com.android.dx.util.AnnotatedOutput r1 = r3.annotateTo
            if (r1 != 0) goto L1b
            java.io.PrintWriter r1 = r3.debugPrint
            if (r1 == 0) goto L39
        L1b:
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r3.output
            int r1 = r1.getCursor()
            int r1 = r1 - r0
            int r0 = r3.address
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = r3.entryAnnotationString(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
            java.lang.String r0 = "%04x: +local restart %s"
            java.lang.String r4 = java.lang.String.format(r0, r4)
            r3.annotate(r1, r4)
        L39:
            return
    }

    private void emitLocalStart(com.android.dx.dex.code.LocalList.Entry r4) throws java.io.IOException {
            r3 = this;
            com.android.dx.rop.cst.CstString r0 = r4.getSignature()
            if (r0 == 0) goto La
            r3.emitLocalStartExtended(r4)
            return
        La:
            com.android.dx.util.ByteArrayAnnotatedOutput r0 = r3.output
            int r0 = r0.getCursor()
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r3.output
            r2 = 3
            r1.writeByte(r2)
            int r1 = r4.getRegister()
            r3.emitUnsignedLeb128(r1)
            com.android.dx.rop.cst.CstString r1 = r4.getName()
            r3.emitStringIndex(r1)
            com.android.dx.rop.cst.CstType r1 = r4.getType()
            r3.emitTypeIndex(r1)
            com.android.dx.util.AnnotatedOutput r1 = r3.annotateTo
            if (r1 != 0) goto L33
            java.io.PrintWriter r1 = r3.debugPrint
            if (r1 == 0) goto L51
        L33:
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r3.output
            int r1 = r1.getCursor()
            int r1 = r1 - r0
            int r0 = r3.address
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = r3.entryAnnotationString(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
            java.lang.String r0 = "%04x: +local %s"
            java.lang.String r4 = java.lang.String.format(r0, r4)
            r3.annotate(r1, r4)
        L51:
            return
    }

    private void emitLocalStartExtended(com.android.dx.dex.code.LocalList.Entry r4) throws java.io.IOException {
            r3 = this;
            com.android.dx.util.ByteArrayAnnotatedOutput r0 = r3.output
            int r0 = r0.getCursor()
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r3.output
            r2 = 4
            r1.writeByte(r2)
            int r1 = r4.getRegister()
            r3.emitUnsignedLeb128(r1)
            com.android.dx.rop.cst.CstString r1 = r4.getName()
            r3.emitStringIndex(r1)
            com.android.dx.rop.cst.CstType r1 = r4.getType()
            r3.emitTypeIndex(r1)
            com.android.dx.rop.cst.CstString r1 = r4.getSignature()
            r3.emitStringIndex(r1)
            com.android.dx.util.AnnotatedOutput r1 = r3.annotateTo
            if (r1 != 0) goto L30
            java.io.PrintWriter r1 = r3.debugPrint
            if (r1 == 0) goto L4e
        L30:
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r3.output
            int r1 = r1.getCursor()
            int r1 = r1 - r0
            int r0 = r3.address
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = r3.entryAnnotationString(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
            java.lang.String r0 = "%04x: +localx %s"
            java.lang.String r4 = java.lang.String.format(r0, r4)
            r3.annotate(r1, r4)
        L4e:
            return
    }

    private int emitLocalsAtAddress(int r6) throws java.io.IOException {
            r5 = this;
            com.android.dx.dex.code.LocalList r0 = r5.locals
            int r0 = r0.size()
        L6:
            if (r6 >= r0) goto L5c
            com.android.dx.dex.code.LocalList r1 = r5.locals
            com.android.dx.dex.code.LocalList$Entry r1 = r1.get(r6)
            int r1 = r1.getAddress()
            int r2 = r5.address
            if (r1 != r2) goto L5c
            com.android.dx.dex.code.LocalList r1 = r5.locals
            int r2 = r6 + 1
            com.android.dx.dex.code.LocalList$Entry r6 = r1.get(r6)
            int r1 = r6.getRegister()
            com.android.dx.dex.code.LocalList$Entry[] r3 = r5.lastEntryForReg
            r4 = r3[r1]
            if (r6 != r4) goto L29
            goto L5a
        L29:
            r3[r1] = r6
            boolean r1 = r6.isStart()
            if (r1 == 0) goto L4f
            if (r4 == 0) goto L4b
            boolean r1 = r6.matches(r4)
            if (r1 == 0) goto L4b
            boolean r1 = r4.isStart()
            if (r1 != 0) goto L43
            r5.emitLocalRestart(r6)
            goto L5a
        L43:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "shouldn't happen"
            r6.<init>(r0)
            throw r6
        L4b:
            r5.emitLocalStart(r6)
            goto L5a
        L4f:
            com.android.dx.dex.code.LocalList$Disposition r1 = r6.getDisposition()
            com.android.dx.dex.code.LocalList$Disposition r3 = com.android.dx.dex.code.LocalList.Disposition.END_REPLACED
            if (r1 == r3) goto L5a
            r5.emitLocalEnd(r6)
        L5a:
            r6 = r2
            goto L6
        L5c:
            return r6
    }

    private void emitPosition(com.android.dx.dex.code.PositionList.Entry r5) throws java.io.IOException {
            r4 = this;
            com.android.dx.rop.code.SourcePosition r0 = r5.getPosition()
            int r0 = r0.getLine()
            int r5 = r5.getAddress()
            int r1 = r4.line
            int r0 = r0 - r1
            int r1 = r4.address
            int r5 = r5 - r1
            if (r5 < 0) goto L6e
            r1 = -4
            r2 = 0
            if (r0 < r1) goto L1c
            r1 = 10
            if (r0 <= r1) goto L20
        L1c:
            r4.emitAdvanceLine(r0)
            r0 = r2
        L20:
            int r1 = computeOpcode(r0, r5)
            r3 = r1 & (-256(0xffffffffffffff00, float:NaN))
            if (r3 <= 0) goto L3d
            r4.emitAdvancePc(r5)
            int r1 = computeOpcode(r0, r2)
            r5 = r1 & (-256(0xffffffffffffff00, float:NaN))
            if (r5 <= 0) goto L3c
            r4.emitAdvanceLine(r0)
            int r1 = computeOpcode(r2, r2)
            r5 = r2
            goto L3e
        L3c:
            r5 = r2
        L3d:
            r2 = r0
        L3e:
            com.android.dx.util.ByteArrayAnnotatedOutput r0 = r4.output
            r0.writeByte(r1)
            int r0 = r4.line
            int r0 = r0 + r2
            r4.line = r0
            int r0 = r4.address
            int r0 = r0 + r5
            r4.address = r0
            com.android.dx.util.AnnotatedOutput r5 = r4.annotateTo
            if (r5 != 0) goto L55
            java.io.PrintWriter r5 = r4.debugPrint
            if (r5 == 0) goto L6d
        L55:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            int r0 = r4.line
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r0}
            java.lang.String r0 = "%04x: line %d"
            java.lang.String r5 = java.lang.String.format(r0, r5)
            r0 = 1
            r4.annotate(r0, r5)
        L6d:
            return
        L6e:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "Position entries must be in ascending address order"
            r5.<init>(r0)
            throw r5
    }

    private int emitPositionsAtAddress(int r4, java.util.ArrayList<com.android.dx.dex.code.PositionList.Entry> r5) throws java.io.IOException {
            r3 = this;
            int r0 = r5.size()
        L4:
            if (r4 >= r0) goto L21
            java.lang.Object r1 = r5.get(r4)
            com.android.dx.dex.code.PositionList$Entry r1 = (com.android.dx.dex.code.PositionList.Entry) r1
            int r1 = r1.getAddress()
            int r2 = r3.address
            if (r1 != r2) goto L21
            int r1 = r4 + 1
            java.lang.Object r4 = r5.get(r4)
            com.android.dx.dex.code.PositionList$Entry r4 = (com.android.dx.dex.code.PositionList.Entry) r4
            r3.emitPosition(r4)
            r4 = r1
            goto L4
        L21:
            return r4
    }

    private void emitStringIndex(com.android.dx.rop.cst.CstString r3) throws java.io.IOException {
            r2 = this;
            if (r3 == 0) goto L17
            com.android.dx.dex.file.DexFile r0 = r2.file
            if (r0 != 0) goto L7
            goto L17
        L7:
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r2.output
            com.android.dx.dex.file.StringIdsSection r0 = r0.getStringIds()
            int r3 = r0.indexOf(r3)
            int r3 = r3 + 1
            r1.writeUleb128(r3)
            goto L1d
        L17:
            com.android.dx.util.ByteArrayAnnotatedOutput r3 = r2.output
            r0 = 0
            r3.writeUleb128(r0)
        L1d:
            return
    }

    private void emitTypeIndex(com.android.dx.rop.cst.CstType r3) throws java.io.IOException {
            r2 = this;
            if (r3 == 0) goto L17
            com.android.dx.dex.file.DexFile r0 = r2.file
            if (r0 != 0) goto L7
            goto L17
        L7:
            com.android.dx.util.ByteArrayAnnotatedOutput r1 = r2.output
            com.android.dx.dex.file.TypeIdsSection r0 = r0.getTypeIds()
            int r3 = r0.indexOf(r3)
            int r3 = r3 + 1
            r1.writeUleb128(r3)
            goto L1d
        L17:
            com.android.dx.util.ByteArrayAnnotatedOutput r3 = r2.output
            r0 = 0
            r3.writeUleb128(r0)
        L1d:
            return
    }

    private void emitUnsignedLeb128(int r4) throws java.io.IOException {
            r3 = this;
            if (r4 < 0) goto L8
            com.android.dx.util.ByteArrayAnnotatedOutput r0 = r3.output
            r0.writeUleb128(r4)
            return
        L8:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Signed value where unsigned required: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private java.lang.String entryAnnotationString(com.android.dx.dex.code.LocalList.Entry r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "v"
            r0.append(r1)
            int r1 = r5.getRegister()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            com.android.dx.rop.cst.CstString r2 = r5.getName()
            java.lang.String r3 = "null"
            if (r2 != 0) goto L22
            r0.append(r3)
            goto L29
        L22:
            java.lang.String r2 = r2.toHuman()
            r0.append(r2)
        L29:
            r0.append(r1)
            com.android.dx.rop.cst.CstType r2 = r5.getType()
            if (r2 != 0) goto L36
            r0.append(r3)
            goto L3d
        L36:
            java.lang.String r2 = r2.toHuman()
            r0.append(r2)
        L3d:
            com.android.dx.rop.cst.CstString r5 = r5.getSignature()
            if (r5 == 0) goto L4d
            r0.append(r1)
            java.lang.String r5 = r5.toHuman()
            r0.append(r5)
        L4d:
            java.lang.String r5 = r0.toString()
            return r5
    }

    private java.util.ArrayList<com.android.dx.dex.code.LocalList.Entry> extractMethodArguments() {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            com.android.dx.rop.type.Prototype r1 = r8.desc
            com.android.dx.rop.type.StdTypeList r1 = r1.getParameterTypes()
            int r1 = r1.size()
            r0.<init>(r1)
            int r1 = r8.getParamBase()
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r8.regSize
            int r3 = r3 - r1
            r2.<init>(r3)
            com.android.dx.dex.code.LocalList r3 = r8.locals
            int r3 = r3.size()
            r4 = 0
        L22:
            if (r4 >= r3) goto L42
            com.android.dx.dex.code.LocalList r5 = r8.locals
            com.android.dx.dex.code.LocalList$Entry r5 = r5.get(r4)
            int r6 = r5.getRegister()
            if (r6 >= r1) goto L31
            goto L3f
        L31:
            int r6 = r6 - r1
            boolean r7 = r2.get(r6)
            if (r7 == 0) goto L39
            goto L3f
        L39:
            r2.set(r6)
            r0.add(r5)
        L3f:
            int r4 = r4 + 1
            goto L22
        L42:
            com.android.dx.dex.file.DebugInfoEncoder$2 r1 = new com.android.dx.dex.file.DebugInfoEncoder$2
            r1.<init>(r8)
            java.util.Collections.sort(r0, r1)
            return r0
    }

    private int getParamBase() {
            r2 = this;
            int r0 = r2.regSize
            com.android.dx.rop.type.Prototype r1 = r2.desc
            com.android.dx.rop.type.StdTypeList r1 = r1.getParameterTypes()
            int r1 = r1.getWordCount()
            int r0 = r0 - r1
            boolean r1 = r2.isStatic
            r1 = r1 ^ 1
            int r0 = r0 - r1
            return r0
    }

    public byte[] convert() {
            r2 = this;
            byte[] r0 = r2.convert0()     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.String r1 = "...while encoding debug info"
            com.android.dex.util.ExceptionWithContext r0 = com.android.dex.util.ExceptionWithContext.withContext(r0, r1)
            throw r0
    }

    public byte[] convertAndAnnotate(java.lang.String r1, java.io.PrintWriter r2, com.android.dx.util.AnnotatedOutput r3, boolean r4) {
            r0 = this;
            r0.prefix = r1
            r0.debugPrint = r2
            r0.annotateTo = r3
            r0.shouldConsume = r4
            byte[] r1 = r0.convert()
            return r1
    }
}
