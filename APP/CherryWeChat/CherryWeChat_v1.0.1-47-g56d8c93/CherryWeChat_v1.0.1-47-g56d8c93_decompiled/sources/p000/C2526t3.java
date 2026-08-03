package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: t3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2526t3 extends AbstractC1406fG {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8823g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f8824h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2526t3(int i, Object obj) {
        super(21);
        this.f8823g = i;
        this.f8824h = obj;
    }

    @Override // p000.AbstractC1406fG, p000.InterfaceC0359IE
    /* JADX INFO: renamed from: C */
    public void mo795C() {
        int i = this.f8823g;
        Object obj = this.f8824h;
        switch (i) {
            case 0:
                ((RunnableC2440r3) obj).f8556b.f505v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) obj;
                layoutInflaterFactory2C0176E3.f505v.setVisibility(0);
                if (layoutInflaterFactory2C0176E3.f505v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0176E3.f505v.getParent();
                    WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                    AbstractC1255cE.m2370c(view);
                }
                break;
        }
    }

    @Override // p000.InterfaceC0359IE
    /* JADX INFO: renamed from: c */
    public final void mo796c() {
        int i = this.f8823g;
        Object obj = this.f8824h;
        switch (i) {
            case 0:
                LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = ((RunnableC2440r3) obj).f8556b;
                layoutInflaterFactory2C0176E3.f505v.setAlpha(1.0f);
                layoutInflaterFactory2C0176E3.f508y.m556d(null);
                layoutInflaterFactory2C0176E3.f508y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E32 = (LayoutInflaterFactory2C0176E3) obj;
                layoutInflaterFactory2C0176E32.f505v.setAlpha(1.0f);
                layoutInflaterFactory2C0176E32.f508y.m556d(null);
                layoutInflaterFactory2C0176E32.f508y = null;
                break;
            default:
                LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E33 = (LayoutInflaterFactory2C0176E3) ((C0649P3) obj).f2090c;
                layoutInflaterFactory2C0176E33.f505v.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C0176E33.f506w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0176E33.f505v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0176E33.f505v.getParent();
                    WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                    AbstractC1255cE.m2370c(view);
                }
                layoutInflaterFactory2C0176E33.f505v.m2081e();
                layoutInflaterFactory2C0176E33.f508y.m556d(null);
                layoutInflaterFactory2C0176E33.f508y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0176E33.f460A;
                WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
                AbstractC1255cE.m2370c(viewGroup);
                break;
        }
    }
}
