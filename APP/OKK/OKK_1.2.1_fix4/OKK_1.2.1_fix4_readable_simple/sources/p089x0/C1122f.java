package p089x0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p079r0.C1065a;

/* JADX INFO: renamed from: x0.f */
/* JADX INFO: loaded from: classes.dex */
public class C1122f extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public C1127k f4290a;

    /* JADX INFO: renamed from: b */
    public C1065a f4291b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f4292c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f4293d;

    /* JADX INFO: renamed from: e */
    public final ColorStateList f4294e;

    /* JADX INFO: renamed from: f */
    public ColorStateList f4295f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f4296g;

    /* JADX INFO: renamed from: h */
    public Rect f4297h;

    /* JADX INFO: renamed from: i */
    public final float f4298i;

    /* JADX INFO: renamed from: j */
    public float f4299j;

    /* JADX INFO: renamed from: k */
    public float f4300k;

    /* JADX INFO: renamed from: l */
    public int f4301l;

    /* JADX INFO: renamed from: m */
    public float f4302m;

    /* JADX INFO: renamed from: n */
    public float f4303n;

    /* JADX INFO: renamed from: o */
    public final float f4304o;

    /* JADX INFO: renamed from: p */
    public final int f4305p;

    /* JADX INFO: renamed from: q */
    public int f4306q;

    /* JADX INFO: renamed from: r */
    public int f4307r;

    /* JADX INFO: renamed from: s */
    public final int f4308s;

    /* JADX INFO: renamed from: t */
    public final boolean f4309t;

    /* JADX INFO: renamed from: u */
    public final Paint.Style f4310u;

    public C1122f(C1127k r3) {
        this.f4292c = null;
        this.f4293d = null;
        this.f4294e = null;
        this.f4295f = null;
        this.f4296g = PorterDuff.Mode.SRC_IN;
        this.f4297h = null;
        this.f4298i = 1.0f;
        this.f4299j = 1.0f;
        this.f4301l = 255;
        this.f4302m = 0.0f;
        this.f4303n = 0.0f;
        this.f4304o = 0.0f;
        this.f4305p = 0;
        this.f4306q = 0;
        this.f4307r = 0;
        this.f4308s = 0;
        this.f4309t = false;
        this.f4310u = Paint.Style.FILL_AND_STROKE;
        this.f4290a = r3;
        this.f4291b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C1123g r02 = new C1123g(this);
        r02.f4316e = true;
        return r02;
    }

    public C1122f(C1122f r3) {
        this.f4292c = null;
        this.f4293d = null;
        this.f4294e = null;
        this.f4295f = null;
        this.f4296g = PorterDuff.Mode.SRC_IN;
        this.f4297h = null;
        this.f4298i = 1.0f;
        this.f4299j = 1.0f;
        this.f4301l = 255;
        this.f4302m = 0.0f;
        this.f4303n = 0.0f;
        this.f4304o = 0.0f;
        this.f4305p = 0;
        this.f4306q = 0;
        this.f4307r = 0;
        this.f4308s = 0;
        this.f4309t = false;
        this.f4310u = Paint.Style.FILL_AND_STROKE;
        this.f4290a = r3.f4290a;
        this.f4291b = r3.f4291b;
        this.f4300k = r3.f4300k;
        this.f4292c = r3.f4292c;
        this.f4293d = r3.f4293d;
        this.f4296g = r3.f4296g;
        this.f4295f = r3.f4295f;
        this.f4301l = r3.f4301l;
        this.f4298i = r3.f4298i;
        this.f4307r = r3.f4307r;
        this.f4305p = r3.f4305p;
        this.f4309t = r3.f4309t;
        this.f4299j = r3.f4299j;
        this.f4302m = r3.f4302m;
        this.f4303n = r3.f4303n;
        this.f4304o = r3.f4304o;
        this.f4306q = r3.f4306q;
        this.f4308s = r3.f4308s;
        this.f4294e = r3.f4294e;
        this.f4310u = r3.f4310u;
        if (r3.f4297h == null) goto L6;
        this.f4297h = new Rect(r3.f4297h);
        return;
    }
}
