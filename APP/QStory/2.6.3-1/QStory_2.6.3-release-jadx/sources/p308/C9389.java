package p308;

import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9389 extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9387 f24246;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24247;

    public /* synthetic */ C9389(C9387 c9387, int i) {
        this.f24247 = i;
        this.f24246 = c9387;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f24247;
        C9387 c9387 = this.f24246;
        switch (i2) {
            case 0:
                C9375 c9375 = c9387.f24234;
                C9387.m14689(i, c9375.f24166.f24190);
                C9386 c9386M14692 = c9387.m14692((i * 8) + c9375.f24166.f24191);
                return new C9382(c9386M14692.f24225, c9386M14692.m14680(), c9386M14692.m14680(), c9386M14692.f24227.getInt());
            case 1:
                C9375 c93752 = c9387.f24234;
                C9387.m14689(i, c93752.f24165.f24190);
                C9386 c9386M146922 = c9387.m14692((i * 8) + c93752.f24165.f24191);
                return new C9380(c9386M146922.f24225, c9386M146922.m14680(), c9386M146922.m14680(), c9386M146922.f24227.getInt());
            case 2:
                C9375 c93753 = c9387.f24234;
                C9387.m14689(i, c93753.f24167.f24190);
                C9386 c9386M146923 = c9387.m14692((i * 12) + c93753.f24167.f24191);
                ByteBuffer byteBuffer = c9386M146923.f24227;
                return new C9381(c9386M146923.f24225, byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt());
            case 3:
                return m14696(i);
            case 4:
                C9375 c93754 = c9387.f24234;
                C9387.m14689(i, c93754.f24168.f24190);
                return Integer.valueOf(c9387.f24235.getInt((i * 4) + c93754.f24168.f24191));
            default:
                C9389 c9389 = c9387.f24232;
                C9375 c93755 = c9387.f24234;
                C9387.m14689(i, c93755.f24168.f24190);
                return c9389.m14696(c9387.f24235.getInt((i * 4) + c93755.f24168.f24191));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i = this.f24247;
        C9387 c9387 = this.f24246;
        switch (i) {
        }
        return c9387.f24234.f24168.f24190;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String m14696(int i) {
        C9387 c9387 = this.f24246;
        C9375 c9375 = c9387.f24234;
        C9387.m14689(i, c9375.f24169.f24190);
        return c9387.m14692((i * 4) + c9375.f24169.f24191).m14682();
    }
}
