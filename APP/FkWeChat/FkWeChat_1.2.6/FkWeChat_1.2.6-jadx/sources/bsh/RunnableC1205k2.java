package bsh;

import bsh.C1281x0;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.util.function.Supplier;
import okhttp3.internal.url._UrlKt;
import p337x4.AbstractC9440a;
import p337x4.AbstractC9442c;
import p353y4.C9564a;

/* JADX INFO: renamed from: bsh.k2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1205k2 implements Runnable, Serializable, C1281x0.a {

    /* JADX INFO: renamed from: E */
    public static boolean f3634E = false;

    /* JADX INFO: renamed from: F */
    public static boolean f3635F = false;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: A */
    public boolean f3638A;

    /* JADX INFO: renamed from: B */
    public boolean f3639B;

    /* JADX INFO: renamed from: C */
    public boolean f3640C;

    /* JADX INFO: renamed from: q */
    public boolean f3641q;

    /* JADX INFO: renamed from: r */
    public boolean f3642r;

    /* JADX INFO: renamed from: s */
    public transient C1218m3 f3643s;

    /* JADX INFO: renamed from: t */
    public C1182g3 f3644t;

    /* JADX INFO: renamed from: u */
    public InterfaceC1294z1 f3645u;

    /* JADX INFO: renamed from: v */
    public RunnableC1205k2 f3646v;

    /* JADX INFO: renamed from: w */
    public String f3647w;

    /* JADX INFO: renamed from: x */
    public int f3648x;

    /* JADX INFO: renamed from: y */
    public boolean f3649y;

    /* JADX INFO: renamed from: z */
    public boolean f3650z;

    /* JADX INFO: renamed from: D */
    public static final ThreadLocal f3633D = ThreadLocal.withInitial(new Supplier() { // from class: bsh.j2
        @Override // java.util.function.Supplier
        public final Object get() {
            return Boolean.FALSE;
        }
    });

    /* JADX INFO: renamed from: G */
    public static final This f3636G = This.getThis(new C1182g3(null, null, "bsh.system"), null);

    /* JADX INFO: renamed from: H */
    public static final C9564a f3637H = new C9564a();

    /* JADX INFO: renamed from: bsh.k2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements InterfaceC1294z1, Serializable {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: u */
        public static String f3651u = "\n";

        /* JADX INFO: renamed from: v */
        public static transient PrintStream f3652v = System.err;

        /* JADX INFO: renamed from: q */
        public transient Reader f3653q;

        /* JADX INFO: renamed from: r */
        public transient PrintStream f3654r;

        /* JADX INFO: renamed from: s */
        public transient PrintStream f3655s;

        /* JADX INFO: renamed from: t */
        public InterfaceC1129a2 f3656t = null;

        public a(Reader reader, PrintStream printStream, PrintStream printStream2) {
            this.f3653q = reader;
            this.f3654r = printStream;
            this.f3655s = printStream2;
            f3652v = printStream2;
        }

        @Override // bsh.InterfaceC1129a2
        /* JADX INFO: renamed from: a */
        public void mo4064a(String str) {
            InterfaceC1129a2 interfaceC1129a2 = this.f3656t;
            if (interfaceC1129a2 != null) {
                interfaceC1129a2.mo4064a(str);
            } else {
                mo4065b(str);
            }
        }

        @Override // bsh.InterfaceC1129a2
        /* JADX INFO: renamed from: b */
        public void mo4065b(Object obj) {
            InterfaceC1129a2 interfaceC1129a2 = this.f3656t;
            if (interfaceC1129a2 != null) {
                interfaceC1129a2.mo4065b(obj);
                return;
            }
            PrintStream printStream = this.f3654r;
            if (printStream != null) {
                printStream.print(obj);
                this.f3654r.flush();
            }
        }

        @Override // bsh.InterfaceC1294z1
        /* JADX INFO: renamed from: c */
        public void mo4504c(PrintStream printStream) {
            this.f3654r = printStream;
        }

        @Override // bsh.InterfaceC1129a2
        /* JADX INFO: renamed from: d */
        public PrintStream mo4066d() {
            if (this.f3654r == null) {
                this.f3654r = System.out;
            }
            return this.f3654r;
        }

        @Override // bsh.InterfaceC1129a2
        /* JADX INFO: renamed from: e */
        public Reader mo4067e() {
            return this.f3653q;
        }

        @Override // bsh.InterfaceC1294z1
        /* JADX INFO: renamed from: f */
        public void mo4505f(PrintStream printStream) {
            this.f3655s = printStream;
        }

        @Override // bsh.InterfaceC1129a2
        /* JADX INFO: renamed from: g */
        public PrintStream mo4068g() {
            if (this.f3655s == null) {
                this.f3655s = System.err;
            }
            return this.f3655s;
        }

        @Override // bsh.InterfaceC1129a2
        /* JADX INFO: renamed from: h */
        public void mo4069h(Object obj) {
            InterfaceC1129a2 interfaceC1129a2 = this.f3656t;
            if (interfaceC1129a2 != null) {
                interfaceC1129a2.mo4069h("// Error: " + obj + f3651u);
                return;
            }
            if (this.f3654r != null) {
                mo4070i("// Error: " + obj);
            }
        }

        @Override // bsh.InterfaceC1129a2
        /* JADX INFO: renamed from: i */
        public void mo4070i(Object obj) {
            InterfaceC1129a2 interfaceC1129a2 = this.f3656t;
            if (interfaceC1129a2 != null) {
                interfaceC1129a2.mo4070i(obj);
                return;
            }
            mo4065b(obj + f3651u);
        }
    }

    public RunnableC1205k2(InterfaceC1294z1 interfaceC1294z1, boolean z10, C1182g3 c1182g3, RunnableC1205k2 runnableC1205k2, String str) {
        this.f3642r = false;
        this.f3648x = -1;
        this.f3649y = true;
        this.f3639B = true;
        this.f3640C = f3635F;
        ThreadLocal threadLocal = f3633D;
        long jNanoTime = ((Boolean) threadLocal.get()).booleanValue() ? System.nanoTime() : 0L;
        this.f3638A = z10;
        this.f3646v = runnableC1205k2;
        if (runnableC1205k2 != null) {
            m4476L(runnableC1205k2.f3642r);
            this.f3643s = runnableC1205k2.f3643s;
            this.f3650z = runnableC1205k2.f3650z;
        }
        this.f3647w = str;
        c1182g3 = c1182g3 == null ? new C1182g3(c1182g3, C1281x0.createClassManager(this), "global") : c1182g3;
        m4472H(interfaceC1294z1);
        m4474J(c1182g3);
        m4492m().addListener(this);
        if (((Boolean) threadLocal.get()).booleanValue()) {
            m4462e("Time to initialize interpreter: interactive=", Boolean.valueOf(z10), " ", Long.valueOf(System.nanoTime() - jNanoTime), " nanoseconds.");
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m4462e(Object... objArr) {
        if (((Boolean) f3633D.get()).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : objArr) {
                sb2.append(obj);
            }
            a.f3652v.println("// Debug: ".concat(sb2.toString()));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        m4475K(System.out);
        m4473I(System.err);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m4463t() {
        return (m4464u() == null || m4464u().isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: u */
    public static String m4464u() {
        return System.getProperty("bsh.debugClasses");
    }

    /* JADX INFO: renamed from: A */
    public File m4465A(String str) {
        String str2 = (String) m4501x("bsh.cwd");
        File file = new File(str);
        if (!file.isAbsolute()) {
            file = new File(str2 + File.separator + str);
        }
        return new File(file.getCanonicalPath());
    }

    /* JADX INFO: renamed from: B */
    public final String m4466B(String str) {
        return AbstractC9442c.m36785m(AbstractC9440a.m36760m(str));
    }

    /* JADX INFO: renamed from: C */
    public final void m4467C(Object obj) {
        this.f3645u.mo4070i(obj);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m4468D() throws C1206k3 {
        try {
            return this.f3643s.m4618N();
        } catch (C1206k3 e10) {
            m4483c();
            if (this.f3641q) {
                return true;
            }
            throw e10;
        }
    }

    /* JADX INFO: renamed from: E */
    public final String m4469E(Reader reader, String str) throws C1163d2 {
        try {
            StringBuilder sb2 = new StringBuilder(1024);
            char[] cArr = new char[4096];
            while (true) {
                int i10 = reader.read(cArr);
                if (i10 == -1) {
                    return sb2.toString();
                }
                sb2.append(cArr, 0, i10);
            }
        } catch (IOException e10) {
            throw new C1163d2("Sourced file: " + str + " read error: " + e10.getMessage(), null, null, e10);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m4470F() {
        m4492m().reset();
        this.f3644t.m4378k();
        C1130a3.m4071a();
        AbstractC1143c4.f3488f.clear();
    }

    /* JADX INFO: renamed from: G */
    public void m4471G(String str, Object obj) throws C1163d2 {
        C1174f1 c1174f1 = new C1174f1(this.f3644t);
        try {
            boolean zM4074h = C1130a3.m4074h(str);
            C1182g3 c1182g3 = this.f3644t;
            if (zM4074h) {
                c1182g3.m4345G(str).m4086p(c1174f1, this).m5099b(obj, false);
            } else {
                c1182g3.m4399u0(str, obj, false);
            }
        } catch (C1279w4 e10) {
            throw e10.mo5167a(InterfaceC1188h3.f3612c, c1174f1);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m4472H(InterfaceC1294z1 interfaceC1294z1) {
        RunnableC1205k2 runnableC1205k2;
        this.f3645u = interfaceC1294z1;
        if (this.f3643s == null || m4500w().m5074d() != 0 || ((runnableC1205k2 = this.f3646v) != null && runnableC1205k2.f3638A)) {
            this.f3643s = new C1218m3(m4495p());
        } else {
            this.f3643s.m4748e0(m4495p());
        }
    }

    /* JADX INFO: renamed from: I */
    public void m4473I(PrintStream printStream) {
        this.f3645u.mo4505f(printStream);
    }

    /* JADX INFO: renamed from: J */
    public void m4474J(C1182g3 c1182g3) {
        this.f3644t = c1182g3;
        if (c1182g3 != null) {
            try {
                if (c1182g3.m4352N("bsh") instanceof This) {
                    return;
                }
                m4502y();
                if (this.f3638A) {
                    m4503z();
                }
            } catch (C1279w4 e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public void m4475K(PrintStream printStream) {
        this.f3645u.mo4504c(printStream);
    }

    /* JADX INFO: renamed from: L */
    public void m4476L(boolean z10) {
        this.f3642r = z10;
    }

    /* JADX INFO: renamed from: M */
    public void m4477M(String str, Object obj) {
        try {
            m4471G(str, obj);
        } catch (C1163d2 e10) {
            C1237p4.m5045a("set: ", e10);
        }
    }

    /* JADX INFO: renamed from: N */
    public Object m4478N(File file) {
        return m4479O(file, this.f3644t);
    }

    /* JADX INFO: renamed from: O */
    public Object m4479O(File file, C1182g3 c1182g3) throws IOException {
        m4462e("Sourcing file: ", file);
        BufferedReader bufferedReader = new BufferedReader(new C1187h2(file));
        try {
            return m4487h(bufferedReader, c1182g3, file.getPath());
        } finally {
            bufferedReader.close();
        }
    }

    /* JADX INFO: renamed from: P */
    public Object m4480P(String str) {
        return m4481Q(str, this.f3644t);
    }

    /* JADX INFO: renamed from: Q */
    public Object m4481Q(String str, C1182g3 c1182g3) {
        return m4479O(m4465A(str), c1182g3);
    }

    /* JADX INFO: renamed from: R */
    public String m4482R(String str) {
        return str.endsWith(";") ? str : str.concat(";");
    }

    @Override // bsh.C1281x0.a
    /* JADX INFO: renamed from: b */
    public void mo4283b() {
        AbstractC1143c4.f3488f.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m4483c() {
        int i10 = this.f3648x;
        if (i10 < 0) {
            return;
        }
        try {
            Thread.sleep(i10);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public void m4484d(ClassLoader classLoader) {
        m4492m().addClassLoader(classLoader);
    }

    /* JADX INFO: renamed from: f */
    public final void m4485f(Object obj) {
        this.f3645u.mo4069h(obj);
    }

    /* JADX INFO: renamed from: g */
    public Object m4486g(Reader reader) {
        C1182g3 c1182g3 = this.f3644t;
        String str = this.f3647w;
        if (str == null) {
            str = "eval stream";
        }
        return m4487h(reader, c1182g3, str);
    }

    /* JADX INFO: renamed from: h */
    public Object m4487h(Reader reader, C1182g3 c1182g3, String str) {
        String strM4466B = m4466B(m4469E(reader, str));
        m4462e("eval: nameSpace = ", c1182g3);
        RunnableC1205k2 runnableC1205k2 = new RunnableC1205k2(new StringReader(m4482R(strM4466B)), m4497r(), m4494o(), false, c1182g3, this, str);
        C1174f1 c1174f1 = new C1174f1(c1182g3);
        Object objMo4048p = null;
        boolean zM4468D = false;
        InterfaceC1188h3 interfaceC1188h3M5080j = null;
        while (true) {
            if (zM4468D) {
                break;
            }
            try {
                try {
                    try {
                        try {
                            zM4468D = runnableC1205k2.m4468D();
                            if (runnableC1205k2.m4500w().m5074d() > 0) {
                                interfaceC1188h3M5080j = runnableC1205k2.m4500w().m5080j();
                                interfaceC1188h3M5080j.mo4047n(str);
                                if (f3634E) {
                                    m4467C("// " + interfaceC1188h3M5080j.getText());
                                }
                                objMo4048p = interfaceC1188h3M5080j.mo4048p(c1174f1, runnableC1205k2);
                                if (c1174f1.m4314c() > 1) {
                                    throw new C1211l2("Callstack growing: " + c1174f1);
                                }
                                if (objMo4048p instanceof C1171e4) {
                                    objMo4048p = ((C1171e4) objMo4048p).f3543s;
                                    runnableC1205k2.m4500w().m5079i();
                                    if (c1174f1.m4314c() > 1) {
                                        c1174f1.m4312a();
                                        c1174f1.m4317f(c1182g3);
                                    }
                                }
                            }
                            runnableC1205k2.m4500w().m5079i();
                            if (c1174f1.m4314c() > 1) {
                                c1174f1.m4312a();
                                c1174f1.m4317f(c1182g3);
                            }
                        } catch (C1231o4 e10) {
                            if (e10.m4271a() == null) {
                                e10.m4276f(interfaceC1188h3M5080j);
                            }
                            throw e10.mo4275e("Sourced file: " + str);
                        } catch (C1267u4 e11) {
                            throw new C1163d2("Sourced file: " + str + " Token Parsing Error: " + e11.getMessage(), interfaceC1188h3M5080j, c1174f1, e11);
                        }
                    } catch (C1163d2 e12) {
                        if (((Boolean) f3633D.get()).booleanValue()) {
                            e12.printStackTrace();
                        }
                        if (e12.m4271a() == null) {
                            e12.m4276f(interfaceC1188h3M5080j);
                        }
                        throw e12.mo4275e("Sourced file: " + str);
                    } catch (C1211l2 e13) {
                        throw new C1163d2("Sourced file: " + str + " internal Error: " + e13.getMessage(), interfaceC1188h3M5080j, c1174f1, e13);
                    }
                } catch (C1206k3 e14) {
                    ThreadLocal threadLocal = f3633D;
                    if (((Boolean) threadLocal.get()).booleanValue()) {
                        m4485f(e14.m4508h(((Boolean) threadLocal.get()).booleanValue()));
                    }
                    e14.m4509j(str);
                    throw e14;
                } catch (Exception e15) {
                    if (((Boolean) f3633D.get()).booleanValue()) {
                        e15.printStackTrace();
                    }
                    throw new C1163d2("Sourced file: " + str + " unknown error: " + e15.getMessage(), interfaceC1188h3M5080j, c1174f1, e15);
                }
            } finally {
            }
        }
        return Primitive.unwrap(objMo4048p);
    }

    /* JADX INFO: renamed from: i */
    public Object m4488i(String str) {
        m4462e("eval(String): ", str);
        return m4489j(str, this.f3644t, "Memory");
    }

    /* JADX INFO: renamed from: j */
    public Object m4489j(String str, C1182g3 c1182g3, String str2) {
        return m4487h(new StringReader(m4482R(str)), c1182g3, str2);
    }

    /* JADX INFO: renamed from: k */
    public Object m4490k(String str) throws C1163d2 {
        try {
            return Primitive.unwrap(this.f3644t.m4394s(str, this));
        } catch (C1279w4 e10) {
            throw e10.mo5167a(InterfaceC1188h3.f3612c, new C1174f1());
        }
    }

    /* JADX INFO: renamed from: l */
    public final String m4491l() {
        ThreadLocal threadLocal = f3633D;
        Boolean bool = (Boolean) threadLocal.get();
        boolean zBooleanValue = bool.booleanValue();
        if (zBooleanValue) {
            threadLocal.set(Boolean.FALSE);
        }
        try {
            String str = (String) m4488i("getBshPrompt()");
            if (zBooleanValue) {
                threadLocal.set(bool);
            }
            return str;
        } catch (Exception unused) {
            if (zBooleanValue) {
                f3633D.set(bool);
            }
            return "bsh % ";
        } catch (Throwable th) {
            if (zBooleanValue) {
                f3633D.set(bool);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public C1281x0 m4492m() {
        return m4496q().m4402w();
    }

    /* JADX INFO: renamed from: n */
    public boolean m4493n() {
        return this.f3640C;
    }

    /* JADX INFO: renamed from: o */
    public PrintStream m4494o() {
        return this.f3645u.mo4068g();
    }

    /* JADX INFO: renamed from: p */
    public Reader m4495p() {
        return this.f3645u.mo4067e();
    }

    /* JADX INFO: renamed from: q */
    public C1182g3 m4496q() {
        return this.f3644t;
    }

    /* JADX INFO: renamed from: r */
    public PrintStream m4497r() {
        return this.f3645u.mo4066d();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f3650z) {
            C1193i2.m4438a("bsh Interpreter: No stream");
            return;
        }
        if (this.f3638A && m4498s() == null) {
            try {
                m4488i("printBanner();");
            } catch (C1163d2 unused) {
                m4467C("BeanShell 3.0.0.beta10");
            }
        }
        C1174f1 c1174f1 = new C1174f1(this.f3644t);
        this.f3641q = false;
        int i10 = -1;
        while (!Thread.interrupted() && !this.f3641q) {
            try {
                try {
                    try {
                        try {
                            try {
                                if (this.f3638A) {
                                    this.f3645u.mo4064a(m4491l());
                                }
                                this.f3641q = m4468D();
                                if (m4500w().m5074d() > 0) {
                                    InterfaceC1188h3 interfaceC1188h3M5080j = m4500w().m5080j();
                                    interfaceC1188h3M5080j.mo4047n(this.f3647w);
                                    if (((Boolean) f3633D.get()).booleanValue()) {
                                        interfaceC1188h3M5080j.mo4053u(">");
                                    }
                                    if (f3634E) {
                                        m4467C("// " + interfaceC1188h3M5080j.getText());
                                    }
                                    Object objMo4048p = interfaceC1188h3M5080j.mo4048p(c1174f1, this);
                                    if (c1174f1.m4314c() > 1) {
                                        throw new C1211l2("Callstack growing: " + c1174f1);
                                    }
                                    if (objMo4048p instanceof C1171e4) {
                                        objMo4048p = ((C1171e4) objMo4048p).f3543s;
                                    }
                                    if (this.f3638A) {
                                        if (objMo4048p != Primitive.VOID) {
                                            m4477M("$_", objMo4048p);
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("$");
                                            i10++;
                                            sb2.append(i10 % 10);
                                            m4477M(sb2.toString(), objMo4048p);
                                            if (this.f3639B) {
                                                m4467C("--> $" + (i10 % 10) + " = " + AbstractC1225n4.m4983v(objMo4048p));
                                            }
                                        } else if (this.f3639B) {
                                            m4467C("--> void");
                                        }
                                    }
                                }
                                m4500w().m5079i();
                            } catch (Throwable th) {
                                m4500w().m5079i();
                                if (c1174f1.m4314c() > 1) {
                                    c1174f1.m4312a();
                                    c1174f1.m4317f(this.f3644t);
                                }
                                throw th;
                            }
                        } catch (C1231o4 e10) {
                            m4485f("Target Exception: " + e10.getMessage());
                            if (e10.m4996h()) {
                                e10.m4997i(((Boolean) f3633D.get()).booleanValue(), m4494o());
                            }
                            if (!this.f3638A) {
                                this.f3641q = true;
                            }
                            m4477M("$_e", e10.m4995g());
                            m4500w().m5079i();
                            if (c1174f1.m4314c() > 1) {
                            }
                        }
                    } catch (C1267u4 e11) {
                        m4485f("Error parsing input: " + e11);
                        this.f3643s.m4665S6(m4495p());
                        if (!this.f3638A) {
                            this.f3641q = true;
                        }
                        m4500w().m5079i();
                        if (c1174f1.m4314c() > 1) {
                        }
                    }
                } catch (C1211l2 e12) {
                    m4485f("Internal Error: " + e12.getMessage());
                    if (!this.f3638A) {
                        this.f3641q = true;
                    }
                    m4500w().m5079i();
                    if (c1174f1.m4314c() > 1) {
                    }
                } catch (Exception e13) {
                    m4485f("Unknown error: " + e13);
                    if (((Boolean) f3633D.get()).booleanValue()) {
                        e13.printStackTrace();
                    }
                    if (!this.f3638A) {
                        this.f3641q = true;
                    }
                    m4500w().m5079i();
                    if (c1174f1.m4314c() > 1) {
                    }
                }
            } catch (C1206k3 e14) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Parser Error: ");
                ThreadLocal threadLocal = f3633D;
                sb3.append(e14.m4508h(((Boolean) threadLocal.get()).booleanValue()));
                m4485f(sb3.toString());
                if (((Boolean) threadLocal.get()).booleanValue()) {
                    e14.printStackTrace();
                }
                if (!this.f3638A) {
                    this.f3641q = true;
                }
                this.f3643s.m4657R6(m4495p());
                m4500w().m5079i();
                if (c1174f1.m4314c() > 1) {
                }
            } catch (C1163d2 e15) {
                if (this.f3638A) {
                    m4485f("Evaluation Error: " + e15.getMessage());
                } else {
                    m4485f("Evaluation Error: " + e15.m4272b());
                }
                if (((Boolean) f3633D.get()).booleanValue()) {
                    e15.printStackTrace();
                }
                if (!this.f3638A) {
                    this.f3641q = true;
                }
                m4500w().m5079i();
                if (c1174f1.m4314c() > 1) {
                }
            }
            if (c1174f1.m4314c() > 1) {
                c1174f1.m4312a();
                c1174f1.m4317f(this.f3644t);
            }
        }
        if (this.f3638A && this.f3649y) {
            System.exit(0);
        }
    }

    /* JADX INFO: renamed from: s */
    public RunnableC1205k2 m4498s() {
        return this.f3646v;
    }

    /* JADX INFO: renamed from: v */
    public boolean m4499v() {
        return this.f3642r;
    }

    /* JADX INFO: renamed from: w */
    public final C1247r2 m4500w() {
        return this.f3643s.f3687q;
    }

    /* JADX INFO: renamed from: x */
    public Object m4501x(String str) {
        try {
            return m4490k(str);
        } catch (C1163d2 e10) {
            C1237p4.m5045a("set: ", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m4502y() {
        C1281x0 c1281x0M4492m = m4492m();
        m4477M("bsh", new C1182g3(null, c1281x0M4492m, "Bsh Object").mo4351M(this));
        This r12 = f3636G;
        m4477M("bsh.system", r12);
        m4477M("bsh.shared", r12);
        m4477M("bsh.help", new C1182g3(null, c1281x0M4492m, "Bsh Command Help Text").mo4351M(this));
        m4477M("bsh.cwd", System.getProperty("user.dir"));
        m4477M("bsh.interactive", this.f3638A ? Primitive.TRUE : Primitive.FALSE);
        m4477M("bsh.evalOnly", Primitive.FALSE);
        m4477M("bsh.version", "3.0.0.beta10");
    }

    /* JADX INFO: renamed from: z */
    public void m4503z() {
        try {
            m4481Q(System.getProperty("user.home") + File.separator + ".bshrc", this.f3644t);
        } catch (Exception e10) {
            m4462e("Could not find rc file: ", e10);
        }
    }

    public RunnableC1205k2(Reader reader, PrintStream printStream, PrintStream printStream2, boolean z10, C1182g3 c1182g3, RunnableC1205k2 runnableC1205k2, String str) {
        this(new a(reader, printStream, printStream2), z10, c1182g3, runnableC1205k2, str);
    }

    public RunnableC1205k2() {
        this(null, null, _UrlKt.FRAGMENT_ENCODE_SET);
        this.f3647w = null;
    }

    public RunnableC1205k2(C1182g3 c1182g3, RunnableC1205k2 runnableC1205k2, String str) {
        this(null, System.out, System.err, false, c1182g3, runnableC1205k2, str);
        this.f3650z = true;
        m4477M("bsh.evalOnly", Primitive.TRUE);
    }
}
