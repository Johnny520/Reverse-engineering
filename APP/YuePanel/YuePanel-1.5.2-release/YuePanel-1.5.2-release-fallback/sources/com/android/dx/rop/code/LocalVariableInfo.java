package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class LocalVariableInfo extends com.android.dx.util.MutabilityControl {
    private final com.android.dx.rop.code.RegisterSpecSet[] blockStarts;
    private final com.android.dx.rop.code.RegisterSpecSet emptySet;
    private final java.util.HashMap<com.android.dx.rop.code.Insn, com.android.dx.rop.code.RegisterSpec> insnAssignments;
    private final int regCount;

    public LocalVariableInfo(com.android.dx.rop.code.RopMethod r4) {
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L2d
            com.android.dx.rop.code.BasicBlockList r4 = r4.getBlocks()
            int r0 = r4.getMaxLabel()
            int r1 = r4.getRegCount()
            r3.regCount = r1
            com.android.dx.rop.code.RegisterSpecSet r2 = new com.android.dx.rop.code.RegisterSpecSet
            r2.<init>(r1)
            r3.emptySet = r2
            com.android.dx.rop.code.RegisterSpecSet[] r0 = new com.android.dx.rop.code.RegisterSpecSet[r0]
            r3.blockStarts = r0
            java.util.HashMap r0 = new java.util.HashMap
            int r4 = r4.getInstructionCount()
            r0.<init>(r4)
            r3.insnAssignments = r0
            r2.setImmutable()
            return
        L2d:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "method == null"
            r4.<init>(r0)
            throw r4
    }

    private com.android.dx.rop.code.RegisterSpecSet getStarts0(int r2) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecSet[] r0 = r1.blockStarts     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
            r2 = r0[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
            return r2
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bogus label"
            r2.<init>(r0)
            throw r2
    }

    public void addAssignment(com.android.dx.rop.code.Insn r2, com.android.dx.rop.code.RegisterSpec r3) {
            r1 = this;
            r1.throwIfImmutable()
            if (r2 == 0) goto L15
            if (r3 == 0) goto Ld
            java.util.HashMap<com.android.dx.rop.code.Insn, com.android.dx.rop.code.RegisterSpec> r0 = r1.insnAssignments
            r0.put(r2, r3)
            return
        Ld:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "spec == null"
            r2.<init>(r3)
            throw r2
        L15:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "insn == null"
            r2.<init>(r3)
            throw r2
    }

    public void debugDump() {
            r4 = this;
            r0 = 0
        L1:
            com.android.dx.rop.code.RegisterSpecSet[] r1 = r4.blockStarts
            int r2 = r1.length
            if (r0 >= r2) goto L35
            r1 = r1[r0]
            if (r1 != 0) goto Lb
            goto L32
        Lb:
            com.android.dx.rop.code.RegisterSpecSet r2 = r4.emptySet
            if (r1 != r2) goto L1f
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "%04x: empty set\n"
            r1.printf(r3, r2)
            goto L32
        L1f:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            com.android.dx.rop.code.RegisterSpecSet[] r3 = r4.blockStarts
            r3 = r3[r0]
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "%04x: %s\n"
            r1.printf(r3, r2)
        L32:
            int r0 = r0 + 1
            goto L1
        L35:
            return
    }

    public com.android.dx.rop.code.RegisterSpec getAssignment(com.android.dx.rop.code.Insn r2) {
            r1 = this;
            java.util.HashMap<com.android.dx.rop.code.Insn, com.android.dx.rop.code.RegisterSpec> r0 = r1.insnAssignments
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.rop.code.RegisterSpec r2 = (com.android.dx.rop.code.RegisterSpec) r2
            return r2
    }

    public int getAssignmentCount() {
            r1 = this;
            java.util.HashMap<com.android.dx.rop.code.Insn, com.android.dx.rop.code.RegisterSpec> r0 = r1.insnAssignments
            int r0 = r0.size()
            return r0
    }

    public com.android.dx.rop.code.RegisterSpecSet getStarts(int r1) {
            r0 = this;
            com.android.dx.rop.code.RegisterSpecSet r1 = r0.getStarts0(r1)
            if (r1 == 0) goto L7
            goto L9
        L7:
            com.android.dx.rop.code.RegisterSpecSet r1 = r0.emptySet
        L9:
            return r1
    }

    public com.android.dx.rop.code.RegisterSpecSet getStarts(com.android.dx.rop.code.BasicBlock r1) {
            r0 = this;
            int r1 = r1.getLabel()
            com.android.dx.rop.code.RegisterSpecSet r1 = r0.getStarts(r1)
            return r1
    }

    public boolean mergeStarts(int r5, com.android.dx.rop.code.RegisterSpecSet r6) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecSet r0 = r4.getStarts0(r5)
            r1 = 1
            if (r0 != 0) goto Lb
            r4.setStarts(r5, r6)
            return r1
        Lb:
            com.android.dx.rop.code.RegisterSpecSet r2 = r0.mutableCopy()
            int r3 = r0.size()
            if (r3 == 0) goto L19
            r2.intersect(r6, r1)
            goto L1d
        L19:
            com.android.dx.rop.code.RegisterSpecSet r2 = r6.mutableCopy()
        L1d:
            boolean r6 = r0.equals(r2)
            if (r6 == 0) goto L25
            r5 = 0
            return r5
        L25:
            r2.setImmutable()
            r4.setStarts(r5, r2)
            return r1
    }

    public com.android.dx.rop.code.RegisterSpecSet mutableCopyOfStarts(int r2) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecSet r2 = r1.getStarts0(r2)
            if (r2 == 0) goto Lb
            com.android.dx.rop.code.RegisterSpecSet r2 = r2.mutableCopy()
            goto L12
        Lb:
            com.android.dx.rop.code.RegisterSpecSet r2 = new com.android.dx.rop.code.RegisterSpecSet
            int r0 = r1.regCount
            r2.<init>(r0)
        L12:
            return r2
    }

    public void setStarts(int r2, com.android.dx.rop.code.RegisterSpecSet r3) {
            r1 = this;
            r1.throwIfImmutable()
            if (r3 == 0) goto L12
            com.android.dx.rop.code.RegisterSpecSet[] r0 = r1.blockStarts     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La
            r0[r2] = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> La
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "bogus label"
            r2.<init>(r3)
            throw r2
        L12:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "specs == null"
            r2.<init>(r3)
            throw r2
    }
}
