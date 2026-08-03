package Yue;

import Yue.C6625;
import Yue.InterfaceC7144;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥۣۢۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8162 extends AbstractC8161 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final String f24187 = "VectorDrawableCompat";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final PorterDuff.Mode f24188 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final String f24189 = "clip-path";

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final String f24190 = "group";

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final String f24191 = "path";

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final String f24192 = "vector";

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f24193 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f24194 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f24195 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f24196 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f24197 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f24198 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f24199 = 2048;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final boolean f24200 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public C8168 f24201;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public PorterDuffColorFilter f24202;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public ColorFilter f24203;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f24204;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f24205;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public Drawable.ConstantState f24206;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final float[] f24207;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final Matrix f24208;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final Rect f24209;

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ۟ */
    public static class C1448 extends AbstractC8166 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1448() {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        private void m26924(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3270 = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f3269 = C6625.m21066(string2);
            }
            this.f24234 = C8021.m25322(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // Yue.C8162.AbstractC8166
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean mo26925() {
            return true;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m26926(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C8021.m25329(xmlPullParser, "pathData")) {
                TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C3213.f4900);
                m26924(typedArrayM25330, xmlPullParser);
                typedArrayM25330.recycle();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1448(C1448 c1448) {
            super(c1448);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC8165 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC8165() {
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean mo4190() {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo4191(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C8168 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: ۥ */
        public int f3273;

        /* JADX INFO: renamed from: ۥ۟ */
        public C8167 f3274;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public ColorStateList f24251;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public PorterDuff.Mode f24252;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f24253;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Bitmap f24254;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int[] f24255;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public ColorStateList f24256;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public PorterDuff.Mode f24257;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public int f24258;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public boolean f24259;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean f24260;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public Paint f24261;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8168(C8168 c8168) {
            this.f24251 = null;
            this.f24252 = C8162.f24188;
            if (c8168 != null) {
                this.f3273 = c8168.f3273;
                C8167 c8167 = new C8167(c8168.f3274);
                this.f3274 = c8167;
                if (c8168.f3274.f24239 != null) {
                    c8167.f24239 = new Paint(c8168.f3274.f24239);
                }
                if (c8168.f3274.f24238 != null) {
                    this.f3274.f24238 = new Paint(c8168.f3274.f24238);
                }
                this.f24251 = c8168.f24251;
                this.f24252 = c8168.f24252;
                this.f24253 = c8168.f24253;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3273;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @InterfaceC6391
        public Drawable newDrawable() {
            return new C8162(this);
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean m4194(int i, int i2) {
            return i == this.f24254.getWidth() && i2 == this.f24254.getHeight();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m4195() {
            return !this.f24260 && this.f24256 == this.f24251 && this.f24257 == this.f24252 && this.f24259 == this.f24253 && this.f24258 == this.f3274.getRootAlpha();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m26944(int i, int i2) {
            if (this.f24254 == null || !m4194(i, i2)) {
                this.f24254 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f24260 = true;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m26945(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f24254, (Rect) null, rect, m26946(colorFilter));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Paint m26946(ColorFilter colorFilter) {
            if (!m26947() && colorFilter == null) {
                return null;
            }
            if (this.f24261 == null) {
                Paint paint = new Paint();
                this.f24261 = paint;
                paint.setFilterBitmap(true);
            }
            this.f24261.setAlpha(this.f3274.getRootAlpha());
            this.f24261.setColorFilter(colorFilter);
            return this.f24261;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m26947() {
            return this.f3274.getRootAlpha() < 255;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean m26948() {
            return this.f3274.m26942();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean m26949(int[] iArr) {
            boolean zM26943 = this.f3274.m26943(iArr);
            this.f24260 |= zM26943;
            return zM26943;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m26950() {
            this.f24256 = this.f24251;
            this.f24257 = this.f24252;
            this.f24258 = this.f3274.getRootAlpha();
            this.f24259 = this.f24253;
            this.f24260 = false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m26951(int i, int i2) {
            this.f24254.eraseColor(0);
            this.f3274.m4193(new Canvas(this.f24254), i, i2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @InterfaceC6391
        public Drawable newDrawable(Resources resources) {
            return new C8162(this);
        }

        public C8168() {
            this.f24251 = null;
            this.f24252 = C8162.f24188;
            this.f3274 = new C8167();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8162() {
        this.f24205 = true;
        this.f24207 = new float[9];
        this.f24208 = new Matrix();
        this.f24209 = new Rect();
        this.f24201 = new C8168();
    }

    /* JADX INFO: renamed from: ۥ */
    public static int m4188(int i, float f) {
        return (i & C8273.f24691) | (((int) (Color.alpha(i) * f)) << 24);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static C8162 m4189(@InterfaceC6391 Resources resources, @InterfaceC4525 int i, @InterfaceC6490 Resources.Theme theme) {
        C8162 c8162 = new C8162();
        c8162.f24186 = C7130.m22275(resources, i, theme);
        c8162.f24206 = new C8169(c8162.f24186.getConstantState());
        return c8162;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C8162 m26914(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C8162 c8162 = new C8162();
        c8162.inflate(resources, xmlPullParser, attributeSet, theme);
        return c8162;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static PorterDuff.Mode m26915(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f24186;
        if (drawable == null) {
            return false;
        }
        C4520.m1447(drawable);
        return false;
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f24209);
        if (this.f24209.width() <= 0 || this.f24209.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f24203;
        if (colorFilter == null) {
            colorFilter = this.f24202;
        }
        canvas.getMatrix(this.f24208);
        this.f24208.getValues(this.f24207);
        float fAbs = Math.abs(this.f24207[0]);
        float fAbs2 = Math.abs(this.f24207[4]);
        float fAbs3 = Math.abs(this.f24207[1]);
        float fAbs4 = Math.abs(this.f24207[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f24209.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f24209.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f24209;
        canvas.translate(rect.left, rect.top);
        if (m26919()) {
            canvas.translate(this.f24209.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f24209.offsetTo(0, 0);
        this.f24201.m26944(iMin, iMin2);
        if (!this.f24205) {
            this.f24201.m26951(iMin, iMin2);
        } else if (!this.f24201.m4195()) {
            this.f24201.m26951(iMin, iMin2);
            this.f24201.m26950();
        }
        this.f24201.m26945(canvas, colorFilter, this.f24209);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f24186;
        return drawable != null ? C4520.m13225(drawable) : this.f24201.f3274.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f24186;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f24201.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f24186;
        return drawable != null ? C4520.m13226(drawable) : this.f24203;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f24186 != null) {
            return new C8169(this.f24186.getConstantState());
        }
        this.f24201.f3273 = getChangingConfigurations();
        return this.f24201;
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f24186;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f24201.f3274.f24244;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f24186;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f24201.f3274.f24243;
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f24186;
        return drawable != null ? C4520.m13229(drawable) : this.f24201.f24253;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C8168 c8168;
        ColorStateList colorStateList;
        Drawable drawable = this.f24186;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c8168 = this.f24201) != null && (c8168.m26948() || ((colorStateList = this.f24201.f24251) != null && colorStateList.isStateful())));
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f24204 && super.mutate() == this) {
            this.f24201 = new C8168(this.f24201);
            this.f24204 = true;
        }
        return this;
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f24186;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C8168 c8168 = this.f24201;
        ColorStateList colorStateList = c8168.f24251;
        if (colorStateList == null || (mode = c8168.f24252) == null) {
            z = false;
        } else {
            this.f24202 = m26923(this.f24202, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!c8168.m26948() || !c8168.m26949(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f24201.f3274.getRootAlpha() != i) {
            this.f24201.f3274.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            C4520.m13231(drawable, z);
        } else {
            this.f24201.f24253 = z;
        }
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // Yue.AbstractC8161, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTint(int i) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            C4520.m13235(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            C4520.m13236(drawable, colorStateList);
            return;
        }
        C8168 c8168 = this.f24201;
        if (c8168.f24251 != colorStateList) {
            c8168.f24251 = colorStateList;
            this.f24202 = m26923(this.f24202, colorStateList, c8168.f24252);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, Yue.InterfaceC7833
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            C4520.m13237(drawable, mode);
            return;
        }
        C8168 c8168 = this.f24201;
        if (c8168.f24252 != mode) {
            c8168.f24252 = mode;
            this.f24202 = m26923(this.f24202, c8168.f24251, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f24186;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public float m26916() {
        C8167 c8167;
        C8168 c8168 = this.f24201;
        if (c8168 == null || (c8167 = c8168.f3274) == null) {
            return 1.0f;
        }
        float f = c8167.f24243;
        if (f == 0.0f) {
            return 1.0f;
        }
        float f2 = c8167.f24244;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        float f3 = c8167.f24246;
        if (f3 == 0.0f) {
            return 1.0f;
        }
        float f4 = c8167.f24245;
        if (f4 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f4 / f, f3 / f2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Object m26917(String str) {
        return this.f24201.f3274.f24250.get(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m26918(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C8168 c8168 = this.f24201;
        C8167 c8167 = c8168.f3274;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c8167.f24242);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C8164 c8164 = (C8164) arrayDeque.peek();
                if ("path".equals(name)) {
                    C8163 c8163 = new C8163();
                    c8163.m26931(resources, attributeSet, theme, xmlPullParser);
                    c8164.f3268.add(c8163);
                    if (c8163.getPathName() != null) {
                        c8167.f24250.put(c8163.getPathName(), c8163);
                    }
                    c8168.f3273 = c8163.f24235 | c8168.f3273;
                    z = false;
                } else if (f24189.equals(name)) {
                    C1448 c1448 = new C1448();
                    c1448.m26926(resources, attributeSet, theme, xmlPullParser);
                    c8164.f3268.add(c1448);
                    if (c1448.getPathName() != null) {
                        c8167.f24250.put(c1448.getPathName(), c1448);
                    }
                    c8168.f3273 = c1448.f24235 | c8168.f3273;
                } else if ("group".equals(name)) {
                    C8164 c81642 = new C8164();
                    c81642.m26933(resources, attributeSet, theme, xmlPullParser);
                    c8164.f3268.add(c81642);
                    arrayDeque.push(c81642);
                    if (c81642.getGroupName() != null) {
                        c8167.f24250.put(c81642.getGroupName(), c81642);
                    }
                    c8168.f3273 = c81642.f24230 | c8168.f3273;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m26919() {
        return isAutoMirrored() && C4520.m13227(this) == 1;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m26920(C8164 c8164, int i) {
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = str + "    ";
        }
        Log.v(f24187, str + "current group is :" + c8164.getGroupName() + " rotation is " + c8164.f24222);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("matrix is :");
        sb.append(c8164.getLocalMatrix().toString());
        Log.v(f24187, sb.toString());
        for (int i3 = 0; i3 < c8164.f3268.size(); i3++) {
            AbstractC8165 abstractC8165 = c8164.f3268.get(i3);
            if (abstractC8165 instanceof C8164) {
                m26920((C8164) abstractC8165, i + 1);
            } else {
                ((AbstractC8166) abstractC8165).m26937(i + 1);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m26921(boolean z) {
        this.f24205 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m26922(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C8168 c8168 = this.f24201;
        C8167 c8167 = c8168.f3274;
        c8168.f24252 = m26915(C8021.m25322(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListM25318 = C8021.m25318(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListM25318 != null) {
            c8168.f24251 = colorStateListM25318;
        }
        c8168.f24253 = C8021.m25316(typedArray, xmlPullParser, "autoMirrored", 5, c8168.f24253);
        c8167.f24245 = C8021.m25321(typedArray, xmlPullParser, "viewportWidth", 7, c8167.f24245);
        float fM25321 = C8021.m25321(typedArray, xmlPullParser, "viewportHeight", 8, c8167.f24246);
        c8167.f24246 = fM25321;
        if (c8167.f24245 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fM25321 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c8167.f24243 = typedArray.getDimension(3, c8167.f24243);
        float dimension = typedArray.getDimension(2, c8167.f24244);
        c8167.f24244 = dimension;
        if (c8167.f24243 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c8167.setAlpha(C8021.m25321(typedArray, xmlPullParser, AbstractC5616.f13584, 4, c8167.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c8167.f24248 = string;
            c8167.f24250.put(string, c8167);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public PorterDuffColorFilter m26923(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(24)
    public static class C8169 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: ۥ */
        public final Drawable.ConstantState f3275;

        public C8169(Drawable.ConstantState constantState) {
            this.f3275 = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f3275.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3275.getChangingConfigurations();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C8162 c8162 = new C8162();
            c8162.f24186 = (VectorDrawable) this.f3275.newDrawable();
            return c8162;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C8162 c8162 = new C8162();
            c8162.f24186 = (VectorDrawable) this.f3275.newDrawable(resources);
            return c8162;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C8162 c8162 = new C8162();
            c8162.f24186 = (VectorDrawable) this.f3275.newDrawable(resources, theme);
            return c8162;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f24203 = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC8166 extends AbstractC8165 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f24233 = 0;

        /* JADX INFO: renamed from: ۥ */
        public C6625.C1035[] f3269;

        /* JADX INFO: renamed from: ۥ۟ */
        public String f3270;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f24234;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f24235;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC8166() {
            super();
            this.f3269 = null;
            this.f24234 = 0;
        }

        public C6625.C1035[] getPathData() {
            return this.f3269;
        }

        public String getPathName() {
            return this.f3270;
        }

        public void setPathData(C6625.C1035[] c1035Arr) {
            if (C6625.m3102(this.f3269, c1035Arr)) {
                C6625.m21075(this.f3269, c1035Arr);
            } else {
                this.f3269 = C6625.m21068(c1035Arr);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo26927(Resources.Theme theme) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo26928() {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo26925() {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public String m26936(C6625.C1035[] c1035Arr) {
            String str = " ";
            for (int i = 0; i < c1035Arr.length; i++) {
                str = str + c1035Arr[i].f2189 + ":";
                for (float f : c1035Arr[i].f2190) {
                    str = str + f + ",";
                }
            }
            return str;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m26937(int i) {
            String str = "";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + "    ";
            }
            Log.v(C8162.f24187, str + "current path is :" + this.f3270 + " pathData is " + m26936(this.f3269));
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m26938(Path path) {
            path.reset();
            C6625.C1035[] c1035Arr = this.f3269;
            if (c1035Arr != null) {
                C6625.C1035.m21081(c1035Arr, path);
            }
        }

        public AbstractC8166(AbstractC8166 abstractC8166) {
            super();
            this.f3269 = null;
            this.f24234 = 0;
            this.f3270 = abstractC8166.f3270;
            this.f24235 = abstractC8166.f24235;
            this.f3269 = C6625.m21068(abstractC8166.f3269);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f24186;
        if (drawable != null) {
            C4520.m13228(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C8168 c8168 = this.f24201;
        c8168.f3274 = new C8167();
        TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C3213.f136);
        m26922(typedArrayM25330, xmlPullParser, theme);
        typedArrayM25330.recycle();
        c8168.f3273 = getChangingConfigurations();
        c8168.f24260 = true;
        m26918(resources, xmlPullParser, attributeSet, theme);
        this.f24202 = m26923(this.f24202, c8168.f24251, c8168.f24252);
    }

    public C8162(@InterfaceC6391 C8168 c8168) {
        this.f24205 = true;
        this.f24207 = new float[9];
        this.f24208 = new Matrix();
        this.f24209 = new Rect();
        this.f24201 = c8168;
        this.f24202 = m26923(this.f24202, c8168.f24251, c8168.f24252);
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ۟۟, reason: contains not printable characters */
    public static class C8163 extends AbstractC8166 {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int[] f24210;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C4057 f24211;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public float f24212;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public C4057 f24213;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public float f24214;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public float f24215;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public float f24216;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public float f24217;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public float f24218;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public Paint.Cap f24219;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public Paint.Join f24220;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public float f24221;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8163() {
            this.f24212 = 0.0f;
            this.f24214 = 1.0f;
            this.f24215 = 1.0f;
            this.f24216 = 0.0f;
            this.f24217 = 1.0f;
            this.f24218 = 0.0f;
            this.f24219 = Paint.Cap.BUTT;
            this.f24220 = Paint.Join.MITER;
            this.f24221 = 4.0f;
        }

        public float getFillAlpha() {
            return this.f24215;
        }

        @InterfaceC3897
        public int getFillColor() {
            return this.f24213.m11491();
        }

        public float getStrokeAlpha() {
            return this.f24214;
        }

        @InterfaceC3897
        public int getStrokeColor() {
            return this.f24211.m11491();
        }

        public float getStrokeWidth() {
            return this.f24212;
        }

        public float getTrimPathEnd() {
            return this.f24217;
        }

        public float getTrimPathOffset() {
            return this.f24218;
        }

        public float getTrimPathStart() {
            return this.f24216;
        }

        public void setFillAlpha(float f) {
            this.f24215 = f;
        }

        public void setFillColor(int i) {
            this.f24213.m11496(i);
        }

        public void setStrokeAlpha(float f) {
            this.f24214 = f;
        }

        public void setStrokeColor(int i) {
            this.f24211.m11496(i);
        }

        public void setStrokeWidth(float f) {
            this.f24212 = f;
        }

        public void setTrimPathEnd(float f) {
            this.f24217 = f;
        }

        public void setTrimPathOffset(float f) {
            this.f24218 = f;
        }

        public void setTrimPathStart(float f) {
            this.f24216 = f;
        }

        @Override // Yue.C8162.AbstractC8165
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4190() {
            return this.f24213.m11494() || this.f24211.m11494();
        }

        @Override // Yue.C8162.AbstractC8165
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo4191(int[] iArr) {
            return this.f24211.m11495(iArr) | this.f24213.m11495(iArr);
        }

        @Override // Yue.C8162.AbstractC8166
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo26927(Resources.Theme theme) {
        }

        @Override // Yue.C8162.AbstractC8166
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean mo26928() {
            return this.f24210 != null;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final Paint.Cap m26929(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final Paint.Join m26930(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m26931(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C3213.f4885);
            m26932(typedArrayM25330, xmlPullParser, theme);
            typedArrayM25330.recycle();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m26932(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f24210 = null;
            if (C8021.m25329(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f3270 = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f3269 = C6625.m21066(string2);
                }
                this.f24213 = C8021.m25320(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f24215 = C8021.m25321(typedArray, xmlPullParser, "fillAlpha", 12, this.f24215);
                this.f24219 = m26929(C8021.m25322(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f24219);
                this.f24220 = m26930(C8021.m25322(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f24220);
                this.f24221 = C8021.m25321(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f24221);
                this.f24211 = C8021.m25320(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f24214 = C8021.m25321(typedArray, xmlPullParser, "strokeAlpha", 11, this.f24214);
                this.f24212 = C8021.m25321(typedArray, xmlPullParser, "strokeWidth", 4, this.f24212);
                this.f24217 = C8021.m25321(typedArray, xmlPullParser, "trimPathEnd", 6, this.f24217);
                this.f24218 = C8021.m25321(typedArray, xmlPullParser, "trimPathOffset", 7, this.f24218);
                this.f24216 = C8021.m25321(typedArray, xmlPullParser, "trimPathStart", 5, this.f24216);
                this.f24234 = C8021.m25322(typedArray, xmlPullParser, "fillType", 13, this.f24234);
            }
        }

        public C8163(C8163 c8163) {
            super(c8163);
            this.f24212 = 0.0f;
            this.f24214 = 1.0f;
            this.f24215 = 1.0f;
            this.f24216 = 0.0f;
            this.f24217 = 1.0f;
            this.f24218 = 0.0f;
            this.f24219 = Paint.Cap.BUTT;
            this.f24220 = Paint.Join.MITER;
            this.f24221 = 4.0f;
            this.f24210 = c8163.f24210;
            this.f24211 = c8163.f24211;
            this.f24212 = c8163.f24212;
            this.f24214 = c8163.f24214;
            this.f24213 = c8163.f24213;
            this.f24234 = c8163.f24234;
            this.f24215 = c8163.f24215;
            this.f24216 = c8163.f24216;
            this.f24217 = c8163.f24217;
            this.f24218 = c8163.f24218;
            this.f24219 = c8163.f24219;
            this.f24220 = c8163.f24220;
            this.f24221 = c8163.f24221;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C8167 {

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final Matrix f24236 = new Matrix();

        /* JADX INFO: renamed from: ۥ */
        public final Path f3271;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Path f3272;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Matrix f24237;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Paint f24238;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Paint f24239;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public PathMeasure f24240;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f24241;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final C8164 f24242;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public float f24243;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public float f24244;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public float f24245;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public float f24246;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int f24247;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public String f24248;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public Boolean f24249;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final C3394<String, Object> f24250;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8167() {
            this.f24237 = new Matrix();
            this.f24243 = 0.0f;
            this.f24244 = 0.0f;
            this.f24245 = 0.0f;
            this.f24246 = 0.0f;
            this.f24247 = 255;
            this.f24248 = null;
            this.f24249 = null;
            this.f24250 = new C3394<>();
            this.f24242 = new C8164();
            this.f3271 = new Path();
            this.f3272 = new Path();
        }

        /* JADX INFO: renamed from: ۥ */
        public static float m4192(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f24247;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f24247 = i;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4193(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m26939(this.f24242, f24236, canvas, i, i2, colorFilter);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m26939(C8164 c8164, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c8164.f3267.set(matrix);
            c8164.f3267.preConcat(c8164.f24229);
            canvas.save();
            for (int i3 = 0; i3 < c8164.f3268.size(); i3++) {
                AbstractC8165 abstractC8165 = c8164.f3268.get(i3);
                if (abstractC8165 instanceof C8164) {
                    m26939((C8164) abstractC8165, c8164.f3267, canvas, i, i2, colorFilter);
                } else if (abstractC8165 instanceof AbstractC8166) {
                    m26940(c8164, (AbstractC8166) abstractC8165, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m26940(C8164 c8164, AbstractC8166 abstractC8166, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f24245;
            float f2 = i2 / this.f24246;
            float fMin = Math.min(f, f2);
            Matrix matrix = c8164.f3267;
            this.f24237.set(matrix);
            this.f24237.postScale(f, f2);
            float fM26941 = m26941(matrix);
            if (fM26941 == 0.0f) {
                return;
            }
            abstractC8166.m26938(this.f3271);
            Path path = this.f3271;
            this.f3272.reset();
            if (abstractC8166.mo26925()) {
                this.f3272.setFillType(abstractC8166.f24234 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f3272.addPath(path, this.f24237);
                canvas.clipPath(this.f3272);
                return;
            }
            C8163 c8163 = (C8163) abstractC8166;
            float f3 = c8163.f24216;
            if (f3 != 0.0f || c8163.f24217 != 1.0f) {
                float f4 = c8163.f24218;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (c8163.f24217 + f4) % 1.0f;
                if (this.f24240 == null) {
                    this.f24240 = new PathMeasure();
                }
                this.f24240.setPath(this.f3271, false);
                float length = this.f24240.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f24240.getSegment(f7, length, path, true);
                    this.f24240.getSegment(0.0f, f8, path, true);
                } else {
                    this.f24240.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f3272.addPath(path, this.f24237);
            if (c8163.f24213.m11497()) {
                C4057 c4057 = c8163.f24213;
                if (this.f24239 == null) {
                    Paint paint = new Paint(1);
                    this.f24239 = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f24239;
                if (c4057.m11493()) {
                    Shader shaderM11492 = c4057.m11492();
                    shaderM11492.setLocalMatrix(this.f24237);
                    paint2.setShader(shaderM11492);
                    paint2.setAlpha(Math.round(c8163.f24215 * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C8162.m4188(c4057.m11491(), c8163.f24215));
                }
                paint2.setColorFilter(colorFilter);
                this.f3272.setFillType(c8163.f24234 == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f3272, paint2);
            }
            if (c8163.f24211.m11497()) {
                C4057 c40572 = c8163.f24211;
                if (this.f24238 == null) {
                    Paint paint3 = new Paint(1);
                    this.f24238 = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f24238;
                Paint.Join join = c8163.f24220;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = c8163.f24219;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(c8163.f24221);
                if (c40572.m11493()) {
                    Shader shaderM114922 = c40572.m11492();
                    shaderM114922.setLocalMatrix(this.f24237);
                    paint4.setShader(shaderM114922);
                    paint4.setAlpha(Math.round(c8163.f24214 * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C8162.m4188(c40572.m11491(), c8163.f24214));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(c8163.f24212 * fMin * fM26941);
                canvas.drawPath(this.f3272, paint4);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final float m26941(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fM4192 = m4192(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fM4192) / fMax;
            }
            return 0.0f;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m26942() {
            if (this.f24249 == null) {
                this.f24249 = Boolean.valueOf(this.f24242.mo4190());
            }
            return this.f24249.booleanValue();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean m26943(int[] iArr) {
            return this.f24242.mo4191(iArr);
        }

        public C8167(C8167 c8167) {
            this.f24237 = new Matrix();
            this.f24243 = 0.0f;
            this.f24244 = 0.0f;
            this.f24245 = 0.0f;
            this.f24246 = 0.0f;
            this.f24247 = 255;
            this.f24248 = null;
            this.f24249 = null;
            C3394<String, Object> c3394 = new C3394<>();
            this.f24250 = c3394;
            this.f24242 = new C8164(c8167.f24242, c3394);
            this.f3271 = new Path(c8167.f3271);
            this.f3272 = new Path(c8167.f3272);
            this.f24243 = c8167.f24243;
            this.f24244 = c8167.f24244;
            this.f24245 = c8167.f24245;
            this.f24246 = c8167.f24246;
            this.f24241 = c8167.f24241;
            this.f24247 = c8167.f24247;
            this.f24248 = c8167.f24248;
            String str = c8167.f24248;
            if (str != null) {
                c3394.put(str, this);
            }
            this.f24249 = c8167.f24249;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥۣ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C8164 extends AbstractC8165 {

        /* JADX INFO: renamed from: ۥ */
        public final Matrix f3267;

        /* JADX INFO: renamed from: ۥ۟ */
        public final ArrayList<AbstractC8165> f3268;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f24222;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f24223;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f24224;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public float f24225;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public float f24226;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public float f24227;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public float f24228;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final Matrix f24229;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public int f24230;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public int[] f24231;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public String f24232;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8164(C8164 c8164, C3394<String, Object> c3394) {
            AbstractC8166 c1448;
            super();
            this.f3267 = new Matrix();
            this.f3268 = new ArrayList<>();
            this.f24222 = 0.0f;
            this.f24223 = 0.0f;
            this.f24224 = 0.0f;
            this.f24225 = 1.0f;
            this.f24226 = 1.0f;
            this.f24227 = 0.0f;
            this.f24228 = 0.0f;
            Matrix matrix = new Matrix();
            this.f24229 = matrix;
            this.f24232 = null;
            this.f24222 = c8164.f24222;
            this.f24223 = c8164.f24223;
            this.f24224 = c8164.f24224;
            this.f24225 = c8164.f24225;
            this.f24226 = c8164.f24226;
            this.f24227 = c8164.f24227;
            this.f24228 = c8164.f24228;
            this.f24231 = c8164.f24231;
            String str = c8164.f24232;
            this.f24232 = str;
            this.f24230 = c8164.f24230;
            if (str != null) {
                c3394.put(str, this);
            }
            matrix.set(c8164.f24229);
            ArrayList<AbstractC8165> arrayList = c8164.f3268;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC8165 abstractC8165 = arrayList.get(i);
                if (abstractC8165 instanceof C8164) {
                    this.f3268.add(new C8164((C8164) abstractC8165, c3394));
                } else {
                    if (abstractC8165 instanceof C8163) {
                        c1448 = new C8163((C8163) abstractC8165);
                    } else {
                        if (!(abstractC8165 instanceof C1448)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        c1448 = new C1448((C1448) abstractC8165);
                    }
                    this.f3268.add(c1448);
                    String str2 = c1448.f3270;
                    if (str2 != null) {
                        c3394.put(str2, c1448);
                    }
                }
            }
        }

        public String getGroupName() {
            return this.f24232;
        }

        public Matrix getLocalMatrix() {
            return this.f24229;
        }

        public float getPivotX() {
            return this.f24223;
        }

        public float getPivotY() {
            return this.f24224;
        }

        public float getRotation() {
            return this.f24222;
        }

        public float getScaleX() {
            return this.f24225;
        }

        public float getScaleY() {
            return this.f24226;
        }

        public float getTranslateX() {
            return this.f24227;
        }

        public float getTranslateY() {
            return this.f24228;
        }

        public void setPivotX(float f) {
            if (f != this.f24223) {
                this.f24223 = f;
                m26934();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f24224) {
                this.f24224 = f;
                m26934();
            }
        }

        public void setRotation(float f) {
            if (f != this.f24222) {
                this.f24222 = f;
                m26934();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f24225) {
                this.f24225 = f;
                m26934();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f24226) {
                this.f24226 = f;
                m26934();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f24227) {
                this.f24227 = f;
                m26934();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f24228) {
                this.f24228 = f;
                m26934();
            }
        }

        @Override // Yue.C8162.AbstractC8165
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4190() {
            for (int i = 0; i < this.f3268.size(); i++) {
                if (this.f3268.get(i).mo4190()) {
                    return true;
                }
            }
            return false;
        }

        @Override // Yue.C8162.AbstractC8165
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo4191(int[] iArr) {
            boolean zMo4191 = false;
            for (int i = 0; i < this.f3268.size(); i++) {
                zMo4191 |= this.f3268.get(i).mo4191(iArr);
            }
            return zMo4191;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m26933(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayM25330 = C8021.m25330(resources, theme, attributeSet, C3213.f4876);
            m26935(typedArrayM25330, xmlPullParser);
            typedArrayM25330.recycle();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m26934() {
            this.f24229.reset();
            this.f24229.postTranslate(-this.f24223, -this.f24224);
            this.f24229.postScale(this.f24225, this.f24226);
            this.f24229.postRotate(this.f24222, 0.0f, 0.0f);
            this.f24229.postTranslate(this.f24227 + this.f24223, this.f24228 + this.f24224);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m26935(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f24231 = null;
            this.f24222 = C8021.m25321(typedArray, xmlPullParser, AbstractC5616.f13586, 5, this.f24222);
            this.f24223 = typedArray.getFloat(1, this.f24223);
            this.f24224 = typedArray.getFloat(2, this.f24224);
            this.f24225 = C8021.m25321(typedArray, xmlPullParser, AbstractC5616.f13592, 3, this.f24225);
            this.f24226 = C8021.m25321(typedArray, xmlPullParser, AbstractC5616.f13593, 4, this.f24226);
            this.f24227 = C8021.m25321(typedArray, xmlPullParser, "translateX", 6, this.f24227);
            this.f24228 = C8021.m25321(typedArray, xmlPullParser, "translateY", 7, this.f24228);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f24232 = string;
            }
            m26934();
        }

        public C8164() {
            super();
            this.f3267 = new Matrix();
            this.f3268 = new ArrayList<>();
            this.f24222 = 0.0f;
            this.f24223 = 0.0f;
            this.f24224 = 0.0f;
            this.f24225 = 1.0f;
            this.f24226 = 1.0f;
            this.f24227 = 0.0f;
            this.f24228 = 0.0f;
            this.f24229 = new Matrix();
            this.f24232 = null;
        }
    }
}
