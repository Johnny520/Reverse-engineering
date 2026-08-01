package androidx.compose.ui.graphics;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.layer.C1511;
import androidx.compose.ui.graphics.layer.C1513;
import androidx.compose.ui.graphics.layer.C1516;
import androidx.compose.ui.graphics.layer.C1522;
import androidx.compose.ui.graphics.layer.InterfaceC1514;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import com.davemorrissey.labs.subscaleview.R;
import p113.AbstractC7332;
import p113.C7331;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1591 implements InterfaceC1583 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean f4679 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ComponentCallbacks2C1593 f4680;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f4681;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7331 f4682;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f4683 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f4684;

    public C1591(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        this.f4684 = viewTreeObserverOnGlobalLayoutListenerC1884;
        ComponentCallbacks2C1593 componentCallbacks2C1593 = new ComponentCallbacks2C1593();
        this.f4680 = componentCallbacks2C1593;
        if (viewTreeObserverOnGlobalLayoutListenerC1884.isAttachedToWindow()) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC1884.getContext();
            if (!this.f4681) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C1593);
                this.f4681 = true;
            }
        }
        viewTreeObserverOnGlobalLayoutListenerC1884.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1592(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7332 m2909(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        C7331 c7331 = this.f4682;
        if (c7331 != null) {
            return c7331;
        }
        C7331 c73312 = new C7331(viewTreeObserverOnGlobalLayoutListenerC1884.getContext());
        c73312.setClipChildren(false);
        c73312.setClipToPadding(false);
        c73312.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        viewTreeObserverOnGlobalLayoutListenerC1884.addView(c73312, -1);
        this.f4682 = c73312;
        return c73312;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1583
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C1516 mo2580() {
        InterfaceC1514 c1522;
        InterfaceC1514 c1511;
        C1516 c1516;
        synchronized (this.f4683) {
            try {
                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f4684;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    viewTreeObserverOnGlobalLayoutListenerC1884.getUniqueDrawingId();
                }
                if (i >= 29) {
                    c1511 = new C1511();
                } else {
                    if (f4679) {
                        try {
                            c1522 = new C1513(this.f4684, new C1602(), new C1507());
                        } catch (Throwable unused) {
                            f4679 = false;
                            c1522 = new C1522(m2909(this.f4684));
                        }
                    } else {
                        c1522 = new C1522(m2909(this.f4684));
                    }
                    c1511 = c1522;
                }
                c1516 = new C1516(c1511);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1516;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1583
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2581(C1516 c1516) {
        synchronized (this.f4683) {
            if (!c1516.f4358) {
                c1516.f4358 = true;
                c1516.m2796();
            }
        }
    }
}
