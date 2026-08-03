package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: renamed from: q6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2400q6 implements InterfaceC2713xc, InterfaceC0835Tc, InterfaceC2558tt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8411a;

    /* JADX INFO: renamed from: b */
    public final ByteBuffer f8412b;

    public C2400q6(int i, ByteBuffer byteBuffer) {
        this.f8411a = i;
        switch (i) {
            case 1:
                this.f8412b = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
            default:
                this.f8412b = byteBuffer;
                break;
        }
    }

    @Override // p000.InterfaceC2558tt
    /* JADX INFO: renamed from: a */
    public void mo1334a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f8411a) {
            case 2:
                Long l = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f8412b) {
                    this.f8412b.position(0);
                    messageDigest.update(this.f8412b.putLong(l.longValue()).array());
                    break;
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f8412b) {
                    this.f8412b.position(0);
                    messageDigest.update(this.f8412b.putInt(num.intValue()).array());
                    break;
                }
                return;
        }
    }

    @Override // p000.InterfaceC2713xc
    /* JADX INFO: renamed from: c */
    public void mo232c() {
    }

    @Override // p000.InterfaceC0835Tc
    /* JADX INFO: renamed from: f */
    public short mo234f() throws C0792Sc {
        ByteBuffer byteBuffer = this.f8412b;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new C0792Sc();
    }

    @Override // p000.InterfaceC0835Tc
    /* JADX INFO: renamed from: h */
    public int mo236h() {
        return (mo234f() << 8) | mo234f();
    }

    @Override // p000.InterfaceC2713xc
    /* JADX INFO: renamed from: j */
    public Object mo237j() {
        ByteBuffer byteBuffer = this.f8412b;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // p000.InterfaceC0835Tc
    /* JADX INFO: renamed from: l */
    public int mo239l(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f8412b;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // p000.InterfaceC0835Tc
    public long skip(long j) {
        ByteBuffer byteBuffer = this.f8412b;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public C2400q6(int i) {
        this.f8411a = i;
        switch (i) {
            case 3:
                this.f8412b = ByteBuffer.allocate(4);
                break;
            default:
                this.f8412b = ByteBuffer.allocate(8);
                break;
        }
    }
}
