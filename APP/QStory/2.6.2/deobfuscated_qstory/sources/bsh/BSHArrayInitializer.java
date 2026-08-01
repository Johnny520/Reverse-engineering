package bsh;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import p007.AbstractC6136;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHArrayInitializer extends SimpleNode {
    private static final long serialVersionUID = 1;
    Deque<BSHPrimaryExpression> expressionQueue;
    boolean isMapInArray;

    public BSHArrayInitializer(int i) {
        super(i);
        this.isMapInArray = false;
        this.expressionQueue = new ArrayDeque();
    }

    private Object buildArray(int i, Class<?> cls, CallStack callStack, Interpreter interpreter) throws EvalException {
        Object objEval;
        int[] iArr = new int[i];
        iArr[0] = jjtGetNumChildren();
        Object objNewInstance = Array.newInstance(cls, iArr);
        Class<?> componentType = objNewInstance.getClass().getComponentType();
        for (int i2 = 0; i2 < jjtGetNumChildren(); i2++) {
            InterfaceC2618 interfaceC2618JjtGetChild = jjtGetChild(i2);
            if (!(interfaceC2618JjtGetChild instanceof BSHArrayInitializer)) {
                objEval = interfaceC2618JjtGetChild.eval(callStack, interpreter);
            } else if (i < 2) {
                BSHArrayInitializer bSHArrayInitializer = (BSHArrayInitializer) interfaceC2618JjtGetChild;
                if (!isMapInArray(bSHArrayInitializer)) {
                    throw new EvalException("Invalid Intializer for " + cls + ", at position: " + i2, this, callStack);
                }
                objEval = bSHArrayInitializer.eval(Types$MapEntry.class, 1, callStack, interpreter);
            } else {
                objEval = ((BSHArrayInitializer) interfaceC2618JjtGetChild).eval(cls, i - 1, callStack, interpreter);
            }
            if (objEval == Primitive.VOID) {
                throw new EvalException(AbstractC6136.m11556(i2, "Void in array initializer, position "), this, callStack);
            }
            try {
                Array.set(objNewInstance, i2, normalizeEntry(objEval, componentType, i, callStack));
            } catch (IllegalArgumentException e) {
                Interpreter.debug("illegal arg", e);
                throwTypeError(cls, objEval, i2, callStack);
            }
        }
        return objNewInstance;
    }

    private Object buildBean(Class<?> cls, CallStack callStack, Interpreter interpreter) {
        callStack.push(new NameSpace(callStack.top(), cls.getName()));
        callStack.top().setClassStatic(cls);
        callStack.top().getThis(interpreter);
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            callStack.top().setClassInstance(objNewInstance);
            for (int i = 0; i < jjtGetNumChildren(); i++) {
                BSHAssignment bSHAssignment = (BSHAssignment) jjtGetChild(i);
                BSHPrimaryExpression bSHPrimaryExpression = (BSHPrimaryExpression) bSHAssignment.jjtGetChild(0);
                bSHPrimaryExpression.isMapExpression = false;
                bSHPrimaryExpression.isArrayExpression = false;
                bSHAssignment.eval(callStack, interpreter);
            }
            return objNewInstance;
        } finally {
        }
    }

    private void clearEvalCache() {
        Iterator<BSHPrimaryExpression> it = this.expressionQueue.iterator();
        while (it.hasNext()) {
            it.next().clearCache();
        }
    }

    private Class<?> inferCommonType(Class<?> cls, InterfaceC2618 interfaceC2618, CallStack callStack, Interpreter interpreter) {
        if (Object.class != cls && Types$MapEntry.class != cls) {
            if (interfaceC2618 instanceof BSHAssignment) {
                return AbstractC2661.m5346(cls, AbstractC2661.m5331(AbstractC2661.m5350(interfaceC2618.eval(callStack, interpreter), Primitive.isWrapperType(cls))));
            }
            if ((interfaceC2618 instanceof BSHArrayInitializer) && isMapInArray((BSHArrayInitializer) interfaceC2618)) {
                return AbstractC2661.m5346(cls, Map.class);
            }
            for (InterfaceC2618 interfaceC26182 : interfaceC2618.jjtGetChildren()) {
                cls = inferCommonType(cls, interfaceC26182, callStack, interpreter);
            }
        }
        return cls;
    }

    private int inferDimensions(int i, int i2, InterfaceC2618 interfaceC2618, CallStack callStack, Interpreter interpreter) {
        while (interfaceC2618.jjtGetNumChildren() > i2) {
            interfaceC2618 = interfaceC2618.jjtGetChild(i2);
            if (!(interfaceC2618 instanceof BSHArrayInitializer) || isMapInArray((BSHArrayInitializer) interfaceC2618) || interfaceC2618.jjtGetNumChildren() <= 0) {
                break;
            }
            i++;
            i2 = 0;
        }
        if (interfaceC2618 instanceof BSHArrayInitializer) {
            return interfaceC2618.jjtGetNumChildren() == 0 ? inferDimensions(i, i2 + 1, interfaceC2618.jjtGetParent(), callStack, interpreter) : i;
        }
        Object objEval = interfaceC2618.eval(callStack, interpreter);
        return objEval == Primitive.NULL ? inferDimensions(i, i2 + 1, interfaceC2618.jjtGetParent(), callStack, interpreter) : AbstractC2661.m5332(AbstractC2661.m5350(objEval, false)) + i;
    }

    private boolean isBeanType(Class<?> cls) {
        return Void.TYPE != cls && !AbstractC2661.m5344(cls) && (jjtGetChild(0) instanceof BSHAssignment) && (jjtGetChild(0).jjtGetChild(0) instanceof BSHPrimaryExpression) && ((BSHPrimaryExpression) jjtGetChild(0).jjtGetChild(0)).isMapExpression && (jjtGetChild(0).jjtGetChild(0).jjtGetChild(0) instanceof BSHAmbiguousName);
    }

    private boolean isMapInArray(BSHArrayInitializer bSHArrayInitializer) {
        return bSHArrayInitializer.isMapInArray;
    }

    private Object normalizeEntry(Object obj, Class<?> cls, int i, CallStack callStack) throws EvalException {
        if (i != 1 && obj == Primitive.NULL) {
            return Primitive.unwrap(obj);
        }
        try {
            return Primitive.unwrap(AbstractC2661.m5328(obj, cls, 0));
        } catch (UtilEvalError e) {
            throw e.toEvalException("Error in array initializer", this, callStack);
        }
    }

    private void throwTypeError(Class<?> cls, Object obj, int i, CallStack callStack) throws EvalException {
        StringBuilder sbM11550 = AbstractC6136.m11550("Incompatible type: ", AbstractC2628.m5283(obj), " in initializer of array type: ");
        sbM11550.append(cls.getSimpleName());
        sbM11550.append(" at position: ");
        sbM11550.append(i);
        throw new EvalException(sbM11550.toString(), this, callStack);
    }

    private Object toCollection(Object obj, Class<?> cls, CallStack callStack) {
        Class<?> cls2 = obj.getClass();
        Class clsM5331 = AbstractC2661.m5331(cls2);
        if (AbstractC2661.m5344(cls) && (!cls2.isArray() || (!Map.class.isAssignableFrom(clsM5331) && !Collection.class.isAssignableFrom(clsM5331)))) {
            try {
                return AbstractC2661.m5328(obj, cls, 0);
            } catch (UtilEvalError e) {
                e.toEvalError(this, callStack);
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object eval(java.lang.Class<?> r10, int r11, bsh.CallStack r12, bsh.Interpreter r13) throws bsh.EvalException {
        /*
            r9 = this;
            int r0 = r9.jjtGetNumChildren()
            r1 = 0
            if (r0 != 0) goto L8
            r11 = r1
        L8:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r11 != 0) goto L21
            if (r10 == r2) goto L18
            boolean r11 = bsh.AbstractC2661.m5344(r10)
            if (r11 == 0) goto L17
            goto L18
        L17:
            r0 = r10
        L18:
            java.lang.Object r11 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object r9 = r9.toCollection(r11, r10, r12)
            return r9
        L21:
            r1 = -1
            if (r1 != r11) goto L53
            boolean r11 = r13.getStrictJava()
            if (r11 != 0) goto L49
            boolean r11 = r9.isBeanType(r10)
            if (r11 == 0) goto L35
            java.lang.Object r9 = r9.buildBean(r10, r12, r13)
            return r9
        L35:
            r4 = 1
            r5 = 0
            r6 = r9
            r3 = r9
            r7 = r12
            r8 = r13
            int r11 = r3.inferDimensions(r4, r5, r6, r7, r8)
            boolean r9 = bsh.AbstractC2661.m5344(r10)
            if (r9 == 0) goto L47
            r9 = r2
            goto L57
        L47:
            r9 = r10
            goto L57
        L49:
            r3 = r9
            r7 = r12
            bsh.EvalException r9 = new bsh.EvalException
            java.lang.String r10 = "No declared array type or dimensions."
            r9.<init>(r10, r3, r7)
            throw r9
        L53:
            r3 = r9
            r7 = r12
            r8 = r13
            goto L47
        L57:
            if (r9 != r2) goto L5e
            r9 = 0
            java.lang.Class r9 = r3.inferCommonType(r9, r3, r7, r8)
        L5e:
            r12 = 2
            if (r11 >= r12) goto L6b
            java.lang.Class<bsh.Types$MapEntry> r12 = bsh.Types$MapEntry.class
            if (r12 != r9) goto L67
            if (r2 == r10) goto L69
        L67:
            if (r12 != r10) goto L6b
        L69:
            java.lang.Class<java.util.Map> r10 = java.util.Map.class
        L6b:
            if (r9 != 0) goto L70
            int r11 = r11 + 1
            goto L71
        L70:
            r0 = r9
        L71:
            java.lang.Object r9 = r3.buildArray(r11, r0, r7, r8)
            r3.clearEvalCache()
            java.lang.Object r9 = r3.toCollection(r9, r10, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.BSHArrayInitializer.eval(java.lang.Class, int, bsh.CallStack, bsh.Interpreter):java.lang.Object");
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public void jjtSetParent(InterfaceC2618 interfaceC2618) {
        this.parent = interfaceC2618;
        InterfaceC2618[] interfaceC2618Arr = this.children;
        if (interfaceC2618Arr != null) {
            for (InterfaceC2618 interfaceC26182 : interfaceC2618Arr) {
                if (interfaceC26182.jjtGetNumChildren() > 0 && (interfaceC26182.jjtGetChild(0) instanceof BSHPrimaryExpression)) {
                    this.expressionQueue.push((BSHPrimaryExpression) interfaceC26182.jjtGetChild(0));
                    this.expressionQueue.peek().setArrayExpression(this);
                }
            }
        }
    }

    public void setMapInArray(boolean z) {
        this.isMapInArray = z;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.isMapInArray;
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        throw new EvalError("Array initializer has no base type.", this, callStack);
    }
}
