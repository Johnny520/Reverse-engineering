package p292;

import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.RandomAccess;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8568 extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8566 f23910;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23911;

    public /* synthetic */ C8568(C8566 c8566, int i) {
        this.f23911 = i;
        this.f23910 = c8566;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f23911;
        C8566 c8566 = this.f23910;
        switch (i2) {
            case 0:
                C8554 c8554 = c8566.f23898;
                C8566.m14111(i, c8554.f23830.f23854);
                C8565 c8565M14114 = c8566.m14114((i * 8) + c8554.f23830.f23855);
                return new C8561(c8565M14114.f23889, c8565M14114.m14102(), c8565M14114.m14102(), c8565M14114.f23891.getInt());
            case 1:
                C8554 c85542 = c8566.f23898;
                C8566.m14111(i, c85542.f23829.f23854);
                C8565 c8565M141142 = c8566.m14114((i * 8) + c85542.f23829.f23855);
                return new C8559(c8565M141142.f23889, c8565M141142.m14102(), c8565M141142.m14102(), c8565M141142.f23891.getInt());
            case 2:
                C8554 c85543 = c8566.f23898;
                C8566.m14111(i, c85543.f23831.f23854);
                C8565 c8565M141143 = c8566.m14114((i * 12) + c85543.f23831.f23855);
                ByteBuffer byteBuffer = c8565M141143.f23891;
                return new C8560(c8565M141143.f23889, byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt());
            case 3:
                return m14118(i);
            case 4:
                C8554 c85544 = c8566.f23898;
                C8566.m14111(i, c85544.f23832.f23854);
                return Integer.valueOf(c8566.f23899.getInt((i * 4) + c85544.f23832.f23855));
            default:
                C8568 c8568 = c8566.f23896;
                C8554 c85545 = c8566.f23898;
                C8566.m14111(i, c85545.f23832.f23854);
                return c8568.m14118(c8566.f23899.getInt((i * 4) + c85545.f23832.f23855));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i = this.f23911;
        C8566 c8566 = this.f23910;
        switch (i) {
        }
        return c8566.f23898.f23832.f23854;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String m14118(int i) {
        C8566 c8566 = this.f23910;
        C8554 c8554 = c8566.f23898;
        C8566.m14111(i, c8554.f23833.f23854);
        return c8566.m14114((i * 4) + c8554.f23833.f23855).m14104();
    }
}
