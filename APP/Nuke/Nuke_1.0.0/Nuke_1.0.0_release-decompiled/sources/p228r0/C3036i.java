package p228r0;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import p007B0.C0172E;
import p153e1.C2016l;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p211o0.AbstractC2744c;
import p211o0.AbstractC2767z;
import p211o0.C2743b;
import p211o0.C2753l;
import p211o0.C2757p;
import p211o0.C2761t;
import p211o0.C2762u;
import p211o0.InterfaceC2760s;
import p222q0.C2901b;
import p233s0.AbstractC3167a;

/* JADX INFO: renamed from: r0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3036i implements InterfaceC3031d {

    /* JADX INFO: renamed from: B */
    public static final C3035h f9684B = new C3035h();

    /* JADX INFO: renamed from: A */
    public C2757p f9685A;

    /* JADX INFO: renamed from: b */
    public final AbstractC3167a f9686b;

    /* JADX INFO: renamed from: c */
    public final C2761t f9687c;

    /* JADX INFO: renamed from: d */
    public final C3039l f9688d;

    /* JADX INFO: renamed from: e */
    public final Resources f9689e;

    /* JADX INFO: renamed from: f */
    public final Rect f9690f;

    /* JADX INFO: renamed from: g */
    public Paint f9691g;

    /* JADX INFO: renamed from: h */
    public int f9692h;

    /* JADX INFO: renamed from: i */
    public int f9693i;

    /* JADX INFO: renamed from: j */
    public long f9694j;

    /* JADX INFO: renamed from: k */
    public boolean f9695k;

    /* JADX INFO: renamed from: l */
    public boolean f9696l;

    /* JADX INFO: renamed from: m */
    public boolean f9697m;

    /* JADX INFO: renamed from: n */
    public int f9698n;

    /* JADX INFO: renamed from: o */
    public int f9699o;

    /* JADX INFO: renamed from: p */
    public float f9700p;

    /* JADX INFO: renamed from: q */
    public boolean f9701q;

    /* JADX INFO: renamed from: r */
    public float f9702r;

    /* JADX INFO: renamed from: s */
    public float f9703s;

    /* JADX INFO: renamed from: t */
    public float f9704t;

    /* JADX INFO: renamed from: u */
    public float f9705u;

    /* JADX INFO: renamed from: v */
    public long f9706v;

    /* JADX INFO: renamed from: w */
    public long f9707w;

    /* JADX INFO: renamed from: x */
    public float f9708x;

    /* JADX INFO: renamed from: y */
    public float f9709y;

    /* JADX INFO: renamed from: z */
    public float f9710z;

    public C3036i(AbstractC3167a abstractC3167a) {
        C2761t c2761t = new C2761t();
        C2901b c2901b = new C2901b();
        this.f9686b = abstractC3167a;
        this.f9687c = c2761t;
        C3039l c3039l = new C3039l(abstractC3167a, c2761t, c2901b);
        this.f9688d = c3039l;
        this.f9689e = abstractC3167a.getResources();
        this.f9690f = new Rect();
        abstractC3167a.addView(c3039l);
        c3039l.setClipBounds(null);
        this.f9694j = 0L;
        View.generateViewId();
        this.f9698n = 3;
        this.f9699o = 0;
        this.f9700p = 1.0f;
        this.f9702r = 1.0f;
        this.f9703s = 1.0f;
        long j5 = C2762u.f8757b;
        this.f9706v = j5;
        this.f9707w = j5;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: A */
    public final Matrix mo5231A() {
        return this.f9688d.getMatrix();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: B */
    public final void mo5232B(InterfaceC2007c interfaceC2007c, EnumC2017m enumC2017m, C3029b c3029b, C0172E c0172e) {
        C3039l c3039l = this.f9688d;
        ViewParent parent = c3039l.getParent();
        AbstractC3167a abstractC3167a = this.f9686b;
        if (parent == null) {
            abstractC3167a.addView(c3039l);
        }
        c3039l.f9718j = interfaceC2007c;
        c3039l.f9719k = enumC2017m;
        c3039l.f9720l = c0172e;
        c3039l.f9721m = c3029b;
        if (c3039l.isAttachedToWindow()) {
            c3039l.setVisibility(4);
            c3039l.setVisibility(0);
            try {
                C2761t c2761t = this.f9687c;
                C3035h c3035h = f9684B;
                C2743b c2743b = c2761t.f8756a;
                Canvas canvas = c2743b.f8723a;
                c2743b.f8723a = c3035h;
                abstractC3167a.m5431a(c2743b, c3039l, c3039l.getDrawingTime());
                c2761t.f8756a.f8723a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: C */
    public final void mo5233C(int i5, int i6, long j5) {
        boolean zM3704a = C2016l.m3704a(this.f9694j, j5);
        C3039l c3039l = this.f9688d;
        if (zM3704a) {
            int i7 = this.f9692h;
            if (i7 != i5) {
                c3039l.offsetLeftAndRight(i5 - i7);
            }
            int i8 = this.f9693i;
            if (i8 != i6) {
                c3039l.offsetTopAndBottom(i6 - i8);
            }
        } else {
            if (this.f9697m || c3039l.getClipToOutline()) {
                this.f9695k = true;
            }
            int i9 = (int) (j5 >> 32);
            int i10 = (int) (4294967295L & j5);
            c3039l.layout(i5, i6, i5 + i9, i6 + i10);
            this.f9694j = j5;
            if (this.f9701q) {
                c3039l.setPivotX(i9 / 2.0f);
                c3039l.setPivotY(i10 / 2.0f);
            }
        }
        this.f9692h = i5;
        this.f9693i = i6;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: D */
    public final float mo5234D() {
        return this.f9709y;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: E */
    public final void mo5235E(C2757p c2757p) {
        this.f9685A = c2757p;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f9688d.setRenderEffect(c2757p != null ? c2757p.m4917a() : null);
        }
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: F */
    public final void mo5236F(float f2) {
        this.f9688d.setCameraDistance(f2 * this.f9689e.getDisplayMetrics().densityDpi);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: G */
    public final float mo5237G() {
        return this.f9705u;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: I */
    public final void mo5239I(InterfaceC2760s interfaceC2760s) {
        Rect rect;
        boolean z5 = this.f9695k;
        C3039l c3039l = this.f9688d;
        if (z5) {
            if ((this.f9697m || c3039l.getClipToOutline()) && !this.f9696l) {
                rect = this.f9690f;
                rect.left = 0;
                rect.top = 0;
                rect.right = c3039l.getWidth();
                rect.bottom = c3039l.getHeight();
            } else {
                rect = null;
            }
            c3039l.setClipBounds(rect);
        }
        if (AbstractC2744c.m4858a(interfaceC2760s).isHardwareAccelerated()) {
            this.f9686b.m5431a(interfaceC2760s, c3039l, c3039l.getDrawingTime());
        }
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: J */
    public final float mo5240J() {
        return this.f9703s;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: K */
    public final void mo5241K(float f2) {
        this.f9708x = f2;
        this.f9688d.setRotationX(f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: L */
    public final float mo5242L() {
        return this.f9710z;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: M */
    public final int mo5243M() {
        return this.f9698n;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: N */
    public final void mo5244N(long j5) {
        long j6 = 9223372034707292159L & j5;
        C3039l c3039l = this.f9688d;
        if (j6 != 9205357640488583168L) {
            this.f9701q = false;
            c3039l.setPivotX(Float.intBitsToFloat((int) (j5 >> 32)));
            c3039l.setPivotY(Float.intBitsToFloat((int) (j5 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                c3039l.resetPivot();
                return;
            }
            this.f9701q = true;
            c3039l.setPivotX(((int) (this.f9694j >> 32)) / 2.0f);
            c3039l.setPivotY(((int) (this.f9694j & 4294967295L)) / 2.0f);
        }
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: O */
    public final long mo5245O() {
        return this.f9706v;
    }

    /* JADX INFO: renamed from: P */
    public final void m5302P(int i5) {
        C3039l c3039l = this.f9688d;
        boolean z5 = true;
        if (i5 == 1) {
            c3039l.setLayerType(2, this.f9691g);
        } else if (i5 == 2) {
            c3039l.setLayerType(0, this.f9691g);
            z5 = false;
        } else {
            c3039l.setLayerType(0, this.f9691g);
        }
        c3039l.setCanUseCompositingLayer$ui_graphics(z5);
    }

    /* JADX INFO: renamed from: Q */
    public final void m5303Q() {
        int i5 = this.f9699o;
        if (i5 != 1 && this.f9698n == 3) {
            m5302P(i5);
        } else {
            m5302P(1);
        }
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: a */
    public final float mo5246a() {
        return this.f9700p;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: b */
    public final void mo5247b(float f2) {
        this.f9709y = f2;
        this.f9688d.setRotationY(f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: c */
    public final void mo5248c(float f2) {
        this.f9700p = f2;
        this.f9688d.setAlpha(f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: d */
    public final float mo5249d() {
        return this.f9702r;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: e */
    public final void mo5250e(float f2) {
        this.f9705u = f2;
        this.f9688d.setElevation(f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: f */
    public final float mo5251f() {
        return this.f9704t;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: g */
    public final C2757p mo5252g() {
        return this.f9685A;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: h */
    public final void mo5253h(float f2) {
        this.f9710z = f2;
        this.f9688d.setRotation(f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: i */
    public final void mo5254i(float f2) {
        this.f9704t = f2;
        this.f9688d.setTranslationY(f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: j */
    public final long mo5255j() {
        return this.f9707w;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: k */
    public final void mo5256k(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9706v = j5;
            this.f9688d.setOutlineAmbientShadowColor(AbstractC2767z.m4952w(j5));
        }
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: l */
    public final void mo5257l(Outline outline, long j5) {
        C3039l c3039l = this.f9688d;
        c3039l.f9716h = outline;
        c3039l.invalidateOutline();
        if ((this.f9697m || c3039l.getClipToOutline()) && outline != null) {
            c3039l.setClipToOutline(true);
            if (this.f9697m) {
                this.f9697m = false;
                this.f9695k = true;
            }
        }
        this.f9696l = outline != null;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: m */
    public final void mo5258m() {
        Paint paint = this.f9691g;
        if (paint == null) {
            paint = new Paint();
            this.f9691g = paint;
        }
        paint.setColorFilter(null);
        m5303Q();
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: n */
    public final void mo5259n(float f2) {
        this.f9702r = f2;
        this.f9688d.setScaleX(f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: o */
    public final void mo5260o(int i5) {
        this.f9698n = i5;
        Paint paint = this.f9691g;
        if (paint == null) {
            paint = new Paint();
            this.f9691g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC2767z.m4928A(i5)));
        m5303Q();
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: p */
    public final float mo5261p() {
        return this.f9688d.getCameraDistance() / this.f9689e.getDisplayMetrics().densityDpi;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: q */
    public final void mo5262q() {
        this.f9686b.removeViewInLayout(this.f9688d);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: r */
    public final float mo5263r() {
        return 0.0f;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: s */
    public final void mo5264s() {
        this.f9688d.setTranslationX(0.0f);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: t */
    public final void mo5265t(boolean z5) {
        boolean z6 = false;
        this.f9697m = z5 && !this.f9696l;
        this.f9695k = true;
        if (z5 && this.f9696l) {
            z6 = true;
        }
        this.f9688d.setClipToOutline(z6);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: u */
    public final int mo5266u() {
        return this.f9699o;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: v */
    public final float mo5267v() {
        return this.f9708x;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: w */
    public final C2753l mo5268w() {
        return null;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: x */
    public final void mo5269x(int i5) {
        this.f9699o = i5;
        m5303Q();
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: y */
    public final void mo5270y(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9707w = j5;
            this.f9688d.setOutlineSpotShadowColor(AbstractC2767z.m4952w(j5));
        }
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: z */
    public final void mo5271z(float f2) {
        this.f9703s = f2;
        this.f9688d.setScaleY(f2);
    }
}
