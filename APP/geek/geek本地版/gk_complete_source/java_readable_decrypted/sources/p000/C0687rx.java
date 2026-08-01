package p000;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: rx */
/* JADX INFO: loaded from: classes.dex */
public final class C0687rx extends AbstractC0467m {
    @Override // p000.AbstractC0049az
    /* JADX INFO: renamed from: c */
    public final int mo480c(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // p000.AbstractC0467m
    /* JADX INFO: renamed from: d */
    public final Random mo1772d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC0346ip.m1502n("current(...)", threadLocalRandomCurrent);
        return threadLocalRandomCurrent;
    }
}
