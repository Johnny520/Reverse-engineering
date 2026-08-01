package p228r0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import com.bumptech.glide.AbstractC1925g;
import p000A.C0072l0;
import p007B0.C0172E;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p211o0.AbstractC2744c;
import p211o0.AbstractC2754m;
import p211o0.AbstractC2767z;
import p211o0.C2743b;
import p211o0.C2753l;
import p211o0.C2757p;
import p211o0.C2761t;
import p211o0.C2762u;
import p211o0.InterfaceC2760s;
import p222q0.C2901b;

/* JADX INFO: renamed from: r0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3034g implements InterfaceC3031d {

    /* JADX INFO: renamed from: b */
    public final C2761t f9660b;

    /* JADX INFO: renamed from: c */
    public final C2901b f9661c;

    /* JADX INFO: renamed from: d */
    public final RenderNode f9662d;

    /* JADX INFO: renamed from: e */
    public long f9663e;

    /* JADX INFO: renamed from: f */
    public Paint f9664f;

    /* JADX INFO: renamed from: g */
    public Matrix f9665g;

    /* JADX INFO: renamed from: h */
    public boolean f9666h;

    /* JADX INFO: renamed from: i */
    public float f9667i;

    /* JADX INFO: renamed from: j */
    public int f9668j;

    /* JADX INFO: renamed from: k */
    public float f9669k;

    /* JADX INFO: renamed from: l */
    public float f9670l;

    /* JADX INFO: renamed from: m */
    public float f9671m;

    /* JADX INFO: renamed from: n */
    public float f9672n;

    /* JADX INFO: renamed from: o */
    public long f9673o;

    /* JADX INFO: renamed from: p */
    public long f9674p;

    /* JADX INFO: renamed from: q */
    public float f9675q;

    /* JADX INFO: renamed from: r */
    public float f9676r;

    /* JADX INFO: renamed from: s */
    public float f9677s;

    /* JADX INFO: renamed from: t */
    public float f9678t;

    /* JADX INFO: renamed from: u */
    public boolean f9679u;

    /* JADX INFO: renamed from: v */
    public boolean f9680v;

    /* JADX INFO: renamed from: w */
    public boolean f9681w;

    /* JADX INFO: renamed from: x */
    public C2757p f9682x;

    /* JADX INFO: renamed from: y */
    public int f9683y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3034g() {
        C2761t c2761t = new C2761t();
        C2901b c2901b = new C2901b();
        this.f9660b = c2761t;
        this.f9661c = c2901b;
        RenderNode renderNodeM4906p = AbstractC2754m.m4906p();
        this.f9662d = renderNodeM4906p;
        this.f9663e = 0L;
        renderNodeM4906p.setClipToBounds(false);
        m5300Q(renderNodeM4906p, 0);
        this.f9667i = 1.0f;
        this.f9668j = 3;
        this.f9669k = 1.0f;
        this.f9670l = 1.0f;
        long j5 = C2762u.f8757b;
        this.f9673o = j5;
        this.f9674p = j5;
        this.f9678t = 8.0f;
        this.f9683y = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: A */
    public final Matrix mo5231A() {
        Matrix matrix = this.f9665g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f9665g = matrix;
        }
        this.f9662d.getMatrix(matrix);
        return matrix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: B */
    public final void mo5232B(InterfaceC2007c interfaceC2007c, EnumC2017m enumC2017m, C3029b c3029b, C0172E c0172e) {
        C2901b c2901b = this.f9661c;
        RecordingCanvas recordingCanvasBeginRecording = this.f9662d.beginRecording();
        try {
            C2761t c2761t = this.f9660b;
            C2743b c2743b = c2761t.f8756a;
            Canvas canvas = c2743b.f8723a;
            c2743b.f8723a = recordingCanvasBeginRecording;
            C0072l0 c0072l0 = c2901b.f9185e;
            c0072l0.m117w(interfaceC2007c);
            c0072l0.m118x(enumC2017m);
            c0072l0.f308f = c3029b;
            c0072l0.m119y(this.f9663e);
            c0072l0.m116v(c2743b);
            c0172e.mo1h(c2901b);
            c2761t.f8756a.f8723a = canvas;
        } finally {
            this.f9662d.endRecording();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: C */
    public final void mo5233C(int i5, int i6, long j5) {
        this.f9662d.setPosition(i5, i6, ((int) (j5 >> 32)) + i5, ((int) (4294967295L & j5)) + i6);
        this.f9663e = AbstractC1925g.m3523F(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: D */
    public final float mo5234D() {
        return this.f9676r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: E */
    public final void mo5235E(C2757p c2757p) {
        this.f9682x = c2757p;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f9662d.setRenderEffect(c2757p != null ? c2757p.m4917a() : null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: F */
    public final void mo5236F(float f2) {
        this.f9678t = f2;
        this.f9662d.setCameraDistance(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: G */
    public final float mo5237G() {
        return this.f9672n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: H */
    public final boolean mo5238H() {
        return this.f9662d.hasDisplayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: I */
    public final void mo5239I(InterfaceC2760s interfaceC2760s) {
        AbstractC2744c.m4858a(interfaceC2760s).drawRenderNode(this.f9662d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: J */
    public final float mo5240J() {
        return this.f9670l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: K */
    public final void mo5241K(float f2) {
        this.f9675q = f2;
        this.f9662d.setRotationX(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: L */
    public final float mo5242L() {
        return this.f9677s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: M */
    public final int mo5243M() {
        return this.f9668j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: N */
    public final void mo5244N(long j5) {
        if ((9223372034707292159L & j5) == 9205357640488583168L) {
            this.f9662d.resetPivot();
        } else {
            this.f9662d.setPivotX(Float.intBitsToFloat((int) (j5 >> 32)));
            this.f9662d.setPivotY(Float.intBitsToFloat((int) (j5 & 4294967295L)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: O */
    public final long mo5245O() {
        return this.f9673o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m5299P() {
        boolean z5 = this.f9679u;
        boolean z6 = false;
        boolean z7 = z5 && !this.f9666h;
        if (z5 && this.f9666h) {
            z6 = true;
        }
        if (z7 != this.f9680v) {
            this.f9680v = z7;
            this.f9662d.setClipToBounds(z7);
        }
        if (z6 != this.f9681w) {
            this.f9681w = z6;
            this.f9662d.setClipToOutline(z6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final void m5300Q(RenderNode renderNode, int i5) {
        if (i5 == 1) {
            renderNode.setUseCompositingLayer(true, this.f9664f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i5 == 2) {
            renderNode.setUseCompositingLayer(false, this.f9664f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f9664f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final void m5301R() {
        int i5 = this.f9683y;
        if (i5 != 1 && this.f9668j == 3 && this.f9682x == null) {
            m5300Q(this.f9662d, i5);
        } else {
            m5300Q(this.f9662d, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: a */
    public final float mo5246a() {
        return this.f9667i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: b */
    public final void mo5247b(float f2) {
        this.f9676r = f2;
        this.f9662d.setRotationY(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: c */
    public final void mo5248c(float f2) {
        this.f9667i = f2;
        this.f9662d.setAlpha(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: d */
    public final float mo5249d() {
        return this.f9669k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: e */
    public final void mo5250e(float f2) {
        this.f9672n = f2;
        this.f9662d.setElevation(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: f */
    public final float mo5251f() {
        return this.f9671m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: g */
    public final C2757p mo5252g() {
        return this.f9682x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: h */
    public final void mo5253h(float f2) {
        this.f9677s = f2;
        this.f9662d.setRotationZ(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: i */
    public final void mo5254i(float f2) {
        this.f9671m = f2;
        this.f9662d.setTranslationY(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: j */
    public final long mo5255j() {
        return this.f9674p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: k */
    public final void mo5256k(long j5) {
        this.f9673o = j5;
        this.f9662d.setAmbientShadowColor(AbstractC2767z.m4952w(j5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: l */
    public final void mo5257l(Outline outline, long j5) {
        this.f9662d.setOutline(outline);
        this.f9666h = outline != null;
        m5299P();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: m */
    public final void mo5258m() {
        Paint paint = this.f9664f;
        if (paint == null) {
            paint = new Paint();
            this.f9664f = paint;
        }
        paint.setColorFilter(null);
        m5301R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: n */
    public final void mo5259n(float f2) {
        this.f9669k = f2;
        this.f9662d.setScaleX(f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: o */
    public final void mo5260o(int i5) {
        this.f9668j = i5;
        Paint paint = this.f9664f;
        if (paint == null) {
            paint = new Paint();
            this.f9664f = paint;
        }
        paint.setBlendMode(AbstractC2767z.m4948s(i5));
        m5301R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: p */
    public final float mo5261p() {
        return this.f9678t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: q */
    public final void mo5262q() {
        this.f9662d.discardDisplayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: r */
    public final float mo5263r() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: s */
    public final void mo5264s() {
        this.f9662d.setTranslationX(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: t */
    public final void mo5265t(boolean z5) {
        this.f9679u = z5;
        m5299P();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: u */
    public final int mo5266u() {
        return this.f9683y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: v */
    public final float mo5267v() {
        return this.f9675q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: w */
    public final C2753l mo5268w() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: x */
    public final void mo5269x(int i5) {
        this.f9683y = i5;
        m5301R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: y */
    public final void mo5270y(long j5) {
        this.f9674p = j5;
        this.f9662d.setSpotShadowColor(AbstractC2767z.m4952w(j5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p228r0.InterfaceC3031d
    /* JADX INFO: renamed from: z */
    public final void mo5271z(float f2) {
        this.f9670l = f2;
        this.f9662d.setScaleY(f2);
    }
}
