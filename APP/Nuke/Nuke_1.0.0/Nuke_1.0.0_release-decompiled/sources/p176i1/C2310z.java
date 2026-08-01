package p176i1;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.util.UUID;
import me.dartcv.nuke.R;
import p001A0.C0102b;
import p002A1.AbstractC0116E;
import p027E4.C0330q;
import p029F0.InterfaceC0430v;
import p030F1.C0449n;
import p047I0.AbstractC0713b;
import p047I0.C0699U0;
import p047I0.C0710a;
import p095T.AbstractC1385s;
import p095T.AbstractC1391v;
import p095T.C1311F;
import p095T.C1366i0;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.C1674s;
import p135b.C1836x;
import p153e1.C2015k;
import p153e1.C2016l;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p158f0.C2088t;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: i1.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2310z extends AbstractC0713b {

    /* JADX INFO: renamed from: A */
    public final C2088t f7526A;

    /* JADX INFO: renamed from: B */
    public C0449n f7527B;

    /* JADX INFO: renamed from: C */
    public final C1366i0 f7528C;

    /* JADX INFO: renamed from: D */
    public boolean f7529D;

    /* JADX INFO: renamed from: E */
    public final int[] f7530E;

    /* JADX INFO: renamed from: l */
    public InterfaceC1599a f7531l;

    /* JADX INFO: renamed from: m */
    public C2283D f7532m;

    /* JADX INFO: renamed from: n */
    public String f7533n;

    /* JADX INFO: renamed from: o */
    public final View f7534o;

    /* JADX INFO: renamed from: p */
    public final boolean f7535p;

    /* JADX INFO: renamed from: q */
    public final C2281B f7536q;

    /* JADX INFO: renamed from: r */
    public final WindowManager f7537r;

    /* JADX INFO: renamed from: s */
    public final WindowManager.LayoutParams f7538s;

    /* JADX INFO: renamed from: t */
    public InterfaceC2282C f7539t;

    /* JADX INFO: renamed from: u */
    public EnumC2017m f7540u;

    /* JADX INFO: renamed from: v */
    public final C1366i0 f7541v;

    /* JADX INFO: renamed from: w */
    public final C1366i0 f7542w;

    /* JADX INFO: renamed from: x */
    public C2015k f7543x;

    /* JADX INFO: renamed from: y */
    public final C1311F f7544y;

    /* JADX INFO: renamed from: z */
    public final Rect f7545z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2310z(InterfaceC1599a interfaceC1599a, C2283D c2283d, String str, View view, InterfaceC2007c interfaceC2007c, InterfaceC2282C interfaceC2282C, UUID uuid, boolean z5) {
        super(view.getContext());
        C2281B c2280a = Build.VERSION.SDK_INT >= 29 ? new C2280A() : new C2281B();
        this.f7531l = interfaceC1599a;
        this.f7532m = c2283d;
        this.f7533n = str;
        this.f7534o = view;
        this.f7535p = z5;
        this.f7536q = c2280a;
        Object systemService = view.getContext().getSystemService("window");
        AbstractC1665j.m2983c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f7537r = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C2283D c2283d2 = this.f7532m;
        boolean zM4123b = AbstractC2298n.m4123b(view);
        boolean z6 = c2283d2.f7436b;
        int i5 = c2283d2.f7435a;
        if (z6 && zM4123b) {
            i5 |= 8192;
        } else if (z6 && !zM4123b) {
            i5 &= -8193;
        }
        layoutParams.flags = i5;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f7538s = layoutParams;
        this.f7539t = interfaceC2282C;
        this.f7540u = EnumC2017m.f6742d;
        this.f7541v = AbstractC1385s.m2629s(null);
        this.f7542w = AbstractC1385s.m2629s(null);
        this.f7544y = AbstractC1385s.m2624n(new C0102b(12, this));
        this.f7545z = new Rect();
        this.f7526A = new C2088t(new C2294j(this, 2));
        setId(android.R.id.content);
        AbstractC0116E.m165g(this, AbstractC0116E.m162d(view));
        setTag(R.id.view_tree_view_model_store_owner, AbstractC0116E.m163e(view));
        setTag(R.id.view_tree_saved_state_registry_owner, AbstractC2352g.m4206s(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(interfaceC2007c.mo268G((float) 8));
        setOutlineProvider(new C0699U0(2));
        this.f7528C = AbstractC1385s.m2629s(AbstractC2305u.f7499a);
        this.f7530E = new int[2];
    }

    private final InterfaceC1603e getContent() {
        return (InterfaceC1603e) this.f7528C.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0430v getParentLayoutCoordinates() {
        return (InterfaceC0430v) this.f7542w.getValue();
    }

    private final C2015k getVisibleDisplayBounds() {
        this.f7536q.getClass();
        View view = this.f7534o;
        Rect rect = this.f7545z;
        view.getWindowVisibleDisplayFrame(rect);
        return new C2015k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(InterfaceC1603e interfaceC1603e) {
        this.f7528C.setValue(interfaceC1603e);
    }

    private final void setParentLayoutCoordinates(InterfaceC0430v interfaceC0430v) {
        this.f7542w.setValue(interfaceC0430v);
    }

    @Override // p047I0.AbstractC0713b
    /* JADX INFO: renamed from: b */
    public final void mo1210b(int i5, InterfaceC1373m interfaceC1373m) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-857613600);
        int i6 = (c1383r.m2586h(this) ? 4 : 2) | i5;
        if (c1383r.m2560O(i6 & 1, (i6 & 3) != 2)) {
            getContent().mo0g(c1383r, 0);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0710a(this, i5, 5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f7532m.f7437c) {
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
                InterfaceC1599a interfaceC1599a = this.f7531l;
                if (interfaceC1599a != null) {
                    interfaceC1599a.mo6a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p047I0.AbstractC0713b
    /* JADX INFO: renamed from: f */
    public final void mo1214f(boolean z5, int i5, int i6, int i7, int i8) {
        super.mo1214f(z5, i5, i6, i7, i8);
        this.f7532m.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f7538s;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f7536q.getClass();
        this.f7537r.updateViewLayout(this, layoutParams);
    }

    @Override // p047I0.AbstractC0713b
    /* JADX INFO: renamed from: g */
    public final void mo1215g(int i5, int i6) {
        this.f7532m.getClass();
        C2015k visibleDisplayBounds = getVisibleDisplayBounds();
        super.mo1215g(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f6739c - visibleDisplayBounds.f6737a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.f6740d - visibleDisplayBounds.f6738b, Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f7544y.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.f7538s;
    }

    public final EnumC2017m getParentLayoutDirection() {
        return this.f7540u;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C2016l m6328getPopupContentSizebOM6tXw() {
        return (C2016l) this.f7541v.getValue();
    }

    public final InterfaceC2282C getPositionProvider() {
        return this.f7539t;
    }

    @Override // p047I0.AbstractC0713b
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f7529D;
    }

    public final String getTestTag() {
        return this.f7533n;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m4138j(AbstractC1391v abstractC1391v, InterfaceC1603e interfaceC1603e) {
        setParentCompositionContext(abstractC1391v);
        setContent(interfaceC1603e);
        this.f7529D = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m4139k(InterfaceC1599a interfaceC1599a, C2283D c2283d, String str, EnumC2017m enumC2017m) {
        int i5;
        this.f7531l = interfaceC1599a;
        this.f7533n = str;
        if (!AbstractC1665j.m2981a(this.f7532m, c2283d)) {
            c2283d.getClass();
            this.f7532m = c2283d;
            boolean zM4123b = AbstractC2298n.m4123b(this.f7534o);
            boolean z5 = c2283d.f7436b;
            int i6 = c2283d.f7435a;
            if (z5 && zM4123b) {
                i6 |= 8192;
            } else if (z5 && !zM4123b) {
                i6 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f7538s;
            layoutParams.flags = i6;
            this.f7536q.getClass();
            this.f7537r.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = enumC2017m.ordinal();
        if (iOrdinal != 0) {
            i5 = 1;
            if (iOrdinal != 1) {
                throw new C0330q();
            }
        } else {
            i5 = 0;
        }
        super.setLayoutDirection(i5);
    }

    /* JADX INFO: renamed from: l */
    public final void m4140l() {
        InterfaceC0430v parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.mo632D()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jMo637Q = parentLayoutCoordinates.mo637Q();
            long jMo640d = this.f7535p ? parentLayoutCoordinates.mo640d(0L) : parentLayoutCoordinates.mo642k(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jMo640d >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jMo640d & 4294967295L)))) & 4294967295L);
            int i5 = (int) (jRound >> 32);
            int i6 = (int) (jRound & 4294967295L);
            C2015k c2015k = new C2015k(i5, i6, ((int) (jMo637Q >> 32)) + i5, ((int) (jMo637Q & 4294967295L)) + i6);
            if (c2015k.equals(this.f7543x)) {
                return;
            }
            this.f7543x = c2015k;
            m4142n();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4141m(InterfaceC0430v interfaceC0430v) {
        setParentLayoutCoordinates(interfaceC0430v);
        m4140l();
    }

    /* JADX INFO: renamed from: n */
    public final void m4142n() {
        C2016l c2016lM6328getPopupContentSizebOM6tXw;
        C2015k c2015k = this.f7543x;
        if (c2015k == null || (c2016lM6328getPopupContentSizebOM6tXw = m6328getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j5 = c2016lM6328getPopupContentSizebOM6tXw.f6741a;
        C2015k visibleDisplayBounds = getVisibleDisplayBounds();
        long j6 = (((long) (visibleDisplayBounds.f6740d - visibleDisplayBounds.f6738b)) & 4294967295L) | (((long) (visibleDisplayBounds.f6739c - visibleDisplayBounds.f6737a)) << 32);
        C1674s c1674s = new C1674s();
        c1674s.f5708d = 0L;
        this.f7526A.m3867c(this, C2287c.f7454k, new C2309y(c1674s, this, c2015k, j6, j5));
        long j7 = c1674s.f5708d;
        WindowManager.LayoutParams layoutParams = this.f7538s;
        layoutParams.x = (int) (j7 >> 32);
        layoutParams.y = (int) (j7 & 4294967295L);
        boolean z5 = this.f7532m.f7439e;
        C2281B c2281b = this.f7536q;
        if (z5) {
            c2281b.mo4121a(this, (int) (j6 >> 32), (int) (j6 & 4294967295L));
        }
        c2281b.getClass();
        this.f7537r.updateViewLayout(this, layoutParams);
    }

    @Override // p047I0.AbstractC0713b, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7526A.m3868d();
        if (!this.f7532m.f7437c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f7527B == null) {
            this.f7527B = new C0449n(1, this.f7531l);
        }
        AbstractC2302r.m4131c(this, this.f7527B);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2088t c2088t = this.f7526A;
        C1836x c1836x = c2088t.f7003h;
        if (c1836x != null) {
            c1836x.m3299a();
        }
        c2088t.m3865a();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC2302r.m4132d(this, this.f7527B);
        }
        this.f7527B = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f7532m.f7438d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC1599a interfaceC1599a = this.f7531l;
            if (interfaceC1599a != null) {
                interfaceC1599a.mo6a();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            InterfaceC1599a interfaceC1599a2 = this.f7531l;
            if (interfaceC1599a2 != null) {
                interfaceC1599a2.mo6a();
            }
        }
        return true;
    }

    public final void setParentLayoutDirection(EnumC2017m enumC2017m) {
        this.f7540u = enumC2017m;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m6329setPopupContentSizefhxjrPA(C2016l c2016l) {
        this.f7541v.setValue(c2016l);
    }

    public final void setPositionProvider(InterfaceC2282C interfaceC2282C) {
        this.f7539t = interfaceC2282C;
    }

    public final void setTestTag(String str) {
        this.f7533n = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public AbstractC0713b getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i5) {
    }
}
