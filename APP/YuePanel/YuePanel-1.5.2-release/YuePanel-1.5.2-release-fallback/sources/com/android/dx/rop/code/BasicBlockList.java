package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class BasicBlockList extends com.android.dx.util.LabeledList {
    private int regCount;

    public static class RegCountVisitor implements com.android.dx.rop.code.Insn.Visitor {
        private int regCount;

        public RegCountVisitor() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.regCount = r0
                return
        }

        private void processReg(com.android.dx.rop.code.RegisterSpec r2) {
                r1 = this;
                int r2 = r2.getNextReg()
                int r0 = r1.regCount
                if (r2 <= r0) goto La
                r1.regCount = r2
            La:
                return
        }

        private void visit(com.android.dx.rop.code.Insn r4) {
                r3 = this;
                com.android.dx.rop.code.RegisterSpec r0 = r4.getResult()
                if (r0 == 0) goto L9
                r3.processReg(r0)
            L9:
                com.android.dx.rop.code.RegisterSpecList r4 = r4.getSources()
                int r0 = r4.size()
                r1 = 0
            L12:
                if (r1 >= r0) goto L1e
                com.android.dx.rop.code.RegisterSpec r2 = r4.get(r1)
                r3.processReg(r2)
                int r1 = r1 + 1
                goto L12
            L1e:
                return
        }

        public int getRegCount() {
                r1 = this;
                int r0 = r1.regCount
                return r0
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitFillArrayDataInsn(com.android.dx.rop.code.FillArrayDataInsn r1) {
                r0 = this;
                r0.visit(r1)
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitInvokePolymorphicInsn(com.android.dx.rop.code.InvokePolymorphicInsn r1) {
                r0 = this;
                r0.visit(r1)
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitPlainCstInsn(com.android.dx.rop.code.PlainCstInsn r1) {
                r0 = this;
                r0.visit(r1)
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitPlainInsn(com.android.dx.rop.code.PlainInsn r1) {
                r0 = this;
                r0.visit(r1)
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitSwitchInsn(com.android.dx.rop.code.SwitchInsn r1) {
                r0 = this;
                r0.visit(r1)
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitThrowingCstInsn(com.android.dx.rop.code.ThrowingCstInsn r1) {
                r0 = this;
                r0.visit(r1)
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitThrowingInsn(com.android.dx.rop.code.ThrowingInsn r1) {
                r0 = this;
                r0.visit(r1)
                return
        }
    }

    public BasicBlockList(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.regCount = r1
            return
    }

    private BasicBlockList(com.android.dx.rop.code.BasicBlockList r1) {
            r0 = this;
            r0.<init>(r1)
            int r1 = r1.regCount
            r0.regCount = r1
            return
    }

    public boolean catchesEqual(com.android.dx.rop.code.BasicBlock r8, com.android.dx.rop.code.BasicBlock r9) {
            r7 = this;
            com.android.dx.rop.type.TypeList r0 = r8.getExceptionHandlerTypes()
            com.android.dx.rop.type.TypeList r1 = r9.getExceptionHandlerTypes()
            boolean r0 = com.android.dx.rop.type.StdTypeList.equalContents(r0, r1)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            com.android.dx.util.IntList r0 = r8.getSuccessors()
            com.android.dx.util.IntList r2 = r9.getSuccessors()
            int r3 = r0.size()
            int r8 = r8.getPrimarySuccessor()
            int r9 = r9.getPrimarySuccessor()
            r4 = -1
            if (r8 == r4) goto L29
            if (r9 != r4) goto L2c
        L29:
            if (r8 == r9) goto L2c
            return r1
        L2c:
            r4 = r1
        L2d:
            if (r4 >= r3) goto L42
            int r5 = r0.get(r4)
            int r6 = r2.get(r4)
            if (r5 != r8) goto L3c
            if (r6 == r9) goto L3f
            return r1
        L3c:
            if (r5 == r6) goto L3f
            return r1
        L3f:
            int r4 = r4 + 1
            goto L2d
        L42:
            r8 = 1
            return r8
    }

    public void forEachInsn(com.android.dx.rop.code.Insn.Visitor r4) {
            r3 = this;
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            com.android.dx.rop.code.BasicBlock r2 = r3.get(r1)
            com.android.dx.rop.code.InsnList r2 = r2.getInsns()
            r2.forEach(r4)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    public com.android.dx.rop.code.BasicBlock get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.rop.code.BasicBlock r1 = (com.android.dx.rop.code.BasicBlock) r1
            return r1
    }

    public int getEffectiveInstructionCount() {
            r9 = this;
            int r0 = r9.size()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L34
            java.lang.Object r4 = r9.getOrNull0(r2)
            com.android.dx.rop.code.BasicBlock r4 = (com.android.dx.rop.code.BasicBlock) r4
            if (r4 == 0) goto L31
            com.android.dx.rop.code.InsnList r4 = r4.getInsns()
            int r5 = r4.size()
            r6 = r1
        L1a:
            if (r6 >= r5) goto L31
            com.android.dx.rop.code.Insn r7 = r4.get(r6)
            com.android.dx.rop.code.Rop r7 = r7.getOpcode()
            int r7 = r7.getOpcode()
            r8 = 54
            if (r7 == r8) goto L2e
            int r3 = r3 + 1
        L2e:
            int r6 = r6 + 1
            goto L1a
        L31:
            int r2 = r2 + 1
            goto L7
        L34:
            return r3
    }

    public int getInstructionCount() {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L1c
            java.lang.Object r3 = r4.getOrNull0(r1)
            com.android.dx.rop.code.BasicBlock r3 = (com.android.dx.rop.code.BasicBlock) r3
            if (r3 == 0) goto L19
            com.android.dx.rop.code.InsnList r3 = r3.getInsns()
            int r3 = r3.size()
            int r2 = r2 + r3
        L19:
            int r1 = r1 + 1
            goto L6
        L1c:
            return r2
    }

    public com.android.dx.rop.code.BasicBlockList getMutableCopy() {
            r1 = this;
            com.android.dx.rop.code.BasicBlockList r0 = new com.android.dx.rop.code.BasicBlockList
            r0.<init>(r1)
            return r0
    }

    public int getRegCount() {
            r2 = this;
            int r0 = r2.regCount
            r1 = -1
            if (r0 != r1) goto L13
            com.android.dx.rop.code.BasicBlockList$RegCountVisitor r0 = new com.android.dx.rop.code.BasicBlockList$RegCountVisitor
            r0.<init>()
            r2.forEachInsn(r0)
            int r0 = r0.getRegCount()
            r2.regCount = r0
        L13:
            int r0 = r2.regCount
            return r0
    }

    public com.android.dx.rop.code.BasicBlock labelToBlock(int r4) {
            r3 = this;
            int r0 = r3.indexOfLabel(r4)
            if (r0 < 0) goto Lb
            com.android.dx.rop.code.BasicBlock r4 = r3.get(r0)
            return r4
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such label: "
            r1.append(r2)
            java.lang.String r4 = com.android.dx.util.Hex.u2(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public com.android.dx.rop.code.BasicBlock preferredSuccessorOf(com.android.dx.rop.code.BasicBlock r5) {
            r4 = this;
            int r0 = r5.getPrimarySuccessor()
            com.android.dx.util.IntList r5 = r5.getSuccessors()
            int r1 = r5.size()
            if (r1 == 0) goto L2c
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L23
            r1 = -1
            if (r0 == r1) goto L1a
            com.android.dx.rop.code.BasicBlock r5 = r4.labelToBlock(r0)
            return r5
        L1a:
            int r5 = r5.get(r3)
            com.android.dx.rop.code.BasicBlock r5 = r4.labelToBlock(r5)
            return r5
        L23:
            int r5 = r5.get(r3)
            com.android.dx.rop.code.BasicBlock r5 = r4.labelToBlock(r5)
            return r5
        L2c:
            r5 = 0
            return r5
    }

    public void set(int r1, com.android.dx.rop.code.BasicBlock r2) {
            r0 = this;
            super.set(r1, r2)
            r1 = -1
            r0.regCount = r1
            return
    }

    public com.android.dx.rop.code.BasicBlockList withRegisterOffset(int r5) {
            r4 = this;
            int r0 = r4.size()
            com.android.dx.rop.code.BasicBlockList r1 = new com.android.dx.rop.code.BasicBlockList
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L1e
            java.lang.Object r3 = r4.get0(r2)
            com.android.dx.rop.code.BasicBlock r3 = (com.android.dx.rop.code.BasicBlock) r3
            if (r3 == 0) goto L1b
            com.android.dx.rop.code.BasicBlock r3 = r3.withRegisterOffset(r5)
            r1.set(r2, r3)
        L1b:
            int r2 = r2 + 1
            goto La
        L1e:
            boolean r5 = r4.isImmutable()
            if (r5 == 0) goto L27
            r1.setImmutable()
        L27:
            return r1
    }
}
