package bsh;

import bsh.BshClassManager;
import bsh.module.BshModule;
import bsh.preprocess.AnnotationIgnorePreprocess;
import bsh.preprocess.DefaultArgsDesugar;
import bsh.preprocess.ImplicitDefaultConstructorPreprocess;
import bsh.preprocess.KtStringTemplate;
import bsh.security.MainSecurityGuard;
import bsh.snapshot.BshSnapshot;
import bsh.snapshot.BshSnapshotHelper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import javax.crypto.SecretKey;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Interpreter implements Runnable, Serializable, BshClassManager.Listener {
    public static boolean COMPATIBIILTY = false;
    public static boolean TRACE = false;
    public static final String VERSION = "3.0.0.beta12";
    private static final long serialVersionUID = 1;
    private boolean EOF;
    private boolean compatibility;
    ConsoleAssignable console;
    protected boolean evalOnly;
    private boolean exitOnEOF;
    NameSpace globalNameSpace;
    protected boolean interactive;
    Interpreter parent;
    transient Parser parser;
    private boolean showResults;
    String sourceFileInfo;
    private boolean strictJava;
    private int yield_for;
    public static final ThreadLocal<Boolean> DEBUG = ThreadLocal.withInitial(new C0351h(0));
    private static final This SYSTEM_OBJECT = This.getThis(new NameSpace(null, null, "bsh.system"), null);
    public static final MainSecurityGuard mainSecurityGuard = new MainSecurityGuard();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Interpreter(ConsoleAssignable consoleAssignable, boolean z9, NameSpace nameSpace, Interpreter interpreter, String str) {
        this.strictJava = false;
        this.yield_for = -1;
        this.exitOnEOF = true;
        this.showResults = true;
        this.compatibility = COMPATIBIILTY;
        ThreadLocal<Boolean> threadLocal = DEBUG;
        long jNanoTime = threadLocal.get().booleanValue() ? System.nanoTime() : 0L;
        this.interactive = z9;
        this.parent = interpreter;
        if (interpreter != null) {
            setStrictJava(interpreter.strictJava);
            this.parser = interpreter.parser;
            this.evalOnly = interpreter.evalOnly;
        }
        this.sourceFileInfo = str;
        nameSpace = nameSpace == null ? new NameSpace(nameSpace, BshClassManager.createClassManager(this), "global") : nameSpace;
        setConsole(consoleAssignable);
        setNameSpace(nameSpace);
        getClassManager().addListener(this);
        if (threadLocal.get().booleanValue()) {
            debug("Time to initialize interpreter: interactive=", Boolean.valueOf(z9), " ", Long.valueOf(System.nanoTime() - jNanoTime), " nanoseconds.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void _yield() {
        int i9 = this.yield_for;
        if (i9 < 0) {
            return;
        }
        try {
            Thread.sleep(i9);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void debug(Object... objArr) {
        if (DEBUG.get().booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : objArr) {
                sb2.append(obj);
            }
            Console.debug.println("// Debug: ".concat(sb2.toString()));
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, SGET, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String getBshPrompt() {
        ThreadLocal<Boolean> threadLocal = DEBUG;
        Boolean bool = threadLocal.get();
        boolean zBooleanValue = bool.booleanValue();
        if (zBooleanValue) {
            threadLocal.set(Boolean.FALSE);
        }
        try {
            String str = (String) eval("getBshPrompt()");
            if (zBooleanValue) {
                threadLocal.set(bool);
            }
            return str;
        } catch (Exception unused) {
            if (zBooleanValue) {
                DEBUG.set(bool);
            }
            return "bsh % ";
        } catch (Throwable th2) {
            if (zBooleanValue) {
                DEBUG.set(bool);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean getSaveClasses() {
        return (getSaveClassesDir() == null || getSaveClassesDir().isEmpty()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getSaveClassesDir() {
        return System.getProperty("bsh.debugClasses");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private JJTParserState get_jjtree() {
        return this.parser.jjtree;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void initRootSystemObject() {
        BshClassManager classManager = getClassManager();
        setu("bsh", new NameSpace(null, classManager, "Bsh Object").getThis(this));
        This r12 = SYSTEM_OBJECT;
        setu("bsh.system", r12);
        setu("bsh.shared", r12);
        setu("bsh.help", new NameSpace(null, classManager, "Bsh Command Help Text").getThis(this));
        setu("bsh.cwd", System.getProperty("user.dir"));
        setu("bsh.interactive", this.interactive ? Primitive.TRUE : Primitive.FALSE);
        setu("bsh.evalOnly", Primitive.FALSE);
        setu("bsh.version", "3.0.0.beta12");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void invokeMain(Class<?> cls, String[] strArr) {
        Invocable invocableResolveJavaMethod = Reflect.resolveJavaMethod(cls, "main", new Class[]{String[].class}, true);
        if (invocableResolveJavaMethod != null) {
            invocableResolveJavaMethod.invoke(null, strArr);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void main(String[] strArr) {
        String[] strArr2;
        if (strArr.length <= 0) {
            try {
                FileReader fileReader = new FileReader(System.in);
                try {
                    CommandLineReader commandLineReader = new CommandLineReader(fileReader);
                    try {
                        new Interpreter(commandLineReader, System.out, System.err, true).run();
                        commandLineReader.close();
                        fileReader.close();
                        return;
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e6) {
                System.err.println("I/O Error closing command line reader: " + e6);
                return;
            }
        }
        String str = strArr[0];
        if (strArr.length > 1) {
            strArr2 = new String[strArr.length - 1];
            System.arraycopy(strArr, 1, strArr2, 0, strArr.length - 1);
        } else {
            strArr2 = new String[0];
        }
        try {
            Interpreter interpreter = new Interpreter();
            interpreter.setu("bsh.args", strArr2);
            Object objSource = interpreter.source(str, interpreter.globalNameSpace);
            if (objSource instanceof Class) {
                try {
                    invokeMain((Class) objSource, strArr2);
                } catch (Exception e7) {
                    e = e7;
                    if (e instanceof InvocationTargetException) {
                        e = e.getCause();
                    }
                    System.err.println("Class: " + objSource + " main method threw exception:" + e);
                }
            }
        } catch (TargetError e10) {
            System.err.println("Script threw exception: " + e10);
            if (e10.inNativeCode()) {
                e10.printStackTrace(DEBUG.get().booleanValue(), System.err);
            }
        } catch (EvalError e11) {
            System.err.println("Evaluation Error: " + e11);
        } catch (FileNotFoundException e12) {
            System.err.println("File not found: " + e12);
        } catch (IOException e13) {
            System.err.println("I/O Error: " + e13);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String preprocessScript(String str) {
        return ImplicitDefaultConstructorPreprocess.rewrite(KtStringTemplate.rewrite(DefaultArgsDesugar.rewrite(AnnotationIgnorePreprocess.rewrite(str))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean readLine() throws ParseException {
        try {
            return this.parser.Line();
        } catch (ParseException e6) {
            _yield();
            if (this.EOF) {
                return true;
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        setOut(System.out);
        setErr(System.err);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String readSource(Reader reader, String str) throws EvalError {
        try {
            StringBuilder sb2 = new StringBuilder(1024);
            char[] cArr = new char[4096];
            while (true) {
                int i9 = reader.read(cArr);
                if (i9 == -1) {
                    return sb2.toString();
                }
                sb2.append(cArr, 0, i9);
            }
        } catch (IOException e6) {
            StringBuilder sbM1026o = AbstractC0255e.m1026o("Sourced file: ", str, " read error: ");
            sbM1026o.append(e6.getMessage());
            throw new EvalError(sbM1026o.toString(), null, null, e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void redirectOutputToFile(String str) {
        try {
            PrintStream printStream = new PrintStream((OutputStream) new FileOutputStream(str), true, "UTF-8");
            System.setOut(printStream);
            System.setErr(printStream);
        } catch (IOException unused) {
            System.err.println("Can't redirect output to file: " + str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setShutdownOnExit(boolean z9) {
        try {
            SYSTEM_OBJECT.getNameSpace().setVariable("shutdownOnExit", Boolean.valueOf(z9), false);
        } catch (UtilEvalError e6) {
            throw new IllegalStateException(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void staticInit() {
        try {
            Console.systemLineSeparator = System.getProperty("line.separator");
            Console.debug = System.err;
            DEBUG.set(Boolean.valueOf(Boolean.getBoolean("debug")));
            TRACE = Boolean.getBoolean("trace");
            COMPATIBIILTY = Boolean.getBoolean("bsh.compatibility");
            String property = System.getProperty("outfile");
            if (property != null) {
                redirectOutputToFile(property);
            }
        } catch (SecurityException e6) {
            System.err.println("Could not init static:" + e6);
        } catch (Exception e7) {
            System.err.println("Could not init static(2):" + e7);
        } catch (Throwable th2) {
            System.err.println("Could not init static(3):" + th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void stripSnapshotRuntimeState(Node node) {
        if (node == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(node);
        while (!arrayList.isEmpty()) {
            Node node2 = (Node) arrayList.remove(arrayList.size() - 1);
            if (node2 instanceof SimpleNode) {
                SimpleNode simpleNode = (SimpleNode) node2;
                simpleNode.firstToken = null;
                simpleNode.lastToken = null;
                simpleNode.parser = null;
                for (Node node3 : simpleNode.jjtGetChildren()) {
                    if (node3 != null) {
                        arrayList.add(node3);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addClassLoader(ClassLoader classLoader) {
        getClassManager().addClassLoader(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.BshClassManager.Listener
    public void classLoaderChanged() {
        Reflect.instanceCache.clear();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, INVOKE, INVOKE, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[INVOKE, INVOKE, INVOKE, INVOKE, MOVE] complete}, expected: {[INVOKE, INVOKE, INVOKE, INVOKE] complete} */
    /* JADX WARN: Finally extract failed */
    public BshSnapshot compileSnapshot(Reader reader, NameSpace nameSpace, String str) {
        Interpreter interpreter = new Interpreter(new StringReader(terminatedScript(preprocessScript(readSource(reader, str)))), getOut(), getErr(), false, nameSpace, this, str);
        ArrayList arrayList = new ArrayList();
        boolean z9 = false;
        while (!z9) {
            try {
                try {
                    try {
                        boolean line = interpreter.readLine();
                        if (interpreter.get_jjtree().nodeArity() > 0) {
                            Node nodeRootNode = interpreter.get_jjtree().rootNode();
                            nodeRootNode.setSourceFile(str);
                            stripSnapshotRuntimeState(nodeRootNode);
                            arrayList.add(nodeRootNode);
                        }
                        interpreter.get_jjtree().reset();
                        z9 = line;
                    } catch (InterpreterError e6) {
                        throw new EvalError("Sourced file: " + str + " internal Error: " + e6.getMessage(), null, null, e6);
                    } catch (ParseException e7) {
                        e7.setErrorSourceFile(str);
                        throw e7;
                    }
                } catch (TokenMgrException e10) {
                    throw new EvalError("Sourced file: " + str + " Token Parsing Error: " + e10.getMessage(), null, null, e10);
                } catch (Exception e11) {
                    throw new EvalError("Sourced file: " + str + " unknown error: " + e11.getMessage(), null, null, e11);
                }
            } catch (Throwable th2) {
                interpreter.get_jjtree().reset();
                throw th2;
            }
        }
        return new BshSnapshot((Node[]) arrayList.toArray(new Node[0]));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void error(Object obj) {
        this.console.error(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public Object eval(Reader reader, NameSpace nameSpace, String str) {
        String strPreprocessScript = preprocessScript(readSource(reader, str));
        debug("eval: nameSpace = ", nameSpace);
        Interpreter interpreter = new Interpreter(new StringReader(terminatedScript(strPreprocessScript)), getOut(), getErr(), false, nameSpace, this, str);
        CallStack callStack = new CallStack(nameSpace);
        Object objEval = null;
        boolean line = false;
        Node nodeRootNode = null;
        while (true) {
            if (line) {
                break;
            }
            try {
                try {
                    try {
                        try {
                            line = interpreter.readLine();
                            if (interpreter.get_jjtree().nodeArity() > 0) {
                                nodeRootNode = interpreter.get_jjtree().rootNode();
                                nodeRootNode.setSourceFile(str);
                                if (TRACE) {
                                    println("// " + nodeRootNode.getText());
                                }
                                objEval = nodeRootNode.eval(callStack, interpreter);
                                if (callStack.depth() > 1) {
                                    throw new InterpreterError("Callstack growing: " + callStack);
                                }
                                if (objEval instanceof ReturnControl) {
                                    objEval = ((ReturnControl) objEval).value;
                                    interpreter.get_jjtree().reset();
                                    if (callStack.depth() > 1) {
                                        callStack.clear();
                                        callStack.push(nameSpace);
                                    }
                                }
                            }
                            interpreter.get_jjtree().reset();
                            if (callStack.depth() > 1) {
                                callStack.clear();
                                callStack.push(nameSpace);
                            }
                        } catch (InterpreterError e6) {
                            throw new EvalError("Sourced file: " + str + " internal Error: " + e6.getMessage(), nodeRootNode, callStack, e6);
                        } catch (ParseException e7) {
                            ThreadLocal<Boolean> threadLocal = DEBUG;
                            if (threadLocal.get().booleanValue()) {
                                error(e7.getMessage(threadLocal.get().booleanValue()));
                            }
                            e7.setErrorSourceFile(str);
                            throw e7;
                        }
                    } catch (EvalError e10) {
                        if (DEBUG.get().booleanValue()) {
                            e10.printStackTrace();
                        }
                        if (e10.getNode() == null) {
                            e10.setNode(nodeRootNode);
                        }
                        throw e10.reThrow("Sourced file: " + str);
                    } catch (TokenMgrException e11) {
                        throw new EvalError("Sourced file: " + str + " Token Parsing Error: " + e11.getMessage(), nodeRootNode, callStack, e11);
                    }
                } catch (TargetError e12) {
                    if (e12.getNode() == null) {
                        e12.setNode(nodeRootNode);
                    }
                    throw e12.reThrow("Sourced file: " + str);
                } catch (Exception e13) {
                    if (DEBUG.get().booleanValue()) {
                        e13.printStackTrace();
                    }
                    throw new EvalError("Sourced file: " + str + " unknown error: " + e13.getMessage(), nodeRootNode, callStack, e13);
                }
            } finally {
            }
        }
        return Primitive.unwrap(objEval);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public Object evalSnapshot(BshSnapshot bshSnapshot, NameSpace nameSpace, String str) {
        Interpreter interpreter = new Interpreter(new StringReader(HttpUrl.FRAGMENT_ENCODE_SET), getOut(), getErr(), false, nameSpace, this, str);
        CallStack callStack = new CallStack(nameSpace);
        Node[] nodes = bshSnapshot.getNodes();
        int length = nodes.length;
        Object objEval = null;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            Node node = nodes[i9];
            try {
                try {
                    try {
                        try {
                            node.setSourceFile(str);
                            objEval = node.eval(callStack, interpreter);
                            if (callStack.depth() > 1) {
                                throw new InterpreterError("Callstack growing: " + callStack);
                            }
                            if (objEval instanceof ReturnControl) {
                                objEval = ((ReturnControl) objEval).value;
                                interpreter.get_jjtree().reset();
                                if (callStack.depth() > 1) {
                                    callStack.clear();
                                    callStack.push(nameSpace);
                                }
                            } else {
                                interpreter.get_jjtree().reset();
                                if (callStack.depth() > 1) {
                                    callStack.clear();
                                    callStack.push(nameSpace);
                                }
                                i9++;
                            }
                        } catch (InterpreterError e6) {
                            throw new EvalError("Snapshot: " + str + " internal Error: " + e6.getMessage(), node, callStack, e6);
                        }
                    } catch (TargetError e7) {
                        if (e7.getNode() == null) {
                            e7.setNode(node);
                        }
                        throw e7.reThrow("Snapshot: " + str);
                    }
                } catch (EvalError e10) {
                    if (e10.getNode() == null) {
                        e10.setNode(node);
                    }
                    throw e10.reThrow("Snapshot: " + str);
                } catch (Exception e11) {
                    throw new EvalError("Snapshot: " + str + " unknown error: " + e11.getMessage(), node, callStack, e11);
                }
            } finally {
            }
        }
        return Primitive.unwrap(objEval);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object get(String str) throws EvalError {
        try {
            return Primitive.unwrap(this.globalNameSpace.get(str, this));
        } catch (UtilEvalError e6) {
            throw e6.toEvalError(Node.JAVACODE, new CallStack());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BshClassManager getClassManager() {
        return getNameSpace().getClassManager();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getCompatibility() {
        return this.compatibility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PrintStream getErr() {
        return this.console.getErr();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Reader getIn() {
        return this.console.getIn();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getInterface(Class<?> cls) {
        return this.globalNameSpace.getThis(this).getInterface(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NameSpace getNameSpace() {
        return this.globalNameSpace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PrintStream getOut() {
        return this.console.getOut();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Interpreter getParent() {
        return this.parent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getShowResults() {
        return this.showResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getSourceFileInfo() {
        String str = this.sourceFileInfo;
        return str != null ? str : "<unknown source>";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getStrictJava() {
        return this.strictJava;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getu(String str) {
        try {
            return get(str);
        } catch (EvalError e6) {
            C0353j.m1306d("set: ", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void installModule(BshModule bshModule) {
        bshModule.install(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void installModules(BshModule... bshModuleArr) {
        for (BshModule bshModule : bshModuleArr) {
            bshModule.install(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void loadRCFiles() {
        try {
            source(System.getProperty("user.home") + File.separator + ".bshrc", this.globalNameSpace);
        } catch (Exception e6) {
            debug("Could not find rc file: ", e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public File pathToFile(String str) {
        String str2 = (String) getu("bsh.cwd");
        File file = new File(str);
        if (!file.isAbsolute()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            file = new File(AbstractC0921a.m2255r(sb2, File.separator, str));
        }
        return new File(file.getCanonicalPath());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void print(Object obj) {
        this.console.print(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void println(Object obj) {
        this.console.println(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void reset() {
        getClassManager().reset();
        this.globalNameSpace.clear();
        Name.clearParts();
        Reflect.instanceCache.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public void run() {
        if (this.evalOnly) {
            C0353j.m1309g("bsh Interpreter: No stream");
            return;
        }
        if (this.interactive && getParent() == null) {
            try {
                eval("printBanner();");
            } catch (EvalError unused) {
                println("BeanShell 3.0.0.beta12");
            }
        }
        CallStack callStack = new CallStack(this.globalNameSpace);
        this.EOF = false;
        int i9 = -1;
        while (!Thread.interrupted() && !this.EOF) {
            try {
                try {
                    try {
                        try {
                            try {
                                if (this.interactive) {
                                    this.console.prompt(getBshPrompt());
                                }
                                this.EOF = readLine();
                                if (get_jjtree().nodeArity() > 0) {
                                    Node nodeRootNode = get_jjtree().rootNode();
                                    nodeRootNode.setSourceFile(this.sourceFileInfo);
                                    if (DEBUG.get().booleanValue()) {
                                        nodeRootNode.dump(">");
                                    }
                                    if (TRACE) {
                                        println("// " + nodeRootNode.getText());
                                    }
                                    Object objEval = nodeRootNode.eval(callStack, this);
                                    if (callStack.depth() > 1) {
                                        throw new InterpreterError("Callstack growing: " + callStack);
                                    }
                                    if (objEval instanceof ReturnControl) {
                                        objEval = ((ReturnControl) objEval).value;
                                    }
                                    if (this.interactive) {
                                        if (objEval != Primitive.VOID) {
                                            setu("$_", objEval);
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("$");
                                            i9++;
                                            sb2.append(i9 % 10);
                                            setu(sb2.toString(), objEval);
                                            if (this.showResults) {
                                                println("--> $" + (i9 % 10) + " = " + StringUtil.typeValueString(objEval));
                                            }
                                        } else if (this.showResults) {
                                            println("--> void");
                                        }
                                    }
                                }
                                get_jjtree().reset();
                            } catch (ParseException e6) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Parser Error: ");
                                ThreadLocal<Boolean> threadLocal = DEBUG;
                                sb3.append(e6.getMessage(threadLocal.get().booleanValue()));
                                error(sb3.toString());
                                if (threadLocal.get().booleanValue()) {
                                    e6.printStackTrace();
                                }
                                if (!this.interactive) {
                                    this.EOF = true;
                                }
                                this.parser.reInitInput(getIn());
                                get_jjtree().reset();
                                if (callStack.depth() > 1) {
                                }
                            }
                        } catch (InterpreterError e7) {
                            error("Internal Error: " + e7.getMessage());
                            if (!this.interactive) {
                                this.EOF = true;
                            }
                            get_jjtree().reset();
                            if (callStack.depth() > 1) {
                            }
                        }
                    } catch (TargetError e10) {
                        error("Target Exception: " + e10.getMessage());
                        if (e10.inNativeCode()) {
                            e10.printStackTrace(DEBUG.get().booleanValue(), getErr());
                        }
                        if (!this.interactive) {
                            this.EOF = true;
                        }
                        setu("$_e", e10.getTarget());
                        get_jjtree().reset();
                        if (callStack.depth() > 1) {
                        }
                    } catch (Exception e11) {
                        error("Unknown error: " + e11);
                        if (DEBUG.get().booleanValue()) {
                            e11.printStackTrace();
                        }
                        if (!this.interactive) {
                            this.EOF = true;
                        }
                        get_jjtree().reset();
                        if (callStack.depth() > 1) {
                        }
                    }
                } catch (EvalError e12) {
                    if (this.interactive) {
                        error("Evaluation Error: " + e12.getMessage());
                    } else {
                        error("Evaluation Error: " + e12.getRawMessage());
                    }
                    if (DEBUG.get().booleanValue()) {
                        e12.printStackTrace();
                    }
                    if (!this.interactive) {
                        this.EOF = true;
                    }
                    get_jjtree().reset();
                    if (callStack.depth() > 1) {
                    }
                } catch (TokenMgrException e13) {
                    error("Error parsing input: " + e13);
                    this.parser.reInitTokenInput(getIn());
                    if (!this.interactive) {
                        this.EOF = true;
                    }
                    get_jjtree().reset();
                    if (callStack.depth() > 1) {
                    }
                }
                if (callStack.depth() > 1) {
                    callStack.clear();
                    callStack.push(this.globalNameSpace);
                }
            } catch (Throwable th2) {
                get_jjtree().reset();
                if (callStack.depth() > 1) {
                    callStack.clear();
                    callStack.push(this.globalNameSpace);
                }
                throw th2;
            }
        }
        if (this.interactive && this.exitOnEOF) {
            System.exit(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void set(String str, Object obj) throws EvalError {
        CallStack callStack = new CallStack(this.globalNameSpace);
        try {
            boolean zIsCompound = Name.isCompound(str);
            NameSpace nameSpace = this.globalNameSpace;
            if (zIsCompound) {
                nameSpace.getNameResolver(str).toLHS(callStack, this).assign(obj, false);
            } else {
                nameSpace.setVariable(str, obj, false);
            }
        } catch (UtilEvalError e6) {
            throw e6.toEvalError(Node.JAVACODE, callStack);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setClassLoader(ClassLoader classLoader) {
        getClassManager().setClassLoader(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCompatibility(boolean z9) {
        this.compatibility = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setConsole(ConsoleAssignable consoleAssignable) {
        Interpreter interpreter;
        this.console = consoleAssignable;
        if (this.parser == null || get_jjtree().nodeArity() != 0 || ((interpreter = this.parent) != null && interpreter.interactive)) {
            this.parser = new Parser(getIn());
        } else {
            this.parser.ReInit(getIn());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErr(PrintStream printStream) {
        this.console.setErr(printStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setExitOnEOF(boolean z9) {
        this.exitOnEOF = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIn(Reader reader) {
        this.console.setIn(reader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNameSpace(NameSpace nameSpace) {
        this.globalNameSpace = nameSpace;
        if (nameSpace != null) {
            try {
                if (nameSpace.getVariable("bsh") instanceof This) {
                    return;
                }
                initRootSystemObject();
                if (this.interactive) {
                    loadRCFiles();
                }
            } catch (UtilEvalError e6) {
                throw new IllegalStateException(e6);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOut(PrintStream printStream) {
        this.console.setOut(printStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setShowResults(boolean z9) {
        this.showResults = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStrictJava(boolean z9) {
        this.strictJava = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setYieldDelay(int i9) {
        this.yield_for = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setu(String str, Object obj) {
        try {
            set(str, obj);
        } catch (EvalError e6) {
            C0353j.m1306d("set: ", e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String showEvalString(String str, String str2) {
        if (str2.length() > 80) {
            str2 = str2.substring(0, 80).concat(" . . . ");
        }
        return str.concat(" of: ``").concat(str2.replace('\n', ' ').replace('\r', ' ')).concat("''");
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object source(URL url, NameSpace nameSpace) throws IOException {
        debug("Sourcing file: ", url.toString());
        FileReader fileReader = new FileReader(url.openStream());
        try {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            try {
                Object objEval = eval(bufferedReader, nameSpace, url.toString());
                bufferedReader.close();
                fileReader.close();
                return objEval;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                fileReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String terminatedScript(String str) {
        return str.endsWith(";") ? str : str.concat(";");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void unset(String str) throws EvalError {
        try {
            LHS lhs = this.globalNameSpace.getNameResolver(str).toLHS(new CallStack(), this);
            if (lhs.type == 0) {
                lhs.nameSpace.unsetVariable(lhs.getName());
            } else {
                throw new EvalError("Can't unset, not a variable: " + str, Node.JAVACODE, new CallStack());
            }
        } catch (UtilEvalError e6) {
            throw new EvalError(e6.getMessage(), Node.JAVACODE, new CallStack(), e6);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Console implements ConsoleAssignable, Serializable {
        public static transient PrintStream debug = System.err;
        private static final long serialVersionUID = 1;
        public static String systemLineSeparator = "\n";
        private ConsoleInterface console;
        private transient PrintStream err;

        /* JADX INFO: renamed from: in */
        private transient Reader f977in;
        private transient PrintStream out;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Console(ConsoleInterface consoleInterface) {
            this.console = consoleInterface;
            this.f977in = consoleInterface.getIn();
            this.out = consoleInterface.getOut();
            PrintStream err = consoleInterface.getErr();
            this.err = err;
            debug = err;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.ConsoleInterface
        public void error(Object obj) {
            ConsoleInterface consoleInterface = this.console;
            if (consoleInterface != null) {
                consoleInterface.error("// Error: " + obj + systemLineSeparator);
                return;
            }
            if (this.out != null) {
                println("// Error: " + obj);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.ConsoleInterface
        public PrintStream getErr() {
            if (this.err == null) {
                this.err = System.err;
            }
            return this.err;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.ConsoleInterface
        public Reader getIn() {
            return this.f977in;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.ConsoleInterface
        public PrintStream getOut() {
            if (this.out == null) {
                this.out = System.out;
            }
            return this.out;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.ConsoleInterface
        public void print(Object obj) {
            ConsoleInterface consoleInterface = this.console;
            if (consoleInterface != null) {
                consoleInterface.print(obj);
                return;
            }
            PrintStream printStream = this.out;
            if (printStream != null) {
                printStream.print(obj);
                this.out.flush();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.ConsoleInterface
        public void println(Object obj) {
            ConsoleInterface consoleInterface = this.console;
            if (consoleInterface != null) {
                consoleInterface.println(obj);
                return;
            }
            print(obj + systemLineSeparator);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.ConsoleInterface
        public void prompt(String str) {
            ConsoleInterface consoleInterface = this.console;
            if (consoleInterface != null) {
                consoleInterface.prompt(str);
            } else {
                print(str);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.ConsoleAssignable
        public void setErr(PrintStream printStream) {
            this.err = printStream;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.ConsoleAssignable
        public void setIn(Reader reader) {
            this.f977in = reader;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.ConsoleAssignable
        public void setOut(PrintStream printStream) {
            this.out = printStream;
        }

        public Console(Reader reader, PrintStream printStream, PrintStream printStream2) {
            this.console = null;
            this.f977in = reader;
            this.out = printStream;
            this.err = printStream2;
            debug = printStream2;
        }
    }

    public void set(String str, long j3) throws EvalError {
        set(str, new Primitive(j3));
    }

    public void set(String str, int i9) throws EvalError {
        set(str, new Primitive(i9));
    }

    public void set(String str, double d10) throws EvalError {
        set(str, new Primitive(d10));
    }

    public void set(String str, float f3) throws EvalError {
        set(str, new Primitive(f3));
    }

    public void set(String str, boolean z9) throws EvalError {
        set(str, z9 ? Primitive.TRUE : Primitive.FALSE);
    }

    public void setConsole(ConsoleInterface consoleInterface) {
        setConsole((ConsoleAssignable) new Console(consoleInterface));
    }

    public Object source(File file, NameSpace nameSpace) throws IOException {
        debug("Sourcing file: ", file);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            return eval(bufferedReader, nameSpace, file.getName());
        } finally {
            bufferedReader.close();
        }
    }

    public Object source(String str, NameSpace nameSpace) {
        return source(pathToFile(str), nameSpace);
    }

    public Object source(URL url) {
        return source(url, this.globalNameSpace);
    }

    public Object source(File file) {
        return source(file, this.globalNameSpace);
    }

    public Object source(String str) {
        return source(str, this.globalNameSpace);
    }

    public Interpreter(Reader reader, PrintStream printStream, PrintStream printStream2, boolean z9, NameSpace nameSpace, Interpreter interpreter, String str) {
        this(new Console(reader, printStream, printStream2), z9, nameSpace, interpreter, str);
    }

    public Interpreter(Reader reader, PrintStream printStream, PrintStream printStream2, boolean z9, NameSpace nameSpace) {
        this(reader, printStream, printStream2, z9, nameSpace, null, null);
    }

    public Interpreter(Reader reader, PrintStream printStream, PrintStream printStream2, boolean z9) {
        this(reader, printStream, printStream2, z9, (NameSpace) null);
    }

    public Interpreter(ConsoleInterface consoleInterface, NameSpace nameSpace, Interpreter interpreter) {
        this((ConsoleAssignable) new Console(consoleInterface), true, nameSpace, interpreter, interpreter == null ? null : interpreter.sourceFileInfo);
    }

    public Interpreter(ConsoleInterface consoleInterface, Interpreter interpreter) {
        this(consoleInterface, interpreter.globalNameSpace, interpreter);
    }

    public Interpreter(ConsoleInterface consoleInterface, NameSpace nameSpace) {
        this(consoleInterface, nameSpace, (Interpreter) null);
    }

    public Interpreter(ConsoleInterface consoleInterface) {
        this(consoleInterface, (NameSpace) null, (Interpreter) null);
    }

    public Interpreter() {
        this((NameSpace) null, (Interpreter) null, HttpUrl.FRAGMENT_ENCODE_SET);
        this.sourceFileInfo = null;
    }

    public Interpreter(NameSpace nameSpace) {
        this(nameSpace, (Interpreter) null, (String) null);
    }

    public Interpreter(NameSpace nameSpace, String str) {
        this(nameSpace, (Interpreter) null, str);
    }

    public Interpreter(NameSpace nameSpace, Interpreter interpreter) {
        this(nameSpace, interpreter, (String) null);
    }

    public Interpreter(NameSpace nameSpace, Interpreter interpreter, String str) {
        this(null, System.out, System.err, false, nameSpace, interpreter, str);
        this.evalOnly = true;
        setu("bsh.evalOnly", Primitive.TRUE);
    }

    public Interpreter(Interpreter interpreter) {
        this(interpreter.console, interpreter.interactive, interpreter.globalNameSpace, interpreter, interpreter.sourceFileInfo);
    }

    public BshSnapshot compileSnapshot(String str, String str2) {
        return compileSnapshot(new StringReader(terminatedScript(str)), this.globalNameSpace, str2);
    }

    public BshSnapshot compileSnapshot(String str) {
        return compileSnapshot(str, "snapshot string");
    }

    public void compileSnapshot(String str, String str2, SecretKey secretKey) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            try {
                BshSnapshotHelper.writeEncrypted(compileSnapshot(bufferedReader, this.globalNameSpace, str), fileOutputStream, secretKey);
            } finally {
                fileOutputStream.close();
            }
        } finally {
            bufferedReader.close();
        }
    }

    public Object evalSnapshot(BshSnapshot bshSnapshot) {
        return evalSnapshot(bshSnapshot, this.globalNameSpace, "snapshot");
    }

    public Object evalSnapshot(InputStream inputStream, SecretKey secretKey, String str) {
        return evalSnapshot(BshSnapshotHelper.readEncrypted(inputStream, secretKey), this.globalNameSpace, str);
    }

    public Object evalSnapshot(InputStream inputStream, SecretKey secretKey) {
        return evalSnapshot(inputStream, secretKey, "snapshot stream");
    }

    public Object evalSnapshot(File file, SecretKey secretKey) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return evalSnapshot(fileInputStream, secretKey, file.getName());
        } finally {
            fileInputStream.close();
        }
    }

    public Object evalSnapshot(String str, SecretKey secretKey) {
        return evalSnapshot(pathToFile(str), secretKey);
    }

    public Object eval(Reader reader) {
        NameSpace nameSpace = this.globalNameSpace;
        String str = this.sourceFileInfo;
        if (str == null) {
            str = "eval stream";
        }
        return eval(reader, nameSpace, str);
    }

    public Object eval(String str) {
        debug("eval(String): ", str);
        return eval(str, this.globalNameSpace, "eval string");
    }

    public Object eval(String str, String str2) {
        debug("eval(String,String): ", str, str2);
        return eval(str, this.globalNameSpace, str2);
    }

    public Object eval(String str, NameSpace nameSpace, String str2) {
        return eval(new StringReader(terminatedScript(str)), nameSpace, str2);
    }
}
