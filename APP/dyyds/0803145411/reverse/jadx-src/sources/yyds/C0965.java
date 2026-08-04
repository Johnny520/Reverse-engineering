package yyds;

import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᛴᲁᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0965 extends AbstractC2720 {
    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        int iM3744 = c1942.m3744();
        if (iM3744 != 9) {
            return iM3744 == 6 ? Boolean.valueOf(Boolean.parseBoolean(c1942.m3745())) : Boolean.valueOf(c1942.m3760());
        }
        c1942.m3767();
        return null;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) throws IOException {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            c1405.m2857();
            return;
        }
        c1405.m2863();
        c1405.m2853();
        c1405.f6654.write(bool.booleanValue() ? "true" : "false");
    }
}
