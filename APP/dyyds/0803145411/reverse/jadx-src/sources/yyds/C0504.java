package yyds;

/* JADX INFO: renamed from: yyds.ᛳᛱᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0504 extends C1853 {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final AbstractC0986 f2449;

    public C0504(InterfaceC0274 interfaceC0274, AbstractC0986 abstractC0986) {
        super(1, interfaceC0274);
        this.f2449 = abstractC0986;
    }

    @Override // yyds.C1853
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final Throwable mo1354(AbstractC0986 abstractC0986) {
        Throwable thM2614;
        Object objM2163 = this.f2449.m2163();
        return (!(objM2163 instanceof C1321) || (thM2614 = ((C1321) objM2163).m2614()) == null) ? objM2163 instanceof C0417 ? ((C0417) objM2163).f2152 : abstractC0986.mo2092() : thM2614;
    }

    @Override // yyds.C1853
    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public final String mo1355() {
        return "AwaitContinuation";
    }
}
