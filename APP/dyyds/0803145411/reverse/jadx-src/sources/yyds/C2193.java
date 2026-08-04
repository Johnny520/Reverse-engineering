package yyds;

/* JADX INFO: renamed from: yyds.ᲁᛳᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2193 implements InterfaceC0652 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2720 f10765;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ Class f10766;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Class f10767;

    public C2193(Class cls, Class cls2, AbstractC2720 abstractC2720) {
        this.f10766 = cls;
        this.f10767 = cls2;
        this.f10765 = abstractC2720;
    }

    public final String toString() {
        return "Factory[type=" + this.f10767.getName() + "+" + this.f10766.getName() + ",adapter=" + this.f10765 + "]";
    }

    @Override // yyds.InterfaceC0652
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final AbstractC2720 mo976(C0114 c0114, C2805 c2805) {
        Class cls = c2805.f13682;
        if (cls == this.f10766 || cls == this.f10767) {
            return this.f10765;
        }
        return null;
    }
}
