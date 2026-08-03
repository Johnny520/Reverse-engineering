package kg;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p142jg.AbstractC2133a;

/* JADX INFO: renamed from: kg.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2405a extends AbstractC2133a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p142jg.AbstractC2136d
    /* JADX INFO: renamed from: c */
    public final int mo5361c(int i9, int i10) {
        return ThreadLocalRandom.current().nextInt(i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p142jg.AbstractC2136d
    /* JADX INFO: renamed from: e */
    public final long mo5362e(long j3, long j4) {
        return ThreadLocalRandom.current().nextLong(j3, j4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p142jg.AbstractC2133a
    /* JADX INFO: renamed from: f */
    public final Random mo5359f() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }
}
