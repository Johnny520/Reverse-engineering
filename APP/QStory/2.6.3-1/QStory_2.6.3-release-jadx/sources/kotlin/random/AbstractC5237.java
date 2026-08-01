package kotlin.random;

import java.util.Random;

/* JADX INFO: renamed from: kotlin.random.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5237 extends AbstractC5233 {
    public abstract Random getImpl();

    @Override // kotlin.random.AbstractC5233
    public int nextBits(int i) {
        return (getImpl().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // kotlin.random.AbstractC5233
    public boolean nextBoolean() {
        return getImpl().nextBoolean();
    }

    @Override // kotlin.random.AbstractC5233
    public byte[] nextBytes(byte[] bArr) {
        bArr.getClass();
        getImpl().nextBytes(bArr);
        return bArr;
    }

    @Override // kotlin.random.AbstractC5233
    public double nextDouble() {
        return getImpl().nextDouble();
    }

    @Override // kotlin.random.AbstractC5233
    public float nextFloat() {
        return getImpl().nextFloat();
    }

    @Override // kotlin.random.AbstractC5233
    public int nextInt() {
        return getImpl().nextInt();
    }

    @Override // kotlin.random.AbstractC5233
    public long nextLong() {
        return getImpl().nextLong();
    }

    @Override // kotlin.random.AbstractC5233
    public int nextInt(int i) {
        return getImpl().nextInt(i);
    }
}
