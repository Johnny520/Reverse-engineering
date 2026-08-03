package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: io.sentry.util.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2035g implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final AtomicLong f7221c = null;

    /* JADX INFO: renamed from: a */
    public long f7222a;

    /* JADX INFO: renamed from: b */
    public final long f7223b;

    static {
        f7221c = new AtomicLong(System.nanoTime());
    }

    public C2035g() {
        long r0 = m4177a();
        long r2 = (m4177a() << 1) | 1;
        this.f7223b = r2;
        this.f7222a = r2 + r0;
    }

    /* JADX INFO: renamed from: a */
    public static long m4177a() {
    L2:
        AtomicLong r0 = f7221c;
        long r1 = r0.get();
        long r3 = (r1 >> 12) ^ r1;
        long r32 = r3 ^ (r3 << 25);
        long r33 = (r32 ^ (r32 >> 27)) * 2685821657736338717L;
        if (r0.compareAndSet(r1, r33) == false) goto L2;
        return r33;
    }

    /* JADX INFO: renamed from: b */
    public final void m4178b(byte[] r8) {
        int r0 = 0;
    L4:
        if (r0 >= r8.length) goto L6;
        this.f7222a = (this.f7222a * 6364136223846793005L) + this.f7223b;
        r8[r0] = (byte) ((((r1 >>> 22) ^ r1) >>> ((int) ((r1 >>> 61) + 22))) >>> 24);
        r0 = r0 + 1;
        goto L4
    }

    /* JADX INFO: renamed from: c */
    public final double m4179c() {
        long r0 = this.f7222a * 6364136223846793005L;
        long r4 = this.f7223b;
        long r02 = r0 + r4;
        long r7 = (((r02 >>> 22) ^ r02) >>> ((int) ((r02 >>> 61) + 22))) & 4294967295L;
        this.f7222a = (r02 * 6364136223846793005L) + r4;
        return (((r7 >>> 6) << 27) + (((((r0 >>> 22) ^ r0) >>> ((int) ((r0 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }
}
