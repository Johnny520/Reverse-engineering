package yyds;

import android.util.Log;
import com.p000ss.android.ugc.awemes.MainActivity;
import com.p000ss.android.ugc.awemes.MainApp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: yyds.ᛵᛸᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1174 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final HashSet f5382 = new HashSet();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static MainApp f5383 = null;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m2369(MainApp mainApp) {
        HashSet hashSet = f5382;
        synchronized (hashSet) {
            try {
                f5383 = mainApp;
                if (!hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        try {
                            C1416 c1416 = (C1416) it.next();
                            ((C1922) c1416.f6701).f9681.linkToDeath(new C0532(c1416, 0), 0);
                            f5383.getClass();
                            C1416 c14162 = MainApp.f486;
                            AbstractC2328.m4341(-1297380343972718L);
                            MainApp.f486 = c1416;
                            CopyOnWriteArraySet<InterfaceC2324> copyOnWriteArraySet = MainApp.f487;
                            AbstractC2328.m4341(-1297234315084654L);
                            for (InterfaceC2324 interfaceC2324 : copyOnWriteArraySet) {
                                if (copyOnWriteArraySet.contains(interfaceC2324)) {
                                    MainActivity mainActivity = (MainActivity) interfaceC2324;
                                    mainActivity.getClass();
                                    mainActivity.runOnUiThread(new RunnableC2696(mainActivity, 7, c1416));
                                }
                            }
                        } catch (Throwable th) {
                            Log.e("XposedServiceHelper", "registerListener", th);
                            it.remove();
                        }
                    }
                    f5382.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
