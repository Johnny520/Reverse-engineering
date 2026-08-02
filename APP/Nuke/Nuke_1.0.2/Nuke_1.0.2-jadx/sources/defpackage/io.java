package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class io implements k40, q50, lv1 {
    public final /* synthetic */ int h;
    public final ByteBuffer i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public io(int i) {
        this.h = i;
        switch (i) {
            case 3:
                this.i = ByteBuffer.allocate(4);
                break;
            default:
                this.i = ByteBuffer.allocate(8);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lv1
    public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.h) {
            case 2:
                Long l = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.i) {
                    this.i.position(0);
                    messageDigest.update(this.i.putLong(l.longValue()).array());
                    break;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.i) {
                    this.i.position(0);
                    messageDigest.update(this.i.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q50
    public short c() throws p50 {
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new p50();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q50
    public int e() {
        return c() | (c() << 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.k40
    public Object f() {
        ByteBuffer byteBuffer = this.i;
        byteBuffer.position(0);
        return byteBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q50
    public int g(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.i;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q50
    public long skip(long j) {
        ByteBuffer byteBuffer = this.i;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public io(int i, ByteBuffer byteBuffer) {
        this.h = i;
        switch (i) {
            case 1:
                this.i = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
            default:
                this.i = byteBuffer;
                break;
        }
    }

    @Override // defpackage.k40
    public void b() {
    }
}
