package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.data.InterfaceC2959;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import p286.InterfaceC8390;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3046 implements InterfaceC3043, InterfaceC8390, InterfaceC2959 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ByteBuffer f9693;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9694;

    public C3046(int i) {
        this.f9694 = i;
        switch (i) {
            case 2:
                this.f9693 = ByteBuffer.allocate(4);
                break;
            default:
                this.f9693 = ByteBuffer.allocate(8);
                break;
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3043
    public long skip(long j) {
        ByteBuffer byteBuffer = this.f9693;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2959
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Object mo6368() {
        ByteBuffer byteBuffer = this.f9693;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // p286.InterfaceC8390
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo6531(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f9694) {
            case 1:
                Long l = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f9693) {
                    this.f9693.position(0);
                    messageDigest.update(this.f9693.putLong(l.longValue()).array());
                    break;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f9693) {
                    this.f9693.position(0);
                    messageDigest.update(this.f9693.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3043
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public short mo4156() throws DefaultImageHeaderParser$Reader$EndOfFileException {
        ByteBuffer byteBuffer = this.f9693;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & DefaultClassResolver.NAME);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3043
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public int mo4157(byte[] bArr, int i) {
        ByteBuffer byteBuffer = this.f9693;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3043
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public int mo4158() {
        return mo4156() | (mo4156() << 8);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2959
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo6369() {
    }

    public C3046(ByteBuffer byteBuffer, int i) {
        this.f9694 = i;
        switch (i) {
            case 3:
                this.f9693 = byteBuffer;
                break;
            default:
                this.f9693 = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
        }
    }
}
