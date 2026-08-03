package io.sentry;

import io.sentry.clientreport.C1850a;
import io.sentry.clientreport.C1851b;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.profilemeasurements.C1942a;
import io.sentry.profilemeasurements.C1943b;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1947D;
import io.sentry.protocol.C1948E;
import io.sentry.protocol.C1949F;
import io.sentry.protocol.C1950G;
import io.sentry.protocol.C1951a;
import io.sentry.protocol.C1952b;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1954d;
import io.sentry.protocol.C1956f;
import io.sentry.protocol.C1957g;
import io.sentry.protocol.C1958h;
import io.sentry.protocol.C1959i;
import io.sentry.protocol.C1960j;
import io.sentry.protocol.C1961k;
import io.sentry.protocol.C1962l;
import io.sentry.protocol.C1963m;
import io.sentry.protocol.C1964n;
import io.sentry.protocol.C1967q;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1969s;
import io.sentry.protocol.C1971u;
import io.sentry.protocol.C1972v;
import io.sentry.protocol.C1973w;
import io.sentry.protocol.C1974x;
import io.sentry.protocol.C1975y;
import io.sentry.protocol.C1976z;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.EnumC1955e;
import io.sentry.rrweb.C1985a;
import io.sentry.rrweb.C1991g;
import io.sentry.rrweb.C1993i;
import io.sentry.rrweb.C1994j;
import io.sentry.rrweb.C1996l;
import io.sentry.rrweb.C1997m;
import io.sentry.rrweb.EnumC1987c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1571D0 implements InterfaceC1866e0 {

    /* JADX INFO: renamed from: c */
    public static final Charset f5622c = null;

    /* JADX INFO: renamed from: a */
    public final C2046v2 f5623a;

    /* JADX INFO: renamed from: b */
    public final HashMap f5624b;

    static {
        f5622c = Charset.forName("UTF-8");
    }

    public C1571D0(C2046v2 r3) {
        this.f5623a = r3;
        HashMap r32 = new HashMap();
        this.f5624b = r32;
        r32.put(C1951a.class, new C1850a(4));
        r32.put(C1871f.class, new C1865e(0));
        r32.put(C1952b.class, new C1850a(5));
        r32.put(C1953c.class, new C1850a(6));
        r32.put(DebugImage.class, new C1850a(7));
        r32.put(C1954d.class, new C1850a(8));
        r32.put(C1956f.class, new C1850a(9));
        r32.put(EnumC1955e.class, new C1850a(10));
        r32.put(C1957g.class, new C1850a(11));
        r32.put(C1959i.class, new C1850a(13));
        r32.put(C1960j.class, new C1850a(14));
        r32.put(C1961k.class, new C1850a(15));
        r32.put(C1962l.class, new C1850a(16));
        r32.put(C1963m.class, new C1850a(17));
        r32.put(C1867e1.class, new C1865e(1));
        r32.put(C1873f1.class, new C1865e(2));
        r32.put(C1881h1.class, new C1865e(3));
        r32.put(C1896i1.class, new C1865e(4));
        r32.put(C1942a.class, new C1850a(2));
        r32.put(C1943b.class, new C1850a(3));
        r32.put(C1964n.class, new C1850a(18));
        r32.put(C1927m1.class, new C1865e(5));
        r32.put(C1985a.class, new C1947D(3));
        r32.put(EnumC1987c.class, new C1947D(4));
        r32.put(C1991g.class, new C1947D(6));
        r32.put(C1993i.class, new C1947D(8));
        r32.put(C1994j.class, new C1947D(10));
        r32.put(C1996l.class, new C1947D(11));
        r32.put(C1997m.class, new C1947D(12));
        r32.put(C1967q.class, new C1850a(19));
        r32.put(C1968r.class, new C1850a(20));
        r32.put(C1596J1.class, new C1865e(7));
        r32.put(C1624Q1.class, new C1865e(8));
        r32.put(C1627R1.class, new C1865e(9));
        r32.put(C1969s.class, new C1850a(21));
        r32.put(EnumC1653Z1.class, new C1865e(10));
        r32.put(EnumC1657a2.class, new C1865e(11));
        r32.put(C1828b2.class, new C1865e(12));
        r32.put(C1864d2.class, new C1865e(15));
        r32.put(C1971u.class, new C1850a(23));
        r32.put(C1972v.class, new C1850a(24));
        r32.put(C2059x2.class, new C1865e(17));
        r32.put(C1973w.class, new C1850a(25));
        r32.put(C1974x.class, new C1850a(26));
        r32.put(C1975y.class, new C1850a(27));
        r32.put(C1560A1.class, new C1865e(6));
        r32.put(C1976z.class, new C1850a(28));
        r32.put(C1944A.class, new C1850a(29));
        r32.put(C1581F2.class, new C1865e(19));
        r32.put(C1589H2.class, new C1865e(20));
        r32.put(C1601K2.class, new C1865e(21));
        r32.put(EnumC1605L2.class, new C1865e(22));
        r32.put(C1948E.class, new C1947D(0));
        r32.put(C1958h.class, new C1850a(12));
        r32.put(C1632S2.class, new C1865e(24));
        r32.put(C1851b.class, new C1850a(0));
        r32.put(C1950G.class, new C1947D(2));
        r32.put(C1949F.class, new C1947D(1));
    }

    @Override // io.sentry.InterfaceC1866e0
    /* JADX INFO: renamed from: a */
    public final Object mo3607a(Reader r5, Class r6) {
        C2046v2 r0 = this.f5623a;
        C1559A0 r2 = new C1559A0(r5);     // Catch: Exception -> L9
        InterfaceC1978q0 r52 = (InterfaceC1978q0) this.f5624b.get(r6);     // Catch: Throwable -> L11
        if (r52 == null) goto L14;
        Object r53 = r6.cast(r52.mo4039a(r2, r0.getLogger()));     // Catch: Throwable -> L11
    L7:
        r2.close();     // Catch: Exception -> L9
        return r53;
    L14:
        if (r6.isArray() == false) goto L16;
    L24:
        r53 = r2.m3582z();     // Catch: Throwable -> L11
        goto L7
    L16:
        if (Collection.class.isAssignableFrom(r6) == true) goto L24;
        if (String.class.isAssignableFrom(r6) == true) goto L24;
        if (Map.class.isAssignableFrom(r6) == true) goto L24;
        r2.close();     // Catch: Exception -> L9
        return null;
    L11:
        th = move-exception;
        r2.close();     // Catch: Throwable -> L28
    L30:
        throw th;     // Catch: Exception -> L9
    L28:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Exception -> L9
    L9:
        e = move-exception;
        r0.getLogger().mo3683r(EnumC1657a2.ERROR, "Error when deserializing", e);
        return null;
    }

    @Override // io.sentry.InterfaceC1866e0
    /* JADX INFO: renamed from: b */
    public final String mo3608b(ConcurrentHashMap r2) {
        return m3612f(r2, false);
    }

    @Override // io.sentry.InterfaceC1866e0
    /* JADX INFO: renamed from: c */
    public final C1901c mo3609c(BufferedInputStream r4) {
        C2046v2 r0 = this.f5623a;
        return r0.getEnvelopeReader().mo3556a(r4);
    L5:
        e = move-exception;
        r0.getLogger().mo3683r(EnumC1657a2.ERROR, "Error deserializing envelope.", e);
        return null;
    }

    @Override // io.sentry.InterfaceC1866e0
    /* JADX INFO: renamed from: d */
    public final void mo3610d(Object r6, BufferedWriter r7) {
        AbstractC1856a.m4048D("The entity is required.", r6);
        C2046v2 r0 = this.f5623a;
        ILogger r1 = r0.getLogger();
        EnumC1657a2 r2 = EnumC1657a2.DEBUG;
        if (r1.mo3681i(r2) == false) goto L5;
        String r12 = m3612f(r6, r0.isEnablePrettySerializationOutput());
        r0.getLogger().mo3680e(r2, "Serializing object: %s", new Object[]{r12});
    L5:
        C1901c r13 = new C1901c(r7, r0.getMaxDepth());
        ILogger r02 = r0.getLogger();
        ((C1563B0) r13.f6782c).m3600l(r13, r02, r6);
        r7.flush();
    }

    @Override // io.sentry.InterfaceC1866e0
    /* JADX INFO: renamed from: e */
    public final void mo3611e(C1901c r8, OutputStream r9) {
        C2046v2 r1 = this.f5623a;
        AbstractC1856a.m4048D("The SentryEnvelope object is required.", r8);
        BufferedWriter r3 = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(r9), f5622c));
        ((C1596J1) r8.f6781b).serialize(new C1901c(r3, r1.getMaxDepth()), r1.getLogger());     // Catch: Throwable -> L9
        r3.write("\n");     // Catch: Throwable -> L9
        Iterator r82 = ((Iterable) r8.f6782c).iterator();     // Catch: Throwable -> L9
    L4:
        if (r82.hasNext() == false) goto L14;
        C1620P1 r2 = (C1620P1) r82.next();     // Catch: Throwable -> L9
        byte[] r4 = r2.m3733f();     // Catch: Throwable -> L9 Exception -> L11
        r2.f5822a.serialize(new C1901c(r3, r1.getMaxDepth()), r1.getLogger());     // Catch: Throwable -> L9 Exception -> L11
        r3.write("\n");     // Catch: Throwable -> L9 Exception -> L11
        r3.flush();     // Catch: Throwable -> L9 Exception -> L11
        r9.write(r4);     // Catch: Throwable -> L9 Exception -> L11
        r3.write("\n");     // Catch: Throwable -> L9 Exception -> L11
    L11:
        e = move-exception;
        r1.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to create envelope item. Dropping it.", e);     // Catch: Throwable -> L9
        goto L4
    L14:
        r3.flush();
        return;
    L9:
        th = move-exception;
        r3.flush();
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final String m3612f(Object r5, boolean r6) {
        StringWriter r0 = new StringWriter();
        C2046v2 r2 = this.f5623a;
        C1901c r1 = new C1901c(r0, r2.getMaxDepth());
        if (r6 == false) goto L5;
        r1.m4109t("\t");
    L5:
        ILogger r62 = r2.getLogger();
        ((C1563B0) r1.f6782c).m3600l(r1, r62, r5);
        return r0.toString();
    }
}
