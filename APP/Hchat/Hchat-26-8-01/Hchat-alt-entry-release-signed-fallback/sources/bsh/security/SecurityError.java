package bsh.security;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class SecurityError extends bsh.UtilEvalError {
    public SecurityError(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "SecurityError: "
            java.lang.String r2 = wb.en.g(r0, r2)
            r1.<init>(r2)
            return
    }

    private static java.lang.String argsTypesString(java.lang.Object[] r3) {
            int r0 = r3.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L1b
            r2 = r3[r1]
            java.lang.Class r2 = bsh.Reflect.getType(r2)
            if (r2 == 0) goto L14
            java.lang.String r2 = r2.getTypeName()
            goto L16
        L14:
            java.lang.String r2 = "null"
        L16:
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L1b:
            java.lang.String r3 = ", "
            java.lang.String r3 = java.lang.String.join(r3, r0)
            return r3
    }

    public static bsh.security.SecurityError cantConstruct(java.lang.Class<?> r3, java.lang.Object[] r4) {
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = argsTypesString(r4)
            java.lang.String r0 = "("
            java.lang.String r1 = ")"
            java.lang.String r2 = "Can't call this construct: new "
            java.lang.String r3 = bc.e.k(r2, r3, r0, r4, r1)
            bsh.security.SecurityError r4 = new bsh.security.SecurityError
            r4.<init>(r3)
            return r4
    }

    public static bsh.security.SecurityError cantExtends(java.lang.Class<?> r1) {
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "Can't extend this class: "
            java.lang.String r1 = r0.concat(r1)
            bsh.security.SecurityError r0 = new bsh.security.SecurityError
            r0.<init>(r1)
            return r0
    }

    public static bsh.security.SecurityError cantGetField(java.lang.Object r2, java.lang.String r3) {
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getTypeName()
            java.lang.String r0 = "Can't get this field: "
            java.lang.String r1 = "."
            java.lang.String r2 = bc.e.j(r0, r2, r1, r3)
            bsh.security.SecurityError r3 = new bsh.security.SecurityError
            r3.<init>(r2)
            return r3
    }

    public static bsh.security.SecurityError cantGetStaticField(java.lang.Class<?> r2, java.lang.String r3) {
            java.lang.String r2 = r2.getTypeName()
            java.lang.String r0 = "Can't get this static field: "
            java.lang.String r1 = "."
            java.lang.String r2 = bc.e.j(r0, r2, r1, r3)
            bsh.security.SecurityError r3 = new bsh.security.SecurityError
            r3.<init>(r2)
            return r3
    }

    public static bsh.security.SecurityError cantImplements(java.lang.Class<?> r1) {
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "Can't implement this interface: "
            java.lang.String r1 = r0.concat(r1)
            bsh.security.SecurityError r0 = new bsh.security.SecurityError
            r0.<init>(r1)
            return r0
    }

    public static bsh.security.SecurityError cantInvokeLocalMethod(java.lang.String r3, java.lang.Object[] r4) {
            java.lang.String r4 = argsTypesString(r4)
            java.lang.String r0 = "("
            java.lang.String r1 = ")"
            java.lang.String r2 = "Can't invoke this local method: "
            java.lang.String r3 = bc.e.k(r2, r3, r0, r4, r1)
            bsh.security.SecurityError r4 = new bsh.security.SecurityError
            r4.<init>(r3)
            return r4
    }

    public static bsh.security.SecurityError cantInvokeMethod(java.lang.Object r3, java.lang.String r4, java.lang.Object[] r5) {
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getTypeName()
            java.lang.String r5 = argsTypesString(r5)
            java.lang.String r0 = "."
            java.lang.String r1 = "("
            java.lang.String r2 = "Can't invoke this method: "
            java.lang.StringBuilder r3 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r4 = ")"
            java.lang.String r3 = eh.a.r(r3, r5, r4)
            bsh.security.SecurityError r4 = new bsh.security.SecurityError
            r4.<init>(r3)
            return r4
    }

    public static bsh.security.SecurityError cantInvokeStaticMethod(java.lang.Class<?> r3, java.lang.String r4, java.lang.Object[] r5) {
            java.lang.String r3 = r3.getTypeName()
            java.lang.String r5 = argsTypesString(r5)
            java.lang.String r0 = "."
            java.lang.String r1 = "("
            java.lang.String r2 = "Can't invoke this static method: "
            java.lang.StringBuilder r3 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r4 = ")"
            java.lang.String r3 = eh.a.r(r3, r5, r4)
            bsh.security.SecurityError r4 = new bsh.security.SecurityError
            r4.<init>(r3)
            return r4
    }

    public static bsh.security.SecurityError cantSetField(java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getTypeName()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r5 = argsTypesString(r5)
            java.lang.String r0 = "."
            java.lang.String r1 = " ("
            java.lang.String r2 = "Can't set this field: "
            java.lang.StringBuilder r3 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r4 = ")"
            java.lang.String r3 = eh.a.r(r3, r5, r4)
            bsh.security.SecurityError r4 = new bsh.security.SecurityError
            r4.<init>(r3)
            return r4
    }

    public static bsh.security.SecurityError cantSetStaticField(java.lang.Class<?> r3, java.lang.String r4, java.lang.Object r5) {
            java.lang.String r3 = r3.getTypeName()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r5 = argsTypesString(r5)
            java.lang.String r0 = "."
            java.lang.String r1 = " ("
            java.lang.String r2 = "Can't set this static field: "
            java.lang.StringBuilder r3 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r4 = ")"
            java.lang.String r3 = eh.a.r(r3, r5, r4)
            bsh.security.SecurityError r4 = new bsh.security.SecurityError
            r4.<init>(r3)
            return r4
    }

    public static bsh.security.SecurityError reflectCantConstruct(java.lang.Class<?> r3, java.lang.Object[] r4) {
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = argsTypesString(r4)
            java.lang.String r0 = "("
            java.lang.String r1 = ")"
            java.lang.String r2 = "Can't call this construct using reflection: new "
            java.lang.String r3 = bc.e.k(r2, r3, r0, r4, r1)
            bsh.security.SecurityError r4 = new bsh.security.SecurityError
            r4.<init>(r3)
            return r4
    }

    public static bsh.security.SecurityError reflectCantGetField(java.lang.Object r2, java.lang.String r3) {
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getTypeName()
            java.lang.String r0 = "Can't get this field using reflection: "
            java.lang.String r1 = "."
            java.lang.String r2 = bc.e.j(r0, r2, r1, r3)
            bsh.security.SecurityError r3 = new bsh.security.SecurityError
            r3.<init>(r2)
            return r3
    }

    public static bsh.security.SecurityError reflectCantGetStaticField(java.lang.Class<?> r2, java.lang.String r3) {
            java.lang.String r2 = r2.getTypeName()
            java.lang.String r0 = "Can't get this static field using reflection: "
            java.lang.String r1 = "."
            java.lang.String r2 = bc.e.j(r0, r2, r1, r3)
            bsh.security.SecurityError r3 = new bsh.security.SecurityError
            r3.<init>(r2)
            return r3
    }

    public static bsh.security.SecurityError reflectCantInvokeMethod(java.lang.Object r3, java.lang.String r4, java.lang.Object[] r5) {
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getTypeName()
            java.lang.String r5 = argsTypesString(r5)
            java.lang.String r0 = "."
            java.lang.String r1 = "("
            java.lang.String r2 = "Can't invoke this method using reflection: "
            java.lang.StringBuilder r3 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r4 = ")"
            java.lang.String r3 = eh.a.r(r3, r5, r4)
            bsh.security.SecurityError r4 = new bsh.security.SecurityError
            r4.<init>(r3)
            return r4
    }

    public static bsh.security.SecurityError reflectCantInvokeStaticMethod(java.lang.Class<?> r3, java.lang.String r4, java.lang.Object[] r5) {
            java.lang.String r3 = r3.getTypeName()
            java.lang.String r5 = argsTypesString(r5)
            java.lang.String r0 = "."
            java.lang.String r1 = "("
            java.lang.String r2 = "Can't invoke this static method using reflection: "
            java.lang.StringBuilder r3 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r4 = ")"
            java.lang.String r3 = eh.a.r(r3, r5, r4)
            bsh.security.SecurityError r4 = new bsh.security.SecurityError
            r4.<init>(r3)
            return r4
    }

    public static bsh.security.SecurityError reflectCantSetField(java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getTypeName()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r5 = argsTypesString(r5)
            java.lang.String r0 = "."
            java.lang.String r1 = " ("
            java.lang.String r2 = "Can't set this field using reflection: "
            java.lang.StringBuilder r3 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r4 = ")"
            java.lang.String r3 = eh.a.r(r3, r5, r4)
            bsh.security.SecurityError r4 = new bsh.security.SecurityError
            r4.<init>(r3)
            return r4
    }

    public static bsh.security.SecurityError reflectCantSetStaticField(java.lang.Class<?> r3, java.lang.String r4, java.lang.Object r5) {
            java.lang.String r3 = r3.getTypeName()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r5 = argsTypesString(r5)
            java.lang.String r0 = "."
            java.lang.String r1 = " ("
            java.lang.String r2 = "Can't set this static field using reflection: "
            java.lang.StringBuilder r3 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r4 = ")"
            java.lang.String r3 = eh.a.r(r3, r5, r4)
            bsh.security.SecurityError r4 = new bsh.security.SecurityError
            r4.<init>(r3)
            return r4
    }

    @Override // bsh.UtilEvalError
    public bsh.EvalError toEvalError(bsh.Node r3, bsh.CallStack r4) {
            r2 = this;
            bsh.EvalError r0 = new bsh.EvalError
            java.lang.String r1 = r2.getMessage()
            r0.<init>(r1, r3, r4)
            return r0
    }

    @Override // bsh.UtilEvalError
    public bsh.EvalError toEvalError(java.lang.String r2, bsh.Node r3, bsh.CallStack r4) {
            r1 = this;
            bsh.EvalError r2 = new bsh.EvalError
            java.lang.String r0 = r1.getMessage()
            r2.<init>(r0, r3, r4)
            return r2
    }
}
