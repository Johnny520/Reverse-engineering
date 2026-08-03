package com.android.p001dx.ssa;

import com.android.p001dx.rop.code.LocalItem;
import com.android.p001dx.rop.code.PlainCstInsn;
import com.android.p001dx.rop.code.PlainInsn;
import com.android.p001dx.rop.code.RegisterSpec;
import com.android.p001dx.rop.code.RegisterSpecList;
import com.android.p001dx.rop.code.Rop;
import com.android.p001dx.rop.code.Rops;
import com.android.p001dx.rop.code.SourcePosition;
import com.android.p001dx.rop.code.ThrowingCstInsn;
import com.android.p001dx.rop.cst.Constant;
import com.android.p001dx.rop.cst.CstString;
import com.android.p001dx.rop.cst.TypedConstant;
import com.android.p001dx.rop.type.StdTypeList;
import com.android.p001dx.rop.type.TypeBearer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ConstCollector {
    private static final boolean COLLECT_ONE_LOCAL = false;
    private static final boolean COLLECT_STRINGS = false;
    private static final int MAX_COLLECTED_CONSTANTS = 5;
    private final SsaMethod ssaMeth;

    private ConstCollector(SsaMethod ssaMethod) {
        this.ssaMeth = ssaMethod;
    }

    private void fixLocalAssignment(RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        for (SsaInsn ssaInsn : this.ssaMeth.getUseListForRegister(registerSpec.getReg())) {
            RegisterSpec localAssignment = ssaInsn.getLocalAssignment();
            if (localAssignment != null && ssaInsn.getResult() != null) {
                LocalItem localItem = localAssignment.getLocalItem();
                ssaInsn.setResultLocal(null);
                registerSpec2 = registerSpec2.withLocalItem(localItem);
                SsaInsn ssaInsnMakeFromRop = SsaInsn.makeFromRop(new PlainInsn(Rops.opMarkLocal(registerSpec2), SourcePosition.NO_INFO, (RegisterSpec) null, RegisterSpecList.make(registerSpec2)), ssaInsn.getBlock());
                ArrayList<SsaInsn> insns = ssaInsn.getBlock().getInsns();
                insns.add(insns.indexOf(ssaInsn) + 1, ssaInsnMakeFromRop);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.ArrayList<com.android.dx.rop.cst.TypedConstant> */
    /* JADX WARN: Multi-variable type inference failed */
    private ArrayList<TypedConstant> getConstsSortedByCountUse() {
        int regCount = this.ssaMeth.getRegCount();
        final HashMap map = new HashMap();
        new HashSet();
        for (int i = 0; i < regCount; i++) {
            SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
            if (definitionForRegister != null && definitionForRegister.getOpcode() != null) {
                RegisterSpec result = definitionForRegister.getResult();
                TypeBearer typeBearer = result.getTypeBearer();
                if (typeBearer.isConstant()) {
                    TypedConstant typedConstant = (TypedConstant) typeBearer;
                    if (definitionForRegister.getOpcode().getOpcode() == 56) {
                        ArrayList<SsaInsn> insns = this.ssaMeth.getBlocks().get(definitionForRegister.getBlock().getPredecessors().nextSetBit(0)).getInsns();
                        definitionForRegister = insns.get(insns.size() - 1);
                    }
                    if (definitionForRegister.canThrow()) {
                        boolean z = typedConstant instanceof CstString;
                    } else if (!this.ssaMeth.isRegALocal(result)) {
                        Integer num = (Integer) map.get(typedConstant);
                        if (num == null) {
                            map.put(typedConstant, 1);
                        } else {
                            map.put(typedConstant, Integer.valueOf(num.intValue() + 1));
                        }
                    }
                }
            }
        }
        ArrayList<TypedConstant> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > 1) {
                arrayList.add(entry.getKey());
            }
        }
        Collections.sort(arrayList, new Comparator<Constant>() { // from class: com.android.dx.ssa.ConstCollector.1
            @Override // java.util.Comparator
            public boolean equals(Object obj) {
                return obj == this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
            @Override // java.util.Comparator
            public int compare(Constant constant, Constant constant2) {
                int iIntValue = ((Integer) map.get(constant2)).intValue() - ((Integer) map.get(constant)).intValue();
                return iIntValue == 0 ? constant.compareTo(constant2) : iIntValue;
            }
        });
        return arrayList;
    }

    public static void process(SsaMethod ssaMethod) {
        new ConstCollector(ssaMethod).run();
    }

    private void run() {
        ArrayList<TypedConstant> arrayList;
        int i;
        SsaBasicBlock ssaBasicBlock;
        int regCount = this.ssaMeth.getRegCount();
        ArrayList<TypedConstant> constsSortedByCountUse = getConstsSortedByCountUse();
        int iMin = Math.min(constsSortedByCountUse.size(), 5);
        SsaBasicBlock entryBlock = this.ssaMeth.getEntryBlock();
        HashMap<TypedConstant, RegisterSpec> map = new HashMap<>(iMin);
        int i2 = 0;
        while (i2 < iMin) {
            TypedConstant typedConstant = constsSortedByCountUse.get(i2);
            RegisterSpec registerSpecMake = RegisterSpec.make(this.ssaMeth.makeNewSsaReg(), typedConstant);
            Rop ropOpConst = Rops.opConst(typedConstant);
            if (ropOpConst.getBranchingness() == 1) {
                entryBlock.addInsnToHead(new PlainCstInsn(Rops.opConst(typedConstant), SourcePosition.NO_INFO, registerSpecMake, RegisterSpecList.EMPTY, typedConstant));
                arrayList = constsSortedByCountUse;
                i = iMin;
                ssaBasicBlock = entryBlock;
            } else {
                SsaBasicBlock entryBlock2 = this.ssaMeth.getEntryBlock();
                SsaBasicBlock primarySuccessor = entryBlock2.getPrimarySuccessor();
                SsaBasicBlock ssaBasicBlockInsertNewSuccessor = entryBlock2.insertNewSuccessor(primarySuccessor);
                SourcePosition sourcePosition = SourcePosition.NO_INFO;
                RegisterSpecList registerSpecList = RegisterSpecList.EMPTY;
                arrayList = constsSortedByCountUse;
                i = iMin;
                ssaBasicBlock = entryBlock;
                ssaBasicBlockInsertNewSuccessor.replaceLastInsn(new ThrowingCstInsn(ropOpConst, sourcePosition, registerSpecList, StdTypeList.EMPTY, typedConstant));
                ssaBasicBlockInsertNewSuccessor.insertNewSuccessor(primarySuccessor).addInsnToHead(new PlainInsn(Rops.opMoveResultPseudo(registerSpecMake.getTypeBearer()), sourcePosition, registerSpecMake, registerSpecList));
            }
            map.put(typedConstant, registerSpecMake);
            i2++;
            entryBlock = ssaBasicBlock;
            constsSortedByCountUse = arrayList;
            iMin = i;
        }
        updateConstUses(map, regCount);
    }

    private void updateConstUses(HashMap<TypedConstant, RegisterSpec> map, int i) {
        final RegisterSpec registerSpec;
        new HashSet();
        ArrayList<SsaInsn>[] useListCopy = this.ssaMeth.getUseListCopy();
        for (int i2 = 0; i2 < i; i2++) {
            SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i2);
            if (definitionForRegister != null) {
                final RegisterSpec result = definitionForRegister.getResult();
                TypeBearer typeBearer = definitionForRegister.getResult().getTypeBearer();
                if (typeBearer.isConstant() && (registerSpec = map.get((TypedConstant) typeBearer)) != null && !this.ssaMeth.isRegALocal(result)) {
                    RegisterMapper registerMapper = new RegisterMapper() { // from class: com.android.dx.ssa.ConstCollector.2
                        @Override // com.android.p001dx.ssa.RegisterMapper
                        public int getNewRegisterCount() {
                            return ConstCollector.this.ssaMeth.getRegCount();
                        }

                        @Override // com.android.p001dx.ssa.RegisterMapper
                        public RegisterSpec map(RegisterSpec registerSpec2) {
                            return registerSpec2.getReg() == result.getReg() ? registerSpec.withLocalItem(registerSpec2.getLocalItem()) : registerSpec2;
                        }
                    };
                    for (SsaInsn ssaInsn : useListCopy[result.getReg()]) {
                        if (!ssaInsn.canThrow() || ssaInsn.getBlock().getSuccessors().cardinality() <= 1) {
                            ssaInsn.mapSourceRegisters(registerMapper);
                        }
                    }
                }
            }
        }
    }
}
