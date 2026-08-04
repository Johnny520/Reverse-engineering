package yyds;

/* JADX INFO: renamed from: yyds.ᛱᛷᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0171 extends AbstractC0332 implements InterfaceC0890 {
    public AbstractC0171(InterfaceC0274 interfaceC0274) {
        super(interfaceC0274);
        if (interfaceC0274 == null || interfaceC0274.mo733() == C2586.f12764) {
            return;
        }
        C0188.m798("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // yyds.AbstractC0332
    public final String toString() {
        if (this.f1754 != null) {
            return super.toString();
        }
        AbstractC1700.f8634.getClass();
        return C1476.m2975(this);
    }

    @Override // yyds.InterfaceC0274
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC2213 mo733() {
        return C2586.f12764;
    }

    @Override // yyds.InterfaceC0890
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final int mo483() {
        return 2;
    }
}
