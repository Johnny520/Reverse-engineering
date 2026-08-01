package com.android.p002dx.ssa;

import com.android.p002dx.rop.code.Insn;
import com.android.p002dx.rop.code.PlainCstInsn;
import com.android.p002dx.rop.code.PlainInsn;
import com.android.p002dx.rop.code.RegOps;
import com.android.p002dx.rop.code.RegisterSpec;
import com.android.p002dx.rop.code.RegisterSpecList;
import com.android.p002dx.rop.code.Rop;
import com.android.p002dx.rop.code.Rops;
import com.android.p002dx.rop.code.TranslationAdvice;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstLiteralBits;
import com.android.p002dx.rop.type.TypeBearer;
import com.android.p002dx.ssa.SsaInsn;
import java.util.ArrayList;
import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class LiteralOpUpgrader {
    private final SsaMethod ssaMeth;

    private LiteralOpUpgrader(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isConstIntZeroOrKnownNull(RegisterSpec registerSpec) {
        TypeBearer typeBearer = registerSpec.getTypeBearer();
        return (typeBearer instanceof CstLiteralBits) && ((CstLiteralBits) typeBearer).getLongBits() == 0;
    }

    public static void process(SsaMethod ssaMethod) {
        new LiteralOpUpgrader(ssaMethod).run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replacePlainInsn(NormalSsaInsn normalSsaInsn, RegisterSpecList registerSpecList, int i, Constant constant) {
        Insn originalRopInsn = normalSsaInsn.getOriginalRopInsn();
        Rop ropRopFor = Rops.ropFor(i, normalSsaInsn.getResult(), registerSpecList, constant);
        NormalSsaInsn normalSsaInsn2 = new NormalSsaInsn(constant == null ? new PlainInsn(ropRopFor, originalRopInsn.getPosition(), normalSsaInsn.getResult(), registerSpecList) : new PlainCstInsn(ropRopFor, originalRopInsn.getPosition(), normalSsaInsn.getResult(), registerSpecList, constant), normalSsaInsn.getBlock());
        ArrayList<SsaInsn> insns = normalSsaInsn.getBlock().getInsns();
        this.ssaMeth.onInsnRemoved(normalSsaInsn);
        insns.set(insns.lastIndexOf(normalSsaInsn), normalSsaInsn2);
        this.ssaMeth.onInsnAdded(normalSsaInsn2);
    }

    private void run() {
        final TranslationAdvice advice = Optimizer.getAdvice();
        this.ssaMeth.forEachInsn(new SsaInsn.Visitor(this) { // from class: com.android.dx.ssa.LiteralOpUpgrader.1
            final /* synthetic */ LiteralOpUpgrader this$0;

            {
                this.this$0 = this;
            }

            @Override // com.android.dx.ssa.SsaInsn.Visitor
            public void visitNonMoveInsn(NormalSsaInsn normalSsaInsn) {
                Rop opcode = normalSsaInsn.getOriginalRopInsn().getOpcode();
                RegisterSpecList sources = normalSsaInsn.getSources();
                if (!this.this$0.tryReplacingWithConstant(normalSsaInsn) && sources.size() == 2) {
                    if (opcode.getBranchingness() == 4) {
                        if (LiteralOpUpgrader.isConstIntZeroOrKnownNull(sources.get(0))) {
                            this.this$0.replacePlainInsn(normalSsaInsn, sources.withoutFirst(), RegOps.flippedIfOpcode(opcode.getOpcode()), null);
                            return;
                        } else {
                            if (LiteralOpUpgrader.isConstIntZeroOrKnownNull(sources.get(1))) {
                                this.this$0.replacePlainInsn(normalSsaInsn, sources.withoutLast(), opcode.getOpcode(), null);
                                return;
                            }
                            return;
                        }
                    }
                    if (advice.hasConstantOperation(opcode, sources.get(0), sources.get(1))) {
                        normalSsaInsn.upgradeToLiteral();
                    } else if (opcode.isCommutative() && advice.hasConstantOperation(opcode, sources.get(1), sources.get(0))) {
                        normalSsaInsn.setNewSources(RegisterSpecList.make(sources.get(1), sources.get(0)));
                        normalSsaInsn.upgradeToLiteral();
                    }
                }
            }

            @Override // com.android.dx.ssa.SsaInsn.Visitor
            public void visitMoveInsn(NormalSsaInsn normalSsaInsn) {
            }

            @Override // com.android.dx.ssa.SsaInsn.Visitor
            public void visitPhiInsn(PhiInsn phiInsn) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean tryReplacingWithConstant(NormalSsaInsn normalSsaInsn) {
        Rop opcode = normalSsaInsn.getOriginalRopInsn().getOpcode();
        RegisterSpec result = normalSsaInsn.getResult();
        if (result != null && !this.ssaMeth.isRegALocal(result) && opcode.getOpcode() != 5) {
            TypeBearer typeBearer = normalSsaInsn.getResult().getTypeBearer();
            if (typeBearer.isConstant() && typeBearer.getBasicType() == 6) {
                RegisterSpecList registerSpecList = RegisterSpecList.EMPTY;
                replacePlainInsn(normalSsaInsn, registerSpecList, 5, (Constant) typeBearer);
                if (opcode.getOpcode() == 56) {
                    replacePlainInsn((NormalSsaInsn) AbstractC7012.m12145(1, this.ssaMeth.getBlocks().get(normalSsaInsn.getBlock().getPredecessors().nextSetBit(0)).getInsns()), registerSpecList, 6, null);
                }
                return true;
            }
        }
        return false;
    }
}
