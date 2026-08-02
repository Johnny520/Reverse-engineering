package defpackage;

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
    public static final yq0 A = new yq0();
    public final kc0 b;
    public final tp c;
    public final db3 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public float u;
    public long v;
    public long w;
    public float x;
    public float y;
    public float z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zq0(kc0 kc0Var) {
        tp tpVar = new tp();
        sp spVar = new sp();
        this.b = kc0Var;
        this.c = tpVar;
        db3 db3Var = new db3(kc0Var, tpVar, spVar);
        this.d = db3Var;
        this.e = kc0Var.getResources();
        this.f = new Rect();
        kc0Var.addView(db3Var);
        db3Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.o = 0;
        this.p = 1.0f;
        this.r = 1.0f;
        this.s = 1.0f;
        long j = ju.b;
        this.v = j;
        this.w = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void A(float f) {
        this.s = f;
        this.d.setScaleY(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final Matrix B() {
        return this.d.getMatrix();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void C(int i, int i2, long j) {
        boolean zA = h11.a(this.j, j);
        db3 db3Var = this.d;
        if (zA) {
            int i3 = this.h;
            if (i3 != i) {
                db3Var.offsetLeftAndRight(i - i3);
            }
            int i4 = this.i;
            if (i4 != i2) {
                db3Var.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.m || db3Var.getClipToOutline()) {
                this.k = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            db3Var.layout(i, i2, i + i5, i2 + i6);
            this.j = j;
            if (this.q) {
                db3Var.setPivotX(i5 / 2.0f);
                db3Var.setPivotY(i6 / 2.0f);
            }
        }
        this.h = i;
        this.i = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final float D() {
        return this.y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void E(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final float F() {
        return this.u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final float H() {
        return this.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void I(float f) {
        this.x = f;
        this.d.setRotationX(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final float J() {
        return this.z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final int K() {
        return this.n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void L(long j) {
        long j2 = 9223372034707292159L & j;
        db3 db3Var = this.d;
        if (j2 != 9205357640488583168L) {
            this.q = false;
            db3Var.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            db3Var.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                db3Var.resetPivot();
                return;
            }
            this.q = true;
            db3Var.setPivotX(((int) (this.j >> 32)) / 2.0f);
            db3Var.setPivotY(((int) (this.j & 4294967295L)) / 2.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final long M() {
        return this.v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void N(int i) {
        db3 db3Var = this.d;
        boolean z = true;
        if (i == 1) {
            db3Var.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i == 2) {
                db3Var.setLayerType(0, paint);
                z = false;
            } else {
                db3Var.setLayerType(0, paint);
            }
        }
        db3Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void O() {
        int i = this.o;
        if (i != 1 && this.n == 3) {
            N(i);
        } else {
            N(1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final float a() {
        return this.p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void b(float f) {
        this.y = f;
        this.d.setRotationY(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void c(float f) {
        this.p = f;
        this.d.setAlpha(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final float d() {
        return this.r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void e(float f) {
        this.u = f;
        this.d.setElevation(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final float f() {
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void g(float f) {
        this.z = f;
        this.d.setRotation(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void h(float f) {
        this.t = f;
        this.d.setTranslationY(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final long i() {
        return this.w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void j(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            this.d.setOutlineAmbientShadowColor(sp0.j0(j));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void k(Outline outline, long j) {
        db3 db3Var = this.d;
        db3Var.l = outline;
        db3Var.invalidateOutline();
        if ((this.m || db3Var.getClipToOutline()) && outline != null) {
            db3Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void l() {
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(null);
        O();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void m(float f) {
        this.r = f;
        this.d.setScaleX(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void n(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(t11.W(i)));
        O();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final float o() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void p() {
        this.b.removeViewInLayout(this.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final float q() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void r() {
        this.d.setTranslationX(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void s(qp qpVar) {
        Rect rect;
        boolean z = this.k;
        db3 db3Var = this.d;
        if (z) {
            if ((this.m || db3Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = db3Var.getWidth();
                rect.bottom = db3Var.getHeight();
            } else {
                rect = null;
            }
            db3Var.setClipBounds(rect);
        }
        Canvas canvas = g6.a;
        if (((f6) qpVar).a.isHardwareAccelerated()) {
            this.b.a(qpVar, db3Var, db3Var.getDrawingTime());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void t(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final int u() {
        return this.o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final float v() {
        return this.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
    @Override // defpackage.rq0
    public final void w(e70 e70Var, d61 d61Var, pq0 pq0Var, v5 v5Var) {
        db3 db3Var = this.d;
        ViewParent parent = db3Var.getParent();
        kc0 kc0Var = this.b;
        if (parent == null) {
            kc0Var.addView(db3Var);
        }
        db3Var.n = e70Var;
        db3Var.o = d61Var;
        db3Var.p = v5Var;
        db3Var.q = pq0Var;
        if (db3Var.isAttachedToWindow()) {
            db3Var.setVisibility(4);
            db3Var.setVisibility(0);
            try {
                tp tpVar = this.c;
                yq0 yq0Var = A;
                f6 f6Var = tpVar.a;
                Canvas canvas = f6Var.a;
                f6Var.a = yq0Var;
                kc0Var.a(f6Var, db3Var, db3Var.getDrawingTime());
                tpVar.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final cl x() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void y(int i) {
        this.o = i;
        O();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rq0
    public final void z(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.w = j;
            this.d.setOutlineSpotShadowColor(sp0.j0(j));
        }
    }
}
