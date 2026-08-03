package p308v1;

import p049d9.C0746g;
import p069f.AbstractC0946m;
import p069f.C0929d0;
import p069f.C0966x;
import p131j0.C2046b;
import p292u1.AbstractC4229a;
import p339x1.AbstractC5613i0;
import p339x1.AbstractC5618k;
import p339x1.C5587b1;
import p339x1.C5602f0;
import p356y0.AbstractC5852n;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: v1.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4394h0 implements InterfaceC4395h1 {

    /* JADX INFO: renamed from: a */
    public final C0966x f14638a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4400j0 f14639b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f14640c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4394h0(C4400j0 c4400j0, Object obj) {
        this.f14639b = c4400j0;
        this.f14640c = obj;
        int[] iArr = AbstractC0946m.f2980a;
        this.f14638a = new C0966x();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4395h1
    /* JADX INFO: renamed from: a */
    public final void mo8828a() {
        C4400j0.m8843c(this.f14639b, this.f14640c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4395h1
    /* JADX INFO: renamed from: b */
    public final int mo8834b() {
        C5602f0 c5602f0 = (C5602f0) this.f14639b.f14657p.m2320g(this.f14640c);
        if (c5602f0 != null) {
            return ((C2046b) ((C0929d0) c5602f0.m10042n()).f2909h).f6893i;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4395h1
    /* JADX INFO: renamed from: c */
    public final void mo8835c(int i9, long j3) {
        C4400j0 c4400j0 = this.f14639b;
        C5602f0 c5602f0 = (C5602f0) c4400j0.f14657p.m2320g(this.f14640c);
        if (c5602f0 == null || !c5602f0.m10010G()) {
            return;
        }
        int i10 = ((C2046b) ((C0929d0) c5602f0.m10042n()).f2909h).f6893i;
        if (i9 < 0 || i9 >= i10) {
            AbstractC4229a.m8496d("Index (" + i9 + ") is out of bound of [0, " + i10 + ')');
        }
        if (c5602f0.m10011H()) {
            AbstractC4229a.m8493a("Pre-measure called on node that is not placed");
        }
        C5602f0 c5602f02 = c4400j0.f14648g;
        c5602f02.f22806w = true;
        ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0)).m10667y((C5602f0) ((C0929d0) c5602f0.m10042n()).get(i9), j3);
        c5602f02.f22806w = false;
        this.f14638a.m2380a(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4395h1
    /* JADX INFO: renamed from: d */
    public final void mo8836d(C0746g c0746g) {
        C5587b1 c5587b1;
        C5602f0 c5602f0 = (C5602f0) this.f14639b.f14657p.m2320g(this.f14640c);
        AbstractC5852n abstractC5852n = (c5602f0 == null || (c5587b1 = c5602f0.f22778L) == null) ? null : c5587b1.f22719f;
        if (abstractC5852n == null || !abstractC5852n.f23801t) {
            return;
        }
        AbstractC5618k.m10144C(abstractC5852n, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", c0746g);
    }
}
