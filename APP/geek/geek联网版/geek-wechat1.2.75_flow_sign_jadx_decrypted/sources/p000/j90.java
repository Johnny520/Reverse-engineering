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
public final class j90 extends a90 {

    /* JADX INFO: renamed from: j */
    public static final PorterDuff.Mode f2681j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public h90 f2682b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f2683c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f2684d;

    /* JADX INFO: renamed from: e */
    public boolean f2685e;

    /* JADX INFO: renamed from: f */
    public boolean f2686f;

    /* JADX INFO: renamed from: g */
    public final float[] f2687g;

    /* JADX INFO: renamed from: h */
    public final Matrix f2688h;

    /* JADX INFO: renamed from: i */
    public final Rect f2689i;

    public j90() {
        this.f2686f = true;
        this.f2687g = new float[9];
        this.f2688h = new Matrix();
        this.f2689i = new Rect();
        h90 h90Var = new h90();
        h90Var.f2145c = null;
        h90Var.f2146d = f2681j;
        h90Var.f2144b = new g90();
        this.f2682b = h90Var;
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m1592a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f55a;
        if (drawable == null) {
            return false;
        }
        AbstractC0187eh.m989b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f55a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f2689i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f2684d;
        if (colorFilter == null) {
            colorFilter = this.f2683c;
        }
        Matrix matrix = this.f2688h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f2687g;
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
        if (isAutoMirrored() && AbstractC0224fh.m1100a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        h90 h90Var = this.f2682b;
        Bitmap bitmap = h90Var.f2148f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != h90Var.f2148f.getHeight()) {
            h90Var.f2148f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            h90Var.f2153k = true;
        }
        if (this.f2686f) {
            h90 h90Var2 = this.f2682b;
            if (h90Var2.f2153k || h90Var2.f2149g != h90Var2.f2145c || h90Var2.f2150h != h90Var2.f2146d || h90Var2.f2152j != h90Var2.f2147e || h90Var2.f2151i != h90Var2.f2144b.getRootAlpha()) {
                h90 h90Var3 = this.f2682b;
                h90Var3.f2148f.eraseColor(0);
                Canvas canvas2 = new Canvas(h90Var3.f2148f);
                g90 g90Var = h90Var3.f2144b;
                g90Var.m1220a(g90Var.f1937g, g90.f1930p, canvas2, iMin, iMin2);
                h90 h90Var4 = this.f2682b;
                h90Var4.f2149g = h90Var4.f2145c;
                h90Var4.f2150h = h90Var4.f2146d;
                h90Var4.f2151i = h90Var4.f2144b.getRootAlpha();
                h90Var4.f2152j = h90Var4.f2147e;
                h90Var4.f2153k = false;
            }
        } else {
            h90 h90Var5 = this.f2682b;
            h90Var5.f2148f.eraseColor(0);
            Canvas canvas3 = new Canvas(h90Var5.f2148f);
            g90 g90Var2 = h90Var5.f2144b;
            g90Var2.m1220a(g90Var2.f1937g, g90.f1930p, canvas3, iMin, iMin2);
        }
        h90 h90Var6 = this.f2682b;
        if (h90Var6.f2144b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (h90Var6.f2154l == null) {
                Paint paint2 = new Paint();
                h90Var6.f2154l = paint2;
                paint2.setFilterBitmap(true);
            }
            h90Var6.f2154l.setAlpha(h90Var6.f2144b.getRootAlpha());
            h90Var6.f2154l.setColorFilter(colorFilter);
            paint = h90Var6.f2154l;
        }
        canvas.drawBitmap(h90Var6.f2148f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f55a;
        return drawable != null ? AbstractC0151dh.m922a(drawable) : this.f2682b.f2144b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f55a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2682b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f55a;
        return drawable != null ? AbstractC0187eh.m990c(drawable) : this.f2684d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f55a != null) {
            return new i90(this.f55a.getConstantState());
        }
        this.f2682b.f2143a = getChangingConfigurations();
        return this.f2682b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f55a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2682b.f2144b.f1939i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f55a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2682b.f2144b.f1938h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f55a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f55a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f55a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f55a;
        return drawable != null ? AbstractC0151dh.m925d(drawable) : this.f2682b.f2147e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f55a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h90 h90Var = this.f2682b;
        if (h90Var == null) {
            return false;
        }
        g90 g90Var = h90Var.f2144b;
        if (g90Var.f1944n == null) {
            g90Var.f1944n = Boolean.valueOf(g90Var.f1937g.mo596a());
        }
        if (g90Var.f1944n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f2682b.f2145c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f55a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2685e && super.mutate() == this) {
            h90 h90Var = this.f2682b;
            h90 h90Var2 = new h90();
            h90Var2.f2145c = null;
            h90Var2.f2146d = f2681j;
            if (h90Var != null) {
                h90Var2.f2143a = h90Var.f2143a;
                g90 g90Var = new g90(h90Var.f2144b);
                h90Var2.f2144b = g90Var;
                if (h90Var.f2144b.f1935e != null) {
                    g90Var.f1935e = new Paint(h90Var.f2144b.f1935e);
                }
                if (h90Var.f2144b.f1934d != null) {
                    h90Var2.f2144b.f1934d = new Paint(h90Var.f2144b.f1934d);
                }
                h90Var2.f2145c = h90Var.f2145c;
                h90Var2.f2146d = h90Var.f2146d;
                h90Var2.f2147e = h90Var.f2147e;
            }
            this.f2682b = h90Var2;
            this.f2685e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f55a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f55a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h90 h90Var = this.f2682b;
        ColorStateList colorStateList = h90Var.f2145c;
        if (colorStateList == null || (mode = h90Var.f2146d) == null) {
            z = false;
        } else {
            this.f2683c = m1592a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        g90 g90Var = h90Var.f2144b;
        if (g90Var.f1944n == null) {
            g90Var.f1944n = Boolean.valueOf(g90Var.f1937g.mo596a());
        }
        if (g90Var.f1944n.booleanValue()) {
            boolean zMo597b = h90Var.f2144b.f1937g.mo597b(iArr);
            h90Var.f2153k |= zMo597b;
            if (zMo597b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f55a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f55a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f2682b.f2144b.getRootAlpha() != i) {
            this.f2682b.f2144b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f55a;
        if (drawable != null) {
            AbstractC0151dh.m926e(drawable, z);
        } else {
            this.f2682b.f2147e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f55a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2684d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f55a;
        if (drawable != null) {
            AbstractC0493mp.m1840P(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f55a;
        if (drawable != null) {
            AbstractC0187eh.m995h(drawable, colorStateList);
            return;
        }
        h90 h90Var = this.f2682b;
        if (h90Var.f2145c != colorStateList) {
            h90Var.f2145c = colorStateList;
            this.f2683c = m1592a(colorStateList, h90Var.f2146d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f55a;
        if (drawable != null) {
            AbstractC0187eh.m996i(drawable, mode);
            return;
        }
        h90 h90Var = this.f2682b;
        if (h90Var.f2146d != mode) {
            h90Var.f2146d = mode;
            this.f2683c = m1592a(h90Var.f2145c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f55a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f55a;
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
        Drawable drawable = this.f55a;
        if (drawable != null) {
            AbstractC0187eh.m991d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h90 h90Var = this.f2682b;
        h90Var.f2144b = new g90();
        TypedArray typedArrayM1301D = AbstractC0274gu.m1301D(resources, theme, attributeSet, AbstractC0259gf.f1956a);
        h90 h90Var2 = this.f2682b;
        g90 g90Var = h90Var2.f2144b;
        int i3 = !AbstractC0274gu.m1320v(xmlPullParser, "tintMode") ? -1 : typedArrayM1301D.getInt(6, -1);
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
        h90Var2.f2146d = mode;
        ColorStateList colorStateListM2081a = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM1301D.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateListM2081a = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayM1301D.getResources();
                int resourceId = typedArrayM1301D.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0590pb.f3635a;
                try {
                    colorStateListM2081a = AbstractC0590pb.m2081a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList = colorStateListM2081a;
        if (colorStateList != null) {
            h90Var2.f2145c = colorStateList;
        }
        boolean z = h90Var2.f2147e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayM1301D.getBoolean(5, z);
        }
        h90Var2.f2147e = z;
        float f = g90Var.f1940j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM1301D.getFloat(7, f);
        }
        g90Var.f1940j = f;
        float f2 = g90Var.f1941k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayM1301D.getFloat(8, f2);
        }
        g90Var.f1941k = f2;
        if (g90Var.f1940j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM1301D.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            g90Var.f1938h = typedArrayM1301D.getDimension(3, g90Var.f1938h);
            float dimension = typedArrayM1301D.getDimension(2, g90Var.f1939i);
            g90Var.f1939i = dimension;
            if (g90Var.f1938h <= 0.0f) {
                throw new XmlPullParserException(typedArrayM1301D.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = g90Var.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayM1301D.getFloat(4, alpha);
                }
                g90Var.setAlpha(alpha);
                String string = typedArrayM1301D.getString(0);
                if (string != null) {
                    g90Var.f1943m = string;
                    g90Var.f1945o.put(string, g90Var);
                }
                typedArrayM1301D.recycle();
                h90Var.f2143a = getChangingConfigurations();
                h90Var.f2153k = true;
                h90 h90Var3 = this.f2682b;
                g90 g90Var2 = h90Var3.f2144b;
                ArrayDeque arrayDeque = new ArrayDeque();
                d90 d90Var = g90Var2.f1937g;
                C0511n6 c0511n6 = g90Var2.f1945o;
                arrayDeque.push(d90Var);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        d90 d90Var2 = (d90) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            c90 c90Var = new c90();
                            c90Var.f840e = 0.0f;
                            c90Var.f842g = 1.0f;
                            c90Var.f843h = 1.0f;
                            c90Var.f844i = 0.0f;
                            c90Var.f845j = 1.0f;
                            c90Var.f846k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c90Var.f847l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            c90Var.f848m = join2;
                            c90Var.f849n = 4.0f;
                            TypedArray typedArrayM1301D2 = AbstractC0274gu.m1301D(resources, theme, attributeSet, AbstractC0259gf.f1958c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayM1301D2.getString(0);
                                if (string2 != null) {
                                    c90Var.f1774b = string2;
                                }
                                String string3 = typedArrayM1301D2.getString(2);
                                if (string3 != null) {
                                    c90Var.f1773a = AbstractC0274gu.m1312f(string3);
                                }
                                c90Var.f841f = AbstractC0274gu.m1318p(typedArrayM1301D2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = c90Var.f843h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f3 = typedArrayM1301D2.getFloat(12, f3);
                                }
                                c90Var.f843h = f3;
                                int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM1301D2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = c90Var.f847l;
                                if (i6 == 0) {
                                    cap = cap2;
                                } else if (i6 != 1) {
                                    cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                c90Var.f847l = cap;
                                int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM1301D2.getInt(9, -1) : -1;
                                Paint.Join join3 = c90Var.f848m;
                                if (i7 == 0) {
                                    join = join2;
                                } else if (i7 != 1) {
                                    join = i7 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                c90Var.f848m = join;
                                float f4 = c90Var.f849n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f4 = typedArrayM1301D2.getFloat(10, f4);
                                }
                                c90Var.f849n = f4;
                                c90Var.f839d = AbstractC0274gu.m1318p(typedArrayM1301D2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = c90Var.f842g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f5 = typedArrayM1301D2.getFloat(11, f5);
                                }
                                c90Var.f842g = f5;
                                float f6 = c90Var.f840e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f6 = typedArrayM1301D2.getFloat(4, f6);
                                }
                                c90Var.f840e = f6;
                                float f7 = c90Var.f845j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f7 = typedArrayM1301D2.getFloat(6, f7);
                                }
                                c90Var.f845j = f7;
                                float f8 = c90Var.f846k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f8 = typedArrayM1301D2.getFloat(7, f8);
                                }
                                c90Var.f846k = f8;
                                float f9 = c90Var.f844i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f9 = typedArrayM1301D2.getFloat(5, f9);
                                }
                                c90Var.f844i = f9;
                                int i8 = c90Var.f1775c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i8 = typedArrayM1301D2.getInt(13, i8);
                                }
                                c90Var.f1775c = i8;
                            }
                            typedArrayM1301D2.recycle();
                            d90Var2.f1341b.add(c90Var);
                            if (c90Var.getPathName() != null) {
                                c0511n6.put(c90Var.getPathName(), c90Var);
                            }
                            h90Var3.f2143a = h90Var3.f2143a;
                            z2 = false;
                            c = '\b';
                        } else {
                            c = '\b';
                            if ("clip-path".equals(name)) {
                                b90 b90Var = new b90();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayM1301D3 = AbstractC0274gu.m1301D(resources, theme, attributeSet, AbstractC0259gf.f1959d);
                                    String string4 = typedArrayM1301D3.getString(0);
                                    if (string4 != null) {
                                        b90Var.f1774b = string4;
                                    }
                                    String string5 = typedArrayM1301D3.getString(1);
                                    if (string5 != null) {
                                        b90Var.f1773a = AbstractC0274gu.m1312f(string5);
                                    }
                                    b90Var.f1775c = !AbstractC0274gu.m1320v(xmlPullParser, "fillType") ? 0 : typedArrayM1301D3.getInt(2, 0);
                                    typedArrayM1301D3.recycle();
                                }
                                d90Var2.f1341b.add(b90Var);
                                if (b90Var.getPathName() != null) {
                                    c0511n6.put(b90Var.getPathName(), b90Var);
                                }
                                h90Var3.f2143a = h90Var3.f2143a;
                            } else if ("group".equals(name)) {
                                d90 d90Var3 = new d90();
                                TypedArray typedArrayM1301D4 = AbstractC0274gu.m1301D(resources, theme, attributeSet, AbstractC0259gf.f1957b);
                                float f10 = d90Var3.f1342c;
                                if (AbstractC0274gu.m1320v(xmlPullParser, "rotation")) {
                                    f10 = typedArrayM1301D4.getFloat(5, f10);
                                }
                                d90Var3.f1342c = f10;
                                d90Var3.f1343d = typedArrayM1301D4.getFloat(1, d90Var3.f1343d);
                                d90Var3.f1344e = typedArrayM1301D4.getFloat(2, d90Var3.f1344e);
                                float f11 = d90Var3.f1345f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f11 = typedArrayM1301D4.getFloat(3, f11);
                                }
                                d90Var3.f1345f = f11;
                                float f12 = d90Var3.f1346g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f12 = typedArrayM1301D4.getFloat(4, f12);
                                }
                                d90Var3.f1346g = f12;
                                float f13 = d90Var3.f1347h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f13 = typedArrayM1301D4.getFloat(6, f13);
                                }
                                d90Var3.f1347h = f13;
                                float f14 = d90Var3.f1348i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f14 = typedArrayM1301D4.getFloat(7, f14);
                                }
                                d90Var3.f1348i = f14;
                                String string6 = typedArrayM1301D4.getString(0);
                                if (string6 != null) {
                                    d90Var3.f1350k = string6;
                                }
                                d90Var3.m882c();
                                typedArrayM1301D4.recycle();
                                d90Var2.f1341b.add(d90Var3);
                                arrayDeque.push(d90Var3);
                                if (d90Var3.getGroupName() != null) {
                                    c0511n6.put(d90Var3.getGroupName(), d90Var3);
                                }
                                h90Var3.f2143a = h90Var3.f2143a;
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
                    this.f2683c = m1592a(h90Var.f2145c, h90Var.f2146d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM1301D.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM1301D.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public j90(h90 h90Var) {
        this.f2686f = true;
        this.f2687g = new float[9];
        this.f2688h = new Matrix();
        this.f2689i = new Rect();
        this.f2682b = h90Var;
        this.f2683c = m1592a(h90Var.f2145c, h90Var.f2146d);
    }
}
