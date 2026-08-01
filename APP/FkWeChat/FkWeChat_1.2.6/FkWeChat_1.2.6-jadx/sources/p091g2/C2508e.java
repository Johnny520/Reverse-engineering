package p091g2;

import java.util.Arrays;
import p073f2.AbstractC2234c0;

/* JADX INFO: renamed from: g2.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2508e {

    /* JADX INFO: renamed from: a */
    public int f6766a;

    /* JADX INFO: renamed from: b */
    public long[] f6767b = new long[2];

    /* JADX INFO: renamed from: a */
    public final boolean m8991a(long j10) {
        if (m8993c(j10)) {
            return false;
        }
        m9000j(this.f6766a, j10);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m8992b() {
        this.f6766a = 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8993c(long j10) {
        int i10 = this.f6766a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f6767b[i11] == j10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final long m8994d(int i10) {
        return AbstractC2234c0.m8063a(this.f6767b[i10]);
    }

    /* JADX INFO: renamed from: e */
    public final int m8995e() {
        return this.f6766a;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m8996f() {
        return this.f6766a == 0;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m8997g(long j10) {
        int i10 = this.f6766a;
        int i11 = 0;
        while (i11 < i10) {
            if (j10 == this.f6767b[i11]) {
                int i12 = this.f6766a - 1;
                while (i11 < i12) {
                    long[] jArr = this.f6767b;
                    int i13 = i11 + 1;
                    jArr[i11] = jArr[i13];
                    i11 = i13;
                }
                this.f6766a--;
                return true;
            }
            i11++;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m8998h(int i10) {
        int i11 = this.f6766a;
        if (i10 >= i11) {
            return false;
        }
        int i12 = i11 - 1;
        while (i10 < i12) {
            long[] jArr = this.f6767b;
            int i13 = i10 + 1;
            jArr[i10] = jArr[i13];
            i10 = i13;
        }
        this.f6766a--;
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final long[] m8999i(int i10) {
        long[] jArr = this.f6767b;
        long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, jArr.length * 2));
        this.f6767b = jArrCopyOf;
        return jArrCopyOf;
    }

    /* JADX INFO: renamed from: j */
    public final void m9000j(int i10, long j10) {
        long[] jArrM8999i = this.f6767b;
        if (i10 >= jArrM8999i.length) {
            jArrM8999i = m8999i(i10 + 1);
        }
        jArrM8999i[i10] = j10;
        if (i10 >= this.f6766a) {
            this.f6766a = i10 + 1;
        }
    }
}
