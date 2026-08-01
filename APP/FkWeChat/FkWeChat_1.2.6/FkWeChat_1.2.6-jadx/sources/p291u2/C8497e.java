package p291u2;

import p055e.AbstractC1960a;
import p117i.AbstractC3077p;
import p117i.C3058h0;
import p121i3.C3185o;

/* JADX INFO: renamed from: u2.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8497e {

    /* JADX INFO: renamed from: a */
    public final C3058h0 f28372a = AbstractC3077p.m11480c();

    /* JADX INFO: renamed from: b */
    public long f28373b = -1;

    /* JADX INFO: renamed from: c */
    public long f28374c;

    /* JADX INFO: renamed from: d */
    public long f28375d;

    /* JADX INFO: renamed from: e */
    public long f28376e;

    /* JADX INFO: renamed from: f */
    public float[] f28377f;

    public C8497e() {
        C3185o.a aVar = C3185o.f8471b;
        this.f28374c = aVar.m12058b();
        this.f28375d = aVar.m12058b();
    }

    /* JADX INFO: renamed from: b */
    public final void m32717b(long j10) {
        C3058h0 c3058h0 = this.f28372a;
        Object[] objArr = c3058h0.f8157c;
        long[] jArr = c3058h0.f8155a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j11 = jArr[i10];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j11) < 128) {
                        AbstractC1960a.m7104a(objArr[(i10 << 3) + i12]);
                    }
                    j11 >>= 8;
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

    /* JADX INFO: renamed from: c */
    public final void m32718c(int i10, long j10, long j11, long j12) {
        AbstractC1960a.m7104a(this.f28372a.m11449b(i10));
    }

    /* JADX INFO: renamed from: d */
    public final long m32719d() {
        return this.f28373b;
    }

    /* JADX INFO: renamed from: e */
    public final C3058h0 m32720e() {
        return this.f28372a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m32721f(long r13) {
        /*
            r12 = this;
            long r0 = r12.f28373b
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 <= 0) goto L7
            return
        L7:
            i.h0 r13 = r12.f28372a
            java.lang.Object[] r14 = r13.f8157c
            long[] r13 = r13.f8155a
            int r0 = r13.length
            int r0 = r0 + (-2)
            if (r0 < 0) goto L4c
            r1 = 0
            r2 = r1
        L14:
            r3 = r13[r2]
            long r5 = ~r3
            r7 = 7
            long r5 = r5 << r7
            long r5 = r5 & r3
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L47
            int r5 = r2 - r0
            int r5 = ~r5
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r7 = r1
        L2e:
            if (r7 >= r5) goto L45
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r3
            r10 = 128(0x80, double:6.3E-322)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L41
            int r8 = r2 << 3
            int r8 = r8 + r7
            r8 = r14[r8]
            p055e.AbstractC1960a.m7104a(r8)
        L41:
            long r3 = r3 >> r6
            int r7 = r7 + 1
            goto L2e
        L45:
            if (r5 != r6) goto L4c
        L47:
            if (r2 == r0) goto L4c
            int r2 = r2 + 1
            goto L14
        L4c:
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r13 > r13 ? 1 : (r13 == r13 ? 0 : -1))
            if (r0 != 0) goto L57
            r13 = -1
        L57:
            r12.f28373b = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p291u2.C8497e.m32721f(long):void");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m32722g(long j10, long j11, float[] fArr, int i10, int i11) {
        boolean z10;
        if (C3185o.m12048h(j11, this.f28374c)) {
            z10 = false;
        } else {
            this.f28374c = j11;
            z10 = true;
        }
        if (!C3185o.m12048h(j10, this.f28375d)) {
            this.f28375d = j10;
            z10 = true;
        }
        if (fArr != null) {
            this.f28377f = fArr;
            z10 = true;
        }
        long j12 = (((long) i10) << 32) | (((long) i11) & 4294967295L);
        if (j12 == this.f28376e) {
            return z10;
        }
        this.f28376e = j12;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m32716a(long j10) {
    }
}
