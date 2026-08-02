package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xq0 implements rq0 {

    /* JADX INFO: renamed from: b */
    public final C0742tp f13110b;

    /* JADX INFO: renamed from: c */
    public final C0702sp f13111c;

    /* JADX INFO: renamed from: d */
    public final RenderNode f13112d;

    /* JADX INFO: renamed from: e */
    public long f13113e;

    /* JADX INFO: renamed from: f */
    public Paint f13114f;

    /* JADX INFO: renamed from: g */
    public Matrix f13115g;

    /* JADX INFO: renamed from: h */
    public boolean f13116h;

    /* JADX INFO: renamed from: i */
    public float f13117i;

    /* JADX INFO: renamed from: j */
    public int f13118j;

    /* JADX INFO: renamed from: k */
    public float f13119k;

    /* JADX INFO: renamed from: l */
    public float f13120l;

    /* JADX INFO: renamed from: m */
    public float f13121m;

    /* JADX INFO: renamed from: n */
    public float f13122n;

    /* JADX INFO: renamed from: o */
    public long f13123o;

    /* JADX INFO: renamed from: p */
    public long f13124p;

    /* JADX INFO: renamed from: q */
    public float f13125q;

    /* JADX INFO: renamed from: r */
    public float f13126r;

    /* JADX INFO: renamed from: s */
    public float f13127s;

    /* JADX INFO: renamed from: t */
    public float f13128t;

    /* JADX INFO: renamed from: u */
    public boolean f13129u;

    /* JADX INFO: renamed from: v */
    public boolean f13130v;

    /* JADX INFO: renamed from: w */
    public boolean f13131w;

    /* JADX INFO: renamed from: x */
    public int f13132x;

    public xq0() {
        C0742tp c0742tp = new C0742tp();
        C0702sp c0702sp = new C0702sp();
        this.f13110b = c0742tp;
        this.f13111c = c0702sp;
        RenderNode renderNodeM5754b = vq0.m5754b();
        this.f13112d = renderNodeM5754b;
        this.f13113e = 0L;
        renderNodeM5754b.setClipToBounds(false);
        m6173O(renderNodeM5754b, 0);
        this.f13117i = 1.0f;
        this.f13118j = 3;
        this.f13119k = 1.0f;
        this.f13120l = 1.0f;
        long j = C0363ju.f5212b;
        this.f13123o = j;
        this.f13124p = j;
        this.f13128t = 8.0f;
        this.f13132x = 0;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: A */
    public final void mo4569A(float f) {
        this.f13120l = f;
        this.f13112d.setScaleY(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: B */
    public final Matrix mo4570B() {
        Matrix matrix = this.f13115g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f13115g = matrix;
        }
        this.f13112d.getMatrix(matrix);
        return matrix;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: C */
    public final void mo4571C(int i, int i2, long j) {
        this.f13112d.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.f13113e = s11.m4715q0(j);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: D */
    public final float mo4572D() {
        return this.f13126r;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: E */
    public final void mo4573E(float f) {
        this.f13128t = f;
        this.f13112d.setCameraDistance(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: F */
    public final float mo4574F() {
        return this.f13122n;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: G */
    public final boolean mo4575G() {
        return this.f13112d.hasDisplayList();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: H */
    public final float mo4576H() {
        return this.f13120l;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: I */
    public final void mo4577I(float f) {
        this.f13125q = f;
        this.f13112d.setRotationX(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: J */
    public final float mo4578J() {
        return this.f13127s;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: K */
    public final int mo4579K() {
        return this.f13118j;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: L */
    public final void mo4580L(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.f13112d;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f13112d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: M */
    public final long mo4581M() {
        return this.f13123o;
    }

    /* JADX INFO: renamed from: N */
    public final void m6172N() {
        boolean z = this.f13129u;
        boolean z2 = false;
        boolean z3 = z && !this.f13116h;
        if (z && this.f13116h) {
            z2 = true;
        }
        if (z3 != this.f13130v) {
            this.f13130v = z3;
            this.f13112d.setClipToBounds(z3);
        }
        if (z2 != this.f13131w) {
            this.f13131w = z2;
            this.f13112d.setClipToOutline(z2);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m6173O(RenderNode renderNode, int i) {
        Paint paint = this.f13114f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m6174P() {
        int i = this.f13132x;
        if (i != 1 && this.f13118j == 3) {
            m6173O(this.f13112d, i);
        } else {
            m6173O(this.f13112d, 1);
        }
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: a */
    public final float mo4582a() {
        return this.f13117i;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: b */
    public final void mo4583b(float f) {
        this.f13126r = f;
        this.f13112d.setRotationY(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: c */
    public final void mo4584c(float f) {
        this.f13117i = f;
        this.f13112d.setAlpha(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: d */
    public final float mo4585d() {
        return this.f13119k;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: e */
    public final void mo4586e(float f) {
        this.f13122n = f;
        this.f13112d.setElevation(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: f */
    public final float mo4587f() {
        return this.f13121m;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: g */
    public final void mo4588g(float f) {
        this.f13127s = f;
        this.f13112d.setRotationZ(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: h */
    public final void mo4589h(float f) {
        this.f13121m = f;
        this.f13112d.setTranslationY(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: i */
    public final long mo4590i() {
        return this.f13124p;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: j */
    public final void mo4591j(long j) {
        this.f13123o = j;
        this.f13112d.setAmbientShadowColor(sp0.m4947j0(j));
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: k */
    public final void mo4592k(Outline outline, long j) {
        this.f13112d.setOutline(outline);
        this.f13116h = outline != null;
        m6172N();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: l */
    public final void mo4593l() {
        Paint paint = this.f13114f;
        if (paint == null) {
            paint = new Paint();
            this.f13114f = paint;
        }
        paint.setColorFilter(null);
        m6174P();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: m */
    public final void mo4594m(float f) {
        this.f13119k = f;
        this.f13112d.setScaleX(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: n */
    public final void mo4595n(int i) {
        this.f13118j = i;
        Paint paint = this.f13114f;
        if (paint == null) {
            paint = new Paint();
            this.f13114f = paint;
        }
        paint.setBlendMode(t11.m5068T(i));
        m6174P();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: o */
    public final float mo4596o() {
        return this.f13128t;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: p */
    public final void mo4597p() {
        this.f13112d.discardDisplayList();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: q */
    public final float mo4598q() {
        return 0.0f;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: r */
    public final void mo4599r() {
        this.f13112d.setTranslationX(0.0f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: s */
    public final void mo4600s(InterfaceC0627qp interfaceC0627qp) {
        Canvas canvas = AbstractC0229g6.f3317a;
        ((C0192f6) interfaceC0627qp).f2807a.drawRenderNode(this.f13112d);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: t */
    public final void mo4601t(boolean z) {
        this.f13129u = z;
        m6172N();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: u */
    public final int mo4602u() {
        return this.f13132x;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: v */
    public final float mo4603v() {
        return this.f13125q;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: w */
    public final void mo4604w(e70 e70Var, d61 d61Var, pq0 pq0Var, C0798v5 c0798v5) {
        C0702sp c0702sp = this.f13111c;
        RecordingCanvas recordingCanvasBeginRecording = this.f13112d.beginRecording();
        try {
            C0742tp c0742tp = this.f13110b;
            C0192f6 c0192f6 = c0742tp.f10873a;
            Canvas canvas = c0192f6.f2807a;
            c0192f6.f2807a = recordingCanvasBeginRecording;
            C0043b5 c0043b5 = c0702sp.f10257i;
            c0043b5.m412C(e70Var);
            c0043b5.m413D(d61Var);
            c0043b5.f563j = pq0Var;
            c0043b5.m414E(this.f13113e);
            c0043b5.m411B(c0192f6);
            c0798v5.mo5j(c0702sp);
            c0742tp.f10873a.f2807a = canvas;
        } finally {
            this.f13112d.endRecording();
        }
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: x */
    public final C0095cl mo4605x() {
        return null;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: y */
    public final void mo4606y(int i) {
        this.f13132x = i;
        m6174P();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: z */
    public final void mo4607z(long j) {
        this.f13124p = j;
        this.f13112d.setSpotShadowColor(sp0.m4947j0(j));
    }
}
