package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: k4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0398k4 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2776a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2777b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0398k4(int i, Object obj) {
        this.f2776a = i;
        this.f2777b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f2776a;
        Object obj = this.f2777b;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                C0805v4 c0805v4 = (C0805v4) obj;
                if (!c0805v4.getInternalPopup().mo1972b()) {
                    c0805v4.f4894f.mo1975e(AbstractC0472m4.m1804b(c0805v4), AbstractC0472m4.m1803a(c0805v4));
                }
                ViewTreeObserver viewTreeObserver = c0805v4.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    AbstractC0435l4.m1732a(viewTreeObserver, this);
                }
                break;
            case Base64.NO_PADDING /* 1 */:
                C0694s4 c0694s4 = (C0694s4) obj;
                C0805v4 c0805v42 = c0694s4.f4206G;
                c0694s4.getClass();
                WeakHashMap weakHashMap = oa0.f3426a;
                if (aa0.m39b(c0805v42) && c0805v42.getGlobalVisibleRect(c0694s4.f4204E)) {
                    c0694s4.m2304s();
                    c0694s4.mo976f();
                } else {
                    c0694s4.dismiss();
                }
                break;
            case Base64.NO_WRAP /* 2 */:
                ViewOnKeyListenerC0179e9 viewOnKeyListenerC0179e9 = (ViewOnKeyListenerC0179e9) obj;
                ArrayList arrayList = viewOnKeyListenerC0179e9.f1541h;
                if (viewOnKeyListenerC0179e9.mo973b() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((C0143d9) arrayList.get(0)).f1337a.f3541y) {
                        View view = viewOnKeyListenerC0179e9.f1548o;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((C0143d9) obj2).f1337a.mo976f();
                            }
                        } else {
                            viewOnKeyListenerC0179e9.dismiss();
                        }
                    }
                    break;
                }
                break;
            default:
                x40 x40Var = (x40) obj;
                C0388jv c0388jv = x40Var.f5170h;
                if (x40Var.mo973b() && !c0388jv.f3541y) {
                    View view2 = x40Var.f5175m;
                    if (view2 != null && view2.isShown()) {
                        c0388jv.mo976f();
                    } else {
                        x40Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
