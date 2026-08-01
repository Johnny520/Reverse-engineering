package p121Y1;

import com.bumptech.glide.load.data.InterfaceC1936f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import me.dartcv.nuke.BuildConfig;
import p078P1.InterfaceC1145g;

/* JADX INFO: renamed from: Y1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1750k implements InterfaceC1752m, InterfaceC1145g, InterfaceC1936f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6025d;

    /* JADX INFO: renamed from: e */
    public final ByteBuffer f6026e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1750k(int i5) {
        this.f6025d = i5;
        switch (i5) {
            case 2:
                this.f6026e = ByteBuffer.allocate(4);
                break;
            default:
                this.f6026e = ByteBuffer.allocate(8);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p078P1.InterfaceC1145g
    /* JADX INFO: renamed from: a */
    public void mo150a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f6025d) {
            case BuildConfig.VERSION_CODE /* 1 */:
                Long l3 = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f6026e) {
                    this.f6026e.position(0);
                    messageDigest.update(this.f6026e.putLong(l3.longValue()).array());
                    break;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f6026e) {
                    this.f6026e.position(0);
                    messageDigest.update(this.f6026e.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1936f
    /* JADX INFO: renamed from: c */
    public Object mo3102c() {
        ByteBuffer byteBuffer = this.f6026e;
        byteBuffer.position(0);
        return byteBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121Y1.InterfaceC1752m
    /* JADX INFO: renamed from: g */
    public short mo3103g() throws C1751l {
        ByteBuffer byteBuffer = this.f6026e;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new C1751l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121Y1.InterfaceC1752m
    /* JADX INFO: renamed from: l */
    public int mo3104l() {
        return (mo3103g() << 8) | mo3103g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121Y1.InterfaceC1752m
    /* JADX INFO: renamed from: q */
    public int mo3105q(int i5, byte[] bArr) {
        ByteBuffer byteBuffer = this.f6026e;
        int iMin = Math.min(i5, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p121Y1.InterfaceC1752m
    public long skip(long j5) {
        ByteBuffer byteBuffer = this.f6026e;
        int iMin = (int) Math.min(byteBuffer.remaining(), j5);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public C1750k(int i5, ByteBuffer byteBuffer) {
        this.f6025d = i5;
        switch (i5) {
            case 3:
                this.f6026e = byteBuffer;
                break;
            default:
                this.f6026e = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1936f
    /* JADX INFO: renamed from: b */
    public void mo3101b() {
    }
}
