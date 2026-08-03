package com.android.p001dx.ssa;

import com.android.p001dx.rop.code.CstInsn;
import com.android.p001dx.rop.code.Insn;
import com.android.p001dx.rop.code.PlainInsn;
import com.android.p001dx.rop.code.RegisterSpec;
import com.android.p001dx.rop.code.RegisterSpecList;
import com.android.p001dx.rop.code.Rop;
import com.android.p001dx.rop.code.Rops;
import com.android.p001dx.rop.cst.Constant;
import com.android.p001dx.rop.cst.CstInteger;
import com.android.p001dx.rop.cst.TypedConstant;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class SCCP {
    private static final int CONSTANT = 1;
    private static final int TOP = 0;
    private static final int VARYING = 2;
    private final ArrayList<SsaInsn> branchWorklist;
    private final ArrayList<SsaBasicBlock> cfgPhiWorklist;
    private final ArrayList<SsaBasicBlock> cfgWorklist;
    private final BitSet executableBlocks;
    private final Constant[] latticeConstants;
    private final int[] latticeValues;
    private final int regCount;
    private final SsaMethod ssaMeth;
    private final ArrayList<SsaInsn> ssaWorklist;
    private final ArrayList<SsaInsn> varyingWorklist;

    private SCCP(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
        int regCount = ssaMethod.getRegCount();
        this.regCount = regCount;
        this.latticeValues = new int[regCount];
        this.latticeConstants = new Constant[regCount];
        this.cfgWorklist = new ArrayList<>();
        this.cfgPhiWorklist = new ArrayList<>();
        this.executableBlocks = new BitSet(ssaMethod.getBlocks().size());
        this.ssaWorklist = new ArrayList<>();
        this.varyingWorklist = new ArrayList<>();
        this.branchWorklist = new ArrayList<>();
        for (int i = 0; i < this.regCount; i++) {
            this.latticeValues[i] = 0;
            this.latticeConstants[i] = null;
        }
    }

    private void addBlockToWorklist(SsaBasicBlock ssaBasicBlock) {
        if (this.executableBlocks.get(ssaBasicBlock.getIndex())) {
            this.cfgPhiWorklist.add(ssaBasicBlock);
        } else {
            this.cfgWorklist.add(ssaBasicBlock);
            this.executableBlocks.set(ssaBasicBlock.getIndex());
        }
    }

    private void addUsersToWorklist(int i, int i2) {
        if (i2 == 2) {
            Iterator<SsaInsn> it = this.ssaMeth.getUseListForRegister(i).iterator();
            while (it.hasNext()) {
                this.varyingWorklist.add(it.next());
            }
            return;
        }
        Iterator<SsaInsn> it2 = this.ssaMeth.getUseListForRegister(i).iterator();
        while (it2.hasNext()) {
            this.ssaWorklist.add(it2.next());
        }
    }

    private static String latticeValName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "UNKNOWN" : "VARYING" : "CONSTANT" : "TOP";
    }

    public static void process(SsaMethod ssaMethod) {
        new SCCP(ssaMethod).run();
    }

    private void replaceBranches() {
        for (SsaInsn ssaInsn : this.branchWorklist) {
            SsaBasicBlock block = ssaInsn.getBlock();
            int size = block.getSuccessorList().size();
            int i = -1;
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = block.getSuccessorList().get(i2);
                if (!this.executableBlocks.get(i3)) {
                    i = i3;
                }
            }
            if (size == 2 && i != -1) {
                block.replaceLastInsn(new PlainInsn(Rops.GOTO, ssaInsn.getOriginalRopInsn().getPosition(), (RegisterSpec) null, RegisterSpecList.EMPTY));
                block.removeSuccessor(i);
            }
        }
    }

    private void replaceConstants() {
        for (int i = 0; i < this.regCount; i++) {
            if (this.latticeValues[i] == 1 && (this.latticeConstants[i] instanceof TypedConstant)) {
                SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
                if (!definitionForRegister.getResult().getTypeBearer().isConstant()) {
                    definitionForRegister.setResult(definitionForRegister.getResult().withType((TypedConstant) this.latticeConstants[i]));
                    for (SsaInsn ssaInsn : this.ssaMeth.getUseListForRegister(i)) {
                        if (!ssaInsn.isPhiOrMove()) {
                            NormalSsaInsn normalSsaInsn = (NormalSsaInsn) ssaInsn;
                            RegisterSpecList sources = ssaInsn.getSources();
                            int iIndexOfRegister = sources.indexOfRegister(i);
                            normalSsaInsn.changeOneSource(iIndexOfRegister, sources.get(iIndexOfRegister).withType((TypedConstant) this.latticeConstants[i]));
                        }
                    }
                }
            }
        }
    }

    private void run() {
        addBlockToWorklist(this.ssaMeth.getEntryBlock());
        while (true) {
            if (this.cfgWorklist.isEmpty() && this.cfgPhiWorklist.isEmpty() && this.ssaWorklist.isEmpty() && this.varyingWorklist.isEmpty()) {
                replaceConstants();
                replaceBranches();
                return;
            }
            while (!this.cfgWorklist.isEmpty()) {
                simulateBlock(this.cfgWorklist.remove(this.cfgWorklist.size() - 1));
            }
            while (!this.cfgPhiWorklist.isEmpty()) {
                simulatePhiBlock(this.cfgPhiWorklist.remove(this.cfgPhiWorklist.size() - 1));
            }
            while (!this.varyingWorklist.isEmpty()) {
                SsaInsn ssaInsnRemove = this.varyingWorklist.remove(this.varyingWorklist.size() - 1);
                if (this.executableBlocks.get(ssaInsnRemove.getBlock().getIndex())) {
                    if (ssaInsnRemove instanceof PhiInsn) {
                        simulatePhi((PhiInsn) ssaInsnRemove);
                    } else {
                        simulateStmt(ssaInsnRemove);
                    }
                }
            }
            while (!this.ssaWorklist.isEmpty()) {
                SsaInsn ssaInsnRemove2 = this.ssaWorklist.remove(this.ssaWorklist.size() - 1);
                if (this.executableBlocks.get(ssaInsnRemove2.getBlock().getIndex())) {
                    if (ssaInsnRemove2 instanceof PhiInsn) {
                        simulatePhi((PhiInsn) ssaInsnRemove2);
                    } else {
                        simulateStmt(ssaInsnRemove2);
                    }
                }
            }
        }
    }

    private boolean setLatticeValueTo(int i, int i2, Constant constant) {
        if (i2 != 1) {
            int[] iArr = this.latticeValues;
            if (iArr[i] == i2) {
                return false;
            }
            iArr[i] = i2;
            return true;
        }
        if (this.latticeValues[i] == i2 && this.latticeConstants[i].equals(constant)) {
            return false;
        }
        this.latticeValues[i] = i2;
        this.latticeConstants[i] = constant;
        return true;
    }

    private void simulateBlock(SsaBasicBlock ssaBasicBlock) {
        for (SsaInsn ssaInsn : ssaBasicBlock.getInsns()) {
            if (ssaInsn instanceof PhiInsn) {
                simulatePhi((PhiInsn) ssaInsn);
            } else {
                simulateStmt(ssaInsn);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void simulateBranch(SsaInsn ssaInsn) {
        boolean z;
        boolean z2;
        Rop opcode = ssaInsn.getOpcode();
        RegisterSpecList sources = ssaInsn.getSources();
        if (opcode.getBranchingness() == 4) {
            RegisterSpec registerSpec = sources.get(0);
            int reg = registerSpec.getReg();
            Constant constant = null;
            Constant constant2 = (this.ssaMeth.isRegALocal(registerSpec) || this.latticeValues[reg] != 1) ? null : this.latticeConstants[reg];
            if (sources.size() == 2) {
                RegisterSpec registerSpec2 = sources.get(1);
                int reg2 = registerSpec2.getReg();
                if (!this.ssaMeth.isRegALocal(registerSpec2) && this.latticeValues[reg2] == 1) {
                    constant = this.latticeConstants[reg2];
                }
            }
            if (constant2 == null || sources.size() != 1) {
                if (constant2 != null && constant != null && ((TypedConstant) constant2).getBasicType() == 6) {
                    int value = ((CstInteger) constant2).getValue();
                    int value2 = ((CstInteger) constant).getValue();
                    switch (opcode.getOpcode()) {
                        case 7:
                            z = value == value2;
                            z2 = true;
                            break;
                        case 8:
                            if (value != value2) {
                            }
                            z2 = true;
                            break;
                        case 9:
                            if (value < value2) {
                            }
                            z2 = true;
                            break;
                        case 10:
                            if (value >= value2) {
                            }
                            z2 = true;
                            break;
                        case 11:
                            if (value <= value2) {
                            }
                            z2 = true;
                            break;
                        case 12:
                            if (value > value2) {
                            }
                            z2 = true;
                            break;
                        default:
                            throw new RuntimeException("Unexpected op");
                    }
                }
                z = false;
                z2 = false;
            } else {
                if (((TypedConstant) constant2).getBasicType() == 6) {
                    int value3 = ((CstInteger) constant2).getValue();
                    switch (opcode.getOpcode()) {
                        case 7:
                            if (value3 == 0) {
                            }
                            z2 = true;
                            break;
                        case 8:
                            if (value3 != 0) {
                            }
                            z2 = true;
                            break;
                        case 9:
                            if (value3 < 0) {
                            }
                            z2 = true;
                            break;
                        case 10:
                            if (value3 >= 0) {
                            }
                            z2 = true;
                            break;
                        case 11:
                            if (value3 <= 0) {
                            }
                            z2 = true;
                            break;
                        case 12:
                            if (value3 > 0) {
                            }
                            z2 = true;
                            break;
                        default:
                            throw new RuntimeException("Unexpected op");
                    }
                }
                z = false;
                z2 = false;
            }
        } else {
            z = false;
            z2 = false;
        }
        SsaBasicBlock block = ssaInsn.getBlock();
        if (z2) {
            addBlockToWorklist(this.ssaMeth.getBlocks().get(z ? block.getSuccessorList().get(1) : block.getSuccessorList().get(0)));
            this.branchWorklist.add(ssaInsn);
        } else {
            for (int i = 0; i < block.getSuccessorList().size(); i++) {
                addBlockToWorklist(this.ssaMeth.getBlocks().get(block.getSuccessorList().get(i)));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Constant simulateMath(SsaInsn ssaInsn, int i) {
        Constant constant;
        int i2;
        int i3;
        Insn originalRopInsn = ssaInsn.getOriginalRopInsn();
        int opcode = ssaInsn.getOpcode().getOpcode();
        RegisterSpecList sources = ssaInsn.getSources();
        boolean z = false;
        int reg = sources.get(0).getReg();
        Constant constant2 = this.latticeValues[reg] != 1 ? null : this.latticeConstants[reg];
        if (sources.size() == 1) {
            constant = ((CstInsn) originalRopInsn).getConstant();
        } else {
            int reg2 = sources.get(1).getReg();
            constant = this.latticeValues[reg2] != 1 ? null : this.latticeConstants[reg2];
        }
        if (constant2 != null && constant != null && i == 6) {
            int value = ((CstInteger) constant2).getValue();
            int value2 = ((CstInteger) constant).getValue();
            switch (opcode) {
                case 14:
                    i2 = value + value2;
                    i3 = i2;
                    if (z) {
                        return CstInteger.make(i3);
                    }
                    return null;
                case 15:
                    if (sources.size() == 1) {
                        i3 = value2 - value;
                        if (z) {
                        }
                    } else {
                        i2 = value - value2;
                        i3 = i2;
                        if (z) {
                        }
                    }
                    break;
                case 16:
                    i2 = value * value2;
                    i3 = i2;
                    if (z) {
                    }
                    break;
                case 17:
                    if (value2 != 0) {
                        i2 = value / value2;
                        i3 = i2;
                        if (z) {
                        }
                    }
                    i3 = 0;
                    z = true;
                    if (z) {
                    }
                    break;
                case 18:
                    if (value2 != 0) {
                        i2 = value % value2;
                        i3 = i2;
                        if (z) {
                        }
                    }
                    i3 = 0;
                    z = true;
                    if (z) {
                    }
                    break;
                case 19:
                default:
                    throw new RuntimeException("Unexpected op");
                case 20:
                    i3 = value & value2;
                    if (z) {
                    }
                    break;
                case 21:
                    i3 = value | value2;
                    if (z) {
                    }
                    break;
                case 22:
                    i3 = value ^ value2;
                    if (z) {
                    }
                    break;
                case 23:
                    i3 = value << value2;
                    if (z) {
                    }
                    break;
                case 24:
                    i3 = value >> value2;
                    if (z) {
                    }
                    break;
                case 25:
                    i3 = value >>> value2;
                    if (z) {
                    }
                    break;
            }
        } else {
            return null;
        }
    }

    private void simulatePhi(PhiInsn phiInsn) {
        int reg = phiInsn.getResult().getReg();
        int i = 2;
        if (this.latticeValues[reg] == 2) {
            return;
        }
        RegisterSpecList sources = phiInsn.getSources();
        int size = sources.size();
        int i2 = 0;
        Constant constant = null;
        int i3 = 0;
        while (true) {
            if (i2 >= size) {
                i = i3;
                break;
            }
            int iPredBlockIndexForSourcesIndex = phiInsn.predBlockIndexForSourcesIndex(i2);
            int reg2 = sources.get(i2).getReg();
            int i4 = this.latticeValues[reg2];
            if (this.executableBlocks.get(iPredBlockIndexForSourcesIndex)) {
                if (i4 != 1) {
                    i = i4;
                    break;
                } else if (constant == null) {
                    constant = this.latticeConstants[reg2];
                    i3 = 1;
                } else if (!this.latticeConstants[reg2].equals(constant)) {
                    break;
                }
            }
            i2++;
        }
        if (setLatticeValueTo(reg, i, constant)) {
            addUsersToWorklist(reg, i);
        }
    }

    private void simulatePhiBlock(SsaBasicBlock ssaBasicBlock) {
        for (SsaInsn ssaInsn : ssaBasicBlock.getInsns()) {
            if (!(ssaInsn instanceof PhiInsn)) {
                return;
            } else {
                simulatePhi((PhiInsn) ssaInsn);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void simulateStmt(SsaInsn ssaInsn) {
        Constant constant;
        Insn originalRopInsn = ssaInsn.getOriginalRopInsn();
        int i = 1;
        if (originalRopInsn.getOpcode().getBranchingness() != 1 || originalRopInsn.getOpcode().isCallLike()) {
            simulateBranch(ssaInsn);
        }
        int opcode = ssaInsn.getOpcode().getOpcode();
        RegisterSpec result = ssaInsn.getResult();
        if (result == null) {
            if (opcode != 17 && opcode != 18) {
                return;
            } else {
                result = ssaInsn.getBlock().getPrimarySuccessor().getInsns().get(0).getResult();
            }
        }
        int reg = result.getReg();
        if (opcode != 2) {
            if (opcode == 5) {
                constant = ((CstInsn) originalRopInsn).getConstant();
            } else if (opcode != 56) {
                switch (opcode) {
                    default:
                        switch (opcode) {
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                break;
                            default:
                                constant = null;
                                break;
                        }
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        constant = simulateMath(ssaInsn, result.getBasicType());
                        if (constant == null) {
                        }
                        break;
                }
            } else {
                int i2 = this.latticeValues[reg];
                if (i2 == 1) {
                    i = i2;
                    constant = this.latticeConstants[reg];
                }
                constant = null;
            }
            if (setLatticeValueTo(reg, i, constant)) {
                addUsersToWorklist(reg, i);
                return;
            }
            return;
        }
        if (ssaInsn.getSources().size() == 1) {
            int reg2 = ssaInsn.getSources().get(0).getReg();
            i = this.latticeValues[reg2];
            constant = this.latticeConstants[reg2];
            if (setLatticeValueTo(reg, i, constant)) {
            }
        }
        constant = null;
        i = 2;
        if (setLatticeValueTo(reg, i, constant)) {
        }
    }
}
