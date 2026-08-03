package p376z4;

/* JADX INFO: renamed from: z4.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6095i extends AbstractC6091e {

    /* JADX INFO: renamed from: i */
    public final C6093g f24612i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6095i(int i9) {
        super(i9);
        this.f24612i = new C6093g(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m10851o() {
        C6093g c6093g = this.f24612i;
        int i9 = c6093g.f24610i - 1;
        while (i9 >= 0 && c6093g.m10846n(i9) < 0) {
            i9--;
        }
        int i10 = i9 + 1;
        c6093g.m10849r(i10);
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final int m10852p(int i9) {
        C6093g c6093g = this.f24612i;
        if (i9 >= c6093g.f24610i) {
            return -1;
        }
        return c6093g.m10846n(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m10853q(int i9, InterfaceC6094h interfaceC6094h) {
        InterfaceC6094h interfaceC6094h2 = (InterfaceC6094h) this.f24601h[i9];
        m10841m(i9, interfaceC6094h);
        C6093g c6093g = this.f24612i;
        if (interfaceC6094h2 != null) {
            c6093g.m10848q(interfaceC6094h2.mo4866a(), -1);
        }
        if (interfaceC6094h != null) {
            int iMo4866a = interfaceC6094h.mo4866a();
            int i10 = c6093g.f24610i;
            for (int i11 = 0; i11 <= iMo4866a - i10; i11++) {
                c6093g.m10844l(-1);
            }
            c6093g.m10848q(iMo4866a, i9);
        }
    }
}
