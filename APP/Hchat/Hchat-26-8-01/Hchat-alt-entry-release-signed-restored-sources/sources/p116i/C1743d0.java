package p116i;

import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p117i0.InterfaceC1854l2;

/* JADX INFO: renamed from: i.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1743d0 implements InterfaceC1854l2 {

    /* JADX INFO: renamed from: g */
    public Float f5819g;

    /* JADX INFO: renamed from: h */
    public Float f5820h;

    /* JADX INFO: renamed from: i */
    public final C1845j1 f5821i;

    /* JADX INFO: renamed from: j */
    public C1806z0 f5822j;

    /* JADX INFO: renamed from: k */
    public boolean f5823k;

    /* JADX INFO: renamed from: l */
    public boolean f5824l;

    /* JADX INFO: renamed from: m */
    public long f5825m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C1752g0 f5826n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1743d0(C1752g0 c1752g0, Float f3, Float f10, C1740c0 c1740c0) {
        C1771m1 c1771m1 = AbstractC1742d.f5810j;
        this.f5826n = c1752g0;
        this.f5819g = f3;
        this.f5820h = f10;
        this.f5821i = AbstractC1874r.m4639u(f3);
        this.f5822j = new C1806z0(c1740c0, c1771m1, this.f5819g, this.f5820h, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1854l2
    public final Object getValue() {
        return this.f5821i.getValue();
    }
}
