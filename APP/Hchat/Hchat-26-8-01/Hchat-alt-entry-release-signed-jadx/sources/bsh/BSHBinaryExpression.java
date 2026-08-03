package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHBinaryExpression extends SimpleNode implements ParserConstants {
    private static final long serialVersionUID = 1;
    public int kind;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHBinaryExpression(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object checkNullValues(Object obj, Object obj2, int i9, CallStack callStack) throws TargetError, EvalException {
        Class<?> type;
        int i10;
        Primitive primitive = Primitive.NULL;
        if (primitive == obj && Primitive.VOID != obj2) {
            try {
                boolean z9 = obj2 instanceof String;
                if (primitive == obj2) {
                    Variable variableAtNode = getVariableAtNode(i9 ^ 1, callStack);
                    if (variableAtNode != null) {
                        z9 = variableAtNode.getType() == String.class;
                        type = variableAtNode.getType();
                    } else {
                        type = null;
                    }
                } else {
                    type = Primitive.unwrap(obj2).getClass();
                }
                Variable variableAtNode2 = getVariableAtNode(i9, callStack);
                if (variableAtNode2 != null && (((i10 = this.kind) != 92 && i10 != 97) || !isComparableTypes(variableAtNode2.getType(), type, callStack))) {
                    if (this.kind == 104 && (z9 || variableAtNode2.getType() == String.class)) {
                        return "null";
                    }
                    if (isWrapper(variableAtNode2.getType())) {
                        throw new NullPointerException("null value with binary operator " + ParserConstants.tokenImage[this.kind]);
                    }
                    throw new EvalException("bad operand types for binary operator " + ParserConstants.tokenImage[this.kind], this, callStack);
                }
            } catch (UtilEvalError e6) {
                e6.toEvalError(this, callStack);
                return obj;
            } catch (NullPointerException e7) {
                throw new TargetError(e7, this, callStack);
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Variable getVariableAtNode(int i9, CallStack callStack) {
        if (jjtGetChild(i9).jjtGetNumChildren() <= 0) {
            return null;
        }
        Node nodeJjtGetChild = jjtGetChild(i9).jjtGetChild(0);
        if (nodeJjtGetChild instanceof BSHAmbiguousName) {
            return callStack.top().getVariableImpl(((BSHAmbiguousName) nodeJjtGetChild).text, true);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isComparableTypes(Class<?> cls, Class<?> cls2, CallStack callStack) throws EvalException {
        if (cls2 == cls || isSimilarTypes(cls, cls2)) {
            return true;
        }
        throw new EvalException("incomparable types: " + StringUtil.typeString(cls) + " and " + StringUtil.typeString(cls2), this, callStack);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isPrimitiveValue(Object obj) {
        return (!(obj instanceof Primitive) || obj == Primitive.NULL || obj == Primitive.VOID) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSimilarTypes(Class<?> cls, Class<?> cls2) {
        return cls2 == null || cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
            int r4 = r3.kind
            r1 = 92
            if (r4 == r1) goto L2b
            switch(r4) {
                case 97: goto L2b;
                case 98: goto L2b;
                case 99: goto L2b;
                case 100: goto L2b;
                case 101: goto L2b;
                default: goto L27;
            }
        L27:
            switch(r4) {
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
            int r4 = r3.kind
            switch(r4) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bd, code lost:
    
        if ((bsh.Primitive.castWrapper(r5, r2) instanceof java.lang.Boolean) != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    @Override // bsh.SimpleNode, bsh.Node
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        int i9;
        Object objEval;
        int i10;
        Object objCheckNullValues;
        Object objCheckNullValues2;
        int i11;
        int i12;
        Object objEval2 = jjtGetChild(0).eval(callStack, interpreter);
        int i13 = this.kind;
        if (i13 == 36) {
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
            return Types.isJavaBaseAssignable(type, objEval2.getClass()) ? Primitive.TRUE : Primitive.FALSE;
        }
        Class cls = Boolean.TYPE;
        if (i13 == 100 || i13 == 101) {
            if (interpreter.getStrictJava()) {
                Primitive primitive = Primitive.FALSE;
                if (primitive.equals(objEval2)) {
                    return primitive;
                }
            } else if (!Primitive.FALSE.equals(Primitive.castWrapper(cls, objEval2))) {
            }
            i9 = this.kind;
            if (i9 == 98 && i9 != 99 && i9 != 148) {
                if (this.kind == 147) {
                }
                objEval = jjtGetChild(1).eval(callStack, interpreter);
                i10 = this.kind;
                if (i10 != 147) {
                    if (!interpreter.getStrictJava()) {
                    }
                    objCheckNullValues = checkNullValues(objEval2, objEval, 0, callStack);
                    objCheckNullValues2 = checkNullValues(objEval, objCheckNullValues, 1, callStack);
                    i11 = this.kind;
                    if (i11 != 92) {
                    }
                    if (interpreter.getStrictJava()) {
                    }
                    return Operators.arbitraryObjectsBinaryOperation(objCheckNullValues, objCheckNullValues2, this.kind);
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
                i10 = this.kind;
                if (i10 != 147 && i10 != 148) {
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
                                    i11 = this.kind;
                                    if (((i11 != 92 && i11 != 97) || !isWrapper(objCheckNullValues) || !isWrapper(objCheckNullValues2)) && ((isWrapper(objCheckNullValues) || isPrimitiveValue(objCheckNullValues)) && (isWrapper(objCheckNullValues2) || isPrimitiveValue(objCheckNullValues2)))) {
                                        try {
                                            return Operators.binaryOperation(objCheckNullValues, objCheckNullValues2, this.kind);
                                        } catch (UtilEvalError e6) {
                                            throw e6.toEvalError("Failed operation: " + objCheckNullValues + " " + ParserConstants.tokenImage[this.kind] + " " + objCheckNullValues2, this, callStack);
                                        }
                                    }
                                    if (interpreter.getStrictJava() || (!((i12 = this.kind) == 104 || i12 == 106) || (objCheckNullValues instanceof String) || (objCheckNullValues2 instanceof String))) {
                                        return Operators.arbitraryObjectsBinaryOperation(objCheckNullValues, objCheckNullValues2, this.kind);
                                    }
                                    throw new EvalException("Bad operand types for binary operator " + ParserConstants.tokenImage[this.kind] + " first type: " + StringUtil.typeString(objCheckNullValues) + " second type: " + StringUtil.typeString(objCheckNullValues2), this, callStack);
                            }
                        }
                        return Operators.arbitraryObjectsBinaryOperation(objCheckNullValues, objCheckNullValues2, this.kind);
                    } catch (UtilEvalError e7) {
                        throw e7.toEvalError(this, callStack);
                    }
                    objCheckNullValues = checkNullValues(objEval2, objEval, 0, callStack);
                    objCheckNullValues2 = checkNullValues(objEval, objCheckNullValues, 1, callStack);
                    i11 = this.kind;
                    if (i11 != 92) {
                    }
                    if (interpreter.getStrictJava()) {
                    }
                }
                return objEval;
            }
        } else {
            i9 = this.kind;
            if (i9 == 98) {
                if (!interpreter.getStrictJava()) {
                }
                if (this.kind == 147) {
                }
                objEval = jjtGetChild(1).eval(callStack, interpreter);
                i10 = this.kind;
                if (i10 != 147) {
                }
                return objEval;
            }
        }
        return objEval2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + ParserConstants.tokenImage[this.kind];
    }

    private boolean isWrapper(Object obj) {
        return (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Character);
    }
}
