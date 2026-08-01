package p185m8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: m8.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5102r extends AbstractC5100q {

    /* JADX INFO: renamed from: m8.r$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC5078f implements RandomAccess {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ int[] f15415r;

        public a(int[] iArr) {
            this.f15415r = iArr;
        }

        @Override // p185m8.AbstractC5066b
        /* JADX INFO: renamed from: c */
        public int mo31c() {
            return this.f15415r.length;
        }

        @Override // p185m8.AbstractC5066b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return m20675e(((Number) obj).intValue());
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public boolean m20675e(int i10) {
            return AbstractC5106t.m20700P(this.f15415r, i10);
        }

        @Override // p185m8.AbstractC5078f, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return m20677o(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // p185m8.AbstractC5066b, java.util.Collection
        public boolean isEmpty() {
            return this.f15415r.length == 0;
        }

        @Override // p185m8.AbstractC5078f, java.util.List
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            return Integer.valueOf(this.f15415r[i10]);
        }

        @Override // p185m8.AbstractC5078f, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return m20678p(((Number) obj).intValue());
            }
            return -1;
        }

        /* JADX INFO: renamed from: o */
        public int m20677o(int i10) {
            return AbstractC5106t.m20742k0(this.f15415r, i10);
        }

        /* JADX INFO: renamed from: p */
        public int m20678p(int i10) {
            return AbstractC5106t.m20756w0(this.f15415r, i10);
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m20641A(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        m20672x(objArr, obj, i10, i11);
    }

    /* JADX INFO: renamed from: B */
    public static int[] m20642B(int[] iArr, int i10) {
        iArr.getClass();
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
        iArrCopyOf[length] = i10;
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: C */
    public static int[] m20643C(int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: D */
    public static Object[] m20644D(Object[] objArr, Object obj) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: E */
    public static Object[] m20645E(Object[] objArr, Object[] objArr2) {
        objArr.getClass();
        objArr2.getClass();
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, objArrCopyOf, length, length2);
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: F */
    public static void m20646F(int[] iArr) {
        iArr.getClass();
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m20647G(int[] iArr, int i10, int i11) {
        iArr.getClass();
        Arrays.sort(iArr, i10, i11);
    }

    /* JADX INFO: renamed from: H */
    public static final void m20648H(Object[] objArr) {
        objArr.getClass();
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m20649I(Object[] objArr, Comparator comparator) {
        objArr.getClass();
        comparator.getClass();
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    /* JADX INFO: renamed from: J */
    public static void m20650J(Object[] objArr, Comparator comparator, int i10, int i11) {
        objArr.getClass();
        comparator.getClass();
        Arrays.sort(objArr, i10, i11, comparator);
    }

    /* JADX INFO: renamed from: c */
    public static List m20651c(int[] iArr) {
        iArr.getClass();
        return new a(iArr);
    }

    /* JADX INFO: renamed from: d */
    public static List m20652d(Object[] objArr) {
        objArr.getClass();
        List listM20767a = AbstractC5108u.m20767a(objArr);
        listM20767a.getClass();
        return listM20767a;
    }

    /* JADX INFO: renamed from: e */
    public static final int m20653e(float[] fArr, float f10, int i10, int i11) {
        fArr.getClass();
        return Arrays.binarySearch(fArr, i10, i11, f10);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m20654f(float[] fArr, float f10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = fArr.length;
        }
        return m20653e(fArr, f10, i10, i11);
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m20655g(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    /* JADX INFO: renamed from: h */
    public static char[] m20656h(char[] cArr, char[] cArr2, int i10, int i11, int i12) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
        return cArr2;
    }

    /* JADX INFO: renamed from: i */
    public static float[] m20657i(float[] fArr, float[] fArr2, int i10, int i11, int i12) {
        fArr.getClass();
        fArr2.getClass();
        System.arraycopy(fArr, i11, fArr2, i10, i12 - i11);
        return fArr2;
    }

    /* JADX INFO: renamed from: j */
    public static int[] m20658j(int[] iArr, int[] iArr2, int i10, int i11, int i12) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
        return iArr2;
    }

    /* JADX INFO: renamed from: k */
    public static long[] m20659k(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i11, jArr2, i10, i12 - i11);
        return jArr2;
    }

    /* JADX INFO: renamed from: l */
    public static Object[] m20660l(Object[] objArr, Object[] objArr2, int i10, int i11, int i12) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
        return objArr2;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ byte[] m20661m(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return m20655g(bArr, bArr2, i10, i11, i12);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ float[] m20662n(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return m20657i(fArr, fArr2, i10, i11, i12);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ int[] m20663o(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return m20658j(iArr, iArr2, i10, i11, i12);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ long[] m20664p(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length;
        }
        return m20659k(jArr, jArr2, i10, i11, i12);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object[] m20665q(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return m20660l(objArr, objArr2, i10, i11, i12);
    }

    /* JADX INFO: renamed from: r */
    public static byte[] m20666r(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        AbstractC5098p.m20639b(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    /* JADX INFO: renamed from: s */
    public static final int[] m20667s(int[] iArr, int i10, int i11) {
        iArr.getClass();
        AbstractC5098p.m20639b(i11, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i10, i11);
        iArrCopyOfRange.getClass();
        return iArrCopyOfRange;
    }

    /* JADX INFO: renamed from: t */
    public static Object[] m20668t(Object[] objArr, int i10, int i11) {
        objArr.getClass();
        AbstractC5098p.m20639b(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    /* JADX INFO: renamed from: u */
    public static void m20669u(byte[] bArr, byte b10, int i10, int i11) {
        bArr.getClass();
        Arrays.fill(bArr, i10, i11, b10);
    }

    /* JADX INFO: renamed from: v */
    public static final void m20670v(int[] iArr, int i10, int i11, int i12) {
        iArr.getClass();
        Arrays.fill(iArr, i11, i12, i10);
    }

    /* JADX INFO: renamed from: w */
    public static void m20671w(long[] jArr, long j10, int i10, int i11) {
        jArr.getClass();
        Arrays.fill(jArr, i10, i11, j10);
    }

    /* JADX INFO: renamed from: x */
    public static void m20672x(Object[] objArr, Object obj, int i10, int i11) {
        objArr.getClass();
        Arrays.fill(objArr, i10, i11, obj);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m20673y(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        m20670v(iArr, i10, i11, i12);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m20674z(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        m20671w(jArr, j10, i10, i11);
    }
}
