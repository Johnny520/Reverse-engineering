package bsh;

import bsh.security.SecurityError;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CompletionException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHAllocationExpression extends SimpleNode {
    private static int innerClassCount;

    public BSHAllocationExpression(int i) {
        super(i);
    }

    private Object arrayAllocation(BSHArrayDimensions bSHArrayDimensions, Class<?> cls, CallStack callStack, Interpreter interpreter) {
        Object objEval = bSHArrayDimensions.eval(cls, callStack, interpreter);
        return objEval != Primitive.VOID ? objEval : arrayNewInstance(cls, bSHArrayDimensions, callStack, interpreter);
    }

    private Object arrayNewInstance(Class<?> cls, BSHArrayDimensions bSHArrayDimensions, CallStack callStack, Interpreter interpreter) throws TargetError, EvalException {
        int i = bSHArrayDimensions.numUndefinedDims;
        if (i > 0) {
            cls = Array.newInstance(cls, new int[i]).getClass();
        }
        try {
            return Array.newInstance(cls, bSHArrayDimensions.definedDimensions);
        } catch (NegativeArraySizeException e) {
            throw new TargetError(e, this, callStack);
        } catch (Exception e2) {
            throw new EvalException("Can't construct primitive array: " + e2.getMessage(), this, callStack, e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object constructObject(Class<?> cls, Object[] objArr, CallStack callStack, Interpreter interpreter) {
        boolean zM5387 = AbstractC2666.m5387(cls);
        if (zM5387) {
            This.registerConstructorContext(callStack, interpreter);
        }
        try {
            try {
                Object objM5397 = AbstractC2666.m5397(cls, null, objArr);
                if (zM5387) {
                    This.registerConstructorContext(null, null);
                }
                if (cls.getName().indexOf("$") != -1) {
                    NameSpace nameSpace = callStack.top().getThis(null).getNameSpace();
                    if (Name.getClassNameSpace(nameSpace) != null && !AbstractC2666.m5412(objM5397.getClass()).hasModifier("static")) {
                        AbstractC2666.m5399(objM5397).setParent(nameSpace);
                        return objM5397;
                    }
                    if (AbstractC2666.m5412(objM5397.getClass()).hasModifier("static")) {
                        AbstractC2666.m5399(objM5397).setParent(AbstractC2666.m5400(objM5397.getClass()).getParent());
                    }
                }
                return objM5397;
            } catch (ReflectError e) {
                throw new EvalException("Constructor error: " + e.getMessage(), this, callStack, e);
            } catch (InvocationTargetException e2) {
                e = e2;
                Throwable th = e;
                Interpreter.debug("The constructor threw an exception:\n\t" + th.getCause());
                throw new TargetError("Object constructor", th.getCause(), this, callStack, true);
            } catch (CompletionException e3) {
                e = e3;
                Throwable th2 = e;
                Interpreter.debug("The constructor threw an exception:\n\t" + th2.getCause());
                throw new TargetError("Object constructor", th2.getCause(), this, callStack, true);
            }
        } finally {
        }
    }

    private Object constructWithClassBody(Class<?> cls, Object[] objArr, BSHBlock bSHBlock, CallStack callStack, Interpreter interpreter) throws EvalException {
        StringBuilder sb = new StringBuilder("anon");
        int i = innerClassCount + 1;
        innerClassCount = i;
        sb.append(i);
        String string = sb.toString();
        String str = callStack.top().getName().replace('/', '_') + "$" + string;
        This.CONTEXT_ARGS.get().put(string, objArr);
        Modifiers modifiers = new Modifiers(0);
        if (C2652.f7942 == null) {
            C2652.f7942 = new C2652();
        }
        C2652 c2652 = C2652.f7942;
        ClassGenerator$Type classGenerator$Type = ClassGenerator$Type.CLASS;
        c2652.getClass();
        try {
            return AbstractC2666.m5397(C2652.m5314(str, modifiers, null, cls, bSHBlock, classGenerator$Type, callStack, interpreter), null, objArr);
        } catch (Exception e) {
            throw new EvalException("Error constructing inner class instance: " + e, this, callStack, e instanceof InvocationTargetException ? e.getCause() : e);
        }
    }

    private Object constructWithInterfaceBody(Class<?> cls, Object[] objArr, BSHBlock bSHBlock, CallStack callStack, Interpreter interpreter) {
        NameSpace nameSpace = new NameSpace(callStack.top(), "AnonymousBlock");
        callStack.push(nameSpace);
        try {
            bSHBlock.eval(callStack, interpreter, Boolean.TRUE);
            callStack.pop();
            nameSpace.importStatic(cls);
            return nameSpace.getThis(interpreter).getInterface(cls);
        } catch (Throwable th) {
            callStack.pop();
            throw th;
        }
    }

    private Object objectAllocation(BSHAmbiguousName bSHAmbiguousName, BSHArguments bSHArguments, CallStack callStack, Interpreter interpreter) throws EvalError {
        Object[] arguments = bSHArguments.getArguments(callStack, interpreter);
        if (arguments == null) {
            throw new EvalError("Null args in new.", this, callStack);
        }
        Object object = bSHAmbiguousName.toObject(callStack, interpreter, true);
        if (!(object instanceof C2645)) {
            throw new EvalException("Unknown class: " + bSHAmbiguousName.text, this, callStack);
        }
        Class<?> cls = ((C2645) object).f7917;
        boolean z = jjtGetNumChildren() > 2;
        try {
            Interpreter.mainSecurityGuard.m13859(cls, arguments);
            if (!z) {
                return constructObject(cls, arguments, callStack, interpreter);
            }
            BSHBlock bSHBlock = (BSHBlock) jjtGetChild(2);
            return cls.isInterface() ? constructWithInterfaceBody(cls, arguments, bSHBlock, callStack, interpreter) : constructWithClassBody(cls, arguments, bSHBlock, callStack, interpreter);
        } catch (SecurityError e) {
            throw e.toEvalError(this, callStack);
        }
    }

    private Object objectArrayAllocation(BSHAmbiguousName bSHAmbiguousName, BSHArrayDimensions bSHArrayDimensions, CallStack callStack, Interpreter interpreter) {
        return arrayAllocation(bSHArrayDimensions, bSHAmbiguousName.toClass(callStack, interpreter), callStack, interpreter);
    }

    private Object primitiveArrayAllocation(BSHPrimitiveType bSHPrimitiveType, BSHArrayDimensions bSHArrayDimensions, CallStack callStack, Interpreter interpreter) {
        return arrayAllocation(bSHArrayDimensions, bSHPrimitiveType.getType(), callStack, interpreter);
    }

    public Object constructFromEnclosingInstance(Object obj, CallStack callStack, Interpreter interpreter) throws TargetError {
        int i = 0;
        String str = jjtGetChild(0) instanceof BSHAmbiguousName ? ((BSHAmbiguousName) jjtGetChild(0)).text : "";
        Class<?> cls = null;
        Object[] arguments = jjtGetChild(1) instanceof BSHArguments ? ((BSHArguments) jjtGetChild(1)).getArguments(callStack, interpreter) : null;
        Class<?>[] declaredClasses = obj.getClass().getDeclaredClasses();
        int length = declaredClasses.length;
        while (true) {
            if (i < length) {
                Class<?> cls2 = declaredClasses[i];
                if (AbstractC2661.m5347(cls2.getName()).equals(str)) {
                    cls = cls2;
                    break;
                }
                i++;
            }
        }
        try {
            return AbstractC2666.m5397(cls, obj, arguments);
        } catch (InvocationTargetException e) {
            throw new TargetError("Object constructor", e.getCause(), this, callStack, true);
        }
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) {
        if (jjtGetNumChildren() == 1 && (jjtGetChild(0) instanceof BSHArrayDimensions)) {
            return arrayAllocation((BSHArrayDimensions) jjtGetChild(0), Void.TYPE, callStack, interpreter);
        }
        InterfaceC2618 interfaceC2618JjtGetChild = jjtGetChild(0);
        InterfaceC2618 interfaceC2618JjtGetChild2 = jjtGetChild(1);
        if (!(interfaceC2618JjtGetChild instanceof BSHAmbiguousName)) {
            return primitiveArrayAllocation((BSHPrimitiveType) interfaceC2618JjtGetChild, (BSHArrayDimensions) interfaceC2618JjtGetChild2, callStack, interpreter);
        }
        BSHAmbiguousName bSHAmbiguousName = (BSHAmbiguousName) interfaceC2618JjtGetChild;
        return interfaceC2618JjtGetChild2 instanceof BSHArguments ? objectAllocation(bSHAmbiguousName, (BSHArguments) interfaceC2618JjtGetChild2, callStack, interpreter) : objectArrayAllocation(bSHAmbiguousName, (BSHArrayDimensions) interfaceC2618JjtGetChild2, callStack, interpreter);
    }
}
