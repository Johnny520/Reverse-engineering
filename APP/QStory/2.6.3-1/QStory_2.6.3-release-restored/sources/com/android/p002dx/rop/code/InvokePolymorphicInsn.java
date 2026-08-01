package com.android.p002dx.rop.code;

import bsh.C3466;
import com.alibaba.fastjson2.C3775;
import com.android.p002dx.rop.code.Insn;
import com.android.p002dx.rop.cst.CstMethodRef;
import com.android.p002dx.rop.cst.CstNat;
import com.android.p002dx.rop.cst.CstProtoRef;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.rop.cst.CstType;
import com.android.p002dx.rop.type.Type;
import com.android.p002dx.rop.type.TypeList;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import p160.C8376;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class InvokePolymorphicInsn extends Insn {
    private final CstMethodRef callSiteMethod;
    private final CstProtoRef callSiteProto;
    private final TypeList catches;
    private final CstMethodRef polymorphicMethod;
    private static final CstString DEFAULT_DESCRIPTOR = new CstString(TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_DESCRIPTOR);
    private static final CstString VARHANDLE_SET_DESCRIPTOR = new CstString("([Ljava/lang/Object;)V");
    private static final CstString VARHANDLE_COMPARE_AND_SET_DESCRIPTOR = new CstString("([Ljava/lang/Object;)Z");

    public InvokePolymorphicInsn(Rop rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, TypeList typeList, CstMethodRef cstMethodRef) {
        super(rop, sourcePosition, null, registerSpecList);
        if (rop.getBranchingness() != 6) {
            C3775.m6952(rop.getBranchingness(), "opcode with invalid branchingness: ");
            throw null;
        }
        if (typeList == null) {
            C3466.m5903("catches == null");
            throw null;
        }
        this.catches = typeList;
        if (cstMethodRef == null) {
            C3466.m5903("callSiteMethod == null");
            throw null;
        }
        if (!cstMethodRef.isSignaturePolymorphic()) {
            C6755.m11869("callSiteMethod is not signature polymorphic");
            throw null;
        }
        this.callSiteMethod = cstMethodRef;
        this.polymorphicMethod = makePolymorphicMethod(cstMethodRef);
        this.callSiteProto = makeCallSiteProto(cstMethodRef);
    }

    private static CstProtoRef makeCallSiteProto(CstMethodRef cstMethodRef) {
        return new CstProtoRef(cstMethodRef.getPrototype(true));
    }

    private static CstMethodRef makePolymorphicMethod(CstMethodRef cstMethodRef) {
        CstType definingClass = cstMethodRef.getDefiningClass();
        CstString name = cstMethodRef.getNat().getName();
        String string = cstMethodRef.getNat().getName().getString();
        if (definingClass.equals(CstType.METHOD_HANDLE) && (string.equals("invoke") || string.equals("invokeExact"))) {
            return new CstMethodRef(definingClass, new CstNat(name, DEFAULT_DESCRIPTOR));
        }
        if (definingClass.equals(CstType.VAR_HANDLE)) {
            string.getClass();
            switch (string) {
                case "getAndBitwiseOrRelease":
                case "getAndBitwiseAndRelease":
                case "compareAndExchangeRelease":
                case "getAndAddRelease":
                case "getAndBitwiseAnd":
                case "getAndBitwiseXor":
                case "getAndBitwiseXorRelease":
                case "getAcquire":
                case "getAndSetRelease":
                case "get":
                case "getAndBitwiseOrAcquire":
                case "getVolatile":
                case "getAndAdd":
                case "getAndSet":
                case "getAndBitwiseAndAcquire":
                case "getOpaque":
                case "compareAndExchangeAcquire":
                case "getAndAddAcquire":
                case "getAndBitwiseXorAcquire":
                case "getAndBitwiseOr":
                case "compareAndExchange":
                case "getAndSetAcquire":
                    return new CstMethodRef(definingClass, new CstNat(name, DEFAULT_DESCRIPTOR));
                case "compareAndSet":
                case "weakCompareAndSet":
                case "weakCompareAndSetPlain":
                case "weakCompareAndSetAcquire":
                case "weakCompareAndSetRelease":
                    return new CstMethodRef(definingClass, new CstNat(name, VARHANDLE_COMPARE_AND_SET_DESCRIPTOR));
                case "setRelease":
                case "set":
                case "setVolatile":
                case "setOpaque":
                    return new CstMethodRef(definingClass, new CstNat(name, VARHANDLE_SET_DESCRIPTOR));
            }
        }
        C8376.m13323(cstMethodRef.toHuman(), "Unknown signature polymorphic method: ");
        return null;
    }

    @Override // com.android.p002dx.rop.code.Insn
    public void accept(Insn.Visitor visitor) {
        visitor.visitInvokePolymorphicInsn(this);
    }

    public CstMethodRef getCallSiteMethod() {
        return this.callSiteMethod;
    }

    public CstProtoRef getCallSiteProto() {
        return this.callSiteProto;
    }

    @Override // com.android.p002dx.rop.code.Insn
    public TypeList getCatches() {
        return this.catches;
    }

    @Override // com.android.p002dx.rop.code.Insn
    public String getInlineString() {
        return getPolymorphicMethod().toString() + " " + getCallSiteProto().toString() + " " + ThrowingInsn.toCatchString(this.catches);
    }

    public CstMethodRef getPolymorphicMethod() {
        return this.polymorphicMethod;
    }

    @Override // com.android.p002dx.rop.code.Insn
    public Insn withAddedCatch(Type type) {
        return new InvokePolymorphicInsn(getOpcode(), getPosition(), getSources(), this.catches.withAddedType(type), getCallSiteMethod());
    }

    @Override // com.android.p002dx.rop.code.Insn
    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new InvokePolymorphicInsn(getOpcode(), getPosition(), registerSpecList, this.catches, getCallSiteMethod());
    }

    @Override // com.android.p002dx.rop.code.Insn
    public Insn withRegisterOffset(int i) {
        return new InvokePolymorphicInsn(getOpcode(), getPosition(), getSources().withOffset(i), this.catches, getCallSiteMethod());
    }
}
