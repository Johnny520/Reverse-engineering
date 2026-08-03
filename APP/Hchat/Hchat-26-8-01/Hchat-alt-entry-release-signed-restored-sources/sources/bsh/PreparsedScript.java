package bsh;

import java.io.PrintStream;
import java.io.StringReader;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class PreparsedScript {
    private final Interpreter interpreter;
    private final BshMethod prepared;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PreparsedScript(String str, ClassLoader classLoader) {
        Interpreter interpreter = new Interpreter();
        this.interpreter = interpreter;
        interpreter.setClassLoader(classLoader);
        try {
            this.prepared = ((This) interpreter.eval(new StringReader("__execute() {" + interpreter.terminatedScript(str) + "} return this;"), interpreter.globalNameSpace, interpreter.showEvalString("pre-parsed script", str))).getNameSpace().getMethod("__execute", Reflect.ZERO_TYPES, false);
        } catch (UtilEvalError e6) {
            throw new IllegalStateException(e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static ClassLoader getDefaultClassLoader() {
        ClassLoader classLoader;
        try {
            classLoader = Thread.currentThread().getContextClassLoader();
        } catch (SecurityException unused) {
            classLoader = null;
        }
        if (classLoader == null) {
            classLoader = PreparsedScript.class.getClassLoader();
        }
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object invoke(Map<String, ?> map) throws EvalError {
        Interpreter interpreter = this.interpreter;
        NameSpace nameSpace = new NameSpace(interpreter.globalNameSpace, interpreter.getClassManager(), "BeanshellExecutable");
        nameSpace.isMethod = true;
        Interpreter interpreter2 = new Interpreter(nameSpace, this.interpreter);
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            interpreter2.set(entry.getKey(), entry.getValue());
        }
        return Primitive.unwrap(this.prepared.invoke(Reflect.ZERO_ARGS, interpreter2, new CallStack(nameSpace), Node.JAVACODE, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErr(PrintStream printStream) {
        this.interpreter.setErr(printStream);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOut(PrintStream printStream) {
        this.interpreter.setOut(printStream);
    }

    public PreparsedScript(String str) {
        this(str, getDefaultClassLoader());
    }
}
