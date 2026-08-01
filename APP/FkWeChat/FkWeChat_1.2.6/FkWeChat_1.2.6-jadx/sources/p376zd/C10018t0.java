package p376zd;

import ae.AbstractC0310i;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p185m8.AbstractC5102r;
import p215oc.C5704b;

/* JADX INFO: renamed from: zd.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10018t0 extends C10003m {

    /* JADX INFO: renamed from: v */
    public final transient byte[][] f33628v;

    /* JADX INFO: renamed from: w */
    public final transient int[] f33629w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10018t0(byte[][] bArr, int[] iArr) {
        super(C10003m.f33583u.m38778k());
        bArr.getClass();
        iArr.getClass();
        this.f33628v = bArr;
        this.f33629w = iArr;
    }

    private final Object writeReplace() {
        C10003m c10003mM38836R = m38836R();
        c10003mM38836R.getClass();
        return c10003mM38836R;
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: A */
    public boolean mo38759A(int i10, C10003m c10003m, int i11, int i12) {
        c10003m.getClass();
        if (i10 < 0 || i10 > m38765G() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iM947b = AbstractC0310i.m947b(this, i10);
        while (i10 < i13) {
            int i14 = iM947b == 0 ? 0 : m38833O()[iM947b - 1];
            int i15 = m38833O()[iM947b] - i14;
            int i16 = m38833O()[m38834P().length + iM947b];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!c10003m.mo38760B(i11, m38834P()[iM947b], i16 + (i10 - i14), iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iM947b++;
        }
        return true;
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: B */
    public boolean mo38760B(int i10, byte[] bArr, int i11, int i12) {
        bArr.getClass();
        if (i10 < 0 || i10 > m38765G() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iM947b = AbstractC0310i.m947b(this, i10);
        while (i10 < i13) {
            int i14 = iM947b == 0 ? 0 : m38833O()[iM947b - 1];
            int i15 = m38833O()[iM947b] - i14;
            int i16 = m38833O()[m38834P().length + iM947b];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!AbstractC9978b.m38614a(m38834P()[iM947b], i16 + (i10 - i14), bArr, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iM947b++;
        }
        return true;
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: I */
    public String mo38767I(Charset charset) {
        charset.getClass();
        return m38836R().mo38767I(charset);
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: J */
    public C10003m mo38768J(int i10, int i11) {
        int iM38618e = AbstractC9978b.m38618e(this, i11);
        if (i10 < 0) {
            C5704b.m23087a("beginIndex=", i10, " < 0");
            return null;
        }
        if (iM38618e > m38765G()) {
            C10016s0.m38832a("endIndex=", iM38618e, " > length(", m38765G());
            return null;
        }
        int i12 = iM38618e - i10;
        if (i12 < 0) {
            C10028y0.m38849a("endIndex=", iM38618e, " < beginIndex=", i10);
            return null;
        }
        if (i10 == 0 && iM38618e == m38765G()) {
            return this;
        }
        if (i10 == iM38618e) {
            return C10003m.f33583u;
        }
        int iM947b = AbstractC0310i.m947b(this, i10);
        int iM947b2 = AbstractC0310i.m947b(this, iM38618e - 1);
        byte[][] bArr = (byte[][]) AbstractC5102r.m20668t(m38834P(), iM947b, iM947b2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iM947b <= iM947b2) {
            int i13 = iM947b;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(m38833O()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = m38833O()[m38834P().length + i13];
                if (i13 == iM947b2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iM947b != 0 ? m38833O()[iM947b - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i10 - i16);
        return new C10018t0(bArr, iArr);
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: L */
    public C10003m mo38769L() {
        return m38836R().mo38769L();
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: N */
    public void mo38771N(C9995i c9995i, int i10, int i11) {
        c9995i.getClass();
        int i12 = i10 + i11;
        int iM947b = AbstractC0310i.m947b(this, i10);
        while (i10 < i12) {
            int i13 = iM947b == 0 ? 0 : m38833O()[iM947b - 1];
            int i14 = m38833O()[iM947b] - i13;
            int i15 = m38833O()[m38834P().length + iM947b];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = i15 + (i10 - i13);
            C10012q0 c10012q0 = new C10012q0(m38834P()[iM947b], i16, i16 + iMin, true, false);
            C10012q0 c10012q02 = c9995i.f33561q;
            if (c10012q02 == null) {
                c10012q0.f33622g = c10012q0;
                c10012q0.f33621f = c10012q0;
                c9995i.f33561q = c10012q0;
            } else {
                c10012q02.getClass();
                C10012q0 c10012q03 = c10012q02.f33622g;
                c10012q03.getClass();
                c10012q03.m38823c(c10012q0);
            }
            i10 += iMin;
            iM947b++;
        }
        c9995i.m38689P(c9995i.size() + ((long) i11));
    }

    /* JADX INFO: renamed from: O */
    public final int[] m38833O() {
        return this.f33629w;
    }

    /* JADX INFO: renamed from: P */
    public final byte[][] m38834P() {
        return this.f33628v;
    }

    /* JADX INFO: renamed from: Q */
    public byte[] m38835Q() {
        byte[] bArr = new byte[m38765G()];
        int length = m38834P().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = m38833O()[length + i10];
            int i14 = m38833O()[i10];
            int i15 = i14 - i11;
            AbstractC5102r.m20655g(m38834P()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: R */
    public final C10003m m38836R() {
        return new C10003m(m38835Q());
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: a */
    public String mo38772a() {
        return m38836R().mo38772a();
    }

    @Override // p376zd.C10003m
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10003m) {
            C10003m c10003m = (C10003m) obj;
            if (c10003m.m38765G() == m38765G() && mo38759A(0, c10003m, 0, m38765G())) {
                return true;
            }
        }
        return false;
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: g */
    public void mo38774g(int i10, byte[] bArr, int i11, int i12) {
        bArr.getClass();
        long j10 = i12;
        AbstractC9978b.m38615b(m38765G(), i10, j10);
        AbstractC9978b.m38615b(bArr.length, i11, j10);
        int i13 = i12 + i10;
        int iM947b = AbstractC0310i.m947b(this, i10);
        while (i10 < i13) {
            int i14 = iM947b == 0 ? 0 : m38833O()[iM947b - 1];
            int i15 = m38833O()[iM947b] - i14;
            int i16 = m38833O()[m38834P().length + iM947b];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = i16 + (i10 - i14);
            AbstractC5102r.m20655g(m38834P()[iM947b], bArr, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iM947b++;
        }
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: h */
    public C10003m mo38775h(String str) throws NoSuchAlgorithmException {
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = m38834P().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = m38833O()[length + i10];
            int i13 = m38833O()[i10];
            messageDigest.update(m38834P()[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new C10003m(bArrDigest);
    }

    @Override // p376zd.C10003m
    public int hashCode() {
        int iM38779l = m38779l();
        if (iM38779l != 0) {
            return iM38779l;
        }
        int length = m38834P().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = m38833O()[length + i10];
            int i14 = m38833O()[i10];
            byte[] bArr = m38834P()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        m38761C(i11);
        return i11;
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: m */
    public int mo38780m() {
        return m38833O()[m38834P().length - 1];
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: p */
    public String mo38782p() {
        return m38836R().mo38782p();
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: s */
    public int mo38784s(byte[] bArr, int i10) {
        bArr.getClass();
        return m38836R().mo38784s(bArr, i10);
    }

    @Override // p376zd.C10003m
    public String toString() {
        return m38836R().toString();
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: u */
    public byte[] mo38785u() {
        return m38835Q();
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: v */
    public byte mo38786v(int i10) {
        AbstractC9978b.m38615b(m38833O()[m38834P().length - 1], i10, 1L);
        int iM947b = AbstractC0310i.m947b(this, i10);
        return m38834P()[iM947b][(i10 - (iM947b == 0 ? 0 : m38833O()[iM947b - 1])) + m38833O()[m38834P().length + iM947b]];
    }

    @Override // p376zd.C10003m
    /* JADX INFO: renamed from: x */
    public int mo38788x(byte[] bArr, int i10) {
        bArr.getClass();
        return m38836R().mo38788x(bArr, i10);
    }
}
