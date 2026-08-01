package androidx.compose.foundation.lazy.layout;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0358c {

    /* JADX INFO: renamed from: a */
    public long f1028a;

    /* JADX INFO: renamed from: b */
    public long f1029b;

    /* JADX INFO: renamed from: c */
    public long f1030c;

    /* JADX INFO: renamed from: d */
    public long f1031d;

    /* JADX INFO: renamed from: e */
    public long f1032e;

    /* JADX INFO: renamed from: f */
    public int f1033f = -1;

    /* JADX INFO: renamed from: a */
    public final int m1131a(int i10, int i11) {
        return i11 == -1 ? i10 : ((i11 * 3) + i10) / 4;
    }

    /* JADX INFO: renamed from: b */
    public final long m1132b(long j10, long j11) {
        if (j11 == 0) {
            return j10;
        }
        long j12 = 4;
        return ((j11 / j12) * ((long) 3)) + (j10 / j12);
    }

    /* JADX INFO: renamed from: c */
    public final void m1133c() {
        this.f1032e = 0L;
    }

    /* JADX INFO: renamed from: d */
    public final long m1134d() {
        return this.f1031d;
    }

    /* JADX INFO: renamed from: e */
    public final long m1135e() {
        return this.f1028a;
    }

    /* JADX INFO: renamed from: f */
    public final long m1136f() {
        return this.f1032e;
    }

    /* JADX INFO: renamed from: g */
    public final int m1137g() {
        return this.f1033f;
    }

    /* JADX INFO: renamed from: h */
    public final long m1138h() {
        return this.f1030c;
    }

    /* JADX INFO: renamed from: i */
    public final long m1139i() {
        return this.f1029b;
    }

    /* JADX INFO: renamed from: j */
    public final void m1140j(long j10) {
        this.f1031d = m1132b(j10, this.f1031d);
    }

    /* JADX INFO: renamed from: k */
    public final void m1141k(long j10) {
        this.f1028a = m1132b(j10, this.f1028a);
    }

    /* JADX INFO: renamed from: l */
    public final void m1142l(long j10) {
        this.f1032e = m1132b(j10, this.f1032e);
    }

    /* JADX INFO: renamed from: m */
    public final void m1143m(int i10) {
        this.f1033f = m1131a(i10, this.f1033f);
    }

    /* JADX INFO: renamed from: n */
    public final void m1144n(long j10) {
        this.f1030c = m1132b(j10, this.f1030c);
    }

    /* JADX INFO: renamed from: o */
    public final void m1145o(long j10) {
        this.f1029b = m1132b(j10, this.f1029b);
    }
}
