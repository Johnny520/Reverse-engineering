package p117i;

import java.util.Map;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p132j.AbstractC3489a;
import p132j.AbstractC3492d;
import p172l8.C4688c0;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: i.r0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3082r0 extends AbstractC3041b1 {

    /* JADX INFO: renamed from: f */
    public int f8187f;

    public C3082r0(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            AbstractC3492d.m13015a("Capacity must be a positive value.");
        }
        m11522q(AbstractC3044c1.m11265e(i10));
    }

    /* JADX INFO: renamed from: j */
    public final void m11515j() {
        if (this.f8073d <= 8 || Long.compareUnsigned(C4688c0.m18729c(C4688c0.m18729c(this.f8074e) * 32), C4688c0.m18729c(C4688c0.m18729c(this.f8073d) * 25)) > 0) {
            m11528w(AbstractC3044c1.m11263c(this.f8073d));
        } else {
            m11517l();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11516k() {
        this.f8074e = 0;
        long[] jArr = this.f8070a;
        if (jArr != AbstractC3044c1.f8088a) {
            AbstractC5102r.m20674z(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f8070a;
            int i10 = this.f8073d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        AbstractC5102r.m20672x(this.f8072c, null, 0, this.f8073d);
        AbstractC5102r.m20672x(this.f8071b, null, 0, this.f8073d);
        m11520o();
    }

    /* JADX INFO: renamed from: l */
    public final void m11517l() {
        long[] jArr = this.f8070a;
        int i10 = this.f8073d;
        Object[] objArr = this.f8071b;
        Object[] objArr2 = this.f8072c;
        int i11 = (i10 + 7) >> 3;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = jArr[i13] & (-9187201950435737472L);
            jArr[i13] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int iM20730e0 = AbstractC5106t.m20730e0(jArr);
        int i14 = iM20730e0 - 1;
        jArr[i14] = (jArr[i14] & 72057594037927935L) | (-72057594037927936L);
        jArr[iM20730e0] = jArr[0];
        int i15 = 0;
        while (i15 != i10) {
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j11 = (jArr[i16] >> i17) & 255;
            if (j11 != 128 && j11 == 254) {
                Object obj = objArr[i15];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * (-862048943);
                int i18 = iHashCode ^ (iHashCode << 16);
                int i19 = i18 >>> 7;
                int iM11518m = m11518m(i19);
                int i20 = i19 & i10;
                int i21 = i12;
                if (((iM11518m - i20) & i10) / 8 == ((i15 - i20) & i10) / 8) {
                    jArr[i16] = (((long) (i18 & 127)) << i17) | ((~(255 << i17)) & jArr[i16]);
                    jArr[AbstractC5106t.m20730e0(jArr)] = jArr[i21];
                } else {
                    int i22 = iM11518m >> 3;
                    long j12 = jArr[i22];
                    int i23 = (iM11518m & 7) << 3;
                    if (((j12 >> i23) & 255) == 128) {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j12 & (~(255 << i23)));
                        jArr[i16] = (jArr[i16] & (~(255 << i17))) | (128 << i17);
                        objArr[iM11518m] = objArr[i15];
                        objArr[i15] = null;
                        objArr2[iM11518m] = objArr2[i15];
                        objArr2[i15] = null;
                    } else {
                        jArr[i22] = (((long) (i18 & 127)) << i23) | (j12 & (~(255 << i23)));
                        Object obj2 = objArr[iM11518m];
                        objArr[iM11518m] = objArr[i15];
                        objArr[i15] = obj2;
                        Object obj3 = objArr2[iM11518m];
                        objArr2[iM11518m] = objArr2[i15];
                        objArr2[i15] = obj3;
                        i15--;
                    }
                    jArr[AbstractC5106t.m20730e0(jArr)] = jArr[i21];
                }
                i15++;
                i12 = i21;
            } else {
                i15++;
            }
        }
        m11520o();
    }

    /* JADX INFO: renamed from: m */
    public final int m11518m(int i10) {
        int i11 = this.f8073d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f8070a;
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

    /* JADX INFO: renamed from: n */
    public final int m11519n(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f8073d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f8070a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (AbstractC1061t.m3842c(this.f8071b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iM11518m = m11518m(i11);
                if (this.f8187f == 0 && ((this.f8070a[iM11518m >> 3] >> ((iM11518m & 7) << 3)) & 255) != 254) {
                    m11515j();
                    iM11518m = m11518m(i11);
                }
                this.f8074e++;
                int i19 = this.f8187f;
                long[] jArr2 = this.f8070a;
                int i20 = iM11518m >> 3;
                long j14 = jArr2[i20];
                int i21 = (iM11518m & 7) << 3;
                this.f8187f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f8073d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iM11518m - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iM11518m;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m11520o() {
        this.f8187f = AbstractC3044c1.m11261a(m11239f()) - this.f8074e;
    }

    /* JADX INFO: renamed from: p */
    public final void m11521p(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = AbstractC3044c1.f8088a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC5102r.m20674z(jArr2, -9187201950435737472L, 0, 0, 6, null);
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
            jArr = jArr2;
        }
        this.f8070a = jArr;
        m11520o();
    }

    /* JADX INFO: renamed from: q */
    public final void m11522q(int i10) {
        int iMax = i10 > 0 ? Math.max(7, AbstractC3044c1.m11264d(i10)) : 0;
        this.f8073d = iMax;
        m11521p(iMax);
        this.f8071b = iMax == 0 ? AbstractC3489a.f9695c : new Object[iMax];
        this.f8072c = iMax == 0 ? AbstractC3489a.f9695c : new Object[iMax];
    }

    /* JADX INFO: renamed from: r */
    public final Object m11523r(Object obj, Object obj2) {
        int iM11519n = m11519n(obj);
        if (iM11519n < 0) {
            iM11519n = ~iM11519n;
        }
        Object[] objArr = this.f8072c;
        Object obj3 = objArr[iM11519n];
        this.f8071b[iM11519n] = obj;
        objArr[iM11519n] = obj2;
        return obj3;
    }

    /* JADX INFO: renamed from: s */
    public final void m11524s(AbstractC3041b1 abstractC3041b1) {
        abstractC3041b1.getClass();
        Object[] objArr = abstractC3041b1.f8071b;
        Object[] objArr2 = abstractC3041b1.f8072c;
        long[] jArr = abstractC3041b1.f8070a;
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
                        int i13 = (i10 << 3) + i12;
                        m11529x(objArr[i13], objArr2[i13]);
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

    /* JADX INFO: renamed from: t */
    public final void m11525t(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            m11529x(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m11526u(java.lang.Object r14) {
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
            int r3 = r13.f8073d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f8070a
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
            java.lang.Object[] r11 = r13.f8071b
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
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.m11527v(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: p117i.C3082r0.m11526u(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: v */
    public final Object m11527v(int i10) {
        this.f8074e--;
        long[] jArr = this.f8070a;
        int i11 = this.f8073d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f8071b[i10] = null;
        Object[] objArr = this.f8072c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    /* JADX INFO: renamed from: w */
    public final void m11528w(int i10) {
        int i11;
        long[] jArr = this.f8070a;
        Object[] objArr = this.f8071b;
        Object[] objArr2 = this.f8072c;
        int i12 = this.f8073d;
        m11522q(i10);
        long[] jArr2 = this.f8070a;
        Object[] objArr3 = this.f8071b;
        Object[] objArr4 = this.f8072c;
        int i13 = this.f8073d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i15 = iHashCode ^ (iHashCode << 16);
                int iM11518m = m11518m(i15 >>> 7);
                i11 = i14;
                long j10 = i15 & 127;
                int i16 = iM11518m >> 3;
                int i17 = (iM11518m & 7) << 3;
                long j11 = (j10 << i17) | (jArr2[i16] & (~(255 << i17)));
                jArr2[i16] = j11;
                jArr2[(((iM11518m - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr3[iM11518m] = obj;
                objArr4[iM11518m] = objArr2[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m11529x(Object obj, Object obj2) {
        int iM11519n = m11519n(obj);
        if (iM11519n < 0) {
            iM11519n = ~iM11519n;
        }
        this.f8071b[iM11519n] = obj;
        this.f8072c[iM11519n] = obj2;
    }

    public /* synthetic */ C3082r0(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
