package p118i1;

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
import p016b1.C0166f;
import p071f1.AbstractC0995c;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1018n0;
import p071f1.C0993b;
import p071f1.C1017n;
import p071f1.C1033v;
import p071f1.C1034w;
import p071f1.InterfaceC1031u;
import p101h1.C1565b;
import p132j1.AbstractC2049a;
import p293u2.C4242l;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: i1.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1909i implements InterfaceC1904d {

    /* JADX INFO: renamed from: B */
    public static final C1908h f6417B = new C1908h();

    /* JADX INFO: renamed from: A */
    public AbstractC1018n0 f6418A;

    /* JADX INFO: renamed from: b */
    public final AbstractC2049a f6419b;

    /* JADX INFO: renamed from: c */
    public final C1033v f6420c;

    /* JADX INFO: renamed from: d */
    public final C1913m f6421d;

    /* JADX INFO: renamed from: e */
    public final Resources f6422e;

    /* JADX INFO: renamed from: f */
    public final Rect f6423f;

    /* JADX INFO: renamed from: g */
    public Paint f6424g;

    /* JADX INFO: renamed from: h */
    public int f6425h;

    /* JADX INFO: renamed from: i */
    public int f6426i;

    /* JADX INFO: renamed from: j */
    public long f6427j;

    /* JADX INFO: renamed from: k */
    public boolean f6428k;

    /* JADX INFO: renamed from: l */
    public boolean f6429l;

    /* JADX INFO: renamed from: m */
    public boolean f6430m;

    /* JADX INFO: renamed from: n */
    public int f6431n;

    /* JADX INFO: renamed from: o */
    public C1017n f6432o;

    /* JADX INFO: renamed from: p */
    public int f6433p;

    /* JADX INFO: renamed from: q */
    public float f6434q;

    /* JADX INFO: renamed from: r */
    public boolean f6435r;

    /* JADX INFO: renamed from: s */
    public float f6436s;

    /* JADX INFO: renamed from: t */
    public float f6437t;

    /* JADX INFO: renamed from: u */
    public float f6438u;

    /* JADX INFO: renamed from: v */
    public float f6439v;

    /* JADX INFO: renamed from: w */
    public float f6440w;

    /* JADX INFO: renamed from: x */
    public long f6441x;

    /* JADX INFO: renamed from: y */
    public long f6442y;

    /* JADX INFO: renamed from: z */
    public float f6443z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1909i(AbstractC2049a abstractC2049a) {
        C1033v c1033v = new C1033v();
        C1565b c1565b = new C1565b();
        this.f6419b = abstractC2049a;
        this.f6420c = c1033v;
        C1913m c1913m = new C1913m(abstractC2049a, c1033v, c1565b);
        this.f6421d = c1913m;
        this.f6422e = abstractC2049a.getResources();
        this.f6423f = new Rect();
        abstractC2049a.addView(c1913m);
        c1913m.setClipBounds(null);
        this.f6427j = 0L;
        View.generateViewId();
        this.f6431n = 3;
        this.f6433p = 0;
        this.f6434q = 1.0f;
        this.f6436s = 1.0f;
        this.f6437t = 1.0f;
        long j3 = C1034w.f3258b;
        this.f6441x = j3;
        this.f6442y = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: B */
    public final float mo4683B() {
        return this.f6443z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: C */
    public final void mo4684C(long j3) {
        long j4 = 9223372034707292159L & j3;
        C1913m c1913m = this.f6421d;
        if (j4 != 9205357640488583168L) {
            this.f6435r = false;
            c1913m.setPivotX(Float.intBitsToFloat((int) (j3 >> 32)));
            c1913m.setPivotY(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                c1913m.resetPivot();
                return;
            }
            this.f6435r = true;
            c1913m.setPivotX(((int) (this.f6427j >> 32)) / 2.0f);
            c1913m.setPivotY(((int) (this.f6427j & 4294967295L)) / 2.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: D */
    public final long mo4685D() {
        return this.f6441x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: E */
    public final float mo4686E() {
        return this.f6439v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: F */
    public final long mo4687F() {
        return this.f6442y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: G */
    public final float mo4688G() {
        return this.f6421d.getCameraDistance() / this.f6422e.getDisplayMetrics().densityDpi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: H */
    public final float mo4689H() {
        return this.f6438u;
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
        this.f6433p = i9;
        m4760Q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: K */
    public final Matrix mo4692K() {
        return this.f6421d.getMatrix();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: L */
    public final void mo4693L(AbstractC1018n0 abstractC1018n0) {
        this.f6418A = abstractC1018n0;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f6421d.setRenderEffect(abstractC1018n0 != null ? abstractC1018n0.m2619f() : null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: M */
    public final float mo4694M() {
        return this.f6440w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: N */
    public final void mo4695N(InterfaceC1031u interfaceC1031u) {
        Rect rect;
        boolean z9 = this.f6428k;
        C1913m c1913m = this.f6421d;
        if (z9) {
            if ((this.f6430m || c1913m.getClipToOutline()) && !this.f6429l) {
                rect = this.f6423f;
                rect.left = 0;
                rect.top = 0;
                rect.right = c1913m.getWidth();
                rect.bottom = c1913m.getHeight();
            } else {
                rect = null;
            }
            c1913m.setClipBounds(rect);
        }
        Canvas canvas = AbstractC0995c.f3160a;
        if (((C0993b) interfaceC1031u).f3149a.isHardwareAccelerated()) {
            this.f6419b.m5074a(interfaceC1031u, c1913m, c1913m.getDrawingTime());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: O */
    public final int mo4696O() {
        return this.f6431n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m4759P(int i9) {
        C1913m c1913m = this.f6421d;
        boolean z9 = true;
        if (i9 == 1) {
            c1913m.setLayerType(2, this.f6424g);
        } else {
            Paint paint = this.f6424g;
            if (i9 == 2) {
                c1913m.setLayerType(0, paint);
                z9 = false;
            } else {
                c1913m.setLayerType(0, paint);
            }
        }
        c1913m.setCanUseCompositingLayer$ui_graphics(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public final void m4760Q() {
        int i9 = this.f6433p;
        if (i9 != 1 && this.f6431n == 3 && this.f6432o == null) {
            m4759P(i9);
        } else {
            m4759P(1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: a */
    public final float mo4697a() {
        return this.f6434q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: b */
    public final float mo4698b() {
        return this.f6436s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: c */
    public final void mo4699c(float f3) {
        this.f6440w = f3;
        this.f6421d.setElevation(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: d */
    public final AbstractC1018n0 mo4700d() {
        return this.f6418A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: e */
    public final void mo4701e(Outline outline, long j3) {
        C1913m c1913m = this.f6421d;
        c1913m.f6450k = outline;
        c1913m.invalidateOutline();
        if ((this.f6430m || c1913m.getClipToOutline()) && outline != null) {
            c1913m.setClipToOutline(true);
            if (this.f6430m) {
                this.f6430m = false;
                this.f6428k = true;
            }
        }
        this.f6429l = outline != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: f */
    public final void mo4702f(float f3) {
        this.f6443z = f3;
        this.f6421d.setRotation(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: g */
    public final void mo4703g(float f3) {
        this.f6439v = f3;
        this.f6421d.setTranslationY(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: h */
    public final void mo4704h(int i9) {
        this.f6431n = i9;
        Paint paint = this.f6424g;
        if (paint == null) {
            paint = new Paint();
            this.f6424g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC0996c0.m2529z(i9)));
        m4760Q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: i */
    public final void mo4705i(float f3) {
        this.f6437t = f3;
        this.f6421d.setScaleY(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: j */
    public final void mo4706j() {
        this.f6419b.removeViewInLayout(this.f6421d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: k */
    public final void mo4707k(C1017n c1017n) {
        this.f6432o = c1017n;
        Paint paint = this.f6424g;
        if (paint == null) {
            paint = new Paint();
            this.f6424g = paint;
        }
        paint.setColorFilter(c1017n != null ? c1017n.f3201a : null);
        m4760Q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: l */
    public final void mo4708l() {
        this.f6421d.setRotationX(0.0f);
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
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: m */
    public final void mo4709m(InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m, C1902b c1902b, C0166f c0166f) {
        C1913m c1913m = this.f6421d;
        ViewParent parent = c1913m.getParent();
        AbstractC2049a abstractC2049a = this.f6419b;
        if (parent == null) {
            abstractC2049a.addView(c1913m);
        }
        c1913m.f6452m = interfaceC4233c;
        c1913m.f6453n = enumC4243m;
        c1913m.f6454o = c0166f;
        c1913m.f6455p = c1902b;
        if (c1913m.isAttachedToWindow()) {
            c1913m.setVisibility(4);
            c1913m.setVisibility(0);
            try {
                C1033v c1033v = this.f6420c;
                C1908h c1908h = f6417B;
                C0993b c0993b = c1033v.f3257a;
                Canvas canvas = c0993b.f3149a;
                c0993b.f3149a = c1908h;
                abstractC2049a.m5074a(c0993b, c1913m, c1913m.getDrawingTime());
                c1033v.f3257a.f3149a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: n */
    public final void mo4710n(float f3) {
        this.f6434q = f3;
        this.f6421d.setAlpha(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: o */
    public final void mo4711o() {
        this.f6421d.setRotationY(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: p */
    public final void mo4712p(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6441x = j3;
            this.f6421d.setOutlineAmbientShadowColor(AbstractC0996c0.m2526w(j3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: q */
    public final void mo4713q(float f3) {
        this.f6436s = f3;
        this.f6421d.setScaleX(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: r */
    public final void mo4714r(boolean z9) {
        boolean z10 = false;
        this.f6430m = z9 && !this.f6429l;
        this.f6428k = true;
        if (z9 && this.f6429l) {
            z10 = true;
        }
        this.f6421d.setClipToOutline(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: s */
    public final void mo4715s(float f3) {
        this.f6438u = f3;
        this.f6421d.setTranslationX(f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: t */
    public final void mo4716t(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6442y = j3;
            this.f6421d.setOutlineSpotShadowColor(AbstractC0996c0.m2526w(j3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: u */
    public final void mo4717u(float f3) {
        this.f6421d.setCameraDistance(f3 * this.f6422e.getDisplayMetrics().densityDpi);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: v */
    public final float mo4718v() {
        return this.f6437t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: w */
    public final int mo4719w() {
        return this.f6433p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: x */
    public final C1017n mo4720x() {
        return this.f6432o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: y */
    public final void mo4721y(int i9, int i10, long j3) {
        boolean zM8534a = C4242l.m8534a(this.f6427j, j3);
        C1913m c1913m = this.f6421d;
        if (zM8534a) {
            int i11 = this.f6425h;
            if (i11 != i9) {
                c1913m.offsetLeftAndRight(i9 - i11);
            }
            int i12 = this.f6426i;
            if (i12 != i10) {
                c1913m.offsetTopAndBottom(i10 - i12);
            }
        } else {
            if (this.f6430m || c1913m.getClipToOutline()) {
                this.f6428k = true;
            }
            int i13 = (int) (j3 >> 32);
            int i14 = (int) (4294967295L & j3);
            c1913m.layout(i9, i10, i9 + i13, i10 + i14);
            this.f6427j = j3;
            if (this.f6435r) {
                c1913m.setPivotX(i13 / 2.0f);
                c1913m.setPivotY(i14 / 2.0f);
            }
        }
        this.f6425h = i9;
        this.f6426i = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p118i1.InterfaceC1904d
    /* JADX INFO: renamed from: z */
    public final float mo4722z() {
        return 0.0f;
    }
}
