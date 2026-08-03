package p308v1;

import p085fg.InterfaceC1231l;
import p118i1.C1902b;
import p259r9.AbstractC3754e0;
import p293u2.C4231a;
import p293u2.C4242l;

/* JADX INFO: renamed from: v1.b1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4377b1 {

    /* JADX INFO: renamed from: g */
    public int f14593g;

    /* JADX INFO: renamed from: h */
    public int f14594h;

    /* JADX INFO: renamed from: i */
    public long f14595i;

    /* JADX INFO: renamed from: j */
    public long f14596j = AbstractC4383d1.f14614a;

    /* JADX INFO: renamed from: k */
    public long f14597k = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4377b1() {
        long j3 = 0;
        this.f14595i = (j3 & 4294967295L) | (j3 << 32);
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo8820A0(long j3, float f3, InterfaceC1231l interfaceC1231l);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public void mo8821B0(long j3, float f3, C1902b c1902b) {
        mo8820A0(j3, f3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    public final void m8822C0(long j3) {
        if (C4242l.m8534a(this.f14595i, j3)) {
            return;
        }
        this.f14595i = j3;
        m8827y0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E0 */
    public final void m8823E0(long j3) {
        if (C4231a.m8498b(this.f14596j, j3)) {
            return;
        }
        this.f14596j = j3;
        m8827y0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public Object mo8824X() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public int mo8825r0() {
        return (int) (this.f14595i & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    public int mo8826w0() {
        return (int) (this.f14595i >> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    public final void m8827y0() {
        this.f14593g = AbstractC3754e0.m7909r((int) (this.f14595i >> 32), C4231a.m8506j(this.f14596j), C4231a.m8504h(this.f14596j));
        int iM7909r = AbstractC3754e0.m7909r((int) (this.f14595i & 4294967295L), C4231a.m8505i(this.f14596j), C4231a.m8503g(this.f14596j));
        this.f14594h = iM7909r;
        int i9 = this.f14593g;
        long j3 = this.f14595i;
        this.f14597k = (((long) ((i9 - ((int) (j3 >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM7909r - ((int) (j3 & 4294967295L))) / 2)));
    }
}
