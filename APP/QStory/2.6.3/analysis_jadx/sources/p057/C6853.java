package p057;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C6853 extends AbstractC6852 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ int f18293;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f18294;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6853(int i, int i2, int i3) {
        super(i);
        this.f18293 = i3;
        this.f18294 = i2;
    }

    @Override // p057.AbstractC6852
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo8346() {
        int i = this.f18293;
        int i2 = this.f18294;
        switch (i) {
            case 0:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
                byteBufferAllocate.getClass();
                return byteBufferAllocate;
            default:
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2);
                byteBufferAllocateDirect.getClass();
                return byteBufferAllocateDirect;
        }
    }

    @Override // p057.AbstractC6852
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo8347(Object obj) {
        switch (this.f18293) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byteBuffer.clear();
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                return byteBuffer;
            default:
                ByteBuffer byteBuffer2 = (ByteBuffer) obj;
                byteBuffer2.clear();
                byteBuffer2.order(ByteOrder.BIG_ENDIAN);
                return byteBuffer2;
        }
    }

    @Override // p057.AbstractC6852
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo12076(Object obj) {
        int i = this.f18293;
        int i2 = this.f18294;
        switch (i) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byteBuffer.getClass();
                if (byteBuffer.capacity() != i2) {
                    C5925.m11311("Check failed.");
                    break;
                } else if (byteBuffer.isDirect()) {
                    C5925.m11311("Check failed.");
                    break;
                }
                break;
            default:
                ByteBuffer byteBuffer2 = (ByteBuffer) obj;
                byteBuffer2.getClass();
                if (byteBuffer2.capacity() != i2) {
                    C5925.m11311("Check failed.");
                    break;
                } else if (!byteBuffer2.isDirect()) {
                    C5925.m11311("Check failed.");
                    break;
                }
                break;
        }
    }
}
