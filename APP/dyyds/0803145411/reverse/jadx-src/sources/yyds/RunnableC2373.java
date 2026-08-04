package yyds;

import com.kongzue.dialogx.util.views.MaxRelativeLayout;

/* JADX INFO: renamed from: yyds.ᲁᲈᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2373 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f11686;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1188 f11687;

    public /* synthetic */ RunnableC2373(C1188 c1188, int i) {
        this.f11686 = i;
        this.f11687 = c1188;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11686;
        C1188 c1188 = this.f11687;
        switch (i) {
            case 0:
                C2283 c2283 = c1188.f5436;
                if (c2283 != null) {
                    c2283.m4292();
                }
                break;
            default:
                C2283 c22832 = c1188.f5436;
                if (c22832 != null) {
                    c22832.m4290((MaxRelativeLayout) c22832.f11241);
                    break;
                }
                break;
        }
    }
}
