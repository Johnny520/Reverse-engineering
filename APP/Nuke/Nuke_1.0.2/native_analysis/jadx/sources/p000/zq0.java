package p000;

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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zq0 implements rq0 {

    /* JADX INFO: renamed from: A */
    public static final yq0 f14036A = new yq0();

    /* JADX INFO: renamed from: b */
    public final kc0 f14037b;

    /* JADX INFO: renamed from: c */
    public final C0742tp f14038c;

    /* JADX INFO: renamed from: d */
    public final db3 f14039d;

    /* JADX INFO: renamed from: e */
    public final Resources f14040e;

    /* JADX INFO: renamed from: f */
    public final Rect f14041f;

    /* JADX INFO: renamed from: g */
    public Paint f14042g;

    /* JADX INFO: renamed from: h */
    public int f14043h;

    /* JADX INFO: renamed from: i */
    public int f14044i;

    /* JADX INFO: renamed from: j */
    public long f14045j;

    /* JADX INFO: renamed from: k */
    public boolean f14046k;

    /* JADX INFO: renamed from: l */
    public boolean f14047l;

    /* JADX INFO: renamed from: m */
    public boolean f14048m;

    /* JADX INFO: renamed from: n */
    public int f14049n;

    /* JADX INFO: renamed from: o */
    public int f14050o;

    /* JADX INFO: renamed from: p */
    public float f14051p;

    /* JADX INFO: renamed from: q */
    public boolean f14052q;

    /* JADX INFO: renamed from: r */
    public float f14053r;

    /* JADX INFO: renamed from: s */
    public float f14054s;

    /* JADX INFO: renamed from: t */
    public float f14055t;

    /* JADX INFO: renamed from: u */
    public float f14056u;

    /* JADX INFO: renamed from: v */
    public long f14057v;

    /* JADX INFO: renamed from: w */
    public long f14058w;

    /* JADX INFO: renamed from: x */
    public float f14059x;

    /* JADX INFO: renamed from: y */
    public float f14060y;

    /* JADX INFO: renamed from: z */
    public float f14061z;

    public zq0(kc0 kc0Var) {
        C0742tp c0742tp = new C0742tp();
        C0702sp c0702sp = new C0702sp();
        this.f14037b = kc0Var;
        this.f14038c = c0742tp;
        db3 db3Var = new db3(kc0Var, c0742tp, c0702sp);
        this.f14039d = db3Var;
        this.f14040e = kc0Var.getResources();
        this.f14041f = new Rect();
        kc0Var.addView(db3Var);
        db3Var.setClipBounds(null);
        this.f14045j = 0L;
        View.generateViewId();
        this.f14049n = 3;
        this.f14050o = 0;
        this.f14051p = 1.0f;
        this.f14053r = 1.0f;
        this.f14054s = 1.0f;
        long j = C0363ju.f5212b;
        this.f14057v = j;
        this.f14058w = j;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: A */
    public final void mo4569A(float f) {
        this.f14054s = f;
        this.f14039d.setScaleY(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: B */
    public final Matrix mo4570B() {
        return this.f14039d.getMatrix();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: C */
    public final void mo4571C(int i, int i2, long j) {
        boolean zM2041a = h11.m2041a(this.f14045j, j);
        db3 db3Var = this.f14039d;
        if (zM2041a) {
            int i3 = this.f14043h;
            if (i3 != i) {
                db3Var.offsetLeftAndRight(i - i3);
            }
            int i4 = this.f14044i;
            if (i4 != i2) {
                db3Var.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.f14048m || db3Var.getClipToOutline()) {
                this.f14046k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            db3Var.layout(i, i2, i + i5, i2 + i6);
            this.f14045j = j;
            if (this.f14052q) {
                db3Var.setPivotX(i5 / 2.0f);
                db3Var.setPivotY(i6 / 2.0f);
            }
        }
        this.f14043h = i;
        this.f14044i = i2;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: D */
    public final float mo4572D() {
        return this.f14060y;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: E */
    public final void mo4573E(float f) {
        this.f14039d.setCameraDistance(f * this.f14040e.getDisplayMetrics().densityDpi);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: F */
    public final float mo4574F() {
        return this.f14056u;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: H */
    public final float mo4576H() {
        return this.f14054s;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: I */
    public final void mo4577I(float f) {
        this.f14059x = f;
        this.f14039d.setRotationX(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: J */
    public final float mo4578J() {
        return this.f14061z;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: K */
    public final int mo4579K() {
        return this.f14049n;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: L */
    public final void mo4580L(long j) {
        long j2 = 9223372034707292159L & j;
        db3 db3Var = this.f14039d;
        if (j2 != 9205357640488583168L) {
            this.f14052q = false;
            db3Var.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            db3Var.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                db3Var.resetPivot();
                return;
            }
            this.f14052q = true;
            db3Var.setPivotX(((int) (this.f14045j >> 32)) / 2.0f);
            db3Var.setPivotY(((int) (this.f14045j & 4294967295L)) / 2.0f);
        }
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: M */
    public final long mo4581M() {
        return this.f14057v;
    }

    /* JADX INFO: renamed from: N */
    public final void m6481N(int i) {
        db3 db3Var = this.f14039d;
        boolean z = true;
        if (i == 1) {
            db3Var.setLayerType(2, this.f14042g);
        } else {
            Paint paint = this.f14042g;
            if (i == 2) {
                db3Var.setLayerType(0, paint);
                z = false;
            } else {
                db3Var.setLayerType(0, paint);
            }
        }
        db3Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    /* JADX INFO: renamed from: O */
    public final void m6482O() {
        int i = this.f14050o;
        if (i != 1 && this.f14049n == 3) {
            m6481N(i);
        } else {
            m6481N(1);
        }
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: a */
    public final float mo4582a() {
        return this.f14051p;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: b */
    public final void mo4583b(float f) {
        this.f14060y = f;
        this.f14039d.setRotationY(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: c */
    public final void mo4584c(float f) {
        this.f14051p = f;
        this.f14039d.setAlpha(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: d */
    public final float mo4585d() {
        return this.f14053r;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: e */
    public final void mo4586e(float f) {
        this.f14056u = f;
        this.f14039d.setElevation(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: f */
    public final float mo4587f() {
        return this.f14055t;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: g */
    public final void mo4588g(float f) {
        this.f14061z = f;
        this.f14039d.setRotation(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: h */
    public final void mo4589h(float f) {
        this.f14055t = f;
        this.f14039d.setTranslationY(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: i */
    public final long mo4590i() {
        return this.f14058w;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: j */
    public final void mo4591j(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f14057v = j;
            this.f14039d.setOutlineAmbientShadowColor(sp0.m4947j0(j));
        }
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: k */
    public final void mo4592k(Outline outline, long j) {
        db3 db3Var = this.f14039d;
        db3Var.f1969l = outline;
        db3Var.invalidateOutline();
        if ((this.f14048m || db3Var.getClipToOutline()) && outline != null) {
            db3Var.setClipToOutline(true);
            if (this.f14048m) {
                this.f14048m = false;
                this.f14046k = true;
            }
        }
        this.f14047l = outline != null;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: l */
    public final void mo4593l() {
        Paint paint = this.f14042g;
        if (paint == null) {
            paint = new Paint();
            this.f14042g = paint;
        }
        paint.setColorFilter(null);
        m6482O();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: m */
    public final void mo4594m(float f) {
        this.f14053r = f;
        this.f14039d.setScaleX(f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: n */
    public final void mo4595n(int i) {
        this.f14049n = i;
        Paint paint = this.f14042g;
        if (paint == null) {
            paint = new Paint();
            this.f14042g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(t11.m5071W(i)));
        m6482O();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: o */
    public final float mo4596o() {
        return this.f14039d.getCameraDistance() / this.f14040e.getDisplayMetrics().densityDpi;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: p */
    public final void mo4597p() {
        this.f14037b.removeViewInLayout(this.f14039d);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: q */
    public final float mo4598q() {
        return 0.0f;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: r */
    public final void mo4599r() {
        this.f14039d.setTranslationX(0.0f);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: s */
    public final void mo4600s(InterfaceC0627qp interfaceC0627qp) {
        Rect rect;
        boolean z = this.f14046k;
        db3 db3Var = this.f14039d;
        if (z) {
            if ((this.f14048m || db3Var.getClipToOutline()) && !this.f14047l) {
                rect = this.f14041f;
                rect.left = 0;
                rect.top = 0;
                rect.right = db3Var.getWidth();
                rect.bottom = db3Var.getHeight();
            } else {
                rect = null;
            }
            db3Var.setClipBounds(rect);
        }
        Canvas canvas = AbstractC0229g6.f3317a;
        if (((C0192f6) interfaceC0627qp).f2807a.isHardwareAccelerated()) {
            this.f14037b.m2627a(interfaceC0627qp, db3Var, db3Var.getDrawingTime());
        }
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: t */
    public final void mo4601t(boolean z) {
        boolean z2 = false;
        this.f14048m = z && !this.f14047l;
        this.f14046k = true;
        if (z && this.f14047l) {
            z2 = true;
        }
        this.f14039d.setClipToOutline(z2);
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: u */
    public final int mo4602u() {
        return this.f14050o;
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: v */
    public final float mo4603v() {
        return this.f14059x;
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
    @Override // p000.rq0
    /* JADX INFO: renamed from: w */
    public final void mo4604w(e70 e70Var, d61 d61Var, pq0 pq0Var, C0798v5 c0798v5) {
        db3 db3Var = this.f14039d;
        ViewParent parent = db3Var.getParent();
        kc0 kc0Var = this.f14037b;
        if (parent == null) {
            kc0Var.addView(db3Var);
        }
        db3Var.f1971n = e70Var;
        db3Var.f1972o = d61Var;
        db3Var.f1973p = c0798v5;
        db3Var.f1974q = pq0Var;
        if (db3Var.isAttachedToWindow()) {
            db3Var.setVisibility(4);
            db3Var.setVisibility(0);
            try {
                C0742tp c0742tp = this.f14038c;
                yq0 yq0Var = f14036A;
                C0192f6 c0192f6 = c0742tp.f10873a;
                Canvas canvas = c0192f6.f2807a;
                c0192f6.f2807a = yq0Var;
                kc0Var.m2627a(c0192f6, db3Var, db3Var.getDrawingTime());
                c0742tp.f10873a.f2807a = canvas;
            } catch (ClassCastException unused) {
            }
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
        this.f14050o = i;
        m6482O();
    }

    @Override // p000.rq0
    /* JADX INFO: renamed from: z */
    public final void mo4607z(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f14058w = j;
            this.f14039d.setOutlineSpotShadowColor(sp0.m4947j0(j));
        }
    }
}
