package p004;

import java.util.RandomAccess;
import kotlin.collections.AbstractC4330;
import okio.ByteString;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6109 extends AbstractC4330 implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int[] f16691;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ByteString[] f16692;

    public C6109(ByteString[] byteStringArr, int[] iArr) {
        this.f16692 = byteStringArr;
        this.f16691 = iArr;
    }

    @Override // kotlin.collections.AbstractC4335, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f16692[i];
    }

    @Override // kotlin.collections.AbstractC4335
    public final int getSize() {
        return this.f16692.length;
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC4330, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
