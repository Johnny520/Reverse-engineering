package p051;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.random.AbstractC4405;

/* JADX INFO: renamed from: 飘花落叶言世子哲兰苏楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6537 extends AbstractC4405 {
    @Override // kotlin.random.AbstractC4405
    public final Random getImpl() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        threadLocalRandomCurrent.getClass();
        return threadLocalRandomCurrent;
    }

    @Override // kotlin.random.AbstractC4401
    public final double nextDouble(double d) {
        return ThreadLocalRandom.current().nextDouble(d);
    }

    @Override // kotlin.random.AbstractC4401
    public final int nextInt(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // kotlin.random.AbstractC4401
    public final long nextLong(long j) {
        return ThreadLocalRandom.current().nextLong(j);
    }

    @Override // kotlin.random.AbstractC4401
    public final long nextLong(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
