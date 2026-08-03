package p118i1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import p016b1.C0166f;
import p020b5.C0184c;
import p071f1.AbstractC0995c;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1018n0;
import p071f1.C0993b;
import p071f1.C1017n;
import p071f1.C1033v;
import p071f1.C1034w;
import p071f1.InterfaceC1031u;
import p101h1.C1565b;
import p259r9.AbstractC3754e0;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: i1.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1907g implements InterfaceC1904d {

    /* JADX INFO: renamed from: b */
    public final C1033v f6393b;

    /* JADX INFO: renamed from: c */
    public final C1565b f6394c;

    /* JADX INFO: renamed from: d */
    public final RenderNode f6395d;

    /* JADX INFO: renamed from: e */
    public long f6396e;

    /* JADX INFO: renamed from: f */
    public Paint f6397f;

    /* JADX INFO: renamed from: g */
    public Matrix f6398g;

    /* JADX INFO: renamed from: h */
    public boolean f6399h;

    /* JADX INFO: renamed from: i */
    public float f6400i;

    /* JADX INFO: renamed from: j */
    public int f6401j;

    /* JADX INFO: renamed from: k */
    public C1017n f6402k;

    /* JADX INFO: renamed from: l */
    public float f6403l;

    /* JADX INFO: renamed from: m */
    public float f6404m;

    /* JADX INFO: renamed from: n */
    public float f6405n;

    /* JADX INFO: renamed from: o */
    public float f6406o;

    /* JADX INFO: renamed from: p */
    public float f6407p;

    /* JADX INFO: renamed from: q */
    public long f6408q;

    /* JADX INFO: renamed from: r */
    public long f6409r;

    /* JADX INFO: renamed from: s */
    public float f6410s;

    /* JADX INFO: renamed from: t */
    public float f6411t;

    /* JADX INFO: renamed from: u */
    public boolean f6412u;

    /* JADX INFO: renamed from: v */
    public boolean f6413v;

    /* JADX INFO: renamed from: w */
    public boolean f6414w;

    /* JADX INFO: renamed from: x */
    public AbstractC1018n0 f6415x;

    /* JADX INFO: renamed from: y */
    public int f6416y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1907g() {
        C1033v c1033v = new C1033v();
        C1565b c1565b = new C1565b();
        this.f6393b = c1033v;
        this.f6394c = c1565b;
        RenderNode renderNodeM4730a = AbstractC1906f.m4730a();
        this.f6395d = renderNodeM4730a;
        this.f6396e = 0L;
        renderNodeM4730a.setClipToBounds(false);
        m4757Q(renderNodeM4730a, 0);
        this.f6400i = 1.0f;
        this.f6401j = 3;
        this.f6403l = 1.0f;
        this.f6404m = 1.0f;
        long j3 = C1034w.f3258b;
        this.f6408q = j3;
        this.f6409r = j3;
        this.f6411t = 8.0f;
        this.f6416y = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: A */
    public final boolean mo4682A() {
        return this.f6395d.hasDisplayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: B */
    public final float mo4683B() {
        return this.f6410s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: C */
    public final void mo4684C(long j3) {
        long j4 = 9223372034707292159L & j3;
        RenderNode renderNode = this.f6395d;
        if (j4 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j3 >> 32)));
            this.f6395d.setPivotY(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: D */
    public final long mo4685D() {
        return this.f6408q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: E */
    public final float mo4686E() {
        return this.f6406o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: F */
    public final long mo4687F() {
        return this.f6409r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: G */
    public final float mo4688G() {
        return this.f6411t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: H */
    public final float mo4689H() {
        return this.f6405n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: I */
    public final float mo4690I() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: J */
    public final void mo4691J(int i9) {
        this.f6416y = i9;
        m4758R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: K */
    public final Matrix mo4692K() {
        Matrix matrix = this.f6398g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f6398g = matrix;
        }
        this.f6395d.getMatrix(matrix);
        return matrix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: L */
    public final void mo4693L(AbstractC1018n0 abstractC1018n0) {
        this.f6415x = abstractC1018n0;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f6395d.setRenderEffect(abstractC1018n0 != null ? abstractC1018n0.m2619f() : null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: M */
    public final float mo4694M() {
        return this.f6407p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: N */
    public final void mo4695N(InterfaceC1031u interfaceC1031u) {
        Canvas canvas = AbstractC0995c.f3160a;
        ((C0993b) interfaceC1031u).f3149a.drawRenderNode(this.f6395d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: O */
    public final int mo4696O() {
        return this.f6401j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m4756P() {
        boolean z9 = this.f6412u;
        boolean z10 = false;
        boolean z11 = z9 && !this.f6399h;
        if (z9 && this.f6399h) {
            z10 = true;
        }
        if (z11 != this.f6413v) {
            this.f6413v = z11;
            this.f6395d.setClipToBounds(z11);
        }
        if (z10 != this.f6414w) {
            this.f6414w = z10;
            this.f6395d.setClipToOutline(z10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final void m4757Q(RenderNode renderNode, int i9) {
        Paint paint = this.f6397f;
        if (i9 == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i9 == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final void m4758R() {
        int i9 = this.f6416y;
        if (i9 != 1 && this.f6401j == 3 && this.f6402k == null && this.f6415x == null) {
            m4757Q(this.f6395d, i9);
        } else {
            m4757Q(this.f6395d, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: a */
    public final float mo4697a() {
        return this.f6400i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: b */
    public final float mo4698b() {
        return this.f6403l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: c */
    public final void mo4699c(float f3) {
        this.f6407p = f3;
        this.f6395d.setElevation(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: d */
    public final AbstractC1018n0 mo4700d() {
        return this.f6415x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: e */
    public final void mo4701e(Outline outline, long j3) {
        this.f6395d.setOutline(outline);
        this.f6399h = outline != null;
        m4756P();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: f */
    public final void mo4702f(float f3) {
        this.f6410s = f3;
        this.f6395d.setRotationZ(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: g */
    public final void mo4703g(float f3) {
        this.f6406o = f3;
        this.f6395d.setTranslationY(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: h */
    public final void mo4704h(int i9) {
        this.f6401j = i9;
        Paint paint = this.f6397f;
        if (paint == null) {
            paint = new Paint();
            this.f6397f = paint;
        }
        paint.setBlendMode(AbstractC0996c0.m2522s(i9));
        m4758R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: i */
    public final void mo4705i(float f3) {
        this.f6404m = f3;
        this.f6395d.setScaleY(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: j */
    public final void mo4706j() {
        this.f6395d.discardDisplayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: k */
    public final void mo4707k(C1017n c1017n) {
        this.f6402k = c1017n;
        Paint paint = this.f6397f;
        if (paint == null) {
            paint = new Paint();
            this.f6397f = paint;
        }
        paint.setColorFilter(c1017n != null ? c1017n.f3201a : null);
        m4758R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: l */
    public final void mo4708l() {
        this.f6395d.setRotationX(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: m */
    public final void mo4709m(InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m, C1902b c1902b, C0166f c0166f) {
        C1565b c1565b = this.f6394c;
        RecordingCanvas recordingCanvasBeginRecording = this.f6395d.beginRecording();
        try {
            C1033v c1033v = this.f6393b;
            C0993b c0993b = c1033v.f3257a;
            Canvas canvas = c0993b.f3149a;
            c0993b.f3149a = recordingCanvasBeginRecording;
            C0184c c0184c = c1565b.f5220h;
            c0184c.m800R(interfaceC4233c);
            c0184c.m801S(enumC4243m);
            c0184c.f470b = c1902b;
            c0184c.m803U(this.f6396e);
            c0184c.m798P(c0993b);
            c0166f.invoke(c1565b);
            c1033v.f3257a.f3149a = canvas;
        } finally {
            this.f6395d.endRecording();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: n */
    public final void mo4710n(float f3) {
        this.f6400i = f3;
        this.f6395d.setAlpha(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: o */
    public final void mo4711o() {
        this.f6395d.setRotationY(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: p */
    public final void mo4712p(long j3) {
        this.f6408q = j3;
        this.f6395d.setAmbientShadowColor(AbstractC0996c0.m2526w(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: q */
    public final void mo4713q(float f3) {
        this.f6403l = f3;
        this.f6395d.setScaleX(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: r */
    public final void mo4714r(boolean z9) {
        this.f6412u = z9;
        m4756P();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: s */
    public final void mo4715s(float f3) {
        this.f6405n = f3;
        this.f6395d.setTranslationX(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: t */
    public final void mo4716t(long j3) {
        this.f6409r = j3;
        this.f6395d.setSpotShadowColor(AbstractC0996c0.m2526w(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: u */
    public final void mo4717u(float f3) {
        this.f6411t = f3;
        this.f6395d.setCameraDistance(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: v */
    public final float mo4718v() {
        return this.f6404m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: w */
    public final int mo4719w() {
        return this.f6416y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: x */
    public final C1017n mo4720x() {
        return this.f6402k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: y */
    public final void mo4721y(int i9, int i10, long j3) {
        this.f6395d.setPosition(i9, i10, ((int) (j3 >> 32)) + i9, ((int) (4294967295L & j3)) + i10);
        this.f6396e = AbstractC3754e0.m7908q0(j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: z */
    public final float mo4722z() {
        return 0.0f;
    }
}
