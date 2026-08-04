package yyds;

import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᛷᲇᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1674 extends AbstractC2720 {
    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        if (c1942.m3744() == 9) {
            c1942.m3767();
            return null;
        }
        try {
            return Long.valueOf(c1942.m3743());
        } catch (NumberFormatException e) {
            throw new C1600(e);
        }
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) throws IOException {
        Number number = (Number) obj;
        if (number == null) {
            c1405.m2857();
        } else {
            c1405.m2861(number.longValue());
        }
    }
}
