package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class pk0 implements InterfaceC0643q8 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0643q8 f4921a;

    /* JADX INFO: renamed from: b */
    public final int f4922b;

    /* JADX INFO: renamed from: c */
    public int f4923c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pk0(InterfaceC0643q8 interfaceC0643q8, int i) {
        this.f4921a = interfaceC0643q8;
        this.f4922b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: a */
    public final void mo1681a(int i, Object obj) {
        this.f4921a.mo1681a(i + (this.f4923c == 0 ? this.f4922b : 0), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: b */
    public final void mo1682b(Object obj) {
        this.f4923c++;
        this.f4921a.mo1682b(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: c */
    public final void mo1683c() {
        this.f4921a.mo1683c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: d */
    public final void mo1684d(int i, Object obj) {
        this.f4921a.mo1684d(i + (this.f4923c == 0 ? this.f4922b : 0), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: f */
    public final void mo1686f(int i, int i2, int i3) {
        int i4 = this.f4923c == 0 ? this.f4922b : 0;
        this.f4921a.mo1686f(i + i4, i2 + i4, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: g */
    public final Object mo1687g() {
        return this.f4921a.mo1687g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: h */
    public final void mo1688h(int i, int i2) {
        this.f4921a.mo1688h(i + (this.f4923c == 0 ? this.f4922b : 0), i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: i */
    public final void mo3141i(InterfaceC0904ww interfaceC0904ww, Object obj) {
        this.f4921a.mo3141i(interfaceC0904ww, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0643q8
    /* JADX INFO: renamed from: j */
    public final void mo1689j() {
        if (this.f4923c <= 0) {
            AbstractC0653qi.m3252a("OffsetApplier up called with no corresponding down");
        }
        this.f4923c--;
        this.f4921a.mo1689j();
    }
}
