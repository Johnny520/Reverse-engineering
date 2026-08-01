package bsh;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHBlock extends SimpleNode {
    final int blockId;
    private boolean hasClassDeclaration;
    private boolean isFirst;
    public boolean isStatic;
    public boolean isSynchronized;

    public BSHBlock(int i) {
        super(i);
        this.isSynchronized = false;
        this.isStatic = false;
        this.hasClassDeclaration = false;
        this.isFirst = true;
        this.blockId = BlockNameSpace.blockCount.incrementAndGet();
    }

    public Object eval(CallStack callStack, Interpreter interpreter, Boolean bool) {
        Object objEvalBlock;
        if (!this.isSynchronized) {
            return evalBlock(callStack, interpreter, bool, null);
        }
        synchronized (jjtGetChild(0).eval(callStack, interpreter)) {
            objEvalBlock = evalBlock(callStack, interpreter, bool, null);
        }
        return objEvalBlock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [bsh.BSHBlock, bsh.SimpleNode] */
    public Object evalBlock(CallStack callStack, Interpreter interpreter, Boolean bool, InterfaceC3476 interfaceC3476) {
        Object objEval = Primitive.VOID;
        ArrayList arrayList = null;
        NameSpace nameSpaceSwap = bool == null ? callStack.swap(BlockNameSpace.getInstance(callStack.top(), this.blockId)) : !bool.booleanValue() ? callStack.swap(new BlockNameSpace(callStack.top(), this.blockId)) : null;
        ?? r2 = this.isSynchronized;
        int iJjtGetNumChildren = jjtGetNumChildren();
        try {
            if (this.isFirst || this.hasClassDeclaration) {
                for (?? r5 = r2; r5 < iJjtGetNumChildren; r5++) {
                    InterfaceC3452 interfaceC3452JjtGetChild = jjtGetChild(r5);
                    if ((interfaceC3476 == null || ((C3485) interfaceC3476).m5918(interfaceC3452JjtGetChild)) && (interfaceC3452JjtGetChild instanceof BSHClassDeclaration)) {
                        this.hasClassDeclaration = true;
                        interfaceC3452JjtGetChild.eval(callStack, interpreter);
                    }
                }
            }
            while (r2 < iJjtGetNumChildren) {
                InterfaceC3452 interfaceC3452JjtGetChild2 = jjtGetChild(r2);
                if (!(interfaceC3452JjtGetChild2 instanceof BSHClassDeclaration) && (interfaceC3476 == null || ((C3485) interfaceC3476).m5918(interfaceC3452JjtGetChild2))) {
                    if (!(interfaceC3452JjtGetChild2 instanceof BSHEnumConstant)) {
                        objEval = interfaceC3452JjtGetChild2.eval(callStack, interpreter);
                        if (objEval instanceof C3501) {
                            break;
                        }
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(interfaceC3452JjtGetChild2);
                    }
                }
                r2++;
            }
            if (arrayList != null) {
                while (!arrayList.isEmpty()) {
                    ((InterfaceC3452) arrayList.remove(0)).eval(callStack, interpreter);
                }
            }
            this.isFirst = false;
            if (nameSpaceSwap != null) {
                callStack.swap(nameSpaceSwap);
            }
            return objEval;
        } catch (Throwable th) {
            this.isFirst = false;
            if (nameSpaceSwap != null) {
                callStack.swap(nameSpaceSwap);
            }
            throw th;
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": static=" + this.isStatic + ", synchronized=" + this.isSynchronized;
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public Object eval(CallStack callStack, Interpreter interpreter) {
        return eval(callStack, interpreter, Boolean.FALSE);
    }
}
