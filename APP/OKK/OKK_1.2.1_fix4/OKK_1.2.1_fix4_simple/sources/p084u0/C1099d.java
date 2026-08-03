package p084u0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import p056f0.AbstractC0805P;
import p058g0.AbstractC0942a;
import p083u.AbstractC1094m;

/* JADX INFO: renamed from: u0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1099d {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f4233a;

    /* JADX INFO: renamed from: b */
    public final String f4234b;

    /* JADX INFO: renamed from: c */
    public final int f4235c;

    /* JADX INFO: renamed from: d */
    public final int f4236d;

    /* JADX INFO: renamed from: e */
    public final float f4237e;

    /* JADX INFO: renamed from: f */
    public final float f4238f;

    /* JADX INFO: renamed from: g */
    public final float f4239g;

    /* JADX INFO: renamed from: h */
    public final boolean f4240h;

    /* JADX INFO: renamed from: i */
    public final float f4241i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f4242j;

    /* JADX INFO: renamed from: k */
    public float f4243k;

    /* JADX INFO: renamed from: l */
    public final int f4244l;

    /* JADX INFO: renamed from: m */
    public boolean f4245m;

    /* JADX INFO: renamed from: n */
    public Typeface f4246n;

    public C1099d(Context r6, int r7) {
        this.f4245m = false;
        TypedArray r1 = r6.obtainStyledAttributes(r7, AbstractC0942a.f3347s);
        this.f4243k = r1.getDimension(0, 0.0f);
        this.f4242j = AbstractC0805P.m2051r(r6, r1, 3);
        AbstractC0805P.m2051r(r6, r1, 4);
        AbstractC0805P.m2051r(r6, r1, 5);
        this.f4235c = r1.getInt(2, 0);
        this.f4236d = r1.getInt(1, 1);
        int r3 = 12;
        if (r1.hasValue(12) == true) goto L6;
        r3 = 10;
    L6:
        this.f4244l = r1.getResourceId(r3, 0);
        this.f4234b = r1.getString(r3);
        r1.getBoolean(14, false);
        this.f4233a = AbstractC0805P.m2051r(r6, r1, 6);
        this.f4237e = r1.getFloat(7, 0.0f);
        this.f4238f = r1.getFloat(8, 0.0f);
        this.f4239g = r1.getFloat(9, 0.0f);
        r1.recycle();
        TypedArray r62 = r6.obtainStyledAttributes(r7, AbstractC0942a.f3340l);
        this.f4240h = r62.hasValue(0);
        this.f4241i = r62.getFloat(0, 0.0f);
        r62.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m2585a() {
        Typeface r02 = this.f4246n;
        int r1 = this.f4235c;
        if (r02 != null) goto L8;
        String r03 = this.f4234b;
        if (r03 == null) goto L8;
        this.f4246n = Typeface.create(r03, r1);
    L8:
        if (this.f4246n != null) goto L21;
        int r2 = this.f4236d;
        if (r2 != 1) goto L12;
        this.f4246n = Typeface.SANS_SERIF;
    L19:
        this.f4246n = Typeface.create(this.f4246n, r1);
        return;
    L12:
        if (r2 != 2) goto L14;
        this.f4246n = Typeface.SERIF;
        goto L19
    L14:
        if (r2 == 3) goto L16;
        this.f4246n = Typeface.DEFAULT;
        goto L19
    L16:
        this.f4246n = Typeface.MONOSPACE;
        goto L19
    }

    /* JADX INFO: renamed from: b */
    public final Typeface m2586b(Context r2) {
        if (this.f4245m == false) goto L7;
        return this.f4246n;
    L7:
        if (r2.isRestricted() == false) goto L14;
    L11:
        m2585a();
        this.f4245m = true;
        return this.f4246n;
    L14:
        Typeface r22 = AbstractC1094m.m2583a(r2, this.f4244l);     // Catch: Throwable -> L13
        this.f4246n = r22;     // Catch: Throwable -> L13
        if (r22 == null) goto L11;
        this.f4246n = Typeface.create(r22, this.f4235c);     // Catch: Throwable -> L13
        goto L11
    }

    /* JADX INFO: renamed from: c */
    public final void m2587c(Context r9, AbstractC0805P r10) {
        if (m2588d(r9) == false) goto L5;
        m2586b(r9);
    L6:
        int r2 = this.f4244l;
        if (r2 != 0) goto L10;
        this.f4245m = true;
    L10:
        if (this.f4245m == false) goto L22;
        r10.mo2060N(this.f4246n, true);
        return;
    L22:
        C1097b r5 = new C1097b(this, r10);     // Catch: Exception -> L18 Resources.NotFoundException -> L19
        ThreadLocal r1 = AbstractC1094m.f4210a;     // Catch: Exception -> L18 Resources.NotFoundException -> L19
        if (r9.isRestricted() == false) goto L16;
        r5.m2576a(-4);     // Catch: Exception -> L18 Resources.NotFoundException -> L19
    L21:
        return;
    L16:
        AbstractC1094m.m2584b(r9, r2, new TypedValue(), 0, r5, false, false);     // Catch: Exception -> L18 Resources.NotFoundException -> L19
    L19:
        this.f4245m = true;
        r10.mo2059M(1);
        return;
    L18:
        this.f4245m = true;
        r10.mo2059M(-3);
        return;
    L5:
        m2585a();
        goto L6
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2588d(Context r9) {
        Typeface r02 = null;
        int r2 = this.f4244l;
        if (r2 == 0) goto L8;
        ThreadLocal r1 = AbstractC1094m.f4210a;
        if (r9.isRestricted() == true) goto L8;
        r02 = AbstractC1094m.m2584b(r9, r2, new TypedValue(), 0, null, false, true);
    L8:
        if (r02 == null) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m2589e(Context r3, TextPaint r4, AbstractC0805P r5) {
        m2590f(r3, r4, r5);
        ColorStateList r32 = this.f4242j;
        if (r32 == null) goto L5;
        int r33 = r32.getColorForState(r4.drawableState, r32.getDefaultColor());
    L6:
        r4.setColor(r33);
        ColorStateList r34 = this.f4233a;
        if (r34 == null) goto L9;
        int r35 = r34.getColorForState(r4.drawableState, r34.getDefaultColor());
    L10:
        r4.setShadowLayer(this.f4239g, this.f4237e, this.f4238f, r35);
        return;
    L9:
        r35 = 0;
        goto L10
    L5:
        r33 = -16777216;
        goto L6
    }

    /* JADX INFO: renamed from: f */
    public final void m2590f(Context r2, TextPaint r3, AbstractC0805P r4) {
        if (m2588d(r2) == false) goto L5;
        m2591g(r2, r3, m2586b(r2));
        return;
    L5:
        m2585a();
        m2591g(r2, r3, this.f4246n);
        m2587c(r2, new C1098c(this, r2, r3, r4));
    }

    /* JADX INFO: renamed from: g */
    public final void m2591g(Context r1, TextPaint r2, Typeface r3) {
        Typeface r12 = AbstractC0805P.m2034J(r1.getResources().getConfiguration(), r3);
        if (r12 == null) goto L5;
        r3 = r12;
    L5:
        r2.setTypeface(r3);
        int r13 = (~r3.getStyle()) & this.f4235c;
        if ((r13 & 1) == 0) goto L8;
        boolean r32 = true;
    L9:
        r2.setFakeBoldText(r32);
        if ((r13 & 2) == 0) goto L12;
        float r14 = -0.25f;
    L13:
        r2.setTextSkewX(r14);
        r2.setTextSize(this.f4243k);
        if (this.f4240h == false) goto L17;
        r2.setLetterSpacing(this.f4241i);
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
