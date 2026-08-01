package p086r0;

import android.os.Handler;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import p003B0.AbstractC0055a;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.C0133u;
import p027N0.AbstractC0223g;
import p054c0.AbstractC0509a;
import p054c0.AbstractC0514f;
import p070i0.AbstractC0731a;
import p102z0.AbstractC1122e;
import p102z0.AbstractC1134q;

/* JADX INFO: renamed from: r0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0953x extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0950w f3430b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0953x(C0950w c0950w, int i2) {
        this.f3429a = i2;
        this.f3430b = c0950w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object c0104d;
        C0950w c0950w = this.f3430b;
        switch (this.f3429a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                try {
                    Field fieldMo1020k = AbstractC0514f.f1622b.mo1020k(AbstractC0055a.m102c("com.tencent.mm.ui.chatting.ChattingUIProxy"), AbstractC0055a.m102c("com.tencent.mm.ui.chatting.BaseChattingUIFragment"));
                    fieldMo1020k.setAccessible(true);
                    Object obj = fieldMo1020k.get(methodHookParam.thisObject);
                    if (obj != null) {
                        c0950w.m2122g(obj);
                    }
                    c0104d = C0109i.f404a;
                } catch (Throwable th) {
                    c0104d = new C0104d(th);
                }
                Throwable thM246a = AbstractC0105e.m246a(c0104d);
                if (thM246a != null) {
                    AbstractC0731a.m1387d("hook onEnterBegin error", thM246a);
                }
                break;
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj2 = methodHookParam.thisObject;
                AbstractC0223g.m417d(obj2, "thisObject");
                c0950w.m2122g(obj2);
                break;
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj3 = methodHookParam.thisObject;
                AbstractC0223g.m417d(obj3, "thisObject");
                String strM2113e = C0950w.m2113e(obj3);
                if (strM2113e != null) {
                    c0950w.m2127n(obj3, strM2113e);
                    Handler handler = AbstractC1134q.f3825a;
                    AbstractC1134q.m2467h(c0950w.f3411a, strM2113e);
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f3429a) {
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj = methodHookParam.thisObject;
                AbstractC0223g.m417d(obj, "thisObject");
                C0950w c0950w = this.f3430b;
                String strM2113e = C0950w.m2113e(obj);
                if (strM2113e != null) {
                    WeakReference weakReference = c0950w.f3416f;
                    if ((weakReference != null ? weakReference.get() : null) == obj || AbstractC0223g.m414a(c0950w.f3417g, strM2113e)) {
                        AbstractC1134q.m2466g(strM2113e);
                    }
                    break;
                }
                break;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                C0950w c0950w2 = this.f3430b;
                Object obj2 = methodHookParam.thisObject;
                AbstractC0223g.m417d(obj2, "thisObject");
                String strM2113e2 = C0950w.m2113e(obj2);
                if (strM2113e2 != null) {
                    WeakReference weakReference2 = c0950w2.f3416f;
                    if ((weakReference2 != null ? weakReference2.get() : null) == obj2 || AbstractC0223g.m414a(c0950w2.f3417g, strM2113e2)) {
                        AbstractC1134q.m2466g(strM2113e2);
                        c0950w2.f3416f = null;
                        c0950w2.f3417g = null;
                        String str = AbstractC1122e.f3783a;
                        AbstractC1122e.f3785c = C0133u.f428a;
                    }
                }
                WeakReference weakReference3 = c0950w2.f3418h;
                if ((weakReference3 != null ? weakReference3.get() : null) == obj2) {
                    c0950w2.f3418h = null;
                    c0950w2.f3419i = null;
                }
                WeakReference weakReference4 = c0950w2.f3420j;
                if ((weakReference4 != null ? weakReference4.get() : null) == obj2) {
                    c0950w2.f3420j = null;
                    c0950w2.f3421k = null;
                }
                break;
        }
    }
}
