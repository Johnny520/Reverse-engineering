package p000;

/* JADX INFO: renamed from: ej */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0174ej extends at0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1470b = 1;

    /* JADX INFO: renamed from: c */
    public final Object f1471c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0174ej(InterfaceC0742sw interfaceC0742sw) {
        super(new C0003a2(26));
        this.f1471c = new C0211fj(interfaceC0742sw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.at0
    /* JADX INFO: renamed from: a */
    public final ct0 mo206a(Object obj) {
        switch (this.f1470b) {
            case 0:
                return new ct0(this, obj, obj == null, null, true);
            default:
                return new ct0(this, obj, obj == null, (C0496n2) this.f1471c, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.at0
    /* JADX INFO: renamed from: b */
    public cb1 mo207b() {
        switch (this.f1470b) {
            case 0:
                return (C0211fj) this.f1471c;
            default:
                return super.mo207b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0174ej(InterfaceC0298hw interfaceC0298hw) {
        super(interfaceC0298hw);
        C0496n2 c0496n2 = C0496n2.f4141U;
        this.f1471c = c0496n2;
    }
}
