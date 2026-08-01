package androidx.compose.p001ui.graphics;

import android.content.Context;
import android.os.Build;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.layer.C2346;
import androidx.compose.p001ui.graphics.layer.C2348;
import androidx.compose.p001ui.graphics.layer.C2351;
import androidx.compose.p001ui.graphics.layer.C2357;
import androidx.compose.p001ui.graphics.layer.InterfaceC2349;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import com.davemorrissey.labs.subscaleview.C0328R;
import p129.AbstractC8161;
import p129.C8160;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2426 implements InterfaceC2418 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean f5024 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ComponentCallbacks2C2428 f5025;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f5026;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C8160 f5027;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f5028 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2719 f5029;

    public C2426(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719) {
        this.f5029 = viewTreeObserverOnGlobalLayoutListenerC2719;
        ComponentCallbacks2C2428 componentCallbacks2C2428 = new ComponentCallbacks2C2428();
        this.f5025 = componentCallbacks2C2428;
        if (viewTreeObserverOnGlobalLayoutListenerC2719.isAttachedToWindow()) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC2719.getContext();
            if (!this.f5026) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C2428);
                this.f5026 = true;
            }
        }
        viewTreeObserverOnGlobalLayoutListenerC2719.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2427(this, 0));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC8161 m3469(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719) {
        C8160 c8160 = this.f5027;
        if (c8160 != null) {
            return c8160;
        }
        C8160 c81602 = new C8160(viewTreeObserverOnGlobalLayoutListenerC2719.getContext());
        c81602.setClipChildren(false);
        c81602.setClipToPadding(false);
        c81602.setTag(C0328R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        viewTreeObserverOnGlobalLayoutListenerC2719.addView(c81602, -1);
        this.f5027 = c81602;
        return c81602;
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2418
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C2351 mo3140() {
        InterfaceC2349 c2357;
        InterfaceC2349 c2346;
        C2351 c2351;
        synchronized (this.f5028) {
            try {
                ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = this.f5029;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    viewTreeObserverOnGlobalLayoutListenerC2719.getUniqueDrawingId();
                }
                if (i >= 29) {
                    c2346 = new C2346();
                } else {
                    if (f5024) {
                        try {
                            c2357 = new C2348(this.f5029, new C2437(), new C2342());
                        } catch (Throwable unused) {
                            f5024 = false;
                            c2357 = new C2357(m3469(this.f5029));
                        }
                    } else {
                        c2357 = new C2357(m3469(this.f5029));
                    }
                    c2346 = c2357;
                }
                c2351 = new C2351(c2346);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2351;
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2418
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3141(C2351 c2351) {
        synchronized (this.f5028) {
            if (!c2351.f4703) {
                c2351.f4703 = true;
                c2351.m3356();
            }
        }
    }
}
