package bsh;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHTryStatement extends SimpleNode {
    final int blockId;
    BSHTryWithResources tryWithResources;

    public BSHTryStatement(int i) {
        super(i);
        this.tryWithResources = null;
        this.blockId = BlockNameSpace.blockCount.incrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024e A[PHI: r0
  0x024e: PHI (r0v55 java.lang.Object) = (r0v36 java.lang.Object), (r0v38 java.lang.Object) binds: [B:98:0x0187, B:197:0x024e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r22v0, types: [bsh.CallStack] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object eval(CallStack callStack, Interpreter interpreter) throws Throwable {
        int i;
        InterfaceC3452 interfaceC3452JjtGetChild;
        ?? target;
        ?? r10;
        Throwable target2;
        Object objEval;
        Class<?> cls;
        Object objEval2;
        Throwable th;
        Object obj;
        Class<?> cls2;
        int i2;
        if (jjtGetChild(0) instanceof BSHTryWithResources) {
            BSHTryWithResources bSHTryWithResources = (BSHTryWithResources) jjtGetChild(0);
            this.tryWithResources = bSHTryWithResources;
            bSHTryWithResources.eval(callStack, interpreter);
            i = 1;
        } else {
            i = 0;
        }
        int i3 = i + 1;
        BSHBlock bSHBlock = (BSHBlock) jjtGetChild(i);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iJjtGetNumChildren = jjtGetNumChildren();
        while (true) {
            if (i3 >= iJjtGetNumChildren) {
                interfaceC3452JjtGetChild = null;
                break;
            }
            int i4 = i3 + 1;
            interfaceC3452JjtGetChild = jjtGetChild(i3);
            if (!(interfaceC3452JjtGetChild instanceof BSHMultiCatch)) {
                break;
            }
            arrayList.add((BSHMultiCatch) interfaceC3452JjtGetChild);
            i3 += 2;
            arrayList2.add((BSHBlock) jjtGetChild(i4));
        }
        BSHBlock bSHBlock2 = interfaceC3452JjtGetChild != null ? (BSHBlock) interfaceC3452JjtGetChild : null;
        ?? Depth = callStack.depth();
        try {
            try {
                try {
                    Interpreter.debug("Evaluate try block");
                    try {
                        objEval = bSHBlock.eval(callStack, interpreter);
                        target2 = null;
                        while (target2 != null && (target2.getCause() instanceof TargetError)) {
                            target2 = ((TargetError) target2.getCause()).getTarget();
                        }
                        if (this.tryWithResources != null) {
                            Interpreter.debug("Try with resources: autoClose");
                            for (Throwable th2 : this.tryWithResources.autoClose()) {
                                if (target2 != null && target2 != th2) {
                                    target2.addSuppressed(th2);
                                }
                            }
                        }
                    } catch (OutOfMemoryError e) {
                        try {
                            try {
                                r10 = Depth;
                            } catch (EvalException e2) {
                                e = e2;
                                r10 = Depth;
                            } catch (TargetError e3) {
                                e = e3;
                                r10 = Depth;
                            }
                        } catch (EvalException e4) {
                            e = e4;
                            r10 = Depth;
                        } catch (TargetError e5) {
                            e = e5;
                            r10 = Depth;
                        }
                        try {
                            throw new TargetError(e.toString(), e, bSHBlock, callStack, false);
                        } catch (EvalException e6) {
                            e = e6;
                            target2 = e;
                            Interpreter.debug("EvalException from try block: ", target2);
                            while (callStack.depth() > r10) {
                                callStack.pop();
                            }
                            while (target2 != null && (target2.getCause() instanceof TargetError)) {
                                target2 = ((TargetError) target2.getCause()).getTarget();
                            }
                            if (this.tryWithResources != null) {
                                Interpreter.debug("Try with resources: autoClose");
                                for (Throwable th3 : this.tryWithResources.autoClose()) {
                                    if (target2 != null && target2 != th3) {
                                        target2.addSuppressed(th3);
                                    }
                                }
                            }
                            objEval = null;
                            if (target2 != null) {
                            }
                            if (bSHBlock2 != null) {
                            }
                            if (th == null) {
                            }
                        } catch (TargetError e7) {
                            e = e7;
                            Interpreter.debug("TargetError from try block: ", e);
                            target2 = e.getTarget();
                            while (callStack.depth() > r10) {
                                callStack.pop();
                            }
                            while (target2 != null && (target2.getCause() instanceof TargetError)) {
                                target2 = ((TargetError) target2.getCause()).getTarget();
                            }
                            if (this.tryWithResources != null) {
                                Interpreter.debug("Try with resources: autoClose");
                                for (Throwable th4 : this.tryWithResources.autoClose()) {
                                    if (target2 != null && target2 != th4) {
                                        target2.addSuppressed(th4);
                                    }
                                }
                            }
                            objEval = null;
                            if (target2 != null) {
                            }
                            if (bSHBlock2 != null) {
                            }
                            if (th == null) {
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    target = 0;
                    while (target != 0 && (target.getCause() instanceof TargetError)) {
                        target = ((TargetError) target.getCause()).getTarget();
                    }
                    if (this.tryWithResources != null) {
                        Interpreter.debug("Try with resources: autoClose");
                        for (Throwable th6 : this.tryWithResources.autoClose()) {
                            if (target != 0 && target != th6) {
                                target.addSuppressed(th6);
                            }
                        }
                    }
                    throw th;
                }
            } catch (EvalException e8) {
                e = e8;
                r10 = Depth;
            } catch (TargetError e9) {
                e = e9;
                r10 = Depth;
            }
            if (target2 != null) {
                try {
                    Interpreter.debug("Try catch thrown: ", target2);
                    Class<?> cls3 = target2.getClass();
                    int size = arrayList.size();
                    int i5 = 0;
                    while (i5 < size) {
                        BSHMultiCatch bSHMultiCatch = (BSHMultiCatch) arrayList.get(i5);
                        Modifiers modifiers = new Modifiers(4);
                        if (bSHMultiCatch.isFinal()) {
                            modifiers.addModifier("final");
                        }
                        bSHMultiCatch.eval(callStack, interpreter);
                        if (bSHMultiCatch.isUntyped() && interpreter.getStrictJava()) {
                            throw new EvalException("(Strict Java) Untyped catch block", this, callStack);
                        }
                        if (bSHMultiCatch.isUntyped()) {
                            cls = null;
                        } else {
                            Class<?>[] types = bSHMultiCatch.getTypes();
                            int length = types.length;
                            int i6 = 0;
                            boolean z = false;
                            while (true) {
                                if (i6 >= length) {
                                    obj = objEval;
                                    cls2 = cls3;
                                    i2 = size;
                                    cls = null;
                                    break;
                                }
                                obj = objEval;
                                cls = types[i6];
                                i2 = size;
                                boolean zM5945 = AbstractC3495.m5945(cls, cls3);
                                cls2 = cls3;
                                if (true == zM5945) {
                                    z = zM5945;
                                    break;
                                }
                                i6++;
                                z = zM5945;
                                objEval = obj;
                                size = i2;
                                cls3 = cls2;
                            }
                            if (!z) {
                                i5++;
                                objEval = obj;
                                size = i2;
                                cls3 = cls2;
                            }
                        }
                        BSHBlock bSHBlock3 = (BSHBlock) arrayList2.get(i5);
                        NameSpace pVar = callStack.top();
                        BlockNameSpace blockNameSpace = new BlockNameSpace(callStack.top(), this.blockId);
                        try {
                            Class<?> cls4 = BSHMultiCatch.UNTYPED;
                            String str = bSHMultiCatch.name;
                            if (cls == cls4) {
                                blockNameSpace.setBlockVariable(str, target2);
                            } else {
                                blockNameSpace.setTypedVariable(str, cls, target2, modifiers);
                            }
                            callStack.swap(blockNameSpace);
                            try {
                                objEval2 = bSHBlock3.eval(callStack, interpreter, Boolean.TRUE);
                                callStack.swap(pVar);
                                th = null;
                            } catch (Throwable th7) {
                                callStack.swap(pVar);
                                throw th7;
                            }
                        } catch (UtilEvalError unused) {
                            throw new InterpreterError("Unable to set var in catch block namespace.");
                        }
                    }
                    th = target2;
                    objEval2 = objEval;
                } catch (Throwable th8) {
                    if (bSHBlock2 != null) {
                        Object objEval3 = bSHBlock2.eval(callStack, interpreter);
                        if (objEval3 instanceof C3501) {
                            return objEval3;
                        }
                    }
                    throw th8;
                }
            } else {
                th = target2;
                objEval2 = objEval;
            }
            if (bSHBlock2 != null) {
                Object objEval4 = bSHBlock2.eval(callStack, interpreter);
                if (objEval4 instanceof C3501) {
                    return objEval4;
                }
            }
            if (th == null) {
                return objEval2 instanceof C3501 ? objEval2 : Primitive.VOID;
            }
            throw new TargetError(th, this, callStack);
        } catch (Throwable th9) {
            th = th9;
            target = Depth;
        }
    }
}
