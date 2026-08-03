package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.exception.C1869a;
import io.sentry.hints.InterfaceC1883a;
import io.sentry.hints.InterfaceC1886d;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1948E;
import io.sentry.protocol.C1954d;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1969s;
import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.sentry.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1575E0 implements InterfaceC1566C, Closeable {

    /* JADX INFO: renamed from: a */
    public final C2046v2 f5684a;

    /* JADX INFO: renamed from: b */
    public final C1901c f5685b;

    /* JADX INFO: renamed from: c */
    public final C1563B0 f5686c;

    /* JADX INFO: renamed from: d */
    public volatile C1598K f5687d = null;

    public C1575E0(C2046v2 c2046v2) {
        this.f5684a = c2046v2;
        C2002t c2002t = new C2002t(c2046v2, 2);
        this.f5686c = new C1563B0(c2002t);
        this.f5685b = new C1901c(c2002t, c2046v2, 7, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5687d != null) {
            this.f5687d.f5771f.shutdown();
        }
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: d */
    public final C2059x2 mo3604d(C2059x2 c2059x2, C1586H c1586h) {
        if (c2059x2.f5611h == null) {
            c2059x2.f5611h = "java";
        }
        if (m3641m(c2059x2, c1586h)) {
            m3640l(c2059x2);
            C1968r c1968r = this.f5684a.getSessionReplay().f7315k;
            if (c1968r != null) {
                c2059x2.f5606c = c1968r;
            }
        }
        return c2059x2;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: f */
    public final C1944A mo3584f(C1944A c1944a, C1586H c1586h) {
        if (c1944a.f5611h == null) {
            c1944a.f5611h = "java";
        }
        C1954d c1954dM4153a = C1954d.m4153a(c1944a.f5617n, this.f5684a);
        if (c1954dM4153a != null) {
            c1944a.f5617n = c1954dM4153a;
        }
        if (m3641m(c1944a, c1586h)) {
            m3640l(c1944a);
        }
        return c1944a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: i */
    public final C1627R1 mo3585i(C1627R1 c1627r1, C1586H c1586h) {
        ArrayList arrayList;
        if (c1627r1.f5611h == null) {
            c1627r1.f5611h = "java";
        }
        C1869a c1869a = c1627r1.f5613j;
        if (c1869a != null) {
            C1563B0 c1563b0 = this.f5686c;
            c1563b0.getClass();
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            HashSet hashSet = new HashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            c1563b0.m3599j(c1869a, atomicInteger, hashSet, arrayDeque, null);
            c1627r1.f5849t = new C2065z0(new ArrayList(arrayDeque));
        }
        C1954d c1954d = c1627r1.f5617n;
        C2046v2 c2046v2 = this.f5684a;
        C1954d c1954dM4153a = C1954d.m4153a(c1954d, c2046v2);
        if (c1954dM4153a != null) {
            c1627r1.f5617n = c1954dM4153a;
        }
        Map mapMo4116a = c2046v2.getModulesLoader().mo4116a();
        if (mapMo4116a != null) {
            AbstractMap abstractMap = c1627r1.f5854y;
            if (abstractMap == null) {
                c1627r1.f5854y = new HashMap(mapMo4116a);
            } else {
                abstractMap.putAll(mapMo4116a);
            }
        }
        if (m3641m(c1627r1, c1586h)) {
            m3640l(c1627r1);
            C2065z0 c2065z0 = c1627r1.f5848s;
            if ((c2065z0 != null ? c2065z0.f7297a : null) == null) {
                C2065z0 c2065z02 = c1627r1.f5849t;
                ArrayList<C1969s> arrayList2 = c2065z02 == null ? null : c2065z02.f7297a;
                if (arrayList2 == null || arrayList2.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (C1969s c1969s : arrayList2) {
                        if (c1969s.f7009f != null && c1969s.f7007d != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(c1969s.f7007d);
                        }
                    }
                }
                boolean zIsAttachThreads = c2046v2.isAttachThreads();
                C1901c c1901c = this.f5685b;
                if (zIsAttachThreads || InterfaceC1883a.class.isInstance(AbstractC1856a.m4072s(c1586h))) {
                    Object objM4072s = AbstractC1856a.m4072s(c1586h);
                    boolean zMo3924c = objM4072s instanceof InterfaceC1883a ? ((InterfaceC1883a) objM4072s).mo3924c() : false;
                    c1901c.getClass();
                    c1627r1.f5848s = new C2065z0(c1901c.m4104m(Thread.getAllStackTraces(), arrayList, zMo3924c));
                } else if (c2046v2.isAttachStacktrace() && ((arrayList2 == null || arrayList2.isEmpty()) && !InterfaceC1886d.class.isInstance(AbstractC1856a.m4072s(c1586h)))) {
                    c1901c.getClass();
                    HashMap map = new HashMap();
                    Thread threadCurrentThread = Thread.currentThread();
                    map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
                    c1627r1.f5848s = new C2065z0(c1901c.m4104m(map, null, false));
                    return c1627r1;
                }
            }
        }
        return c1627r1;
    }

    /* JADX INFO: renamed from: l */
    public final void m3640l(AbstractC1568C1 abstractC1568C1) {
        if (abstractC1568C1.f5609f == null) {
            abstractC1568C1.f5609f = this.f5684a.getRelease();
        }
        if (abstractC1568C1.f5610g == null) {
            abstractC1568C1.f5610g = this.f5684a.getEnvironment();
        }
        if (abstractC1568C1.f5614k == null) {
            abstractC1568C1.f5614k = this.f5684a.getServerName();
        }
        if (this.f5684a.isAttachServerName() && abstractC1568C1.f5614k == null) {
            if (this.f5687d == null) {
                if (C1598K.f5764i == null) {
                    C1981r c1981rM4173a = C1598K.f5765j.m4173a();
                    try {
                        if (C1598K.f5764i == null) {
                            C1598K.f5764i = new C1598K();
                        }
                        c1981rM4173a.close();
                    } catch (Throwable th) {
                        try {
                            c1981rM4173a.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                this.f5687d = C1598K.f5764i;
            }
            if (this.f5687d != null) {
                C1598K c1598k = this.f5687d;
                if (c1598k.f5768c < System.currentTimeMillis() && c1598k.f5769d.compareAndSet(false, true)) {
                    c1598k.m3689a();
                }
                abstractC1568C1.f5614k = c1598k.f5767b;
            }
        }
        if (abstractC1568C1.f5615l == null) {
            abstractC1568C1.f5615l = this.f5684a.getDist();
        }
        if (abstractC1568C1.f5606c == null) {
            abstractC1568C1.f5606c = this.f5684a.getSdkVersion();
        }
        C2046v2 c2046v2 = this.f5684a;
        if (abstractC1568C1.f5608e == null) {
            abstractC1568C1.f5608e = new HashMap(new HashMap(c2046v2.getTags()));
        } else {
            for (Map.Entry<String, String> entry : c2046v2.getTags().entrySet()) {
                if (!abstractC1568C1.f5608e.containsKey(entry.getKey())) {
                    abstractC1568C1.m3606b(entry.getKey(), entry.getValue());
                }
            }
        }
        C1948E c1948e = abstractC1568C1.f5612i;
        if (c1948e == null) {
            c1948e = new C1948E();
            abstractC1568C1.f5612i = c1948e;
        }
        if (c1948e.f6852d == null && this.f5684a.isSendDefaultPii()) {
            c1948e.f6852d = "{{auto}}";
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3641m(AbstractC1568C1 abstractC1568C1, C1586H c1586h) {
        if (AbstractC1856a.m4050F(c1586h)) {
            return true;
        }
        this.f5684a.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC1568C1.f5604a);
        return false;
    }
}
