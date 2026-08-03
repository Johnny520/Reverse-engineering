package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHAmbiguousName extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    public java.lang.String text;

    public BSHAmbiguousName(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r1, bsh.Interpreter r2) {
            r0 = this;
            bsh.InterpreterError r1 = new bsh.InterpreterError
            java.lang.String r2 = "Don't know how to eval an ambiguous name!  Use toObject() if you want an object."
            r1.<init>(r2)
            throw r1
    }

    public bsh.Name getName(bsh.NameSpace r2) {
            r1 = this;
            java.lang.String r0 = r1.text
            bsh.Name r2 = r2.getNameResolver(r0)
            return r2
    }

    public java.lang.Class<?> toClass(bsh.CallStack r3, bsh.Interpreter r4) {
            r2 = this;
            bsh.NameSpace r4 = r3.top()     // Catch: bsh.UtilEvalError -> Ld java.lang.ClassNotFoundException -> Lf
            bsh.Name r4 = r2.getName(r4)     // Catch: bsh.UtilEvalError -> Ld java.lang.ClassNotFoundException -> Lf
            java.lang.Class r3 = r4.toClass()     // Catch: bsh.UtilEvalError -> Ld java.lang.ClassNotFoundException -> Lf
            return r3
        Ld:
            r4 = move-exception
            goto L11
        Lf:
            r4 = move-exception
            goto L16
        L11:
            bsh.EvalError r3 = r4.toEvalError(r2, r3)
            throw r3
        L16:
            bsh.EvalException r0 = new bsh.EvalException
            java.lang.String r1 = r4.getMessage()
            r0.<init>(r1, r2, r3, r4)
            throw r0
    }

    public bsh.LHS toLHS(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            bsh.NameSpace r0 = r2.top()     // Catch: bsh.UtilEvalError -> Ld
            bsh.Name r0 = r1.getName(r0)     // Catch: bsh.UtilEvalError -> Ld
            bsh.LHS r2 = r0.toLHS(r2, r3)     // Catch: bsh.UtilEvalError -> Ld
            return r2
        Ld:
            r3 = move-exception
            bsh.EvalError r2 = r3.toEvalError(r1, r2)
            throw r2
    }

    public java.lang.Object toObject(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.toObject(r2, r3, r0)
            return r2
    }

    public java.lang.Object toObject(bsh.CallStack r2, bsh.Interpreter r3, boolean r4) {
            r1 = this;
            bsh.NameSpace r0 = r2.top()     // Catch: bsh.UtilEvalError -> Ld
            bsh.Name r0 = r1.getName(r0)     // Catch: bsh.UtilEvalError -> Ld
            java.lang.Object r2 = r0.toObject(r2, r3, r4)     // Catch: bsh.UtilEvalError -> Ld
            return r2
        Ld:
            r3 = move-exception
            bsh.EvalError r2 = r3.toEvalError(r1, r2)
            throw r2
    }

    @Override // bsh.SimpleNode
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r1 = r2.text
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
