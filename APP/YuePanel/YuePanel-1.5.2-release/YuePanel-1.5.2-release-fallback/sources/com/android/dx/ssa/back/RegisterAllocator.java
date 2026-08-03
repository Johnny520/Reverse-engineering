package com.android.dx.ssa.back;

/* JADX INFO: loaded from: classes.dex */
public abstract class RegisterAllocator {
    protected final com.android.dx.ssa.back.InterferenceGraph interference;
    protected final com.android.dx.ssa.SsaMethod ssaMeth;

    public RegisterAllocator(com.android.dx.ssa.SsaMethod r1, com.android.dx.ssa.back.InterferenceGraph r2) {
            r0 = this;
            r0.<init>()
            r0.ssaMeth = r1
            r0.interference = r2
            return
    }

    public abstract com.android.dx.ssa.RegisterMapper allocateRegisters();

    public final int getCategoryForSsaReg(int r2) {
            r1 = this;
            com.android.dx.ssa.SsaMethod r0 = r1.ssaMeth
            com.android.dx.ssa.SsaInsn r2 = r0.getDefinitionForRegister(r2)
            if (r2 != 0) goto La
            r2 = 1
            return r2
        La:
            com.android.dx.rop.code.RegisterSpec r2 = r2.getResult()
            int r2 = r2.getCategory()
            return r2
    }

    public final com.android.dx.rop.code.RegisterSpec getDefinitionSpecForSsaReg(int r2) {
            r1 = this;
            com.android.dx.ssa.SsaMethod r0 = r1.ssaMeth
            com.android.dx.ssa.SsaInsn r2 = r0.getDefinitionForRegister(r2)
            if (r2 != 0) goto La
            r2 = 0
            goto Le
        La:
            com.android.dx.rop.code.RegisterSpec r2 = r2.getResult()
        Le:
            return r2
    }

    public final com.android.dx.rop.code.RegisterSpec insertMoveBefore(com.android.dx.ssa.SsaInsn r8, com.android.dx.rop.code.RegisterSpec r9) {
            r7 = this;
            com.android.dx.ssa.SsaBasicBlock r0 = r8.getBlock()
            java.util.ArrayList r1 = r0.getInsns()
            int r2 = r1.indexOf(r8)
            if (r2 < 0) goto L96
            int r3 = r1.size()
            int r3 = r3 + (-1)
            if (r2 != r3) goto L7b
            com.android.dx.ssa.SsaMethod r3 = r7.ssaMeth
            int r3 = r3.makeNewSsaReg()
            com.android.dx.rop.type.TypeBearer r4 = r9.getTypeBearer()
            com.android.dx.rop.code.RegisterSpec r3 = com.android.dx.rop.code.RegisterSpec.make(r3, r4)
            com.android.dx.rop.code.PlainInsn r4 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.type.Type r5 = r3.getType()
            com.android.dx.rop.code.Rop r5 = com.android.dx.rop.code.Rops.opMove(r5)
            com.android.dx.rop.code.SourcePosition r6 = com.android.dx.rop.code.SourcePosition.NO_INFO
            com.android.dx.rop.code.RegisterSpecList r9 = com.android.dx.rop.code.RegisterSpecList.make(r9)
            r4.<init>(r5, r6, r3, r9)
            com.android.dx.ssa.SsaInsn r9 = com.android.dx.ssa.SsaInsn.makeFromRop(r4, r0)
            r1.add(r2, r9)
            int r9 = r3.getReg()
            com.android.dx.util.IntSet r0 = r0.getLiveOutRegs()
            com.android.dx.util.IntIterator r0 = r0.iterator()
        L4a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            com.android.dx.ssa.back.InterferenceGraph r1 = r7.interference
            int r2 = r0.next()
            r1.add(r9, r2)
            goto L4a
        L5a:
            com.android.dx.rop.code.RegisterSpecList r8 = r8.getSources()
            int r0 = r8.size()
            r1 = 0
        L63:
            if (r1 >= r0) goto L75
            com.android.dx.ssa.back.InterferenceGraph r2 = r7.interference
            com.android.dx.rop.code.RegisterSpec r4 = r8.get(r1)
            int r4 = r4.getReg()
            r2.add(r9, r4)
            int r1 = r1 + 1
            goto L63
        L75:
            com.android.dx.ssa.SsaMethod r8 = r7.ssaMeth
            r8.onInsnsChanged()
            return r3
        L7b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Adding move here not supported:"
            r0.append(r1)
            java.lang.String r8 = r8.toHuman()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
        L96:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "specified insn is not in this block"
            r8.<init>(r9)
            throw r8
    }

    public boolean isDefinitionMoveParam(int r3) {
            r2 = this;
            com.android.dx.ssa.SsaMethod r0 = r2.ssaMeth
            com.android.dx.ssa.SsaInsn r3 = r0.getDefinitionForRegister(r3)
            boolean r0 = r3 instanceof com.android.dx.ssa.NormalSsaInsn
            r1 = 0
            if (r0 == 0) goto L19
            com.android.dx.ssa.NormalSsaInsn r3 = (com.android.dx.ssa.NormalSsaInsn) r3
            com.android.dx.rop.code.Rop r3 = r3.getOpcode()
            int r3 = r3.getOpcode()
            r0 = 3
            if (r3 != r0) goto L19
            r1 = 1
        L19:
            return r1
    }

    public abstract boolean wantsParamsMovedHigh();
}
