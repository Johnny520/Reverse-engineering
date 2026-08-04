package yyds;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: renamed from: yyds.ᲁᛳᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2192 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0311 f10763 = new C0311();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final AbstractC2720 f10764;

    public C2192(AbstractC2720 abstractC2720) {
        this.f10764 = abstractC2720;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        Date date = (Date) this.f10764.mo484(c1942);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        this.f10764.mo485(c1405, (Timestamp) obj);
    }
}
