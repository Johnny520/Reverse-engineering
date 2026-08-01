package p170h1;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1926h;
import java.util.LinkedHashMap;
import me.dartcv.nuke.R;
import p000A.C0001A0;
import p001A0.AbstractC0107g;
import p001A0.C0105e;
import p002A1.AbstractC0116E;
import p002A1.InterfaceC0145r;
import p007B0.C0171D;
import p007B0.C0172E;
import p007B0.C0174G;
import p007B0.C0175H;
import p007B0.C0183P;
import p023E0.AbstractC0277a;
import p028F.RunnableC0342c;
import p029F0.AbstractC0435z;
import p041H0.C0564I;
import p041H0.C0617s;
import p041H0.C0618s0;
import p041H0.InterfaceC0614q0;
import p041H0.InterfaceC0616r0;
import p047I0.AbstractC0736i1;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p048I1.InterfaceC0782g;
import p061L2.AbstractC0972l;
import p077P0.AbstractC1126m;
import p095T.C1379p;
import p095T.InterfaceC1363h;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p128a.AbstractC1785a;
import p153e1.InterfaceC2007c;
import p158f0.C2087s;
import p158f0.C2088t;
import p160f3.AbstractC2162v;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p179i4.AbstractC2352g;
import p186k.C2444z;
import p191k4.C2475a;
import p193l0.AbstractC2485h;
import p205n1.C2688b;
import p211o0.AbstractC2767z;
import p229r1.AbstractC3087q;
import p229r1.AbstractC3092v;
import p229r1.C3064Z;
import p229r1.C3070c0;
import p229r1.InterfaceC3081k;

