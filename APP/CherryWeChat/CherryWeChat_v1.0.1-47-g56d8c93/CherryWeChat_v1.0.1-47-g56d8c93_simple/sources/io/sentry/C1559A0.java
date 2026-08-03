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
    public final /* synthetic */ int f5580a;

    /* JADX INFO: renamed from: b */
    public final Object f5581b;

    public C1559A0(Reader r2) {
        this.f5580a = 0;
        this.f5581b = new C2049a(r2);
    }

    /* JADX INFO: renamed from: H */
    private final void m3557H(boolean r1) {
    }

    /* JADX INFO: renamed from: I */
    private final void m3558I() {
    }

    /* JADX INFO: renamed from: A */
    public final Object m3559A(ILogger r4, InterfaceC1978q0 r5) {
        switch(this.f5580a) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        ArrayDeque r0 = (ArrayDeque) this.f5581b;
        Map.Entry r1 = (Map.Entry) r0.peekLast();
        if (r1 != null) goto L7;
        return null;
    L7:
        Object r12 = r1.getValue();
        if (r4 != null) goto L18;
        r0.removeLast();
        return r12;
    L18:
        return r5.mo4039a(this, r4);
    L12:
        C2049a r02 = (C2049a) this.f5581b;
        if (r02.m4194C() != EnumC2050b.NULL) goto L16;
        r02.m4215y();
        return null;
    L16:
        return r5.mo4039a(this, r4);
    }

    /* JADX INFO: renamed from: B */
    public final String m3560B() {
        switch(this.f5580a) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        String r0 = (String) m3563E();
        if (r0 == null) goto L8;
        return r0;
    L8:
        throw new IOException("Expected string");
    L10:
        return ((C2049a) this.f5581b).m4192A();
    }

    /* JADX INFO: renamed from: C */
    public final String m3561C() {
        switch(this.f5580a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        C2049a r0 = (C2049a) this.f5581b;
        if (r0.m4194C() != EnumC2050b.NULL) goto L10;
        r0.m4215y();
        return null;
    L10:
        return r0.m4192A();
    L5:
        return (String) m3563E();
    }

    /* JADX INFO: renamed from: D */
    public final void m3562D(ILogger r3, AbstractMap r4, String r5) {
        switch(this.f5580a) {
            case 0: goto L16;
            default: goto L14;
        };
    L14:
        r4.put(r5, m3563E());     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        r3.mo3682n(EnumC1657a2.ERROR, e, "Error deserializing unknown key: %s", new Object[]{r5});
        return;
    L16:
        r4.put(r5, m3582z());     // Catch: Exception -> L11
        return;
    L11:
        e = move-exception;
        r3.mo3682n(EnumC1657a2.ERROR, e, "Error deserializing unknown key: %s", new Object[]{r5});
    }

    /* JADX INFO: renamed from: E */
    public Object m3563E() {
        ArrayDeque r0 = (ArrayDeque) this.f5581b;     // Catch: Exception -> L8
        Map.Entry r1 = (Map.Entry) r0.peekLast();     // Catch: Exception -> L8
        if (r1 != null) goto L6;
        return null;
    L6:
        Object r12 = r1.getValue();     // Catch: Exception -> L8
        r0.removeLast();     // Catch: Exception -> L8
        return r12;
    L8:
        e = move-exception;
        throw new IOException(e);
    }

    /* JADX INFO: renamed from: F */
    public final EnumC2050b m3564F() {
        switch(this.f5580a) {
            case 0: goto L34;
            default: goto L4;
        };
    L4:
        ArrayDeque r0 = (ArrayDeque) this.f5581b;
        if (r0.isEmpty() == true) goto L35;
        Map.Entry r02 = (Map.Entry) r0.peekLast();
        if (r02 != null) goto L11;
        return EnumC2050b.END_DOCUMENT;
    L11:
        if (r02.getKey() != null) goto L37;
        Object r03 = r02.getValue();
        if ((r03 instanceof Map) == false) goto L17;
        return EnumC2050b.BEGIN_OBJECT;
    L17:
        if ((r03 instanceof List) == false) goto L20;
        return EnumC2050b.BEGIN_ARRAY;
    L20:
        if ((r03 instanceof String) == false) goto L23;
        return EnumC2050b.STRING;
    L23:
        if ((r03 instanceof Number) == false) goto L26;
        return EnumC2050b.NUMBER;
    L26:
        if ((r03 instanceof Boolean) == false) goto L29;
        return EnumC2050b.BOOLEAN;
    L29:
        if ((r03 instanceof EnumC2050b) == false) goto L32;
        return (EnumC2050b) r03;
    L32:
        return EnumC2050b.END_DOCUMENT;
    L37:
        return EnumC2050b.NAME;
    L35:
        return EnumC2050b.END_DOCUMENT;
    L34:
        return ((C2049a) this.f5581b).m4194C();
    }

    /* JADX INFO: renamed from: G */
    public final void m3565G(boolean r2) {
        switch(this.f5580a) {
            case 0: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        ((C2049a) this.f5581b).f7248b = r2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch(this.f5580a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((ArrayDeque) this.f5581b).clear();
        return;
    L6:
        ((C2049a) this.f5581b).close();
    }

    /* JADX INFO: renamed from: d */
    public void m3566d() {
        ArrayDeque r0 = (ArrayDeque) this.f5581b;
        Map.Entry r1 = (Map.Entry) r0.removeLast();
        if (r1 == null) goto L13;
        Object r12 = r1.getValue();
        if ((r12 instanceof List) == false) goto L11;
        r0.addLast(new AbstractMap.SimpleEntry(null, EnumC2050b.END_ARRAY));
        List r13 = (List) r12;
        int r2 = r13.size() - 1;
    L7:
        if (r2 < 0) goto L9;
        r0.addLast(new AbstractMap.SimpleEntry(null, r13.get(r2)));
        r2 = r2 - 1;
        goto L7
    L9:
        return;
    L11:
        throw new IOException("Current token is not an object");
    L13:
        throw new IOException("No more entries");
    }

    /* JADX INFO: renamed from: f */
    public final void m3567f() {
        switch(this.f5580a) {
            case 0: goto L17;
            default: goto L4;
        };
    L4:
        ArrayDeque r0 = (ArrayDeque) this.f5581b;
        Map.Entry r1 = (Map.Entry) r0.removeLast();
        if (r1 == null) goto L16;
        Object r12 = r1.getValue();
        if ((r12 instanceof Map) == false) goto L14;
        r0.addLast(new AbstractMap.SimpleEntry(null, EnumC2050b.END_OBJECT));
        Iterator r13 = ((Map) r12).entrySet().iterator();
    L10:
        if (r13.hasNext() == false) goto L12;
        r0.addLast((Map.Entry) r13.next());
        goto L10
    L12:
        return;
    L14:
        throw new IOException("Current token is not an object");
    L16:
        throw new IOException("No more entries");
    L17:
        ((C2049a) this.f5581b).m4201f();
    }

    /* JADX INFO: renamed from: i */
    public final void m3568i() {
        switch(this.f5580a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        ArrayDeque r0 = (ArrayDeque) this.f5581b;
        if (r0.size() <= 1) goto L10;
        r0.removeLast();
        return;
    L10:
        return;
    L8:
        ((C2049a) this.f5581b).m4205o();
    }

    /* JADX INFO: renamed from: l */
    public final Boolean m3569l() {
        switch(this.f5580a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        C2049a r0 = (C2049a) this.f5581b;
        if (r0.m4194C() != EnumC2050b.NULL) goto L10;
        r0.m4215y();
        return null;
    L10:
        return Boolean.valueOf(r0.m4209s());
    L5:
        return (Boolean) m3563E();
    }

    /* JADX INFO: renamed from: m */
    public final Date m3570m(ILogger r5) {
        switch(this.f5580a) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        String r0 = (String) m3563E();
        if (r0 == null) goto L33;
        return AbstractC1856a.m4069o(r0);
    L9:
        return AbstractC1856a.m4070p(r0);
    L11:
        e = move-exception;
        r5.mo3683r(EnumC1657a2.ERROR, "Error when deserializing millis timestamp format.", e);
        return null;
    L33:
        return null;
    L14:
        C2049a r02 = (C2049a) this.f5581b;
        if (r02.m4194C() != EnumC2050b.NULL) goto L17;
        r02.m4215y();
        return null;
    L17:
        String r03 = r02.m4192A();
        if (r03 == null) goto L37;
        return AbstractC1856a.m4069o(r03);
    L22:
        return AbstractC1856a.m4070p(r03);
    L24:
        e = move-exception;
        r5.mo3683r(EnumC1657a2.ERROR, "Error when deserializing millis timestamp format.", e);
        return null;
    L37:
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final double m3571o() {
        switch(this.f5580a) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        Object r0 = m3563E();
        if ((r0 instanceof Number) == false) goto L9;
        return ((Number) r0).doubleValue();
    L9:
        throw new IOException("Expected double");
    L11:
        return ((C2049a) this.f5581b).m4210t();
    }

    /* JADX INFO: renamed from: p */
    public final Double m3572p() {
        switch(this.f5580a) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        Object r0 = m3563E();
        if ((r0 instanceof Number) == true) goto L14;
        return null;
    L14:
        return Double.valueOf(((Number) r0).doubleValue());
    L9:
        C2049a r02 = (C2049a) this.f5581b;
        if (r02.m4194C() != EnumC2050b.NULL) goto L13;
        r02.m4215y();
        return null;
    L13:
        return Double.valueOf(r02.m4210t());
    }

    /* JADX INFO: renamed from: q */
    public final float m3573q() {
        switch(this.f5580a) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        Object r0 = m3563E();
        if ((r0 instanceof Number) == false) goto L9;
        return ((Number) r0).floatValue();
    L9:
        throw new IOException("Expected float");
    L11:
        return (float) ((C2049a) this.f5581b).m4210t();
    }

    /* JADX INFO: renamed from: r */
    public final Float m3574r() {
        switch(this.f5580a) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        Object r0 = m3563E();
        if ((r0 instanceof Number) == true) goto L14;
        return null;
    L14:
        return Float.valueOf(((Number) r0).floatValue());
    L9:
        C2049a r02 = (C2049a) this.f5581b;
        if (r02.m4194C() != EnumC2050b.NULL) goto L13;
        r02.m4215y();
        return null;
    L13:
        return Float.valueOf(m3573q());
    }

    /* JADX INFO: renamed from: s */
    public final int m3575s() {
        switch(this.f5580a) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        Object r0 = m3563E();
        if ((r0 instanceof Number) == false) goto L9;
        return ((Number) r0).intValue();
    L9:
        throw new IOException("Expected int");
    L11:
        return ((C2049a) this.f5581b).m4211u();
    }

    /* JADX INFO: renamed from: t */
    public final Integer m3576t() {
        switch(this.f5580a) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        Object r0 = m3563E();
        if ((r0 instanceof Number) == true) goto L14;
        return null;
    L14:
        return Integer.valueOf(((Number) r0).intValue());
    L9:
        C2049a r02 = (C2049a) this.f5581b;
        if (r02.m4194C() != EnumC2050b.NULL) goto L13;
        r02.m4215y();
        return null;
    L13:
        return Integer.valueOf(r02.m4211u());
    }

    /* JADX INFO: renamed from: u */
    public final ArrayList m3577u(ILogger r6, InterfaceC1978q0 r7) {
        switch(this.f5580a) {
            case 0: goto L29;
            default: goto L4;
        };
    L4:
        ArrayDeque r0 = (ArrayDeque) this.f5581b;
        if (m3564F() == EnumC2050b.NULL) goto L7;
        m3566d();     // Catch: Exception -> L20
        ArrayList r1 = new ArrayList();     // Catch: Exception -> L20
        if (r0.isEmpty() == true) goto L23;
    L51:
        r1.add(r7.mo4039a(this, r6));     // Catch: Exception -> L15
    L18:
        if (m3564F() == EnumC2050b.BEGIN_OBJECT) goto L51;
    L15:
        e = move-exception;
        r6.mo3683r(EnumC1657a2.WARNING, "Failed to deserialize object in list.", e);     // Catch: Exception -> L20
    L23:
        if (r0.size() <= 1) goto L26;
        r0.removeLast();     // Catch: Exception -> L20
    L26:
        return r1;
    L20:
        e = move-exception;
        throw new IOException(e);
    L7:
        if (m3563E() != null) goto L10;
        return null;
    L10:
        throw new IOException("Expected null but was " + m3564F());
    L29:
        C2049a r02 = (C2049a) this.f5581b;
        if (r02.m4194C() != EnumC2050b.NULL) goto L32;
        r02.m4215y();
        return null;
    L32:
        r02.m4200d();
        ArrayList r12 = new ArrayList();
        int r2 = r02.f7254h;
        if (r2 != 0) goto L36;
        r2 = r02.m4203l();
    L36:
        if (r2 != 2) goto L38;
    L45:
        r02.m4204m();
        return r12;
    L38:
        if (r2 == 4) goto L45;
    L47:
        r12.add(r7.mo4039a(this, r6));     // Catch: Exception -> L41
    L44:
        if (r02.m4194C() == EnumC2050b.BEGIN_OBJECT) goto L47;
    L41:
        e = move-exception;
        r6.mo3683r(EnumC1657a2.WARNING, "Failed to deserialize object in list.", e);
        goto L44
    }

    /* JADX INFO: renamed from: v */
    public final long m3578v() {
        switch(this.f5580a) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        Object r0 = m3563E();
        if ((r0 instanceof Number) == false) goto L9;
        return ((Number) r0).longValue();
    L9:
        throw new IOException("Expected long");
    L11:
        return ((C2049a) this.f5581b).m4212v();
    }

    /* JADX INFO: renamed from: w */
    public final Long m3579w() {
        switch(this.f5580a) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        Object r0 = m3563E();
        if ((r0 instanceof Number) == true) goto L14;
        return null;
    L14:
        return Long.valueOf(((Number) r0).longValue());
    L9:
        C2049a r02 = (C2049a) this.f5581b;
        if (r02.m4194C() != EnumC2050b.NULL) goto L13;
        r02.m4215y();
        return null;
    L13:
        return Long.valueOf(r02.m4212v());
    }

    /* JADX INFO: renamed from: x */
    public final HashMap m3580x(ILogger r6, InterfaceC1978q0 r7) {
        switch(this.f5580a) {
            case 0: goto L29;
            default: goto L5;
        };
    L29:
        C2049a r0 = (C2049a) this.f5581b;
        if (r0.m4194C() != EnumC2050b.NULL) goto L32;
        r0.m4215y();
        return null;
    L32:
        r0.m4201f();
        HashMap r1 = new HashMap();
        int r2 = r0.f7254h;
        if (r2 != 0) goto L36;
        r2 = r0.m4203l();
    L36:
        if (r2 != 2) goto L38;
    L47:
        r0.m4205o();
        return r1;
    L38:
        if (r2 == 4) goto L47;
    L51:
        r1.put(r0.m4213w(), r7.mo4039a(this, r6));     // Catch: Exception -> L41
    L44:
        if (r0.m4194C() == EnumC2050b.BEGIN_OBJECT) goto L51;
        if (r0.m4194C() == EnumC2050b.NAME) goto L51;
    L41:
        e = move-exception;
        r6.mo3683r(EnumC1657a2.WARNING, "Failed to deserialize object in map.", e);
        goto L44
    L5:
        if (m3564F() == EnumC2050b.NULL) goto L7;
        m3567f();     // Catch: Exception -> L22
        HashMap r02 = new HashMap();     // Catch: Exception -> L22
        if (((ArrayDeque) this.f5581b).isEmpty() == false) goto L49;
    L24:
        m3568i();     // Catch: Exception -> L22
        return r02;
    L49:
        r02.put(m3581y(), r7.mo4039a(this, r6));     // Catch: Exception -> L15
    L18:
        if (m3564F() == EnumC2050b.BEGIN_OBJECT) goto L49;
        if (m3564F() == EnumC2050b.NAME) goto L49;
    L15:
        e = move-exception;
        r6.mo3683r(EnumC1657a2.WARNING, "Failed to deserialize object in map.", e);     // Catch: Exception -> L22
    L22:
        e = move-exception;
        throw new IOException(e);
    L7:
        if (m3563E() != null) goto L10;
        return null;
    L10:
        throw new IOException("Expected null but was " + m3564F());
    }

    /* JADX INFO: renamed from: y */
    public final String m3581y() {
        switch(this.f5580a) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        Map.Entry r0 = (Map.Entry) ((ArrayDeque) this.f5581b).peekLast();
        if (r0 == null) goto L11;
        if (r0.getKey() == null) goto L11;
        return (String) r0.getKey();
    L11:
        throw new IOException("Expected a name but was " + m3564F());
    L13:
        return ((C2049a) this.f5581b).m4213w();
    }

    /* JADX INFO: renamed from: z */
    public final Object m3582z() {
        switch(this.f5580a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        C2065z0 r0 = new C2065z0();
        r0.m4230d(this);
        InterfaceC2026u0 r02 = r0.m4227a();
        if (r02 != null) goto L11;
        return null;
    L11:
        return r02.getValue();
    L5:
        return m3563E();
    }

    public C1559A0(Map r4) {
        this.f5580a = 1;
        ArrayDeque r0 = new ArrayDeque();
        this.f5581b = r0;
        r0.addLast(new AbstractMap.SimpleEntry(null, r4));
    }
}
