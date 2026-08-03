package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import android.util.Xml;

/* JADX INFO: renamed from: qA */
/* JADX INFO: loaded from: classes.dex */
public final class C2404qA {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f8422a;

    /* JADX INFO: renamed from: b */
    public final String f8423b;

    /* JADX INFO: renamed from: c */
    public final String f8424c;

    /* JADX INFO: renamed from: d */
    public final int f8425d;

    /* JADX INFO: renamed from: e */
    public final int f8426e;

    /* JADX INFO: renamed from: f */
    public final float f8427f;

    /* JADX INFO: renamed from: g */
    public final float f8428g;

    /* JADX INFO: renamed from: h */
    public final float f8429h;

    /* JADX INFO: renamed from: i */
    public final boolean f8430i;

    /* JADX INFO: renamed from: j */
    public final float f8431j;

    /* JADX INFO: renamed from: k */
    public final ColorStateList f8432k;

    /* JADX INFO: renamed from: l */
    public float f8433l;

    /* JADX INFO: renamed from: m */
    public final int f8434m;

    /* JADX INFO: renamed from: n */
    public boolean f8435n = false;

    /* JADX INFO: renamed from: o */
    public boolean f8436o = false;

    /* JADX INFO: renamed from: p */
    public Typeface f8437p;

    public C2404qA(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0982Wu.f3088w);
        this.f8433l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f8432k = AbstractC0828TB.m1643j(context, typedArrayObtainStyledAttributes, 3);
        AbstractC0828TB.m1643j(context, typedArrayObtainStyledAttributes, 4);
        AbstractC0828TB.m1643j(context, typedArrayObtainStyledAttributes, 5);
        this.f8425d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f8426e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f8434m = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f8423b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f8422a = AbstractC0828TB.m1643j(context, typedArrayObtainStyledAttributes, 6);
        this.f8427f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f8428g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f8429h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0939Vu.f2951t);
        this.f8430i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f8431j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        this.f8424c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m4837a() {
        String str;
        Typeface typeface = this.f8437p;
        int i = this.f8425d;
        if (typeface == null && (str = this.f8423b) != null) {
            this.f8437p = Typeface.create(str, i);
        }
        if (this.f8437p == null) {
            int i2 = this.f8426e;
            if (i2 == 1) {
                this.f8437p = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f8437p = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f8437p = Typeface.DEFAULT;
            } else {
                this.f8437p = Typeface.MONOSPACE;
            }
            this.f8437p = Typeface.create(this.f8437p, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4838b(Context context, AbstractC0295Gu abstractC0295Gu) {
        if (!m4839c(context)) {
            m4837a();
        }
        int i = this.f8434m;
        if (i == 0) {
            this.f8435n = true;
        }
        if (this.f8435n) {
            abstractC0295Gu.mo633z(this.f8437p, true);
            return;
        }
        try {
            C2310oA c2310oA = new C2310oA(this, abstractC0295Gu);
            ThreadLocal threadLocal = AbstractC0125Cw.f295a;
            if (context.isRestricted()) {
                c2310oA.m1161c(-4);
            } else {
                AbstractC0125Cw.m201a(context, i, new TypedValue(), 0, c2310oA, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f8435n = true;
            abstractC0295Gu.mo632y(1);
        } catch (Exception unused2) {
            this.f8435n = true;
            abstractC0295Gu.mo632y(-3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4839c(Context context) {
        Context context2;
        Typeface typefaceM201a;
        String string;
        Typeface typefaceCreate;
        XmlResourceParser xml;
        if (this.f8435n) {
            return true;
        }
        int i = this.f8434m;
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC0125Cw.f295a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceM201a = null;
            } else {
                context2 = context;
                typefaceM201a = AbstractC0125Cw.m201a(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (typefaceM201a != null) {
                this.f8437p = typefaceM201a;
                this.f8435n = true;
                return true;
            }
            if (!this.f8436o) {
                this.f8436o = true;
                Resources resources = context2.getResources();
                int i2 = this.f8434m;
                if (i2 == 0 || !resources.getResourceTypeName(i2).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f8425d);
                    }
                } else {
                    try {
                        xml = resources.getXml(i2);
                    } catch (Throwable unused) {
                    }
                    while (xml.getEventType() != 1) {
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), AbstractC0725Qu.f2311b);
                            string = typedArrayObtainAttributes.getString(7);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f8425d);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.f8437p = typefaceCreate2;
                this.f8435n = true;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m4840d(Context context, TextPaint textPaint, AbstractC0295Gu abstractC0295Gu) {
        m4841e(context, textPaint, abstractC0295Gu);
        ColorStateList colorStateList = this.f8432k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f8422a;
        textPaint.setShadowLayer(this.f8429h, this.f8427f, this.f8428g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: e */
    public final void m4841e(Context context, TextPaint textPaint, AbstractC0295Gu abstractC0295Gu) {
        Typeface typeface;
        if (m4839c(context) && this.f8435n && (typeface = this.f8437p) != null) {
            m4842f(context, textPaint, typeface);
            return;
        }
        m4837a();
        m4842f(context, textPaint, this.f8437p);
        m4838b(context, new C2353pA(this, context, textPaint, abstractC0295Gu));
    }

    /* JADX INFO: renamed from: f */
    public final void m4842f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM1651u = AbstractC0828TB.m1651u(context.getResources().getConfiguration(), typeface);
        if (typefaceM1651u != null) {
            typeface = typefaceM1651u;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f8425d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f8433l);
        textPaint.setFontVariationSettings(this.f8424c);
        if (this.f8430i) {
            textPaint.setLetterSpacing(this.f8431j);
        }
    }
}
