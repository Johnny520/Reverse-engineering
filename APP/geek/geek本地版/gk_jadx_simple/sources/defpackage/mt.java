package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mt {
    public final MaterialButton a;
    public f30 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public eu m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public RippleDrawable s;
    public int t;

    public mt(MaterialButton r2, f30 r3) {
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = true;
        this.a = r2;
        this.b = r3;
    }

    public final q30 a() {
        RippleDrawable r0 = this.s;
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.getNumberOfLayers() > 1) goto L7;
        return null;
    L7:
        if (this.s.getNumberOfLayers() <= 2) goto L11;
        return (q30) this.s.getDrawable(2);
    L11:
        return (q30) this.s.getDrawable(1);
    }

    public final eu b(boolean r3) {
        RippleDrawable r0 = this.s;
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.getNumberOfLayers() > 0) goto L7;
        return null;
    L7:
        return (eu) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!r3 ? 1 : 0);
    }

    public final void c(f30 r3) {
        this.b = r3;
        if (b(false) == null) goto L6;
        b(false).setShapeAppearanceModel(r3);
    L6:
        if (b(true) == null) goto L9;
        b(true).setShapeAppearanceModel(r3);
    L9:
        if (a() == null) goto L12;
        a().setShapeAppearanceModel(r3);
        return;
    }

    public final void d(int r9, int r10) {
        WeakHashMap r0 = ja0.a;
        MaterialButton r02 = this.a;
        int r1 = t90.f(r02);
        int r2 = r02.getPaddingTop();
        int r3 = t90.e(r02);
        int r4 = r02.getPaddingBottom();
        int r5 = this.e;
        int r6 = this.f;
        this.f = r10;
        this.e = r9;
        if (this.o == true) goto L5;
        e();
    L5:
        t90.k(r02, r1, (r2 + r9) - r5, r3, (r4 + r10) - r6);
    }

    public final void e() {
        eu r0 = new eu(this.b);
        MaterialButton r1 = this.a;
        r0.h(r1.getContext());
        ch.h(r0, this.j);
        PorterDuff.Mode r2 = this.i;
        if (r2 == null) goto L5;
        ch.i(r0, r2);
    L5:
        float r22 = this.h;
        ColorStateList r3 = this.k;
        r0.a.j = r22;
        r0.invalidateSelf();
        du r23 = r0.a;
        if (r23.d == r3) goto L8;
        r23.d = r3;
        r0.onStateChange(r0.getState());
    L8:
        eu r24 = new eu(this.b);
        r24.setTint(0);
        float r4 = this.h;
        if (this.n == false) goto L11;
        int r5 = zt.k(r1, R.attr.colorSurface);
    L12:
        r24.a.j = r4;
        r24.invalidateSelf();
        ColorStateList r42 = ColorStateList.valueOf(r5);
        du r52 = r24.a;
        if (r52.d == r42) goto L15;
        r52.d = r42;
        r24.onStateChange(r24.getState());
    L15:
        eu r43 = new eu(this.b);
        this.m = r43;
        ch.g(r43, -1);
        RippleDrawable r44 = new RippleDrawable(g10.a(this.l), new InsetDrawable(new LayerDrawable(new Drawable[]{r24, r0}), this.c, this.e, this.d, this.f), this.m);
        this.s = r44;
        r1.setInternalBackground(r44);
        eu r02 = b(false);
        if (r02 == null) goto L19;
        r02.i(this.t);
        r02.setState(r1.getDrawableState());
        return;
    L19:
        return;
    L11:
        r5 = 0;
        goto L12
    }

    public final void f() {
        int r0 = 0;
        eu r1 = b(false);
        eu r2 = b(true);
        if (r1 == null) goto L15;
        float r3 = this.h;
        ColorStateList r4 = this.k;
        r1.a.j = r3;
        r1.invalidateSelf();
        du r32 = r1.a;
        if (r32.d == r4) goto L7;
        r32.d = r4;
        r1.onStateChange(r1.getState());
    L7:
        if (r2 == null) goto L16;
        float r12 = this.h;
        if (this.n == false) goto L11;
        r0 = zt.k(this.a, R.attr.colorSurface);
    L11:
        r2.a.j = r12;
        r2.invalidateSelf();
        ColorStateList r02 = ColorStateList.valueOf(r0);
        du r13 = r2.a;
        if (r13.d == r02) goto L17;
        r13.d = r02;
        r2.onStateChange(r2.getState());
        return;
    L17:
        return;
    L16:
        return;
    }
}
