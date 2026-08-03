package bsh;

import bsh.ClassGenerator;
import bsh.security.SecurityError;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CompletionException;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHAllocationExpression extends SimpleNode {
    private static int innerClassCount = 0;
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHAllocationExpression(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object arrayAllocation(BSHArrayDimensions bSHArrayDimensions, Class<?> cls, CallStack callStack, Interpreter interpreter) {
        Object objEval = bSHArrayDimensions.eval(cls, callStack, interpreter);
        return objEval != Primitive.VOID ? objEval : arrayNewInstance(cls, bSHArrayDimensions, callStack, interpreter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object arrayNewInstance(Class<?> cls, BSHArrayDimensions bSHArrayDimensions, CallStack callStack, Interpreter interpreter) throws TargetError, EvalException {
        int i9 = bSHArrayDimensions.numUndefinedDims;
        if (i9 > 0) {
            cls = Array.newInstance(cls, new int[i9]).getClass();
        }
        try {
            return Array.newInstance(cls, bSHArrayDimensions.definedDimensions);
        } catch (NegativeArraySizeException e6) {
            throw new TargetError(e6, this, callStack);
        } catch (Exception e7) {
            throw new EvalException("Can't construct primitive array: " + e7.getMessage(), this, callStack, e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object constructObject(Class<?> cls, Object[] objArr, CallStack callStack, Interpreter interpreter) throws Throwable {
        Throwable th2;
        boolean zIsGeneratedClass = Reflect.isGeneratedClass(cls);
        if (zIsGeneratedClass) {
            This.registerConstructorContext(callStack, interpreter);
        }
        try {
            try {
                Object objConstructObject = Reflect.constructObject(cls, objArr);
                if (zIsGeneratedClass) {
                    This.registerConstructorContext(null, null);
                }
                if (cls.getName().indexOf("$") != -1) {
                    NameSpace nameSpace = callStack.top().getThis(null).getNameSpace();
                    if (Name.getClassNameSpace(nameSpace) != null && !Reflect.getClassModifiers(objConstructObject.getClass()).hasModifier("static")) {
                        Reflect.getThisNS(objConstructObject).setParent(nameSpace);
                        return objConstructObject;
                    }
                    if (Reflect.getClassModifiers(objConstructObject.getClass()).hasModifier("static")) {
                        Reflect.getThisNS(objConstructObject).setParent(Reflect.getThisNS(objConstructObject.getClass()).getParent());
                    }
                }
                return objConstructObject;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                if (!zIsGeneratedClass) {
                    throw th2;
                }
                This.registerConstructorContext(null, null);
                throw th2;
            }
        } catch (ReflectError e6) {
            throw new EvalException("Constructor error: " + e6.getMessage(), this, callStack, e6);
        } catch (InvocationTargetException e7) {
            e = e7;
            Throwable th4 = e;
            try {
                Interpreter.debug("The constructor threw an exception:\n\t" + th4.getCause());
                throw new TargetError("Object constructor", th4.getCause(), this, callStack, true);
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                if (!zIsGeneratedClass) {
                }
            }
        } catch (CompletionException e10) {
            e = e10;
            Throwable th42 = e;
            Interpreter.debug("The constructor threw an exception:\n\t" + th42.getCause());
            throw new TargetError("Object constructor", th42.getCause(), this, callStack, true);
        } catch (Throwable th6) {
            th2 = th6;
            if (!zIsGeneratedClass) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object constructWithClassBody(Class<?> cls, Object[] objArr, BSHBlock bSHBlock, CallStack callStack, Interpreter interpreter) throws EvalException {
        StringBuilder sb2 = new StringBuilder("anon");
        int i9 = innerClassCount + 1;
        innerClassCount = i9;
        sb2.append(i9);
        String string = sb2.toString();
        String str = callStack.top().getName().replace('/', '_') + "$" + string;
        This.CONTEXT_ARGS.get().put(string, objArr);
        try {
            return Reflect.constructObject(ClassGenerator.getClassGenerator().generateClass(str, new Modifiers(0), null, cls, bSHBlock, ClassGenerator.Type.CLASS, callStack, interpreter), objArr);
        } catch (Exception e6) {
            throw new EvalException("Error constructing inner class instance: " + e6, this, callStack, e6 instanceof InvocationTargetException ? e6.getCause() : e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object constructWithInterfaceBody(Class<?> cls, Object[] objArr, BSHBlock bSHBlock, CallStack callStack, Interpreter interpreter) {
        NameSpace nameSpace = new NameSpace(callStack.top(), "AnonymousBlock");
        callStack.push(nameSpace);
        try {
            bSHBlock.eval(callStack, interpreter, Boolean.TRUE);
            callStack.pop();
            nameSpace.importStatic(cls);
            return nameSpace.getThis(interpreter).getInterface(cls);
        } catch (Throwable th2) {
            callStack.pop();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object objectAllocation(BSHAmbiguousName bSHAmbiguousName, BSHArguments bSHArguments, CallStack callStack, Interpreter interpreter) throws EvalError {
        Object[] arguments = bSHArguments.getArguments(callStack, interpreter);
        if (arguments == null) {
            throw new EvalError("Null args in new.", this, callStack);
        }
        Object object = bSHAmbiguousName.toObject(callStack, interpreter, true);
        if (!(object instanceof ClassIdentifier)) {
            throw new EvalException("Unknown class: " + bSHAmbiguousName.text, this, callStack);
        }
        Class<?> targetClass = ((ClassIdentifier) object).getTargetClass();
        boolean z9 = jjtGetNumChildren() > 2;
        try {
            Interpreter.mainSecurityGuard.canConstruct(targetClass, arguments);
            if (!z9) {
                return constructObject(targetClass, arguments, callStack, interpreter);
            }
            BSHBlock bSHBlock = (BSHBlock) jjtGetChild(2);
            return targetClass.isInterface() ? constructWithInterfaceBody(targetClass, arguments, bSHBlock, callStack, interpreter) : constructWithClassBody(targetClass, arguments, bSHBlock, callStack, interpreter);
        } catch (SecurityError e6) {
            throw e6.toEvalError(this, callStack);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object objectArrayAllocation(BSHAmbiguousName bSHAmbiguousName, BSHArrayDimensions bSHArrayDimensions, CallStack callStack, Interpreter interpreter) {
        return arrayAllocation(bSHArrayDimensions, bSHAmbiguousName.toClass(callStack, interpreter), callStack, interpreter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object primitiveArrayAllocation(BSHPrimitiveType bSHPrimitiveType, BSHArrayDimensions bSHArrayDimensions, CallStack callStack, Interpreter interpreter) {
        return arrayAllocation(bSHArrayDimensions, bSHPrimitiveType.getType(), callStack, interpreter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object constructFromEnclosingInstance(Object obj, CallStack callStack, Interpreter interpreter) throws TargetError {
        int i9 = 0;
        String str = jjtGetChild(0) instanceof BSHAmbiguousName ? ((BSHAmbiguousName) jjtGetChild(0)).text : HttpUrl.FRAGMENT_ENCODE_SET;
        Class<?> cls = null;
        Object[] arguments = jjtGetChild(1) instanceof BSHArguments ? ((BSHArguments) jjtGetChild(1)).getArguments(callStack, interpreter) : null;
        Class<?>[] declaredClasses = obj.getClass().getDeclaredClasses();
        int length = declaredClasses.length;
        while (true) {
            if (i9 < length) {
                Class<?> cls2 = declaredClasses[i9];
                if (Types.getBaseName(cls2.getName()).equals(str)) {
                    cls = cls2;
                    break;
                }
                i9++;
            }
        }
        try {
            return Reflect.constructObject(cls, obj, arguments);
        } catch (InvocationTargetException e6) {
            throw new TargetError("Object constructor", e6.getCause(), this, callStack, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) {
        if (jjtGetNumChildren() == 1 && (jjtGetChild(0) instanceof BSHArrayDimensions)) {
            return arrayAllocation((BSHArrayDimensions) jjtGetChild(0), Void.TYPE, callStack, interpreter);
        }
        Node nodeJjtGetChild = jjtGetChild(0);
        Node nodeJjtGetChild2 = jjtGetChild(1);
        if (!(nodeJjtGetChild instanceof BSHAmbiguousName)) {
            return primitiveArrayAllocation((BSHPrimitiveType) nodeJjtGetChild, (BSHArrayDimensions) nodeJjtGetChild2, callStack, interpreter);
        }
        BSHAmbiguousName bSHAmbiguousName = (BSHAmbiguousName) nodeJjtGetChild;
        return nodeJjtGetChild2 instanceof BSHArguments ? objectAllocation(bSHAmbiguousName, (BSHArguments) nodeJjtGetChild2, callStack, interpreter) : objectArrayAllocation(bSHAmbiguousName, (BSHArrayDimensions) nodeJjtGetChild2, callStack, interpreter);
    }
}
