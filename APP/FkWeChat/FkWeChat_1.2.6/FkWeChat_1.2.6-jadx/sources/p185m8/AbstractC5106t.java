package p185m8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1027c;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p080f9.AbstractC2368o;
import p080f9.C2363j;
import p172l8.AbstractC4717x;
import p215oc.C5704b;
import p299ub.AbstractC8635q;
import p376zd.C9987e;
import sb.AbstractC7291q;
import sb.InterfaceC7282h;

/* JADX INFO: renamed from: m8.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5106t extends AbstractC5102r {

    /* JADX INFO: renamed from: m8.t$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterable, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ Object[] f15417q;

        public a(Object[] objArr) {
            this.f15417q = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC1027c.m3774a(this.f15417q);
        }
    }

    /* JADX INFO: renamed from: m8.t$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC7282h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object[] f15418a;

        public b(Object[] objArr) {
            this.f15418a = objArr;
        }

        @Override // sb.InterfaceC7282h
        public Iterator iterator() {
            return AbstractC1027c.m3774a(this.f15418a);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static Float m20680A0(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    /* JADX INFO: renamed from: B0 */
    public static Integer m20681B0(int[] iArr) {
        iArr.getClass();
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    /* JADX INFO: renamed from: C0 */
    public static Object m20682C0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    /* JADX INFO: renamed from: D0 */
    public static Integer m20683D0(int[] iArr) {
        iArr.getClass();
        if (iArr.length == 0) {
            return null;
        }
        int i10 = iArr[0];
        int iM20728d0 = m20728d0(iArr);
        int i11 = 1;
        if (1 <= iM20728d0) {
            while (true) {
                int i12 = iArr[i11];
                if (i10 < i12) {
                    i10 = i12;
                }
                if (i11 == iM20728d0) {
                    break;
                }
                i11++;
            }
        }
        return Integer.valueOf(i10);
    }

    /* JADX INFO: renamed from: E0 */
    public static void m20684E0(Object[] objArr) {
        objArr.getClass();
        int length = (objArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iM20732f0 = m20732f0(objArr);
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            Object obj = objArr[i10];
            objArr[i10] = objArr[iM20732f0];
            objArr[iM20732f0] = obj;
            iM20732f0--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    public static char m20685F0(char[] cArr) {
        cArr.getClass();
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        C9987e.m38645a("Array has more than one element.");
        return (char) 0;
    }

    /* JADX INFO: renamed from: G0 */
    public static Object m20686G0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        C9987e.m38645a("Array has more than one element.");
        return null;
    }

    /* JADX INFO: renamed from: H0 */
    public static Object m20687H0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: I0 */
    public static List m20688I0(int[] iArr, C2363j c2363j) {
        iArr.getClass();
        c2363j.getClass();
        return c2363j.isEmpty() ? AbstractC5114x.m20800o() : AbstractC5102r.m20651c(AbstractC5102r.m20667s(iArr, c2363j.m8568v().intValue(), c2363j.m8567u().intValue() + 1));
    }

    /* JADX INFO: renamed from: J0 */
    public static byte[] m20689J0(byte[] bArr, C2363j c2363j) {
        bArr.getClass();
        c2363j.getClass();
        return c2363j.isEmpty() ? new byte[0] : AbstractC5102r.m20666r(bArr, c2363j.m8568v().intValue(), c2363j.m8567u().intValue() + 1);
    }

    /* JADX INFO: renamed from: K0 */
    public static final Object[] m20691K0(Object[] objArr, Comparator comparator) {
        objArr.getClass();
        comparator.getClass();
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC5102r.m20649I(objArrCopyOf, comparator);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: L */
    public static Iterable m20692L(Object[] objArr) {
        objArr.getClass();
        return objArr.length == 0 ? AbstractC5114x.m20800o() : new a(objArr);
    }

    /* JADX INFO: renamed from: L0 */
    public static List m20693L0(Object[] objArr, Comparator comparator) {
        objArr.getClass();
        comparator.getClass();
        return AbstractC5102r.m20652d(m20691K0(objArr, comparator));
    }

    /* JADX INFO: renamed from: M */
    public static InterfaceC7282h m20694M(Object[] objArr) {
        objArr.getClass();
        return objArr.length == 0 ? AbstractC7291q.m28881i() : new b(objArr);
    }

    /* JADX INFO: renamed from: M0 */
    public static int m20695M0(int[] iArr) {
        iArr.getClass();
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        return i10;
    }

    /* JADX INFO: renamed from: N */
    public static boolean m20696N(byte[] bArr, byte b10) {
        bArr.getClass();
        return m20738i0(bArr, b10) >= 0;
    }

    /* JADX INFO: renamed from: N0 */
    public static final List m20697N0(Object[] objArr, int i10) {
        objArr.getClass();
        if (i10 < 0) {
            C5704b.m23087a("Requested element count ", i10, " is less than zero.");
            return null;
        }
        if (i10 == 0) {
            return AbstractC5114x.m20800o();
        }
        int length = objArr.length;
        return i10 >= length ? m20713V0(objArr) : i10 == 1 ? AbstractC5112w.m20789e(objArr[length - 1]) : AbstractC5102r.m20652d(AbstractC5102r.m20668t(objArr, length - i10, length));
    }

    /* JADX INFO: renamed from: O */
    public static boolean m20698O(char[] cArr, char c10) {
        cArr.getClass();
        return m20740j0(cArr, c10) >= 0;
    }

    /* JADX INFO: renamed from: O0 */
    public static final Collection m20699O0(Object[] objArr, Collection collection) {
        objArr.getClass();
        collection.getClass();
        for (Object obj : objArr) {
            collection.add(obj);
        }
        return collection;
    }

    /* JADX INFO: renamed from: P */
    public static boolean m20700P(int[] iArr, int i10) {
        iArr.getClass();
        return m20742k0(iArr, i10) >= 0;
    }

    /* JADX INFO: renamed from: P0 */
    public static List m20701P0(byte[] bArr) {
        bArr.getClass();
        int length = bArr.length;
        return length != 0 ? length != 1 ? m20719Y0(bArr) : AbstractC5112w.m20789e(Byte.valueOf(bArr[0])) : AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m20702Q(long[] jArr, long j10) {
        jArr.getClass();
        return m20744l0(jArr, j10) >= 0;
    }

    /* JADX INFO: renamed from: Q0 */
    public static List m20703Q0(char[] cArr) {
        cArr.getClass();
        int length = cArr.length;
        return length != 0 ? length != 1 ? m20721Z0(cArr) : AbstractC5112w.m20789e(Character.valueOf(cArr[0])) : AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: R */
    public static boolean m20704R(Object[] objArr, Object obj) {
        objArr.getClass();
        return m20746m0(objArr, obj) >= 0;
    }

    /* JADX INFO: renamed from: R0 */
    public static List m20705R0(double[] dArr) {
        dArr.getClass();
        int length = dArr.length;
        return length != 0 ? length != 1 ? m20723a1(dArr) : AbstractC5112w.m20789e(Double.valueOf(dArr[0])) : AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: S */
    public static boolean m20706S(short[] sArr, short s10) {
        sArr.getClass();
        return m20747n0(sArr, s10) >= 0;
    }

    /* JADX INFO: renamed from: S0 */
    public static List m20707S0(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        return length != 0 ? length != 1 ? m20725b1(fArr) : AbstractC5112w.m20789e(Float.valueOf(fArr[0])) : AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: T */
    public static List m20708T(Object[] objArr, int i10) {
        objArr.getClass();
        if (i10 >= 0) {
            return m20697N0(objArr, AbstractC2368o.m8578e(objArr.length - i10, 0));
        }
        C5704b.m23087a("Requested element count ", i10, " is less than zero.");
        return null;
    }

    /* JADX INFO: renamed from: T0 */
    public static List m20709T0(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        return length != 0 ? length != 1 ? m20727c1(iArr) : AbstractC5112w.m20789e(Integer.valueOf(iArr[0])) : AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: U */
    public static List m20710U(Object[] objArr) {
        objArr.getClass();
        return (List) m20712V(objArr, new ArrayList());
    }

    /* JADX INFO: renamed from: U0 */
    public static List m20711U0(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        return length != 0 ? length != 1 ? m20729d1(jArr) : AbstractC5112w.m20789e(Long.valueOf(jArr[0])) : AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: V */
    public static final Collection m20712V(Object[] objArr, Collection collection) {
        objArr.getClass();
        collection.getClass();
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
        return collection;
    }

    /* JADX INFO: renamed from: V0 */
    public static List m20713V0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        return length != 0 ? length != 1 ? AbstractC5102r.m20652d(Arrays.copyOf(objArr, objArr.length)) : AbstractC5112w.m20789e(objArr[0]) : AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: W */
    public static int m20714W(int[] iArr) {
        iArr.getClass();
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: W0 */
    public static List m20715W0(short[] sArr) {
        sArr.getClass();
        int length = sArr.length;
        return length != 0 ? length != 1 ? m20733f1(sArr) : AbstractC5112w.m20789e(Short.valueOf(sArr[0])) : AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: X */
    public static Object m20716X(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: X0 */
    public static List m20717X0(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        return length != 0 ? length != 1 ? m20735g1(zArr) : AbstractC5112w.m20789e(Boolean.valueOf(zArr[0])) : AbstractC5114x.m20800o();
    }

    /* JADX INFO: renamed from: Y */
    public static Float m20718Y(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    /* JADX INFO: renamed from: Y0 */
    public static final List m20719Y0(byte[] bArr) {
        bArr.getClass();
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b10 : bArr) {
            arrayList.add(Byte.valueOf(b10));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: Z */
    public static Object m20720Z(Object[] objArr) {
        objArr.getClass();
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    /* JADX INFO: renamed from: Z0 */
    public static final List m20721Z0(char[] cArr) {
        cArr.getClass();
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c10 : cArr) {
            arrayList.add(Character.valueOf(c10));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a0 */
    public static C2363j m20722a0(int[] iArr) {
        iArr.getClass();
        return new C2363j(0, m20728d0(iArr));
    }

    /* JADX INFO: renamed from: a1 */
    public static final List m20723a1(double[] dArr) {
        dArr.getClass();
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d10 : dArr) {
            arrayList.add(Double.valueOf(d10));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b0 */
    public static C2363j m20724b0(Object[] objArr) {
        objArr.getClass();
        return new C2363j(0, m20732f0(objArr));
    }

    /* JADX INFO: renamed from: b1 */
    public static final List m20725b1(float[] fArr) {
        fArr.getClass();
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c0 */
    public static int m20726c0(float[] fArr) {
        fArr.getClass();
        return fArr.length - 1;
    }

    /* JADX INFO: renamed from: c1 */
    public static final List m20727c1(int[] iArr) {
        iArr.getClass();
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d0 */
    public static int m20728d0(int[] iArr) {
        iArr.getClass();
        return iArr.length - 1;
    }

    /* JADX INFO: renamed from: d1 */
    public static final List m20729d1(long[] jArr) {
        jArr.getClass();
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e0 */
    public static int m20730e0(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    /* JADX INFO: renamed from: e1 */
    public static List m20731e1(Object[] objArr) {
        objArr.getClass();
        return new ArrayList(AbstractC5114x.m20795j(objArr, false, 1, null));
    }

    /* JADX INFO: renamed from: f0 */
    public static int m20732f0(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    /* JADX INFO: renamed from: f1 */
    public static final List m20733f1(short[] sArr) {
        sArr.getClass();
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s10 : sArr) {
            arrayList.add(Short.valueOf(s10));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g0 */
    public static Integer m20734g0(int[] iArr, int i10) {
        iArr.getClass();
        if (i10 < 0 || i10 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i10]);
    }

    /* JADX INFO: renamed from: g1 */
    public static final List m20735g1(boolean[] zArr) {
        zArr.getClass();
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z10 : zArr) {
            arrayList.add(Boolean.valueOf(z10));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public static Object m20736h0(Object[] objArr, int i10) {
        objArr.getClass();
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    /* JADX INFO: renamed from: h1 */
    public static Set m20737h1(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) m20699O0(objArr, new LinkedHashSet(AbstractC5107t0.m20763e(objArr.length))) : AbstractC5065a1.m20479d(objArr[0]) : AbstractC5068b1.m20483e();
    }

    /* JADX INFO: renamed from: i0 */
    public static final int m20738i0(byte[] bArr, byte b10) {
        bArr.getClass();
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: i1 */
    public static Iterable m20739i1(final Object[] objArr) {
        objArr.getClass();
        return new C5097o0(new InterfaceC0173a() { // from class: m8.s
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return AbstractC5106t.m20741j1(objArr);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public static final int m20740j0(char[] cArr, char c10) {
        cArr.getClass();
        int length = cArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c10 == cArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j1 */
    public static final Iterator m20741j1(Object[] objArr) {
        return AbstractC1027c.m3774a(objArr);
    }

    /* JADX INFO: renamed from: k0 */
    public static final int m20742k0(int[] iArr, int i10) {
        iArr.getClass();
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: k1 */
    public static List m20743k1(Object[] objArr, Iterable iterable) {
        objArr.getClass();
        iterable.getClass();
        int length = objArr.length;
        ArrayList arrayList = new ArrayList(Math.min(AbstractC5116y.m20814z(iterable, 10), length));
        int i10 = 0;
        for (Object obj : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(AbstractC4717x.m18815a(objArr[i10], obj));
            i10++;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l0 */
    public static final int m20744l0(long[] jArr, long j10) {
        jArr.getClass();
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (j10 == jArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: l1 */
    public static List m20745l1(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(AbstractC4717x.m18815a(objArr[i10], objArr2[i10]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m0 */
    public static int m20746m0(Object[] objArr, Object obj) {
        objArr.getClass();
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (AbstractC1061t.m3842c(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: n0 */
    public static final int m20747n0(short[] sArr, short s10) {
        sArr.getClass();
        int length = sArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (s10 == sArr[i10]) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: o0 */
    public static final Appendable m20748o0(byte[] bArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l) throws IOException {
        bArr.getClass();
        appendable.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        appendable.append(charSequence2);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (interfaceC0184l != null) {
                appendable.append((CharSequence) interfaceC0184l.mo27m(Byte.valueOf(b10)));
            } else {
                appendable.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* JADX INFO: renamed from: p0 */
    public static final Appendable m20749p0(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l) throws IOException {
        objArr.getClass();
        appendable.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        appendable.append(charSequence2);
        int i11 = 0;
        for (Object obj : objArr) {
            i11++;
            if (i11 > 1) {
                appendable.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            AbstractC8635q.m33234a(appendable, obj, interfaceC0184l);
        }
        if (i10 >= 0 && i11 > i10) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Appendable m20750q0(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l, int i11, Object obj) {
        CharSequence charSequence5 = (i11 & 2) != 0 ? ", " : charSequence;
        int i12 = i11 & 4;
        CharSequence charSequence6 = _UrlKt.FRAGMENT_ENCODE_SET;
        CharSequence charSequence7 = i12 != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : charSequence2;
        if ((i11 & 8) == 0) {
            charSequence6 = charSequence3;
        }
        return m20749p0(objArr, appendable, charSequence5, charSequence7, charSequence6, (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : interfaceC0184l);
    }

    /* JADX INFO: renamed from: r0 */
    public static final String m20751r0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l) {
        bArr.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        return ((StringBuilder) m20748o0(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC0184l)).toString();
    }

    /* JADX INFO: renamed from: s0 */
    public static final String m20752s0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l) {
        objArr.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        charSequence3.getClass();
        charSequence4.getClass();
        return ((StringBuilder) m20749p0(objArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC0184l)).toString();
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ String m20753t0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i11 & 4) != 0) {
            charSequence3 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            interfaceC0184l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC0184l interfaceC0184l2 = interfaceC0184l;
        return m20751r0(bArr, charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC0184l2);
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ String m20754u0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC0184l interfaceC0184l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i11 & 4) != 0) {
            charSequence3 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            interfaceC0184l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC0184l interfaceC0184l2 = interfaceC0184l;
        return m20752s0(objArr, charSequence, charSequence2, charSequence3, i10, charSequence5, interfaceC0184l2);
    }

    /* JADX INFO: renamed from: v0 */
    public static Object m20755v0(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[m20732f0(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* JADX INFO: renamed from: w0 */
    public static final int m20756w0(int[] iArr, int i10) {
        iArr.getClass();
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (i10 == iArr[length]) {
                    return length;
                }
                if (i11 < 0) {
                    break;
                }
                length = i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: x0 */
    public static int m20757x0(Object[] objArr, Object obj) {
        objArr.getClass();
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (AbstractC1061t.m3842c(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: y0 */
    public static Boolean m20758y0(boolean[] zArr) {
        zArr.getClass();
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    /* JADX INFO: renamed from: z0 */
    public static Character m20759z0(char[] cArr) {
        cArr.getClass();
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }
}
