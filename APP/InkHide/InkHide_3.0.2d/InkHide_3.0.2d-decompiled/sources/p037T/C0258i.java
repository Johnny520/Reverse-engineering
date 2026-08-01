package p037T;

import androidx.fragment.app.AbstractC0421L;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p022L.AbstractC0174d;
import p041V.C0317j;
import p041V.C0319l;
import p041V.C0320m;
import p041V.C0321n;
import p042W.C0336h;
import p051b0.C0493b;
import p051b0.C0494c;

/* JADX INFO: renamed from: T.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0258i extends AbstractC0274y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f608a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [T.l.<init>(V.h, T.h, java.util.HashMap, boolean, boolean, boolean, boolean, int, java.util.ArrayList, T.x, T.x, java.util.ArrayList):void, W.x.<clinit>():void] */
    public /* synthetic */ C0258i(int i2) {
        this.f608a = i2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.fragment.app.L.d(int):int */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static AbstractC0264o m474c(C0493b c0493b, int i2) {
        int iM816d = AbstractC0421L.m816d(i2);
        if (iM816d == 5) {
            return new C0268s(c0493b.mo584v());
        }
        if (iM816d == 6) {
            return new C0268s(new C0317j(c0493b.mo584v()));
        }
        if (iM816d == 7) {
            return new C0268s(Boolean.valueOf(c0493b.mo578n()));
        }
        if (iM816d != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC0174d.m361q(i2)));
        }
        c0493b.mo583t();
        return C0266q.f636a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m475d(C0494c c0494c, AbstractC0264o abstractC0264o) {
        if (abstractC0264o == null || (abstractC0264o instanceof C0266q)) {
            c0494c.mo591i();
            return;
        }
        boolean z2 = abstractC0264o instanceof C0268s;
        if (z2) {
            if (!z2) {
                throw new IllegalStateException("Not a JSON Primitive: " + abstractC0264o);
            }
            C0268s c0268s = (C0268s) abstractC0264o;
            Serializable serializable = c0268s.f638a;
            if (serializable instanceof Number) {
                c0494c.mo595o(c0268s.m490c());
                return;
            } else if (serializable instanceof Boolean) {
                c0494c.mo597q(c0268s.m489b());
                return;
            } else {
                c0494c.mo596p(c0268s.m491d());
                return;
            }
        }
        boolean z3 = abstractC0264o instanceof C0263n;
        if (z3) {
            c0494c.mo586b();
            if (!z3) {
                throw new IllegalStateException("Not a JSON Array: " + abstractC0264o);
            }
            Iterator it = ((C0263n) abstractC0264o).f635a.iterator();
            while (it.hasNext()) {
                m475d(c0494c, (AbstractC0264o) it.next());
            }
            c0494c.mo588e();
            return;
        }
        boolean z4 = abstractC0264o instanceof C0267r;
        if (!z4) {
            throw new IllegalArgumentException("Couldn't write " + abstractC0264o.getClass());
        }
        c0494c.mo587c();
        if (!z4) {
            throw new IllegalStateException("Not a JSON Object: " + abstractC0264o);
        }
        Iterator it2 = ((C0320m) ((C0267r) abstractC0264o).f637a.entrySet()).iterator();
        while (((C0319l) it2).hasNext()) {
            C0321n c0321nM553b = ((C0319l) it2).m553b();
            c0494c.mo590g((String) c0321nM553b.getKey());
            m475d(c0494c, (AbstractC0264o) c0321nM553b.getValue());
        }
        c0494c.mo589f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: a */
    public final Object mo476a(C0493b c0493b) {
        AbstractC0264o c0263n;
        AbstractC0264o c0263n2;
        boolean zMo578n;
        switch (this.f608a) {
            case 0:
                if (c0493b.mo585x() != 9) {
                    return Double.valueOf(c0493b.mo579o());
                }
                c0493b.mo583t();
                return null;
            case 1:
                if (c0493b.mo585x() != 9) {
                    return Float.valueOf((float) c0493b.mo579o());
                }
                c0493b.mo583t();
                return null;
            case 2:
                if (c0493b.mo585x() != 9) {
                    return Long.valueOf(c0493b.mo581q());
                }
                c0493b.mo583t();
                return null;
            case 3:
                ArrayList arrayList = new ArrayList();
                c0493b.mo571a();
                while (c0493b.mo577k()) {
                    try {
                        arrayList.add(Integer.valueOf(c0493b.mo580p()));
                    } catch (NumberFormatException e2) {
                        throw new C0265p(e2);
                    }
                }
                c0493b.mo573e();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            case 4:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                try {
                    return Long.valueOf(c0493b.mo581q());
                } catch (NumberFormatException e3) {
                    throw new C0265p(e3);
                }
            case 5:
                if (c0493b.mo585x() != 9) {
                    return Float.valueOf((float) c0493b.mo579o());
                }
                c0493b.mo583t();
                return null;
            case 6:
                if (c0493b.mo585x() != 9) {
                    return Double.valueOf(c0493b.mo579o());
                }
                c0493b.mo583t();
                return null;
            case 7:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                String strMo584v = c0493b.mo584v();
                if (strMo584v.length() == 1) {
                    return Character.valueOf(strMo584v.charAt(0));
                }
                StringBuilder sbM357m = AbstractC0174d.m357m("Expecting character, got: ", strMo584v, "; at ");
                sbM357m.append(c0493b.mo576j());
                throw new C0265p(sbM357m.toString());
            case 8:
                int iMo585x = c0493b.mo585x();
                if (iMo585x != 9) {
                    return iMo585x == 8 ? Boolean.toString(c0493b.mo578n()) : c0493b.mo584v();
                }
                c0493b.mo583t();
                return null;
            case 9:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                String strMo584v2 = c0493b.mo584v();
                try {
                    return new BigDecimal(strMo584v2);
                } catch (NumberFormatException e4) {
                    StringBuilder sbM357m2 = AbstractC0174d.m357m("Failed parsing '", strMo584v2, "' as BigDecimal; at path ");
                    sbM357m2.append(c0493b.mo576j());
                    throw new C0265p(sbM357m2.toString(), e4);
                }
            case 10:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                String strMo584v3 = c0493b.mo584v();
                try {
                    return new BigInteger(strMo584v3);
                } catch (NumberFormatException e5) {
                    StringBuilder sbM357m3 = AbstractC0174d.m357m("Failed parsing '", strMo584v3, "' as BigInteger; at path ");
                    sbM357m3.append(c0493b.mo576j());
                    throw new C0265p(sbM357m3.toString(), e5);
                }
            case 11:
                if (c0493b.mo585x() != 9) {
                    return new C0317j(c0493b.mo584v());
                }
                c0493b.mo583t();
                return null;
            case 12:
                if (c0493b.mo585x() != 9) {
                    return new StringBuilder(c0493b.mo584v());
                }
                c0493b.mo583t();
                return null;
            case 13:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 14:
                if (c0493b.mo585x() != 9) {
                    return new StringBuffer(c0493b.mo584v());
                }
                c0493b.mo583t();
                return null;
            case 15:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                String strMo584v4 = c0493b.mo584v();
                if ("null".equals(strMo584v4)) {
                    return null;
                }
                return new URL(strMo584v4);
            case 16:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                try {
                    String strMo584v5 = c0493b.mo584v();
                    if ("null".equals(strMo584v5)) {
                        return null;
                    }
                    return new URI(strMo584v5);
                } catch (URISyntaxException e6) {
                    throw new C0265p(e6);
                }
            case 17:
                if (c0493b.mo585x() != 9) {
                    return InetAddress.getByName(c0493b.mo584v());
                }
                c0493b.mo583t();
                return null;
            case 18:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                String strMo584v6 = c0493b.mo584v();
                try {
                    return UUID.fromString(strMo584v6);
                } catch (IllegalArgumentException e7) {
                    StringBuilder sbM357m4 = AbstractC0174d.m357m("Failed parsing '", strMo584v6, "' as UUID; at path ");
                    sbM357m4.append(c0493b.mo576j());
                    throw new C0265p(sbM357m4.toString(), e7);
                }
            case 19:
                String strMo584v7 = c0493b.mo584v();
                try {
                    return Currency.getInstance(strMo584v7);
                } catch (IllegalArgumentException e8) {
                    StringBuilder sbM357m5 = AbstractC0174d.m357m("Failed parsing '", strMo584v7, "' as Currency; at path ");
                    sbM357m5.append(c0493b.mo576j());
                    throw new C0265p(sbM357m5.toString(), e8);
                }
            case 20:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                c0493b.mo572b();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (c0493b.mo585x() != 4) {
                    String strMo582r = c0493b.mo582r();
                    int iMo580p = c0493b.mo580p();
                    if ("year".equals(strMo582r)) {
                        i3 = iMo580p;
                    } else if ("month".equals(strMo582r)) {
                        i4 = iMo580p;
                    } else if ("dayOfMonth".equals(strMo582r)) {
                        i5 = iMo580p;
                    } else if ("hourOfDay".equals(strMo582r)) {
                        i6 = iMo580p;
                    } else if ("minute".equals(strMo582r)) {
                        i7 = iMo580p;
                    } else if ("second".equals(strMo582r)) {
                        i8 = iMo580p;
                    }
                }
                c0493b.mo574f();
                return new GregorianCalendar(i3, i4, i5, i6, i7, i8);
            case 21:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(c0493b.mo584v(), "_");
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            case 22:
                if (c0493b instanceof C0336h) {
                    C0336h c0336h = (C0336h) c0493b;
                    int iMo585x2 = c0336h.mo585x();
                    if (iMo585x2 != 5 && iMo585x2 != 2 && iMo585x2 != 4 && iMo585x2 != 10) {
                        AbstractC0264o abstractC0264o = (AbstractC0264o) c0336h.m568J();
                        c0336h.mo563D();
                        return abstractC0264o;
                    }
                    throw new IllegalStateException("Unexpected " + AbstractC0174d.m361q(iMo585x2) + " when reading a JsonElement.");
                }
                int iMo585x3 = c0493b.mo585x();
                int iM816d = AbstractC0421L.m816d(iMo585x3);
                if (iM816d == 0) {
                    c0493b.mo571a();
                    c0263n = new C0263n();
                } else if (iM816d != 2) {
                    c0263n = null;
                } else {
                    c0493b.mo572b();
                    c0263n = new C0267r();
                }
                if (c0263n == null) {
                    return m474c(c0493b, iMo585x3);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (c0493b.mo577k()) {
                        String strMo582r2 = c0263n instanceof C0267r ? c0493b.mo582r() : null;
                        int iMo585x4 = c0493b.mo585x();
                        int iM816d2 = AbstractC0421L.m816d(iMo585x4);
                        if (iM816d2 == 0) {
                            c0493b.mo571a();
                            c0263n2 = new C0263n();
                        } else if (iM816d2 != 2) {
                            c0263n2 = null;
                        } else {
                            c0493b.mo572b();
                            c0263n2 = new C0267r();
                        }
                        boolean z2 = c0263n2 != null;
                        if (c0263n2 == null) {
                            c0263n2 = m474c(c0493b, iMo585x4);
                        }
                        if (c0263n instanceof C0263n) {
                            ((C0263n) c0263n).f635a.add(c0263n2);
                        } else {
                            ((C0267r) c0263n).f637a.put(strMo582r2, c0263n2);
                        }
                        if (z2) {
                            arrayDeque.addLast(c0263n);
                            c0263n = c0263n2;
                        }
                    } else {
                        if (c0263n instanceof C0263n) {
                            c0493b.mo573e();
                        } else {
                            c0493b.mo574f();
                        }
                        if (arrayDeque.isEmpty()) {
                            return c0263n;
                        }
                        c0263n = (AbstractC0264o) arrayDeque.removeLast();
                    }
                }
                break;
            case 23:
                BitSet bitSet = new BitSet();
                c0493b.mo571a();
                int iMo585x5 = c0493b.mo585x();
                int i9 = 0;
                while (iMo585x5 != 2) {
                    int iM816d3 = AbstractC0421L.m816d(iMo585x5);
                    if (iM816d3 == 5 || iM816d3 == 6) {
                        int iMo580p2 = c0493b.mo580p();
                        if (iMo580p2 == 0) {
                            zMo578n = false;
                        } else {
                            if (iMo580p2 != 1) {
                                throw new C0265p("Invalid bitset value " + iMo580p2 + ", expected 0 or 1; at path " + c0493b.mo576j());
                            }
                            zMo578n = true;
                        }
                    } else {
                        if (iM816d3 != 7) {
                            throw new C0265p("Invalid bitset value type: " + AbstractC0174d.m361q(iMo585x5) + "; at path " + c0493b.mo575h());
                        }
                        zMo578n = c0493b.mo578n();
                    }
                    if (zMo578n) {
                        bitSet.set(i9);
                    }
                    i9++;
                    iMo585x5 = c0493b.mo585x();
                }
                c0493b.mo573e();
                return bitSet;
            case 24:
                int iMo585x6 = c0493b.mo585x();
                if (iMo585x6 != 9) {
                    return iMo585x6 == 6 ? Boolean.valueOf(Boolean.parseBoolean(c0493b.mo584v())) : Boolean.valueOf(c0493b.mo578n());
                }
                c0493b.mo583t();
                return null;
            case 25:
                if (c0493b.mo585x() != 9) {
                    return Boolean.valueOf(c0493b.mo584v());
                }
                c0493b.mo583t();
                return null;
            case 26:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                try {
                    int iMo580p3 = c0493b.mo580p();
                    if (iMo580p3 <= 255 && iMo580p3 >= -128) {
                        return Byte.valueOf((byte) iMo580p3);
                    }
                    throw new C0265p("Lossy conversion from " + iMo580p3 + " to byte; at path " + c0493b.mo576j());
                } catch (NumberFormatException e9) {
                    throw new C0265p(e9);
                }
            case 27:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                try {
                    int iMo580p4 = c0493b.mo580p();
                    if (iMo580p4 <= 65535 && iMo580p4 >= -32768) {
                        return Short.valueOf((short) iMo580p4);
                    }
                    throw new C0265p("Lossy conversion from " + iMo580p4 + " to short; at path " + c0493b.mo576j());
                } catch (NumberFormatException e10) {
                    throw new C0265p(e10);
                }
            default:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                try {
                    return Integer.valueOf(c0493b.mo580p());
                } catch (NumberFormatException e11) {
                    throw new C0265p(e11);
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: b */
    public final void mo477b(C0494c c0494c, Object obj) throws IOException {
        switch (this.f608a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    c0494c.mo591i();
                    return;
                }
                double dDoubleValue = number.doubleValue();
                C0261l.m478a(dDoubleValue);
                c0494c.mo592l(dDoubleValue);
                return;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf == null) {
                    c0494c.mo591i();
                    return;
                }
                float fFloatValue = numberValueOf.floatValue();
                C0261l.m478a(fFloatValue);
                if (!(numberValueOf instanceof Float)) {
                    numberValueOf = Float.valueOf(fFloatValue);
                }
                c0494c.mo595o(numberValueOf);
                return;
            case 2:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    c0494c.mo591i();
                    return;
                } else {
                    c0494c.mo596p(number2.toString());
                    return;
                }
            case 3:
                c0494c.mo586b();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i2 = 0; i2 < length; i2++) {
                    c0494c.mo593m(r6.get(i2));
                }
                c0494c.mo588e();
                return;
            case 4:
                Number number3 = (Number) obj;
                if (number3 == null) {
                    c0494c.mo591i();
                    return;
                } else {
                    c0494c.mo593m(number3.longValue());
                    return;
                }
            case 5:
                Number numberValueOf2 = (Number) obj;
                if (numberValueOf2 == null) {
                    c0494c.mo591i();
                    return;
                }
                if (!(numberValueOf2 instanceof Float)) {
                    numberValueOf2 = Float.valueOf(numberValueOf2.floatValue());
                }
                c0494c.mo595o(numberValueOf2);
                return;
            case 6:
                Number number4 = (Number) obj;
                if (number4 == null) {
                    c0494c.mo591i();
                    return;
                } else {
                    c0494c.mo592l(number4.doubleValue());
                    return;
                }
            case 7:
                Character ch = (Character) obj;
                c0494c.mo596p(ch == null ? null : String.valueOf(ch));
                return;
            case 8:
                c0494c.mo596p((String) obj);
                return;
            case 9:
                c0494c.mo595o((BigDecimal) obj);
                return;
            case 10:
                c0494c.mo595o((BigInteger) obj);
                return;
            case 11:
                c0494c.mo595o((C0317j) obj);
                return;
            case 12:
                StringBuilder sb = (StringBuilder) obj;
                c0494c.mo596p(sb == null ? null : sb.toString());
                return;
            case 13:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 14:
                StringBuffer stringBuffer = (StringBuffer) obj;
                c0494c.mo596p(stringBuffer == null ? null : stringBuffer.toString());
                return;
            case 15:
                URL url = (URL) obj;
                c0494c.mo596p(url == null ? null : url.toExternalForm());
                return;
            case 16:
                URI uri = (URI) obj;
                c0494c.mo596p(uri == null ? null : uri.toASCIIString());
                return;
            case 17:
                InetAddress inetAddress = (InetAddress) obj;
                c0494c.mo596p(inetAddress == null ? null : inetAddress.getHostAddress());
                return;
            case 18:
                UUID uuid = (UUID) obj;
                c0494c.mo596p(uuid == null ? null : uuid.toString());
                return;
            case 19:
                c0494c.mo596p(((Currency) obj).getCurrencyCode());
                return;
            case 20:
                if (((Calendar) obj) == null) {
                    c0494c.mo591i();
                    return;
                }
                c0494c.mo587c();
                c0494c.mo590g("year");
                c0494c.mo593m(r6.get(1));
                c0494c.mo590g("month");
                c0494c.mo593m(r6.get(2));
                c0494c.mo590g("dayOfMonth");
                c0494c.mo593m(r6.get(5));
                c0494c.mo590g("hourOfDay");
                c0494c.mo593m(r6.get(11));
                c0494c.mo590g("minute");
                c0494c.mo593m(r6.get(12));
                c0494c.mo590g("second");
                c0494c.mo593m(r6.get(13));
                c0494c.mo589f();
                return;
            case 21:
                Locale locale = (Locale) obj;
                c0494c.mo596p(locale == null ? null : locale.toString());
                return;
            case 22:
                m475d(c0494c, (AbstractC0264o) obj);
                return;
            case 23:
                BitSet bitSet = (BitSet) obj;
                c0494c.mo586b();
                int length2 = bitSet.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    c0494c.mo593m(bitSet.get(i3) ? 1L : 0L);
                }
                c0494c.mo588e();
                return;
            case 24:
                c0494c.mo594n((Boolean) obj);
                return;
            case 25:
                Boolean bool = (Boolean) obj;
                c0494c.mo596p(bool == null ? "null" : bool.toString());
                return;
            case 26:
                if (((Number) obj) == null) {
                    c0494c.mo591i();
                    return;
                } else {
                    c0494c.mo593m(r6.byteValue());
                    return;
                }
            case 27:
                if (((Number) obj) == null) {
                    c0494c.mo591i();
                    return;
                } else {
                    c0494c.mo593m(r6.shortValue());
                    return;
                }
            default:
                if (((Number) obj) == null) {
                    c0494c.mo591i();
                    return;
                } else {
                    c0494c.mo593m(r6.intValue());
                    return;
                }
        }
    }
}
