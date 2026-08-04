package yyds;

import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᲈᛳᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2623 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final InterfaceC0732 f12908 = AbstractC1090.m2298(C2623.class);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2771 f12909;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f12910;

    public C2623(C2771 c2771, boolean z) {
        if ((c2771.f13520 instanceof C0281) && (c2771.m3899() instanceof C0973)) {
            AbstractC2026 abstractC2026M3899 = c2771;
            AbstractC2026 abstractC2026 = null;
            while (true) {
                abstractC2026M3899 = abstractC2026M3899.m3899();
                if (abstractC2026M3899 == null || (abstractC2026M3899 instanceof C0281)) {
                    break;
                } else {
                    abstractC2026 = abstractC2026M3899;
                }
            }
            if (abstractC2026M3899 instanceof C0281) {
                abstractC2026.f10102 = null;
                c2771.f13520 = abstractC2026;
                C1869 c1869 = new C1869();
                c1869.f9411 = Boolean.FALSE;
                c1869.f9409 = new C2623(c2771, true);
                c1869.f9408 = 2;
                ((C0281) abstractC2026M3899).f1524 = Arrays.asList(c1869);
                c2771 = new C2771('$');
                c2771.f13520 = abstractC2026M3899;
                c2771.f10102 = abstractC2026M3899;
            }
        }
        this.f12909 = c2771;
        this.f12910 = z;
    }

    public final String toString() {
        return this.f12909.toString();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1762 m4740(Object obj, Object obj2, C0989 c0989) {
        InterfaceC0732 interfaceC0732 = f12908;
        boolean zMo1691 = interfaceC0732.mo1691();
        C2771 c2771 = this.f12909;
        if (zMo1691) {
            interfaceC0732.mo1683(c2771.toString());
        }
        C1762 c1762 = new C1762(this, obj2, c0989);
        try {
            c2771.mo827("", AbstractC1614.f8231, obj, c1762);
        } catch (C2337 unused) {
        }
        return c1762;
    }
}
