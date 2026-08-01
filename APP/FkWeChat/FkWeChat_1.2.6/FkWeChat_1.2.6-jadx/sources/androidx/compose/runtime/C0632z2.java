package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1061t;
import p117i.C3058h0;
import p117i.C3082r0;
import p172l8.AbstractC4706m;
import p172l8.InterfaceC4705l;
import p349y0.C9507b;

/* JADX INFO: renamed from: androidx.compose.runtime.z2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0632z2 {

    /* JADX INFO: renamed from: a */
    public final List f1819a;

    /* JADX INFO: renamed from: b */
    public final int f1820b;

    /* JADX INFO: renamed from: c */
    public int f1821c;

    /* JADX INFO: renamed from: d */
    public final List f1822d;

    /* JADX INFO: renamed from: e */
    public final C3058h0 f1823e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4705l f1824f;

    /* JADX INFO: renamed from: androidx.compose.runtime.z2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0173a {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final C3082r0 m2479a() {
            C3082r0 c3082r0M1509y = AbstractC0454a0.m1509y(C0632z2.this.m2465b().size());
            C0632z2 c0632z2 = C0632z2.this;
            int size = c0632z2.m2465b().size();
            for (int i10 = 0; i10 < size; i10++) {
                C0581s1 c0581s1 = (C0581s1) c0632z2.m2465b().get(i10);
                C9507b.m37012a(c3082r0M1509y, AbstractC0454a0.m1507w(c0581s1), c0581s1);
            }
            return c3082r0M1509y;
        }

        @Override // p010a9.InterfaceC0173a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C9507b.m37013b(m2479a());
        }
    }

    public C0632z2(List list, int i10) {
        this.f1819a = list;
        this.f1820b = i10;
        if (!(i10 >= 0)) {
            AbstractC0464b3.m1535a("Invalid start index");
        }
        this.f1822d = new ArrayList();
        C3058h0 c3058h0 = new C3058h0(0, 1, null);
        int size = list.size();
        int iM2198c = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C0581s1 c0581s1 = (C0581s1) this.f1819a.get(i11);
            c3058h0.m11326r(c0581s1.m2197b(), new C0518j1(i11, iM2198c, c0581s1.m2198c()));
            iM2198c += c0581s1.m2198c();
        }
        this.f1823e = c3058h0;
        this.f1824f = AbstractC4706m.m18787a(new a());
    }

    /* JADX INFO: renamed from: a */
    public final int m2464a() {
        return this.f1821c;
    }

    /* JADX INFO: renamed from: b */
    public final List m2465b() {
        return this.f1819a;
    }

    /* JADX INFO: renamed from: c */
    public final C3082r0 m2466c() {
        return ((C9507b) this.f1824f.getValue()).m37027o();
    }

    /* JADX INFO: renamed from: d */
    public final C0581s1 m2467d(int i10, Object obj) {
        return (C0581s1) C9507b.m37022k(m2466c(), obj != null ? new C0574r1(Integer.valueOf(i10), obj) : Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: e */
    public final int m2468e() {
        return this.f1820b;
    }

    /* JADX INFO: renamed from: f */
    public final List m2469f() {
        return this.f1822d;
    }

    /* JADX INFO: renamed from: g */
    public final int m2470g(C0581s1 c0581s1) {
        C0518j1 c0518j1 = (C0518j1) this.f1823e.m11449b(c0581s1.m2197b());
        if (c0518j1 != null) {
            return c0518j1.m1764b();
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2471h(C0581s1 c0581s1) {
        return this.f1822d.add(c0581s1);
    }

    /* JADX INFO: renamed from: i */
    public final void m2472i(C0581s1 c0581s1, int i10) {
        this.f1823e.m11326r(c0581s1.m2197b(), new C0518j1(-1, i10, 0));
    }

    /* JADX INFO: renamed from: j */
    public final void m2473j(int i10, int i11, int i12) {
        char c10;
        long j10;
        char c11;
        long j11;
        char c12 = 7;
        long j12 = -9187201950435737472L;
        if (i10 > i11) {
            C3058h0 c3058h0 = this.f1823e;
            Object[] objArr = c3058h0.f8157c;
            long[] jArr = c3058h0.f8155a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << c12) & j13 & j12) != j12) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j13 & 255) < 128) {
                            c11 = c12;
                            C0518j1 c0518j1 = (C0518j1) objArr[(i13 << 3) + i15];
                            j11 = j12;
                            int iM1764b = c0518j1.m1764b();
                            if (i10 <= iM1764b && iM1764b < i10 + i12) {
                                c0518j1.m1767e((iM1764b - i10) + i11);
                            } else if (i11 <= iM1764b && iM1764b < i10) {
                                c0518j1.m1767e(iM1764b + i12);
                            }
                        } else {
                            c11 = c12;
                            j11 = j12;
                        }
                        j13 >>= 8;
                        i15++;
                        c12 = c11;
                        j12 = j11;
                    }
                    c10 = c12;
                    j10 = j12;
                    if (i14 != 8) {
                        return;
                    }
                } else {
                    c10 = c12;
                    j10 = j12;
                }
                if (i13 == length) {
                    return;
                }
                i13++;
                c12 = c10;
                j12 = j10;
            }
        } else {
            if (i11 <= i10) {
                return;
            }
            C3058h0 c3058h02 = this.f1823e;
            Object[] objArr2 = c3058h02.f8157c;
            long[] jArr2 = c3058h02.f8155a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                long j14 = jArr2[i16];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j14 & 255) < 128) {
                            C0518j1 c0518j12 = (C0518j1) objArr2[(i16 << 3) + i18];
                            int iM1764b2 = c0518j12.m1764b();
                            if (i10 <= iM1764b2 && iM1764b2 < i10 + i12) {
                                c0518j12.m1767e((iM1764b2 - i10) + i11);
                            } else if (i10 + 1 <= iM1764b2 && iM1764b2 < i11) {
                                c0518j12.m1767e(iM1764b2 - i12);
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i17 != 8) {
                        return;
                    }
                }
                if (i16 == length2) {
                    return;
                } else {
                    i16++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2474k(int i10, int i11) {
        char c10;
        long j10;
        char c11;
        long j11;
        char c12 = 7;
        long j12 = -9187201950435737472L;
        if (i10 > i11) {
            C3058h0 c3058h0 = this.f1823e;
            Object[] objArr = c3058h0.f8157c;
            long[] jArr = c3058h0.f8155a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j13 = jArr[i12];
                if ((((~j13) << c12) & j13 & j12) != j12) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j13 & 255) < 128) {
                            c11 = c12;
                            C0518j1 c0518j1 = (C0518j1) objArr[(i12 << 3) + i14];
                            j11 = j12;
                            int iM1765c = c0518j1.m1765c();
                            if (iM1765c == i10) {
                                c0518j1.m1768f(i11);
                            } else if (i11 <= iM1765c && iM1765c < i10) {
                                c0518j1.m1768f(iM1765c + 1);
                            }
                        } else {
                            c11 = c12;
                            j11 = j12;
                        }
                        j13 >>= 8;
                        i14++;
                        c12 = c11;
                        j12 = j11;
                    }
                    c10 = c12;
                    j10 = j12;
                    if (i13 != 8) {
                        return;
                    }
                } else {
                    c10 = c12;
                    j10 = j12;
                }
                if (i12 == length) {
                    return;
                }
                i12++;
                c12 = c10;
                j12 = j10;
            }
        } else {
            if (i11 <= i10) {
                return;
            }
            C3058h0 c3058h02 = this.f1823e;
            Object[] objArr2 = c3058h02.f8157c;
            long[] jArr2 = c3058h02.f8155a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i15 = 0;
            while (true) {
                long j14 = jArr2[i15];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j14 & 255) < 128) {
                            C0518j1 c0518j12 = (C0518j1) objArr2[(i15 << 3) + i17];
                            int iM1765c2 = c0518j12.m1765c();
                            if (iM1765c2 == i10) {
                                c0518j12.m1768f(i11);
                            } else if (i10 + 1 <= iM1765c2 && iM1765c2 < i11) {
                                c0518j12.m1768f(iM1765c2 - 1);
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i16 != 8) {
                        return;
                    }
                }
                if (i15 == length2) {
                    return;
                } else {
                    i15++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2475l(int i10) {
        this.f1821c = i10;
    }

    /* JADX INFO: renamed from: m */
    public final int m2476m(C0581s1 c0581s1) {
        C0518j1 c0518j1 = (C0518j1) this.f1823e.m11449b(c0581s1.m2197b());
        if (c0518j1 != null) {
            return c0518j1.m1765c();
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m2477n(int i10, int i11) {
        int iM1764b;
        C0518j1 c0518j1 = (C0518j1) this.f1823e.m11449b(i10);
        if (c0518j1 == null) {
            return false;
        }
        int iM1764b2 = c0518j1.m1764b();
        int iM1763a = i11 - c0518j1.m1763a();
        c0518j1.m1766d(i11);
        if (iM1763a == 0) {
            return true;
        }
        C3058h0 c3058h0 = this.f1823e;
        Object[] objArr = c3058h0.f8157c;
        long[] jArr = c3058h0.f8155a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i12 = 0;
        while (true) {
            long j10 = jArr[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        C0518j1 c0518j12 = (C0518j1) objArr[(i12 << 3) + i14];
                        if (c0518j12.m1764b() >= iM1764b2 && !AbstractC1061t.m3842c(c0518j12, c0518j1) && (iM1764b = c0518j12.m1764b() + iM1763a) >= 0) {
                            c0518j12.m1767e(iM1764b);
                        }
                    }
                    j10 >>= 8;
                }
                if (i13 != 8) {
                    return true;
                }
            }
            if (i12 == length) {
                return true;
            }
            i12++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final int m2478o(C0581s1 c0581s1) {
        C0518j1 c0518j1 = (C0518j1) this.f1823e.m11449b(c0581s1.m2197b());
        return c0518j1 != null ? c0518j1.m1763a() : c0581s1.m2198c();
    }
}
