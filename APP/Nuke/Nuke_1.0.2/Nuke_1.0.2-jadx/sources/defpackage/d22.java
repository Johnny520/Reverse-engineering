package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.util.UUID;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d22 extends o2 {
    public final nx1 A;
    public final nx1 B;
    public d11 C;
    public final n70 D;
    public final Rect E;
    public final ts2 F;
    public oe G;
    public final nx1 H;
    public boolean I;
    public final int[] J;
    public xm0 q;
    public h22 r;
    public String s;
    public final View t;
    public final boolean u;
    public final j51 v;
    public final WindowManager w;
    public final WindowManager.LayoutParams x;
    public g22 y;
    public d61 z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d22(xm0 xm0Var, h22 h22Var, String str, View view, e70 e70Var, g22 g22Var, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        int i2 = 12;
        j51 f22Var = i >= 30 ? new f22(i2) : i >= 29 ? new e22(i2) : new j51(i2);
        this.q = xm0Var;
        this.r = h22Var;
        this.s = str;
        this.t = view;
        this.u = z;
        this.v = f22Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.w = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        h22 h22Var2 = this.r;
        boolean zB = pa.b(view);
        boolean z2 = h22Var2.b;
        int i3 = h22Var2.a;
        if (z2 && zB) {
            i3 |= 8192;
        } else if (z2 && !zB) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = this.r.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.x = layoutParams;
        this.y = g22Var;
        this.z = d61.h;
        this.A = op0.u(null);
        this.B = op0.u(null);
        this.D = op0.m(new ea(18, this));
        this.E = new Rect();
        this.F = new ts2(new la(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, rb3.b(view));
        setTag(R.id.view_tree_view_model_store_owner, tb3.b(view));
        setTag(R.id.view_tree_saved_state_registry_owner, sb3.b(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(e70Var.A(8.0f));
        setOutlineProvider(new o80(1));
        this.H = op0.u(mw.a);
        this.J = new int[2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final mn0 getContent() {
        return (mn0) this.H.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final d11 getDisplayBounds() {
        int i = this.r.a & AIChatConfig.DefaultMaxTokens;
        View view = this.t;
        Rect rect = this.E;
        j51 j51Var = this.v;
        if (i == 0) {
            j51Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            j51Var.y(view, rect);
        }
        return new d11(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final c61 getParentLayoutCoordinates() {
        return (c61) this.B.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setContent(mn0 mn0Var) {
        this.H.setValue(mn0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setParentLayoutCoordinates(c61 c61Var) {
        this.B.setValue(c61Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o2
    public final void a(int i, px pxVar) {
        go0 go0Var = (go0) pxVar;
        go0Var.X(-857613600);
        int i2 = (go0Var.h(this) ? 4 : 2) | i;
        if (go0Var.O(i2 & 1, (i2 & 3) != 2)) {
            getContent().g(go0Var, 0);
        } else {
            go0Var.R();
        }
        b62 b62VarR = go0Var.r();
        if (b62VarR != null) {
            b62VarR.d = new n2(this, i, 5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.r.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                xm0 xm0Var = this.q;
                if (xm0Var != null) {
                    xm0Var.a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WindowManager.LayoutParams getParams$ui() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final d61 getParentLayoutDirection() {
        return this.z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final h11 m12getPopupContentSizebOM6tXw() {
        return (h11) this.A.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final g22 getPositionProvider() {
        return this.y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o2
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTestTag() {
        return this.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o2
    public final void h(boolean z, int i, int i2, int i3, int i4) {
        super.h(z, i, i2, i3, i4);
        this.r.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.x;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.v.getClass();
        this.w.updateViewLayout(this, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o2
    public final void i(int i, int i2) {
        this.r.getClass();
        d11 displayBounds = getDisplayBounds();
        super.i(View.MeasureSpec.makeMeasureSpec(displayBounds.c - displayBounds.a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.d - displayBounds.b, Integer.MIN_VALUE));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(yx yxVar, mn0 mn0Var) {
        setParentCompositionContext(yxVar);
        setContent(mn0Var);
        this.I = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(xm0 xm0Var, h22 h22Var, String str, d61 d61Var) {
        int i;
        this.q = xm0Var;
        this.s = str;
        if (!t11.l(this.r, h22Var)) {
            h22Var.getClass();
            this.r = h22Var;
            boolean zB = pa.b(this.t);
            boolean z = h22Var.b;
            int i2 = h22Var.a;
            if (z && zB) {
                i2 |= 8192;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.x;
            layoutParams.flags = i2;
            this.v.getClass();
            this.w.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = d61Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                c80.s();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o2, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F.d();
        if (!this.r.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.G == null) {
            this.G = new oe(0, this.q);
        }
        h4.d(this, this.G);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ts2 ts2Var = this.F;
        rl1 rl1Var = ts2Var.h;
        if (rl1Var != null) {
            rl1Var.a();
        }
        ts2Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            h4.e(this, this.G);
        }
        this.G = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.r.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            xm0 xm0Var = this.q;
            if (xm0Var != null) {
                xm0Var.a();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        xm0 xm0Var2 = this.q;
        if (xm0Var2 != null) {
            xm0Var2.a();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p() {
        c61 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.w()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jL = parentLayoutCoordinates.L();
            long jC = this.u ? parentLayoutCoordinates.c(0L) : parentLayoutCoordinates.h(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jC >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jC & 4294967295L)))) & 4294967295L);
            int i = (int) (jRound >> 32);
            int i2 = (int) (jRound & 4294967295L);
            d11 d11Var = new d11(i, i2, ((int) (jL >> 32)) + i, ((int) (jL & 4294967295L)) + i2);
            if (d11Var.equals(this.C)) {
                return;
            }
            this.C = d11Var;
            r();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(c61 c61Var) {
        setParentLayoutCoordinates(c61Var);
        p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r() {
        h11 h11VarM12getPopupContentSizebOM6tXw;
        d11 d11Var = this.C;
        if (d11Var == null || (h11VarM12getPopupContentSizebOM6tXw = m12getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = h11VarM12getPopupContentSizebOM6tXw.a;
        d11 displayBounds = getDisplayBounds();
        long j2 = (((long) (displayBounds.d - displayBounds.b)) & 4294967295L) | (((long) (displayBounds.c - displayBounds.a)) << 32);
        b72 b72Var = new b72();
        b72Var.h = 0L;
        this.F.c(this, oq0.x, new c22(b72Var, this, d11Var, j2, j));
        long j3 = b72Var.h;
        WindowManager.LayoutParams layoutParams = this.x;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        boolean z = this.r.e;
        j51 j51Var = this.v;
        if (z) {
            j51Var.C(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        j51Var.getClass();
        this.w.updateViewLayout(this, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setParentLayoutDirection(d61 d61Var) {
        this.z = d61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m13setPopupContentSizefhxjrPA(h11 h11Var) {
        this.A.setValue(h11Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setPositionProvider(g22 g22Var) {
        this.y = g22Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setTestTag(String str) {
        this.s = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public o2 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
