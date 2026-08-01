package p061e;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import p014H.C0142a;
import p052b1.AbstractC0503h;
import p099y.AbstractC1048L;
import p099y.AbstractC1094z;

/* JADX INFO: renamed from: e.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0538n extends AbstractC0503h {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f1761p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f1762q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0538n(int i2, Object obj) {
        this.f1761p = i2;
        this.f1762q = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p099y.InterfaceC1055T
    /* JADX INFO: renamed from: a */
    public final void mo1047a() {
        Object obj = this.f1762q;
        switch (this.f1761p) {
            case 0:
                LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = ((RunnableC0536l) obj).f1758b;
                layoutInflaterFactory2C0545u.f1831p.setAlpha(1.0f);
                layoutInflaterFactory2C0545u.f1834s.m2306d(null);
                layoutInflaterFactory2C0545u.f1834s = null;
                break;
            case 1:
                LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u2 = (LayoutInflaterFactory2C0545u) obj;
                layoutInflaterFactory2C0545u2.f1831p.setAlpha(1.0f);
                layoutInflaterFactory2C0545u2.f1834s.m2306d(null);
                layoutInflaterFactory2C0545u2.f1834s = null;
                break;
            default:
                C0142a c0142a = (C0142a) obj;
                ((LayoutInflaterFactory2C0545u) c0142a.f444c).f1831p.setVisibility(8);
                LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u3 = (LayoutInflaterFactory2C0545u) c0142a.f444c;
                PopupWindow popupWindow = layoutInflaterFactory2C0545u3.f1832q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0545u3.f1831p.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0545u3.f1831p.getParent();
                    WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                    AbstractC1094z.m2366c(view);
                }
                layoutInflaterFactory2C0545u3.f1831p.m656e();
                layoutInflaterFactory2C0545u3.f1834s.m2306d(null);
                layoutInflaterFactory2C0545u3.f1834s = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0545u3.f1836u;
                WeakHashMap weakHashMap2 = AbstractC1048L.f3662a;
                AbstractC1094z.m2366c(viewGroup);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p052b1.AbstractC0503h, p099y.InterfaceC1055T
    /* JADX INFO: renamed from: c */
    public void mo997c() {
        Object obj = this.f1762q;
        switch (this.f1761p) {
            case 0:
                ((RunnableC0536l) obj).f1758b.f1831p.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = (LayoutInflaterFactory2C0545u) obj;
                layoutInflaterFactory2C0545u.f1831p.setVisibility(0);
                if (layoutInflaterFactory2C0545u.f1831p.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0545u.f1831p.getParent();
                    WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                    AbstractC1094z.m2366c(view);
                }
                break;
        }
    }
}
