package bsh;

import androidx.activity.AbstractC0053;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import p007.AbstractC6136;
import p103.C7270;
import p137.InterfaceC7527;
import p281.C8371;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class Interpreter implements Runnable, Serializable, InterfaceC2656 {
    public static boolean COMPATIBIILTY = false;
    public static boolean TRACE = false;
    public static final String VERSION = "3.0.0.beta11";
    private static final long serialVersionUID = 1;
    private boolean EOF;
    private boolean compatibility;
    InterfaceC2626 console;
    protected boolean evalOnly;
    private boolean exitOnEOF;
    NameSpace globalNameSpace;
    protected boolean interactive;
    Interpreter parent;
    transient C2613 parser;
    private boolean showResults;
    String sourceFileInfo;
    private boolean strictJava;
    private int yield_for;
    public static final ThreadLocal<Boolean> DEBUG = ThreadLocal.withInitial(new C2631(0));
    private static final This SYSTEM_OBJECT = This.getThis(new NameSpace(null, null, "bsh.system"), null);
    public static final C8371 mainSecurityGuard = new C8371();

    public Interpreter(InterfaceC2626 interfaceC2626, boolean z, NameSpace nameSpace, Interpreter interpreter, String str) {
        this.strictJava = false;
        this.yield_for = -1;
        this.exitOnEOF = true;
        this.showResults = true;
        this.compatibility = COMPATIBIILTY;
        ThreadLocal<Boolean> threadLocal = DEBUG;
        long jNanoTime = threadLocal.get().booleanValue() ? System.nanoTime() : 0L;
        this.interactive = z;
        this.parent = interpreter;
        if (interpreter != null) {
            setStrictJava(interpreter.strictJava);
            this.parser = interpreter.parser;
            this.evalOnly = interpreter.evalOnly;
        }
        this.sourceFileInfo = str;
        nameSpace = nameSpace == null ? new NameSpace(nameSpace, C2659.m5323(this), "global") : nameSpace;
        setConsole(interfaceC2626);
        setNameSpace(nameSpace);
        getClassManager().mo5090(this);
        if (threadLocal.get().booleanValue()) {
            debug("Time to initialize interpreter: interactive=", Boolean.valueOf(z), " ", Long.valueOf(System.nanoTime() - jNanoTime), " nanoseconds.");
        }
    }

    private void _yield() {
        int i = this.yield_for;
        if (i < 0) {
            return;
        }
        try {
            Thread.sleep(i);
        } catch (InterruptedException unused) {
        }
    }

    public static final void debug(Object... objArr) {
        if (DEBUG.get().booleanValue()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                sb.append(obj);
            }
            Console.debug.println("// Debug: ".concat(sb.toString()));
        }
    }

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
        } catch (Throwable th) {
            if (zBooleanValue) {
                DEBUG.set(bool);
            }
            throw th;
        }
    }

    public static boolean getSaveClasses() {
        return (getSaveClassesDir() == null || getSaveClassesDir().isEmpty()) ? false : true;
    }

    public static String getSaveClassesDir() {
        return System.getProperty("bsh.debugClasses");
    }

    private JJTParserState get_jjtree() {
        return this.parser.f7845;
    }

    private void initRootSystemObject() {
        C2659 classManager = getClassManager();
        setu("bsh", new NameSpace(null, classManager, "Bsh Object").getThis(this));
        This r1 = SYSTEM_OBJECT;
        setu("bsh.system", r1);
        setu("bsh.shared", r1);
        setu("bsh.help", new NameSpace(null, classManager, "Bsh Command Help Text").getThis(this));
        setu("bsh.cwd", System.getProperty("user.dir"));
        setu("bsh.interactive", this.interactive ? Primitive.TRUE : Primitive.FALSE);
        setu("bsh.evalOnly", Primitive.FALSE);
        setu("bsh.version", VERSION);
    }

    public static void invokeMain(Class<?> cls, String[] strArr) {
        AbstractC2624 abstractC2624M5392 = AbstractC2666.m5392(cls, "main", new Class[]{String[].class}, true);
        if (abstractC2624M5392 != null) {
            abstractC2624M5392.mo5272(null, strArr);
        }
    }

    public static void main(String[] strArr) {
        String[] strArr2;
        if (strArr.length <= 0) {
            try {
                C2633 c2633 = new C2633(System.in);
                try {
                    C2627 c2627 = new C2627(c2633);
                    try {
                        new Interpreter(c2627, System.out, System.err, true).run();
                        c2627.close();
                        c2633.close();
                        return;
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e) {
                System.err.println("I/O Error closing command line reader: " + e);
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
                } catch (Exception e2) {
                    e = e2;
                    if (e instanceof InvocationTargetException) {
                        e = e.getCause();
                    }
                    System.err.println("Class: " + objSource + " main method threw exception:" + e);
                }
            }
        } catch (TargetError e3) {
            System.err.println("Script threw exception: " + e3);
            if (e3.inNativeCode()) {
                e3.printStackTrace(DEBUG.get().booleanValue(), System.err);
            }
        } catch (EvalError e4) {
            System.err.println("Evaluation Error: " + e4);
        } catch (FileNotFoundException e5) {
            System.err.println("File not found: " + e5);
        } catch (IOException e6) {
            System.err.println("I/O Error: " + e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x012f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String preprocessScript(java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 1181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.Interpreter.preprocessScript(java.lang.String):java.lang.String");
    }

    private boolean readLine() throws ParseException {
        try {
            return this.parser.m5127();
        } catch (ParseException e) {
            this._yield();
            if (this.EOF) {
                return true;
            }
            throw e;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        setOut(System.out);
        setErr(System.err);
    }

    private String readSource(Reader reader, String str) throws EvalError {
        try {
            StringBuilder sb = new StringBuilder(1024);
            char[] cArr = new char[4096];
            while (true) {
                int i = reader.read(cArr);
                if (i == -1) {
                    return sb.toString();
                }
                sb.append(cArr, 0, i);
            }
        } catch (IOException e) {
            StringBuilder sbM11550 = AbstractC6136.m11550("Sourced file: ", str, " read error: ");
            sbM11550.append(e.getMessage());
            throw new EvalError(sbM11550.toString(), null, null, e);
        }
    }

    public static void redirectOutputToFile(String str) {
        try {
            PrintStream printStream = new PrintStream((OutputStream) new FileOutputStream(str), true, "UTF-8");
            System.setOut(printStream);
            System.setErr(printStream);
        } catch (IOException unused) {
            System.err.println("Can't redirect output to file: " + str);
        }
    }

    public static void setShutdownOnExit(boolean z) {
        try {
            SYSTEM_OBJECT.getNameSpace().setVariable("shutdownOnExit", Boolean.valueOf(z), false);
        } catch (UtilEvalError e) {
            C2632.m5292(e);
        }
    }

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
        } catch (SecurityException e) {
            System.err.println("Could not init static:" + e);
        } catch (Exception e2) {
            System.err.println("Could not init static(2):" + e2);
        } catch (Throwable th) {
            System.err.println("Could not init static(3):" + th);
        }
    }

    public void addClassLoader(ClassLoader classLoader) {
        C2659 classManager = getClassManager();
        C7270 c7270 = classManager.f7962;
        if (classLoader != null) {
            c7270.f19374.add(classLoader);
        } else {
            c7270.getClass();
        }
        classManager.mo5088();
    }

    @Override // bsh.InterfaceC2656
    public void classLoaderChanged() {
        AbstractC2666.f7995.clear();
    }

    public final void error(Object obj) {
        this.console.error(obj);
    }

    public Object eval(Reader reader, NameSpace nameSpace, String str) {
        String strPreprocessScript = preprocessScript(readSource(reader, str));
        debug("eval: nameSpace = ", nameSpace);
        Interpreter interpreter = new Interpreter(new StringReader(terminatedScript(strPreprocessScript)), getOut(), getErr(), false, nameSpace, this, str);
        CallStack callStack = new CallStack(nameSpace);
        Object objEval = null;
        boolean z = false;
        InterfaceC2618 interfaceC2618RootNode = null;
        while (true) {
            if (z) {
                break;
            }
            try {
                try {
                    try {
                        try {
                            boolean line = interpreter.readLine();
                            if (interpreter.get_jjtree().nodeArity() > 0) {
                                interfaceC2618RootNode = interpreter.get_jjtree().rootNode();
                                interfaceC2618RootNode.setSourceFile(str);
                                if (TRACE) {
                                    println("// " + interfaceC2618RootNode.getText());
                                }
                                objEval = interfaceC2618RootNode.eval(callStack, interpreter);
                                if (callStack.depth() > 1) {
                                    throw new InterpreterError("Callstack growing: " + callStack);
                                }
                                if (objEval instanceof C2667) {
                                    objEval = ((C2667) objEval).f8003;
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
                            z = line;
                        } catch (EvalError e) {
                            if (DEBUG.get().booleanValue()) {
                                e.printStackTrace();
                            }
                            if (e.getNode() == null) {
                                e.setNode(interfaceC2618RootNode);
                            }
                            throw e.reThrow("Sourced file: " + str);
                        } catch (TokenMgrException e2) {
                            throw new EvalError("Sourced file: " + str + " Token Parsing Error: " + e2.getMessage(), interfaceC2618RootNode, callStack, e2);
                        }
                    } catch (InterpreterError e3) {
                        throw new EvalError("Sourced file: " + str + " internal Error: " + e3.getMessage(), interfaceC2618RootNode, callStack, e3);
                    } catch (ParseException e4) {
                        ThreadLocal<Boolean> threadLocal = DEBUG;
                        if (threadLocal.get().booleanValue()) {
                            error(e4.getMessage(threadLocal.get().booleanValue()));
                        }
                        e4.setErrorSourceFile(str);
                        throw e4;
                    }
                } catch (TargetError e5) {
                    if (e5.getNode() == null) {
                        e5.setNode(interfaceC2618RootNode);
                    }
                    throw e5.reThrow("Sourced file: " + str);
                } catch (Exception e6) {
                    if (DEBUG.get().booleanValue()) {
                        e6.printStackTrace();
                    }
                    throw new EvalError("Sourced file: " + str + " unknown error: " + e6.getMessage(), interfaceC2618RootNode, callStack, e6);
                }
            } finally {
            }
        }
        return Primitive.unwrap(objEval);
    }

    public Object get(String str) throws EvalError {
        try {
            return Primitive.unwrap(this.globalNameSpace.get(str, this));
        } catch (UtilEvalError e) {
            throw e.toEvalError(InterfaceC2618.f7849, new CallStack());
        }
    }

    public C2659 getClassManager() {
        return getNameSpace().getClassManager();
    }

    public boolean getCompatibility() {
        return this.compatibility;
    }

    public PrintStream getErr() {
        return this.console.getErr();
    }

    public Reader getIn() {
        return this.console.getIn();
    }

    public Object getInterface(Class<?> cls) {
        return this.globalNameSpace.getThis(this).getInterface(cls);
    }

    public NameSpace getNameSpace() {
        return this.globalNameSpace;
    }

    public PrintStream getOut() {
        return this.console.getOut();
    }

    public Interpreter getParent() {
        return this.parent;
    }

    public boolean getShowResults() {
        return this.showResults;
    }

    public String getSourceFileInfo() {
        String str = this.sourceFileInfo;
        return str != null ? str : "<unknown source>";
    }

    public boolean getStrictJava() {
        return this.strictJava;
    }

    public Object getu(String str) {
        try {
            return get(str);
        } catch (EvalError e) {
            C2632.m5293("set: ", e);
            return null;
        }
    }

    public void installModule(InterfaceC7527 interfaceC7527) {
        interfaceC7527.m12724();
    }

    public void installModules(InterfaceC7527... interfaceC7527Arr) {
        if (interfaceC7527Arr.length <= 0) {
            return;
        }
        InterfaceC7527 interfaceC7527 = interfaceC7527Arr[0];
        throw null;
    }

    public void loadRCFiles() {
        try {
            source(System.getProperty("user.home") + File.separator + ".bshrc", this.globalNameSpace);
        } catch (Exception e) {
            debug("Could not find rc file: ", e);
        }
    }

    public File pathToFile(String str) {
        String str2 = (String) getu("bsh.cwd");
        File file = new File(str);
        if (!file.isAbsolute()) {
            file = new File(AbstractC0053.m146(AbstractC0053.m149(str2), File.separator, str));
        }
        return new File(file.getCanonicalPath());
    }

    public final void print(Object obj) {
        this.console.print(obj);
    }

    public final void println(Object obj) {
        this.console.println(obj);
    }

    public void reset() {
        getClassManager().mo5092();
        this.globalNameSpace.clear();
        Name.clearParts();
        AbstractC2666.f7995.clear();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.evalOnly) {
            C2632.m5294("bsh Interpreter: No stream");
            return;
        }
        if (this.interactive && getParent() == null) {
            try {
                eval("printBanner();");
            } catch (EvalError unused) {
                println("BeanShell 3.0.0.beta11");
            }
        }
        CallStack callStack = new CallStack(this.globalNameSpace);
        this.EOF = false;
        int i = -1;
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
                                    InterfaceC2618 interfaceC2618RootNode = get_jjtree().rootNode();
                                    interfaceC2618RootNode.setSourceFile(this.sourceFileInfo);
                                    if (DEBUG.get().booleanValue()) {
                                        interfaceC2618RootNode.dump(">");
                                    }
                                    if (TRACE) {
                                        println("// " + interfaceC2618RootNode.getText());
                                    }
                                    Object objEval = interfaceC2618RootNode.eval(callStack, this);
                                    if (callStack.depth() > 1) {
                                        throw new InterpreterError("Callstack growing: " + callStack);
                                    }
                                    if (objEval instanceof C2667) {
                                        objEval = ((C2667) objEval).f8003;
                                    }
                                    if (this.interactive) {
                                        if (objEval != Primitive.VOID) {
                                            setu("$_", objEval);
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("$");
                                            i++;
                                            sb.append(i % 10);
                                            setu(sb.toString(), objEval);
                                            if (this.showResults) {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("--> $");
                                                sb2.append(i % 10);
                                                sb2.append(" = ");
                                                sb2.append(AbstractC2628.m5284(objEval) + " :" + AbstractC2628.m5283(objEval));
                                                println(sb2.toString());
                                            }
                                        } else if (this.showResults) {
                                            println("--> void");
                                        }
                                    }
                                }
                                get_jjtree().reset();
                            } catch (ParseException e) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Parser Error: ");
                                ThreadLocal<Boolean> threadLocal = DEBUG;
                                sb3.append(e.getMessage(threadLocal.get().booleanValue()));
                                error(sb3.toString());
                                if (threadLocal.get().booleanValue()) {
                                    e.printStackTrace();
                                }
                                if (!this.interactive) {
                                    this.EOF = true;
                                }
                                this.parser.m5239(getIn());
                                get_jjtree().reset();
                                if (callStack.depth() > 1) {
                                }
                            }
                        } catch (InterpreterError e2) {
                            error("Internal Error: " + e2.getMessage());
                            if (!this.interactive) {
                                this.EOF = true;
                            }
                            get_jjtree().reset();
                            if (callStack.depth() > 1) {
                            }
                        }
                    } catch (TargetError e3) {
                        error("Target Exception: " + e3.getMessage());
                        if (e3.inNativeCode()) {
                            e3.printStackTrace(DEBUG.get().booleanValue(), getErr());
                        }
                        if (!this.interactive) {
                            this.EOF = true;
                        }
                        setu("$_e", e3.getTarget());
                        get_jjtree().reset();
                        if (callStack.depth() > 1) {
                        }
                    } catch (Exception e4) {
                        error("Unknown error: " + e4);
                        if (DEBUG.get().booleanValue()) {
                            e4.printStackTrace();
                        }
                        if (!this.interactive) {
                            this.EOF = true;
                        }
                        get_jjtree().reset();
                        if (callStack.depth() > 1) {
                        }
                    }
                } catch (EvalError e5) {
                    if (this.interactive) {
                        error("Evaluation Error: " + e5.getMessage());
                    } else {
                        error("Evaluation Error: " + e5.getRawMessage());
                    }
                    if (DEBUG.get().booleanValue()) {
                        e5.printStackTrace();
                    }
                    if (!this.interactive) {
                        this.EOF = true;
                    }
                    get_jjtree().reset();
                    if (callStack.depth() > 1) {
                    }
                } catch (TokenMgrException e6) {
                    error("Error parsing input: " + e6);
                    this.parser.m5240(getIn());
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
            } catch (Throwable th) {
                get_jjtree().reset();
                if (callStack.depth() > 1) {
                    callStack.clear();
                    callStack.push(this.globalNameSpace);
                }
                throw th;
            }
        }
        if (this.interactive && this.exitOnEOF) {
            System.exit(0);
        }
    }

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
        } catch (UtilEvalError e) {
            throw e.toEvalError(InterfaceC2618.f7849, callStack);
        }
    }

    public void setClassLoader(ClassLoader classLoader) {
        C2659 classManager = getClassManager();
        classManager.f7963 = classLoader;
        classManager.mo5088();
    }

    public void setCompatibility(boolean z) {
        this.compatibility = z;
    }

    public void setConsole(InterfaceC2626 interfaceC2626) {
        Interpreter interpreter;
        this.console = interfaceC2626;
        if (this.parser == null || get_jjtree().nodeArity() != 0 || ((interpreter = this.parent) != null && interpreter.interactive)) {
            this.parser = new C2613(getIn());
        } else {
            this.parser.m5124(getIn());
        }
    }

    public void setErr(PrintStream printStream) {
        this.console.setErr(printStream);
    }

    public void setExitOnEOF(boolean z) {
        this.exitOnEOF = z;
    }

    public void setIn(Reader reader) {
        this.console.setIn(reader);
    }

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
            } catch (UtilEvalError e) {
                C2632.m5292(e);
            }
        }
    }

    public void setOut(PrintStream printStream) {
        this.console.setOut(printStream);
    }

    public void setShowResults(boolean z) {
        this.showResults = z;
    }

    public void setStrictJava(boolean z) {
        this.strictJava = z;
    }

    public void setYieldDelay(int i) {
        this.yield_for = i;
    }

    public void setu(String str, Object obj) {
        try {
            set(str, obj);
        } catch (EvalError e) {
            C2632.m5293("set: ", e);
        }
    }

    public String showEvalString(String str, String str2) {
        if (str2.length() > 80) {
            str2 = str2.substring(0, 80).concat(" . . . ");
        }
        return str.concat(" of: ``").concat(str2.replace('\n', ' ').replace('\r', ' ')).concat("''");
    }

    public Object source(URL url, NameSpace nameSpace) throws IOException {
        debug("Sourcing file: ", url.toString());
        C2633 c2633 = new C2633(url.openStream());
        try {
            BufferedReader bufferedReader = new BufferedReader(c2633);
            try {
                Object objEval = eval(bufferedReader, nameSpace, url.toString());
                bufferedReader.close();
                c2633.close();
                return objEval;
            } finally {
            }
        } catch (Throwable th) {
            try {
                c2633.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public String terminatedScript(String str) {
        return str.endsWith(";") ? str : str.concat(";");
    }

    public void unset(String str) throws EvalError {
        try {
            LHS lhs = this.globalNameSpace.getNameResolver(str).toLHS(new CallStack(), this);
            if (lhs.type == 0) {
                lhs.nameSpace.unsetVariable(lhs.getName());
            } else {
                throw new EvalError("Can't unset, not a variable: " + str, InterfaceC2618.f7849, new CallStack());
            }
        } catch (UtilEvalError e) {
            throw new EvalError(e.getMessage(), InterfaceC2618.f7849, new CallStack(), e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class Console implements InterfaceC2626, Serializable {
        public static transient PrintStream debug = System.err;
        private static final long serialVersionUID = 1;
        public static String systemLineSeparator = "\n";
        private InterfaceC2625 console;
        private transient PrintStream err;
        private transient Reader in;
        private transient PrintStream out;

        public Console(InterfaceC2625 interfaceC2625) {
            this.console = interfaceC2625;
            this.in = interfaceC2625.getIn();
            this.out = interfaceC2625.getOut();
            PrintStream err = interfaceC2625.getErr();
            this.err = err;
            debug = err;
        }

        @Override // bsh.InterfaceC2625
        public void error(Object obj) {
            InterfaceC2625 interfaceC2625 = this.console;
            if (interfaceC2625 != null) {
                interfaceC2625.error("// Error: " + obj + systemLineSeparator);
                return;
            }
            if (this.out != null) {
                println("// Error: " + obj);
            }
        }

        @Override // bsh.InterfaceC2625
        public PrintStream getErr() {
            if (this.err == null) {
                this.err = System.err;
            }
            return this.err;
        }

        @Override // bsh.InterfaceC2625
        public Reader getIn() {
            return this.in;
        }

        @Override // bsh.InterfaceC2625
        public PrintStream getOut() {
            if (this.out == null) {
                this.out = System.out;
            }
            return this.out;
        }

        @Override // bsh.InterfaceC2625
        public void print(Object obj) {
            InterfaceC2625 interfaceC2625 = this.console;
            if (interfaceC2625 != null) {
                interfaceC2625.print(obj);
                return;
            }
            PrintStream printStream = this.out;
            if (printStream != null) {
                printStream.print(obj);
                this.out.flush();
            }
        }

        @Override // bsh.InterfaceC2625
        public void println(Object obj) {
            InterfaceC2625 interfaceC2625 = this.console;
            if (interfaceC2625 != null) {
                interfaceC2625.println(obj);
                return;
            }
            print(obj + systemLineSeparator);
        }

        @Override // bsh.InterfaceC2625
        public void prompt(String str) {
            InterfaceC2625 interfaceC2625 = this.console;
            if (interfaceC2625 != null) {
                interfaceC2625.prompt(str);
            } else {
                print(str);
            }
        }

        @Override // bsh.InterfaceC2626
        public void setErr(PrintStream printStream) {
            this.err = printStream;
        }

        @Override // bsh.InterfaceC2626
        public void setIn(Reader reader) {
            this.in = reader;
        }

        @Override // bsh.InterfaceC2626
        public void setOut(PrintStream printStream) {
            this.out = printStream;
        }

        public Console(Reader reader, PrintStream printStream, PrintStream printStream2) {
            this.console = null;
            this.in = reader;
            this.out = printStream;
            this.err = printStream2;
            debug = printStream2;
        }
    }

    public void set(String str, long j) throws EvalError {
        set(str, new Primitive(j));
    }

    public void set(String str, int i) throws EvalError {
        set(str, new Primitive(i));
    }

    public void set(String str, double d) throws EvalError {
        set(str, new Primitive(d));
    }

    public void set(String str, float f) throws EvalError {
        set(str, new Primitive(f));
    }

    public void set(String str, boolean z) throws EvalError {
        set(str, z ? Primitive.TRUE : Primitive.FALSE);
    }

    public void setConsole(InterfaceC2625 interfaceC2625) {
        setConsole((InterfaceC2626) new Console(interfaceC2625));
    }

    public Object source(File file, NameSpace nameSpace) throws IOException {
        debug("Sourcing file: ", file);
        BufferedReader bufferedReader = new BufferedReader(new C2633(new FileInputStream(file)));
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

    public Interpreter(Reader reader, PrintStream printStream, PrintStream printStream2, boolean z, NameSpace nameSpace, Interpreter interpreter, String str) {
        this(new Console(reader, printStream, printStream2), z, nameSpace, interpreter, str);
    }

    public Interpreter(Reader reader, PrintStream printStream, PrintStream printStream2, boolean z, NameSpace nameSpace) {
        this(reader, printStream, printStream2, z, nameSpace, null, null);
    }

    public Interpreter(Reader reader, PrintStream printStream, PrintStream printStream2, boolean z) {
        this(reader, printStream, printStream2, z, (NameSpace) null);
    }

    public Interpreter(InterfaceC2625 interfaceC2625, NameSpace nameSpace, Interpreter interpreter) {
        this((InterfaceC2626) new Console(interfaceC2625), true, nameSpace, interpreter, interpreter == null ? null : interpreter.sourceFileInfo);
    }

    public Interpreter(InterfaceC2625 interfaceC2625, Interpreter interpreter) {
        this(interfaceC2625, interpreter.globalNameSpace, interpreter);
    }

    public Interpreter(InterfaceC2625 interfaceC2625, NameSpace nameSpace) {
        this(interfaceC2625, nameSpace, (Interpreter) null);
    }

    public Interpreter(InterfaceC2625 interfaceC2625) {
        this(interfaceC2625, (NameSpace) null, (Interpreter) null);
    }

    public Interpreter() {
        this((NameSpace) null, (Interpreter) null, "");
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
