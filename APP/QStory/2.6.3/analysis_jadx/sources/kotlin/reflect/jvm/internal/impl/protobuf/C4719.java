package kotlin.reflect.jvm.internal.impl.protobuf;

import io.ktor.util.C4211;
import java.util.Iterator;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4719 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f13786;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C4716 f13787;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f13788 = 0;

    public C4719(C4716 c4716) {
        this.f13787 = c4716;
        this.f13786 = c4716.f13784.length;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13788 < this.f13786;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(m9409());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte m9409() {
        try {
            byte[] bArr = this.f13787.f13784;
            int i = this.f13788;
            this.f13788 = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            C4211.m8617(e.getMessage());
            return (byte) 0;
        }
    }
}
