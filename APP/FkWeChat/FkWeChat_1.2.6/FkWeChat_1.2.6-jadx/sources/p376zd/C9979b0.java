package p376zd;

import java.io.RandomAccessFile;

/* JADX INFO: renamed from: zd.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9979b0 extends AbstractC10007o {

    /* JADX INFO: renamed from: u */
    public final RandomAccessFile f33555u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9979b0(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        randomAccessFile.getClass();
        this.f33555u = randomAccessFile;
    }

    @Override // p376zd.AbstractC10007o
    /* JADX INFO: renamed from: j */
    public synchronized void mo38626j() {
        this.f33555u.close();
    }

    @Override // p376zd.AbstractC10007o
    /* JADX INFO: renamed from: k */
    public synchronized int mo38627k(long j10, byte[] bArr, int i10, int i11) {
        bArr.getClass();
        this.f33555u.seek(j10);
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = this.f33555u.read(bArr, i10, i11 - i12);
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
        return this.f33555u.length();
    }
}
