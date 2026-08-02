package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.util.UUID;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class d22 extends AbstractC0526o2 {

    /* JADX INFO: renamed from: A */
    public final nx1 f1822A;

    /* JADX INFO: renamed from: B */
    public final nx1 f1823B;

    /* JADX INFO: renamed from: C */
    public d11 f1824C;

    /* JADX INFO: renamed from: D */
    public final n70 f1825D;

    /* JADX INFO: renamed from: E */
    public final Rect f1826E;

    /* JADX INFO: renamed from: F */
    public final ts2 f1827F;

    /* JADX INFO: renamed from: G */
    public C0540oe f1828G;

    /* JADX INFO: renamed from: H */
    public final nx1 f1829H;

    /* JADX INFO: renamed from: I */
    public boolean f1830I;

    /* JADX INFO: renamed from: J */
    public final int[] f1831J;

    /* JADX INFO: renamed from: q */
    public xm0 f1832q;

    /* JADX INFO: renamed from: r */
    public h22 f1833r;

    /* JADX INFO: renamed from: s */
    public String f1834s;

    /* JADX INFO: renamed from: t */
    public final View f1835t;

    /* JADX INFO: renamed from: u */
    public final boolean f1836u;

    /* JADX INFO: renamed from: v */
    public final j51 f1837v;

    /* JADX INFO: renamed from: w */
    public final WindowManager f1838w;

    /* JADX INFO: renamed from: x */
    public final WindowManager.LayoutParams f1839x;

    /* JADX INFO: renamed from: y */
    public g22 f1840y;

    /* JADX INFO: renamed from: z */
    public d61 f1841z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d22(xm0 xm0Var, h22 h22Var, String str, View view, e70 e70Var, g22 g22Var, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        int i2 = 12;
        j51 f22Var = i >= 30 ? new f22(i2) : i >= 29 ? new e22(i2) : new j51(i2);
        this.f1832q = xm0Var;
        this.f1833r = h22Var;
        this.f1834s = str;
        this.f1835t = view;
        this.f1836u = z;
        this.f1837v = f22Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.f1838w = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        h22 h22Var2 = this.f1833r;
        boolean zM3832b = AbstractC0573pa.m3832b(view);
        boolean z2 = h22Var2.f3796b;
        int i3 = h22Var2.f3795a;
        if (z2 && zM3832b) {
            i3 |= 8192;
        } else if (z2 && !zM3832b) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = this.f1833r.f3800f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f1839x = layoutParams;
        this.f1840y = g22Var;
        this.f1841z = d61.f1885h;
        this.f1822A = op0.m3598u(null);
        this.f1823B = op0.m3598u(null);
        this.f1825D = op0.m3590m(new C0159ea(18, this));
        this.f1826E = new Rect();
        this.f1827F = new ts2(new C0417la(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, rb3.m4427b(view));
        setTag(R.id.view_tree_view_model_store_owner, tb3.m5156b(view));
        setTag(R.id.view_tree_saved_state_registry_owner, sb3.m4784b(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(e70Var.mo689A(8.0f));
        setOutlineProvider(new o80(1));
        this.f1829H = op0.m3598u(AbstractC0476mw.f6902a);
        this.f1831J = new int[2];
    }

    private final mn0 getContent() {
        return (mn0) this.f1829H.getValue();
    }

    private final d11 getDisplayBounds() {
        int i = this.f1833r.f3795a & AIChatConfig.DefaultMaxTokens;
        View view = this.f1835t;
        Rect rect = this.f1826E;
        j51 j51Var = this.f1837v;
        if (i == 0) {
            j51Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            j51Var.mo1500y(view, rect);
        }
        return new d11(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c61 getParentLayoutCoordinates() {
        return (c61) this.f1823B.getValue();
    }

    private final void setContent(mn0 mn0Var) {
        this.f1829H.setValue(mn0Var);
    }

    private final void setParentLayoutCoordinates(c61 c61Var) {
        this.f1823B.setValue(c61Var);
    }

    @Override // p000.AbstractC0526o2
    /* JADX INFO: renamed from: a */
    public final void mo927a(int i, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(-857613600);
        int i2 = (go0Var.m1984h(this) ? 4 : 2) | i;
        if (go0Var.m1958O(i2 & 1, (i2 & 3) != 2)) {
            getContent().mo12g(go0Var, 0);
        } else {
            go0Var.m1961R();
        }
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0483n2(this, i, 5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f1833r.f3797c) {
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
                xm0 xm0Var = this.f1832q;
                if (xm0Var != null) {
                    xm0Var.mo6a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f1825D.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.f1839x;
    }

    public final d61 getParentLayoutDirection() {
        return this.f1841z;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final h11 m6534getPopupContentSizebOM6tXw() {
        return (h11) this.f1822A.getValue();
    }

    public final g22 getPositionProvider() {
        return this.f1840y;
    }

    @Override // p000.AbstractC0526o2
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f1830I;
    }

    public final String getTestTag() {
        return this.f1834s;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // p000.AbstractC0526o2
    /* JADX INFO: renamed from: h */
    public final void mo928h(boolean z, int i, int i2, int i3, int i4) {
        super.mo928h(z, i, i2, i3, i4);
        this.f1833r.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f1839x;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f1837v.getClass();
        this.f1838w.updateViewLayout(this, layoutParams);
    }

    @Override // p000.AbstractC0526o2
    /* JADX INFO: renamed from: i */
    public final void mo929i(int i, int i2) {
        this.f1833r.getClass();
        d11 displayBounds = getDisplayBounds();
        super.mo929i(View.MeasureSpec.makeMeasureSpec(displayBounds.f1809c - displayBounds.f1807a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.f1810d - displayBounds.f1808b, Integer.MIN_VALUE));
    }

    /* JADX INFO: renamed from: n */
    public final void m930n(AbstractC0941yx abstractC0941yx, mn0 mn0Var) {
        setParentCompositionContext(abstractC0941yx);
        setContent(mn0Var);
        this.f1830I = true;
    }

    /* JADX INFO: renamed from: o */
    public final void m931o(xm0 xm0Var, h22 h22Var, String str, d61 d61Var) {
        int i;
        this.f1832q = xm0Var;
        this.f1834s = str;
        if (!t11.m5086l(this.f1833r, h22Var)) {
            h22Var.getClass();
            this.f1833r = h22Var;
            boolean zM3832b = AbstractC0573pa.m3832b(this.f1835t);
            boolean z = h22Var.f3796b;
            int i2 = h22Var.f3795a;
            if (z && zM3832b) {
                i2 |= 8192;
            } else if (z && !zM3832b) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f1839x;
            layoutParams.flags = i2;
            this.f1837v.getClass();
            this.f1838w.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = d61Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                c80.m675s();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    @Override // p000.AbstractC0526o2, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1827F.m5437d();
        if (!this.f1833r.f3797c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f1828G == null) {
            this.f1828G = new C0540oe(0, this.f1832q);
        }
        AbstractC0264h4.m2052d(this, this.f1828G);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ts2 ts2Var = this.f1827F;
        rl1 rl1Var = ts2Var.f10954h;
        if (rl1Var != null) {
            rl1Var.m4512a();
        }
        ts2Var.m5434a();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC0264h4.m2053e(this, this.f1828G);
        }
        this.f1828G = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f1833r.f3798d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            xm0 xm0Var = this.f1832q;
            if (xm0Var != null) {
                xm0Var.mo6a();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        xm0 xm0Var2 = this.f1832q;
        if (xm0Var2 != null) {
            xm0Var2.mo6a();
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m932p() {
        c61 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.mo653w()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jMo645L = parentLayoutCoordinates.mo645L();
            long jMo647c = this.f1836u ? parentLayoutCoordinates.mo647c(0L) : parentLayoutCoordinates.mo649h(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jMo647c >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jMo647c & 4294967295L)))) & 4294967295L);
            int i = (int) (jRound >> 32);
            int i2 = (int) (jRound & 4294967295L);
            d11 d11Var = new d11(i, i2, ((int) (jMo645L >> 32)) + i, ((int) (jMo645L & 4294967295L)) + i2);
            if (d11Var.equals(this.f1824C)) {
                return;
            }
            this.f1824C = d11Var;
            m934r();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m933q(c61 c61Var) {
        setParentLayoutCoordinates(c61Var);
        m932p();
    }

    /* JADX INFO: renamed from: r */
    public final void m934r() {
        h11 h11VarM6534getPopupContentSizebOM6tXw;
        d11 d11Var = this.f1824C;
        if (d11Var == null || (h11VarM6534getPopupContentSizebOM6tXw = m6534getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = h11VarM6534getPopupContentSizebOM6tXw.f3775a;
        d11 displayBounds = getDisplayBounds();
        long j2 = (((long) (displayBounds.f1810d - displayBounds.f1808b)) & 4294967295L) | (((long) (displayBounds.f1809c - displayBounds.f1807a)) << 32);
        b72 b72Var = new b72();
        b72Var.f722h = 0L;
        this.f1827F.m5436c(this, oq0.f7786x, new c22(b72Var, this, d11Var, j2, j));
        long j3 = b72Var.f722h;
        WindowManager.LayoutParams layoutParams = this.f1839x;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        boolean z = this.f1833r.f3799e;
        j51 j51Var = this.f1837v;
        if (z) {
            j51Var.mo1216C(this, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        j51Var.getClass();
        this.f1838w.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(d61 d61Var) {
        this.f1841z = d61Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m6535setPopupContentSizefhxjrPA(h11 h11Var) {
        this.f1822A.setValue(h11Var);
    }

    public final void setPositionProvider(g22 g22Var) {
        this.f1840y = g22Var;
    }

    public final void setTestTag(String str) {
        this.f1834s = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public AbstractC0526o2 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
