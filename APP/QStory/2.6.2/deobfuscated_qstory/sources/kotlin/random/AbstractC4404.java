package kotlin.random;

import java.util.Random;

/* JADX INFO: renamed from: kotlin.random.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4404 extends AbstractC4400 {
    public abstract Random getImpl();

    @Override // kotlin.random.AbstractC4400
    public int nextBits(int i) {
        return (getImpl().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // kotlin.random.AbstractC4400
    public boolean nextBoolean() {
        return getImpl().nextBoolean();
    }

    @Override // kotlin.random.AbstractC4400
    public byte[] nextBytes(byte[] bArr) {
        bArr.getClass();
        getImpl().nextBytes(bArr);
        return bArr;
    }

    @Override // kotlin.random.AbstractC4400
    public double nextDouble() {
        return getImpl().nextDouble();
    }

    @Override // kotlin.random.AbstractC4400
    public float nextFloat() {
        return getImpl().nextFloat();
    }

    @Override // kotlin.random.AbstractC4400
    public int nextInt() {
        return getImpl().nextInt();
    }

    @Override // kotlin.random.AbstractC4400
    public long nextLong() {
        return getImpl().nextLong();
    }

    @Override // kotlin.random.AbstractC4400
    public int nextInt(int i) {
        return getImpl().nextInt(i);
    }
}
