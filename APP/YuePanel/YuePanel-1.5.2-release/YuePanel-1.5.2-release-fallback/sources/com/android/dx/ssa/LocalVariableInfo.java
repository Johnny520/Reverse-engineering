package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class LocalVariableInfo extends com.android.dx.util.MutabilityControl {
    private final com.android.dx.rop.code.RegisterSpecSet[] blockStarts;
    private final com.android.dx.rop.code.RegisterSpecSet emptySet;
    private final java.util.HashMap<com.android.dx.ssa.SsaInsn, com.android.dx.rop.code.RegisterSpec> insnAssignments;
    private final int regCount;

    public LocalVariableInfo(com.android.dx.ssa.SsaMethod r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L29
            java.util.ArrayList r0 = r3.getBlocks()
            int r3 = r3.getRegCount()
            r2.regCount = r3
            com.android.dx.rop.code.RegisterSpecSet r1 = new com.android.dx.rop.code.RegisterSpecSet
            r1.<init>(r3)
            r2.emptySet = r1
            int r3 = r0.size()
            com.android.dx.rop.code.RegisterSpecSet[] r3 = new com.android.dx.rop.code.RegisterSpecSet[r3]
            r2.blockStarts = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.insnAssignments = r3
            r1.setImmutable()
            return
        L29:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "method == null"
            r3.<init>(r0)
            throw r3
    }

    private com.android.dx.rop.code.RegisterSpecSet getStarts0(int r2) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecSet[] r0 = r1.blockStarts     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
            r2 = r0[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
            return r2
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bogus index"
            r2.<init>(r0)
            throw r2
    }

    public void addAssignment(com.android.dx.ssa.SsaInsn r2, com.android.dx.rop.code.RegisterSpec r3) {
            r1 = this;
            r1.throwIfImmutable()
            if (r2 == 0) goto L15
            if (r3 == 0) goto Ld
            java.util.HashMap<com.android.dx.ssa.SsaInsn, com.android.dx.rop.code.RegisterSpec> r0 = r1.insnAssignments
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

    public com.android.dx.rop.code.RegisterSpec getAssignment(com.android.dx.ssa.SsaInsn r2) {
            r1 = this;
            java.util.HashMap<com.android.dx.ssa.SsaInsn, com.android.dx.rop.code.RegisterSpec> r0 = r1.insnAssignments
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.rop.code.RegisterSpec r2 = (com.android.dx.rop.code.RegisterSpec) r2
            return r2
    }

    public int getAssignmentCount() {
            r1 = this;
            java.util.HashMap<com.android.dx.ssa.SsaInsn, com.android.dx.rop.code.RegisterSpec> r0 = r1.insnAssignments
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

    public com.android.dx.rop.code.RegisterSpecSet getStarts(com.android.dx.ssa.SsaBasicBlock r1) {
            r0 = this;
            int r1 = r1.getIndex()
            com.android.dx.rop.code.RegisterSpecSet r1 = r0.getStarts(r1)
            return r1
    }

    public boolean mergeStarts(int r4, com.android.dx.rop.code.RegisterSpecSet r5) {
            r3 = this;
            com.android.dx.rop.code.RegisterSpecSet r0 = r3.getStarts0(r4)
            r1 = 1
            if (r0 != 0) goto Lb
            r3.setStarts(r4, r5)
            return r1
        Lb:
            com.android.dx.rop.code.RegisterSpecSet r2 = r0.mutableCopy()
            r2.intersect(r5, r1)
            boolean r5 = r0.equals(r2)
            if (r5 == 0) goto L1a
            r4 = 0
            return r4
        L1a:
            r2.setImmutable()
            r3.setStarts(r4, r2)
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
            java.lang.String r3 = "bogus index"
            r2.<init>(r3)
            throw r2
        L12:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "specs == null"
            r2.<init>(r3)
            throw r2
    }
}
