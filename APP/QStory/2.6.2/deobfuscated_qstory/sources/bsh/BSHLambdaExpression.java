package bsh;

import com.kongzue.dialogx.util.C3762;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHLambdaExpression extends SimpleNode {
    private InterfaceC2618 body;
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

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) {
        initValues(callStack, interpreter);
        NameSpace pVar = callStack.top();
        Modifiers[] modifiersArr = this.paramsModifiers;
        Class<?>[] clsArr = this.paramsTypes;
        String[] strArr = this.paramsNames;
        InterfaceC2618 interfaceC2618 = this.body;
        C3762 c3762 = AbstractC2650.f7932;
        return new C2657(this, pVar, modifiersArr, clsArr, strArr, interfaceC2618);
    }
}
