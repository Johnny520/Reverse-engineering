package p001;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: ۟.e8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0199e8 extends AbstractC0190e {
    @Override // p001.AbstractC0255i8
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int mo1057(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // p001.AbstractC0190e
    /* JADX INFO: renamed from: ۥ۟۠ */
    public final Random mo1051() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        C0237h4.m1089("current(...)", threadLocalRandomCurrent);
        return threadLocalRandomCurrent;
    }
}