/* JADX INFO: renamed from: h1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2218i extends ViewGroup implements InterfaceC1363h, InterfaceC0616r0, InterfaceC3081k {

    /* JADX INFO: renamed from: A */
    public final C2475a f7228A;

    /* JADX INFO: renamed from: B */
    public boolean f7229B;

    /* JADX INFO: renamed from: C */
    public final C0564I f7230C;

    /* JADX INFO: renamed from: d */
    public final C0105e f7231d;

    /* JADX INFO: renamed from: e */
    public final View f7232e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0614q0 f7233f;

    /* JADX INFO: renamed from: g */
    public InterfaceC1599a f7234g;

    /* JADX INFO: renamed from: h */
    public boolean f7235h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1599a f7236i;

    /* JADX INFO: renamed from: j */
    public InterfaceC1599a f7237j;

    /* JADX INFO: renamed from: k */
    public InterfaceC2207p f7238k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1601c f7239l;

    /* JADX INFO: renamed from: m */
    public InterfaceC2007c f7240m;

    /* JADX INFO: renamed from: n */
    public InterfaceC1601c f7241n;

    /* JADX INFO: renamed from: o */
    public InterfaceC0145r f7242o;

    /* JADX INFO: renamed from: p */
    public InterfaceC0782g f7243p;

    /* JADX INFO: renamed from: q */
    public final int[] f7244q;

    /* JADX INFO: renamed from: r */
    public long f7245r;

    /* JADX INFO: renamed from: s */
    public C3070c0 f7246s;

    /* JADX INFO: renamed from: t */
    public InterfaceC1601c f7247t;

    /* JADX INFO: renamed from: u */
    public final C2217h f7248u;

    /* JADX INFO: renamed from: v */
    public final C2217h f7249v;

    /* JADX INFO: renamed from: w */
    public InterfaceC1601c f7250w;

    /* JADX INFO: renamed from: x */
    public final int[] f7251x;

    /* JADX INFO: renamed from: y */
    public int f7252y;

    /* JADX INFO: renamed from: z */
    public int f7253z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2218i(Context context, C1379p c1379p, int i5, C0105e c0105e, View view, InterfaceC0614q0 interfaceC0614q0) {
        super(context);
        this.f7231d = c0105e;
        this.f7232e = view;
        this.f7233f = interfaceC0614q0;
        LinkedHashMap linkedHashMap = AbstractC0736i1.f2314a;
        setTag(R.id.androidx_compose_ui_view_composition_context, c1379p);
        int i6 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        C2233x c2233x = (C2233x) this;
        AbstractC3092v.m5409c(this, new C2210a(c2233x, i6));
        AbstractC3087q.m5400b(this, this);
        this.f7234g = C2216g.f7224h;
        this.f7236i = C2216g.f7223g;
        this.f7237j = C2216g.f7222f;
        this.f7238k = C2204m.f7185a;
        this.f7240m = AbstractC1785a.m3241a();
        int i7 = 2;
        this.f7244q = new int[2];
        this.f7245r = 0L;
        int i8 = 1;
        this.f7248u = new C2217h(c2233x, i8);
        this.f7249v = new C2217h(c2233x, i6);
        this.f7251x = new int[2];
        this.f7252y = Integer.MIN_VALUE;
        this.f7253z = Integer.MIN_VALUE;
        this.f7228A = new C2475a(12);
        C0564I c0564i = new C0564I(3);
        c0564i.f1726s = c2233x;
        InterfaceC2207p interfaceC2207pM2162a = AbstractC1126m.m2162a(AbstractC0107g.m142a(c0105e), true, C2211b.f7206h);
        C0174G c0174g = new C0174G();
        c0174g.f616a = new C0175H(c2233x, i6);
        C0001A0 c0001a0 = new C0001A0();
        C0001A0 c0001a02 = c0174g.f617b;
        if (c0001a02 != null) {
            c0001a02.f10e = null;
        }
        c0174g.f617b = c0001a0;
        c0001a0.f10e = c0174g;
        setOnRequestDisallowInterceptTouchEvent$ui(c0001a0);
        InterfaceC2207p interfaceC2207pMo4021c = AbstractC0435z.m696i(AbstractC2485h.m4429c(interfaceC2207pM2162a.mo4021c(c0174g), new C2214e(c2233x, c0564i, c2233x)), new C2212c(c2233x, c0564i, i7)).mo4021c(new C2223n(new C0175H(c2233x, i7)));
        c0564i.m821d0(this.f7238k.mo4021c(interfaceC2207pMo4021c));
        this.f7239l = new C0171D(8, c0564i, interfaceC2207pMo4021c);
        c0564i.m815Z(this.f7240m);
        this.f7241n = new C0172E(16, c0564i);
        c0564i.f1706Q = new C2212c(c2233x, c0564i, i6);
        c0564i.f1707R = new C0175H(c2233x, i8);
        c0564i.m819c0(new C2213d(c2233x, c0564i));
        this.f7230C = c0564i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m4026e(C2233x c2233x, int i5, int i6, int i7) {
        return (i7 >= 0 || i5 == i6) ? View.MeasureSpec.makeMeasureSpec(AbstractC1926h.m3568k(i7, i5, i6), 1073741824) : (i7 != -2 || i6 == Integer.MAX_VALUE) ? (i7 != -1 || i6 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C2688b m4027f(C2688b c2688b, int i5, int i6, int i7, int i8) {
        int i9 = c2688b.f8572a - i5;
        if (i9 < 0) {
            i9 = 0;
        }
        int i10 = c2688b.f8573b - i6;
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = c2688b.f8574c - i7;
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = c2688b.f8575d - i8;
        return C2688b.m4667b(i9, i10, i11, i12 >= 0 ? i12 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final C0618s0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC0277a.m483b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC0772y) this.f7233f).getSnapshotObserver();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0616r0
    /* JADX INFO: renamed from: H */
    public final boolean mo800H() {
        return isAttachedToWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229r1.InterfaceC3081k
    /* JADX INFO: renamed from: a */
    public final C3070c0 mo680a(View view, C3070c0 c3070c0) {
        this.f7246s = new C3070c0(c3070c0);
        return m4028g(c3070c0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1363h
    /* JADX INFO: renamed from: b */
    public final void mo618b() {
        this.f7237j.mo6a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1363h
    /* JADX INFO: renamed from: c */
    public final void mo619c() {
        this.f7236i.mo6a();
        removeAllViewsInLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final C3070c0 m4028g(C3070c0 c3070c0) {
        C3064Z c3064z = c3070c0.f9782a;
        C2688b c2688bMo5367i = c3064z.mo5367i(-1);
        C2688b c2688b = C2688b.f8571e;
        if (!c2688bMo5367i.equals(c2688b) || !c3064z.mo5368j(-9).equals(c2688b) || c3064z.mo5385h() != null) {
            C0617s c0617s = this.f7230C.f1699J.f1893c;
            if (c0617s.f1970U.f7199q) {
                long jM3457Q = AbstractC1923e.m3457Q(c0617s.mo638R(0L));
                int i5 = (int) (jM3457Q >> 32);
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = (int) (jM3457Q & 4294967295L);
                if (i6 < 0) {
                    i6 = 0;
                }
                long jMo637Q = AbstractC0435z.m693f(c0617s).mo637Q();
                int i7 = (int) (jMo637Q >> 32);
                int i8 = (int) (jMo637Q & 4294967295L);
                long j5 = c0617s.f1208f;
                long jM3457Q2 = AbstractC1923e.m3457Q(c0617s.mo638R((((long) Float.floatToRawIntBits((int) (j5 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j5 & 4294967295L))) & 4294967295L)));
                int i9 = i7 - ((int) (jM3457Q2 >> 32));
                if (i9 < 0) {
                    i9 = 0;
                }
                int i10 = i8 - ((int) (4294967295L & jM3457Q2));
                int i11 = i10 >= 0 ? i10 : 0;
                if (i5 != 0 || i6 != 0 || i9 != 0 || i11 != 0) {
                    return c3070c0.f9782a.mo5372r(i5, i6, i9, i11);
                }
            }
        }
        return c3070c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f7251x;
        getLocationInWindow(iArr);
        int i5 = iArr[0];
        region.op(i5, iArr[1], getWidth() + i5, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC2007c getDensity() {
        return this.f7240m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View getInteropView() {
        return this.f7232e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0564I getLayoutNode() {
        return this.f7230C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f7232e.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0145r getLifecycleOwner() {
        return this.f7242o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC2207p getModifier() {
        return this.f7238k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        this.f7228A.getClass();
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1601c getOnDensityChanged$ui() {
        return this.f7241n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1601c getOnModifierChanged$ui() {
        return this.f7239l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1601c getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f7250w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1599a getRelease() {
        return this.f7237j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1599a getReset() {
        return this.f7236i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0782g getSavedStateRegistryOwner() {
        return this.f7243p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1599a getUpdate() {
        return this.f7234g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View getView() {
        return this.f7232e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f7229B) {
            this.f7230C.m794B();
            return null;
        }
        this.f7232e.postOnAnimation(new RunnableC0342c(this.f7249v, 3));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f7232e.isNestedScrollingEnabled();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7248u.mo6a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f7229B) {
            this.f7230C.m794B();
        } else {
            this.f7232e.postOnAnimation(new RunnableC0342c(this.f7249v, 3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        int i5;
        int i6;
        super.onDetachedFromWindow();
        C2088t c2088t = getSnapshotObserver().f1972a;
        synchronized (c2088t.f7002g) {
            try {
                C1483e c1483e = c2088t.f7001f;
                int i7 = c1483e.f5183f;
                int i8 = 0;
                int i9 = 0;
                while (i8 < i7) {
                    C2087s c2087s = (C2087s) c1483e.f5181d[i8];
                    C2444z c2444z = (C2444z) c2087s.f6988f.m4276k(this);
                    if (c2444z == null) {
                        i5 = i8;
                    } else {
                        Object[] objArr = c2444z.f7899b;
                        int[] iArr = c2444z.f7900c;
                        long[] jArr = c2444z.f7898a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j5 = jArr[i10];
                                i5 = i8;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i11 = 8;
                                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                                    int i13 = 0;
                                    while (i13 < i12) {
                                        if ((j5 & 255) < 128) {
                                            int i14 = (i10 << 3) + i13;
                                            i6 = i11;
                                            Object obj = objArr[i14];
                                            int i15 = iArr[i14];
                                            c2087s.m3863c(this, obj);
                                        } else {
                                            i6 = i11;
                                        }
                                        j5 >>= i6;
                                        i13++;
                                        i11 = i6;
                                    }
                                    if (i12 != i11) {
                                        break;
                                    }
                                    if (i10 == length) {
                                        break;
                                    }
                                    i10++;
                                    i8 = i5;
                                }
                            }
                        }
                    }
                    if (!c2087s.f6988f.m4275j()) {
                        i9++;
                    } else if (i9 > 0) {
                        Object[] objArr2 = c1483e.f5181d;
                        objArr2[i5 - i9] = objArr2[i5];
                    }
                    i8 = i5 + 1;
                }
                int i16 = i7 - i9;
                AbstractC0972l.m1998V(c1483e.f5181d, i16, i7);
                c1483e.f5183f = i16;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        this.f7232e.layout(0, 0, i7 - i5, i8 - i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        View view = this.f7232e;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i5), View.MeasureSpec.getSize(i6));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i5, i6);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f7252y = i5;
        this.f7253z = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f5, boolean z5) {
        if (!this.f7232e.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC2162v.m3994p(this.f7231d.m139c(), null, new C2215f(z5, this, AbstractC2352g.m4190c(f2 * (-1.0f), f5 * (-1.0f)), null), 3);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f5) {
        if (!this.f7232e.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC2162v.m3994p(this.f7231d.m139c(), null, new C0183P(this, AbstractC2352g.m4190c(f2 * (-1.0f), f5 * (-1.0f)), null, 2), 3);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i5) {
        super.onWindowVisibilityChanged(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        InterfaceC1601c interfaceC1601c = this.f7247t;
        if (interfaceC1601c == null) {
            return true;
        }
        interfaceC1601c.mo1h(rect != null ? AbstractC2767z.m4954y(rect) : null);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        InterfaceC1601c interfaceC1601c = this.f7250w;
        if (interfaceC1601c != null) {
            interfaceC1601c.mo1h(Boolean.valueOf(z5));
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setDensity(InterfaceC2007c interfaceC2007c) {
        if (interfaceC2007c != this.f7240m) {
            this.f7240m = interfaceC2007c;
            InterfaceC1601c interfaceC1601c = this.f7241n;
            if (interfaceC1601c != null) {
                interfaceC1601c.mo1h(interfaceC2007c);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setLifecycleOwner(InterfaceC0145r interfaceC0145r) {
        if (interfaceC0145r != this.f7242o) {
            this.f7242o = interfaceC0145r;
            AbstractC0116E.m165g(this, interfaceC0145r);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setModifier(InterfaceC2207p interfaceC2207p) {
        if (interfaceC2207p != this.f7238k) {
            this.f7238k = interfaceC2207p;
            InterfaceC1601c interfaceC1601c = this.f7239l;
            if (interfaceC1601c != null) {
                interfaceC1601c.mo1h(interfaceC2207p);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnDensityChanged$ui(InterfaceC1601c interfaceC1601c) {
        this.f7241n = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnModifierChanged$ui(InterfaceC1601c interfaceC1601c) {
        this.f7239l = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnRequestDisallowInterceptTouchEvent$ui(InterfaceC1601c interfaceC1601c) {
        this.f7250w = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setRelease(InterfaceC1599a interfaceC1599a) {
        this.f7237j = interfaceC1599a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setReset(InterfaceC1599a interfaceC1599a) {
        this.f7236i = interfaceC1599a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSavedStateRegistryOwner(InterfaceC0782g interfaceC0782g) {
        if (interfaceC0782g != this.f7243p) {
            this.f7243p = interfaceC0782g;
            setTag(R.id.view_tree_saved_state_registry_owner, interfaceC0782g);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUpdate(InterfaceC1599a interfaceC1599a) {
        this.f7234g = interfaceC1599a;
        this.f7235h = true;
        this.f7248u.mo6a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
