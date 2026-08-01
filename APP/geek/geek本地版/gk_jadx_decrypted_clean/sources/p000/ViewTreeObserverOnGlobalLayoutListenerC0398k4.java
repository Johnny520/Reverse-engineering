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
    public final /* synthetic */ int f2694a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2695b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0398k4(int i, Object obj) {
        this.f2694a = i;
        this.f2695b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f2694a;
        Object obj = this.f2695b;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                C0806v4 c0806v4 = (C0806v4) obj;
                if (!c0806v4.getInternalPopup().mo1989b()) {
                    c0806v4.f4804f.mo1992e(AbstractC0472m4.m1781b(c0806v4), AbstractC0472m4.m1780a(c0806v4));
                }
                ViewTreeObserver viewTreeObserver = c0806v4.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    AbstractC0435l4.m1742a(viewTreeObserver, this);
                }
                break;
            case Base64.NO_PADDING /* 1 */:
                C0695s4 c0695s4 = (C0695s4) obj;
                C0806v4 c0806v42 = c0695s4.f4386G;
                c0695s4.getClass();
                WeakHashMap weakHashMap = ja0.f2600a;
                if (v90.m2495b(c0806v42) && c0806v42.getGlobalVisibleRect(c0695s4.f4384E)) {
                    c0695s4.m2304s();
                    c0695s4.mo1708f();
                } else {
                    c0695s4.dismiss();
                }
                break;
            case Base64.NO_WRAP /* 2 */:
                ViewOnKeyListenerC0736t8 viewOnKeyListenerC0736t8 = (ViewOnKeyListenerC0736t8) obj;
                ArrayList arrayList = viewOnKeyListenerC0736t8.f4529h;
                if (viewOnKeyListenerC0736t8.mo1705b() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((C0699s8) arrayList.get(0)).f4392a.f2944y) {
                        View view = viewOnKeyListenerC0736t8.f4536o;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((C0699s8) obj2).f4392a.mo1708f();
                            }
                        } else {
                            viewOnKeyListenerC0736t8.dismiss();
                        }
                    }
                    break;
                }
                break;
            default:
                q40 q40Var = (q40) obj;
                C0082bv c0082bv = q40Var.f4001h;
                if (q40Var.mo1705b() && !c0082bv.f2944y) {
                    View view2 = q40Var.f4006m;
                    if (view2 != null && view2.isShown()) {
                        c0082bv.mo1708f();
                    } else {
                        q40Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
