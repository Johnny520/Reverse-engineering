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

/* JADX INFO: renamed from: i.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3084s0 extends AbstractC3047d1 {

    /* JADX INFO: renamed from: e */
    public int f8199e;

    public C3084s0(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC3492d.m13015a("Capacity must be a positive value.");
        }
        m11547s(AbstractC3044c1.m11265e(i10));
    }

    /* JADX INFO: renamed from: A */
    public final void m11533A(int i10) {
        this.f8095d--;
        long[] jArr = this.f8092a;
        int i11 = this.f8094c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f8093b[i10] = null;
    }

    /* JADX INFO: renamed from: B */
    public final void m11534B(int i10) {
        long[] jArr = this.f8092a;
        Object[] objArr = this.f8093b;
        int i11 = this.f8094c;
        m11547s(i10);
        long[] jArr2 = this.f8092a;
        Object[] objArr2 = this.f8093b;
        int i12 = this.f8094c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iM11544p = m11544p(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iM11544p >> 3;
                int i16 = (iM11544p & 7) << 3;
                long j11 = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                jArr2[i15] = j11;
                jArr2[(((iM11544p - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr2[iM11544p] = obj;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11535C(java.util.Collection r17) {
        /*
            r16 = this;
            r0 = r16
            r17.getClass()
            java.lang.Object[] r1 = r0.f8093b
            int r2 = r0.f8095d
            long[] r3 = r0.f8092a
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
            r0.m11533A(r12)
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
            int r1 = r0.f8095d
            if (r2 == r1) goto L5a
            r1 = 1
            return r1
        L5a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p117i.C3084s0.m11535C(java.util.Collection):boolean");
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11536h(Object obj) {
        int iM11270c = m11270c();
        this.f8093b[m11543o(obj)] = obj;
        return m11270c() != iM11270c;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m11537i(AbstractC3047d1 abstractC3047d1) {
        abstractC3047d1.getClass();
        int iM11270c = m11270c();
        m11550v(abstractC3047d1);
        return iM11270c != m11270c();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11538j(Iterable iterable) {
        iterable.getClass();
        int iM11270c = m11270c();
        m11551w(iterable);
        return iM11270c != m11270c();
    }

    /* JADX INFO: renamed from: k */
    public final void m11539k() {
        if (this.f8094c <= 8 || Long.compareUnsigned(C4688c0.m18729c(C4688c0.m18729c(this.f8095d) * 32), C4688c0.m18729c(C4688c0.m18729c(this.f8094c) * 25)) > 0) {
            m11534B(AbstractC3044c1.m11263c(this.f8094c));
        } else {
            m11542n();
        }
    }

    /* JADX INFO: renamed from: l */
    public final Set m11540l() {
        return new C3086t0(this);
    }

    /* JADX INFO: renamed from: m */
    public final void m11541m() {
        this.f8095d = 0;
        long[] jArr = this.f8092a;
        if (jArr != AbstractC3044c1.f8088a) {
            AbstractC5102r.m20674z(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f8092a;
            int i10 = this.f8094c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC5102r.m20672x(this.f8093b, null, 0, this.f8094c);
        m11545q();
    }

    /* JADX INFO: renamed from: n */
    public final void m11542n() {
        long j10;
        long[] jArr = this.f8092a;
        int i10 = this.f8094c;
        Object[] objArr = this.f8093b;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int iM20730e0 = AbstractC5106t.m20730e0(jArr);
        int i14 = iM20730e0 - 1;
        long j12 = 72057594037927935L;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[iM20730e0] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j13 = (jArr[i16] >> i17) & 255;
            if (j13 != 128 && j13 == 254) {
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iM11544p = m11544p(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iM11544p - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[AbstractC5106t.m20730e0(jArr)] = (jArr[i21] & j12) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                } else {
                    int i22 = iM11544p >> 3;
                    long j14 = jArr[i22];
                    int i23 = (iM11544p & 7) << 3;
                    if (((j14 >> i23) & 255) == 128) {
                        j10 = j12;
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j14 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iM11544p] = objArr[i15];
                        objArr[i15] = null;
                    } else {
                        j10 = j12;
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j14 & (~(255 << i23)));
                        Object obj2 = objArr[iM11544p];
                        objArr[iM11544p] = objArr[i15];
                        objArr[i15] = obj2;
                        i15--;
                    }
                    jArr[AbstractC5106t.m20730e0(jArr)] = (jArr[i21] & j10) | Long.MIN_VALUE;
                    i15++;
                    i12 = i21;
                    j12 = j10;
                }
            } else {
                i15++;
            }
        }
        m11545q();
    }

    /* JADX INFO: renamed from: o */
    public final int m11543o(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f8094c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f8092a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (AbstractC1061t.m3842c(this.f8093b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM11544p = m11544p(i11);
                if (this.f8199e == 0 && ((this.f8092a[iM11544p >> 3] >> ((iM11544p & 7) << 3)) & 255) != 254) {
                    m11539k();
                    iM11544p = m11544p(i11);
                }
                this.f8095d++;
                int i19 = this.f8199e;
                long[] jArr2 = this.f8092a;
                int i20 = iM11544p >> 3;
                long j14 = jArr2[i20];
                int i21 = (iM11544p & 7) << 3;
                this.f8199e = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f8094c;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iM11544p - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iM11544p;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    /* JADX INFO: renamed from: p */
    public final int m11544p(int i10) {
        int i11 = this.f8094c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f8092a;
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

    /* JADX INFO: renamed from: q */
    public final void m11545q() {
        this.f8199e = AbstractC3044c1.m11261a(m11269b()) - this.f8095d;
    }

    /* JADX INFO: renamed from: r */
    public final void m11546r(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = AbstractC3044c1.f8088a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC5102r.m20674z(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f8092a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        m11545q();
    }

    /* JADX INFO: renamed from: s */
    public final void m11547s(int i10) {
        int iMax = i10 > 0 ? Math.max(7, AbstractC3044c1.m11264d(i10)) : 0;
        this.f8094c = iMax;
        m11546r(iMax);
        this.f8093b = iMax == 0 ? AbstractC3489a.f9695c : new Object[iMax];
    }

    /* JADX INFO: renamed from: t */
    public final void m11548t(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m11549u(it.next());
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
    public final void m11549u(java.lang.Object r14) {
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
            int r3 = r13.f8094c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f8092a
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
            java.lang.Object[] r11 = r13.f8093b
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
            r13.m11533A(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: p117i.C3084s0.m11549u(java.lang.Object):void");
    }

    /* JADX INFO: renamed from: v */
    public final void m11550v(AbstractC3047d1 abstractC3047d1) {
        abstractC3047d1.getClass();
        Object[] objArr = abstractC3047d1.f8093b;
        long[] jArr = abstractC3047d1.f8092a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        m11552x(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m11551w(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m11552x(it.next());
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m11552x(Object obj) {
        this.f8093b[m11543o(obj)] = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m11553y(java.lang.Object r18) {
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
            int r5 = r0.f8094c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f8092a
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
            java.lang.Object[] r15 = r0.f8093b
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
            r0.m11533A(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: p117i.C3084s0.m11553y(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: z */
    public final boolean m11554z(Iterable iterable) {
        iterable.getClass();
        int iM11270c = m11270c();
        m11548t(iterable);
        return iM11270c != m11270c();
    }

    public /* synthetic */ C3084s0(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
