package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p000.C0208f1;
import p000.C0247g3;
import p000.C0358j1;
import p000.InterfaceC0296hf;
import p000.InterfaceC0331id;
import p000.LayoutInflaterFactory2C0656r3;
import p000.MenuC0646qu;
import p000.bb0;
import p000.q70;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TypedValue f259a;

    /* JADX INFO: renamed from: b */
    public TypedValue f260b;

    /* JADX INFO: renamed from: c */
    public TypedValue f261c;

    /* JADX INFO: renamed from: d */
    public TypedValue f262d;

    /* JADX INFO: renamed from: e */
    public TypedValue f263e;

    /* JADX INFO: renamed from: f */
    public TypedValue f264f;

    /* JADX INFO: renamed from: g */
    public final Rect f265g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0331id f266h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f265g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f263e == null) {
            this.f263e = new TypedValue();
        }
        return this.f263e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f264f == null) {
            this.f264f = new TypedValue();
        }
        return this.f264f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f261c == null) {
            this.f261c = new TypedValue();
        }
        return this.f261c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f262d == null) {
            this.f262d = new TypedValue();
        }
        return this.f262d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f259a == null) {
            this.f259a = new TypedValue();
        }
        return this.f259a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f260b == null) {
            this.f260b = new TypedValue();
        }
        return this.f260b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0331id interfaceC0331id = this.f266h;
        if (interfaceC0331id != null) {
            interfaceC0331id.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0358j1 c0358j1;
        super.onDetachedFromWindow();
        InterfaceC0331id interfaceC0331id = this.f266h;
        if (interfaceC0331id != null) {
            LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = ((C0247g3) interfaceC0331id).f1866b;
            InterfaceC0296hf interfaceC0296hf = layoutInflaterFactory2C0656r3.f4045r;
            if (interfaceC0296hf != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0296hf;
                actionBarOverlayLayout.m143k();
                ActionMenuView actionMenuView = ((q70) actionBarOverlayLayout.f222e).f3849a.f329a;
                if (actionMenuView != null && (c0358j1 = actionMenuView.f248t) != null) {
                    c0358j1.m1560f();
                    C0208f1 c0208f1 = c0358j1.f2642t;
                    if (c0208f1 != null && c0208f1.m1029b()) {
                        c0208f1.f1669i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0656r3.f4050w != null) {
                layoutInflaterFactory2C0656r3.f4039l.getDecorView().removeCallbacks(layoutInflaterFactory2C0656r3.f4051x);
                if (layoutInflaterFactory2C0656r3.f4050w.isShowing()) {
                    try {
                        layoutInflaterFactory2C0656r3.f4050w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0656r3.f4050w = null;
            }
            bb0 bb0Var = layoutInflaterFactory2C0656r3.f4052y;
            if (bb0Var != null) {
                bb0Var.m508b();
            }
            MenuC0646qu menuC0646qu = layoutInflaterFactory2C0656r3.m2223z(0).f3781h;
            if (menuC0646qu != null) {
                menuC0646qu.m2167c(true);
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

    public void setAttachListener(InterfaceC0331id interfaceC0331id) {
        this.f266h = interfaceC0331id;
    }
}
