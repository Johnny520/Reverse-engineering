package p265s;

import p117i0.C1823e;
import p117i0.C1845j1;
import p117i0.InterfaceC1854l2;
import p172lg.C2564d;
import p259r9.AbstractC3754e0;

/* JADX INFO: renamed from: s.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3831g0 implements InterfaceC1854l2 {

    /* JADX INFO: renamed from: g */
    public final C1845j1 f12551g;

    /* JADX INFO: renamed from: h */
    public int f12552h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3831g0(int i9) {
        int i10 = (i9 / 30) * 30;
        this.f12551g = new C1845j1(AbstractC3754e0.m7910r0(Math.max(i10 - 100, 0), i10 + 130), C1823e.f6052m);
        this.f12552h = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1854l2
    public final Object getValue() {
        return (C2564d) this.f12551g.getValue();
    }
}
