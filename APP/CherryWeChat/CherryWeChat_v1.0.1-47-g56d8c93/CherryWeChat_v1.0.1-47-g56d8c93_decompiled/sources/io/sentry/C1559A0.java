package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.vendor.gson.stream.C2049a;
import io.sentry.vendor.gson.stream.EnumC2050b;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1559A0 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5580a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f5581b;

    public C1559A0(Reader reader) {
        this.f5581b = new C2049a(reader);
    }

    /* JADX INFO: renamed from: H */
    private final void m3557H(boolean z) {
    }

    /* JADX INFO: renamed from: I */
    private final void m3558I() {
    }

    /* JADX INFO: renamed from: A */
    public final Object m3559A(ILogger iLogger, InterfaceC1978q0 interfaceC1978q0) throws IOException {
        switch (this.f5580a) {
            case 0:
                C2049a c2049a = (C2049a) this.f5581b;
                if (c2049a.m4194C() != EnumC2050b.NULL) {
                    return interfaceC1978q0.mo4039a(this, iLogger);
                }
                c2049a.m4215y();
                return null;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f5581b;
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return null;
                }
                Object value = entry.getValue();
                if (iLogger != null) {
                    return interfaceC1978q0.mo4039a(this, iLogger);
                }
                arrayDeque.removeLast();
                return value;
        }
    }

    /* JADX INFO: renamed from: B */
    public final String m3560B() throws IOException {
        switch (this.f5580a) {
            case 0:
                return ((C2049a) this.f5581b).m4192A();
            default:
                String str = (String) m3563E();
                if (str != null) {
                    return str;
                }
                throw new IOException("Expected string");
        }
    }

    /* JADX INFO: renamed from: C */
    public final String m3561C() throws IOException {
        switch (this.f5580a) {
            case 0:
                C2049a c2049a = (C2049a) this.f5581b;
                if (c2049a.m4194C() != EnumC2050b.NULL) {
                    return c2049a.m4192A();
                }
                c2049a.m4215y();
                return null;
            default:
                return (String) m3563E();
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m3562D(ILogger iLogger, AbstractMap abstractMap, String str) {
        switch (this.f5580a) {
            case 0:
                try {
                    abstractMap.put(str, m3582z());
                } catch (Exception e) {
                    iLogger.mo3682n(EnumC1657a2.ERROR, e, "Error deserializing unknown key: %s", str);
                    return;
                }
                break;
            default:
                try {
                    abstractMap.put(str, m3563E());
                } catch (Exception e2) {
                    iLogger.mo3682n(EnumC1657a2.ERROR, e2, "Error deserializing unknown key: %s", str);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: E */
    public Object m3563E() throws IOException {
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.f5581b;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: F */
    public final EnumC2050b m3564F() {
        Map.Entry entry;
        switch (this.f5580a) {
            case 0:
                return ((C2049a) this.f5581b).m4194C();
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f5581b;
                if (!arrayDeque.isEmpty() && (entry = (Map.Entry) arrayDeque.peekLast()) != null) {
                    if (entry.getKey() != null) {
                        return EnumC2050b.NAME;
                    }
                    Object value = entry.getValue();
                    return value instanceof Map ? EnumC2050b.BEGIN_OBJECT : value instanceof List ? EnumC2050b.BEGIN_ARRAY : value instanceof String ? EnumC2050b.STRING : value instanceof Number ? EnumC2050b.NUMBER : value instanceof Boolean ? EnumC2050b.BOOLEAN : value instanceof EnumC2050b ? (EnumC2050b) value : EnumC2050b.END_DOCUMENT;
                }
                return EnumC2050b.END_DOCUMENT;
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m3565G(boolean z) {
        switch (this.f5580a) {
            case 0:
                ((C2049a) this.f5581b).f7248b = z;
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f5580a) {
            case 0:
                ((C2049a) this.f5581b).close();
                break;
            default:
                ((ArrayDeque) this.f5581b).clear();
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3566d() throws IOException {
        ArrayDeque arrayDeque = (ArrayDeque) this.f5581b;
        Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, EnumC2050b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3567f() throws IOException {
        switch (this.f5580a) {
            case 0:
                ((C2049a) this.f5581b).m4201f();
                return;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f5581b;
                Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
                if (entry == null) {
                    throw new IOException("No more entries");
                }
                Object value = entry.getValue();
                if (!(value instanceof Map)) {
                    throw new IOException("Current token is not an object");
                }
                arrayDeque.addLast(new AbstractMap.SimpleEntry(null, EnumC2050b.END_OBJECT));
                Iterator it = ((Map) value).entrySet().iterator();
                while (it.hasNext()) {
                    arrayDeque.addLast((Map.Entry) it.next());
                }
                return;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3568i() throws IOException {
        switch (this.f5580a) {
            case 0:
                ((C2049a) this.f5581b).m4205o();
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f5581b;
                if (arrayDeque.size() > 1) {
                    arrayDeque.removeLast();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: l */
    public final Boolean m3569l() throws IOException {
        switch (this.f5580a) {
            case 0:
                C2049a c2049a = (C2049a) this.f5581b;
                if (c2049a.m4194C() != EnumC2050b.NULL) {
                    return Boolean.valueOf(c2049a.m4209s());
                }
                c2049a.m4215y();
                return null;
            default:
                return (Boolean) m3563E();
        }
    }

    /* JADX INFO: renamed from: m */
    public final Date m3570m(ILogger iLogger) throws IOException {
        switch (this.f5580a) {
            case 0:
                C2049a c2049a = (C2049a) this.f5581b;
                if (c2049a.m4194C() == EnumC2050b.NULL) {
                    c2049a.m4215y();
                    break;
                } else {
                    String strM4192A = c2049a.m4192A();
                    if (strM4192A != null) {
                        try {
                            try {
                            } catch (Exception unused) {
                                return AbstractC1856a.m4070p(strM4192A);
                            }
                        } catch (Exception e) {
                            iLogger.mo3683r(EnumC1657a2.ERROR, "Error when deserializing millis timestamp format.", e);
                            return null;
                        }
                        break;
                    }
                }
                break;
            default:
                String str = (String) m3563E();
                if (str != null) {
                    try {
                        try {
                        } catch (Exception e2) {
                            iLogger.mo3683r(EnumC1657a2.ERROR, "Error when deserializing millis timestamp format.", e2);
                            return null;
                        }
                    } catch (Exception unused2) {
                        return AbstractC1856a.m4070p(str);
                    }
                    break;
                }
                break;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final double m3571o() throws IOException {
        switch (this.f5580a) {
            case 0:
                return ((C2049a) this.f5581b).m4210t();
            default:
                Object objM3563E = m3563E();
                if (objM3563E instanceof Number) {
                    return ((Number) objM3563E).doubleValue();
                }
                throw new IOException("Expected double");
        }
    }

    /* JADX INFO: renamed from: p */
    public final Double m3572p() throws IOException {
        switch (this.f5580a) {
            case 0:
                C2049a c2049a = (C2049a) this.f5581b;
                if (c2049a.m4194C() != EnumC2050b.NULL) {
                    return Double.valueOf(c2049a.m4210t());
                }
                c2049a.m4215y();
                return null;
            default:
                Object objM3563E = m3563E();
                if (objM3563E instanceof Number) {
                    return Double.valueOf(((Number) objM3563E).doubleValue());
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final float m3573q() throws IOException {
        switch (this.f5580a) {
            case 0:
                return (float) ((C2049a) this.f5581b).m4210t();
            default:
                Object objM3563E = m3563E();
                if (objM3563E instanceof Number) {
                    return ((Number) objM3563E).floatValue();
                }
                throw new IOException("Expected float");
        }
    }

    /* JADX INFO: renamed from: r */
    public final Float m3574r() throws IOException {
        switch (this.f5580a) {
            case 0:
                C2049a c2049a = (C2049a) this.f5581b;
                if (c2049a.m4194C() != EnumC2050b.NULL) {
                    return Float.valueOf(m3573q());
                }
                c2049a.m4215y();
                return null;
            default:
                Object objM3563E = m3563E();
                if (objM3563E instanceof Number) {
                    return Float.valueOf(((Number) objM3563E).floatValue());
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final int m3575s() throws IOException {
        switch (this.f5580a) {
            case 0:
                return ((C2049a) this.f5581b).m4211u();
            default:
                Object objM3563E = m3563E();
                if (objM3563E instanceof Number) {
                    return ((Number) objM3563E).intValue();
                }
                throw new IOException("Expected int");
        }
    }

    /* JADX INFO: renamed from: t */
    public final Integer m3576t() throws IOException {
        switch (this.f5580a) {
            case 0:
                C2049a c2049a = (C2049a) this.f5581b;
                if (c2049a.m4194C() != EnumC2050b.NULL) {
                    return Integer.valueOf(c2049a.m4211u());
                }
                c2049a.m4215y();
                return null;
            default:
                Object objM3563E = m3563E();
                if (objM3563E instanceof Number) {
                    return Integer.valueOf(((Number) objM3563E).intValue());
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: u */
    public final ArrayList m3577u(ILogger iLogger, InterfaceC1978q0 interfaceC1978q0) throws IOException {
        switch (this.f5580a) {
            case 0:
                C2049a c2049a = (C2049a) this.f5581b;
                if (c2049a.m4194C() == EnumC2050b.NULL) {
                    c2049a.m4215y();
                    return null;
                }
                c2049a.m4200d();
                ArrayList arrayList = new ArrayList();
                int iM4203l = c2049a.f7254h;
                if (iM4203l == 0) {
                    iM4203l = c2049a.m4203l();
                }
                if (iM4203l != 2 && iM4203l != 4) {
                    do {
                        try {
                            arrayList.add(interfaceC1978q0.mo4039a(this, iLogger));
                        } catch (Exception e) {
                            iLogger.mo3683r(EnumC1657a2.WARNING, "Failed to deserialize object in list.", e);
                        }
                        break;
                    } while (c2049a.m4194C() == EnumC2050b.BEGIN_OBJECT);
                }
                c2049a.m4204m();
                return arrayList;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.f5581b;
                if (m3564F() == EnumC2050b.NULL) {
                    if (m3563E() == null) {
                        return null;
                    }
                    throw new IOException("Expected null but was " + m3564F());
                }
                try {
                    m3566d();
                    ArrayList arrayList2 = new ArrayList();
                    if (!arrayDeque.isEmpty()) {
                        do {
                            try {
                                arrayList2.add(interfaceC1978q0.mo4039a(this, iLogger));
                            } catch (Exception e2) {
                                iLogger.mo3683r(EnumC1657a2.WARNING, "Failed to deserialize object in list.", e2);
                            }
                            break;
                        } while (m3564F() == EnumC2050b.BEGIN_OBJECT);
                    }
                    if (arrayDeque.size() > 1) {
                        arrayDeque.removeLast();
                        break;
                    }
                    return arrayList2;
                } catch (Exception e3) {
                    throw new IOException(e3);
                }
        }
    }

    /* JADX INFO: renamed from: v */
    public final long m3578v() throws IOException {
        switch (this.f5580a) {
            case 0:
                return ((C2049a) this.f5581b).m4212v();
            default:
                Object objM3563E = m3563E();
                if (objM3563E instanceof Number) {
                    return ((Number) objM3563E).longValue();
                }
                throw new IOException("Expected long");
        }
    }

    /* JADX INFO: renamed from: w */
    public final Long m3579w() throws IOException {
        switch (this.f5580a) {
            case 0:
                C2049a c2049a = (C2049a) this.f5581b;
                if (c2049a.m4194C() != EnumC2050b.NULL) {
                    return Long.valueOf(c2049a.m4212v());
                }
                c2049a.m4215y();
                return null;
            default:
                Object objM3563E = m3563E();
                if (objM3563E instanceof Number) {
                    return Long.valueOf(((Number) objM3563E).longValue());
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public final HashMap m3580x(ILogger iLogger, InterfaceC1978q0 interfaceC1978q0) throws IOException {
        switch (this.f5580a) {
            case 0:
                C2049a c2049a = (C2049a) this.f5581b;
                if (c2049a.m4194C() == EnumC2050b.NULL) {
                    c2049a.m4215y();
                    return null;
                }
                c2049a.m4201f();
                HashMap map = new HashMap();
                int iM4203l = c2049a.f7254h;
                if (iM4203l == 0) {
                    iM4203l = c2049a.m4203l();
                }
                if (iM4203l != 2 && iM4203l != 4) {
                    while (true) {
                        try {
                            map.put(c2049a.m4213w(), interfaceC1978q0.mo4039a(this, iLogger));
                        } catch (Exception e) {
                            iLogger.mo3683r(EnumC1657a2.WARNING, "Failed to deserialize object in map.", e);
                        }
                        if (c2049a.m4194C() == EnumC2050b.BEGIN_OBJECT || c2049a.m4194C() == EnumC2050b.NAME) {
                        }
                        break;
                    }
                }
                c2049a.m4205o();
                return map;
            default:
                if (m3564F() == EnumC2050b.NULL) {
                    if (m3563E() == null) {
                        return null;
                    }
                    throw new IOException("Expected null but was " + m3564F());
                }
                try {
                    m3567f();
                    HashMap map2 = new HashMap();
                    if (!((ArrayDeque) this.f5581b).isEmpty()) {
                        while (true) {
                            try {
                                map2.put(m3581y(), interfaceC1978q0.mo4039a(this, iLogger));
                            } catch (Exception e2) {
                                iLogger.mo3683r(EnumC1657a2.WARNING, "Failed to deserialize object in map.", e2);
                            }
                            if (m3564F() == EnumC2050b.BEGIN_OBJECT || m3564F() == EnumC2050b.NAME) {
                            }
                            break;
                        }
                    }
                    m3568i();
                    return map2;
                } catch (Exception e3) {
                    throw new IOException(e3);
                }
        }
    }

    /* JADX INFO: renamed from: y */
    public final String m3581y() throws IOException {
        switch (this.f5580a) {
            case 0:
                return ((C2049a) this.f5581b).m4213w();
            default:
                Map.Entry entry = (Map.Entry) ((ArrayDeque) this.f5581b).peekLast();
                if (entry != null && entry.getKey() != null) {
                    return (String) entry.getKey();
                }
                throw new IOException("Expected a name but was " + m3564F());
        }
    }

    /* JADX INFO: renamed from: z */
    public final Object m3582z() {
        switch (this.f5580a) {
            case 0:
                C2065z0 c2065z0 = new C2065z0();
                c2065z0.m4230d(this);
                InterfaceC2026u0 interfaceC2026u0M4227a = c2065z0.m4227a();
                if (interfaceC2026u0M4227a != null) {
                    return interfaceC2026u0M4227a.getValue();
                }
                return null;
            default:
                return m3563E();
        }
    }

    public C1559A0(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f5581b = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }
}
