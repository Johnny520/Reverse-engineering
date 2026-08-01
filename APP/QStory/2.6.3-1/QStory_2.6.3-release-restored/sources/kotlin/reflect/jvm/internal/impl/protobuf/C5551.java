package kotlin.reflect.jvm.internal.impl.protobuf;

import io.ktor.util.C5043;
import java.util.Iterator;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5551 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f14131;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C5548 f14132;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f14133 = 0;

    public C5551(C5548 c5548) {
        this.f14132 = c5548;
        this.f14131 = c5548.f14129.length;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14133 < this.f14131;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(m9968());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte m9968() {
        try {
            byte[] bArr = this.f14132.f14129;
            int i = this.f14133;
            this.f14133 = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            C5043.m9176(e.getMessage());
            return (byte) 0;
        }
    }
}
