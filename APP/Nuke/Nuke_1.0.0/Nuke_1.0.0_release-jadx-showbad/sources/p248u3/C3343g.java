package p248u3;

import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import p000A.C0073m;
import p041H0.C0630y0;
import p061L2.AbstractC0973m;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p149d3.AbstractC1976d;
import p170h1.C2229t;
import p179i4.AbstractC2352g;
import p211o0.C2748g;
import p214o3.C2799b;
import p214o3.InterfaceC2798a;
import p225q3.InterfaceC2933d;
import p231r3.InterfaceC3152b;
import p236s3.C3189e;
import p236s3.C3201q;
import p242t3.AbstractC3214c;
import p242t3.C3216e;

/* JADX INFO: renamed from: u3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3343g implements InterfaceC3152b {

    /* JADX INFO: renamed from: a */
    public final AbstractC3214c f10391a;

    /* JADX INFO: renamed from: b */
    public final EnumC3345i f10392b;

    /* JADX INFO: renamed from: c */
    public final C0630y0 f10393c;

    /* JADX INFO: renamed from: d */
    public int f10394d;

    /* JADX INFO: renamed from: e */
    public final C3340d f10395e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3343g(AbstractC3214c abstractC3214c, EnumC3345i enumC3345i, C0630y0 c0630y0, InterfaceC2933d interfaceC2933d) {
        AbstractC1665j.m2985e(abstractC3214c, "json");
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        this.f10391a = abstractC3214c;
        this.f10392b = enumC3345i;
        this.f10393c = c0630y0;
        this.f10394d = -1;
        this.f10395e = abstractC3214c.f9997a.f10001b ? null : new C3340d(interfaceC2933d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p231r3.InterfaceC3152b
    /* JADX INFO: renamed from: a */
    public final C3343g mo5422a(InterfaceC2933d interfaceC2933d) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        AbstractC3214c abstractC3214c = this.f10391a;
        EnumC3345i enumC3345iM5588g = AbstractC3341e.m5588g(interfaceC2933d, abstractC3214c);
        C0630y0 c0630y0 = this.f10393c;
        C2748g c2748g = (C2748g) c0630y0.f2001d;
        c2748g.getClass();
        int i5 = c2748g.f8736b + 1;
        c2748g.f8736b = i5;
        if (i5 == ((Object[]) c2748g.f8738d).length) {
            c2748g.m4866d();
        }
        ((Object[]) c2748g.f8738d)[i5] = interfaceC2933d;
        c0630y0.m1070f(enumC3345iM5588g.f10404d);
        if (c0630y0.m1077n() != 4) {
            int iOrdinal = enumC3345iM5588g.ordinal();
            return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? new C3343g(abstractC3214c, enumC3345iM5588g, c0630y0, interfaceC2933d) : (this.f10392b == enumC3345iM5588g && abstractC3214c.f9997a.f10001b) ? this : new C3343g(abstractC3214c, enumC3345iM5588g, c0630y0, interfaceC2933d);
        }
        C0630y0.m1064l(c0630y0, "Unexpected leading comma", 0, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p231r3.InterfaceC3152b
    /* JADX INFO: renamed from: b */
    public final long mo5423b() {
        return this.f10393c.m1071g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p231r3.InterfaceC3152b
    /* JADX INFO: renamed from: c */
    public final boolean mo5424c() {
        boolean z5;
        boolean z6;
        C0630y0 c0630y0 = this.f10393c;
        int iM1079p = c0630y0.m1079p();
        String str = (String) c0630y0.f2004g;
        if (iM1079p == str.length()) {
            C0630y0.m1064l(c0630y0, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iM1079p) == '\"') {
            iM1079p++;
            z5 = true;
        } else {
            z5 = false;
        }
        int iM1078o = c0630y0.m1078o(iM1079p);
        if (iM1078o >= str.length() || iM1078o == -1) {
            C0630y0.m1064l(c0630y0, "EOF", 0, 6);
            throw null;
        }
        int i5 = iM1078o + 1;
        int iCharAt = str.charAt(iM1078o) | ' ';
        if (iCharAt == 102) {
            c0630y0.m1067c("alse", i5);
            z6 = false;
        } else {
            if (iCharAt != 116) {
                C0630y0.m1064l(c0630y0, "Expected valid boolean literal prefix, but had '" + c0630y0.m1073i() + '\'', 0, 6);
                throw null;
            }
            c0630y0.m1067c("rue", i5);
            z6 = true;
        }
        if (!z5) {
            return z6;
        }
        if (c0630y0.f1999b == str.length()) {
            C0630y0.m1064l(c0630y0, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(c0630y0.f1999b) == '\"') {
            c0630y0.f1999b++;
            return z6;
        }
        C0630y0.m1064l(c0630y0, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p231r3.InterfaceC3152b
    /* JADX INFO: renamed from: d */
    public final boolean mo5425d() {
        C3340d c3340d = this.f10395e;
        if (!(c3340d != null ? c3340d.f10387b : false)) {
            C0630y0 c0630y0 = this.f10393c;
            int iM1078o = c0630y0.m1078o(c0630y0.m1079p());
            String str = (String) c0630y0.f2004g;
            int length = str.length() - iM1078o;
            boolean z5 = false;
            if (length >= 4 && iM1078o != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 < 4) {
                        if ("null".charAt(i5) != str.charAt(iM1078o + i5)) {
                            break;
                        }
                        i5++;
                    } else if (length <= 4 || AbstractC3341e.m5583b(str.charAt(iM1078o + 4)) != 0) {
                        z5 = true;
                        c0630y0.f1999b = iM1078o + 4;
                    }
                }
            }
            if (!z5) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p231r3.InterfaceC3152b
    /* JADX INFO: renamed from: e */
    public final Object mo5426e(InterfaceC2798a interfaceC2798a) {
        AbstractC1665j.m2985e(interfaceC2798a, "deserializer");
        try {
            return interfaceC2798a.mo1483b(this);
        } catch (C2799b e5) {
            String message = e5.getMessage();
            AbstractC1665j.m2982b(message);
            if (AbstractC1976d.m3629W(message, "at path")) {
                throw e5;
            }
            String str = e5.getMessage() + " at path: " + ((C2748g) this.f10393c.f2001d).m4863a();
            AbstractC1665j.m2985e(str, "message");
            throw new C2799b(str, e5, e5.f8823d, e5.f8824e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p231r3.InterfaceC3152b
    /* JADX INFO: renamed from: f */
    public final int mo5427f() {
        C0630y0 c0630y0 = this.f10393c;
        long jM1071g = c0630y0.m1071g();
        int i5 = (int) jM1071g;
        if (jM1071g == i5) {
            return i5;
        }
        C0630y0.m1064l(c0630y0, "Failed to parse int for input '" + jM1071g + '\'', 0, 6);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p231r3.InterfaceC3152b
    /* JADX INFO: renamed from: g */
    public final String mo5428g() {
        return this.f10393c.m1072h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m5589h(InterfaceC2933d interfaceC2933d, int i5) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        return mo5424c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX INFO: renamed from: i */
    public final int m5590i(InterfaceC2933d interfaceC2933d) {
        byte b2;
        byte b5;
        byte b6;
        boolean z5;
        Object objMo6a;
        C0630y0 c0630y0 = this.f10393c;
        C2748g c2748g = (C2748g) c0630y0.f2001d;
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        EnumC3345i enumC3345i = this.f10392b;
        int iOrdinal = enumC3345i.ordinal();
        Throwable th = null;
        char c5 = ':';
        boolean zM1080q = false;
        AbstractC3214c abstractC3214c = this.f10391a;
        byte b7 = 1;
        int i5 = -1;
        if (iOrdinal == 0) {
            boolean zM1080q2 = c0630y0.m1080q();
            while (true) {
                boolean zM1066b = c0630y0.m1066b();
                Throwable th2 = th;
                C3340d c3340d = this.f10395e;
                if (zM1066b) {
                    String strM1068d = c0630y0.m1068d();
                    c0630y0.m1070f(c5);
                    AbstractC1665j.m2985e(interfaceC2933d, "<this>");
                    AbstractC1665j.m2985e(abstractC3214c, "json");
                    AbstractC1665j.m2985e(strM1068d, "name");
                    AbstractC3341e.m5587f(interfaceC2933d, abstractC3214c);
                    int iMo5130a = interfaceC2933d.mo5130a(strM1068d);
                    if (iMo5130a == -3 && abstractC3214c.f9997a.f10004e) {
                        C1753n c1753n = abstractC3214c.f9999c;
                        b2 = b7;
                        C0073m c0073m = new C0073m(27, interfaceC2933d, abstractC3214c);
                        c1753n.getClass();
                        c1753n.getClass();
                        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
                        Map map = (Map) ((ConcurrentHashMap) c1753n.f6028e).get(interfaceC2933d);
                        C3342f c3342f = AbstractC3341e.f10388a;
                        Object obj = map != null ? map.get(c3342f) : null;
                        Object obj2 = obj != null ? obj : null;
                        if (obj2 != null) {
                            objMo6a = obj2;
                        } else {
                            objMo6a = c0073m.mo6a();
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1753n.f6028e;
                            Object concurrentHashMap2 = concurrentHashMap.get(interfaceC2933d);
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap(2);
                                concurrentHashMap.put(interfaceC2933d, concurrentHashMap2);
                            }
                            ((Map) concurrentHashMap2).put(c3342f, objMo6a);
                        }
                        Integer num = (Integer) ((Map) objMo6a).get(strM1068d);
                        iMo5130a = num != null ? num.intValue() : -3;
                    } else {
                        b2 = b7;
                    }
                    if (iMo5130a != -3) {
                        if (c3340d != null) {
                            C3189e c3189e = c3340d.f10386a;
                            if (iMo5130a < 64) {
                                c3189e.f9944c |= 1 << iMo5130a;
                            } else {
                                int i6 = (iMo5130a >>> 6) - 1;
                                long[] jArr = c3189e.f9945d;
                                jArr[i6] = jArr[i6] | (1 << (iMo5130a & 63));
                            }
                        }
                        i5 = iMo5130a;
                    } else {
                        if (!AbstractC3341e.m5585d(interfaceC2933d, abstractC3214c)) {
                            int i7 = c2748g.f8736b;
                            int[] iArr = (int[]) c2748g.f8739e;
                            if (iArr[i7] == -2) {
                                iArr[i7] = -1;
                                c2748g.f8736b = i7 - 1;
                            }
                            int i8 = c2748g.f8736b;
                            if (i8 != -1) {
                                c2748g.f8736b = i8 - 1;
                            }
                            c0630y0.m1075k(AbstractC1976d.m3638f0(6, ((String) c0630y0.f2004g).subSequence(0, c0630y0.f1999b).toString(), strM1068d), "Encountered an unknown key '" + strM1068d + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                            throw th2;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte bM1077n = c0630y0.m1077n();
                        byte b8 = 6;
                        if (bM1077n == 8 || bM1077n == 6) {
                            while (true) {
                                byte bM1077n2 = c0630y0.m1077n();
                                b5 = b2;
                                if (bM1077n2 == b5) {
                                    c0630y0.m1068d();
                                    b2 = b5;
                                } else {
                                    if (bM1077n2 == 8 || bM1077n2 == b8) {
                                        b6 = b8;
                                        z5 = false;
                                        arrayList.add(Byte.valueOf(bM1077n2));
                                    } else if (bM1077n2 != 9) {
                                        b6 = 6;
                                        if (bM1077n2 != 7) {
                                            z5 = false;
                                            if (bM1077n2 == 10) {
                                                C0630y0.m1064l(c0630y0, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
                                                throw th2;
                                            }
                                        } else {
                                            if (((Number) AbstractC0973m.m2017X(arrayList)).byteValue() != 6) {
                                                C0630y0.m1064l(c0630y0, "found } instead of ]", 0, 6);
                                                throw th2;
                                            }
                                            if (arrayList.isEmpty()) {
                                                throw new NoSuchElementException("List is empty.");
                                            }
                                            arrayList.remove(AbstractC2352g.m4208u(arrayList));
                                            z5 = false;
                                        }
                                    } else {
                                        if (((Number) AbstractC0973m.m2017X(arrayList)).byteValue() != 8) {
                                            C0630y0.m1064l(c0630y0, "found ] instead of }", 0, 6);
                                            throw th2;
                                        }
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(AbstractC2352g.m4208u(arrayList));
                                        z5 = false;
                                        b6 = 6;
                                    }
                                    c0630y0.m1069e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                    b2 = b5;
                                    b8 = b6;
                                }
                            }
                        } else {
                            c0630y0.m1073i();
                            b6 = 6;
                            b5 = b2;
                            z5 = false;
                        }
                        zM1080q2 = c0630y0.m1080q();
                        boolean z6 = z5;
                        b7 = b5;
                        zM1080q = z6;
                        th = th2;
                        c5 = ':';
                    }
                } else {
                    ?? r12 = zM1080q;
                    if (zM1080q2) {
                        C3216e c3216e = abstractC3214c.f9997a;
                        AbstractC3341e.m5586e(c0630y0, "object");
                        throw th2;
                    }
                    if (c3340d != null) {
                        C3189e c3189e2 = c3340d.f10386a;
                        C2229t c2229t = c3189e2.f9943b;
                        InterfaceC2933d interfaceC2933d2 = c3189e2.f9942a;
                        int iMo5133d = interfaceC2933d2.mo5133d();
                        while (true) {
                            long j5 = c3189e2.f9944c;
                            long j6 = -1;
                            if (j5 != -1) {
                                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j5);
                                c3189e2.f9944c |= 1 << iNumberOfTrailingZeros;
                                if (((Boolean) c2229t.mo0g(interfaceC2933d2, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                    i5 = iNumberOfTrailingZeros;
                                    break;
                                }
                            } else if (iMo5133d > 64) {
                                long[] jArr2 = c3189e2.f9945d;
                                int length = jArr2.length;
                                loop3: while (true) {
                                    if (r12 >= length) {
                                        break;
                                    }
                                    int i9 = r12 + 1;
                                    int i10 = i9 * 64;
                                    long j7 = jArr2[r12];
                                    while (j7 != j6) {
                                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j7);
                                        j7 |= 1 << iNumberOfTrailingZeros2;
                                        int i11 = iNumberOfTrailingZeros2 + i10;
                                        if (((Boolean) c2229t.mo0g(interfaceC2933d2, Integer.valueOf(i11))).booleanValue()) {
                                            jArr2[r12] = j7;
                                            i5 = i11;
                                            break loop3;
                                        }
                                        j6 = -1;
                                    }
                                    jArr2[r12] = j7;
                                    r12 = i9;
                                    j6 = -1;
                                }
                            }
                        }
                    }
                }
            }
        } else if (iOrdinal != 2) {
            boolean zM1080q3 = c0630y0.m1080q();
            if (c0630y0.m1066b()) {
                int i12 = this.f10394d;
                if (i12 != -1 && !zM1080q3) {
                    C0630y0.m1064l(c0630y0, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i5 = i12 + 1;
                this.f10394d = i5;
            } else if (zM1080q3) {
                C3216e c3216e2 = abstractC3214c.f9997a;
                AbstractC3341e.m5586e(c0630y0, "array");
                throw null;
            }
        } else {
            int i13 = this.f10394d;
            boolean z7 = i13 % 2 != 0;
            if (!z7) {
                c0630y0.m1070f(':');
            } else if (i13 != -1) {
                zM1080q = c0630y0.m1080q();
            }
            if (c0630y0.m1066b()) {
                if (z7) {
                    if (this.f10394d == -1) {
                        int i14 = c0630y0.f1999b;
                        if (zM1080q) {
                            C0630y0.m1064l(c0630y0, "Unexpected leading comma", i14, 4);
                            throw null;
                        }
                    } else {
                        int i15 = c0630y0.f1999b;
                        if (!zM1080q) {
                            C0630y0.m1064l(c0630y0, "Expected comma after the key-value pair", i15, 4);
                            throw null;
                        }
                    }
                }
                i5 = this.f10394d + 1;
                this.f10394d = i5;
            } else if (zM1080q) {
                C3216e c3216e3 = abstractC3214c.f9997a;
                AbstractC3341e.m5586e(c0630y0, "object");
                throw null;
            }
        }
        if (enumC3345i != EnumC3345i.f10400h) {
            ((int[]) c2748g.f8739e)[c2748g.f8736b] = i5;
        }
        return i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m5591j(InterfaceC2933d interfaceC2933d, int i5) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        return mo5427f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final long m5592k(InterfaceC2933d interfaceC2933d, int i5) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        return mo5423b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Object m5593l(InterfaceC2933d interfaceC2933d, int i5, String str) {
        C3201q c3201q = C3201q.f9974a;
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        C3201q.f9975b.getClass();
        if (mo5425d()) {
            return mo5426e(c3201q);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Object m5594m(InterfaceC2933d interfaceC2933d, int i5, InterfaceC2798a interfaceC2798a, Object obj) {
        C2748g c2748g = (C2748g) this.f10393c.f2001d;
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        AbstractC1665j.m2985e(interfaceC2798a, "deserializer");
        boolean z5 = this.f10392b == EnumC3345i.f10400h && (i5 & 1) == 0;
        if (z5) {
            int[] iArr = (int[]) c2748g.f8739e;
            int i6 = c2748g.f8736b;
            if (iArr[i6] == -2) {
                ((Object[]) c2748g.f8738d)[i6] = C3342f.f10390b;
            }
        }
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        AbstractC1665j.m2985e(interfaceC2798a, "deserializer");
        Object objMo5426e = mo5426e(interfaceC2798a);
        if (z5) {
            int[] iArr2 = (int[]) c2748g.f8739e;
            int i7 = c2748g.f8736b;
            if (iArr2[i7] != -2) {
                int i8 = i7 + 1;
                c2748g.f8736b = i8;
                if (i8 == ((Object[]) c2748g.f8738d).length) {
                    c2748g.m4866d();
                }
            }
            Object[] objArr = (Object[]) c2748g.f8738d;
            int i9 = c2748g.f8736b;
            objArr[i9] = ((C3216e) c2748g.f8737c).f10006g ? objMo5426e : C3342f.f10389a;
            ((int[]) c2748g.f8739e)[i9] = -2;
        }
        return objMo5426e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final String m5595n(InterfaceC2933d interfaceC2933d, int i5) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        return mo5428g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m5596o(InterfaceC2933d interfaceC2933d) {
        AbstractC1665j.m2985e(interfaceC2933d, "descriptor");
        int iMo5133d = interfaceC2933d.mo5133d();
        AbstractC3214c abstractC3214c = this.f10391a;
        if (iMo5133d == 0 && AbstractC3341e.m5585d(interfaceC2933d, abstractC3214c)) {
            while (m5590i(interfaceC2933d) != -1) {
            }
        }
        C0630y0 c0630y0 = this.f10393c;
        if (c0630y0.m1080q()) {
            C3216e c3216e = abstractC3214c.f9997a;
            AbstractC3341e.m5586e(c0630y0, "");
            throw null;
        }
        c0630y0.m1070f(this.f10392b.f10405e);
        C2748g c2748g = (C2748g) c0630y0.f2001d;
        int i5 = c2748g.f8736b;
        int[] iArr = (int[]) c2748g.f8739e;
        if (iArr[i5] == -2) {
            iArr[i5] = -1;
            c2748g.f8736b = i5 - 1;
        }
        int i6 = c2748g.f8736b;
        if (i6 != -1) {
            c2748g.f8736b = i6 - 1;
        }
    }
}
