package p118i1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;
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
import p293u2.C4242l;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: i1.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1905e implements InterfaceC1904d {

    /* JADX INFO: renamed from: B */
    public static final AtomicBoolean f6366B = new AtomicBoolean(true);

    /* JADX INFO: renamed from: A */
    public AbstractC1018n0 f6367A;

    /* JADX INFO: renamed from: b */
    public final C1033v f6368b;

    /* JADX INFO: renamed from: c */
    public final C1565b f6369c;

    /* JADX INFO: renamed from: d */
    public final RenderNode f6370d;

    /* JADX INFO: renamed from: e */
    public long f6371e;

    /* JADX INFO: renamed from: f */
    public Paint f6372f;

    /* JADX INFO: renamed from: g */
    public Matrix f6373g;

    /* JADX INFO: renamed from: h */
    public boolean f6374h;

    /* JADX INFO: renamed from: i */
    public long f6375i;

    /* JADX INFO: renamed from: j */
    public int f6376j;

    /* JADX INFO: renamed from: k */
    public int f6377k;

    /* JADX INFO: renamed from: l */
    public C1017n f6378l;

    /* JADX INFO: renamed from: m */
    public float f6379m;

    /* JADX INFO: renamed from: n */
    public boolean f6380n;

    /* JADX INFO: renamed from: o */
    public float f6381o;

    /* JADX INFO: renamed from: p */
    public float f6382p;

    /* JADX INFO: renamed from: q */
    public float f6383q;

    /* JADX INFO: renamed from: r */
    public float f6384r;

    /* JADX INFO: renamed from: s */
    public float f6385s;

    /* JADX INFO: renamed from: t */
    public long f6386t;

    /* JADX INFO: renamed from: u */
    public long f6387u;

    /* JADX INFO: renamed from: v */
    public float f6388v;

    /* JADX INFO: renamed from: w */
    public float f6389w;

    /* JADX INFO: renamed from: x */
    public boolean f6390x;

    /* JADX INFO: renamed from: y */
    public boolean f6391y;

    /* JADX INFO: renamed from: z */
    public boolean f6392z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1905e(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, C1033v c1033v, C1565b c1565b) {
        this.f6368b = c1033v;
        this.f6369c = c1565b;
        RenderNode renderNodeCreate = RenderNode.create("Compose", viewTreeObserverOnGlobalLayoutListenerC5934t);
        this.f6370d = renderNodeCreate;
        this.f6371e = 0L;
        this.f6375i = 0L;
        if (f6366B.getAndSet(false)) {
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
                AbstractC1911k.m4764c(renderNodeCreate, AbstractC1911k.m4762a(renderNodeCreate));
                AbstractC1911k.m4765d(renderNodeCreate, AbstractC1911k.m4763b(renderNodeCreate));
            }
            AbstractC1910j.m4761a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        m4724Q(0);
        this.f6376j = 0;
        this.f6377k = 3;
        this.f6379m = 1.0f;
        this.f6381o = 1.0f;
        this.f6382p = 1.0f;
        long j3 = C1034w.f3258b;
        this.f6386t = j3;
        this.f6387u = j3;
        this.f6389w = 8.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: A */
    public final boolean mo4682A() {
        return this.f6370d.isValid();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: B */
    public final float mo4683B() {
        return this.f6388v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: C */
    public final void mo4684C(long j3) {
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            this.f6380n = true;
            this.f6370d.setPivotX(((int) (this.f6371e >> 32)) / 2.0f);
            this.f6370d.setPivotY(((int) (4294967295L & this.f6371e)) / 2.0f);
        } else {
            this.f6380n = false;
            this.f6370d.setPivotX(Float.intBitsToFloat((int) (j3 >> 32)));
            this.f6370d.setPivotY(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: D */
    public final long mo4685D() {
        return this.f6386t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: E */
    public final float mo4686E() {
        return this.f6384r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: F */
    public final long mo4687F() {
        return this.f6387u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: G */
    public final float mo4688G() {
        return this.f6389w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: H */
    public final float mo4689H() {
        return this.f6383q;
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
        this.f6376j = i9;
        m4725R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: K */
    public final Matrix mo4692K() {
        Matrix matrix = this.f6373g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f6373g = matrix;
        }
        this.f6370d.getMatrix(matrix);
        return matrix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: L */
    public final void mo4693L(AbstractC1018n0 abstractC1018n0) {
        this.f6367A = abstractC1018n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: M */
    public final float mo4694M() {
        return this.f6385s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: N */
    public final void mo4695N(InterfaceC1031u interfaceC1031u) {
        Canvas canvas = AbstractC0995c.f3160a;
        DisplayListCanvas displayListCanvas = ((C0993b) interfaceC1031u).f3149a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.f6370d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: O */
    public final int mo4696O() {
        return this.f6377k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m4723P() {
        boolean z9 = this.f6390x;
        boolean z10 = false;
        boolean z11 = z9 && !this.f6374h;
        if (z9 && this.f6374h) {
            z10 = true;
        }
        if (z11 != this.f6391y) {
            this.f6391y = z11;
            this.f6370d.setClipToBounds(z11);
        }
        if (z10 != this.f6392z) {
            this.f6392z = z10;
            this.f6370d.setClipToOutline(z10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final void m4724Q(int i9) {
        RenderNode renderNode = this.f6370d;
        if (i9 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f6372f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i9 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f6372f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f6372f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public final void m4725R() {
        int i9 = this.f6376j;
        if (i9 != 1 && this.f6377k == 3 && this.f6378l == null) {
            m4724Q(i9);
        } else {
            m4724Q(1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: a */
    public final float mo4697a() {
        return this.f6379m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: b */
    public final float mo4698b() {
        return this.f6381o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: c */
    public final void mo4699c(float f3) {
        this.f6385s = f3;
        this.f6370d.setElevation(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: d */
    public final AbstractC1018n0 mo4700d() {
        return this.f6367A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: e */
    public final void mo4701e(Outline outline, long j3) {
        this.f6375i = j3;
        this.f6370d.setOutline(outline);
        this.f6374h = outline != null;
        m4723P();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: f */
    public final void mo4702f(float f3) {
        this.f6388v = f3;
        this.f6370d.setRotation(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: g */
    public final void mo4703g(float f3) {
        this.f6384r = f3;
        this.f6370d.setTranslationY(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: h */
    public final void mo4704h(int i9) {
        if (this.f6377k == i9) {
            return;
        }
        this.f6377k = i9;
        Paint paint = this.f6372f;
        if (paint == null) {
            paint = new Paint();
            this.f6372f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC0996c0.m2529z(i9)));
        m4725R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: i */
    public final void mo4705i(float f3) {
        this.f6382p = f3;
        this.f6370d.setScaleY(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: j */
    public final void mo4706j() {
        AbstractC1910j.m4761a(this.f6370d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: k */
    public final void mo4707k(C1017n c1017n) {
        this.f6378l = c1017n;
        if (c1017n == null) {
            m4725R();
            return;
        }
        m4724Q(1);
        RenderNode renderNode = this.f6370d;
        Paint paint = this.f6372f;
        if (paint == null) {
            paint = new Paint();
            this.f6372f = paint;
        }
        paint.setColorFilter(c1017n.f3201a);
        renderNode.setLayerPaint(paint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: l */
    public final void mo4708l() {
        this.f6370d.setRotationX(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: m */
    public final void mo4709m(InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m, C1902b c1902b, C0166f c0166f) {
        Canvas canvasStart = this.f6370d.start(Math.max((int) (this.f6371e >> 32), (int) (this.f6375i >> 32)), Math.max((int) (this.f6371e & 4294967295L), (int) (this.f6375i & 4294967295L)));
        try {
            C0993b c0993b = this.f6368b.f3257a;
            Canvas canvas = c0993b.f3149a;
            c0993b.f3149a = canvasStart;
            C1565b c1565b = this.f6369c;
            C0184c c0184c = c1565b.f5220h;
            long jM7908q0 = AbstractC3754e0.m7908q0(this.f6371e);
            InterfaceC4233c interfaceC4233cM822s = c0184c.m822s();
            EnumC4243m enumC4243mM824u = c0184c.m824u();
            InterfaceC1031u interfaceC1031uM819p = c0184c.m819p();
            long jM825v = c0184c.m825v();
            C1902b c1902b2 = (C1902b) c0184c.f470b;
            c0184c.m800R(interfaceC4233c);
            c0184c.m801S(enumC4243m);
            c0184c.m798P(c0993b);
            c0184c.m803U(jM7908q0);
            c0184c.f470b = c1902b;
            c0993b.mo2487e();
            try {
                c0166f.invoke(c1565b);
                c0993b.mo2497p();
                c0184c.m800R(interfaceC4233cM822s);
                c0184c.m801S(enumC4243mM824u);
                c0184c.m798P(interfaceC1031uM819p);
                c0184c.m803U(jM825v);
                c0184c.f470b = c1902b2;
                c0993b.f3149a = canvas;
                this.f6370d.end(canvasStart);
            } catch (Throwable th2) {
                c0993b.mo2497p();
                C0184c c0184c2 = c1565b.f5220h;
                c0184c2.m800R(interfaceC4233cM822s);
                c0184c2.m801S(enumC4243mM824u);
                c0184c2.m798P(interfaceC1031uM819p);
                c0184c2.m803U(jM825v);
                c0184c2.f470b = c1902b2;
                throw th2;
            }
        } catch (Throwable th3) {
            this.f6370d.end(canvasStart);
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: n */
    public final void mo4710n(float f3) {
        this.f6379m = f3;
        this.f6370d.setAlpha(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: o */
    public final void mo4711o() {
        this.f6370d.setRotationY(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: p */
    public final void mo4712p(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6386t = j3;
            AbstractC1911k.m4764c(this.f6370d, AbstractC0996c0.m2526w(j3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: q */
    public final void mo4713q(float f3) {
        this.f6381o = f3;
        this.f6370d.setScaleX(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: r */
    public final void mo4714r(boolean z9) {
        this.f6390x = z9;
        m4723P();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: s */
    public final void mo4715s(float f3) {
        this.f6383q = f3;
        this.f6370d.setTranslationX(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: t */
    public final void mo4716t(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6387u = j3;
            AbstractC1911k.m4765d(this.f6370d, AbstractC0996c0.m2526w(j3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: u */
    public final void mo4717u(float f3) {
        this.f6389w = f3;
        this.f6370d.setCameraDistance(-f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: v */
    public final float mo4718v() {
        return this.f6382p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: w */
    public final int mo4719w() {
        return this.f6376j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: x */
    public final C1017n mo4720x() {
        return this.f6378l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: y */
    public final void mo4721y(int i9, int i10, long j3) {
        int i11 = (int) (j3 >> 32);
        int i12 = (int) (4294967295L & j3);
        this.f6370d.setLeftTopRightBottom(i9, i10, i9 + i11, i10 + i12);
        if (C4242l.m8534a(this.f6371e, j3)) {
            return;
        }
        if (this.f6380n) {
            this.f6370d.setPivotX(i11 / 2.0f);
            this.f6370d.setPivotY(i12 / 2.0f);
        }
        this.f6371e = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: z */
    public final float mo4722z() {
        return 0.0f;
    }
}
