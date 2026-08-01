package p145;

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
import androidx.collection.C1104;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p050.AbstractC7176;
import p177.AbstractC8471;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8324 extends AbstractC8326 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final PorterDuff.Mode f20670 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f20671;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public ColorFilter f20672;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Matrix f20673;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Rect f20674;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f20675;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final float[] f20676;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C8321 f20677;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public PorterDuffColorFilter f20678;

    public C8324() {
        this.f20675 = true;
        this.f20676 = new float[9];
        this.f20673 = new Matrix();
        this.f20674 = new Rect();
        C8321 c8321 = new C8321();
        c8321.f20644 = null;
        c8321.f20643 = f20670;
        c8321.f20645 = new C8322();
        this.f20677 = c8321;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f20679;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f20674;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f20672;
        if (colorFilter == null) {
            colorFilter = this.f20678;
        }
        Matrix matrix = this.f20673;
        canvas.getMatrix(matrix);
        float[] fArr = this.f20676;
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
        C8321 c8321 = this.f20677;
        Bitmap bitmap = c8321.f20641;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c8321.f20641.getHeight()) {
            c8321.f20641 = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c8321.f20649 = true;
        }
        boolean z = this.f20675;
        C8321 c83212 = this.f20677;
        if (!z) {
            c83212.f20641.eraseColor(0);
            Canvas canvas2 = new Canvas(c83212.f20641);
            C8322 c8322 = c83212.f20645;
            c8322.m13277(c8322.f20664, C8322.f20653, canvas2, iMin, iMin2);
        } else if (c83212.f20649 || c83212.f20648 != c83212.f20644 || c83212.f20647 != c83212.f20643 || c83212.f20652 != c83212.f20642 || c83212.f20651 != c83212.f20645.getRootAlpha()) {
            C8321 c83213 = this.f20677;
            c83213.f20641.eraseColor(0);
            Canvas canvas3 = new Canvas(c83213.f20641);
            C8322 c83222 = c83213.f20645;
            c83222.m13277(c83222.f20664, C8322.f20653, canvas3, iMin, iMin2);
            C8321 c83214 = this.f20677;
            c83214.f20648 = c83214.f20644;
            c83214.f20647 = c83214.f20643;
            c83214.f20651 = c83214.f20645.getRootAlpha();
            c83214.f20652 = c83214.f20642;
            c83214.f20649 = false;
        }
        C8321 c83215 = this.f20677;
        if (c83215.f20645.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c83215.f20650 == null) {
                Paint paint2 = new Paint();
                c83215.f20650 = paint2;
                paint2.setFilterBitmap(true);
            }
            c83215.f20650.setAlpha(c83215.f20645.getRootAlpha());
            c83215.f20650.setColorFilter(colorFilter);
            paint = c83215.f20650;
        }
        canvas.drawBitmap(c83215.f20641, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.getAlpha() : this.f20677.f20645.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f20677.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.getColorFilter() : this.f20672;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f20679 != null) {
            return new C8323(this.f20679.getConstantState());
        }
        this.f20677.f20646 = getChangingConfigurations();
        return this.f20677;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f20677.f20645.f20667;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f20677.f20645.f20663;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f20679;
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
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C8321 c8321 = this.f20677;
        c8321.f20645 = new C8322();
        TypedArray typedArrayM13463 = AbstractC8471.m13463(resources, theme, attributeSet, AbstractC8320.f20640);
        C8321 c83212 = this.f20677;
        C8322 c8322 = c83212.f20645;
        int i5 = !AbstractC8471.m13459(xmlPullParser, "tintMode") ? -1 : typedArrayM13463.getInt(6, -1);
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
        c83212.f20643 = mode;
        ColorStateList colorStateListM13461 = AbstractC8471.m13461(typedArrayM13463, xmlPullParser, theme);
        if (colorStateListM13461 != null) {
            c83212.f20644 = colorStateListM13461;
        }
        boolean z = c83212.f20642;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayM13463.getBoolean(5, z);
        }
        c83212.f20642 = z;
        float f = c8322.f20668;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayM13463.getFloat(7, f);
        }
        c8322.f20668 = f;
        float f2 = c8322.f20665;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayM13463.getFloat(8, f2);
        }
        c8322.f20665 = f2;
        if (c8322.f20668 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM13463.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM13463.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c8322.f20663 = typedArrayM13463.getDimension(3, c8322.f20663);
        int i7 = 2;
        float dimension = typedArrayM13463.getDimension(2, c8322.f20667);
        c8322.f20667 = dimension;
        if (c8322.f20663 <= 0.0f) {
            throw new XmlPullParserException(typedArrayM13463.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayM13463.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = c8322.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayM13463.getFloat(4, alpha);
        }
        c8322.setAlpha(alpha);
        String string = typedArrayM13463.getString(0);
        if (string != null) {
            c8322.f20661 = string;
            c8322.f20662.put(string, c8322);
        }
        typedArrayM13463.recycle();
        c8321.f20646 = getChangingConfigurations();
        int i8 = 1;
        c8321.f20649 = true;
        C8321 c83213 = this.f20677;
        C8322 c83222 = c83213.f20645;
        ArrayDeque arrayDeque = new ArrayDeque();
        C8330 c8330 = c83222.f20664;
        C1104 c1104 = c83222.f20662;
        arrayDeque.push(c8330);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
            if (eventType == i7) {
                String name = xmlPullParser.getName();
                C8330 c83302 = (C8330) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    C8329 c8329 = new C8329();
                    c8329.f20684 = 0.0f;
                    c8329.f20689 = 1.0f;
                    c8329.f20688 = 1.0f;
                    c8329.f20692 = 0.0f;
                    c8329.f20693 = 1.0f;
                    c8329.f20690 = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    c8329.f20691 = cap;
                    Paint.Join join = Paint.Join.MITER;
                    c8329.f20687 = join;
                    c8329.f20686 = 4.0f;
                    TypedArray typedArrayM134632 = AbstractC8471.m13463(resources, theme, attributeSet, AbstractC8320.f20638);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayM134632.getString(0);
                        if (string2 != null) {
                            c8329.f20681 = string2;
                        }
                        String string3 = typedArrayM134632.getString(2);
                        if (string3 != null) {
                            c8329.f20682 = AbstractC7176.m12469(string3);
                        }
                        c8329.f20683 = AbstractC8471.m13460(typedArrayM134632, xmlPullParser, theme, "fillColor", 1);
                        float f3 = c8329.f20688;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = typedArrayM134632.getFloat(12, f3);
                        }
                        c8329.f20688 = f3;
                        int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM134632.getInt(8, -1) : -1;
                        c8329.f20691 = i9 != 0 ? i9 != 1 ? i9 != 2 ? c8329.f20691 : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM134632.getInt(9, -1) : -1;
                        c8329.f20687 = i10 != 0 ? i10 != 1 ? i10 != 2 ? c8329.f20687 : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = c8329.f20686;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = typedArrayM134632.getFloat(10, f4);
                        }
                        c8329.f20686 = f4;
                        c8329.f20685 = AbstractC8471.m13460(typedArrayM134632, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = c8329.f20689;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = typedArrayM134632.getFloat(11, f5);
                        }
                        c8329.f20689 = f5;
                        float f6 = c8329.f20684;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = typedArrayM134632.getFloat(4, f6);
                        }
                        c8329.f20684 = f6;
                        float f7 = c8329.f20693;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = typedArrayM134632.getFloat(6, f7);
                        }
                        c8329.f20693 = f7;
                        float f8 = c8329.f20690;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = typedArrayM134632.getFloat(7, f8);
                        }
                        c8329.f20690 = f8;
                        float f9 = c8329.f20692;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = typedArrayM134632.getFloat(5, f9);
                        }
                        c8329.f20692 = f9;
                        int i11 = c8329.f20680;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i11 = typedArrayM134632.getInt(13, i11);
                        }
                        c8329.f20680 = i11;
                    }
                    typedArrayM134632.recycle();
                    c83302.f20698.add(c8329);
                    if (c8329.getPathName() != null) {
                        c1104.put(c8329.getPathName(), c8329);
                    }
                    c83213.f20646 = c83213.f20646;
                    i4 = 1;
                    z2 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        C8325 c8325 = new C8325();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayM134633 = AbstractC8471.m13463(resources, theme, attributeSet, AbstractC8320.f20637);
                            String string4 = typedArrayM134633.getString(0);
                            if (string4 != null) {
                                c8325.f20681 = string4;
                            }
                            String string5 = typedArrayM134633.getString(1);
                            if (string5 != null) {
                                c8325.f20682 = AbstractC7176.m12469(string5);
                            }
                            c8325.f20680 = !AbstractC8471.m13459(xmlPullParser, "fillType") ? 0 : typedArrayM134633.getInt(2, 0);
                            typedArrayM134633.recycle();
                        }
                        c83302.f20698.add(c8325);
                        if (c8325.getPathName() != null) {
                            c1104.put(c8325.getPathName(), c8325);
                        }
                        c83213.f20646 = c83213.f20646;
                    } else if ("group".equals(name)) {
                        C8330 c83303 = new C8330();
                        TypedArray typedArrayM134634 = AbstractC8471.m13463(resources, theme, attributeSet, AbstractC8320.f20639);
                        float f10 = c83303.f20697;
                        if (AbstractC8471.m13459(xmlPullParser, "rotation")) {
                            f10 = typedArrayM134634.getFloat(5, f10);
                        }
                        c83303.f20697 = f10;
                        i4 = 1;
                        c83303.f20696 = typedArrayM134634.getFloat(1, c83303.f20696);
                        c83303.f20695 = typedArrayM134634.getFloat(2, c83303.f20695);
                        float f11 = c83303.f20694;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = typedArrayM134634.getFloat(3, f11);
                        }
                        c83303.f20694 = f11;
                        float f12 = c83303.f20701;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = typedArrayM134634.getFloat(4, f12);
                        }
                        c83303.f20701 = f12;
                        float f13 = c83303.f20700;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = typedArrayM134634.getFloat(6, f13);
                        }
                        c83303.f20700 = f13;
                        float f14 = c83303.f20703;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = typedArrayM134634.getFloat(7, f14);
                        }
                        c83303.f20703 = f14;
                        String string6 = typedArrayM134634.getString(0);
                        if (string6 != null) {
                            c83303.f20702 = string6;
                        }
                        c83303.m13281();
                        typedArrayM134634.recycle();
                        c83302.f20698.add(c83303);
                        arrayDeque.push(c83303);
                        if (c83303.getGroupName() != null) {
                            c1104.put(c83303.getGroupName(), c83303);
                        }
                        c83213.f20646 = c83213.f20646;
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
        this.f20678 = m13278(c8321.f20644, c8321.f20643);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.isAutoMirrored() : this.f20677.f20642;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C8321 c8321 = this.f20677;
        if (c8321 == null) {
            return false;
        }
        C8322 c8322 = c8321.f20645;
        if (c8322.f20660 == null) {
            c8322.f20660 = Boolean.valueOf(c8322.f20664.mo13280());
        }
        if (c8322.f20660.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f20677.f20644;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f20671 && super.mutate() == this) {
            C8321 c8321 = this.f20677;
            C8321 c83212 = new C8321();
            c83212.f20644 = null;
            c83212.f20643 = f20670;
            if (c8321 != null) {
                c83212.f20646 = c8321.f20646;
                C8322 c8322 = new C8322(c8321.f20645);
                c83212.f20645 = c8322;
                if (c8321.f20645.f20655 != null) {
                    c8322.f20655 = new Paint(c8321.f20645.f20655);
                }
                if (c8321.f20645.f20656 != null) {
                    c83212.f20645.f20656 = new Paint(c8321.f20645.f20656);
                }
                c83212.f20644 = c8321.f20644;
                c83212.f20643 = c8321.f20643;
                c83212.f20642 = c8321.f20642;
            }
            this.f20677 = c83212;
            this.f20671 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f20679;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C8321 c8321 = this.f20677;
        ColorStateList colorStateList = c8321.f20644;
        if (colorStateList == null || (mode = c8321.f20643) == null) {
            z = false;
        } else {
            this.f20678 = m13278(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C8322 c8322 = c8321.f20645;
        if (c8322.f20660 == null) {
            c8322.f20660 = Boolean.valueOf(c8322.f20664.mo13280());
        }
        if (c8322.f20660.booleanValue()) {
            boolean zMo13279 = c8321.f20645.f20664.mo13279(iArr);
            c8321.f20649 |= zMo13279;
            if (zMo13279) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f20677.f20645.getRootAlpha() != i) {
            this.f20677.f20645.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f20677.f20642 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f20672 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C8321 c8321 = this.f20677;
        if (c8321.f20644 != colorStateList) {
            c8321.f20644 = colorStateList;
            this.f20678 = m13278(colorStateList, c8321.f20643);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C8321 c8321 = this.f20677;
        if (c8321.f20643 != mode) {
            c8321.f20643 = mode;
            this.f20678 = m13278(c8321.f20644, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f20679;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final PorterDuffColorFilter m13278(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public C8324(C8321 c8321) {
        this.f20675 = true;
        this.f20676 = new float[9];
        this.f20673 = new Matrix();
        this.f20674 = new Rect();
        this.f20677 = c8321;
        this.f20678 = m13278(c8321.f20644, c8321.f20643);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f20679;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
