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
import androidx.compose.foundation.draganddrop.AbstractC0455;
import p161.AbstractC7645;
import p188.AbstractC7772;
import p200.AbstractC7870;
import p253.AbstractC8189;
import p314.AbstractC8669;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言楪苏哲兰世子.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8662 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f24386;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f24387;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f24388;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String f24389;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24390;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ColorStateList f24391;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int f24393;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Typeface f24395;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final float f24396;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float f24397;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ColorStateList f24398;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f24399;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f24400;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final float f24401;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public boolean f24392 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public boolean f24394 = false;

    public C8662(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC7772.f21098);
        this.f24399 = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f24398 = AbstractC8189.m13678(context, typedArrayObtainStyledAttributes, 3);
        AbstractC8189.m13678(context, typedArrayObtainStyledAttributes, 4);
        AbstractC8189.m13678(context, typedArrayObtainStyledAttributes, 5);
        this.f24388 = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f24387 = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f24393 = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f24390 = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f24391 = AbstractC8189.m13678(context, typedArrayObtainStyledAttributes, 6);
        this.f24386 = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f24397 = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f24396 = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC8669.f24425);
        this.f24400 = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f24401 = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        this.f24389 = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14334(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM1158 = AbstractC0455.m1158(context.getResources().getConfiguration(), typeface);
        if (typefaceM1158 != null) {
            typeface = typefaceM1158;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f24388;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f24399);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.f24389);
        if (this.f24400) {
            textPaint.setLetterSpacing(this.f24401);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14335(Context context, TextPaint textPaint, AbstractC9124 abstractC9124) {
        Typeface typeface;
        if (m14337(context) && this.f24392 && (typeface = this.f24395) != null) {
            m14334(context, textPaint, typeface);
            return;
        }
        m14339();
        m14334(context, textPaint, this.f24395);
        m14338(context, new C8663(this, context, textPaint, abstractC9124));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14336(Context context, TextPaint textPaint, AbstractC9124 abstractC9124) {
        m14335(context, textPaint, abstractC9124);
        ColorStateList colorStateList = this.f24398;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f24391;
        textPaint.setShadowLayer(this.f24396, this.f24386, this.f24397, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14337(Context context) throws Exception {
        Context context2;
        Typeface typefaceM12883;
        String string;
        Typeface typefaceCreate;
        XmlResourceParser xml;
        if (this.f24392) {
            return true;
        }
        int i = this.f24393;
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC7645.f20761;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceM12883 = null;
            } else {
                context2 = context;
                typefaceM12883 = AbstractC7645.m12883(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (typefaceM12883 != null) {
                this.f24395 = typefaceM12883;
                this.f24392 = true;
                return true;
            }
            if (!this.f24394) {
                this.f24394 = true;
                Resources resources = context2.getResources();
                int i2 = this.f24393;
                if (i2 == 0 || !resources.getResourceTypeName(i2).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f24388);
                    }
                } else {
                    try {
                        xml = resources.getXml(i2);
                    } catch (Throwable unused) {
                    }
                    while (xml.getEventType() != 1) {
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), AbstractC7870.f21651);
                            string = typedArrayObtainAttributes.getString(7);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f24388);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.f24395 = typefaceCreate2;
                this.f24392 = true;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14338(Context context, AbstractC9124 abstractC9124) {
        if (!m14337(context)) {
            m14339();
        }
        int i = this.f24393;
        if (i == 0) {
            this.f24392 = true;
        }
        if (this.f24392) {
            abstractC9124.mo7192(this.f24395, true);
            return;
        }
        try {
            C8664 c8664 = new C8664(this, abstractC9124);
            ThreadLocal threadLocal = AbstractC7645.f20761;
            if (context.isRestricted()) {
                c8664.m12879(-4);
            } else {
                AbstractC7645.m12883(context, i, new TypedValue(), 0, c8664, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f24392 = true;
            abstractC9124.mo7193(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f24390, e);
            this.f24392 = true;
            abstractC9124.mo7193(-3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14339() {
        String str;
        Typeface typeface = this.f24395;
        int i = this.f24388;
        if (typeface == null && (str = this.f24390) != null) {
            this.f24395 = Typeface.create(str, i);
        }
        if (this.f24395 == null) {
            int i2 = this.f24387;
            if (i2 == 1) {
                this.f24395 = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f24395 = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f24395 = Typeface.DEFAULT;
            } else {
                this.f24395 = Typeface.MONOSPACE;
            }
            this.f24395 = Typeface.create(this.f24395, i);
        }
    }
}
