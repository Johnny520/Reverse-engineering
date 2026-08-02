package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: renamed from: io */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0320io implements k40, q50, lv1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4708h;

    /* JADX INFO: renamed from: i */
    public final ByteBuffer f4709i;

    public C0320io(int i) {
        this.f4708h = i;
        switch (i) {
            case 3:
                this.f4709i = ByteBuffer.allocate(4);
                break;
            default:
                this.f4709i = ByteBuffer.allocate(8);
                break;
        }
    }

    @Override // p000.lv1
    /* JADX INFO: renamed from: a */
    public void mo2275a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f4708h) {
            case 2:
                Long l = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f4709i) {
                    this.f4709i.position(0);
                    messageDigest.update(this.f4709i.putLong(l.longValue()).array());
                    break;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f4709i) {
                    this.f4709i.position(0);
                    messageDigest.update(this.f4709i.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: c */
    public short mo2375c() throws p50 {
        ByteBuffer byteBuffer = this.f4709i;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new p50();
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: e */
    public int mo2376e() {
        return mo2375c() | (mo2375c() << 8);
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: f */
    public Object mo873f() {
        ByteBuffer byteBuffer = this.f4709i;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: g */
    public int mo2377g(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f4709i;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // p000.q50
    public long skip(long j) {
        ByteBuffer byteBuffer = this.f4709i;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public C0320io(int i, ByteBuffer byteBuffer) {
        this.f4708h = i;
        switch (i) {
            case 1:
                this.f4709i = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
            default:
                this.f4709i = byteBuffer;
                break;
        }
    }

    @Override // p000.k40
    /* JADX INFO: renamed from: b */
    public void mo872b() {
    }
}
