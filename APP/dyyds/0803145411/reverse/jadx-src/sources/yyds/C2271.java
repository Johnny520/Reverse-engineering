package yyds;

import java.util.Date;

/* JADX INFO: renamed from: yyds.ᲁᛷᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C2271 implements InterfaceC0652 {
    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }

    @Override // yyds.InterfaceC0652
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final AbstractC2720 mo976(C0114 c0114, C2805 c2805) {
        if (c2805.f13682 == Date.class) {
            return new C2557(AbstractC2334.f11492, 0);
        }
        return null;
    }
}
