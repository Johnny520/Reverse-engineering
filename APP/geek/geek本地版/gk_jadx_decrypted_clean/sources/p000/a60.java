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
public final class a60 {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f46a;

    /* JADX INFO: renamed from: b */
    public final String f47b;

    /* JADX INFO: renamed from: c */
    public final int f48c;

    /* JADX INFO: renamed from: d */
    public final int f49d;

    /* JADX INFO: renamed from: e */
    public final float f50e;

    /* JADX INFO: renamed from: f */
    public final float f51f;

    /* JADX INFO: renamed from: g */
    public final float f52g;

    /* JADX INFO: renamed from: h */
    public final boolean f53h;

    /* JADX INFO: renamed from: i */
    public final float f54i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f55j;

    /* JADX INFO: renamed from: k */
    public float f56k;

    /* JADX INFO: renamed from: l */
    public final int f57l;

    /* JADX INFO: renamed from: m */
    public boolean f58m = false;

    /* JADX INFO: renamed from: n */
    public Typeface f59n;

    public a60(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0873wy.f5066y);
        this.f56k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f55j = AbstractC0126ct.m816n(context, typedArrayObtainStyledAttributes, 3);
        AbstractC0126ct.m816n(context, typedArrayObtainStyledAttributes, 4);
        AbstractC0126ct.m816n(context, typedArrayObtainStyledAttributes, 5);
        this.f48c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f49d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f57l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f47b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f46a = AbstractC0126ct.m816n(context, typedArrayObtainStyledAttributes, 6);
        this.f50e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f51f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f52g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0873wy.f5058q);
        this.f53h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f54i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m18a() {
        String str;
        Typeface typeface = this.f59n;
        int i = this.f48c;
        if (typeface == null && (str = this.f47b) != null) {
            this.f59n = Typeface.create(str, i);
        }
        if (this.f59n == null) {
            int i2 = this.f49d;
            if (i2 == 1) {
                this.f59n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f59n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f59n = Typeface.DEFAULT;
            } else {
                this.f59n = Typeface.MONOSPACE;
            }
            this.f59n = Typeface.create(this.f59n, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Typeface m19b(Context context) {
        if (this.f58m) {
            return this.f59n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM625a = c10.m625a(context, this.f57l);
                this.f59n = typefaceM625a;
                if (typefaceM625a != null) {
                    this.f59n = Typeface.create(typefaceM625a, this.f48c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f47b, e);
            }
        }
        m18a();
        this.f58m = true;
        return this.f59n;
    }

    /* JADX INFO: renamed from: c */
    public final void m20c(Context context, AbstractC0273gt abstractC0273gt) {
        if (m21d(context)) {
            m19b(context);
        } else {
            m18a();
        }
        int i = this.f57l;
        if (i == 0) {
            this.f58m = true;
        }
        if (this.f58m) {
            abstractC0273gt.mo1267q(this.f59n, true);
            return;
        }
        try {
            y50 y50Var = new y50(this, abstractC0273gt);
            ThreadLocal threadLocal = c10.f879a;
            if (context.isRestricted()) {
                y50Var.m2838c(-4);
            } else {
                c10.m626b(context, i, new TypedValue(), 0, y50Var, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f58m = true;
            abstractC0273gt.mo1266p(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f47b, e);
            this.f58m = true;
            abstractC0273gt.mo1266p(-3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m21d(Context context) {
        Typeface typefaceM626b = null;
        int i = this.f57l;
        if (i != 0) {
            ThreadLocal threadLocal = c10.f879a;
            if (!context.isRestricted()) {
                typefaceM626b = c10.m626b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM626b != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m22e(Context context, TextPaint textPaint, AbstractC0273gt abstractC0273gt) {
        m23f(context, textPaint, abstractC0273gt);
        ColorStateList colorStateList = this.f55j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f46a;
        textPaint.setShadowLayer(this.f52g, this.f50e, this.f51f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m23f(Context context, TextPaint textPaint, AbstractC0273gt abstractC0273gt) {
        if (m21d(context)) {
            m24g(context, textPaint, m19b(context));
            return;
        }
        m18a();
        m24g(context, textPaint, this.f59n);
        m20c(context, new z50(this, context, textPaint, abstractC0273gt));
    }

    /* JADX INFO: renamed from: g */
    public final void m24g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM2816G = AbstractC0979zt.m2816G(context.getResources().getConfiguration(), typeface);
        if (typefaceM2816G != null) {
            typeface = typefaceM2816G;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f48c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f56k);
        if (this.f53h) {
            textPaint.setLetterSpacing(this.f54i);
        }
    }
}
