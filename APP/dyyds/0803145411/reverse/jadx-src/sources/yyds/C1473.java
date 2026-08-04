package yyds;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛷᛱᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1473 extends AbstractC2450 {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0118 f7005;

    public C1473(C0118 c0118) {
        this.f7005 = c0118;
    }

    @Override // yyds.AbstractC2450
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final void mo1231() {
        AbstractC2328.m4341(-203014087017326L);
    }

    @Override // yyds.AbstractC2450
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1232(C1213 c1213, AbstractC0185 abstractC0185) {
        AbstractC2328.m4341(-203061331657582L);
        AbstractC2328.m4341(-203117166232430L);
        super.mo1232(c1213, abstractC0185);
        List list = AbstractC2801.f13670;
        ArrayList arrayList = this.f7005.f809;
        AbstractC2328.m4341(-577719918822254L);
        C1509 c1509 = C1509.f7142;
        String strM3285 = AbstractC1595.m3285(arrayList, AbstractC2328.m4341(-577745688626030L), null, null, new C0514(25), 30);
        c1509.getClass();
        AbstractC2328.m4341(-27289795068782L);
        C1509.f7157.m1581(C1509.f7179[130], strM3285);
        AbstractC1960.m3789(AbstractC2328.m4341(-193689713017710L));
    }

    @Override // yyds.AbstractC2450
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final boolean mo1234(C1213 c1213, AbstractC0185 abstractC0185, AbstractC0185 abstractC01852) {
        AbstractC2328.m4341(-202880943031150L);
        AbstractC2328.m4341(-202936777605998L);
        AbstractC2328.m4341(-202984022246254L);
        int iM784 = abstractC0185.m784();
        int iM7842 = abstractC01852.m784();
        C0118 c0118 = this.f7005;
        ArrayList arrayList = c0118.f809;
        if (iM784 == -1 || iM7842 == -1 || iM784 < 0 || iM784 >= arrayList.size() || iM7842 < 0 || iM7842 >= arrayList.size()) {
            return false;
        }
        arrayList.add(iM7842, (C1672) arrayList.remove(iM784));
        c0118.f1869.m1868(iM784, iM7842);
        return true;
    }
}
