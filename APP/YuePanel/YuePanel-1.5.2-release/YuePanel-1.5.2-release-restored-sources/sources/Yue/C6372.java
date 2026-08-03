package Yue;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: Yue.ۥۡۢۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6372 extends AbstractC4809 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final FileChannel f16142;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6372(boolean z, @InterfaceC6399 FileChannel fileChannel) {
        super(z);
        C5499.m17103(fileChannel, "fileChannel");
        this.f16142 = fileChannel;
    }

    @Override // Yue.AbstractC4809
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public synchronized void mo14556() {
        this.f16142.close();
    }

    @Override // Yue.AbstractC4809
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public synchronized void mo14557() {
        this.f16142.force(true);
    }

    @Override // Yue.AbstractC4809
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public synchronized int mo14558(long j, @InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "array");
        this.f16142.position(j);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = this.f16142.read(byteBufferWrap);
            if (i4 != -1) {
                i3 += i4;
            } else if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // Yue.AbstractC4809
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public synchronized void mo14559(long j) {
        try {
            long jM14569 = m14569();
            long j2 = j - jM14569;
            if (j2 > 0) {
                int i = (int) j2;
                mo14561(jM14569, new byte[i], 0, i);
            } else {
                this.f16142.truncate(j);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Yue.AbstractC4809
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public synchronized long mo14560() {
        return this.f16142.size();
    }

    @Override // Yue.AbstractC4809
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public synchronized void mo14561(long j, @InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "array");
        this.f16142.position(j);
        this.f16142.write(ByteBuffer.wrap(bArr, i, i2));
    }
}
