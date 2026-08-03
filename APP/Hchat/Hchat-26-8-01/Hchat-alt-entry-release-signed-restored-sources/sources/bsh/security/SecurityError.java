package bsh.security;

import bsh.CallStack;
import bsh.EvalError;
import bsh.Node;
import bsh.Reflect;
import bsh.UtilEvalError;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class SecurityError extends UtilEvalError {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SecurityError(String str) {
        super(AbstractC4855en.m9263g("SecurityError: ", str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String argsTypesString(Object[] objArr) {
        String[] strArr = new String[objArr.length];
        for (int i9 = 0; i9 < objArr.length; i9++) {
            Class<?> type = Reflect.getType(objArr[i9]);
            strArr[i9] = type != null ? type.getTypeName() : "null";
        }
        return String.join(", ", strArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError cantConstruct(Class<?> cls, Object[] objArr) {
        return new SecurityError(AbstractC0255e.m1022k("Can't call this construct: new ", cls.getName(), "(", argsTypesString(objArr), ")"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError cantExtends(Class<?> cls) {
        return new SecurityError("Can't extend this class: ".concat(cls.getName()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError cantGetField(Object obj, String str) {
        return new SecurityError(AbstractC0255e.m1021j("Can't get this field: ", obj.getClass().getTypeName(), ".", str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError cantGetStaticField(Class<?> cls, String str) {
        return new SecurityError(AbstractC0255e.m1021j("Can't get this static field: ", cls.getTypeName(), ".", str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError cantImplements(Class<?> cls) {
        return new SecurityError("Can't implement this interface: ".concat(cls.getName()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError cantInvokeLocalMethod(String str, Object[] objArr) {
        return new SecurityError(AbstractC0255e.m1022k("Can't invoke this local method: ", str, "(", argsTypesString(objArr), ")"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError cantInvokeMethod(Object obj, String str, Object[] objArr) {
        String typeName = obj.getClass().getTypeName();
        return new SecurityError(AbstractC0921a.m2255r(AbstractC0255e.m1027p("Can't invoke this method: ", typeName, ".", str, "("), argsTypesString(objArr), ")"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError cantInvokeStaticMethod(Class<?> cls, String str, Object[] objArr) {
        String typeName = cls.getTypeName();
        return new SecurityError(AbstractC0921a.m2255r(AbstractC0255e.m1027p("Can't invoke this static method: ", typeName, ".", str, "("), argsTypesString(objArr), ")"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError cantSetField(Object obj, String str, Object obj2) {
        String typeName = obj.getClass().getTypeName();
        return new SecurityError(AbstractC0921a.m2255r(AbstractC0255e.m1027p("Can't set this field: ", typeName, ".", str, " ("), argsTypesString(new Object[]{obj2}), ")"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError cantSetStaticField(Class<?> cls, String str, Object obj) {
        String typeName = cls.getTypeName();
        return new SecurityError(AbstractC0921a.m2255r(AbstractC0255e.m1027p("Can't set this static field: ", typeName, ".", str, " ("), argsTypesString(new Object[]{obj}), ")"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError reflectCantConstruct(Class<?> cls, Object[] objArr) {
        return new SecurityError(AbstractC0255e.m1022k("Can't call this construct using reflection: new ", cls.getName(), "(", argsTypesString(objArr), ")"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError reflectCantGetField(Object obj, String str) {
        return new SecurityError(AbstractC0255e.m1021j("Can't get this field using reflection: ", obj.getClass().getTypeName(), ".", str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError reflectCantGetStaticField(Class<?> cls, String str) {
        return new SecurityError(AbstractC0255e.m1021j("Can't get this static field using reflection: ", cls.getTypeName(), ".", str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError reflectCantInvokeMethod(Object obj, String str, Object[] objArr) {
        String typeName = obj.getClass().getTypeName();
        return new SecurityError(AbstractC0921a.m2255r(AbstractC0255e.m1027p("Can't invoke this method using reflection: ", typeName, ".", str, "("), argsTypesString(objArr), ")"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError reflectCantInvokeStaticMethod(Class<?> cls, String str, Object[] objArr) {
        String typeName = cls.getTypeName();
        return new SecurityError(AbstractC0921a.m2255r(AbstractC0255e.m1027p("Can't invoke this static method using reflection: ", typeName, ".", str, "("), argsTypesString(objArr), ")"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError reflectCantSetField(Object obj, String str, Object obj2) {
        String typeName = obj.getClass().getTypeName();
        return new SecurityError(AbstractC0921a.m2255r(AbstractC0255e.m1027p("Can't set this field using reflection: ", typeName, ".", str, " ("), argsTypesString(new Object[]{obj2}), ")"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SecurityError reflectCantSetStaticField(Class<?> cls, String str, Object obj) {
        String typeName = cls.getTypeName();
        return new SecurityError(AbstractC0921a.m2255r(AbstractC0255e.m1027p("Can't set this static field using reflection: ", typeName, ".", str, " ("), argsTypesString(new Object[]{obj}), ")"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.UtilEvalError
    public EvalError toEvalError(String str, Node node, CallStack callStack) {
        return new EvalError(getMessage(), node, callStack);
    }

    @Override // bsh.UtilEvalError
    public EvalError toEvalError(Node node, CallStack callStack) {
        return new EvalError(getMessage(), node, callStack);
    }
}
