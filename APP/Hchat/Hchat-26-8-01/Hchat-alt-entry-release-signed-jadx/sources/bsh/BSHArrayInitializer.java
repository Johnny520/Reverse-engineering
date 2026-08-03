package bsh;

import bsh.Types;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHArrayInitializer extends SimpleNode {
    private static final long serialVersionUID = 1;
    Deque<BSHPrimaryExpression> expressionQueue;
    boolean isMapInArray;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHArrayInitializer(int i9) {
        super(i9);
        this.isMapInArray = false;
        this.expressionQueue = new ArrayDeque();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object buildArray(int i9, Class<?> cls, CallStack callStack, Interpreter interpreter) throws EvalException {
        Object objEval;
        int[] iArr = new int[i9];
        iArr[0] = jjtGetNumChildren();
        Object objNewInstance = Array.newInstance(cls, iArr);
        Class<?> componentType = objNewInstance.getClass().getComponentType();
        for (int i10 = 0; i10 < jjtGetNumChildren(); i10++) {
            Node nodeJjtGetChild = jjtGetChild(i10);
            if (!(nodeJjtGetChild instanceof BSHArrayInitializer)) {
                objEval = nodeJjtGetChild.eval(callStack, interpreter);
            } else if (i9 < 2) {
                BSHArrayInitializer bSHArrayInitializer = (BSHArrayInitializer) nodeJjtGetChild;
                if (!isMapInArray(bSHArrayInitializer)) {
                    throw new EvalException("Invalid Intializer for " + cls + ", at position: " + i10, this, callStack);
                }
                objEval = bSHArrayInitializer.eval(Types.MapEntry.class, 1, callStack, interpreter);
            } else {
                objEval = ((BSHArrayInitializer) nodeJjtGetChild).eval(cls, i9 - 1, callStack, interpreter);
            }
            if (objEval == Primitive.VOID) {
                throw new EvalException(AbstractC0921a.m2249l(i10, "Void in array initializer, position "), this, callStack);
            }
            try {
                Array.set(objNewInstance, i10, normalizeEntry(objEval, componentType, i9, callStack));
            } catch (IllegalArgumentException e6) {
                Interpreter.debug("illegal arg", e6);
                throwTypeError(cls, objEval, i10, callStack);
            }
        }
        return objNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private Object buildBean(Class<?> cls, CallStack callStack, Interpreter interpreter) {
        callStack.push(new NameSpace(callStack.top(), cls.getName()));
        callStack.top().setClassStatic(cls);
        callStack.top().getThis(interpreter);
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            callStack.top().setClassInstance(objNewInstance);
            for (int i9 = 0; i9 < jjtGetNumChildren(); i9++) {
                BSHAssignment bSHAssignment = (BSHAssignment) jjtGetChild(i9);
                BSHPrimaryExpression bSHPrimaryExpression = (BSHPrimaryExpression) bSHAssignment.jjtGetChild(0);
                bSHPrimaryExpression.isMapExpression = false;
                bSHPrimaryExpression.isArrayExpression = false;
                bSHAssignment.eval(callStack, interpreter);
            }
            return objNewInstance;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void clearEvalCache() {
        Iterator<BSHPrimaryExpression> it = this.expressionQueue.iterator();
        while (it.hasNext()) {
            it.next().clearCache();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> inferCommonType(Class<?> cls, Node node, CallStack callStack, Interpreter interpreter) {
        if (Object.class != cls && Types.MapEntry.class != cls) {
            if (node instanceof BSHAssignment) {
                return Types.getCommonType(cls, Types.arrayElementType(Types.getType(node.eval(callStack, interpreter), Primitive.isWrapperType(cls))));
            }
            if ((node instanceof BSHArrayInitializer) && isMapInArray((BSHArrayInitializer) node)) {
                return Types.getCommonType(cls, Map.class);
            }
            for (Node node2 : node.jjtGetChildren()) {
                cls = inferCommonType(cls, node2, callStack, interpreter);
            }
        }
        return cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int inferDimensions(int i9, int i10, Node node, CallStack callStack, Interpreter interpreter) {
        int i11 = i9;
        while (node.jjtGetNumChildren() > i10) {
            node = node.jjtGetChild(i10);
            if (!(node instanceof BSHArrayInitializer) || isMapInArray((BSHArrayInitializer) node) || node.jjtGetNumChildren() <= 0) {
                break;
            }
            i11++;
            i10 = 0;
        }
        if (node instanceof BSHArrayInitializer) {
            return node.jjtGetNumChildren() == 0 ? inferDimensions(i11, i10 + 1, node.jjtGetParent(), callStack, interpreter) : i11;
        }
        Object objEval = node.eval(callStack, interpreter);
        return objEval == Primitive.NULL ? inferDimensions(i11, i10 + 1, node.jjtGetParent(), callStack, interpreter) : i11 + Types.arrayDimensions(Types.getType(objEval));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isBeanType(Class<?> cls) {
        return Void.TYPE != cls && !Types.isCollectionType(cls) && (jjtGetChild(0) instanceof BSHAssignment) && (jjtGetChild(0).jjtGetChild(0) instanceof BSHPrimaryExpression) && ((BSHPrimaryExpression) jjtGetChild(0).jjtGetChild(0)).isMapExpression && (jjtGetChild(0).jjtGetChild(0).jjtGetChild(0) instanceof BSHAmbiguousName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isMapInArray(BSHArrayInitializer bSHArrayInitializer) {
        return bSHArrayInitializer.isMapInArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object normalizeEntry(Object obj, Class<?> cls, int i9, CallStack callStack) throws EvalException {
        if (i9 != 1 && obj == Primitive.NULL) {
            return Primitive.unwrap(obj);
        }
        try {
            return Primitive.unwrap(Types.castObject(obj, cls, 0));
        } catch (UtilEvalError e6) {
            throw e6.toEvalException("Error in array initializer", this, callStack);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void throwTypeError(Class<?> cls, Object obj, int i9, CallStack callStack) throws EvalException {
        StringBuilder sbM1026o = AbstractC0255e.m1026o("Incompatible type: ", StringUtil.typeString(obj), " in initializer of array type: ");
        sbM1026o.append(cls.getSimpleName());
        sbM1026o.append(" at position: ");
        sbM1026o.append(i9);
        throw new EvalException(sbM1026o.toString(), this, callStack);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object toCollection(Object obj, Class<?> cls, CallStack callStack) {
        Class<?> cls2 = obj.getClass();
        Class<?> clsArrayElementType = Types.arrayElementType(cls2);
        if (Types.isCollectionType(cls) && (!cls2.isArray() || (!Map.class.isAssignableFrom(clsArrayElementType) && !Collection.class.isAssignableFrom(clsArrayElementType)))) {
            try {
                return Types.castObject(obj, cls, 0);
            } catch (UtilEvalError e6) {
                e6.toEvalError(this, callStack);
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object eval(Class<?> cls, int i9, CallStack callStack, Interpreter interpreter) throws EvalException {
        CallStack callStack2;
        Interpreter interpreter2;
        Class<?> clsInferCommonType;
        if (jjtGetNumChildren() == 0) {
            i9 = 0;
        }
        Class<?> cls2 = Object.class;
        Class<?> cls3 = Void.TYPE;
        if (i9 == 0) {
            if (cls != cls3 && !Types.isCollectionType(cls)) {
                cls2 = cls;
            }
            return toCollection(Array.newInstance(cls2, 0), cls, callStack);
        }
        if (-1 == i9) {
            if (interpreter.getStrictJava()) {
                throw new EvalException("No declared array type or dimensions.", this, callStack);
            }
            if (isBeanType(cls)) {
                return buildBean(cls, callStack, interpreter);
            }
            callStack2 = callStack;
            interpreter2 = interpreter;
            i9 = inferDimensions(1, 0, this, callStack2, interpreter2);
            if (Types.isCollectionType(cls)) {
                clsInferCommonType = cls3;
            }
            if (clsInferCommonType == cls3) {
                clsInferCommonType = inferCommonType(null, this, callStack2, interpreter2);
            }
            if (i9 < 2 && ((Types.MapEntry.class == clsInferCommonType && cls3 == cls) || Types.MapEntry.class == cls)) {
                cls = Map.class;
            }
            if (clsInferCommonType != null) {
                i9++;
            } else {
                cls2 = clsInferCommonType;
            }
            Object objBuildArray = buildArray(i9, cls2, callStack2, interpreter2);
            clearEvalCache();
            return toCollection(objBuildArray, cls, callStack2);
        }
        callStack2 = callStack;
        interpreter2 = interpreter;
        clsInferCommonType = cls;
        if (clsInferCommonType == cls3) {
        }
        if (i9 < 2) {
            cls = Map.class;
        }
        if (clsInferCommonType != null) {
        }
        Object objBuildArray2 = buildArray(i9, cls2, callStack2, interpreter2);
        clearEvalCache();
        return toCollection(objBuildArray2, cls, callStack2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public void jjtSetParent(Node node) {
        this.parent = node;
        Node[] nodeArr = this.children;
        if (nodeArr != null) {
            for (Node node2 : nodeArr) {
                if (node2.jjtGetNumChildren() > 0 && (node2.jjtGetChild(0) instanceof BSHPrimaryExpression)) {
                    this.expressionQueue.push((BSHPrimaryExpression) node2.jjtGetChild(0));
                    this.expressionQueue.peek().setArrayExpression(this);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMapInArray(boolean z9) {
        this.isMapInArray = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.isMapInArray;
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        throw new EvalError("Array initializer has no base type.", this, callStack);
    }
}
