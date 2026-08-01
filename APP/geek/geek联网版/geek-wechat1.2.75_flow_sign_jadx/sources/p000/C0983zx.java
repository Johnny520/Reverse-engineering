package p000;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: zx */
/* JADX INFO: loaded from: classes.dex */
public final class C0983zx extends AbstractC0467m {
    @Override // p000.AbstractC0316hz
    /* JADX INFO: renamed from: c */
    public final int mo1347c(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // p000.AbstractC0467m
    /* JADX INFO: renamed from: d */
    public final Random mo1789d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC0493mp.m1856f("current(...)", threadLocalRandomCurrent);
        return threadLocalRandomCurrent;
    }
}
