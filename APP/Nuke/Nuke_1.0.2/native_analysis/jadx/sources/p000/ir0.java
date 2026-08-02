package p000;

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

    /* JADX INFO: renamed from: h */
    public static final rm0 f4755h = rm0.f9640d;

    /* JADX INFO: renamed from: i */
    public static final int f4756i = 1;

    /* JADX INFO: renamed from: j */
    public static final int f4757j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f4758k = 2;

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f4759a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f4760b;

    /* JADX INFO: renamed from: c */
    public final sz0 f4761c;

    /* JADX INFO: renamed from: d */
    public final x21 f4762d;

    /* JADX INFO: renamed from: e */
    public final List f4763e;

    /* JADX INFO: renamed from: f */
    public final boolean f4764f;

    /* JADX INFO: renamed from: g */
    public final rm0 f4765g;

    public ir0(ah0 ah0Var, int i, Map map, boolean z, rm0 rm0Var, List list, int i2, int i3, List list2) {
        this.f4759a = new ThreadLocal();
        this.f4760b = new ConcurrentHashMap();
        sz0 sz0Var = new sz0(5, map, list2);
        this.f4761c = sz0Var;
        this.f4764f = z;
        this.f4765g = rm0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(v53.f11720A);
        int i4 = 1;
        arrayList.add(i2 == 1 ? ns1.f7309c : new ms1(i2));
        arrayList.add(ah0Var);
        arrayList.addAll(list);
        arrayList.add(v53.f11737p);
        arrayList.add(v53.f11728g);
        arrayList.add(v53.f11725d);
        arrayList.add(v53.f11726e);
        arrayList.add(v53.f11727f);
        t43 t43Var = v53.f11732k;
        arrayList.add(new n53(Long.TYPE, Long.class, t43Var));
        int i5 = 0;
        arrayList.add(new n53(Double.TYPE, Double.class, new fr0(i5)));
        arrayList.add(new n53(Float.TYPE, Float.class, new fr0(i4)));
        arrayList.add(i3 == 2 ? cs1.f1709b : new bs1(new cs1(i3), i5));
        arrayList.add(v53.f11729h);
        arrayList.add(v53.f11730i);
        arrayList.add(new l53(AtomicLong.class, new gr0(t43Var, i5).m4053a(), i5));
        arrayList.add(new l53(AtomicLongArray.class, new gr0(t43Var, i4).m4053a(), i5));
        arrayList.add(v53.f11731j);
        arrayList.add(v53.f11733l);
        arrayList.add(v53.f11738q);
        arrayList.add(v53.f11739r);
        arrayList.add(new l53(BigDecimal.class, v53.f11734m, i5));
        arrayList.add(new l53(BigInteger.class, v53.f11735n, i5));
        arrayList.add(new l53(i71.class, v53.f11736o, i5));
        arrayList.add(v53.f11740s);
        arrayList.add(v53.f11741t);
        arrayList.add(v53.f11743v);
        arrayList.add(v53.f11744w);
        arrayList.add(v53.f11746y);
        arrayList.add(v53.f11742u);
        arrayList.add(v53.f11723b);
        arrayList.add(g50.f3311c);
        arrayList.add(v53.f11745x);
        if (wt2.f12644a) {
            arrayList.add(wt2.f12646c);
            arrayList.add(wt2.f12645b);
            arrayList.add(wt2.f12647d);
        }
        arrayList.add(C0423lg.f6103c);
        arrayList.add(v53.f11722a);
        arrayList.add(new C0106cu(sz0Var, i5));
        arrayList.add(new C0106cu(sz0Var, i4));
        x21 x21Var = new x21(sz0Var);
        this.f4762d = x21Var;
        arrayList.add(x21Var);
        arrayList.add(v53.f11721B);
        arrayList.add(new n72(sz0Var, i, ah0Var, x21Var, list2));
        this.f4763e = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static void m2384a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m2385b(String str, Class cls) {
        j63 j63Var = new j63(cls);
        Object obj = null;
        if (str == null) {
            return null;
        }
        l41 l41Var = new l41(new StringReader(str));
        l41Var.m2817L(2);
        int i = l41Var.f5933v;
        boolean z = true;
        if (i == 2) {
            l41Var.f5933v = 1;
        }
        try {
            try {
                try {
                    l41Var.m2814I();
                    z = false;
                    q43 q43VarM2386c = m2386c(j63Var);
                    Class cls2 = j63Var.f4904a;
                    Object objMo97b = q43VarM2386c.mo97b(l41Var);
                    Class clsM3764T = AbstractC0570p7.m3764T(cls2);
                    if (objMo97b != null && !clsM3764T.isInstance(objMo97b)) {
                        throw new ClassCastException("Type adapter '" + q43VarM2386c + "' returned wrong type; requested " + cls2 + " but got instance of " + objMo97b.getClass() + "\nVerify that the adapter was registered for the correct type.");
                    }
                    l41Var.m2817L(i);
                    obj = objMo97b;
                } catch (AssertionError e) {
                    throw new AssertionError("AssertionError (GSON 2.13.1): " + e.getMessage(), e);
                } catch (IllegalStateException e2) {
                    throw new t31(e2);
                }
            } catch (EOFException e3) {
                if (!z) {
                    throw new t31(e3);
                }
                l41Var.m2817L(i);
            } catch (IOException e4) {
                throw new t31(e4);
            }
            if (obj != null) {
                try {
                    if (l41Var.m2814I() != 10) {
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
            l41Var.m2817L(i);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final q43 m2386c(j63 j63Var) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f4760b;
        q43 q43Var = (q43) concurrentHashMap.get(j63Var);
        if (q43Var != null) {
            return q43Var;
        }
        ThreadLocal threadLocal = this.f4759a;
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
            Iterator it = this.f4763e.iterator();
            q43 q43VarMo162a = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                q43VarMo162a = ((r43) it.next()).mo162a(this, j63Var);
                if (q43VarMo162a != null) {
                    if (hr0Var.f4119a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    hr0Var.f4119a = q43VarMo162a;
                    map.put(j63Var, q43VarMo162a);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (q43VarMo162a == null) {
                C0676s.m4648g("GSON (2.13.1) cannot handle ", j63Var);
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return q43VarMo162a;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final o41 m2387d(Writer writer) {
        o41 o41Var = new o41(writer);
        o41Var.m3500r(this.f4765g);
        o41Var.f7478p = this.f4764f;
        o41Var.m3501t(2);
        o41Var.f7480r = false;
        return o41Var;
    }

    /* JADX INFO: renamed from: e */
    public final String m2388e(Object obj) {
        Class cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            m2389f(obj, cls, m2387d(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new t31(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2389f(Object obj, Class cls, o41 o41Var) {
        q43 q43VarM2386c = m2386c(new j63(cls));
        int i = o41Var.f7477o;
        if (i == 2) {
            o41Var.f7477o = 1;
        }
        boolean z = o41Var.f7478p;
        boolean z2 = o41Var.f7480r;
        o41Var.f7478p = this.f4764f;
        o41Var.f7480r = false;
        try {
            try {
                q43VarM2386c.mo98c(o41Var, obj);
            } catch (IOException e) {
                throw new t31(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e2.getMessage(), e2);
            }
        } finally {
            o41Var.m3501t(i);
            o41Var.f7478p = z;
            o41Var.f7480r = z2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f4763e + ",instanceCreators:" + this.f4761c + "}";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ir0() {
        ah0 ah0Var = ah0.f199j;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this(ah0Var, f4756i, map, true, f4755h, list, f4757j, f4758k, list);
    }
}
