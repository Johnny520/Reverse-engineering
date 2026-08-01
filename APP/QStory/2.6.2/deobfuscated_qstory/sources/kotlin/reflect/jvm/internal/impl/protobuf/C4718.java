package kotlin.reflect.jvm.internal.impl.protobuf;

import io.ktor.util.C4210;
import java.util.Iterator;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C4718 implements Iterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f13782;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C4715 f13783;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f13784 = 0;

    public C4718(C4715 c4715) {
        this.f13783 = c4715;
        this.f13782 = c4715.f13780.length;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f13784 < this.f13782;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return Byte.valueOf(m9419());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final byte m9419() {
        try {
            byte[] bArr = this.f13783.f13780;
            int i = this.f13784;
            this.f13784 = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            C4210.m8627(e.getMessage());
            return (byte) 0;
        }
    }
}
