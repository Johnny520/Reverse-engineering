package p264s0;

import p024b9.AbstractC1043k;
import p265s1.C7128q1;

/* JADX INFO: renamed from: s0.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6672c0 {

    /* JADX INFO: renamed from: a */
    public final long f20941a;

    /* JADX INFO: renamed from: b */
    public final long f20942b;

    /* JADX INFO: renamed from: c */
    public final long f20943c;

    /* JADX INFO: renamed from: d */
    public final long f20944d;

    public C6672c0(long j10, long j11, long j12, long j13) {
        this.f20941a = j10;
        this.f20942b = j11;
        this.f20943c = j12;
        this.f20944d = j13;
    }

    /* JADX INFO: renamed from: a */
    public final long m26439a(boolean z10) {
        return z10 ? this.f20941a : this.f20943c;
    }

    /* JADX INFO: renamed from: b */
    public final long m26440b(boolean z10) {
        return z10 ? this.f20942b : this.f20944d;
    }

    /* JADX INFO: renamed from: c */
    public final C6672c0 m26441c(long j10, long j11, long j12, long j13) {
        return new C6672c0(j10 != 16 ? j10 : this.f20941a, j11 != 16 ? j11 : this.f20942b, j12 != 16 ? j12 : this.f20943c, j13 != 16 ? j13 : this.f20944d, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6672c0)) {
            return false;
        }
        C6672c0 c6672c0 = (C6672c0) obj;
        return C7128q1.m28131q(this.f20941a, c6672c0.f20941a) && C7128q1.m28131q(this.f20942b, c6672c0.f20942b) && C7128q1.m28131q(this.f20943c, c6672c0.f20943c) && C7128q1.m28131q(this.f20944d, c6672c0.f20944d);
    }

    public int hashCode() {
        return (((((C7128q1.m28137w(this.f20941a) * 31) + C7128q1.m28137w(this.f20942b)) * 31) + C7128q1.m28137w(this.f20943c)) * 31) + C7128q1.m28137w(this.f20944d);
    }

    public /* synthetic */ C6672c0(long j10, long j11, long j12, long j13, AbstractC1043k abstractC1043k) {
        this(j10, j11, j12, j13);
    }
}
