package yyds;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛵᲇᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1217 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5595;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewGroup viewGroup;
        EnumC2097 enumC2097;
        Object c2658;
        C2617 c2617;
        switch (this.f5595) {
            case 0:
                AbstractC2328.m4341(-926604407243630L);
                viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup == null) {
                    return;
                }
                Map map = C1784.f8997;
                AbstractC2328.m4341(-926625882080110L);
                synchronized (map) {
                    enumC2097 = (EnumC2097) map.get(viewGroup);
                }
                if (enumC2097 == null) {
                    return;
                }
                C1784.f9011.m3567(viewGroup, enumC2097, false, true);
                return;
            default:
                AbstractC2328.m4341(-1082168122704750L);
                try {
                    viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup != null) {
                        Map map2 = C2153.f10614;
                        AbstractC2328.m4341(-1082189597541230L);
                        synchronized (map2) {
                            c2617 = (C2617) map2.get(viewGroup);
                        }
                        if (c2617 != null && c2617.f12864) {
                            C2153.f10615.getClass();
                            C2153.m4104(viewGroup, c2617, false);
                        }
                    }
                    c2658 = C2746.f13459;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-1082288381789038L), thM4249);
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object c2658;
        C2617 c2617;
        switch (this.f5595) {
            case 0:
                AbstractC2328.m4341(-926746141164398L);
                Map map = C1784.f9010;
                AbstractC2328.m4341(-926767616000878L);
                synchronized (map) {
                    try {
                        C1952 c1952 = (C1952) map.get(view instanceof ViewGroup ? (ViewGroup) view : null);
                        if (c1952 != null) {
                            synchronized (c1952) {
                                c1952.f9802 = false;
                                c1952.f9806 = 0;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                AbstractC2328.m4341(-1082348511331182L);
                try {
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    if (viewGroup != null) {
                        Map map2 = C2153.f10614;
                        AbstractC2328.m4341(-1082369986167662L);
                        synchronized (map2) {
                            c2617 = (C2617) map2.get(viewGroup);
                        }
                        if (c2617 != null) {
                            C2153.f10615.getClass();
                            c2617.f12869++;
                            c2617.f12867 = false;
                            ArrayList arrayList = new ArrayList();
                            C2153.m4118(viewGroup, arrayList);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C2153.m4109((C1692) it.next());
                            }
                        }
                    }
                    c2658 = C2746.f13459;
                } catch (Throwable th2) {
                    c2658 = new C2658(th2);
                }
                Throwable thM4249 = C2248.m4249(c2658);
                if (thM4249 != null) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-1082468770415470L), thM4249);
                    return;
                }
                return;
        }
    }
}
