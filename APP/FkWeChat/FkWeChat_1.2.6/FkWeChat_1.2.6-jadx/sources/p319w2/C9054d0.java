package p319w2;

import p024b9.AbstractC1043k;
import p030c3.AbstractC1314a;
import p121i3.C3193w;

/* JADX INFO: renamed from: w2.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9054d0 {

    /* JADX INFO: renamed from: a */
    public final long f31054a;

    /* JADX INFO: renamed from: b */
    public final long f31055b;

    /* JADX INFO: renamed from: c */
    public final int f31056c;

    public C9054d0(long j10, long j11, int i10) {
        this.f31054a = j10;
        this.f31055b = j11;
        this.f31056c = i10;
        if (C3193w.m12101f(j10) == 0) {
            AbstractC1314a.m5291a("width cannot be TextUnit.Unspecified");
        }
        if (C3193w.m12101f(j11) == 0) {
            AbstractC1314a.m5291a("height cannot be TextUnit.Unspecified");
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m35143a() {
        return this.f31055b;
    }

    /* JADX INFO: renamed from: b */
    public final int m35144b() {
        return this.f31056c;
    }

    /* JADX INFO: renamed from: c */
    public final long m35145c() {
        return this.f31054a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9054d0)) {
            return false;
        }
        C9054d0 c9054d0 = (C9054d0) obj;
        return C3193w.m12100e(this.f31054a, c9054d0.f31054a) && C3193w.m12100e(this.f31055b, c9054d0.f31055b) && AbstractC9059e0.m35203i(this.f31056c, c9054d0.f31056c);
    }

    public int hashCode() {
        return (((C3193w.m12104i(this.f31054a) * 31) + C3193w.m12104i(this.f31055b)) * 31) + AbstractC9059e0.m35204j(this.f31056c);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) C3193w.m12106k(this.f31054a)) + ", height=" + ((Object) C3193w.m12106k(this.f31055b)) + ", placeholderVerticalAlign=" + ((Object) AbstractC9059e0.m35205k(this.f31056c)) + ')';
    }

    public /* synthetic */ C9054d0(long j10, long j11, int i10, AbstractC1043k abstractC1043k) {
        this(j10, j11, i10);
    }
}
