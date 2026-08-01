package p292;

import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8560 extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8558 f23901;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23902;

    public /* synthetic */ C8560(C8558 c8558, int i) {
        this.f23902 = i;
        this.f23901 = c8558;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f23902;
        C8558 c8558 = this.f23901;
        switch (i2) {
            case 0:
                C8546 c8546 = c8558.f23889;
                C8558.m14130(i, c8546.f23821.f23845);
                C8557 c8557M14133 = c8558.m14133((i * 8) + c8546.f23821.f23846);
                return new C8553(c8557M14133.f23880, c8557M14133.m14121(), c8557M14133.m14121(), c8557M14133.f23882.getInt());
            case 1:
                C8546 c85462 = c8558.f23889;
                C8558.m14130(i, c85462.f23820.f23845);
                C8557 c8557M141332 = c8558.m14133((i * 8) + c85462.f23820.f23846);
                return new C8551(c8557M141332.f23880, c8557M141332.m14121(), c8557M141332.m14121(), c8557M141332.f23882.getInt());
            case 2:
                C8546 c85463 = c8558.f23889;
                C8558.m14130(i, c85463.f23822.f23845);
                C8557 c8557M141333 = c8558.m14133((i * 12) + c85463.f23822.f23846);
                ByteBuffer byteBuffer = c8557M141333.f23882;
                return new C8552(c8557M141333.f23880, byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt());
            case 3:
                return m14137(i);
            case 4:
                C8546 c85464 = c8558.f23889;
                C8558.m14130(i, c85464.f23823.f23845);
                return Integer.valueOf(c8558.f23890.getInt((i * 4) + c85464.f23823.f23846));
            default:
                C8560 c8560 = c8558.f23887;
                C8546 c85465 = c8558.f23889;
                C8558.m14130(i, c85465.f23823.f23845);
                return c8560.m14137(c8558.f23890.getInt((i * 4) + c85465.f23823.f23846));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i = this.f23902;
        C8558 c8558 = this.f23901;
        switch (i) {
        }
        return c8558.f23889.f23823.f23845;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String m14137(int i) {
        C8558 c8558 = this.f23901;
        C8546 c8546 = c8558.f23889;
        C8558.m14130(i, c8546.f23824.f23845);
        return c8558.m14133((i * 4) + c8546.f23824.f23846).m14123();
    }
}
