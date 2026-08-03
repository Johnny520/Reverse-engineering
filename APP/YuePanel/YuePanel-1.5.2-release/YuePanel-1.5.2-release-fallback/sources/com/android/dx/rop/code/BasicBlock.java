package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class BasicBlock implements com.android.dx.util.LabeledItem {
    private final com.android.dx.rop.code.InsnList insns;
    private final int label;
    private final int primarySuccessor;
    private final com.android.dx.util.IntList successors;

    public interface Visitor {
        void visitBlock(com.android.dx.rop.code.BasicBlock r1);
    }

    public BasicBlock(int r5, com.android.dx.rop.code.InsnList r6, com.android.dx.util.IntList r7, int r8) {
            r4 = this;
            r4.<init>()
            if (r5 < 0) goto Lae
            r6.throwIfMutable()     // Catch: java.lang.NullPointerException -> La6
            int r0 = r6.size()
            if (r0 == 0) goto L9e
            int r1 = r0 + (-2)
        L10:
            r2 = 1
            if (r1 < 0) goto L40
            com.android.dx.rop.code.Insn r3 = r6.get(r1)
            com.android.dx.rop.code.Rop r3 = r3.getOpcode()
            int r3 = r3.getBranchingness()
            if (r3 != r2) goto L24
            int r1 = r1 + (-1)
            goto L10
        L24:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "insns["
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = "] is a branch or can throw"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L40:
            int r0 = r0 - r2
            com.android.dx.rop.code.Insn r0 = r6.get(r0)
            com.android.dx.rop.code.Rop r0 = r0.getOpcode()
            int r0 = r0.getBranchingness()
            if (r0 == r2) goto L96
            r7.throwIfMutable()     // Catch: java.lang.NullPointerException -> L8e
            r0 = -1
            if (r8 < r0) goto L86
            if (r8 < 0) goto L7d
            boolean r0 = r7.contains(r8)
            if (r0 == 0) goto L5e
            goto L7d
        L5e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "primarySuccessor "
            r6.append(r0)
            r6.append(r8)
            java.lang.String r8 = " not in successors "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L7d:
            r4.label = r5
            r4.insns = r6
            r4.successors = r7
            r4.primarySuccessor = r8
            return
        L86:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "primarySuccessor < -1"
            r5.<init>(r6)
            throw r5
        L8e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "successors == null"
            r5.<init>(r6)
            throw r5
        L96:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "insns does not end with a branch or throwing instruction"
            r5.<init>(r6)
            throw r5
        L9e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "insns.size() == 0"
            r5.<init>(r6)
            throw r5
        La6:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "insns == null"
            r5.<init>(r6)
            throw r5
        Lae:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "label < 0"
            r5.<init>(r6)
            throw r5
    }

    public boolean canThrow() {
            r1 = this;
            com.android.dx.rop.code.InsnList r0 = r1.insns
            com.android.dx.rop.code.Insn r0 = r0.getLast()
            boolean r0 = r0.canThrow()
            return r0
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    public com.android.dx.rop.type.TypeList getExceptionHandlerTypes() {
            r1 = this;
            com.android.dx.rop.code.InsnList r0 = r1.insns
            com.android.dx.rop.code.Insn r0 = r0.getLast()
            com.android.dx.rop.type.TypeList r0 = r0.getCatches()
            return r0
    }

    public com.android.dx.rop.code.Insn getFirstInsn() {
            r2 = this;
            com.android.dx.rop.code.InsnList r0 = r2.insns
            r1 = 0
            com.android.dx.rop.code.Insn r0 = r0.get(r1)
            return r0
    }

    public com.android.dx.rop.code.InsnList getInsns() {
            r1 = this;
            com.android.dx.rop.code.InsnList r0 = r1.insns
            return r0
    }

    @Override // com.android.dx.util.LabeledItem
    public int getLabel() {
            r1 = this;
            int r0 = r1.label
            return r0
    }

    public com.android.dx.rop.code.Insn getLastInsn() {
            r1 = this;
            com.android.dx.rop.code.InsnList r0 = r1.insns
            com.android.dx.rop.code.Insn r0 = r0.getLast()
            return r0
    }

    public int getPrimarySuccessor() {
            r1 = this;
            int r0 = r1.primarySuccessor
            return r0
    }

    public int getSecondarySuccessor() {
            r2 = this;
            com.android.dx.util.IntList r0 = r2.successors
            int r0 = r0.size()
            r1 = 2
            if (r0 != r1) goto L1c
            com.android.dx.util.IntList r0 = r2.successors
            r1 = 0
            int r0 = r0.get(r1)
            int r1 = r2.primarySuccessor
            if (r0 != r1) goto L1b
            com.android.dx.util.IntList r0 = r2.successors
            r1 = 1
            int r0 = r0.get(r1)
        L1b:
            return r0
        L1c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "block doesn't have exactly two successors"
            r0.<init>(r1)
            throw r0
    }

    public com.android.dx.util.IntList getSuccessors() {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.successors
            return r0
    }

    public boolean hasExceptionHandlers() {
            r1 = this;
            com.android.dx.rop.code.InsnList r0 = r1.insns
            com.android.dx.rop.code.Insn r0 = r0.getLast()
            com.android.dx.rop.type.TypeList r0 = r0.getCatches()
            int r0 = r0.size()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = java.lang.System.identityHashCode(r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = r2.label
            java.lang.String r1 = com.android.dx.util.Hex.u2(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.android.dx.rop.code.BasicBlock withRegisterOffset(int r5) {
            r4 = this;
            com.android.dx.rop.code.BasicBlock r0 = new com.android.dx.rop.code.BasicBlock
            int r1 = r4.label
            com.android.dx.rop.code.InsnList r2 = r4.insns
            com.android.dx.rop.code.InsnList r5 = r2.withRegisterOffset(r5)
            com.android.dx.util.IntList r2 = r4.successors
            int r3 = r4.primarySuccessor
            r0.<init>(r1, r5, r2, r3)
            return r0
    }
}
