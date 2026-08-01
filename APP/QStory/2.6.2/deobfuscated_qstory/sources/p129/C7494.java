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
import kotlin.reflect.jvm.internal.AbstractC5061;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p161.AbstractC7641;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7494 extends AbstractC7496 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final PorterDuff.Mode f20330 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f20331;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ColorFilter f20332;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Matrix f20333;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Rect f20334;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f20335;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final float[] f20336;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C7491 f20337;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public PorterDuffColorFilter f20338;

    public C7494() {
        this.f20335 = true;
        this.f20336 = new float[9];
        this.f20333 = new Matrix();
        this.f20334 = new Rect();
        C7491 c7491 = new C7491();
        c7491.f20304 = null;
        c7491.f20303 = f20330;
        c7491.f20305 = new C7492();
        this.f20337 = c7491;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f20339;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f20339;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f20334;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f20332;
        if (colorFilter == null) {
            colorFilter = this.f20338;
        }
        Matrix matrix = this.f20333;
        canvas.getMatrix(matrix);
        float[] fArr = this.f20336;
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
        C7491 c7491 = this.f20337;
        Bitmap bitmap = c7491.f20301;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c7491.f20301.getHeight()) {
            c7491.f20301 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c7491.f20309 = true;
        }
        boolean z = this.f20335;
        C7491 c74912 = this.f20337;
        if (!z) {
            c74912.f20301.eraseColor(0);
            Canvas canvas2 = new Canvas(c74912.f20301);
            C7492 c7492 = c74912.f20305;
            c7492.m12689(c7492.f20324, C7492.f20313, canvas2, iMin, iMin2);
        } else if (c74912.f20309 || c74912.f20308 != c74912.f20304 || c74912.f20307 != c74912.f20303 || c74912.f20312 != c74912.f20302 || c74912.f20311 != c74912.f20305.getRootAlpha()) {
            C7491 c74913 = this.f20337;
            c74913.f20301.eraseColor(0);
            Canvas canvas3 = new Canvas(c74913.f20301);
            C7492 c74922 = c74913.f20305;
            c74922.m12689(c74922.f20324, C7492.f20313, canvas3, iMin, iMin2);
            C7491 c74914 = this.f20337;
            c74914.f20308 = c74914.f20304;
            c74914.f20307 = c74914.f20303;
            c74914.f20311 = c74914.f20305.getRootAlpha();
            c74914.f20312 = c74914.f20302;
            c74914.f20309 = false;
        }
        C7491 c74915 = this.f20337;
        if (c74915.f20305.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c74915.f20310 == null) {
                Paint paint2 = new Paint();
                c74915.f20310 = paint2;
                paint2.setFilterBitmap(true);
            }
            c74915.f20310.setAlpha(c74915.f20305.getRootAlpha());
            c74915.f20310.setColorFilter(colorFilter);
            paint = c74915.f20310;
        }
        canvas.drawBitmap(c74915.f20301, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f20339;
        return drawable != null ? drawable.getAlpha() : this.f20337.f20305.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f20339;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f20337.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f20339;
        return drawable != null ? drawable.getColorFilter() : this.f20332;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f20339 != null) {
            return new C7493(this.f20339.getConstantState());
        }
        this.f20337.f20306 = getChangingConfigurations();
        return this.f20337;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f20339;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f20337.f20305.f20327;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f20339;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f20337.f20305.f20323;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f20339;
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
        Drawable drawable = this.f20339;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C7491 c7491 = this.f20337;
        c7491.f20305 = new C7492();
        TypedArray typedArrayM12875 = AbstractC7641.m12875(resources, theme, attributeSet, AbstractC7490.f20300);
        C7491 c74912 = this.f20337;
        C7492 c7492 = c74912.f20305;
        int i5 = !AbstractC7641.m12871(xmlPullParser, "tintMode") ? -1 : typedArrayM12875.getInt(6, -1);
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
        c74912.f20303 = mode;
        ColorStateList colorStateListM12873 = AbstractC7641.m12873(typedArrayM12875, xmlPullParser, theme);
        if (colorStateListM12873 != null) {
            c74912.f20304 = colorStateListM12873;
        }
        boolean z = c74912.f20302;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayM12875.getBoolean(5, z);
        }
        c74912.f20302 = z;
        float f = c7492.f20328;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM12875.getFloat(7, f);
        }
        c7492.f20328 = f;
        float f2 = c7492.f20325;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayM12875.getFloat(8, f2);
        }
        c7492.f20325 = f2;
        if (c7492.f20328 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM12875.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM12875.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c7492.f20323 = typedArrayM12875.getDimension(3, c7492.f20323);
        int i7 = 2;
        float dimension = typedArrayM12875.getDimension(2, c7492.f20327);
        c7492.f20327 = dimension;
        if (c7492.f20323 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM12875.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayM12875.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = c7492.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayM12875.getFloat(4, alpha);
        }
        c7492.setAlpha(alpha);
        String string = typedArrayM12875.getString(0);
        if (string != null) {
            c7492.f20321 = string;
            c7492.f20322.put(string, c7492);
        }
        typedArrayM12875.recycle();
        c7491.f20306 = getChangingConfigurations();
        int i8 = 1;
        c7491.f20309 = true;
        C7491 c74913 = this.f20337;
        C7492 c74922 = c74913.f20305;
        ArrayDeque arrayDeque = new ArrayDeque();
        C7500 c7500 = c74922.f20324;
        C0257 c0257 = c74922.f20322;
        arrayDeque.push(c7500);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
            if (eventType == i7) {
                String name = xmlPullParser.getName();
                C7500 c75002 = (C7500) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    C7499 c7499 = new C7499();
                    c7499.f20344 = 0.0f;
                    c7499.f20349 = 1.0f;
                    c7499.f20348 = 1.0f;
                    c7499.f20352 = 0.0f;
                    c7499.f20353 = 1.0f;
                    c7499.f20350 = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    c7499.f20351 = cap;
                    Paint.Join join = Paint.Join.MITER;
                    c7499.f20347 = join;
                    c7499.f20346 = 4.0f;
                    TypedArray typedArrayM128752 = AbstractC7641.m12875(resources, theme, attributeSet, AbstractC7490.f20298);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayM128752.getString(0);
                        if (string2 != null) {
                            c7499.f20341 = string2;
                        }
                        String string3 = typedArrayM128752.getString(2);
                        if (string3 != null) {
                            c7499.f20342 = AbstractC5061.m10044(string3);
                        }
                        c7499.f20343 = AbstractC7641.m12872(typedArrayM128752, xmlPullParser, theme, "fillColor", 1);
                        float f3 = c7499.f20348;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = typedArrayM128752.getFloat(12, f3);
                        }
                        c7499.f20348 = f3;
                        int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM128752.getInt(8, -1) : -1;
                        c7499.f20351 = i9 != 0 ? i9 != 1 ? i9 != 2 ? c7499.f20351 : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM128752.getInt(9, -1) : -1;
                        c7499.f20347 = i10 != 0 ? i10 != 1 ? i10 != 2 ? c7499.f20347 : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = c7499.f20346;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = typedArrayM128752.getFloat(10, f4);
                        }
                        c7499.f20346 = f4;
                        c7499.f20345 = AbstractC7641.m12872(typedArrayM128752, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = c7499.f20349;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = typedArrayM128752.getFloat(11, f5);
                        }
                        c7499.f20349 = f5;
                        float f6 = c7499.f20344;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = typedArrayM128752.getFloat(4, f6);
                        }
                        c7499.f20344 = f6;
                        float f7 = c7499.f20353;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = typedArrayM128752.getFloat(6, f7);
                        }
                        c7499.f20353 = f7;
                        float f8 = c7499.f20350;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = typedArrayM128752.getFloat(7, f8);
                        }
                        c7499.f20350 = f8;
                        float f9 = c7499.f20352;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = typedArrayM128752.getFloat(5, f9);
                        }
                        c7499.f20352 = f9;
                        int i11 = c7499.f20340;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i11 = typedArrayM128752.getInt(13, i11);
                        }
                        c7499.f20340 = i11;
                    }
                    typedArrayM128752.recycle();
                    c75002.f20358.add(c7499);
                    if (c7499.getPathName() != null) {
                        c0257.put(c7499.getPathName(), c7499);
                    }
                    c74913.f20306 = c74913.f20306;
                    i4 = 1;
                    z2 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        C7495 c7495 = new C7495();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayM128753 = AbstractC7641.m12875(resources, theme, attributeSet, AbstractC7490.f20297);
                            String string4 = typedArrayM128753.getString(0);
                            if (string4 != null) {
                                c7495.f20341 = string4;
                            }
                            String string5 = typedArrayM128753.getString(1);
                            if (string5 != null) {
                                c7495.f20342 = AbstractC5061.m10044(string5);
                            }
                            c7495.f20340 = !AbstractC7641.m12871(xmlPullParser, "fillType") ? 0 : typedArrayM128753.getInt(2, 0);
                            typedArrayM128753.recycle();
                        }
                        c75002.f20358.add(c7495);
                        if (c7495.getPathName() != null) {
                            c0257.put(c7495.getPathName(), c7495);
                        }
                        c74913.f20306 = c74913.f20306;
                    } else if ("group".equals(name)) {
                        C7500 c75003 = new C7500();
                        TypedArray typedArrayM128754 = AbstractC7641.m12875(resources, theme, attributeSet, AbstractC7490.f20299);
                        float f10 = c75003.f20357;
                        if (AbstractC7641.m12871(xmlPullParser, "rotation")) {
                            f10 = typedArrayM128754.getFloat(5, f10);
                        }
                        c75003.f20357 = f10;
                        i4 = 1;
                        c75003.f20356 = typedArrayM128754.getFloat(1, c75003.f20356);
                        c75003.f20355 = typedArrayM128754.getFloat(2, c75003.f20355);
                        float f11 = c75003.f20354;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = typedArrayM128754.getFloat(3, f11);
                        }
                        c75003.f20354 = f11;
                        float f12 = c75003.f20361;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = typedArrayM128754.getFloat(4, f12);
                        }
                        c75003.f20361 = f12;
                        float f13 = c75003.f20360;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = typedArrayM128754.getFloat(6, f13);
                        }
                        c75003.f20360 = f13;
                        float f14 = c75003.f20363;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = typedArrayM128754.getFloat(7, f14);
                        }
                        c75003.f20363 = f14;
                        String string6 = typedArrayM128754.getString(0);
                        if (string6 != null) {
                            c75003.f20362 = string6;
                        }
                        c75003.m12693();
                        typedArrayM128754.recycle();
                        c75002.f20358.add(c75003);
                        arrayDeque.push(c75003);
                        if (c75003.getGroupName() != null) {
                            c0257.put(c75003.getGroupName(), c75003);
                        }
                        c74913.f20306 = c74913.f20306;
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
        this.f20338 = m12690(c7491.f20304, c7491.f20303);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f20339;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f20339;
        return drawable != null ? drawable.isAutoMirrored() : this.f20337.f20302;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f20339;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C7491 c7491 = this.f20337;
        if (c7491 == null) {
            return false;
        }
        C7492 c7492 = c7491.f20305;
        if (c7492.f20320 == null) {
            c7492.f20320 = Boolean.valueOf(c7492.f20324.mo12692());
        }
        if (c7492.f20320.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f20337.f20304;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f20339;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f20331 && super.mutate() == this) {
            C7491 c7491 = this.f20337;
            C7491 c74912 = new C7491();
            c74912.f20304 = null;
            c74912.f20303 = f20330;
            if (c7491 != null) {
                c74912.f20306 = c7491.f20306;
                C7492 c7492 = new C7492(c7491.f20305);
                c74912.f20305 = c7492;
                if (c7491.f20305.f20315 != null) {
                    c7492.f20315 = new Paint(c7491.f20305.f20315);
                }
                if (c7491.f20305.f20316 != null) {
                    c74912.f20305.f20316 = new Paint(c7491.f20305.f20316);
                }
                c74912.f20304 = c7491.f20304;
                c74912.f20303 = c7491.f20303;
                c74912.f20302 = c7491.f20302;
            }
            this.f20337 = c74912;
            this.f20331 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f20339;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f20339;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C7491 c7491 = this.f20337;
        ColorStateList colorStateList = c7491.f20304;
        if (colorStateList == null || (mode = c7491.f20303) == null) {
            z = false;
        } else {
            this.f20338 = m12690(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C7492 c7492 = c7491.f20305;
        if (c7492.f20320 == null) {
            c7492.f20320 = Boolean.valueOf(c7492.f20324.mo12692());
        }
        if (c7492.f20320.booleanValue()) {
            boolean zMo12691 = c7491.f20305.f20324.mo12691(iArr);
            c7491.f20309 |= zMo12691;
            if (zMo12691) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f20339;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f20339;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f20337.f20305.getRootAlpha() != i) {
            this.f20337.f20305.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f20339;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f20337.f20302 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f20339;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f20332 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f20339;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f20339;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C7491 c7491 = this.f20337;
        if (c7491.f20304 != colorStateList) {
            c7491.f20304 = colorStateList;
            this.f20338 = m12690(colorStateList, c7491.f20303);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f20339;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C7491 c7491 = this.f20337;
        if (c7491.f20303 != mode) {
            c7491.f20303 = mode;
            this.f20338 = m12690(c7491.f20304, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f20339;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f20339;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final PorterDuffColorFilter m12690(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public C7494(C7491 c7491) {
        this.f20335 = true;
        this.f20336 = new float[9];
        this.f20333 = new Matrix();
        this.f20334 = new Rect();
        this.f20337 = c7491;
        this.f20338 = m12690(c7491.f20304, c7491.f20303);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f20339;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
