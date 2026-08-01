package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.data.InterfaceC3792;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import p302.InterfaceC9220;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3879 implements InterfaceC3876, InterfaceC9220, InterfaceC3792 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ByteBuffer f10040;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10041;

    public C3879(int i) {
        this.f10041 = i;
        switch (i) {
            case 2:
                this.f10040 = ByteBuffer.allocate(4);
                break;
            default:
                this.f10040 = ByteBuffer.allocate(8);
                break;
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3876
    public long skip(long j) {
        ByteBuffer byteBuffer = this.f10040;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3792
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Object mo6986() {
        ByteBuffer byteBuffer = this.f10040;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // p302.InterfaceC9220
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo7151(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f10041) {
            case 1:
                Long l = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f10040) {
                    this.f10040.position(0);
                    messageDigest.update(this.f10040.putLong(l.longValue()).array());
                    break;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f10040) {
                    this.f10040.position(0);
                    messageDigest.update(this.f10040.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public short mo4725() throws DefaultImageHeaderParser$Reader$EndOfFileException {
        ByteBuffer byteBuffer = this.f10040;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & DefaultClassResolver.NAME);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3876
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public int mo4726(byte[] bArr, int i) {
        ByteBuffer byteBuffer = this.f10040;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3876
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public int mo4727() {
        return mo4725() | (mo4725() << 8);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3792
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo6987() {
    }

    public C3879(ByteBuffer byteBuffer, int i) {
        this.f10041 = i;
        switch (i) {
            case 3:
                this.f10040 = byteBuffer;
                break;
            default:
                this.f10040 = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
        }
    }
}
