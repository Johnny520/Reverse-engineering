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
import p113.AbstractC7331;
import p113.C7330;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1591 implements InterfaceC1583 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean f4678 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ComponentCallbacks2C1593 f4679;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f4680;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7330 f4681;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f4682 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f4683;

    public C1591(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        this.f4683 = viewTreeObserverOnGlobalLayoutListenerC1884;
        ComponentCallbacks2C1593 componentCallbacks2C1593 = new ComponentCallbacks2C1593();
        this.f4679 = componentCallbacks2C1593;
        if (viewTreeObserverOnGlobalLayoutListenerC1884.isAttachedToWindow()) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC1884.getContext();
            if (!this.f4680) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C1593);
                this.f4680 = true;
            }
        }
        viewTreeObserverOnGlobalLayoutListenerC1884.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1592(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7331 m2899(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        C7330 c7330 = this.f4681;
        if (c7330 != null) {
            return c7330;
        }
        C7330 c73302 = new C7330(viewTreeObserverOnGlobalLayoutListenerC1884.getContext());
        c73302.setClipChildren(false);
        c73302.setClipToPadding(false);
        c73302.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        viewTreeObserverOnGlobalLayoutListenerC1884.addView(c73302, -1);
        this.f4681 = c73302;
        return c73302;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1583
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C1516 mo2570() {
        InterfaceC1514 c1522;
        InterfaceC1514 c1511;
        C1516 c1516;
        synchronized (this.f4682) {
            try {
                ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = this.f4683;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    viewTreeObserverOnGlobalLayoutListenerC1884.getUniqueDrawingId();
                }
                if (i >= 29) {
                    c1511 = new C1511();
                } else {
                    if (f4678) {
                        try {
                            c1522 = new C1513(this.f4683, new C1602(), new C1507());
                        } catch (Throwable unused) {
                            f4678 = false;
                            c1522 = new C1522(m2899(this.f4683));
                        }
                    } else {
                        c1522 = new C1522(m2899(this.f4683));
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
    public final void mo2571(C1516 c1516) {
        synchronized (this.f4682) {
            if (!c1516.f4357) {
                c1516.f4357 = true;
                c1516.m2786();
            }
        }
    }
}
