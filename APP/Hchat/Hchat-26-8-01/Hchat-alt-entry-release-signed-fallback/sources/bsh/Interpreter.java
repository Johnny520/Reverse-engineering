package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Interpreter implements java.lang.Runnable, java.io.Serializable, bsh.BshClassManager.Listener {
    public static boolean COMPATIBIILTY = false;
    public static final java.lang.ThreadLocal<java.lang.Boolean> DEBUG = null;
    private static final bsh.This SYSTEM_OBJECT = null;
    public static boolean TRACE = false;
    public static final java.lang.String VERSION = "3.0.0.beta12";
    public static final bsh.security.MainSecurityGuard mainSecurityGuard = null;
    private static final long serialVersionUID = 1;
    private boolean EOF;
    private boolean compatibility;
    bsh.ConsoleAssignable console;
    protected boolean evalOnly;
    private boolean exitOnEOF;
    bsh.NameSpace globalNameSpace;
    protected boolean interactive;
    bsh.Interpreter parent;
    transient bsh.Parser parser;
    private boolean showResults;
    java.lang.String sourceFileInfo;
    private boolean strictJava;
    private int yield_for;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Console implements bsh.ConsoleAssignable, java.io.Serializable {
        public static transient java.io.PrintStream debug = null;
        private static final long serialVersionUID = 1;
        public static java.lang.String systemLineSeparator = "\n";
        private bsh.ConsoleInterface console;
        private transient java.io.PrintStream err;
        private transient java.io.Reader in;
        private transient java.io.PrintStream out;

        static {
                java.io.PrintStream r0 = java.lang.System.err
                bsh.Interpreter.Console.debug = r0
                return
        }

        public Console(bsh.ConsoleInterface r2) {
                r1 = this;
                r1.<init>()
                r1.console = r2
                java.io.Reader r0 = r2.getIn()
                r1.in = r0
                java.io.PrintStream r0 = r2.getOut()
                r1.out = r0
                java.io.PrintStream r2 = r2.getErr()
                r1.err = r2
                bsh.Interpreter.Console.debug = r2
                return
        }

        public Console(java.io.Reader r2, java.io.PrintStream r3, java.io.PrintStream r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.console = r0
                r1.in = r2
                r1.out = r3
                r1.err = r4
                bsh.Interpreter.Console.debug = r4
                return
        }

        @Override // bsh.ConsoleInterface
        public void error(java.lang.Object r4) {
                r3 = this;
                bsh.ConsoleInterface r0 = r3.console
                java.lang.String r1 = "// Error: "
                if (r0 == 0) goto L1b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = bsh.Interpreter.Console.systemLineSeparator
                r2.append(r4)
                java.lang.String r4 = r2.toString()
                r0.error(r4)
                return
            L1b:
                java.io.PrintStream r0 = r3.out
                if (r0 == 0) goto L2e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.println(r4)
            L2e:
                return
        }

        @Override // bsh.ConsoleInterface
        public java.io.PrintStream getErr() {
                r1 = this;
                java.io.PrintStream r0 = r1.err
                if (r0 != 0) goto L8
                java.io.PrintStream r0 = java.lang.System.err
                r1.err = r0
            L8:
                java.io.PrintStream r0 = r1.err
                return r0
        }

        @Override // bsh.ConsoleInterface
        public java.io.Reader getIn() {
                r1 = this;
                java.io.Reader r0 = r1.in
                return r0
        }

        @Override // bsh.ConsoleInterface
        public java.io.PrintStream getOut() {
                r1 = this;
                java.io.PrintStream r0 = r1.out
                if (r0 != 0) goto L8
                java.io.PrintStream r0 = java.lang.System.out
                r1.out = r0
            L8:
                java.io.PrintStream r0 = r1.out
                return r0
        }

        @Override // bsh.ConsoleInterface
        public void print(java.lang.Object r2) {
                r1 = this;
                bsh.ConsoleInterface r0 = r1.console
                if (r0 == 0) goto L8
                r0.print(r2)
                return
            L8:
                java.io.PrintStream r0 = r1.out
                if (r0 == 0) goto L14
                r0.print(r2)
                java.io.PrintStream r2 = r1.out
                r2.flush()
            L14:
                return
        }

        @Override // bsh.ConsoleInterface
        public void println(java.lang.Object r2) {
                r1 = this;
                bsh.ConsoleInterface r0 = r1.console
                if (r0 == 0) goto L8
                r0.println(r2)
                return
            L8:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = bsh.Interpreter.Console.systemLineSeparator
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.print(r2)
                return
        }

        @Override // bsh.ConsoleInterface
        public void prompt(java.lang.String r2) {
                r1 = this;
                bsh.ConsoleInterface r0 = r1.console
                if (r0 == 0) goto L8
                r0.prompt(r2)
                return
            L8:
                r1.print(r2)
                return
        }

        @Override // bsh.ConsoleAssignable
        public void setErr(java.io.PrintStream r1) {
                r0 = this;
                r0.err = r1
                return
        }

        @Override // bsh.ConsoleAssignable
        public void setIn(java.io.Reader r1) {
                r0 = this;
                r0.in = r1
                return
        }

        @Override // bsh.ConsoleAssignable
        public void setOut(java.io.PrintStream r1) {
                r0 = this;
                r0.out = r1
                return
        }
    }

    static {
            bsh.h r0 = new bsh.h
            r1 = 0
            r0.<init>(r1)
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            bsh.Interpreter.DEBUG = r0
            bsh.NameSpace r0 = new bsh.NameSpace
            java.lang.String r1 = "bsh.system"
            r2 = 0
            r0.<init>(r2, r2, r1)
            bsh.This r0 = bsh.This.getThis(r0, r2)
            bsh.Interpreter.SYSTEM_OBJECT = r0
            bsh.security.MainSecurityGuard r0 = new bsh.security.MainSecurityGuard
            r0.<init>()
            bsh.Interpreter.mainSecurityGuard = r0
            return
    }

    public Interpreter() {
            r2 = this;
            java.lang.String r0 = ""
            r1 = 0
            r2.<init>(r1, r1, r0)
            r2.sourceFileInfo = r1
            return
    }

    public Interpreter(bsh.ConsoleAssignable r5, boolean r6, bsh.NameSpace r7, bsh.Interpreter r8, java.lang.String r9) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.strictJava = r0
            r0 = -1
            r4.yield_for = r0
            r0 = 1
            r4.exitOnEOF = r0
            r4.showResults = r0
            boolean r0 = bsh.Interpreter.COMPATIBIILTY
            r4.compatibility = r0
            java.lang.ThreadLocal<java.lang.Boolean> r0 = bsh.Interpreter.DEBUG
            java.lang.Object r1 = r0.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L25
            long r1 = java.lang.System.nanoTime()
            goto L27
        L25:
            r1 = 0
        L27:
            r4.interactive = r6
            r4.parent = r8
            if (r8 == 0) goto L3a
            boolean r3 = r8.strictJava
            r4.setStrictJava(r3)
            bsh.Parser r3 = r8.parser
            r4.parser = r3
            boolean r8 = r8.evalOnly
            r4.evalOnly = r8
        L3a:
            r4.sourceFileInfo = r9
            if (r7 != 0) goto L4a
            bsh.BshClassManager r8 = bsh.BshClassManager.createClassManager(r4)
            bsh.NameSpace r9 = new bsh.NameSpace
            java.lang.String r3 = "global"
            r9.<init>(r7, r8, r3)
            r7 = r9
        L4a:
            r4.setConsole(r5)
            r4.setNameSpace(r7)
            bsh.BshClassManager r5 = r4.getClassManager()
            r5.addListener(r4)
            java.lang.Object r5 = r0.get()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L7d
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r1
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.String r7 = " nanoseconds."
            java.lang.String r8 = "Time to initialize interpreter: interactive="
            java.lang.String r9 = " "
            java.lang.Object[] r5 = new java.lang.Object[]{r8, r5, r9, r6, r7}
            debug(r5)
        L7d:
            return
    }

    public Interpreter(bsh.ConsoleInterface r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public Interpreter(bsh.ConsoleInterface r2, bsh.Interpreter r3) {
            r1 = this;
            bsh.NameSpace r0 = r3.globalNameSpace
            r1.<init>(r2, r0, r3)
            return
    }

    public Interpreter(bsh.ConsoleInterface r2, bsh.NameSpace r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public Interpreter(bsh.ConsoleInterface r7, bsh.NameSpace r8, bsh.Interpreter r9) {
            r6 = this;
            bsh.Interpreter$Console r1 = new bsh.Interpreter$Console
            r1.<init>(r7)
            if (r9 != 0) goto La
            r7 = 0
        L8:
            r5 = r7
            goto Ld
        La:
            java.lang.String r7 = r9.sourceFileInfo
            goto L8
        Ld:
            r2 = 1
            r0 = r6
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Interpreter(bsh.Interpreter r7) {
            r6 = this;
            bsh.ConsoleAssignable r1 = r7.console
            boolean r2 = r7.interactive
            bsh.NameSpace r3 = r7.globalNameSpace
            java.lang.String r5 = r7.sourceFileInfo
            r0 = r6
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Interpreter(bsh.NameSpace r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public Interpreter(bsh.NameSpace r2, bsh.Interpreter r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public Interpreter(bsh.NameSpace r9, bsh.Interpreter r10, java.lang.String r11) {
            r8 = this;
            java.io.PrintStream r2 = java.lang.System.out
            java.io.PrintStream r3 = java.lang.System.err
            r4 = 0
            r1 = 0
            r0 = r8
            r5 = r9
            r6 = r10
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9 = 1
            r0.evalOnly = r9
            java.lang.String r9 = "bsh.evalOnly"
            bsh.Primitive r10 = bsh.Primitive.TRUE
            r8.setu(r9, r10)
            return
    }

    public Interpreter(bsh.NameSpace r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public Interpreter(java.io.Reader r7, java.io.PrintStream r8, java.io.PrintStream r9, boolean r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Interpreter(java.io.Reader r9, java.io.PrintStream r10, java.io.PrintStream r11, boolean r12, bsh.NameSpace r13) {
            r8 = this;
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public Interpreter(java.io.Reader r2, java.io.PrintStream r3, java.io.PrintStream r4, boolean r5, bsh.NameSpace r6, bsh.Interpreter r7, java.lang.String r8) {
            r1 = this;
            r0 = r3
            bsh.Interpreter$Console r3 = new bsh.Interpreter$Console
            r3.<init>(r2, r0, r4)
            r2 = r1
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    private void _yield() {
            r2 = this;
            int r0 = r2.yield_for
            if (r0 >= 0) goto L5
            goto L9
        L5:
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L9
        L9:
            return
    }

    public static /* synthetic */ java.lang.Boolean a() {
            java.lang.Boolean r0 = lambda$static$0()
            return r0
    }

    public static final void debug(java.lang.Object... r4) {
            java.lang.ThreadLocal<java.lang.Boolean> r0 = bsh.Interpreter.DEBUG
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L1f
            r3 = r4[r2]
            r0.append(r3)
            int r2 = r2 + 1
            goto L15
        L1f:
            java.io.PrintStream r4 = bsh.Interpreter.Console.debug
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "// Debug: "
            java.lang.String r0 = r1.concat(r0)
            r4.println(r0)
        L2e:
            return
    }

    private java.lang.String getBshPrompt() {
            r4 = this;
            java.lang.ThreadLocal<java.lang.Boolean> r0 = bsh.Interpreter.DEBUG
            java.lang.Object r1 = r0.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            if (r2 == 0) goto L13
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.set(r3)
        L13:
            java.lang.String r3 = "getBshPrompt()"
            java.lang.Object r3 = r4.eval(r3)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L23
            if (r2 == 0) goto L20
            r0.set(r1)
        L20:
            return r3
        L21:
            r0 = move-exception
            goto L2d
        L23:
            java.lang.String r0 = "bsh % "
            if (r2 == 0) goto L2c
            java.lang.ThreadLocal<java.lang.Boolean> r2 = bsh.Interpreter.DEBUG
            r2.set(r1)
        L2c:
            return r0
        L2d:
            if (r2 == 0) goto L34
            java.lang.ThreadLocal<java.lang.Boolean> r2 = bsh.Interpreter.DEBUG
            r2.set(r1)
        L34:
            throw r0
    }

    public static boolean getSaveClasses() {
            java.lang.String r0 = getSaveClassesDir()
            if (r0 == 0) goto L12
            java.lang.String r0 = getSaveClassesDir()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public static java.lang.String getSaveClassesDir() {
            java.lang.String r0 = "bsh.debugClasses"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            return r0
    }

    private bsh.JJTParserState get_jjtree() {
            r1 = this;
            bsh.Parser r0 = r1.parser
            bsh.JJTParserState r0 = r0.jjtree
            return r0
    }

    private void initRootSystemObject() {
            r4 = this;
            bsh.BshClassManager r0 = r4.getClassManager()
            bsh.NameSpace r1 = new bsh.NameSpace
            java.lang.String r2 = "Bsh Object"
            r3 = 0
            r1.<init>(r3, r0, r2)
            bsh.This r1 = r1.getThis(r4)
            java.lang.String r2 = "bsh"
            r4.setu(r2, r1)
            bsh.This r1 = bsh.Interpreter.SYSTEM_OBJECT
            java.lang.String r2 = "bsh.system"
            r4.setu(r2, r1)
            java.lang.String r2 = "bsh.shared"
            r4.setu(r2, r1)
            bsh.NameSpace r1 = new bsh.NameSpace
            java.lang.String r2 = "Bsh Command Help Text"
            r1.<init>(r3, r0, r2)
            bsh.This r0 = r1.getThis(r4)
            java.lang.String r1 = "bsh.help"
            r4.setu(r1, r0)
            java.lang.String r0 = "user.dir"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "bsh.cwd"
            r4.setu(r1, r0)
            boolean r0 = r4.interactive
            if (r0 == 0) goto L43
            bsh.Primitive r0 = bsh.Primitive.TRUE
            goto L45
        L43:
            bsh.Primitive r0 = bsh.Primitive.FALSE
        L45:
            java.lang.String r1 = "bsh.interactive"
            r4.setu(r1, r0)
            java.lang.String r0 = "bsh.evalOnly"
            bsh.Primitive r1 = bsh.Primitive.FALSE
            r4.setu(r0, r1)
            java.lang.String r0 = "bsh.version"
            java.lang.String r1 = "3.0.0.beta12"
            r4.setu(r0, r1)
            return
    }

    public static void invokeMain(java.lang.Class<?> r3, java.lang.String[] r4) {
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            r1 = 1
            java.lang.String r2 = "main"
            bsh.Invocable r3 = bsh.Reflect.resolveJavaMethod(r3, r2, r0, r1)
            if (r3 == 0) goto L17
            r0 = 0
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r3.invoke(r0, r4)
        L17:
            return
    }

    private static /* synthetic */ java.lang.Boolean lambda$static$0() {
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
    }

    public static void main(java.lang.String[] r6) {
            java.lang.String r0 = "Class: "
            int r1 = r6.length
            r2 = 1
            if (r1 <= 0) goto Lc5
            r1 = 0
            r3 = r6[r1]
            int r4 = r6.length
            if (r4 <= r2) goto L16
            int r4 = r6.length
            int r4 = r4 - r2
            java.lang.String[] r4 = new java.lang.String[r4]
            int r5 = r6.length
            int r5 = r5 - r2
            java.lang.System.arraycopy(r6, r2, r4, r1, r5)
            goto L18
        L16:
            java.lang.String[] r4 = new java.lang.String[r1]
        L18:
            bsh.Interpreter r6 = new bsh.Interpreter     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            r6.<init>()     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            java.lang.String r1 = "bsh.args"
            r6.setu(r1, r4)     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            bsh.NameSpace r1 = r6.globalNameSpace     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            java.lang.Object r6 = r6.source(r3, r1)     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            boolean r1 = r6 instanceof java.lang.Class     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            if (r1 == 0) goto L10d
            r1 = r6
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Exception -> L34
            invokeMain(r1, r4)     // Catch: java.lang.Exception -> L34
            goto L10d
        L34:
            r1 = move-exception
            boolean r2 = r1 instanceof java.lang.reflect.InvocationTargetException     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            if (r2 == 0) goto L3d
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
        L3d:
            java.io.PrintStream r2 = java.lang.System.err     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            r3.<init>(r0)     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            r3.append(r6)     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            java.lang.String r6 = " main method threw exception:"
            r3.append(r6)     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            r3.append(r1)     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            java.lang.String r6 = r3.toString()     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            r2.println(r6)     // Catch: java.io.IOException -> L58 bsh.EvalError -> L6e bsh.TargetError -> L84 java.io.FileNotFoundException -> Lb0
            goto L10d
        L58:
            r6 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "I/O Error: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.println(r6)
            goto L10d
        L6e:
            r6 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Evaluation Error: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.println(r6)
            goto L10d
        L84:
            r6 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Script threw exception: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            boolean r0 = r6.inNativeCode()
            if (r0 == 0) goto L10d
            java.lang.ThreadLocal<java.lang.Boolean> r0 = bsh.Interpreter.DEBUG
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.io.PrintStream r1 = java.lang.System.err
            r6.printStackTrace(r0, r1)
            goto L10d
        Lb0:
            r6 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "File not found: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.println(r6)
            goto L10d
        Lc5:
            bsh.FileReader r6 = new bsh.FileReader     // Catch: java.io.IOException -> Lf9
            java.io.InputStream r0 = java.lang.System.in     // Catch: java.io.IOException -> Lf9
            r6.<init>(r0)     // Catch: java.io.IOException -> Lf9
            bsh.CommandLineReader r0 = new bsh.CommandLineReader     // Catch: java.lang.Throwable -> Le4
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Le4
            bsh.Interpreter r1 = new bsh.Interpreter     // Catch: java.lang.Throwable -> Le6
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Throwable -> Le6
            java.io.PrintStream r4 = java.lang.System.err     // Catch: java.lang.Throwable -> Le6
            r1.<init>(r0, r3, r4, r2)     // Catch: java.lang.Throwable -> Le6
            r1.run()     // Catch: java.lang.Throwable -> Le6
            r0.close()     // Catch: java.lang.Throwable -> Le4
            r6.close()     // Catch: java.io.IOException -> Lf9
            return
        Le4:
            r0 = move-exception
            goto Lf0
        Le6:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Leb
            goto Lef
        Leb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> Le4
        Lef:
            throw r1     // Catch: java.lang.Throwable -> Le4
        Lf0:
            r6.close()     // Catch: java.lang.Throwable -> Lf4
            goto Lf8
        Lf4:
            r6 = move-exception
            r0.addSuppressed(r6)     // Catch: java.io.IOException -> Lf9
        Lf8:
            throw r0     // Catch: java.io.IOException -> Lf9
        Lf9:
            r6 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "I/O Error closing command line reader: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.println(r6)
        L10d:
            return
    }

    private java.lang.String preprocessScript(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = bsh.preprocess.AnnotationIgnorePreprocess.rewrite(r1)
            java.lang.String r1 = bsh.preprocess.DefaultArgsDesugar.rewrite(r1)
            java.lang.String r1 = bsh.preprocess.KtStringTemplate.rewrite(r1)
            java.lang.String r1 = bsh.preprocess.ImplicitDefaultConstructorPreprocess.rewrite(r1)
            return r1
    }

    private boolean readLine() {
            r2 = this;
            bsh.Parser r0 = r2.parser     // Catch: bsh.ParseException -> L7
            boolean r0 = r0.Line()     // Catch: bsh.ParseException -> L7
            return r0
        L7:
            r0 = move-exception
            r2._yield()
            boolean r1 = r2.EOF
            if (r1 == 0) goto L11
            r0 = 1
            return r0
        L11:
            throw r0
    }

    private void readObject(java.io.ObjectInputStream r1) {
            r0 = this;
            r1.defaultReadObject()
            java.io.PrintStream r1 = java.lang.System.out
            r0.setOut(r1)
            java.io.PrintStream r1 = java.lang.System.err
            r0.setErr(r1)
            return
    }

    private java.lang.String readSource(java.io.Reader r5, java.lang.String r6) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L17
            r1 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1)     // Catch: java.io.IOException -> L17
            r1 = 4096(0x1000, float:5.74E-42)
            char[] r1 = new char[r1]     // Catch: java.io.IOException -> L17
        Lb:
            int r2 = r5.read(r1)     // Catch: java.io.IOException -> L17
            r3 = -1
            if (r2 == r3) goto L19
            r3 = 0
            r0.append(r1, r3, r2)     // Catch: java.io.IOException -> L17
            goto Lb
        L17:
            r5 = move-exception
            goto L1e
        L19:
            java.lang.String r5 = r0.toString()     // Catch: java.io.IOException -> L17
            return r5
        L1e:
            bsh.EvalError r0 = new bsh.EvalError
            java.lang.String r1 = "Sourced file: "
            java.lang.String r2 = " read error: "
            java.lang.StringBuilder r6 = bc.e.o(r1, r6, r2)
            java.lang.String r1 = r5.getMessage()
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r1 = 0
            r0.<init>(r6, r1, r1, r5)
            throw r0
    }

    public static void redirectOutputToFile(java.lang.String r4) {
            java.io.PrintStream r0 = new java.io.PrintStream     // Catch: java.io.IOException -> L14
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L14
            r1.<init>(r4)     // Catch: java.io.IOException -> L14
            java.lang.String r2 = "UTF-8"
            r3 = 1
            r0.<init>(r1, r3, r2)     // Catch: java.io.IOException -> L14
            java.lang.System.setOut(r0)     // Catch: java.io.IOException -> L14
            java.lang.System.setErr(r0)     // Catch: java.io.IOException -> L14
            return
        L14:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't redirect output to file: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.println(r4)
            return
    }

    public static void setShutdownOnExit(boolean r3) {
            bsh.This r0 = bsh.Interpreter.SYSTEM_OBJECT     // Catch: bsh.UtilEvalError -> L11
            bsh.NameSpace r0 = r0.getNameSpace()     // Catch: bsh.UtilEvalError -> L11
            java.lang.String r1 = "shutdownOnExit"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: bsh.UtilEvalError -> L11
            r2 = 0
            r0.setVariable(r1, r3, r2)     // Catch: bsh.UtilEvalError -> L11
            return
        L11:
            r3 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
    }

    public static void staticInit() {
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L4c java.lang.SecurityException -> L61
            bsh.Interpreter.Console.systemLineSeparator = r0     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L4c java.lang.SecurityException -> L61
            java.io.PrintStream r0 = java.lang.System.err     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L4c java.lang.SecurityException -> L61
            bsh.Interpreter.Console.debug = r0     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L4c java.lang.SecurityException -> L61
            java.lang.ThreadLocal<java.lang.Boolean> r0 = bsh.Interpreter.DEBUG     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L4c java.lang.SecurityException -> L61
            java.lang.String r1 = "debug"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L4c java.lang.SecurityException -> L61
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L4c java.lang.SecurityException -> L61
            r0.set(r1)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L4c java.lang.SecurityException -> L61
            java.lang.String r0 = "trace"
            boolean r0 = java.lang.Boolean.getBoolean(r0)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L4c java.lang.SecurityException -> L61
            bsh.Interpreter.TRACE = r0     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L4c java.lang.SecurityException -> L61
            java.lang.String r0 = "bsh.compatibility"
            boolean r0 = java.lang.Boolean.getBoolean(r0)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L4c java.lang.SecurityException -> L61
            bsh.Interpreter.COMPATIBIILTY = r0     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L4c java.lang.SecurityException -> L61
            java.lang.String r0 = "outfile"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L4c java.lang.SecurityException -> L61
            if (r0 == 0) goto L75
            redirectOutputToFile(r0)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L4c java.lang.SecurityException -> L61
            return
        L37:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not init static(3):"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.println(r0)
            goto L75
        L4c:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not init static(2):"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.println(r0)
            goto L75
        L61:
            r0 = move-exception
            java.io.PrintStream r1 = java.lang.System.err
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not init static:"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.println(r0)
        L75:
            return
    }

    private void stripSnapshotRuntimeState(bsh.Node r5) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L3c
        L3:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r5)
        Lb:
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L3c
            int r5 = r0.size()
            int r5 = r5 + (-1)
            java.lang.Object r5 = r0.remove(r5)
            bsh.Node r5 = (bsh.Node) r5
            boolean r1 = r5 instanceof bsh.SimpleNode
            if (r1 == 0) goto Lb
            bsh.SimpleNode r5 = (bsh.SimpleNode) r5
            r1 = 0
            r5.firstToken = r1
            r5.lastToken = r1
            r5.parser = r1
            bsh.Node[] r5 = r5.jjtGetChildren()
            int r1 = r5.length
            r2 = 0
        L30:
            if (r2 >= r1) goto Lb
            r3 = r5[r2]
            if (r3 == 0) goto L39
            r0.add(r3)
        L39:
            int r2 = r2 + 1
            goto L30
        L3c:
            return
    }

    public void addClassLoader(java.lang.ClassLoader r2) {
            r1 = this;
            bsh.BshClassManager r0 = r1.getClassManager()
            r0.addClassLoader(r2)
            return
    }

    @Override // bsh.BshClassManager.Listener
    public void classLoaderChanged() {
            r1 = this;
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = bsh.Reflect.instanceCache
            r0.clear()
            return
    }

    public bsh.snapshot.BshSnapshot compileSnapshot(java.io.Reader r11, bsh.NameSpace r12, java.lang.String r13) {
            r10 = this;
            java.lang.String r1 = "Sourced file: "
            java.lang.String r11 = r10.readSource(r11, r13)
            java.lang.String r11 = r10.preprocessScript(r11)
            bsh.Interpreter r2 = new bsh.Interpreter
            java.io.StringReader r3 = new java.io.StringReader
            java.lang.String r11 = r10.terminatedScript(r11)
            r3.<init>(r11)
            java.io.PrintStream r4 = r10.getOut()
            java.io.PrintStream r5 = r10.getErr()
            r6 = 0
            r8 = r10
            r7 = r12
            r9 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r12 = 0
            r13 = r12
        L2b:
            if (r13 != 0) goto Ld6
            r13 = 0
            boolean r0 = r2.readLine()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 bsh.TokenMgrException -> L55 bsh.InterpreterError -> L58 bsh.ParseException -> L5b
            bsh.JJTParserState r3 = r2.get_jjtree()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 bsh.TokenMgrException -> L55 bsh.InterpreterError -> L58 bsh.ParseException -> L5b
            int r3 = r3.nodeArity()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 bsh.TokenMgrException -> L55 bsh.InterpreterError -> L58 bsh.ParseException -> L5b
            if (r3 <= 0) goto L5e
            bsh.JJTParserState r3 = r2.get_jjtree()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 bsh.TokenMgrException -> L55 bsh.InterpreterError -> L58 bsh.ParseException -> L5b
            bsh.Node r3 = r3.rootNode()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 bsh.TokenMgrException -> L55 bsh.InterpreterError -> L58 bsh.ParseException -> L5b
            r3.setSourceFile(r9)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 bsh.TokenMgrException -> L55 bsh.InterpreterError -> L58 bsh.ParseException -> L5b
            r10.stripSnapshotRuntimeState(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 bsh.TokenMgrException -> L55 bsh.InterpreterError -> L58 bsh.ParseException -> L5b
            r11.add(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L52 bsh.TokenMgrException -> L55 bsh.InterpreterError -> L58 bsh.ParseException -> L5b
            goto L5e
        L4e:
            r0 = move-exception
            r11 = r0
            goto Lce
        L52:
            r0 = move-exception
            r11 = r0
            goto L67
        L55:
            r0 = move-exception
            r11 = r0
            goto L88
        L58:
            r0 = move-exception
            r11 = r0
            goto La9
        L5b:
            r0 = move-exception
            r11 = r0
            goto Lca
        L5e:
            bsh.JJTParserState r13 = r2.get_jjtree()
            r13.reset()
            r13 = r0
            goto L2b
        L67:
            bsh.EvalError r12 = new bsh.EvalError     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            r0.append(r9)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = " unknown error: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r11.getMessage()     // Catch: java.lang.Throwable -> L4e
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4e
            r12.<init>(r0, r13, r13, r11)     // Catch: java.lang.Throwable -> L4e
            throw r12     // Catch: java.lang.Throwable -> L4e
        L88:
            bsh.EvalError r12 = new bsh.EvalError     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            r0.append(r9)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = " Token Parsing Error: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r11.getMessage()     // Catch: java.lang.Throwable -> L4e
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4e
            r12.<init>(r0, r13, r13, r11)     // Catch: java.lang.Throwable -> L4e
            throw r12     // Catch: java.lang.Throwable -> L4e
        La9:
            bsh.EvalError r12 = new bsh.EvalError     // Catch: java.lang.Throwable -> L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            r0.append(r9)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = " internal Error: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r11.getMessage()     // Catch: java.lang.Throwable -> L4e
            r0.append(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L4e
            r12.<init>(r0, r13, r13, r11)     // Catch: java.lang.Throwable -> L4e
            throw r12     // Catch: java.lang.Throwable -> L4e
        Lca:
            r11.setErrorSourceFile(r9)     // Catch: java.lang.Throwable -> L4e
            throw r11     // Catch: java.lang.Throwable -> L4e
        Lce:
            bsh.JJTParserState r12 = r2.get_jjtree()
            r12.reset()
            throw r11
        Ld6:
            bsh.snapshot.BshSnapshot r13 = new bsh.snapshot.BshSnapshot
            bsh.Node[] r12 = new bsh.Node[r12]
            java.lang.Object[] r11 = r11.toArray(r12)
            bsh.Node[] r11 = (bsh.Node[]) r11
            r13.<init>(r11)
            return r13
    }

    public bsh.snapshot.BshSnapshot compileSnapshot(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "snapshot string"
            bsh.snapshot.BshSnapshot r2 = r1.compileSnapshot(r2, r0)
            return r2
    }

    public bsh.snapshot.BshSnapshot compileSnapshot(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.io.StringReader r0 = new java.io.StringReader
            java.lang.String r2 = r1.terminatedScript(r2)
            r0.<init>(r2)
            bsh.NameSpace r2 = r1.globalNameSpace
            bsh.snapshot.BshSnapshot r2 = r1.compileSnapshot(r0, r2, r3)
            return r2
    }

    public void compileSnapshot(java.lang.String r3, java.lang.String r4, javax.crypto.SecretKey r5) {
            r2 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            bsh.FileReader r1 = new bsh.FileReader
            r1.<init>(r3)
            r0.<init>(r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L1f
            bsh.NameSpace r4 = r2.globalNameSpace     // Catch: java.lang.Throwable -> L21
            bsh.snapshot.BshSnapshot r3 = r2.compileSnapshot(r0, r4, r3)     // Catch: java.lang.Throwable -> L21
            bsh.snapshot.BshSnapshotHelper.writeEncrypted(r3, r1, r5)     // Catch: java.lang.Throwable -> L21
            r1.close()     // Catch: java.lang.Throwable -> L1f
            r0.close()
            return
        L1f:
            r3 = move-exception
            goto L26
        L21:
            r3 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L1f
            throw r3     // Catch: java.lang.Throwable -> L1f
        L26:
            r0.close()
            throw r3
    }

    public final void error(java.lang.Object r2) {
            r1 = this;
            bsh.ConsoleAssignable r0 = r1.console
            r0.error(r2)
            return
    }

    public java.lang.Object eval(java.io.Reader r3) {
            r2 = this;
            bsh.NameSpace r0 = r2.globalNameSpace
            java.lang.String r1 = r2.sourceFileInfo
            if (r1 != 0) goto L8
            java.lang.String r1 = "eval stream"
        L8:
            java.lang.Object r3 = r2.eval(r3, r0, r1)
            return r3
    }

    public java.lang.Object eval(java.io.Reader r11, bsh.NameSpace r12, java.lang.String r13) {
            r10 = this;
            java.lang.String r1 = "Sourced file: "
            java.lang.String r11 = r10.readSource(r11, r13)
            java.lang.String r11 = r10.preprocessScript(r11)
            java.lang.String r0 = "eval: nameSpace = "
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r12}
            debug(r0)
            bsh.Interpreter r2 = new bsh.Interpreter
            java.io.StringReader r3 = new java.io.StringReader
            java.lang.String r11 = r10.terminatedScript(r11)
            r3.<init>(r11)
            java.io.PrintStream r4 = r10.getOut()
            java.io.PrintStream r5 = r10.getErr()
            r6 = 0
            r8 = r10
            r7 = r12
            r9 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            bsh.CallStack r11 = new bsh.CallStack
            r11.<init>(r7)
            r12 = 0
            r13 = 0
            r0 = r13
            r13 = r12
        L36:
            if (r0 != 0) goto L1d3
            r3 = 1
            boolean r0 = r2.readLine()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            bsh.JJTParserState r4 = r2.get_jjtree()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            int r4 = r4.nodeArity()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            if (r4 <= 0) goto Lc8
            bsh.JJTParserState r12 = r2.get_jjtree()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            bsh.Node r13 = r12.rootNode()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            r13.setSourceFile(r9)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            boolean r12 = bsh.Interpreter.TRACE     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            if (r12 == 0) goto L8a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            r12.<init>()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            java.lang.String r4 = "// "
            r12.append(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            java.lang.String r4 = r13.getText()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            r12.append(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            r10.println(r12)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            goto L8a
        L6f:
            r0 = move-exception
            r12 = r0
            goto L1bf
        L73:
            r0 = move-exception
            r12 = r0
            goto Ldd
        L76:
            r0 = move-exception
            r12 = r0
            goto L10f
        L7a:
            r0 = move-exception
            r12 = r0
            goto L130
        L7e:
            r0 = move-exception
            r12 = r0
            goto L15e
        L82:
            r0 = move-exception
            r12 = r0
            goto L17b
        L86:
            r0 = move-exception
            r12 = r0
            goto L19c
        L8a:
            java.lang.Object r12 = r13.eval(r11, r2)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            int r4 = r11.depth()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            if (r4 > r3) goto Lb1
            boolean r4 = r12 instanceof bsh.ReturnControl     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            if (r4 == 0) goto Lc8
            bsh.ReturnControl r12 = (bsh.ReturnControl) r12     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            java.lang.Object r12 = r12.value     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            bsh.JJTParserState r13 = r2.get_jjtree()
            r13.reset()
            int r13 = r11.depth()
            if (r13 <= r3) goto L1d3
            r11.clear()
            r11.push(r7)
            goto L1d3
        Lb1:
            bsh.InterpreterError r12 = new bsh.InterpreterError     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            r0.<init>()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            java.lang.String r4 = "Callstack growing: "
            r0.append(r4)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            r0.append(r11)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
            throw r12     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L73 bsh.TokenMgrException -> L76 bsh.EvalError -> L7a bsh.TargetError -> L7e bsh.InterpreterError -> L82 bsh.ParseException -> L86
        Lc8:
            bsh.JJTParserState r4 = r2.get_jjtree()
            r4.reset()
            int r4 = r11.depth()
            if (r4 <= r3) goto L36
            r11.clear()
            r11.push(r7)
            goto L36
        Ldd:
            java.lang.ThreadLocal<java.lang.Boolean> r0 = bsh.Interpreter.DEBUG     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L6f
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto Lee
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L6f
        Lee:
            bsh.EvalError r0 = new bsh.EvalError     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r4.<init>()     // Catch: java.lang.Throwable -> L6f
            r4.append(r1)     // Catch: java.lang.Throwable -> L6f
            r4.append(r9)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = " unknown error: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r12.getMessage()     // Catch: java.lang.Throwable -> L6f
            r4.append(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r1, r13, r11, r12)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L10f:
            bsh.EvalError r0 = new bsh.EvalError     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r4.<init>()     // Catch: java.lang.Throwable -> L6f
            r4.append(r1)     // Catch: java.lang.Throwable -> L6f
            r4.append(r9)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = " Token Parsing Error: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r12.getMessage()     // Catch: java.lang.Throwable -> L6f
            r4.append(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r1, r13, r11, r12)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L130:
            java.lang.ThreadLocal<java.lang.Boolean> r0 = bsh.Interpreter.DEBUG     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L6f
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L141
            r12.printStackTrace()     // Catch: java.lang.Throwable -> L6f
        L141:
            bsh.Node r0 = r12.getNode()     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L14a
            r12.setNode(r13)     // Catch: java.lang.Throwable -> L6f
        L14a:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r13.<init>()     // Catch: java.lang.Throwable -> L6f
            r13.append(r1)     // Catch: java.lang.Throwable -> L6f
            r13.append(r9)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L6f
            bsh.EvalError r12 = r12.reThrow(r13)     // Catch: java.lang.Throwable -> L6f
            throw r12     // Catch: java.lang.Throwable -> L6f
        L15e:
            bsh.Node r0 = r12.getNode()     // Catch: java.lang.Throwable -> L6f
            if (r0 != 0) goto L167
            r12.setNode(r13)     // Catch: java.lang.Throwable -> L6f
        L167:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r13.<init>()     // Catch: java.lang.Throwable -> L6f
            r13.append(r1)     // Catch: java.lang.Throwable -> L6f
            r13.append(r9)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L6f
            bsh.EvalError r12 = r12.reThrow(r13)     // Catch: java.lang.Throwable -> L6f
            throw r12     // Catch: java.lang.Throwable -> L6f
        L17b:
            bsh.EvalError r0 = new bsh.EvalError     // Catch: java.lang.Throwable -> L6f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6f
            r4.<init>()     // Catch: java.lang.Throwable -> L6f
            r4.append(r1)     // Catch: java.lang.Throwable -> L6f
            r4.append(r9)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = " internal Error: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r12.getMessage()     // Catch: java.lang.Throwable -> L6f
            r4.append(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r1, r13, r11, r12)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L19c:
            java.lang.ThreadLocal<java.lang.Boolean> r13 = bsh.Interpreter.DEBUG     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r13.get()     // Catch: java.lang.Throwable -> L6f
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L1bb
            java.lang.Object r13 = r13.get()     // Catch: java.lang.Throwable -> L6f
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L6f
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r13 = r12.getMessage(r13)     // Catch: java.lang.Throwable -> L6f
            r10.error(r13)     // Catch: java.lang.Throwable -> L6f
        L1bb:
            r12.setErrorSourceFile(r9)     // Catch: java.lang.Throwable -> L6f
            throw r12     // Catch: java.lang.Throwable -> L6f
        L1bf:
            bsh.JJTParserState r13 = r2.get_jjtree()
            r13.reset()
            int r13 = r11.depth()
            if (r13 <= r3) goto L1d2
            r11.clear()
            r11.push(r7)
        L1d2:
            throw r12
        L1d3:
            java.lang.Object r11 = bsh.Primitive.unwrap(r12)
            return r11
    }

    public java.lang.Object eval(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "eval(String): "
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            debug(r0)
            bsh.NameSpace r0 = r2.globalNameSpace
            java.lang.String r1 = "eval string"
            java.lang.Object r3 = r2.eval(r3, r0, r1)
            return r3
    }

    public java.lang.Object eval(java.lang.String r2, bsh.NameSpace r3, java.lang.String r4) {
            r1 = this;
            java.io.StringReader r0 = new java.io.StringReader
            java.lang.String r2 = r1.terminatedScript(r2)
            r0.<init>(r2)
            java.lang.Object r2 = r1.eval(r0, r3, r4)
            return r2
    }

    public java.lang.Object eval(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "eval(String,String): "
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2, r3}
            debug(r0)
            bsh.NameSpace r0 = r1.globalNameSpace
            java.lang.Object r2 = r1.eval(r2, r0, r3)
            return r2
    }

    public java.lang.Object evalSnapshot(bsh.snapshot.BshSnapshot r3) {
            r2 = this;
            bsh.NameSpace r0 = r2.globalNameSpace
            java.lang.String r1 = "snapshot"
            java.lang.Object r3 = r2.evalSnapshot(r3, r0, r1)
            return r3
    }

    public java.lang.Object evalSnapshot(bsh.snapshot.BshSnapshot r11, bsh.NameSpace r12, java.lang.String r13) {
            r10 = this;
            java.lang.String r1 = "Snapshot: "
            bsh.Interpreter r2 = new bsh.Interpreter
            java.io.StringReader r3 = new java.io.StringReader
            java.lang.String r0 = ""
            r3.<init>(r0)
            java.io.PrintStream r4 = r10.getOut()
            java.io.PrintStream r5 = r10.getErr()
            r6 = 0
            r8 = r10
            r7 = r12
            r9 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            bsh.CallStack r12 = new bsh.CallStack
            r12.<init>(r7)
            bsh.Node[] r11 = r11.getNodes()
            int r13 = r11.length
            r0 = 0
            r3 = 0
        L26:
            if (r3 >= r13) goto L123
            r4 = r11[r3]
            r5 = 1
            r4.setSourceFile(r9)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59 bsh.EvalError -> L5c bsh.TargetError -> L5f bsh.InterpreterError -> L62
            java.lang.Object r0 = r4.eval(r12, r2)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59 bsh.EvalError -> L5c bsh.TargetError -> L5f bsh.InterpreterError -> L62
            int r6 = r12.depth()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59 bsh.EvalError -> L5c bsh.TargetError -> L5f bsh.InterpreterError -> L62
            if (r6 > r5) goto L7c
            boolean r6 = r0 instanceof bsh.ReturnControl     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59 bsh.EvalError -> L5c bsh.TargetError -> L5f bsh.InterpreterError -> L62
            if (r6 == 0) goto L66
            bsh.ReturnControl r0 = (bsh.ReturnControl) r0     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59 bsh.EvalError -> L5c bsh.TargetError -> L5f bsh.InterpreterError -> L62
            java.lang.Object r0 = r0.value     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59 bsh.EvalError -> L5c bsh.TargetError -> L5f bsh.InterpreterError -> L62
            bsh.JJTParserState r11 = r2.get_jjtree()
            r11.reset()
            int r11 = r12.depth()
            if (r11 <= r5) goto L123
            r12.clear()
            r12.push(r7)
            goto L123
        L55:
            r0 = move-exception
            r11 = r0
            goto L10f
        L59:
            r0 = move-exception
            r11 = r0
            goto L93
        L5c:
            r0 = move-exception
            r11 = r0
            goto Lb4
        L5f:
            r0 = move-exception
            r11 = r0
            goto Ld1
        L62:
            r0 = move-exception
            r11 = r0
            goto Lee
        L66:
            bsh.JJTParserState r4 = r2.get_jjtree()
            r4.reset()
            int r4 = r12.depth()
            if (r4 <= r5) goto L79
            r12.clear()
            r12.push(r7)
        L79:
            int r3 = r3 + 1
            goto L26
        L7c:
            bsh.InterpreterError r11 = new bsh.InterpreterError     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59 bsh.EvalError -> L5c bsh.TargetError -> L5f bsh.InterpreterError -> L62
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59 bsh.EvalError -> L5c bsh.TargetError -> L5f bsh.InterpreterError -> L62
            r13.<init>()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59 bsh.EvalError -> L5c bsh.TargetError -> L5f bsh.InterpreterError -> L62
            java.lang.String r0 = "Callstack growing: "
            r13.append(r0)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59 bsh.EvalError -> L5c bsh.TargetError -> L5f bsh.InterpreterError -> L62
            r13.append(r12)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59 bsh.EvalError -> L5c bsh.TargetError -> L5f bsh.InterpreterError -> L62
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59 bsh.EvalError -> L5c bsh.TargetError -> L5f bsh.InterpreterError -> L62
            r11.<init>(r13)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59 bsh.EvalError -> L5c bsh.TargetError -> L5f bsh.InterpreterError -> L62
            throw r11     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L59 bsh.EvalError -> L5c bsh.TargetError -> L5f bsh.InterpreterError -> L62
        L93:
            bsh.EvalError r13 = new bsh.EvalError     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            r0.append(r1)     // Catch: java.lang.Throwable -> L55
            r0.append(r9)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = " unknown error: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r11.getMessage()     // Catch: java.lang.Throwable -> L55
            r0.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L55
            r13.<init>(r0, r4, r12, r11)     // Catch: java.lang.Throwable -> L55
            throw r13     // Catch: java.lang.Throwable -> L55
        Lb4:
            bsh.Node r13 = r11.getNode()     // Catch: java.lang.Throwable -> L55
            if (r13 != 0) goto Lbd
            r11.setNode(r4)     // Catch: java.lang.Throwable -> L55
        Lbd:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r13.<init>()     // Catch: java.lang.Throwable -> L55
            r13.append(r1)     // Catch: java.lang.Throwable -> L55
            r13.append(r9)     // Catch: java.lang.Throwable -> L55
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L55
            bsh.EvalError r11 = r11.reThrow(r13)     // Catch: java.lang.Throwable -> L55
            throw r11     // Catch: java.lang.Throwable -> L55
        Ld1:
            bsh.Node r13 = r11.getNode()     // Catch: java.lang.Throwable -> L55
            if (r13 != 0) goto Lda
            r11.setNode(r4)     // Catch: java.lang.Throwable -> L55
        Lda:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r13.<init>()     // Catch: java.lang.Throwable -> L55
            r13.append(r1)     // Catch: java.lang.Throwable -> L55
            r13.append(r9)     // Catch: java.lang.Throwable -> L55
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L55
            bsh.EvalError r11 = r11.reThrow(r13)     // Catch: java.lang.Throwable -> L55
            throw r11     // Catch: java.lang.Throwable -> L55
        Lee:
            bsh.EvalError r13 = new bsh.EvalError     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r0.<init>()     // Catch: java.lang.Throwable -> L55
            r0.append(r1)     // Catch: java.lang.Throwable -> L55
            r0.append(r9)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = " internal Error: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r11.getMessage()     // Catch: java.lang.Throwable -> L55
            r0.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L55
            r13.<init>(r0, r4, r12, r11)     // Catch: java.lang.Throwable -> L55
            throw r13     // Catch: java.lang.Throwable -> L55
        L10f:
            bsh.JJTParserState r13 = r2.get_jjtree()
            r13.reset()
            int r13 = r12.depth()
            if (r13 <= r5) goto L122
            r12.clear()
            r12.push(r7)
        L122:
            throw r11
        L123:
            java.lang.Object r11 = bsh.Primitive.unwrap(r0)
            return r11
    }

    public java.lang.Object evalSnapshot(java.io.File r2, javax.crypto.SecretKey r3) {
            r1 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r1.evalSnapshot(r0, r3, r2)     // Catch: java.lang.Throwable -> L11
            r0.close()
            return r2
        L11:
            r2 = move-exception
            r0.close()
            throw r2
    }

    public java.lang.Object evalSnapshot(java.io.InputStream r2, javax.crypto.SecretKey r3) {
            r1 = this;
            java.lang.String r0 = "snapshot stream"
            java.lang.Object r2 = r1.evalSnapshot(r2, r3, r0)
            return r2
    }

    public java.lang.Object evalSnapshot(java.io.InputStream r1, javax.crypto.SecretKey r2, java.lang.String r3) {
            r0 = this;
            bsh.snapshot.BshSnapshot r1 = bsh.snapshot.BshSnapshotHelper.readEncrypted(r1, r2)
            bsh.NameSpace r2 = r0.globalNameSpace
            java.lang.Object r1 = r0.evalSnapshot(r1, r2, r3)
            return r1
    }

    public java.lang.Object evalSnapshot(java.lang.String r1, javax.crypto.SecretKey r2) {
            r0 = this;
            java.io.File r1 = r0.pathToFile(r1)
            java.lang.Object r1 = r0.evalSnapshot(r1, r2)
            return r1
    }

    public java.lang.Object get(java.lang.String r3) {
            r2 = this;
            bsh.NameSpace r0 = r2.globalNameSpace     // Catch: bsh.UtilEvalError -> Lb
            java.lang.Object r3 = r0.get(r3, r2)     // Catch: bsh.UtilEvalError -> Lb
            java.lang.Object r3 = bsh.Primitive.unwrap(r3)     // Catch: bsh.UtilEvalError -> Lb
            return r3
        Lb:
            r3 = move-exception
            bsh.Node r0 = bsh.Node.JAVACODE
            bsh.CallStack r1 = new bsh.CallStack
            r1.<init>()
            bsh.EvalError r3 = r3.toEvalError(r0, r1)
            throw r3
    }

    public bsh.BshClassManager getClassManager() {
            r1 = this;
            bsh.NameSpace r0 = r1.getNameSpace()
            bsh.BshClassManager r0 = r0.getClassManager()
            return r0
    }

    public boolean getCompatibility() {
            r1 = this;
            boolean r0 = r1.compatibility
            return r0
    }

    public java.io.PrintStream getErr() {
            r1 = this;
            bsh.ConsoleAssignable r0 = r1.console
            java.io.PrintStream r0 = r0.getErr()
            return r0
    }

    public java.io.Reader getIn() {
            r1 = this;
            bsh.ConsoleAssignable r0 = r1.console
            java.io.Reader r0 = r0.getIn()
            return r0
    }

    public java.lang.Object getInterface(java.lang.Class<?> r2) {
            r1 = this;
            bsh.NameSpace r0 = r1.globalNameSpace
            bsh.This r0 = r0.getThis(r1)
            java.lang.Object r2 = r0.getInterface(r2)
            return r2
    }

    public bsh.NameSpace getNameSpace() {
            r1 = this;
            bsh.NameSpace r0 = r1.globalNameSpace
            return r0
    }

    public java.io.PrintStream getOut() {
            r1 = this;
            bsh.ConsoleAssignable r0 = r1.console
            java.io.PrintStream r0 = r0.getOut()
            return r0
    }

    public bsh.Interpreter getParent() {
            r1 = this;
            bsh.Interpreter r0 = r1.parent
            return r0
    }

    public boolean getShowResults() {
            r1 = this;
            boolean r0 = r1.showResults
            return r0
    }

    public java.lang.String getSourceFileInfo() {
            r1 = this;
            java.lang.String r0 = r1.sourceFileInfo
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "<unknown source>"
            return r0
    }

    public boolean getStrictJava() {
            r1 = this;
            boolean r0 = r1.strictJava
            return r0
    }

    public java.lang.Object getu(java.lang.String r2) {
            r1 = this;
            java.lang.Object r2 = r1.get(r2)     // Catch: bsh.EvalError -> L5
            return r2
        L5:
            r2 = move-exception
            java.lang.String r0 = "set: "
            bsh.j.d(r0, r2)
            r2 = 0
            return r2
    }

    public void installModule(bsh.module.BshModule r1) {
            r0 = this;
            r1.install(r0)
            return
    }

    public void installModules(bsh.module.BshModule... r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r4[r1]
            r2.install(r3)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    public void loadRCFiles() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L22
            r0.<init>()     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = "user.home"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Exception -> L22
            r0.append(r1)     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = java.io.File.separator     // Catch: java.lang.Exception -> L22
            r0.append(r1)     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = ".bshrc"
            r0.append(r1)     // Catch: java.lang.Exception -> L22
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L22
            bsh.NameSpace r1 = r2.globalNameSpace     // Catch: java.lang.Exception -> L22
            r2.source(r0, r1)     // Catch: java.lang.Exception -> L22
            return
        L22:
            r0 = move-exception
            java.lang.String r1 = "Could not find rc file: "
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            debug(r0)
            return
    }

    public java.io.File pathToFile(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "bsh.cwd"
            java.lang.Object r0 = r3.getu(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r1 = new java.io.File
            r1.<init>(r4)
            boolean r2 = r1.isAbsolute()
            if (r2 != 0) goto L26
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = java.io.File.separator
            java.lang.String r4 = eh.a.r(r2, r0, r4)
            r1.<init>(r4)
        L26:
            java.io.File r4 = new java.io.File
            java.lang.String r0 = r1.getCanonicalPath()
            r4.<init>(r0)
            return r4
    }

    public final void print(java.lang.Object r2) {
            r1 = this;
            bsh.ConsoleAssignable r0 = r1.console
            r0.print(r2)
            return
    }

    public final void println(java.lang.Object r2) {
            r1 = this;
            bsh.ConsoleAssignable r0 = r1.console
            r0.println(r2)
            return
    }

    public void reset() {
            r1 = this;
            bsh.BshClassManager r0 = r1.getClassManager()
            r0.reset()
            bsh.NameSpace r0 = r1.globalNameSpace
            r0.clear()
            bsh.Name.clearParts()
            java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = bsh.Reflect.instanceCache
            r0.clear()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r8 = this;
            boolean r0 = r8.evalOnly
            if (r0 != 0) goto L2e6
            boolean r0 = r8.interactive
            if (r0 == 0) goto L19
            bsh.Interpreter r0 = r8.getParent()
            if (r0 != 0) goto L19
            java.lang.String r0 = "printBanner();"
            r8.eval(r0)     // Catch: bsh.EvalError -> L14
            goto L19
        L14:
            java.lang.String r0 = "BeanShell 3.0.0.beta12"
            r8.println(r0)
        L19:
            bsh.CallStack r0 = new bsh.CallStack
            bsh.NameSpace r1 = r8.globalNameSpace
            r0.<init>(r1)
            r1 = 0
            r8.EOF = r1
            r2 = -1
        L24:
            boolean r3 = java.lang.Thread.interrupted()
            if (r3 != 0) goto L2da
            boolean r3 = r8.EOF
            if (r3 != 0) goto L2da
            r3 = 1
            boolean r4 = r8.interactive     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            if (r4 == 0) goto L52
            bsh.ConsoleAssignable r4 = r8.console     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.String r5 = r8.getBshPrompt()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            r4.prompt(r5)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            goto L52
        L3d:
            r1 = move-exception
            goto L2c4
        L40:
            r4 = move-exception
            goto L134
        L43:
            r4 = move-exception
            goto L16d
        L46:
            r4 = move-exception
            goto L19e
        L49:
            r4 = move-exception
            goto L1f7
        L4c:
            r4 = move-exception
            goto L246
        L4f:
            r4 = move-exception
            goto L273
        L52:
            boolean r4 = r8.readLine()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            r8.EOF = r4     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            bsh.JJTParserState r4 = r8.get_jjtree()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            int r4 = r4.nodeArity()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            if (r4 <= 0) goto L11d
            bsh.JJTParserState r4 = r8.get_jjtree()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            bsh.Node r4 = r4.rootNode()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.String r5 = r8.sourceFileInfo     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            r4.setSourceFile(r5)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.ThreadLocal<java.lang.Boolean> r5 = bsh.Interpreter.DEBUG     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            if (r5 == 0) goto L82
            java.lang.String r5 = ">"
            r4.dump(r5)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
        L82:
            boolean r5 = bsh.Interpreter.TRACE     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            if (r5 == 0) goto L9e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.String r6 = "// "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.String r6 = r4.getText()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            r8.println(r5)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
        L9e:
            java.lang.Object r4 = r4.eval(r0, r8)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            int r5 = r0.depth()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            if (r5 > r3) goto L106
            boolean r5 = r4 instanceof bsh.ReturnControl     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            if (r5 == 0) goto Lb0
            bsh.ReturnControl r4 = (bsh.ReturnControl) r4     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.Object r4 = r4.value     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
        Lb0:
            boolean r5 = r8.interactive     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            if (r5 == 0) goto L11d
            bsh.Primitive r5 = bsh.Primitive.VOID     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            if (r4 == r5) goto Lfc
            java.lang.String r5 = "$_"
            r8.setu(r5, r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.String r6 = "$"
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            int r2 = r2 + 1
            int r6 = r2 % 10
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            r8.setu(r5, r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            boolean r5 = r8.showResults     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            if (r5 == 0) goto L11d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.String r6 = "--> $"
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            int r6 = r2 % 10
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.String r6 = " = "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.String r4 = bsh.StringUtil.typeValueString(r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            r5.append(r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            r8.println(r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            goto L11d
        Lfc:
            boolean r4 = r8.showResults     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            if (r4 == 0) goto L11d
            java.lang.String r4 = "--> void"
            r8.println(r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            goto L11d
        L106:
            bsh.InterpreterError r4 = new bsh.InterpreterError     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.String r6 = "Callstack growing: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            r5.append(r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
            throw r4     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L40 bsh.TokenMgrException -> L43 bsh.EvalError -> L46 bsh.TargetError -> L49 bsh.InterpreterError -> L4c bsh.ParseException -> L4f
        L11d:
            bsh.JJTParserState r4 = r8.get_jjtree()
            r4.reset()
            int r4 = r0.depth()
            if (r4 <= r3) goto L24
        L12a:
            r0.clear()
            bsh.NameSpace r3 = r8.globalNameSpace
            r0.push(r3)
            goto L24
        L134:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r5.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = "Unknown error: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d
            r5.append(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3d
            r8.error(r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.ThreadLocal<java.lang.Boolean> r5 = bsh.Interpreter.DEBUG     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L3d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L159
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3d
        L159:
            boolean r4 = r8.interactive     // Catch: java.lang.Throwable -> L3d
            if (r4 != 0) goto L15f
            r8.EOF = r3     // Catch: java.lang.Throwable -> L3d
        L15f:
            bsh.JJTParserState r4 = r8.get_jjtree()
            r4.reset()
            int r4 = r0.depth()
            if (r4 <= r3) goto L24
            goto L12a
        L16d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r5.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = "Error parsing input: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d
            r5.append(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L3d
            r8.error(r4)     // Catch: java.lang.Throwable -> L3d
            bsh.Parser r4 = r8.parser     // Catch: java.lang.Throwable -> L3d
            java.io.Reader r5 = r8.getIn()     // Catch: java.lang.Throwable -> L3d
            r4.reInitTokenInput(r5)     // Catch: java.lang.Throwable -> L3d
            boolean r4 = r8.interactive     // Catch: java.lang.Throwable -> L3d
            if (r4 != 0) goto L190
            r8.EOF = r3     // Catch: java.lang.Throwable -> L3d
        L190:
            bsh.JJTParserState r4 = r8.get_jjtree()
            r4.reset()
            int r4 = r0.depth()
            if (r4 <= r3) goto L24
            goto L12a
        L19e:
            boolean r5 = r8.interactive     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = "Evaluation Error: "
            if (r5 == 0) goto L1bb
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r5.<init>()     // Catch: java.lang.Throwable -> L3d
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = r4.getMessage()     // Catch: java.lang.Throwable -> L3d
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3d
            r8.error(r5)     // Catch: java.lang.Throwable -> L3d
            goto L1d1
        L1bb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r5.<init>()     // Catch: java.lang.Throwable -> L3d
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = r4.getRawMessage()     // Catch: java.lang.Throwable -> L3d
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3d
            r8.error(r5)     // Catch: java.lang.Throwable -> L3d
        L1d1:
            java.lang.ThreadLocal<java.lang.Boolean> r5 = bsh.Interpreter.DEBUG     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L3d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L1e2
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3d
        L1e2:
            boolean r4 = r8.interactive     // Catch: java.lang.Throwable -> L3d
            if (r4 != 0) goto L1e8
            r8.EOF = r3     // Catch: java.lang.Throwable -> L3d
        L1e8:
            bsh.JJTParserState r4 = r8.get_jjtree()
            r4.reset()
            int r4 = r0.depth()
            if (r4 <= r3) goto L24
            goto L12a
        L1f7:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r5.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = "Target Exception: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = r4.getMessage()     // Catch: java.lang.Throwable -> L3d
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3d
            r8.error(r5)     // Catch: java.lang.Throwable -> L3d
            boolean r5 = r4.inNativeCode()     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L228
            java.lang.ThreadLocal<java.lang.Boolean> r5 = bsh.Interpreter.DEBUG     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L3d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L3d
            java.io.PrintStream r6 = r8.getErr()     // Catch: java.lang.Throwable -> L3d
            r4.printStackTrace(r5, r6)     // Catch: java.lang.Throwable -> L3d
        L228:
            boolean r5 = r8.interactive     // Catch: java.lang.Throwable -> L3d
            if (r5 != 0) goto L22e
            r8.EOF = r3     // Catch: java.lang.Throwable -> L3d
        L22e:
            java.lang.String r5 = "$_e"
            java.lang.Throwable r4 = r4.getTarget()     // Catch: java.lang.Throwable -> L3d
            r8.setu(r5, r4)     // Catch: java.lang.Throwable -> L3d
            bsh.JJTParserState r4 = r8.get_jjtree()
            r4.reset()
            int r4 = r0.depth()
            if (r4 <= r3) goto L24
            goto L12a
        L246:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r5.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = "Internal Error: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L3d
            r5.append(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L3d
            r8.error(r4)     // Catch: java.lang.Throwable -> L3d
            boolean r4 = r8.interactive     // Catch: java.lang.Throwable -> L3d
            if (r4 != 0) goto L264
            r8.EOF = r3     // Catch: java.lang.Throwable -> L3d
        L264:
            bsh.JJTParserState r4 = r8.get_jjtree()
            r4.reset()
            int r4 = r0.depth()
            if (r4 <= r3) goto L24
            goto L12a
        L273:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d
            r5.<init>()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = "Parser Error: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3d
            java.lang.ThreadLocal<java.lang.Boolean> r6 = bsh.Interpreter.DEBUG     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r7 = r6.get()     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L3d
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r7 = r4.getMessage(r7)     // Catch: java.lang.Throwable -> L3d
            r5.append(r7)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3d
            r8.error(r5)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r5 = r6.get()     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L3d
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L2a6
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L3d
        L2a6:
            boolean r4 = r8.interactive     // Catch: java.lang.Throwable -> L3d
            if (r4 != 0) goto L2ac
            r8.EOF = r3     // Catch: java.lang.Throwable -> L3d
        L2ac:
            bsh.Parser r4 = r8.parser     // Catch: java.lang.Throwable -> L3d
            java.io.Reader r5 = r8.getIn()     // Catch: java.lang.Throwable -> L3d
            r4.reInitInput(r5)     // Catch: java.lang.Throwable -> L3d
            bsh.JJTParserState r4 = r8.get_jjtree()
            r4.reset()
            int r4 = r0.depth()
            if (r4 <= r3) goto L24
            goto L12a
        L2c4:
            bsh.JJTParserState r2 = r8.get_jjtree()
            r2.reset()
            int r2 = r0.depth()
            if (r2 <= r3) goto L2d9
            r0.clear()
            bsh.NameSpace r2 = r8.globalNameSpace
            r0.push(r2)
        L2d9:
            throw r1
        L2da:
            boolean r0 = r8.interactive
            if (r0 == 0) goto L2e5
            boolean r0 = r8.exitOnEOF
            if (r0 == 0) goto L2e5
            java.lang.System.exit(r1)
        L2e5:
            return
        L2e6:
            java.lang.String r0 = "bsh Interpreter: No stream"
            bsh.j.g(r0)
            return
    }

    public void set(java.lang.String r2, double r3) {
            r1 = this;
            bsh.Primitive r0 = new bsh.Primitive
            r0.<init>(r3)
            r1.set(r2, r0)
            return
    }

    public void set(java.lang.String r2, float r3) {
            r1 = this;
            bsh.Primitive r0 = new bsh.Primitive
            r0.<init>(r3)
            r1.set(r2, r0)
            return
    }

    public void set(java.lang.String r2, int r3) {
            r1 = this;
            bsh.Primitive r0 = new bsh.Primitive
            r0.<init>(r3)
            r1.set(r2, r0)
            return
    }

    public void set(java.lang.String r2, long r3) {
            r1 = this;
            bsh.Primitive r0 = new bsh.Primitive
            r0.<init>(r3)
            r1.set(r2, r0)
            return
    }

    public void set(java.lang.String r5, java.lang.Object r6) {
            r4 = this;
            bsh.CallStack r0 = new bsh.CallStack
            bsh.NameSpace r1 = r4.globalNameSpace
            r0.<init>(r1)
            boolean r1 = bsh.Name.isCompound(r5)     // Catch: bsh.UtilEvalError -> L1c
            bsh.NameSpace r2 = r4.globalNameSpace
            r3 = 0
            if (r1 == 0) goto L1e
            bsh.Name r5 = r2.getNameResolver(r5)     // Catch: bsh.UtilEvalError -> L1c
            bsh.LHS r5 = r5.toLHS(r0, r4)     // Catch: bsh.UtilEvalError -> L1c
            r5.assign(r6, r3)     // Catch: bsh.UtilEvalError -> L1c
            return
        L1c:
            r5 = move-exception
            goto L22
        L1e:
            r2.setVariable(r5, r6, r3)     // Catch: bsh.UtilEvalError -> L1c
            return
        L22:
            bsh.Node r6 = bsh.Node.JAVACODE
            bsh.EvalError r5 = r5.toEvalError(r6, r0)
            throw r5
    }

    public void set(java.lang.String r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L5
            bsh.Primitive r2 = bsh.Primitive.TRUE
            goto L7
        L5:
            bsh.Primitive r2 = bsh.Primitive.FALSE
        L7:
            r0.set(r1, r2)
            return
    }

    public void setClassLoader(java.lang.ClassLoader r2) {
            r1 = this;
            bsh.BshClassManager r0 = r1.getClassManager()
            r0.setClassLoader(r2)
            return
    }

    public void setCompatibility(boolean r1) {
            r0 = this;
            r0.compatibility = r1
            return
    }

    public void setConsole(bsh.ConsoleAssignable r2) {
            r1 = this;
            r1.console = r2
            bsh.Parser r2 = r1.parser
            if (r2 == 0) goto L23
            bsh.JJTParserState r2 = r1.get_jjtree()
            int r2 = r2.nodeArity()
            if (r2 != 0) goto L23
            bsh.Interpreter r2 = r1.parent
            if (r2 == 0) goto L19
            boolean r2 = r2.interactive
            if (r2 == 0) goto L19
            goto L23
        L19:
            bsh.Parser r2 = r1.parser
            java.io.Reader r0 = r1.getIn()
            r2.ReInit(r0)
            return
        L23:
            bsh.Parser r2 = new bsh.Parser
            java.io.Reader r0 = r1.getIn()
            r2.<init>(r0)
            r1.parser = r2
            return
    }

    public void setConsole(bsh.ConsoleInterface r2) {
            r1 = this;
            bsh.Interpreter$Console r0 = new bsh.Interpreter$Console
            r0.<init>(r2)
            r1.setConsole(r0)
            return
    }

    public void setErr(java.io.PrintStream r2) {
            r1 = this;
            bsh.ConsoleAssignable r0 = r1.console
            r0.setErr(r2)
            return
    }

    public void setExitOnEOF(boolean r1) {
            r0 = this;
            r0.exitOnEOF = r1
            return
    }

    public void setIn(java.io.Reader r2) {
            r1 = this;
            bsh.ConsoleAssignable r0 = r1.console
            r0.setIn(r2)
            return
    }

    public void setNameSpace(bsh.NameSpace r2) {
            r1 = this;
            r1.globalNameSpace = r2
            if (r2 == 0) goto L20
            java.lang.String r0 = "bsh"
            java.lang.Object r2 = r2.getVariable(r0)     // Catch: bsh.UtilEvalError -> L19
            boolean r2 = r2 instanceof bsh.This     // Catch: bsh.UtilEvalError -> L19
            if (r2 != 0) goto L20
            r1.initRootSystemObject()     // Catch: bsh.UtilEvalError -> L19
            boolean r2 = r1.interactive     // Catch: bsh.UtilEvalError -> L19
            if (r2 == 0) goto L20
            r1.loadRCFiles()     // Catch: bsh.UtilEvalError -> L19
            return
        L19:
            r2 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L20:
            return
    }

    public void setOut(java.io.PrintStream r2) {
            r1 = this;
            bsh.ConsoleAssignable r0 = r1.console
            r0.setOut(r2)
            return
    }

    public void setShowResults(boolean r1) {
            r0 = this;
            r0.showResults = r1
            return
    }

    public void setStrictJava(boolean r1) {
            r0 = this;
            r0.strictJava = r1
            return
    }

    public void setYieldDelay(int r1) {
            r0 = this;
            r0.yield_for = r1
            return
    }

    public void setu(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            r0.set(r1, r2)     // Catch: bsh.EvalError -> L4
            return
        L4:
            r1 = move-exception
            java.lang.String r2 = "set: "
            bsh.j.d(r2, r1)
            return
    }

    public java.lang.String showEvalString(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            int r0 = r4.length()
            r1 = 80
            if (r0 <= r1) goto L13
            r0 = 0
            java.lang.String r4 = r4.substring(r0, r1)
            java.lang.String r0 = " . . . "
            java.lang.String r4 = r4.concat(r0)
        L13:
            java.lang.String r0 = " of: ``"
            java.lang.String r3 = r3.concat(r0)
            r0 = 10
            r1 = 32
            java.lang.String r4 = r4.replace(r0, r1)
            r0 = 13
            java.lang.String r4 = r4.replace(r0, r1)
            java.lang.String r3 = r3.concat(r4)
            java.lang.String r4 = "''"
            java.lang.String r3 = r3.concat(r4)
            return r3
    }

    public java.lang.Object source(java.io.File r2) {
            r1 = this;
            bsh.NameSpace r0 = r1.globalNameSpace
            java.lang.Object r2 = r1.source(r2, r0)
            return r2
    }

    public java.lang.Object source(java.io.File r3, bsh.NameSpace r4) {
            r2 = this;
            java.lang.String r0 = "Sourcing file: "
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}
            debug(r0)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            bsh.FileReader r1 = new bsh.FileReader
            r1.<init>(r3)
            r0.<init>(r1)
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r2.eval(r0, r4, r3)     // Catch: java.lang.Throwable -> L1f
            r0.close()
            return r3
        L1f:
            r3 = move-exception
            r0.close()
            throw r3
    }

    public java.lang.Object source(java.lang.String r2) {
            r1 = this;
            bsh.NameSpace r0 = r1.globalNameSpace
            java.lang.Object r2 = r1.source(r2, r0)
            return r2
    }

    public java.lang.Object source(java.lang.String r1, bsh.NameSpace r2) {
            r0 = this;
            java.io.File r1 = r0.pathToFile(r1)
            java.lang.Object r1 = r0.source(r1, r2)
            return r1
    }

    public java.lang.Object source(java.net.URL r2) {
            r1 = this;
            bsh.NameSpace r0 = r1.globalNameSpace
            java.lang.Object r2 = r1.source(r2, r0)
            return r2
    }

    public java.lang.Object source(java.net.URL r3, bsh.NameSpace r4) {
            r2 = this;
            java.lang.String r0 = "Sourcing file: "
            java.lang.String r1 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            debug(r0)
            bsh.FileReader r0 = new bsh.FileReader
            java.io.InputStream r1 = r3.openStream()
            r0.<init>(r1)
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r3 = r2.eval(r1, r4, r3)     // Catch: java.lang.Throwable -> L2c
            r1.close()     // Catch: java.lang.Throwable -> L2a
            r0.close()
            return r3
        L2a:
            r3 = move-exception
            goto L36
        L2c:
            r3 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch: java.lang.Throwable -> L2a
        L35:
            throw r3     // Catch: java.lang.Throwable -> L2a
        L36:
            r0.close()     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r4 = move-exception
            r3.addSuppressed(r4)
        L3e:
            throw r3
    }

    public java.lang.String terminatedScript(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = ";"
            boolean r1 = r3.endsWith(r0)
            if (r1 == 0) goto L9
            return r3
        L9:
            java.lang.String r3 = r3.concat(r0)
            return r3
    }

    public void unset(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "Can't unset, not a variable: "
            bsh.CallStack r1 = new bsh.CallStack
            r1.<init>()
            bsh.NameSpace r2 = r4.globalNameSpace     // Catch: bsh.UtilEvalError -> L1f
            bsh.Name r2 = r2.getNameResolver(r5)     // Catch: bsh.UtilEvalError -> L1f
            bsh.LHS r1 = r2.toLHS(r1, r4)     // Catch: bsh.UtilEvalError -> L1f
            int r2 = r1.type     // Catch: bsh.UtilEvalError -> L1f
            if (r2 != 0) goto L21
            bsh.NameSpace r5 = r1.nameSpace     // Catch: bsh.UtilEvalError -> L1f
            java.lang.String r0 = r1.getName()     // Catch: bsh.UtilEvalError -> L1f
            r5.unsetVariable(r0)     // Catch: bsh.UtilEvalError -> L1f
            return
        L1f:
            r5 = move-exception
            goto L3a
        L21:
            bsh.EvalError r1 = new bsh.EvalError     // Catch: bsh.UtilEvalError -> L1f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: bsh.UtilEvalError -> L1f
            r2.<init>(r0)     // Catch: bsh.UtilEvalError -> L1f
            r2.append(r5)     // Catch: bsh.UtilEvalError -> L1f
            java.lang.String r5 = r2.toString()     // Catch: bsh.UtilEvalError -> L1f
            bsh.Node r0 = bsh.Node.JAVACODE     // Catch: bsh.UtilEvalError -> L1f
            bsh.CallStack r2 = new bsh.CallStack     // Catch: bsh.UtilEvalError -> L1f
            r2.<init>()     // Catch: bsh.UtilEvalError -> L1f
            r1.<init>(r5, r0, r2)     // Catch: bsh.UtilEvalError -> L1f
            throw r1     // Catch: bsh.UtilEvalError -> L1f
        L3a:
            bsh.EvalError r0 = new bsh.EvalError
            java.lang.String r1 = r5.getMessage()
            bsh.Node r2 = bsh.Node.JAVACODE
            bsh.CallStack r3 = new bsh.CallStack
            r3.<init>()
            r0.<init>(r1, r2, r3, r5)
            throw r0
    }
}
