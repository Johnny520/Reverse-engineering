package yyds;

import java.util.UUID;

/* JADX INFO: renamed from: yyds.ᛵᛲᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1034 extends AbstractC2720 {
    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        if (c1942.m3744() == 9) {
            c1942.m3767();
            return null;
        }
        String strM3745 = c1942.m3745();
        try {
            return UUID.fromString(strM3745);
        } catch (IllegalArgumentException e) {
            StringBuilder sbM3998 = AbstractC2104.m3998("Failed parsing '", strM3745, "' as UUID; at path ");
            sbM3998.append(c1942.m3749(true));
            throw new C1600(sbM3998.toString(), e);
        }
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        UUID uuid = (UUID) obj;
        c1405.m2852(uuid == null ? null : uuid.toString());
    }
}
