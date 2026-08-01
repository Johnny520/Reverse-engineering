package p129;

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
import androidx.collection.C0257;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p034.AbstractC6347;
import p161.AbstractC7642;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7495 extends AbstractC7497 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final PorterDuff.Mode f20325 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f20326;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ColorFilter f20327;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Matrix f20328;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Rect f20329;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f20330;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final float[] f20331;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7492 f20332;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public PorterDuffColorFilter f20333;

    public C7495() {
        this.f20330 = true;
        this.f20331 = new float[9];
        this.f20328 = new Matrix();
        this.f20329 = new Rect();
        C7492 c7492 = new C7492();
        c7492.f20299 = null;
        c7492.f20298 = f20325;
        c7492.f20300 = new C7493();
        this.f20332 = c7492;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f20334;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f20334;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f20329;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f20327;
        if (colorFilter == null) {
            colorFilter = this.f20333;
        }
        Matrix matrix = this.f20328;
        canvas.getMatrix(matrix);
        float[] fArr = this.f20331;
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
        C7492 c7492 = this.f20332;
        Bitmap bitmap = c7492.f20296;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c7492.f20296.getHeight()) {
            c7492.f20296 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c7492.f20304 = true;
        }
        boolean z = this.f20330;
        C7492 c74922 = this.f20332;
        if (!z) {
            c74922.f20296.eraseColor(0);
            Canvas canvas2 = new Canvas(c74922.f20296);
            C7493 c7493 = c74922.f20300;
            c7493.m12718(c7493.f20319, C7493.f20308, canvas2, iMin, iMin2);
        } else if (c74922.f20304 || c74922.f20303 != c74922.f20299 || c74922.f20302 != c74922.f20298 || c74922.f20307 != c74922.f20297 || c74922.f20306 != c74922.f20300.getRootAlpha()) {
            C7492 c74923 = this.f20332;
            c74923.f20296.eraseColor(0);
            Canvas canvas3 = new Canvas(c74923.f20296);
            C7493 c74932 = c74923.f20300;
            c74932.m12718(c74932.f20319, C7493.f20308, canvas3, iMin, iMin2);
            C7492 c74924 = this.f20332;
            c74924.f20303 = c74924.f20299;
            c74924.f20302 = c74924.f20298;
            c74924.f20306 = c74924.f20300.getRootAlpha();
            c74924.f20307 = c74924.f20297;
            c74924.f20304 = false;
        }
        C7492 c74925 = this.f20332;
        if (c74925.f20300.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c74925.f20305 == null) {
                Paint paint2 = new Paint();
                c74925.f20305 = paint2;
                paint2.setFilterBitmap(true);
            }
            c74925.f20305.setAlpha(c74925.f20300.getRootAlpha());
            c74925.f20305.setColorFilter(colorFilter);
            paint = c74925.f20305;
        }
        canvas.drawBitmap(c74925.f20296, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f20334;
        return drawable != null ? drawable.getAlpha() : this.f20332.f20300.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f20332.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f20334;
        return drawable != null ? drawable.getColorFilter() : this.f20327;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f20334 != null) {
            return new C7494(this.f20334.getConstantState());
        }
        this.f20332.f20301 = getChangingConfigurations();
        return this.f20332;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f20334;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f20332.f20300.f20322;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f20334;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f20332.f20300.f20318;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        Drawable drawable = this.f20334;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C7492 c7492 = this.f20332;
        c7492.f20300 = new C7493();
        TypedArray typedArrayM12904 = AbstractC7642.m12904(resources, theme, attributeSet, AbstractC7491.f20295);
        C7492 c74922 = this.f20332;
        C7493 c7493 = c74922.f20300;
        int i5 = !AbstractC7642.m12900(xmlPullParser, "tintMode") ? -1 : typedArrayM12904.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
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
        c74922.f20298 = mode;
        ColorStateList colorStateListM12902 = AbstractC7642.m12902(typedArrayM12904, xmlPullParser, theme);
        if (colorStateListM12902 != null) {
            c74922.f20299 = colorStateListM12902;
        }
        boolean z = c74922.f20297;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayM12904.getBoolean(5, z);
        }
        c74922.f20297 = z;
        float f = c7493.f20323;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM12904.getFloat(7, f);
        }
        c7493.f20323 = f;
        float f2 = c7493.f20320;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayM12904.getFloat(8, f2);
        }
        c7493.f20320 = f2;
        if (c7493.f20323 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM12904.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM12904.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c7493.f20318 = typedArrayM12904.getDimension(3, c7493.f20318);
        int i7 = 2;
        float dimension = typedArrayM12904.getDimension(2, c7493.f20322);
        c7493.f20322 = dimension;
        if (c7493.f20318 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM12904.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayM12904.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = c7493.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayM12904.getFloat(4, alpha);
        }
        c7493.setAlpha(alpha);
        String string = typedArrayM12904.getString(0);
        if (string != null) {
            c7493.f20316 = string;
            c7493.f20317.put(string, c7493);
        }
        typedArrayM12904.recycle();
        c7492.f20301 = getChangingConfigurations();
        int i8 = 1;
        c7492.f20304 = true;
        C7492 c74923 = this.f20332;
        C7493 c74932 = c74923.f20300;
        ArrayDeque arrayDeque = new ArrayDeque();
        C7501 c7501 = c74932.f20319;
        C0257 c0257 = c74932.f20317;
        arrayDeque.push(c7501);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
            if (eventType == i7) {
                String name = xmlPullParser.getName();
                C7501 c75012 = (C7501) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    C7500 c7500 = new C7500();
                    c7500.f20339 = 0.0f;
                    c7500.f20344 = 1.0f;
                    c7500.f20343 = 1.0f;
                    c7500.f20347 = 0.0f;
                    c7500.f20348 = 1.0f;
                    c7500.f20345 = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    c7500.f20346 = cap;
                    Paint.Join join = Paint.Join.MITER;
                    c7500.f20342 = join;
                    c7500.f20341 = 4.0f;
                    TypedArray typedArrayM129042 = AbstractC7642.m12904(resources, theme, attributeSet, AbstractC7491.f20293);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayM129042.getString(0);
                        if (string2 != null) {
                            c7500.f20336 = string2;
                        }
                        String string3 = typedArrayM129042.getString(2);
                        if (string3 != null) {
                            c7500.f20337 = AbstractC6347.m11910(string3);
                        }
                        c7500.f20338 = AbstractC7642.m12901(typedArrayM129042, xmlPullParser, theme, "fillColor", 1);
                        float f3 = c7500.f20343;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = typedArrayM129042.getFloat(12, f3);
                        }
                        c7500.f20343 = f3;
                        int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM129042.getInt(8, -1) : -1;
                        c7500.f20346 = i9 != 0 ? i9 != 1 ? i9 != 2 ? c7500.f20346 : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM129042.getInt(9, -1) : -1;
                        c7500.f20342 = i10 != 0 ? i10 != 1 ? i10 != 2 ? c7500.f20342 : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = c7500.f20341;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = typedArrayM129042.getFloat(10, f4);
                        }
                        c7500.f20341 = f4;
                        c7500.f20340 = AbstractC7642.m12901(typedArrayM129042, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = c7500.f20344;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = typedArrayM129042.getFloat(11, f5);
                        }
                        c7500.f20344 = f5;
                        float f6 = c7500.f20339;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = typedArrayM129042.getFloat(4, f6);
                        }
                        c7500.f20339 = f6;
                        float f7 = c7500.f20348;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = typedArrayM129042.getFloat(6, f7);
                        }
                        c7500.f20348 = f7;
                        float f8 = c7500.f20345;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = typedArrayM129042.getFloat(7, f8);
                        }
                        c7500.f20345 = f8;
                        float f9 = c7500.f20347;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = typedArrayM129042.getFloat(5, f9);
                        }
                        c7500.f20347 = f9;
                        int i11 = c7500.f20335;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i11 = typedArrayM129042.getInt(13, i11);
                        }
                        c7500.f20335 = i11;
                    }
                    typedArrayM129042.recycle();
                    c75012.f20353.add(c7500);
                    if (c7500.getPathName() != null) {
                        c0257.put(c7500.getPathName(), c7500);
                    }
                    c74923.f20301 = c74923.f20301;
                    i4 = 1;
                    z2 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        C7496 c7496 = new C7496();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayM129043 = AbstractC7642.m12904(resources, theme, attributeSet, AbstractC7491.f20292);
                            String string4 = typedArrayM129043.getString(0);
                            if (string4 != null) {
                                c7496.f20336 = string4;
                            }
                            String string5 = typedArrayM129043.getString(1);
                            if (string5 != null) {
                                c7496.f20337 = AbstractC6347.m11910(string5);
                            }
                            c7496.f20335 = !AbstractC7642.m12900(xmlPullParser, "fillType") ? 0 : typedArrayM129043.getInt(2, 0);
                            typedArrayM129043.recycle();
                        }
                        c75012.f20353.add(c7496);
                        if (c7496.getPathName() != null) {
                            c0257.put(c7496.getPathName(), c7496);
                        }
                        c74923.f20301 = c74923.f20301;
                    } else if ("group".equals(name)) {
                        C7501 c75013 = new C7501();
                        TypedArray typedArrayM129044 = AbstractC7642.m12904(resources, theme, attributeSet, AbstractC7491.f20294);
                        float f10 = c75013.f20352;
                        if (AbstractC7642.m12900(xmlPullParser, "rotation")) {
                            f10 = typedArrayM129044.getFloat(5, f10);
                        }
                        c75013.f20352 = f10;
                        i4 = 1;
                        c75013.f20351 = typedArrayM129044.getFloat(1, c75013.f20351);
                        c75013.f20350 = typedArrayM129044.getFloat(2, c75013.f20350);
                        float f11 = c75013.f20349;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = typedArrayM129044.getFloat(3, f11);
                        }
                        c75013.f20349 = f11;
                        float f12 = c75013.f20356;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = typedArrayM129044.getFloat(4, f12);
                        }
                        c75013.f20356 = f12;
                        float f13 = c75013.f20355;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = typedArrayM129044.getFloat(6, f13);
                        }
                        c75013.f20355 = f13;
                        float f14 = c75013.f20358;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = typedArrayM129044.getFloat(7, f14);
                        }
                        c75013.f20358 = f14;
                        String string6 = typedArrayM129044.getString(0);
                        if (string6 != null) {
                            c75013.f20357 = string6;
                        }
                        c75013.m12722();
                        typedArrayM129044.recycle();
                        c75012.f20353.add(c75013);
                        arrayDeque.push(c75013);
                        if (c75013.getGroupName() != null) {
                            c0257.put(c75013.getGroupName(), c75013);
                        }
                        c74923.f20301 = c74923.f20301;
                    }
                    i4 = 1;
                }
                i3 = i4;
                i2 = 3;
            } else {
                i = depth;
                i2 = i6;
                i3 = 1;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i6 = i2;
            i8 = i3;
            depth = i;
            i7 = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.f20333 = m12719(c7492.f20299, c7492.f20298);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f20334;
        return drawable != null ? drawable.isAutoMirrored() : this.f20332.f20297;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C7492 c7492 = this.f20332;
        if (c7492 == null) {
            return false;
        }
        C7493 c7493 = c7492.f20300;
        if (c7493.f20315 == null) {
            c7493.f20315 = Boolean.valueOf(c7493.f20319.mo12721());
        }
        if (c7493.f20315.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f20332.f20299;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f20326 && super.mutate() == this) {
            C7492 c7492 = this.f20332;
            C7492 c74922 = new C7492();
            c74922.f20299 = null;
            c74922.f20298 = f20325;
            if (c7492 != null) {
                c74922.f20301 = c7492.f20301;
                C7493 c7493 = new C7493(c7492.f20300);
                c74922.f20300 = c7493;
                if (c7492.f20300.f20310 != null) {
                    c7493.f20310 = new Paint(c7492.f20300.f20310);
                }
                if (c7492.f20300.f20311 != null) {
                    c74922.f20300.f20311 = new Paint(c7492.f20300.f20311);
                }
                c74922.f20299 = c7492.f20299;
                c74922.f20298 = c7492.f20298;
                c74922.f20297 = c7492.f20297;
            }
            this.f20332 = c74922;
            this.f20326 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f20334;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C7492 c7492 = this.f20332;
        ColorStateList colorStateList = c7492.f20299;
        if (colorStateList == null || (mode = c7492.f20298) == null) {
            z = false;
        } else {
            this.f20333 = m12719(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C7493 c7493 = c7492.f20300;
        if (c7493.f20315 == null) {
            c7493.f20315 = Boolean.valueOf(c7493.f20319.mo12721());
        }
        if (c7493.f20315.booleanValue()) {
            boolean zMo12720 = c7492.f20300.f20319.mo12720(iArr);
            c7492.f20304 |= zMo12720;
            if (zMo12720) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f20332.f20300.getRootAlpha() != i) {
            this.f20332.f20300.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f20332.f20297 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f20327 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C7492 c7492 = this.f20332;
        if (c7492.f20299 != colorStateList) {
            c7492.f20299 = colorStateList;
            this.f20333 = m12719(colorStateList, c7492.f20298);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C7492 c7492 = this.f20332;
        if (c7492.f20298 != mode) {
            c7492.f20298 = mode;
            this.f20333 = m12719(c7492.f20299, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f20334;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final PorterDuffColorFilter m12719(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public C7495(C7492 c7492) {
        this.f20330 = true;
        this.f20331 = new float[9];
        this.f20328 = new Matrix();
        this.f20329 = new Rect();
        this.f20332 = c7492;
        this.f20333 = m12719(c7492.f20299, c7492.f20298);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f20334;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
