package bsh.security;

import androidx.activity.AbstractC0053;
import bsh.AbstractC2661;
import bsh.AbstractC2666;
import bsh.CallStack;
import bsh.EvalError;
import bsh.InterfaceC2618;
import bsh.UtilEvalError;
import p007.AbstractC6136;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class SecurityError extends UtilEvalError {
    public SecurityError(String str) {
        super(AbstractC0053.m152("SecurityError: ", str));
    }

    private static String argsTypesString(Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            Object[] objArr2 = AbstractC2666.f8000;
            Class clsM5350 = AbstractC2661.m5350(obj, false);
            strArr[i] = clsM5350 != null ? clsM5350.getTypeName() : "null";
        }
        return String.join(", ", strArr);
    }

    public static SecurityError cantConstruct(Class<?> cls, Object[] objArr) {
        return new SecurityError("Can't call this construct: new " + cls.getName() + "(" + argsTypesString(objArr) + ")");
    }

    public static SecurityError cantExtends(Class<?> cls) {
        return new SecurityError("Can't extend this class: ".concat(cls.getName()));
    }

    public static SecurityError cantGetField(Object obj, String str) {
        return new SecurityError(AbstractC6136.m11548("Can't get this field: ", obj.getClass().getTypeName(), ".", str));
    }

    public static SecurityError cantGetStaticField(Class<?> cls, String str) {
        return new SecurityError(AbstractC6136.m11548("Can't get this static field: ", cls.getTypeName(), ".", str));
    }

    public static SecurityError cantImplements(Class<?> cls) {
        return new SecurityError("Can't implement this interface: ".concat(cls.getName()));
    }

    public static SecurityError cantInvokeLocalMethod(String str, Object[] objArr) {
        return new SecurityError("Can't invoke this local method: " + str + "(" + argsTypesString(objArr) + ")");
    }

    public static SecurityError cantInvokeMethod(Object obj, String str, Object[] objArr) {
        String typeName = obj.getClass().getTypeName();
        return new SecurityError(AbstractC0053.m146(AbstractC6136.m11551("Can't invoke this method: ", typeName, ".", str, "("), argsTypesString(objArr), ")"));
    }

    public static SecurityError cantInvokeStaticMethod(Class<?> cls, String str, Object[] objArr) {
        String typeName = cls.getTypeName();
        return new SecurityError(AbstractC0053.m146(AbstractC6136.m11551("Can't invoke this static method: ", typeName, ".", str, "("), argsTypesString(objArr), ")"));
    }

    public static SecurityError cantSetField(Object obj, String str, Object obj2) {
        String typeName = obj.getClass().getTypeName();
        return new SecurityError(AbstractC0053.m146(AbstractC6136.m11551("Can't set this field: ", typeName, ".", str, " ("), argsTypesString(new Object[]{obj2}), ")"));
    }

    public static SecurityError cantSetStaticField(Class<?> cls, String str, Object obj) {
        String typeName = cls.getTypeName();
        return new SecurityError(AbstractC0053.m146(AbstractC6136.m11551("Can't set this static field: ", typeName, ".", str, " ("), argsTypesString(new Object[]{obj}), ")"));
    }

    public static SecurityError reflectCantConstruct(Class<?> cls, Object[] objArr) {
        return new SecurityError("Can't call this construct using reflection: new " + cls.getName() + "(" + argsTypesString(objArr) + ")");
    }

    public static SecurityError reflectCantGetField(Object obj, String str) {
        return new SecurityError(AbstractC6136.m11548("Can't get this field using reflection: ", obj.getClass().getTypeName(), ".", str));
    }

    public static SecurityError reflectCantGetStaticField(Class<?> cls, String str) {
        return new SecurityError(AbstractC6136.m11548("Can't get this static field using reflection: ", cls.getTypeName(), ".", str));
    }

    public static SecurityError reflectCantInvokeMethod(Object obj, String str, Object[] objArr) {
        String typeName = obj.getClass().getTypeName();
        return new SecurityError(AbstractC0053.m146(AbstractC6136.m11551("Can't invoke this method using reflection: ", typeName, ".", str, "("), argsTypesString(objArr), ")"));
    }

    public static SecurityError reflectCantInvokeStaticMethod(Class<?> cls, String str, Object[] objArr) {
        String typeName = cls.getTypeName();
        return new SecurityError(AbstractC0053.m146(AbstractC6136.m11551("Can't invoke this static method using reflection: ", typeName, ".", str, "("), argsTypesString(objArr), ")"));
    }

    public static SecurityError reflectCantSetField(Object obj, String str, Object obj2) {
        String typeName = obj.getClass().getTypeName();
        return new SecurityError(AbstractC0053.m146(AbstractC6136.m11551("Can't set this field using reflection: ", typeName, ".", str, " ("), argsTypesString(new Object[]{obj2}), ")"));
    }

    public static SecurityError reflectCantSetStaticField(Class<?> cls, String str, Object obj) {
        String typeName = cls.getTypeName();
        return new SecurityError(AbstractC0053.m146(AbstractC6136.m11551("Can't set this static field using reflection: ", typeName, ".", str, " ("), argsTypesString(new Object[]{obj}), ")"));
    }

    @Override // bsh.UtilEvalError
    public EvalError toEvalError(String str, InterfaceC2618 interfaceC2618, CallStack callStack) {
        return new EvalError(getMessage(), interfaceC2618, callStack);
    }

    @Override // bsh.UtilEvalError
    public EvalError toEvalError(InterfaceC2618 interfaceC2618, CallStack callStack) {
        return new EvalError(getMessage(), interfaceC2618, callStack);
    }
}
