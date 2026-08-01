package bsh;

import bsh.C1281x0;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntFunction;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: bsh.g3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1182g3 implements Serializable, C1281x0.a, Cloneable {

    /* JADX INFO: renamed from: M */
    public static final C1182g3 f3563M;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: A */
    public String f3564A;

    /* JADX INFO: renamed from: B */
    public transient C1281x0 f3565B;

    /* JADX INFO: renamed from: C */
    public This f3566C;

    /* JADX INFO: renamed from: D */
    public Map f3567D;

    /* JADX INFO: renamed from: E */
    public InterfaceC1188h3 f3568E;

    /* JADX INFO: renamed from: F */
    public boolean f3569F;

    /* JADX INFO: renamed from: G */
    public boolean f3570G;

    /* JADX INFO: renamed from: H */
    public boolean f3571H;

    /* JADX INFO: renamed from: I */
    public boolean f3572I;

    /* JADX INFO: renamed from: J */
    public Class f3573J;

    /* JADX INFO: renamed from: K */
    public Object f3574K;

    /* JADX INFO: renamed from: L */
    public transient Map f3575L;

    /* JADX INFO: renamed from: q */
    public String f3576q;

    /* JADX INFO: renamed from: r */
    public C1182g3 f3577r;

    /* JADX INFO: renamed from: s */
    public Map f3578s;

    /* JADX INFO: renamed from: t */
    public Map f3579t;

    /* JADX INFO: renamed from: u */
    public Map f3580u;

    /* JADX INFO: renamed from: v */
    public List f3581v;

    /* JADX INFO: renamed from: w */
    public List f3582w;

    /* JADX INFO: renamed from: x */
    public List f3583x;

    /* JADX INFO: renamed from: y */
    public List f3584y;

    /* JADX INFO: renamed from: z */
    public List f3585z;

    static {
        C1182g3 c1182g3 = new C1182g3(null, null, "Called from compiled Java code.");
        f3563M = c1182g3;
        c1182g3.f3569F = true;
    }

    public C1182g3(C1182g3 c1182g3, C1281x0 c1281x0, String str) {
        this.f3578s = new HashMap();
        this.f3579t = new HashMap();
        this.f3580u = new HashMap();
        this.f3581v = new ArrayList();
        this.f3582w = new ArrayList();
        this.f3583x = new ArrayList();
        this.f3584y = new ArrayList();
        this.f3585z = new ArrayList();
        this.f3567D = new HashMap();
        this.f3575L = new HashMap();
        m4385n0(str);
        m4391q0(c1182g3);
        m4375i0(c1281x0);
        m4402w().addListener(this);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1291y4[] m4334a(int i10) {
        return new C1291y4[i10];
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C1168e1[] m4335c(int i10) {
        return new C1168e1[i10];
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String[] m4336d(int i10) {
        return new String[i10];
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String[] m4337f(int i10) {
        return new String[i10];
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f3575L = new HashMap();
    }

    private synchronized void writeObject(ObjectOutputStream objectOutputStream) {
        this.f3567D.clear();
        objectOutputStream.defaultWriteObject();
    }

    /* JADX INFO: renamed from: A */
    public C1168e1 m4339A(String str, Class[] clsArr) {
        for (Object obj : this.f3583x) {
            AbstractC1241q2 abstractC1241q2M4202w0 = AbstractC1143c4.m4202w0(obj.getClass(), str, clsArr, false);
            if (abstractC1241q2M4202w0 != null) {
                return new C1168e1(abstractC1241q2M4202w0, obj);
            }
        }
        Iterator it = this.f3584y.iterator();
        while (it.hasNext()) {
            AbstractC1241q2 abstractC1241q2M4202w02 = AbstractC1143c4.m4202w0((Class) it.next(), str, clsArr, true);
            if (abstractC1241q2M4202w02 != null) {
                return new C1168e1(abstractC1241q2M4202w02, (Object) null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public C1291y4 m4340B(String str) {
        This thisM4195t;
        C1291y4 c1291y4M4386o = null;
        for (Object obj : this.f3583x) {
            AbstractC1241q2 abstractC1241q2M4200v0 = AbstractC1143c4.m4200v0(obj.getClass(), str, false);
            if (abstractC1241q2M4200v0 != null) {
                c1291y4M4386o = m4386o(str, abstractC1241q2M4200v0.mo4107n(), new C1265u2(obj, abstractC1241q2M4200v0));
            } else if (this.f3570G) {
                Class<?> superclass = obj.getClass();
                while (true) {
                    superclass = superclass.getSuperclass();
                    if (!AbstractC1143c4.m4174i0(superclass) || ((thisM4195t = AbstractC1143c4.m4195t(obj, superclass.getSimpleName())) != null && (c1291y4M4386o = (C1291y4) thisM4195t.getNameSpace().f3578s.get(str)) != null)) {
                        break;
                    }
                }
            }
            if (c1291y4M4386o != null) {
                this.f3578s.put(str, c1291y4M4386o);
                return c1291y4M4386o;
            }
        }
        Iterator it = this.f3584y.iterator();
        while (it.hasNext()) {
            AbstractC1241q2 abstractC1241q2M4200v02 = AbstractC1143c4.m4200v0((Class) it.next(), str, true);
            if (abstractC1241q2M4200v02 != null) {
                C1291y4 c1291y4M4386o2 = m4386o(str, abstractC1241q2M4200v02.mo4107n(), new C1265u2(abstractC1241q2M4200v02));
                this.f3578s.put(str, c1291y4M4386o2);
                return c1291y4M4386o2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public C1168e1 m4341C(String str, Class[] clsArr) {
        return m4342D(str, clsArr, false);
    }

    /* JADX INFO: renamed from: D */
    public C1168e1 m4342D(String str, Class[] clsArr, boolean z10) {
        C1182g3 c1182g3;
        RunnableC1205k2.m4462e("Get method: ", str, " ", this);
        C1168e1 c1168e1M4339A = (!this.f3570G || this.f3572I || z10) ? null : m4339A(str, clsArr);
        if (c1168e1M4339A == null && this.f3579t.containsKey(str)) {
            c1168e1M4339A = AbstractC1143c4.m4185o(clsArr, (List) this.f3579t.get(str));
        }
        if (c1168e1M4339A == null && !this.f3570G && !z10) {
            c1168e1M4339A = m4339A(str, clsArr);
        }
        return (c1168e1M4339A != null || z10 || (c1182g3 = this.f3577r) == null) ? c1168e1M4339A : c1182g3.m4341C(str, clsArr);
    }

    /* JADX INFO: renamed from: E */
    public String[] m4343E() {
        return (String[]) this.f3579t.keySet().stream().toArray(new IntFunction() { // from class: bsh.f3
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return C1182g3.m4336d(i10);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public C1168e1[] m4344F() {
        return (C1168e1[]) this.f3579t.values().stream().flatMap(new Function() { // from class: bsh.d3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((List) obj).stream();
            }
        }).toArray(new IntFunction() { // from class: bsh.e3
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return C1182g3.m4335c(i10);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public C1130a3 m4345G(String str) {
        if (!this.f3567D.containsKey(str)) {
            this.f3567D.put(str, new C1130a3(this, str));
        }
        return (C1130a3) this.f3567D.get(str);
    }

    /* JADX INFO: renamed from: H */
    public InterfaceC1188h3 m4346H() {
        InterfaceC1188h3 interfaceC1188h3 = this.f3568E;
        if (interfaceC1188h3 != null) {
            return interfaceC1188h3;
        }
        C1182g3 c1182g3 = this.f3577r;
        if (c1182g3 != null) {
            return c1182g3.m4346H();
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public String m4347I() {
        String str = this.f3564A;
        if (str != null) {
            return str;
        }
        C1182g3 c1182g3 = this.f3577r;
        if (c1182g3 != null) {
            return c1182g3.m4347I();
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public C1182g3 m4348J() {
        return this.f3577r;
    }

    /* JADX INFO: renamed from: K */
    public Object m4349K(String str, RunnableC1205k2 runnableC1205k2) throws C1279w4 {
        String strM4175j = AbstractC1143c4.m4175j("get", str);
        Class[] clsArr = AbstractC1143c4.f3484b;
        C1168e1 c1168e1M4341C = m4341C(strM4175j, clsArr);
        try {
            if (c1168e1M4341C != null) {
                return c1168e1M4341C.m4290n(null, runnableC1205k2);
            }
            C1168e1 c1168e1M4341C2 = m4341C(AbstractC1143c4.m4175j("is", str), clsArr);
            return (c1168e1M4341C2 == null || c1168e1M4341C2.mo4124l() != Boolean.TYPE) ? Primitive.VOID : c1168e1M4341C2.m4290n(null, runnableC1205k2);
        } catch (C1163d2 e10) {
            throw new C1279w4("'This' property accessor threw exception: " + e10.getMessage(), e10);
        }
    }

    /* JADX INFO: renamed from: L */
    public This mo4350L(RunnableC1205k2 runnableC1205k2) {
        Class cls;
        if (this.f3570G && (cls = this.f3573J) != null) {
            Class superclass = cls.getSuperclass();
            if (AbstractC1143c4.m4174i0(superclass)) {
                return AbstractC1143c4.m4195t(this.f3574K, superclass.getSimpleName());
            }
        }
        C1182g3 c1182g3 = this.f3577r;
        return c1182g3 != null ? c1182g3.f3570G ? c1182g3.mo4350L(runnableC1205k2) : c1182g3.mo4351M(runnableC1205k2) : mo4351M(runnableC1205k2);
    }

    /* JADX INFO: renamed from: M */
    public This mo4351M(RunnableC1205k2 runnableC1205k2) {
        if (this.f3566C == null) {
            this.f3566C = This.getThis(this, runnableC1205k2);
        }
        return this.f3566C;
    }

    /* JADX INFO: renamed from: N */
    public Object m4352N(String str) {
        return m4353O(str, true);
    }

    /* JADX INFO: renamed from: O */
    public Object m4353O(String str, boolean z10) {
        C1291y4 c1291y4M4354P = m4354P(str, z10);
        RunnableC1205k2.m4462e("Get variable: ", str, " = ", c1291y4M4354P);
        return m4407y0(c1291y4M4354P);
    }

    /* JADX INFO: renamed from: P */
    public C1291y4 m4354P(String str, boolean z10) {
        C1182g3 c1182g3;
        if (this.f3578s.containsKey(str)) {
            return (C1291y4) this.f3578s.get(str);
        }
        C1291y4 c1291y4M4340B = m4340B(str);
        return (z10 && c1291y4M4340B == null && (c1182g3 = this.f3577r) != null) ? c1182g3.m4354P(str, z10) : c1291y4M4340B;
    }

    /* JADX INFO: renamed from: Q */
    public String[] m4355Q() {
        return (String[]) this.f3578s.keySet().stream().toArray(new IntFunction() { // from class: bsh.c3
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return C1182g3.m4337f(i10);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public Object m4356R(String str, RunnableC1205k2 runnableC1205k2) {
        Object objM4353O = m4353O(str, true);
        return objM4353O == Primitive.VOID ? m4349K(str, runnableC1205k2) : objM4353O;
    }

    /* JADX INFO: renamed from: S */
    public C1291y4[] m4357S() {
        return (C1291y4[]) this.f3578s.values().stream().toArray(new IntFunction() { // from class: bsh.b3
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return C1182g3.m4334a(i10);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void mo4358T(String str) {
        this.f3580u.put(C1130a3.m4078n(str, 1), str);
        m4371g0();
    }

    /* JADX INFO: renamed from: U */
    public void m4359U(String str) {
        String strReplace = str.replace('.', '/');
        if (!strReplace.startsWith("/")) {
            strReplace = "/".concat(strReplace);
        }
        if (strReplace.length() > 1 && strReplace.endsWith("/")) {
            strReplace = strReplace.substring(0, strReplace.length() - 1);
        }
        this.f3582w.remove(strReplace);
        this.f3582w.add(0, strReplace);
        m4371g0();
    }

    /* JADX INFO: renamed from: V */
    public void m4360V(Object obj) {
        this.f3583x.remove(obj);
        this.f3583x.add(0, obj);
        m4371g0();
    }

    /* JADX INFO: renamed from: W */
    public void mo4361W(String str) {
        this.f3581v.remove(str);
        this.f3581v.add(0, str);
        m4371g0();
    }

    /* JADX INFO: renamed from: X */
    public void m4362X(Class cls) {
        this.f3584y.remove(cls);
        this.f3584y.add(0, cls);
        m4371g0();
    }

    /* JADX INFO: renamed from: Y */
    public Object m4363Y(String str, Object[] objArr, RunnableC1205k2 runnableC1205k2, C1174f1 c1174f1, InterfaceC1188h3 interfaceC1188h3) {
        return m4364Z(str, objArr, runnableC1205k2, c1174f1, interfaceC1188h3, false);
    }

    /* JADX INFO: renamed from: Z */
    public Object m4364Z(String str, Object[] objArr, RunnableC1205k2 runnableC1205k2, C1174f1 c1174f1, InterfaceC1188h3 interfaceC1188h3, boolean z10) throws C1163d2 {
        Class[] clsArrM5143m = AbstractC1273v4.m5143m(objArr);
        try {
            Object objM4404x = m4404x(str, clsArrM5143m, runnableC1205k2);
            if (objM4404x != null) {
                if (objM4404x instanceof C1168e1) {
                    return ((C1168e1) objM4404x).m4291o(objArr, runnableC1205k2, c1174f1, interfaceC1188h3);
                }
                try {
                    return AbstractC1143c4.m4166e0((Class) objM4404x, objArr, runnableC1205k2, c1174f1, interfaceC1188h3);
                } catch (C1279w4 e10) {
                    throw e10.mo5168b("Error invoking compiled command: ", interfaceC1188h3, c1174f1);
                }
            }
            try {
                Object objM4353O = m4353O(str, true);
                if (objM4353O != Primitive.VOID && objM4353O != null) {
                    Object objUnwrap = Primitive.unwrap(objM4353O);
                    if (objUnwrap instanceof AbstractC1128a1) {
                        return AbstractC1143c4.m4170g0(objUnwrap, str, objArr, runnableC1205k2, c1174f1, interfaceC1188h3);
                    }
                }
            } catch (C1279w4 unused) {
            }
            if (!z10) {
                boolean[] zArr = new boolean[1];
                Object objM4365a0 = m4365a0(str, objArr, runnableC1205k2, c1174f1, interfaceC1188h3, zArr);
                if (zArr[0]) {
                    return objM4365a0;
                }
            }
            throw new C1169e2("Command not found: " + AbstractC1225n4.m4976o(str, clsArrM5143m), interfaceC1188h3, c1174f1);
        } catch (C1279w4 e11) {
            throw e11.mo5168b("Error loading command: ", interfaceC1188h3, c1174f1);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public Object m4365a0(String str, Object[] objArr, RunnableC1205k2 runnableC1205k2, C1174f1 c1174f1, InterfaceC1188h3 interfaceC1188h3, boolean[] zArr) throws C1163d2 {
        try {
            C1168e1 c1168e1M4341C = m4341C("invoke", new Class[]{null, null});
            boolean z10 = c1168e1M4341C != null;
            zArr[0] = z10;
            if (z10) {
                return c1168e1M4341C.m4291o(new Object[]{str, objArr}, runnableC1205k2, c1174f1, interfaceC1188h3);
            }
            return null;
        } catch (C1279w4 e10) {
            throw e10.mo5168b("Local method invocation", interfaceC1188h3, c1174f1);
        }
    }

    @Override // bsh.C1281x0.a
    /* JADX INFO: renamed from: b */
    public void mo4283b() {
        m4371g0();
    }

    /* JADX INFO: renamed from: b0 */
    public Object m4366b0(String str, Object[] objArr, RunnableC1205k2 runnableC1205k2) {
        return m4367c0(str, objArr, runnableC1205k2, null, null);
    }

    /* JADX INFO: renamed from: c0 */
    public Object m4367c0(String str, Object[] objArr, RunnableC1205k2 runnableC1205k2, C1174f1 c1174f1, InterfaceC1188h3 interfaceC1188h3) {
        return mo4351M(runnableC1205k2).invokeMethod(str, objArr, runnableC1205k2, c1174f1, interfaceC1188h3, false);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m4368d0(C1182g3 c1182g3) {
        if (m4348J() != null) {
            return m4348J().equals(c1182g3) || m4348J().m4368d0(c1182g3);
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public void m4369e0() {
        mo4361W("org.json");
        mo4361W("java.util.stream");
        mo4361W("java.util.regex");
        mo4361W("java.util.function");
        mo4361W("java.util");
        mo4361W("java.net");
        mo4361W("java.math");
        mo4361W("java.lang");
        mo4361W("java.io");
        mo4361W("android.widget");
        mo4361W("android.view");
        mo4361W("android.text");
        mo4361W("android.os");
        mo4361W("android.graphics");
        mo4361W("android.content");
        mo4361W("android.app");
        m4359U("/bsh/commands");
    }

    /* JADX INFO: renamed from: f0 */
    public final C1168e1 m4370f0(InputStream inputStream, String str, Class[] clsArr, String str2, RunnableC1205k2 runnableC1205k2) throws C1279w4 {
        try {
            C1187h2 c1187h2 = new C1187h2(inputStream);
            try {
                runnableC1205k2.m4487h(c1187h2, this, str2);
                c1187h2.close();
                return m4341C(str, clsArr);
            } finally {
            }
        } catch (C1163d2 | IOException e10) {
            RunnableC1205k2.m4462e(e10.toString());
            throw new C1279w4("Error loading script: " + e10.getMessage(), e10);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m4371g0() {
        this.f3575L.clear();
        this.f3567D.clear();
    }

    public String getName() {
        return this.f3576q;
    }

    /* JADX INFO: renamed from: h */
    public boolean m4372h(String str, Object obj, RunnableC1205k2 runnableC1205k2) throws C1279w4 {
        String strM4175j = AbstractC1143c4.m4175j("set", str);
        Object objUnwrap = Primitive.unwrap(obj);
        if (m4341C(strM4175j, new Class[]{objUnwrap == null ? null : objUnwrap.getClass()}) == null) {
            return false;
        }
        try {
            m4366b0(strM4175j, new Object[]{obj}, runnableC1205k2);
            return true;
        } catch (C1163d2 e10) {
            throw new C1279w4("'This' property accessor threw exception: " + e10.getMessage(), e10);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m4373h0(Object obj) {
        this.f3574K = obj;
        m4360V(obj);
    }

    /* JADX INFO: renamed from: i */
    public void m4374i(String str, Class cls) {
        this.f3575L.put(str, cls);
    }

    /* JADX INFO: renamed from: i0 */
    public void m4375i0(C1281x0 c1281x0) {
        this.f3565B = c1281x0;
    }

    /* JADX INFO: renamed from: j */
    public final Class m4376j(String str) {
        return m4402w().classForName(str);
    }

    /* JADX INFO: renamed from: j0 */
    public void m4377j0(Class cls) {
        this.f3573J = cls;
        m4362X(cls);
    }

    /* JADX INFO: renamed from: k */
    public void m4378k() {
        this.f3578s.clear();
        this.f3579t.clear();
        this.f3580u.clear();
        this.f3581v.clear();
        this.f3582w.clear();
        this.f3583x.clear();
        if (this.f3577r == null) {
            m4369e0();
        }
        this.f3575L.clear();
        this.f3567D.clear();
    }

    /* JADX INFO: renamed from: k0 */
    public C1291y4 m4379k0(String str, Object obj, boolean z10) {
        return mo4395s0(str, obj, z10, false);
    }

    /* JADX INFO: renamed from: l */
    public final List m4380l(List list) {
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    /* JADX INFO: renamed from: l0 */
    public void m4381l0(String str, Object obj, boolean z10) throws C1279w4 {
        m4405x0(str, obj, z10, false);
    }

    /* JADX INFO: renamed from: m */
    public final Map m4382m(Map map) {
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    /* JADX INFO: renamed from: m0 */
    public void mo4383m0(C1168e1 c1168e1) {
        String name = c1168e1.getName();
        if (!this.f3579t.containsKey(name)) {
            this.f3579t.put(name, new ArrayList(1));
        }
        ((List) this.f3579t.get(name)).remove(c1168e1);
        ((List) this.f3579t.get(name)).add(0, c1168e1);
    }

    /* JADX INFO: renamed from: n */
    public C1182g3 m4384n() {
        try {
            C1182g3 c1182g3 = (C1182g3) clone();
            c1182g3.f3566C = null;
            c1182g3.f3578s = m4382m(this.f3578s);
            c1182g3.f3579t = m4382m(this.f3579t);
            c1182g3.f3580u = m4382m(this.f3580u);
            c1182g3.f3581v = m4380l(this.f3581v);
            c1182g3.f3582w = m4380l(this.f3582w);
            c1182g3.f3583x = m4380l(this.f3583x);
            c1182g3.f3584y = m4380l(this.f3584y);
            c1182g3.f3567D = m4382m(this.f3567D);
            return c1182g3;
        } catch (CloneNotSupportedException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m4385n0(String str) {
        this.f3576q = str;
    }

    /* JADX INFO: renamed from: o */
    public C1291y4 m4386o(String str, Class cls, C1265u2 c1265u2) {
        return new C1291y4(str, cls, c1265u2);
    }

    /* JADX INFO: renamed from: o0 */
    public void m4387o0(InterfaceC1188h3 interfaceC1188h3) {
        this.f3568E = interfaceC1188h3;
    }

    /* JADX INFO: renamed from: p */
    public C1291y4 m4388p(String str, Class cls, Object obj, C1283x2 c1283x2) {
        return new C1291y4(str, cls, obj, c1283x2);
    }

    /* JADX INFO: renamed from: p0 */
    public void m4389p0(String str) {
        this.f3564A = str;
    }

    /* JADX INFO: renamed from: q */
    public C1291y4 m4390q(String str, Object obj, C1283x2 c1283x2) {
        return m4388p(str, null, obj, c1283x2);
    }

    /* JADX INFO: renamed from: q0 */
    public void m4391q0(C1182g3 c1182g3) {
        this.f3577r = c1182g3;
        if (c1182g3 == null) {
            m4369e0();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m4392r() {
        m4402w().doSuperImport();
    }

    /* JADX INFO: renamed from: r0 */
    public void m4393r0(String str, Class cls, Object obj, C1283x2 c1283x2) throws C1279w4 {
        C1291y4 c1291y4M4354P = m4354P(str, false);
        if (c1291y4M4354P == null || c1291y4M4354P.m5223d() == null) {
            this.f3578s.put(str, m4388p(str, cls, obj, c1283x2));
            return;
        }
        if (c1291y4M4354P.m5223d() == cls) {
            if (c1291y4M4354P.f3888u == null) {
                c1291y4M4354P.f3888u = c1283x2;
            }
            c1291y4M4354P.m5229k(obj, 0);
        } else {
            throw new C1279w4("Typed variable: " + str + " was previously declared with type: " + c1291y4M4354P.m5223d());
        }
    }

    /* JADX INFO: renamed from: s */
    public Object m4394s(String str, RunnableC1205k2 runnableC1205k2) {
        return m4345G(str).m4087q(new C1174f1(this), runnableC1205k2);
    }

    /* JADX INFO: renamed from: s0 */
    public C1291y4 mo4395s0(String str, Object obj, boolean z10, boolean z11) throws C1279w4 {
        if (obj == null) {
            obj = Primitive.NULL;
        }
        C1291y4 c1291y4M4354P = m4354P(str, z11);
        if (c1291y4M4354P != null) {
            c1291y4M4354P.m5229k(obj, 1);
            return c1291y4M4354P;
        }
        if (z10) {
            C1295z2.m5235a("(Strict Java mode) Assignment to undeclared variable: ", str);
            return null;
        }
        C1291y4 c1291y4M4390q = m4390q(str, obj, null);
        this.f3578s.put(str, c1291y4M4390q);
        m4371g0();
        return c1291y4M4390q;
    }

    /* JADX INFO: renamed from: t */
    public Class m4396t(String str) {
        Class clsM4398u = m4398u(str);
        if (clsM4398u != null) {
            return clsM4398u;
        }
        C1182g3 c1182g3 = this.f3577r;
        if (c1182g3 != null) {
            return c1182g3.m4396t(str);
        }
        Class clsM33818b = this.f3565B.loaderManager.m33818b(str);
        if (clsM33818b != null) {
            return clsM33818b;
        }
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    public void m4397t0(String str, Object obj) {
        m4399u0(str, obj, false);
    }

    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder("NameSpace: ");
        if (this.f3576q == null) {
            string = super.toString();
        } else {
            string = this.f3576q + " (" + super.toString() + ")";
        }
        sb2.append(string);
        boolean z10 = this.f3570G;
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        sb2.append(z10 ? " (class) " : _UrlKt.FRAGMENT_ENCODE_SET);
        sb2.append(this.f3571H ? " (interface) " : _UrlKt.FRAGMENT_ENCODE_SET);
        sb2.append(this.f3572I ? " (enum) " : _UrlKt.FRAGMENT_ENCODE_SET);
        sb2.append(this.f3569F ? " (method) " : _UrlKt.FRAGMENT_ENCODE_SET);
        sb2.append(this.f3573J != null ? " (class static) " : _UrlKt.FRAGMENT_ENCODE_SET);
        if (this.f3574K != null) {
            str = " (class instance) ";
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final Class m4398u(String str) {
        if (this.f3575L.containsKey(str)) {
            return (Class) this.f3575L.get(str);
        }
        if (!C1130a3.m4074h(str)) {
            Class clsM4408z = m4408z(str);
            if (clsM4408z == null) {
                clsM4408z = m4376j(str);
            }
            if (clsM4408z != null) {
                m4374i(str, clsM4408z);
                return clsM4408z;
            }
        }
        Class clsM4376j = m4376j(str);
        if (clsM4376j != null) {
            return clsM4376j;
        }
        RunnableC1205k2.m4462e("getClass(): ", str, " not found in ", this);
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public void m4399u0(String str, Object obj, boolean z10) {
        mo4395s0(str, obj, z10, true);
    }

    /* JADX INFO: renamed from: v */
    public Object m4400v() throws C1279w4 {
        Object obj = this.f3574K;
        if (obj != null) {
            return obj;
        }
        if (this.f3573J != null) {
            throw new C1279w4("Can't refer to class instance from static context.");
        }
        C1289y2.m5220a("Can't resolve class instance 'this' in: ", this);
        return null;
    }

    /* JADX INFO: renamed from: v0 */
    public void m4401v0(C1291y4 c1291y4) {
        if (this.f3578s.containsKey(c1291y4.getName())) {
            return;
        }
        this.f3578s.put(c1291y4.getName(), c1291y4);
    }

    /* JADX INFO: renamed from: w */
    public C1281x0 m4402w() {
        C1281x0 c1281x0 = this.f3565B;
        if (c1281x0 != null) {
            return c1281x0;
        }
        C1182g3 c1182g3 = this.f3577r;
        if (c1182g3 != null && c1182g3 != f3563M) {
            return c1182g3.m4402w();
        }
        m4375i0(C1281x0.createClassManager(null));
        return this.f3565B;
    }

    /* JADX INFO: renamed from: w0 */
    public void m4403w0(String str, Object obj, boolean z10) throws C1279w4 {
        m4405x0(str, obj, z10, true);
    }

    /* JADX INFO: renamed from: x */
    public Object m4404x(String str, Class[] clsArr, RunnableC1205k2 runnableC1205k2) {
        String str2;
        Class[] clsArr2;
        RunnableC1205k2 runnableC1205k22;
        RunnableC1205k2.m4462e("Get command: ", str);
        C1281x0 c1281x0M4492m = runnableC1205k2.m4492m();
        for (String str3 : this.f3582w) {
            String str4 = str3.equals("/") ? str3 + str + ".bsh" : str3 + "/" + str + ".bsh";
            RunnableC1205k2.m4462e("searching for script: ".concat(str4));
            URL resource = c1281x0M4492m.getResource(str4);
            if (resource != null) {
                try {
                    str2 = str;
                    clsArr2 = clsArr;
                    runnableC1205k22 = runnableC1205k2;
                    try {
                        return m4370f0((InputStream) resource.getContent(), str2, clsArr2, str4, runnableC1205k22);
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    str2 = str;
                    clsArr2 = clsArr;
                    runnableC1205k22 = runnableC1205k2;
                }
            } else {
                str2 = str;
                clsArr2 = clsArr;
                runnableC1205k22 = runnableC1205k2;
            }
            String str5 = str3.equals("/") ? str2 : str3.substring(1).replace('/', '.') + "." + str2;
            RunnableC1205k2.m4462e("searching for class: " + str5);
            Class clsClassForName = c1281x0M4492m.classForName(str5);
            if (clsClassForName != null) {
                return clsClassForName;
            }
            str = str2;
            clsArr = clsArr2;
            runnableC1205k2 = runnableC1205k22;
        }
        String str6 = str;
        Class[] clsArr3 = clsArr;
        RunnableC1205k2 runnableC1205k23 = runnableC1205k2;
        C1182g3 c1182g3 = this.f3577r;
        if (c1182g3 != null) {
            return c1182g3.m4404x(str6, clsArr3, runnableC1205k23);
        }
        return null;
    }

    /* JADX INFO: renamed from: x0 */
    public void m4405x0(String str, Object obj, boolean z10, boolean z11) throws C1279w4 {
        if (obj == null) {
            throw new C1211l2("null variable value");
        }
        C1291y4 c1291y4M4354P = m4354P(str, z11);
        if (c1291y4M4354P != null) {
            try {
                c1291y4M4354P.m5229k(obj, 1);
                return;
            } catch (C1279w4 e10) {
                throw new C1279w4("Variable assignment: " + str + ": " + e10.getMessage(), e10);
            }
        }
        if (z10) {
            C1295z2.m5235a("(Strict Java mode) Assignment to undeclared variable: ", str);
            return;
        }
        This r52 = this.f3566C;
        if (m4372h(str, obj, r52 != null ? r52.declaringInterpreter : null)) {
            return;
        }
        this.f3578s.put(str, m4390q(str, obj, null));
        m4371g0();
    }

    /* JADX INFO: renamed from: y */
    public This m4406y(RunnableC1205k2 runnableC1205k2) {
        C1182g3 c1182g3 = this.f3577r;
        return c1182g3 != null ? c1182g3.m4406y(runnableC1205k2) : mo4351M(runnableC1205k2);
    }

    /* JADX INFO: renamed from: y0 */
    public Object m4407y0(C1291y4 c1291y4) {
        return c1291y4 == null ? Primitive.VOID : c1291y4.m5225g();
    }

    /* JADX INFO: renamed from: z */
    public final Class m4408z(String str) {
        String classNameByUnqName;
        String str2 = (String) this.f3580u.get(str);
        if (str2 != null) {
            Class clsM4376j = m4376j(str2);
            if (clsM4376j != null) {
                return clsM4376j;
            }
            if (C1130a3.m4074h(str2)) {
                try {
                    clsM4376j = m4345G(str2).m4085o();
                } catch (ClassNotFoundException unused) {
                }
            }
            RunnableC1205k2.m4462e("imported unpackaged name not found:", str2);
            if (clsM4376j == null) {
                return null;
            }
            m4402w().cacheClassInfo(str2, clsM4376j);
            return clsM4376j;
        }
        Iterator it = this.f3581v.iterator();
        while (it.hasNext()) {
            Class clsM4376j2 = m4376j(((String) it.next()) + "." + str);
            if (clsM4376j2 != null) {
                return clsM4376j2;
            }
        }
        C1281x0 c1281x0M4402w = m4402w();
        if (!c1281x0M4402w.hasSuperImport() || (classNameByUnqName = c1281x0M4402w.getClassNameByUnqName(str)) == null) {
            return null;
        }
        return m4376j(classNameByUnqName);
    }

    public C1182g3(C1182g3 c1182g3, String str) {
        this(c1182g3, null, str);
    }
}
