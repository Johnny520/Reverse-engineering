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
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1571D0 implements InterfaceC1866e0 {

    /* JADX INFO: renamed from: c */
    public static final Charset f5622c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final C2046v2 f5623a;

    /* JADX INFO: renamed from: b */
    public final HashMap f5624b;

    public C1571D0(C2046v2 c2046v2) {
        this.f5623a = c2046v2;
        HashMap map = new HashMap();
        this.f5624b = map;
        map.put(C1951a.class, new C1850a(4));
        map.put(C1871f.class, new C1865e(0));
        map.put(C1952b.class, new C1850a(5));
        map.put(C1953c.class, new C1850a(6));
        map.put(DebugImage.class, new C1850a(7));
        map.put(C1954d.class, new C1850a(8));
        map.put(C1956f.class, new C1850a(9));
        map.put(EnumC1955e.class, new C1850a(10));
        map.put(C1957g.class, new C1850a(11));
        map.put(C1959i.class, new C1850a(13));
        map.put(C1960j.class, new C1850a(14));
        map.put(C1961k.class, new C1850a(15));
        map.put(C1962l.class, new C1850a(16));
        map.put(C1963m.class, new C1850a(17));
        map.put(C1867e1.class, new C1865e(1));
        map.put(C1873f1.class, new C1865e(2));
        map.put(C1881h1.class, new C1865e(3));
        map.put(C1896i1.class, new C1865e(4));
        map.put(C1942a.class, new C1850a(2));
        map.put(C1943b.class, new C1850a(3));
        map.put(C1964n.class, new C1850a(18));
        map.put(C1927m1.class, new C1865e(5));
        map.put(C1985a.class, new C1947D(3));
        map.put(EnumC1987c.class, new C1947D(4));
        map.put(C1991g.class, new C1947D(6));
        map.put(C1993i.class, new C1947D(8));
        map.put(C1994j.class, new C1947D(10));
        map.put(C1996l.class, new C1947D(11));
        map.put(C1997m.class, new C1947D(12));
        map.put(C1967q.class, new C1850a(19));
        map.put(C1968r.class, new C1850a(20));
        map.put(C1596J1.class, new C1865e(7));
        map.put(C1624Q1.class, new C1865e(8));
        map.put(C1627R1.class, new C1865e(9));
        map.put(C1969s.class, new C1850a(21));
        map.put(EnumC1653Z1.class, new C1865e(10));
        map.put(EnumC1657a2.class, new C1865e(11));
        map.put(C1828b2.class, new C1865e(12));
        map.put(C1864d2.class, new C1865e(15));
        map.put(C1971u.class, new C1850a(23));
        map.put(C1972v.class, new C1850a(24));
        map.put(C2059x2.class, new C1865e(17));
        map.put(C1973w.class, new C1850a(25));
        map.put(C1974x.class, new C1850a(26));
        map.put(C1975y.class, new C1850a(27));
        map.put(C1560A1.class, new C1865e(6));
        map.put(C1976z.class, new C1850a(28));
        map.put(C1944A.class, new C1850a(29));
        map.put(C1581F2.class, new C1865e(19));
        map.put(C1589H2.class, new C1865e(20));
        map.put(C1601K2.class, new C1865e(21));
        map.put(EnumC1605L2.class, new C1865e(22));
        map.put(C1948E.class, new C1947D(0));
        map.put(C1958h.class, new C1850a(12));
        map.put(C1632S2.class, new C1865e(24));
        map.put(C1851b.class, new C1850a(0));
        map.put(C1950G.class, new C1947D(2));
        map.put(C1949F.class, new C1947D(1));
    }

    @Override // io.sentry.InterfaceC1866e0
    /* JADX INFO: renamed from: a */
    public final Object mo3607a(Reader reader, Class cls) {
        Object objM3582z;
        C2046v2 c2046v2 = this.f5623a;
        try {
            C1559A0 c1559a0 = new C1559A0(reader);
            try {
                InterfaceC1978q0 interfaceC1978q0 = (InterfaceC1978q0) this.f5624b.get(cls);
                if (interfaceC1978q0 != null) {
                    objM3582z = cls.cast(interfaceC1978q0.mo4039a(c1559a0, c2046v2.getLogger()));
                } else {
                    if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                        c1559a0.close();
                        return null;
                    }
                    objM3582z = c1559a0.m3582z();
                }
                c1559a0.close();
                return objM3582z;
            } finally {
            }
        } catch (Exception e) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Error when deserializing", e);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC1866e0
    /* JADX INFO: renamed from: b */
    public final String mo3608b(ConcurrentHashMap concurrentHashMap) {
        return m3612f(concurrentHashMap, false);
    }

    @Override // io.sentry.InterfaceC1866e0
    /* JADX INFO: renamed from: c */
    public final C1901c mo3609c(BufferedInputStream bufferedInputStream) {
        C2046v2 c2046v2 = this.f5623a;
        try {
            return c2046v2.getEnvelopeReader().mo3556a(bufferedInputStream);
        } catch (IOException e) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Error deserializing envelope.", e);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC1866e0
    /* JADX INFO: renamed from: d */
    public final void mo3610d(Object obj, BufferedWriter bufferedWriter) throws IOException {
        AbstractC1856a.m4048D("The entity is required.", obj);
        C2046v2 c2046v2 = this.f5623a;
        ILogger logger = c2046v2.getLogger();
        EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
        if (logger.mo3681i(enumC1657a2)) {
            c2046v2.getLogger().mo3680e(enumC1657a2, "Serializing object: %s", m3612f(obj, c2046v2.isEnablePrettySerializationOutput()));
        }
        C1901c c1901c = new C1901c(bufferedWriter, c2046v2.getMaxDepth());
        ((C1563B0) c1901c.f6782c).m3600l(c1901c, c2046v2.getLogger(), obj);
        bufferedWriter.flush();
    }

    @Override // io.sentry.InterfaceC1866e0
    /* JADX INFO: renamed from: e */
    public final void mo3611e(C1901c c1901c, OutputStream outputStream) throws IOException {
        C2046v2 c2046v2 = this.f5623a;
        AbstractC1856a.m4048D("The SentryEnvelope object is required.", c1901c);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f5622c));
        try {
            ((C1596J1) c1901c.f6781b).serialize(new C1901c(bufferedWriter, c2046v2.getMaxDepth()), c2046v2.getLogger());
            bufferedWriter.write("\n");
            for (C1620P1 c1620p1 : (Iterable) c1901c.f6782c) {
                try {
                    byte[] bArrM3733f = c1620p1.m3733f();
                    c1620p1.f5822a.serialize(new C1901c(bufferedWriter, c2046v2.getMaxDepth()), c2046v2.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrM3733f);
                    bufferedWriter.write("\n");
                } catch (Exception e) {
                    c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to create envelope item. Dropping it.", e);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m3612f(Object obj, boolean z) throws IOException {
        StringWriter stringWriter = new StringWriter();
        C2046v2 c2046v2 = this.f5623a;
        C1901c c1901c = new C1901c(stringWriter, c2046v2.getMaxDepth());
        if (z) {
            c1901c.m4109t("\t");
        }
        ((C1563B0) c1901c.f6782c).m3600l(c1901c, c2046v2.getLogger(), obj);
        return stringWriter.toString();
    }
}
