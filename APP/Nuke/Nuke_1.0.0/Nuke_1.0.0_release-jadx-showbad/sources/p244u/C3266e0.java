package p244u;

import android.view.View;
import java.util.WeakHashMap;
import p041H0.AbstractC0601k;
import p117X2.AbstractC1665j;
import p203n.C2654f0;
import p229r1.AbstractC3087q;
import p229r1.AbstractC3092v;

/* JADX INFO: renamed from: u.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3266e0 extends C3239H {

    /* JADX INFO: renamed from: u */
    public C2654f0 f10099u;

    /* JADX INFO: renamed from: v */
    public C3278k0 f10100v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p244u.C3239H, p169h0.AbstractC2206o
    /* JADX INFO: renamed from: B0 */
    public final void mo143B0() {
        View viewM1046v = AbstractC0601k.m1046v(this);
        WeakHashMap weakHashMap = C3278k0.f10118v;
        C3278k0 c3278k0M5510e = C3259b.m5510e(viewM1046v);
        c3278k0M5510e.m5557a(viewM1046v);
        this.f10099u.getClass();
        C3257a c3257a = c3278k0M5510e.f10125g;
        if (!AbstractC1665j.m2981a(c3257a, this.f10034t)) {
            this.f10034t = c3257a;
            m5498J0();
        }
        this.f10100v = c3278k0M5510e;
        super.mo143B0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p244u.C3239H, p169h0.AbstractC2206o
    /* JADX INFO: renamed from: C0 */
    public final void mo144C0() {
        View viewM1046v = AbstractC0601k.m1046v(this);
        C3278k0 c3278k0 = this.f10100v;
        if (c3278k0 != null) {
            int i5 = c3278k0.f10138t - 1;
            c3278k0.f10138t = i5;
            if (i5 == 0) {
                int i6 = AbstractC3092v.f9811a;
                AbstractC3087q.m5400b(viewM1046v, null);
                AbstractC3092v.m5409c(viewM1046v, null);
                viewM1046v.removeOnAttachStateChangeListener(c3278k0.f10139u);
            }
        }
        super.mo144C0();
    }
}
