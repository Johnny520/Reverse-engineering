package p340x2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.InterfaceC0112q;
import java.util.Arrays;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p015b0.RunnableC0133c;
import p016b1.C0166f;
import p016b1.C0167g;
import p018b3.C0171a;
import p028c1.AbstractC0378h;
import p057e1.C0808c;
import p069f.C0925b0;
import p069f.C0943k0;
import p071f1.C1021p;
import p072f2.C1039b;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p091g3.AbstractC1321m;
import p091g3.AbstractC1329q;
import p091g3.C1324n0;
import p091g3.C1332r0;
import p091g3.InterfaceC1305e;
import p099h.Hchat.R;
import p100h0.C1531k0;
import p117i0.C1815c;
import p117i0.C1828f0;
import p117i0.InterfaceC1835h;
import p129ig.AbstractC2043a;
import p131j0.C2046b;
import p249qg.AbstractC3603v;
import p253r1.AbstractC3649f;
import p253r1.C3647d;
import p259r9.AbstractC3754e0;
import p267s1.C3884a0;
import p267s1.C3886b0;
import p292u1.AbstractC4229a;
import p293u2.InterfaceC4233c;
import p294u3.InterfaceC4250c;
import p308v1.AbstractC4434w;
import p322w0.C4667r;
import p322w0.C4668s;
import p339x1.C5602f0;
import p339x1.C5639r;
import p339x1.C5647t1;
import p339x1.InterfaceC5641r1;
import p339x1.InterfaceC5644s1;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5945v2;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: x2.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5673h extends ViewGroup implements InterfaceC1835h, InterfaceC5644s1, InterfaceC1305e {

    /* JADX INFO: renamed from: A */
    public final int[] f23079A;

    /* JADX INFO: renamed from: B */
    public int f23080B;

    /* JADX INFO: renamed from: C */
    public int f23081C;

    /* JADX INFO: renamed from: D */
    public final C0014a f23082D;

    /* JADX INFO: renamed from: E */
    public boolean f23083E;

    /* JADX INFO: renamed from: F */
    public final C5602f0 f23084F;

    /* JADX INFO: renamed from: g */
    public final C3647d f23085g;

    /* JADX INFO: renamed from: h */
    public final View f23086h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5641r1 f23087i;

    /* JADX INFO: renamed from: j */
    public InterfaceC1220a f23088j;

    /* JADX INFO: renamed from: k */
    public boolean f23089k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1220a f23090l;

    /* JADX INFO: renamed from: m */
    public InterfaceC1220a f23091m;

    /* JADX INFO: renamed from: n */
    public InterfaceC5853o f23092n;

    /* JADX INFO: renamed from: o */
    public InterfaceC1231l f23093o;

    /* JADX INFO: renamed from: p */
    public InterfaceC4233c f23094p;

    /* JADX INFO: renamed from: q */
    public InterfaceC1231l f23095q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0112q f23096r;

    /* JADX INFO: renamed from: s */
    public InterfaceC4250c f23097s;

    /* JADX INFO: renamed from: t */
    public final int[] f23098t;

    /* JADX INFO: renamed from: u */
    public long f23099u;

    /* JADX INFO: renamed from: v */
    public C1332r0 f23100v;

    /* JADX INFO: renamed from: w */
    public InterfaceC1231l f23101w;

    /* JADX INFO: renamed from: x */
    public final C5672g f23102x;

    /* JADX INFO: renamed from: y */
    public final C5672g f23103y;

    /* JADX INFO: renamed from: z */
    public InterfaceC1231l f23104z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC5673h(Context context, C1828f0 c1828f0, int i9, C3647d c3647d, View view, InterfaceC5641r1 interfaceC5641r1) {
        super(context);
        this.f23085g = c3647d;
        this.f23086h = view;
        this.f23087i = interfaceC5641r1;
        C0943k0 c0943k0 = AbstractC5945v2.f24167a;
        setTag(R.id.androidx_compose_ui_view_composition_context, c1828f0);
        int i10 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        C5687v c5687v = (C5687v) this;
        AbstractC1329q.m3555b(this, new C5666a(c5687v, i10));
        AbstractC1321m.m3524b(this, this);
        this.f23088j = C5671f.f23075j;
        this.f23090l = C5671f.f23074i;
        this.f23091m = C5671f.f23073h;
        C5850l c5850l = C5850l.f23787a;
        this.f23092n = c5850l;
        this.f23094p = AbstractC1184v0.m3191a();
        int i11 = 2;
        this.f23098t = new int[2];
        this.f23099u = 0L;
        this.f23102x = new C5672g(c5687v, 1);
        this.f23103y = new C5672g(c5687v, i10);
        this.f23079A = new int[2];
        this.f23080B = Integer.MIN_VALUE;
        this.f23081C = Integer.MIN_VALUE;
        this.f23082D = new C0014a(13);
        C5602f0 c5602f0 = new C5602f0(3);
        c5602f0.f22804u = c5687v;
        InterfaceC5853o interfaceC5853oMo10549d = AbstractC3649f.m7631a(c5850l, AbstractC5674i.f23105a, c3647d).mo10549d(new C1039b(true, C5667b.f23061j));
        C3884a0 c3884a0 = new C3884a0();
        c3884a0.f12741a = new C3886b0(c5687v, 0);
        C1815c c1815c = new C1815c();
        C1815c c1815c2 = c3884a0.f12742b;
        if (c1815c2 != null) {
            c1815c2.f6035h = null;
        }
        c3884a0.f12742b = c1815c;
        c1815c.f6035h = c3884a0;
        setOnRequestDisallowInterceptTouchEvent$ui(c1815c);
        InterfaceC5853o interfaceC5853oMo10549d2 = AbstractC4434w.m8889m(AbstractC0378h.m1339d(interfaceC5853oMo10549d.mo10549d(c3884a0), new C0167g(c5687v, c5602f0, c5687v, 6)), new C5668c(c5687v, c5602f0, i11)).mo10549d(new C5678m(new C3886b0(c5687v, 2)));
        c5602f0.m10031d0(this.f23092n.mo10549d(interfaceC5853oMo10549d2));
        this.f23093o = new C1021p(c5602f0, 5, interfaceC5853oMo10549d2);
        c5602f0.m10025Z(this.f23094p);
        this.f23095q = new C0166f(c5602f0, 18);
        c5602f0.f22785S = new C5668c(c5687v, c5602f0, i10);
        c5602f0.f22786T = new C3886b0(c5687v, 1);
        c5602f0.m10029c0(new C5669d(c5687v, c5602f0));
        this.f23084F = c5602f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m10231e(C5687v c5687v, int i9, int i10, int i11) {
        return (i11 >= 0 || i9 == i10) ? View.MeasureSpec.makeMeasureSpec(AbstractC3754e0.m7909r(i11, i9, i10), 1073741824) : (i11 != -2 || i10 == Integer.MAX_VALUE) ? (i11 != -1 || i10 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C0171a m10232f(C0171a c0171a, int i9, int i10, int i11, int i12) {
        int i13 = c0171a.f445a - i9;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = c0171a.f446b - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = c0171a.f447c - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = c0171a.f448d - i12;
        return C0171a.m766b(i13, i14, i15, i16 >= 0 ? i16 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final C5647t1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC4229a.m8494b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC5934t) this.f23087i).getSnapshotObserver();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5644s1
    /* JADX INFO: renamed from: L */
    public final boolean mo9975L() {
        return isAttachedToWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1835h
    /* JADX INFO: renamed from: a */
    public final void mo4496a() {
        this.f23091m.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1835h
    /* JADX INFO: renamed from: b */
    public final void mo4497b() {
        this.f23090l.invoke();
        removeAllViewsInLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091g3.InterfaceC1305e
    /* JADX INFO: renamed from: c */
    public final C1332r0 mo3460c(View view, C1332r0 c1332r0) {
        this.f23100v = new C1332r0(c1332r0);
        return m10233g(c1332r0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final C1332r0 m10233g(C1332r0 c1332r0) {
        C1324n0 c1324n0 = c1332r0.f4398a;
        C0171a c0171aMo3501g = c1324n0.mo3501g(-1);
        C0171a c0171a = C0171a.f444e;
        if (!c0171aMo3501g.equals(c0171a) || !c1324n0.mo3502h(-9).equals(c0171a) || c1324n0.mo3518f() != null) {
            C5639r c5639r = this.f23084F.f22778L.f22716c;
            if (c5639r.f22950Y.f23801t) {
                long jM5017W = AbstractC2043a.m5017W(c5639r.mo8868m0(0L));
                int i9 = (int) (jM5017W >> 32);
                if (i9 < 0) {
                    i9 = 0;
                }
                int i10 = (int) (jM5017W & 4294967295L);
                if (i10 < 0) {
                    i10 = 0;
                }
                long jMo8858F = AbstractC4434w.m8884h(c5639r).mo8858F();
                int i11 = (int) (jMo8858F >> 32);
                int i12 = (int) (jMo8858F & 4294967295L);
                long j3 = c5639r.f14595i;
                long jM5017W2 = AbstractC2043a.m5017W(c5639r.mo8868m0((((long) Float.floatToRawIntBits((int) (j3 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L)));
                int i13 = i11 - ((int) (jM5017W2 >> 32));
                if (i13 < 0) {
                    i13 = 0;
                }
                int i14 = i12 - ((int) (4294967295L & jM5017W2));
                int i15 = i14 >= 0 ? i14 : 0;
                if (i9 != 0 || i10 != 0 || i13 != 0 || i15 != 0) {
                    return c1332r0.f4398a.mo3504n(i9, i10, i13, i15);
                }
            }
        }
        return c1332r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f23079A;
        getLocationInWindow(iArr);
        int i9 = iArr[0];
        region.op(i9, iArr[1], getWidth() + i9, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC4233c getDensity() {
        return this.f23094p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View getInteropView() {
        return this.f23086h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C5602f0 getLayoutNode() {
        return this.f23084F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f23086h.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0112q getLifecycleOwner() {
        return this.f23096r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC5853o getModifier() {
        return this.f23092n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        this.f23082D.getClass();
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1231l getOnDensityChanged$ui() {
        return this.f23095q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1231l getOnModifierChanged$ui() {
        return this.f23093o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1231l getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f23104z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1220a getRelease() {
        return this.f23091m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1220a getReset() {
        return this.f23090l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC4250c getSavedStateRegistryOwner() {
        return this.f23097s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1220a getUpdate() {
        return this.f23088j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View getView() {
        return this.f23086h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f23083E) {
            this.f23084F.m10005B();
            return null;
        }
        this.f23086h.postOnAnimation(new RunnableC0133c(this.f23103y, 4));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f23086h.isNestedScrollingEnabled();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f23102x.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f23083E) {
            this.f23084F.m10005B();
        } else {
            this.f23086h.postOnAnimation(new RunnableC0133c(this.f23103y, 4));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        int i9;
        int i10;
        super.onDetachedFromWindow();
        C4668s c4668s = getSnapshotObserver().f23001a;
        synchronized (c4668s.f15542g) {
            try {
                C2046b c2046b = c4668s.f15541f;
                int i11 = c2046b.f6893i;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    Object[] objArr = c2046b.f6891g;
                    if (i12 < i11) {
                        C4667r c4667r = (C4667r) objArr[i12];
                        C0925b0 c0925b0 = (C0925b0) c4667r.f15528f.m2324k(this);
                        if (c0925b0 == null) {
                            i9 = i12;
                        } else {
                            Object[] objArr2 = c0925b0.f2895b;
                            int[] iArr = c0925b0.f2896c;
                            long[] jArr = c0925b0.f2894a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j3 = jArr[i14];
                                    i9 = i12;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8;
                                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                                        int i17 = 0;
                                        while (i17 < i16) {
                                            if ((j3 & 255) < 128) {
                                                int i18 = (i14 << 3) + i17;
                                                i10 = i15;
                                                Object obj = objArr2[i18];
                                                int i19 = iArr[i18];
                                                c4667r.m9158c(this, obj);
                                            } else {
                                                i10 = i15;
                                            }
                                            j3 >>= i10;
                                            i17++;
                                            i15 = i10;
                                        }
                                        if (i16 != i15) {
                                            break;
                                        }
                                        if (i14 == length) {
                                            break;
                                        }
                                        i14++;
                                        i12 = i9;
                                    }
                                }
                            }
                        }
                        if (!c4667r.f15528f.m2323j()) {
                            i13++;
                        } else if (i13 > 0) {
                            Object[] objArr3 = c2046b.f6891g;
                            objArr3[i9 - i13] = objArr3[i9];
                        }
                        i12 = i9 + 1;
                    } else {
                        int i20 = i11 - i13;
                        Arrays.fill(objArr, i20, i11, (Object) null);
                        c2046b.f6893i = i20;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        this.f23086h.layout(0, 0, i11 - i9, i12 - i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        View view = this.f23086h;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i9, i10);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f23080B = i9;
        this.f23081C = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f10, boolean z9) {
        if (!this.f23086h.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC3603v.m7563q(this.f23085g.m7630e(), null, new C5670e(z9, this, AbstractC0000a.m59d(f3 * (-1.0f), f10 * (-1.0f)), null), 3);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        if (!this.f23086h.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC3603v.m7563q(this.f23085g.m7630e(), null, new C1531k0(this, AbstractC0000a.m59d(f3 * (-1.0f), f10 * (-1.0f)), (InterfaceC5557c) null, 3), 3);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i9) {
        super.onWindowVisibilityChanged(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        InterfaceC1231l interfaceC1231l = this.f23101w;
        if (interfaceC1231l == null) {
            return true;
        }
        interfaceC1231l.invoke(rect != null ? new C0808c(rect.left, rect.top, rect.right, rect.bottom) : null);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        InterfaceC1231l interfaceC1231l = this.f23104z;
        if (interfaceC1231l != null) {
            interfaceC1231l.invoke(Boolean.valueOf(z9));
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setDensity(InterfaceC4233c interfaceC4233c) {
        if (interfaceC4233c != this.f23094p) {
            this.f23094p = interfaceC4233c;
            InterfaceC1231l interfaceC1231l = this.f23095q;
            if (interfaceC1231l != null) {
                interfaceC1231l.invoke(interfaceC4233c);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setLifecycleOwner(InterfaceC0112q interfaceC0112q) {
        if (interfaceC0112q != this.f23096r) {
            this.f23096r = interfaceC0112q;
            setTag(R.id.view_tree_lifecycle_owner, interfaceC0112q);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setModifier(InterfaceC5853o interfaceC5853o) {
        if (interfaceC5853o != this.f23092n) {
            this.f23092n = interfaceC5853o;
            InterfaceC1231l interfaceC1231l = this.f23093o;
            if (interfaceC1231l != null) {
                interfaceC1231l.invoke(interfaceC5853o);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnDensityChanged$ui(InterfaceC1231l interfaceC1231l) {
        this.f23095q = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnModifierChanged$ui(InterfaceC1231l interfaceC1231l) {
        this.f23093o = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnRequestDisallowInterceptTouchEvent$ui(InterfaceC1231l interfaceC1231l) {
        this.f23104z = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setRelease(InterfaceC1220a interfaceC1220a) {
        this.f23091m = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setReset(InterfaceC1220a interfaceC1220a) {
        this.f23090l = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSavedStateRegistryOwner(InterfaceC4250c interfaceC4250c) {
        if (interfaceC4250c != this.f23097s) {
            this.f23097s = interfaceC4250c;
            setTag(R.id.view_tree_saved_state_registry_owner, interfaceC4250c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUpdate(InterfaceC1220a interfaceC1220a) {
        this.f23088j = interfaceC1220a;
        this.f23089k = true;
        this.f23102x.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
