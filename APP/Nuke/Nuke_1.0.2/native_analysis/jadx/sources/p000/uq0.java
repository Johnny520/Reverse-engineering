package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uq0 implements rq0 {

    /* JADX INFO: renamed from: A */
    public static final AtomicBoolean f11415A = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b */
    public final C0742tp f11416b;

    /* JADX INFO: renamed from: c */
    public final C0702sp f11417c;

    /* JADX INFO: renamed from: d */
    public final RenderNode f11418d;

    /* JADX INFO: renamed from: e */
    public long f11419e;

    /* JADX INFO: renamed from: f */
    public Paint f11420f;

    /* JADX INFO: renamed from: g */
    public Matrix f11421g;

    /* JADX INFO: renamed from: h */
    public boolean f11422h;

    /* JADX INFO: renamed from: i */
    public long f11423i;

    /* JADX INFO: renamed from: j */
    public int f11424j;

    /* JADX INFO: renamed from: k */
    public int f11425k;

    /* JADX INFO: renamed from: l */
    public float f11426l;

    /* JADX INFO: renamed from: m */
    public boolean f11427m;

    /* JADX INFO: renamed from: n */
    public float f11428n;

    /* JADX INFO: renamed from: o */
    public float f11429o;

    /* JADX INFO: renamed from: p */
    public float f11430p;

    /* JADX INFO: renamed from: q */
    public float f11431q;

    /* JADX INFO: renamed from: r */
    public long f11432r;

    /* JADX INFO: renamed from: s */
    public long f11433s;

    /* JADX INFO: renamed from: t */
    public float f11434t;

    /* JADX INFO: renamed from: u */
    public float f11435u;

    /* JADX INFO: renamed from: v */
    public float f11436v;

    /* JADX INFO: renamed from: w */
    public float f11437w;

    /* JADX INFO: renamed from: x */
    public boolean f11438x;

    /* JADX INFO: renamed from: y */
    public boolean f11439y;

    /* JADX INFO: renamed from: z */
    public boolean f11440z;

    public uq0(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, C0742tp c0742tp, C0702sp c0702sp) {
        this.f11416b = c0742tp;
        this.f11417c = c0702sp;
        RenderNode renderNodeCreate = RenderNode.create("Compose", viewTreeObserverOnGlobalLayoutListenerC0045b7);
        this.f11418d = renderNodeCreate;
        this.f11419e = 0L;
        this.f11423i = 0L;
        if (f11415A.getAndSet(false)) {
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
                f82.m1555c(renderNodeCreate, f82.m1553a(renderNodeCreate));
                f82.m1556d(renderNodeCreate, f82.m1554b(renderNodeCreate));
            }
            e82.m1293a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        m5562O(0);
        this.f11424j = 0;
        this.f11425k = 3;
        this.f11426l = 1.0f;
        this.f11428n = 1.0f;
        this.f11429o = 1.0f;
        long j = C0363ju.f5212b;
        this.f11432r = j;
        this.f11433s = j;
        this.f11437w = 8.0f;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: A */
    public final void mo4569A(float f) {
        this.f11429o = f;
        this.f11418d.setScaleY(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: B */
    public final Matrix mo4570B() {
        Matrix matrix = this.f11421g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f11421g = matrix;
        }
        this.f11418d.getMatrix(matrix);
        return matrix;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: C */
    public final void mo4571C(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.f11418d.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (h11.m2041a(this.f11419e, j)) {
            return;
        }
        if (this.f11427m) {
            this.f11418d.setPivotX(i3 / 2.0f);
            this.f11418d.setPivotY(i4 / 2.0f);
        }
        this.f11419e = j;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: D */
    public final float mo4572D() {
        return this.f11435u;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: E */
    public final void mo4573E(float f) {
        this.f11437w = f;
        this.f11418d.setCameraDistance(-f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: F */
    public final float mo4574F() {
        return this.f11431q;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: G */
    public final boolean mo4575G() {
        return this.f11418d.isValid();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: H */
    public final float mo4576H() {
        return this.f11429o;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: I */
    public final void mo4577I(float f) {
        this.f11434t = f;
        this.f11418d.setRotationX(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: J */
    public final float mo4578J() {
        return this.f11436v;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: K */
    public final int mo4579K() {
        return this.f11425k;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: L */
    public final void mo4580L(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f11427m = true;
            this.f11418d.setPivotX(((int) (this.f11419e >> 32)) / 2.0f);
            this.f11418d.setPivotY(((int) (4294967295L & this.f11419e)) / 2.0f);
        } else {
            this.f11427m = false;
            this.f11418d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f11418d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: M */
    public final long mo4581M() {
        return this.f11432r;
    }

    /* JADX INFO: renamed from: N */
    public final void m5561N() {
        boolean z = this.f11438x;
        boolean z2 = false;
        boolean z3 = z && !this.f11422h;
        if (z && this.f11422h) {
            z2 = true;
        }
        if (z3 != this.f11439y) {
            this.f11439y = z3;
            this.f11418d.setClipToBounds(z3);
        }
        if (z2 != this.f11440z) {
            this.f11440z = z2;
            this.f11418d.setClipToOutline(z2);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m5562O(int i) {
        RenderNode renderNode = this.f11418d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f11420f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f11420f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f11420f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m5563P() {
        int i = this.f11424j;
        if (i != 1 && this.f11425k == 3) {
            m5562O(i);
        } else {
            m5562O(1);
        }
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: a */
    public final float mo4582a() {
        return this.f11426l;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: b */
    public final void mo4583b(float f) {
        this.f11435u = f;
        this.f11418d.setRotationY(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: c */
    public final void mo4584c(float f) {
        this.f11426l = f;
        this.f11418d.setAlpha(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: d */
    public final float mo4585d() {
        return this.f11428n;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: e */
    public final void mo4586e(float f) {
        this.f11431q = f;
        this.f11418d.setElevation(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: f */
    public final float mo4587f() {
        return this.f11430p;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: g */
    public final void mo4588g(float f) {
        this.f11436v = f;
        this.f11418d.setRotation(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: h */
    public final void mo4589h(float f) {
        this.f11430p = f;
        this.f11418d.setTranslationY(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: i */
    public final long mo4590i() {
        return this.f11433s;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: j */
    public final void mo4591j(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11432r = j;
            f82.m1555c(this.f11418d, sp0.m4947j0(j));
        }
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: k */
    public final void mo4592k(Outline outline, long j) {
        this.f11423i = j;
        this.f11418d.setOutline(outline);
        this.f11422h = outline != null;
        m5561N();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: l */
    public final void mo4593l() {
        m5563P();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: m */
    public final void mo4594m(float f) {
        this.f11428n = f;
        this.f11418d.setScaleX(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: n */
    public final void mo4595n(int i) {
        if (this.f11425k == i) {
            return;
        }
        this.f11425k = i;
        Paint paint = this.f11420f;
        if (paint == null) {
            paint = new Paint();
            this.f11420f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(t11.m5071W(i)));
        m5563P();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: o */
    public final float mo4596o() {
        return this.f11437w;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: p */
    public final void mo4597p() {
        e82.m1293a(this.f11418d);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: q */
    public final float mo4598q() {
        return 0.0f;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: r */
    public final void mo4599r() {
        this.f11418d.setTranslationX(0.0f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: s */
    public final void mo4600s(InterfaceC0627qp interfaceC0627qp) {
        Canvas canvas = AbstractC0229g6.f3317a;
        DisplayListCanvas displayListCanvas = ((C0192f6) interfaceC0627qp).f2807a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.f11418d);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: t */
    public final void mo4601t(boolean z) {
        this.f11438x = z;
        m5561N();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: u */
    public final int mo4602u() {
        return this.f11424j;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: v */
    public final float mo4603v() {
        return this.f11434t;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: w */
    public final void mo4604w(e70 e70Var, d61 d61Var, pq0 pq0Var, C0798v5 c0798v5) {
        Canvas canvasStart = this.f11418d.start(Math.max((int) (this.f11419e >> 32), (int) (this.f11423i >> 32)), Math.max((int) (this.f11419e & 4294967295L), (int) (this.f11423i & 4294967295L)));
        try {
            C0192f6 c0192f6 = this.f11416b.f10873a;
            Canvas canvas = c0192f6.f2807a;
            c0192f6.f2807a = canvasStart;
            C0702sp c0702sp = this.f11417c;
            C0043b5 c0043b5 = c0702sp.f10257i;
            long jM4715q0 = s11.m4715q0(this.f11419e);
            C0664rp c0664rp = ((C0702sp) c0043b5.f564k).f10256h;
            e70 e70Var2 = c0664rp.f9665a;
            d61 d61Var2 = c0664rp.f9666b;
            InterfaceC0627qp interfaceC0627qpM430q = c0043b5.m430q();
            long jM434u = c0043b5.m434u();
            pq0 pq0Var2 = (pq0) c0043b5.f563j;
            c0043b5.m412C(e70Var);
            c0043b5.m413D(d61Var);
            c0043b5.m411B(c0192f6);
            c0043b5.m414E(jM4715q0);
            c0043b5.f563j = pq0Var;
            c0192f6.mo1522l();
            try {
                c0798v5.mo5j(c0702sp);
                c0192f6.mo1520i();
                c0043b5.m412C(e70Var2);
                c0043b5.m413D(d61Var2);
                c0043b5.m411B(interfaceC0627qpM430q);
                c0043b5.m414E(jM434u);
                c0043b5.f563j = pq0Var2;
                c0192f6.f2807a = canvas;
            } catch (Throwable th) {
                c0192f6.mo1520i();
                C0043b5 c0043b52 = c0702sp.f10257i;
                c0043b52.m412C(e70Var2);
                c0043b52.m413D(d61Var2);
                c0043b52.m411B(interfaceC0627qpM430q);
                c0043b52.m414E(jM434u);
                c0043b52.f563j = pq0Var2;
                throw th;
            }
        } finally {
            this.f11418d.end(canvasStart);
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
        this.f11424j = i;
        m5563P();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: z */
    public final void mo4607z(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11433s = j;
            f82.m1556d(this.f11418d, sp0.m4947j0(j));
        }
    }
}
