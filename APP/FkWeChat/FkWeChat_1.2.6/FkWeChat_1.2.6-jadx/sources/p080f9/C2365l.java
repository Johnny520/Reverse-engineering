package p080f9;

import bsh.C1189h4;
import p185m8.AbstractC5103r0;

/* JADX INFO: renamed from: f9.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2365l extends AbstractC5103r0 {

    /* JADX INFO: renamed from: q */
    public final long f6501q;

    /* JADX INFO: renamed from: r */
    public final long f6502r;

    /* JADX INFO: renamed from: s */
    public boolean f6503s;

    /* JADX INFO: renamed from: t */
    public long f6504t;

    public C2365l(long j10, long j11, long j12) {
        this.f6501q = j12;
        this.f6502r = j11;
        boolean z10 = false;
        if (j12 <= 0 ? j10 >= j11 : j10 <= j11) {
            z10 = true;
        }
        this.f6503s = z10;
        this.f6504t = z10 ? j10 : j11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6503s;
    }

    @Override // p185m8.AbstractC5103r0
    public long nextLong() {
        long j10 = this.f6504t;
        if (j10 != this.f6502r) {
            this.f6504t = this.f6501q + j10;
            return j10;
        }
        if (this.f6503s) {
            this.f6503s = false;
            return j10;
        }
        C1189h4.m4429a();
        return 0L;
    }
}
