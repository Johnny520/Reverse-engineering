package p265s1;

import p152k3.AbstractC3950d;
import p172l8.C4688c0;
import p276t1.AbstractC8027c;
import p276t1.C8043k;

/* JADX INFO: renamed from: s1.s1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7138s1 {
    /* JADX WARN: Removed duplicated region for block: B:110:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0129  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m28197a(float r20, float r21, float r22, float r23, p276t1.AbstractC8027c r24) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p265s1.AbstractC7138s1.m28197a(float, float, float, float, t1.c):long");
    }

    /* JADX INFO: renamed from: b */
    public static final long m28198b(int i10) {
        return C7128q1.m28126l(C4688c0.m18729c(C4688c0.m18729c(i10) << 32));
    }

    /* JADX INFO: renamed from: c */
    public static final long m28199c(int i10, int i11, int i12, int i13) {
        return m28198b(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }

    /* JADX INFO: renamed from: d */
    public static final long m28200d(long j10) {
        return C7128q1.m28126l(C4688c0.m18729c(j10 << 32));
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ long m28201e(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return m28199c(i10, i11, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long m28202f(float r17, float r18, float r19, float r20, p276t1.AbstractC8027c r21) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p265s1.AbstractC7138s1.m28202f(float, float, float, float, t1.c):long");
    }

    /* JADX INFO: renamed from: g */
    public static final long m28203g(long j10, long j11) {
        long jM28127m = C7128q1.m28127m(j10, C7128q1.m28134t(j11));
        float fM28132r = C7128q1.m28132r(j11);
        float fM28132r2 = C7128q1.m28132r(jM28127m);
        float f10 = 1.0f - fM28132r2;
        float f11 = (fM28132r * f10) + fM28132r2;
        return m28202f(f11 == 0.0f ? 0.0f : ((C7128q1.m28136v(jM28127m) * fM28132r2) + ((C7128q1.m28136v(j11) * fM28132r) * f10)) / f11, f11 == 0.0f ? 0.0f : ((C7128q1.m28135u(jM28127m) * fM28132r2) + ((C7128q1.m28135u(j11) * fM28132r) * f10)) / f11, f11 != 0.0f ? ((C7128q1.m28133s(jM28127m) * fM28132r2) + ((C7128q1.m28133s(j11) * fM28132r) * f10)) / f11 : 0.0f, f11, C7128q1.m28134t(j11));
    }

    /* JADX INFO: renamed from: h */
    public static final long m28204h(long j10, long j11, float f10) {
        AbstractC8027c abstractC8027cM30963x = C8043k.f26795a.m30963x();
        long jM28127m = C7128q1.m28127m(j10, abstractC8027cM30963x);
        long jM28127m2 = C7128q1.m28127m(j11, abstractC8027cM30963x);
        float fM28132r = C7128q1.m28132r(jM28127m);
        float fM28136v = C7128q1.m28136v(jM28127m);
        float fM28135u = C7128q1.m28135u(jM28127m);
        float fM28133s = C7128q1.m28133s(jM28127m);
        float fM28132r2 = C7128q1.m28132r(jM28127m2);
        float fM28136v2 = C7128q1.m28136v(jM28127m2);
        float fM28135u2 = C7128q1.m28135u(jM28127m2);
        float fM28133s2 = C7128q1.m28133s(jM28127m2);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return C7128q1.m28127m(m28202f(AbstractC3950d.m15660b(fM28136v, fM28136v2, f10), AbstractC3950d.m15660b(fM28135u, fM28135u2, f10), AbstractC3950d.m15660b(fM28133s, fM28133s2, f10), AbstractC3950d.m15660b(fM28132r, fM28132r2, f10), abstractC8027cM30963x), C7128q1.m28134t(j11));
    }

    /* JADX INFO: renamed from: i */
    public static final int m28205i(long j10) {
        return (int) C4688c0.m18729c(C7128q1.m28127m(j10, C8043k.f26795a.m30939A()) >>> 32);
    }
}
