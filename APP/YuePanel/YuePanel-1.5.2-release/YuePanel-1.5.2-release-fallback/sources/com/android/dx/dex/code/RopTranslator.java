package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class RopTranslator {
    private final com.android.dx.dex.code.BlockAddresses addresses;
    private final com.android.dx.dex.DexOptions dexOptions;
    private final com.android.dx.rop.code.LocalVariableInfo locals;
    private final com.android.dx.rop.code.RopMethod method;
    private int[] order;
    private final com.android.dx.dex.code.OutputCollector output;
    private final int paramSize;
    private final boolean paramsAreInOrder;
    private final int positionInfo;
    private final int regCount;
    private final com.android.dx.dex.code.RopTranslator.TranslationVisitor translationVisitor;


    public class LocalVariableAwareTranslationVisitor extends com.android.dx.dex.code.RopTranslator.TranslationVisitor {
        private final com.android.dx.rop.code.LocalVariableInfo locals;
        final /* synthetic */ com.android.dx.dex.code.RopTranslator this$0;

        public LocalVariableAwareTranslationVisitor(com.android.dx.dex.code.RopTranslator r1, com.android.dx.dex.code.OutputCollector r2, com.android.dx.rop.code.LocalVariableInfo r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                r0.locals = r3
                return
        }

        public void addIntroductionIfNecessary(com.android.dx.rop.code.Insn r3) {
                r2 = this;
                com.android.dx.rop.code.LocalVariableInfo r0 = r2.locals
                com.android.dx.rop.code.RegisterSpec r0 = r0.getAssignment(r3)
                if (r0 == 0) goto L14
                com.android.dx.dex.code.LocalStart r1 = new com.android.dx.dex.code.LocalStart
                com.android.dx.rop.code.SourcePosition r3 = r3.getPosition()
                r1.<init>(r3, r0)
                r2.addOutput(r1)
            L14:
                return
        }

        @Override // com.android.dx.dex.code.RopTranslator.TranslationVisitor, com.android.dx.rop.code.Insn.Visitor
        public void visitPlainCstInsn(com.android.dx.rop.code.PlainCstInsn r1) {
                r0 = this;
                super.visitPlainCstInsn(r1)
                r0.addIntroductionIfNecessary(r1)
                return
        }

        @Override // com.android.dx.dex.code.RopTranslator.TranslationVisitor, com.android.dx.rop.code.Insn.Visitor
        public void visitPlainInsn(com.android.dx.rop.code.PlainInsn r1) {
                r0 = this;
                super.visitPlainInsn(r1)
                r0.addIntroductionIfNecessary(r1)
                return
        }

        @Override // com.android.dx.dex.code.RopTranslator.TranslationVisitor, com.android.dx.rop.code.Insn.Visitor
        public void visitSwitchInsn(com.android.dx.rop.code.SwitchInsn r1) {
                r0 = this;
                super.visitSwitchInsn(r1)
                r0.addIntroductionIfNecessary(r1)
                return
        }

        @Override // com.android.dx.dex.code.RopTranslator.TranslationVisitor, com.android.dx.rop.code.Insn.Visitor
        public void visitThrowingCstInsn(com.android.dx.rop.code.ThrowingCstInsn r1) {
                r0 = this;
                super.visitThrowingCstInsn(r1)
                r0.addIntroductionIfNecessary(r1)
                return
        }

        @Override // com.android.dx.dex.code.RopTranslator.TranslationVisitor, com.android.dx.rop.code.Insn.Visitor
        public void visitThrowingInsn(com.android.dx.rop.code.ThrowingInsn r1) {
                r0 = this;
                super.visitThrowingInsn(r1)
                r0.addIntroductionIfNecessary(r1)
                return
        }
    }

    public class TranslationVisitor implements com.android.dx.rop.code.Insn.Visitor {
        private com.android.dx.rop.code.BasicBlock block;
        private com.android.dx.dex.code.CodeAddress lastAddress;
        private final com.android.dx.dex.code.OutputCollector output;
        final /* synthetic */ com.android.dx.dex.code.RopTranslator this$0;

        public TranslationVisitor(com.android.dx.dex.code.RopTranslator r1, com.android.dx.dex.code.OutputCollector r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.output = r2
                return
        }

        private com.android.dx.rop.code.RegisterSpec getNextMoveResultPseudo() {
                r4 = this;
                com.android.dx.rop.code.BasicBlock r0 = r4.block
                int r0 = r0.getPrimarySuccessor()
                r1 = 0
                if (r0 >= 0) goto La
                return r1
            La:
                com.android.dx.dex.code.RopTranslator r2 = r4.this$0
                com.android.dx.rop.code.RopMethod r2 = com.android.dx.dex.code.RopTranslator.access$500(r2)
                com.android.dx.rop.code.BasicBlockList r2 = r2.getBlocks()
                com.android.dx.rop.code.BasicBlock r0 = r2.labelToBlock(r0)
                com.android.dx.rop.code.InsnList r0 = r0.getInsns()
                r2 = 0
                com.android.dx.rop.code.Insn r0 = r0.get(r2)
                com.android.dx.rop.code.Rop r2 = r0.getOpcode()
                int r2 = r2.getOpcode()
                r3 = 56
                if (r2 == r3) goto L2e
                return r1
            L2e:
                com.android.dx.rop.code.RegisterSpec r0 = r0.getResult()
                return r0
        }

        public void addOutput(com.android.dx.dex.code.DalvInsn r2) {
                r1 = this;
                com.android.dx.dex.code.OutputCollector r0 = r1.output
                r0.add(r2)
                return
        }

        public void addOutputSuffix(com.android.dx.dex.code.DalvInsn r2) {
                r1 = this;
                com.android.dx.dex.code.OutputCollector r0 = r1.output
                r0.addSuffix(r2)
                return
        }

        public com.android.dx.dex.code.DalvInsn getPrevNonSpecialInsn() {
                r4 = this;
                com.android.dx.dex.code.OutputCollector r0 = r4.output
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L1f
                com.android.dx.dex.code.OutputCollector r1 = r4.output
                com.android.dx.dex.code.DalvInsn r1 = r1.get(r0)
                com.android.dx.dex.code.Dop r2 = r1.getOpcode()
                int r2 = r2.getOpcode()
                r3 = -1
                if (r2 == r3) goto L1c
                return r1
            L1c:
                int r0 = r0 + (-1)
                goto L8
            L1f:
                r0 = 0
                return r0
        }

        public void setBlock(com.android.dx.rop.code.BasicBlock r1, com.android.dx.dex.code.CodeAddress r2) {
                r0 = this;
                r0.block = r1
                r0.lastAddress = r2
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitFillArrayDataInsn(com.android.dx.rop.code.FillArrayDataInsn r7) {
                r6 = this;
                com.android.dx.rop.code.SourcePosition r0 = r7.getPosition()
                com.android.dx.rop.cst.Constant r1 = r7.getConstant()
                java.util.ArrayList r2 = r7.getInitValues()
                com.android.dx.rop.code.Rop r3 = r7.getOpcode()
                int r3 = r3.getBranchingness()
                r4 = 1
                if (r3 != r4) goto L45
                com.android.dx.dex.code.CodeAddress r3 = new com.android.dx.dex.code.CodeAddress
                r3.<init>(r0)
                com.android.dx.dex.code.ArrayData r4 = new com.android.dx.dex.code.ArrayData
                com.android.dx.dex.code.CodeAddress r5 = r6.lastAddress
                r4.<init>(r0, r5, r2, r1)
                com.android.dx.dex.code.TargetInsn r1 = new com.android.dx.dex.code.TargetInsn
                com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.FILL_ARRAY_DATA
                com.android.dx.rop.code.RegisterSpecList r7 = com.android.dx.dex.code.RopTranslator.access$000(r7)
                r1.<init>(r2, r0, r7, r3)
                com.android.dx.dex.code.CodeAddress r7 = r6.lastAddress
                r6.addOutput(r7)
                r6.addOutput(r1)
                com.android.dx.dex.code.OddSpacer r7 = new com.android.dx.dex.code.OddSpacer
                r7.<init>(r0)
                r6.addOutputSuffix(r7)
                r6.addOutputSuffix(r3)
                r6.addOutputSuffix(r4)
                return
            L45:
                java.lang.RuntimeException r7 = new java.lang.RuntimeException
                java.lang.String r0 = "shouldn't happen"
                r7.<init>(r0)
                throw r7
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitInvokePolymorphicInsn(com.android.dx.rop.code.InvokePolymorphicInsn r7) {
                r6 = this;
                com.android.dx.rop.code.SourcePosition r0 = r7.getPosition()
                com.android.dx.dex.code.Dop r1 = com.android.dx.dex.code.RopToDop.dopFor(r7)
                com.android.dx.rop.code.Rop r2 = r7.getOpcode()
                int r3 = r2.getBranchingness()
                r4 = 6
                if (r3 != r4) goto L44
                boolean r2 = r2.isCallLike()
                if (r2 == 0) goto L3c
                com.android.dx.dex.code.CodeAddress r2 = r6.lastAddress
                r6.addOutput(r2)
                com.android.dx.rop.code.RegisterSpecList r2 = r7.getSources()
                com.android.dx.rop.cst.CstMethodRef r3 = r7.getPolymorphicMethod()
                com.android.dx.rop.cst.CstProtoRef r7 = r7.getCallSiteProto()
                r4 = 2
                com.android.dx.rop.cst.Constant[] r4 = new com.android.dx.rop.cst.Constant[r4]
                r5 = 0
                r4[r5] = r3
                r3 = 1
                r4[r3] = r7
                com.android.dx.dex.code.MultiCstInsn r7 = new com.android.dx.dex.code.MultiCstInsn
                r7.<init>(r1, r0, r2, r4)
                r6.addOutput(r7)
                return
            L3c:
                java.lang.RuntimeException r7 = new java.lang.RuntimeException
                java.lang.String r0 = "Expected call-like operation"
                r7.<init>(r0)
                throw r7
            L44:
                java.lang.RuntimeException r7 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Expected BRANCH_THROW got "
                r0.append(r1)
                int r1 = r2.getBranchingness()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitPlainCstInsn(com.android.dx.rop.code.PlainCstInsn r6) {
                r5 = this;
                com.android.dx.rop.code.SourcePosition r0 = r6.getPosition()
                com.android.dx.dex.code.Dop r1 = com.android.dx.dex.code.RopToDop.dopFor(r6)
                com.android.dx.rop.code.Rop r2 = r6.getOpcode()
                int r3 = r2.getOpcode()
                int r2 = r2.getBranchingness()
                r4 = 1
                if (r2 != r4) goto L64
                r2 = 3
                if (r3 != r2) goto L53
                com.android.dx.dex.code.RopTranslator r2 = r5.this$0
                boolean r2 = com.android.dx.dex.code.RopTranslator.access$200(r2)
                if (r2 != 0) goto L63
                com.android.dx.rop.code.RegisterSpec r2 = r6.getResult()
                com.android.dx.rop.cst.Constant r6 = r6.getConstant()
                com.android.dx.rop.cst.CstInteger r6 = (com.android.dx.rop.cst.CstInteger) r6
                int r6 = r6.getValue()
                com.android.dx.dex.code.RopTranslator r3 = r5.this$0
                int r3 = com.android.dx.dex.code.RopTranslator.access$300(r3)
                com.android.dx.dex.code.RopTranslator r4 = r5.this$0
                int r4 = com.android.dx.dex.code.RopTranslator.access$400(r4)
                int r3 = r3 - r4
                int r3 = r3 + r6
                com.android.dx.rop.type.Type r6 = r2.getType()
                com.android.dx.rop.code.RegisterSpec r6 = com.android.dx.rop.code.RegisterSpec.make(r3, r6)
                com.android.dx.dex.code.SimpleInsn r3 = new com.android.dx.dex.code.SimpleInsn
                com.android.dx.rop.code.RegisterSpecList r6 = com.android.dx.rop.code.RegisterSpecList.make(r2, r6)
                r3.<init>(r1, r0, r6)
                r5.addOutput(r3)
                goto L63
            L53:
                com.android.dx.rop.code.RegisterSpecList r2 = com.android.dx.dex.code.RopTranslator.access$000(r6)
                com.android.dx.dex.code.CstInsn r3 = new com.android.dx.dex.code.CstInsn
                com.android.dx.rop.cst.Constant r6 = r6.getConstant()
                r3.<init>(r1, r0, r2, r6)
                r5.addOutput(r3)
            L63:
                return
            L64:
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r0 = "shouldn't happen"
                r6.<init>(r0)
                throw r6
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitPlainInsn(com.android.dx.rop.code.PlainInsn r6) {
                r5 = this;
                com.android.dx.rop.code.Rop r0 = r6.getOpcode()
                int r1 = r0.getOpcode()
                r2 = 54
                if (r1 != r2) goto Ld
                return
            Ld:
                int r1 = r0.getOpcode()
                r2 = 56
                if (r1 != r2) goto L16
                return
            L16:
                com.android.dx.rop.code.SourcePosition r1 = r6.getPosition()
                com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.RopToDop.dopFor(r6)
                int r0 = r0.getBranchingness()
                r3 = 1
                if (r0 == r3) goto L59
                r4 = 2
                if (r0 == r4) goto L59
                r4 = 3
                if (r0 == r4) goto L58
                r4 = 4
                if (r0 == r4) goto L3a
                r3 = 6
                if (r0 != r3) goto L32
                goto L59
            L32:
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r0 = "shouldn't happen"
                r6.<init>(r0)
                throw r6
            L3a:
                com.android.dx.rop.code.BasicBlock r0 = r5.block
                com.android.dx.util.IntList r0 = r0.getSuccessors()
                int r0 = r0.get(r3)
                com.android.dx.dex.code.TargetInsn r3 = new com.android.dx.dex.code.TargetInsn
                com.android.dx.rop.code.RegisterSpecList r6 = com.android.dx.dex.code.RopTranslator.access$000(r6)
                com.android.dx.dex.code.RopTranslator r4 = r5.this$0
                com.android.dx.dex.code.BlockAddresses r4 = com.android.dx.dex.code.RopTranslator.access$100(r4)
                com.android.dx.dex.code.CodeAddress r0 = r4.getStart(r0)
                r3.<init>(r2, r1, r6, r0)
                goto L62
            L58:
                return
            L59:
                com.android.dx.dex.code.SimpleInsn r3 = new com.android.dx.dex.code.SimpleInsn
                com.android.dx.rop.code.RegisterSpecList r6 = com.android.dx.dex.code.RopTranslator.access$000(r6)
                r3.<init>(r2, r1, r6)
            L62:
                r5.addOutput(r3)
                return
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitSwitchInsn(com.android.dx.rop.code.SwitchInsn r10) {
                r9 = this;
                com.android.dx.rop.code.SourcePosition r0 = r10.getPosition()
                com.android.dx.util.IntList r1 = r10.getCases()
                com.android.dx.rop.code.BasicBlock r2 = r9.block
                com.android.dx.util.IntList r2 = r2.getSuccessors()
                int r3 = r1.size()
                int r4 = r2.size()
                com.android.dx.rop.code.BasicBlock r5 = r9.block
                int r5 = r5.getPrimarySuccessor()
                r6 = 1
                int r4 = r4 - r6
                if (r3 != r4) goto L7c
                int r4 = r2.get(r3)
                if (r5 != r4) goto L7c
                com.android.dx.dex.code.CodeAddress[] r4 = new com.android.dx.dex.code.CodeAddress[r3]
                r5 = 0
            L29:
                if (r5 >= r3) goto L3e
                int r7 = r2.get(r5)
                com.android.dx.dex.code.RopTranslator r8 = r9.this$0
                com.android.dx.dex.code.BlockAddresses r8 = com.android.dx.dex.code.RopTranslator.access$100(r8)
                com.android.dx.dex.code.CodeAddress r7 = r8.getStart(r7)
                r4[r5] = r7
                int r5 = r5 + 1
                goto L29
            L3e:
                com.android.dx.dex.code.CodeAddress r2 = new com.android.dx.dex.code.CodeAddress
                r2.<init>(r0)
                com.android.dx.dex.code.CodeAddress r3 = new com.android.dx.dex.code.CodeAddress
                com.android.dx.dex.code.CodeAddress r5 = r9.lastAddress
                com.android.dx.rop.code.SourcePosition r5 = r5.getPosition()
                r3.<init>(r5, r6)
                com.android.dx.dex.code.SwitchData r5 = new com.android.dx.dex.code.SwitchData
                r5.<init>(r0, r3, r1, r4)
                boolean r1 = r5.isPacked()
                if (r1 == 0) goto L5c
                com.android.dx.dex.code.Dop r1 = com.android.dx.dex.code.Dops.PACKED_SWITCH
                goto L5e
            L5c:
                com.android.dx.dex.code.Dop r1 = com.android.dx.dex.code.Dops.SPARSE_SWITCH
            L5e:
                com.android.dx.dex.code.TargetInsn r4 = new com.android.dx.dex.code.TargetInsn
                com.android.dx.rop.code.RegisterSpecList r10 = com.android.dx.dex.code.RopTranslator.access$000(r10)
                r4.<init>(r1, r0, r10, r2)
                r9.addOutput(r3)
                r9.addOutput(r4)
                com.android.dx.dex.code.OddSpacer r10 = new com.android.dx.dex.code.OddSpacer
                r10.<init>(r0)
                r9.addOutputSuffix(r10)
                r9.addOutputSuffix(r2)
                r9.addOutputSuffix(r5)
                return
            L7c:
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                java.lang.String r0 = "shouldn't happen"
                r10.<init>(r0)
                throw r10
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitThrowingCstInsn(com.android.dx.rop.code.ThrowingCstInsn r11) {
                r10 = this;
                com.android.dx.rop.code.SourcePosition r0 = r11.getPosition()
                com.android.dx.dex.code.Dop r1 = com.android.dx.dex.code.RopToDop.dopFor(r11)
                com.android.dx.rop.code.Rop r2 = r11.getOpcode()
                com.android.dx.rop.cst.Constant r3 = r11.getConstant()
                int r4 = r2.getBranchingness()
                r5 = 6
                if (r4 != r5) goto Le4
                com.android.dx.dex.code.CodeAddress r4 = r10.lastAddress
                r10.addOutput(r4)
                boolean r4 = r2.isCallLike()
                if (r4 == 0) goto L30
                com.android.dx.rop.code.RegisterSpecList r11 = r11.getSources()
                com.android.dx.dex.code.CstInsn r2 = new com.android.dx.dex.code.CstInsn
                r2.<init>(r1, r0, r11, r3)
                r10.addOutput(r2)
                goto Lcc
            L30:
                com.android.dx.rop.code.RegisterSpec r4 = r10.getNextMoveResultPseudo()
                com.android.dx.rop.code.RegisterSpecList r5 = com.android.dx.dex.code.RopTranslator.access$600(r11, r4)
                boolean r6 = r1.hasResult()
                r7 = 0
                r8 = 1
                if (r6 != 0) goto L4b
                int r6 = r2.getOpcode()
                r9 = 43
                if (r6 != r9) goto L49
                goto L4b
            L49:
                r6 = r7
                goto L4c
            L4b:
                r6 = r8
            L4c:
                if (r4 == 0) goto L50
                r4 = r8
                goto L51
            L50:
                r4 = r7
            L51:
                if (r6 != r4) goto Lcd
                int r11 = r2.getOpcode()
                r2 = 41
                if (r11 != r2) goto L69
                int r11 = r1.getOpcode()
                r2 = 35
                if (r11 == r2) goto L69
                com.android.dx.dex.code.SimpleInsn r11 = new com.android.dx.dex.code.SimpleInsn
                r11.<init>(r1, r0, r5)
                goto L6e
            L69:
                com.android.dx.dex.code.CstInsn r11 = new com.android.dx.dex.code.CstInsn
                r11.<init>(r1, r0, r5, r3)
            L6e:
                com.android.dx.dex.code.DalvInsn r2 = r10.getPrevNonSpecialInsn()
                int r1 = r1.getOpcode()
                r3 = 32
                if (r1 != r3) goto Lc9
                if (r2 == 0) goto Lc9
                com.android.dx.dex.code.Dop r1 = r2.getOpcode()
                int r1 = r1.getOpcode()
                r3 = 7
                if (r1 == r3) goto L8f
                r3 = 8
                if (r1 == r3) goto L8f
                r3 = 9
                if (r1 != r3) goto Lc9
            L8f:
                com.android.dx.rop.code.RegisterSpecList r1 = r11.getRegisters()
                int r1 = r1.size()
                if (r1 <= 0) goto Lc9
                com.android.dx.rop.code.RegisterSpecList r1 = r2.getRegisters()
                int r1 = r1.size()
                if (r1 <= r8) goto Lc9
                com.android.dx.rop.code.RegisterSpecList r1 = r11.getRegisters()
                com.android.dx.rop.code.RegisterSpec r1 = r1.get(r7)
                int r1 = r1.getReg()
                com.android.dx.rop.code.RegisterSpecList r2 = r2.getRegisters()
                com.android.dx.rop.code.RegisterSpec r2 = r2.get(r8)
                int r2 = r2.getReg()
                if (r1 != r2) goto Lc9
                com.android.dx.dex.code.SimpleInsn r1 = new com.android.dx.dex.code.SimpleInsn
                com.android.dx.dex.code.Dop r2 = com.android.dx.dex.code.Dops.NOP
                com.android.dx.rop.code.RegisterSpecList r3 = com.android.dx.rop.code.RegisterSpecList.EMPTY
                r1.<init>(r2, r0, r3)
                r10.addOutput(r1)
            Lc9:
                r10.addOutput(r11)
            Lcc:
                return
            Lcd:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Insn with result/move-result-pseudo mismatch "
                r1.append(r2)
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
            Le4:
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Expected BRANCH_THROW got "
                r0.append(r1)
                int r1 = r2.getBranchingness()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r11.<init>(r0)
                throw r11
        }

        @Override // com.android.dx.rop.code.Insn.Visitor
        public void visitThrowingInsn(com.android.dx.rop.code.ThrowingInsn r6) {
                r5 = this;
                com.android.dx.rop.code.SourcePosition r0 = r6.getPosition()
                com.android.dx.dex.code.Dop r1 = com.android.dx.dex.code.RopToDop.dopFor(r6)
                com.android.dx.rop.code.Rop r2 = r6.getOpcode()
                int r2 = r2.getBranchingness()
                r3 = 6
                if (r2 != r3) goto L4b
                com.android.dx.rop.code.RegisterSpec r2 = r5.getNextMoveResultPseudo()
                boolean r3 = r1.hasResult()
                if (r2 == 0) goto L1f
                r4 = 1
                goto L20
            L1f:
                r4 = 0
            L20:
                if (r3 != r4) goto L34
                com.android.dx.dex.code.CodeAddress r3 = r5.lastAddress
                r5.addOutput(r3)
                com.android.dx.dex.code.SimpleInsn r3 = new com.android.dx.dex.code.SimpleInsn
                com.android.dx.rop.code.RegisterSpecList r6 = com.android.dx.dex.code.RopTranslator.access$600(r6, r2)
                r3.<init>(r1, r0, r6)
                r5.addOutput(r3)
                return
            L34:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Insn with result/move-result-pseudo mismatch"
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
            L4b:
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r0 = "shouldn't happen"
                r6.<init>(r0)
                throw r6
        }
    }

    private RopTranslator(com.android.dx.rop.code.RopMethod r8, int r9, com.android.dx.rop.code.LocalVariableInfo r10, int r11, com.android.dx.dex.DexOptions r12) {
            r7 = this;
            r7.<init>()
            r7.dexOptions = r12
            r7.method = r8
            r7.positionInfo = r9
            r7.locals = r10
            com.android.dx.dex.code.BlockAddresses r9 = new com.android.dx.dex.code.BlockAddresses
            r9.<init>(r8)
            r7.addresses = r9
            r7.paramSize = r11
            r9 = 0
            r7.order = r9
            boolean r9 = calculateParamsAreInOrder(r8, r11)
            r7.paramsAreInOrder = r9
            com.android.dx.rop.code.BasicBlockList r8 = r8.getBlocks()
            int r0 = r8.size()
            int r4 = r0 * 3
            int r1 = r8.getInstructionCount()
            int r1 = r1 + r4
            if (r10 == 0) goto L34
            int r2 = r10.getAssignmentCount()
            int r0 = r0 + r2
            int r1 = r1 + r0
        L34:
            r3 = r1
            int r8 = r8.getRegCount()
            if (r9 == 0) goto L3d
            r9 = 0
            goto L3e
        L3d:
            r9 = r11
        L3e:
            int r5 = r8 + r9
            r7.regCount = r5
            com.android.dx.dex.code.OutputCollector r8 = new com.android.dx.dex.code.OutputCollector
            r1 = r8
            r2 = r12
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r7.output = r8
            if (r10 == 0) goto L56
            com.android.dx.dex.code.RopTranslator$LocalVariableAwareTranslationVisitor r9 = new com.android.dx.dex.code.RopTranslator$LocalVariableAwareTranslationVisitor
            r9.<init>(r7, r8, r10)
            r7.translationVisitor = r9
            goto L5d
        L56:
            com.android.dx.dex.code.RopTranslator$TranslationVisitor r9 = new com.android.dx.dex.code.RopTranslator$TranslationVisitor
            r9.<init>(r7, r8)
            r7.translationVisitor = r9
        L5d:
            return
    }

    public static /* synthetic */ com.android.dx.rop.code.RegisterSpecList access$000(com.android.dx.rop.code.Insn r0) {
            com.android.dx.rop.code.RegisterSpecList r0 = getRegs(r0)
            return r0
    }

    public static /* synthetic */ com.android.dx.dex.code.BlockAddresses access$100(com.android.dx.dex.code.RopTranslator r0) {
            com.android.dx.dex.code.BlockAddresses r0 = r0.addresses
            return r0
    }

    public static /* synthetic */ boolean access$200(com.android.dx.dex.code.RopTranslator r0) {
            boolean r0 = r0.paramsAreInOrder
            return r0
    }

    public static /* synthetic */ int access$300(com.android.dx.dex.code.RopTranslator r0) {
            int r0 = r0.regCount
            return r0
    }

    public static /* synthetic */ int access$400(com.android.dx.dex.code.RopTranslator r0) {
            int r0 = r0.paramSize
            return r0
    }

    public static /* synthetic */ com.android.dx.rop.code.RopMethod access$500(com.android.dx.dex.code.RopTranslator r0) {
            com.android.dx.rop.code.RopMethod r0 = r0.method
            return r0
    }

    public static /* synthetic */ com.android.dx.rop.code.RegisterSpecList access$600(com.android.dx.rop.code.Insn r0, com.android.dx.rop.code.RegisterSpec r1) {
            com.android.dx.rop.code.RegisterSpecList r0 = getRegs(r0, r1)
            return r0
    }

    private static boolean calculateParamsAreInOrder(com.android.dx.rop.code.RopMethod r4, int r5) {
            r0 = 1
            boolean[] r1 = new boolean[r0]
            r2 = 0
            r1[r2] = r0
            com.android.dx.rop.code.BasicBlockList r0 = r4.getBlocks()
            int r0 = r0.getRegCount()
            com.android.dx.rop.code.BasicBlockList r4 = r4.getBlocks()
            com.android.dx.dex.code.RopTranslator$1 r3 = new com.android.dx.dex.code.RopTranslator$1
            r3.<init>(r1, r0, r5)
            r4.forEachInsn(r3)
            boolean r4 = r1[r2]
            return r4
    }

    private static com.android.dx.rop.code.RegisterSpecList getRegs(com.android.dx.rop.code.Insn r1) {
            com.android.dx.rop.code.RegisterSpec r0 = r1.getResult()
            com.android.dx.rop.code.RegisterSpecList r1 = getRegs(r1, r0)
            return r1
    }

    private static com.android.dx.rop.code.RegisterSpecList getRegs(com.android.dx.rop.code.Insn r3, com.android.dx.rop.code.RegisterSpec r4) {
            com.android.dx.rop.code.RegisterSpecList r0 = r3.getSources()
            com.android.dx.rop.code.Rop r3 = r3.getOpcode()
            boolean r3 = r3.isCommutative()
            if (r3 == 0) goto L31
            int r3 = r0.size()
            r1 = 2
            if (r3 != r1) goto L31
            int r3 = r4.getReg()
            r1 = 1
            com.android.dx.rop.code.RegisterSpec r2 = r0.get(r1)
            int r2 = r2.getReg()
            if (r3 != r2) goto L31
            com.android.dx.rop.code.RegisterSpec r3 = r0.get(r1)
            r1 = 0
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r1)
            com.android.dx.rop.code.RegisterSpecList r0 = com.android.dx.rop.code.RegisterSpecList.make(r3, r0)
        L31:
            if (r4 != 0) goto L34
            return r0
        L34:
            com.android.dx.rop.code.RegisterSpecList r3 = r0.withFirst(r4)
            return r3
    }

    private void outputBlock(com.android.dx.rop.code.BasicBlock r5, int r6) {
            r4 = this;
            com.android.dx.dex.code.BlockAddresses r0 = r4.addresses
            com.android.dx.dex.code.CodeAddress r0 = r0.getStart(r5)
            com.android.dx.dex.code.OutputCollector r1 = r4.output
            r1.add(r0)
            com.android.dx.rop.code.LocalVariableInfo r1 = r4.locals
            if (r1 == 0) goto L21
            com.android.dx.rop.code.RegisterSpecSet r1 = r1.getStarts(r5)
            com.android.dx.dex.code.OutputCollector r2 = r4.output
            com.android.dx.dex.code.LocalSnapshot r3 = new com.android.dx.dex.code.LocalSnapshot
            com.android.dx.rop.code.SourcePosition r0 = r0.getPosition()
            r3.<init>(r0, r1)
            r2.add(r3)
        L21:
            com.android.dx.dex.code.RopTranslator$TranslationVisitor r0 = r4.translationVisitor
            com.android.dx.dex.code.BlockAddresses r1 = r4.addresses
            com.android.dx.dex.code.CodeAddress r1 = r1.getLast(r5)
            r0.setBlock(r5, r1)
            com.android.dx.rop.code.InsnList r0 = r5.getInsns()
            com.android.dx.dex.code.RopTranslator$TranslationVisitor r1 = r4.translationVisitor
            r0.forEach(r1)
            com.android.dx.dex.code.OutputCollector r0 = r4.output
            com.android.dx.dex.code.BlockAddresses r1 = r4.addresses
            com.android.dx.dex.code.CodeAddress r1 = r1.getEnd(r5)
            r0.add(r1)
            int r0 = r5.getPrimarySuccessor()
            com.android.dx.rop.code.Insn r1 = r5.getLastInsn()
            if (r0 < 0) goto L82
            if (r0 == r6) goto L82
            com.android.dx.rop.code.Rop r2 = r1.getOpcode()
            int r2 = r2.getBranchingness()
            r3 = 4
            if (r2 != r3) goto L6a
            int r5 = r5.getSecondarySuccessor()
            if (r5 != r6) goto L6a
            com.android.dx.dex.code.OutputCollector r5 = r4.output
            com.android.dx.dex.code.BlockAddresses r6 = r4.addresses
            com.android.dx.dex.code.CodeAddress r6 = r6.getStart(r0)
            r0 = 1
            r5.reverseBranch(r0, r6)
            goto L82
        L6a:
            com.android.dx.dex.code.TargetInsn r5 = new com.android.dx.dex.code.TargetInsn
            com.android.dx.dex.code.Dop r6 = com.android.dx.dex.code.Dops.GOTO
            com.android.dx.rop.code.SourcePosition r1 = r1.getPosition()
            com.android.dx.rop.code.RegisterSpecList r2 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            com.android.dx.dex.code.BlockAddresses r3 = r4.addresses
            com.android.dx.dex.code.CodeAddress r0 = r3.getStart(r0)
            r5.<init>(r6, r1, r2, r0)
            com.android.dx.dex.code.OutputCollector r6 = r4.output
            r6.add(r5)
        L82:
            return
    }

    private void outputInstructions() {
            r6 = this;
            com.android.dx.rop.code.RopMethod r0 = r6.method
            com.android.dx.rop.code.BasicBlockList r0 = r0.getBlocks()
            int[] r1 = r6.order
            int r2 = r1.length
            r3 = 0
        La:
            if (r3 >= r2) goto L20
            int r4 = r3 + 1
            int r5 = r1.length
            if (r4 != r5) goto L13
            r5 = -1
            goto L15
        L13:
            r5 = r1[r4]
        L15:
            r3 = r1[r3]
            com.android.dx.rop.code.BasicBlock r3 = r0.labelToBlock(r3)
            r6.outputBlock(r3, r5)
            r3 = r4
            goto La
        L20:
            return
    }

    private void pickOrder() {
            r14 = this;
            com.android.dx.rop.code.RopMethod r0 = r14.method
            com.android.dx.rop.code.BasicBlockList r0 = r0.getBlocks()
            int r1 = r0.size()
            int r2 = r0.getMaxLabel()
            int[] r3 = com.android.dx.util.Bits.makeBitSet(r2)
            int[] r2 = com.android.dx.util.Bits.makeBitSet(r2)
            r4 = 0
            r5 = r4
        L18:
            if (r5 >= r1) goto L28
            com.android.dx.rop.code.BasicBlock r6 = r0.get(r5)
            int r6 = r6.getLabel()
            com.android.dx.util.Bits.set(r3, r6)
            int r5 = r5 + 1
            goto L18
        L28:
            int[] r5 = new int[r1]
            com.android.dx.rop.code.RopMethod r6 = r14.method
            int r6 = r6.getFirstLabel()
            r7 = r4
        L31:
            r8 = -1
            if (r6 == r8) goto Lba
        L34:
            com.android.dx.rop.code.RopMethod r9 = r14.method
            com.android.dx.util.IntList r9 = r9.labelToPredecessors(r6)
            int r10 = r9.size()
            r11 = r4
        L3f:
            if (r11 >= r10) goto L65
            int r12 = r9.get(r11)
            boolean r13 = com.android.dx.util.Bits.get(r2, r12)
            if (r13 == 0) goto L4c
            goto L65
        L4c:
            boolean r13 = com.android.dx.util.Bits.get(r3, r12)
            if (r13 != 0) goto L53
            goto L62
        L53:
            com.android.dx.rop.code.BasicBlock r13 = r0.labelToBlock(r12)
            int r13 = r13.getPrimarySuccessor()
            if (r13 != r6) goto L62
            com.android.dx.util.Bits.set(r2, r12)
            r6 = r12
            goto L34
        L62:
            int r11 = r11 + 1
            goto L3f
        L65:
            if (r6 == r8) goto Lb4
            com.android.dx.util.Bits.clear(r3, r6)
            com.android.dx.util.Bits.clear(r2, r6)
            r5[r7] = r6
            int r7 = r7 + 1
            com.android.dx.rop.code.BasicBlock r6 = r0.labelToBlock(r6)
            com.android.dx.rop.code.BasicBlock r9 = r0.preferredSuccessorOf(r6)
            if (r9 != 0) goto L7c
            goto Lb4
        L7c:
            int r9 = r9.getLabel()
            int r10 = r6.getPrimarySuccessor()
            boolean r11 = com.android.dx.util.Bits.get(r3, r9)
            if (r11 == 0) goto L8c
            r6 = r9
            goto L65
        L8c:
            if (r10 == r9) goto L98
            if (r10 < 0) goto L98
            boolean r9 = com.android.dx.util.Bits.get(r3, r10)
            if (r9 == 0) goto L98
            r6 = r10
            goto L65
        L98:
            com.android.dx.util.IntList r6 = r6.getSuccessors()
            int r9 = r6.size()
            r10 = r4
        La1:
            if (r10 >= r9) goto Lb2
            int r11 = r6.get(r10)
            boolean r12 = com.android.dx.util.Bits.get(r3, r11)
            if (r12 == 0) goto Laf
            r6 = r11
            goto L65
        Laf:
            int r10 = r10 + 1
            goto La1
        Lb2:
            r6 = r8
            goto L65
        Lb4:
            int r6 = com.android.dx.util.Bits.findFirst(r3, r4)
            goto L31
        Lba:
            if (r7 != r1) goto Lbf
            r14.order = r5
            return
        Lbf:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "shouldn't happen"
            r0.<init>(r1)
            throw r0
    }

    public static com.android.dx.dex.code.DalvCode translate(com.android.dx.rop.code.RopMethod r7, int r8, com.android.dx.rop.code.LocalVariableInfo r9, int r10, com.android.dx.dex.DexOptions r11) {
            com.android.dx.dex.code.RopTranslator r6 = new com.android.dx.dex.code.RopTranslator
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            com.android.dx.dex.code.DalvCode r7 = r6.translateAndGetResult()
            return r7
    }

    private com.android.dx.dex.code.DalvCode translateAndGetResult() {
            r4 = this;
            r4.pickOrder()
            r4.outputInstructions()
            com.android.dx.dex.code.StdCatchBuilder r0 = new com.android.dx.dex.code.StdCatchBuilder
            com.android.dx.rop.code.RopMethod r1 = r4.method
            int[] r2 = r4.order
            com.android.dx.dex.code.BlockAddresses r3 = r4.addresses
            r0.<init>(r1, r2, r3)
            com.android.dx.dex.code.DalvCode r1 = new com.android.dx.dex.code.DalvCode
            int r2 = r4.positionInfo
            com.android.dx.dex.code.OutputCollector r3 = r4.output
            com.android.dx.dex.code.OutputFinisher r3 = r3.getFinisher()
            r1.<init>(r2, r3, r0)
            return r1
    }
}
