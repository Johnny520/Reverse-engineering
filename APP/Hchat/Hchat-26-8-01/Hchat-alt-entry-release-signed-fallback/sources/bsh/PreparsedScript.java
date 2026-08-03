package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class PreparsedScript {
    private final bsh.Interpreter interpreter;
    private final bsh.BshMethod prepared;

    public PreparsedScript(java.lang.String r2) {
            r1 = this;
            java.lang.ClassLoader r0 = getDefaultClassLoader()
            r1.<init>(r2, r0)
            return
    }

    public PreparsedScript(java.lang.String r4, java.lang.ClassLoader r5) {
            r3 = this;
            java.lang.String r0 = "__execute() {"
            r3.<init>()
            bsh.Interpreter r1 = new bsh.Interpreter
            r1.<init>()
            r3.interpreter = r1
            r1.setClassLoader(r5)
            java.io.StringReader r5 = new java.io.StringReader     // Catch: bsh.UtilEvalError -> L47
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: bsh.UtilEvalError -> L47
            r2.<init>(r0)     // Catch: bsh.UtilEvalError -> L47
            java.lang.String r0 = r1.terminatedScript(r4)     // Catch: bsh.UtilEvalError -> L47
            r2.append(r0)     // Catch: bsh.UtilEvalError -> L47
            java.lang.String r0 = "} return this;"
            r2.append(r0)     // Catch: bsh.UtilEvalError -> L47
            java.lang.String r0 = r2.toString()     // Catch: bsh.UtilEvalError -> L47
            r5.<init>(r0)     // Catch: bsh.UtilEvalError -> L47
            bsh.NameSpace r0 = r1.globalNameSpace     // Catch: bsh.UtilEvalError -> L47
            java.lang.String r2 = "pre-parsed script"
            java.lang.String r4 = r1.showEvalString(r2, r4)     // Catch: bsh.UtilEvalError -> L47
            java.lang.Object r4 = r1.eval(r5, r0, r4)     // Catch: bsh.UtilEvalError -> L47
            bsh.This r4 = (bsh.This) r4     // Catch: bsh.UtilEvalError -> L47
            bsh.NameSpace r4 = r4.getNameSpace()     // Catch: bsh.UtilEvalError -> L47
            java.lang.String r5 = "__execute"
            java.lang.Class<?>[] r0 = bsh.Reflect.ZERO_TYPES     // Catch: bsh.UtilEvalError -> L47
            r1 = 0
            bsh.BshMethod r4 = r4.getMethod(r5, r0, r1)     // Catch: bsh.UtilEvalError -> L47
            r3.prepared = r4     // Catch: bsh.UtilEvalError -> L47
            return
        L47:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r4)
            throw r5
    }

    private static java.lang.ClassLoader getDefaultClassLoader() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.SecurityException -> L9
            java.lang.ClassLoader r0 = r0.getContextClassLoader()     // Catch: java.lang.SecurityException -> L9
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto L12
            java.lang.Class<bsh.PreparsedScript> r0 = bsh.PreparsedScript.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
        L12:
            if (r0 != 0) goto L18
            java.lang.ClassLoader r0 = java.lang.ClassLoader.getSystemClassLoader()
        L18:
            return r0
    }

    public java.lang.Object invoke(java.util.Map<java.lang.String, ?> r9) {
            r8 = this;
            bsh.NameSpace r0 = new bsh.NameSpace
            bsh.Interpreter r1 = r8.interpreter
            bsh.NameSpace r2 = r1.globalNameSpace
            bsh.BshClassManager r1 = r1.getClassManager()
            java.lang.String r3 = "BeanshellExecutable"
            r0.<init>(r2, r1, r3)
            r1 = 1
            r0.isMethod = r1
            bsh.Interpreter r4 = new bsh.Interpreter
            bsh.Interpreter r1 = r8.interpreter
            r4.<init>(r0, r1)
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L21:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            r4.set(r2, r1)
            goto L21
        L3b:
            bsh.BshMethod r2 = r8.prepared
            java.lang.Object[] r3 = bsh.Reflect.ZERO_ARGS
            bsh.CallStack r5 = new bsh.CallStack
            r5.<init>(r0)
            bsh.Node r6 = bsh.Node.JAVACODE
            r7 = 1
            java.lang.Object r9 = r2.invoke(r3, r4, r5, r6, r7)
            java.lang.Object r9 = bsh.Primitive.unwrap(r9)
            return r9
    }

    public void setErr(java.io.PrintStream r2) {
            r1 = this;
            bsh.Interpreter r0 = r1.interpreter
            r0.setErr(r2)
            return
    }

    public void setOut(java.io.PrintStream r2) {
            r1 = this;
            bsh.Interpreter r0 = r1.interpreter
            r0.setOut(r2)
            return
    }
}
