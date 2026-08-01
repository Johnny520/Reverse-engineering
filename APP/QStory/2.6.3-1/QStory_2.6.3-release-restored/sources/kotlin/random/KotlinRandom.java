package kotlin.random;

import java.util.Random;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, m151d2 = {"Lkotlin/random/KotlinRandom;", "Ljava/util/Random;", "Lkotlin/random/飘花落叶言子楪世兰苏哲;", "impl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lkotlin/random/飘花落叶言子楪世兰苏哲;)V", "", "bits", "next", "(I)I", "nextInt", "()I", "bound", "", "nextBoolean", "()Z", "", "nextLong", "()J", "", "nextFloat", "()F", "", "nextDouble", "()D", "", "bytes", "Lkotlin/飘花落叶言子楪兰苏哲世;", "nextBytes", "([B)V", "seed", "setSeed", "(J)V", "Lkotlin/random/飘花落叶言子楪世兰苏哲;", "getImpl", "()Lkotlin/random/飘花落叶言子楪世兰苏哲;", "seedInitialized", "Z", "Companion", "kotlin/random/飘花落叶言子楪世哲苏兰", "kotlin-stdlib"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
final class KotlinRandom extends Random {
    private static final C5235 Companion = new C5235();
    private static final long serialVersionUID = 0;
    private final AbstractC5233 impl;
    private boolean seedInitialized;

    public KotlinRandom(AbstractC5233 abstractC5233) {
        abstractC5233.getClass();
        this.impl = abstractC5233;
    }

    public final AbstractC5233 getImpl() {
        return this.impl;
    }

    @Override // java.util.Random
    public int next(int bits) {
        return this.impl.nextBits(bits);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.impl.nextBoolean();
    }

    @Override // java.util.Random
    public void nextBytes(byte[] bytes) {
        bytes.getClass();
        this.impl.nextBytes(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.impl.nextDouble();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.impl.nextFloat();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.impl.nextInt();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.impl.nextLong();
    }

    @Override // java.util.Random
    public void setSeed(long seed) {
        if (this.seedInitialized) {
            C6755.m11867("Setting seed is not supported.");
        } else {
            this.seedInitialized = true;
        }
    }

    @Override // java.util.Random
    public int nextInt(int bound) {
        return this.impl.nextInt(bound);
    }
}
