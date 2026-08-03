package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.sentry.util.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2035g implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final AtomicLong f7221c = new AtomicLong(System.nanoTime());

    /* JADX INFO: renamed from: a */
    public long f7222a;

    /* JADX INFO: renamed from: b */
    public final long f7223b;

    public C2035g() {
        long jM4177a = m4177a();
        long jM4177a2 = (m4177a() << 1) | 1;
        this.f7223b = jM4177a2;
        this.f7222a = jM4177a2 + jM4177a;
    }

    /* JADX INFO: renamed from: a */
    public static long m4177a() {
        AtomicLong atomicLong;
        long j;
        long j2;
        do {
            atomicLong = f7221c;
            j = atomicLong.get();
            long j3 = (j >> 12) ^ j;
            long j4 = j3 ^ (j3 << 25);
            j2 = (j4 ^ (j4 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j, j2));
        return j2;
    }

    /* JADX INFO: renamed from: b */
    public final void m4178b(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            this.f7222a = (this.f7222a * 6364136223846793005L) + this.f7223b;
            bArr[i] = (byte) ((((r1 >>> 22) ^ r1) >>> ((int) ((r1 >>> 61) + 22))) >>> 24);
        }
    }

    /* JADX INFO: renamed from: c */
    public final double m4179c() {
        long j = this.f7222a * 6364136223846793005L;
        long j2 = this.f7223b;
        long j3 = j + j2;
        long j4 = (((j3 >>> 22) ^ j3) >>> ((int) ((j3 >>> 61) + 22))) & 4294967295L;
        this.f7222a = (j3 * 6364136223846793005L) + j2;
        return (((j4 >>> 6) << 27) + (((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }
}
