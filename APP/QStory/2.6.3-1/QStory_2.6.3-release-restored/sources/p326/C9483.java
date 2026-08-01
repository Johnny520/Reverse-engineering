package p326;

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
import p177.AbstractC8475;
import p191.AbstractC8568;
import p204.AbstractC8602;
import p216.AbstractC8700;
import p267.AbstractC9004;
import p269.AbstractC9019;
import p330.AbstractC9490;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9483 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f24722;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f24723;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f24724;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f24725;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24726;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ColorStateList f24727;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f24729;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Typeface f24731;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f24732;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float f24733;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ColorStateList f24734;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f24735;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f24736;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float f24737;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f24728 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean f24730 = false;

    public C9483(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC8602.f21440);
        this.f24735 = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f24734 = AbstractC8568.m13632(context, typedArrayObtainStyledAttributes, 3);
        AbstractC8568.m13632(context, typedArrayObtainStyledAttributes, 4);
        AbstractC8568.m13632(context, typedArrayObtainStyledAttributes, 5);
        this.f24724 = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f24723 = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f24729 = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f24726 = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f24727 = AbstractC8568.m13632(context, typedArrayObtainStyledAttributes, 6);
        this.f24722 = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f24733 = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f24732 = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC9490.f24761);
        this.f24736 = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f24737 = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        this.f24725 = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14911(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM14250 = AbstractC9019.m14250(context.getResources().getConfiguration(), typeface);
        if (typefaceM14250 != null) {
            typeface = typefaceM14250;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f24724;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f24735);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.f24725);
        if (this.f24736) {
            textPaint.setLetterSpacing(this.f24737);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14912(Context context, TextPaint textPaint, AbstractC9004 abstractC9004) {
        Typeface typeface;
        if (m14914(context) && this.f24728 && (typeface = this.f24731) != null) {
            m14911(context, textPaint, typeface);
            return;
        }
        m14916();
        m14911(context, textPaint, this.f24731);
        m14915(context, new C9484(this, context, textPaint, abstractC9004));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14913(Context context, TextPaint textPaint, AbstractC9004 abstractC9004) {
        m14912(context, textPaint, abstractC9004);
        ColorStateList colorStateList = this.f24734;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f24727;
        textPaint.setShadowLayer(this.f24732, this.f24722, this.f24733, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14914(Context context) throws Exception {
        Context context2;
        Typeface typefaceM13471;
        String string;
        Typeface typefaceCreate;
        XmlResourceParser xml;
        if (this.f24728) {
            return true;
        }
        int i = this.f24729;
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC8475.f21101;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceM13471 = null;
            } else {
                context2 = context;
                typefaceM13471 = AbstractC8475.m13471(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (typefaceM13471 != null) {
                this.f24731 = typefaceM13471;
                this.f24728 = true;
                return true;
            }
            if (!this.f24730) {
                this.f24730 = true;
                Resources resources = context2.getResources();
                int i2 = this.f24729;
                if (i2 == 0 || !resources.getResourceTypeName(i2).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f24724);
                    }
                } else {
                    try {
                        xml = resources.getXml(i2);
                    } catch (Throwable unused) {
                    }
                    while (xml.getEventType() != 1) {
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), AbstractC8700.f21993);
                            string = typedArrayObtainAttributes.getString(7);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f24724);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.f24731 = typefaceCreate2;
                this.f24728 = true;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14915(Context context, AbstractC9004 abstractC9004) {
        if (!m14914(context)) {
            m14916();
        }
        int i = this.f24729;
        if (i == 0) {
            this.f24728 = true;
        }
        if (this.f24728) {
            abstractC9004.mo7738(this.f24731, true);
            return;
        }
        try {
            C9485 c9485 = new C9485(this, abstractC9004);
            ThreadLocal threadLocal = AbstractC8475.f21101;
            if (context.isRestricted()) {
                c9485.m13467(-4);
            } else {
                AbstractC8475.m13471(context, i, new TypedValue(), 0, c9485, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f24728 = true;
            abstractC9004.mo7739(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f24726, e);
            this.f24728 = true;
            abstractC9004.mo7739(-3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14916() {
        String str;
        Typeface typeface = this.f24731;
        int i = this.f24724;
        if (typeface == null && (str = this.f24726) != null) {
            this.f24731 = Typeface.create(str, i);
        }
        if (this.f24731 == null) {
            int i2 = this.f24723;
            if (i2 == 1) {
                this.f24731 = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f24731 = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f24731 = Typeface.DEFAULT;
            } else {
                this.f24731 = Typeface.MONOSPACE;
            }
            this.f24731 = Typeface.create(this.f24731, i);
        }
    }
}
