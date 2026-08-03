package p091g3;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: g3.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1323n {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1332r0 m3525a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C1332r0 c1332r0M3558c = C1332r0.m3558c(rootWindowInsets, null);
        C1324n0 c1324n0 = c1332r0M3558c.f4398a;
        c1324n0.mo3509t(c1332r0M3558c);
        c1324n0.mo3499d(view.getRootView());
        return c1332r0M3558c;
    }
}
