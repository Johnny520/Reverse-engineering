package p050c0;

import android.widget.ImageView;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.w0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0705w0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ImageView f2216b;

    public /* synthetic */ RunnableC0705w0(ImageView r1, int r2) {
        this.f2215a = r2;
        this.f2216b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView r2 = this.f2216b;
        switch(this.f2215a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        AbstractC0307g.m703e(r2, "$iv");
        C0580D0 r1 = C0580D0.f1723a;
        C0580D0.m1406m(r2);
        if (C0580D0.m1402i(r2) == false) goto L12;
        C0580D0.m1395b(r2, true);
        return;
    L12:
        return;
    L8:
        AbstractC0307g.m703e(r2, "$iv");
        C0580D0 r12 = C0580D0.f1723a;
        if (C0580D0.m1402i(r2) == false) goto L13;
        C0580D0.m1395b(r2, true);
        return;
    }
}
