package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHBinaryExpression extends SimpleNode implements InterfaceC3448 {
    public int kind;

    public BSHBinaryExpression(int i) {
        super(i);
    }

    private Object checkNullValues(Object obj, Object obj2, int i, CallStack callStack) throws TargetError, EvalException {
        Class<?> type;
        int i2;
        Primitive primitive = Primitive.NULL;
        if (primitive == obj && Primitive.VOID != obj2) {
            try {
                boolean z = obj2 instanceof String;
                if (primitive == obj2) {
                    Variable variableAtNode = getVariableAtNode(i ^ 1, callStack);
                    if (variableAtNode != null) {
                        z = variableAtNode.getType() == String.class;
                        type = variableAtNode.getType();
                    } else {
                        type = null;
                    }
                } else {
                    type = Primitive.unwrap(obj2).getClass();
                }
                Variable variableAtNode2 = getVariableAtNode(i, callStack);
                if (variableAtNode2 != null && (((i2 = this.kind) != 92 && i2 != 97) || !isComparableTypes(variableAtNode2.getType(), type, callStack))) {
                    if (this.kind == 104 && (z || variableAtNode2.getType() == String.class)) {
                        return "null";
                    }
                    boolean zIsWrapper = isWrapper(variableAtNode2.getType());
                    String[] strArr = InterfaceC3448.f8193;
                    if (zIsWrapper) {
                        throw new NullPointerException("null value with binary operator " + strArr[this.kind]);
                    }
                    throw new EvalException("bad operand types for binary operator " + strArr[this.kind], this, callStack);
                }
            } catch (UtilEvalError e) {
                e.toEvalError(this, callStack);
                return obj;
            } catch (NullPointerException e2) {
                throw new TargetError(e2, this, callStack);
            }
        }
        return obj;
    }

    private Variable getVariableAtNode(int i, CallStack callStack) {
        if (jjtGetChild(i).jjtGetNumChildren() <= 0) {
            return null;
        }
        InterfaceC3452 interfaceC3452JjtGetChild = jjtGetChild(i).jjtGetChild(0);
        if (interfaceC3452JjtGetChild instanceof BSHAmbiguousName) {
            return callStack.top().getVariableImpl(((BSHAmbiguousName) interfaceC3452JjtGetChild).text, true);
        }
        return null;
    }

    private boolean isComparableTypes(Class<?> cls, Class<?> cls2, CallStack callStack) throws EvalException {
        if (cls2 == cls || isSimilarTypes(cls, cls2)) {
            return true;
        }
        throw new EvalException("incomparable types: " + AbstractC3462.m5885(cls) + " and " + AbstractC3462.m5885(cls2), this, callStack);
    }

    private boolean isPrimitiveValue(Object obj) {
        return (!(obj instanceof Primitive) || obj == Primitive.NULL || obj == Primitive.VOID) ? false : true;
    }

    private boolean isSimilarTypes(Class<?> cls, Class<?> cls2) {
        return cls2 == null || cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private boolean isWrapper(java.lang.Class<?> r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            boolean r1 = r1.isAssignableFrom(r4)
            r2 = 1
            if (r1 != 0) goto L2d
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L16
            goto L2d
        L16:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r4 = r1.isAssignableFrom(r4)
            if (r4 == 0) goto L2c
            int r3 = r3.kind
            r4 = 92
            if (r3 == r4) goto L2b
            switch(r3) {
                case 97: goto L2b;
                case 98: goto L2b;
                case 99: goto L2b;
                case 100: goto L2b;
                case 101: goto L2b;
                default: goto L27;
            }
        L27:
            switch(r3) {
                case 108: goto L2b;
                case 109: goto L2b;
                case 110: goto L2b;
                case 111: goto L2b;
                case 112: goto L2b;
                case 113: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L2c
        L2b:
            return r2
        L2c:
            return r0
        L2d:
            int r3 = r3.kind
            switch(r3) {
                case 98: goto L33;
                case 99: goto L33;
                case 100: goto L33;
                case 101: goto L33;
                default: goto L32;
            }
        L32:
            return r2
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.BSHBinaryExpression.isWrapper(java.lang.Class):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bd, code lost:
    
        if ((bsh.Primitive.castWrapper(r5, r2) instanceof java.lang.Boolean) != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0100  */
    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        int i;
        Object objEval;
        int i2;
        Object objCheckNullValues;
        Object objCheckNullValues2;
        int i3;
        int i4;
        Object objEval2 = jjtGetChild(0).eval(callStack, interpreter);
        int i5 = this.kind;
        if (i5 == 36) {
            if (objEval2 == Primitive.NULL) {
                return Primitive.FALSE;
            }
            Class<?> type = ((BSHType) jjtGetChild(1)).getType(callStack, interpreter);
            if (objEval2 instanceof Primitive) {
                if (type == Primitive.class) {
                    return Primitive.TRUE;
                }
                objEval2 = Primitive.unwrap(objEval2);
            }
            return AbstractC3495.m5948(type, objEval2.getClass()) ? Primitive.TRUE : Primitive.FALSE;
        }
        Class cls = Boolean.TYPE;
        if (i5 == 100 || i5 == 101) {
            if (interpreter.getStrictJava()) {
                Primitive primitive = Primitive.FALSE;
                if (primitive.equals(objEval2)) {
                    return primitive;
                }
            } else if (!Primitive.FALSE.equals(Primitive.castWrapper(cls, objEval2))) {
            }
            i = this.kind;
            if (i == 98 && i != 99 && i != 148) {
                if (this.kind == 147) {
                }
                objEval = jjtGetChild(1).eval(callStack, interpreter);
                i2 = this.kind;
                if (i2 != 147) {
                    if (!interpreter.getStrictJava()) {
                    }
                    objCheckNullValues = checkNullValues(objEval2, objEval, 0, callStack);
                    objCheckNullValues2 = checkNullValues(objEval, objCheckNullValues, 1, callStack);
                    i3 = this.kind;
                    String[] strArr = InterfaceC3448.f8193;
                    if (i3 != 92) {
                    }
                    if (interpreter.getStrictJava()) {
                    }
                    return AbstractC3451.m5851(objCheckNullValues, this.kind, objCheckNullValues2);
                }
                return objEval;
            }
            if (!interpreter.getStrictJava()) {
                Primitive primitive2 = Primitive.TRUE;
                if (primitive2.equals(objEval2)) {
                    return primitive2;
                }
            } else if (!Primitive.TRUE.equals(Primitive.castWrapper(cls, objEval2))) {
            }
            if (this.kind == 147 || Primitive.NULL == objEval2) {
                objEval = jjtGetChild(1).eval(callStack, interpreter);
                i2 = this.kind;
                if (i2 != 147 && i2 != 148) {
                    try {
                        if (!interpreter.getStrictJava()) {
                            switch (this.kind) {
                                case 98:
                                case 99:
                                case 100:
                                case 101:
                                default:
                                    objCheckNullValues = checkNullValues(objEval2, objEval, 0, callStack);
                                    objCheckNullValues2 = checkNullValues(objEval, objCheckNullValues, 1, callStack);
                                    i3 = this.kind;
                                    String[] strArr2 = InterfaceC3448.f8193;
                                    if (((i3 != 92 && i3 != 97) || !isWrapper(objCheckNullValues) || !isWrapper(objCheckNullValues2)) && ((isWrapper(objCheckNullValues) || isPrimitiveValue(objCheckNullValues)) && (isWrapper(objCheckNullValues2) || isPrimitiveValue(objCheckNullValues2)))) {
                                        try {
                                            return AbstractC3451.m5848(objCheckNullValues, this.kind, objCheckNullValues2);
                                        } catch (UtilEvalError e) {
                                            throw e.toEvalError("Failed operation: " + objCheckNullValues + " " + strArr2[this.kind] + " " + objCheckNullValues2, this, callStack);
                                        }
                                    }
                                    if (interpreter.getStrictJava() || (!((i4 = this.kind) == 104 || i4 == 106) || (objCheckNullValues instanceof String) || (objCheckNullValues2 instanceof String))) {
                                        return AbstractC3451.m5851(objCheckNullValues, this.kind, objCheckNullValues2);
                                    }
                                    throw new EvalException("Bad operand types for binary operator " + strArr2[this.kind] + " first type: " + AbstractC3462.m5888(objCheckNullValues) + " second type: " + AbstractC3462.m5888(objCheckNullValues2), this, callStack);
                            }
                        }
                        return AbstractC3451.m5851(objCheckNullValues, this.kind, objCheckNullValues2);
                    } catch (UtilEvalError e2) {
                        throw e2.toEvalError(this, callStack);
                    }
                    objCheckNullValues = checkNullValues(objEval2, objEval, 0, callStack);
                    objCheckNullValues2 = checkNullValues(objEval, objCheckNullValues, 1, callStack);
                    i3 = this.kind;
                    String[] strArr22 = InterfaceC3448.f8193;
                    if (i3 != 92) {
                    }
                    if (interpreter.getStrictJava()) {
                    }
                }
                return objEval;
            }
        } else {
            i = this.kind;
            if (i == 98) {
                if (!interpreter.getStrictJava()) {
                }
                if (this.kind == 147) {
                }
                objEval = jjtGetChild(1).eval(callStack, interpreter);
                i2 = this.kind;
                if (i2 != 147) {
                }
                return objEval;
            }
        }
        return objEval2;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + InterfaceC3448.f8193[this.kind];
    }

    private boolean isWrapper(Object obj) {
        return (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character);
    }
}
