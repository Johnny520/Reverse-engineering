package p020;

import java.util.RandomAccess;
import kotlin.collections.AbstractC5162;
import okio.ByteString;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6938 extends AbstractC5162 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int[] f17036;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ByteString[] f17037;

    public C6938(ByteString[] byteStringArr, int[] iArr) {
        this.f17037 = byteStringArr;
        this.f17036 = iArr;
    }

    @Override // kotlin.collections.AbstractC5167, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f17037[i];
    }

    @Override // kotlin.collections.AbstractC5167
    public final int getSize() {
        return this.f17037.length;
    }

    @Override // kotlin.collections.AbstractC5162, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC5162, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
