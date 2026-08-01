package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.AbstractC1347;
import p211.C7936;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C1904 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C1903 f5616;

    public ComponentCallbacks2C1904(C1903 c1903) {
        this.f5616 = c1903;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f5616.m3589(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C1903 c1903 = this.f5616;
        c1903.f5593.f21974.clear();
        C7936 c7936 = c1903.f5611;
        synchronized (c7936) {
            c7936.f21973.m788();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        C1903 c1903 = this.f5616;
        c1903.f5593.f21974.clear();
        C7936 c7936 = c1903.f5611;
        synchronized (c7936) {
            c7936.f21973.m788();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        ((AbstractC1347) this.f5616.f5600.f5365).setValue(Boolean.valueOf(z));
    }
}
