package bsh;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3491 extends AbstractC3484 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final NameSpace f8295;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Class[] f8296;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Modifiers[] f8297;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String[] f8298;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC3452 f8299;

    public C3491(InterfaceC3452 interfaceC3452, NameSpace nameSpace, Modifiers[] modifiersArr, Class[] clsArr, String[] strArr, InterfaceC3452 interfaceC34522) {
        super(interfaceC3452);
        this.f8295 = nameSpace != null ? nameSpace.toLambdaNameSpace() : null;
        this.f8297 = modifiersArr;
        this.f8296 = clsArr;
        this.f8298 = strArr;
        this.f8299 = interfaceC34522;
        if (modifiersArr.length == clsArr.length && clsArr.length == strArr.length) {
            return;
        }
        C6755.m11869("The length of 'paramsModifiers', 'paramsTypes' and 'paramsNames' can't be different!");
        throw null;
    }

    @Override // bsh.AbstractC3484
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo5915(Method method, int i) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Class[] clsArr = this.f8296;
        if (clsArr.length != genericParameterTypes.length) {
            return false;
        }
        return AbstractC3495.m5942(clsArr, genericParameterTypes, i);
    }

    @Override // bsh.AbstractC3484
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo5916(Object[] objArr) throws UtilEvalError {
        int length = objArr.length;
        Class<?>[] clsArr = this.f8296;
        if (length != clsArr.length) {
            throw new UtilEvalError("Wrong number of arguments!");
        }
        NameSpace nameSpace = new NameSpace(this.f8295, "LambdaExpression");
        int i = 0;
        while (true) {
            String[] strArr = this.f8298;
            if (i >= strArr.length) {
                break;
            }
            Class<?> cls = clsArr[i];
            if (cls != null) {
                nameSpace.setTypedVariable(strArr[i], cls, objArr[i], this.f8297[i]);
            } else {
                nameSpace.setVariable(strArr[i], objArr[i], false);
            }
            i++;
        }
        CallStack callStack = new CallStack(nameSpace);
        Interpreter interpreter = new Interpreter(nameSpace);
        InterfaceC3452 interfaceC3452 = this.f8299;
        if (!(interfaceC3452 instanceof BSHBlock)) {
            return interfaceC3452.eval(callStack, interpreter);
        }
        Object objEval = interfaceC3452.eval(callStack, interpreter);
        if (!(objEval instanceof C3501)) {
            return null;
        }
        C3501 c3501 = (C3501) objEval;
        if (c3501.f8351 == 47) {
            return c3501.f8350;
        }
        return null;
    }
}
