package p029F0;

import p023E0.AbstractC0277a;
import p041H0.AbstractC0567L;
import p041H0.AbstractC0601k;
import p041H0.C0564I;
import p041H0.C0590e0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p105V.C1480b;
import p105V.C1483e;
import p169h0.AbstractC2206o;
import p186k.AbstractC2430l;
import p186k.C2408E;
import p186k.C2440v;
import p260x.C3407M;

/* JADX INFO: renamed from: F0.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0371I implements InterfaceC0409k0 {

    /* JADX INFO: renamed from: a */
    public final C2440v f1165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0373K f1166b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1167c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0371I(C0373K c0373k, Object obj) {
        this.f1166b = c0373k;
        this.f1167c = obj;
        int[] iArr = AbstractC2430l.f7851a;
        this.f1165a = new C2440v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0409k0
    /* JADX INFO: renamed from: a */
    public final void mo612a() {
        C0373K c0373k = this.f1166b;
        C0564I c0564i = c0373k.f1171d;
        c0373k.m622g();
        C2408E c2408e = c0373k.f1180m;
        Object obj = this.f1167c;
        C0564I c0564i2 = (C0564I) c2408e.m4276k(obj);
        if (c0564i2 != null) {
            if (c0373k.f1185r <= 0) {
                AbstractC0277a.m483b("No pre-composed items to dispose");
            }
            int iM2760i = ((C1483e) ((C1480b) c0564i.m833o()).f5173e).m2760i(c0564i2);
            if (iM2760i < ((C1483e) ((C1480b) c0564i.m833o()).f5173e).f5183f - c0373k.f1185r) {
                AbstractC0277a.m483b("Item is not in pre-composed item range");
            }
            c0373k.f1184q++;
            c0373k.f1185r--;
            C0365C c0365c = (C0365C) c0373k.f1176i.m4272g(c0564i2);
            if (c0365c != null) {
                C0373K.m616d(c0365c);
            }
            int i5 = (((C1483e) ((C1480b) c0564i.m833o()).f5173e).f5183f - c0373k.f1185r) - c0373k.f1184q;
            c0373k.m624i(iM2760i, i5);
            c0373k.m621f(i5);
        }
        if (c0373k.f1183p.m2759h(obj)) {
            C0564I.m790V(c0564i, true, 6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0409k0
    /* JADX INFO: renamed from: b */
    public final void mo613b(C3407M c3407m) {
        C0590e0 c0590e0;
        AbstractC2206o abstractC2206o;
        C0564I c0564i = (C0564I) this.f1166b.f1180m.m4272g(this.f1167c);
        if (c0564i == null || (c0590e0 = c0564i.f1699J) == null || (abstractC2206o = c0590e0.f1896f) == null) {
            return;
        }
        AbstractC0601k.m1049y(abstractC2206o, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", c3407m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0409k0
    /* JADX INFO: renamed from: c */
    public final int mo614c() {
        C0564I c0564i = (C0564I) this.f1166b.f1180m.m4272g(this.f1167c);
        if (c0564i != null) {
            return ((C1483e) ((C1480b) c0564i.m832n()).f5173e).f5183f;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0409k0
    /* JADX INFO: renamed from: d */
    public final void mo615d(long j5, int i5) {
        C0373K c0373k = this.f1166b;
        C0564I c0564i = (C0564I) c0373k.f1180m.m4272g(this.f1167c);
        if (c0564i == null || !c0564i.m799G()) {
            return;
        }
        int i6 = ((C1483e) ((C1480b) c0564i.m832n()).f5173e).f5183f;
        if (i5 < 0 || i5 >= i6) {
            AbstractC0277a.m485d("Index (" + i5 + ") is out of bound of [0, " + i6 + ')');
        }
        if (c0564i.m801I()) {
            AbstractC0277a.m482a("Pre-measure called on node that is not placed");
        }
        C0564I c0564i2 = c0373k.f1171d;
        c0564i2.f1728u = true;
        ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i)).m1316v((C0564I) ((C1480b) c0564i.m832n()).get(i5), j5);
        c0564i2.f1728u = false;
        this.f1165a.m4345a(i5);
    }
}
