package p321w4;

import ae.C0307f;
import com.alibaba.fastjson2.internal.asm.Opcodes;

/* JADX INFO: renamed from: w4.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9184n {

    /* JADX INFO: renamed from: a */
    public final C9174d f31363a;

    /* JADX INFO: renamed from: b */
    public int f31364b;

    /* JADX INFO: renamed from: c */
    public String f31365c;

    /* JADX INFO: renamed from: d */
    public int f31366d;

    /* JADX INFO: renamed from: e */
    public a[] f31367e = new a[256];

    /* JADX INFO: renamed from: f */
    public int f31368f = 1;

    /* JADX INFO: renamed from: g */
    public C9172b f31369g = new C9172b();

    /* JADX INFO: renamed from: h */
    public int f31370h;

    /* JADX INFO: renamed from: i */
    public C9172b f31371i;

    /* JADX INFO: renamed from: j */
    public int f31372j;

    /* JADX INFO: renamed from: k */
    public a[] f31373k;

    public C9184n(C9174d c9174d) {
        this.f31363a = c9174d;
    }

    /* JADX INFO: renamed from: B */
    public static int m35696B(int i10, int i11) {
        return (i10 + i11) & Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: C */
    public static int m35697C(int i10, long j10) {
        return (i10 + ((int) j10) + ((int) (j10 >>> 32))) & Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: D */
    public static int m35698D(int i10, String str) {
        return (i10 + str.hashCode()) & Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: E */
    public static int m35699E(int i10, String str, int i11) {
        return (i10 + str.hashCode() + i11) & Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: F */
    public static int m35700F(int i10, String str, String str2) {
        return (i10 + (str.hashCode() * str2.hashCode())) & Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: G */
    public static int m35701G(int i10, String str, String str2, String str3) {
        return (i10 + (str.hashCode() * str2.hashCode() * str3.hashCode())) & Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: A */
    public AbstractC9183m m35702A(int i10) {
        return this.f31373k[i10];
    }

    /* JADX INFO: renamed from: H */
    public final a m35703H(a aVar) {
        int i10 = this.f31366d;
        a[] aVarArr = this.f31367e;
        if (i10 > (aVarArr.length * 3) / 4) {
            int length = aVarArr.length;
            int i11 = (length * 2) + 1;
            a[] aVarArr2 = new a[i11];
            for (int i12 = length - 1; i12 >= 0; i12--) {
                a aVar2 = this.f31367e[i12];
                while (aVar2 != null) {
                    int i13 = aVar2.f31374h % i11;
                    a aVar3 = aVar2.f31375i;
                    aVar2.f31375i = aVarArr2[i13];
                    aVarArr2[i13] = aVar2;
                    aVar2 = aVar3;
                }
            }
            this.f31367e = aVarArr2;
        }
        this.f31366d++;
        int i14 = aVar.f31374h;
        a[] aVarArr3 = this.f31367e;
        int length2 = i14 % aVarArr3.length;
        aVar.f31375i = aVarArr3[length2];
        aVarArr3[length2] = aVar;
        return aVar;
    }

    /* JADX INFO: renamed from: I */
    public void m35704I(C9172b c9172b) {
        if (this.f31371i != null) {
            C9172b c9172bM35628j = c9172b.m35628j(m35721o("BootstrapMethods")).m35626h(this.f31371i.f31256b + 2).m35628j(this.f31370h);
            C9172b c9172b2 = this.f31371i;
            c9172bM35628j.m35625g(c9172b2.f31255a, 0, c9172b2.f31256b);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m35705J(C9172b c9172b) {
        C9172b c9172bM35628j = c9172b.m35628j(this.f31368f);
        C9172b c9172b2 = this.f31369g;
        c9172bM35628j.m35625g(c9172b2.f31255a, 0, c9172b2.f31256b);
    }

    /* JADX INFO: renamed from: K */
    public int m35706K(int i10, String str) {
        this.f31364b = i10;
        this.f31365c = str;
        return m35708b(str).f31356a;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC9183m m35707a(Object obj) {
        if (obj instanceof Integer) {
            return m35712f(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m35712f(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m35712f(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m35712f(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m35712f(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return m35711e(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return m35715i(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m35709c(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return m35720n((String) obj);
        }
        if (!(obj instanceof C9185o)) {
            C0307f.m923a("value ", obj);
            return null;
        }
        C9185o c9185o = (C9185o) obj;
        int iM35740f = c9185o.m35740f();
        return iM35740f == 10 ? m35708b(c9185o.m35739d()) : iM35740f == 11 ? m35717k(c9185o.m35738c()) : m35708b(c9185o.m35738c());
    }

    /* JADX INFO: renamed from: b */
    public AbstractC9183m m35708b(String str) {
        return m35722p(7, str);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC9183m m35709c(double d10) {
        return m35714h(6, Double.doubleToRawLongBits(d10));
    }

    /* JADX INFO: renamed from: d */
    public AbstractC9183m m35710d(String str, String str2, String str3) {
        return m35716j(9, str, str2, str3);
    }

    /* JADX INFO: renamed from: e */
    public AbstractC9183m m35711e(float f10) {
        return m35713g(4, Float.floatToRawIntBits(f10));
    }

    /* JADX INFO: renamed from: f */
    public AbstractC9183m m35712f(int i10) {
        return m35713g(3, i10);
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC9183m m35713g(int i10, int i11) {
        int iM35696B = m35696B(i10, i11);
        for (a aVarM35728v = m35728v(iM35696B); aVarM35728v != null; aVarM35728v = aVarM35728v.f31375i) {
            if (aVarM35728v.f31357b == i10 && aVarM35728v.f31374h == iM35696B && aVarM35728v.f31361f == i11) {
                return aVarM35728v;
            }
        }
        this.f31369g.m35624f(i10).m35626h(i11);
        int i12 = this.f31368f;
        this.f31368f = i12 + 1;
        return m35703H(new a(i12, i10, i11, iM35696B));
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC9183m m35714h(int i10, long j10) {
        int iM35697C = m35697C(i10, j10);
        for (a aVarM35728v = m35728v(iM35697C); aVarM35728v != null; aVarM35728v = aVarM35728v.f31375i) {
            if (aVarM35728v.f31357b == i10 && aVarM35728v.f31374h == iM35697C && aVarM35728v.f31361f == j10) {
                return aVarM35728v;
            }
        }
        int i11 = this.f31368f;
        this.f31369g.m35624f(i10).m35627i(j10);
        this.f31368f += 2;
        return m35703H(new a(i11, i10, j10, iM35697C));
    }

    /* JADX INFO: renamed from: i */
    public AbstractC9183m m35715i(long j10) {
        return m35714h(5, j10);
    }

    /* JADX INFO: renamed from: j */
    public final a m35716j(int i10, String str, String str2, String str3) {
        int iM35701G = m35701G(i10, str, str2, str3);
        for (a aVarM35728v = m35728v(iM35701G); aVarM35728v != null; aVarM35728v = aVarM35728v.f31375i) {
            if (aVarM35728v.f31357b == i10 && aVarM35728v.f31374h == iM35701G && aVarM35728v.f31358c.equals(str) && aVarM35728v.f31359d.equals(str2) && aVarM35728v.f31360e.equals(str3)) {
                return aVarM35728v;
            }
        }
        this.f31369g.m35623e(i10, m35708b(str).f31356a, m35719m(str2, str3));
        int i11 = this.f31368f;
        this.f31368f = i11 + 1;
        return m35703H(new a(i11, i10, str, str2, str3, 0L, iM35701G));
    }

    /* JADX INFO: renamed from: k */
    public AbstractC9183m m35717k(String str) {
        return m35722p(16, str);
    }

    /* JADX INFO: renamed from: l */
    public AbstractC9183m m35718l(String str, String str2, String str3, boolean z10) {
        return m35716j(z10 ? 11 : 10, str, str2, str3);
    }

    /* JADX INFO: renamed from: m */
    public int m35719m(String str, String str2) {
        int iM35700F = m35700F(12, str, str2);
        for (a aVarM35728v = m35728v(iM35700F); aVarM35728v != null; aVarM35728v = aVarM35728v.f31375i) {
            if (aVarM35728v.f31357b == 12 && aVarM35728v.f31374h == iM35700F && aVarM35728v.f31359d.equals(str) && aVarM35728v.f31360e.equals(str2)) {
                return aVarM35728v.f31356a;
            }
        }
        this.f31369g.m35623e(12, m35721o(str), m35721o(str2));
        int i10 = this.f31368f;
        this.f31368f = i10 + 1;
        return m35703H(new a(i10, 12, str, str2, iM35700F)).f31356a;
    }

    /* JADX INFO: renamed from: n */
    public AbstractC9183m m35720n(String str) {
        return m35722p(8, str);
    }

    /* JADX INFO: renamed from: o */
    public int m35721o(String str) {
        int iM35698D = m35698D(1, str);
        for (a aVarM35728v = m35728v(iM35698D); aVarM35728v != null; aVarM35728v = aVarM35728v.f31375i) {
            if (aVarM35728v.f31357b == 1 && aVarM35728v.f31374h == iM35698D && aVarM35728v.f31360e.equals(str)) {
                return aVarM35728v.f31356a;
            }
        }
        this.f31369g.m35624f(1).m35629k(str);
        int i10 = this.f31368f;
        this.f31368f = i10 + 1;
        return m35703H(new a(i10, 1, str, iM35698D)).f31356a;
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC9183m m35722p(int i10, String str) {
        int iM35698D = m35698D(i10, str);
        for (a aVarM35728v = m35728v(iM35698D); aVarM35728v != null; aVarM35728v = aVarM35728v.f31375i) {
            if (aVarM35728v.f31357b == i10 && aVarM35728v.f31374h == iM35698D && aVarM35728v.f31360e.equals(str)) {
                return aVarM35728v;
            }
        }
        this.f31369g.m35622d(i10, m35721o(str));
        int i11 = this.f31368f;
        this.f31368f = i11 + 1;
        return m35703H(new a(i11, i10, str, iM35698D));
    }

    /* JADX INFO: renamed from: q */
    public int m35723q(int i10, int i11) {
        long j10 = ((long) i10) | (((long) i11) << 32);
        int iM35696B = m35696B(Opcodes.IXOR, i10 + i11);
        for (a aVarM35728v = m35728v(iM35696B); aVarM35728v != null; aVarM35728v = aVarM35728v.f31375i) {
            if (aVarM35728v.f31357b == 130 && aVarM35728v.f31374h == iM35696B && aVarM35728v.f31361f == j10) {
                return aVarM35728v.f31362g;
            }
        }
        a[] aVarArr = this.f31373k;
        int iM35724r = m35724r(this.f31363a.m35631b(aVarArr[i10].f31360e, aVarArr[i11].f31360e));
        m35703H(new a(this.f31372j, Opcodes.IXOR, j10, iM35696B)).f31362g = iM35724r;
        return iM35724r;
    }

    /* JADX INFO: renamed from: r */
    public int m35724r(String str) {
        int iM35698D = m35698D(128, str);
        for (a aVarM35728v = m35728v(iM35698D); aVarM35728v != null; aVarM35728v = aVarM35728v.f31375i) {
            if (aVarM35728v.f31357b == 128 && aVarM35728v.f31374h == iM35698D && aVarM35728v.f31360e.equals(str)) {
                return aVarM35728v.f31356a;
            }
        }
        return m35725s(new a(this.f31372j, 128, str, iM35698D));
    }

    /* JADX INFO: renamed from: s */
    public final int m35725s(a aVar) {
        if (this.f31373k == null) {
            this.f31373k = new a[16];
        }
        int i10 = this.f31372j;
        a[] aVarArr = this.f31373k;
        if (i10 == aVarArr.length) {
            a[] aVarArr2 = new a[aVarArr.length * 2];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
            this.f31373k = aVarArr2;
        }
        a[] aVarArr3 = this.f31373k;
        int i11 = this.f31372j;
        this.f31372j = i11 + 1;
        aVarArr3[i11] = aVar;
        return m35703H(aVar).f31356a;
    }

    /* JADX INFO: renamed from: t */
    public int m35726t(String str, int i10) {
        int iM35699E = m35699E(Opcodes.LOR, str, i10);
        for (a aVarM35728v = m35728v(iM35699E); aVarM35728v != null; aVarM35728v = aVarM35728v.f31375i) {
            if (aVarM35728v.f31357b == 129 && aVarM35728v.f31374h == iM35699E && aVarM35728v.f31361f == i10 && aVarM35728v.f31360e.equals(str)) {
                return aVarM35728v.f31356a;
            }
        }
        return m35725s(new a(this.f31372j, Opcodes.LOR, str, i10, iM35699E));
    }

    /* JADX INFO: renamed from: u */
    public int m35727u() {
        if (this.f31371i == null) {
            return 0;
        }
        m35721o("BootstrapMethods");
        return this.f31371i.f31256b + 8;
    }

    /* JADX INFO: renamed from: v */
    public final a m35728v(int i10) {
        a[] aVarArr = this.f31367e;
        return aVarArr[i10 % aVarArr.length];
    }

    /* JADX INFO: renamed from: w */
    public String m35729w() {
        return this.f31365c;
    }

    /* JADX INFO: renamed from: x */
    public int m35730x() {
        return this.f31368f;
    }

    /* JADX INFO: renamed from: y */
    public int m35731y() {
        return this.f31369g.f31256b;
    }

    /* JADX INFO: renamed from: z */
    public int m35732z() {
        return this.f31364b;
    }

    /* JADX INFO: renamed from: w4.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC9183m {

        /* JADX INFO: renamed from: h */
        public final int f31374h;

        /* JADX INFO: renamed from: i */
        public a f31375i;

        public a(int i10, int i11, String str, int i12) {
            super(i10, i11, null, null, str, 0L);
            this.f31374h = i12;
        }

        public a(int i10, int i11, String str, String str2, String str3, long j10, int i12) {
            super(i10, i11, str, str2, str3, j10);
            this.f31374h = i12;
        }

        public a(int i10, int i11, String str, long j10, int i12) {
            super(i10, i11, null, null, str, j10);
            this.f31374h = i12;
        }

        public a(int i10, int i11, String str, String str2, int i12) {
            super(i10, i11, null, str, str2, 0L);
            this.f31374h = i12;
        }

        public a(int i10, int i11, long j10, int i12) {
            super(i10, i11, null, null, null, j10);
            this.f31374h = i12;
        }
    }
}
