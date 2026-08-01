package bsh;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2658 extends AbstractC2651 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final NameSpace f7950;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Class[] f7951;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Modifiers[] f7952;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String[] f7953;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC2619 f7954;

    public C2658(InterfaceC2619 interfaceC2619, NameSpace nameSpace, Modifiers[] modifiersArr, Class[] clsArr, String[] strArr, InterfaceC2619 interfaceC26192) {
        super(interfaceC2619);
        this.f7950 = nameSpace != null ? nameSpace.toLambdaNameSpace() : null;
        this.f7952 = modifiersArr;
        this.f7951 = clsArr;
        this.f7953 = strArr;
        this.f7954 = interfaceC26192;
        if (modifiersArr.length == clsArr.length && clsArr.length == strArr.length) {
            return;
        }
        C5925.m11310("The length of 'paramsModifiers', 'paramsTypes' and 'paramsNames' can't be different!");
        throw null;
    }

    @Override // bsh.AbstractC2651
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo5355(Method method, int i) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Class[] clsArr = this.f7951;
        if (clsArr.length != genericParameterTypes.length) {
            return false;
        }
        return AbstractC2662.m5382(clsArr, genericParameterTypes, i);
    }

    @Override // bsh.AbstractC2651
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo5356(Object[] objArr) throws UtilEvalError {
        int length = objArr.length;
        Class<?>[] clsArr = this.f7951;
        if (length != clsArr.length) {
            throw new UtilEvalError("Wrong number of arguments!");
        }
        NameSpace nameSpace = new NameSpace(this.f7950, "LambdaExpression");
        int i = 0;
        while (true) {
            String[] strArr = this.f7953;
            if (i >= strArr.length) {
                break;
            }
            Class<?> cls = clsArr[i];
            if (cls != null) {
                nameSpace.setTypedVariable(strArr[i], cls, objArr[i], this.f7952[i]);
            } else {
                nameSpace.setVariable(strArr[i], objArr[i], false);
            }
            i++;
        }
        CallStack callStack = new CallStack(nameSpace);
        Interpreter interpreter = new Interpreter(nameSpace);
        InterfaceC2619 interfaceC2619 = this.f7954;
        if (!(interfaceC2619 instanceof BSHBlock)) {
            return interfaceC2619.eval(callStack, interpreter);
        }
        Object objEval = interfaceC2619.eval(callStack, interpreter);
        if (!(objEval instanceof C2668)) {
            return null;
        }
        C2668 c2668 = (C2668) objEval;
        if (c2668.f8006 == 47) {
            return c2668.f8005;
        }
        return null;
    }
}
