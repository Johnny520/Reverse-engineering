package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.AbstractC1347;
import p211.C7937;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C1904 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C1903 f5617;

    public ComponentCallbacks2C1904(C1903 c1903) {
        this.f5617 = c1903;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f5617.m3599(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C1903 c1903 = this.f5617;
        c1903.f5594.f21971.clear();
        C7937 c7937 = c1903.f5612;
        synchronized (c7937) {
            c7937.f21970.m789();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        C1903 c1903 = this.f5617;
        c1903.f5594.f21971.clear();
        C7937 c7937 = c1903.f5612;
        synchronized (c7937) {
            c7937.f21970.m789();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        ((AbstractC1347) this.f5617.f5601.f5366).setValue(Boolean.valueOf(z));
    }
}
