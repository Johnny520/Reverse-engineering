package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHLambdaExpression extends SimpleNode {
    private static final long serialVersionUID = 1;
    private Node body;
    private boolean initializedValues;
    private Modifiers[] paramsModifiers;
    private String[] paramsNames;
    private Class<?>[] paramsTypes;
    String singleParamName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHLambdaExpression(int i9) {
        super(i9);
        this.initializedValues = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void initValues(CallStack callStack, Interpreter interpreter) {
        if (this.initializedValues) {
            return;
        }
        if (jjtGetNumChildren() == 2) {
            BSHFormalParameters bSHFormalParameters = (BSHFormalParameters) jjtGetChild(0);
            this.paramsTypes = bSHFormalParameters.eval(callStack, interpreter);
            this.paramsModifiers = bSHFormalParameters.getParamModifiers();
            this.paramsNames = bSHFormalParameters.getParamNames();
            this.body = jjtGetChild(1);
        } else {
            this.paramsTypes = new Class[]{null};
            this.paramsModifiers = new Modifiers[]{null};
            this.paramsNames = new String[]{this.singleParamName};
            this.body = jjtGetChild(0);
        }
        this.initializedValues = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) {
        initValues(callStack, interpreter);
        return BshLambda.fromLambdaExpression(this, callStack.top(), this.paramsModifiers, this.paramsTypes, this.paramsNames, this.body);
    }
}
