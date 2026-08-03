package Yue;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5882 extends AbstractC5880 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final long f14590;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final long f14591;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f14592;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public long f14593;

    public C5882(long j, long j2, long j3) {
        this.f14590 = j3;
        this.f14591 = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.f14592 = z;
        this.f14593 = z ? j : j2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f14592;
    }

    @Override // Yue.AbstractC5880
    /* JADX INFO: renamed from: ۥ۟ */
    public long mo479() {
        long j = this.f14593;
        if (j != this.f14591) {
            this.f14593 = this.f14590 + j;
        } else {
            if (!this.f14592) {
                throw new NoSuchElementException();
            }
            this.f14592 = false;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long m18196() {
        return this.f14590;
    }
}
