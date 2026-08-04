package yyds;

import com.kongzue.dialogx.interfaces.AbstractC0041;

/* JADX INFO: renamed from: yyds.ᲁᛲᛴᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2177 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10663;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2458 f10664;

    public /* synthetic */ RunnableC2177(C2458 c2458, int i) {
        this.f10663 = i;
        this.f10664 = c2458;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10663;
        C2458 c2458 = this.f10664;
        switch (i) {
            case 0:
                AbstractC0041.m266(new RunnableC1421(c2458, c2458.f12153.f8266));
                break;
            default:
                C1624 c1624 = c2458.f12153;
                C2207 c2207 = c1624.f8270;
                if (c2207 == null) {
                    c2207 = new C2207(2, c2458);
                    c1624.f8270 = c2207;
                }
                c2207.m4195(c1624);
                AbstractC0041.m268(new RunnableC0871(19, this), c2458.m4499(null));
                break;
        }
    }
}
