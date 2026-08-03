package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class OutputFinisher {
    private final com.android.dx.dex.DexOptions dexOptions;
    private boolean hasAnyLocalInfo;
    private boolean hasAnyPositionInfo;
    private java.util.ArrayList<com.android.dx.dex.code.DalvInsn> insns;
    private final int paramSize;
    private int reservedCount;
    private int reservedParameterCount;
    private final int unreservedRegCount;

    public OutputFinisher(com.android.dx.dex.DexOptions r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.dexOptions = r1
            r0.unreservedRegCount = r3
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            r0.insns = r1
            r1 = -1
            r0.reservedCount = r1
            r1 = 0
            r0.hasAnyPositionInfo = r1
            r0.hasAnyLocalInfo = r1
            r0.paramSize = r4
            return
    }

    private static void addConstants(java.util.HashSet<com.android.dx.rop.cst.Constant> r3, com.android.dx.dex.code.DalvInsn r4) {
            boolean r0 = r4 instanceof com.android.dx.dex.code.CstInsn
            if (r0 == 0) goto Le
            com.android.dx.dex.code.CstInsn r4 = (com.android.dx.dex.code.CstInsn) r4
            com.android.dx.rop.cst.Constant r4 = r4.getConstant()
            r3.add(r4)
            goto L4c
        Le:
            boolean r0 = r4 instanceof com.android.dx.dex.code.MultiCstInsn
            r1 = 0
            if (r0 == 0) goto L25
            com.android.dx.dex.code.MultiCstInsn r4 = (com.android.dx.dex.code.MultiCstInsn) r4
        L15:
            int r0 = r4.getNumberOfConstants()
            if (r1 >= r0) goto L4c
            com.android.dx.rop.cst.Constant r0 = r4.getConstant(r1)
            r3.add(r0)
            int r1 = r1 + 1
            goto L15
        L25:
            boolean r0 = r4 instanceof com.android.dx.dex.code.LocalSnapshot
            if (r0 == 0) goto L3f
            com.android.dx.dex.code.LocalSnapshot r4 = (com.android.dx.dex.code.LocalSnapshot) r4
            com.android.dx.rop.code.RegisterSpecSet r4 = r4.getLocals()
            int r0 = r4.size()
        L33:
            if (r1 >= r0) goto L4c
            com.android.dx.rop.code.RegisterSpec r2 = r4.get(r1)
            addConstants(r3, r2)
            int r1 = r1 + 1
            goto L33
        L3f:
            boolean r0 = r4 instanceof com.android.dx.dex.code.LocalStart
            if (r0 == 0) goto L4c
            com.android.dx.dex.code.LocalStart r4 = (com.android.dx.dex.code.LocalStart) r4
            com.android.dx.rop.code.RegisterSpec r4 = r4.getLocal()
            addConstants(r3, r4)
        L4c:
            return
    }

    private static void addConstants(java.util.HashSet<com.android.dx.rop.cst.Constant> r3, com.android.dx.rop.code.RegisterSpec r4) {
            if (r4 != 0) goto L3
            return
        L3:
            com.android.dx.rop.code.LocalItem r0 = r4.getLocalItem()
            com.android.dx.rop.cst.CstString r1 = r0.getName()
            com.android.dx.rop.cst.CstString r0 = r0.getSignature()
            com.android.dx.rop.type.Type r4 = r4.getType()
            com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.KNOWN_NULL
            if (r4 == r2) goto L1f
            com.android.dx.rop.cst.CstType r4 = com.android.dx.rop.cst.CstType.intern(r4)
            r3.add(r4)
            goto L28
        L1f:
            com.android.dx.rop.type.Type r4 = com.android.dx.rop.type.Type.OBJECT
            com.android.dx.rop.cst.CstType r4 = com.android.dx.rop.cst.CstType.intern(r4)
            r3.add(r4)
        L28:
            if (r1 == 0) goto L2d
            r3.add(r1)
        L2d:
            if (r0 == 0) goto L32
            r3.add(r0)
        L32:
            return
    }

    private void addReservedParameters(int r2) {
            r1 = this;
            r1.shiftParameters(r2)
            int r0 = r1.reservedParameterCount
            int r0 = r0 + r2
            r1.reservedParameterCount = r0
            return
    }

    private void addReservedRegisters(int r2) {
            r1 = this;
            r1.shiftAllRegisters(r2)
            int r0 = r1.reservedCount
            int r0 = r0 + r2
            r1.reservedCount = r0
            return
    }

    private void align64bits(com.android.dx.dex.code.Dop[] r13) {
            r12 = this;
        L0:
            int r0 = r12.unreservedRegCount
            int r1 = r12.reservedCount
            int r0 = r0 + r1
            int r1 = r12.reservedParameterCount
            int r0 = r0 + r1
            int r1 = r12.paramSize
            int r0 = r0 - r1
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r1 = r12.insns
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L16:
            boolean r7 = r1.hasNext()
            r8 = 1
            if (r7 == 0) goto L59
            java.lang.Object r7 = r1.next()
            com.android.dx.dex.code.DalvInsn r7 = (com.android.dx.dex.code.DalvInsn) r7
            com.android.dx.rop.code.RegisterSpecList r7 = r7.getRegisters()
            r9 = r2
        L28:
            int r10 = r7.size()
            if (r9 >= r10) goto L16
            com.android.dx.rop.code.RegisterSpec r10 = r7.get(r9)
            boolean r11 = r10.isCategory2()
            if (r11 == 0) goto L56
            int r11 = r10.getReg()
            if (r11 < r0) goto L40
            r11 = r8
            goto L41
        L40:
            r11 = r2
        L41:
            boolean r10 = r10.isEvenRegister()
            if (r10 == 0) goto L4f
            if (r11 == 0) goto L4c
            int r4 = r4 + 1
            goto L56
        L4c:
            int r6 = r6 + 1
            goto L56
        L4f:
            if (r11 == 0) goto L54
            int r3 = r3 + 1
            goto L56
        L54:
            int r5 = r5 + 1
        L56:
            int r9 = r9 + 1
            goto L28
        L59:
            if (r3 <= r4) goto L61
            if (r5 <= r6) goto L61
            r12.addReservedRegisters(r8)
            goto L75
        L61:
            if (r3 <= r4) goto L67
            r12.addReservedParameters(r8)
            goto L75
        L67:
            if (r5 <= r6) goto L7b
            r12.addReservedRegisters(r8)
            int r0 = r12.paramSize
            if (r0 == 0) goto L75
            if (r4 <= r3) goto L75
            r12.addReservedParameters(r8)
        L75:
            boolean r0 = r12.reserveRegisters(r13)
            if (r0 != 0) goto L0
        L7b:
            return
    }

    private void assignAddresses() {
            r4 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r4.insns
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r1 >= r0) goto L1d
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r3 = r4.insns
            java.lang.Object r3 = r3.get(r1)
            com.android.dx.dex.code.DalvInsn r3 = (com.android.dx.dex.code.DalvInsn) r3
            r3.setAddress(r2)
            int r3 = r3.codeSize()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L8
        L1d:
            return
    }

    private void assignAddressesAndFixBranches() {
            r1 = this;
        L0:
            r1.assignAddresses()
            boolean r0 = r1.fixBranches()
            if (r0 != 0) goto L0
            return
    }

    private static void assignIndices(com.android.dx.dex.code.CstInsn r2, com.android.dx.dex.code.DalvCode.AssignIndicesCallback r3) {
            com.android.dx.rop.cst.Constant r0 = r2.getConstant()
            int r1 = r3.getIndex(r0)
            if (r1 < 0) goto Ld
            r2.setIndex(r1)
        Ld:
            boolean r1 = r0 instanceof com.android.dx.rop.cst.CstMemberRef
            if (r1 == 0) goto L20
            com.android.dx.rop.cst.CstMemberRef r0 = (com.android.dx.rop.cst.CstMemberRef) r0
            com.android.dx.rop.cst.CstType r0 = r0.getDefiningClass()
            int r3 = r3.getIndex(r0)
            if (r3 < 0) goto L20
            r2.setClassIndex(r3)
        L20:
            return
    }

    private static void assignIndices(com.android.dx.dex.code.MultiCstInsn r3, com.android.dx.dex.code.DalvCode.AssignIndicesCallback r4) {
            r0 = 0
        L1:
            int r1 = r3.getNumberOfConstants()
            if (r0 >= r1) goto L26
            com.android.dx.rop.cst.Constant r1 = r3.getConstant(r0)
            int r2 = r4.getIndex(r1)
            r3.setIndex(r0, r2)
            boolean r2 = r1 instanceof com.android.dx.rop.cst.CstMemberRef
            if (r2 == 0) goto L23
            com.android.dx.rop.cst.CstMemberRef r1 = (com.android.dx.rop.cst.CstMemberRef) r1
            com.android.dx.rop.cst.CstType r1 = r1.getDefiningClass()
            int r1 = r4.getIndex(r1)
            r3.setClassIndex(r1)
        L23:
            int r0 = r0 + 1
            goto L1
        L26:
            return
    }

    private int calculateReservedCount(com.android.dx.dex.code.Dop[] r7) {
            r6 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r6.insns
            int r0 = r0.size()
            int r1 = r6.reservedCount
            r2 = 0
        L9:
            if (r2 >= r0) goto L37
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r3 = r6.insns
            java.lang.Object r3 = r3.get(r2)
            com.android.dx.dex.code.DalvInsn r3 = (com.android.dx.dex.code.DalvInsn) r3
            r4 = r7[r2]
            com.android.dx.dex.code.Dop r5 = r6.findOpcodeForInsn(r3, r4)
            if (r5 != 0) goto L2f
            com.android.dx.dex.code.Dop r4 = r6.findExpandedOpcodeForInsn(r3)
            com.android.dx.dex.code.InsnFormat r4 = r4.getFormat()
            java.util.BitSet r4 = r4.compatibleRegs(r3)
            int r3 = r3.getMinimumRegisterRequirement(r4)
            if (r3 <= r1) goto L32
            r1 = r3
            goto L32
        L2f:
            if (r4 != r5) goto L32
            goto L34
        L32:
            r7[r2] = r5
        L34:
            int r2 = r2 + 1
            goto L9
        L37:
            return r1
    }

    private com.android.dx.dex.code.Dop findExpandedOpcodeForInsn(com.android.dx.dex.code.DalvInsn r4) {
            r3 = this;
            com.android.dx.dex.code.DalvInsn r0 = r4.getLowRegVersion()
            com.android.dx.dex.code.Dop r1 = r4.getOpcode()
            com.android.dx.dex.code.Dop r0 = r3.findOpcodeForInsn(r0, r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            com.android.dex.DexException r0 = new com.android.dex.DexException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No expanded opcode for "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private com.android.dx.dex.code.Dop findOpcodeForInsn(com.android.dx.dex.code.DalvInsn r3, com.android.dx.dex.code.Dop r4) {
            r2 = this;
        L0:
            if (r4 == 0) goto L22
            com.android.dx.dex.code.InsnFormat r0 = r4.getFormat()
            boolean r0 = r0.isCompatible(r3)
            if (r0 == 0) goto L1b
            com.android.dx.dex.DexOptions r0 = r2.dexOptions
            boolean r0 = r0.forceJumbo
            if (r0 == 0) goto L22
            int r0 = r4.getOpcode()
            r1 = 26
            if (r0 == r1) goto L1b
            goto L22
        L1b:
            com.android.dx.dex.DexOptions r0 = r2.dexOptions
            com.android.dx.dex.code.Dop r4 = com.android.dx.dex.code.Dops.getNextOrNull(r4, r0)
            goto L0
        L22:
            return r4
    }

    private boolean fixBranches() {
            r11 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r11.insns
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r1 >= r0) goto L89
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r3 = r11.insns
            java.lang.Object r3 = r3.get(r1)
            com.android.dx.dex.code.DalvInsn r3 = (com.android.dx.dex.code.DalvInsn) r3
            boolean r4 = r3 instanceof com.android.dx.dex.code.TargetInsn
            r5 = 1
            if (r4 != 0) goto L18
            goto L77
        L18:
            com.android.dx.dex.code.Dop r4 = r3.getOpcode()
            r6 = r3
            com.android.dx.dex.code.TargetInsn r6 = (com.android.dx.dex.code.TargetInsn) r6
            com.android.dx.dex.code.InsnFormat r7 = r4.getFormat()
            boolean r7 = r7.branchFits(r6)
            if (r7 == 0) goto L2a
            goto L77
        L2a:
            int r2 = r4.getFamily()
            r7 = 40
            if (r2 != r7) goto L4a
            com.android.dx.dex.code.Dop r2 = r11.findOpcodeForInsn(r3, r4)
            if (r2 == 0) goto L42
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r4 = r11.insns
            com.android.dx.dex.code.DalvInsn r2 = r3.withOpcode(r2)
            r4.set(r1, r2)
            goto L76
        L42:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "method too long"
            r0.<init>(r1)
            throw r0
        L4a:
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r2 = r11.insns     // Catch: java.lang.ClassCastException -> L79 java.lang.IndexOutOfBoundsException -> L81
            int r3 = r1 + 1
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.ClassCastException -> L79 java.lang.IndexOutOfBoundsException -> L81
            com.android.dx.dex.code.CodeAddress r2 = (com.android.dx.dex.code.CodeAddress) r2     // Catch: java.lang.ClassCastException -> L79 java.lang.IndexOutOfBoundsException -> L81
            com.android.dx.dex.code.TargetInsn r4 = new com.android.dx.dex.code.TargetInsn
            com.android.dx.dex.code.Dop r7 = com.android.dx.dex.code.Dops.GOTO
            com.android.dx.rop.code.SourcePosition r8 = r6.getPosition()
            com.android.dx.rop.code.RegisterSpecList r9 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            com.android.dx.dex.code.CodeAddress r10 = r6.getTarget()
            r4.<init>(r7, r8, r9, r10)
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r7 = r11.insns
            r7.set(r1, r4)
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r4 = r11.insns
            com.android.dx.dex.code.TargetInsn r2 = r6.withNewTargetAndReversed(r2)
            r4.add(r1, r2)
            int r0 = r0 + 1
            r1 = r3
        L76:
            r2 = r5
        L77:
            int r1 = r1 + r5
            goto L8
        L79:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unpaired TargetInsn"
            r0.<init>(r1)
            throw r0
        L81:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unpaired TargetInsn (dangling)"
            r0.<init>(r1)
            throw r0
        L89:
            return r2
    }

    private static boolean hasLocalInfo(com.android.dx.dex.code.DalvInsn r5) {
            boolean r0 = r5 instanceof com.android.dx.dex.code.LocalSnapshot
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L21
            com.android.dx.dex.code.LocalSnapshot r5 = (com.android.dx.dex.code.LocalSnapshot) r5
            com.android.dx.rop.code.RegisterSpecSet r5 = r5.getLocals()
            int r0 = r5.size()
            r3 = r1
        L11:
            if (r3 >= r0) goto L32
            com.android.dx.rop.code.RegisterSpec r4 = r5.get(r3)
            boolean r4 = hasLocalInfo(r4)
            if (r4 == 0) goto L1e
            return r2
        L1e:
            int r3 = r3 + 1
            goto L11
        L21:
            boolean r0 = r5 instanceof com.android.dx.dex.code.LocalStart
            if (r0 == 0) goto L32
            com.android.dx.dex.code.LocalStart r5 = (com.android.dx.dex.code.LocalStart) r5
            com.android.dx.rop.code.RegisterSpec r5 = r5.getLocal()
            boolean r5 = hasLocalInfo(r5)
            if (r5 == 0) goto L32
            return r2
        L32:
            return r1
    }

    private static boolean hasLocalInfo(com.android.dx.rop.code.RegisterSpec r0) {
            if (r0 == 0) goto Le
            com.android.dx.rop.code.LocalItem r0 = r0.getLocalItem()
            com.android.dx.rop.cst.CstString r0 = r0.getName()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private com.android.dx.dex.code.Dop[] makeOpcodesArray() {
            r4 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r4.insns
            int r0 = r0.size()
            com.android.dx.dex.code.Dop[] r1 = new com.android.dx.dex.code.Dop[r0]
            r2 = 0
        L9:
            if (r2 >= r0) goto L1c
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r3 = r4.insns
            java.lang.Object r3 = r3.get(r2)
            com.android.dx.dex.code.DalvInsn r3 = (com.android.dx.dex.code.DalvInsn) r3
            com.android.dx.dex.code.Dop r3 = r3.getOpcode()
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L1c:
            return r1
    }

    private void massageInstructions(com.android.dx.dex.code.Dop[] r6) {
            r5 = this;
            int r0 = r5.reservedCount
            if (r0 != 0) goto L29
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r5.insns
            int r0 = r0.size()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L2f
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r2 = r5.insns
            java.lang.Object r2 = r2.get(r1)
            com.android.dx.dex.code.DalvInsn r2 = (com.android.dx.dex.code.DalvInsn) r2
            com.android.dx.dex.code.Dop r3 = r2.getOpcode()
            r4 = r6[r1]
            if (r3 == r4) goto L26
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r3 = r5.insns
            com.android.dx.dex.code.DalvInsn r2 = r2.withOpcode(r4)
            r3.set(r1, r2)
        L26:
            int r1 = r1 + 1
            goto Lb
        L29:
            java.util.ArrayList r6 = r5.performExpansion(r6)
            r5.insns = r6
        L2f:
            return
    }

    private java.util.ArrayList<com.android.dx.dex.code.DalvInsn> performExpansion(com.android.dx.dex.code.Dop[] r12) {
            r11 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r11.insns
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0 * 2
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
        L13:
            if (r3 >= r0) goto L89
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r4 = r11.insns
            java.lang.Object r4 = r4.get(r3)
            com.android.dx.dex.code.DalvInsn r4 = (com.android.dx.dex.code.DalvInsn) r4
            com.android.dx.dex.code.Dop r5 = r4.getOpcode()
            r6 = r12[r3]
            if (r6 == 0) goto L28
            r7 = 0
            r9 = r7
            goto L41
        L28:
            com.android.dx.dex.code.Dop r6 = r11.findExpandedOpcodeForInsn(r4)
            com.android.dx.dex.code.InsnFormat r7 = r6.getFormat()
            java.util.BitSet r7 = r7.compatibleRegs(r4)
            com.android.dx.dex.code.DalvInsn r8 = r4.expandedPrefix(r7)
            com.android.dx.dex.code.DalvInsn r9 = r4.expandedSuffix(r7)
            com.android.dx.dex.code.DalvInsn r4 = r4.expandedVersion(r7)
            r7 = r8
        L41:
            boolean r8 = r4 instanceof com.android.dx.dex.code.CodeAddress
            if (r8 == 0) goto L52
            r8 = r4
            com.android.dx.dex.code.CodeAddress r8 = (com.android.dx.dex.code.CodeAddress) r8
            boolean r10 = r8.getBindsClosely()
            if (r10 == 0) goto L52
            r2.add(r8)
            goto L86
        L52:
            if (r7 == 0) goto L57
            r1.add(r7)
        L57:
            boolean r7 = r4 instanceof com.android.dx.dex.code.ZeroSizeInsn
            if (r7 != 0) goto L78
            int r7 = r2.size()
            if (r7 <= 0) goto L78
            java.util.Iterator r7 = r2.iterator()
        L65:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L75
            java.lang.Object r8 = r7.next()
            com.android.dx.dex.code.CodeAddress r8 = (com.android.dx.dex.code.CodeAddress) r8
            r1.add(r8)
            goto L65
        L75:
            r2.clear()
        L78:
            if (r6 == r5) goto L7e
            com.android.dx.dex.code.DalvInsn r4 = r4.withOpcode(r6)
        L7e:
            r1.add(r4)
            if (r9 == 0) goto L86
            r1.add(r9)
        L86:
            int r3 = r3 + 1
            goto L13
        L89:
            return r1
    }

    private boolean reserveRegisters(com.android.dx.dex.code.Dop[] r8) {
            r7 = this;
            int r0 = r7.reservedCount
            r1 = 0
            if (r0 >= 0) goto L6
            r0 = r1
        L6:
            r2 = r1
        L7:
            int r3 = r7.calculateReservedCount(r8)
            if (r0 < r3) goto L10
            r7.reservedCount = r0
            return r2
        L10:
            int r0 = r3 - r0
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r2 = r7.insns
            int r2 = r2.size()
            r4 = r1
        L19:
            if (r4 >= r2) goto L33
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r5 = r7.insns
            java.lang.Object r5 = r5.get(r4)
            com.android.dx.dex.code.DalvInsn r5 = (com.android.dx.dex.code.DalvInsn) r5
            boolean r6 = r5 instanceof com.android.dx.dex.code.CodeAddress
            if (r6 != 0) goto L30
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r6 = r7.insns
            com.android.dx.dex.code.DalvInsn r5 = r5.withRegisterOffset(r0)
            r6.set(r4, r5)
        L30:
            int r4 = r4 + 1
            goto L19
        L33:
            r2 = 1
            r0 = r3
            goto L7
    }

    private void shiftAllRegisters(int r5) {
            r4 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r4.insns
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L21
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r2 = r4.insns
            java.lang.Object r2 = r2.get(r1)
            com.android.dx.dex.code.DalvInsn r2 = (com.android.dx.dex.code.DalvInsn) r2
            boolean r3 = r2 instanceof com.android.dx.dex.code.CodeAddress
            if (r3 != 0) goto L1e
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r3 = r4.insns
            com.android.dx.dex.code.DalvInsn r2 = r2.withRegisterOffset(r5)
            r3.set(r1, r2)
        L1e:
            int r1 = r1 + 1
            goto L7
        L21:
            return
    }

    private void shiftParameters(int r9) {
            r8 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r8.insns
            int r0 = r0.size()
            int r1 = r8.unreservedRegCount
            int r2 = r8.reservedCount
            int r1 = r1 + r2
            int r2 = r8.reservedParameterCount
            int r1 = r1 + r2
            int r2 = r8.paramSize
            int r2 = r1 - r2
            com.android.dx.ssa.BasicRegisterMapper r3 = new com.android.dx.ssa.BasicRegisterMapper
            r3.<init>(r1)
            r4 = 0
            r5 = r4
        L19:
            if (r5 >= r1) goto L2a
            r6 = 1
            if (r5 < r2) goto L24
            int r7 = r5 + r9
            r3.addMapping(r5, r7, r6)
            goto L27
        L24:
            r3.addMapping(r5, r5, r6)
        L27:
            int r5 = r5 + 1
            goto L19
        L2a:
            if (r4 >= r0) goto L44
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r9 = r8.insns
            java.lang.Object r9 = r9.get(r4)
            com.android.dx.dex.code.DalvInsn r9 = (com.android.dx.dex.code.DalvInsn) r9
            boolean r1 = r9 instanceof com.android.dx.dex.code.CodeAddress
            if (r1 != 0) goto L41
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r1 = r8.insns
            com.android.dx.dex.code.DalvInsn r9 = r9.withMapper(r3)
            r1.set(r4, r9)
        L41:
            int r4 = r4 + 1
            goto L2a
        L44:
            return
    }

    private void updateInfo(com.android.dx.dex.code.DalvInsn r3) {
            r2 = this;
            boolean r0 = r2.hasAnyPositionInfo
            r1 = 1
            if (r0 != 0) goto L11
            com.android.dx.rop.code.SourcePosition r0 = r3.getPosition()
            int r0 = r0.getLine()
            if (r0 < 0) goto L11
            r2.hasAnyPositionInfo = r1
        L11:
            boolean r0 = r2.hasAnyLocalInfo
            if (r0 != 0) goto L1d
            boolean r3 = hasLocalInfo(r3)
            if (r3 == 0) goto L1d
            r2.hasAnyLocalInfo = r1
        L1d:
            return
    }

    public void add(com.android.dx.dex.code.DalvInsn r2) {
            r1 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r1.insns
            r0.add(r2)
            r1.updateInfo(r2)
            return
    }

    public void assignIndices(com.android.dx.dex.code.DalvCode.AssignIndicesCallback r4) {
            r3 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r3.insns
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            com.android.dx.dex.code.DalvInsn r1 = (com.android.dx.dex.code.DalvInsn) r1
            boolean r2 = r1 instanceof com.android.dx.dex.code.CstInsn
            if (r2 == 0) goto L1c
            com.android.dx.dex.code.CstInsn r1 = (com.android.dx.dex.code.CstInsn) r1
            assignIndices(r1, r4)
            goto L6
        L1c:
            boolean r2 = r1 instanceof com.android.dx.dex.code.MultiCstInsn
            if (r2 == 0) goto L6
            com.android.dx.dex.code.MultiCstInsn r1 = (com.android.dx.dex.code.MultiCstInsn) r1
            assignIndices(r1, r4)
            goto L6
        L26:
            return
    }

    public com.android.dx.dex.code.DalvInsnList finishProcessingAndGetList() {
            r3 = this;
            int r0 = r3.reservedCount
            if (r0 >= 0) goto L29
            com.android.dx.dex.code.Dop[] r0 = r3.makeOpcodesArray()
            r3.reserveRegisters(r0)
            com.android.dx.dex.DexOptions r1 = r3.dexOptions
            boolean r1 = r1.ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER
            if (r1 == 0) goto L14
            r3.align64bits(r0)
        L14:
            r3.massageInstructions(r0)
            r3.assignAddressesAndFixBranches()
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r3.insns
            int r1 = r3.reservedCount
            int r2 = r3.unreservedRegCount
            int r1 = r1 + r2
            int r2 = r3.reservedParameterCount
            int r1 = r1 + r2
            com.android.dx.dex.code.DalvInsnList r0 = com.android.dx.dex.code.DalvInsnList.makeImmutable(r0, r1)
            return r0
        L29:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "already processed"
            r0.<init>(r1)
            throw r0
    }

    public com.android.dx.dex.code.DalvInsn get(int r2) {
            r1 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r1.insns
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.dex.code.DalvInsn r2 = (com.android.dx.dex.code.DalvInsn) r2
            return r2
    }

    public java.util.HashSet<com.android.dx.rop.cst.Constant> getAllConstants() {
            r3 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 20
            r0.<init>(r1)
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r1 = r3.insns
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            com.android.dx.dex.code.DalvInsn r2 = (com.android.dx.dex.code.DalvInsn) r2
            addConstants(r0, r2)
            goto Ld
        L1d:
            return r0
    }

    public boolean hasAnyLocalInfo() {
            r1 = this;
            boolean r0 = r1.hasAnyLocalInfo
            return r0
    }

    public boolean hasAnyPositionInfo() {
            r1 = this;
            boolean r0 = r1.hasAnyPositionInfo
            return r0
    }

    public void insert(int r2, com.android.dx.dex.code.DalvInsn r3) {
            r1 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r1.insns
            r0.add(r2, r3)
            r1.updateInfo(r3)
            return
    }

    public void reverseBranch(int r3, com.android.dx.dex.code.CodeAddress r4) {
            r2 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r2.insns
            int r0 = r0.size()
            int r0 = r0 - r3
            int r0 = r0 + (-1)
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r3 = r2.insns     // Catch: java.lang.ClassCastException -> L1b java.lang.IndexOutOfBoundsException -> L23
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.ClassCastException -> L1b java.lang.IndexOutOfBoundsException -> L23
            com.android.dx.dex.code.TargetInsn r3 = (com.android.dx.dex.code.TargetInsn) r3     // Catch: java.lang.ClassCastException -> L1b java.lang.IndexOutOfBoundsException -> L23
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r1 = r2.insns
            com.android.dx.dex.code.TargetInsn r3 = r3.withNewTargetAndReversed(r4)
            r1.set(r0, r3)
            return
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "non-reversible instruction"
            r3.<init>(r4)
            throw r3
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "too few instructions"
            r3.<init>(r4)
            throw r3
    }

    public int size() {
            r1 = this;
            java.util.ArrayList<com.android.dx.dex.code.DalvInsn> r0 = r1.insns
            int r0 = r0.size()
            return r0
    }
}
