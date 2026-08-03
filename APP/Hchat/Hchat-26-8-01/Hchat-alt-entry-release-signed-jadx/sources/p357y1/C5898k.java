package p357y1;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p016b1.C0166f;
import p028c1.C0372b;
import p028c1.C0384n;
import p029c2.InterfaceC0389a;
import p041d1.AbstractC0662h;
import p041d1.C0653b0;
import p041d1.C0660f;
import p041d1.C0670p;
import p057e1.C0808c;
import p072f2.InterfaceC1062y;
import p236q1.AbstractC3421a;
import p236q1.AbstractC3424d;
import p236q1.InterfaceC3425e;
import p276sf.C3967n;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.AbstractC5614i1;
import p339x1.InterfaceC5600e2;
import p339x1.InterfaceC5651v;
import p339x1.InterfaceC5665z1;
import p356y0.AbstractC5852n;
import p370yf.AbstractC6038c;
import tf.C4174u;

/* JADX INFO: renamed from: y1.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5898k extends AbstractC5852n implements InterfaceC0389a, InterfaceC5665z1, InterfaceC3425e, InterfaceC5651v, InterfaceC5600e2 {

    /* JADX INFO: renamed from: u */
    public final C0166f f23965u = new C0166f(this, 21);

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5934t f23966v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5898k(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t) {
        this.f23966v = viewTreeObserverOnGlobalLayoutListenerC5934t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029c2.InterfaceC0389a
    /* JADX INFO: renamed from: A0 */
    public final Object mo1353A0(AbstractC5614i1 abstractC5614i1, C0372b c0372b, AbstractC6038c abstractC6038c) {
        long jMo8868m0 = abstractC5614i1.mo8868m0(0L);
        C0808c c0808c = (C0808c) c0372b.invoke();
        C0808c c0808cM2053i = c0808c != null ? c0808c.m2053i(jMo8868m0) : null;
        if (c0808cM2053i != null) {
            this.f23966v.requestRectangleOnScreen(new Rect((int) c0808cM2053i.f2416a, (int) c0808cM2053i.f2417b, (int) c0808cM2053i.f2418c, (int) c0808cM2053i.f2419d), false);
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p236q1.InterfaceC3425e
    /* JADX INFO: renamed from: C */
    public final boolean mo5389C(KeyEvent keyEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5600e2
    /* JADX INFO: renamed from: F */
    public final Object mo742F() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p236q1.InterfaceC3425e
    /* JADX INFO: renamed from: W */
    public final boolean mo5390W(KeyEvent keyEvent) {
        C0660f c0660f;
        int[] iArr = AbstractC0662h.f2041a;
        long jM7198b = AbstractC3424d.m7198b(keyEvent);
        boolean z9 = true;
        if (AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11066b)) {
            c0660f = new C0660f(2);
        } else if (AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11067c)) {
            c0660f = new C0660f(1);
        } else if (AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11080p)) {
            c0660f = new C0660f(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            c0660f = AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11071g) ? new C0660f(4) : AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11070f) ? new C0660f(3) : (AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11068d) || AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11052C)) ? new C0660f(5) : (AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11069e) || AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11053D)) ? new C0660f(6) : (AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11072h) || AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11082r) || AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11054E)) ? new C0660f(7) : (AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11065a) || AbstractC3421a.m7196a(jM7198b, AbstractC3421a.f11085u)) ? new C0660f(8) : null;
        }
        if (c0660f != null) {
            int i9 = c0660f.f2040a;
            if (AbstractC3424d.m7199c(keyEvent) == 2) {
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f23966v;
                C0653b0 c0653b0M1848f = ((C0670p) viewTreeObserverOnGlobalLayoutListenerC5934t.getFocusOwner()).m1848f();
                if (c0653b0M1848f == null || !c0653b0M1848f.f2023u || !viewTreeObserverOnGlobalLayoutListenerC5934t.m10668z(i9)) {
                    Boolean boolM1847e = ((C0670p) viewTreeObserverOnGlobalLayoutListenerC5934t.getFocusOwner()).m1847e(i9, viewTreeObserverOnGlobalLayoutListenerC5934t.getEmbeddedViewFocusRect(), new C0166f(c0660f, 20));
                    if (!(boolM1847e != null ? boolM1847e.booleanValue() : true)) {
                        if (i9 != 1 && i9 != 2) {
                            z9 = false;
                        }
                        if (z9) {
                            Integer numM1839c = AbstractC0662h.m1839c(i9);
                            int iIntValue = numM1839c != null ? numM1839c.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = viewTreeObserverOnGlobalLayoutListenerC5934t.getRootView();
                            rootView.getClass();
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewTreeObserverOnGlobalLayoutListenerC5934t.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(viewTreeObserverOnGlobalLayoutListenerC5934t)) {
                                return ((C0670p) viewTreeObserverOnGlobalLayoutListenerC5934t.getFocusOwner()).m1850h(i9);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(j3);
        return interfaceC4418p0.mo8008D0(abstractC4377b1Mo8831Q.f14593g, abstractC4377b1Mo8831Q.f14594h, C4174u.f13711g, this.f23965u, new C0384n(abstractC4377b1Mo8831Q, 5));
    }

    @Override // p339x1.InterfaceC5665z1
    /* JADX INFO: renamed from: X0 */
    public final void mo1610X0(InterfaceC1062y interfaceC1062y) {
    }
}
