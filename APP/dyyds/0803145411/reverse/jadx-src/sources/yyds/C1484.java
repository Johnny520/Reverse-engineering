package yyds;

/* JADX INFO: renamed from: yyds.ᛷᛱᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1484 implements InterfaceC0652 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2720 f7022;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f7023;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Class f7024;

    public /* synthetic */ C1484(Class cls, AbstractC2720 abstractC2720, int i) {
        this.f7023 = i;
        this.f7024 = cls;
        this.f7022 = abstractC2720;
    }

    public final String toString() {
        int i = this.f7023;
        AbstractC2720 abstractC2720 = this.f7022;
        Class cls = this.f7024;
        switch (i) {
            case 0:
                return "Factory[type=" + cls.getName() + ",adapter=" + abstractC2720 + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + abstractC2720 + "]";
        }
    }

    @Override // yyds.InterfaceC0652
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final AbstractC2720 mo976(C0114 c0114, C2805 c2805) {
        int i = this.f7023;
        Class cls = this.f7024;
        switch (i) {
            case 0:
                if (c2805.f13682 == cls) {
                    return this.f7022;
                }
                return null;
            default:
                Class<?> cls2 = c2805.f13682;
                if (cls.isAssignableFrom(cls2)) {
                    return new C1546(this, cls2);
                }
                return null;
        }
    }
}
