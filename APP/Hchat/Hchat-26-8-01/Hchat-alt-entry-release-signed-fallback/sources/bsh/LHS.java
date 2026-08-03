package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class LHS implements bsh.ParserConstants, java.io.Serializable {
    static final int FIELD = 1;
    static final int INDEX = 3;
    static final int LOOSETYPE_FIELD = 5;
    static final int MAP_ENTRY = 6;
    static final int METHOD_EVAL = 4;
    static final int PROPERTY = 2;
    static final int VARIABLE = 0;
    private static final long serialVersionUID = 1;
    bsh.Invocable field;
    int index;
    boolean localVar;
    bsh.NameSpace nameSpace;
    java.lang.Object object;
    java.lang.Object propName;
    int type;
    bsh.Variable var;
    java.lang.String varName;

    public LHS(bsh.Invocable r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.type = r0
            java.lang.Class r0 = r2.getDeclaringClass()
            r1.object = r0
            r1.field = r2
            java.lang.String r2 = r2.getName()
            r1.varName = r2
            return
    }

    public LHS(bsh.NameSpace r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 5
            r1.type = r0
            r1.varName = r3
            r1.nameSpace = r2
            return
    }

    public LHS(bsh.NameSpace r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.type = r0
            r1.localVar = r4
            r1.varName = r3
            r1.nameSpace = r2
            return
    }

    public LHS(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            r0 = 6
            r1.type = r0
            r1.object = r2
            return
    }

    public LHS(java.lang.Object r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.type = r0
            r1.object = r2
            r1.index = r3
            return
    }

    public LHS(java.lang.Object r2, bsh.Invocable r3) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L15
            r0 = 1
            r1.type = r0
            r1.object = r2
            r1.field = r3
            if (r3 == 0) goto L14
            java.lang.String r2 = r3.getName()
            r1.varName = r2
        L14:
            return
        L15:
            java.lang.String r2 = "constructed empty LHS"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    public LHS(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Ld
            r0 = 2
            r1.type = r0
            r1.object = r2
            r1.propName = r3
            return
        Ld:
            java.lang.String r2 = "constructed empty LHS"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    private java.lang.Object getValueImpl() {
            r5 = this;
            int r0 = r5.type
            if (r0 != 0) goto Le
            bsh.NameSpace r0 = r5.nameSpace
            java.lang.String r1 = r5.varName
            r2 = 0
            java.lang.Object r0 = r0.getVariableOrProperty(r1, r2)
            return r0
        Le:
            r1 = 1
            if (r0 != r1) goto L39
            bsh.Invocable r0 = r5.field     // Catch: java.lang.ReflectiveOperationException -> L22
            java.lang.String r1 = "get value, field cannot be null"
            java.util.Objects.requireNonNull(r0, r1)     // Catch: java.lang.ReflectiveOperationException -> L22
            java.lang.Object r1 = r5.object     // Catch: java.lang.ReflectiveOperationException -> L22
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.ReflectiveOperationException -> L22
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.ReflectiveOperationException -> L22
            return r0
        L22:
            r0 = move-exception
            bsh.UtilEvalError r1 = new bsh.UtilEvalError
            bsh.Invocable r2 = r5.field
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't read field: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L39:
            r1 = 2
            if (r0 != r1) goto L67
            java.lang.Object r0 = r5.object     // Catch: bsh.ReflectError -> L45
            java.lang.Object r1 = r5.propName     // Catch: bsh.ReflectError -> L45
            java.lang.Object r0 = bsh.Reflect.getObjectProperty(r0, r1)     // Catch: bsh.ReflectError -> L45
            return r0
        L45:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            bsh.Interpreter.debug(r1)
            bsh.UtilEvalError r1 = new bsh.UtilEvalError
            java.lang.Object r2 = r5.propName
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No such property: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L67:
            r1 = 3
            if (r0 != r1) goto L88
            java.lang.Object r0 = r5.object     // Catch: java.lang.Exception -> L73
            int r1 = r5.index     // Catch: java.lang.Exception -> L73
            java.lang.Object r0 = bsh.BshArray.getIndex(r0, r1)     // Catch: java.lang.Exception -> L73
            return r0
        L73:
            r0 = move-exception
            bsh.UtilEvalError r1 = new bsh.UtilEvalError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Array access: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L88:
            r1 = 5
            if (r0 != r1) goto L94
            bsh.NameSpace r0 = r5.nameSpace
            java.lang.String r1 = r5.varName
            java.lang.Object r0 = r0.getVariable(r1)
            return r0
        L94:
            java.lang.String r0 = "LHS type"
            bsh.j.f(r0)
            r0 = 0
            return r0
    }

    private void readObject(java.io.ObjectInputStream r3) {
            r2 = this;
            r3.defaultReadObject()
            java.lang.Object r3 = r2.object
            if (r3 != 0) goto L8
            return
        L8:
            java.lang.Class r3 = r3.getClass()
            java.lang.Object r0 = r2.object
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L15
            r3 = r0
            java.lang.Class r3 = (java.lang.Class) r3
        L15:
            bsh.util.ValueReferenceMap<java.lang.Class<?>, bsh.BshClassManager$MemberCache> r0 = bsh.BshClassManager.memberCache
            java.lang.Object r3 = r0.get(r3)
            bsh.BshClassManager$MemberCache r3 = (bsh.BshClassManager.MemberCache) r3
            java.lang.String r0 = r2.varName
            bsh.Invocable r3 = r3.findField(r0)
            r2.field = r3
            return
    }

    private synchronized void writeObject(java.io.ObjectOutputStream r2) {
            r1 = this;
            monitor-enter(r1)
            bsh.Invocable r0 = r1.field     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L17
            r1.object = r0     // Catch: java.lang.Throwable -> L17
            bsh.Invocable r0 = r1.field     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L17
            r1.varName = r0     // Catch: java.lang.Throwable -> L17
            r0 = 0
            r1.field = r0     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1e
        L19:
            r2.defaultWriteObject()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    public java.lang.Object assign(java.lang.Object r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.assign(r2, r0)
            return r2
    }

    public java.lang.Object assign(java.lang.Object r4, boolean r5) {
            r3 = this;
            int r0 = r3.type
            if (r0 != 0) goto L1a
            boolean r0 = r3.localVar
            bsh.NameSpace r1 = r3.nameSpace
            if (r0 == 0) goto L10
            java.lang.String r0 = r3.varName
            r1.setLocalVariableOrProperty(r0, r4, r5)
            goto L15
        L10:
            java.lang.String r0 = r3.varName
            r1.setVariableOrProperty(r0, r4, r5)
        L15:
            java.lang.Object r4 = r3.getValueImpl()
            return r4
        L1a:
            r5 = 1
            if (r0 != r5) goto L7d
            bsh.Invocable r5 = r3.field     // Catch: java.lang.ReflectiveOperationException -> L37
            boolean r5 = bsh.Reflect.isStatic(r5)     // Catch: java.lang.ReflectiveOperationException -> L37
            if (r5 == 0) goto L39
            bsh.security.MainSecurityGuard r5 = bsh.Interpreter.mainSecurityGuard     // Catch: java.lang.ReflectiveOperationException -> L37
            bsh.Invocable r0 = r3.field     // Catch: java.lang.ReflectiveOperationException -> L37
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.ReflectiveOperationException -> L37
            bsh.Invocable r1 = r3.field     // Catch: java.lang.ReflectiveOperationException -> L37
            java.lang.String r1 = r1.getName()     // Catch: java.lang.ReflectiveOperationException -> L37
            r5.canSetStaticField(r0, r1, r4)     // Catch: java.lang.ReflectiveOperationException -> L37
            goto L46
        L37:
            r4 = move-exception
            goto L5b
        L39:
            bsh.security.MainSecurityGuard r5 = bsh.Interpreter.mainSecurityGuard     // Catch: java.lang.ReflectiveOperationException -> L37
            java.lang.Object r0 = r3.object     // Catch: java.lang.ReflectiveOperationException -> L37
            bsh.Invocable r1 = r3.field     // Catch: java.lang.ReflectiveOperationException -> L37
            java.lang.String r1 = r1.getName()     // Catch: java.lang.ReflectiveOperationException -> L37
            r5.canSetField(r0, r1, r4)     // Catch: java.lang.ReflectiveOperationException -> L37
        L46:
            bsh.Invocable r5 = r3.field     // Catch: java.lang.ReflectiveOperationException -> L37
            java.lang.String r0 = "assign value, field cannot be null"
            java.util.Objects.requireNonNull(r5, r0)     // Catch: java.lang.ReflectiveOperationException -> L37
            java.lang.Object r0 = r3.object     // Catch: java.lang.ReflectiveOperationException -> L37
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.ReflectiveOperationException -> L37
            r5.invoke(r0, r4)     // Catch: java.lang.ReflectiveOperationException -> L37
            java.lang.Object r4 = r3.getValueImpl()     // Catch: java.lang.ReflectiveOperationException -> L37
            return r4
        L5b:
            bsh.UtilEvalError r5 = new bsh.UtilEvalError
            bsh.Invocable r0 = r3.field
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "LHS ("
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ") can't access field: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0, r4)
            throw r5
        L7d:
            r1 = 2
            java.lang.String r2 = "Assignment: "
            if (r0 != r1) goto Lc5
            java.lang.Object r5 = r3.propName     // Catch: bsh.ReflectError -> L91
            boolean r0 = r5 instanceof java.lang.String     // Catch: bsh.ReflectError -> L91
            java.lang.Object r1 = r3.object
            if (r0 == 0) goto L93
            java.lang.String r5 = (java.lang.String) r5     // Catch: bsh.ReflectError -> L91
            java.lang.Object r4 = bsh.Reflect.setObjectProperty(r1, r5, r4)     // Catch: bsh.ReflectError -> L91
            return r4
        L91:
            r4 = move-exception
            goto L98
        L93:
            java.lang.Object r4 = bsh.Reflect.setObjectProperty(r1, r5, r4)     // Catch: bsh.ReflectError -> L91
            return r4
        L98:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            java.lang.String r0 = r4.getMessage()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            bsh.Interpreter.debug(r5)
            bsh.UtilEvalError r5 = new bsh.UtilEvalError
            java.lang.Object r0 = r3.propName
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No such property: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0, r4)
            throw r5
        Lc5:
            r1 = 3
            if (r0 != r1) goto L12f
            java.lang.Object r0 = r3.object     // Catch: java.lang.Exception -> Lec bsh.UtilTargetError -> Lee
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> Lec bsh.UtilTargetError -> Lee
            boolean r0 = r0.isArray()     // Catch: java.lang.Exception -> Lec bsh.UtilTargetError -> Lee
            if (r0 == 0) goto Le4
            if (r4 == 0) goto Le4
            java.lang.Object r0 = r3.object     // Catch: java.lang.Exception -> Le4
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> Le4
            java.lang.Class r0 = bsh.Types.arrayElementType(r0)     // Catch: java.lang.Exception -> Le4
            java.lang.Object r4 = bsh.Types.castObject(r4, r0, r5)     // Catch: java.lang.Exception -> Le4
        Le4:
            java.lang.Object r5 = r3.object     // Catch: java.lang.Exception -> Lec bsh.UtilTargetError -> Lee
            int r0 = r3.index     // Catch: java.lang.Exception -> Lec bsh.UtilTargetError -> Lee
            bsh.BshArray.setIndex(r5, r0, r4)     // Catch: java.lang.Exception -> Lec bsh.UtilTargetError -> Lee
            return r4
        Lec:
            r4 = move-exception
            goto Lf0
        Lee:
            r4 = move-exception
            goto L106
        Lf0:
            bsh.UtilEvalError r5 = new bsh.UtilEvalError
            java.lang.String r0 = r4.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0, r4)
            throw r5
        L106:
            java.lang.Throwable r5 = r4.getCause()
            java.lang.Class r5 = r5.getClass()
            java.lang.Class<java.lang.IndexOutOfBoundsException> r0 = java.lang.IndexOutOfBoundsException.class
            boolean r5 = r0.isAssignableFrom(r5)
            if (r5 == 0) goto L12e
            bsh.UtilEvalError r5 = new bsh.UtilEvalError
            java.lang.String r0 = r4.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error array set index: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0, r4)
            throw r5
        L12e:
            throw r4
        L12f:
            r5 = 5
            if (r0 != r5) goto L151
            bsh.Modifiers r5 = new bsh.Modifiers
            r5.<init>(r1)
            java.lang.String r0 = "public"
            r5.addModifier(r0)
            bsh.NameSpace r0 = r3.nameSpace
            boolean r0 = r0.isInterface
            if (r0 == 0) goto L145
            r5.setConstant()
        L145:
            bsh.NameSpace r0 = r3.nameSpace
            java.lang.String r1 = r3.varName
            java.lang.Class r2 = bsh.Types.getType(r4)
            r0.setTypedVariable(r1, r2, r4, r5)
            return r4
        L151:
            r5 = 6
            if (r0 != r5) goto L169
            java.lang.Object r5 = r3.object
            boolean r0 = r5 instanceof java.util.Map.Entry
            if (r0 == 0) goto L161
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r4 = r5.setValue(r4)
            return r4
        L161:
            bsh.Types$MapEntry r5 = new bsh.Types$MapEntry
            java.lang.Object r0 = r3.object
            r5.<init>(r0, r4)
            return r5
        L169:
            java.lang.String r4 = "unknown lhs type"
            bsh.j.f(r4)
            r4 = 0
            return r4
    }

    public java.lang.String getName() {
            r1 = this;
            bsh.Invocable r0 = r1.field
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getName()
            return r0
        L9:
            bsh.Variable r0 = r1.var
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getName()
            return r0
        L12:
            java.lang.String r0 = r1.varName
            return r0
    }

    public java.lang.Class<?> getType() {
            r1 = this;
            bsh.Invocable r0 = r1.field
            if (r0 == 0) goto L9
            java.lang.Class r0 = r0.getReturnType()
            return r0
        L9:
            bsh.Variable r0 = r1.getVariable()
            if (r0 == 0) goto L16
            bsh.Variable r0 = r1.var
            java.lang.Class r0 = r0.getType()
            return r0
        L16:
            java.lang.Object r0 = r1.getValueImpl()     // Catch: bsh.UtilEvalError -> L1f
            java.lang.Class r0 = bsh.Types.getType(r0)     // Catch: bsh.UtilEvalError -> L1f
            return r0
        L1f:
            r0 = 0
            return r0
    }

    public java.lang.Object getValue() {
            r3 = this;
            int r0 = r3.type
            r1 = 1
            if (r0 != r1) goto L2c
            bsh.Invocable r0 = r3.field
            boolean r0 = bsh.Reflect.isStatic(r0)
            if (r0 == 0) goto L1f
            bsh.security.MainSecurityGuard r0 = bsh.Interpreter.mainSecurityGuard
            bsh.Invocable r1 = r3.field
            java.lang.Class r1 = r1.getDeclaringClass()
            bsh.Invocable r2 = r3.field
            java.lang.String r2 = r2.getName()
            r0.canGetStaticField(r1, r2)
            goto L2c
        L1f:
            bsh.security.MainSecurityGuard r0 = bsh.Interpreter.mainSecurityGuard
            java.lang.Object r1 = r3.object
            bsh.Invocable r2 = r3.field
            java.lang.String r2 = r2.getName()
            r0.canGetField(r1, r2)
        L2c:
            java.lang.Object r0 = r3.getValueImpl()
            return r0
    }

    public bsh.Variable getVariable() {
            r3 = this;
            bsh.Variable r0 = r3.var
            if (r0 == 0) goto L5
            return r0
        L5:
            bsh.NameSpace r0 = r3.nameSpace
            if (r0 == 0) goto L14
            java.lang.String r1 = r3.getName()
            bsh.Variable r0 = bsh.Reflect.getVariable(r0, r1)
            r3.var = r0
            goto L77
        L14:
            boolean r0 = r3.isStatic()
            if (r0 == 0) goto L49
            bsh.Invocable r0 = r3.field
            java.lang.Class r0 = r0.getDeclaringClass()
            boolean r0 = bsh.Reflect.isGeneratedClass(r0)
            bsh.Invocable r1 = r3.field
            if (r0 == 0) goto L37
            java.lang.Class r0 = r1.getDeclaringClass()
            java.lang.String r1 = r3.getName()
            bsh.Variable r0 = bsh.Reflect.getVariable(r0, r1)
            r3.var = r0
            goto L77
        L37:
            bsh.Variable r0 = new bsh.Variable
            java.lang.String r1 = r1.getName()
            bsh.Invocable r2 = r3.field
            java.lang.Class r2 = r2.getReturnType()
            r0.<init>(r1, r2, r3)
            r3.var = r0
            goto L77
        L49:
            java.lang.Object r0 = r3.object
            java.lang.Class r0 = r0.getClass()
            boolean r0 = bsh.Reflect.isGeneratedClass(r0)
            if (r0 == 0) goto L62
            java.lang.Object r0 = r3.object
            java.lang.String r1 = r3.getName()
            bsh.Variable r0 = bsh.Reflect.getVariable(r0, r1)
            r3.var = r0
            goto L77
        L62:
            bsh.Invocable r0 = r3.field
            if (r0 == 0) goto L77
            bsh.Variable r1 = new bsh.Variable
            java.lang.String r0 = r0.getName()
            bsh.Invocable r2 = r3.field
            java.lang.Class r2 = r2.getReturnType()
            r1.<init>(r0, r2, r3)
            r3.var = r1
        L77:
            bsh.Variable r0 = r3.var
            return r0
    }

    public boolean isFinal() {
            r2 = this;
            bsh.Variable r0 = r2.getVariable()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            bsh.Variable r0 = r2.var
            java.lang.String r1 = "final"
            boolean r0 = r0.hasModifier(r1)
            return r0
    }

    public boolean isStatic() {
            r2 = this;
            bsh.Invocable r0 = r2.field
            if (r0 == 0) goto L9
            boolean r0 = r0.isStatic()
            return r0
        L9:
            bsh.Variable r0 = r2.var
            if (r0 != 0) goto Lf
            r0 = 0
            return r0
        Lf:
            java.lang.String r1 = "static"
            boolean r0 = r0.hasModifier(r1)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LHS: "
            r0.<init>(r1)
            bsh.Invocable r1 = r4.field
            java.lang.String r2 = ""
            if (r1 == 0) goto L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "field = "
            r1.<init>(r3)
            bsh.Invocable r3 = r4.field
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L23
        L22:
            r1 = r2
        L23:
            r0.append(r1)
            java.lang.String r1 = r4.varName
            if (r1 == 0) goto L3b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = " varName = "
            r1.<init>(r3)
            java.lang.String r3 = r4.varName
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L3c
        L3b:
            r1 = r2
        L3c:
            r0.append(r1)
            bsh.NameSpace r1 = r4.nameSpace
            if (r1 == 0) goto L57
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " nameSpace = "
            r1.<init>(r2)
            bsh.NameSpace r2 = r4.nameSpace
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L57:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
