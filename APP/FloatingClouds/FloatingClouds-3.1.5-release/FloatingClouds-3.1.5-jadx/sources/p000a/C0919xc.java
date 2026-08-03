package p000a;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: renamed from: a.xc */
/* JADX INFO: loaded from: classes.dex */
public final class C0919xc extends AbstractC0925y {
    @Override // p000a.AbstractC0925y
    /* JADX INFO: renamed from: a */
    public final Random mo1537a() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        C0631i9.m1481d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
