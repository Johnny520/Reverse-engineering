package p340x2;

import android.graphics.Rect;
import android.view.View;
import gg.AbstractC1417m;
import p041d1.AbstractC0656d;
import p041d1.AbstractC0662h;
import p041d1.C0650a;
import p041d1.C0653b0;
import p041d1.C0670p;
import p041d1.InterfaceC0666l;
import p057e1.C0808c;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p339x1.AbstractC5618k;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: x2.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5681p extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23129g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ViewTreeObserverOnGlobalFocusChangeListenerC5682q f23130h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5681p(ViewTreeObserverOnGlobalFocusChangeListenerC5682q viewTreeObserverOnGlobalFocusChangeListenerC5682q, int i9) {
        super(1);
        this.f23129g = i9;
        this.f23130h = viewTreeObserverOnGlobalFocusChangeListenerC5682q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f23129g) {
            case 0:
                C0650a c0650a = (C0650a) obj;
                ViewTreeObserverOnGlobalFocusChangeListenerC5682q viewTreeObserverOnGlobalFocusChangeListenerC5682q = this.f23130h;
                View viewM10236c = AbstractC5674i.m10236c(viewTreeObserverOnGlobalFocusChangeListenerC5682q);
                if (!viewM10236c.isFocused() && !viewM10236c.hasFocus()) {
                    InterfaceC0666l focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5618k.m10168x(viewTreeObserverOnGlobalFocusChangeListenerC5682q)).getFocusOwner();
                    View viewM10169y = AbstractC5618k.m10169y(viewTreeObserverOnGlobalFocusChangeListenerC5682q);
                    Integer numM1839c = AbstractC0662h.m1839c(c0650a.f2016a);
                    int[] iArr = new int[2];
                    viewM10169y.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewM10236c.getLocationOnScreen(iArr2);
                    C0653b0 c0653b0M1814f = AbstractC0656d.m1814f(((C0670p) focusOwner).f2056c);
                    Rect rect = null;
                    C0808c c0808cM1817i = c0653b0M1814f != null ? AbstractC0656d.m1817i(c0653b0M1814f) : null;
                    if (c0808cM1817i != null) {
                        int i9 = (int) c0808cM1817i.f2416a;
                        int i10 = iArr[0];
                        int i11 = iArr2[0];
                        int i12 = (int) c0808cM1817i.f2417b;
                        int i13 = iArr[1];
                        int i14 = iArr2[1];
                        rect = new Rect((i9 + i10) - i11, (i12 + i13) - i14, (((int) c0808cM1817i.f2418c) + i10) - i11, (((int) c0808cM1817i.f2419d) + i13) - i14);
                    }
                    if (!AbstractC0662h.m1838b(viewM10236c, numM1839c, rect)) {
                        c0650a.f2017b = true;
                    }
                }
                break;
            default:
                AbstractC5674i.m10236c(this.f23130h);
                break;
        }
        return C3967n.f12976a;
    }
}
