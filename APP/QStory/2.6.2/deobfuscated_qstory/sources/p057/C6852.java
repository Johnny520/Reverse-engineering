package p057;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C6852 extends AbstractC6851 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ int f18298;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final int f18299;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6852(int i, int i2, int i3) {
        super(i);
        this.f18298 = i3;
        this.f18299 = i2;
    }

    @Override // p057.AbstractC6851
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo8356() {
        int i = this.f18298;
        int i2 = this.f18299;
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

    @Override // p057.AbstractC6851
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo8357(Object obj) {
        switch (this.f18298) {
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

    @Override // p057.AbstractC6851
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo12048(Object obj) {
        int i = this.f18298;
        int i2 = this.f18299;
        switch (i) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byteBuffer.getClass();
                if (byteBuffer.capacity() != i2) {
                    C5919.m11250("Check failed.");
                    break;
                } else if (byteBuffer.isDirect()) {
                    C5919.m11250("Check failed.");
                    break;
                }
                break;
            default:
                ByteBuffer byteBuffer2 = (ByteBuffer) obj;
                byteBuffer2.getClass();
                if (byteBuffer2.capacity() != i2) {
                    C5919.m11250("Check failed.");
                    break;
                } else if (!byteBuffer2.isDirect()) {
                    C5919.m11250("Check failed.");
                    break;
                }
                break;
        }
    }
}
