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
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: MD */
/* JADX INFO: loaded from: classes.dex */
public final class C0530MD extends AbstractC0143DD {

    /* JADX INFO: renamed from: j */
    public static final PorterDuff.Mode f1726j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public C0444KD f1727b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f1728c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f1729d;

    /* JADX INFO: renamed from: e */
    public boolean f1730e;

    /* JADX INFO: renamed from: f */
    public boolean f1731f;

    /* JADX INFO: renamed from: g */
    public final float[] f1732g;

    /* JADX INFO: renamed from: h */
    public final Matrix f1733h;

    /* JADX INFO: renamed from: i */
    public final Rect f1734i;

    public C0530MD() {
        this.f1731f = true;
        this.f1732g = new float[9];
        this.f1733h = new Matrix();
        this.f1734i = new Rect();
        C0444KD c0444kd = new C0444KD();
        c0444kd.f1450c = null;
        c0444kd.f1451d = f1726j;
        c0444kd.f1449b = new C0401JD();
        this.f1727b = c0444kd;
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m1025a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f373a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f1734i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f1729d;
        if (colorFilter == null) {
            colorFilter = this.f1728c;
        }
        Matrix matrix = this.f1733h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f1732g;
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
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0444KD c0444kd = this.f1727b;
        Bitmap bitmap = c0444kd.f1453f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c0444kd.f1453f.getHeight()) {
            c0444kd.f1453f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c0444kd.f1458k = true;
        }
        if (this.f1731f) {
            C0444KD c0444kd2 = this.f1727b;
            if (c0444kd2.f1458k || c0444kd2.f1454g != c0444kd2.f1450c || c0444kd2.f1455h != c0444kd2.f1451d || c0444kd2.f1457j != c0444kd2.f1452e || c0444kd2.f1456i != c0444kd2.f1449b.getRootAlpha()) {
                C0444KD c0444kd3 = this.f1727b;
                c0444kd3.f1453f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0444kd3.f1453f);
                C0401JD c0401jd = c0444kd3.f1449b;
                c0401jd.m836a(c0401jd.f1356g, C0401JD.f1349p, canvas2, iMin, iMin2);
                C0444KD c0444kd4 = this.f1727b;
                c0444kd4.f1454g = c0444kd4.f1450c;
                c0444kd4.f1455h = c0444kd4.f1451d;
                c0444kd4.f1456i = c0444kd4.f1449b.getRootAlpha();
                c0444kd4.f1457j = c0444kd4.f1452e;
                c0444kd4.f1458k = false;
            }
        } else {
            C0444KD c0444kd5 = this.f1727b;
            c0444kd5.f1453f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0444kd5.f1453f);
            C0401JD c0401jd2 = c0444kd5.f1449b;
            c0401jd2.m836a(c0401jd2.f1356g, C0401JD.f1349p, canvas3, iMin, iMin2);
        }
        C0444KD c0444kd6 = this.f1727b;
        if (c0444kd6.f1449b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0444kd6.f1459l == null) {
                Paint paint2 = new Paint();
                c0444kd6.f1459l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0444kd6.f1459l.setAlpha(c0444kd6.f1449b.getRootAlpha());
            c0444kd6.f1459l.setColorFilter(colorFilter);
            paint = c0444kd6.f1459l;
        }
        canvas.drawBitmap(c0444kd6.f1453f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.getAlpha() : this.f1727b.f1449b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1727b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.getColorFilter() : this.f1729d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f373a != null) {
            return new C0487LD(this.f373a.getConstantState());
        }
        this.f1727b.f1448a = getChangingConfigurations();
        return this.f1727b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1727b.f1449b.f1358i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1727b.f1449b.f1357h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.isAutoMirrored() : this.f1727b.f1452e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C0444KD c0444kd = this.f1727b;
        if (c0444kd == null) {
            return false;
        }
        C0401JD c0401jd = c0444kd.f1449b;
        if (c0401jd.f1363n == null) {
            c0401jd.f1363n = Boolean.valueOf(c0401jd.f1356g.mo449a());
        }
        if (c0401jd.f1363n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f1727b.f1450c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1730e && super.mutate() == this) {
            C0444KD c0444kd = this.f1727b;
            C0444KD c0444kd2 = new C0444KD();
            c0444kd2.f1450c = null;
            c0444kd2.f1451d = f1726j;
            if (c0444kd != null) {
                c0444kd2.f1448a = c0444kd.f1448a;
                C0401JD c0401jd = new C0401JD(c0444kd.f1449b);
                c0444kd2.f1449b = c0401jd;
                if (c0444kd.f1449b.f1354e != null) {
                    c0401jd.f1354e = new Paint(c0444kd.f1449b.f1354e);
                }
                if (c0444kd.f1449b.f1353d != null) {
                    c0444kd2.f1449b.f1353d = new Paint(c0444kd.f1449b.f1353d);
                }
                c0444kd2.f1450c = c0444kd.f1450c;
                c0444kd2.f1451d = c0444kd.f1451d;
                c0444kd2.f1452e = c0444kd.f1452e;
            }
            this.f1727b = c0444kd2;
            this.f1730e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f373a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0444KD c0444kd = this.f1727b;
        ColorStateList colorStateList = c0444kd.f1450c;
        if (colorStateList == null || (mode = c0444kd.f1451d) == null) {
            z = false;
        } else {
            this.f1728c = m1025a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C0401JD c0401jd = c0444kd.f1449b;
        if (c0401jd.f1363n == null) {
            c0401jd.f1363n = Boolean.valueOf(c0401jd.f1356g.mo449a());
        }
        if (c0401jd.f1363n.booleanValue()) {
            boolean zMo450b = c0444kd.f1449b.f1356g.mo450b(iArr);
            c0444kd.f1458k |= zMo450b;
            if (zMo450b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f1727b.f1449b.getRootAlpha() != i) {
            this.f1727b.f1449b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f1727b.f1452e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1729d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            AbstractC1406fG.m2715o0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C0444KD c0444kd = this.f1727b;
        if (c0444kd.f1450c != colorStateList) {
            c0444kd.f1450c = colorStateList;
            this.f1728c = m1025a(colorStateList, c0444kd.f1451d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C0444KD c0444kd = this.f1727b;
        if (c0444kd.f1451d != mode) {
            c0444kd.f1451d = mode;
            this.f1728c = m1025a(c0444kd.f1450c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f373a;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f373a;
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
        Drawable drawable = this.f373a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0444KD c0444kd = this.f1727b;
        c0444kd.f1449b = new C0401JD();
        TypedArray typedArrayM1471B = AbstractC0714Qj.m1471B(resources, theme, attributeSet, AbstractC0148Dc.f384a);
        C0444KD c0444kd2 = this.f1727b;
        C0401JD c0401jd = c0444kd2.f1449b;
        int i3 = !AbstractC0714Qj.m1500v(xmlPullParser, "tintMode") ? -1 : typedArrayM1471B.getInt(6, -1);
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
        c0444kd2.f1451d = mode;
        ColorStateList colorStateListM5334a = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM1471B.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateListM5334a = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayM1471B.getResources();
                int resourceId = typedArrayM1471B.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC2754ya.f9383a;
                try {
                    colorStateListM5334a = AbstractC2754ya.m5334a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                }
            }
        }
        ColorStateList colorStateList = colorStateListM5334a;
        if (colorStateList != null) {
            c0444kd2.f1450c = colorStateList;
        }
        boolean z = c0444kd2.f1452e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayM1471B.getBoolean(5, z);
        }
        c0444kd2.f1452e = z;
        float f = c0401jd.f1359j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM1471B.getFloat(7, f);
        }
        c0401jd.f1359j = f;
        float f2 = c0401jd.f1360k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayM1471B.getFloat(8, f2);
        }
        c0401jd.f1360k = f2;
        if (c0401jd.f1359j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM1471B.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            c0401jd.f1357h = typedArrayM1471B.getDimension(3, c0401jd.f1357h);
            float dimension = typedArrayM1471B.getDimension(2, c0401jd.f1358i);
            c0401jd.f1358i = dimension;
            if (c0401jd.f1357h <= 0.0f) {
                throw new XmlPullParserException(typedArrayM1471B.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c0401jd.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayM1471B.getFloat(4, alpha);
                }
                c0401jd.setAlpha(alpha);
                String string = typedArrayM1471B.getString(0);
                if (string != null) {
                    c0401jd.f1362m = string;
                    c0401jd.f1364o.put(string, c0401jd);
                }
                typedArrayM1471B.recycle();
                c0444kd.f1448a = getChangingConfigurations();
                c0444kd.f1458k = true;
                C0444KD c0444kd3 = this.f1727b;
                C0401JD c0401jd2 = c0444kd3.f1449b;
                ArrayDeque arrayDeque = new ArrayDeque();
                C0272GD c0272gd = c0401jd2.f1356g;
                C0521M4 c0521m4 = c0401jd2.f1364o;
                arrayDeque.push(c0272gd);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0272GD c0272gd2 = (C0272GD) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            C0229FD c0229fd = new C0229FD();
                            c0229fd.f673e = 0.0f;
                            c0229fd.f675g = 1.0f;
                            c0229fd.f676h = 1.0f;
                            c0229fd.f677i = 0.0f;
                            c0229fd.f678j = 1.0f;
                            c0229fd.f679k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c0229fd.f680l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            c0229fd.f681m = join2;
                            c0229fd.f682n = 4.0f;
                            TypedArray typedArrayM1471B2 = AbstractC0714Qj.m1471B(resources, theme, attributeSet, AbstractC0148Dc.f386c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayM1471B2.getString(0);
                                if (string2 != null) {
                                    c0229fd.f1223b = string2;
                                }
                                String string3 = typedArrayM1471B2.getString(2);
                                if (string3 != null) {
                                    c0229fd.f1222a = AbstractC1406fG.m2688M(string3);
                                }
                                c0229fd.f674f = AbstractC0714Qj.m1498t(typedArrayM1471B2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = c0229fd.f676h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f3 = typedArrayM1471B2.getFloat(12, f3);
                                }
                                c0229fd.f676h = f3;
                                int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM1471B2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = c0229fd.f680l;
                                if (i6 == 0) {
                                    cap = cap2;
                                } else if (i6 != 1) {
                                    cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                c0229fd.f680l = cap;
                                int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM1471B2.getInt(9, -1) : -1;
                                Paint.Join join3 = c0229fd.f681m;
                                if (i7 == 0) {
                                    join = join2;
                                } else if (i7 != 1) {
                                    join = i7 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                c0229fd.f681m = join;
                                float f4 = c0229fd.f682n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f4 = typedArrayM1471B2.getFloat(10, f4);
                                }
                                c0229fd.f682n = f4;
                                c0229fd.f672d = AbstractC0714Qj.m1498t(typedArrayM1471B2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = c0229fd.f675g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f5 = typedArrayM1471B2.getFloat(11, f5);
                                }
                                c0229fd.f675g = f5;
                                float f6 = c0229fd.f673e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f6 = typedArrayM1471B2.getFloat(4, f6);
                                }
                                c0229fd.f673e = f6;
                                float f7 = c0229fd.f678j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f7 = typedArrayM1471B2.getFloat(6, f7);
                                }
                                c0229fd.f678j = f7;
                                float f8 = c0229fd.f679k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f8 = typedArrayM1471B2.getFloat(7, f8);
                                }
                                c0229fd.f679k = f8;
                                float f9 = c0229fd.f677i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f9 = typedArrayM1471B2.getFloat(5, f9);
                                }
                                c0229fd.f677i = f9;
                                int i8 = c0229fd.f1224c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i8 = typedArrayM1471B2.getInt(13, i8);
                                }
                                c0229fd.f1224c = i8;
                            }
                            typedArrayM1471B2.recycle();
                            c0272gd2.f880b.add(c0229fd);
                            if (c0229fd.getPathName() != null) {
                                c0521m4.put(c0229fd.getPathName(), c0229fd);
                            }
                            c0444kd3.f1448a = c0444kd3.f1448a;
                            z2 = false;
                            c = '\b';
                        } else {
                            c = '\b';
                            if ("clip-path".equals(name)) {
                                C0186ED c0186ed = new C0186ED();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayM1471B3 = AbstractC0714Qj.m1471B(resources, theme, attributeSet, AbstractC0148Dc.f387d);
                                    String string4 = typedArrayM1471B3.getString(0);
                                    if (string4 != null) {
                                        c0186ed.f1223b = string4;
                                    }
                                    String string5 = typedArrayM1471B3.getString(1);
                                    if (string5 != null) {
                                        c0186ed.f1222a = AbstractC1406fG.m2688M(string5);
                                    }
                                    c0186ed.f1224c = !AbstractC0714Qj.m1500v(xmlPullParser, "fillType") ? 0 : typedArrayM1471B3.getInt(2, 0);
                                    typedArrayM1471B3.recycle();
                                }
                                c0272gd2.f880b.add(c0186ed);
                                if (c0186ed.getPathName() != null) {
                                    c0521m4.put(c0186ed.getPathName(), c0186ed);
                                }
                                c0444kd3.f1448a = c0444kd3.f1448a;
                            } else if ("group".equals(name)) {
                                C0272GD c0272gd3 = new C0272GD();
                                TypedArray typedArrayM1471B4 = AbstractC0714Qj.m1471B(resources, theme, attributeSet, AbstractC0148Dc.f385b);
                                float f10 = c0272gd3.f881c;
                                if (AbstractC0714Qj.m1500v(xmlPullParser, "rotation")) {
                                    f10 = typedArrayM1471B4.getFloat(5, f10);
                                }
                                c0272gd3.f881c = f10;
                                c0272gd3.f882d = typedArrayM1471B4.getFloat(1, c0272gd3.f882d);
                                c0272gd3.f883e = typedArrayM1471B4.getFloat(2, c0272gd3.f883e);
                                float f11 = c0272gd3.f884f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f11 = typedArrayM1471B4.getFloat(3, f11);
                                }
                                c0272gd3.f884f = f11;
                                float f12 = c0272gd3.f885g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f12 = typedArrayM1471B4.getFloat(4, f12);
                                }
                                c0272gd3.f885g = f12;
                                float f13 = c0272gd3.f886h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f13 = typedArrayM1471B4.getFloat(6, f13);
                                }
                                c0272gd3.f886h = f13;
                                float f14 = c0272gd3.f887i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f14 = typedArrayM1471B4.getFloat(7, f14);
                                }
                                c0272gd3.f887i = f14;
                                String string6 = typedArrayM1471B4.getString(0);
                                if (string6 != null) {
                                    c0272gd3.f889k = string6;
                                }
                                c0272gd3.m552c();
                                typedArrayM1471B4.recycle();
                                c0272gd2.f880b.add(c0272gd3);
                                arrayDeque.push(c0272gd3);
                                if (c0272gd3.getGroupName() != null) {
                                    c0521m4.put(c0272gd3.getGroupName(), c0272gd3);
                                }
                                c0444kd3.f1448a = c0444kd3.f1448a;
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
                    this.f1728c = m1025a(c0444kd.f1450c, c0444kd.f1451d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM1471B.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM1471B.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C0530MD(C0444KD c0444kd) {
        this.f1731f = true;
        this.f1732g = new float[9];
        this.f1733h = new Matrix();
        this.f1734i = new Rect();
        this.f1727b = c0444kd;
        this.f1728c = m1025a(c0444kd.f1450c, c0444kd.f1451d);
    }
}
