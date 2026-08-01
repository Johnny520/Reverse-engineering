package p233;

import com.bumptech.glide.load.engine.InterfaceC2988;
import com.bumptech.glide.load.resource.bitmap.C3017;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.protobuf.internal.C5516;
import p222.AbstractC7983;
import p234.C8081;
import p234.C8083;
import p286.C8396;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8074 implements InterfaceC8076 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8074 f22263 = new C8074(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22264;

    public /* synthetic */ C8074(int i) {
        this.f22264 = i;
    }

    @Override // p233.InterfaceC8076
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC2988 mo339(InterfaceC2988 interfaceC2988, C8396 c8396) {
        byte[] bArrArray;
        switch (this.f22264) {
            default:
                ByteBuffer byteBufferAsReadOnlyBuffer = ((C8083) ((C8081) interfaceC2988.get()).f22286.f20287).f22299.f23226.asReadOnlyBuffer();
                AtomicReference atomicReference = AbstractC7983.f22064;
                C5516 c5516 = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C5516(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
                if (c5516 != null && c5516.f15247 == 0 && c5516.f15246 == c5516.f15248.length) {
                    bArrArray = byteBufferAsReadOnlyBuffer.array();
                } else {
                    ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
                    byteBufferAsReadOnlyBuffer2.get(bArr);
                    bArrArray = bArr;
                }
                interfaceC2988 = new C3017(bArrArray);
            case 0:
                return interfaceC2988;
        }
    }
}
