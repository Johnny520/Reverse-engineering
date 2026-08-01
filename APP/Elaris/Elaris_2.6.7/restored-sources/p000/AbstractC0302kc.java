package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: kc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0302kc {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap f504a = new WeakHashMap();

    /* JADX INFO: renamed from: b */
    public static volatile Handler f505b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Handler m743a() {
        Handler handler;
        Handler handler2 = f505b;
        if (handler2 != null) {
            return handler2;
        }
        synchronized (AbstractC0302kc.class) {
            try {
                handler = f505b;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    f505b = handler;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m744b(View view, String str, long[] jArr, InterfaceC0286jc interfaceC0286jc, InterfaceC0251hc interfaceC0251hc) {
        ViewOnAttachStateChangeListenerC0267ic viewOnAttachStateChangeListenerC0267ic = new ViewOnAttachStateChangeListenerC0267ic(view, str, new C0338n0(jArr), interfaceC0286jc, interfaceC0251hc);
        WeakHashMap weakHashMap = f504a;
        synchronized (weakHashMap) {
            try {
                Map map = (Map) weakHashMap.get(view);
                if (map == null) {
                    map = new HashMap();
                    weakHashMap.put(view, map);
                }
                ViewOnAttachStateChangeListenerC0267ic viewOnAttachStateChangeListenerC0267ic2 = (ViewOnAttachStateChangeListenerC0267ic) map.put(str, viewOnAttachStateChangeListenerC0267ic);
                if (viewOnAttachStateChangeListenerC0267ic2 != null) {
                    viewOnAttachStateChangeListenerC0267ic2.m680a(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        View view2 = (View) viewOnAttachStateChangeListenerC0267ic.f420a.get();
        if (view2 == null) {
            viewOnAttachStateChangeListenerC0267ic.m680a(true);
            return;
        }
        try {
            view2.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0267ic);
        } catch (Throwable th2) {
            AbstractC0198e7.m343a("repeater", "token-attach-listener", th2);
        }
        viewOnAttachStateChangeListenerC0267ic.m682c();
    }
}
