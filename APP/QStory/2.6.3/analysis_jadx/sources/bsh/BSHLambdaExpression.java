package bsh;

import com.kongzue.dialogx.util.C3763;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHLambdaExpression extends SimpleNode {
    private InterfaceC2619 body;
    private boolean initializedValues;
    private Modifiers[] paramsModifiers;
    private String[] paramsNames;
    private Class<?>[] paramsTypes;
    String singleParamName;

    public BSHLambdaExpression(int i) {
        super(i);
        this.initializedValues = false;
    }

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

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) {
        initValues(callStack, interpreter);
        NameSpace pVar = callStack.top();
        Modifiers[] modifiersArr = this.paramsModifiers;
        Class<?>[] clsArr = this.paramsTypes;
        String[] strArr = this.paramsNames;
        InterfaceC2619 interfaceC2619 = this.body;
        C3763 c3763 = AbstractC2651.f7934;
        return new C2658(this, pVar, modifiersArr, clsArr, strArr, interfaceC2619);
    }
}
