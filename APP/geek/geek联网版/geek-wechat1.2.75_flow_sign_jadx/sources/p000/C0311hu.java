package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: hu */
/* JADX INFO: loaded from: classes.dex */
public class C0311hu extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public m30 f2266a;

    /* JADX INFO: renamed from: b */
    public C0967zh f2267b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f2268c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f2269d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f2270e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f2271f;

    /* JADX INFO: renamed from: g */
    public Rect f2272g;

    /* JADX INFO: renamed from: h */
    public final float f2273h;

    /* JADX INFO: renamed from: i */
    public float f2274i;

    /* JADX INFO: renamed from: j */
    public float f2275j;

    /* JADX INFO: renamed from: k */
    public int f2276k;

    /* JADX INFO: renamed from: l */
    public float f2277l;

    /* JADX INFO: renamed from: m */
    public float f2278m;

    /* JADX INFO: renamed from: n */
    public int f2279n;

    /* JADX INFO: renamed from: o */
    public int f2280o;

    /* JADX INFO: renamed from: p */
    public final Paint.Style f2281p;

    public C0311hu(m30 m30Var) {
        this.f2268c = null;
        this.f2269d = null;
        this.f2270e = null;
        this.f2271f = PorterDuff.Mode.SRC_IN;
        this.f2272g = null;
        this.f2273h = 1.0f;
        this.f2274i = 1.0f;
        this.f2276k = 255;
        this.f2277l = 0.0f;
        this.f2278m = 0.0f;
        this.f2279n = 0;
        this.f2280o = 0;
        this.f2281p = Paint.Style.FILL_AND_STROKE;
        this.f2266a = m30Var;
        this.f2267b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C0350iu c0350iu = new C0350iu(this);
        c0350iu.f2589e = true;
        return c0350iu;
    }

    public C0311hu(C0311hu c0311hu) {
        this.f2268c = null;
        this.f2269d = null;
        this.f2270e = null;
        this.f2271f = PorterDuff.Mode.SRC_IN;
        this.f2272g = null;
        this.f2273h = 1.0f;
        this.f2274i = 1.0f;
        this.f2276k = 255;
        this.f2277l = 0.0f;
        this.f2278m = 0.0f;
        this.f2279n = 0;
        this.f2280o = 0;
        this.f2281p = Paint.Style.FILL_AND_STROKE;
        this.f2266a = c0311hu.f2266a;
        this.f2267b = c0311hu.f2267b;
        this.f2275j = c0311hu.f2275j;
        this.f2268c = c0311hu.f2268c;
        this.f2269d = c0311hu.f2269d;
        this.f2271f = c0311hu.f2271f;
        this.f2270e = c0311hu.f2270e;
        this.f2276k = c0311hu.f2276k;
        this.f2273h = c0311hu.f2273h;
        this.f2280o = c0311hu.f2280o;
        this.f2274i = c0311hu.f2274i;
        this.f2277l = c0311hu.f2277l;
        this.f2278m = c0311hu.f2278m;
        this.f2279n = c0311hu.f2279n;
        this.f2281p = c0311hu.f2281p;
        if (c0311hu.f2272g != null) {
            this.f2272g = new Rect(c0311hu.f2272g);
        }
    }
}
