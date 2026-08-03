package p105h6;

import af.C0081d;
import java.io.IOException;
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
import p089g1.C1275d;
import p100h0.C1545q0;
import p134j6.AbstractC2072j;
import p134j6.C2066d;
import p151k6.AbstractC2284c1;
import p151k6.C2279b;
import p151k6.C2285d;
import p151k6.C2293h;
import p151k6.C2301l;
import p151k6.C2305n;
import p151k6.C2307o;
import p151k6.C2309p;
import p151k6.C2311q;
import p151k6.C2316s0;
import p151k6.C2320u0;
import p151k6.C2323w;
import p181m6.AbstractC2787f;
import p194n6.C2901a;
import p208o6.C3066a;

/* JADX INFO: renamed from: h6.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1614f {

    /* JADX INFO: renamed from: i */
    public static final C1609a f5290i = C1609a.f5281d;

    /* JADX INFO: renamed from: j */
    public static final int f5291j = 1;

    /* JADX INFO: renamed from: k */
    public static final int f5292k = 2;

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f5293a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f5294b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final C1545q0 f5295c;

    /* JADX INFO: renamed from: d */
    public final C2301l f5296d;

    /* JADX INFO: renamed from: e */
    public final List f5297e;

    /* JADX INFO: renamed from: f */
    public final boolean f5298f;

    /* JADX INFO: renamed from: g */
    public final C1609a f5299g;

    /* JADX INFO: renamed from: h */
    public final int f5300h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1614f(C2066d c2066d, int i9, HashMap map, boolean z9, C1609a c1609a, int i10, boolean z10, int i11, ArrayList arrayList, int i12, int i13, ArrayList arrayList2) {
        C1545q0 c1545q0 = new C1545q0(map, z10, arrayList2);
        this.f5295c = c1545q0;
        this.f5298f = z9;
        this.f5299g = c1609a;
        this.f5300h = i10;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(AbstractC2284c1.f7611z);
        arrayList3.add(i12 == 1 ? C2311q.f7630b : new C2309p(i12));
        arrayList3.add(c2066d);
        arrayList3.addAll(arrayList);
        arrayList3.add(AbstractC2284c1.f7601p);
        arrayList3.add(AbstractC2284c1.f7592g);
        arrayList3.add(AbstractC2284c1.f7589d);
        arrayList3.add(AbstractC2284c1.f7590e);
        arrayList3.add(AbstractC2284c1.f7591f);
        AbstractC1622n c1611c = i11 == 1 ? AbstractC2284c1.f7596k : new C1611c();
        arrayList3.add(new C2320u0(Long.TYPE, Long.class, c1611c));
        arrayList3.add(new C2320u0(Double.TYPE, Double.class, new C1610b(0)));
        arrayList3.add(new C2320u0(Float.TYPE, Float.class, new C1610b(1)));
        arrayList3.add(i13 == 2 ? C2307o.f7628b : new C2305n(new C2307o(0), 0));
        arrayList3.add(AbstractC2284c1.f7593h);
        arrayList3.add(AbstractC2284c1.f7594i);
        arrayList3.add(new C2316s0(AtomicLong.class, new C1612d(c1611c, 0).m4136a(), 0));
        int i14 = 0;
        arrayList3.add(new C2316s0(AtomicLongArray.class, new C1612d(c1611c, 1).m4136a(), i14));
        arrayList3.add(AbstractC2284c1.f7595j);
        arrayList3.add(AbstractC2284c1.f7597l);
        arrayList3.add(AbstractC2284c1.f7602q);
        arrayList3.add(AbstractC2284c1.f7603r);
        arrayList3.add(new C2316s0(BigDecimal.class, AbstractC2284c1.f7598m, i14));
        arrayList3.add(new C2316s0(BigInteger.class, AbstractC2284c1.f7599n, i14));
        arrayList3.add(new C2316s0(AbstractC2072j.class, AbstractC2284c1.f7600o, i14));
        arrayList3.add(AbstractC2284c1.f7604s);
        arrayList3.add(AbstractC2284c1.f7605t);
        arrayList3.add(AbstractC2284c1.f7607v);
        arrayList3.add(AbstractC2284c1.f7608w);
        arrayList3.add(AbstractC2284c1.f7610y);
        arrayList3.add(AbstractC2284c1.f7606u);
        arrayList3.add(AbstractC2284c1.f7587b);
        arrayList3.add(C2293h.f7616b);
        arrayList3.add(AbstractC2284c1.f7609x);
        if (AbstractC2787f.f9029a) {
            arrayList3.add(AbstractC2787f.f9033e);
            arrayList3.add(AbstractC2787f.f9032d);
            arrayList3.add(AbstractC2787f.f9034f);
        }
        arrayList3.add(C2279b.f7581b);
        arrayList3.add(AbstractC2284c1.f7586a);
        arrayList3.add(new C2285d(c1545q0, 0));
        arrayList3.add(new C2285d(c1545q0, 1));
        C2301l c2301l = new C2301l(c1545q0);
        this.f5296d = c2301l;
        arrayList3.add(c2301l);
        arrayList3.add(AbstractC2284c1.f7585A);
        arrayList3.add(new C2323w(c1545q0, i9, c2066d, c2301l, arrayList2));
        this.f5297e = Collections.unmodifiableList(arrayList3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m4129a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final AbstractC1622n m4130b(C2901a c2901a) {
        boolean z9;
        ConcurrentHashMap concurrentHashMap = this.f5294b;
        AbstractC1622n abstractC1622n = (AbstractC1622n) concurrentHashMap.get(c2901a);
        if (abstractC1622n != null) {
            return abstractC1622n;
        }
        ThreadLocal threadLocal = this.f5293a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z9 = true;
        } else {
            AbstractC1622n abstractC1622n2 = (AbstractC1622n) map.get(c2901a);
            if (abstractC1622n2 != null) {
                return abstractC1622n2;
            }
            z9 = false;
        }
        try {
            C1613e c1613e = new C1613e();
            map.put(c2901a, c1613e);
            Iterator it = this.f5297e.iterator();
            AbstractC1622n abstractC1622nMo4137a = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC1622nMo4137a = ((InterfaceC1623o) it.next()).mo4137a(this, c2901a);
                if (abstractC1622nMo4137a != null) {
                    if (c1613e.f5289a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c1613e.f5289a = abstractC1622nMo4137a;
                    map.put(c2901a, abstractC1622nMo4137a);
                }
            }
            if (z9) {
                threadLocal.remove();
            }
            if (abstractC1622nMo4137a == null) {
                C1275d.m3412f(c2901a, "GSON (2.13.2) cannot handle ");
                return null;
            }
            if (z9) {
                concurrentHashMap.putAll(map);
            }
            return abstractC1622nMo4137a;
        } catch (Throwable th2) {
            if (z9) {
                threadLocal.remove();
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C3066a m4131c(Writer writer) {
        C3066a c3066a = new C3066a(writer);
        c3066a.m6510o(this.f5299g);
        c3066a.f9923o = this.f5298f;
        int i9 = this.f5300h;
        if (i9 == 0) {
            i9 = 2;
        }
        c3066a.m6511q(i9);
        c3066a.f9925q = false;
        return c3066a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4132d(Object obj, Class cls, C3066a c3066a) {
        AbstractC1622n abstractC1622nM4130b = m4130b(new C2901a(cls));
        int i9 = c3066a.f9922n;
        int i10 = this.f5300h;
        if (i10 != 0) {
            c3066a.m6511q(i10);
        } else if (i9 == 2) {
            c3066a.f9922n = 1;
        }
        boolean z9 = c3066a.f9923o;
        boolean z10 = c3066a.f9925q;
        c3066a.f9923o = this.f5298f;
        c3066a.f9925q = false;
        try {
            try {
                abstractC1622nM4130b.mo4127b(c3066a, obj);
            } catch (IOException e6) {
                throw new C0081d(e6);
            } catch (AssertionError e7) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e7.getMessage(), e7);
            }
        } finally {
            c3066a.m6511q(i9);
            c3066a.f9923o = z9;
            c3066a.f9925q = z10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f5297e + ",instanceCreators:" + this.f5295c + "}";
    }
}
