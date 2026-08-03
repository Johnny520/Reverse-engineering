package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public final class PhiInsn extends com.android.dx.ssa.SsaInsn {
    private final java.util.ArrayList<com.android.dx.ssa.PhiInsn.Operand> operands;
    private final int ropResultReg;
    private com.android.dx.rop.code.RegisterSpecList sources;

    public static class Operand {
        public final int blockIndex;
        public com.android.dx.rop.code.RegisterSpec regSpec;
        public final int ropLabel;

        public Operand(com.android.dx.rop.code.RegisterSpec r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.regSpec = r1
                r0.blockIndex = r2
                r0.ropLabel = r3
                return
        }
    }

    public interface Visitor {
        void visitPhiInsn(com.android.dx.ssa.PhiInsn r1);
    }

    public PhiInsn(int r2, com.android.dx.ssa.SsaBasicBlock r3) {
            r1 = this;
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.VOID
            com.android.dx.rop.code.RegisterSpec r0 = com.android.dx.rop.code.RegisterSpec.make(r2, r0)
            r1.<init>(r0, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.operands = r3
            r1.ropResultReg = r2
            return
    }

    public PhiInsn(com.android.dx.rop.code.RegisterSpec r1, com.android.dx.ssa.SsaBasicBlock r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.operands = r2
            int r1 = r1.getReg()
            r0.ropResultReg = r1
            return
    }

    @Override // com.android.dx.ssa.SsaInsn
    public void accept(com.android.dx.ssa.SsaInsn.Visitor r1) {
            r0 = this;
            r1.visitPhiInsn(r0)
            return
    }

    public void addPhiOperand(com.android.dx.rop.code.RegisterSpec r4, com.android.dx.ssa.SsaBasicBlock r5) {
            r3 = this;
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r0 = r3.operands
            com.android.dx.ssa.PhiInsn$Operand r1 = new com.android.dx.ssa.PhiInsn$Operand
            int r2 = r5.getIndex()
            int r5 = r5.getRopLabel()
            r1.<init>(r4, r2, r5)
            r0.add(r1)
            r4 = 0
            r3.sources = r4
            return
    }

    public boolean areAllOperandsEqual() {
            r5 = this;
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r0 = r5.operands
            int r0 = r0.size()
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r0 = r5.operands
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.android.dx.ssa.PhiInsn$Operand r0 = (com.android.dx.ssa.PhiInsn.Operand) r0
            com.android.dx.rop.code.RegisterSpec r0 = r0.regSpec
            int r0 = r0.getReg()
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r3 = r5.operands
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L34
            java.lang.Object r4 = r3.next()
            com.android.dx.ssa.PhiInsn$Operand r4 = (com.android.dx.ssa.PhiInsn.Operand) r4
            com.android.dx.rop.code.RegisterSpec r4 = r4.regSpec
            int r4 = r4.getReg()
            if (r0 == r4) goto L1f
            return r2
        L34:
            return r1
    }

    @Override // com.android.dx.ssa.SsaInsn
    public boolean canThrow() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void changeResultType(com.android.dx.rop.type.TypeBearer r2, com.android.dx.rop.code.LocalItem r3) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r1.getResult()
            int r0 = r0.getReg()
            com.android.dx.rop.code.RegisterSpec r2 = com.android.dx.rop.code.RegisterSpec.makeLocalOptional(r0, r2, r3)
            r1.setResult(r2)
            return
    }

    @Override // com.android.dx.ssa.SsaInsn
    public com.android.dx.ssa.PhiInsn clone() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "can't clone phi"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public /* bridge */ /* synthetic */ com.android.dx.ssa.SsaInsn clone() {
            r1 = this;
            com.android.dx.ssa.PhiInsn r0 = r1.clone()
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo30397clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.android.dx.ssa.PhiInsn r0 = r1.clone()
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public com.android.dx.rop.code.Rop getOpcode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public com.android.dx.rop.code.Insn getOriginalRopInsn() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getRopResultReg() {
            r1 = this;
            int r0 = r1.ropResultReg
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public com.android.dx.rop.code.RegisterSpecList getSources() {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r4.sources
            if (r0 == 0) goto L5
            return r0
        L5:
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r0 = r4.operands
            int r0 = r0.size()
            if (r0 != 0) goto L10
            com.android.dx.rop.code.RegisterSpecList r0 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            return r0
        L10:
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r0 = r4.operands
            int r0 = r0.size()
            com.android.dx.rop.code.RegisterSpecList r1 = new com.android.dx.rop.code.RegisterSpecList
            r1.<init>(r0)
            r4.sources = r1
            r1 = 0
        L1e:
            if (r1 >= r0) goto L32
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r2 = r4.operands
            java.lang.Object r2 = r2.get(r1)
            com.android.dx.ssa.PhiInsn$Operand r2 = (com.android.dx.ssa.PhiInsn.Operand) r2
            com.android.dx.rop.code.RegisterSpecList r3 = r4.sources
            com.android.dx.rop.code.RegisterSpec r2 = r2.regSpec
            r3.set(r1, r2)
            int r1 = r1 + 1
            goto L1e
        L32:
            com.android.dx.rop.code.RegisterSpecList r0 = r4.sources
            r0.setImmutable()
            com.android.dx.rop.code.RegisterSpecList r0 = r4.sources
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public boolean hasSideEffect() {
            r1 = this;
            boolean r0 = com.android.dx.ssa.Optimizer.getPreserveLocals()
            if (r0 == 0) goto Le
            com.android.dx.rop.code.RegisterSpec r0 = r1.getLocalAssignment()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public boolean isPhiOrMove() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public boolean isRegASource(int r3) {
            r2 = this;
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r0 = r2.operands
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.PhiInsn$Operand r1 = (com.android.dx.ssa.PhiInsn.Operand) r1
            com.android.dx.rop.code.RegisterSpec r1 = r1.regSpec
            int r1 = r1.getReg()
            if (r1 != r3) goto L6
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    @Override // com.android.dx.ssa.SsaInsn
    public final void mapSourceRegisters(com.android.dx.ssa.RegisterMapper r5) {
            r4 = this;
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r0 = r4.operands
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.PhiInsn$Operand r1 = (com.android.dx.ssa.PhiInsn.Operand) r1
            com.android.dx.rop.code.RegisterSpec r2 = r1.regSpec
            com.android.dx.rop.code.RegisterSpec r3 = r5.map(r2)
            r1.regSpec = r3
            if (r2 == r3) goto L6
            com.android.dx.ssa.SsaBasicBlock r3 = r4.getBlock()
            com.android.dx.ssa.SsaMethod r3 = r3.getParent()
            com.android.dx.rop.code.RegisterSpec r1 = r1.regSpec
            r3.onSourceChanged(r4, r2, r1)
            goto L6
        L2a:
            r5 = 0
            r4.sources = r5
            return
    }

    public int predBlockIndexForSourcesIndex(int r2) {
            r1 = this;
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r0 = r1.operands
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.ssa.PhiInsn$Operand r2 = (com.android.dx.ssa.PhiInsn.Operand) r2
            int r2 = r2.blockIndex
            return r2
    }

    public java.util.List<com.android.dx.ssa.SsaBasicBlock> predBlocksForReg(int r5, com.android.dx.ssa.SsaMethod r6) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r1 = r4.operands
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            com.android.dx.ssa.PhiInsn$Operand r2 = (com.android.dx.ssa.PhiInsn.Operand) r2
            com.android.dx.rop.code.RegisterSpec r3 = r2.regSpec
            int r3 = r3.getReg()
            if (r3 != r5) goto Lb
            java.util.ArrayList r3 = r6.getBlocks()
            int r2 = r2.blockIndex
            java.lang.Object r2 = r3.get(r2)
            r0.add(r2)
            goto Lb
        L2d:
            return r0
    }

    public void removePhiRegister(com.android.dx.rop.code.RegisterSpec r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r1 = r5.operands
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            com.android.dx.ssa.PhiInsn$Operand r2 = (com.android.dx.ssa.PhiInsn.Operand) r2
            com.android.dx.rop.code.RegisterSpec r3 = r2.regSpec
            int r3 = r3.getReg()
            int r4 = r6.getReg()
            if (r3 != r4) goto Lb
            r0.add(r2)
            goto Lb
        L27:
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r6 = r5.operands
            r6.removeAll(r0)
            r6 = 0
            r5.sources = r6
            return
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.toHumanWithInline(r0)
            return r0
    }

    public final java.lang.String toHumanWithInline(java.lang.String r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 80
            r0.<init>(r1)
            com.android.dx.rop.code.SourcePosition r1 = com.android.dx.rop.code.SourcePosition.NO_INFO
            r0.append(r1)
            java.lang.String r1 = ": phi"
            r0.append(r1)
            if (r6 == 0) goto L20
            java.lang.String r1 = "("
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ")"
            r0.append(r6)
        L20:
            com.android.dx.rop.code.RegisterSpec r6 = r5.getResult()
            java.lang.String r1 = " "
            java.lang.String r2 = " ."
            if (r6 != 0) goto L2e
            r0.append(r2)
            goto L38
        L2e:
            r0.append(r1)
            java.lang.String r6 = r6.toHuman()
            r0.append(r6)
        L38:
            java.lang.String r6 = " <-"
            r0.append(r6)
            com.android.dx.rop.code.RegisterSpecList r6 = r5.getSources()
            int r6 = r6.size()
            if (r6 != 0) goto L4b
            r0.append(r2)
            goto L88
        L4b:
            r2 = 0
        L4c:
            if (r2 >= r6) goto L88
            r0.append(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.android.dx.rop.code.RegisterSpecList r4 = r5.sources
            com.android.dx.rop.code.RegisterSpec r4 = r4.get(r2)
            java.lang.String r4 = r4.toHuman()
            r3.append(r4)
            java.lang.String r4 = "[b="
            r3.append(r4)
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r4 = r5.operands
            java.lang.Object r4 = r4.get(r2)
            com.android.dx.ssa.PhiInsn$Operand r4 = (com.android.dx.ssa.PhiInsn.Operand) r4
            int r4 = r4.ropLabel
            java.lang.String r4 = com.android.dx.util.Hex.u2(r4)
            r3.append(r4)
            java.lang.String r4 = "]"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            int r2 = r2 + 1
            goto L4c
        L88:
            java.lang.String r6 = r0.toString()
            return r6
    }

    @Override // com.android.dx.ssa.SsaInsn
    public com.android.dx.rop.code.Insn toRopInsn() {
            r2 = this;
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot convert phi insns to rop form"
            r0.<init>(r1)
            throw r0
    }

    public void updateSourcesToDefinitions(com.android.dx.ssa.SsaMethod r5) {
            r4 = this;
            java.util.ArrayList<com.android.dx.ssa.PhiInsn$Operand> r0 = r4.operands
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.PhiInsn$Operand r1 = (com.android.dx.ssa.PhiInsn.Operand) r1
            com.android.dx.rop.code.RegisterSpec r2 = r1.regSpec
            int r2 = r2.getReg()
            com.android.dx.ssa.SsaInsn r2 = r5.getDefinitionForRegister(r2)
            com.android.dx.rop.code.RegisterSpec r2 = r2.getResult()
            com.android.dx.rop.code.RegisterSpec r3 = r1.regSpec
            com.android.dx.rop.type.Type r2 = r2.getType()
            com.android.dx.rop.code.RegisterSpec r2 = r3.withType(r2)
            r1.regSpec = r2
            goto L6
        L2d:
            r5 = 0
            r4.sources = r5
            return
    }
}
