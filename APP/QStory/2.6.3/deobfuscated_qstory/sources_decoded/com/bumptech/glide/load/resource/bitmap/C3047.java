package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.data.InterfaceC2960;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import p286.InterfaceC8391;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3047 implements InterfaceC3044, InterfaceC8391, InterfaceC2960 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ByteBuffer f9695;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9696;

    public C3047(int i) {
        this.f9696 = i;
        switch (i) {
            case 2:
                this.f9695 = ByteBuffer.allocate(4);
                break;
            default:
                this.f9695 = ByteBuffer.allocate(8);
                break;
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3044
    public long skip(long j) {
        ByteBuffer byteBuffer = this.f9695;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2960
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public Object mo6426() {
        ByteBuffer byteBuffer = this.f9695;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // p286.InterfaceC8391
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo6591(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f9696) {
            case 1:
                Long l = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f9695) {
                    this.f9695.position(0);
                    messageDigest.update(this.f9695.putLong(l.longValue()).array());
                    break;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f9695) {
                    this.f9695.position(0);
                    messageDigest.update(this.f9695.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3044
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public short mo4165() throws DefaultImageHeaderParser$Reader$EndOfFileException {
        ByteBuffer byteBuffer = this.f9695;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & DefaultClassResolver.NAME);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3044
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public int mo4166(byte[] bArr, int i) {
        ByteBuffer byteBuffer = this.f9695;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.InterfaceC3044
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public int mo4167() {
        return mo4165() | (mo4165() << 8);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2960
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo6427() {
    }

    public C3047(ByteBuffer byteBuffer, int i) {
        this.f9696 = i;
        switch (i) {
            case 3:
                this.f9695 = byteBuffer;
                break;
            default:
                this.f9695 = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
        }
    }
}
