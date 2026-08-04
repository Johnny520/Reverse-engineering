package yyds;

/* JADX INFO: renamed from: yyds.ᲁᛸᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2294 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public C2115 f11259;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public InterfaceC2295 f11260;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public long f11261;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public C0837 f11262;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C2126 f11263;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C2098 f11264;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public EnumC0940 f11266;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public C0837 f11268;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public long f11269;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public C0837 f11270;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public String f11273;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f11271 = -1;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public AbstractC0379 f11267 = AbstractC0379.f1953;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public InterfaceC1414 f11265 = InterfaceC1414.f6696;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C2135 f11272 = new C2135(2);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m4296(String str, C0837 c0837) {
        if (c0837 != null) {
            if (c0837.f3855 != null) {
                C0188.m806(str.concat(".networkResponse != null"));
            } else if (c0837.f3856 != null) {
                C0188.m806(str.concat(".cacheResponse != null"));
            } else {
                if (c0837.f3848 == null) {
                    return;
                }
                C0188.m806(str.concat(".priorResponse != null"));
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0837 m4297() {
        int i = this.f11271;
        if (i < 0) {
            C1693.m3438(this.f11271, "code < 0: ");
            return null;
        }
        C2098 c2098 = this.f11264;
        if (c2098 == null) {
            C0188.m800("request == null");
            return null;
        }
        EnumC0940 enumC0940 = this.f11266;
        if (enumC0940 == null) {
            C0188.m800("protocol == null");
            return null;
        }
        String str = this.f11273;
        if (str == null) {
            C0188.m800("message == null");
            return null;
        }
        C2126 c2126 = this.f11263;
        C2135 c2135 = this.f11272;
        c2135.getClass();
        return new C0837(c2098, enumC0940, str, i, c2126, AbstractC0797.m1823(c2135), this.f11267, this.f11260, this.f11262, this.f11270, this.f11268, this.f11269, this.f11261, this.f11259, this.f11265);
    }
}
