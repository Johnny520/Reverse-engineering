package p376zd;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: zd.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9985d0 extends AbstractC10007o {

    /* JADX INFO: renamed from: u */
    public final FileChannel f33560u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9985d0(boolean z10, FileChannel fileChannel) {
        super(z10);
        fileChannel.getClass();
        this.f33560u = fileChannel;
    }

    @Override // p376zd.AbstractC10007o
    /* JADX INFO: renamed from: j */
    public synchronized void mo38626j() {
        this.f33560u.close();
    }

    @Override // p376zd.AbstractC10007o
    /* JADX INFO: renamed from: k */
    public synchronized int mo38627k(long j10, byte[] bArr, int i10, int i11) {
        bArr.getClass();
        this.f33560u.position(j10);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i10, i11);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = this.f33560u.read(byteBufferWrap);
            if (i13 != -1) {
                i12 += i13;
            } else if (i12 == 0) {
                return -1;
            }
        }
        return i12;
    }

    @Override // p376zd.AbstractC10007o
    /* JADX INFO: renamed from: l */
    public synchronized long mo38628l() {
        return this.f33560u.size();
    }
}
