package p233;

import com.bumptech.glide.load.engine.InterfaceC2989;
import com.bumptech.glide.load.resource.bitmap.C3018;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.protobuf.internal.C5517;
import p222.AbstractC7984;
import p234.C8082;
import p234.C8084;
import p286.C8397;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8075 implements InterfaceC8077 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8075 f22261 = new C8075(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22262;

    public /* synthetic */ C8075(int i) {
        this.f22262 = i;
    }

    @Override // p233.InterfaceC8077
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC2989 mo340(InterfaceC2989 interfaceC2989, C8397 c8397) {
        byte[] bArrArray;
        switch (this.f22262) {
            default:
                ByteBuffer byteBufferAsReadOnlyBuffer = ((C8084) ((C8082) interfaceC2989.get()).f22284.f20282).f22297.f23225.asReadOnlyBuffer();
                AtomicReference atomicReference = AbstractC7984.f22061;
                C5517 c5517 = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C5517(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
                if (c5517 != null && c5517.f15247 == 0 && c5517.f15246 == c5517.f15248.length) {
                    bArrArray = byteBufferAsReadOnlyBuffer.array();
                } else {
                    ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
                    byteBufferAsReadOnlyBuffer2.get(bArr);
                    bArrArray = bArr;
                }
                interfaceC2989 = new C3018(bArrArray);
            case 0:
                return interfaceC2989;
        }
    }
}
