package Yue;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: Yue.ۥۡۤۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6674 extends AbstractC2999 {
    @Override // Yue.AbstractC7000
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public double mo21329(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    @Override // Yue.AbstractC7000
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int mo21330(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // Yue.AbstractC7000
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public long mo21331(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // Yue.AbstractC7000
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public long mo21332(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    @Override // Yue.AbstractC2999
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public Random mo5819() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        C5499.m17102(threadLocalRandomCurrent, "current()");
        return threadLocalRandomCurrent;
    }
}
