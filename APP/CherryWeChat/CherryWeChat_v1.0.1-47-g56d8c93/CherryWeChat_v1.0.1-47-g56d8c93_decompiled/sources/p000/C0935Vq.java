package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: Vq */
/* JADX INFO: loaded from: classes.dex */
public class C0935Vq extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public C0728Qx f2902a;

    /* JADX INFO: renamed from: b */
    public C1301cz f2903b;

    /* JADX INFO: renamed from: c */
    public C2101jf f2904c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f2905d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f2906e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f2907f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f2908g;

    /* JADX INFO: renamed from: h */
    public Rect f2909h;

    /* JADX INFO: renamed from: i */
    public final float f2910i;

    /* JADX INFO: renamed from: j */
    public float f2911j;

    /* JADX INFO: renamed from: k */
    public float f2912k;

    /* JADX INFO: renamed from: l */
    public int f2913l;

    /* JADX INFO: renamed from: m */
    public float f2914m;

    /* JADX INFO: renamed from: n */
    public float f2915n;

    /* JADX INFO: renamed from: o */
    public int f2916o;

    /* JADX INFO: renamed from: p */
    public int f2917p;

    /* JADX INFO: renamed from: q */
    public final Paint.Style f2918q;

    public C0935Vq(C0728Qx c0728Qx) {
        this.f2905d = null;
        this.f2906e = null;
        this.f2907f = null;
        this.f2908g = PorterDuff.Mode.SRC_IN;
        this.f2909h = null;
        this.f2910i = 1.0f;
        this.f2911j = 1.0f;
        this.f2913l = 255;
        this.f2914m = 0.0f;
        this.f2915n = 0.0f;
        this.f2916o = 0;
        this.f2917p = 0;
        this.f2918q = Paint.Style.FILL_AND_STROKE;
        this.f2902a = c0728Qx;
        this.f2904c = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C1021Xq c1021Xq = new C1021Xq(this);
        c1021Xq.f3245f = true;
        c1021Xq.f3246g = true;
        return c1021Xq;
    }

    public C0935Vq(C0935Vq c0935Vq) {
        this.f2905d = null;
        this.f2906e = null;
        this.f2907f = null;
        this.f2908g = PorterDuff.Mode.SRC_IN;
        this.f2909h = null;
        this.f2910i = 1.0f;
        this.f2911j = 1.0f;
        this.f2913l = 255;
        this.f2914m = 0.0f;
        this.f2915n = 0.0f;
        this.f2916o = 0;
        this.f2917p = 0;
        this.f2918q = Paint.Style.FILL_AND_STROKE;
        this.f2902a = c0935Vq.f2902a;
        this.f2903b = c0935Vq.f2903b;
        this.f2904c = c0935Vq.f2904c;
        this.f2912k = c0935Vq.f2912k;
        this.f2905d = c0935Vq.f2905d;
        this.f2906e = c0935Vq.f2906e;
        this.f2908g = c0935Vq.f2908g;
        this.f2907f = c0935Vq.f2907f;
        this.f2913l = c0935Vq.f2913l;
        this.f2910i = c0935Vq.f2910i;
        this.f2917p = c0935Vq.f2917p;
        this.f2911j = c0935Vq.f2911j;
        this.f2914m = c0935Vq.f2914m;
        this.f2915n = c0935Vq.f2915n;
        this.f2916o = c0935Vq.f2916o;
        this.f2918q = c0935Vq.f2918q;
        if (c0935Vq.f2909h != null) {
            this.f2909h = new Rect(c0935Vq.f2909h);
        }
    }
}
