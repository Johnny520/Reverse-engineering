package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public class DebugInfoDecoder {
    private int address;
    private final int codesize;
    private final com.android.dx.rop.type.Prototype desc;
    private final byte[] encoded;
    private final com.android.dx.dex.file.DexFile file;
    private final boolean isStatic;
    private final com.android.dx.dex.file.DebugInfoDecoder.LocalEntry[] lastEntryForReg;
    private int line;
    private final java.util.ArrayList<com.android.dx.dex.file.DebugInfoDecoder.LocalEntry> locals;
    private final java.util.ArrayList<com.android.dx.dex.file.DebugInfoDecoder.PositionEntry> positions;
    private final int regSize;
    private final int thisStringIdx;

    public static class LocalEntry {
        public int address;
        public boolean isStart;
        public int nameIndex;
        public int reg;
        public int signatureIndex;
        public int typeIndex;

        public LocalEntry(int r1, boolean r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.address = r1
                r0.isStart = r2
                r0.reg = r3
                r0.nameIndex = r4
                r0.typeIndex = r5
                r0.signatureIndex = r6
                return
        }

        public java.lang.String toString() {
                r7 = this;
                int r0 = r7.address
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                boolean r0 = r7.isStart
                if (r0 == 0) goto Le
                java.lang.String r0 = "start"
            Lc:
                r2 = r0
                goto L11
            Le:
                java.lang.String r0 = "end"
                goto Lc
            L11:
                int r0 = r7.reg
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                int r0 = r7.nameIndex
                java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                int r0 = r7.typeIndex
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                int r0 = r7.signatureIndex
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6}
                java.lang.String r1 = "[%x %s v%d %04x %04x %04x]"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }
    }

    public static class PositionEntry {
        public int address;
        public int line;

        public PositionEntry(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.address = r1
                r0.line = r2
                return
        }
    }

    public DebugInfoDecoder(byte[] r2, int r3, int r4, boolean r5, com.android.dx.rop.cst.CstMethodRef r6, com.android.dx.dex.file.DexFile r7) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.line = r0
            r0 = 0
            r1.address = r0
            if (r2 == 0) goto L41
            r1.encoded = r2
            r1.isStatic = r5
            com.android.dx.rop.type.Prototype r2 = r6.getPrototype()
            r1.desc = r2
            r1.file = r7
            r1.regSize = r4
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.positions = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.locals = r2
            r1.codesize = r3
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry[] r2 = new com.android.dx.dex.file.DebugInfoDecoder.LocalEntry[r4]
            r1.lastEntryForReg = r2
            com.android.dx.dex.file.StringIdsSection r2 = r7.getStringIds()     // Catch: java.lang.IllegalArgumentException -> L3d
            com.android.dx.rop.cst.CstString r3 = new com.android.dx.rop.cst.CstString     // Catch: java.lang.IllegalArgumentException -> L3d
            java.lang.String r4 = "this"
            r3.<init>(r4)     // Catch: java.lang.IllegalArgumentException -> L3d
            int r2 = r2.indexOf(r3)     // Catch: java.lang.IllegalArgumentException -> L3d
            goto L3e
        L3d:
            r2 = -1
        L3e:
            r1.thisStringIdx = r2
            return
        L41:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "encoded == null"
            r2.<init>(r3)
            throw r2
    }

    private void decode0() throws java.io.IOException {
            r18 = this;
            r0 = r18
            com.android.dex.util.ByteArrayByteInput r1 = new com.android.dex.util.ByteArrayByteInput
            byte[] r2 = r0.encoded
            r1.<init>(r2)
            int r2 = com.android.dex.Leb128.readUnsignedLeb128(r1)
            r0.line = r2
            int r2 = com.android.dex.Leb128.readUnsignedLeb128(r1)
            com.android.dx.rop.type.Prototype r3 = r0.desc
            com.android.dx.rop.type.StdTypeList r3 = r3.getParameterTypes()
            int r11 = r18.getParamBase()
            int r4 = r3.size()
            if (r2 != r4) goto L1bf
            boolean r4 = r0.isStatic
            if (r4 != 0) goto L3f
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry r12 = new com.android.dx.dex.file.DebugInfoDecoder$LocalEntry
            int r8 = r0.thisStringIdx
            r9 = 0
            r10 = 0
            r5 = 0
            r6 = 1
            r4 = r12
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            java.util.ArrayList<com.android.dx.dex.file.DebugInfoDecoder$LocalEntry> r4 = r0.locals
            r4.add(r12)
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry[] r4 = r0.lastEntryForReg
            r4[r11] = r12
            int r11 = r11 + 1
        L3f:
            r4 = 0
            r12 = r11
        L41:
            if (r4 >= r2) goto L77
            com.android.dx.rop.type.Type r13 = r3.getType(r4)
            int r9 = r0.readStringIndex(r1)
            r5 = -1
            if (r9 != r5) goto L5b
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry r14 = new com.android.dx.dex.file.DebugInfoDecoder$LocalEntry
            r10 = 0
            r11 = 0
            r6 = 0
            r7 = 1
            r9 = -1
            r5 = r14
            r8 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L66
        L5b:
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry r14 = new com.android.dx.dex.file.DebugInfoDecoder$LocalEntry
            r10 = 0
            r11 = 0
            r6 = 0
            r7 = 1
            r5 = r14
            r8 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L66:
            java.util.ArrayList<com.android.dx.dex.file.DebugInfoDecoder$LocalEntry> r5 = r0.locals
            r5.add(r14)
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry[] r5 = r0.lastEntryForReg
            r5[r12] = r14
            int r5 = r13.getCategory()
            int r12 = r12 + r5
            int r4 = r4 + 1
            goto L41
        L77:
            byte r2 = r1.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            switch(r2) {
                case 0: goto L1be;
                case 1: goto L1b3;
                case 2: goto L1a8;
                case 3: goto L185;
                case 4: goto L160;
                case 5: goto L10b;
                case 6: goto Lb8;
                case 7: goto L77;
                case 8: goto L77;
                case 9: goto L77;
                default: goto L80;
            }
        L80:
            r3 = 10
            if (r2 < r3) goto La1
            int r2 = r2 + (-10)
            int r3 = r0.address
            int r4 = r2 / 15
            int r3 = r3 + r4
            r0.address = r3
            int r4 = r0.line
            int r2 = r2 % 15
            int r2 = r2 + (-4)
            int r4 = r4 + r2
            r0.line = r4
            java.util.ArrayList<com.android.dx.dex.file.DebugInfoDecoder$PositionEntry> r2 = r0.positions
            com.android.dx.dex.file.DebugInfoDecoder$PositionEntry r5 = new com.android.dx.dex.file.DebugInfoDecoder$PositionEntry
            r5.<init>(r3, r4)
            r2.add(r5)
            goto L77
        La1:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid extended opcode encountered "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        Lb8:
            int r2 = com.android.dex.Leb128.readUnsignedLeb128(r1)
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry[] r3 = r0.lastEntryForReg     // Catch: java.lang.NullPointerException -> Lf4
            r3 = r3[r2]     // Catch: java.lang.NullPointerException -> Lf4
            boolean r4 = r3.isStart     // Catch: java.lang.NullPointerException -> Lf4
            if (r4 != 0) goto Ldd
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry r10 = new com.android.dx.dex.file.DebugInfoDecoder$LocalEntry     // Catch: java.lang.NullPointerException -> Lf4
            int r4 = r0.address     // Catch: java.lang.NullPointerException -> Lf4
            int r7 = r3.nameIndex     // Catch: java.lang.NullPointerException -> Lf4
            int r8 = r3.typeIndex     // Catch: java.lang.NullPointerException -> Lf4
            r9 = 0
            r5 = 1
            r3 = r10
            r6 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.NullPointerException -> Lf4
            java.util.ArrayList<com.android.dx.dex.file.DebugInfoDecoder$LocalEntry> r3 = r0.locals
            r3.add(r10)
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry[] r3 = r0.lastEntryForReg
            r3[r2] = r10
            goto L77
        Ldd:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.NullPointerException -> Lf4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NullPointerException -> Lf4
            r3.<init>()     // Catch: java.lang.NullPointerException -> Lf4
            java.lang.String r4 = "nonsensical RESTART_LOCAL on live register v"
            r3.append(r4)     // Catch: java.lang.NullPointerException -> Lf4
            r3.append(r2)     // Catch: java.lang.NullPointerException -> Lf4
            java.lang.String r3 = r3.toString()     // Catch: java.lang.NullPointerException -> Lf4
            r1.<init>(r3)     // Catch: java.lang.NullPointerException -> Lf4
            throw r1     // Catch: java.lang.NullPointerException -> Lf4
        Lf4:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Encountered RESTART_LOCAL on new v"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L10b:
            int r2 = com.android.dex.Leb128.readUnsignedLeb128(r1)
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry[] r3 = r0.lastEntryForReg     // Catch: java.lang.NullPointerException -> L149
            r3 = r3[r2]     // Catch: java.lang.NullPointerException -> L149
            boolean r4 = r3.isStart     // Catch: java.lang.NullPointerException -> L149
            if (r4 == 0) goto L132
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry r10 = new com.android.dx.dex.file.DebugInfoDecoder$LocalEntry     // Catch: java.lang.NullPointerException -> L149
            int r4 = r0.address     // Catch: java.lang.NullPointerException -> L149
            int r7 = r3.nameIndex     // Catch: java.lang.NullPointerException -> L149
            int r8 = r3.typeIndex     // Catch: java.lang.NullPointerException -> L149
            int r9 = r3.signatureIndex     // Catch: java.lang.NullPointerException -> L149
            r5 = 0
            r3 = r10
            r6 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.NullPointerException -> L149
            java.util.ArrayList<com.android.dx.dex.file.DebugInfoDecoder$LocalEntry> r3 = r0.locals
            r3.add(r10)
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry[] r3 = r0.lastEntryForReg
            r3[r2] = r10
            goto L77
        L132:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.NullPointerException -> L149
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.NullPointerException -> L149
            r3.<init>()     // Catch: java.lang.NullPointerException -> L149
            java.lang.String r4 = "nonsensical END_LOCAL on dead register v"
            r3.append(r4)     // Catch: java.lang.NullPointerException -> L149
            r3.append(r2)     // Catch: java.lang.NullPointerException -> L149
            java.lang.String r3 = r3.toString()     // Catch: java.lang.NullPointerException -> L149
            r1.<init>(r3)     // Catch: java.lang.NullPointerException -> L149
            throw r1     // Catch: java.lang.NullPointerException -> L149
        L149:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Encountered END_LOCAL on new v"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L160:
            int r2 = com.android.dex.Leb128.readUnsignedLeb128(r1)
            int r7 = r0.readStringIndex(r1)
            int r8 = r0.readStringIndex(r1)
            int r9 = r0.readStringIndex(r1)
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry r10 = new com.android.dx.dex.file.DebugInfoDecoder$LocalEntry
            int r4 = r0.address
            r5 = 1
            r3 = r10
            r6 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.util.ArrayList<com.android.dx.dex.file.DebugInfoDecoder$LocalEntry> r3 = r0.locals
            r3.add(r10)
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry[] r3 = r0.lastEntryForReg
            r3[r2] = r10
            goto L77
        L185:
            int r2 = com.android.dex.Leb128.readUnsignedLeb128(r1)
            int r15 = r0.readStringIndex(r1)
            int r16 = r0.readStringIndex(r1)
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry r3 = new com.android.dx.dex.file.DebugInfoDecoder$LocalEntry
            int r12 = r0.address
            r13 = 1
            r17 = 0
            r11 = r3
            r14 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            java.util.ArrayList<com.android.dx.dex.file.DebugInfoDecoder$LocalEntry> r4 = r0.locals
            r4.add(r3)
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry[] r4 = r0.lastEntryForReg
            r4[r2] = r3
            goto L77
        L1a8:
            int r2 = r0.line
            int r3 = com.android.dex.Leb128.readSignedLeb128(r1)
            int r2 = r2 + r3
            r0.line = r2
            goto L77
        L1b3:
            int r2 = r0.address
            int r3 = com.android.dex.Leb128.readUnsignedLeb128(r1)
            int r2 = r2 + r3
            r0.address = r2
            goto L77
        L1be:
            return
        L1bf:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Mismatch between parameters_size and prototype"
            r1.<init>(r2)
            throw r1
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

    private int readStringIndex(com.android.dex.util.ByteInput r1) throws java.io.IOException {
            r0 = this;
            int r1 = com.android.dex.Leb128.readUnsignedLeb128(r1)
            int r1 = r1 + (-1)
            return r1
    }

    public static void validateEncode(byte[] r9, com.android.dx.dex.file.DexFile r10, com.android.dx.rop.cst.CstMethodRef r11, com.android.dx.dex.code.DalvCode r12, boolean r13) {
            com.android.dx.dex.code.PositionList r6 = r12.getPositions()
            com.android.dx.dex.code.LocalList r8 = r12.getLocals()
            com.android.dx.dex.code.DalvInsnList r12 = r12.getInsns()
            int r1 = r12.codeSize()
            int r2 = r12.getRegistersSize()
            r0 = r9
            r3 = r13
            r4 = r11
            r5 = r10
            r7 = r8
            validateEncode0(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L1d
            return
        L1d:
            r9 = move-exception
            java.io.PrintStream r10 = java.lang.System.err
            java.lang.String r13 = "instructions:"
            r10.println(r13)
            java.io.PrintStream r10 = java.lang.System.err
            r13 = 1
            java.lang.String r0 = "  "
            r12.debugPrint(r10, r0, r13)
            java.io.PrintStream r10 = java.lang.System.err
            java.lang.String r12 = "local list:"
            r10.println(r12)
            java.io.PrintStream r10 = java.lang.System.err
            r8.debugPrint(r10, r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "while processing "
            r10.append(r12)
            java.lang.String r11 = r11.toHuman()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.android.dex.util.ExceptionWithContext r9 = com.android.dex.util.ExceptionWithContext.withContext(r9, r10)
            throw r9
    }

    private static void validateEncode0(byte[] r8, int r9, int r10, boolean r11, com.android.dx.rop.cst.CstMethodRef r12, com.android.dx.dex.file.DexFile r13, com.android.dx.dex.code.PositionList r14, com.android.dx.dex.code.LocalList r15) {
            com.android.dx.dex.file.DebugInfoDecoder r7 = new com.android.dx.dex.file.DebugInfoDecoder
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.decode()
            java.util.List r8 = r7.getPositionList()
            int r9 = r8.size()
            int r10 = r14.size()
            if (r9 != r10) goto L191
            java.util.Iterator r8 = r8.iterator()
        L21:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L74
            java.lang.Object r9 = r8.next()
            com.android.dx.dex.file.DebugInfoDecoder$PositionEntry r9 = (com.android.dx.dex.file.DebugInfoDecoder.PositionEntry) r9
            int r10 = r14.size()
            int r10 = r10 + (-1)
        L33:
            if (r10 < 0) goto L51
            com.android.dx.dex.code.PositionList$Entry r11 = r14.get(r10)
            int r12 = r9.line
            com.android.dx.rop.code.SourcePosition r13 = r11.getPosition()
            int r13 = r13.getLine()
            if (r12 != r13) goto L4e
            int r12 = r9.address
            int r11 = r11.getAddress()
            if (r12 != r11) goto L4e
            goto L21
        L4e:
            int r10 = r10 + (-1)
            goto L33
        L51:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Could not match position entry: "
            r10.append(r11)
            int r11 = r9.address
            r10.append(r11)
            java.lang.String r11 = ", "
            r10.append(r11)
            int r9 = r9.line
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L74:
            java.util.List r8 = r7.getLocals()
            int r9 = r7.thisStringIdx
            int r10 = r8.size()
            int r11 = r7.getParamBase()
            r12 = 0
            r13 = r12
        L84:
            if (r13 >= r10) goto Lba
            java.lang.Object r14 = r8.get(r13)
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry r14 = (com.android.dx.dex.file.DebugInfoDecoder.LocalEntry) r14
            int r0 = r14.nameIndex
            if (r0 < 0) goto L92
            if (r0 != r9) goto Lb7
        L92:
            int r0 = r13 + 1
        L94:
            if (r0 >= r10) goto Lb7
            java.lang.Object r1 = r8.get(r0)
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry r1 = (com.android.dx.dex.file.DebugInfoDecoder.LocalEntry) r1
            int r2 = r1.address
            if (r2 == 0) goto La1
            goto Lb7
        La1:
            int r2 = r14.reg
            int r3 = r1.reg
            if (r2 != r3) goto Lb4
            boolean r2 = r1.isStart
            if (r2 == 0) goto Lb4
            r8.set(r13, r1)
            r8.remove(r0)
            int r10 = r10 + (-1)
            goto Lb7
        Lb4:
            int r0 = r0 + 1
            goto L94
        Lb7:
            int r13 = r13 + 1
            goto L84
        Lba:
            int r9 = r15.size()
            r13 = r12
        Lbf:
            if (r12 >= r9) goto L190
            com.android.dx.dex.code.LocalList$Entry r14 = r15.get(r12)
            com.android.dx.dex.code.LocalList$Disposition r0 = r14.getDisposition()
            com.android.dx.dex.code.LocalList$Disposition r1 = com.android.dx.dex.code.LocalList.Disposition.END_REPLACED
            if (r0 != r1) goto Lcf
            goto L18c
        Lcf:
            java.lang.Object r0 = r8.get(r13)
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry r0 = (com.android.dx.dex.file.DebugInfoDecoder.LocalEntry) r0
            int r1 = r0.nameIndex
            if (r1 < 0) goto Lda
            goto Lde
        Lda:
            int r13 = r13 + 1
            if (r13 < r10) goto Lcf
        Lde:
            int r1 = r0.address
            int r2 = r0.reg
            int r3 = r14.getRegister()
            java.lang.String r4 = " / decoded "
            if (r2 == r3) goto L107
            java.io.PrintStream r9 = java.lang.System.err
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "local register mismatch at orig "
            r10.append(r11)
            r10.append(r12)
            r10.append(r4)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            r9.println(r10)
            goto L154
        L107:
            boolean r2 = r0.isStart
            boolean r3 = r14.isStart()
            if (r2 == r3) goto L12c
            java.io.PrintStream r9 = java.lang.System.err
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "local start/end mismatch at orig "
            r10.append(r11)
            r10.append(r12)
            r10.append(r4)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            r9.println(r10)
            goto L154
        L12c:
            int r14 = r14.getAddress()
            if (r1 == r14) goto L18a
            if (r1 != 0) goto L138
            int r14 = r0.reg
            if (r14 >= r11) goto L18a
        L138:
            java.io.PrintStream r9 = java.lang.System.err
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "local address mismatch at orig "
            r10.append(r11)
            r10.append(r12)
            r10.append(r4)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            r9.println(r10)
        L154:
            java.io.PrintStream r9 = java.lang.System.err
            java.lang.String r10 = "decoded locals:"
            r9.println(r10)
            java.util.Iterator r8 = r8.iterator()
        L15f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L182
            java.lang.Object r9 = r8.next()
            com.android.dx.dex.file.DebugInfoDecoder$LocalEntry r9 = (com.android.dx.dex.file.DebugInfoDecoder.LocalEntry) r9
            java.io.PrintStream r10 = java.lang.System.err
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "  "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.println(r9)
            goto L15f
        L182:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "local table problem"
            r8.<init>(r9)
            throw r8
        L18a:
            int r13 = r13 + 1
        L18c:
            int r12 = r12 + 1
            goto Lbf
        L190:
            return
        L191:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Decoded positions table not same size was "
            r10.append(r11)
            int r8 = r8.size()
            r10.append(r8)
            java.lang.String r8 = " expected "
            r10.append(r8)
            int r8 = r14.size()
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
    }

    public void decode() {
            r2 = this;
            r2.decode0()     // Catch: java.lang.Exception -> L4
            return
        L4:
            r0 = move-exception
            java.lang.String r1 = "...while decoding debug info"
            com.android.dex.util.ExceptionWithContext r0 = com.android.dex.util.ExceptionWithContext.withContext(r0, r1)
            throw r0
    }

    public java.util.List<com.android.dx.dex.file.DebugInfoDecoder.LocalEntry> getLocals() {
            r1 = this;
            java.util.ArrayList<com.android.dx.dex.file.DebugInfoDecoder$LocalEntry> r0 = r1.locals
            return r0
    }

    public java.util.List<com.android.dx.dex.file.DebugInfoDecoder.PositionEntry> getPositionList() {
            r1 = this;
            java.util.ArrayList<com.android.dx.dex.file.DebugInfoDecoder$PositionEntry> r0 = r1.positions
            return r0
    }
}
