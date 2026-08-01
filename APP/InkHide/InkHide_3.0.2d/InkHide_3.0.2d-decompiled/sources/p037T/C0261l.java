package p037T;

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
import p024M.C0191e;
import p041V.C0315h;
import p041V.C0317j;
import p042W.AbstractC0352x;
import p042W.C0330b;
import p042W.C0331c;
import p042W.C0332d;
import p042W.C0340l;
import p042W.C0341m;
import p042W.C0346r;
import p042W.C0348t;
import p042W.C0349u;
import p046Z.AbstractC0360c;
import p049a0.C0367a;
import p051b0.C0493b;
import p051b0.C0494c;
import p051b0.C0495d;

/* JADX INFO: renamed from: T.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0261l {

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f612a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f613b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final C0191e f614c;

    /* JADX INFO: renamed from: d */
    public final C0331c f615d;

    /* JADX INFO: renamed from: e */
    public final List f616e;

    /* JADX INFO: renamed from: f */
    public final boolean f617f;

    /* JADX INFO: renamed from: g */
    public final boolean f618g;

    /* JADX INFO: renamed from: h */
    public final boolean f619h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0261l(C0315h c0315h, EnumC0257h enumC0257h, HashMap map, boolean z2, boolean z3, boolean z4, boolean z5, int i2, ArrayList arrayList, EnumC0273x enumC0273x, EnumC0273x enumC0273x2, ArrayList arrayList2) {
        C0191e c0191e = new C0191e(map, z5, arrayList2);
        this.f614c = c0191e;
        this.f617f = z2;
        this.f618g = z3;
        this.f619h = z4;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(AbstractC0352x.f825z);
        arrayList3.add(enumC0273x == EnumC0273x.f639a ? C0341m.f762c : new C0340l(1, enumC0273x));
        arrayList3.add(c0315h);
        arrayList3.addAll(arrayList);
        arrayList3.add(AbstractC0352x.f815p);
        arrayList3.add(AbstractC0352x.f806g);
        arrayList3.add(AbstractC0352x.f803d);
        arrayList3.add(AbstractC0352x.f804e);
        arrayList3.add(AbstractC0352x.f805f);
        C0258i c0258i = i2 == 1 ? AbstractC0352x.f810k : new C0258i(2);
        arrayList3.add(new C0349u(Long.TYPE, Long.class, c0258i));
        arrayList3.add(new C0349u(Double.TYPE, Double.class, new C0258i(0)));
        arrayList3.add(new C0349u(Float.TYPE, Float.class, new C0258i(1)));
        arrayList3.add(enumC0273x2 == EnumC0273x.f640b ? C0332d.f740d : new C0340l(0, new C0332d(enumC0273x2)));
        arrayList3.add(AbstractC0352x.f807h);
        arrayList3.add(AbstractC0352x.f808i);
        arrayList3.add(new C0348t(AtomicLong.class, new C0259j(new C0259j(c0258i, 0), 2), 0));
        arrayList3.add(new C0348t(AtomicLongArray.class, new C0259j(new C0259j(c0258i, 1), 2), 0));
        arrayList3.add(AbstractC0352x.f809j);
        arrayList3.add(AbstractC0352x.f811l);
        arrayList3.add(AbstractC0352x.f816q);
        arrayList3.add(AbstractC0352x.f817r);
        arrayList3.add(new C0348t(BigDecimal.class, AbstractC0352x.f812m, 0));
        arrayList3.add(new C0348t(BigInteger.class, AbstractC0352x.f813n, 0));
        arrayList3.add(new C0348t(C0317j.class, AbstractC0352x.f814o, 0));
        arrayList3.add(AbstractC0352x.f818s);
        arrayList3.add(AbstractC0352x.f819t);
        arrayList3.add(AbstractC0352x.f821v);
        arrayList3.add(AbstractC0352x.f822w);
        arrayList3.add(AbstractC0352x.f824y);
        arrayList3.add(AbstractC0352x.f820u);
        arrayList3.add(AbstractC0352x.f801b);
        arrayList3.add(C0332d.f739c);
        arrayList3.add(AbstractC0352x.f823x);
        if (AbstractC0360c.f841a) {
            arrayList3.add(AbstractC0360c.f845e);
            arrayList3.add(AbstractC0360c.f844d);
            arrayList3.add(AbstractC0360c.f846f);
        }
        arrayList3.add(C0330b.f733d);
        arrayList3.add(AbstractC0352x.f800a);
        arrayList3.add(new C0331c(c0191e, 0));
        arrayList3.add(new C0331c(c0191e, 2));
        C0331c c0331c = new C0331c(c0191e, 1);
        this.f615d = c0331c;
        arrayList3.add(c0331c);
        arrayList3.add(AbstractC0352x.f799A);
        arrayList3.add(new C0346r(c0191e, enumC0257h, c0315h, c0331c, arrayList2));
        this.f616e = Collections.unmodifiableList(arrayList3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m478a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Object m479b(C0493b c0493b, C0367a c0367a) {
        boolean z2 = c0493b.f1547b;
        boolean z3 = true;
        c0493b.f1547b = true;
        try {
            try {
                try {
                    try {
                        c0493b.mo585x();
                        z3 = false;
                        return m481d(c0367a).mo476a(c0493b);
                    } catch (EOFException e2) {
                        if (!z3) {
                            throw new C0265p(e2);
                        }
                        c0493b.f1547b = z2;
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    throw new C0265p(e3);
                }
            } catch (IOException e4) {
                throw new C0265p(e4);
            } catch (AssertionError e5) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e5.getMessage(), e5);
            }
        } finally {
            c0493b.f1547b = z2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m480c(String str, C0367a c0367a) {
        if (str == null) {
            return null;
        }
        C0493b c0493b = new C0493b(new StringReader(str));
        c0493b.f1547b = false;
        Object objM479b = m479b(c0493b, c0367a);
        if (objM479b != null) {
            try {
                if (c0493b.mo585x() != 10) {
                    throw new C0265p("JSON document was not fully consumed.");
                }
            } catch (C0495d e2) {
                throw new C0265p(e2);
            } catch (IOException e3) {
                throw new C0265p(e3);
            }
        }
        return objM479b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final AbstractC0274y m481d(C0367a c0367a) {
        boolean z2;
        ConcurrentHashMap concurrentHashMap = this.f613b;
        AbstractC0274y abstractC0274y = (AbstractC0274y) concurrentHashMap.get(c0367a);
        if (abstractC0274y != null) {
            return abstractC0274y;
        }
        ThreadLocal threadLocal = this.f612a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z2 = true;
        } else {
            AbstractC0274y abstractC0274y2 = (AbstractC0274y) map.get(c0367a);
            if (abstractC0274y2 != null) {
                return abstractC0274y2;
            }
            z2 = false;
        }
        try {
            C0260k c0260k = new C0260k();
            AbstractC0274y abstractC0274yMo493a = null;
            c0260k.f611a = null;
            map.put(c0367a, c0260k);
            Iterator it = this.f616e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC0274yMo493a = ((InterfaceC0275z) it.next()).mo493a(this, c0367a);
                if (abstractC0274yMo493a != null) {
                    if (c0260k.f611a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c0260k.f611a = abstractC0274yMo493a;
                    map.put(c0367a, abstractC0274yMo493a);
                }
            }
            if (z2) {
                threadLocal.remove();
            }
            if (abstractC0274yMo493a != null) {
                if (z2) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC0274yMo493a;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + c0367a);
        } catch (Throwable th) {
            if (z2) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C0494c m482e(Writer writer) {
        C0494c c0494c = new C0494c(writer);
        if (this.f619h) {
            c0494c.f1567d = "  ";
            c0494c.f1568e = ": ";
        }
        c0494c.f1570g = this.f618g;
        c0494c.f1569f = false;
        c0494c.f1572i = this.f617f;
        return c0494c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m483f(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                m484g(m482e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new C0265p(e2);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            m485h(obj, cls, m482e(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e3) {
            throw new C0265p(e3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m484g(C0494c c0494c) {
        C0266q c0266q = C0266q.f636a;
        boolean z2 = c0494c.f1569f;
        c0494c.f1569f = true;
        boolean z3 = c0494c.f1570g;
        c0494c.f1570g = this.f618g;
        boolean z4 = c0494c.f1572i;
        c0494c.f1572i = this.f617f;
        try {
            try {
                C0348t c0348t = AbstractC0352x.f800a;
                C0258i.m475d(c0494c, c0266q);
                c0494c.f1569f = z2;
                c0494c.f1570g = z3;
                c0494c.f1572i = z4;
            } catch (IOException e2) {
                throw new C0265p(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
            }
        } catch (Throwable th) {
            c0494c.f1569f = z2;
            c0494c.f1570g = z3;
            c0494c.f1572i = z4;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m485h(Object obj, Class cls, C0494c c0494c) {
        AbstractC0274y abstractC0274yM481d = m481d(new C0367a(cls));
        boolean z2 = c0494c.f1569f;
        c0494c.f1569f = true;
        boolean z3 = c0494c.f1570g;
        c0494c.f1570g = this.f618g;
        boolean z4 = c0494c.f1572i;
        c0494c.f1572i = this.f617f;
        try {
            try {
                abstractC0274yM481d.mo477b(c0494c, obj);
            } catch (IOException e2) {
                throw new C0265p(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
            }
        } finally {
            c0494c.f1569f = z2;
            c0494c.f1570g = z3;
            c0494c.f1572i = z4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "{serializeNulls:" + this.f617f + ",factories:" + this.f616e + ",instanceCreators:" + this.f614c + "}";
    }
}
