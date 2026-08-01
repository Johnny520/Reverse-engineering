package p170h1;

import android.graphics.Rect;
import android.view.View;
import p041H0.AbstractC0601k;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p198m0.AbstractC2573d;
import p198m0.AbstractC2577h;
import p198m0.C2567A;
import p198m0.C2570a;
import p198m0.C2584o;
import p198m0.InterfaceC2581l;
import p204n0.C2684c;

/* JADX INFO: renamed from: h1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2226q extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7278e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ViewTreeObserverOnGlobalFocusChangeListenerC2227r f7279f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2226q(ViewTreeObserverOnGlobalFocusChangeListenerC2227r viewTreeObserverOnGlobalFocusChangeListenerC2227r, int i5) {
        super(1);
        this.f7278e = i5;
        this.f7279f = viewTreeObserverOnGlobalFocusChangeListenerC2227r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f7278e) {
            case 0:
                C2570a c2570a = (C2570a) obj;
                ViewTreeObserverOnGlobalFocusChangeListenerC2227r viewTreeObserverOnGlobalFocusChangeListenerC2227r = this.f7279f;
                View viewM4031c = AbstractC2219j.m4031c(viewTreeObserverOnGlobalFocusChangeListenerC2227r);
                if (!viewM4031c.isFocused() && !viewM4031c.hasFocus()) {
                    InterfaceC2581l focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(viewTreeObserverOnGlobalFocusChangeListenerC2227r)).getFocusOwner();
                    View viewM1046v = AbstractC0601k.m1046v(viewTreeObserverOnGlobalFocusChangeListenerC2227r);
                    Integer numM4523c = AbstractC2577h.m4523c(c2570a.f8201a);
                    int[] iArr = new int[2];
                    viewM1046v.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewM4031c.getLocationOnScreen(iArr2);
                    C2567A c2567aM4499f = AbstractC2573d.m4499f(((C2584o) focusOwner).f8224c);
                    Rect rect = null;
                    C2684c c2684cM4502i = c2567aM4499f != null ? AbstractC2573d.m4502i(c2567aM4499f) : null;
                    if (c2684cM4502i != null) {
                        int i5 = (int) c2684cM4502i.f8558a;
                        int i6 = iArr[0];
                        int i7 = iArr2[0];
                        int i8 = (int) c2684cM4502i.f8559b;
                        int i9 = iArr[1];
                        int i10 = iArr2[1];
                        rect = new Rect((i5 + i6) - i7, (i8 + i9) - i10, (((int) c2684cM4502i.f8560c) + i6) - i7, (((int) c2684cM4502i.f8561d) + i9) - i10);
                    }
                    if (!AbstractC2577h.m4522b(viewM4031c, numM4523c, rect)) {
                        c2570a.f8202b = true;
                    }
                }
                break;
            default:
                AbstractC2219j.m4031c(this.f7279f);
                break;
        }
        return C0891q.f2780a;
    }
}
