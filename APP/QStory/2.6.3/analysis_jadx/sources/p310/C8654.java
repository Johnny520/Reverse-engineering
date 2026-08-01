package p310;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import p161.AbstractC7646;
import p175.AbstractC7739;
import p188.AbstractC7773;
import p200.AbstractC7871;
import p251.AbstractC8175;
import p253.AbstractC8190;
import p314.AbstractC8661;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8654 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f24377;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f24378;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f24379;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f24380;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24381;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ColorStateList f24382;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f24384;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Typeface f24386;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f24387;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float f24388;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ColorStateList f24389;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f24390;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f24391;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float f24392;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f24383 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean f24385 = false;

    public C8654(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC7773.f21095);
        this.f24390 = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f24389 = AbstractC7739.m13073(context, typedArrayObtainStyledAttributes, 3);
        AbstractC7739.m13073(context, typedArrayObtainStyledAttributes, 4);
        AbstractC7739.m13073(context, typedArrayObtainStyledAttributes, 5);
        this.f24379 = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f24378 = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f24384 = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f24381 = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f24382 = AbstractC7739.m13073(context, typedArrayObtainStyledAttributes, 6);
        this.f24377 = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f24388 = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f24387 = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC8661.f24416);
        this.f24391 = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f24392 = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        this.f24380 = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14352(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM13691 = AbstractC8190.m13691(context.getResources().getConfiguration(), typeface);
        if (typefaceM13691 != null) {
            typeface = typefaceM13691;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f24379;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f24390);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.f24380);
        if (this.f24391) {
            textPaint.setLetterSpacing(this.f24392);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14353(Context context, TextPaint textPaint, AbstractC8175 abstractC8175) {
        Typeface typeface;
        if (m14355(context) && this.f24383 && (typeface = this.f24386) != null) {
            m14352(context, textPaint, typeface);
            return;
        }
        m14357();
        m14352(context, textPaint, this.f24386);
        m14356(context, new C8655(this, context, textPaint, abstractC8175));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14354(Context context, TextPaint textPaint, AbstractC8175 abstractC8175) {
        m14353(context, textPaint, abstractC8175);
        ColorStateList colorStateList = this.f24389;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f24382;
        textPaint.setShadowLayer(this.f24387, this.f24377, this.f24388, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14355(Context context) throws Exception {
        Context context2;
        Typeface typefaceM12912;
        String string;
        Typeface typefaceCreate;
        XmlResourceParser xml;
        if (this.f24383) {
            return true;
        }
        int i = this.f24384;
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC7646.f20756;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceM12912 = null;
            } else {
                context2 = context;
                typefaceM12912 = AbstractC7646.m12912(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (typefaceM12912 != null) {
                this.f24386 = typefaceM12912;
                this.f24383 = true;
                return true;
            }
            if (!this.f24385) {
                this.f24385 = true;
                Resources resources = context2.getResources();
                int i2 = this.f24384;
                if (i2 == 0 || !resources.getResourceTypeName(i2).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f24379);
                    }
                } else {
                    try {
                        xml = resources.getXml(i2);
                    } catch (Throwable unused) {
                    }
                    while (xml.getEventType() != 1) {
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), AbstractC7871.f21648);
                            string = typedArrayObtainAttributes.getString(7);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f24379);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.f24386 = typefaceCreate2;
                this.f24383 = true;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14356(Context context, AbstractC8175 abstractC8175) {
        if (!m14355(context)) {
            m14357();
        }
        int i = this.f24384;
        if (i == 0) {
            this.f24383 = true;
        }
        if (this.f24383) {
            abstractC8175.mo7179(this.f24386, true);
            return;
        }
        try {
            C8656 c8656 = new C8656(this, abstractC8175);
            ThreadLocal threadLocal = AbstractC7646.f20756;
            if (context.isRestricted()) {
                c8656.m12908(-4);
            } else {
                AbstractC7646.m12912(context, i, new TypedValue(), 0, c8656, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f24383 = true;
            abstractC8175.mo7180(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f24381, e);
            this.f24383 = true;
            abstractC8175.mo7180(-3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14357() {
        String str;
        Typeface typeface = this.f24386;
        int i = this.f24379;
        if (typeface == null && (str = this.f24381) != null) {
            this.f24386 = Typeface.create(str, i);
        }
        if (this.f24386 == null) {
            int i2 = this.f24378;
            if (i2 == 1) {
                this.f24386 = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f24386 = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f24386 = Typeface.DEFAULT;
            } else {
                this.f24386 = Typeface.MONOSPACE;
            }
            this.f24386 = Typeface.create(this.f24386, i);
        }
    }
}
