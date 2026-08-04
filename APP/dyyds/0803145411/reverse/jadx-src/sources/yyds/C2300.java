package yyds;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲁᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2300 extends AbstractC0789 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0667 f11302;

    public C2300(C0667 c0667) {
        this.f11302 = c0667;
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo827(String str, AbstractC1614 abstractC1614, Object obj, C1762 c1762) {
        List list = this.f11302.f3167;
        if (m1778(str, obj, c1762)) {
            if (list.size() == 1) {
                m3901(((Integer) list.get(0)).intValue(), str, obj, c1762);
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m3901(((Integer) it.next()).intValue(), str, obj, c1762);
            }
        }
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final String mo828() {
        return this.f11302.toString();
    }

    @Override // yyds.AbstractC2026
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final boolean mo829() {
        return this.f11302.f3167.size() == 1;
    }
}
