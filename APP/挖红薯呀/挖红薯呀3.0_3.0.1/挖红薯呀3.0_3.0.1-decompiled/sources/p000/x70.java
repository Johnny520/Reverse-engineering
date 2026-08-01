package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x70 extends zs0 implements u40, InterfaceC0298hw {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7278e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x70(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.f7278e = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0647qc
    public final m40 computeReflected() {
        au0.f267a.getClass();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        switch (this.f7278e) {
            case 0:
                return ((w31) this.receiver).getValue();
            case 1:
                return ((w31) this.receiver).getValue();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }
}
