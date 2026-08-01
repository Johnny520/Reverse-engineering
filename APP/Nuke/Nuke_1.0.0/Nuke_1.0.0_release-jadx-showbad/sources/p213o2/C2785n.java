package p213o2;

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
import p053J3.C0849j;
import p154e2.C2029h;
import p224q2.C2913d;
import p224q2.C2919j;
import p230r2.AbstractC3127c0;
import p230r2.C3114S;
import p230r2.C3116U;
import p230r2.C3124b;
import p230r2.C3128d;
import p230r2.C3132h;
import p230r2.C3136l;
import p230r2.C3139o;
import p230r2.C3140p;
import p230r2.C3141q;
import p230r2.C3147w;
import p247u2.AbstractC3336f;
import p252v2.C3352a;
import p258w2.C3391b;

/* JADX INFO: renamed from: o2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2785n {

    /* JADX INFO: renamed from: h */
    public static final C2780i f8791h = C2780i.f8783d;

    /* JADX INFO: renamed from: i */
    public static final C2772a f8792i = EnumC2779h.f8781d;

    /* JADX INFO: renamed from: j */
    public static final C2793v f8793j = EnumC2797z.f8820d;

    /* JADX INFO: renamed from: k */
    public static final C2794w f8794k = EnumC2797z.f8821e;

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f8795a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f8796b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final C2029h f8797c;

    /* JADX INFO: renamed from: d */
    public final C3136l f8798d;

    /* JADX INFO: renamed from: e */
    public final List f8799e;

    /* JADX INFO: renamed from: f */
    public final boolean f8800f;

    /* JADX INFO: renamed from: g */
    public final C2780i f8801g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2785n(C2913d c2913d, EnumC2779h enumC2779h, Map map, boolean z5, C2780i c2780i, boolean z6, int i5, List list, EnumC2797z enumC2797z, EnumC2797z enumC2797z2, List list2) {
        C2029h c2029h = new C2029h(map, z6, list2);
        this.f8797c = c2029h;
        this.f8800f = z5;
        this.f8801g = c2780i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC3127c0.f9834A);
        arrayList.add(enumC2797z == EnumC2797z.f8820d ? C3141q.f9885c : new C3139o(1, enumC2797z));
        arrayList.add(c2913d);
        arrayList.addAll(list);
        arrayList.add(AbstractC3127c0.f9851p);
        arrayList.add(AbstractC3127c0.f9842g);
        arrayList.add(AbstractC3127c0.f9839d);
        arrayList.add(AbstractC3127c0.f9840e);
        arrayList.add(AbstractC3127c0.f9841f);
        AbstractC2770B c2782k = i5 == 1 ? AbstractC3127c0.f9846k : new C2782k();
        arrayList.add(new C3116U(Long.TYPE, Long.class, c2782k));
        arrayList.add(new C3116U(Double.TYPE, Double.class, new C2781j(0)));
        arrayList.add(new C3116U(Float.TYPE, Float.class, new C2781j(1)));
        arrayList.add(enumC2797z2 == EnumC2797z.f8821e ? C3140p.f9883b : new C3139o(0, new C3140p(enumC2797z2)));
        arrayList.add(AbstractC3127c0.f9843h);
        arrayList.add(AbstractC3127c0.f9844i);
        arrayList.add(new C3114S(AtomicLong.class, new C2783l(c2782k, 0).m4966a(), 0));
        int i6 = 0;
        arrayList.add(new C3114S(AtomicLongArray.class, new C2783l(c2782k, 1).m4966a(), i6));
        arrayList.add(AbstractC3127c0.f9845j);
        arrayList.add(AbstractC3127c0.f9847l);
        arrayList.add(AbstractC3127c0.f9852q);
        arrayList.add(AbstractC3127c0.f9853r);
        arrayList.add(new C3114S(BigDecimal.class, AbstractC3127c0.f9848m, i6));
        arrayList.add(new C3114S(BigInteger.class, AbstractC3127c0.f9849n, i6));
        arrayList.add(new C3114S(C2919j.class, AbstractC3127c0.f9850o, i6));
        arrayList.add(AbstractC3127c0.f9854s);
        arrayList.add(AbstractC3127c0.f9855t);
        arrayList.add(AbstractC3127c0.f9857v);
        arrayList.add(AbstractC3127c0.f9858w);
        arrayList.add(AbstractC3127c0.f9860y);
        arrayList.add(AbstractC3127c0.f9856u);
        arrayList.add(AbstractC3127c0.f9837b);
        arrayList.add(C3132h.f9866c);
        arrayList.add(AbstractC3127c0.f9859x);
        if (AbstractC3336f.f10376a) {
            arrayList.add(AbstractC3336f.f10380e);
            arrayList.add(AbstractC3336f.f10379d);
            arrayList.add(AbstractC3336f.f10381f);
        }
        arrayList.add(C3124b.f9828c);
        arrayList.add(AbstractC3127c0.f9836a);
        arrayList.add(new C3128d(c2029h, 0));
        arrayList.add(new C3128d(c2029h, 1));
        C3136l c3136l = new C3136l(c2029h);
        this.f8798d = c3136l;
        arrayList.add(c3136l);
        arrayList.add(AbstractC3127c0.f9835B);
        arrayList.add(new C3147w(c2029h, enumC2779h, c2913d, c3136l, list2));
        this.f8799e = Collections.unmodifiableList(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m4972a(double d5) {
        if (Double.isNaN(d5) || Double.isInfinite(d5)) {
            throw new IllegalArgumentException(d5 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final AbstractC2770B m4973b(C3352a c3352a) {
        boolean z5;
        ConcurrentHashMap concurrentHashMap = this.f8796b;
        AbstractC2770B abstractC2770B = (AbstractC2770B) concurrentHashMap.get(c3352a);
        if (abstractC2770B != null) {
            return abstractC2770B;
        }
        ThreadLocal threadLocal = this.f8795a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z5 = true;
        } else {
            AbstractC2770B abstractC2770B2 = (AbstractC2770B) map.get(c3352a);
            if (abstractC2770B2 != null) {
                return abstractC2770B2;
            }
            z5 = false;
        }
        try {
            C2784m c2784m = new C2784m();
            map.put(c3352a, c2784m);
            Iterator it = this.f8799e.iterator();
            AbstractC2770B abstractC2770BMo4967a = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC2770BMo4967a = ((InterfaceC2771C) it.next()).mo4967a(this, c3352a);
                if (abstractC2770BMo4967a != null) {
                    if (c2784m.f8790a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c2784m.f8790a = abstractC2770BMo4967a;
                    map.put(c3352a, abstractC2770BMo4967a);
                }
            }
            if (z5) {
                threadLocal.remove();
            }
            if (abstractC2770BMo4967a != null) {
                if (z5) {
                    concurrentHashMap.putAll(map);
                }
                return abstractC2770BMo4967a;
            }
            throw new IllegalArgumentException("GSON (2.13.1) cannot handle " + c3352a);
        } catch (Throwable th) {
            if (z5) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C3391b m4974c(Writer writer) {
        C3391b c3391b = new C3391b(writer);
        c3391b.m5668t(this.f8801g);
        c3391b.f10610l = this.f8800f;
        c3391b.m5669w(2);
        c3391b.f10612n = false;
        return c3391b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4975d(C0849j c0849j, Class cls, C3391b c3391b) {
        AbstractC2770B abstractC2770BM4973b = m4973b(new C3352a(cls));
        int i5 = c3391b.f10609k;
        if (i5 == 2) {
            c3391b.f10609k = 1;
        }
        boolean z5 = c3391b.f10610l;
        boolean z6 = c3391b.f10612n;
        c3391b.f10610l = this.f8800f;
        c3391b.f10612n = false;
        try {
            try {
                abstractC2770BM4973b.mo4965c(c3391b, c0849j);
            } catch (IOException e5) {
                throw new C2789r(e5);
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e6.getMessage(), e6);
            }
        } finally {
            c3391b.m5669w(i5);
            c3391b.f10610l = z5;
            c3391b.f10612n = z6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f8799e + ",instanceCreators:" + this.f8797c + "}";
    }
}
