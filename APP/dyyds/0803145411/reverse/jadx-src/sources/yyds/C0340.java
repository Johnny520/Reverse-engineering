package yyds;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: renamed from: yyds.ᛲᛴᲇᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0340 implements InterfaceC0740, InterfaceC1493, InterfaceC0132 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1783;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ByteBuffer f1784;

    public C0340(int i) {
        this.f1783 = i;
        switch (i) {
            case 3:
                this.f1784 = ByteBuffer.allocate(4);
                break;
            default:
                this.f1784 = ByteBuffer.allocate(8);
                break;
        }
    }

    @Override // yyds.InterfaceC1493
    public long skip(long j) {
        ByteBuffer byteBuffer = this.f1784;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    @Override // yyds.InterfaceC0132
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public void mo578(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f1783) {
            case 2:
                Long l = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f1784) {
                    this.f1784.position(0);
                    messageDigest.update(this.f1784.putLong(l.longValue()).array());
                    break;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f1784) {
                    this.f1784.position(0);
                    messageDigest.update(this.f1784.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }

    @Override // yyds.InterfaceC1493
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public int mo389(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f1784;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // yyds.InterfaceC0740
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public void mo244() {
    }

    @Override // yyds.InterfaceC0740
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public Object mo245() {
        ByteBuffer byteBuffer = this.f1784;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // yyds.InterfaceC1493
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public int mo401() {
        return mo406() | (mo406() << 8);
    }

    @Override // yyds.InterfaceC1493
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public short mo406() throws C1130 {
        ByteBuffer byteBuffer = this.f1784;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new C1130();
    }

    public C0340(ByteBuffer byteBuffer, int i) {
        this.f1783 = i;
        switch (i) {
            case 1:
                this.f1784 = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
            default:
                this.f1784 = byteBuffer;
                break;
        }
    }
}
