package yyds;

import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: yyds.ᛶᛱᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1270 extends AbstractC1615 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5848;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0041 f5849;

    public /* synthetic */ C1270(AbstractC0041 abstractC0041, int i) {
        this.f5848 = i;
        this.f5849 = abstractC0041;
    }

    @Override // yyds.AbstractC1615
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void mo2543() {
        int i = this.f5848;
        AbstractC0041 abstractC0041 = this.f5849;
        switch (i) {
            case 0:
                C1022 c1022 = (C1022) abstractC0041;
                c1022.f4669 = c1022.f3516.f12143.getY();
                AbstractC0041.m256("#TouchDown: " + c1022.f4669);
                break;
            default:
                C0301 c0301 = (C0301) abstractC0041;
                c0301.f18 = ((MaxRelativeLayout) c0301.f5436.f11241).getY();
                break;
        }
    }
}
