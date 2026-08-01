package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public final class g60 {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f1882a;

    /* JADX INFO: renamed from: b */
    public final String f1883b;

    /* JADX INFO: renamed from: c */
    public final int f1884c;

    /* JADX INFO: renamed from: d */
    public final int f1885d;

    /* JADX INFO: renamed from: e */
    public final float f1886e;

    /* JADX INFO: renamed from: f */
    public final float f1887f;

    /* JADX INFO: renamed from: g */
    public final float f1888g;

    /* JADX INFO: renamed from: h */
    public final boolean f1889h;

    /* JADX INFO: renamed from: i */
    public final float f1890i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f1891j;

    /* JADX INFO: renamed from: k */
    public float f1892k;

    /* JADX INFO: renamed from: l */
    public final int f1893l;

    /* JADX INFO: renamed from: m */
    public boolean f1894m = false;

    /* JADX INFO: renamed from: n */
    public Typeface f1895n;

    public g60(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0168dz.f1462y);
        this.f1892k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f1891j = AbstractC0274gu.m1315i(context, typedArrayObtainStyledAttributes, 3);
        AbstractC0274gu.m1315i(context, typedArrayObtainStyledAttributes, 4);
        AbstractC0274gu.m1315i(context, typedArrayObtainStyledAttributes, 5);
        this.f1884c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f1885d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f1893l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f1883b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f1882a = AbstractC0274gu.m1315i(context, typedArrayObtainStyledAttributes, 6);
        this.f1886e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f1887f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f1888g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0168dz.f1454q);
        this.f1889h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f1890i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m1163a() {
        String str;
        Typeface typeface = this.f1895n;
        int i = this.f1884c;
        if (typeface == null && (str = this.f1883b) != null) {
            this.f1895n = Typeface.create(str, i);
        }
        if (this.f1895n == null) {
            int i2 = this.f1885d;
            if (i2 == 1) {
                this.f1895n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f1895n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f1895n = Typeface.DEFAULT;
            } else {
                this.f1895n = Typeface.MONOSPACE;
            }
            this.f1895n = Typeface.create(this.f1895n, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Typeface m1164b(Context context) {
        if (this.f1894m) {
            return this.f1895n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM1563a = j10.m1563a(context, this.f1893l);
                this.f1895n = typefaceM1563a;
                if (typefaceM1563a != null) {
                    this.f1895n = Typeface.create(typefaceM1563a, this.f1884c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f1883b, e);
            }
        }
        m1163a();
        this.f1894m = true;
        return this.f1895n;
    }

    /* JADX INFO: renamed from: c */
    public final void m1165c(Context context, AbstractC0387ju abstractC0387ju) {
        if (m1166d(context)) {
            m1164b(context);
        } else {
            m1163a();
        }
        int i = this.f1893l;
        if (i == 0) {
            this.f1894m = true;
        }
        if (this.f1894m) {
            abstractC0387ju.mo1074s(this.f1895n, true);
            return;
        }
        try {
            e60 e60Var = new e60(this, abstractC0387ju);
            ThreadLocal threadLocal = j10.f2646a;
            if (context.isRestricted()) {
                e60Var.m1902a(-4);
            } else {
                j10.m1564b(context, i, new TypedValue(), 0, e60Var, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1894m = true;
            abstractC0387ju.mo1073r(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f1883b, e);
            this.f1894m = true;
            abstractC0387ju.mo1073r(-3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1166d(Context context) {
        Typeface typefaceM1564b = null;
        int i = this.f1893l;
        if (i != 0) {
            ThreadLocal threadLocal = j10.f2646a;
            if (!context.isRestricted()) {
                typefaceM1564b = j10.m1564b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM1564b != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m1167e(Context context, TextPaint textPaint, AbstractC0387ju abstractC0387ju) {
        m1168f(context, textPaint, abstractC0387ju);
        ColorStateList colorStateList = this.f1891j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f1882a;
        textPaint.setShadowLayer(this.f1888g, this.f1886e, this.f1887f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m1168f(Context context, TextPaint textPaint, AbstractC0387ju abstractC0387ju) {
        if (m1166d(context)) {
            m1169g(context, textPaint, m1164b(context));
            return;
        }
        m1163a();
        m1169g(context, textPaint, this.f1895n);
        m1165c(context, new f60(this, context, textPaint, abstractC0387ju));
    }

    /* JADX INFO: renamed from: g */
    public final void m1169g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM1299B = AbstractC0274gu.m1299B(context.getResources().getConfiguration(), typeface);
        if (typefaceM1299B != null) {
            typeface = typefaceM1299B;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f1884c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1892k);
        if (this.f1889h) {
            textPaint.setLetterSpacing(this.f1890i);
        }
    }
}
