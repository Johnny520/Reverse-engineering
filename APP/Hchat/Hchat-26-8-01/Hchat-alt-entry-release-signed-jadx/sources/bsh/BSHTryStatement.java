package bsh;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHTryStatement extends SimpleNode {
    private static final long serialVersionUID = 1;
    final int blockId;
    BSHTryWithResources tryWithResources;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHTryStatement(int i9) {
        super(i9);
        this.tryWithResources = null;
        this.blockId = BlockNameSpace.blockCount.incrementAndGet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:225:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x00ca */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x00cc */
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
    @Override // bsh.SimpleNode, bsh.Node
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object eval(CallStack callStack, Interpreter interpreter) throws Throwable {
        int i9;
        Node nodeJjtGetChild;
        ?? target;
        ?? r10;
        Throwable target2;
        Object objEval;
        Class<?> cls;
        Object objEval2;
        Throwable th2;
        Object obj;
        Class<?> cls2;
        int i10;
        if (jjtGetChild(0) instanceof BSHTryWithResources) {
            BSHTryWithResources bSHTryWithResources = (BSHTryWithResources) jjtGetChild(0);
            this.tryWithResources = bSHTryWithResources;
            bSHTryWithResources.eval(callStack, interpreter);
            i9 = 1;
        } else {
            i9 = 0;
        }
        int i11 = i9 + 1;
        BSHBlock bSHBlock = (BSHBlock) jjtGetChild(i9);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iJjtGetNumChildren = jjtGetNumChildren();
        while (true) {
            if (i11 >= iJjtGetNumChildren) {
                nodeJjtGetChild = null;
                break;
            }
            int i12 = i11 + 1;
            nodeJjtGetChild = jjtGetChild(i11);
            if (!(nodeJjtGetChild instanceof BSHMultiCatch)) {
                break;
            }
            arrayList.add((BSHMultiCatch) nodeJjtGetChild);
            i11 += 2;
            arrayList2.add((BSHBlock) jjtGetChild(i12));
        }
        BSHBlock bSHBlock2 = nodeJjtGetChild != null ? (BSHBlock) nodeJjtGetChild : null;
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
                            for (Throwable th3 : this.tryWithResources.autoClose()) {
                                if (target2 != null && target2 != th3) {
                                    target2.addSuppressed(th3);
                                }
                            }
                        }
                    } catch (OutOfMemoryError e6) {
                        try {
                            try {
                                r10 = Depth;
                            } catch (EvalException e7) {
                                e = e7;
                                r10 = Depth;
                            } catch (TargetError e10) {
                                e = e10;
                                r10 = Depth;
                            }
                        } catch (EvalException e11) {
                            e = e11;
                            r10 = Depth;
                        } catch (TargetError e12) {
                            e = e12;
                            r10 = Depth;
                        }
                        try {
                            throw new TargetError(e6.toString(), e6, bSHBlock, callStack, false);
                        } catch (EvalException e13) {
                            e = e13;
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
                            if (th2 == null) {
                            }
                        } catch (TargetError e14) {
                            e = e14;
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
                                for (Throwable th5 : this.tryWithResources.autoClose()) {
                                    if (target2 != null && target2 != th5) {
                                        target2.addSuppressed(th5);
                                    }
                                }
                            }
                            objEval = null;
                            if (target2 != null) {
                            }
                            if (bSHBlock2 != null) {
                            }
                            if (th2 == null) {
                            }
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    target = 0;
                    while (target != 0 && (target.getCause() instanceof TargetError)) {
                        target = ((TargetError) target.getCause()).getTarget();
                    }
                    if (this.tryWithResources != null) {
                        Interpreter.debug("Try with resources: autoClose");
                        for (Throwable th7 : this.tryWithResources.autoClose()) {
                            if (target != 0 && target != th7) {
                                target.addSuppressed(th7);
                            }
                        }
                    }
                    throw th;
                }
            } catch (EvalException e15) {
                e = e15;
                r10 = Depth;
            } catch (TargetError e16) {
                e = e16;
                r10 = Depth;
            }
            if (target2 != null) {
                try {
                    Interpreter.debug("Try catch thrown: ", target2);
                    Class<?> cls3 = target2.getClass();
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        BSHMultiCatch bSHMultiCatch = (BSHMultiCatch) arrayList.get(i13);
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
                            int i14 = 0;
                            boolean z9 = false;
                            while (true) {
                                if (i14 >= length) {
                                    obj = objEval;
                                    cls2 = cls3;
                                    i10 = size;
                                    cls = null;
                                    break;
                                }
                                obj = objEval;
                                cls = types[i14];
                                i10 = size;
                                boolean zIsBshAssignable = Types.isBshAssignable(cls, cls3);
                                cls2 = cls3;
                                if (true == zIsBshAssignable) {
                                    z9 = zIsBshAssignable;
                                    break;
                                }
                                i14++;
                                z9 = zIsBshAssignable;
                                objEval = obj;
                                size = i10;
                                cls3 = cls2;
                            }
                            if (!z9) {
                                i13++;
                                objEval = obj;
                                size = i10;
                                cls3 = cls2;
                            }
                        }
                        BSHBlock bSHBlock3 = (BSHBlock) arrayList2.get(i13);
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
                                th2 = null;
                            } catch (Throwable th8) {
                                callStack.swap(pVar);
                                throw th8;
                            }
                        } catch (UtilEvalError unused) {
                            throw new InterpreterError("Unable to set var in catch block namespace.");
                        }
                    }
                    th2 = target2;
                    objEval2 = objEval;
                } catch (Throwable th9) {
                    if (bSHBlock2 != null) {
                        Object objEval3 = bSHBlock2.eval(callStack, interpreter);
                        if (objEval3 instanceof ReturnControl) {
                            return objEval3;
                        }
                    }
                    throw th9;
                }
            } else {
                th2 = target2;
                objEval2 = objEval;
            }
            if (bSHBlock2 != null) {
                Object objEval4 = bSHBlock2.eval(callStack, interpreter);
                if (objEval4 instanceof ReturnControl) {
                    return objEval4;
                }
            }
            if (th2 == null) {
                return objEval2 instanceof ReturnControl ? objEval2 : Primitive.VOID;
            }
            throw new TargetError(th2, this, callStack);
        } catch (Throwable th10) {
            th = th10;
            target = Depth;
        }
    }
}
