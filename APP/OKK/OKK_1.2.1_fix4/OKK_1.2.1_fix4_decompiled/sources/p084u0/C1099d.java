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
    public boolean f4245m = false;

    /* JADX INFO: renamed from: n */
    public Typeface f4246n;

    public C1099d(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0942a.f3347s);
        this.f4243k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f4242j = AbstractC0805P.m2051r(context, typedArrayObtainStyledAttributes, 3);
        AbstractC0805P.m2051r(context, typedArrayObtainStyledAttributes, 4);
        AbstractC0805P.m2051r(context, typedArrayObtainStyledAttributes, 5);
        this.f4235c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f4236d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i3 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f4244l = typedArrayObtainStyledAttributes.getResourceId(i3, 0);
        this.f4234b = typedArrayObtainStyledAttributes.getString(i3);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f4233a = AbstractC0805P.m2051r(context, typedArrayObtainStyledAttributes, 6);
        this.f4237e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f4238f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f4239g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i2, AbstractC0942a.f3340l);
        this.f4240h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f4241i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m2585a() {
        String str;
        Typeface typeface = this.f4246n;
        int i2 = this.f4235c;
        if (typeface == null && (str = this.f4234b) != null) {
            this.f4246n = Typeface.create(str, i2);
        }
        if (this.f4246n == null) {
            int i3 = this.f4236d;
            if (i3 == 1) {
                this.f4246n = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.f4246n = Typeface.SERIF;
            } else if (i3 != 3) {
                this.f4246n = Typeface.DEFAULT;
            } else {
                this.f4246n = Typeface.MONOSPACE;
            }
            this.f4246n = Typeface.create(this.f4246n, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Typeface m2586b(Context context) {
        if (this.f4245m) {
            return this.f4246n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM2583a = AbstractC1094m.m2583a(context, this.f4244l);
                this.f4246n = typefaceM2583a;
                if (typefaceM2583a != null) {
                    this.f4246n = Typeface.create(typefaceM2583a, this.f4235c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        m2585a();
        this.f4245m = true;
        return this.f4246n;
    }

    /* JADX INFO: renamed from: c */
    public final void m2587c(Context context, AbstractC0805P abstractC0805P) {
        if (m2588d(context)) {
            m2586b(context);
        } else {
            m2585a();
        }
        int i2 = this.f4244l;
        if (i2 == 0) {
            this.f4245m = true;
        }
        if (this.f4245m) {
            abstractC0805P.mo2060N(this.f4246n, true);
            return;
        }
        try {
            C1097b c1097b = new C1097b(this, abstractC0805P);
            ThreadLocal threadLocal = AbstractC1094m.f4210a;
            if (context.isRestricted()) {
                c1097b.m2576a(-4);
            } else {
                AbstractC1094m.m2584b(context, i2, new TypedValue(), 0, c1097b, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f4245m = true;
            abstractC0805P.mo2059M(1);
        } catch (Exception unused2) {
            this.f4245m = true;
            abstractC0805P.mo2059M(-3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2588d(Context context) {
        Typeface typefaceM2584b = null;
        int i2 = this.f4244l;
        if (i2 != 0) {
            ThreadLocal threadLocal = AbstractC1094m.f4210a;
            if (!context.isRestricted()) {
                typefaceM2584b = AbstractC1094m.m2584b(context, i2, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM2584b != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m2589e(Context context, TextPaint textPaint, AbstractC0805P abstractC0805P) {
        m2590f(context, textPaint, abstractC0805P);
        ColorStateList colorStateList = this.f4242j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f4233a;
        textPaint.setShadowLayer(this.f4239g, this.f4237e, this.f4238f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m2590f(Context context, TextPaint textPaint, AbstractC0805P abstractC0805P) {
        if (m2588d(context)) {
            m2591g(context, textPaint, m2586b(context));
            return;
        }
        m2585a();
        m2591g(context, textPaint, this.f4246n);
        m2587c(context, new C1098c(this, context, textPaint, abstractC0805P));
    }

    /* JADX INFO: renamed from: g */
    public final void m2591g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM2034J = AbstractC0805P.m2034J(context.getResources().getConfiguration(), typeface);
        if (typefaceM2034J != null) {
            typeface = typefaceM2034J;
        }
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f4235c;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f4243k);
        if (this.f4240h) {
            textPaint.setLetterSpacing(this.f4241i);
        }
    }
}
