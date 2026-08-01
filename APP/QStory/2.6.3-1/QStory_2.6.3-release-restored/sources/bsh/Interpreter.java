package bsh;

import androidx.activity.AbstractC0900;
import androidx.compose.animation.core.C1164;
import androidx.compose.p001ui.text.input.C2853;
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
import java.util.ArrayList;
import java.util.HashSet;
import p025.AbstractC7012;
import p119.C8100;
import p153.InterfaceC8357;
import p269.AbstractC9019;
import p297.C9201;
import p298.AbstractC9203;
import p298.AbstractC9205;
import p298.C9204;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class Interpreter implements Runnable, Serializable, InterfaceC3490 {
    public static boolean COMPATIBIILTY = false;
    public static boolean TRACE = false;
    public static final String VERSION = "3.0.0.beta11";
    private static final long serialVersionUID = 1;
    private boolean EOF;
    private boolean compatibility;
    InterfaceC3460 console;
    protected boolean evalOnly;
    private boolean exitOnEOF;
    NameSpace globalNameSpace;
    protected boolean interactive;
    Interpreter parent;
    transient C3447 parser;
    private boolean showResults;
    String sourceFileInfo;
    private boolean strictJava;
    private int yield_for;
    public static final ThreadLocal<Boolean> DEBUG = ThreadLocal.withInitial(new C3465(0));
    private static final This SYSTEM_OBJECT = This.getThis(new NameSpace(null, null, "bsh.system"), null);
    public static final C9201 mainSecurityGuard = new C9201();

    public Interpreter(InterfaceC3460 interfaceC3460, boolean z, NameSpace nameSpace, Interpreter interpreter, String str) {
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
        nameSpace = nameSpace == null ? new NameSpace(nameSpace, C3493.m5928(this), "global") : nameSpace;
        setConsole(interfaceC3460);
        setNameSpace(nameSpace);
        getClassManager().mo5695(this);
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
        return this.parser.f8192;
    }

    private void initRootSystemObject() {
        C3493 classManager = getClassManager();
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
        AbstractC3458 abstractC3458M5997 = AbstractC3500.m5997(cls, "main", new Class[]{String[].class}, true);
        if (abstractC3458M5997 != null) {
            abstractC3458M5997.mo5877(null, strArr);
        }
    }

    public static void main(String[] strArr) {
        String[] strArr2;
        if (strArr.length <= 0) {
            try {
                C3467 c3467 = new C3467(System.in);
                try {
                    C3461 c3461 = new C3461(c3467);
                    try {
                        new Interpreter(c3461, System.out, System.err, true).run();
                        c3461.close();
                        c3467.close();
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
    */
    private String preprocessScript(String str) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int size;
        C1164 c1164;
        ArrayList arrayList;
        boolean z3;
        int i5;
        C2853 c2853M14445;
        int i6;
        char cCharAt;
        String string = str;
        HashSet hashSet = AbstractC9205.f23472;
        char c = ')';
        char c2 = '(';
        if (string == null || string.indexOf(64) < 0) {
            z = true;
        } else {
            int length = string.length();
            StringBuilder sb = new StringBuilder(length);
            int i7 = 0;
            while (i7 < length) {
                int iM14448 = AbstractC9205.m14448(i7, string);
                if (iM14448 > i7) {
                    sb.append((CharSequence) string, i7, iM14448);
                } else if (string.charAt(i7) != '@') {
                    sb.append(string.charAt(i7));
                    i7++;
                } else {
                    int length2 = string.length();
                    int i8 = i7 + 1;
                    if (i8 >= length2 || !((cCharAt = string.charAt(i8)) == '_' || Character.isLetterOrDigit(cCharAt))) {
                        iM14448 = -1;
                        if (iM14448 <= i7) {
                            sb.append((CharSequence) string, i7, iM14448);
                        } else {
                            int length3 = string.length();
                            if (i8 < length3 && Character.isJavaIdentifierStart(string.charAt(i8))) {
                                i6 = i8;
                                while (i6 < length3 && Character.isJavaIdentifierPart(string.charAt(i6))) {
                                    i6++;
                                }
                                if (!string.substring(i8, i6).equals("interface")) {
                                    while (i6 < length3 && string.charAt(i6) == '.') {
                                        i6++;
                                        if (i6 >= length3 || !Character.isJavaIdentifierStart(string.charAt(i6))) {
                                            break;
                                        }
                                        while (i6 < length3 && Character.isJavaIdentifierPart(string.charAt(i6))) {
                                            i6++;
                                        }
                                    }
                                    while (i6 < length3) {
                                        char cCharAt2 = string.charAt(i6);
                                        if (cCharAt2 != ' ' && cCharAt2 != '\t' && cCharAt2 != '\f') {
                                            break;
                                        }
                                        i6++;
                                    }
                                    if (i6 < length3 && string.charAt(i6) == '(') {
                                        int length4 = string.length();
                                        int i9 = 0;
                                        while (true) {
                                            if (i6 >= length4) {
                                                i6 = -1;
                                                break;
                                            }
                                            int iM144482 = AbstractC9205.m14448(i6, string);
                                            if (iM144482 <= i6) {
                                                char cCharAt3 = string.charAt(i6);
                                                if (cCharAt3 != '(') {
                                                    if (cCharAt3 == ')' && i9 - 1 == 0) {
                                                        break;
                                                    }
                                                } else {
                                                    i9++;
                                                }
                                            } else {
                                                i6 = iM144482 - 1;
                                            }
                                            i6++;
                                        }
                                        if (i6 < 0) {
                                            break;
                                        }
                                        i6++;
                                    }
                                    if (i6 <= i7) {
                                        while (i7 < i6) {
                                            char cCharAt4 = string.charAt(i7);
                                            if (cCharAt4 == '\n' || cCharAt4 == '\r') {
                                                sb.append(cCharAt4);
                                            }
                                            i7++;
                                        }
                                        i7 = i6;
                                        while (i7 < length && (string.charAt(i7) == ' ' || string.charAt(i7) == '\t')) {
                                            i7++;
                                        }
                                    } else {
                                        sb.append('@');
                                        i7 = i8;
                                    }
                                }
                            }
                            i6 = -1;
                            if (i6 <= i7) {
                            }
                        }
                    } else {
                        int i10 = i8;
                        while (i10 < length2) {
                            char cCharAt5 = string.charAt(i10);
                            if (cCharAt5 != '_' && !Character.isLetterOrDigit(cCharAt5)) {
                                break;
                            }
                            i10++;
                        }
                        if (AbstractC9205.f23472.contains(string.substring(i8, i10)) && (i10 >= length2 || !Character.isJavaIdentifierPart(string.charAt(i10)))) {
                            iM14448 = i10;
                        }
                        if (iM14448 <= i7) {
                        }
                    }
                }
                i7 = iM14448;
            }
            z = true;
            string = sb.toString();
        }
        HashSet hashSet2 = AbstractC9203.f23464;
        if (string != null && string.indexOf(61) >= 0 && string.indexOf(40) >= 0) {
            HashSet hashSet3 = new HashSet();
            int length5 = string.length();
            int i11 = 0;
            while (i11 < length5) {
                int iM14444 = AbstractC9203.m14444(i11, string);
                if (iM14444 > i11) {
                    i11 = iM14444;
                } else if (string.charAt(i11) == '(' && (c2853M14445 = AbstractC9203.m14445(i11, string)) != null) {
                    String str2 = (String) c2853M14445.f6302;
                    ArrayList arrayList2 = ((C9204) c2853M14445.f6301).f23466;
                    hashSet3.add(AbstractC9203.m14438(arrayList2.size(), str2, arrayList2));
                    i11 = c2853M14445.f6303;
                } else {
                    i11++;
                }
            }
            StringBuilder sb2 = new StringBuilder(string.length() + 128);
            int length6 = string.length();
            int i12 = 0;
            int i13 = 0;
            while (i12 < length6) {
                int iM144442 = AbstractC9203.m14444(i12, string);
                if (iM144442 > i12) {
                    i12 = iM144442;
                } else if (string.charAt(i12) != c2) {
                    i12++;
                } else {
                    C2853 c2853M144452 = AbstractC9203.m14445(i12, string);
                    if (c2853M144452 == null) {
                        i4 = length6;
                        i3 = i12;
                        c1164 = null;
                        if (c1164 == null) {
                            sb2.append((CharSequence) string, i13, c1164.f1417);
                            sb2.append((String) c1164.f1416);
                            i13 = c1164.f1415;
                            i12 = i13;
                        } else {
                            i12 = i3 + 1;
                        }
                        length6 = i4;
                        c = ')';
                        c2 = '(';
                    } else {
                        C9204 c9204 = (C9204) c2853M144452.f6301;
                        if (c9204.f23470 && c9204.f23469 && c9204.f23468) {
                            int i14 = c2853M144452.f6304;
                            int iM14441 = AbstractC9203.m14441(string, i12, c2, c);
                            String strSubstring = string.substring(i14, i12);
                            int i15 = iM14441 + 1;
                            int iM14440 = AbstractC9203.m14440(i15, string);
                            if (iM14440 >= 0) {
                                String strSubstring2 = string.substring(i15, iM14440);
                                int iM144412 = AbstractC9203.m14441(string, iM14440, '{', '}') + 1;
                                String strSubstring3 = string.substring(iM14440, iM144412);
                                String str3 = (String) c2853M144452.f6302;
                                StringBuilder sb3 = new StringBuilder(strSubstring3.length() + strSubstring.length() + 128);
                                sb3.append(strSubstring);
                                sb3.append(c2);
                                ArrayList arrayList3 = c9204.f23466;
                                sb3.append(AbstractC9203.m14439(arrayList3.size(), arrayList3));
                                sb3.append(')');
                                sb3.append(strSubstring2);
                                sb3.append(strSubstring3);
                                String strTrim = strSubstring.trim();
                                if (strTrim.endsWith(str3)) {
                                    i3 = i12;
                                    String strTrim2 = strTrim.substring(0, strTrim.length() - str3.length()).trim();
                                    if (strTrim2.isEmpty()) {
                                        i4 = length6;
                                    } else {
                                        String[] strArrSplit = strTrim2.split("\\s+");
                                        i4 = length6;
                                        int i16 = 0;
                                        String str4 = null;
                                        while (i16 < strArrSplit.length) {
                                            String str5 = strArrSplit[i16];
                                            String[] strArr = strArrSplit;
                                            if (!str5.startsWith("@") && !AbstractC9203.f23463.contains(str5)) {
                                                str4 = str5;
                                            }
                                            i16++;
                                            strArrSplit = strArr;
                                        }
                                        if (str4 != null) {
                                            z2 = !"void".equals(str4);
                                        }
                                        size = arrayList3.size() - 1;
                                        while (size >= c9204.f23467) {
                                            String strM14438 = AbstractC9203.m14438(size, str3, arrayList3);
                                            if (hashSet3.contains(strM14438)) {
                                                arrayList = arrayList3;
                                                i5 = size;
                                                z3 = z2;
                                            } else {
                                                sb3.append('\n');
                                                sb3.append(strSubstring);
                                                sb3.append('(');
                                                sb3.append(AbstractC9203.m14439(size, arrayList3));
                                                sb3.append(')');
                                                sb3.append(strSubstring2);
                                                sb3.append('{');
                                                if (z2) {
                                                    sb3.append("return ");
                                                }
                                                sb3.append(str3);
                                                sb3.append('(');
                                                StringBuilder sb4 = new StringBuilder();
                                                arrayList = arrayList3;
                                                z3 = z2;
                                                for (int i17 = 0; i17 < size; i17++) {
                                                    if (sb4.length() > 0) {
                                                        sb4.append(", ");
                                                    }
                                                    sb4.append((String) c9204.f23465.get(i17));
                                                }
                                                int i18 = size;
                                                i5 = i18;
                                                while (i18 < arrayList.size()) {
                                                    if (sb4.length() > 0) {
                                                        sb4.append(", ");
                                                    }
                                                    sb4.append((String) c9204.f23471.get(i18));
                                                    i18++;
                                                }
                                                sb3.append(sb4.toString());
                                                sb3.append(");}");
                                                hashSet3.add(strM14438);
                                            }
                                            size = i5 - 1;
                                            z2 = z3;
                                            arrayList3 = arrayList;
                                        }
                                        String string2 = sb3.toString();
                                        c1164 = new C1164();
                                        c1164.f1417 = i14;
                                        c1164.f1415 = iM144412;
                                        c1164.f1416 = string2;
                                    }
                                } else {
                                    i4 = length6;
                                    i3 = i12;
                                }
                                z2 = false;
                                size = arrayList3.size() - 1;
                                while (size >= c9204.f23467) {
                                }
                                String string22 = sb3.toString();
                                c1164 = new C1164();
                                c1164.f1417 = i14;
                                c1164.f1415 = iM144412;
                                c1164.f1416 = string22;
                            }
                            if (c1164 == null) {
                            }
                            length6 = i4;
                            c = ')';
                            c2 = '(';
                        }
                    }
                }
            }
            sb2.append((CharSequence) string, i13, length6);
            string = sb2.toString();
        }
        if (string == null || string.indexOf(36) < 0 || string.indexOf(34) < 0) {
            return string;
        }
        int length7 = string.length();
        StringBuilder sb5 = new StringBuilder(length7 + 32);
        int i19 = 0;
        while (true) {
            if (i19 >= length7) {
                break;
            }
            char cCharAt6 = string.charAt(i19);
            if (cCharAt6 == '\"') {
                if (AbstractC9019.m14258(i19, string)) {
                    int i20 = i19 + 3;
                    int i21 = i20;
                    while (true) {
                        if (i21 + 2 >= string.length()) {
                            i21 = -1;
                            break;
                        }
                        if (AbstractC9019.m14258(i21, string)) {
                            break;
                        }
                        i21++;
                    }
                    if (i21 < 0) {
                        sb5.append((CharSequence) string, i19, length7);
                        break;
                    }
                    sb5.append(AbstractC9019.m14252(string.substring(i20, i21), z));
                    i19 = i21 + 3;
                    z = true;
                } else {
                    int i22 = i19 + 1;
                    int i23 = i22;
                    while (true) {
                        if (i23 >= string.length()) {
                            i23 = -1;
                            z = true;
                            break;
                        }
                        char cCharAt7 = string.charAt(i23);
                        if (cCharAt7 != '\\') {
                            z = true;
                            if (cCharAt7 == '\"') {
                                break;
                            }
                        } else {
                            i23++;
                        }
                        i23++;
                    }
                    if (i23 < 0) {
                        sb5.append((CharSequence) string, i19, length7);
                        break;
                    }
                    sb5.append(AbstractC9019.m14252(string.substring(i22, i23), false));
                    i19 = i23 + 1;
                }
            } else if (cCharAt6 == '\'') {
                int iM14262 = AbstractC9019.m14262(i19 + 1, string);
                if (iM14262 < 0) {
                    sb5.append((CharSequence) string, i19, length7);
                    break;
                }
                i = iM14262 + 1;
                sb5.append((CharSequence) string, i19, i);
                i19 = i;
            } else if (cCharAt6 != '/' || (i2 = i19 + 1) >= length7) {
                sb5.append(cCharAt6);
                i19++;
            } else {
                char cCharAt8 = string.charAt(i2);
                if (cCharAt8 == '/') {
                    i = i19 + 2;
                    while (i < length7) {
                        char cCharAt9 = string.charAt(i);
                        if (cCharAt9 == '\n' || cCharAt9 == '\r') {
                            break;
                        }
                        i++;
                    }
                    sb5.append((CharSequence) string, i19, i);
                } else if (cCharAt8 == '*') {
                    int i24 = i19 + 2;
                    while (true) {
                        int i25 = i24 + 1;
                        if (i25 >= string.length()) {
                            i24 = -1;
                            break;
                        }
                        if (string.charAt(i24) == '*' && string.charAt(i25) == '/') {
                            break;
                        }
                        i24 = i25;
                    }
                    if (i24 < 0) {
                        sb5.append((CharSequence) string, i19, length7);
                        break;
                    }
                    i = i24 + 2;
                    sb5.append((CharSequence) string, i19, i);
                } else {
                    sb5.append(cCharAt6);
                    i19++;
                }
                i19 = i;
            }
        }
        return sb5.toString();
    }

    private boolean readLine() throws ParseException {
        try {
            return this.parser.m5732();
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
            StringBuilder sbM12144 = AbstractC7012.m12144("Sourced file: ", str, " read error: ");
            sbM12144.append(e.getMessage());
            throw new EvalError(sbM12144.toString(), null, null, e);
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
            C3466.m5897(e);
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
        C3493 classManager = getClassManager();
        C8100 c8100 = classManager.f8309;
        if (classLoader != null) {
            c8100.f19714.add(classLoader);
        } else {
            c8100.getClass();
        }
        classManager.mo5693();
    }

    @Override // bsh.InterfaceC3490
    public void classLoaderChanged() {
        AbstractC3500.f8342.clear();
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
        InterfaceC3452 interfaceC3452RootNode = null;
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
                                interfaceC3452RootNode = interpreter.get_jjtree().rootNode();
                                interfaceC3452RootNode.setSourceFile(str);
                                if (TRACE) {
                                    println("// " + interfaceC3452RootNode.getText());
                                }
                                objEval = interfaceC3452RootNode.eval(callStack, interpreter);
                                if (callStack.depth() > 1) {
                                    throw new InterpreterError("Callstack growing: " + callStack);
                                }
                                if (objEval instanceof C3501) {
                                    objEval = ((C3501) objEval).f8350;
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
                                e.setNode(interfaceC3452RootNode);
                            }
                            throw e.reThrow("Sourced file: " + str);
                        } catch (TokenMgrException e2) {
                            throw new EvalError("Sourced file: " + str + " Token Parsing Error: " + e2.getMessage(), interfaceC3452RootNode, callStack, e2);
                        }
                    } catch (InterpreterError e3) {
                        throw new EvalError("Sourced file: " + str + " internal Error: " + e3.getMessage(), interfaceC3452RootNode, callStack, e3);
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
                        e5.setNode(interfaceC3452RootNode);
                    }
                    throw e5.reThrow("Sourced file: " + str);
                } catch (Exception e6) {
                    if (DEBUG.get().booleanValue()) {
                        e6.printStackTrace();
                    }
                    throw new EvalError("Sourced file: " + str + " unknown error: " + e6.getMessage(), interfaceC3452RootNode, callStack, e6);
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
            throw e.toEvalError(InterfaceC3452.f8196, new CallStack());
        }
    }

    public C3493 getClassManager() {
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
            C3466.m5898("set: ", e);
            return null;
        }
    }

    public void installModule(InterfaceC8357 interfaceC8357) {
        interfaceC8357.m13312();
    }

    public void installModules(InterfaceC8357... interfaceC8357Arr) {
        if (interfaceC8357Arr.length <= 0) {
            return;
        }
        InterfaceC8357 interfaceC8357 = interfaceC8357Arr[0];
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
            file = new File(AbstractC0900.m711(AbstractC0900.m700(str2), File.separator, str));
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
        getClassManager().mo5697();
        this.globalNameSpace.clear();
        Name.clearParts();
        AbstractC3500.f8342.clear();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.evalOnly) {
            C3466.m5899("bsh Interpreter: No stream");
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
                                    InterfaceC3452 interfaceC3452RootNode = get_jjtree().rootNode();
                                    interfaceC3452RootNode.setSourceFile(this.sourceFileInfo);
                                    if (DEBUG.get().booleanValue()) {
                                        interfaceC3452RootNode.dump(">");
                                    }
                                    if (TRACE) {
                                        println("// " + interfaceC3452RootNode.getText());
                                    }
                                    Object objEval = interfaceC3452RootNode.eval(callStack, this);
                                    if (callStack.depth() > 1) {
                                        throw new InterpreterError("Callstack growing: " + callStack);
                                    }
                                    if (objEval instanceof C3501) {
                                        objEval = ((C3501) objEval).f8350;
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
                                                sb2.append(AbstractC3462.m5889(objEval) + " :" + AbstractC3462.m5888(objEval));
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
                                this.parser.m5844(getIn());
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
                    this.parser.m5845(getIn());
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
            throw e.toEvalError(InterfaceC3452.f8196, callStack);
        }
    }

    public void setClassLoader(ClassLoader classLoader) {
        C3493 classManager = getClassManager();
        classManager.f8310 = classLoader;
        classManager.mo5693();
    }

    public void setCompatibility(boolean z) {
        this.compatibility = z;
    }

    public void setConsole(InterfaceC3460 interfaceC3460) {
        Interpreter interpreter;
        this.console = interfaceC3460;
        if (this.parser == null || get_jjtree().nodeArity() != 0 || ((interpreter = this.parent) != null && interpreter.interactive)) {
            this.parser = new C3447(getIn());
        } else {
            this.parser.m5729(getIn());
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
                C3466.m5897(e);
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
            C3466.m5898("set: ", e);
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
        C3467 c3467 = new C3467(url.openStream());
        try {
            BufferedReader bufferedReader = new BufferedReader(c3467);
            try {
                Object objEval = eval(bufferedReader, nameSpace, url.toString());
                bufferedReader.close();
                c3467.close();
                return objEval;
            } finally {
            }
        } catch (Throwable th) {
            try {
                c3467.close();
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
                throw new EvalError("Can't unset, not a variable: " + str, InterfaceC3452.f8196, new CallStack());
            }
        } catch (UtilEvalError e) {
            throw new EvalError(e.getMessage(), InterfaceC3452.f8196, new CallStack(), e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class Console implements InterfaceC3460, Serializable {
        public static transient PrintStream debug = System.err;
        private static final long serialVersionUID = 1;
        public static String systemLineSeparator = "\n";
        private InterfaceC3459 console;
        private transient PrintStream err;

        /* JADX INFO: renamed from: in */
        private transient Reader f17in;
        private transient PrintStream out;

        public Console(InterfaceC3459 interfaceC3459) {
            this.console = interfaceC3459;
            this.f17in = interfaceC3459.getIn();
            this.out = interfaceC3459.getOut();
            PrintStream err = interfaceC3459.getErr();
            this.err = err;
            debug = err;
        }

        @Override // bsh.InterfaceC3459
        public void error(Object obj) {
            InterfaceC3459 interfaceC3459 = this.console;
            if (interfaceC3459 != null) {
                interfaceC3459.error("// Error: " + obj + systemLineSeparator);
                return;
            }
            if (this.out != null) {
                println("// Error: " + obj);
            }
        }

        @Override // bsh.InterfaceC3459
        public PrintStream getErr() {
            if (this.err == null) {
                this.err = System.err;
            }
            return this.err;
        }

        @Override // bsh.InterfaceC3459
        public Reader getIn() {
            return this.f17in;
        }

        @Override // bsh.InterfaceC3459
        public PrintStream getOut() {
            if (this.out == null) {
                this.out = System.out;
            }
            return this.out;
        }

        @Override // bsh.InterfaceC3459
        public void print(Object obj) {
            InterfaceC3459 interfaceC3459 = this.console;
            if (interfaceC3459 != null) {
                interfaceC3459.print(obj);
                return;
            }
            PrintStream printStream = this.out;
            if (printStream != null) {
                printStream.print(obj);
                this.out.flush();
            }
        }

        @Override // bsh.InterfaceC3459
        public void println(Object obj) {
            InterfaceC3459 interfaceC3459 = this.console;
            if (interfaceC3459 != null) {
                interfaceC3459.println(obj);
                return;
            }
            print(obj + systemLineSeparator);
        }

        @Override // bsh.InterfaceC3459
        public void prompt(String str) {
            InterfaceC3459 interfaceC3459 = this.console;
            if (interfaceC3459 != null) {
                interfaceC3459.prompt(str);
            } else {
                print(str);
            }
        }

        @Override // bsh.InterfaceC3460
        public void setErr(PrintStream printStream) {
            this.err = printStream;
        }

        @Override // bsh.InterfaceC3460
        public void setIn(Reader reader) {
            this.f17in = reader;
        }

        @Override // bsh.InterfaceC3460
        public void setOut(PrintStream printStream) {
            this.out = printStream;
        }

        public Console(Reader reader, PrintStream printStream, PrintStream printStream2) {
            this.console = null;
            this.f17in = reader;
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

    public void setConsole(InterfaceC3459 interfaceC3459) {
        setConsole((InterfaceC3460) new Console(interfaceC3459));
    }

    public Object source(File file, NameSpace nameSpace) throws IOException {
        debug("Sourcing file: ", file);
        BufferedReader bufferedReader = new BufferedReader(new C3467(new FileInputStream(file)));
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

    public Interpreter(InterfaceC3459 interfaceC3459, NameSpace nameSpace, Interpreter interpreter) {
        this((InterfaceC3460) new Console(interfaceC3459), true, nameSpace, interpreter, interpreter == null ? null : interpreter.sourceFileInfo);
    }

    public Interpreter(InterfaceC3459 interfaceC3459, Interpreter interpreter) {
        this(interfaceC3459, interpreter.globalNameSpace, interpreter);
    }

    public Interpreter(InterfaceC3459 interfaceC3459, NameSpace nameSpace) {
        this(interfaceC3459, nameSpace, (Interpreter) null);
    }

    public Interpreter(InterfaceC3459 interfaceC3459) {
        this(interfaceC3459, (NameSpace) null, (Interpreter) null);
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
