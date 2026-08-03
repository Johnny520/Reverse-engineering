package bsh;

import java.lang.reflect.Array;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHMethodDeclaration extends SimpleNode {
    private static final long serialVersionUID = 1;
    BSHBlock blockNode;
    int firstThrowsClause;
    boolean isExtension;
    private boolean isScriptedObject;
    boolean isVarArgs;
    public Modifiers modifiers;
    public String name;
    int numThrows;
    BSHFormalParameters paramsNode;
    String receiverText;
    Class<?> receiverType;
    Class<?> returnType;
    BSHReturnType returnTypeNode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHMethodDeclaration(int i9) {
        super(i9);
        this.modifiers = new Modifiers(2);
        this.numThrows = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void evalNodes(CallStack callStack, Interpreter interpreter) throws EvalException {
        insureNodesParsed();
        for (int i9 = this.firstThrowsClause; i9 < this.numThrows + this.firstThrowsClause; i9++) {
            ((BSHAmbiguousName) jjtGetChild(i9)).toClass(callStack, interpreter);
        }
        this.paramsNode.eval(callStack, interpreter);
        if (!interpreter.getStrictJava()) {
            return;
        }
        int i10 = 0;
        while (true) {
            Class<?>[] clsArr = this.paramsNode.paramTypes;
            if (i10 >= clsArr.length) {
                if (this.returnType != null) {
                    return;
                }
                throw new EvalException("(Strict Java Mode) Undeclared return type for method: " + this.name, this, null);
            }
            if (clsArr[i10] == null) {
                throw new EvalException("(Strict Java Mode) Undeclared argument type, parameter: " + this.paramsNode.getParamNames()[i10] + " in method: " + this.name, this, null);
            }
            i10++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalException {
        this.returnType = evalReturnType(callStack, interpreter);
        this.receiverType = evalReceiverType(callStack, interpreter);
        evalNodes(callStack, interpreter);
        NameSpace pVar = callStack.top();
        BshMethod bshMethod = new BshMethod(this, pVar, this.modifiers, this.isScriptedObject);
        boolean z9 = pVar.isMethod;
        if (!z9 && !pVar.isClass) {
            interpreter.getClassManager().addListener(bshMethod);
        } else if (z9 && !this.paramsNode.isListener()) {
            interpreter.getClassManager().addListener(this.paramsNode);
            this.paramsNode.setListener(true);
        }
        pVar.setMethod(bshMethod);
        return Primitive.VOID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093 A[Catch: UtilEvalError -> 0x0022, TryCatch #0 {UtilEvalError -> 0x0022, blocks: (B:7:0x000d, B:9:0x0015, B:12:0x0025, B:13:0x0029, B:39:0x0085, B:44:0x0093, B:46:0x009e, B:47:0x00b4, B:15:0x002d, B:17:0x0035, B:18:0x0038, B:20:0x0040, B:21:0x0043, B:23:0x004b, B:24:0x004e, B:26:0x0056, B:27:0x0059, B:29:0x0061, B:30:0x0064, B:32:0x006c, B:33:0x006f, B:35:0x0077, B:36:0x007a, B:38:0x0082), top: B:52:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Class<?> evalReceiverType(CallStack callStack, Interpreter interpreter) throws EvalError {
        String strSubstring;
        Class<?> cls;
        insureNodesParsed();
        if (!this.isExtension || (strSubstring = this.receiverText) == null) {
            return null;
        }
        int i9 = 0;
        while (strSubstring.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            try {
                i9++;
                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
            } catch (UtilEvalError e6) {
                throw e6.toEvalError(this, callStack);
            }
        }
        switch (strSubstring.hashCode()) {
            case -1325958191:
                if (strSubstring.equals("double")) {
                    cls = Double.TYPE;
                }
                return i9 == 0 ? cls : Array.newInstance(cls, new int[i9]).getClass();
            case 104431:
                if (strSubstring.equals("int")) {
                    cls = Integer.TYPE;
                }
                if (i9 == 0) {
                }
                break;
            case 3039496:
                if (strSubstring.equals("byte")) {
                    cls = Byte.TYPE;
                }
                if (i9 == 0) {
                }
                break;
            case 3052374:
                if (strSubstring.equals("char")) {
                    cls = Character.TYPE;
                }
                if (i9 == 0) {
                }
                break;
            case 3327612:
                if (strSubstring.equals("long")) {
                    cls = Long.TYPE;
                }
                if (i9 == 0) {
                }
                break;
            case 64711720:
                if (strSubstring.equals("boolean")) {
                    cls = Boolean.TYPE;
                }
                if (i9 == 0) {
                }
                break;
            case 97526364:
                if (strSubstring.equals("float")) {
                    cls = Float.TYPE;
                }
                if (i9 == 0) {
                }
                break;
            case 109413500:
                if (strSubstring.equals("short")) {
                    cls = Short.TYPE;
                }
                if (i9 == 0) {
                }
                break;
        }
        Class<?> cls2 = callStack.top().getClass(strSubstring);
        if (cls2 == null) {
            throw new UtilEvalError("Extension receiver type not found: " + strSubstring);
        }
        cls = cls2;
        if (i9 == 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> evalReturnType(CallStack callStack, Interpreter interpreter) {
        insureNodesParsed();
        BSHReturnType bSHReturnType = this.returnTypeNode;
        if (bSHReturnType != null) {
            return bSHReturnType.evalReturnType(callStack, interpreter);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getReturnTypeDescriptor(CallStack callStack, Interpreter interpreter, String str) {
        insureNodesParsed();
        BSHReturnType bSHReturnType = this.returnTypeNode;
        if (bSHReturnType == null) {
            return null;
        }
        return bSHReturnType.getTypeDescriptor(callStack, interpreter, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHReturnType getReturnTypeNode() {
        insureNodesParsed();
        return this.returnTypeNode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized void insureNodesParsed() {
        int i9;
        try {
            if (this.paramsNode != null) {
                return;
            }
            Node nodeJjtGetChild = jjtGetChild(0);
            if (nodeJjtGetChild instanceof BSHReturnType) {
                this.returnTypeNode = (BSHReturnType) nodeJjtGetChild;
                nodeJjtGetChild = jjtGetChild(1);
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (nodeJjtGetChild instanceof BSHAmbiguousName) {
                String str = ((BSHAmbiguousName) nodeJjtGetChild).text;
                int iLastIndexOf = str.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    this.isExtension = true;
                    this.receiverText = str.substring(0, iLastIndexOf);
                    this.name = str.substring(iLastIndexOf + 1);
                } else {
                    this.isExtension = false;
                    this.receiverText = null;
                    this.name = str;
                }
                i9++;
            }
            this.paramsNode = (BSHFormalParameters) jjtGetChild(i9);
            int i10 = i9 + 1;
            this.firstThrowsClause = i10;
            int iJjtGetNumChildren = jjtGetNumChildren();
            int i11 = this.numThrows;
            if (iJjtGetNumChildren > i10 + i11) {
                this.blockNode = (BSHBlock) jjtGetChild(i10 + i11);
            }
            BSHBlock bSHBlock = this.blockNode;
            if (bSHBlock != null && bSHBlock.jjtGetNumChildren() > 0) {
                BSHBlock bSHBlock2 = this.blockNode;
                Node nodeJjtGetChild2 = bSHBlock2.jjtGetChild(bSHBlock2.jjtGetNumChildren() - 1);
                if (nodeJjtGetChild2 instanceof BSHReturnStatement) {
                    while (nodeJjtGetChild2.hasNext()) {
                        nodeJjtGetChild2 = nodeJjtGetChild2.next();
                        if (nodeJjtGetChild2 instanceof BSHAmbiguousName) {
                            this.isScriptedObject = ((BSHAmbiguousName) nodeJjtGetChild2).text.startsWith("this");
                        }
                    }
                }
            }
            this.paramsNode.insureParsed();
            this.isVarArgs = this.paramsNode.isVarArgs;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.name;
    }
}
