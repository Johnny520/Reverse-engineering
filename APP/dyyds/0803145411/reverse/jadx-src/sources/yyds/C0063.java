package yyds;

/* JADX INFO: renamed from: yyds.ᛱᛱᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0063 extends AbstractC0677 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2144 f591;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C2106 f592;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0063(String str, InterfaceC2144 interfaceC2144, C2106 c2106) {
        super(str);
        this.f591 = interfaceC2144;
        this.f592 = c2106;
    }

    @Override // yyds.AbstractC0677
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final long mo426() throws InterruptedException {
        C2695 c2695;
        InterfaceC2144 interfaceC2144 = this.f591;
        try {
            c2695 = interfaceC2144.mo2230();
        } catch (Throwable th) {
            c2695 = new C2695(interfaceC2144, null, th, 2);
        }
        C2106 c2106 = this.f592;
        if (!c2106.f10437.contains(interfaceC2144)) {
            return -1L;
        }
        c2106.f10435.put(c2695);
        return -1L;
    }
}
