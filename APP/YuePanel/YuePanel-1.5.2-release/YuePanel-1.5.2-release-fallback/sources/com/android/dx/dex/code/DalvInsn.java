package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public abstract class DalvInsn {
    private int address;
    private final com.android.dx.dex.code.Dop opcode;
    private final com.android.dx.rop.code.SourcePosition position;
    private final com.android.dx.rop.code.RegisterSpecList registers;

    public DalvInsn(com.android.dx.dex.code.Dop r2, com.android.dx.rop.code.SourcePosition r3, com.android.dx.rop.code.RegisterSpecList r4) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L23
            if (r3 == 0) goto L1b
            if (r4 == 0) goto L13
            r0 = -1
            r1.address = r0
            r1.opcode = r2
            r1.position = r3
            r1.registers = r4
            return
        L13:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "registers == null"
            r2.<init>(r3)
            throw r2
        L1b:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "position == null"
            r2.<init>(r3)
            throw r2
        L23:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "opcode == null"
            r2.<init>(r3)
            throw r2
    }

    public static com.android.dx.dex.code.SimpleInsn makeMove(com.android.dx.rop.code.SourcePosition r5, com.android.dx.rop.code.RegisterSpec r6, com.android.dx.rop.code.RegisterSpec r7) {
            int r0 = r6.getCategory()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            com.android.dx.rop.type.Type r0 = r6.getType()
            boolean r0 = r0.isReference()
            int r2 = r6.getReg()
            int r3 = r7.getReg()
            r3 = r3 | r2
            r4 = 16
            if (r3 >= r4) goto L2b
            if (r0 == 0) goto L23
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.MOVE_OBJECT
            goto L48
        L23:
            if (r1 == 0) goto L28
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.MOVE
            goto L48
        L28:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.MOVE_WIDE
            goto L48
        L2b:
            r3 = 256(0x100, float:3.59E-43)
            if (r2 >= r3) goto L3c
            if (r0 == 0) goto L34
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.MOVE_OBJECT_FROM16
            goto L48
        L34:
            if (r1 == 0) goto L39
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.MOVE_FROM16
            goto L48
        L39:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.MOVE_WIDE_FROM16
            goto L48
        L3c:
            if (r0 == 0) goto L41
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.MOVE_OBJECT_16
            goto L48
        L41:
            if (r1 == 0) goto L46
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.MOVE_16
            goto L48
        L46:
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.MOVE_WIDE_16
        L48:
            com.android.dx.dex.code.SimpleInsn r1 = new com.android.dx.dex.code.SimpleInsn
            com.android.dx.rop.code.RegisterSpecList r6 = com.android.dx.rop.code.RegisterSpecList.make(r6, r7)
            r1.<init>(r0, r5, r6)
            return r1
    }

    public abstract java.lang.String argString();

    public abstract int codeSize();

    public java.lang.String cstComment() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not supported."
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String cstString() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not supported."
            r0.<init>(r1)
            throw r0
    }

    public com.android.dx.dex.code.DalvInsn expandedPrefix(java.util.BitSet r5) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r4.registers
            r1 = 0
            boolean r2 = r5.get(r1)
            boolean r3 = r4.hasResult()
            if (r3 == 0) goto L10
            r5.set(r1)
        L10:
            com.android.dx.rop.code.RegisterSpecList r0 = r0.subset(r5)
            boolean r3 = r4.hasResult()
            if (r3 == 0) goto L1d
            r5.set(r1, r2)
        L1d:
            int r5 = r0.size()
            if (r5 != 0) goto L25
            r5 = 0
            return r5
        L25:
            com.android.dx.dex.code.HighRegisterPrefix r5 = new com.android.dx.dex.code.HighRegisterPrefix
            com.android.dx.rop.code.SourcePosition r1 = r4.position
            r5.<init>(r1, r0)
            return r5
    }

    public com.android.dx.dex.code.DalvInsn expandedSuffix(java.util.BitSet r3) {
            r2 = this;
            boolean r0 = r2.hasResult()
            if (r0 == 0) goto L1e
            r0 = 0
            boolean r3 = r3.get(r0)
            if (r3 != 0) goto L1e
            com.android.dx.rop.code.RegisterSpecList r3 = r2.registers
            com.android.dx.rop.code.RegisterSpec r3 = r3.get(r0)
            com.android.dx.rop.code.SourcePosition r1 = r2.position
            com.android.dx.rop.code.RegisterSpec r0 = r3.withReg(r0)
            com.android.dx.dex.code.SimpleInsn r3 = makeMove(r1, r3, r0)
            return r3
        L1e:
            r3 = 0
            return r3
    }

    public com.android.dx.dex.code.DalvInsn expandedVersion(java.util.BitSet r4) {
            r3 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r3.registers
            r1 = 0
            boolean r2 = r3.hasResult()
            com.android.dx.rop.code.RegisterSpecList r4 = r0.withExpandedRegisters(r1, r2, r4)
            com.android.dx.dex.code.DalvInsn r4 = r3.withRegisters(r4)
            return r4
    }

    public final int getAddress() {
            r2 = this;
            int r0 = r2.address
            if (r0 < 0) goto L5
            return r0
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "address not yet known"
            r0.<init>(r1)
            throw r0
    }

    public com.android.dx.dex.code.DalvInsn getLowRegVersion() {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r4.registers
            boolean r1 = r4.hasResult()
            r2 = 0
            r3 = 0
            com.android.dx.rop.code.RegisterSpecList r0 = r0.withExpandedRegisters(r3, r1, r2)
            com.android.dx.dex.code.DalvInsn r0 = r4.withRegisters(r0)
            return r0
    }

    public final int getMinimumRegisterRequirement(java.util.BitSet r6) {
            r5 = this;
            boolean r0 = r5.hasResult()
            com.android.dx.rop.code.RegisterSpecList r1 = r5.registers
            int r1 = r1.size()
            r2 = 0
            if (r0 == 0) goto L1e
            boolean r3 = r6.get(r2)
            if (r3 != 0) goto L1e
            com.android.dx.rop.code.RegisterSpecList r3 = r5.registers
            com.android.dx.rop.code.RegisterSpec r3 = r3.get(r2)
            int r3 = r3.getCategory()
            goto L1f
        L1e:
            r3 = r2
        L1f:
            if (r0 >= r1) goto L35
            boolean r4 = r6.get(r0)
            if (r4 != 0) goto L32
            com.android.dx.rop.code.RegisterSpecList r4 = r5.registers
            com.android.dx.rop.code.RegisterSpec r4 = r4.get(r0)
            int r4 = r4.getCategory()
            int r2 = r2 + r4
        L32:
            int r0 = r0 + 1
            goto L1f
        L35:
            int r6 = java.lang.Math.max(r2, r3)
            return r6
    }

    public final int getNextAddress() {
            r2 = this;
            int r0 = r2.getAddress()
            int r1 = r2.codeSize()
            int r0 = r0 + r1
            return r0
    }

    public final com.android.dx.dex.code.Dop getOpcode() {
            r1 = this;
            com.android.dx.dex.code.Dop r0 = r1.opcode
            return r0
    }

    public final com.android.dx.rop.code.SourcePosition getPosition() {
            r1 = this;
            com.android.dx.rop.code.SourcePosition r0 = r1.position
            return r0
    }

    public final com.android.dx.rop.code.RegisterSpecList getRegisters() {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r1.registers
            return r0
    }

    public final boolean hasAddress() {
            r1 = this;
            int r0 = r1.address
            if (r0 < 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean hasResult() {
            r1 = this;
            com.android.dx.dex.code.Dop r0 = r1.opcode
            boolean r0 = r0.hasResult()
            return r0
    }

    public final java.lang.String identifierString() {
            r2 = this;
            int r0 = r2.address
            r1 = -1
            if (r0 == r1) goto L14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "%04x"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
        L14:
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = com.android.dx.util.Hex.u4(r0)
            return r0
    }

    public final java.lang.String listingString(java.lang.String r3, int r4, boolean r5) {
            r2 = this;
            java.lang.String r5 = r2.listingString0(r5)
            if (r5 != 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = r2.identifierString()
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            int r0 = r3.length()
            if (r4 != 0) goto L2b
            int r4 = r5.length()
            goto L2c
        L2b:
            int r4 = r4 - r0
        L2c:
            java.lang.String r1 = ""
            java.lang.String r3 = com.android.dx.util.TwoColumnOutput.toString(r3, r0, r1, r5, r4)
            return r3
    }

    public abstract java.lang.String listingString0(boolean r1);

    public final void setAddress(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.address = r2
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "address < 0"
            r2.<init>(r0)
            throw r2
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.String r1 = r6.identifierString()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            com.android.dx.rop.code.SourcePosition r2 = r6.position
            r0.append(r2)
            java.lang.String r2 = ": "
            r0.append(r2)
            com.android.dx.dex.code.Dop r2 = r6.opcode
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            com.android.dx.rop.code.RegisterSpecList r2 = r6.registers
            int r2 = r2.size()
            if (r2 == 0) goto L3e
            com.android.dx.rop.code.RegisterSpecList r2 = r6.registers
            java.lang.String r3 = ", "
            r4 = 0
            java.lang.String r5 = " "
            java.lang.String r2 = r2.toHuman(r5, r3, r4)
            r0.append(r2)
            r2 = 1
            goto L3f
        L3e:
            r2 = 0
        L3f:
            java.lang.String r3 = r6.argString()
            if (r3 == 0) goto L52
            if (r2 == 0) goto L4c
            r2 = 44
            r0.append(r2)
        L4c:
            r0.append(r1)
            r0.append(r3)
        L52:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.android.dx.dex.code.DalvInsn withMapper(com.android.dx.ssa.RegisterMapper r2) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r1.getRegisters()
            com.android.dx.rop.code.RegisterSpecList r2 = r2.map(r0)
            com.android.dx.dex.code.DalvInsn r2 = r1.withRegisters(r2)
            return r2
    }

    public abstract com.android.dx.dex.code.DalvInsn withOpcode(com.android.dx.dex.code.Dop r1);

    public abstract com.android.dx.dex.code.DalvInsn withRegisterOffset(int r1);

    public abstract com.android.dx.dex.code.DalvInsn withRegisters(com.android.dx.rop.code.RegisterSpecList r1);

    public abstract void writeTo(com.android.dx.util.AnnotatedOutput r1);
}
