package p117i;

import java.util.Iterator;
import java.util.Set;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p132j.AbstractC3489a;
import p132j.AbstractC3492d;
import p172l8.C4688c0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: i.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3078p0 extends AbstractC3096y0 {

    /* JADX INFO: renamed from: h */
    public int f8168h;

    public C3078p0(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC3492d.m13015a("Capacity must be a positive value.");
        }
        m11496s(AbstractC3044c1.m11265e(i10));
    }

    /* JADX INFO: renamed from: A */
    public final void m11482A(int i10) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.f8245a;
        Object[] objArr2 = this.f8246b;
        long[] jArr3 = this.f8247c;
        int i11 = this.f8250f;
        int[] iArr = new int[i11];
        m11496s(i10);
        long[] jArr4 = this.f8245a;
        Object[] objArr3 = this.f8246b;
        long[] jArr5 = this.f8247c;
        int i12 = this.f8250f;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iM11491n = m11491n(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iM11491n >> 3;
                int i16 = (iM11491n & 7) << 3;
                jArr = jArr2;
                objArr = objArr2;
                long j11 = (jArr4[i15] & (~(255 << i16))) | (j10 << i16);
                jArr4[i15] = j11;
                jArr4[(((iM11491n - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr3[iM11491n] = obj;
                jArr5[iM11491n] = jArr3[i13];
                iArr[i13] = iM11491n;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i13++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        m11492o(iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11483B(java.util.Collection r17) {
        /*
            r16 = this;
            r0 = r16
            r17.getClass()
            java.lang.Object[] r1 = r0.f8246b
            int r2 = r0.f8251g
            long[] r3 = r0.f8245a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L54
            r6 = r5
        L12:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L4f
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L2c:
            if (r11 >= r9) goto L4d
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L49
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r17
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r14 = r1[r12]
            boolean r13 = p185m8.AbstractC5081g0.m20559a0(r13, r14)
            if (r13 != 0) goto L49
            r0.m11503z(r12)
        L49:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L2c
        L4d:
            if (r9 != r10) goto L54
        L4f:
            if (r6 == r4) goto L54
            int r6 = r6 + 1
            goto L12
        L54:
            int r1 = r0.f8251g
            if (r2 == r1) goto L5a
            r1 = 1
            return r1
        L5a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p117i.C3078p0.m11483B(java.util.Collection):boolean");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11484g(Object obj) {
        int iM11614c = m11614c();
        int iM11490m = m11490m(obj);
        this.f8246b[iM11490m] = obj;
        long[] jArr = this.f8247c;
        int i10 = this.f8248d;
        jArr[iM11490m] = (((long) i10) & 2147483647L) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((((long) iM11490m) & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
        }
        this.f8248d = iM11490m;
        if (this.f8249e == Integer.MAX_VALUE) {
            this.f8249e = iM11490m;
        }
        return m11614c() != iM11614c;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11485h(Iterable iterable) {
        iterable.getClass();
        int iM11614c = m11614c();
        m11499v(iterable);
        return iM11614c != m11614c();
    }

    /* JADX INFO: renamed from: i */
    public final void m11486i() {
        if (this.f8250f <= 8 || Long.compareUnsigned(C4688c0.m18729c(C4688c0.m18729c(this.f8251g) * 32), C4688c0.m18729c(C4688c0.m18729c(this.f8250f) * 25)) > 0) {
            m11482A(AbstractC3044c1.m11263c(this.f8250f));
        } else {
            m11489l();
        }
    }

    /* JADX INFO: renamed from: j */
    public final Set m11487j() {
        return new C3080q0(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m11488k() {
        this.f8251g = 0;
        long[] jArr = this.f8245a;
        if (jArr != AbstractC3044c1.f8088a) {
            AbstractC5102r.m20674z(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f8245a;
            int i10 = this.f8250f;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC5102r.m20672x(this.f8246b, null, 0, this.f8250f);
        AbstractC5102r.m20674z(this.f8247c, 4611686018427387903L, 0, 0, 6, null);
        this.f8248d = Integer.MAX_VALUE;
        this.f8249e = Integer.MAX_VALUE;
        m11494q();
    }

    /* JADX INFO: renamed from: l */
    public final void m11489l() {
        int i10;
        long[] jArr = this.f8245a;
        if (jArr == null) {
            return;
        }
        int i11 = this.f8250f;
        Object[] objArr = this.f8246b;
        long[] jArr2 = this.f8247c;
        long[] jArr3 = new long[i11];
        long j10 = 9223372034707292159L;
        int i12 = 0;
        AbstractC5102r.m20671w(jArr3, 9223372034707292159L, 0, i11);
        int i13 = (i11 + 7) >> 3;
        for (int i14 = 0; i14 < i13; i14++) {
            long j11 = jArr[i14] & (-9187201950435737472L);
            jArr[i14] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int iM20730e0 = AbstractC5106t.m20730e0(jArr);
        int i15 = iM20730e0 - 1;
        jArr[i15] = (jArr[i15] & 72057594037927935L) | (-72057594037927936L);
        jArr[iM20730e0] = jArr[0];
        int i16 = 0;
        while (i16 != i11) {
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j12 = (jArr[i17] >> i18) & 255;
            if (j12 != 128 && j12 == 254) {
                Object obj = objArr[i16];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                int i19 = iHashCode ^ (iHashCode << 16);
                int i20 = i19 >>> 7;
                long j13 = j10;
                int iM11491n = m11491n(i20);
                int i21 = i20 & i11;
                if (((iM11491n - i21) & i11) / 8 == ((i16 - i21) & i11) / 8) {
                    jArr[i17] = (((long) (i19 & 127)) << i18) | (jArr[i17] & (~(255 << i18)));
                    if (jArr3[i16] == j13) {
                        long j14 = i16;
                        jArr3[i16] = j14 | (j14 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i12];
                    i16++;
                    j10 = j13;
                } else {
                    int i22 = iM11491n >> 3;
                    long j15 = jArr[i22];
                    int i23 = (iM11491n & 7) << 3;
                    int i24 = i12;
                    if (((j15 >> i23) & 255) == 128) {
                        int i25 = i16;
                        jArr[i22] = (j15 & (~(255 << i23))) | (((long) (i19 & 127)) << i23);
                        jArr[i17] = (jArr[i17] & (~(255 << i18))) | (128 << i18);
                        objArr[iM11491n] = objArr[i25];
                        objArr[i25] = null;
                        jArr2[iM11491n] = jArr2[i25];
                        jArr2[i25] = 4611686018427387903L;
                        int i26 = (int) ((jArr3[i25] >> 32) & 4294967295L);
                        if (i26 != Integer.MAX_VALUE) {
                            jArr3[i26] = (jArr3[i26] & (-4294967296L)) | ((long) iM11491n);
                            jArr3[i25] = (jArr3[i25] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i25] = (((long) Integer.MAX_VALUE) << 32) | ((long) iM11491n);
                        }
                        i10 = i25;
                        jArr3[iM11491n] = ((long) Integer.MAX_VALUE) | (((long) i10) << 32);
                    } else {
                        jArr[i22] = (((long) (i19 & 127)) << i23) | (j15 & (~(255 << i23)));
                        Object obj2 = objArr[iM11491n];
                        objArr[iM11491n] = objArr[i16];
                        objArr[i16] = obj2;
                        long j16 = jArr2[iM11491n];
                        jArr2[iM11491n] = jArr2[i16];
                        jArr2[i16] = j16;
                        int i27 = (int) ((jArr3[i16] >> 32) & 4294967295L);
                        if (i27 != Integer.MAX_VALUE) {
                            long j17 = iM11491n;
                            jArr3[i27] = (jArr3[i27] & (-4294967296L)) | j17;
                            jArr3[i16] = (jArr3[i16] & 4294967295L) | (j17 << 32);
                        } else {
                            long j18 = iM11491n;
                            jArr3[i16] = j18 | (j18 << 32);
                            i27 = i16;
                        }
                        jArr3[iM11491n] = (((long) i27) << 32) | ((long) i16);
                        i10 = i16 - 1;
                    }
                    jArr[jArr.length - 1] = jArr[i24];
                    i16 = i10 + 1;
                    j10 = j13;
                    i12 = i24;
                }
            } else {
                i16++;
            }
        }
        m11494q();
        m11493p(jArr3);
    }

    /* JADX INFO: renamed from: m */
    public final int m11490m(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f8250f;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f8245a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (AbstractC1061t.m3842c(this.f8246b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM11491n = m11491n(i11);
                if (this.f8168h == 0 && ((this.f8245a[iM11491n >> 3] >> ((iM11491n & 7) << 3)) & 255) != 254) {
                    m11486i();
                    iM11491n = m11491n(i11);
                }
                this.f8251g++;
                int i19 = this.f8168h;
                long[] jArr2 = this.f8245a;
                int i20 = iM11491n >> 3;
                long j14 = jArr2[i20];
                int i21 = (iM11491n & 7) << 3;
                this.f8168h = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f8250f;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iM11491n - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iM11491n;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m11491n(int i10) {
        int i11 = this.f8250f;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f8245a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m11492o(int[] iArr) {
        long[] jArr = this.f8247c;
        int length = jArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr[i10];
            int i12 = (int) ((j10 >> 31) & 2147483647L);
            int i13 = (int) (j10 & 2147483647L);
            long j11 = ((j10 & (-4611686018427387904L)) | ((long) (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i12]))) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = iArr[i13];
            }
            jArr[i10] = j11 | ((long) i11);
            i10++;
        }
        int i14 = this.f8248d;
        if (i14 != Integer.MAX_VALUE) {
            this.f8248d = iArr[i14];
        }
        int i15 = this.f8249e;
        if (i15 != Integer.MAX_VALUE) {
            this.f8249e = iArr[i15];
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m11493p(long[] jArr) {
        long[] jArr2 = this.f8247c;
        int length = jArr2.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr2[i10];
            int i12 = (int) ((j10 >> 31) & 2147483647L);
            int i13 = (int) (j10 & 2147483647L);
            long j11 = ((j10 & (-4611686018427387904L)) | ((long) (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr[i12] & 4294967295L)))) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = (int) (4294967295L & jArr[i13]);
            }
            jArr2[i10] = ((long) i11) | j11;
            i10++;
        }
        int i14 = this.f8248d;
        if (i14 != Integer.MAX_VALUE) {
            this.f8248d = (int) (jArr[i14] & 4294967295L);
        }
        int i15 = this.f8249e;
        if (i15 != Integer.MAX_VALUE) {
            this.f8249e = (int) (jArr[i15] & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m11494q() {
        this.f8168h = AbstractC3044c1.m11261a(m11613b()) - this.f8251g;
    }

    /* JADX INFO: renamed from: r */
    public final void m11495r(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = AbstractC3044c1.f8088a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC5102r.m20674z(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f8245a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m11494q();
    }

    /* JADX INFO: renamed from: s */
    public final void m11496s(int i10) {
        long[] jArrM11311a;
        int iMax = i10 > 0 ? Math.max(7, AbstractC3044c1.m11264d(i10)) : 0;
        this.f8250f = iMax;
        m11495r(iMax);
        this.f8246b = iMax == 0 ? AbstractC3489a.f9695c : new Object[iMax];
        if (iMax == 0) {
            jArrM11311a = AbstractC3056g1.m11311a();
        } else {
            long[] jArr = new long[iMax];
            AbstractC5102r.m20674z(jArr, 4611686018427387903L, 0, 0, 6, null);
            jArrM11311a = jArr;
        }
        this.f8247c = jArrM11311a;
    }

    /* JADX INFO: renamed from: t */
    public final void m11497t(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m11498u(it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11498u(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f8250f
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f8245a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f8246b
            r11 = r11[r10]
            boolean r11 = p024b9.AbstractC1061t.m3842c(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.m11503z(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: p117i.C3078p0.m11498u(java.lang.Object):void");
    }

    /* JADX INFO: renamed from: v */
    public final void m11499v(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m11500w(it.next());
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m11500w(Object obj) {
        int iM11490m = m11490m(obj);
        this.f8246b[iM11490m] = obj;
        long[] jArr = this.f8247c;
        int i10 = this.f8248d;
        jArr[iM11490m] = (((long) i10) & 2147483647L) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((((long) iM11490m) & 2147483647L) << 31) | (jArr[i10] & (-4611686016279904257L));
        }
        this.f8248d = iM11490m;
        if (this.f8249e == Integer.MAX_VALUE) {
            this.f8249e = iM11490m;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11501x(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f8250f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f8245a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f8246b
            r15 = r15[r11]
            boolean r15 = p024b9.AbstractC1061t.m3842c(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.m11503z(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: p117i.C3078p0.m11501x(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: y */
    public final boolean m11502y(Iterable iterable) {
        iterable.getClass();
        int iM11614c = m11614c();
        m11497t(iterable);
        return iM11614c != m11614c();
    }

    /* JADX INFO: renamed from: z */
    public final void m11503z(int i10) {
        this.f8251g--;
        long[] jArr = this.f8245a;
        int i11 = this.f8250f;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f8246b[i10] = null;
        long[] jArr2 = this.f8247c;
        long j11 = jArr2[i10];
        int i14 = (int) ((j11 >> 31) & 2147483647L);
        int i15 = (int) (j11 & 2147483647L);
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = (jArr2[i14] & (-2147483648L)) | (((long) i15) & 2147483647L);
        } else {
            this.f8248d = i15;
        }
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = ((((long) i14) & 2147483647L) << 31) | (jArr2[i15] & (-4611686016279904257L));
        } else {
            this.f8249e = i14;
        }
        jArr2[i10] = 4611686018427387903L;
    }

    public /* synthetic */ C3078p0(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
