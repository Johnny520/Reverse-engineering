package kotlin.random;

import java.io.Serializable;
import java.util.Random;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 \u000b2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m151d2 = {"Lkotlin/random/PlatformRandom;", "Lkotlin/random/飘花落叶言子楪世苏哲兰;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/Random;", "impl", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/Random;)V", "Ljava/util/Random;", "getImpl", "()Ljava/util/Random;", "Companion", "kotlin/random/飘花落叶言子楪世哲兰苏", "kotlin-stdlib"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
final class PlatformRandom extends AbstractC5237 implements Serializable {
    private static final C5234 Companion = new C5234();
    private static final long serialVersionUID = 0;
    private final Random impl;

    public PlatformRandom(Random random) {
        random.getClass();
        this.impl = random;
    }

    @Override // kotlin.random.AbstractC5237
    public Random getImpl() {
        return this.impl;
    }
}
