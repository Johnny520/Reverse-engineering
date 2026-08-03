package bsh;

import bsh.BshClassManager;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHFormalParameters extends SimpleNode implements BshClassManager.Listener {
    private static final long serialVersionUID = 1;
    boolean isVarArgs;
    private boolean listener;
    int numArgs;
    private Modifiers[] paramModifiers;
    private String[] paramNames;
    Class<?>[] paramTypes;
    String[] typeDescriptors;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHFormalParameters(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.BshClassManager.Listener
    public void classLoaderChanged() {
        this.paramTypes = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: eval(Lbsh/CallStack;Lbsh/Interpreter;)Ljava/lang/Object; */
    @Override // bsh.SimpleNode, bsh.Node
    public Class<?>[] eval(CallStack callStack, Interpreter interpreter) {
        Class<?>[] clsArr = this.paramTypes;
        if (clsArr != null) {
            return clsArr;
        }
        insureParsed();
        Class<?>[] clsArr2 = new Class[this.numArgs];
        for (int i9 = 0; i9 < this.numArgs; i9++) {
            clsArr2[i9] = (Class) ((BSHFormalParameter) jjtGetChild(i9)).eval(callStack, interpreter);
        }
        this.paramTypes = clsArr2;
        return clsArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Modifiers[] getParamModifiers() {
        insureParsed();
        return this.paramModifiers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String[] getParamNames() {
        insureParsed();
        return this.paramNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String[] getTypeDescriptors(CallStack callStack, Interpreter interpreter, String str) {
        String[] strArr = this.typeDescriptors;
        if (strArr != null) {
            return strArr;
        }
        insureParsed();
        String[] strArr2 = new String[this.numArgs];
        for (int i9 = 0; i9 < this.numArgs; i9++) {
            strArr2[i9] = ((BSHFormalParameter) jjtGetChild(i9)).getTypeDescriptor(callStack, interpreter, str);
        }
        this.typeDescriptors = strArr2;
        return strArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void insureParsed() {
        if (this.paramNames != null) {
            return;
        }
        int iJjtGetNumChildren = jjtGetNumChildren();
        this.numArgs = iJjtGetNumChildren;
        String[] strArr = new String[iJjtGetNumChildren];
        Modifiers[] modifiersArr = new Modifiers[iJjtGetNumChildren];
        for (int i9 = 0; i9 < this.numArgs; i9++) {
            BSHFormalParameter bSHFormalParameter = (BSHFormalParameter) jjtGetChild(i9);
            this.isVarArgs = bSHFormalParameter.isVarArgs;
            strArr[i9] = bSHFormalParameter.name;
            Modifiers modifiers = new Modifiers(4);
            modifiersArr[i9] = modifiers;
            if (bSHFormalParameter.isFinal) {
                modifiers.addModifier("final");
            }
        }
        this.paramNames = strArr;
        this.paramModifiers = modifiersArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isListener() {
        return this.listener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setListener(boolean z9) {
        this.listener = z9;
    }
}
