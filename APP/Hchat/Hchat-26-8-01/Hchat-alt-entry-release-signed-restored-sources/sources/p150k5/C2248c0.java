package p150k5;

import ac.C0058k;

/* JADX INFO: renamed from: k5.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2248c0 extends AbstractC2269t {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7451g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7452h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f7453i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0058k f7454j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2248c0(C0058k c0058k, int i9, int i10, int i11) {
        this.f7454j = c0058k;
        this.f7451g = i9;
        this.f7452h = i10;
        this.f7453i = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p150k5.AbstractC2269t
    /* JADX INFO: renamed from: a */
    public final Object mo5496a(int i9) {
        return new C2254f0((C2270u) this.f7454j.f177i, (i9 * 8) + this.f7451g, this.f7452h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7453i;
    }
}
