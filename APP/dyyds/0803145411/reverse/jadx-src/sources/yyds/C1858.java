package yyds;

import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᛸᲀᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1858 extends AbstractC2720 {
    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) throws IOException {
        if (c1942.m3744() == 9) {
            c1942.m3767();
            return null;
        }
        try {
            int iM3771 = c1942.m3771();
            if (iM3771 <= 255 && iM3771 >= -128) {
                return Byte.valueOf((byte) iM3771);
            }
            C1693.m3434("Lossy conversion from ", iM3771, " to byte; at path ", c1942.m3749(true));
            return null;
        } catch (NumberFormatException e) {
            throw new C1600(e);
        }
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) throws IOException {
        if (((Number) obj) == null) {
            c1405.m2857();
        } else {
            c1405.m2861(r4.byteValue());
        }
    }
}
