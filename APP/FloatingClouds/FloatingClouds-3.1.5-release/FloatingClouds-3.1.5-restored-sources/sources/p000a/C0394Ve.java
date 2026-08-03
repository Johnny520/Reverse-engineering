package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.material.C1247R;
import p000a.C0787qd;

/* JADX INFO: renamed from: a.Ve */
/* JADX INFO: loaded from: classes.dex */
public final class C0394Ve {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f1506a;

    /* JADX INFO: renamed from: b */
    public final String f1507b;

    /* JADX INFO: renamed from: c */
    public final int f1508c;

    /* JADX INFO: renamed from: d */
    public final int f1509d;

    /* JADX INFO: renamed from: e */
    public final float f1510e;

    /* JADX INFO: renamed from: f */
    public final float f1511f;

    /* JADX INFO: renamed from: g */
    public final float f1512g;

    /* JADX INFO: renamed from: h */
    public final boolean f1513h;

    /* JADX INFO: renamed from: i */
    public final float f1514i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f1515j;

    /* JADX INFO: renamed from: k */
    public float f1516k;

    /* JADX INFO: renamed from: l */
    public final int f1517l;

    /* JADX INFO: renamed from: m */
    public boolean f1518m = false;

    /* JADX INFO: renamed from: n */
    public Typeface f1519n;

    /* JADX INFO: renamed from: a.Ve$a */
    public class a extends C0787qd.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC0472a2 f1520a;

        public a(AbstractC0472a2 abstractC0472a2) {
            this.f1520a = abstractC0472a2;
        }

        @Override // p000a.C0787qd.e
        /* JADX INFO: renamed from: b */
        public final void mo1036b(int i) {
            C0394Ve.this.f1518m = true;
            this.f1520a.mo456d(i);
        }

        @Override // p000a.C0787qd.e
        /* JADX INFO: renamed from: c */
        public final void mo1037c(Typeface typeface) {
            C0394Ve c0394Ve = C0394Ve.this;
            c0394Ve.f1519n = Typeface.create(typeface, c0394Ve.f1508c);
            c0394Ve.f1518m = true;
            this.f1520a.mo457e(c0394Ve.f1519n, false);
        }
    }

    public C0394Ve(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C1247R.styleable.TextAppearance);
        this.f1516k = typedArrayObtainStyledAttributes.getDimension(C1247R.styleable.TextAppearance_android_textSize, 0.0f);
        this.f1515j = C0336Sa.m925b(context, typedArrayObtainStyledAttributes, C1247R.styleable.TextAppearance_android_textColor);
        C0336Sa.m925b(context, typedArrayObtainStyledAttributes, C1247R.styleable.TextAppearance_android_textColorHint);
        C0336Sa.m925b(context, typedArrayObtainStyledAttributes, C1247R.styleable.TextAppearance_android_textColorLink);
        this.f1508c = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.TextAppearance_android_textStyle, 0);
        this.f1509d = typedArrayObtainStyledAttributes.getInt(C1247R.styleable.TextAppearance_android_typeface, 1);
        int i2 = C1247R.styleable.TextAppearance_fontFamily;
        i2 = typedArrayObtainStyledAttributes.hasValue(i2) ? i2 : C1247R.styleable.TextAppearance_android_fontFamily;
        this.f1517l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f1507b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(C1247R.styleable.TextAppearance_textAllCaps, false);
        this.f1506a = C0336Sa.m925b(context, typedArrayObtainStyledAttributes, C1247R.styleable.TextAppearance_android_shadowColor);
        this.f1510e = typedArrayObtainStyledAttributes.getFloat(C1247R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.f1511f = typedArrayObtainStyledAttributes.getFloat(C1247R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.f1512g = typedArrayObtainStyledAttributes.getFloat(C1247R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, C1247R.styleable.MaterialTextAppearance);
        this.f1513h = typedArrayObtainStyledAttributes2.hasValue(C1247R.styleable.MaterialTextAppearance_android_letterSpacing);
        this.f1514i = typedArrayObtainStyledAttributes2.getFloat(C1247R.styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m1029a() {
        String str;
        Typeface typeface = this.f1519n;
        int i = this.f1508c;
        if (typeface == null && (str = this.f1507b) != null) {
            this.f1519n = Typeface.create(str, i);
        }
        if (this.f1519n == null) {
            int i2 = this.f1509d;
            if (i2 == 1) {
                this.f1519n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f1519n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f1519n = Typeface.DEFAULT;
            } else {
                this.f1519n = Typeface.MONOSPACE;
            }
            this.f1519n = Typeface.create(this.f1519n, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Typeface m1030b(Context context) {
        if (this.f1518m) {
            return this.f1519n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM1837a = C0787qd.m1837a(context, this.f1517l);
                this.f1519n = typefaceM1837a;
                if (typefaceM1837a != null) {
                    this.f1519n = Typeface.create(typefaceM1837a, this.f1508c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f1507b, e);
            }
        }
        m1029a();
        this.f1518m = true;
        return this.f1519n;
    }

    /* JADX INFO: renamed from: c */
    public final void m1031c(Context context, AbstractC0472a2 abstractC0472a2) {
        if (m1032d(context)) {
            m1030b(context);
        } else {
            m1029a();
        }
        int i = this.f1517l;
        if (i == 0) {
            this.f1518m = true;
        }
        if (this.f1518m) {
            abstractC0472a2.mo457e(this.f1519n, true);
            return;
        }
        try {
            a aVar = new a(abstractC0472a2);
            ThreadLocal<TypedValue> threadLocal = C0787qd.f3107a;
            if (context.isRestricted()) {
                aVar.m1843a(-4);
            } else {
                C0787qd.m1838b(context, i, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f1518m = true;
            abstractC0472a2.mo456d(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f1507b, e);
            this.f1518m = true;
            abstractC0472a2.mo456d(-3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1032d(Context context) {
        Typeface typefaceM1838b = null;
        int i = this.f1517l;
        if (i != 0) {
            ThreadLocal<TypedValue> threadLocal = C0787qd.f3107a;
            if (!context.isRestricted()) {
                typefaceM1838b = C0787qd.m1838b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceM1838b != null;
    }

    /* JADX INFO: renamed from: e */
    public final void m1033e(Context context, TextPaint textPaint, AbstractC0472a2 abstractC0472a2) {
        m1034f(context, textPaint, abstractC0472a2);
        ColorStateList colorStateList = this.f1515j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f1506a;
        textPaint.setShadowLayer(this.f1512g, this.f1510e, this.f1511f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m1034f(Context context, TextPaint textPaint, AbstractC0472a2 abstractC0472a2) {
        if (m1032d(context)) {
            m1035g(context, textPaint, m1030b(context));
            return;
        }
        m1029a();
        m1035g(context, textPaint, this.f1519n);
        m1031c(context, new C0412We(this, context, textPaint, abstractC0472a2));
    }

    /* JADX INFO: renamed from: g */
    public final void m1035g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM1038a = C0395Vf.m1038a(context.getResources().getConfiguration(), typeface);
        if (typefaceM1038a != null) {
            typeface = typefaceM1038a;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f1508c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1516k);
        if (this.f1513h) {
            textPaint.setLetterSpacing(this.f1514i);
        }
    }
}
