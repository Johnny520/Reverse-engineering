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
import java.util.Iterator;
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
    public volatile C1598K f5687d;

    public C1575E0(C2046v2 r5) {
        this.f5687d = null;
        this.f5684a = r5;
        C2002t r0 = new C2002t(r5, 2);
        this.f5686c = new C1563B0(r0);
        this.f5685b = new C1901c(r0, r5, 7, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5687d == null) goto L6;
        this.f5687d.f5771f.shutdown();
        return;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: d */
    public final C2059x2 mo3604d(C2059x2 r2, C1586H r3) {
        if (r2.f5611h != null) goto L6;
        r2.f5611h = "java";
    L6:
        if (m3641m(r2, r3) == false) goto L10;
        m3640l(r2);
        C1968r r32 = this.f5684a.getSessionReplay().f7315k;
        if (r32 == null) goto L10;
        r2.f5606c = r32;
    L10:
        return r2;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: f */
    public final C1944A mo3584f(C1944A r3, C1586H r4) {
        if (r3.f5611h != null) goto L5;
        r3.f5611h = "java";
    L5:
        C1954d r0 = C1954d.m4153a(r3.f5617n, this.f5684a);
        if (r0 == null) goto L9;
        r3.f5617n = r0;
    L9:
        if (m3641m(r3, r4) == false) goto L11;
        m3640l(r3);
    L11:
        return r3;
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
    public final C1627R1 mo3585i(C1627R1 r9, C1586H r10) {
        if (r9.f5611h != null) goto L5;
        r9.f5611h = "java";
    L5:
        C1869a r2 = r9.f5613j;
        if (r2 == null) goto L8;
        C1563B0 r1 = this.f5686c;
        r1.getClass();
        AtomicInteger r3 = new AtomicInteger(-1);
        HashSet r4 = new HashSet();
        ArrayDeque r5 = new ArrayDeque();
        r1.m3599j(r2, r3, r4, r5, null);
        r9.f5849t = new C2065z0(new ArrayList(r5));
    L8:
        C1954d r0 = r9.f5617n;
        C2046v2 r12 = this.f5684a;
        C1954d r02 = C1954d.m4153a(r0, r12);
        if (r02 == null) goto L11;
        r9.f5617n = r02;
    L11:
        Map r03 = r12.getModulesLoader().mo4116a();
        if (r03 == null) goto L19;
        AbstractMap r22 = r9.f5854y;
        if (r22 != null) goto L17;
        r9.f5854y = new HashMap(r03);
        goto L19
    L17:
        r22.putAll(r03);
    L19:
        if (m3641m(r9, r10) == false) goto L61;
        m3640l(r9);
        C2065z0 r04 = r9.f5848s;
        if (r04 == null) goto L23;
        ArrayList r05 = r04.f7297a;
    L24:
        if (r05 != null) goto L61;
        C2065z0 r06 = r9.f5849t;
        if (r06 != null) goto L28;
        ArrayList r07 = null;
    L29:
        if (r07 != null) goto L31;
    L42:
        ArrayList r42 = null;
    L43:
        boolean r32 = r12.isAttachThreads();
        boolean r52 = false;
        C1901c r6 = this.f5685b;
        if (r32 == false) goto L46;
    L57:
        Object r102 = AbstractC1856a.m4072s(r10);
        if ((r102 instanceof InterfaceC1883a) == false) goto L60;
        r52 = ((InterfaceC1883a) r102).mo3924c();
    L60:
        r6.getClass();
        r9.f5848s = new C2065z0(r6.m4104m(Thread.getAllStackTraces(), r42, r52));
        goto L61
    L46:
        if (InterfaceC1883a.class.isInstance(AbstractC1856a.m4072s(r10)) == true) goto L57;
        if (r12.isAttachStacktrace() == false) goto L61;
        if (r07 == null) goto L54;
        if (r07.isEmpty() == false) goto L61;
    L54:
        if (InterfaceC1886d.class.isInstance(AbstractC1856a.m4072s(r10)) == true) goto L61;
        r6.getClass();
        HashMap r103 = new HashMap();
        Thread r08 = Thread.currentThread();
        r103.put(r08, r08.getStackTrace());
        r9.f5848s = new C2065z0(r6.m4104m(r103, null, false));
        return r9;
    L31:
        if (r07.isEmpty() == true) goto L42;
        Iterator r33 = r07.iterator();
        r42 = null;
    L34:
        if (r33.hasNext() == false) goto L43;
        C1969s r53 = (C1969s) r33.next();
        if (r53.f7009f == null) goto L34;
        if (r53.f7007d == null) goto L34;
        if (r42 != null) goto L41;
        r42 = new ArrayList();
    L41:
        r42.add(r53.f7007d);
        goto L34
    L28:
        r07 = r06.f7297a;
        goto L29
    L23:
        r05 = null;
    L61:
        return r9;
    }

    /* JADX INFO: renamed from: l */
    public final void m3640l(AbstractC1568C1 r6) {
        if (r6.f5609f != null) goto L6;
        r6.f5609f = this.f5684a.getRelease();
    L6:
        if (r6.f5610g != null) goto L9;
        r6.f5610g = this.f5684a.getEnvironment();
    L9:
        if (r6.f5614k != null) goto L12;
        r6.f5614k = this.f5684a.getServerName();
    L12:
        if (this.f5684a.isAttachServerName() == false) goto L42;
        if (r6.f5614k != null) goto L42;
        if (this.f5687d != null) goto L34;
        if (C1598K.f5764i != null) goto L32;
        C1981r r0 = C1598K.f5765j.m4173a();
    L24:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L29
    L31:
        throw th;
    L29:
        th = move-exception;
        th.addSuppressed(th);
        goto L31
    L21:
        if (C1598K.f5764i != null) goto L26;
        C1598K.f5764i = new C1598K();     // Catch: Throwable -> L24
    L26:
        r0.close();
    L32:
        this.f5687d = C1598K.f5764i;
    L34:
        if (this.f5687d == null) goto L42;
        C1598K r02 = this.f5687d;
        if (r02.f5768c < System.currentTimeMillis()) goto L38;
    L40:
        r6.f5614k = r02.f5767b;
        goto L42
    L38:
        if (r02.f5769d.compareAndSet(false, true) == false) goto L40;
        r02.m3689a();
    L42:
        if (r6.f5615l != null) goto L45;
        r6.f5615l = this.f5684a.getDist();
    L45:
        if (r6.f5606c != null) goto L47;
        r6.f5606c = this.f5684a.getSdkVersion();
    L47:
        C2046v2 r03 = this.f5684a;
        if (r6.f5608e != null) goto L50;
        r6.f5608e = new HashMap(new HashMap(r03.getTags()));
    L56:
        C1948E r04 = r6.f5612i;
        if (r04 != null) goto L60;
        r04 = new C1948E();
        r6.f5612i = r04;
    L60:
        if (r04.f6852d == null) goto L62;
        return;
    L62:
        if (this.f5684a.isSendDefaultPii() == false) goto L75;
        r04.f6852d = "{{auto}}";
        return;
    L75:
        return;
    L50:
        Iterator<Map.Entry<String, String>> r05 = r03.getTags().entrySet().iterator();
    L52:
        if (r05.hasNext() == false) goto L56;
        Map.Entry<String, String> r1 = r05.next();
        if (r6.f5608e.containsKey(r1.getKey()) == true) goto L52;
        r6.m3606b(r1.getKey(), r1.getValue());
        goto L52
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3641m(AbstractC1568C1 r3, C1586H r4) {
        if (AbstractC1856a.m4050F(r4) == false) goto L6;
        return true;
    L6:
        this.f5684a.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", new Object[]{r3.f5604a});
        return false;
    }
}
