package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ir0 {
    public static final rm0 h = rm0.d;
    public static final int i = 1;
    public static final int j = 1;
    public static final int k = 2;
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final sz0 c;
    public final x21 d;
    public final List e;
    public final boolean f;
    public final rm0 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ir0(ah0 ah0Var, int i2, Map map, boolean z, rm0 rm0Var, List list, int i3, int i4, List list2) {
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        sz0 sz0Var = new sz0(5, map, list2);
        this.c = sz0Var;
        this.f = z;
        this.g = rm0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(v53.A);
        int i5 = 1;
        arrayList.add(i3 == 1 ? ns1.c : new ms1(i3));
        arrayList.add(ah0Var);
        arrayList.addAll(list);
        arrayList.add(v53.p);
        arrayList.add(v53.g);
        arrayList.add(v53.d);
        arrayList.add(v53.e);
        arrayList.add(v53.f);
        t43 t43Var = v53.k;
        arrayList.add(new n53(Long.TYPE, Long.class, t43Var));
        int i6 = 0;
        arrayList.add(new n53(Double.TYPE, Double.class, new fr0(i6)));
        arrayList.add(new n53(Float.TYPE, Float.class, new fr0(i5)));
        arrayList.add(i4 == 2 ? cs1.b : new bs1(new cs1(i4), i6));
        arrayList.add(v53.h);
        arrayList.add(v53.i);
        arrayList.add(new l53(AtomicLong.class, new gr0(t43Var, i6).a(), i6));
        arrayList.add(new l53(AtomicLongArray.class, new gr0(t43Var, i5).a(), i6));
        arrayList.add(v53.j);
        arrayList.add(v53.l);
        arrayList.add(v53.q);
        arrayList.add(v53.r);
        arrayList.add(new l53(BigDecimal.class, v53.m, i6));
        arrayList.add(new l53(BigInteger.class, v53.n, i6));
        arrayList.add(new l53(i71.class, v53.o, i6));
        arrayList.add(v53.s);
        arrayList.add(v53.t);
        arrayList.add(v53.v);
        arrayList.add(v53.w);
        arrayList.add(v53.y);
        arrayList.add(v53.u);
        arrayList.add(v53.b);
        arrayList.add(g50.c);
        arrayList.add(v53.x);
        if (wt2.a) {
            arrayList.add(wt2.c);
            arrayList.add(wt2.b);
            arrayList.add(wt2.d);
        }
        arrayList.add(lg.c);
        arrayList.add(v53.a);
        arrayList.add(new cu(sz0Var, i6));
        arrayList.add(new cu(sz0Var, i5));
        x21 x21Var = new x21(sz0Var);
        this.d = x21Var;
        arrayList.add(x21Var);
        arrayList.add(v53.B);
        arrayList.add(new n72(sz0Var, i2, ah0Var, x21Var, list2));
        this.e = Collections.unmodifiableList(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object b(String str, Class cls) {
        j63 j63Var = new j63(cls);
        Object obj = null;
        if (str == null) {
            return null;
        }
        l41 l41Var = new l41(new StringReader(str));
        l41Var.L(2);
        int i2 = l41Var.v;
        boolean z = true;
        if (i2 == 2) {
            l41Var.v = 1;
        }
        try {
            try {
                try {
                    l41Var.I();
                    z = false;
                    q43 q43VarC = c(j63Var);
                    Class cls2 = j63Var.a;
                    Object objB = q43VarC.b(l41Var);
                    Class clsT = p7.T(cls2);
                    if (objB != null && !clsT.isInstance(objB)) {
                        throw new ClassCastException("Type adapter '" + q43VarC + "' returned wrong type; requested " + cls2 + " but got instance of " + objB.getClass() + "\nVerify that the adapter was registered for the correct type.");
                    }
                    l41Var.L(i2);
                    obj = objB;
                } catch (AssertionError e) {
                    throw new AssertionError("AssertionError (GSON 2.13.1): " + e.getMessage(), e);
                } catch (IllegalStateException e2) {
                    throw new t31(e2);
                }
            } catch (EOFException e3) {
                if (!z) {
                    throw new t31(e3);
                }
                l41Var.L(i2);
            } catch (IOException e4) {
                throw new t31(e4);
            }
            if (obj != null) {
                try {
                    if (l41Var.I() != 10) {
                        throw new t31("JSON document was not fully consumed.");
                    }
                } catch (ke1 e5) {
                    throw new t31(e5);
                } catch (IOException e6) {
                    throw new t31(e6);
                }
            }
            return obj;
        } catch (Throwable th) {
            l41Var.L(i2);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q43 c(j63 j63Var) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.b;
        q43 q43Var = (q43) concurrentHashMap.get(j63Var);
        if (q43Var != null) {
            return q43Var;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            q43 q43Var2 = (q43) map.get(j63Var);
            if (q43Var2 != null) {
                return q43Var2;
            }
            z = false;
        }
        try {
            hr0 hr0Var = new hr0();
            map.put(j63Var, hr0Var);
            Iterator it = this.e.iterator();
            q43 q43VarA = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                q43VarA = ((r43) it.next()).a(this, j63Var);
                if (q43VarA != null) {
                    if (hr0Var.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    hr0Var.a = q43VarA;
                    map.put(j63Var, q43VarA);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (q43VarA == null) {
                s.g("GSON (2.13.1) cannot handle ", j63Var);
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return q43VarA;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o41 d(Writer writer) {
        o41 o41Var = new o41(writer);
        o41Var.r(this.g);
        o41Var.p = this.f;
        o41Var.t(2);
        o41Var.r = false;
        return o41Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String e(Object obj) {
        Class cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            f(obj, cls, d(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new t31(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(Object obj, Class cls, o41 o41Var) {
        q43 q43VarC = c(new j63(cls));
        int i2 = o41Var.o;
        if (i2 == 2) {
            o41Var.o = 1;
        }
        boolean z = o41Var.p;
        boolean z2 = o41Var.r;
        o41Var.p = this.f;
        o41Var.r = false;
        try {
            try {
                q43VarC.c(o41Var, obj);
            } catch (IOException e) {
                throw new t31(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e2.getMessage(), e2);
            }
        } finally {
            o41Var.t(i2);
            o41Var.p = z;
            o41Var.r = z2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ir0() {
        ah0 ah0Var = ah0.j;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this(ah0Var, i, map, true, h, list, j, k, list);
    }
}
