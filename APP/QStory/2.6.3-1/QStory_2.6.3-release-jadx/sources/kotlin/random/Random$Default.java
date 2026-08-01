package kotlin.random;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5217;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u00013B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010#J\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0017¢\u0006\u0004\b*\u0010+J\u0017\u0010*\u001a\u00020(2\u0006\u0010,\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010-J'\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u00100R\u0014\u00101\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, m151d2 = {"kotlin/random/Random$Default", "Lkotlin/random/飘花落叶言子楪世兰苏哲;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "Lkotlin/飘花落叶言子楪兰苏哲世;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "bitCount", "nextBits", "(I)I", "nextInt", "()I", "until", "from", "(II)I", "", "nextLong", "()J", "(J)J", "(JJ)J", "", "nextBoolean", "()Z", "", "nextDouble", "()D", "(D)D", "(DD)D", "", "nextFloat", "()F", "", "array", "nextBytes", "([B)[B", "size", "(I)[B", "fromIndex", "toIndex", "([BII)[B", "defaultRandom", "Lkotlin/random/飘花落叶言子楪世兰苏哲;", "Serialized", "kotlin-stdlib"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class Random$Default extends AbstractC5233 implements Serializable {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\bB¢\u0006\u0004\b\u0003\u0010\u0004J\n\u0010\u0007\u001a\u00020\bH\u0082\u0080\u0004R\u000f\u0010\u0005\u001a\u00020\u0006X\u0082Ô\b¢\u0006\u0002\n\u0000¨\u0006\t"}, m151d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
    public static final class Serialized implements Serializable {
        public static final Serialized INSTANCE = new Serialized();
        private static final long serialVersionUID = 0;

        private Serialized() {
        }

        private final Object readResolve() {
            return AbstractC5233.Default;
        }
    }

    public /* synthetic */ Random$Default(AbstractC5217 abstractC5217) {
        this();
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return Serialized.INSTANCE;
    }

    @Override // kotlin.random.AbstractC5233
    public int nextBits(int bitCount) {
        return AbstractC5233.defaultRandom.nextBits(bitCount);
    }

    @Override // kotlin.random.AbstractC5233
    public boolean nextBoolean() {
        return AbstractC5233.defaultRandom.nextBoolean();
    }

    @Override // kotlin.random.AbstractC5233
    public byte[] nextBytes(byte[] array) {
        array.getClass();
        return AbstractC5233.defaultRandom.nextBytes(array);
    }

    @Override // kotlin.random.AbstractC5233
    public double nextDouble() {
        return AbstractC5233.defaultRandom.nextDouble();
    }

    @Override // kotlin.random.AbstractC5233
    public float nextFloat() {
        return AbstractC5233.defaultRandom.nextFloat();
    }

    @Override // kotlin.random.AbstractC5233
    public int nextInt() {
        return AbstractC5233.defaultRandom.nextInt();
    }

    @Override // kotlin.random.AbstractC5233
    public long nextLong() {
        return AbstractC5233.defaultRandom.nextLong();
    }

    private Random$Default() {
    }

    @Override // kotlin.random.AbstractC5233
    public double nextDouble(double until) {
        return AbstractC5233.defaultRandom.nextDouble(until);
    }

    @Override // kotlin.random.AbstractC5233
    public int nextInt(int until) {
        return AbstractC5233.defaultRandom.nextInt(until);
    }

    @Override // kotlin.random.AbstractC5233
    public long nextLong(long until) {
        return AbstractC5233.defaultRandom.nextLong(until);
    }

    @Override // kotlin.random.AbstractC5233
    public double nextDouble(double from, double until) {
        return AbstractC5233.defaultRandom.nextDouble(from, until);
    }

    @Override // kotlin.random.AbstractC5233
    public int nextInt(int from, int until) {
        return AbstractC5233.defaultRandom.nextInt(from, until);
    }

    @Override // kotlin.random.AbstractC5233
    public long nextLong(long from, long until) {
        return AbstractC5233.defaultRandom.nextLong(from, until);
    }

    @Override // kotlin.random.AbstractC5233
    public byte[] nextBytes(int size) {
        return AbstractC5233.defaultRandom.nextBytes(size);
    }

    @Override // kotlin.random.AbstractC5233
    public byte[] nextBytes(byte[] array, int fromIndex, int toIndex) {
        array.getClass();
        return AbstractC5233.defaultRandom.nextBytes(array, fromIndex, toIndex);
    }
}
