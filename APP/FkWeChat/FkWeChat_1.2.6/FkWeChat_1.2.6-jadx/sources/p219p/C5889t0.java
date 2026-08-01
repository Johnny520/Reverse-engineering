package p219p;

import p091g2.C2509f;
import p121i3.AbstractC3171a0;

/* JADX INFO: renamed from: p.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5889t0 {

    /* JADX INFO: renamed from: a */
    public final C2509f f18589a = new C2509f(true);

    /* JADX INFO: renamed from: b */
    public final C2509f f18590b = new C2509f(true);

    /* JADX INFO: renamed from: a */
    public final void m23709a(long j10, long j11) {
        this.f18589a.m9001a(j10, Float.intBitsToFloat((int) (j11 >> 32)));
        this.f18590b.m9001a(j10, Float.intBitsToFloat((int) (j11 & 4294967295L)));
    }

    /* JADX INFO: renamed from: b */
    public final long m23710b() {
        return AbstractC3171a0.m11961a(this.f18589a.m9004d(Float.MAX_VALUE), this.f18590b.m9004d(Float.MAX_VALUE));
    }
}
