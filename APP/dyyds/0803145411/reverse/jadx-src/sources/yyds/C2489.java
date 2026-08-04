package yyds;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: renamed from: yyds.ᲇᛸᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2489 extends AbstractC2334 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f12290;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2489(Class cls, int i) {
        super(cls);
        this.f12290 = i;
    }

    @Override // yyds.AbstractC2334
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Date mo3911(Date date) {
        switch (this.f12290) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
