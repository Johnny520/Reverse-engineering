package com.android.p002dx.p003cf.code;

import androidx.collection.C1123;
import bsh.C3466;
import com.android.p002dx.p003cf.iface.Method;
import com.android.p002dx.p003cf.iface.MethodList;
import com.android.p002dx.rop.code.AccessFlags;
import com.android.p002dx.rop.code.FillArrayDataInsn;
import com.android.p002dx.rop.code.Insn;
import com.android.p002dx.rop.code.InvokePolymorphicInsn;
import com.android.p002dx.rop.code.PlainCstInsn;
import com.android.p002dx.rop.code.PlainInsn;
import com.android.p002dx.rop.code.RegisterSpec;
import com.android.p002dx.rop.code.RegisterSpecList;
import com.android.p002dx.rop.code.Rop;
import com.android.p002dx.rop.code.Rops;
import com.android.p002dx.rop.code.SourcePosition;
import com.android.p002dx.rop.code.SwitchInsn;
import com.android.p002dx.rop.code.ThrowingCstInsn;
import com.android.p002dx.rop.code.ThrowingInsn;
import com.android.p002dx.rop.code.TranslationAdvice;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstCallSiteRef;
import com.android.p002dx.rop.cst.CstFieldRef;
import com.android.p002dx.rop.cst.CstInteger;
import com.android.p002dx.rop.cst.CstMethodRef;
import com.android.p002dx.rop.cst.CstNat;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.rop.cst.CstType;
import com.android.p002dx.rop.type.Type;
import com.android.p002dx.rop.type.TypeBearer;
import com.android.p002dx.rop.type.TypeList;
import com.android.p002dx.util.IntList;
import java.util.ArrayList;
import net.bytebuddy.implementation.auxiliary.TypeProxy;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class RopperMachine extends ValueAwareMachine {
    private static final CstType ARRAY_REFLECT_TYPE;
    private static final CstMethodRef MULTIANEWARRAY_METHOD;
    private final TranslationAdvice advice;
    private boolean blockCanThrow;
    private TypeList catches;
    private boolean catchesUsed;
    private int extraBlockCount;
    private boolean hasJsr;
    private final ArrayList<Insn> insns;
    private final int maxLocals;
    private final ConcreteMethod method;
    private final MethodList methods;
    private int primarySuccessorIndex;
    private ReturnAddress returnAddress;
    private Rop returnOp;
    private SourcePosition returnPosition;
    private boolean returns;
    private final Ropper ropper;

    static {
        CstType cstType = new CstType(Type.internClassName("java/lang/reflect/Array"));
        ARRAY_REFLECT_TYPE = cstType;
        MULTIANEWARRAY_METHOD = new CstMethodRef(cstType, new CstNat(new CstString(TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME), new CstString("(Ljava/lang/Class;[I)Ljava/lang/Object;")));
    }

    public RopperMachine(Ropper ropper, ConcreteMethod concreteMethod, TranslationAdvice translationAdvice, MethodList methodList) {
        super(concreteMethod.getEffectiveDescriptor());
        if (methodList == null) {
            C3466.m5903("methods == null");
            throw null;
        }
        if (ropper == null) {
            C3466.m5903("ropper == null");
            throw null;
        }
        if (translationAdvice == null) {
            C3466.m5903("advice == null");
            throw null;
        }
        this.ropper = ropper;
        this.method = concreteMethod;
        this.methods = methodList;
        this.advice = translationAdvice;
        this.maxLocals = concreteMethod.getMaxLocals();
        this.insns = new ArrayList<>(25);
        this.catches = null;
        this.catchesUsed = false;
        this.returns = false;
        this.primarySuccessorIndex = -1;
        this.extraBlockCount = 0;
        this.blockCanThrow = false;
        this.returnOp = null;
        this.returnPosition = null;
    }

    private RegisterSpecList getSources(int i, int i2) {
        RegisterSpecList registerSpecList;
        int iArgCount = argCount();
        if (iArgCount == 0) {
            return RegisterSpecList.EMPTY;
        }
        int localIndex = getLocalIndex();
        if (localIndex >= 0) {
            registerSpecList = new RegisterSpecList(1);
            registerSpecList.set(0, RegisterSpec.make(localIndex, arg(0)));
        } else {
            RegisterSpecList registerSpecList2 = new RegisterSpecList(iArgCount);
            for (int i3 = 0; i3 < iArgCount; i3++) {
                RegisterSpec registerSpecMake = RegisterSpec.make(i2, arg(i3));
                registerSpecList2.set(i3, registerSpecMake);
                i2 += registerSpecMake.getCategory();
            }
            if (i == 79) {
                if (iArgCount != 3) {
                    C3466.m5899("shouldn't happen");
                    return null;
                }
                RegisterSpec registerSpec = registerSpecList2.get(0);
                RegisterSpec registerSpec2 = registerSpecList2.get(1);
                registerSpecList2.set(0, registerSpecList2.get(2));
                registerSpecList2.set(1, registerSpec);
                registerSpecList2.set(2, registerSpec2);
            } else if (i == 181) {
                if (iArgCount != 2) {
                    C3466.m5899("shouldn't happen");
                    return null;
                }
                RegisterSpec registerSpec3 = registerSpecList2.get(0);
                registerSpecList2.set(0, registerSpecList2.get(1));
                registerSpecList2.set(1, registerSpec3);
            }
            registerSpecList = registerSpecList2;
        }
        registerSpecList.setImmutable();
        return registerSpecList;
    }

    private int jopToRopOpcode(int i, Constant constant) {
        if (i == 0) {
            return 1;
        }
        if (i == 20) {
            return 5;
        }
        if (i == 21) {
            return 2;
        }
        if (i == 171) {
            return 13;
        }
        if (i == 172) {
            return 33;
        }
        if (i == 198) {
            return 7;
        }
        if (i == 199) {
            return 8;
        }
        switch (i) {
            case 0:
                return 1;
            case 18:
                return 5;
            case 46:
                return 38;
            case 54:
                return 2;
            case 79:
                return 39;
            case 96:
                return 14;
            case 100:
                return 15;
            case 104:
                return 16;
            case 108:
                return 17;
            case 112:
                return 18;
            case 116:
                return 19;
            case 120:
                return 23;
            case 122:
                return 24;
            case 124:
                return 25;
            case 126:
                return 20;
            case 128:
                return 21;
            case 130:
                return 22;
            default:
                switch (i) {
                    case 132:
                        return 14;
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                        return 29;
                    case 145:
                        return 30;
                    case 146:
                        return 31;
                    case 147:
                        return 32;
                    case 148:
                    case 149:
                    case 151:
                        return 27;
                    case 150:
                    case 152:
                        return 28;
                    case 153:
                    case 159:
                    case 165:
                        return 7;
                    case 154:
                    case 160:
                    case 166:
                        return 8;
                    case 155:
                    case 161:
                        return 9;
                    case 156:
                    case 162:
                        return 10;
                    case 157:
                    case 163:
                        return 12;
                    case 158:
                    case 164:
                        return 11;
                    case 167:
                        return 6;
                    default:
                        switch (i) {
                            case 177:
                                return 33;
                            case 178:
                                return 46;
                            case 179:
                                return 48;
                            case 180:
                                return 45;
                            case 181:
                                return 47;
                            case 182:
                                CstMethodRef cstMethodRef = (CstMethodRef) constant;
                                if (cstMethodRef.getDefiningClass().equals(this.method.getDefiningClass())) {
                                    for (int i2 = 0; i2 < this.methods.size(); i2++) {
                                        Method method = this.methods.get(i2);
                                        if (AccessFlags.isPrivate(method.getAccessFlags()) && cstMethodRef.getNat().equals(method.getNat())) {
                                            return 52;
                                        }
                                    }
                                }
                                return cstMethodRef.isSignaturePolymorphic() ? 58 : 50;
                            case 183:
                                CstMethodRef cstMethodRef2 = (CstMethodRef) constant;
                                return (cstMethodRef2.isInstanceInit() || cstMethodRef2.getDefiningClass().equals(this.method.getDefiningClass())) ? 52 : 51;
                            case 184:
                                return 49;
                            case 185:
                                return 53;
                            case 186:
                                return 59;
                            case 187:
                                return 40;
                            case 188:
                            case 189:
                                return 41;
                            case 190:
                                return 34;
                            case 191:
                                return 35;
                            case 192:
                                return 43;
                            case 193:
                                return 44;
                            case 194:
                                return 36;
                            case 195:
                                return 37;
                            default:
                                C3466.m5899("shouldn't happen");
                                return 0;
                        }
                }
        }
    }

    private Insn makeInvokePolymorphicInsn(Rop rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, TypeList typeList, Constant constant) {
        return new InvokePolymorphicInsn(rop, sourcePosition, registerSpecList, typeList, (CstMethodRef) constant);
    }

    private void updateReturnOp(Rop rop, SourcePosition sourcePosition) {
        if (rop == null) {
            C3466.m5903("op == null");
            return;
        }
        if (sourcePosition == null) {
            C3466.m5903("pos == null");
            return;
        }
        Rop rop2 = this.returnOp;
        if (rop2 == null) {
            this.returnOp = rop;
            this.returnPosition = sourcePosition;
        } else if (rop2 == rop) {
            if (sourcePosition.getLine() > this.returnPosition.getLine()) {
                this.returnPosition = sourcePosition;
            }
        } else {
            StringBuilder sb = new StringBuilder("return op mismatch: ");
            sb.append(rop);
            Rop rop3 = this.returnOp;
            sb.append(", ");
            sb.append(rop3);
            throw new SimException(sb.toString());
        }
    }

    public boolean canThrow() {
        return this.blockCanThrow;
    }

    public int getExtraBlockCount() {
        return this.extraBlockCount;
    }

    public ArrayList<Insn> getInsns() {
        return this.insns;
    }

    public int getPrimarySuccessorIndex() {
        return this.primarySuccessorIndex;
    }

    public ReturnAddress getReturnAddress() {
        return this.returnAddress;
    }

    public Rop getReturnOp() {
        return this.returnOp;
    }

    public SourcePosition getReturnPosition() {
        return this.returnPosition;
    }

    public boolean hasJsr() {
        return this.hasJsr;
    }

    public boolean hasRet() {
        return this.returnAddress != null;
    }

    public boolean returns() {
        return this.returns;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0280  */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.android.dx.rop.type.TypeBearer] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.android.dx.rop.type.TypeBearer] */
    /* JADX WARN: Type inference failed for: r7v18, types: [com.android.dx.rop.code.Insn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    @Override // com.android.p002dx.p003cf.code.ValueAwareMachine, com.android.p002dx.p003cf.code.Machine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run(Frame frame, int i, int i2) {
        RegisterSpec registerSpec;
        RegisterSpecList registerSpecListWithoutFirst;
        RegisterSpec registerSpec2;
        TypeBearer typeBearer;
        Constant constant;
        RegisterSpec registerSpec3;
        Object plainInsn;
        RegisterSpecList registerSpecList;
        Constant constant2;
        Constant constantMake;
        Constant constantIntern;
        SwitchList auxCases;
        ArrayList<Constant> initValues;
        Constant constant3;
        Insn plainInsn2;
        Object obj;
        Insn plainCstInsn;
        Object obj2;
        int i3;
        ?? r7;
        ThrowingCstInsn throwingCstInsn;
        int i4 = i2;
        int size = frame.getStack().size() + this.maxLocals;
        RegisterSpecList sources = getSources(i4, size);
        int size2 = sources.size();
        super.run(frame, i, i2);
        SourcePosition sourcePositionMakeSourcePosistion = this.method.makeSourcePosistion(i);
        RegisterSpec localTarget = getLocalTarget(i4 == 54);
        int iResultCount = resultCount();
        if (iResultCount != 0) {
            if (localTarget == null) {
                if (iResultCount != 1) {
                    int firstTempStackReg = this.ropper.getFirstTempStackReg();
                    RegisterSpec[] registerSpecArr = new RegisterSpec[size2];
                    for (int i5 = 0; i5 < size2; i5++) {
                        RegisterSpec registerSpec4 = sources.get(i5);
                        TypeBearer typeBearer2 = registerSpec4.getTypeBearer();
                        RegisterSpec registerSpecWithReg = registerSpec4.withReg(firstTempStackReg);
                        this.insns.add(new PlainInsn(Rops.opMove(typeBearer2), sourcePositionMakeSourcePosistion, registerSpecWithReg, registerSpec4));
                        registerSpecArr[i5] = registerSpecWithReg;
                        firstTempStackReg += registerSpec4.getCategory();
                    }
                    for (int auxInt = getAuxInt(); auxInt != 0; auxInt >>= 4) {
                        RegisterSpec registerSpec5 = registerSpecArr[(auxInt & 15) - 1];
                        TypeBearer typeBearer3 = registerSpec5.getTypeBearer();
                        this.insns.add(new PlainInsn(Rops.opMove(typeBearer3), sourcePositionMakeSourcePosistion, registerSpec5.withReg(size), registerSpec5));
                        size += typeBearer3.getType().getCategory();
                    }
                    return;
                }
                localTarget = RegisterSpec.make(size, result(0));
            }
            registerSpec = localTarget;
        } else if (i4 == 87 || i4 == 88) {
            return;
        } else {
            registerSpec = null;
        }
        TypeBearer typeBearer4 = registerSpec != null ? registerSpec : Type.VOID;
        Constant auxCst = getAuxCst();
        if (i4 == 197) {
            this.blockCanThrow = true;
            this.extraBlockCount = 6;
            int nextReg = registerSpec.getNextReg();
            Type type = Type.INT_ARRAY;
            RegisterSpec registerSpecMake = RegisterSpec.make(nextReg, type);
            this.insns.add(new ThrowingCstInsn(Rops.opFilledNewArray(type, size2), sourcePositionMakeSourcePosistion, sources, this.catches, CstType.INT_ARRAY));
            this.insns.add(new PlainInsn(Rops.opMoveResult(type), sourcePositionMakeSourcePosistion, registerSpecMake, RegisterSpecList.EMPTY));
            Type classType = ((CstType) auxCst).getClassType();
            for (int i6 = 0; i6 < size2; i6++) {
                classType = classType.getComponentType();
            }
            RegisterSpec registerSpecMake2 = RegisterSpec.make(registerSpec.getReg(), Type.CLASS);
            if (classType.isPrimitive()) {
                constant = auxCst;
                CstFieldRef cstFieldRefForPrimitiveType = CstFieldRef.forPrimitiveType(classType);
                registerSpec2 = null;
                typeBearer = typeBearer4;
                sourcePositionMakeSourcePosistion = sourcePositionMakeSourcePosistion;
                throwingCstInsn = new ThrowingCstInsn(Rops.GET_STATIC_OBJECT, sourcePositionMakeSourcePosistion, RegisterSpecList.EMPTY, this.catches, cstFieldRefForPrimitiveType);
            } else {
                sourcePositionMakeSourcePosistion = sourcePositionMakeSourcePosistion;
                registerSpec2 = null;
                TypeBearer typeBearer5 = typeBearer4;
                constant = auxCst;
                Rop rop = Rops.CONST_OBJECT;
                RegisterSpecList registerSpecList2 = RegisterSpecList.EMPTY;
                TypeList typeList = this.catches;
                CstType cstType = new CstType(classType);
                typeBearer = typeBearer5;
                throwingCstInsn = new ThrowingCstInsn(rop, sourcePositionMakeSourcePosistion, registerSpecList2, typeList, cstType);
            }
            this.insns.add(throwingCstInsn);
            Rop ropOpMoveResultPseudo = Rops.opMoveResultPseudo(registerSpecMake2.getType());
            RegisterSpecList registerSpecList3 = RegisterSpecList.EMPTY;
            this.insns.add(new PlainInsn(ropOpMoveResultPseudo, sourcePositionMakeSourcePosistion, registerSpecMake2, registerSpecList3));
            RegisterSpec registerSpecMake3 = RegisterSpec.make(registerSpec.getReg(), Type.OBJECT);
            CstMethodRef cstMethodRef = MULTIANEWARRAY_METHOD;
            this.insns.add(new ThrowingCstInsn(Rops.opInvokeStatic(cstMethodRef.getPrototype()), sourcePositionMakeSourcePosistion, RegisterSpecList.make(registerSpecMake2, registerSpecMake), this.catches, cstMethodRef));
            this.insns.add(new PlainInsn(Rops.opMoveResult(cstMethodRef.getPrototype().getReturnType()), sourcePositionMakeSourcePosistion, registerSpecMake3, registerSpecList3));
            registerSpecListWithoutFirst = RegisterSpecList.make(registerSpecMake3);
            i4 = 192;
        } else {
            registerSpecListWithoutFirst = sources;
            registerSpec2 = null;
            typeBearer = typeBearer4;
            constant = auxCst;
            if (i4 == 168) {
                this.hasJsr = true;
                return;
            } else if (i4 == 169) {
                try {
                    this.returnAddress = (ReturnAddress) arg(0);
                    return;
                } catch (ClassCastException e) {
                    C1123.m1408("Argument to RET was not a ReturnAddress", e);
                    return;
                }
            }
        }
        int iJopToRopOpcode = jopToRopOpcode(i4, constant);
        Rop ropRopFor = Rops.ropFor(iJopToRopOpcode, typeBearer, registerSpecListWithoutFirst, constant);
        if (registerSpec != null && ropRopFor.isCallLike()) {
            this.extraBlockCount++;
            registerSpec3 = registerSpec2;
            plainInsn = new PlainInsn(Rops.opMoveResult(ropRopFor.getOpcode() == 59 ? ((CstCallSiteRef) constant).getReturnType() : ((CstMethodRef) constant).getPrototype().getReturnType()), sourcePositionMakeSourcePosistion, registerSpec, RegisterSpecList.EMPTY);
        } else if (registerSpec == null || !ropRopFor.canThrow()) {
            registerSpec3 = registerSpec;
            plainInsn = registerSpec2;
        } else {
            this.extraBlockCount++;
            plainInsn = new PlainInsn(Rops.opMoveResultPseudo(registerSpec.getTypeBearer()), sourcePositionMakeSourcePosistion, registerSpec, RegisterSpecList.EMPTY);
            registerSpec3 = registerSpec2;
        }
        if (iJopToRopOpcode != 41) {
            if (constant == null && size2 == 2) {
                ?? typeBearer6 = registerSpecListWithoutFirst.get(0).getTypeBearer();
                ?? typeBearer7 = registerSpecListWithoutFirst.get(1).getTypeBearer();
                if ((typeBearer7.isConstant() || typeBearer6.isConstant()) && this.advice.hasConstantOperation(ropRopFor, registerSpecListWithoutFirst.get(0), registerSpecListWithoutFirst.get(1))) {
                    if (typeBearer7.isConstant()) {
                        constantMake = (Constant) typeBearer7;
                        registerSpecListWithoutFirst = registerSpecListWithoutFirst.withoutLast();
                        if (ropRopFor.getOpcode() == 15) {
                            constantMake = CstInteger.make(-((CstInteger) typeBearer7).getValue());
                            iJopToRopOpcode = 14;
                        }
                    } else {
                        constantMake = (Constant) typeBearer6;
                        registerSpecListWithoutFirst = registerSpecListWithoutFirst.withoutFirst();
                    }
                    constantIntern = constantMake;
                    ropRopFor = Rops.ropFor(iJopToRopOpcode, typeBearer, registerSpecListWithoutFirst, constantIntern);
                }
            }
            registerSpecList = registerSpecListWithoutFirst;
            constant2 = constant;
            auxCases = getAuxCases();
            initValues = getInitValues();
            boolean zCanThrow = ropRopFor.canThrow();
            this.blockCanThrow |= zCanThrow;
            if (auxCases == null) {
                if (auxCases.size() == 0) {
                    plainInsn2 = new PlainInsn(Rops.GOTO, sourcePositionMakeSourcePosistion, (RegisterSpec) null, RegisterSpecList.EMPTY);
                    this.primarySuccessorIndex = 0;
                    r7 = plainInsn;
                    constant3 = constant2;
                } else {
                    IntList values = auxCases.getValues();
                    plainCstInsn = new SwitchInsn(ropRopFor, sourcePositionMakeSourcePosistion, registerSpec3, registerSpecList, values);
                    this.primarySuccessorIndex = values.size();
                    obj = plainInsn;
                    constant3 = constant2;
                    plainInsn2 = plainCstInsn;
                    r7 = obj;
                }
            } else if (iJopToRopOpcode == 33) {
                if (registerSpecList.size() != 0) {
                    i3 = 0;
                    RegisterSpec registerSpec6 = registerSpecList.get(0);
                    TypeBearer typeBearer8 = registerSpec6.getTypeBearer();
                    if (registerSpec6.getReg() != 0) {
                        this.insns.add(new PlainInsn(Rops.opMove(typeBearer8), sourcePositionMakeSourcePosistion, RegisterSpec.make(0, typeBearer8), registerSpec6));
                    }
                } else {
                    i3 = 0;
                }
                PlainInsn plainInsn3 = new PlainInsn(Rops.GOTO, sourcePositionMakeSourcePosistion, (RegisterSpec) null, RegisterSpecList.EMPTY);
                this.primarySuccessorIndex = i3;
                updateReturnOp(ropRopFor, sourcePositionMakeSourcePosistion);
                this.returns = true;
                plainInsn2 = plainInsn3;
                r7 = plainInsn;
                constant3 = constant2;
            } else if (constant2 == null) {
                Object obj3 = plainInsn;
                constant3 = constant2;
                if (zCanThrow) {
                    ThrowingInsn throwingInsn = new ThrowingInsn(ropRopFor, sourcePositionMakeSourcePosistion, registerSpecList, this.catches);
                    this.catchesUsed = true;
                    if (i4 == 191) {
                        this.primarySuccessorIndex = -1;
                    } else {
                        this.primarySuccessorIndex = this.catches.size();
                    }
                    plainInsn2 = throwingInsn;
                    r7 = obj3;
                } else {
                    plainInsn2 = new PlainInsn(ropRopFor, sourcePositionMakeSourcePosistion, registerSpec3, registerSpecList);
                    r7 = obj3;
                }
            } else if (zCanThrow) {
                int opcode = ropRopFor.getOpcode();
                TypeList typeList2 = this.catches;
                if (opcode == 58) {
                    obj2 = plainInsn;
                    plainInsn2 = makeInvokePolymorphicInsn(ropRopFor, sourcePositionMakeSourcePosistion, registerSpecList, typeList2, constant2);
                    constant3 = constant2;
                } else {
                    obj2 = plainInsn;
                    constant3 = constant2;
                    plainInsn2 = new ThrowingCstInsn(ropRopFor, sourcePositionMakeSourcePosistion, registerSpecList, typeList2, constant3);
                }
                this.catchesUsed = true;
                this.primarySuccessorIndex = this.catches.size();
                r7 = obj2;
            } else {
                obj = plainInsn;
                constant3 = constant2;
                plainCstInsn = new PlainCstInsn(ropRopFor, sourcePositionMakeSourcePosistion, registerSpec3, registerSpecList, constant3);
                plainInsn2 = plainCstInsn;
                r7 = obj;
            }
            this.insns.add(plainInsn2);
            if (r7 != 0) {
                this.insns.add((Insn) r7);
            }
            if (initValues == null) {
                this.extraBlockCount++;
                this.insns.add(new FillArrayDataInsn(Rops.FILL_ARRAY_DATA, sourcePositionMakeSourcePosistion, RegisterSpecList.make(r7.getResult()), initValues, constant3));
                return;
            }
            return;
        }
        constantIntern = CstType.intern(ropRopFor.getResult());
        registerSpecList = registerSpecListWithoutFirst;
        constant2 = constantIntern;
        auxCases = getAuxCases();
        initValues = getInitValues();
        boolean zCanThrow2 = ropRopFor.canThrow();
        this.blockCanThrow |= zCanThrow2;
        if (auxCases == null) {
        }
        this.insns.add(plainInsn2);
        if (r7 != 0) {
        }
        if (initValues == null) {
        }
    }

    public void startBlock(TypeList typeList) {
        this.catches = typeList;
        this.insns.clear();
        this.catchesUsed = false;
        this.returns = false;
        this.primarySuccessorIndex = 0;
        this.extraBlockCount = 0;
        this.blockCanThrow = false;
        this.hasJsr = false;
        this.returnAddress = null;
    }

    public boolean wereCatchesUsed() {
        return this.catchesUsed;
    }
}
