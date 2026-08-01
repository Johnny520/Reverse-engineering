package bsh;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            InterfaceC3452 interfaceC3452JjtGetChild = jjtGetChild(i2);
            if (!(interfaceC3452JjtGetChild instanceof BSHArrayInitializer)) {
                objEval = interfaceC3452JjtGetChild.eval(callStack, interpreter);
            } else if (i < 2) {
                BSHArrayInitializer bSHArrayInitializer = (BSHArrayInitializer) interfaceC3452JjtGetChild;
                if (!isMapInArray(bSHArrayInitializer)) {
                    throw new EvalException("Invalid Intializer for " + cls + ", at position: " + i2, this, callStack);
                }
                objEval = bSHArrayInitializer.eval(Types$MapEntry.class, 1, callStack, interpreter);
            } else {
                objEval = ((BSHArrayInitializer) interfaceC3452JjtGetChild).eval(cls, i - 1, callStack, interpreter);
            }
            if (objEval == Primitive.VOID) {
                throw new EvalException(AbstractC7012.m12147(i2, "Void in array initializer, position "), this, callStack);
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

    private Class<?> inferCommonType(Class<?> cls, InterfaceC3452 interfaceC3452, CallStack callStack, Interpreter interpreter) {
        if (Object.class != cls && Types$MapEntry.class != cls) {
            if (interfaceC3452 instanceof BSHAssignment) {
                return AbstractC3495.m5951(cls, AbstractC3495.m5936(AbstractC3495.m5955(interfaceC3452.eval(callStack, interpreter), Primitive.isWrapperType(cls))));
            }
            if ((interfaceC3452 instanceof BSHArrayInitializer) && isMapInArray((BSHArrayInitializer) interfaceC3452)) {
                return AbstractC3495.m5951(cls, Map.class);
            }
            for (InterfaceC3452 interfaceC34522 : interfaceC3452.jjtGetChildren()) {
                cls = inferCommonType(cls, interfaceC34522, callStack, interpreter);
            }
        }
        return cls;
    }

    private int inferDimensions(int i, int i2, InterfaceC3452 interfaceC3452, CallStack callStack, Interpreter interpreter) {
        while (interfaceC3452.jjtGetNumChildren() > i2) {
            interfaceC3452 = interfaceC3452.jjtGetChild(i2);
            if (!(interfaceC3452 instanceof BSHArrayInitializer) || isMapInArray((BSHArrayInitializer) interfaceC3452) || interfaceC3452.jjtGetNumChildren() <= 0) {
                break;
            }
            i++;
            i2 = 0;
        }
        if (interfaceC3452 instanceof BSHArrayInitializer) {
            return interfaceC3452.jjtGetNumChildren() == 0 ? inferDimensions(i, i2 + 1, interfaceC3452.jjtGetParent(), callStack, interpreter) : i;
        }
        Object objEval = interfaceC3452.eval(callStack, interpreter);
        return objEval == Primitive.NULL ? inferDimensions(i, i2 + 1, interfaceC3452.jjtGetParent(), callStack, interpreter) : AbstractC3495.m5937(AbstractC3495.m5955(objEval, false)) + i;
    }

    private boolean isBeanType(Class<?> cls) {
        return Void.TYPE != cls && !AbstractC3495.m5949(cls) && (jjtGetChild(0) instanceof BSHAssignment) && (jjtGetChild(0).jjtGetChild(0) instanceof BSHPrimaryExpression) && ((BSHPrimaryExpression) jjtGetChild(0).jjtGetChild(0)).isMapExpression && (jjtGetChild(0).jjtGetChild(0).jjtGetChild(0) instanceof BSHAmbiguousName);
    }

    private boolean isMapInArray(BSHArrayInitializer bSHArrayInitializer) {
        return bSHArrayInitializer.isMapInArray;
    }

    private Object normalizeEntry(Object obj, Class<?> cls, int i, CallStack callStack) throws EvalException {
        if (i != 1 && obj == Primitive.NULL) {
            return Primitive.unwrap(obj);
        }
        try {
            return Primitive.unwrap(AbstractC3495.m5933(obj, cls, 0));
        } catch (UtilEvalError e) {
            throw e.toEvalException("Error in array initializer", this, callStack);
        }
    }

    private void throwTypeError(Class<?> cls, Object obj, int i, CallStack callStack) throws EvalException {
        StringBuilder sbM12144 = AbstractC7012.m12144("Incompatible type: ", AbstractC3462.m5888(obj), " in initializer of array type: ");
        sbM12144.append(cls.getSimpleName());
        sbM12144.append(" at position: ");
        sbM12144.append(i);
        throw new EvalException(sbM12144.toString(), this, callStack);
    }

    private Object toCollection(Object obj, Class<?> cls, CallStack callStack) {
        Class<?> cls2 = obj.getClass();
        Class clsM5936 = AbstractC3495.m5936(cls2);
        if (AbstractC3495.m5949(cls) && (!cls2.isArray() || (!Map.class.isAssignableFrom(clsM5936) && !Collection.class.isAssignableFrom(clsM5936)))) {
            try {
                return AbstractC3495.m5933(obj, cls, 0);
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
    */
    public Object eval(Class<?> cls, int i, CallStack callStack, Interpreter interpreter) throws EvalException {
        BSHArrayInitializer bSHArrayInitializer;
        CallStack callStack2;
        Interpreter interpreter2;
        Class<?> clsInferCommonType;
        BSHArrayInitializer bSHArrayInitializer2;
        if (jjtGetNumChildren() == 0) {
            i = 0;
        }
        Class<?> cls2 = Object.class;
        Class<?> cls3 = Void.TYPE;
        if (i == 0) {
            if (cls != cls3 && !AbstractC3495.m5949(cls)) {
                cls2 = cls;
            }
            return toCollection(Array.newInstance(cls2, 0), cls, callStack);
        }
        if (-1 == i) {
            if (interpreter.getStrictJava()) {
                throw new EvalException("No declared array type or dimensions.", this, callStack);
            }
            if (isBeanType(cls)) {
                return buildBean(cls, callStack, interpreter);
            }
            BSHArrayInitializer bSHArrayInitializer3 = this;
            callStack2 = callStack;
            interpreter2 = interpreter;
            i = bSHArrayInitializer3.inferDimensions(1, 0, this, callStack2, interpreter2);
            bSHArrayInitializer = bSHArrayInitializer3;
            if (AbstractC3495.m5949(cls)) {
                clsInferCommonType = cls3;
                bSHArrayInitializer2 = bSHArrayInitializer3;
            }
            if (clsInferCommonType == cls3) {
                clsInferCommonType = bSHArrayInitializer2.inferCommonType(null, bSHArrayInitializer2, callStack2, interpreter2);
            }
            if (i < 2 && ((Types$MapEntry.class == clsInferCommonType && cls3 == cls) || Types$MapEntry.class == cls)) {
                cls = Map.class;
            }
            if (clsInferCommonType != null) {
                i++;
            } else {
                cls2 = clsInferCommonType;
            }
            Object objBuildArray = bSHArrayInitializer2.buildArray(i, cls2, callStack2, interpreter2);
            bSHArrayInitializer2.clearEvalCache();
            return bSHArrayInitializer2.toCollection(objBuildArray, cls, callStack2);
        }
        bSHArrayInitializer = this;
        callStack2 = callStack;
        interpreter2 = interpreter;
        clsInferCommonType = cls;
        bSHArrayInitializer2 = bSHArrayInitializer;
        if (clsInferCommonType == cls3) {
        }
        if (i < 2) {
            cls = Map.class;
        }
        if (clsInferCommonType != null) {
        }
        Object objBuildArray2 = bSHArrayInitializer2.buildArray(i, cls2, callStack2, interpreter2);
        bSHArrayInitializer2.clearEvalCache();
        return bSHArrayInitializer2.toCollection(objBuildArray2, cls, callStack2);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public void jjtSetParent(InterfaceC3452 interfaceC3452) {
        this.parent = interfaceC3452;
        InterfaceC3452[] interfaceC3452Arr = this.children;
        if (interfaceC3452Arr != null) {
            for (InterfaceC3452 interfaceC34522 : interfaceC3452Arr) {
                if (interfaceC34522.jjtGetNumChildren() > 0 && (interfaceC34522.jjtGetChild(0) instanceof BSHPrimaryExpression)) {
                    this.expressionQueue.push((BSHPrimaryExpression) interfaceC34522.jjtGetChild(0));
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

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        throw new EvalError("Array initializer has no base type.", this, callStack);
    }
}
