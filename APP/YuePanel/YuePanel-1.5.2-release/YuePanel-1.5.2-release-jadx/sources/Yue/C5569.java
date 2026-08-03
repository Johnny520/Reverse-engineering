package Yue;

import java.io.RandomAccessFile;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5569 extends AbstractC4809 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final RandomAccessFile f13564;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5569(boolean z, @InterfaceC6399 RandomAccessFile randomAccessFile) {
        super(z);
        C5499.m17103(randomAccessFile, "randomAccessFile");
        this.f13564 = randomAccessFile;
    }

    @Override // Yue.AbstractC4809
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public synchronized void mo14556() {
        this.f13564.close();
    }

    @Override // Yue.AbstractC4809
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public synchronized void mo14557() {
        this.f13564.getFD().sync();
    }

    @Override // Yue.AbstractC4809
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public synchronized int mo14558(long j, @InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "array");
        this.f13564.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int i4 = this.f13564.read(bArr, i, i2 - i3);
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
                this.f13564.setLength(j);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // Yue.AbstractC4809
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public synchronized long mo14560() {
        return this.f13564.length();
    }

    @Override // Yue.AbstractC4809
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public synchronized void mo14561(long j, @InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "array");
        this.f13564.seek(j);
        this.f13564.write(bArr, i, i2);
    }
}
