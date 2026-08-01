package p068h;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p069i.AbstractC0626J;
import p069i.AbstractC0628K;
import p069i.C0631L0;
import p069i.C0640Q;
import p069i.C0647U;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: h.d */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0585d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1981b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1982c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0585d(int i2, Object obj) {
        this.f1981b = i2;
        this.f1982c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object obj = this.f1982c;
        switch (this.f1981b) {
            case 0:
                ViewOnKeyListenerC0588g viewOnKeyListenerC0588g = (ViewOnKeyListenerC0588g) obj;
                if (viewOnKeyListenerC0588g.mo1144a()) {
                    ArrayList arrayList = viewOnKeyListenerC0588g.f1997i;
                    if (arrayList.size() > 0 && !((C0587f) arrayList.get(0)).f1987a.f2151y) {
                        View view = viewOnKeyListenerC0588g.f2004p;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C0587f) it.next()).f1987a.mo1146h();
                            }
                        } else {
                            viewOnKeyListenerC0588g.dismiss();
                        }
                        break;
                    }
                }
                break;
            case 1:
                ViewOnKeyListenerC0580E viewOnKeyListenerC0580E = (ViewOnKeyListenerC0580E) obj;
                if (viewOnKeyListenerC0580E.mo1144a()) {
                    C0631L0 c0631l0 = viewOnKeyListenerC0580E.f1948i;
                    if (!c0631l0.f2151y) {
                        View view2 = viewOnKeyListenerC0580E.f1953n;
                        if (view2 != null && view2.isShown()) {
                            c0631l0.mo1146h();
                        } else {
                            viewOnKeyListenerC0580E.dismiss();
                        }
                    }
                }
                break;
            case 2:
                C0647U c0647u = (C0647U) obj;
                if (!c0647u.getInternalPopup().mo1240a()) {
                    c0647u.f2211g.mo1244e(AbstractC0628K.m1236b(c0647u), AbstractC0628K.m1235a(c0647u));
                }
                ViewTreeObserver viewTreeObserver = c0647u.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    AbstractC0626J.m1233a(viewTreeObserver, this);
                }
                break;
            default:
                C0640Q c0640q = (C0640Q) obj;
                C0647U c0647u2 = c0640q.f2198G;
                c0640q.getClass();
                WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                if (c0647u2.isAttachedToWindow() && c0647u2.getGlobalVisibleRect(c0640q.f2196E)) {
                    c0640q.m1259q();
                    c0640q.mo1146h();
                } else {
                    c0640q.dismiss();
                }
                break;
        }
    }
}
