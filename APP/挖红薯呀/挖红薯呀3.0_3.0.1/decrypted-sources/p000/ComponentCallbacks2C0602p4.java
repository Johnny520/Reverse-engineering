package p000;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: p4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0602p4 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Configuration f4750d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ s00 f4751e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ComponentCallbacks2C0602p4(Configuration configuration, s00 s00Var) {
        this.f4750d = configuration;
        this.f4751e = s00Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f4750d;
        configuration2.updateFrom(configuration);
        Iterator it = this.f4751e.f5615a.entrySet().iterator();
        while (it.hasNext()) {
            if (((WeakReference) ((Map.Entry) it.next()).getValue()).get() != null) {
                C0921xc.m5123d();
                return;
            }
            it.remove();
        }
        configuration2.setTo(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f4751e.f5615a.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.f4751e.f5615a.clear();
    }
}
