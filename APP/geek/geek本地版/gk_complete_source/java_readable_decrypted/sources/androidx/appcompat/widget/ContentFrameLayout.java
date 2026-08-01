package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p000.C0208f1;
import p000.C0247g3;
import p000.C0358j1;
import p000.InterfaceC0259gf;
import p000.InterfaceC0925yc;
import p000.LayoutInflaterFactory2C0657r3;
import p000.MenuC0424ku;
import p000.k70;
import p000.wa0;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TypedValue f296a;

    /* JADX INFO: renamed from: b */
    public TypedValue f297b;

    /* JADX INFO: renamed from: c */
    public TypedValue f298c;

    /* JADX INFO: renamed from: d */
    public TypedValue f299d;

    /* JADX INFO: renamed from: e */
    public TypedValue f300e;

    /* JADX INFO: renamed from: f */
    public TypedValue f301f;

    /* JADX INFO: renamed from: g */
    public final Rect f302g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0925yc f303h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f302g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f300e == null) {
            this.f300e = new TypedValue();
        }
        return this.f300e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f301f == null) {
            this.f301f = new TypedValue();
        }
        return this.f301f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f298c == null) {
            this.f298c = new TypedValue();
        }
        return this.f298c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f299d == null) {
            this.f299d = new TypedValue();
        }
        return this.f299d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f296a == null) {
            this.f296a = new TypedValue();
        }
        return this.f296a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f297b == null) {
            this.f297b = new TypedValue();
        }
        return this.f297b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0925yc interfaceC0925yc = this.f303h;
        if (interfaceC0925yc != null) {
            interfaceC0925yc.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0358j1 c0358j1;
        super.onDetachedFromWindow();
        InterfaceC0925yc interfaceC0925yc = this.f303h;
        if (interfaceC0925yc != null) {
            LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = ((C0247g3) interfaceC0925yc).f2012b;
            InterfaceC0259gf interfaceC0259gf = layoutInflaterFactory2C0657r3.f4184r;
            if (interfaceC0259gf != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0259gf;
                actionBarOverlayLayout.m158k();
                ActionMenuView actionMenuView = ((k70) actionBarOverlayLayout.f259e).f2717a.f366a;
                if (actionMenuView != null && (c0358j1 = actionMenuView.f285t) != null) {
                    c0358j1.m1540f();
                    C0208f1 c0208f1 = c0358j1.f2535t;
                    if (c0208f1 != null && c0208f1.m2600b()) {
                        c0208f1.f5031i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0657r3.f4189w != null) {
                layoutInflaterFactory2C0657r3.f4178l.getDecorView().removeCallbacks(layoutInflaterFactory2C0657r3.f4190x);
                if (layoutInflaterFactory2C0657r3.f4189w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0657r3.f4189w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0657r3.f4189w = null;
            }
            wa0 wa0Var = layoutInflaterFactory2C0657r3.f4191y;
            if (wa0Var != null) {
                wa0Var.m2554b();
            }
            MenuC0424ku menuC0424ku = layoutInflaterFactory2C0657r3.m2212z(0).f3984h;
            if (menuC0424ku != null) {
                menuC0424ku.m1718c(true);
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

    public void setAttachListener(InterfaceC0925yc interfaceC0925yc) {
        this.f303h = interfaceC0925yc;
    }
}
