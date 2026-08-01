package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class a60 {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public final ColorStateList j;
    public float k;
    public final int l;
    public boolean m;
    public Typeface n;

    public a60(Context r6, int r7) {
        this.m = false;
        TypedArray r1 = r6.obtainStyledAttributes(r7, wy.y);
        this.k = r1.getDimension(0, 0.0f);
        this.j = ct.n(r6, r1, 3);
        ct.n(r6, r1, 4);
        ct.n(r6, r1, 5);
        this.c = r1.getInt(2, 0);
        this.d = r1.getInt(1, 1);
        int r3 = 12;
        if (r1.hasValue(12) == true) goto L6;
        r3 = 10;
    L6:
        this.l = r1.getResourceId(r3, 0);
        this.b = r1.getString(r3);
        r1.getBoolean(14, false);
        this.a = ct.n(r6, r1, 6);
        this.e = r1.getFloat(7, 0.0f);
        this.f = r1.getFloat(8, 0.0f);
        this.g = r1.getFloat(9, 0.0f);
        r1.recycle();
        TypedArray r62 = r6.obtainStyledAttributes(r7, wy.q);
        this.h = r62.hasValue(0);
        this.i = r62.getFloat(0, 0.0f);
        r62.recycle();
    }

    public final void a() {
        Typeface r0 = this.n;
        int r1 = this.c;
        if (r0 != null) goto L8;
        String r02 = this.b;
        if (r02 == null) goto L8;
        this.n = Typeface.create(r02, r1);
    L8:
        if (this.n != null) goto L21;
        int r2 = this.d;
        if (r2 != 1) goto L12;
        this.n = Typeface.SANS_SERIF;
    L19:
        this.n = Typeface.create(this.n, r1);
        return;
    L12:
        if (r2 != 2) goto L14;
        this.n = Typeface.SERIF;
        goto L19
    L14:
        if (r2 == 3) goto L16;
        this.n = Typeface.DEFAULT;
        goto L19
    L16:
        this.n = Typeface.MONOSPACE;
        goto L19
    }

    public final Typeface b(Context r3) {
        if (this.m == false) goto L7;
        return this.n;
    L7:
        if (r3.isRestricted() == false) goto L17;
    L14:
        a();
        this.m = true;
        return this.n;
    L17:
        Typeface r32 = c10.a(r3, this.l);     // Catch: Exception -> L12 Throwable -> L16
        this.n = r32;     // Catch: Exception -> L12 Throwable -> L16
        if (r32 == null) goto L14;
        this.n = Typeface.create(r32, this.c);     // Catch: Exception -> L12 Throwable -> L16
    L12:
        e = move-exception;
        Log.d("TextAppearance", "Error loading font " + this.b, e);
        goto L14
    }

    public final void c(Context r10, gt r11) {
        if (d(r10) == false) goto L5;
        b(r10);
    L6:
        int r3 = this.l;
        if (r3 != 0) goto L10;
        this.m = true;
    L10:
        if (this.m == false) goto L23;
        r11.q(this.n, true);
        return;
    L23:
        y50 r6 = new y50(this, r11);     // Catch: Exception -> L19 Resources.NotFoundException -> L21
        ThreadLocal r0 = c10.a;     // Catch: Exception -> L19 Resources.NotFoundException -> L21
        if (r10.isRestricted() == false) goto L17;
        r6.c(-4);     // Catch: Exception -> L19 Resources.NotFoundException -> L21
        return;
    L17:
        c10.b(r10, r3, new TypedValue(), 0, r6, false, false);     // Catch: Exception -> L19 Resources.NotFoundException -> L21
        return;
    L21:
        this.m = true;
        r11.p(1);
        return;
    L19:
        e = move-exception;
        Log.d("TextAppearance", "Error loading font " + this.b, e);
        this.m = true;
        r11.p(-3);
        return;
    L5:
        a();
        goto L6
    }

    public final boolean d(Context r9) {
        Typeface r0 = null;
        int r2 = this.l;
        if (r2 == 0) goto L8;
        ThreadLocal r1 = c10.a;
        if (r9.isRestricted() == true) goto L8;
        r0 = c10.b(r9, r2, new TypedValue(), 0, null, false, true);
    L8:
        if (r0 == null) goto L11;
        return true;
    L11:
        return false;
    }

    public final void e(Context r3, TextPaint r4, gt r5) {
        f(r3, r4, r5);
        ColorStateList r32 = this.j;
        if (r32 == null) goto L5;
        int r33 = r32.getColorForState(r4.drawableState, r32.getDefaultColor());
    L6:
        r4.setColor(r33);
        ColorStateList r34 = this.a;
        if (r34 == null) goto L9;
        int r35 = r34.getColorForState(r4.drawableState, r34.getDefaultColor());
    L10:
        r4.setShadowLayer(this.g, this.e, this.f, r35);
        return;
    L9:
        r35 = 0;
        goto L10
    L5:
        r33 = -16777216;
        goto L6
    }

    public final void f(Context r2, TextPaint r3, gt r4) {
        if (d(r2) == false) goto L6;
        g(r2, r3, b(r2));
        return;
    L6:
        a();
        g(r2, r3, this.n);
        c(r2, new z50(this, r2, r3, r4));
    }

    public final void g(Context r1, TextPaint r2, Typeface r3) {
        Typeface r12 = zt.G(r1.getResources().getConfiguration(), r3);
        if (r12 == null) goto L5;
        r3 = r12;
    L5:
        r2.setTypeface(r3);
        int r13 = (~r3.getStyle()) & this.c;
        if ((r13 & 1) == 0) goto L8;
        boolean r32 = true;
    L9:
        r2.setFakeBoldText(r32);
        if ((r13 & 2) == 0) goto L12;
        float r14 = -0.25f;
    L13:
        r2.setTextSkewX(r14);
        r2.setTextSize(this.k);
        if (this.h == false) goto L17;
        r2.setLetterSpacing(this.i);
        return;
    L17:
        return;
    L12:
        r14 = 0.0f;
        goto L13
    L8:
        r32 = false;
        goto L9
    }
}
