package p047I0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import p067N0.C1007a;
import p067N0.C1009c;

/* JADX INFO: renamed from: I0.O */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0687O implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Configuration f2205d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1009c f2206e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ComponentCallbacks2C0687O(Configuration configuration, C1009c c1009c) {
        this.f2205d = configuration;
        this.f2206e = c1009c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f2205d;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f2206e.f3125a.entrySet().iterator();
        while (it.hasNext()) {
            C1007a c1007a = (C1007a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (c1007a == null || Configuration.needNewResources(iUpdateFrom, c1007a.f3122b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f2206e.f3125a.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        this.f2206e.f3125a.clear();
    }
}
