package p033Q0;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p027N0.AbstractC0223g;
import p031P0.AbstractC0235a;

/* JADX INFO: renamed from: Q0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0241a extends AbstractC0235a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p031P0.AbstractC0235a
    /* JADX INFO: renamed from: a */
    public final Random mo446a() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        AbstractC0223g.m417d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p031P0.AbstractC0235a
    /* JADX INFO: renamed from: c */
    public final int mo448c() {
        return ThreadLocalRandom.current().nextInt(1000, 999999);
    }
}
