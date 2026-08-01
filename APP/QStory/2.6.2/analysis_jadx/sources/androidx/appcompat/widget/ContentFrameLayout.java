package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0092;
import androidx.appcompat.app.LayoutInflaterFactory2C0068;
import androidx.core.view.C2282;
import p190.MenuC7801;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public TypedValue f467;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public TypedValue f468;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public InterfaceC0219 f469;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public TypedValue f470;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Rect f471;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public TypedValue f472;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public TypedValue f473;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public TypedValue f474;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f471 = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f467 == null) {
            this.f467 = new TypedValue();
        }
        return this.f467;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f470 == null) {
            this.f470 = new TypedValue();
        }
        return this.f470;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f473 == null) {
            this.f473 = new TypedValue();
        }
        return this.f473;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f468 == null) {
            this.f468 = new TypedValue();
        }
        return this.f468;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f474 == null) {
            this.f474 = new TypedValue();
        }
        return this.f474;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f472 == null) {
            this.f472 = new TypedValue();
        }
        return this.f472;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0219 interfaceC0219 = this.f469;
        if (interfaceC0219 != null) {
            interfaceC0219.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0197 c0197;
        super.onDetachedFromWindow();
        InterfaceC0219 interfaceC0219 = this.f469;
        if (interfaceC0219 != null) {
            LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = ((C0092) interfaceC0219).f263;
            ActionBarOverlayLayout actionBarOverlayLayout = layoutInflaterFactory2C0068.f174;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.m477();
                ActionMenuView actionMenuView = ((C0146) actionBarOverlayLayout.f440).f612.f511;
                if (actionMenuView != null && (c0197 = actionMenuView.f457) != null) {
                    c0197.m703();
                    C0203 c0203 = c0197.f783;
                    if (c0203 != null && c0203.m13117()) {
                        c0203.f21198.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0068.f161 != null) {
                layoutInflaterFactory2C0068.f168.getDecorView().removeCallbacks(layoutInflaterFactory2C0068.f164);
                if (layoutInflaterFactory2C0068.f161.isShowing()) {
                    try {
                        layoutInflaterFactory2C0068.f161.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0068.f161 = null;
            }
            C2282 c2282 = layoutInflaterFactory2C0068.f163;
            if (c2282 != null) {
                c2282.m4261();
            }
            MenuC7801 menuC7801 = layoutInflaterFactory2C0068.m217(0).f213;
            if (menuC7801 != null) {
                menuC7801.m13126(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0219 interfaceC0219) {
        this.f469 = interfaceC0219;
    }
}
