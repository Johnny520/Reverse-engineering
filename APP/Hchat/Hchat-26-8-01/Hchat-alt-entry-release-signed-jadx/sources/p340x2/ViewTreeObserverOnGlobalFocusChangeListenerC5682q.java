package p340x2;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import okio.C3193a;
import p041d1.AbstractC0656d;
import p041d1.C0653b0;
import p041d1.C0670p;
import p041d1.InterfaceC0666l;
import p041d1.InterfaceC0672r;
import p041d1.InterfaceC0675u;
import p131j0.C2046b;
import p136j8.C2104o;
import p292u1.AbstractC4229a;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5641r1;
import p356y0.AbstractC5852n;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: x2.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC5682q extends AbstractC5852n implements InterfaceC0675u, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: u */
    public ViewTreeObserver f23131u;

    /* JADX INFO: renamed from: v */
    public final C5681p f23132v = new C5681p(this, 0);

    /* JADX INFO: renamed from: w */
    public final C5681p f23133w = new C5681p(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: c1 */
    public final void mo1323c1() {
        ViewTreeObserver viewTreeObserver = AbstractC5618k.m10169y(this).getViewTreeObserver();
        this.f23131u = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        ViewTreeObserver viewTreeObserver = this.f23131u;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f23131u = null;
        AbstractC5618k.m10169y(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final C0653b0 m10239k1() {
        boolean z9;
        if (!this.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitLocalDescendants called on an unattached node");
        }
        AbstractC5852n abstractC5852n = this.f23788g;
        if ((abstractC5852n.f23791j & 1024) != 0) {
            boolean z10 = false;
            for (AbstractC5852n abstractC5852n2 = abstractC5852n.f23793l; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
                if ((abstractC5852n2.f23790i & 1024) != 0) {
                    AbstractC5852n abstractC5852nM10149e = abstractC5852n2;
                    C2046b c2046b = null;
                    while (abstractC5852nM10149e != null) {
                        if (abstractC5852nM10149e instanceof C0653b0) {
                            C0653b0 c0653b0 = (C0653b0) abstractC5852nM10149e;
                            if (z10) {
                                return c0653b0;
                            }
                            z9 = false;
                            z10 = true;
                        } else {
                            z9 = true;
                        }
                        if (z9 && (abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                            int i9 = 0;
                            for (AbstractC5852n abstractC5852n3 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n3 != null; abstractC5852n3 = abstractC5852n3.f23793l) {
                                if ((abstractC5852n3.f23790i & 1024) != 0) {
                                    i9++;
                                    if (i9 == 1) {
                                        abstractC5852nM10149e = abstractC5852n3;
                                    } else {
                                        if (c2046b == null) {
                                            c2046b = new C2046b(new AbstractC5852n[16]);
                                        }
                                        if (abstractC5852nM10149e != null) {
                                            c2046b.m5056b(abstractC5852nM10149e);
                                            abstractC5852nM10149e = null;
                                        }
                                        c2046b.m5056b(abstractC5852n3);
                                    }
                                }
                            }
                            if (i9 == 1) {
                            }
                        }
                        abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                    }
                }
            }
        }
        C2104o.m5276A("Could not find focus target of embedded view wrapper");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z9;
        boolean z10;
        if (AbstractC5618k.m10167w(this).f22803t == null) {
            return;
        }
        View viewM10236c = AbstractC5674i.m10236c(this);
        InterfaceC0666l focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(this)).getFocusOwner();
        InterfaceC5641r1 interfaceC5641r1M10168x = AbstractC5618k.m10168x(this);
        if (view == null || view.equals(interfaceC5641r1M10168x)) {
            z9 = false;
        } else {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewM10236c.getParent()) {
                    z9 = true;
                    break;
                }
            }
            z9 = false;
        }
        if (view2 == null || view2.equals(interfaceC5641r1M10168x)) {
            z10 = false;
        } else {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == viewM10236c.getParent()) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        if (z9 && z10) {
            return;
        }
        if (!z10) {
            if (z9 && m10239k1().m1803p1().m1860a()) {
                ((C0670p) focusOwner).m1844b(8, false, false);
                return;
            }
            return;
        }
        C0653b0 c0653b0M10239k1 = m10239k1();
        int iOrdinal = c0653b0M10239k1.m1803p1().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal == 3) {
            AbstractC0656d.m1831w(c0653b0M10239k1);
        } else {
            C3193a.m6822k();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041d1.InterfaceC0675u
    /* JADX INFO: renamed from: r0 */
    public final void mo1858r0(InterfaceC0672r interfaceC0672r) {
        interfaceC0672r.mo1855c(false);
        interfaceC0672r.mo1857e(this.f23132v);
        interfaceC0672r.mo1854b(this.f23133w);
    }
}
