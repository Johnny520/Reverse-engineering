package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHClassDeclaration extends bsh.SimpleNode {
    static final java.lang.String CLASSINITNAME = "_bshClassInit";
    private static final long serialVersionUID = 1;
    boolean extend;
    private java.lang.Class<?> generatedClass;
    bsh.Modifiers modifiers;
    java.lang.String name;
    int numInterfaces;
    bsh.ClassGenerator.Type type;

    public BSHClassDeclaration(int r2) {
            r1 = this;
            r1.<init>(r2)
            bsh.Modifiers r2 = new bsh.Modifiers
            r0 = 0
            r2.<init>(r0)
            r1.modifiers = r2
            return
    }

    public static /* synthetic */ boolean a(bsh.BshMethod r0) {
            boolean r0 = lambda$generateClass$0(r0)
            return r0
    }

    private java.lang.Class<?> generateClass(bsh.CallStack r12, bsh.Interpreter r13) {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 0
            r0.<init>(r1)
            boolean r2 = r11.extend
            r3 = 1
            r10 = 0
            if (r2 == 0) goto L66
            bsh.Node r2 = r11.jjtGetChild(r1)
            bsh.BSHAmbiguousName r2 = (bsh.BSHAmbiguousName) r2
            java.lang.Class r2 = r2.toClass(r12, r13)
            bsh.security.MainSecurityGuard r4 = bsh.Interpreter.mainSecurityGuard     // Catch: bsh.UtilEvalError -> L60
            r4.canExtends(r2)     // Catch: bsh.UtilEvalError -> L60
            boolean r4 = bsh.Reflect.isGeneratedClass(r2)
            if (r4 == 0) goto L5d
            bsh.Modifiers r4 = bsh.Reflect.getClassModifiers(r2)
            java.lang.String r5 = "final"
            boolean r4 = r4.hasModifier(r5)
            if (r4 != 0) goto L4d
            bsh.BshMethod[] r4 = bsh.Reflect.getDeclaredMethods(r2)
            java.util.stream.Stream r4 = java.util.stream.Stream.of(r4)
            bsh.a r5 = new bsh.a
            r6 = 0
            r5.<init>(r6)
            java.util.stream.Stream r4 = r4.filter(r5)
            java.util.stream.Collector r5 = java.util.stream.Collectors.toList()
            java.lang.Object r4 = r4.collect(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r0.addAll(r4)
            goto L5d
        L4d:
            bsh.EvalException r0 = new bsh.EvalException
            java.lang.String r1 = r2.getName()
            java.lang.String r2 = "Cannot inherit from final class "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1, r10, r10)
            throw r0
        L5d:
            r5 = r2
            r2 = r3
            goto L68
        L60:
            r0 = move-exception
            bsh.EvalError r0 = r0.toEvalError(r11, r12)
            throw r0
        L66:
            r2 = r1
            r5 = r10
        L68:
            int r4 = r11.numInterfaces
            java.lang.Class[] r4 = new java.lang.Class[r4]
        L6c:
            int r6 = r11.numInterfaces
            if (r1 >= r6) goto Laa
            int r6 = r2 + 1
            bsh.Node r2 = r11.jjtGetChild(r2)
            bsh.BSHAmbiguousName r2 = (bsh.BSHAmbiguousName) r2
            java.lang.Class r7 = r2.toClass(r12, r13)
            r4[r1] = r7
            boolean r7 = r7.isInterface()
            if (r7 == 0) goto L95
            bsh.security.MainSecurityGuard r2 = bsh.Interpreter.mainSecurityGuard     // Catch: bsh.UtilEvalError -> L8f
            r7 = r4[r1]     // Catch: bsh.UtilEvalError -> L8f
            r2.canImplements(r7)     // Catch: bsh.UtilEvalError -> L8f
            int r1 = r1 + 1
            r2 = r6
            goto L6c
        L8f:
            r0 = move-exception
            bsh.EvalError r0 = r0.toEvalError(r11, r12)
            throw r0
        L95:
            bsh.EvalException r0 = new bsh.EvalException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Type: "
            r1.<init>(r3)
            java.lang.String r2 = r2.text
            java.lang.String r3 = " is not an interface!"
            java.lang.String r1 = eh.a.r(r1, r2, r3)
            r0.<init>(r1, r11, r12)
            throw r0
        Laa:
            bsh.Node r1 = r11.jjtGetChild(r2)
            r6 = r1
            bsh.BSHBlock r6 = (bsh.BSHBlock) r6
            bsh.ClassGenerator$Type r1 = r11.type
            bsh.ClassGenerator$Type r2 = bsh.ClassGenerator.Type.INTERFACE
            if (r1 != r2) goto Lbc
            bsh.Modifiers r1 = r11.modifiers
            r1.changeContext(r3)
        Lbc:
            bsh.ClassGenerator r1 = bsh.ClassGenerator.getClassGenerator()
            java.lang.String r2 = r11.name
            bsh.Modifiers r3 = r11.modifiers
            bsh.ClassGenerator$Type r7 = r11.type
            r8 = r12
            r9 = r13
            java.lang.Class r1 = r1.generateClass(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Iterator r0 = r0.iterator()
        Ld0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L114
            java.lang.Object r2 = r0.next()
            bsh.BshMethod r2 = (bsh.BshMethod) r2
            java.lang.String r3 = r2.getName()
            java.lang.Class[] r4 = r2.getParameterTypes()
            bsh.BshMethod r3 = bsh.Reflect.getDeclaredMethod(r1, r3, r4)
            if (r3 != 0) goto Leb
            goto Ld0
        Leb:
            bsh.EvalException r0 = new bsh.EvalException
            java.lang.String r1 = r2.getName()
            java.lang.String r2 = bsh.StringUtil.typeString(r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot override "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "() in "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = " overridden method is final"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1, r10, r10)
            throw r0
        L114:
            return r1
    }

    private static /* synthetic */ boolean lambda$generateClass$0(bsh.BshMethod r1) {
            java.lang.String r0 = "final"
            boolean r0 = r1.hasModifier(r0)
            if (r0 == 0) goto L12
            java.lang.String r0 = "private"
            boolean r1 = r1.hasModifier(r0)
            if (r1 != 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    @Override // bsh.SimpleNode, bsh.Node
    public synchronized java.lang.Object eval(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            monitor-enter(r1)
            java.lang.Class<?> r0 = r1.generatedClass     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto Le
            java.lang.Class r2 = r1.generateClass(r2, r3)     // Catch: java.lang.Throwable -> Lc
            r1.generatedClass = r2     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            r2 = move-exception
            goto L12
        Le:
            java.lang.Class<?> r2 = r1.generatedClass     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return r2
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
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
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
