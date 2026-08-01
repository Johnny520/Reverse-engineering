package p249;

import com.bumptech.glide.load.engine.InterfaceC3821;
import com.bumptech.glide.load.resource.bitmap.C3850;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.protobuf.internal.C6349;
import p238.AbstractC8813;
import p250.C8911;
import p250.C8913;
import p302.C9226;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8904 implements InterfaceC8906 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8904 f22606 = new C8904(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22607;

    public /* synthetic */ C8904(int i) {
        this.f22607 = i;
    }

    @Override // p249.InterfaceC8906
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC3821 mo900(InterfaceC3821 interfaceC3821, C9226 c9226) {
        byte[] bArrArray;
        switch (this.f22607) {
            default:
                ByteBuffer byteBufferAsReadOnlyBuffer = ((C8913) ((C8911) interfaceC3821.get()).f22629.f20627).f22642.f23570.asReadOnlyBuffer();
                AtomicReference atomicReference = AbstractC8813.f22406;
                C6349 c6349 = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C6349(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
                if (c6349 != null && c6349.f15592 == 0 && c6349.f15591 == c6349.f15593.length) {
                    bArrArray = byteBufferAsReadOnlyBuffer.array();
                } else {
                    ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
                    byteBufferAsReadOnlyBuffer2.get(bArr);
                    bArrArray = bArr;
                }
                interfaceC3821 = new C3850(bArrArray);
            case 0:
                return interfaceC3821;
        }
    }
}
