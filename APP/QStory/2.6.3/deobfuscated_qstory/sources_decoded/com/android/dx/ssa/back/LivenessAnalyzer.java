package com.android.dx.ssa.back;

import bsh.C2633;
import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.ssa.PhiInsn;
import com.android.dx.ssa.SsaBasicBlock;
import com.android.dx.ssa.SsaInsn;
import com.android.dx.ssa.SsaMethod;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class LivenessAnalyzer {
    private SsaBasicBlock blockN;
    private final InterferenceGraph interference;
    private final BitSet liveOutBlocks;
    private NextFunction nextFunction;
    private final int regV;
    private final SsaMethod ssaMeth;
    private int statementIndex;
    private final BitSet visitedBlocks;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum NextFunction {
        LIVE_IN_AT_STATEMENT,
        LIVE_OUT_AT_STATEMENT,
        LIVE_OUT_AT_BLOCK,
        DONE
    }

    private LivenessAnalyzer(SsaMethod ssaMethod, int i, InterferenceGraph interferenceGraph) {
        int size = ssaMethod.getBlocks().size();
        this.ssaMeth = ssaMethod;
        this.regV = i;
        this.visitedBlocks = new BitSet(size);
        this.liveOutBlocks = new BitSet(size);
        this.interference = interferenceGraph;
    }

    private static void coInterferePhiRegisters(InterferenceGraph interferenceGraph, RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        int reg = registerSpec.getReg();
        for (int i = 0; i < registerSpecList.size(); i++) {
            interferenceGraph.add(reg, registerSpecList.get(i).getReg());
        }
    }

    private static void coInterferePhis(SsaMethod ssaMethod, InterferenceGraph interferenceGraph) {
        Iterator<SsaBasicBlock> it = ssaMethod.getBlocks().iterator();
        while (it.hasNext()) {
            List<SsaInsn> phiInsns = it.next().getPhiInsns();
            int size = phiInsns.size();
            for (int i = 0; i < size; i++) {
                for (int i2 = 0; i2 < size; i2++) {
                    if (i != i2) {
                        SsaInsn ssaInsn = phiInsns.get(i);
                        SsaInsn ssaInsn2 = phiInsns.get(i2);
                        coInterferePhiRegisters(interferenceGraph, ssaInsn.getResult(), ssaInsn2.getSources());
                        coInterferePhiRegisters(interferenceGraph, ssaInsn2.getResult(), ssaInsn.getSources());
                        interferenceGraph.add(ssaInsn.getResult().getReg(), ssaInsn2.getResult().getReg());
                    }
                }
            }
        }
    }

    public static InterferenceGraph constructInterferenceGraph(SsaMethod ssaMethod) {
        int regCount = ssaMethod.getRegCount();
        InterferenceGraph interferenceGraph = new InterferenceGraph(regCount);
        for (int i = 0; i < regCount; i++) {
            new LivenessAnalyzer(ssaMethod, i, interferenceGraph).run();
        }
        coInterferePhis(ssaMethod, interferenceGraph);
        return interferenceGraph;
    }

    private void handleTailRecursion() {
        while (true) {
            NextFunction nextFunction = this.nextFunction;
            NextFunction nextFunction2 = NextFunction.DONE;
            if (nextFunction == nextFunction2) {
                return;
            }
            int iOrdinal = nextFunction.ordinal();
            if (iOrdinal == 0) {
                this.nextFunction = nextFunction2;
                liveInAtStatement();
            } else if (iOrdinal == 1) {
                this.nextFunction = nextFunction2;
                liveOutAtStatement();
            } else if (iOrdinal == 2) {
                this.nextFunction = nextFunction2;
                liveOutAtBlock();
            }
        }
    }

    private void liveInAtStatement() {
        int i = this.statementIndex;
        if (i != 0) {
            this.statementIndex = i - 1;
            this.nextFunction = NextFunction.LIVE_OUT_AT_STATEMENT;
        } else {
            this.blockN.addLiveIn(this.regV);
            this.liveOutBlocks.or(this.blockN.getPredecessors());
        }
    }

    private void liveOutAtBlock() {
        if (this.visitedBlocks.get(this.blockN.getIndex())) {
            return;
        }
        this.visitedBlocks.set(this.blockN.getIndex());
        this.blockN.addLiveOut(this.regV);
        this.statementIndex = this.blockN.getInsns().size() - 1;
        this.nextFunction = NextFunction.LIVE_OUT_AT_STATEMENT;
    }

    private void liveOutAtStatement() {
        SsaInsn ssaInsn = this.blockN.getInsns().get(this.statementIndex);
        RegisterSpec result = ssaInsn.getResult();
        if (ssaInsn.isResultReg(this.regV)) {
            return;
        }
        if (result != null) {
            this.interference.add(this.regV, result.getReg());
        }
        this.nextFunction = NextFunction.LIVE_IN_AT_STATEMENT;
    }

    public void run() {
        for (SsaInsn ssaInsn : this.ssaMeth.getUseListForRegister(this.regV)) {
            this.nextFunction = NextFunction.DONE;
            if (ssaInsn instanceof PhiInsn) {
                Iterator<SsaBasicBlock> it = ((PhiInsn) ssaInsn).predBlocksForReg(this.regV, this.ssaMeth).iterator();
                while (it.hasNext()) {
                    this.blockN = it.next();
                    this.nextFunction = NextFunction.LIVE_OUT_AT_BLOCK;
                    handleTailRecursion();
                }
            } else {
                SsaBasicBlock block = ssaInsn.getBlock();
                this.blockN = block;
                int iIndexOf = block.getInsns().indexOf(ssaInsn);
                this.statementIndex = iIndexOf;
                if (iIndexOf < 0) {
                    C2633.m5339("insn not found in it's own block");
                    return;
                } else {
                    this.nextFunction = NextFunction.LIVE_IN_AT_STATEMENT;
                    handleTailRecursion();
                }
            }
        }
        while (true) {
            int iNextSetBit = this.liveOutBlocks.nextSetBit(0);
            if (iNextSetBit < 0) {
                return;
            }
            this.blockN = this.ssaMeth.getBlocks().get(iNextSetBit);
            this.liveOutBlocks.clear(iNextSetBit);
            this.nextFunction = NextFunction.LIVE_OUT_AT_BLOCK;
            handleTailRecursion();
        }
    }
}
