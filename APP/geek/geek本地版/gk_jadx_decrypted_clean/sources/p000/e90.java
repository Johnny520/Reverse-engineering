package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class e90 extends v80 {

    /* JADX INFO: renamed from: j */
    public static final PorterDuff.Mode f1756j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public c90 f1757b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f1758c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f1759d;

    /* JADX INFO: renamed from: e */
    public boolean f1760e;

    /* JADX INFO: renamed from: f */
    public boolean f1761f;

    /* JADX INFO: renamed from: g */
    public final float[] f1762g;

    /* JADX INFO: renamed from: h */
    public final Matrix f1763h;

    /* JADX INFO: renamed from: i */
    public final Rect f1764i;

    public e90() {
        this.f1761f = true;
        this.f1762g = new float[9];
        this.f1763h = new Matrix();
        this.f1764i = new Rect();
        c90 c90Var = new c90();
        c90Var.f931c = null;
        c90Var.f932d = f1756j;
        c90Var.f930b = new b90();
        this.f1757b = c90Var;
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m1004a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4819a;
        if (drawable == null) {
            return false;
        }
        AbstractC0104ch.m682b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f1764i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f1759d;
        if (colorFilter == null) {
            colorFilter = this.f1758c;
        }
        Matrix matrix = this.f1763h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f1762g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && AbstractC0151dh.m941a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        c90 c90Var = this.f1757b;
        Bitmap bitmap = c90Var.f934f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c90Var.f934f.getHeight()) {
            c90Var.f934f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c90Var.f939k = true;
        }
        if (this.f1761f) {
            c90 c90Var2 = this.f1757b;
            if (c90Var2.f939k || c90Var2.f935g != c90Var2.f931c || c90Var2.f936h != c90Var2.f932d || c90Var2.f938j != c90Var2.f933e || c90Var2.f937i != c90Var2.f930b.getRootAlpha()) {
                c90 c90Var3 = this.f1757b;
                c90Var3.f934f.eraseColor(0);
                Canvas canvas2 = new Canvas(c90Var3.f934f);
                b90 b90Var = c90Var3.f930b;
                b90Var.m548a(b90Var.f794g, b90.f787p, canvas2, iMin, iMin2);
                c90 c90Var4 = this.f1757b;
                c90Var4.f935g = c90Var4.f931c;
                c90Var4.f936h = c90Var4.f932d;
                c90Var4.f937i = c90Var4.f930b.getRootAlpha();
                c90Var4.f938j = c90Var4.f933e;
                c90Var4.f939k = false;
            }
        } else {
            c90 c90Var5 = this.f1757b;
            c90Var5.f934f.eraseColor(0);
            Canvas canvas3 = new Canvas(c90Var5.f934f);
            b90 b90Var2 = c90Var5.f930b;
            b90Var2.m548a(b90Var2.f794g, b90.f787p, canvas3, iMin, iMin2);
        }
        c90 c90Var6 = this.f1757b;
        if (c90Var6.f930b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c90Var6.f940l == null) {
                Paint paint2 = new Paint();
                c90Var6.f940l = paint2;
                paint2.setFilterBitmap(true);
            }
            c90Var6.f940l.setAlpha(c90Var6.f930b.getRootAlpha());
            c90Var6.f940l.setColorFilter(colorFilter);
            paint = c90Var6.f940l;
        }
        canvas.drawBitmap(c90Var6.f934f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4819a;
        return drawable != null ? AbstractC0068bh.m555a(drawable) : this.f1757b.f930b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4819a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1757b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4819a;
        return drawable != null ? AbstractC0104ch.m683c(drawable) : this.f1759d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4819a != null) {
            return new d90(this.f4819a.getConstantState());
        }
        this.f1757b.f929a = getChangingConfigurations();
        return this.f1757b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4819a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1757b.f930b.f796i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4819a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1757b.f930b.f795h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4819a;
        return drawable != null ? AbstractC0068bh.m558d(drawable) : this.f1757b.f933e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        c90 c90Var = this.f1757b;
        if (c90Var == null) {
            return false;
        }
        b90 b90Var = c90Var.f930b;
        if (b90Var.f801n == null) {
            b90Var.f801n = Boolean.valueOf(b90Var.f794g.mo2615a());
        }
        if (b90Var.f801n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f1757b.f931c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1760e && super.mutate() == this) {
            c90 c90Var = this.f1757b;
            c90 c90Var2 = new c90();
            c90Var2.f931c = null;
            c90Var2.f932d = f1756j;
            if (c90Var != null) {
                c90Var2.f929a = c90Var.f929a;
                b90 b90Var = new b90(c90Var.f930b);
                c90Var2.f930b = b90Var;
                if (c90Var.f930b.f792e != null) {
                    b90Var.f792e = new Paint(c90Var.f930b.f792e);
                }
                if (c90Var.f930b.f791d != null) {
                    c90Var2.f930b.f791d = new Paint(c90Var.f930b.f791d);
                }
                c90Var2.f931c = c90Var.f931c;
                c90Var2.f932d = c90Var.f932d;
                c90Var2.f933e = c90Var.f933e;
            }
            this.f1757b = c90Var2;
            this.f1760e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        c90 c90Var = this.f1757b;
        ColorStateList colorStateList = c90Var.f931c;
        if (colorStateList == null || (mode = c90Var.f932d) == null) {
            z = false;
        } else {
            this.f1758c = m1004a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        b90 b90Var = c90Var.f930b;
        if (b90Var.f801n == null) {
            b90Var.f801n = Boolean.valueOf(b90Var.f794g.mo2615a());
        }
        if (b90Var.f801n.booleanValue()) {
            boolean zMo2616b = c90Var.f930b.f794g.mo2616b(iArr);
            c90Var.f939k |= zMo2616b;
            if (zMo2616b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f1757b.f930b.getRootAlpha() != i) {
            this.f1757b.f930b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            AbstractC0068bh.m559e(drawable, z);
        } else {
            this.f1757b.f933e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1759d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            a80.m31E(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            AbstractC0104ch.m688h(drawable, colorStateList);
            return;
        }
        c90 c90Var = this.f1757b;
        if (c90Var.f931c != colorStateList) {
            c90Var.f931c = colorStateList;
            this.f1758c = m1004a(colorStateList, c90Var.f932d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            AbstractC0104ch.m689i(drawable, mode);
            return;
        }
        c90 c90Var = this.f1757b;
        if (c90Var.f932d != mode) {
            c90Var.f932d = mode;
            this.f1758c = m1004a(c90Var.f931c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4819a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        char c;
        int i2;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f4819a;
        if (drawable != null) {
            AbstractC0104ch.m684d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        c90 c90Var = this.f1757b;
        c90Var.f930b = new b90();
        TypedArray typedArrayM2817H = AbstractC0979zt.m2817H(resources, theme, attributeSet, AbstractC0222ff.f1934a);
        c90 c90Var2 = this.f1757b;
        b90 b90Var = c90Var2.f930b;
        int i3 = !AbstractC0979zt.m2836y(xmlPullParser, "tintMode") ? -1 : typedArrayM2817H.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c90Var2.f932d = mode;
        ColorStateList colorStateListM1351a = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM2817H.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateListM1351a = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayM2817H.getResources();
                int resourceId = typedArrayM2817H.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0292hb.f2259a;
                try {
                    colorStateListM1351a = AbstractC0292hb.m1351a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList = colorStateListM1351a;
        if (colorStateList != null) {
            c90Var2.f931c = colorStateList;
        }
        boolean z = c90Var2.f933e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayM2817H.getBoolean(5, z);
        }
        c90Var2.f933e = z;
        float f = b90Var.f797j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM2817H.getFloat(7, f);
        }
        b90Var.f797j = f;
        float f2 = b90Var.f798k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayM2817H.getFloat(8, f2);
        }
        b90Var.f798k = f2;
        if (b90Var.f797j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM2817H.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            b90Var.f795h = typedArrayM2817H.getDimension(3, b90Var.f795h);
            float dimension = typedArrayM2817H.getDimension(2, b90Var.f796i);
            b90Var.f796i = dimension;
            if (b90Var.f795h <= 0.0f) {
                throw new XmlPullParserException(typedArrayM2817H.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = b90Var.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayM2817H.getFloat(4, alpha);
                }
                b90Var.setAlpha(alpha);
                String string = typedArrayM2817H.getString(0);
                if (string != null) {
                    b90Var.f800m = string;
                    b90Var.f802o.put(string, b90Var);
                }
                typedArrayM2817H.recycle();
                c90Var.f929a = getChangingConfigurations();
                c90Var.f939k = true;
                c90 c90Var3 = this.f1757b;
                b90 b90Var2 = c90Var3.f930b;
                ArrayDeque arrayDeque = new ArrayDeque();
                y80 y80Var = b90Var2.f794g;
                C0511n6 c0511n6 = b90Var2.f802o;
                arrayDeque.push(y80Var);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        y80 y80Var2 = (y80) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            x80 x80Var = new x80();
                            x80Var.f5126e = 0.0f;
                            x80Var.f5128g = 1.0f;
                            x80Var.f5129h = 1.0f;
                            x80Var.f5130i = 0.0f;
                            x80Var.f5131j = 1.0f;
                            x80Var.f5132k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            x80Var.f5133l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            x80Var.f5134m = join2;
                            x80Var.f5135n = 4.0f;
                            TypedArray typedArrayM2817H2 = AbstractC0979zt.m2817H(resources, theme, attributeSet, AbstractC0222ff.f1936c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayM2817H2.getString(0);
                                if (string2 != null) {
                                    x80Var.f98b = string2;
                                }
                                String string3 = typedArrayM2817H2.getString(2);
                                if (string3 != null) {
                                    x80Var.f97a = AbstractC0126ct.m813j(string3);
                                }
                                x80Var.f5127f = AbstractC0979zt.m2831p(typedArrayM2817H2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = x80Var.f5129h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f3 = typedArrayM2817H2.getFloat(12, f3);
                                }
                                x80Var.f5129h = f3;
                                int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM2817H2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = x80Var.f5133l;
                                if (i6 == 0) {
                                    cap = cap2;
                                } else if (i6 != 1) {
                                    cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                x80Var.f5133l = cap;
                                int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM2817H2.getInt(9, -1) : -1;
                                Paint.Join join3 = x80Var.f5134m;
                                if (i7 == 0) {
                                    join = join2;
                                } else if (i7 != 1) {
                                    join = i7 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                x80Var.f5134m = join;
                                float f4 = x80Var.f5135n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f4 = typedArrayM2817H2.getFloat(10, f4);
                                }
                                x80Var.f5135n = f4;
                                x80Var.f5125d = AbstractC0979zt.m2831p(typedArrayM2817H2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = x80Var.f5128g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f5 = typedArrayM2817H2.getFloat(11, f5);
                                }
                                x80Var.f5128g = f5;
                                float f6 = x80Var.f5126e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f6 = typedArrayM2817H2.getFloat(4, f6);
                                }
                                x80Var.f5126e = f6;
                                float f7 = x80Var.f5131j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f7 = typedArrayM2817H2.getFloat(6, f7);
                                }
                                x80Var.f5131j = f7;
                                float f8 = x80Var.f5132k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f8 = typedArrayM2817H2.getFloat(7, f8);
                                }
                                x80Var.f5132k = f8;
                                float f9 = x80Var.f5130i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f9 = typedArrayM2817H2.getFloat(5, f9);
                                }
                                x80Var.f5130i = f9;
                                int i8 = x80Var.f99c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i8 = typedArrayM2817H2.getInt(13, i8);
                                }
                                x80Var.f99c = i8;
                            }
                            typedArrayM2817H2.recycle();
                            y80Var2.f5291b.add(x80Var);
                            if (x80Var.getPathName() != null) {
                                c0511n6.put(x80Var.getPathName(), x80Var);
                            }
                            c90Var3.f929a = c90Var3.f929a;
                            z2 = false;
                            c = '\b';
                        } else {
                            c = '\b';
                            if ("clip-path".equals(name)) {
                                w80 w80Var = new w80();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayM2817H3 = AbstractC0979zt.m2817H(resources, theme, attributeSet, AbstractC0222ff.f1937d);
                                    String string4 = typedArrayM2817H3.getString(0);
                                    if (string4 != null) {
                                        w80Var.f98b = string4;
                                    }
                                    String string5 = typedArrayM2817H3.getString(1);
                                    if (string5 != null) {
                                        w80Var.f97a = AbstractC0126ct.m813j(string5);
                                    }
                                    w80Var.f99c = !AbstractC0979zt.m2836y(xmlPullParser, "fillType") ? 0 : typedArrayM2817H3.getInt(2, 0);
                                    typedArrayM2817H3.recycle();
                                }
                                y80Var2.f5291b.add(w80Var);
                                if (w80Var.getPathName() != null) {
                                    c0511n6.put(w80Var.getPathName(), w80Var);
                                }
                                c90Var3.f929a = c90Var3.f929a;
                            } else if ("group".equals(name)) {
                                y80 y80Var3 = new y80();
                                TypedArray typedArrayM2817H4 = AbstractC0979zt.m2817H(resources, theme, attributeSet, AbstractC0222ff.f1935b);
                                float f10 = y80Var3.f5292c;
                                if (AbstractC0979zt.m2836y(xmlPullParser, "rotation")) {
                                    f10 = typedArrayM2817H4.getFloat(5, f10);
                                }
                                y80Var3.f5292c = f10;
                                y80Var3.f5293d = typedArrayM2817H4.getFloat(1, y80Var3.f5293d);
                                y80Var3.f5294e = typedArrayM2817H4.getFloat(2, y80Var3.f5294e);
                                float f11 = y80Var3.f5295f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f11 = typedArrayM2817H4.getFloat(3, f11);
                                }
                                y80Var3.f5295f = f11;
                                float f12 = y80Var3.f5296g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f12 = typedArrayM2817H4.getFloat(4, f12);
                                }
                                y80Var3.f5296g = f12;
                                float f13 = y80Var3.f5297h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f13 = typedArrayM2817H4.getFloat(6, f13);
                                }
                                y80Var3.f5297h = f13;
                                float f14 = y80Var3.f5298i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f14 = typedArrayM2817H4.getFloat(7, f14);
                                }
                                y80Var3.f5298i = f14;
                                String string6 = typedArrayM2817H4.getString(0);
                                if (string6 != null) {
                                    y80Var3.f5300k = string6;
                                }
                                y80Var3.m2654c();
                                typedArrayM2817H4.recycle();
                                y80Var2.f5291b.add(y80Var3);
                                arrayDeque.push(y80Var3);
                                if (y80Var3.getGroupName() != null) {
                                    c0511n6.put(y80Var3.getGroupName(), y80Var3);
                                }
                                c90Var3.f929a = c90Var3.f929a;
                            }
                        }
                        i2 = 1;
                    } else {
                        i = depth;
                        c = '\b';
                        i2 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i4 = i2;
                    depth = i;
                }
                if (!z2) {
                    this.f1758c = m1004a(c90Var.f931c, c90Var.f932d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM2817H.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM2817H.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public e90(c90 c90Var) {
        this.f1761f = true;
        this.f1762g = new float[9];
        this.f1763h = new Matrix();
        this.f1764i = new Rect();
        this.f1757b = c90Var;
        this.f1758c = m1004a(c90Var.f931c, c90Var.f932d);
    }
}
