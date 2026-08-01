package p228r0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import com.bumptech.glide.AbstractC1925g;
import java.util.concurrent.atomic.AtomicBoolean;
import p000A.C0072l0;
import p007B0.C0172E;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p117X2.AbstractC1665j;
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
import p222q0.C2900a;
import p222q0.C2901b;

/* JADX INFO: renamed from: r0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3032e implements InterfaceC3031d {

    /* JADX INFO: renamed from: B */
    public static final AtomicBoolean f9633B = new AtomicBoolean(true);

    /* JADX INFO: renamed from: A */
    public C2757p f9634A;

    /* JADX INFO: renamed from: b */
    public final C2761t f9635b;

    /* JADX INFO: renamed from: c */
    public final C2901b f9636c;

    /* JADX INFO: renamed from: d */
    public final RenderNode f9637d;

    /* JADX INFO: renamed from: e */
    public long f9638e;

    /* JADX INFO: renamed from: f */
    public Paint f9639f;

    /* JADX INFO: renamed from: g */
    public Matrix f9640g;

    /* JADX INFO: renamed from: h */
    public boolean f9641h;

    /* JADX INFO: renamed from: i */
    public long f9642i;

    /* JADX INFO: renamed from: j */
    public int f9643j;

    /* JADX INFO: renamed from: k */
    public int f9644k;

    /* JADX INFO: renamed from: l */
    public float f9645l;

    /* JADX INFO: renamed from: m */
    public boolean f9646m;

    /* JADX INFO: renamed from: n */
    public float f9647n;

    /* JADX INFO: renamed from: o */
    public float f9648o;

    /* JADX INFO: renamed from: p */
    public float f9649p;

    /* JADX INFO: renamed from: q */
    public float f9650q;

    /* JADX INFO: renamed from: r */
    public long f9651r;

    /* JADX INFO: renamed from: s */
    public long f9652s;

    /* JADX INFO: renamed from: t */
    public float f9653t;

    /* JADX INFO: renamed from: u */
    public float f9654u;

    /* JADX INFO: renamed from: v */
    public float f9655v;

    /* JADX INFO: renamed from: w */
    public float f9656w;

    /* JADX INFO: renamed from: x */
    public boolean f9657x;

    /* JADX INFO: renamed from: y */
    public boolean f9658y;

    /* JADX INFO: renamed from: z */
    public boolean f9659z;

    public C3032e(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, C2761t c2761t, C2901b c2901b) {
        this.f9635b = c2761t;
        this.f9636c = c2901b;
        RenderNode renderNodeCreate = RenderNode.create("Compose", viewTreeObserverOnGlobalLayoutListenerC0772y);
        this.f9637d = renderNodeCreate;
        this.f9638e = 0L;
        this.f9642i = 0L;
        if (f9633B.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                AbstractC3038k.m5307c(renderNodeCreate, AbstractC3038k.m5305a(renderNodeCreate));
                AbstractC3038k.m5308d(renderNodeCreate, AbstractC3038k.m5306b(renderNodeCreate));
            }
            AbstractC3037j.m5304a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        m5273Q(0);
        this.f9643j = 0;
        this.f9644k = 3;
        this.f9645l = 1.0f;
        this.f9647n = 1.0f;
        this.f9648o = 1.0f;
        long j5 = C2762u.f8757b;
        this.f9651r = j5;
        this.f9652s = j5;
        this.f9656w = 8.0f;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: A */
    public final Matrix mo5231A() {
        Matrix matrix = this.f9640g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f9640g = matrix;
        }
        this.f9637d.getMatrix(matrix);
        return matrix;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: B */
    public final void mo5232B(InterfaceC2007c interfaceC2007c, EnumC2017m enumC2017m, C3029b c3029b, C0172E c0172e) {
        Canvas canvasStart = this.f9637d.start(Math.max((int) (this.f9638e >> 32), (int) (this.f9642i >> 32)), Math.max((int) (this.f9638e & 4294967295L), (int) (this.f9642i & 4294967295L)));
        try {
            C2743b c2743b = this.f9635b.f8756a;
            Canvas canvas = c2743b.f8723a;
            c2743b.f8723a = canvasStart;
            C2901b c2901b = this.f9636c;
            C0072l0 c0072l0 = c2901b.f9185e;
            long jM3523F = AbstractC1925g.m3523F(this.f9638e);
            C2900a c2900a = ((C2901b) c0072l0.f309g).f9184d;
            InterfaceC2007c interfaceC2007c2 = c2900a.f9180a;
            EnumC2017m enumC2017m2 = c2900a.f9181b;
            InterfaceC2760s interfaceC2760sM106j = c0072l0.m106j();
            long jM110n = c0072l0.m110n();
            C3029b c3029b2 = (C3029b) c0072l0.f308f;
            c0072l0.m117w(interfaceC2007c);
            c0072l0.m118x(enumC2017m);
            c0072l0.m116v(c2743b);
            c0072l0.m119y(jM3523F);
            c0072l0.f308f = c3029b;
            c2743b.mo4852n();
            try {
                c0172e.mo1h(c2901b);
                c2743b.mo4851l();
                c0072l0.m117w(interfaceC2007c2);
                c0072l0.m118x(enumC2017m2);
                c0072l0.m116v(interfaceC2760sM106j);
                c0072l0.m119y(jM110n);
                c0072l0.f308f = c3029b2;
                c2743b.f8723a = canvas;
                this.f9637d.end(canvasStart);
            } catch (Throwable th) {
                c2743b.mo4851l();
                C0072l0 c0072l02 = c2901b.f9185e;
                c0072l02.m117w(interfaceC2007c2);
                c0072l02.m118x(enumC2017m2);
                c0072l02.m116v(interfaceC2760sM106j);
                c0072l02.m119y(jM110n);
                c0072l02.f308f = c3029b2;
                throw th;
            }
        } catch (Throwable th2) {
            this.f9637d.end(canvasStart);
            throw th2;
        }
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: C */
    public final void mo5233C(int i5, int i6, long j5) {
        int i7 = (int) (j5 >> 32);
        int i8 = (int) (4294967295L & j5);
        this.f9637d.setLeftTopRightBottom(i5, i6, i5 + i7, i6 + i8);
        if (C2016l.m3704a(this.f9638e, j5)) {
            return;
        }
        if (this.f9646m) {
            this.f9637d.setPivotX(i7 / 2.0f);
            this.f9637d.setPivotY(i8 / 2.0f);
        }
        this.f9638e = j5;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: D */
    public final float mo5234D() {
        return this.f9654u;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: E */
    public final void mo5235E(C2757p c2757p) {
        this.f9634A = c2757p;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: F */
    public final void mo5236F(float f2) {
        this.f9656w = f2;
        this.f9637d.setCameraDistance(-f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: G */
    public final float mo5237G() {
        return this.f9650q;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: H */
    public final boolean mo5238H() {
        return this.f9637d.isValid();
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: I */
    public final void mo5239I(InterfaceC2760s interfaceC2760s) {
        DisplayListCanvas displayListCanvasM4858a = AbstractC2744c.m4858a(interfaceC2760s);
        AbstractC1665j.m2983c(displayListCanvasM4858a, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasM4858a.drawRenderNode(this.f9637d);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: J */
    public final float mo5240J() {
        return this.f9648o;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: K */
    public final void mo5241K(float f2) {
        this.f9653t = f2;
        this.f9637d.setRotationX(f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: L */
    public final float mo5242L() {
        return this.f9655v;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: M */
    public final int mo5243M() {
        return this.f9644k;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: N */
    public final void mo5244N(long j5) {
        if ((9223372034707292159L & j5) == 9205357640488583168L) {
            this.f9646m = true;
            this.f9637d.setPivotX(((int) (this.f9638e >> 32)) / 2.0f);
            this.f9637d.setPivotY(((int) (4294967295L & this.f9638e)) / 2.0f);
        } else {
            this.f9646m = false;
            this.f9637d.setPivotX(Float.intBitsToFloat((int) (j5 >> 32)));
            this.f9637d.setPivotY(Float.intBitsToFloat((int) (j5 & 4294967295L)));
        }
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: O */
    public final long mo5245O() {
        return this.f9651r;
    }

    /* JADX INFO: renamed from: P */
    public final void m5272P() {
        boolean z5 = this.f9657x;
        boolean z6 = false;
        boolean z7 = z5 && !this.f9641h;
        if (z5 && this.f9641h) {
            z6 = true;
        }
        if (z7 != this.f9658y) {
            this.f9658y = z7;
            this.f9637d.setClipToBounds(z7);
        }
        if (z6 != this.f9659z) {
            this.f9659z = z6;
            this.f9637d.setClipToOutline(z6);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m5273Q(int i5) {
        RenderNode renderNode = this.f9637d;
        if (i5 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f9639f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i5 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f9639f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f9639f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m5274R() {
        int i5 = this.f9643j;
        if (i5 != 1 && this.f9644k == 3) {
            m5273Q(i5);
        } else {
            m5273Q(1);
        }
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: a */
    public final float mo5246a() {
        return this.f9645l;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: b */
    public final void mo5247b(float f2) {
        this.f9654u = f2;
        this.f9637d.setRotationY(f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: c */
    public final void mo5248c(float f2) {
        this.f9645l = f2;
        this.f9637d.setAlpha(f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: d */
    public final float mo5249d() {
        return this.f9647n;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: e */
    public final void mo5250e(float f2) {
        this.f9650q = f2;
        this.f9637d.setElevation(f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: f */
    public final float mo5251f() {
        return this.f9649p;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: g */
    public final C2757p mo5252g() {
        return this.f9634A;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: h */
    public final void mo5253h(float f2) {
        this.f9655v = f2;
        this.f9637d.setRotation(f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: i */
    public final void mo5254i(float f2) {
        this.f9649p = f2;
        this.f9637d.setTranslationY(f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: j */
    public final long mo5255j() {
        return this.f9652s;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: k */
    public final void mo5256k(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9651r = j5;
            AbstractC3038k.m5307c(this.f9637d, AbstractC2767z.m4952w(j5));
        }
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: l */
    public final void mo5257l(Outline outline, long j5) {
        this.f9642i = j5;
        this.f9637d.setOutline(outline);
        this.f9641h = outline != null;
        m5272P();
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: m */
    public final void mo5258m() {
        m5274R();
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: n */
    public final void mo5259n(float f2) {
        this.f9647n = f2;
        this.f9637d.setScaleX(f2);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: o */
    public final void mo5260o(int i5) {
        if (this.f9644k == i5) {
            return;
        }
        this.f9644k = i5;
        Paint paint = this.f9639f;
        if (paint == null) {
            paint = new Paint();
            this.f9639f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC2767z.m4928A(i5)));
        m5274R();
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: p */
    public final float mo5261p() {
        return this.f9656w;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: q */
    public final void mo5262q() {
        AbstractC3037j.m5304a(this.f9637d);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: r */
    public final float mo5263r() {
        return 0.0f;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: s */
    public final void mo5264s() {
        this.f9637d.setTranslationX(0.0f);
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: t */
    public final void mo5265t(boolean z5) {
        this.f9657x = z5;
        m5272P();
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: u */
    public final int mo5266u() {
        return this.f9643j;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: v */
    public final float mo5267v() {
        return this.f9653t;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: w */
    public final C2753l mo5268w() {
        return null;
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: x */
    public final void mo5269x(int i5) {
        this.f9643j = i5;
        m5274R();
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: y */
    public final void mo5270y(long j5) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9652s = j5;
            AbstractC3038k.m5308d(this.f9637d, AbstractC2767z.m4952w(j5));
        }
    }

    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: z */
    public final void mo5271z(float f2) {
        this.f9648o = f2;
        this.f9637d.setScaleY(f2);
    }
}
