package p162l3;

/* JADX INFO: renamed from: l3.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2462p implements InterfaceC2461o {

    /* JADX INFO: renamed from: g */
    public final int f8075g;

    /* JADX INFO: renamed from: h */
    public int f8076h = -1;

    /* JADX INFO: renamed from: i */
    public int f8077i = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2462p(int i9) {
        this.f8075g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p162l3.InterfaceC2461o
    /* JADX INFO: renamed from: a */
    public final boolean mo624a(CharSequence charSequence, int i9, int i10, C2467u c2467u) {
        int i11 = this.f8075g;
        if (i9 > i11 || i11 >= i10) {
            return i10 <= i11;
        }
        this.f8076h = i9;
        this.f8077i = i10;
        return false;
    }

    @Override // p162l3.InterfaceC2461o
    /* JADX INFO: renamed from: e */
    public final Object mo627e() {
        return this;
    }
}
