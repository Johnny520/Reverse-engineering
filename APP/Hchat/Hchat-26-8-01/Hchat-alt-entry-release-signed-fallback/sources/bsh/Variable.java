package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Variable implements java.io.Serializable, bsh.BshClassManager.Listener, java.lang.Cloneable {
    public static final int ASSIGNMENT = 1;
    public static final int DECLARATION = 0;
    bsh.LHS lhs;
    bsh.Modifiers modifiers;
    java.lang.String name;
    java.lang.Class<?> type;
    java.lang.String typeDescriptor;
    java.lang.Object value;

    public Variable(java.lang.String r1, java.lang.Class<?> r2, bsh.LHS r3) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.lhs = r3
            r0.type = r2
            return
    }

    public Variable(java.lang.String r1, java.lang.Class<?> r2, java.lang.Object r3, bsh.Modifiers r4) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.type = r2
            r0.setModifiers(r4)
            r1 = 0
            r0.setValue(r3, r1)
            return
    }

    public Variable(java.lang.String r2, java.lang.Object r3, bsh.Modifiers r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public Variable(java.lang.String r2, java.lang.String r3, java.lang.Object r4, bsh.Modifiers r5) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r4, r5)
            r1.typeDescriptor = r3
            return
    }

    private void setModifiers(bsh.Modifiers r1) {
            r0 = this;
            r0.modifiers = r1
            return
    }

    @Override // bsh.BshClassManager.Listener
    public void classLoaderChanged() {
            r2 = this;
            java.lang.Class<?> r0 = r2.type
            boolean r0 = bsh.Reflect.isGeneratedClass(r0)
            if (r0 == 0) goto L1a
            java.lang.Class<?> r0 = r2.type     // Catch: bsh.UtilEvalError -> L1a
            bsh.NameSpace r0 = bsh.Reflect.getThisNS(r0)     // Catch: bsh.UtilEvalError -> L1a
            java.lang.Class<?> r1 = r2.type     // Catch: bsh.UtilEvalError -> L1a
            java.lang.String r1 = r1.getName()     // Catch: bsh.UtilEvalError -> L1a
            java.lang.Class r0 = r0.getClass(r1)     // Catch: bsh.UtilEvalError -> L1a
            r2.type = r0     // Catch: bsh.UtilEvalError -> L1a
        L1a:
            return
    }

    public bsh.Variable clone() {
            r3 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> Lf
            bsh.Variable r0 = (bsh.Variable) r0     // Catch: java.lang.CloneNotSupportedException -> Lf
            bsh.Modifiers r1 = r0.modifiers     // Catch: java.lang.CloneNotSupportedException -> Lf
            if (r1 == 0) goto L11
            bsh.Modifiers r1 = r1.clone()     // Catch: java.lang.CloneNotSupportedException -> Lf
            goto L12
        Lf:
            r0 = move-exception
            goto L15
        L11:
            r1 = 0
        L12:
            r0.modifiers = r1     // Catch: java.lang.CloneNotSupportedException -> Lf
            return r0
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m2clone() {
            r1 = this;
            bsh.Variable r0 = r1.clone()
            return r0
    }

    public bsh.Modifiers getModifiers() {
            r2 = this;
            bsh.Modifiers r0 = r2.modifiers
            if (r0 != 0) goto Ld
            bsh.Modifiers r0 = new bsh.Modifiers
            r1 = 3
            r0.<init>(r1)
            r2.setModifiers(r0)
        Ld:
            bsh.Modifiers r0 = r2.modifiers
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.Class<?> getType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.type
            return r0
    }

    public java.lang.String getTypeDescriptor() {
            r1 = this;
            java.lang.String r0 = r1.typeDescriptor
            if (r0 != 0) goto L10
            java.lang.Class<?> r0 = r1.type
            if (r0 != 0) goto La
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
        La:
            java.lang.String r0 = bsh.BSHType.getTypeDescriptor(r0)
            r1.typeDescriptor = r0
        L10:
            java.lang.String r0 = r1.typeDescriptor
            return r0
    }

    public java.lang.Object getValue() {
            r2 = this;
            bsh.LHS r0 = r2.lhs
            if (r0 == 0) goto L18
            java.lang.Class<?> r1 = r2.type
            if (r1 != 0) goto Ld
            java.lang.Object r0 = r0.getValue()
            return r0
        Ld:
            java.lang.Object r0 = r0.getValue()
            java.lang.Class<?> r1 = r2.type
            java.lang.Object r0 = bsh.Primitive.wrap(r0, r1)
            return r0
        L18:
            java.lang.Object r0 = r2.value
            return r0
    }

    public boolean hasModifier(java.lang.String r2) {
            r1 = this;
            bsh.Modifiers r0 = r1.getModifiers()
            boolean r2 = r0.hasModifier(r2)
            return r2
    }

    public void setConstant() {
            r3 = this;
            java.lang.String r0 = "private"
            boolean r0 = r3.hasModifier(r0)
            if (r0 != 0) goto L18
            java.lang.String r0 = "protected"
            boolean r0 = r3.hasModifier(r0)
            if (r0 != 0) goto L18
            bsh.Modifiers r0 = r3.getModifiers()
            r0.setConstant()
            return
        L18:
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = ". Only public static & final are permitted."
            java.lang.String r2 = "Illegal modifier for interface field "
            bsh.j.b(r0, r2, r1)
            return
    }

    public void setValue(java.lang.Object r4, int r5) {
            r3 = this;
            java.lang.String r0 = "final"
            boolean r0 = r3.hasModifier(r0)
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.value
            if (r0 != 0) goto Lf
            if (r4 != 0) goto L24
            goto L54
        Lf:
            bsh.UtilEvalError r4 = new bsh.UtilEvalError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot re-assign final variable "
            r5.<init>(r0)
            java.lang.String r0 = r3.name
            java.lang.String r1 = "."
            java.lang.String r5 = eh.a.r(r5, r0, r1)
            r4.<init>(r5)
            throw r4
        L24:
            java.lang.Class<?> r0 = r3.type
            r1 = 0
            if (r0 == 0) goto L3a
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r0 == r2) goto L3a
            if (r4 == 0) goto L3a
            if (r5 != 0) goto L33
            r2 = r1
            goto L34
        L33:
            r2 = 1
        L34:
            java.lang.Object r4 = bsh.Types.castObject(r4, r0, r2)
            r3.value = r4
        L3a:
            r3.value = r4
            if (r4 != 0) goto L48
            if (r5 == 0) goto L48
            java.lang.Class<?> r4 = r3.type
            bsh.Primitive r4 = bsh.Primitive.getDefaultValue(r4)
            r3.value = r4
        L48:
            bsh.LHS r4 = r3.lhs
            if (r4 == 0) goto L54
            java.lang.Object r5 = r3.value
            java.lang.Object r4 = r4.assign(r5, r1)
            r3.value = r4
        L54:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Variable: "
            r0.<init>(r1)
            java.lang.String r1 = bsh.StringUtil.variableString(r2)
            r0.append(r1)
            java.lang.String r1 = ", value:"
            r0.append(r1)
            java.lang.Object r1 = r2.value
            r0.append(r1)
            java.lang.String r1 = ", lhs = "
            r0.append(r1)
            bsh.LHS r1 = r2.lhs
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void validateFinalIsSet(boolean r4) {
            r3 = this;
            java.lang.String r0 = "final"
            boolean r0 = r3.hasModifier(r0)
            if (r0 == 0) goto L37
            java.lang.Object r0 = r3.value
            if (r0 == 0) goto Ld
            goto L37
        Ld:
            java.lang.String r0 = "static"
            boolean r0 = r3.hasModifier(r0)
            if (r4 != r0) goto L37
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r4 == 0) goto L21
            java.lang.String r4 = "Static f"
            goto L23
        L21:
            java.lang.String r4 = "F"
        L23:
            r1.append(r4)
            java.lang.String r4 = "inal variable "
            r1.append(r4)
            java.lang.String r4 = r3.name
            java.lang.String r2 = " is not initialized."
            java.lang.String r4 = eh.a.r(r1, r4, r2)
            r0.<init>(r4)
            throw r0
        L37:
            return
    }
}
