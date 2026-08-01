package bsh;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2657 extends AbstractC2650 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final NameSpace f7948;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Class[] f7949;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Modifiers[] f7950;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String[] f7951;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC2618 f7952;

    public C2657(InterfaceC2618 interfaceC2618, NameSpace nameSpace, Modifiers[] modifiersArr, Class[] clsArr, String[] strArr, InterfaceC2618 interfaceC26182) {
        super(interfaceC2618);
        this.f7948 = nameSpace != null ? nameSpace.toLambdaNameSpace() : null;
        this.f7950 = modifiersArr;
        this.f7949 = clsArr;
        this.f7951 = strArr;
        this.f7952 = interfaceC26182;
        if (modifiersArr.length == clsArr.length && clsArr.length == strArr.length) {
            return;
        }
        C5919.m11249("The length of 'paramsModifiers', 'paramsTypes' and 'paramsNames' can't be different!");
        throw null;
    }

    @Override // bsh.AbstractC2650
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo5310(Method method, int i) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Class[] clsArr = this.f7949;
        if (clsArr.length != genericParameterTypes.length) {
            return false;
        }
        return AbstractC2661.m5337(clsArr, genericParameterTypes, i);
    }

    @Override // bsh.AbstractC2650
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo5311(Object[] objArr) throws UtilEvalError {
        int length = objArr.length;
        Class<?>[] clsArr = this.f7949;
        if (length != clsArr.length) {
            throw new UtilEvalError("Wrong number of arguments!");
        }
        NameSpace nameSpace = new NameSpace(this.f7948, "LambdaExpression");
        int i = 0;
        while (true) {
            String[] strArr = this.f7951;
            if (i >= strArr.length) {
                break;
            }
            Class<?> cls = clsArr[i];
            if (cls != null) {
                nameSpace.setTypedVariable(strArr[i], cls, objArr[i], this.f7950[i]);
            } else {
                nameSpace.setVariable(strArr[i], objArr[i], false);
            }
            i++;
        }
        CallStack callStack = new CallStack(nameSpace);
        Interpreter interpreter = new Interpreter(nameSpace);
        InterfaceC2618 interfaceC2618 = this.f7952;
        if (!(interfaceC2618 instanceof BSHBlock)) {
            return interfaceC2618.eval(callStack, interpreter);
        }
        Object objEval = interfaceC2618.eval(callStack, interpreter);
        if (!(objEval instanceof C2667)) {
            return null;
        }
        C2667 c2667 = (C2667) objEval;
        if (c2667.f8004 == 47) {
            return c2667.f8003;
        }
        return null;
    }
}
