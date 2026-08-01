package androidx.compose.p001ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.AbstractC2182;
import p227.C8766;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2739 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C2738 f5962;

    public ComponentCallbacks2C2739(C2738 c2738) {
        this.f5962 = c2738;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f5962.m4159(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C2738 c2738 = this.f5962;
        c2738.f5939.f22316.clear();
        C8766 c8766 = c2738.f5957;
        synchronized (c8766) {
            c8766.f22315.m1349();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        C2738 c2738 = this.f5962;
        c2738.f5939.f22316.clear();
        C8766 c8766 = c2738.f5957;
        synchronized (c8766) {
            c8766.f22315.m1349();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        ((AbstractC2182) this.f5962.f5946.f5711).setValue(Boolean.valueOf(z));
    }
}
